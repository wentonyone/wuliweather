package com.wuliweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by wenyuheng on 2018/12/29.
 */

public class HttpUtil {//OkHttp封装类，发送http协议请求调用sendOkHttpRequest方法

    public static void sendOKHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();//传入请求地址
        client.newCall(request).enqueue(callback);//回调处理服务器响应
    }
}
