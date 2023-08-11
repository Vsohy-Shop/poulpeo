package androidx.appcompat.app;

import android.content.Context;

/* renamed from: androidx.appcompat.app.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0164a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f190b;

    public /* synthetic */ C0164a(Context context) {
        this.f190b = context;
    }

    public final void run() {
        AppCompatDelegate.syncRequestedAndStoredLocales(this.f190b);
    }
}
