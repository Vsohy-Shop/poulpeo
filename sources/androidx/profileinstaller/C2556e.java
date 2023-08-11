package androidx.profileinstaller;

import android.content.Context;

/* renamed from: androidx.profileinstaller.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2556e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f1079b;

    public /* synthetic */ C2556e(Context context) {
        this.f1079b = context;
    }

    public final void run() {
        ProfileInstallerInitializer.writeInBackground(this.f1079b);
    }
}
