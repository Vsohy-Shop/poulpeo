package p356hg;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.SourceDebugExtension;
import p331dg.C11822d0;
import p355hf.C12079g;

@SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,397:1\n371#1,2:398\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n384#1:398,2\n*E\n"})
/* renamed from: hg.g */
/* compiled from: Semaphore.kt */
final class C12103g extends C11822d0<C12103g> {

    /* renamed from: f */
    private final AtomicReferenceArray f18950f = new AtomicReferenceArray(C12102f.f18949f);

    public C12103g(long j, C12103g gVar, int i) {
        super(j, gVar, i);
    }

    /* renamed from: n */
    public int mo45923n() {
        return C12102f.f18949f;
    }

    /* renamed from: o */
    public void mo45924o(int i, Throwable th, C12079g gVar) {
        mo49544r().set(i, C12102f.f18948e);
        mo48985p();
    }

    /* renamed from: r */
    public final AtomicReferenceArray mo49544r() {
        return this.f18950f;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f18467d + ", hashCode=" + hashCode() + ']';
    }
}
