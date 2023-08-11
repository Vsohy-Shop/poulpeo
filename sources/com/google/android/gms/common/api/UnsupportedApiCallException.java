package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import p180o4.C8974c;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: b */
    private final C8974c f4901b;

    public UnsupportedApiCallException(@NonNull C8974c cVar) {
        this.f4901b = cVar;
    }

    @NonNull
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f4901b));
    }
}
