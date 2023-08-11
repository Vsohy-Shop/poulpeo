package p453we;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: we.f */
/* compiled from: RxThreadFactory */
public final class C13709f extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* renamed from: b */
    final String f22116b;

    /* renamed from: c */
    final int f22117c;

    /* renamed from: d */
    final boolean f22118d;

    /* renamed from: we.f$a */
    /* compiled from: RxThreadFactory */
    static final class C13710a extends Thread {
        C13710a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public C13709f(String str) {
        this(str, 5, false);
    }

    public Thread newThread(Runnable runnable) {
        Thread thread;
        String str = this.f22116b + '-' + incrementAndGet();
        if (this.f22118d) {
            thread = new C13710a(runnable, str);
        } else {
            thread = new Thread(runnable, str);
        }
        thread.setPriority(this.f22117c);
        thread.setDaemon(true);
        return thread;
    }

    public String toString() {
        return "RxThreadFactory[" + this.f22116b + "]";
    }

    public C13709f(String str, int i) {
        this(str, i, false);
    }

    public C13709f(String str, int i, boolean z) {
        this.f22116b = str;
        this.f22117c = i;
        this.f22118d = z;
    }
}
