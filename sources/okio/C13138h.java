package okio;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n+ 2 -JvmPlatform.kt\nokio/_JvmPlatformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 5 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 6 -Util.kt\nokio/_UtilKt\n*L\n1#1,444:1\n33#2:445\n33#2:447\n33#2:448\n33#2:449\n33#2:450\n33#2:451\n33#2:452\n33#2:453\n33#2:457\n33#2:459\n1#3:446\n61#4:454\n61#4:455\n61#4:456\n50#5:458\n84#6:460\n84#6:461\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n*L\n69#1:445\n81#1:447\n92#1:448\n105#1:449\n119#1:450\n129#1:451\n139#1:452\n151#1:453\n221#1:457\n287#1:459\n169#1:454\n195#1:455\n202#1:456\n248#1:458\n345#1:460\n374#1:461\n*E\n"})
/* renamed from: okio.h */
/* compiled from: FileHandle.kt */
public abstract class C13138h implements Closeable {

    /* renamed from: b */
    private final boolean f20911b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f20912c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f20913d;

    /* renamed from: e */
    private final ReentrantLock f20914e = C13129d1.m29612b();

    @SourceDebugExtension({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n33#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n*L\n436#1:446\n*E\n"})
    /* renamed from: okio.h$a */
    /* compiled from: FileHandle.kt */
    private static final class C13139a implements C13179y0 {

        /* renamed from: b */
        private final C13138h f20915b;

        /* renamed from: c */
        private long f20916c;

        /* renamed from: d */
        private boolean f20917d;

        public C13139a(C13138h hVar, long j) {
            C12775o.m28639i(hVar, "fileHandle");
            this.f20915b = hVar;
            this.f20916c = j;
        }

        public void close() {
            if (!this.f20917d) {
                this.f20917d = true;
                ReentrantLock A = this.f20915b.mo52628A();
                A.lock();
                try {
                    C13138h hVar = this.f20915b;
                    hVar.f20913d = hVar.f20913d - 1;
                    if (this.f20915b.f20913d == 0) {
                        if (this.f20915b.f20912c) {
                            C11921v vVar = C11921v.f18618a;
                            A.unlock();
                            this.f20915b.mo52629G();
                        }
                    }
                } finally {
                    A.unlock();
                }
            }
        }

        public long read(C13121c cVar, long j) {
            C12775o.m28639i(cVar, "sink");
            if (!this.f20917d) {
                long c = this.f20915b.m29698R(this.f20916c, cVar, j);
                if (c != -1) {
                    this.f20916c += c;
                }
                return c;
            }
            throw new IllegalStateException("closed".toString());
        }

        public C13181z0 timeout() {
            return C13181z0.NONE;
        }
    }

    public C13138h(boolean z) {
        this.f20911b = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public final long m29698R(long j, C13121c cVar, long j2) {
        boolean z;
        C13121c cVar2 = cVar;
        long j3 = j2;
        if (j3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j4 = j + j3;
            long j5 = j;
            while (true) {
                if (j5 >= j4) {
                    break;
                }
                C13168t0 F0 = cVar2.mo52487F0(1);
                byte[] bArr = F0.f20967a;
                int i = F0.f20969c;
                int O = mo52630O(j5, bArr, i, (int) Math.min(j4 - j5, (long) (8192 - i)));
                if (O == -1) {
                    if (F0.f20968b == F0.f20969c) {
                        cVar2.f20888b = F0.mo52717b();
                        C13171u0.m29872b(F0);
                    }
                    if (j == j5) {
                        return -1;
                    }
                } else {
                    F0.f20969c += O;
                    long j6 = (long) O;
                    j5 += j6;
                    cVar2.mo52483C0(cVar.size() + j6);
                }
            }
            return j5 - j;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
    }

    /* renamed from: A */
    public final ReentrantLock mo52628A() {
        return this.f20914e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void mo52629G();

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public abstract int mo52630O(long j, byte[] bArr, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public abstract long mo52631Q();

    /* JADX INFO: finally extract failed */
    /* renamed from: V */
    public final C13179y0 mo52632V(long j) {
        ReentrantLock reentrantLock = this.f20914e;
        reentrantLock.lock();
        try {
            if (!this.f20912c) {
                this.f20913d++;
                reentrantLock.unlock();
                return new C13139a(this, j);
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void close() {
        ReentrantLock reentrantLock = this.f20914e;
        reentrantLock.lock();
        try {
            if (!this.f20912c) {
                this.f20912c = true;
                if (this.f20913d != 0) {
                    reentrantLock.unlock();
                    return;
                }
                C11921v vVar = C11921v.f18618a;
                reentrantLock.unlock();
                mo52629G();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public final long size() {
        ReentrantLock reentrantLock = this.f20914e;
        reentrantLock.lock();
        try {
            if (!this.f20912c) {
                C11921v vVar = C11921v.f18618a;
                reentrantLock.unlock();
                return mo52631Q();
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
