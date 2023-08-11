package com.google.firebase;

import androidx.annotation.NonNull;
import p231t4.C9713p;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class FirebaseException extends Exception {
    @Deprecated
    protected FirebaseException() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(@NonNull String str) {
        super(str);
        C9713p.m20272g(str, "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(@NonNull String str, @NonNull Throwable th) {
        super(str, th);
        C9713p.m20272g(str, "Detail message must not be empty");
    }
}
