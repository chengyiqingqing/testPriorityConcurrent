package com.sww.testpriorityconcurrent.common;

import android.os.Handler;
import android.os.Looper;

public class UiThreadUtil {

    private static Handler sHandler = new Handler(Looper.getMainLooper());

    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(runnable, 0);
    }

    public static void runOnUiThread(Runnable runnable, long delay) {
        sHandler.postDelayed(runnable, delay);
    }

}
