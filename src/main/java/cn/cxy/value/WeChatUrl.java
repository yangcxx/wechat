package cn.cxy.value;

/**
 * Created by lenovo on 2016/10/26.
 */
public class WeChatUrl {
    /**
     * 微信获取普通accessToken
     */
    public static final String NORMAL_ACCESS_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";

    /**
     * 菜单添加
     */
    public static final String MENU_ADD = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";

    /**
     * 图片临时上传地址
     */
    public static final String POST_IMAGE = "https://api.weixin.qq.com/cgi-bin/media/upload?access_token=ACCESS_TOKEN&type=TYPE";

    /**
     * 模板消息POST地址
     */
    public static final String POST_TEMPLATE = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";

}
