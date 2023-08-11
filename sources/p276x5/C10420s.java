package p276x5;

/* renamed from: x5.s */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10420s implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C10421t f15718b;

    C10420s(C10421t tVar) {
        this.f15718b = tVar;
    }

    public final void run() {
        synchronized (this.f15718b.f15720b) {
            C10421t tVar = this.f15718b;
            if (tVar.f15721c != null) {
                tVar.f15721c.onCanceled();
            }
        }
    }
}
