package p314bg;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.internal.SourceDebugExtension;
import p308ag.C10914r;
import p336ef.C11921v;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,176:1\n106#2:177\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n*L\n153#1:177\n*E\n"})
/* renamed from: bg.j */
/* compiled from: Channels.kt */
final /* synthetic */ class C10977j {

    @C12739f(mo50609c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", mo50610f = "Channels.kt", mo50611l = {36, 37}, mo50612m = "emitAllImpl$FlowKt__ChannelsKt")
    /* renamed from: bg.j$a */
    /* compiled from: Channels.kt */
    static final class C10978a<T> extends C12737d {

        /* renamed from: h */
        Object f16947h;

        /* renamed from: i */
        Object f16948i;

        /* renamed from: j */
        Object f16949j;

        /* renamed from: k */
        boolean f16950k;

        /* renamed from: l */
        /* synthetic */ Object f16951l;

        /* renamed from: m */
        int f16952m;

        C10978a(C12074d<? super C10978a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f16951l = obj;
            this.f16952m |= Integer.MIN_VALUE;
            return C10977j.m23632c((C10967g) null, (C10914r) null, false, this);
        }
    }

    /* renamed from: b */
    public static final <T> Object m23631b(C10967g<? super T> gVar, C10914r<? extends T> rVar, C12074d<? super C11921v> dVar) {
        Object c = m23632c(gVar, rVar, true, dVar);
        if (c == C12150d.m26492c()) {
            return c;
        }
        return C11921v.f18618a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
        if (r8 != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        p308ag.C10905k.m23448a(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a3, code lost:
        throw r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[Catch:{ all -> 0x009d }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071 A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m23632c(p314bg.C10967g<? super T> r6, p308ag.C10914r<? extends T> r7, boolean r8, p355hf.C12074d<? super p336ef.C11921v> r9) {
        /*
            boolean r0 = r9 instanceof p314bg.C10977j.C10978a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            bg.j$a r0 = (p314bg.C10977j.C10978a) r0
            int r1 = r0.f16952m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f16952m = r1
            goto L_0x0018
        L_0x0013:
            bg.j$a r0 = new bg.j$a
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f16951l
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f16952m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            boolean r8 = r0.f16950k
            java.lang.Object r6 = r0.f16949j
            ag.f r6 = (p308ag.C10897f) r6
            java.lang.Object r7 = r0.f16948i
            ag.r r7 = (p308ag.C10914r) r7
            java.lang.Object r2 = r0.f16947h
            bg.g r2 = (p314bg.C10967g) r2
            p336ef.C11910n.m25701b(r9)     // Catch:{ all -> 0x009b }
        L_0x0039:
            r9 = r6
            r6 = r2
            goto L_0x0060
        L_0x003c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0044:
            boolean r8 = r0.f16950k
            java.lang.Object r6 = r0.f16949j
            ag.f r6 = (p308ag.C10897f) r6
            java.lang.Object r7 = r0.f16948i
            ag.r r7 = (p308ag.C10914r) r7
            java.lang.Object r2 = r0.f16947h
            bg.g r2 = (p314bg.C10967g) r2
            p336ef.C11910n.m25701b(r9)     // Catch:{ all -> 0x009b }
            goto L_0x0075
        L_0x0056:
            p336ef.C11910n.m25701b(r9)
            p314bg.C10971h.m23605l(r6)
            ag.f r9 = r7.iterator()     // Catch:{ all -> 0x009b }
        L_0x0060:
            r0.f16947h = r6     // Catch:{ all -> 0x009b }
            r0.f16948i = r7     // Catch:{ all -> 0x009b }
            r0.f16949j = r9     // Catch:{ all -> 0x009b }
            r0.f16950k = r8     // Catch:{ all -> 0x009b }
            r0.f16952m = r4     // Catch:{ all -> 0x009b }
            java.lang.Object r2 = r9.mo45899a(r0)     // Catch:{ all -> 0x009b }
            if (r2 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L_0x0075:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x009b }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x009b }
            if (r9 == 0) goto L_0x0092
            java.lang.Object r9 = r6.next()     // Catch:{ all -> 0x009b }
            r0.f16947h = r2     // Catch:{ all -> 0x009b }
            r0.f16948i = r7     // Catch:{ all -> 0x009b }
            r0.f16949j = r6     // Catch:{ all -> 0x009b }
            r0.f16950k = r8     // Catch:{ all -> 0x009b }
            r0.f16952m = r3     // Catch:{ all -> 0x009b }
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch:{ all -> 0x009b }
            if (r9 != r1) goto L_0x0039
            return r1
        L_0x0092:
            if (r8 == 0) goto L_0x0098
            r6 = 0
            p308ag.C10905k.m23448a(r7, r6)
        L_0x0098:
            ef.v r6 = p336ef.C11921v.f18618a
            return r6
        L_0x009b:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x009d }
        L_0x009d:
            r9 = move-exception
            if (r8 == 0) goto L_0x00a3
            p308ag.C10905k.m23448a(r7, r6)
        L_0x00a3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p314bg.C10977j.m23632c(bg.g, ag.r, boolean, hf.d):java.lang.Object");
    }
}
