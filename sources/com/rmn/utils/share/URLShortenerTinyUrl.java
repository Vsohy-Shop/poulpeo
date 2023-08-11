package com.rmn.utils.share;

import androidx.compose.runtime.internal.StabilityInferred;
import com.rmn.api.p322v2.main.oauth.AsyncTaskRequestsManager;
import com.rmn.api.p322v2.main.oauth.BundleRequest;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.iosadapters.android.content.ContextContainer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.Ref$ObjectRef;
import p336ef.C11921v;

@StabilityInferred(parameters = 0)
/* compiled from: URLShortenerTinyUrl.kt */
public final class URLShortenerTinyUrl implements IURLShortener {
    public static final int $stable = 0;

    public void shortenUrl(ContextContainer contextContainer, String str, Function1<? super String, C11921v> function1) {
        C12775o.m28639i(contextContainer, "contextContainer");
        C12775o.m28639i(str, "longUrl");
        C12775o.m28639i(function1, "completion");
        try {
            BundleRequest bundleRequest = new BundleRequest("https://tinyurl.com/api-create.php?url=" + str);
            AsyncTaskRequestsManager.getInstance(contextContainer).sendRequest(bundleRequest, new URLShortenerTinyUrl$shortenUrl$listener$1(new Ref$ObjectRef(), function1), HttpMethod.GET, false);
        } catch (Exception unused) {
            function1.invoke(null);
        }
    }
}
