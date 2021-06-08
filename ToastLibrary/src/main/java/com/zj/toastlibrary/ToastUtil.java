package com.zj.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
    public static void showToast(Context context, String string) {
        Toast.makeText(context,string,Toast.LENGTH_SHORT).show();
    }
}
