package com.qiangqiang.jpushdemo;

import android.app.Application;
import android.util.Log;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import cn.jpush.android.api.JPushInterface;
import cn.jpush.android.api.TagAliasCallback;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
//        HashSet<String> s=new HashSet<String>();
//        s.add("tech");
//        s.add("game");
//        JPushInterface.setTags(this, s, new TagAliasCallback() {
//            @Override
//            public void gotResult(int i, String s, Set<String> set) {
//                Log.i("Jpush","是否成功"+i);
//            }
//        });
    }

}
