package com.zhangyao.utils;

import com.google.gson.Gson;

/**
 * Created by zhangyao on 21/10/16.
 */
public class Utils {

    public static String toJson(Object object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }

}
