package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.u4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6306u4 {

    /* renamed from: A */
    private long f8260A;

    /* renamed from: B */
    private long f8261B;
    @Nullable

    /* renamed from: C */
    private String f8262C;

    /* renamed from: D */
    private boolean f8263D;

    /* renamed from: E */
    private long f8264E;

    /* renamed from: F */
    private long f8265F;

    /* renamed from: a */
    private final C6251p4 f8266a;

    /* renamed from: b */
    private final String f8267b;
    @Nullable

    /* renamed from: c */
    private String f8268c;
    @Nullable

    /* renamed from: d */
    private String f8269d;
    @Nullable

    /* renamed from: e */
    private String f8270e;
    @Nullable

    /* renamed from: f */
    private String f8271f;

    /* renamed from: g */
    private long f8272g;

    /* renamed from: h */
    private long f8273h;

    /* renamed from: i */
    private long f8274i;
    @Nullable

    /* renamed from: j */
    private String f8275j;

    /* renamed from: k */
    private long f8276k;
    @Nullable

    /* renamed from: l */
    private String f8277l;

    /* renamed from: m */
    private long f8278m;

    /* renamed from: n */
    private long f8279n;

    /* renamed from: o */
    private boolean f8280o;

    /* renamed from: p */
    private long f8281p;

    /* renamed from: q */
    private boolean f8282q;
    @Nullable

    /* renamed from: r */
    private String f8283r;
    @Nullable

    /* renamed from: s */
    private Boolean f8284s;

    /* renamed from: t */
    private long f8285t;
    @Nullable

    /* renamed from: u */
    private List<String> f8286u;
    @Nullable

    /* renamed from: v */
    private String f8287v;

    /* renamed from: w */
    private long f8288w;

    /* renamed from: x */
    private long f8289x;

    /* renamed from: y */
    private long f8290y;

    /* renamed from: z */
    private long f8291z;

    @WorkerThread
    C6306u4(C6251p4 p4Var, String str) {
        C9713p.m20275j(p4Var);
        C9713p.m20271f(str);
        this.f8266a = p4Var;
        this.f8267b = str;
        p4Var.mo34919a().mo34778h();
    }

    @WorkerThread
    /* renamed from: A */
    public final long mo35314A() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8281p;
    }

    @WorkerThread
    /* renamed from: B */
    public final void mo35315B(@Nullable String str) {
        this.f8266a.mo34919a().mo34778h();
        this.f8263D |= !C6234n9.m10925Z(this.f8262C, str);
        this.f8262C = str;
    }

    @WorkerThread
    /* renamed from: C */
    public final void mo35316C(long j) {
        boolean z;
        this.f8266a.mo34919a().mo34778h();
        boolean z2 = this.f8263D;
        if (this.f8274i != j) {
            z = true;
        } else {
            z = false;
        }
        this.f8263D = z2 | z;
        this.f8274i = j;
    }

    @WorkerThread
    /* renamed from: D */
    public final void mo35317D(long j) {
        boolean z;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        this.f8266a.mo34919a().mo34778h();
        boolean z3 = this.f8263D;
        if (this.f8272g == j) {
            z2 = false;
        }
        this.f8263D = z3 | z2;
        this.f8272g = j;
    }

    @WorkerThread
    /* renamed from: E */
    public final void mo35318E(long j) {
        boolean z;
        this.f8266a.mo34919a().mo34778h();
        boolean z2 = this.f8263D;
        if (this.f8273h != j) {
            z = true;
        } else {
            z = false;
        }
        this.f8263D = z2 | z;
        this.f8273h = j;
    }

    @WorkerThread
    /* renamed from: F */
    public final void mo35319F(boolean z) {
        boolean z2;
        this.f8266a.mo34919a().mo34778h();
        boolean z3 = this.f8263D;
        if (this.f8280o != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f8263D = z3 | z2;
        this.f8280o = z;
    }

    @WorkerThread
    /* renamed from: G */
    public final void mo35320G(@Nullable Boolean bool) {
        boolean z;
        this.f8266a.mo34919a().mo34778h();
        boolean z2 = this.f8263D;
        Boolean bool2 = this.f8284s;
        int i = C6234n9.f8031i;
        if (bool2 == null && bool == null) {
            z = true;
        } else if (bool2 == null) {
            z = false;
        } else {
            z = bool2.equals(bool);
        }
        this.f8263D = z2 | (!z);
        this.f8284s = bool;
    }

    @WorkerThread
    /* renamed from: H */
    public final void mo35321H(@Nullable String str) {
        this.f8266a.mo34919a().mo34778h();
        this.f8263D |= !C6234n9.m10925Z(this.f8270e, str);
        this.f8270e = str;
    }

    @WorkerThread
    /* renamed from: I */
    public final void mo35322I(@Nullable List<String> list) {
        ArrayList arrayList;
        this.f8266a.mo34919a().mo34778h();
        List<String> list2 = this.f8286u;
        int i = C6234n9.f8031i;
        if (list2 != null || list != null) {
            if (list2 == null || !list2.equals(list)) {
                this.f8263D = true;
                if (list != null) {
                    arrayList = new ArrayList(list);
                } else {
                    arrayList = null;
                }
                this.f8286u = arrayList;
            }
        }
    }

    @WorkerThread
    /* renamed from: J */
    public final boolean mo35323J() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8282q;
    }

    @WorkerThread
    /* renamed from: K */
    public final boolean mo35324K() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8280o;
    }

    @WorkerThread
    /* renamed from: L */
    public final boolean mo35325L() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8263D;
    }

    @WorkerThread
    /* renamed from: M */
    public final long mo35326M() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8276k;
    }

    @WorkerThread
    /* renamed from: N */
    public final long mo35327N() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8264E;
    }

    @WorkerThread
    /* renamed from: O */
    public final long mo35328O() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8291z;
    }

    @WorkerThread
    /* renamed from: P */
    public final long mo35329P() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8260A;
    }

    @WorkerThread
    /* renamed from: Q */
    public final long mo35330Q() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8290y;
    }

    @WorkerThread
    /* renamed from: R */
    public final long mo35331R() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8289x;
    }

    @WorkerThread
    /* renamed from: S */
    public final long mo35332S() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8261B;
    }

    @WorkerThread
    /* renamed from: T */
    public final long mo35333T() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8288w;
    }

    @WorkerThread
    /* renamed from: U */
    public final long mo35334U() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8279n;
    }

    @WorkerThread
    /* renamed from: V */
    public final long mo35335V() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8285t;
    }

    @WorkerThread
    /* renamed from: W */
    public final long mo35336W() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8265F;
    }

    @WorkerThread
    /* renamed from: X */
    public final long mo35337X() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8278m;
    }

    @WorkerThread
    /* renamed from: Y */
    public final long mo35338Y() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8274i;
    }

    @WorkerThread
    /* renamed from: Z */
    public final long mo35339Z() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8272g;
    }

    @WorkerThread
    @Nullable
    /* renamed from: a */
    public final String mo35340a() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8262C;
    }

    @WorkerThread
    /* renamed from: a0 */
    public final long mo35341a0() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8273h;
    }

    @WorkerThread
    @Nullable
    /* renamed from: b */
    public final String mo35342b() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8270e;
    }

    @WorkerThread
    @Nullable
    /* renamed from: b0 */
    public final Boolean mo35343b0() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8284s;
    }

    @WorkerThread
    @Nullable
    /* renamed from: c */
    public final List<String> mo35344c() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8286u;
    }

    @WorkerThread
    @Nullable
    /* renamed from: c0 */
    public final String mo35345c0() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8283r;
    }

    @WorkerThread
    /* renamed from: d */
    public final void mo35346d() {
        this.f8266a.mo34919a().mo34778h();
        this.f8263D = false;
    }

    @WorkerThread
    @Nullable
    /* renamed from: d0 */
    public final String mo35347d0() {
        this.f8266a.mo34919a().mo34778h();
        String str = this.f8262C;
        mo35315B((String) null);
        return str;
    }

    @WorkerThread
    /* renamed from: e */
    public final void mo35348e() {
        this.f8266a.mo34919a().mo34778h();
        long j = this.f8272g + 1;
        if (j > 2147483647L) {
            this.f8266a.mo34920b().mo35080w().mo35038b("Bundle index overflow. appId", C6206l3.m10862z(this.f8267b));
            j = 0;
        }
        this.f8263D = true;
        this.f8272g = j;
    }

    @WorkerThread
    /* renamed from: e0 */
    public final String mo35349e0() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8267b;
    }

    @WorkerThread
    /* renamed from: f */
    public final void mo35350f(@Nullable String str) {
        this.f8266a.mo34919a().mo34778h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f8263D |= true ^ C6234n9.m10925Z(this.f8283r, str);
        this.f8283r = str;
    }

    @WorkerThread
    @Nullable
    /* renamed from: f0 */
    public final String mo35351f0() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8268c;
    }

    @WorkerThread
    /* renamed from: g */
    public final void mo35352g(boolean z) {
        boolean z2;
        this.f8266a.mo34919a().mo34778h();
        boolean z3 = this.f8263D;
        if (this.f8282q != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f8263D = z3 | z2;
        this.f8282q = z;
    }

    @WorkerThread
    @Nullable
    /* renamed from: g0 */
    public final String mo35353g0() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8277l;
    }

    @WorkerThread
    /* renamed from: h */
    public final void mo35354h(long j) {
        boolean z;
        this.f8266a.mo34919a().mo34778h();
        boolean z2 = this.f8263D;
        if (this.f8281p != j) {
            z = true;
        } else {
            z = false;
        }
        this.f8263D = z2 | z;
        this.f8281p = j;
    }

    @WorkerThread
    @Nullable
    /* renamed from: h0 */
    public final String mo35355h0() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8275j;
    }

    @WorkerThread
    /* renamed from: i */
    public final void mo35356i(@Nullable String str) {
        this.f8266a.mo34919a().mo34778h();
        this.f8263D |= !C6234n9.m10925Z(this.f8268c, str);
        this.f8268c = str;
    }

    @WorkerThread
    @Nullable
    /* renamed from: i0 */
    public final String mo35357i0() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8271f;
    }

    @WorkerThread
    /* renamed from: j */
    public final void mo35358j(@Nullable String str) {
        this.f8266a.mo34919a().mo34778h();
        this.f8263D |= !C6234n9.m10925Z(this.f8277l, str);
        this.f8277l = str;
    }

    @WorkerThread
    @Nullable
    /* renamed from: j0 */
    public final String mo35359j0() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8287v;
    }

    @WorkerThread
    /* renamed from: k */
    public final void mo35360k(@Nullable String str) {
        this.f8266a.mo34919a().mo34778h();
        this.f8263D |= !C6234n9.m10925Z(this.f8275j, str);
        this.f8275j = str;
    }

    @WorkerThread
    @Nullable
    /* renamed from: k0 */
    public final String mo35361k0() {
        this.f8266a.mo34919a().mo34778h();
        return this.f8269d;
    }

    @WorkerThread
    /* renamed from: l */
    public final void mo35362l(long j) {
        boolean z;
        this.f8266a.mo34919a().mo34778h();
        boolean z2 = this.f8263D;
        if (this.f8276k != j) {
            z = true;
        } else {
            z = false;
        }
        this.f8263D = z2 | z;
        this.f8276k = j;
    }

    @WorkerThread
    /* renamed from: m */
    public final void mo35363m(long j) {
        boolean z;
        this.f8266a.mo34919a().mo34778h();
        boolean z2 = this.f8263D;
        if (this.f8264E != j) {
            z = true;
        } else {
            z = false;
        }
        this.f8263D = z2 | z;
        this.f8264E = j;
    }

    @WorkerThread
    /* renamed from: n */
    public final void mo35364n(long j) {
        boolean z;
        this.f8266a.mo34919a().mo34778h();
        boolean z2 = this.f8263D;
        if (this.f8291z != j) {
            z = true;
        } else {
            z = false;
        }
        this.f8263D = z2 | z;
        this.f8291z = j;
    }

    @WorkerThread
    /* renamed from: o */
    public final void mo35365o(long j) {
        boolean z;
        this.f8266a.mo34919a().mo34778h();
        boolean z2 = this.f8263D;
        if (this.f8260A != j) {
            z = true;
        } else {
            z = false;
        }
        this.f8263D = z2 | z;
        this.f8260A = j;
    }

    @WorkerThread
    /* renamed from: p */
    public final void mo35366p(long j) {
        boolean z;
        this.f8266a.mo34919a().mo34778h();
        boolean z2 = this.f8263D;
        if (this.f8290y != j) {
            z = true;
        } else {
            z = false;
        }
        this.f8263D = z2 | z;
        this.f8290y = j;
    }

    @WorkerThread
    /* renamed from: q */
    public final void mo35367q(long j) {
        boolean z;
        this.f8266a.mo34919a().mo34778h();
        boolean z2 = this.f8263D;
        if (this.f8289x != j) {
            z = true;
        } else {
            z = false;
        }
        this.f8263D = z2 | z;
        this.f8289x = j;
    }

    @WorkerThread
    /* renamed from: r */
    public final void mo35368r(long j) {
        boolean z;
        this.f8266a.mo34919a().mo34778h();
        boolean z2 = this.f8263D;
        if (this.f8261B != j) {
            z = true;
        } else {
            z = false;
        }
        this.f8263D = z2 | z;
        this.f8261B = j;
    }

    @WorkerThread
    /* renamed from: s */
    public final void mo35369s(long j) {
        boolean z;
        this.f8266a.mo34919a().mo34778h();
        boolean z2 = this.f8263D;
        if (this.f8288w != j) {
            z = true;
        } else {
            z = false;
        }
        this.f8263D = z2 | z;
        this.f8288w = j;
    }

    @WorkerThread
    /* renamed from: t */
    public final void mo35370t(long j) {
        boolean z;
        this.f8266a.mo34919a().mo34778h();
        boolean z2 = this.f8263D;
        if (this.f8279n != j) {
            z = true;
        } else {
            z = false;
        }
        this.f8263D = z2 | z;
        this.f8279n = j;
    }

    @WorkerThread
    /* renamed from: u */
    public final void mo35371u(long j) {
        boolean z;
        this.f8266a.mo34919a().mo34778h();
        boolean z2 = this.f8263D;
        if (this.f8285t != j) {
            z = true;
        } else {
            z = false;
        }
        this.f8263D = z2 | z;
        this.f8285t = j;
    }

    @WorkerThread
    /* renamed from: v */
    public final void mo35372v(long j) {
        boolean z;
        this.f8266a.mo34919a().mo34778h();
        boolean z2 = this.f8263D;
        if (this.f8265F != j) {
            z = true;
        } else {
            z = false;
        }
        this.f8263D = z2 | z;
        this.f8265F = j;
    }

    @WorkerThread
    /* renamed from: w */
    public final void mo35373w(@Nullable String str) {
        this.f8266a.mo34919a().mo34778h();
        this.f8263D |= !C6234n9.m10925Z(this.f8271f, str);
        this.f8271f = str;
    }

    @WorkerThread
    /* renamed from: x */
    public final void mo35374x(@Nullable String str) {
        this.f8266a.mo34919a().mo34778h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f8263D |= true ^ C6234n9.m10925Z(this.f8287v, str);
        this.f8287v = str;
    }

    @WorkerThread
    /* renamed from: y */
    public final void mo35375y(@Nullable String str) {
        this.f8266a.mo34919a().mo34778h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f8263D |= true ^ C6234n9.m10925Z(this.f8269d, str);
        this.f8269d = str;
    }

    @WorkerThread
    /* renamed from: z */
    public final void mo35376z(long j) {
        boolean z;
        this.f8266a.mo34919a().mo34778h();
        boolean z2 = this.f8263D;
        if (this.f8278m != j) {
            z = true;
        } else {
            z = false;
        }
        this.f8263D = z2 | z;
        this.f8278m = j;
    }
}
