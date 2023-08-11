package com.squareup.picasso;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import p452wd.C13695b;

/* renamed from: com.squareup.picasso.o */
/* compiled from: OkHttp3Downloader */
public final class C11750o implements C13695b {
    @VisibleForTesting

    /* renamed from: a */
    final Call.Factory f18284a;

    /* renamed from: b */
    private final Cache f18285b;

    /* renamed from: c */
    private boolean f18286c;

    public C11750o(Context context) {
        this(C11774x.m25299e(context));
    }

    @NonNull
    /* renamed from: a */
    public Response mo48735a(@NonNull Request request) {
        return this.f18284a.newCall(request).execute();
    }

    public C11750o(File file) {
        this(file, C11774x.m25295a(file));
    }

    public C11750o(File file, long j) {
        this(new OkHttpClient.Builder().cache(new Cache(file, j)).build());
        this.f18286c = false;
    }

    public C11750o(OkHttpClient okHttpClient) {
        this.f18286c = true;
        this.f18284a = okHttpClient;
        this.f18285b = okHttpClient.cache();
    }
}
