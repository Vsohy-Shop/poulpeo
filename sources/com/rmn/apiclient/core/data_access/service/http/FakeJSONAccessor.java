package com.rmn.apiclient.core.data_access.service.http;

import android.content.Context;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p392mf.C12940a;

/* compiled from: FakeJSONAccessor.kt */
public final class FakeJSONAccessor implements IFakeJSONAccessor {
    private final int jsonFileId;
    private final Function1<URL, Boolean> matcher;

    public FakeJSONAccessor(int i, Function1<? super URL, Boolean> function1) {
        C12775o.m28640j(function1, "matcher");
        this.jsonFileId = i;
        this.matcher = function1;
    }

    public String getJSON(ContextContainer contextContainer) {
        C12775o.m28640j(contextContainer, "contextContainer");
        Context a = contextContainer.mo47843a();
        C12775o.m28635e(a, "contextContainer.applicationContext");
        InputStream openRawResource = a.getResources().openRawResource(this.jsonFileId);
        C12775o.m28635e(openRawResource, "contextContainer.applica…enRawResource(jsonFileId)");
        byte[] c = C12940a.m29244c(openRawResource);
        Charset charset = StandardCharsets.UTF_8;
        C12775o.m28635e(charset, "StandardCharsets.UTF_8");
        return new String(c, charset);
    }

    public boolean isMatching(URL url) {
        C12775o.m28640j(url, "url");
        return this.matcher.invoke(url).booleanValue();
    }
}
