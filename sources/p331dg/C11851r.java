package p331dg;

import androidx.concurrent.futures.C1248a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12787z;
import kotlin.jvm.internal.SourceDebugExtension;
import p466yf.C14015p0;

@SourceDebugExtension({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,367:1\n73#1,3:369\n1#2:368\n*S KotlinDebug\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n*L\n134#1:369,3\n*E\n"})
/* renamed from: dg.r */
/* compiled from: LockFreeLinkedList.kt */
public class C11851r {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f18508b;

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f18509c;

    /* renamed from: d */
    private static final AtomicReferenceFieldUpdater f18510d;
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* renamed from: dg.r$a */
    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class C11852a extends C11817b<C11851r> {

        /* renamed from: b */
        public final C11851r f18511b;

        /* renamed from: c */
        public C11851r f18512c;

        public C11852a(C11851r rVar) {
            this.f18511b = rVar;
        }

        /* renamed from: e */
        public void mo48975b(C11851r rVar, Object obj) {
            boolean z;
            C11851r rVar2;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                rVar2 = this.f18511b;
            } else {
                rVar2 = this.f18512c;
            }
            if (rVar2 != null && C1248a.m719a(C11851r.f18508b, rVar, this, rVar2) && z) {
                C11851r rVar3 = this.f18511b;
                C11851r rVar4 = this.f18512c;
                C12775o.m28636f(rVar4);
                rVar3.m25539i(rVar4);
            }
        }
    }

    /* renamed from: dg.r$b */
    /* compiled from: LockFreeLinkedList.kt */
    /* synthetic */ class C11853b extends C12787z {
        C11853b(Object obj) {
            super(obj, C14015p0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        public Object get() {
            return C14015p0.m32518a(this.receiver);
        }
    }

    static {
        Class<C11851r> cls = C11851r.class;
        Class<Object> cls2 = Object.class;
        f18508b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f18509c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
        f18510d = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: dg.r} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (androidx.concurrent.futures.C1248a.m719a(r4, r3, r2, ((p331dg.C11816a0) r5).f18461a) != false) goto L_0x0045;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p331dg.C11851r m25537g(p331dg.C11864z r9) {
        /*
            r8 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f18509c
            java.lang.Object r0 = r0.get(r8)
            dg.r r0 = (p331dg.C11851r) r0
            r1 = 0
            r2 = r0
        L_0x000a:
            r3 = r1
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f18508b
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L_0x0020
            if (r0 != r2) goto L_0x0016
            return r2
        L_0x0016:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f18509c
            boolean r0 = androidx.concurrent.futures.C1248a.m719a(r1, r8, r0, r2)
            if (r0 != 0) goto L_0x001f
            goto L_0x0000
        L_0x001f:
            return r2
        L_0x0020:
            boolean r6 = r8.mo49031n()
            if (r6 == 0) goto L_0x0027
            return r1
        L_0x0027:
            if (r5 != r9) goto L_0x002a
            return r2
        L_0x002a:
            boolean r6 = r5 instanceof p331dg.C11864z
            if (r6 == 0) goto L_0x0034
            dg.z r5 = (p331dg.C11864z) r5
            r5.mo48974a(r2)
            goto L_0x0000
        L_0x0034:
            boolean r6 = r5 instanceof p331dg.C11816a0
            if (r6 == 0) goto L_0x0050
            if (r3 == 0) goto L_0x0047
            dg.a0 r5 = (p331dg.C11816a0) r5
            dg.r r5 = r5.f18461a
            boolean r2 = androidx.concurrent.futures.C1248a.m719a(r4, r3, r2, r5)
            if (r2 != 0) goto L_0x0045
            goto L_0x0000
        L_0x0045:
            r2 = r3
            goto L_0x000a
        L_0x0047:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f18509c
            java.lang.Object r2 = r4.get(r2)
            dg.r r2 = (p331dg.C11851r) r2
            goto L_0x000b
        L_0x0050:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.C12775o.m28637g(r5, r3)
            r3 = r5
            dg.r r3 = (p331dg.C11851r) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: p331dg.C11851r.m25537g(dg.z):dg.r");
    }

    /* renamed from: h */
    private final C11851r m25538h(C11851r rVar) {
        while (rVar.mo49031n()) {
            rVar = (C11851r) f18509c.get(rVar);
        }
        return rVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m25539i(C11851r rVar) {
        C11851r rVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18509c;
        do {
            rVar2 = (C11851r) atomicReferenceFieldUpdater.get(rVar);
            if (mo49033j() != rVar) {
                return;
            }
        } while (!C1248a.m719a(f18509c, rVar, rVar2, this));
        if (mo49031n()) {
            rVar.m25537g((C11864z) null);
        }
    }

    /* renamed from: q */
    private final C11816a0 m25540q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18510d;
        C11816a0 a0Var = (C11816a0) atomicReferenceFieldUpdater.get(this);
        if (a0Var != null) {
            return a0Var;
        }
        C11816a0 a0Var2 = new C11816a0(this);
        atomicReferenceFieldUpdater.lazySet(this, a0Var2);
        return a0Var2;
    }

    /* renamed from: f */
    public final boolean mo49032f(C11851r rVar) {
        f18509c.lazySet(rVar, this);
        f18508b.lazySet(rVar, this);
        while (mo49033j() == this) {
            if (C1248a.m719a(f18508b, this, this, rVar)) {
                rVar.m25539i(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final Object mo49033j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18508b;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof C11864z)) {
                return obj;
            }
            ((C11864z) obj).mo48974a(this);
        }
    }

    /* renamed from: l */
    public final C11851r mo49034l() {
        return C11850q.m25534b(mo49033j());
    }

    /* renamed from: m */
    public final C11851r mo49035m() {
        C11851r g = m25537g((C11864z) null);
        if (g == null) {
            return m25538h((C11851r) f18509c.get(this));
        }
        return g;
    }

    /* renamed from: n */
    public boolean mo49031n() {
        return mo49033j() instanceof C11816a0;
    }

    /* renamed from: o */
    public boolean mo49036o() {
        if (mo49037p() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final C11851r mo49037p() {
        Object j;
        C11851r rVar;
        do {
            j = mo49033j();
            if (j instanceof C11816a0) {
                return ((C11816a0) j).f18461a;
            }
            if (j == this) {
                return (C11851r) j;
            }
            C12775o.m28637g(j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            rVar = (C11851r) j;
        } while (!C1248a.m719a(f18508b, this, j, rVar.m25540q()));
        rVar.m25537g((C11864z) null);
        return null;
    }

    /* renamed from: r */
    public final int mo49038r(C11851r rVar, C11851r rVar2, C11852a aVar) {
        f18509c.lazySet(rVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18508b;
        atomicReferenceFieldUpdater.lazySet(rVar, rVar2);
        aVar.f18512c = rVar2;
        if (!C1248a.m719a(atomicReferenceFieldUpdater, this, rVar2, aVar)) {
            return 0;
        }
        if (aVar.mo48974a(this) == null) {
            return 1;
        }
        return 2;
    }

    public String toString() {
        return new C11853b(this) + '@' + C14015p0.m32519b(this);
    }
}
