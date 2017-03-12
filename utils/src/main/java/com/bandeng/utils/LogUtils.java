package com.bandeng.utils;

import android.util.Log;


/**
 * Log的工具类
 * Author：Li ChuanWu on 2017/1/4
 * Blog  ：http://blog.csdn.net/lsyz0021/
 */

public class LogUtils {
    // 是否显示log，true 显示 ，false 不显示
    private static boolean isShow = true;

    /**
     * v类型的log
     *
     * @param tag 标签
     * @param msg 内容
     */
    public static void e(String tag, String msg) {

        if (isShow)
            Log.e(tag, msg);
    }

}
