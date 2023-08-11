package p331dg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p466yf.C13974h1;
import p466yf.C14047w2;

@SourceDebugExtension({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 2 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,315:1\n295#1,5:323\n300#1,12:329\n312#1:385\n299#1:387\n300#1,12:389\n312#1:418\n215#2,7:316\n222#2:344\n241#2,8:345\n223#2:353\n253#2:354\n254#2,2:365\n256#2:369\n225#2:370\n227#2:386\n1#3:328\n1#3:388\n1#3:419\n198#4,3:341\n201#4,14:371\n198#4,17:401\n198#4,17:420\n107#5,10:355\n118#5,2:367\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n*L\n280#1:323,5\n280#1:329,12\n280#1:385\n285#1:387\n285#1:389,12\n285#1:418\n280#1:316,7\n280#1:344\n280#1:345,8\n280#1:353\n280#1:354\n280#1:365,2\n280#1:369\n280#1:370\n280#1:386\n280#1:328\n285#1:388\n280#1:341,3\n280#1:371,14\n285#1:401,17\n311#1:420,17\n280#1:355,10\n280#1:367,2\n*E\n"})
/* renamed from: dg.j */
/* compiled from: DispatchedContinuation.kt */
public final class C11833j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C11828g0 f18482a = new C11828g0("UNDEFINED");

    /* renamed from: b */
    public static final C11828g0 f18483b = new C11828g0("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (r8.mo53684L0() != false) goto L_0x0091;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m25482b(p355hf.C12074d<? super T> r6, java.lang.Object r7, kotlin.jvm.functions.Function1<? super java.lang.Throwable, p336ef.C11921v> r8) {
        /*
            boolean r0 = r6 instanceof p331dg.C11831i
            if (r0 == 0) goto L_0x00b6
            dg.i r6 = (p331dg.C11831i) r6
            java.lang.Object r8 = p466yf.C13948e0.m32251b(r7, r8)
            yf.h0 r0 = r6.f18477e
            hf.g r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f18479g = r8
            r6.f22969d = r1
            yf.h0 r7 = r6.f18477e
            hf.g r8 = r6.getContext()
            r7.dispatch(r8, r6)
            goto L_0x00b9
        L_0x0026:
            yf.w2 r0 = p466yf.C14047w2.f22961a
            yf.h1 r0 = r0.mo53812b()
            boolean r2 = r0.mo53749A0()
            if (r2 == 0) goto L_0x003b
            r6.f18479g = r8
            r6.f22969d = r1
            r0.mo53756w0(r6)
            goto L_0x00b9
        L_0x003b:
            r0.mo53758y0(r1)
            r2 = 0
            hf.g r3 = r6.getContext()     // Catch:{ all -> 0x00a9 }
            yf.y1$b r4 = p466yf.C14054y1.f22970b0     // Catch:{ all -> 0x00a9 }
            hf.g$b r3 = r3.get(r4)     // Catch:{ all -> 0x00a9 }
            yf.y1 r3 = (p466yf.C14054y1) r3     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x0069
            boolean r4 = r3.mo45937a()     // Catch:{ all -> 0x00a9 }
            if (r4 != 0) goto L_0x0069
            java.util.concurrent.CancellationException r3 = r3.mo53700A()     // Catch:{ all -> 0x00a9 }
            r6.mo48996d(r8, r3)     // Catch:{ all -> 0x00a9 }
            ef.m$a r8 = p336ef.C11907m.f18600b     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = p336ef.C11910n.m25700a(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = p336ef.C11907m.m25696a(r8)     // Catch:{ all -> 0x00a9 }
            r6.resumeWith(r8)     // Catch:{ all -> 0x00a9 }
            r8 = r1
            goto L_0x006a
        L_0x0069:
            r8 = 0
        L_0x006a:
            if (r8 != 0) goto L_0x00a2
            hf.d<T> r8 = r6.f18478f     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = r6.f18480h     // Catch:{ all -> 0x00a9 }
            hf.g r4 = r8.getContext()     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = p331dg.C11836k0.m25499c(r4, r3)     // Catch:{ all -> 0x00a9 }
            dg.g0 r5 = p331dg.C11836k0.f18485a     // Catch:{ all -> 0x00a9 }
            if (r3 == r5) goto L_0x0081
            yf.b3 r8 = p466yf.C13964g0.m32358g(r8, r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x0082
        L_0x0081:
            r8 = r2
        L_0x0082:
            hf.d<T> r5 = r6.f18478f     // Catch:{ all -> 0x0095 }
            r5.resumeWith(r7)     // Catch:{ all -> 0x0095 }
            ef.v r7 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0095 }
            if (r8 == 0) goto L_0x0091
            boolean r7 = r8.mo53684L0()     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x00a2
        L_0x0091:
            p331dg.C11836k0.m25497a(r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a2
        L_0x0095:
            r7 = move-exception
            if (r8 == 0) goto L_0x009e
            boolean r8 = r8.mo53684L0()     // Catch:{ all -> 0x00a9 }
            if (r8 == 0) goto L_0x00a1
        L_0x009e:
            p331dg.C11836k0.m25497a(r4, r3)     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            boolean r7 = r0.mo53752D0()     // Catch:{ all -> 0x00a9 }
            if (r7 != 0) goto L_0x00a2
            goto L_0x00ad
        L_0x00a9:
            r7 = move-exception
            r6.mo53819l(r7, r2)     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            r0.mo53755t0(r1)
            goto L_0x00b9
        L_0x00b1:
            r6 = move-exception
            r0.mo53755t0(r1)
            throw r6
        L_0x00b6:
            r6.resumeWith(r7)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p331dg.C11833j.m25482b(hf.d, java.lang.Object, kotlin.jvm.functions.Function1):void");
    }

    /* renamed from: c */
    public static /* synthetic */ void m25483c(C12074d dVar, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        m25482b(dVar, obj, function1);
    }

    /* renamed from: d */
    public static final boolean m25484d(C11831i<? super C11921v> iVar) {
        C11921v vVar = C11921v.f18618a;
        C13974h1 b = C14047w2.f22961a.mo53812b();
        if (b.mo53750B0()) {
            return false;
        }
        if (b.mo53749A0()) {
            iVar.f18479g = vVar;
            iVar.f22969d = 1;
            b.mo53756w0(iVar);
            return true;
        }
        b.mo53758y0(true);
        try {
            iVar.run();
            do {
            } while (b.mo53752D0());
        } catch (Throwable th) {
            b.mo53755t0(true);
            throw th;
        }
        b.mo53755t0(true);
        return false;
    }
}
