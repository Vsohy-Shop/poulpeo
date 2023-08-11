package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: b */
    private final int f9387b;

    public FirebaseRemoteConfigServerException(int i, @NonNull String str) {
        super(str);
        this.f9387b = i;
    }

    /* renamed from: a */
    public int mo40019a() {
        return this.f9387b;
    }

    public FirebaseRemoteConfigServerException(int i, @NonNull String str, @Nullable Throwable th) {
        super(str, th);
        this.f9387b = i;
    }
}
