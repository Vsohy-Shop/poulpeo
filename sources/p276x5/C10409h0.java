package p276x5;

import java.util.concurrent.Callable;

/* renamed from: x5.h0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10409h0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C10407g0 f15696b;

    /* renamed from: c */
    final /* synthetic */ Callable f15697c;

    C10409h0(C10407g0 g0Var, Callable callable) {
        this.f15696b = g0Var;
        this.f15697c = callable;
    }

    public final void run() {
        try {
            this.f15696b.mo45102t(this.f15697c.call());
        } catch (Exception e) {
            this.f15696b.mo45101s(e);
        } catch (Throwable th) {
            this.f15696b.mo45101s(new RuntimeException(th));
        }
    }
}
