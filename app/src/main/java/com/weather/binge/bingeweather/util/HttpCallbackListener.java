package com.weather.binge.bingeweather.util;

/**
 * Created by Administrator on 2015/11/23.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
