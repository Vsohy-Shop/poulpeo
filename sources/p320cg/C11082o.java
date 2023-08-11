package p320cg;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12738e;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p314bg.C10967g;
import p336ef.C11907m;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p355hf.C12085h;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13934b2;

@SourceDebugExtension({"SMAP\nSafeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.kt\nkotlinx/coroutines/flow/internal/SafeCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
/* renamed from: cg.o */
/* compiled from: SafeCollector.kt */
public final class C11082o<T> extends C12737d implements C10967g<T> {

    /* renamed from: h */
    public final C10967g<T> f17206h;

    /* renamed from: i */
    public final C12079g f17207i;

    /* renamed from: j */
    public final int f17208j;

    /* renamed from: k */
    private C12079g f17209k;

    /* renamed from: l */
    private C12074d<? super C11921v> f17210l;

    /* renamed from: cg.o$a */
    /* compiled from: SafeCollector.kt */
    static final class C11083a extends C12777p implements C13088o<Integer, C12079g.C12082b, Integer> {

        /* renamed from: g */
        public static final C11083a f17211g = new C11083a();

        C11083a() {
            super(2);
        }

        /* renamed from: a */
        public final Integer mo46172a(int i, C12079g.C12082b bVar) {
            return Integer.valueOf(i + 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo46172a(((Number) obj).intValue(), (C12079g.C12082b) obj2);
        }
    }

    public C11082o(C10967g<? super T> gVar, C12079g gVar2) {
        super(C11079l.f17200b, C12085h.f18916b);
        this.f17206h = gVar;
        this.f17207i = gVar2;
        this.f17208j = ((Number) gVar2.fold(0, C11083a.f17211g)).intValue();
    }

    /* renamed from: l */
    private final void m23900l(C12079g gVar, C12079g gVar2, T t) {
        if (gVar2 instanceof C11075i) {
            m23902n((C11075i) gVar2, t);
        }
        C11086q.m23906a(this, gVar);
    }

    /* renamed from: m */
    private final Object m23901m(C12074d<? super C11921v> dVar, T t) {
        C12079g context = dVar.getContext();
        C13934b2.m32224l(context);
        C12079g gVar = this.f17209k;
        if (gVar != context) {
            m23900l(context, gVar, t);
            this.f17209k = context;
        }
        this.f17210l = dVar;
        C13089p a = C11084p.f17212a;
        C10967g<T> gVar2 = this.f17206h;
        C12775o.m28637g(gVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        C12775o.m28637g(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = a.invoke(gVar2, t, this);
        if (!C12775o.m28634d(invoke, C12150d.m26492c())) {
            this.f17210l = null;
        }
        return invoke;
    }

    /* renamed from: n */
    private final void m23902n(C11075i iVar, Object obj) {
        throw new IllegalStateException(C13745o.m31511f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + iVar.f17198b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    public Object emit(T t, C12074d<? super C11921v> dVar) {
        try {
            Object m = m23901m(dVar, t);
            if (m == C12150d.m26492c()) {
                C12741h.m28573c(dVar);
            }
            if (m == C12150d.m26492c()) {
                return m;
            }
            return C11921v.f18618a;
        } catch (Throwable th) {
            this.f17209k = new C11075i(th, dVar.getContext());
            throw th;
        }
    }

    public C12738e getCallerFrame() {
        C12074d<? super C11921v> dVar = this.f17210l;
        if (dVar instanceof C12738e) {
            return (C12738e) dVar;
        }
        return null;
    }

    public C12079g getContext() {
        C12079g gVar = this.f17209k;
        if (gVar == null) {
            return C12085h.f18916b;
        }
        return gVar;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object invokeSuspend(Object obj) {
        Throwable b = C11907m.m25697b(obj);
        if (b != null) {
            this.f17209k = new C11075i(b, getContext());
        }
        C12074d<? super C11921v> dVar = this.f17210l;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return C12150d.m26492c();
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
