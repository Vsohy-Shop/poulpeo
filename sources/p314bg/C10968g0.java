package p314bg;

import androidx.core.location.LocationRequestCompat;
import java.util.List;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nSharingStarted.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharingStarted.kt\nkotlinx/coroutines/flow/StartedWhileSubscribed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
/* renamed from: bg.g0 */
/* compiled from: SharingStarted.kt */
final class C10968g0 implements C10958d0 {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f16928b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final long f16929c;

    @C12739f(mo50609c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", mo50610f = "SharingStarted.kt", mo50611l = {178, 180, 182, 183, 185}, mo50612m = "invokeSuspend")
    /* renamed from: bg.g0$a */
    /* compiled from: SharingStarted.kt */
    static final class C10969a extends C12746l implements C13089p<C10967g<? super C10952b0>, Integer, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f16930h;

        /* renamed from: i */
        private /* synthetic */ Object f16931i;

        /* renamed from: j */
        /* synthetic */ int f16932j;

        /* renamed from: k */
        final /* synthetic */ C10968g0 f16933k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10969a(C10968g0 g0Var, C12074d<? super C10969a> dVar) {
            super(3, dVar);
            this.f16933k = g0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo46035l((C10967g) obj, ((Number) obj2).intValue(), (C12074d) obj3);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: bg.g} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x008d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009b A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = p362if.C12150d.m26492c()
                int r1 = r9.f16930h
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L_0x003c
                if (r1 == r6) goto L_0x0038
                if (r1 == r5) goto L_0x0030
                if (r1 == r4) goto L_0x0028
                if (r1 == r3) goto L_0x0020
                if (r1 != r2) goto L_0x0018
                goto L_0x0038
            L_0x0018:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0020:
                java.lang.Object r1 = r9.f16931i
                bg.g r1 = (p314bg.C10967g) r1
                p336ef.C11910n.m25701b(r10)
                goto L_0x008e
            L_0x0028:
                java.lang.Object r1 = r9.f16931i
                bg.g r1 = (p314bg.C10967g) r1
                p336ef.C11910n.m25701b(r10)
                goto L_0x007d
            L_0x0030:
                java.lang.Object r1 = r9.f16931i
                bg.g r1 = (p314bg.C10967g) r1
                p336ef.C11910n.m25701b(r10)
                goto L_0x0064
            L_0x0038:
                p336ef.C11910n.m25701b(r10)
                goto L_0x009c
            L_0x003c:
                p336ef.C11910n.m25701b(r10)
                java.lang.Object r10 = r9.f16931i
                r1 = r10
                bg.g r1 = (p314bg.C10967g) r1
                int r10 = r9.f16932j
                if (r10 <= 0) goto L_0x0053
                bg.b0 r10 = p314bg.C10952b0.START
                r9.f16930h = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L_0x009c
                return r0
            L_0x0053:
                bg.g0 r10 = r9.f16933k
                long r6 = r10.f16928b
                r9.f16931i = r1
                r9.f16930h = r5
                java.lang.Object r10 = p466yf.C14041v0.m32563a(r6, r9)
                if (r10 != r0) goto L_0x0064
                return r0
            L_0x0064:
                bg.g0 r10 = r9.f16933k
                long r5 = r10.f16929c
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L_0x008e
                bg.b0 r10 = p314bg.C10952b0.STOP
                r9.f16931i = r1
                r9.f16930h = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L_0x007d
                return r0
            L_0x007d:
                bg.g0 r10 = r9.f16933k
                long r4 = r10.f16929c
                r9.f16931i = r1
                r9.f16930h = r3
                java.lang.Object r10 = p466yf.C14041v0.m32563a(r4, r9)
                if (r10 != r0) goto L_0x008e
                return r0
            L_0x008e:
                bg.b0 r10 = p314bg.C10952b0.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f16931i = r3
                r9.f16930h = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L_0x009c
                return r0
            L_0x009c:
                ef.v r10 = p336ef.C11921v.f18618a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p314bg.C10968g0.C10969a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* renamed from: l */
        public final Object mo46035l(C10967g<? super C10952b0> gVar, int i, C12074d<? super C11921v> dVar) {
            C10969a aVar = new C10969a(this.f16933k, dVar);
            aVar.f16931i = gVar;
            aVar.f16932j = i;
            return aVar.invokeSuspend(C11921v.f18618a);
        }
    }

    @C12739f(mo50609c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", mo50610f = "SharingStarted.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: bg.g0$b */
    /* compiled from: SharingStarted.kt */
    static final class C10970b extends C12746l implements C13088o<C10952b0, C12074d<? super Boolean>, Object> {

        /* renamed from: h */
        int f16934h;

        /* renamed from: i */
        /* synthetic */ Object f16935i;

        C10970b(C12074d<? super C10970b> dVar) {
            super(2, dVar);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C10970b bVar = new C10970b(dVar);
            bVar.f16935i = obj;
            return bVar;
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            Object unused = C12150d.m26492c();
            if (this.f16934h == 0) {
                C11910n.m25701b(obj);
                if (((C10952b0) this.f16935i) != C10952b0.START) {
                    z = true;
                } else {
                    z = false;
                }
                return C12735b.m28558a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: l */
        public final Object invoke(C10952b0 b0Var, C12074d<? super Boolean> dVar) {
            return ((C10970b) create(b0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    public C10968g0(long j, long j2) {
        boolean z;
        this.f16928b = j;
        this.f16929c = j2;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!(j2 < 0 ? false : z2)) {
                throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
    }

    /* renamed from: a */
    public C10962f<C10952b0> mo46024a(C10972h0<Integer> h0Var) {
        return C10971h.m23600g(C10971h.m23602i(C10971h.m23616w(h0Var, new C10969a(this, (C12074d<? super C10969a>) null)), new C10970b((C12074d<? super C10970b>) null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10968g0) {
            C10968g0 g0Var = (C10968g0) obj;
            if (this.f16928b == g0Var.f16928b && this.f16929c == g0Var.f16929c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (Long.hashCode(this.f16928b) * 31) + Long.hashCode(this.f16929c);
    }

    public String toString() {
        List c = C12723v.m28508c(2);
        if (this.f16928b > 0) {
            c.add("stopTimeout=" + this.f16928b + "ms");
        }
        if (this.f16929c < LocationRequestCompat.PASSIVE_INTERVAL) {
            c.add("replayExpiration=" + this.f16929c + "ms");
        }
        List a = C12723v.m28506a(c);
        return "SharingStarted.WhileSubscribed(" + C12686e0.m28229h0(a, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) + ')';
    }
}
