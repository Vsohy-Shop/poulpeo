package androidx.browser.trusted;

import android.net.Uri;

/* renamed from: androidx.browser.trusted.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0311l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ TrustedWebActivityServiceConnectionPool f207b;

    /* renamed from: c */
    public final /* synthetic */ Uri f208c;

    public /* synthetic */ C0311l(TrustedWebActivityServiceConnectionPool trustedWebActivityServiceConnectionPool, Uri uri) {
        this.f207b = trustedWebActivityServiceConnectionPool;
        this.f208c = uri;
    }

    public final void run() {
        this.f207b.lambda$connect$0(this.f208c);
    }
}
