package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class GooglePlayServicesRepairableException extends UserRecoverableException {

    /* renamed from: c */
    private final int f4880c;

    public GooglePlayServicesRepairableException(int i, @NonNull String str, @NonNull Intent intent) {
        super(str, intent);
        this.f4880c = i;
    }
}
