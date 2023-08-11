package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.u4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5983u4 extends C6003v8<C5983u4, C5967t4> implements C6068z9 {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final C5983u4 zze;
    private boolean zzA;
    private String zzB = "";
    private long zzC;
    private int zzD;
    private String zzE = "";
    private String zzF = "";
    private boolean zzG;
    /* access modifiers changed from: private */
    public C5691c9<C5754g4> zzH = C6003v8.m10154k();
    private String zzI = "";
    private int zzJ;
    private int zzK;
    private int zzL;
    private String zzM = "";
    private long zzN;
    private long zzO;
    private String zzP = "";
    private String zzQ = "";
    private int zzR;
    private String zzS = "";
    private C6047y4 zzT;
    private C5657a9 zzU = C6003v8.m10160s();
    private long zzV;
    private long zzW;
    private String zzX = "";
    private String zzY = "";
    private int zzZ;
    private boolean zzaa;
    private String zzab = "";
    private boolean zzac;
    private C5919q4 zzad;
    private int zzf;
    private int zzg;
    private int zzh;
    /* access modifiers changed from: private */
    public C5691c9<C5822k4> zzi = C6003v8.m10154k();
    private C5691c9<C5721e5> zzj = C6003v8.m10154k();
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private int zzt;
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private long zzx;
    private long zzy;
    private String zzz = "";

    static {
        C5983u4 u4Var = new C5983u4();
        zze = u4Var;
        C6003v8.m10158o(C5983u4.class, u4Var);
    }

    private C5983u4() {
    }

    /* renamed from: B0 */
    static /* synthetic */ void m10004B0(C5983u4 u4Var, String str) {
        str.getClass();
        u4Var.zzg |= 64;
        u4Var.zzX = str;
    }

    /* renamed from: C0 */
    static /* synthetic */ void m10005C0(C5983u4 u4Var, String str) {
        u4Var.zzg |= 128;
        u4Var.zzY = str;
    }

    /* renamed from: D0 */
    static /* synthetic */ void m10006D0(C5983u4 u4Var, Iterable iterable) {
        u4Var.m10044c1();
        C5757g7.m9283h(iterable, u4Var.zzi);
    }

    /* renamed from: F0 */
    static /* synthetic */ void m10008F0(C5983u4 u4Var, int i) {
        u4Var.m10044c1();
        u4Var.zzi.remove(i);
    }

    /* renamed from: G0 */
    static /* synthetic */ void m10009G0(C5983u4 u4Var, int i, C5721e5 e5Var) {
        e5Var.getClass();
        u4Var.m10046d1();
        u4Var.zzj.set(i, e5Var);
    }

    /* renamed from: H0 */
    static /* synthetic */ void m10010H0(C5983u4 u4Var, C5721e5 e5Var) {
        e5Var.getClass();
        u4Var.m10046d1();
        u4Var.zzj.add(e5Var);
    }

    /* renamed from: I0 */
    static /* synthetic */ void m10011I0(C5983u4 u4Var, Iterable iterable) {
        u4Var.m10046d1();
        C5757g7.m9283h(iterable, u4Var.zzj);
    }

    /* renamed from: J0 */
    static /* synthetic */ void m10012J0(C5983u4 u4Var, int i) {
        u4Var.m10046d1();
        u4Var.zzj.remove(i);
    }

    /* renamed from: J1 */
    public static C5967t4 m10013J1() {
        return (C5967t4) zze.mo34556p();
    }

    /* renamed from: K0 */
    static /* synthetic */ void m10014K0(C5983u4 u4Var, long j) {
        u4Var.zzf |= 2;
        u4Var.zzk = j;
    }

    /* renamed from: L0 */
    static /* synthetic */ void m10016L0(C5983u4 u4Var, long j) {
        u4Var.zzf |= 4;
        u4Var.zzl = j;
    }

    /* renamed from: M0 */
    static /* synthetic */ void m10017M0(C5983u4 u4Var, long j) {
        u4Var.zzf |= 8;
        u4Var.zzm = j;
    }

    /* renamed from: N0 */
    static /* synthetic */ void m10018N0(C5983u4 u4Var, long j) {
        u4Var.zzf |= 16;
        u4Var.zzn = j;
    }

    /* renamed from: O */
    static /* synthetic */ void m10019O(C5983u4 u4Var, long j) {
        u4Var.zzf |= BasicMeasure.EXACTLY;
        u4Var.zzO = j;
    }

    /* renamed from: O0 */
    static /* synthetic */ void m10020O0(C5983u4 u4Var) {
        u4Var.zzf &= -17;
        u4Var.zzn = 0;
    }

    /* renamed from: P */
    static /* synthetic */ void m10021P(C5983u4 u4Var) {
        u4Var.zzf &= Integer.MAX_VALUE;
        u4Var.zzP = zze.zzP;
    }

    /* renamed from: P0 */
    static /* synthetic */ void m10022P0(C5983u4 u4Var, long j) {
        u4Var.zzf |= 32;
        u4Var.zzo = j;
    }

    /* renamed from: Q */
    static /* synthetic */ void m10023Q(C5983u4 u4Var, int i) {
        u4Var.zzg |= 2;
        u4Var.zzR = i;
    }

    /* renamed from: Q0 */
    static /* synthetic */ void m10024Q0(C5983u4 u4Var) {
        u4Var.zzf &= -33;
        u4Var.zzo = 0;
    }

    /* renamed from: R0 */
    static /* synthetic */ void m10025R0(C5983u4 u4Var, String str) {
        u4Var.zzf |= 64;
        u4Var.zzp = SystemMediaRouteProvider.PACKAGE_NAME;
    }

    /* renamed from: S */
    static /* synthetic */ void m10026S(C5983u4 u4Var, int i, C5822k4 k4Var) {
        k4Var.getClass();
        u4Var.m10044c1();
        u4Var.zzi.set(i, k4Var);
    }

    /* renamed from: S0 */
    static /* synthetic */ void m10027S0(C5983u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 128;
        u4Var.zzq = str;
    }

    /* renamed from: T */
    static /* synthetic */ void m10028T(C5983u4 u4Var, String str) {
        str.getClass();
        u4Var.zzg |= 4;
        u4Var.zzS = str;
    }

    /* renamed from: T0 */
    static /* synthetic */ void m10029T0(C5983u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 256;
        u4Var.zzr = str;
    }

    /* renamed from: U */
    static /* synthetic */ void m10030U(C5983u4 u4Var, C6047y4 y4Var) {
        y4Var.getClass();
        u4Var.zzT = y4Var;
        u4Var.zzg |= 8;
    }

    /* renamed from: U0 */
    static /* synthetic */ void m10031U0(C5983u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 512;
        u4Var.zzs = str;
    }

    /* renamed from: V0 */
    static /* synthetic */ void m10032V0(C5983u4 u4Var, int i) {
        u4Var.zzf |= 1024;
        u4Var.zzt = i;
    }

    /* renamed from: W */
    static /* synthetic */ void m10033W(C5983u4 u4Var, Iterable iterable) {
        int i;
        C5657a9 a9Var = u4Var.zzU;
        if (!a9Var.mo33774x()) {
            int size = a9Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            u4Var.zzU = a9Var.mo33660a(i);
        }
        C5757g7.m9283h(iterable, u4Var.zzU);
    }

    /* renamed from: W0 */
    static /* synthetic */ void m10034W0(C5983u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 2048;
        u4Var.zzu = str;
    }

    /* renamed from: X */
    static /* synthetic */ void m10035X(C5983u4 u4Var, C5822k4 k4Var) {
        k4Var.getClass();
        u4Var.m10044c1();
        u4Var.zzi.add(k4Var);
    }

    /* renamed from: X0 */
    static /* synthetic */ void m10036X0(C5983u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 4096;
        u4Var.zzv = str;
    }

    /* renamed from: Y */
    static /* synthetic */ void m10037Y(C5983u4 u4Var, long j) {
        u4Var.zzg |= 16;
        u4Var.zzV = j;
    }

    /* renamed from: Y0 */
    static /* synthetic */ void m10038Y0(C5983u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 8192;
        u4Var.zzw = str;
    }

    /* renamed from: Z */
    static /* synthetic */ void m10039Z(C5983u4 u4Var, long j) {
        u4Var.zzg |= 32;
        u4Var.zzW = j;
    }

    /* renamed from: Z0 */
    static /* synthetic */ void m10040Z0(C5983u4 u4Var, long j) {
        u4Var.zzf |= 16384;
        u4Var.zzx = j;
    }

    /* renamed from: a1 */
    static /* synthetic */ void m10041a1(C5983u4 u4Var, long j) {
        u4Var.zzf |= 32768;
        u4Var.zzy = 46000;
    }

    /* renamed from: b0 */
    static /* synthetic */ void m10042b0(C5983u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 65536;
        u4Var.zzz = str;
    }

    /* renamed from: c0 */
    static /* synthetic */ void m10043c0(C5983u4 u4Var) {
        u4Var.zzf &= -65537;
        u4Var.zzz = zze.zzz;
    }

    /* renamed from: c1 */
    private final void m10044c1() {
        C5691c9<C5822k4> c9Var = this.zzi;
        if (!c9Var.mo33774x()) {
            this.zzi = C6003v8.m10155l(c9Var);
        }
    }

    /* renamed from: d0 */
    static /* synthetic */ void m10045d0(C5983u4 u4Var, boolean z) {
        u4Var.zzf |= 131072;
        u4Var.zzA = z;
    }

    /* renamed from: d1 */
    private final void m10046d1() {
        C5691c9<C5721e5> c9Var = this.zzj;
        if (!c9Var.mo33774x()) {
            this.zzj = C6003v8.m10155l(c9Var);
        }
    }

    /* renamed from: e0 */
    static /* synthetic */ void m10047e0(C5983u4 u4Var) {
        u4Var.zzf &= -131073;
        u4Var.zzA = false;
    }

    /* renamed from: f0 */
    static /* synthetic */ void m10048f0(C5983u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 262144;
        u4Var.zzB = str;
    }

    /* renamed from: g0 */
    static /* synthetic */ void m10049g0(C5983u4 u4Var) {
        u4Var.zzf &= -262145;
        u4Var.zzB = zze.zzB;
    }

    /* renamed from: h0 */
    static /* synthetic */ void m10050h0(C5983u4 u4Var, long j) {
        u4Var.zzf |= 524288;
        u4Var.zzC = j;
    }

    /* renamed from: i0 */
    static /* synthetic */ void m10051i0(C5983u4 u4Var, int i) {
        u4Var.zzf |= 1048576;
        u4Var.zzD = i;
    }

    /* renamed from: j0 */
    static /* synthetic */ void m10052j0(C5983u4 u4Var, String str) {
        u4Var.zzf |= 2097152;
        u4Var.zzE = str;
    }

    /* renamed from: k0 */
    static /* synthetic */ void m10053k0(C5983u4 u4Var) {
        u4Var.zzf &= -2097153;
        u4Var.zzE = zze.zzE;
    }

    /* renamed from: l0 */
    static /* synthetic */ void m10054l0(C5983u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 4194304;
        u4Var.zzF = str;
    }

    /* renamed from: m0 */
    static /* synthetic */ void m10055m0(C5983u4 u4Var, boolean z) {
        u4Var.zzf |= 8388608;
        u4Var.zzG = z;
    }

    /* renamed from: n0 */
    static /* synthetic */ void m10056n0(C5983u4 u4Var, Iterable iterable) {
        C5691c9<C5754g4> c9Var = u4Var.zzH;
        if (!c9Var.mo33774x()) {
            u4Var.zzH = C6003v8.m10155l(c9Var);
        }
        C5757g7.m9283h(iterable, u4Var.zzH);
    }

    /* renamed from: p0 */
    static /* synthetic */ void m10058p0(C5983u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 16777216;
        u4Var.zzI = str;
    }

    /* renamed from: q0 */
    static /* synthetic */ void m10059q0(C5983u4 u4Var, int i) {
        u4Var.zzf |= 33554432;
        u4Var.zzJ = i;
    }

    /* renamed from: r0 */
    static /* synthetic */ void m10060r0(C5983u4 u4Var, int i) {
        u4Var.zzf |= 1;
        u4Var.zzh = 1;
    }

    /* renamed from: s0 */
    static /* synthetic */ void m10061s0(C5983u4 u4Var) {
        u4Var.zzf &= -268435457;
        u4Var.zzM = zze.zzM;
    }

    /* renamed from: t0 */
    static /* synthetic */ void m10062t0(C5983u4 u4Var, long j) {
        u4Var.zzf |= 536870912;
        u4Var.zzN = j;
    }

    /* renamed from: A0 */
    public final boolean mo34471A0() {
        if ((this.zzg & 128) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: A1 */
    public final long mo34472A1() {
        return this.zzV;
    }

    /* renamed from: B */
    public final String mo34473B() {
        return this.zzP;
    }

    /* renamed from: B1 */
    public final long mo34474B1() {
        return this.zzm;
    }

    /* renamed from: C */
    public final String mo34475C() {
        return this.zzI;
    }

    /* renamed from: C1 */
    public final long mo34476C1() {
        return this.zzx;
    }

    /* renamed from: D */
    public final String mo34477D() {
        return this.zzX;
    }

    /* renamed from: D1 */
    public final long mo34478D1() {
        return this.zzo;
    }

    /* renamed from: E */
    public final String mo34479E() {
        return this.zzF;
    }

    /* renamed from: E1 */
    public final long mo34480E1() {
        return this.zzn;
    }

    /* renamed from: F */
    public final String mo34481F() {
        return this.zzE;
    }

    /* renamed from: F1 */
    public final long mo34482F1() {
        return this.zzl;
    }

    /* renamed from: G1 */
    public final long mo34483G1() {
        return this.zzk;
    }

    /* renamed from: H */
    public final String mo34484H() {
        return this.zzq;
    }

    /* renamed from: H1 */
    public final long mo34485H1() {
        return this.zzy;
    }

    /* renamed from: I */
    public final String mo34486I() {
        return this.zzp;
    }

    /* renamed from: I1 */
    public final C5822k4 mo34487I1(int i) {
        return this.zzi.get(i);
    }

    /* renamed from: J */
    public final String mo34488J() {
        return this.zzz;
    }

    /* renamed from: K */
    public final String mo34489K() {
        return this.zzs;
    }

    /* renamed from: L */
    public final List<C5754g4> mo34490L() {
        return this.zzH;
    }

    /* renamed from: L1 */
    public final C5721e5 mo34491L1(int i) {
        return this.zzj.get(i);
    }

    /* renamed from: M */
    public final List<C5822k4> mo34492M() {
        return this.zzi;
    }

    /* renamed from: M1 */
    public final String mo34493M1() {
        return this.zzS;
    }

    /* renamed from: N */
    public final List<C5721e5> mo34494N() {
        return this.zzj;
    }

    /* renamed from: N1 */
    public final String mo34495N1() {
        return this.zzv;
    }

    /* renamed from: O1 */
    public final String mo34496O1() {
        return this.zzB;
    }

    /* renamed from: a0 */
    public final int mo34497a0() {
        return this.zzJ;
    }

    /* renamed from: b1 */
    public final int mo34498b1() {
        return this.zzD;
    }

    /* renamed from: e1 */
    public final boolean mo34499e1() {
        if ((this.zzf & 524288) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f1 */
    public final boolean mo34500f1() {
        if ((this.zzg & 16) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g1 */
    public final boolean mo34501g1() {
        if ((this.zzf & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h1 */
    public final boolean mo34502h1() {
        if ((this.zzf & 16384) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i1 */
    public final boolean mo34503i1() {
        if ((this.zzf & 131072) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j1 */
    public final boolean mo34504j1() {
        if ((this.zzf & 32) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k1 */
    public final boolean mo34505k1() {
        if ((this.zzf & 16) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l1 */
    public final boolean mo34506l1() {
        if ((this.zzf & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m1 */
    public final boolean mo34507m1() {
        if ((this.zzg & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n1 */
    public final boolean mo34508n1() {
        if ((this.zzf & 8388608) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o1 */
    public final boolean mo34509o1() {
        if ((this.zzf & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p1 */
    public final boolean mo34510p1() {
        if ((this.zzf & 1024) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q1 */
    public final boolean mo34511q1() {
        if ((this.zzf & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r1 */
    public final boolean mo34512r1() {
        if ((this.zzf & 32768) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s1 */
    public final int mo34513s1() {
        return this.zzi.size();
    }

    /* renamed from: t1 */
    public final int mo34514t1() {
        return this.zzh;
    }

    /* renamed from: u0 */
    public final boolean mo34515u0() {
        return this.zzA;
    }

    /* renamed from: u1 */
    public final int mo34516u1() {
        return this.zzR;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo33646v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6003v8.m10157n(zze, "\u00011\u0000\u0002\u0001;1\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,", new Object[]{"zzf", "zzg", "zzh", "zzi", C5822k4.class, "zzj", C5721e5.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", C5754g4.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", C5686c4.f6822a, "zzaa", "zzab", "zzac", "zzad"});
        } else if (i2 == 3) {
            return new C5983u4();
        } else {
            if (i2 == 4) {
                return new C5967t4((C5669b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }

    /* renamed from: v0 */
    public final boolean mo34517v0() {
        return this.zzG;
    }

    /* renamed from: v1 */
    public final int mo34518v1() {
        return this.zzt;
    }

    /* renamed from: w */
    public final String mo34519w() {
        return this.zzu;
    }

    /* renamed from: w0 */
    public final boolean mo34520w0() {
        if ((this.zzf & BasicMeasure.EXACTLY) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: w1 */
    public final int mo34521w1() {
        return this.zzj.size();
    }

    /* renamed from: x */
    public final String mo34522x() {
        return this.zzw;
    }

    /* renamed from: x0 */
    public final boolean mo34523x0() {
        if ((this.zzf & 33554432) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x1 */
    public final long mo34524x1() {
        return this.zzO;
    }

    /* renamed from: y */
    public final String mo34525y() {
        return this.zzY;
    }

    /* renamed from: y0 */
    public final boolean mo34526y0() {
        if ((this.zzf & 1048576) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: y1 */
    public final long mo34527y1() {
        return this.zzN;
    }

    /* renamed from: z */
    public final String mo34528z() {
        return this.zzr;
    }

    /* renamed from: z0 */
    public final boolean mo34529z0() {
        if ((this.zzf & 536870912) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z1 */
    public final long mo34530z1() {
        return this.zzC;
    }
}
