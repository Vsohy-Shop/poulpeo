package com.rmn.apiclient.core.data_access.service.http;

import com.rmn.apiclient.core.config.IAPIConfig;
import com.rmn.iosadapters.android.content.ContextContainer;
import kotlin.jvm.internal.C12775o;
import okhttp3.OkHttpClient;

/* compiled from: AndroidHttpClientGenerator.kt */
public final class AndroidHttpClientGenerator {
    public final OkHttpClient.Builder generate(ContextContainer contextContainer, IAPIConfig iAPIConfig) {
        C12775o.m28640j(contextContainer, "contextContainer");
        C12775o.m28640j(iAPIConfig, "config");
        return new OkHttpClient.Builder();
    }
}
