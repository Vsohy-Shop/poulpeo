package com.rmn.utils.share;

import com.rmn.api.p322v2.main.oauth.BundleRequest;
import com.rmn.api.p322v2.main.oauth.IAsyncTaskRequestsListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import p336ef.C11921v;

/* compiled from: URLShortenerTinyUrl.kt */
public final class URLShortenerTinyUrl$shortenUrl$listener$1 implements IAsyncTaskRequestsListener {
    final /* synthetic */ Function1<String, C11921v> $completion;
    final /* synthetic */ Ref$ObjectRef<String> $shortUrl;

    URLShortenerTinyUrl$shortenUrl$listener$1(Ref$ObjectRef<String> ref$ObjectRef, Function1<? super String, C11921v> function1) {
        this.$shortUrl = ref$ObjectRef;
        this.$completion = function1;
    }

    public void onRequestCancelled(BundleRequest bundleRequest) {
        this.$completion.invoke(null);
    }

    public void onRequestFailed(BundleRequest bundleRequest, boolean z, int i) {
        this.$completion.invoke(null);
    }

    public void onRequestSucceededInsideUIThread(BundleRequest bundleRequest, boolean z) {
        this.$completion.invoke(this.$shortUrl.f20403b);
    }

    public boolean onRequestSucceededOutsideUIThread(BundleRequest bundleRequest, String str) {
        this.$shortUrl.f20403b = str;
        return true;
    }
}
