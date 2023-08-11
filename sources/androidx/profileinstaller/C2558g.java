package androidx.profileinstaller;

import android.content.Context;

/* renamed from: androidx.profileinstaller.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2558g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f1082b;

    public /* synthetic */ C2558g(Context context) {
        this.f1082b = context;
    }

    public final void run() {
        ProfileInstaller.writeProfile(this.f1082b);
    }
}
