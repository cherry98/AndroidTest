package com.rose.test.permissions;

import android.Manifest;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.rose.permission.annotation.PermissionDenied;
import com.rose.permission.annotation.PermissionDeniedForever;
import com.rose.permission.annotation.PermissionNeed;

import androidx.annotation.Nullable;

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        getLocation();
        return super.onStartCommand(intent, flags, startId);
    }

    @PermissionNeed(
            permissions = {Manifest.permission.CAMERA},
            requestCode = 2)
    private void getLocation() {
        ToastUtil.showToast("Service:权限被已申请成功");
    }

    /**
     * 这里写的要特别注意，denied方法，必须是带有一个int参数的方法，下面的也一样
     *
     * @param requestCode
     */
    @PermissionDenied
    private void denied(int requestCode) {
        ToastUtil.showToast("Service:权限被拒绝");
    }

    @PermissionDeniedForever
    private void deniedForever(int requestCode) {
        ToastUtil.showToast("Service:权限被永久拒绝");
    }
}
