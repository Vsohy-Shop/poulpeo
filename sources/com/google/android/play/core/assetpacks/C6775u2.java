package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.play.core.assetpacks.u2 */
final class C6775u2 {

    /* renamed from: a */
    private final Context f8884a;

    public C6775u2(Context context) {
        this.f8884a = context;
    }

    @Nullable
    /* renamed from: b */
    static String m11546b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo39373a() {
        return this.f8884a;
    }
}
