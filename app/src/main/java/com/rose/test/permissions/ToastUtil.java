package com.rose.test.permissions;

import android.widget.Toast;

import com.rose.permission.utils.ApplicationUtil;

public class ToastUtil {
    public static void showToast(String msg) {
        Toast.makeText(ApplicationUtil.getApplication(), msg, Toast.LENGTH_SHORT).show();
    }
}
