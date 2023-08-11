package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: b */
    private final int f4878b;

    public GooglePlayServicesManifestException(int i, @NonNull String str) {
        super(str);
        this.f4878b = i;
    }
}
