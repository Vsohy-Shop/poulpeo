package p276x5;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: x5.l */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10413l implements C10414m {

    /* renamed from: a */
    private final CountDownLatch f15699a = new CountDownLatch(1);

    /* synthetic */ C10413l(C10412k kVar) {
    }

    /* renamed from: a */
    public final void mo29368a(Object obj) {
        this.f15699a.countDown();
    }

    /* renamed from: b */
    public final void mo29406b(@NonNull Exception exc) {
        this.f15699a.countDown();
    }

    /* renamed from: c */
    public final void mo45107c() {
        this.f15699a.await();
    }

    /* renamed from: d */
    public final boolean mo45108d(long j, TimeUnit timeUnit) {
        return this.f15699a.await(j, timeUnit);
    }

    public final void onCanceled() {
        this.f15699a.countDown();
    }
}
