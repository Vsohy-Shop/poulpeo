package androidx.core.content.res;

import androidx.core.content.res.ResourcesCompat;

/* renamed from: androidx.core.content.res.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1547c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ResourcesCompat.FontCallback f468b;

    /* renamed from: c */
    public final /* synthetic */ int f469c;

    public /* synthetic */ C1547c(ResourcesCompat.FontCallback fontCallback, int i) {
        this.f468b = fontCallback;
        this.f469c = i;
    }

    public final void run() {
        this.f468b.lambda$callbackFailAsync$1(this.f469c);
    }
}
