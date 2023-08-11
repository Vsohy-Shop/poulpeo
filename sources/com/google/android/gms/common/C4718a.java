package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p023a5.C2207e;
import p141k5.C8566d;
import p231t4.C9721r1;
import p286y4.C10675i;

/* renamed from: com.google.android.gms.common.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C4718a {

    /* renamed from: a */
    public static final int f4882a = C4785c.f5063a;

    /* renamed from: b */
    private static final C4718a f4883b = new C4718a();

    C4718a() {
    }

    @NonNull
    /* renamed from: f */
    public static C4718a m6394f() {
        return f4883b;
    }

    /* renamed from: a */
    public int mo32361a(@NonNull Context context) {
        return C4785c.m6695b(context);
    }

    @Nullable
    /* renamed from: b */
    public Intent mo32343b(@Nullable Context context, int i, @Nullable String str) {
        if (i == 1 || i == 2) {
            if (context != null && C10675i.m22686d(context)) {
                return C9721r1.m20301a();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f4882a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(C2207e.m1805a(context).mo23530e(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return C9721r1.m20302b("com.google.android.gms", sb.toString());
        } else if (i != 3) {
            return null;
        } else {
            return C9721r1.m20303c("com.google.android.gms");
        }
    }

    @Nullable
    /* renamed from: c */
    public PendingIntent mo32344c(@NonNull Context context, int i, int i2) {
        return mo32362d(context, i, i2, (String) null);
    }

    @Nullable
    /* renamed from: d */
    public PendingIntent mo32362d(@NonNull Context context, int i, int i2, @Nullable String str) {
        Intent b = mo32343b(context, i, str);
        if (b == null) {
            return null;
        }
        return C8566d.m17204a(context, i2, b, C8566d.f12237a | 134217728);
    }

    @NonNull
    /* renamed from: e */
    public String mo32345e(int i) {
        return C4785c.m6696c(i);
    }

    /* renamed from: g */
    public int mo32346g(@NonNull Context context) {
        return mo32347h(context, f4882a);
    }

    /* renamed from: h */
    public int mo32347h(@NonNull Context context, int i) {
        int h = C4785c.m6701h(context, i);
        if (C4785c.m6702i(context, h)) {
            return 18;
        }
        return h;
    }

    /* renamed from: i */
    public boolean mo32363i(@NonNull Context context, @NonNull String str) {
        return C4785c.m6706m(context, str);
    }

    /* renamed from: j */
    public boolean mo32348j(int i) {
        return C4785c.m6704k(i);
    }

    /* renamed from: k */
    public void mo32364k(@NonNull Context context, int i) {
        C4785c.m6694a(context, i);
    }
}
