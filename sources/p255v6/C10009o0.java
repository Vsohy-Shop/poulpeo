package p255v6;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import p276x5.C10394a;

/* renamed from: v6.o0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10009o0 implements C10394a {

    /* renamed from: a */
    public final /* synthetic */ CountDownLatch f15058a;

    public /* synthetic */ C10009o0(CountDownLatch countDownLatch) {
        this.f15058a = countDownLatch;
    }

    /* renamed from: a */
    public final Object mo39780a(Task task) {
        return this.f15058a.countDown();
    }
}
