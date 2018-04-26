package com.chaychan.news.listener;

import java.util.List;

/**
 * 权限申请回调的接口
 */
public interface PermissionListener {
    /**授予权限回调方法*/
    void onGranted();
    /**拒绝权限回到方法*/
    void onDenied(List<String> deniedPermissions);
}
