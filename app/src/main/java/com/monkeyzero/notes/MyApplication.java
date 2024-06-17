package com.monkeyzero.notes;

import android.app.Application;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化科大讯飞SDK
        SpeechUtility.createUtility(this, SpeechConstant.APPID + "=b25a7201");
    }
}
