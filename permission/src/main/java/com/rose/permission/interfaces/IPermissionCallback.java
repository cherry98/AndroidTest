package com.rose.permission.interfaces;

/**
 * 处理权限回调结果的接口
 */
public interface IPermissionCallback {
    /**
     * 授予权限
     */
    void granted(int requestCode);

    /**
     * 这次拒绝，但是并没有勾选'以后都不在提示'==单次拒绝
     */
    void denied(int requestCode);

    /**
     * '勾选以后都不在提示'并且拒绝==永久不提示，除非用户卸载app重装，或者用户手动在权限设置里面设置
     */
    void deniedForever(int requestCode);
}
