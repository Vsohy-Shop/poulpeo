package okio;

import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: okio.a */
/* compiled from: AsyncTimeout.kt */
public class C13110a extends C13181z0 {
    public static final C13111a Companion = new C13111a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final long IDLE_TIMEOUT_MILLIS;
    /* access modifiers changed from: private */
    public static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    /* access modifiers changed from: private */
    public static final Condition condition;
    /* access modifiers changed from: private */
    public static C13110a head;
    /* access modifiers changed from: private */
    public static final ReentrantLock lock;
    /* access modifiers changed from: private */
    public boolean inQueue;
    /* access modifiers changed from: private */
    public C13110a next;
    /* access modifiers changed from: private */
    public long timeoutAt;

    @SourceDebugExtension({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n1#2:332\n*E\n"})
    /* renamed from: okio.a$a */
    /* compiled from: AsyncTimeout.kt */
    public static final class C13111a {
        private C13111a() {
        }

        public /* synthetic */ C13111a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m29501d(C13110a aVar) {
            ReentrantLock f = C13110a.Companion.mo52474f();
            f.lock();
            try {
                if (!aVar.inQueue) {
                    return false;
                }
                aVar.inQueue = false;
                for (C13110a access$getHead$cp = C13110a.head; access$getHead$cp != null; access$getHead$cp = access$getHead$cp.next) {
                    if (access$getHead$cp.next == aVar) {
                        access$getHead$cp.next = aVar.next;
                        aVar.next = null;
                        f.unlock();
                        return false;
                    }
                }
                f.unlock();
                return true;
            } finally {
                f.unlock();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public final void m29502g(C13110a aVar, long j, boolean z) {
            ReentrantLock f = C13110a.Companion.mo52474f();
            f.lock();
            try {
                if (!aVar.inQueue) {
                    aVar.inQueue = true;
                    if (C13110a.head == null) {
                        C13110a.head = new C13110a();
                        new C13112b().start();
                    }
                    long nanoTime = System.nanoTime();
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    if (i != 0 && z) {
                        aVar.timeoutAt = Math.min(j, aVar.deadlineNanoTime() - nanoTime) + nanoTime;
                    } else if (i != 0) {
                        aVar.timeoutAt = j + nanoTime;
                    } else if (z) {
                        aVar.timeoutAt = aVar.deadlineNanoTime();
                    } else {
                        throw new AssertionError();
                    }
                    long access$remainingNanos = aVar.remainingNanos(nanoTime);
                    C13110a access$getHead$cp = C13110a.head;
                    C12775o.m28636f(access$getHead$cp);
                    while (true) {
                        if (access$getHead$cp.next == null) {
                            break;
                        }
                        C13110a access$getNext$p = access$getHead$cp.next;
                        C12775o.m28636f(access$getNext$p);
                        if (access$remainingNanos < access$getNext$p.remainingNanos(nanoTime)) {
                            break;
                        }
                        access$getHead$cp = access$getHead$cp.next;
                        C12775o.m28636f(access$getHead$cp);
                    }
                    aVar.next = access$getHead$cp.next;
                    access$getHead$cp.next = aVar;
                    if (access$getHead$cp == C13110a.head) {
                        C13110a.Companion.mo52473e().signal();
                    }
                    C11921v vVar = C11921v.f18618a;
                    return;
                }
                throw new IllegalStateException("Unbalanced enter/exit".toString());
            } finally {
                f.unlock();
            }
        }

        /* renamed from: c */
        public final C13110a mo52472c() {
            C13110a access$getHead$cp = C13110a.head;
            C12775o.m28636f(access$getHead$cp);
            C13110a access$getNext$p = access$getHead$cp.next;
            if (access$getNext$p == null) {
                long nanoTime = System.nanoTime();
                mo52473e().await(C13110a.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                C13110a access$getHead$cp2 = C13110a.head;
                C12775o.m28636f(access$getHead$cp2);
                if (access$getHead$cp2.next != null || System.nanoTime() - nanoTime < C13110a.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return C13110a.head;
            }
            long access$remainingNanos = access$getNext$p.remainingNanos(System.nanoTime());
            if (access$remainingNanos > 0) {
                mo52473e().await(access$remainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            C13110a access$getHead$cp3 = C13110a.head;
            C12775o.m28636f(access$getHead$cp3);
            access$getHead$cp3.next = access$getNext$p.next;
            access$getNext$p.next = null;
            return access$getNext$p;
        }

        /* renamed from: e */
        public final Condition mo52473e() {
            return C13110a.condition;
        }

        /* renamed from: f */
        public final ReentrantLock mo52474f() {
            return C13110a.lock;
        }
    }

    /* renamed from: okio.a$b */
    /* compiled from: AsyncTimeout.kt */
    private static final class C13112b extends Thread {
        public C13112b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|(5:5|6|7|19|8)(5:9|10|11|12|(2:14|23)(1:22))|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
            r1.unlock();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
            throw r0;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:18:0x0000, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                okio.a$a r0 = okio.C13110a.Companion     // Catch:{ InterruptedException -> 0x0000 }
                java.util.concurrent.locks.ReentrantLock r1 = r0.mo52474f()     // Catch:{ InterruptedException -> 0x0000 }
                r1.lock()     // Catch:{ InterruptedException -> 0x0000 }
                okio.a r0 = r0.mo52472c()     // Catch:{ all -> 0x0026 }
                okio.a r2 = okio.C13110a.head     // Catch:{ all -> 0x0026 }
                if (r0 != r2) goto L_0x001b
                r0 = 0
                okio.C13110a.head = r0     // Catch:{ all -> 0x0026 }
                r1.unlock()     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x001b:
                ef.v r2 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0026 }
                r1.unlock()     // Catch:{ InterruptedException -> 0x0000 }
                if (r0 == 0) goto L_0x0000
                r0.timedOut()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0026:
                r0 = move-exception
                r1.unlock()     // Catch:{ InterruptedException -> 0x0000 }
                throw r0     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.C13110a.C13112b.run():void");
        }
    }

    @SourceDebugExtension({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,331:1\n146#2,11:332\n146#2,11:343\n146#2,11:354\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n*L\n102#1:332,11\n108#1:343,11\n112#1:354,11\n*E\n"})
    /* renamed from: okio.a$c */
    /* compiled from: AsyncTimeout.kt */
    public static final class C13113c implements C13175w0 {

        /* renamed from: b */
        final /* synthetic */ C13110a f20878b;

        /* renamed from: c */
        final /* synthetic */ C13175w0 f20879c;

        C13113c(C13110a aVar, C13175w0 w0Var) {
            this.f20878b = aVar;
            this.f20879c = w0Var;
        }

        /* renamed from: a */
        public C13110a timeout() {
            return this.f20878b;
        }

        public void close() {
            C13110a aVar = this.f20878b;
            C13175w0 w0Var = this.f20879c;
            aVar.enter();
            try {
                w0Var.close();
                C11921v vVar = C11921v.f18618a;
                if (aVar.exit()) {
                    throw aVar.access$newTimeoutException((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (aVar.exit()) {
                    e = aVar.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                boolean exit = aVar.exit();
            }
        }

        public void flush() {
            C13110a aVar = this.f20878b;
            C13175w0 w0Var = this.f20879c;
            aVar.enter();
            try {
                w0Var.flush();
                C11921v vVar = C11921v.f18618a;
                if (aVar.exit()) {
                    throw aVar.access$newTimeoutException((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (aVar.exit()) {
                    e = aVar.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                boolean exit = aVar.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f20879c + ')';
        }

        public void write(C13121c cVar, long j) {
            C12775o.m28639i(cVar, APIParams.SOURCE);
            C13132e1.m29639b(cVar.size(), 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C13168t0 t0Var = cVar.f20888b;
                    C12775o.m28636f(t0Var);
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += (long) (t0Var.f20969c - t0Var.f20968b);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        } else {
                            t0Var = t0Var.f20972f;
                            C12775o.m28636f(t0Var);
                        }
                    }
                    C13110a aVar = this.f20878b;
                    C13175w0 w0Var = this.f20879c;
                    aVar.enter();
                    try {
                        w0Var.write(cVar, j2);
                        C11921v vVar = C11921v.f18618a;
                        if (!aVar.exit()) {
                            j -= j2;
                        } else {
                            throw aVar.access$newTimeoutException((IOException) null);
                        }
                    } catch (IOException e) {
                        e = e;
                        if (aVar.exit()) {
                            e = aVar.access$newTimeoutException(e);
                        }
                        throw e;
                    } finally {
                        boolean exit = aVar.exit();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,331:1\n146#2,11:332\n146#2,11:343\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n*L\n128#1:332,11\n132#1:343,11\n*E\n"})
    /* renamed from: okio.a$d */
    /* compiled from: AsyncTimeout.kt */
    public static final class C13114d implements C13179y0 {

        /* renamed from: b */
        final /* synthetic */ C13110a f20880b;

        /* renamed from: c */
        final /* synthetic */ C13179y0 f20881c;

        C13114d(C13110a aVar, C13179y0 y0Var) {
            this.f20880b = aVar;
            this.f20881c = y0Var;
        }

        /* renamed from: a */
        public C13110a timeout() {
            return this.f20880b;
        }

        public void close() {
            C13110a aVar = this.f20880b;
            C13179y0 y0Var = this.f20881c;
            aVar.enter();
            try {
                y0Var.close();
                C11921v vVar = C11921v.f18618a;
                if (aVar.exit()) {
                    throw aVar.access$newTimeoutException((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (aVar.exit()) {
                    e = aVar.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                boolean exit = aVar.exit();
            }
        }

        public long read(C13121c cVar, long j) {
            C12775o.m28639i(cVar, "sink");
            C13110a aVar = this.f20880b;
            C13179y0 y0Var = this.f20881c;
            aVar.enter();
            try {
                long read = y0Var.read(cVar, j);
                if (!aVar.exit()) {
                    return read;
                }
                throw aVar.access$newTimeoutException((IOException) null);
            } catch (IOException e) {
                e = e;
                if (aVar.exit()) {
                    e = aVar.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                boolean exit = aVar.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f20881c + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        C12775o.m28638h(newCondition, "lock.newCondition()");
        condition = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* access modifiers changed from: private */
    public final long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            Companion.m29502g(this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean exit() {
        return Companion.m29501d(this);
    }

    /* access modifiers changed from: protected */
    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final C13175w0 sink(C13175w0 w0Var) {
        C12775o.m28639i(w0Var, "sink");
        return new C13113c(this, w0Var);
    }

    public final C13179y0 source(C13179y0 y0Var) {
        C12775o.m28639i(y0Var, APIParams.SOURCE);
        return new C13114d(this, y0Var);
    }

    public final <T> T withTimeout(C13074a<? extends T> aVar) {
        C12775o.m28639i(aVar, "block");
        enter();
        try {
            T invoke = aVar.invoke();
            C12773m.m28629b(1);
            if (!exit()) {
                C12773m.m28628a(1);
                return invoke;
            }
            throw access$newTimeoutException((IOException) null);
        } catch (IOException e) {
            e = e;
            if (exit()) {
                e = access$newTimeoutException(e);
            }
            throw e;
        } catch (Throwable th) {
            C12773m.m28629b(1);
            boolean exit = exit();
            C12773m.m28628a(1);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void timedOut() {
    }
}
