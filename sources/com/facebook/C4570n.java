package com.facebook;

import android.os.Handler;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.facebook.n */
/* compiled from: GraphRequestBatch.kt */
public final class C4570n extends AbstractList<C4555l> {

    /* renamed from: h */
    private static final AtomicInteger f4274h = new AtomicInteger();

    /* renamed from: i */
    public static final C4572b f4275i = new C4572b((DefaultConstructorMarker) null);

    /* renamed from: b */
    private Handler f4276b;

    /* renamed from: c */
    private int f4277c;

    /* renamed from: d */
    private final String f4278d = String.valueOf(f4274h.incrementAndGet());

    /* renamed from: e */
    private List<C4555l> f4279e;

    /* renamed from: f */
    private List<C4571a> f4280f = new ArrayList();

    /* renamed from: g */
    private String f4281g;

    /* renamed from: com.facebook.n$a */
    /* compiled from: GraphRequestBatch.kt */
    public interface C4571a {
        /* renamed from: a */
        void mo31557a(C4570n nVar);
    }

    /* renamed from: com.facebook.n$b */
    /* compiled from: GraphRequestBatch.kt */
    public static final class C4572b {
        private C4572b() {
        }

        public /* synthetic */ C4572b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.facebook.n$c */
    /* compiled from: GraphRequestBatch.kt */
    public interface C4573c extends C4571a {
        /* renamed from: b */
        void mo31708b(C4570n nVar, long j, long j2);
    }

    public C4570n(Collection<C4555l> collection) {
        C12775o.m28639i(collection, "requests");
        this.f4279e = new ArrayList(collection);
    }

    /* renamed from: r */
    private final List<C4574o> m5716r() {
        return C4555l.f4241t.mo31641g(this);
    }

    /* renamed from: t */
    private final C4568m m5717t() {
        return C4555l.f4241t.mo31644j(this);
    }

    /* renamed from: A */
    public final List<C4571a> mo31677A() {
        return this.f4280f;
    }

    /* renamed from: B */
    public final String mo31678B() {
        return this.f4278d;
    }

    /* renamed from: F */
    public final List<C4555l> mo31679F() {
        return this.f4279e;
    }

    /* renamed from: G */
    public int mo31680G() {
        return this.f4279e.size();
    }

    /* renamed from: H */
    public final int mo31681H() {
        return this.f4277c;
    }

    /* renamed from: I */
    public /* bridge */ int mo31682I(C4555l lVar) {
        return super.indexOf(lVar);
    }

    /* renamed from: J */
    public /* bridge */ int mo31683J(C4555l lVar) {
        return super.lastIndexOf(lVar);
    }

    /* renamed from: K */
    public /* bridge */ boolean mo31684K(C4555l lVar) {
        return super.remove(lVar);
    }

    /* renamed from: L */
    public C4555l remove(int i) {
        return this.f4279e.remove(i);
    }

    /* renamed from: M */
    public C4555l set(int i, C4555l lVar) {
        C12775o.m28639i(lVar, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return this.f4279e.set(i, lVar);
    }

    /* renamed from: N */
    public final void mo31687N(Handler handler) {
        this.f4276b = handler;
    }

    /* renamed from: b */
    public void add(int i, C4555l lVar) {
        C12775o.m28639i(lVar, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        this.f4279e.add(i, lVar);
    }

    public void clear() {
        this.f4279e.clear();
    }

    public final /* bridge */ boolean contains(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof C4555l;
        } else {
            z = true;
        }
        if (z) {
            return mo31697k((C4555l) obj);
        }
        return false;
    }

    /* renamed from: d */
    public boolean add(C4555l lVar) {
        C12775o.m28639i(lVar, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return this.f4279e.add(lVar);
    }

    public final /* bridge */ int indexOf(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof C4555l;
        } else {
            z = true;
        }
        if (z) {
            return mo31682I((C4555l) obj);
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo31696j(C4571a aVar) {
        C12775o.m28639i(aVar, "callback");
        if (!this.f4280f.contains(aVar)) {
            this.f4280f.add(aVar);
        }
    }

    /* renamed from: k */
    public /* bridge */ boolean mo31697k(C4555l lVar) {
        return super.contains(lVar);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof C4555l;
        } else {
            z = true;
        }
        if (z) {
            return mo31683J((C4555l) obj);
        }
        return -1;
    }

    /* renamed from: q */
    public final List<C4574o> mo31699q() {
        return m5716r();
    }

    /* renamed from: s */
    public final C4568m mo31702s() {
        return m5717t();
    }

    public final /* bridge */ int size() {
        return mo31680G();
    }

    /* renamed from: u */
    public C4555l get(int i) {
        return this.f4279e.get(i);
    }

    /* renamed from: v */
    public final String mo31706v() {
        return this.f4281g;
    }

    /* renamed from: z */
    public final Handler mo31707z() {
        return this.f4276b;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj != null ? obj instanceof C4555l : true) {
            return mo31684K((C4555l) obj);
        }
        return false;
    }

    public C4570n(C4555l... lVarArr) {
        C12775o.m28639i(lVarArr, "requests");
        this.f4279e = new ArrayList(C12708o.m28336c(lVarArr));
    }
}
