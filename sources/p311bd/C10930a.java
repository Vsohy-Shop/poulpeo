package p311bd;

import androidx.annotation.NonNull;
import com.rmn.p324ui.views.listview.C11654c;
import com.rmn.p324ui.views.listview.C11658g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p305ad.C10863b;
import p440ud.C13573q;

/* renamed from: bd.a */
/* compiled from: BaseListViewController */
public class C10930a extends C10863b {

    /* renamed from: c */
    public final int f16843c;

    /* renamed from: d */
    public C11654c f16844d;

    /* renamed from: e */
    private final List<Object> f16845e = new ArrayList();

    /* renamed from: f */
    private int f16846f = 1;

    /* renamed from: g */
    private int f16847g;

    /* renamed from: h */
    private boolean f16848h;

    /* renamed from: i */
    private C10933c f16849i;

    /* renamed from: j */
    private C10932b f16850j;

    /* renamed from: k */
    private boolean f16851k;

    /* renamed from: l */
    private boolean f16852l;

    /* renamed from: m */
    private boolean f16853m;

    /* renamed from: n */
    private boolean f16854n;

    /* renamed from: o */
    private C10933c f16855o;

    /* renamed from: p */
    private C10932b f16856p;

    /* renamed from: q */
    private C11658g f16857q;

    /* renamed from: r */
    private int f16858r;

