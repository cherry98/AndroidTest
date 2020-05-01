package com.rose.test.permissions;

import android.Manifest;
import android.util.Log;

import com.rose.permission.annotation.PermissionDenied;
import com.rose.permission.annotation.PermissionDeniedForever;
import com.rose.permission.annotation.PermissionNeed;
public class LocationUtil {

    @PermissionNeed(
            permissions = {Manifest.permission.BODY_SENSORS},
            requestCode = 0)
    public void getLocation() {
        Log.d("LocationUtilTag","普通Java类：权限已获得");
        ToastUtil.showToast("普通JavashouldShowRequestPermissionRationale类：权限已获得");
    }

    /**
     * 这里写的要特别注意，denied方法，必须是带有一个int参数的方法，下面的也一样
     *
     * @param requestCode
     */
    @PermissionDenied
    private void denied(int requestCode) {
        Log.d("LocationUtilTag","普通Java类：权限被拒绝");
        ToastUtil.showToast("普通Java类：权限被拒绝");
    }

    @PermissionDeniedForever
    private void deniedForever(int requestCode) {
        Log.d("LocationUtilTag","普通Java类：权限被永久拒绝");
        ToastUtil.showToast("普通Java类：权限被永久拒绝");
    }
}

