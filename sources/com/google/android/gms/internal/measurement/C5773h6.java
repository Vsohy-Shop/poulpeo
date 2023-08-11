package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.h6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C5773h6 {

    /* renamed from: a */
    static volatile C6033x6<Boolean> f6974a = C6033x6.m10252c();

    /* renamed from: b */
    private static final Object f6975b = new Object();

    /* renamed from: a */
    public static boolean m9335a(Context context, Uri uri) {
        int i;
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        } else if (f6974a.mo34546b()) {
            return f6974a.mo34545a().booleanValue();
        } else {
            synchronized (f6975b) {
                if (f6974a.mo34546b()) {
                    boolean booleanValue = f6974a.mo34545a().booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    PackageManager packageManager = context.getPackageManager();
                    if (Build.VERSION.SDK_INT < 29) {
                        i = 0;
                    } else {
                        i = 268435456;
                    }
                    ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.phenotype", i);
                    if (resolveContentProvider != null) {
                        if (!"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        }
                    }
                    f6974a = C6033x6.m10253d(Boolean.valueOf(z));
                    return f6974a.mo34545a().booleanValue();
                }
                try {
                    if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                f6974a = C6033x6.m10253d(Boolean.valueOf(z));
                return f6974a.mo34545a().booleanValue();
            }
        }
    }
}
