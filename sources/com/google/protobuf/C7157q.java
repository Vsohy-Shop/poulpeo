package com.google.protobuf;

import com.google.protobuf.C7160q1;
import com.google.protobuf.C7186x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.q */
/* compiled from: ExtensionSchemaLite */
final class C7157q extends C7148p<C7186x.C7190d> {

    /* renamed from: com.google.protobuf.q$a */
    /* compiled from: ExtensionSchemaLite */
    static /* synthetic */ class C7158a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9694a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.q1$b[] r0 = com.google.protobuf.C7160q1.C7162b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9694a = r0
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9694a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9694a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9694a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9694a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f9694a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f9694a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f9694a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f9694a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f9694a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f9694a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f9694a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f9694a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f9694a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f9694a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f9694a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f9694a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f9694a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7157q.C7158a.<clinit>():void");
        }
    }

    C7157q() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo40615a(Map.Entry<?, ?> entry) {
        return ((C7186x.C7190d) entry.getKey()).mo40660y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object mo40616b(C7139o oVar, C7149p0 p0Var, int i) {
        return oVar.mo40591a(p0Var, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C7174t<C7186x.C7190d> mo40617c(Object obj) {
        return ((C7186x.C7189c) obj).extensions;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C7174t<C7186x.C7190d> mo40618d(Object obj) {
        return ((C7186x.C7189c) obj).mo40703I();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo40619e(C7149p0 p0Var) {
        return p0Var instanceof C7186x.C7189c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo40620f(Object obj) {
        mo40617c(obj).mo40653t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public <UT, UB> UB mo40621g(C7071d1 d1Var, Object obj, C7139o oVar, C7174t<C7186x.C7190d> tVar, UB ub, C7127k1<UT, UB> k1Var) {
        Object obj2;
        Object i;
        ArrayList arrayList;
        C7186x.C7191e eVar = (C7186x.C7191e) obj;
        int c = eVar.mo40709c();
        if (!eVar.f9848b.mo40661z() || !eVar.f9848b.mo40659c0()) {
            if (eVar.mo40707a() != C7160q1.C7162b.ENUM) {
                switch (C7158a.f9694a[eVar.mo40707a().ordinal()]) {
                    case 1:
                        obj2 = Double.valueOf(d1Var.readDouble());
                        break;
                    case 2:
                        obj2 = Float.valueOf(d1Var.readFloat());
                        break;
                    case 3:
                        obj2 = Long.valueOf(d1Var.mo40239M());
                        break;
                    case 4:
                        obj2 = Long.valueOf(d1Var.mo40243b());
                        break;
                    case 5:
                        obj2 = Integer.valueOf(d1Var.mo40234H());
                        break;
                    case 6:
                        obj2 = Long.valueOf(d1Var.mo40244c());
                        break;
                    case 7:
                        obj2 = Integer.valueOf(d1Var.mo40251i());
                        break;
                    case 8:
                        obj2 = Boolean.valueOf(d1Var.mo40252j());
                        break;
                    case 9:
                        obj2 = Integer.valueOf(d1Var.mo40257o());
                        break;
                    case 10:
                        obj2 = Integer.valueOf(d1Var.mo40236J());
                        break;
                    case 11:
                        obj2 = Long.valueOf(d1Var.mo40254l());
                        break;
                    case 12:
                        obj2 = Integer.valueOf(d1Var.mo40266v());
                        break;
                    case 13:
                        obj2 = Long.valueOf(d1Var.mo40267w());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj2 = d1Var.mo40232F();
                        break;
                    case 16:
                        obj2 = d1Var.mo40269y();
                        break;
                    case 17:
                        obj2 = d1Var.mo40270z(eVar.mo40708b().getClass(), oVar);
                        break;
                    case 18:
                        obj2 = d1Var.mo40250h(eVar.mo40708b().getClass(), oVar);
                        break;
                    default:
                        obj2 = null;
                        break;
                }
            } else {
                int H = d1Var.mo40234H();
                if (eVar.f9848b.mo40705b().mo40728a(H) == null) {
                    return C7085g1.m13007L(c, H, ub, k1Var);
                }
                obj2 = Integer.valueOf(H);
            }
            if (eVar.mo40710d()) {
                tVar.mo40640a(eVar.f9848b, obj2);
            } else {
                int i2 = C7158a.f9694a[eVar.mo40707a().ordinal()];
                if ((i2 == 17 || i2 == 18) && (i = tVar.mo40646i(eVar.f9848b)) != null) {
                    obj2 = C7196z.m13951h(i, obj2);
                }
                tVar.mo40655x(eVar.f9848b, obj2);
            }
        } else {
            switch (C7158a.f9694a[eVar.mo40707a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    d1Var.mo40238L(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    d1Var.mo40233G(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    d1Var.mo40258p(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    d1Var.mo40255m(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    d1Var.mo40260r(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    d1Var.mo40241O(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    d1Var.mo40265u(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    d1Var.mo40268x(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    d1Var.mo40248g(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    d1Var.mo40245d(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    d1Var.mo40259q(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    d1Var.mo40242a(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    d1Var.mo40246e(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    d1Var.mo40263s(arrayList);
                    ub = C7085g1.m13052z(c, arrayList, eVar.f9848b.mo40705b(), ub, k1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f9848b.mo40656A());
            }
            tVar.mo40655x(eVar.f9848b, arrayList);
        }
        return ub;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo40622h(C7071d1 d1Var, Object obj, C7139o oVar, C7174t<C7186x.C7190d> tVar) {
        C7186x.C7191e eVar = (C7186x.C7191e) obj;
        tVar.mo40655x(eVar.f9848b, d1Var.mo40250h(eVar.mo40708b().getClass(), oVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo40623i(C7086h hVar, Object obj, C7139o oVar, C7174t<C7186x.C7190d> tVar) {
        C7186x.C7191e eVar = (C7186x.C7191e) obj;
        C7149p0 Q = eVar.mo40708b().mo40628h().mo40630Q();
        C7072e P = C7072e.m12876P(ByteBuffer.wrap(hVar.mo40323I()), true);
        C7059a1.m12782a().mo40160b(Q, P, oVar);
        tVar.mo40655x(eVar.f9848b, Q);
        if (P.mo40227A() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.m12752b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo40624j(C7170r1 r1Var, Map.Entry<?, ?> entry) {
        C7186x.C7190d dVar = (C7186x.C7190d) entry.getKey();
        if (dVar.mo40661z()) {
            switch (C7158a.f9694a[dVar.mo40656A().ordinal()]) {
                case 1:
                    C7085g1.m13011P(dVar.mo40660y(), (List) entry.getValue(), r1Var, dVar.mo40659c0());
                    return;
                case 2:
                    C7085g1.m13015T(dVar.mo40660y(), (List) entry.getValue(), r1Var, dVar.mo40659c0());
                    return;
                case 3:
                    C7085g1.m13018W(dVar.mo40660y(), (List) entry.getValue(), r1Var, dVar.mo40659c0());
                    return;
                case 4:
                    C7085g1.m13031e0(dVar.mo40660y(), (List) entry.getValue(), r1Var, dVar.mo40659c0());
                    return;
                case 5:
                    C7085g1.m13017V(dVar.mo40660y(), (List) entry.getValue(), r1Var, dVar.mo40659c0());
                    return;
                case 6:
                    C7085g1.m13014S(dVar.mo40660y(), (List) entry.getValue(), r1Var, dVar.mo40659c0());
                    return;
                case 7:
                    C7085g1.m13013R(dVar.mo40660y(), (List) entry.getValue(), r1Var, dVar.mo40659c0());
                    return;
                case 8:
                    C7085g1.m13009N(dVar.mo40660y(), (List) entry.getValue(), r1Var, dVar.mo40659c0());
                    return;
                case 9:
                    C7085g1.m13029d0(dVar.mo40660y(), (List) entry.getValue(), r1Var, dVar.mo40659c0());
                    return;
                case 10:
                    C7085g1.m13020Y(dVar.mo40660y(), (List) entry.getValue(), r1Var, dVar.mo40659c0());
                    return;
                case 11:
                    C7085g1.m13021Z(dVar.mo40660y(), (List) entry.getValue(), r1Var, dVar.mo40659c0());
                    return;
                case 12:
                    C7085g1.m13023a0(dVar.mo40660y(), (List) entry.getValue(), r1Var, dVar.mo40659c0());
                    return;
                case 13:
                    C7085g1.m13025b0(dVar.mo40660y(), (List) entry.getValue(), r1Var, dVar.mo40659c0());
                    return;
                case 14:
                    C7085g1.m13017V(dVar.mo40660y(), (List) entry.getValue(), r1Var, dVar.mo40659c0());
                    return;
                case 15:
                    C7085g1.m13010O(dVar.mo40660y(), (List) entry.getValue(), r1Var);
                    return;
                case 16:
                    C7085g1.m13027c0(dVar.mo40660y(), (List) entry.getValue(), r1Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        C7085g1.m13016U(dVar.mo40660y(), (List) entry.getValue(), r1Var, C7059a1.m12782a().mo40162d(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        C7085g1.m13019X(dVar.mo40660y(), (List) entry.getValue(), r1Var, C7059a1.m12782a().mo40162d(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (C7158a.f9694a[dVar.mo40656A().ordinal()]) {
                case 1:
                    r1Var.mo40479g(dVar.mo40660y(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    r1Var.mo40464G(dVar.mo40660y(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    r1Var.mo40489q(dVar.mo40660y(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    r1Var.mo40487o(dVar.mo40660y(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    r1Var.mo40495w(dVar.mo40660y(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    r1Var.mo40483k(dVar.mo40660y(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    r1Var.mo40478f(dVar.mo40660y(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    r1Var.mo40490r(dVar.mo40660y(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    r1Var.mo40476d(dVar.mo40660y(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    r1Var.mo40492t(dVar.mo40660y(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    r1Var.mo40498z(dVar.mo40660y(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    r1Var.mo40471N(dVar.mo40660y(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    r1Var.mo40463F(dVar.mo40660y(), ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    r1Var.mo40495w(dVar.mo40660y(), ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    r1Var.mo40494v(dVar.mo40660y(), (C7086h) entry.getValue());
                    return;
                case 16:
                    r1Var.mo40486n(dVar.mo40660y(), (String) entry.getValue());
                    return;
                case 17:
                    r1Var.mo40491s(dVar.mo40660y(), entry.getValue(), C7059a1.m12782a().mo40162d(entry.getValue().getClass()));
                    return;
                case 18:
                    r1Var.mo40482j(dVar.mo40660y(), entry.getValue(), C7059a1.m12782a().mo40162d(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }
}