    /* renamed from: bd.a$a */
    /* compiled from: BaseListViewController */
    static /* synthetic */ class C10931a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16859a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                bd.c[] r0 = p311bd.C10933c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16859a = r0
                bd.c r1 = p311bd.C10933c.NOT_READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16859a     // Catch:{ NoSuchFieldError -> 0x001d }
                bd.c r1 = p311bd.C10933c.NEUTRAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16859a     // Catch:{ NoSuchFieldError -> 0x0028 }
                bd.c r1 = p311bd.C10933c.REFRESHING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16859a     // Catch:{ NoSuchFieldError -> 0x0033 }
                bd.c r1 = p311bd.C10933c.LAZY_LOADING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p311bd.C10930a.C10931a.<clinit>():void");
        }
    }

    public C10930a(C10934d dVar, Integer num) {
        super(dVar);
        int i;
        C10933c cVar = C10933c.NOT_READY;
        this.f16849i = cVar;
        C10932b bVar = C10932b.f16860b;
        this.f16850j = bVar;
        this.f16851k = false;
        this.f16852l = true;
        this.f16853m = true;
        this.f16854n = false;
        this.f16855o = cVar;
        this.f16856p = bVar;
        this.f16858r = 1;
        mo45969q2().setListViewEnabled(false);
        mo45969q2().setSwipeRefreshLayoutEnabled(false);
        mo45969q2().setSwipeRefreshLayoutRefreshing(false);
        mo45969q2().setSwipeRefreshLayoutVisibility(C13573q.VISIBLE);
        mo45969q2().mo45988o1();
        if (num != null) {
            i = num.intValue();
        } else {
            i = 20;
        }
        this.f16843c = i;
        this.f16847g = 0;
    }

    /* renamed from: H2 */
    private void m23502H2() {
        this.f16855o = C10933c.REFRESHING;
    }

    /* renamed from: V2 */
    private void m23503V2() {
        C10933c cVar = this.f16855o;
        if (cVar != null) {
            this.f16855o = null;
        } else {
            cVar = this.f16849i;
        }
        m23504W2(cVar);
    }

    /* renamed from: W2 */
    private void m23504W2(C10933c cVar) {
        C10933c cVar2;
        boolean z;
        C13573q qVar;
        boolean z2;
        boolean z3;
        C10933c cVar3;
        if (cVar != null) {
            cVar2 = cVar;
        } else {
            cVar2 = C10933c.NOT_READY;
        }
        this.f16849i = cVar2;
        boolean z4 = false;
        this.f16851k = false;
        C13573q qVar2 = C13573q.VISIBLE;
        boolean z5 = true;
        if (this.f16848h || this.f16845e.isEmpty() || !((cVar3 = this.f16849i) == C10933c.NEUTRAL || cVar3 == C10933c.LAZY_LOADING)) {
            z = false;
        } else {
            z = true;
        }
        int i = C10931a.f16859a[this.f16849i.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.f16854n = false;
                z2 = this.f16852l;
                this.f16851k = true;
                qVar = qVar2;
                z3 = false;
            } else if (i != 3) {
                if (i == 4) {
                    z2 = false;
                    qVar = qVar2;
                    z3 = false;
                } else {
                    throw new UnsupportedOperationException();
                }
            } else if (this.f16845e.isEmpty()) {
                z2 = false;
                qVar = C13573q.GONE;
                z3 = true;
                z4 = true;
                z5 = false;
            } else {
                z2 = this.f16852l;
                qVar = qVar2;
                z3 = false;
                z4 = true;
            }
            z4 = true;
            z5 = z3;
        } else {
            this.f16854n = false;
            z5 = false;
            z2 = false;
            qVar = qVar2;
            z3 = false;
        }
        mo45969q2().setListViewEnabled(z4);
        mo45969q2().setSwipeRefreshLayoutVisibility(qVar);
        mo45969q2().setSwipeRefreshLayoutEnabled(z2);
        mo45969q2().setSwipeRefreshLayoutRefreshing(z5);
        if (z3) {
            mo45969q2().mo45996y0();
        } else {
            mo45969q2().mo45988o1();
        }
        mo45969q2().setLazyLoadingRowVisible(z);
        mo45969q2().mo45995t1(cVar);
        mo45963U2();
    }

    /* renamed from: A2 */
    public boolean mo45944A2(Object obj, int i) {
        if (obj != null) {
            if (i < 0) {
                i = 0;
            } else if (i > this.f16845e.size()) {
                i = this.f16845e.size();
            }
            if (this.f16849i == C10933c.NOT_READY) {
                return false;
            }
            mo45966n2(obj, i, true);
            m23504W2(C10933c.NEUTRAL);
            return true;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: B2 */
    public boolean mo45945B2() {
        if (this.f16849i != C10933c.NOT_READY) {
            return true;
        }
        return false;
    }

    /* renamed from: C2 */
    public void mo45946C2() {
        C11658g gVar = this.f16857q;
        if (gVar != null) {
            gVar.mo47904t0(this);
        }
    }

    /* renamed from: D2 */
    public void mo45947D2(Object obj) {
        C11658g gVar;
        if (this.f16849i == C10933c.NEUTRAL && obj != null && (gVar = this.f16857q) != null) {
            gVar.mo47902N0(this, obj);
        }
    }

    /* renamed from: E2 */
    public void mo45948E2() {
        if (this.f16849i == C10933c.NEUTRAL && !this.f16854n) {
            m23504W2(C10933c.REFRESHING);
            this.f16854n = true;
            C11658g gVar = this.f16857q;
            if (gVar != null) {
                gVar.mo47901M0(this, this.f16843c);
            }
        }
    }

    /* renamed from: F2 */
    public void mo45949F2() {
        if (this.f16849i == C10933c.NEUTRAL && this.f16851k && !this.f16848h && this.f16850j == C10932b.f16860b && mo45969q2().mo45984d0()) {
            mo45956N2();
            m23504W2(C10933c.LAZY_LOADING);
        }
    }

    /* renamed from: G2 */
    public void mo45950G2(C10932b bVar) {
        if (bVar != null) {
            this.f16856p = bVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: I2 */
    public boolean mo45951I2() {
        if (this.f16849i == C10933c.NOT_READY) {
            return false;
        }
        mo45968p2(true);
        this.f16846f = 1;
        this.f16847g = 0;
        this.f16848h = false;
        this.f16851k = true;
        this.f16854n = false;
        m23504W2(C10933c.NEUTRAL);
        return true;
    }

    /* renamed from: J2 */
    public void mo45952J2(Class<?> cls) {
        if (cls != null) {
            HashSet hashSet = new HashSet(1);
            hashSet.add(cls);
            mo45953K2(hashSet);
        }
    }

    /* renamed from: K2 */
    public boolean mo45953K2(Set<Class<?>> set) {
        boolean z = false;
        if (this.f16849i == C10933c.NOT_READY) {
            return false;
        }
        if (set != null && !set.isEmpty()) {
            for (int size = this.f16845e.size() - 1; size >= 0; size--) {
                Object obj = this.f16845e.get(size);
                Iterator<Class<?>> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().isInstance(obj)) {
                            mo45955M2(size, true);
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                m23504W2(C10933c.NEUTRAL);
            }
        }
        return z;
    }

    /* renamed from: L2 */
    public boolean mo45954L2(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        } else if (this.f16849i == C10933c.NOT_READY) {
            return false;
        } else {
            for (int i = 0; i < this.f16845e.size(); i++) {
                if (obj == this.f16845e.get(i)) {
                    mo45955M2(i, true);
                    m23504W2(C10933c.NEUTRAL);
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M2 */
    public void mo45955M2(int i, boolean z) {
        this.f16845e.remove(i);
        if (z) {
            mo45969q2().mo45987o0(i);
        }
    }

    /* renamed from: N2 */
    public void mo45956N2() {
        if (!this.f16854n) {
            this.f16854n = true;
            if (!this.f16848h && this.f16846f <= 1 && this.f16845e.isEmpty()) {
                mo45950G2(C10932b.f16860b);
                m23502H2();
            }
            m23503V2();
            C11658g gVar = this.f16857q;
            if (gVar != null) {
                int i = this.f16843c;
                gVar.mo47903a(this, (this.f16846f - 1) * i, i);
            }
        }
    }

    /* renamed from: O2 */
    public void mo45957O2(C11658g gVar) {
        if (gVar != null) {
            this.f16857q = gVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: P2 */
    public void mo45958P2(C11654c cVar) {
        if (cVar != null) {
            this.f16844d = cVar;
            mo45969q2().mo45989s(cVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: Q2 */
    public void mo45959Q2(boolean z) {
        this.f16852l = z;
        m23503V2();
    }

    /* renamed from: R2 */
    public void mo45960R2(boolean z) {
        if (z != mo45945B2()) {
            mo45969q2().setListViewEnabled(z);
            boolean z2 = true;
            if (!z) {
                if (this.f16849i == C10933c.REFRESHING) {
                    z2 = false;
                }
                this.f16853m = z2;
                m23504W2(C10933c.NOT_READY);
            } else if (!this.f16853m || this.f16848h || this.f16846f > 1 || !this.f16845e.isEmpty()) {
                if (!this.f16845e.isEmpty()) {
                    mo45950G2(C10932b.f16860b);
                }
                m23504W2(C10933c.NEUTRAL);
            } else {
                mo45956N2();
            }
        }
    }

    /* renamed from: S2 */
    public void mo45961S2(int i) {
        this.f16858r = Math.max(i, 1);
    }

    /* renamed from: T2 */
    public void mo45962T2() {
        mo45969q2().mo45983c2();
    }

    /* renamed from: U2 */
    public void mo45963U2() {
        C10932b bVar = this.f16856p;
        if (bVar != null) {
            this.f16850j = bVar;
            this.f16856p = null;
        }
        if (this.f16849i != C10933c.NEUTRAL || this.f16850j == C10932b.f16860b) {
            mo45969q2().mo45979V(this.f16858r);
        } else {
            mo45969q2().setLazyLoadingRowVisible(false);
            if (!this.f16845e.isEmpty()) {
                mo45969q2().mo45985e1(mo45972t2());
            } else {
                mo45969q2().mo45979V(1);
            }
        }
        mo45969q2().mo45982a1(this.f16850j);
    }

    /* renamed from: l2 */
    public boolean mo45964l2(Collection<Object> collection, int i) {
        return mo45965m2(collection, i, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00be  */
    /* renamed from: m2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo45965m2(java.util.Collection<java.lang.Object> r7, int r8, int r9) {
        /*
            r6 = this;
            bd.c r0 = r6.f16849i
            bd.c r1 = p311bd.C10933c.NOT_READY
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x000d
            if (r8 > 0) goto L_0x000c
            r6.f16853m = r3
        L_0x000c:
            return r2
        L_0x000d:
            if (r8 >= 0) goto L_0x0010
            r8 = r2
        L_0x0010:
            if (r9 >= 0) goto L_0x0013
            r9 = r2
        L_0x0013:
            int r1 = r6.f16843c
            int r1 = r8 / r1
            int r1 = r1 + r3
            bd.c r4 = p311bd.C10933c.REFRESHING
            if (r0 != r4) goto L_0x0024
            if (r1 <= r3) goto L_0x0037
            bd.c r7 = p311bd.C10933c.NEUTRAL
            r6.m23504W2(r7)
            return r2
        L_0x0024:
            bd.c r5 = p311bd.C10933c.LAZY_LOADING
            if (r0 != r5) goto L_0x0037
            int r0 = r6.f16846f
            if (r1 == r0) goto L_0x0032
            bd.c r7 = p311bd.C10933c.NEUTRAL
            r6.m23504W2(r7)
            return r2
        L_0x0032:
            int r0 = r0 + r3
            r6.f16846f = r0
            r0 = r3
            goto L_0x0038
        L_0x0037:
            r0 = r2
        L_0x0038:
            if (r7 != 0) goto L_0x004a
            r6.f16848h = r3
            bd.b r7 = r6.f16856p
            if (r7 == 0) goto L_0x0044
            bd.b r0 = p311bd.C10932b.f16860b
            if (r7 != r0) goto L_0x0085
        L_0x0044:
            bd.b r7 = p311bd.C10932b.f16861c
            r6.mo45950G2(r7)
            goto L_0x0085
        L_0x004a:
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L_0x006e
            r6.f16848h = r3
            bd.b r7 = r6.f16856p
            if (r7 == 0) goto L_0x005a
            bd.b r0 = p311bd.C10932b.f16860b
            if (r7 != r0) goto L_0x0085
        L_0x005a:
            java.util.List<java.lang.Object> r7 = r6.f16845e
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0068
            bd.b r7 = p311bd.C10932b.f16862d
            r6.mo45950G2(r7)
            goto L_0x0085
        L_0x0068:
            bd.b r7 = p311bd.C10932b.f16860b
            r6.mo45950G2(r7)
            goto L_0x0085
        L_0x006e:
            bd.c r1 = r6.f16849i
            if (r1 != r4) goto L_0x0075
            r6.mo45951I2()
        L_0x0075:
            r6.mo45967o2(r7, r3)
            if (r0 != 0) goto L_0x007f
            int r7 = r6.f16846f
            int r7 = r7 + r3
            r6.f16846f = r7
        L_0x007f:
            bd.b r7 = p311bd.C10932b.f16860b
            r6.mo45950G2(r7)
            r2 = r3
        L_0x0085:
            int r7 = r6.f16847g
            if (r7 <= 0) goto L_0x0094
            java.util.List<java.lang.Object> r7 = r6.f16845e
            int r7 = r7.size()
            if (r9 < r7) goto L_0x00a0
            r6.f16847g = r9
            goto L_0x00a0
        L_0x0094:
            java.util.List<java.lang.Object> r7 = r6.f16845e
            int r7 = r7.size()
            int r7 = java.lang.Math.max(r9, r7)
            r6.f16847g = r7
        L_0x00a0:
            int r7 = r6.f16847g
            if (r7 <= 0) goto L_0x00b5
            int r9 = r6.f16843c
            int r8 = r8 + r9
            if (r8 >= r7) goto L_0x00b3
            java.util.List<java.lang.Object> r7 = r6.f16845e
            int r7 = r7.size()
            int r8 = r6.f16847g
            if (r7 < r8) goto L_0x00b5
        L_0x00b3:
            r6.f16848h = r3
        L_0x00b5:
            bd.c r7 = p311bd.C10933c.NEUTRAL
            r6.m23504W2(r7)
            boolean r7 = r6.f16852l
            if (r7 == 0) goto L_0x00c5
            bd.d r7 = r6.mo45969q2()
            r7.setSwipeRefreshLayoutEnabled(r3)
        L_0x00c5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p311bd.C10930a.mo45965m2(java.util.Collection, int, int):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public void mo45966n2(Object obj, int i, boolean z) {
        this.f16845e.add(i, obj);
        if (z) {
            mo45969q2().mo45997z1(obj, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public void mo45967o2(Collection<Object> collection, boolean z) {
        this.f16845e.addAll(collection);
        if (z) {
            mo45969q2().mo45980V1(collection);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public void mo45968p2(boolean z) {
        this.f16845e.clear();
        if (z) {
            mo45969q2().mo45981X0();
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: q2 */
    public C10934d mo45969q2() {
        return (C10934d) this.f16655b;
    }

    /* renamed from: r2 */
    public void mo45970r2(int i) {
        mo45964l2((Collection<Object>) null, i);
    }

    /* renamed from: s2 */
    public C10932b mo45971s2() {
        return this.f16850j;
    }

    /* renamed from: t2 */
    public String mo45972t2() {
        String defaultErrorString = mo45969q2().getDefaultErrorString();
        C11654c cVar = this.f16844d;
        if (cVar != null) {
            return cVar.mo47899a(this.f16850j, defaultErrorString);
        }
        return defaultErrorString;
    }

    /* renamed from: u2 */
    public C10933c mo45973u2() {
        return this.f16849i;
    }

    /* renamed from: v2 */
    public Object mo45974v2(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i < this.f16845e.size()) {
            return this.f16845e.get(i);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: w2 */
    public List<Object> mo45975w2() {
        return new ArrayList(this.f16845e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public boolean mo45976x2() {
        if (this.f16849i == C10933c.LAZY_LOADING) {
            return true;
        }
        return false;
    }

    /* renamed from: y2 */
    public int mo45977y2() {
        return this.f16845e.size();
    }

    /* renamed from: z2 */
    public int mo45978z2() {
        return this.f16858r;
    }
}
