package p281y;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p336ef.C11921v;
import p355hf.C12067a;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13933b1;
import p466yf.C13977i0;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14039u2;
import p466yf.C14054y1;

/* renamed from: y.a */
public final class C10606a implements C13995l0 {

    /* renamed from: b */
    public static final C10606a f16162b = new C10606a();

    /* renamed from: c */
    private static final C13977i0 f16163c;

    /* renamed from: d */
    private static final C12079g f16164d;

    /* renamed from: y.a$a */
    static final class C10607a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Throwable f16165g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10607a(Throwable th) {
            super(0);
            this.f16165g = th;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Child job of BrazeCoroutineScope got exception: ", this.f16165g);
        }
    }

    @C12739f(mo50609c = "com.braze.coroutine.BrazeCoroutineScope$launchDelayed$1", mo50610f = "BrazeCoroutineScope.kt", mo50611l = {52, 55}, mo50612m = "invokeSuspend")
    /* renamed from: y.a$b */
    static final class C10608b extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f16166h;

        /* renamed from: i */
        private /* synthetic */ Object f16167i;

        /* renamed from: j */
        final /* synthetic */ Number f16168j;

        /* renamed from: k */
        final /* synthetic */ Function1<C12074d<? super C11921v>, Object> f16169k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10608b(Number number, Function1<? super C12074d<? super C11921v>, ? extends Object> function1, C12074d<? super C10608b> dVar) {
            super(2, dVar);
            this.f16168j = number;
            this.f16169k = function1;
        }

        /* renamed from: a */
        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C10608b) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C10608b bVar = new C10608b(this.f16168j, this.f16169k, dVar);
            bVar.f16167i = obj;
            return bVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: yf.l0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p362if.C12150d.m26492c()
                int r1 = r6.f16166h
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                p336ef.C11910n.m25701b(r7)
                goto L_0x004f
            L_0x0012:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001a:
                java.lang.Object r1 = r6.f16167i
                yf.l0 r1 = (p466yf.C13995l0) r1
                p336ef.C11910n.m25701b(r7)
                goto L_0x003b
            L_0x0022:
                p336ef.C11910n.m25701b(r7)
                java.lang.Object r7 = r6.f16167i
                r1 = r7
                yf.l0 r1 = (p466yf.C13995l0) r1
                java.lang.Number r7 = r6.f16168j
                long r4 = r7.longValue()
                r6.f16167i = r1
                r6.f16166h = r3
                java.lang.Object r7 = p466yf.C14041v0.m32563a(r4, r6)
                if (r7 != r0) goto L_0x003b
                return r0
            L_0x003b:
                boolean r7 = p466yf.C13999m0.m32453g(r1)
                if (r7 == 0) goto L_0x004f
                kotlin.jvm.functions.Function1<hf.d<? super ef.v>, java.lang.Object> r7 = r6.f16169k
                r1 = 0
                r6.f16167i = r1
                r6.f16166h = r2
                java.lang.Object r7 = r7.invoke(r6)
                if (r7 != r0) goto L_0x004f
                return r0
            L_0x004f:
                ef.v r7 = p336ef.C11921v.f18618a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p281y.C10606a.C10608b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: y.a$c */
    public static final class C10609c extends C12067a implements C13977i0 {
        public C10609c(C13977i0.C13978a aVar) {
            super(aVar);
        }

        public void handleException(C12079g gVar, Throwable th) {
            C8266c.m16396e(C8266c.f11641a, C10606a.f16162b, C8266c.C8267a.f11649e, th, false, new C10607a(th), 4, (Object) null);
        }
    }

    static {
        C10609c cVar = new C10609c(C13977i0.f22907a0);
        f16163c = cVar;
        f16164d = C13933b1.m32211b().plus(cVar).plus(C14039u2.m32561b((C14054y1) null, 1, (Object) null));
    }

    private C10606a() {
    }

    /* renamed from: b */
    public static /* synthetic */ C14054y1 m22557b(C10606a aVar, Number number, C12079g gVar, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            gVar = aVar.getCoroutineContext();
        }
        return aVar.mo45556a(number, gVar, function1);
    }

    /* renamed from: a */
    public final C14054y1 mo45556a(Number number, C12079g gVar, Function1<? super C12074d<? super C11921v>, ? extends Object> function1) {
        C12775o.m28639i(number, "startDelayInMs");
        C12775o.m28639i(gVar, "specificContext");
        C12775o.m28639i(function1, "block");
        return C13985j.m32422d(this, gVar, (C14004n0) null, new C10608b(number, function1, (C12074d<? super C10608b>) null), 2, (Object) null);
    }

    public C12079g getCoroutineContext() {
        return f16164d;
    }
}
