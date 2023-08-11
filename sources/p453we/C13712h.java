package p453we;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p361ie.C12141b;
import p391me.C12935a;

/* renamed from: we.h */
/* compiled from: ScheduledRunnable */
public final class C13712h extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, C12141b {

    /* renamed from: c */
    static final Object f22119c = new Object();

    /* renamed from: d */
    static final Object f22120d = new Object();

    /* renamed from: e */
    static final Object f22121e = new Object();

    /* renamed from: f */
    static final Object f22122f = new Object();
    private static final long serialVersionUID = -6120223772001106981L;

    /* renamed from: b */
    final Runnable f22123b;

    public C13712h(Runnable runnable, C12935a aVar) {
        super(3);
        this.f22123b = runnable;
        lazySet(0, aVar);
    }

    /* renamed from: a */
    public void mo53385a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f22122f) {
                if (obj == f22120d) {
                    future.cancel(false);
                    return;
                } else if (obj == f22121e) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public Object call() {
        run();
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispose() {
        /*
            r7 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r7.get(r0)
            java.lang.Object r2 = f22122f
            r3 = 0
            if (r1 == r2) goto L_0x0031
            java.lang.Object r2 = f22120d
            if (r1 == r2) goto L_0x0031
            java.lang.Object r4 = f22121e
            if (r1 != r4) goto L_0x0013
            goto L_0x0031
        L_0x0013:
            r5 = 2
            java.lang.Object r5 = r7.get(r5)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            if (r5 == r6) goto L_0x0020
            r5 = r0
            goto L_0x0021
        L_0x0020:
            r5 = r3
        L_0x0021:
            if (r5 == 0) goto L_0x0024
            r2 = r4
        L_0x0024:
            boolean r0 = r7.compareAndSet(r0, r1, r2)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0031
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r5)
        L_0x0031:
            java.lang.Object r0 = r7.get(r3)
            java.lang.Object r1 = f22122f
            if (r0 == r1) goto L_0x004b
            java.lang.Object r1 = f22119c
            if (r0 == r1) goto L_0x004b
            if (r0 != 0) goto L_0x0040
            goto L_0x004b
        L_0x0040:
            boolean r1 = r7.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0031
            me.a r0 = (p391me.C12935a) r0
            r0.mo49581a(r7)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p453we.C13712h.dispose():void");
    }

    public boolean isDisposed() {
        Object obj = get(0);
        if (obj == f22119c || obj == f22122f) {
            return true;
        }
        return false;
    }

    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f22123b.run();
        } catch (Throwable th) {
            lazySet(2, (Object) null);
            Object obj3 = get(0);
            if (!(obj3 == f22119c || !compareAndSet(0, obj3, f22122f) || obj3 == null)) {
                ((C12935a) obj3).mo49581a(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f22120d || obj2 == f22121e || compareAndSet(1, obj2, f22122f)) {
                    throw th;
                }
                obj2 = get(1);
                break;
            } while (compareAndSet(1, obj2, f22122f));
            throw th;
        }
        lazySet(2, (Object) null);
        Object obj4 = get(0);
        if (!(obj4 == f22119c || !compareAndSet(0, obj4, f22122f) || obj4 == null)) {
            ((C12935a) obj4).mo49581a(this);
        }
        do {
            obj = get(1);
            if (obj == f22120d || obj == f22121e || compareAndSet(1, obj, f22122f)) {
            }
            obj = get(1);
            return;
        } while (compareAndSet(1, obj, f22122f));
    }
}
