package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;

/* renamed from: com.google.android.gms.internal.measurement.i6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C5790i6 {
    @GuardedBy("PhenotypeConstants.class")

    /* renamed from: a */
    private static final ArrayMap<String, Uri> f7004a = new ArrayMap<>();

    /* renamed from: a */
    public static synchronized Uri m9398a(String str) {
        Uri uri;
        String str2;
        synchronized (C5790i6.class) {
            ArrayMap<String, Uri> arrayMap = f7004a;
            uri = arrayMap.get("com.google.android.gms.measurement");
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                if (valueOf.length() != 0) {
                    str2 = "content://com.google.android.gms.phenotype/".concat(valueOf);
                } else {
                    str2 = new String("content://com.google.android.gms.phenotype/");
                }
                uri = Uri.parse(str2);
                arrayMap.put("com.google.android.gms.measurement", uri);
            }
        }
        return uri;
    }
}
