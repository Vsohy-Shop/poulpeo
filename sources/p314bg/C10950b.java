package p314bg;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p308ag.C10886a;
import p308ag.C10912p;
import p320cg.C11063d;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p355hf.C12085h;
import p404of.C13088o;

/* renamed from: bg.b */
/* compiled from: Builders.kt */
final class C10950b<T> extends C10953c<T> {

    /* renamed from: f */
    private final C13088o<C10912p<? super T>, C12074d<? super C11921v>, Object> f16892f;

    @C12739f(mo50609c = "kotlinx.coroutines.flow.CallbackFlowBuilder", mo50610f = "Builders.kt", mo50611l = {334}, mo50612m = "collectTo")
    /* renamed from: bg.b$a */
    /* compiled from: Builders.kt */
    static final class C10951a extends C12737d {

        /* renamed from: h */
        Object f16893h;

        /* renamed from: i */
        /* synthetic */ Object f16894i;

        /* renamed from: j */
        final /* synthetic */ C10950b<T> f16895j;

        /* renamed from: k */
        int f16896k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10951a(C10950b<T> bVar, C12074d<? super C10951a> dVar) {
            super(dVar);
            this.f16895j = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f16894i = obj;
            this.f16896k |= Integer.MIN_VALUE;
            return this.f16895j.mo46021h((C10912p) null, this);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10950b(C13088o oVar, C12079g gVar, int i, C10886a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, (i2 & 2) != 0 ? C12085h.f18916b : gVar, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? C10886a.SUSPEND : aVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo46021h(p308ag.C10912p<? super T> r5, p355hf.C12074d<? super p336ef.C11921v> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p314bg.C10950b.C10951a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            bg.b$a r0 = (p314bg.C10950b.C10951a) r0
            int r1 = r0.f16896k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f16896k = r1
            goto L_0x0018
        L_0x0013:
            bg.b$a r0 = new bg.b$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f16894i
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f16896k
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f16893h
            ag.p r5 = (p308ag.C10912p) r5
            p336ef.C11910n.m25701b(r6)
            goto L_0x0043
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            p336ef.C11910n.m25701b(r6)
            r0.f16893h = r5
            r0.f16896k = r3
            java.lang.Object r6 = super.mo46021h(r5, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            boolean r5 = r5.mo45895n()
            if (r5 == 0) goto L_0x004c
            ef.v r5 = p336ef.C11921v.f18618a
            return r5
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p314bg.C10950b.mo46021h(ag.p, hf.d):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C11063d<T> mo46022i(C12079g gVar, int i, C10886a aVar) {
        return new C10950b(this.f16892f, gVar, i, aVar);
    }

    public C10950b(C13088o<? super C10912p<? super T>, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12079g gVar, int i, C10886a aVar) {
        super(oVar, gVar, i, aVar);
        this.f16892f = oVar;
    }
}
