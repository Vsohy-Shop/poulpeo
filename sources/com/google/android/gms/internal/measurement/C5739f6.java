package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;

/* renamed from: com.google.android.gms.internal.measurement.f6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C5739f6 implements C5688c6 {
    @GuardedBy("GservicesLoader.class")

    /* renamed from: c */
    private static C5739f6 f6937c;

    /* renamed from: a */
    private final Context f6938a;

    /* renamed from: b */
    private final ContentObserver f6939b;

    private C5739f6() {
        this.f6938a = null;
        this.f6939b = null;
    }

    /* renamed from: a */
    static C5739f6 m9219a(Context context) {
        C5739f6 f6Var;
        C5739f6 f6Var2;
        synchronized (C5739f6.class) {
            if (f6937c == null) {
                if (PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    f6Var2 = new C5739f6(context);
                } else {
                    f6Var2 = new C5739f6();
                }
                f6937c = f6Var2;
            }
            f6Var = f6937c;
        }
        return f6Var;
    }

    /* renamed from: d */
    static synchronized void m9220d() {
        Context context;
        synchronized (C5739f6.class) {
            C5739f6 f6Var = f6937c;
            if (!(f6Var == null || (context = f6Var.f6938a) == null || f6Var.f6939b == null)) {
                context.getContentResolver().unregisterContentObserver(f6937c.f6939b);
            }
            f6937c = null;
        }
    }

    /* renamed from: b */
    public final String mo33752B(String str) {
        String str2;
        if (this.f6938a == null) {
            return null;
        }
        try {
            return (String) C5654a6.m8760a(new C5705d6(this, str));
        } catch (IllegalStateException | NullPointerException | SecurityException e) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Unable to read GServices for: ".concat(valueOf);
            } else {
                str2 = new String("Unable to read GServices for: ");
            }
            Log.e("GservicesLoader", str2, e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ String mo33994c(String str) {
        return C5952s5.m9867a(this.f6938a.getContentResolver(), str, (String) null);
    }

    private C5739f6(Context context) {
        this.f6938a = context;
        C5722e6 e6Var = new C5722e6(this, (Handler) null);
        this.f6939b = e6Var;
        context.getContentResolver().registerContentObserver(C5952s5.f7346a, true, e6Var);
    }
}
