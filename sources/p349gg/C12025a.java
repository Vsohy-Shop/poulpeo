package p349gg;

import androidx.concurrent.futures.C1248a;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p331dg.C11822d0;
import p336ef.C11921v;
import p355hf.C12079g;
import p404of.C13089p;
import p466yf.C13943d1;
import p466yf.C13945d3;
import p466yf.C13994l;
import p466yf.C14002n;

@SourceDebugExtension({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,873:1\n1#2:874\n2624#3,3:875\n1855#3,2:888\n1855#3,2:896\n1855#3,2:898\n314#4,9:878\n323#4,2:890\n19#5:887\n153#6,4:892\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n*L\n505#1:875,3\n569#1:888,2\n726#1:896,2\n751#1:898,2\n545#1:878,9\n545#1:890,2\n561#1:887\n711#1:892,4\n*E\n"})
/* renamed from: gg.a */
/* compiled from: Select.kt */
public class C12025a<R> extends C13994l implements C12027b, C13945d3 {

    /* renamed from: g */
    private static final AtomicReferenceFieldUpdater f18787g = AtomicReferenceFieldUpdater.newUpdater(C12025a.class, Object.class, "state");

    /* renamed from: b */
    private final C12079g f18788b;

    /* renamed from: c */
    private List<C12025a<R>.a> f18789c;

    /* renamed from: d */
    private Object f18790d;

    /* renamed from: e */
    private int f18791e;

    /* renamed from: f */
    private Object f18792f;
    private volatile Object state;

    @SourceDebugExtension({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation$ClauseData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,873:1\n1#2:874\n*E\n"})
    /* renamed from: gg.a$a */
    /* compiled from: Select.kt */
    public final class C12026a {

        /* renamed from: a */
        public final Object f18793a;

        /* renamed from: b */
        private final Object f18794b;

        /* renamed from: c */
        public final C13089p<C12027b<?>, Object, Object, Function1<Throwable, C11921v>> f18795c;

        /* renamed from: d */
        public Object f18796d;

        /* renamed from: e */
        public int f18797e;

        /* renamed from: f */
        final /* synthetic */ C12025a<R> f18798f;

        /* renamed from: a */
        public final Function1<Throwable, C11921v> mo49458a(C12027b<?> bVar, Object obj) {
            C13089p<C12027b<?>, Object, Object, Function1<Throwable, C11921v>> pVar = this.f18795c;
            if (pVar != null) {
                return pVar.invoke(bVar, this.f18794b, obj);
            }
            return null;
        }

        /* renamed from: b */
        public final void mo49459b() {
            Object obj = this.f18796d;
            C12025a<R> aVar = this.f18798f;
            C13943d1 d1Var = null;
            if (obj instanceof C11822d0) {
                ((C11822d0) obj).mo45924o(this.f18797e, (Throwable) null, aVar.getContext());
                return;
            }
            if (obj instanceof C13943d1) {
                d1Var = (C13943d1) obj;
            }
            if (d1Var != null) {
                d1Var.dispose();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: gg.a<R>$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: gg.a<R>$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: gg.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: gg.a<R>$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p349gg.C12025a<R>.a m26113e(java.lang.Object r5) {
        /*
            r4 = this;
            java.util.List<gg.a<R>$a> r0 = r4.f18789c
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0023
            java.lang.Object r2 = r0.next()
            r3 = r2
            gg.a$a r3 = (p349gg.C12025a.C12026a) r3
            java.lang.Object r3 = r3.f18793a
            if (r3 != r5) goto L_0x001f
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            if (r3 == 0) goto L_0x000c
            r1 = r2
        L_0x0023:
            gg.a$a r1 = (p349gg.C12025a.C12026a) r1
            if (r1 == 0) goto L_0x0028
            return r1
        L_0x0028:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Clause with object "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " is not found"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p349gg.C12025a.m26113e(java.lang.Object):gg.a$a");
    }

    /* renamed from: g */
    private final int m26114g(Object obj, Object obj2) {
        boolean z;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18787g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof C14002n) {
                C12025a<R>.a e = m26113e(obj);
                if (e == null) {
                    continue;
                } else {
                    Function1<Throwable, C11921v> a = e.mo49458a(this, obj2);
                    if (C1248a.m719a(atomicReferenceFieldUpdater, this, obj3, e)) {
                        this.f18792f = obj2;
                        if (C12028c.m26131h((C14002n) obj3, a)) {
                            return 0;
                        }
                        this.f18792f = null;
                        return 2;
                    }
                }
            } else {
                if (C12775o.m28634d(obj3, C12028c.f18801c)) {
                    z = true;
                } else {
                    z = obj3 instanceof C12026a;
                }
                if (z) {
                    return 3;
                }
                if (C12775o.m28634d(obj3, C12028c.f18802d)) {
                    return 2;
                }
                if (C12775o.m28634d(obj3, C12028c.f18800b)) {
                    if (C1248a.m719a(atomicReferenceFieldUpdater, this, obj3, C12723v.m28509d(obj))) {
                        return 1;
                    }
                } else if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                } else if (C1248a.m719a(atomicReferenceFieldUpdater, this, obj3, C12686e0.m28237p0((Collection) obj3, obj))) {
                    return 1;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo49453a(Object obj, Object obj2) {
        if (m26114g(obj, obj2) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo45900b(C11822d0<?> d0Var, int i) {
        this.f18790d = d0Var;
        this.f18791e = i;
    }

    /* renamed from: c */
    public void mo49454c(Object obj) {
        this.f18792f = obj;
    }

    /* renamed from: d */
    public void mo49455d(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18787g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == C12028c.f18801c) {
                return;
            }
        } while (!C1248a.m719a(atomicReferenceFieldUpdater, this, obj, C12028c.f18802d));
        List<C12025a<R>.a> list = this.f18789c;
        if (list != null) {
            for (C12026a b : list) {
                b.mo49459b();
            }
            this.f18792f = C12028c.f18803e;
            this.f18789c = null;
        }
    }

    /* renamed from: f */
    public final C12030d mo49456f(Object obj, Object obj2) {
        return C12028c.m26124a(m26114g(obj, obj2));
    }

    public C12079g getContext() {
        return this.f18788b;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo49455d((Throwable) obj);
        return C11921v.f18618a;
    }
}
