package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseException;

public class FirebaseInstallationsException extends FirebaseException {
    @NonNull

    /* renamed from: b */
    private final C6939a f9190b;

    /* renamed from: com.google.firebase.installations.FirebaseInstallationsException$a */
    public enum C6939a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(@NonNull C6939a aVar) {
        this.f9190b = aVar;
    }

    public FirebaseInstallationsException(@NonNull String str, @NonNull C6939a aVar) {
        super(str);
        this.f9190b = aVar;
    }
}
