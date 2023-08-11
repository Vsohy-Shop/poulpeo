package p255v6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import p222s6.C9511f;

/* renamed from: v6.d */
/* compiled from: BatteryState */
class C9966d {

    /* renamed from: a */
    private final Float f14947a;

    /* renamed from: b */
    private final boolean f14948b;

    private C9966d(Float f, boolean z) {
        this.f14948b = z;
        this.f14947a = f;
    }

    /* renamed from: a */
    public static C9966d m20792a(Context context) {
        boolean z = false;
        Float f = null;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = m20794e(registerReceiver);
                f = m20793d(registerReceiver);
            }
        } catch (IllegalStateException e) {
            C9511f.m19696f().mo43968e("An error occurred getting battery state.", e);
        }
        return new C9966d(f, z);
    }

    /* renamed from: d */
    private static Float m20793d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(((float) intExtra) / ((float) intExtra2));
    }

    /* renamed from: e */
    private static boolean m20794e(Intent intent) {
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        if (intExtra == -1) {
            return false;
        }
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public Float mo44518b() {
        return this.f14947a;
    }

    /* renamed from: c */
    public int mo44519c() {
        Float f;
        if (!this.f14948b || (f = this.f14947a) == null) {
            return 1;
        }
        if (((double) f.floatValue()) < 0.99d) {
            return 2;
        }
        return 3;
    }
}
