package p331dg;

import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,269:1\n46#1,8:284\n107#2,7:270\n107#2,7:277\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n74#1:284,8\n27#1:270,7\n85#1:277,7\n*E\n"})
/* renamed from: dg.d */
/* compiled from: ConcurrentLinkedList.kt */
public final class C11821d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C11828g0 f18465a = new C11828g0("CLOSED");

    /* renamed from: b */
    public static final <N extends C11823e<N>> N m25433b(N n) {
        while (true) {
            N a = n.m25444f();
            if (a == f18465a) {
                return n;
            }
            N n2 = (C11823e) a;
            if (n2 != null) {
                n = n2;
            } else if (n.mo48991j()) {
                return n;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [of.o<? super java.lang.Long, ? super S, ? extends S>, of.o] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S extends p331dg.C11822d0<S>> java.lang.Object m25434c(S r4, long r5, p404of.C13088o<? super java.lang.Long, ? super S, ? extends S> r7) {
        /*
        L_0x0000:
            long r0 = r4.f18467d
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0012
            boolean r0 = r4.mo48983h()
            if (r0 == 0) goto L_0x000d
            goto L_0x0012
        L_0x000d:
            java.lang.Object r4 = p331dg.C11824e0.m25453a(r4)
            return r4
        L_0x0012:
            java.lang.Object r0 = r4.m25444f()
            dg.g0 r1 = f18465a
            if (r0 != r1) goto L_0x0023
            dg.g0 r4 = f18465a
            java.lang.Object r4 = p331dg.C11824e0.m25453a(r4)
            return r4
        L_0x0023:
            dg.e r0 = (p331dg.C11823e) r0
            dg.d0 r0 = (p331dg.C11822d0) r0
            if (r0 == 0) goto L_0x002b
        L_0x0029:
            r4 = r0
            goto L_0x0000
        L_0x002b:
            long r0 = r4.f18467d
            r2 = 1
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r7.invoke(r0, r4)
            dg.d0 r0 = (p331dg.C11822d0) r0
            boolean r1 = r4.mo48993l(r0)
            if (r1 == 0) goto L_0x0000
            boolean r1 = r4.mo48983h()
            if (r1 == 0) goto L_0x0029
            r4.mo48992k()
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: p331dg.C11821d.m25434c(dg.d0, long, of.o):java.lang.Object");
    }
}
