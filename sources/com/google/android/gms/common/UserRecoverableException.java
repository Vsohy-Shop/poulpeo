package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class UserRecoverableException extends Exception {

    /* renamed from: b */
    private final Intent f4881b;

    public UserRecoverableException(@NonNull String str, @NonNull Intent intent) {
        super(str);
        this.f4881b = intent;
    }
}
