package p320cg;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p308ag.C10886a;
import p308ag.C10908n;
import p308ag.C10912p;
import p308ag.C10914r;
import p314bg.C10962f;
import p314bg.C10967g;
import p314bg.C10971h;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p355hf.C12085h;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C13999m0;
import p466yf.C14004n0;
import p466yf.C14015p0;

@SourceDebugExtension({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n1#2:246\n*E\n"})
/* renamed from: cg.d */
/* compiled from: ChannelFlow.kt */
public abstract class C11063d<T> implements C11077k<T> {

    /* renamed from: b */
    public final C12079g f17165b;

    /* renamed from: c */
    public final int f17166c;

    /* renamed from: d */
    public final C10886a f17167d;

    @C12739f(mo50609c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", mo50610f = "ChannelFlow.kt", mo50611l = {123}, mo50612m = "invokeSuspend")
    /* renamed from: cg.d$a */
    /* compiled from: ChannelFlow.kt */
    static final class C11064a extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f17168h;

        /* renamed from: i */
        private /* synthetic */ Object f17169i;

        /* renamed from: j */
        final /* synthetic */ C10967g<T> f17170j;

        /* renamed from: k */
        final /* synthetic */ C11063d<T> f17171k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11064a(C10967g<? super T> gVar, C11063d<T> dVar, C12074d<? super C11064a> dVar2) {
            super(2, dVar2);
            this.f17170j = gVar;
            this.f17171k = dVar;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C11064a aVar = new C11064a(this.f17170j, this.f17171k, dVar);
            aVar.f17169i = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f17168h;
            if (i == 0) {
                C11910n.m25701b(obj);
                C10967g<T> gVar = this.f17170j;
                C10914r<T> m = this.f17171k.mo46162m((C13995l0) this.f17169i);
                this.f17168h = 1;
                if (C10971h.m23603j(gVar, m, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C11064a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    @C12739f(mo50609c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", mo50610f = "ChannelFlow.kt", mo50611l = {60}, mo50612m = "invokeSuspend")
    /* renamed from: cg.d$b */
    /* compiled from: ChannelFlow.kt */
    static final class C11065b extends C12746l implements C13088o<C10912p<? super T>, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f17172h;

        /* renamed from: i */
        /* synthetic */ Object f17173i;

        /* renamed from: j */
        final /* synthetic */ C11063d<T> f17174j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11065b(C11063d<T> dVar, C12074d<? super C11065b> dVar2) {
            super(2, dVar2);
            this.f17174j = dVar;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C11065b bVar = new C11065b(this.f17174j, dVar);
            bVar.f17173i = obj;
            return bVar;
        }

        public final Object invoke(C10912p<? super T> pVar, C12074d<? super C11921v> dVar) {
            return ((C11065b) create(pVar, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f17172h;
            if (i == 0) {
                C11910n.m25701b(obj);
                C11063d<T> dVar = this.f17174j;
                this.f17172h = 1;
                if (dVar.mo46021h((C10912p) this.f17173i, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }
    }

    public C11063d(C12079g gVar, int i, C10886a aVar) {
        this.f17165b = gVar;
        this.f17166c = i;
        this.f17167d = aVar;
    }

    /* renamed from: f */
    static /* synthetic */ <T> Object m23873f(C11063d<T> dVar, C10967g<? super T> gVar, C12074d<? super C11921v> dVar2) {
        Object e = C13999m0.m32451e(new C11064a(gVar, dVar, (C12074d<? super C11064a>) null), dVar2);
        if (e == C12150d.m26492c()) {
            return e;
        }
        return C11921v.f18618a;
    }

    /* renamed from: a */
    public C10962f<T> mo46038a(C12079g gVar, int i, C10886a aVar) {
        C12079g plus = gVar.plus(this.f17165b);
        if (aVar == C10886a.SUSPEND) {
            int i2 = this.f17166c;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2 && (i2 = i2 + i) < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
                i = i2;
            }
            aVar = this.f17167d;
        }
        if (C12775o.m28634d(plus, this.f17165b) && i == this.f17166c && aVar == this.f17167d) {
            return this;
        }
        return mo46022i(plus, i, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo46158c() {
        return null;
    }

    public Object collect(C10967g<? super T> gVar, C12074d<? super C11921v> dVar) {
        return m23873f(this, gVar, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract Object mo46021h(C10912p<? super T> pVar, C12074d<? super C11921v> dVar);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C11063d<T> mo46022i(C12079g gVar, int i, C10886a aVar);

    /* renamed from: j */
    public C10962f<T> mo46159j() {
        return null;
    }

    /* renamed from: k */
    public final C13088o<C10912p<? super T>, C12074d<? super C11921v>, Object> mo46160k() {
        return new C11065b(this, (C12074d<? super C11065b>) null);
    }

    /* renamed from: l */
    public final int mo46161l() {
        int i = this.f17166c;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    /* renamed from: m */
    public C10914r<T> mo46162m(C13995l0 l0Var) {
        return C10908n.m23459c(l0Var, this.f17165b, mo46161l(), this.f17167d, C14004n0.ATOMIC, (Function1) null, mo46160k(), 16, (Object) null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String c = mo46158c();
        if (c != null) {
            arrayList.add(c);
        }
        if (this.f17165b != C12085h.f18916b) {
            arrayList.add("context=" + this.f17165b);
        }
        if (this.f17166c != -3) {
            arrayList.add("capacity=" + this.f17166c);
        }
        if (this.f17167d != C10886a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f17167d);
        }
        return C14015p0.m32518a(this) + '[' + C12686e0.m28229h0(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + ']';
    }
}
