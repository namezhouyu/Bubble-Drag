package com.ctao.bubbledrag.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.view.Window;

/**
 * Utils
 * Created by A Miracle on 2016/3/24.
 */
public class Utils {

    private static final float DENSITY = Resources.getSystem().getDisplayMetrics().densityDpi / 160F;

    /**
     * 获取状态栏高度＋标题栏高度
     * @param activity
     * @return
     */
    public static int getTopBarHeight(Activity activity) {
        return activity.getWindow().findViewById(Window.ID_ANDROID_CONTENT).getTop();
    }

    /**
     *  获取两点之间的距离
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public static double distance(float x1, float y1, float x2, float y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    /**
     * 判断给定字符串是否空白串 空白串是指由空格、制表符、回车符、换行符组成的字符串 若输入字符串为null或空字符串，返回true
     */
    public static boolean isEmpty(CharSequence input) {
        if (input == null || "".equals(input))
            return true;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != ' ' && c != '\t' && c != '\r' && c != '\n') {
                return false;
            }
        }
        return true;
    }

    /**
     * !isEmpty(CharSequence input)
     */
    public static boolean isNotEmpty(CharSequence input) {
        return !isEmpty(input);
    }

    public static int converDip2px(float dpValue) {
        return Math.round(dpValue * DENSITY);
    }

    public static int converPx2dip(float pxValue) {
        return Math.round(pxValue / DENSITY);
    }
}
