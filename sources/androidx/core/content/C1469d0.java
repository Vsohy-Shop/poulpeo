package androidx.core.content;

/* renamed from: androidx.core.content.d0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1469d0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ UnusedAppRestrictionsBackportServiceConnection f449b;

    public /* synthetic */ C1469d0(UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection) {
        this.f449b = unusedAppRestrictionsBackportServiceConnection;
    }

    public final void run() {
        this.f449b.disconnectFromService();
    }
}
