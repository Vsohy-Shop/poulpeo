package p099g6;

import java.util.concurrent.CountDownLatch;

/* renamed from: g6.p */
final class C7794p implements C7780b, C7779a {

    /* renamed from: a */
    private final CountDownLatch f10836a = new CountDownLatch(1);

    /* synthetic */ C7794p(byte[] bArr) {
    }

    /* renamed from: a */
    public final void mo39354a(Object obj) {
        this.f10836a.countDown();
    }

    /* renamed from: b */
    public final void mo39358b(Exception exc) {
        this.f10836a.countDown();
    }

    /* renamed from: c */
    public final void mo41445c() {
        this.f10836a.await();
    }
}
