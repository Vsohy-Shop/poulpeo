package p155m;

import java.util.List;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p080f.C7533c;
import p155m.C8777b;
import p205r.C9339g;
import p205r.C9343i;
import p215s.C9414i;
import p355hf.C12074d;

/* renamed from: m.c */
/* compiled from: RealInterceptorChain.kt */
public final class C8779c implements C8777b.C8778a {

    /* renamed from: a */
    private final C9339g f12706a;

    /* renamed from: b */
    private final List<C8777b> f12707b;

    /* renamed from: c */
    private final int f12708c;

    /* renamed from: d */
    private final C9339g f12709d;

    /* renamed from: e */
    private final C9414i f12710e;

    /* renamed from: f */
    private final C7533c f12711f;

    /* renamed from: g */
    private final boolean f12712g;

    @C12739f(mo50609c = "coil.intercept.RealInterceptorChain", mo50610f = "RealInterceptorChain.kt", mo50611l = {25}, mo50612m = "proceed")
    /* renamed from: m.c$a */
    /* compiled from: RealInterceptorChain.kt */
    static final class C8780a extends C12737d {

        /* renamed from: h */
        Object f12713h;

        /* renamed from: i */
        Object f12714i;

        /* renamed from: j */
        /* synthetic */ Object f12715j;

        /* renamed from: k */
        final /* synthetic */ C8779c f12716k;

        /* renamed from: l */
        int f12717l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8780a(C8779c cVar, C12074d<? super C8780a> dVar) {
            super(dVar);
            this.f12716k = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12715j = obj;
            this.f12717l |= Integer.MIN_VALUE;
            return this.f12716k.mo42936g((C9339g) null, this);
        }
    }

    public C8779c(C9339g gVar, List<? extends C8777b> list, int i, C9339g gVar2, C9414i iVar, C7533c cVar, boolean z) {
        this.f12706a = gVar;
        this.f12707b = list;
        this.f12708c = i;
        this.f12709d = gVar2;
        this.f12710e = iVar;
        this.f12711f = cVar;
        this.f12712g = z;
    }

    /* renamed from: b */
    private final void m17789b(C9339g gVar, C8777b bVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (gVar.mo43713l() == this.f12706a.mo43713l()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (gVar.mo43714m() != C9343i.f13873a) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (gVar.mo43701M() == this.f12706a.mo43701M()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (gVar.mo43727z() == this.f12706a.mo43727z()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (gVar.mo43699K() != this.f12706a.mo43699K()) {
                            z5 = false;
                        }
                        if (!z5) {
                            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
                        }
                        return;
                    }
                    throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's lifecycle.").toString());
                }
                throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's target.").toString());
            }
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot set the request's data to null.").toString());
        }
        throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's context.").toString());
    }

    /* renamed from: c */
    private final C8779c m17790c(int i, C9339g gVar, C9414i iVar) {
        return new C8779c(this.f12706a, this.f12707b, i, gVar, iVar, this.f12711f, this.f12712g);
    }

    /* renamed from: d */
    static /* synthetic */ C8779c m17791d(C8779c cVar, int i, C9339g gVar, C9414i iVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cVar.f12708c;
        }
        if ((i2 & 2) != 0) {
            gVar = cVar.mo42932a();
        }
        if ((i2 & 4) != 0) {
            iVar = cVar.getSize();
        }
        return cVar.m17790c(i, gVar, iVar);
    }

    /* renamed from: a */
    public C9339g mo42932a() {
        return this.f12709d;
    }

    /* renamed from: e */
    public final C7533c mo42934e() {
        return this.f12711f;
    }

    /* renamed from: f */
    public final boolean mo42935f() {
        return this.f12712g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo42936g(p205r.C9339g r12, p355hf.C12074d<? super p205r.C9342h> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof p155m.C8779c.C8780a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            m.c$a r0 = (p155m.C8779c.C8780a) r0
            int r1 = r0.f12717l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12717l = r1
            goto L_0x0018
        L_0x0013:
            m.c$a r0 = new m.c$a
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f12715j
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f12717l
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r12 = r0.f12714i
            m.b r12 = (p155m.C8777b) r12
            java.lang.Object r0 = r0.f12713h
            m.c r0 = (p155m.C8779c) r0
            p336ef.C11910n.m25701b(r13)
            goto L_0x0074
        L_0x0031:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0039:
            p336ef.C11910n.m25701b(r13)
            int r13 = r11.f12708c
            if (r13 <= 0) goto L_0x004c
            java.util.List<m.b> r2 = r11.f12707b
            int r13 = r13 - r3
            java.lang.Object r13 = r2.get(r13)
            m.b r13 = (p155m.C8777b) r13
            r11.m17789b(r12, r13)
        L_0x004c:
            java.util.List<m.b> r13 = r11.f12707b
            int r2 = r11.f12708c
            java.lang.Object r13 = r13.get(r2)
            m.b r13 = (p155m.C8777b) r13
            int r2 = r11.f12708c
            int r5 = r2 + 1
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r11
            r6 = r12
            m.c r12 = m17791d(r4, r5, r6, r7, r8, r9)
            r0.f12713h = r11
            r0.f12714i = r13
            r0.f12717l = r3
            java.lang.Object r12 = r13.mo42922a(r12, r0)
            if (r12 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r0 = r11
            r10 = r13
            r13 = r12
            r12 = r10
        L_0x0074:
            r.h r13 = (p205r.C9342h) r13
            r.g r1 = r13.mo43684b()
            r0.m17789b(r1, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p155m.C8779c.mo42936g(r.g, hf.d):java.lang.Object");
    }

    public C9414i getSize() {
        return this.f12710e;
    }
}
