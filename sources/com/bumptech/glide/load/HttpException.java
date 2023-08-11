package com.bumptech.glide.load;

import androidx.annotation.Nullable;
import java.io.IOException;

public final class HttpException extends IOException {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    private final int f3751b;

    public HttpException(int i) {
        this("Http request failed with status code: " + i, i);
    }

    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int i) {
        this(str, i, (Throwable) null);
    }

    public HttpException(String str, int i, @Nullable Throwable th) {
        super(str, th);
        this.f3751b = i;
    }
}
