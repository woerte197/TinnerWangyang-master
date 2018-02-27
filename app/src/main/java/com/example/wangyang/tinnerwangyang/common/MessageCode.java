package com.example.wangyang.tinnerwangyang.common;

public class MessageCode {
    public static final int NET_REFRESE = 100;
    public static final int NET_TIMEOUT = 101;
    public static final int NET_ERROR = -1;                                  //网络错误
    public static final int NET_CONNECT = 102;
    public static final int RESULT_REPLY = 8000;                             //我的回复
    public static final int RESULT_FANS = 8001;                              //粉丝
    public static final int RESULT_LOGIN = 8002;                             //登录
    public static final int RESULT_LOGOUT = 8003;                            //退出
    public static final int RESULT_HXMESSAGE = 8004;                         //环信
    public static final int RESULT_RELOAD_GROUP = 8006;                     //重新加载
    public static final int RESULT_UPDATE_VERSION = 8007;                    //版本信息
    public static final int RESULT_ANSWER = 8010;                            //我的答案
    public static final int RESULT_SYSTEM = 8011;                            //系统消息
    public static final int RESULT_ARTICLE_MESSAGE = 8012;                   //获取文章的推送消息
    public static final int RESULT_CRM_MESSAGE = 8013;                       //CRM推送消息
    public static final int RESULT_INFO_MESSAGE = 8014;                        //消息中心推送
    public static final int RESULT_NEWS_ACTIVIE = 8015;                         //活动提醒推送
    public static final int RESULT_SCHOOL_ORDER = 8016;                         //择校订单推送
    public static final int ADD_FOOD=8017;                                      //增加食物
    public static final int RESULT_LOCAL_RELOAD = 7001;
    public static final int RESULT_RELOAD_ATTENT_BLOCK = 7002;

