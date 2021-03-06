package com.example.wangyang.tinnerwangyang.common;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;


import com.example.wangyang.tinnerwangyang.Adapter.FootRecyclerAdapter;
import com.example.wangyang.tinnerwangyang.Http.HttpString;
import com.example.wangyang.tinnerwangyang.Wachter;

import java.util.List;

/**
 * Created by nanchaodong on 2017/4/5.
 */

public class RefreshRecyList<T> {
    private static final String TAG = "RefreshRecyList";
    private boolean hasMore;
    private List records;
    protected FootRecyclerAdapter mAdapter;
    protected Context context;
    protected RecyclerView recyclerView;
    protected SwipeRefreshLayout refreshLayout;
    protected HttpString post;
    protected Request mRequest;
    protected int startIndex = 0;
    protected List<Wachter> datas;
    protected RefreshListListener listener;
    protected GridLayoutManager manager;
    protected boolean loading = false;
    protected boolean oldVersion;
    private boolean isBottom;
    protected Result<T> result = new Result();

    public RefreshRecyList(FootRecyclerAdapter adapter, RecyclerView r, SwipeRefreshLayout s, Request request) {
        mAdapter = adapter;
        this.context = adapter.getmCtx();
        this.recyclerView = r;
        this.refreshLayout = s;
        mRequest = request;
        recyclerView.setAdapter(mAdapter);
        createPost();
        ((SimpleItemAnimator) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        mAdapter.hideFooter();
        request.updateRequestStart(0, null);
    }

    public void setRequest(Request mRequest) {
        this.mRequest = mRequest;

    }

    public RefreshRecyList<T> setOldVersion(boolean oldVersion) {
        this.oldVersion = oldVersion;
        return this;
    }

    public RefreshRecyList<T> setLayoutManager(GridLayoutManager manager) {
        this.manager = manager;
        recyclerView.setLayoutManager(manager);
        return this;
    }

    public RefreshRecyList<T> setRefreshListListener(RefreshListListener listener) {
        this.listener = listener;
        return this;
    }

    protected void createPost() {
        post = new HttpString<T>(mRequest) {
            @Override
            protected void success() {
                super.success();
                loading = false;
                if (result.getArticles() != null) {
                    records = result.getArticles();
                } else if (result.getItems() != null) {
                    records = result.getItems();
                } else if (result.getPosts() != null) {
                    records = result.getPosts();
                }
                hasMore = records != null && records.size() > 0;
                if (mRequest.isFirstPage() && hasMore) {//如果是第一页并且返回数据
                    //Todo 请求下一页 显示加载下一页 但不显示脚布局
                    if (oldVersion) {
                        mRequest.updateRequestStart(records);
                    } else {
                        mRequest.updateRequest(records);
                    }

                    listener.top(records);
                    mAdapter.setFooterMsgId(0);
                    mAdapter.hideFooter();
                } else if (mRequest.isFirstPage() && !hasMore) {//如果是第一页并且没有返回数据
                    if (oldVersion) {
                        mRequest.updateRequestStart(records);
                    } else {
                        mRequest.updateRequest(records);
                    }
                    listener.topError(0);
                } else if (!mRequest.isFirstPage() && hasMore) {//如果不是第一页并且有返回数据
                    //Todo 请求下一页
                    if (result.getPage()!=0) {
                        if (oldVersion) {
                            mRequest.updateRequestStart(records);
                        } else {
                            mRequest.updateRequest(records);
                        }
                        listener.bottom(records);
                        mAdapter.setFooterMsgId(0);
                        mAdapter.hideFooter();
                    }else {
                        if (oldVersion) {
                            mRequest.updateRequestStart(records);
                        } else {
                            mRequest.updateRequest(records);
                        }
                        mAdapter.setFooterMsgId(2);
                        loading = true;
                    }
                    //如果不是第一页并且没有返回数据
                } else if (!mRequest.isFirstPage() && !hasMore) {
                    //Todo 将请求置0
                    if (oldVersion) {
                        mRequest.updateRequestStart(records);
                    } else {
                        mRequest.updateRequest(records);
                    }
                    mAdapter.setFooterMsgId(2);
                    loading = true;
                }
                refreshLayout.setRefreshing(false);

            }

            @Override
            protected void fail() {

                super.fail();

                hasMore = false;
                if (mRequest.isFirstPage() && !hasMore) {
                    listener.topError(1);
                } else if (!mRequest.isFirstPage() && !hasMore) {
                    mAdapter.setFooterMsgId(1);
                }
                loading = true;
                refreshLayout.setRefreshing(false);

            }
        };
    }


    protected void loadBottom() {
        if (!loading) {
            loading = true;
            mAdapter.showFooter();
            post.startHttpDef();

        }

    }


    public void loadTop() {
        mAdapter.hideFooter();
        if (oldVersion) {
            mRequest.updateRequestStart(null);
        } else {
            mRequest.updateRequest(null);
        }
        post.startHttpDef();//发送网络请求
    }
    public RefreshRecyList<T> addButtomListener() {
        if (!isBottom) {
            recyclerView.addOnScrollListener(scrollListener);
            isBottom = true;
        }
        return this;
    }

    public RefreshRecyList<T> removeButtomListener() {
        if (isBottom) {
            recyclerView.removeOnScrollListener(scrollListener);
            isBottom = false;
        }
        return this;
    }

    private RecyclerView.OnScrollListener scrollListener = new RecyclerView.OnScrollListener() {
        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            int lastVisibleItem = manager.findLastVisibleItemPosition();
            int totalItemCount = manager.getItemCount();
            if (lastVisibleItem >= totalItemCount - 1 && dy > 0) {
                loadBottom();
            }
        }
    };

    public RefreshRecyList<T> addTopListener() {
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadTop();
            }
        });
        return this;
    }
}
