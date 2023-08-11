package com.google.android.gms.tagmanager;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Keep;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class TagManagerService extends Service {

    /* renamed from: b */
    public static final /* synthetic */ int f8467b = 0;

    @KeepName
    @WorkerThread
    @Keep
    public static void initialize(Context context) {
        C6367a.m11257f(context);
    }

    public IBinder onBind(Intent intent) {
        return C6367a.m11255d(this);
    }
}
