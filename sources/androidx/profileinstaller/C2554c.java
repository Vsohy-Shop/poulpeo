package androidx.profileinstaller;

import androidx.profileinstaller.ProfileInstaller;

/* renamed from: androidx.profileinstaller.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2554c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ProfileInstaller.DiagnosticsCallback f1073b;

    /* renamed from: c */
    public final /* synthetic */ int f1074c;

    /* renamed from: d */
    public final /* synthetic */ Object f1075d;

    public /* synthetic */ C2554c(ProfileInstaller.DiagnosticsCallback diagnosticsCallback, int i, Object obj) {
        this.f1073b = diagnosticsCallback;
        this.f1074c = i;
        this.f1075d = obj;
    }

    public final void run() {
        this.f1073b.onResultReceived(this.f1074c, this.f1075d);
    }
}
