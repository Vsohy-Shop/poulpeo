package androidx.profileinstaller;

import androidx.profileinstaller.ProfileInstaller;

/* renamed from: androidx.profileinstaller.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2555d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ProfileInstaller.DiagnosticsCallback f1076b;

    /* renamed from: c */
    public final /* synthetic */ int f1077c;

    /* renamed from: d */
    public final /* synthetic */ Object f1078d;

    public /* synthetic */ C2555d(ProfileInstaller.DiagnosticsCallback diagnosticsCallback, int i, Object obj) {
        this.f1076b = diagnosticsCallback;
        this.f1077c = i;
        this.f1078d = obj;
    }

    public final void run() {
        this.f1076b.onDiagnosticReceived(this.f1077c, this.f1078d);
    }
}
