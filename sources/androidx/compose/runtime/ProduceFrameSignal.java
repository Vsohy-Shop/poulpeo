package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1408:1\n70#2:1409\n70#2:1419\n314#3,9:1410\n323#3,2:1420\n1#4:1422\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n*L\n1355#1:1409\n1362#1:1419\n1361#1:1410,9\n1361#1:1420,2\n*E\n"})
/* compiled from: Recomposer.kt */
final class ProduceFrameSignal {
    /* access modifiers changed from: private */
    public Object pendingFrameContinuation;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r0 = new p466yf.C14010o(p362if.C12147c.m26491b(r5), 1);
        r0.mo53786B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (access$getPendingFrameContinuation$p(r3) != androidx.compose.runtime.RecomposerKt.access$getProduceAnotherFrame$p()) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        access$setPendingFrameContinuation$p(r3, androidx.compose.runtime.RecomposerKt.access$getFramePending$p());
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        access$setPendingFrameContinuation$p(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r1 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        r4 = p336ef.C11907m.f18600b;
        r1.resumeWith(p336ef.C11907m.m25696a(p336ef.C11921v.f18618a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r4 = r0.mo53797y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r4 != p362if.C12150d.m26492c()) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        kotlin.coroutines.jvm.internal.C12741h.m28573c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        if (r4 != p362if.C12150d.m26492c()) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        return p336ef.C11921v.f18618a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object awaitFrameRequest(java.lang.Object r4, p355hf.C12074d<? super p336ef.C11921v> r5) {
        /*
            r3 = this;
            monitor-enter(r4)
            java.lang.Object r0 = r3.pendingFrameContinuation     // Catch:{ all -> 0x0063 }
            java.lang.Object r1 = androidx.compose.runtime.RecomposerKt.ProduceAnotherFrame     // Catch:{ all -> 0x0063 }
            if (r0 != r1) goto L_0x0013
            java.lang.Object r5 = androidx.compose.runtime.RecomposerKt.FramePending     // Catch:{ all -> 0x0063 }
            r3.pendingFrameContinuation = r5     // Catch:{ all -> 0x0063 }
            ef.v r5 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0063 }
            monitor-exit(r4)
            return r5
        L_0x0013:
            ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0063 }
            monitor-exit(r4)
            yf.o r0 = new yf.o
            hf.d r1 = p362if.C12147c.m26491b(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.mo53786B()
            monitor-enter(r4)
            java.lang.Object r1 = r3.pendingFrameContinuation     // Catch:{ all -> 0x0060 }
            java.lang.Object r2 = androidx.compose.runtime.RecomposerKt.ProduceAnotherFrame     // Catch:{ all -> 0x0060 }
            if (r1 != r2) goto L_0x0037
            java.lang.Object r1 = androidx.compose.runtime.RecomposerKt.FramePending     // Catch:{ all -> 0x0060 }
            r3.pendingFrameContinuation = r1     // Catch:{ all -> 0x0060 }
            r1 = r0
            goto L_0x003b
        L_0x0037:
            r3.pendingFrameContinuation = r0     // Catch:{ all -> 0x0060 }
            r1 = 0
        L_0x003b:
            monitor-exit(r4)
            if (r1 == 0) goto L_0x0049
            ef.m$a r4 = p336ef.C11907m.f18600b
            ef.v r4 = p336ef.C11921v.f18618a
            java.lang.Object r4 = p336ef.C11907m.m25696a(r4)
            r1.resumeWith(r4)
        L_0x0049:
            java.lang.Object r4 = r0.mo53797y()
            java.lang.Object r0 = p362if.C12150d.m26492c()
            if (r4 != r0) goto L_0x0056
            kotlin.coroutines.jvm.internal.C12741h.m28573c(r5)
        L_0x0056:
            java.lang.Object r5 = p362if.C12150d.m26492c()
            if (r4 != r5) goto L_0x005d
            return r4
        L_0x005d:
            ef.v r4 = p336ef.C11921v.f18618a
            return r4
        L_0x0060:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0063:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProduceFrameSignal.awaitFrameRequest(java.lang.Object, hf.d):java.lang.Object");
    }

    public final C12074d<C11921v> requestFrameLocked() {
        boolean z;
        Object obj = this.pendingFrameContinuation;
        if (obj instanceof C12074d) {
            this.pendingFrameContinuation = RecomposerKt.FramePending;
            return (C12074d) obj;
        }
        if (C12775o.m28634d(obj, RecomposerKt.ProduceAnotherFrame)) {
            z = true;
        } else {
            z = C12775o.m28634d(obj, RecomposerKt.FramePending);
        }
        if (!z) {
            if (obj == null) {
                this.pendingFrameContinuation = RecomposerKt.ProduceAnotherFrame;
            } else {
                throw new IllegalStateException(("invalid pendingFrameContinuation " + obj).toString());
            }
        }
        return null;
    }

    public final void takeFrameRequestLocked() {
        boolean z;
        if (this.pendingFrameContinuation == RecomposerKt.FramePending) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.pendingFrameContinuation = null;
            return;
        }
        throw new IllegalStateException("frame not pending".toString());
    }
}
