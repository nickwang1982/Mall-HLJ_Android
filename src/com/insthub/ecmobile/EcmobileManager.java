package com.insthub.ecmobile;
import android.content.Context;
import android.content.SharedPreferences;
import android.telephony.TelephonyManager;


public class EcmobileManager {

	private static RegisterApp registerApp;

	private static Context mContext;

	// 获取友盟key
	public static String getUmengKey(Context context)
    {
        return "xxx";
	}
	
	// 获取快递key
	public static String getKuaidiKey(Context context) {
        return "xxx";
	}
	
	// 获取科大讯飞key
	public static String getXunFeiCode(Context context)
    {
        return "xxx";
	}
	
	// 获取百度push的key
	public static String getPushKey(Context context)
    {
        return "xxx";
	}
	
	// 获取百度push的seckey
	public static String getPushSecKey(Context context)
    {
        return "xxx";
	}
	
	// 获取支付宝parterID(合作者身份)
	public static String getAlipayParterId(Context context)
    {
        return "2088911501027479";
	}
	
	// 获取支付宝sellerID(收款账户)
	public static String getAlipaySellerId(Context context)
    {
        return "zhangning@honglingjin.xyz";
	}
	
	// 获取支付宝key
	public static String getAlipayKey(Context context)
    {
        return "kga62wf3uum486n72ds372m1gzzytan4";
	}
	
	// 获取支付宝rsa_alipay_public(公钥)
	public static String getRsaAlipayPublic(Context context)
    {
		 return "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDRq0+rfcFMmm8CJhB9rW5e1EXA3a52hsmYUNIopzrMDivaS3n/lAN4DVK/a7YH3cWfEHTBrGxPxwb/jAYueHxVLbil/oJ2ziIuHwQzttdCVk0GA7avHtVwZuMtCVXxFCARw4OxcbrPdSdALK/I7qdTzlfAYMZaJQMIXj8R15NQ4QIDAQAB";
	}
	
	// 获取支付宝rsa_private(私钥)
	public static String getRsaPrivate(Context context)
    {
        return "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBANGrT6t9wUyabwImEH2tbl7URcDdrnaGyZhQ0iinOswOK9pLef+UA3gNUr9rtgfdxZ8QdMGsbE/HBv+MBi54fFUtuKX+gnbOIi4fBDO210JWTQYDtq8e1XBm4y0JVfEUIBHDg7Fxus91J0Asr8jup1POV8BgxlolAwhePxHXk1DhAgMBAAECgYB2sF5iOsbwwT9z3O5a5pFjFxEBc7wuFnEKSz4ci0YKez8xzKYcGsK38/rSp3udClqzh5JAjIWnx4fbo31gUw419lzMS/2k9uuxMW5eI1DfgSamdqsHtwQxwNyelfoyltPtMHliw41/5kRxlzE0ZKwzB5bNLbp2VzappuJc72SiEQJBAP0zPePSzcqFhZB7/x7VFZbVKc0JGkDHSvNcpzm/JmitXanDo1uIO5nW1m0WsE9qlwmE1tjEgzb9HegzqHoIXdUCQQDT/NeTXl+G+nEVSYSNMgYXZk7gUoU80BzfpWm3C6yxp6hRmTl6KaNrOILJKdmSyqk99KSsxLU8sfdB93v8CRDdAkEA74YC/TtVXEl1cZorXNJ9CuP6GDGNOUyOlavHsjQmtI2Udl1RcuxsXXrD/Ayjm20dFm8pA4TbEDDgkuITdeXmRQJBAKJ/dcy8keOJBLg5o8cMKokzXpEsEIA+U3PIe5HZ/CYui6MJHnsbge6F4hNL5kFU4ojgiH77RqZhEVVa3YqkdG0CQFc1k3wTRFXaHjn8GssJu5RqkkvfT6EPwNGR5oyMZvoBqU34JKvIAr89daj1ONfxjhmmf9qgu8l5lXXmLT/hN7M=";
    }
	
	// 获取支付宝回调地址
	public static String getAlipayCallback(Context context)
    {
        return "xxx";
	}
	
	// 获取新浪key
	public static String getSinaKey(Context context)
    {
        return "xxx";
	}
	
	// 获取新浪secret
	public static String getSinaSecret(Context context)
    {
        return "xxx";
	}
	
	// 获取新浪的回调地址
    public static String getSinaCallback(Context context)
    {
        return "xxx";
    }
	
	// 获取微信id
	public static String getWeixinAppId(Context context)
    {
        return "xxx";
	}
	
	// 获取微信key
	public static String getWeixinAppKey(Context context)
    {
        return "xxx";
	}
	
	// 获取腾讯key
	public static String getTencentKey(Context context)
    {
        return "xxx";
	}
	
	// 获取腾讯secret
	public static String getTencentSecret(Context context)
    {
        return "xxx";
	}
	
	// 获取腾讯callback
	public static String getTencentCallback(Context context)
    {
        return "xxx";
	}
	
	public static void registerApp(RegisterApp register) {
		registerApp = register;
	}
	
	public static interface RegisterApp {
		public void onRegisterResponse(boolean success);
	}
	
	// 保存push_token
	public static void setBaiduUUID(Context context, String uuid, String appId, String appKey) {

	}
	
}
