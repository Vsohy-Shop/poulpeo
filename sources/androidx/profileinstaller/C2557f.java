package androidx.profileinstaller;

import android.content.Context;

/* renamed from: androidx.profileinstaller.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2557f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ProfileInstallerInitializer f1080b;

    /* renamed from: c */
    public final /* synthetic */ Context f1081c;

    public /* synthetic */ C2557f(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f1080b = profileInstallerInitializer;
        this.f1081c = context;
    }

    public final void run() {
        this.f1080b.lambda$delayAfterFirstFrame$0(this.f1081c);
    }
}