    public static final int RESULT_CODE_UPDATE_ITEM = 9002;
    public static final int RESULT_UPDATE_MYHEAD = 9003;
    public static final int RESULT_LOGIN_SUCCESS = 9004;                     //微信登录
    public static final int RESULT_LOGIN_WX_BIND_ERROR = 9005;                 //微信登录失败
    public static final int RESULT_LOGIN_HX_LOGIN_SUCCESS = 9006;            //环信登录成功
    public static final int RESULT_LOCAL_UPDATE_USER_ARTICLE = 9007;         //发布贴子时更新我的用户贴子数量
    public static final int RESULT_LOCAL_UPDATE_USER_ANSWER = 9008;         //更新问答数量
    public static final int RESULT_LOCAL_DELETE_USER_FAV = 9009;             //更新收藏数量
    public static final int RESULT_HX_CONFILCT = 9010;                     //环信帐号被挤掉
    public static final int RESULT_HX_REMOVE = 9011;                         //环信帐号被移除
    public static final int RESULT_LOCAL_UPDATE_SYSTEM_MSG = 9012;         //更新系统消息
    public static final int RESULT_LOCAL_ADD_ITEM = 9013;                     //添加一行数据
    public static final int RESULT_LOCAL_DELETE_ITEM = 9014;                 //移除一行数据
    public static final int RESULT_LOCAL_UPDATE_ITEM = 9015;                 //修改一行数据
    public static final int RESULT_LOCAL_HX_JOIN_GROUP = 9016;             //添加环信更新数据
    public static final int RESULT_LOCAL_ADD_USER_FAV = 9179;                 //减少收藏数量
    public static final int RESULT_LOGIN_HX_LOGIN_FAILED = 9181;             //环信登录失败
    public static final int RESULT_UPDATE_MYDETAIL = 9182;                   //云申请推送
    public static final int RESULT_NETWORK_UNAVAILABLE = 9183;                //网络连接断开
    public static final int RESULT_NETWORK_AVAILABLE = 9184;                  //网络已连接
    public static final int RESULT_LOGIN_WX_BIND_CANCEL = 9185;               //取消绑定登录
    public static final int RESULT_SHOW_CLOULD_DIALOG = 9187;                //显示云推送对话框
    public static final int RESULT_UPDATE_USER_REPLY_VIEW = 9188;            //对指定用户进入回答后回调用户详情界面
    public static final int RESULT_LOGIN_BIND_PHONE = 9089;                     //绑定手机号
    public static final int RESULT_HX_CHATHISTORY_UPDATE_ERROR = 9093;         //环信显示错误
    public static final int RESULT_SHOW_UPDATE_VERSION_DIALOG = 9094;         //显示更新对话框
    public static final int RESULT_UPDATE_CHAT_GROUP = 9095;                 //更新group
    public static final int RESULT_MARKS_ACK_CHAT_MESSAGE = 9096;             //通知环信聊天界面消息
    public static final int RESULT_CHAT_ACTIVITY_UPDATE_ADAPTER = 9097;         //通知环信聊天界面消息刷新adapter
    public static final int RESULT_CHAT_ACTIVITY_REMOVE_FRIEND = 9098;         //通知环信聊天界面移除好友
    public static final int RESULT_CHAT_FINISH = 9099;                         //关闭环信聊天界面
    public static final int RESULT_CHAT_UPDATE_LIST = 9100;                     //关闭环信聊天界面
    public static final int RESULT_CHAT_MARK_READ = 9101;                     //关闭更新指定聊天会话为已读
    public static final int RESULT_CMD_MESSAGE = 9102;                         //发送环信透传消息
    public static final int RESULT_BREAK_GROUP = 9104;                         //解散环信群组
    public static final int RESULT_WAS_REMOVEED_GROUP = 9105;                 //被移除环信群组
    public static final int RESULT_CMD_BREAK_GROUP_MESSAGE = 9106;             //发送环信透传消息->解散群组
    public static final int RESULT_WAS_ON_OTHER_LOGIN = 9107;                 //用户被踢
    public static final int RESULT_WAS_ON_USER_REMOVED = 9108;                 //用户被删除
    public static final int RESULT_UPDATE_LIVE_ROOM_PAGE = 9109;             //更新视频直播界面
    public static final int RESULT_NATION_CHOICE_CHANGE = 9110;                 //更新国家筛选条件
    public static final int RESULT_NEWS_CHOICE_CHANGE = 9111;                 //资讯页面选择更新
    public static final int RESULT_LIVE_VIDEO_BACK_REFRESH = 9112;             //从视频界面返回更新
    public static final int RESULT_SHOW_SETTING_UPDATE_VERSION_DIALOG = 9113;//显示更新对话框
    public static final int RESULT_CODE_PUBLISH = 9114;                      //发贴成功推送
    public static final int RESULT_CODE_DETAIL = 9115;
    public static final int RESULT_DEL_HXMESSAGE = 9116;                     //删除环信记录
    public static final int RESULT_ORDER_SUCCESS = 9117;                     //微信支付成功
    public static final int RESULT_DETAIL_BACK = 9118;                     //订单详情页面的返回
    public static final int RESULT_TIME_CHANGE = 9119;                     //时间变化
    public static final int RESULT_SHOW_SOS_ALERT = 9120;                    //显示sosalert
    public static final int RESULT_SHOW_NATION_INFO = 9121;                    //选择意向国家
    public static final int RESULT_SHOW_CHOICE_NATION = 9122;                    //选择手机号国家
    public static final int RESULT_WX_BIND_SUC = 9123;                    //微信bind成功
    public static final int RESULT_AL_PAY_SUCCESS = 9124;                    //支付宝支付成功
    public static final int RESULT_AL_PAY_FAIL = 9125;                    //支付宝支付失败
    public static final int RESULT_SHOW_LOADING = 9126;                    //显示loading
    public static final int RESULT_SCHOOL_TYPE = 9127;                    //学校类型
    public static final int RESULT_SCHOOL_COLLECT = 9128;                    //更新收藏
    public static final int RESULT_FILTER_VALUE_CHANGE = 9129;            //筛选条件改变时通知
    public static final int RESULT_OFFER_COLLECT_CHANGE = 9130;            //收藏变更
    public static final int RESULT_CANCEL_LOGIN = 9131;                    //取消登录
    public static final int RESULT_UPDATE_UI = 9132;                    //更新ui
    public static final int RESULT_UPDATE_OFFER_SCHOOL_NATION = 9133;        //更新院校库界面国家选择
    public static final int RESULT_PUSH_CODE_START = 9134;                //开始获取验证码
    public static final int RESULT_PUSH_CODE_INTERCREATE = 9135;        //更新验证码状态
    public static final int RESULT_PUSH_CODE_FINISH = 9136;                //验证码获取完成
    public static final int RESULT_PUSH_CODE_FAIL = 9137;                //验证码获取失败
    public static final int RESULT_DISMISS_LOADING = 9138;                //隐藏loading
    public static final int RESULT_CHANGE_MATERIAL = 9140;                //更改材料
    public static final int RESULT_VIDEO_PAUSE = 9141;                //视频停止
    public static final int RESULT_REPLY_ORDER = 9142;                //评论顺序
    public static final int RESULT_REPLY_ORDER_PROGRESS = 9143;                //评论顺序显示loading
    public static final int RESULT_TAGS = 9144;                //评论顺序显示loading
    public static final int RESULT_USER_SELECT_NATION = 9145;                //个人信息也用户选择意向国家
    public static final int RESULT_USER_SELECT_YEAR = 9146;                //个人信息也用户选择年份
    public static final int RESULT_USER_EDUCATION = 9147;                //个人信息也用户选择学历
    public static final int RESULT_USER_JLPT = 9148;                //个人信息也用户选择JLPT
    public static final int RESULT_USER_JTEST = 9149;                //个人信息也用户选择Jtest
    public static final int RESULT_UPDATE_APPLY = 9150;                   //云申请后申请进度页面的刷新
    public static final int RESULT_UPDATE_HOME_RESOLVE = 9151;                   //采纳后的更改ui
    public static final int RESULT_COLLECT_REQUEST_FINISH = 9152;                   //收藏请求回来
    public static final int RESULT_STATUS_ITEM = 9153;                   //错误布局点击


    // ACTIVITY RESULT CODE
    public static final int RESULT_CODE_RES_CROP = 7;
    public static final int RESULT_CODE_MULTIIMAGE = 20;

    //fragment callbac para
    public static final int FRAGMENT_LOGIN = 0;                     //登录参数
    public static final int FRAGMENT_FINDPASS = 1;                     //找回密码参数
    public static final int FRAGMENT_REGISTER = 2;                 //注册参数
    public static final int FRAGMENT_BIND_PHONE = 3;                 //绑定界面

    public static final int REQ_ATTENT = 1;
    public static final int REQ_ATTENT_CANCEL = 2;
    public static final int REQ_COLLECT = 0;
    public static final int REQ_COLLECT_CANCEL = 1;
    public static final int REQ_TIMEORDER_DESC = 1;
    public static final int REQ_EXAMPLE_ARTICLE = 28;                //案例贴
    public static final int REQ_GOOD_ARTICLE = 21;                   //口碑贴
    public static final int DB_HAS_PARISED = 1;                      //已点赞
    public static final int DB_USER_MASK = 4;                        //用户被屏蔽

}