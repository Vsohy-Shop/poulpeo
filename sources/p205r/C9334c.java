package p205r;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.C12775o;
import p215s.C9410e;
import p215s.C9413h;
import p215s.C9416j;
import p248v.C9909c;
import p466yf.C13971h0;

/* renamed from: r.c */
/* compiled from: DefinedRequestOptions.kt */
public final class C9334c {

    /* renamed from: a */
    private final Lifecycle f13773a;

    /* renamed from: b */
    private final C9416j f13774b;

    /* renamed from: c */
    private final C9413h f13775c;

    /* renamed from: d */
    private final C13971h0 f13776d;

    /* renamed from: e */
    private final C13971h0 f13777e;

    /* renamed from: f */
    private final C13971h0 f13778f;

    /* renamed from: g */
    private final C13971h0 f13779g;

    /* renamed from: h */
    private final C9909c.C9910a f13780h;

    /* renamed from: i */
    private final C9410e f13781i;

    /* renamed from: j */
    private final Bitmap.Config f13782j;

    /* renamed from: k */
    private final Boolean f13783k;

    /* renamed from: l */
    private final Boolean f13784l;

    /* renamed from: m */
    private final C9332a f13785m;

    /* renamed from: n */
    private final C9332a f13786n;

    /* renamed from: o */
    private final C9332a f13787o;

    public C9334c(Lifecycle lifecycle, C9416j jVar, C9413h hVar, C13971h0 h0Var, C13971h0 h0Var2, C13971h0 h0Var3, C13971h0 h0Var4, C9909c.C9910a aVar, C9410e eVar, Bitmap.Config config, Boolean bool, Boolean bool2, C9332a aVar2, C9332a aVar3, C9332a aVar4) {
        this.f13773a = lifecycle;
        this.f13774b = jVar;
        this.f13775c = hVar;
        this.f13776d = h0Var;
        this.f13777e = h0Var2;
        this.f13778f = h0Var3;
        this.f13779g = h0Var4;
        this.f13780h = aVar;
        this.f13781i = eVar;
        this.f13782j = config;
        this.f13783k = bool;
        this.f13784l = bool2;
        this.f13785m = aVar2;
        this.f13786n = aVar3;
        this.f13787o = aVar4;
    }

    /* renamed from: a */
    public final Boolean mo43666a() {
        return this.f13783k;
    }

    /* renamed from: b */
    public final Boolean mo43667b() {
        return this.f13784l;
    }

    /* renamed from: c */
    public final Bitmap.Config mo43668c() {
        return this.f13782j;
    }

    /* renamed from: d */
    public final C13971h0 mo43669d() {
        return this.f13778f;
    }

    /* renamed from: e */
    public final C9332a mo43670e() {
        return this.f13786n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9334c) {
            C9334c cVar = (C9334c) obj;
            if (!C12775o.m28634d(this.f13773a, cVar.f13773a) || !C12775o.m28634d(this.f13774b, cVar.f13774b) || this.f13775c != cVar.f13775c || !C12775o.m28634d(this.f13776d, cVar.f13776d) || !C12775o.m28634d(this.f13777e, cVar.f13777e) || !C12775o.m28634d(this.f13778f, cVar.f13778f) || !C12775o.m28634d(this.f13779g, cVar.f13779g) || !C12775o.m28634d(this.f13780h, cVar.f13780h) || this.f13781i != cVar.f13781i || this.f13782j != cVar.f13782j || !C12775o.m28634d(this.f13783k, cVar.f13783k) || !C12775o.m28634d(this.f13784l, cVar.f13784l) || this.f13785m != cVar.f13785m || this.f13786n != cVar.f13786n || this.f13787o != cVar.f13787o) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final C13971h0 mo43672f() {
        return this.f13777e;
    }

    /* renamed from: g */
    public final C13971h0 mo43673g() {
        return this.f13776d;
    }

    /* renamed from: h */
    public final Lifecycle mo43674h() {
        return this.f13773a;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Lifecycle lifecycle = this.f13773a;
        int i15 = 0;
        if (lifecycle != null) {
            i = lifecycle.hashCode();
        } else {
            i = 0;
        }
        int i16 = i * 31;
        C9416j jVar = this.f13774b;
        if (jVar != null) {
            i2 = jVar.hashCode();
        } else {
            i2 = 0;
        }
        int i17 = (i16 + i2) * 31;
        C9413h hVar = this.f13775c;
        if (hVar != null) {
            i3 = hVar.hashCode();
        } else {
            i3 = 0;
        }
        int i18 = (i17 + i3) * 31;
        C13971h0 h0Var = this.f13776d;
        if (h0Var != null) {
            i4 = h0Var.hashCode();
        } else {
            i4 = 0;
        }
        int i19 = (i18 + i4) * 31;
        C13971h0 h0Var2 = this.f13777e;
        if (h0Var2 != null) {
            i5 = h0Var2.hashCode();
        } else {
            i5 = 0;
        }
        int i20 = (i19 + i5) * 31;
        C13971h0 h0Var3 = this.f13778f;
        if (h0Var3 != null) {
            i6 = h0Var3.hashCode();
        } else {
            i6 = 0;
        }
        int i21 = (i20 + i6) * 31;
        C13971h0 h0Var4 = this.f13779g;
        if (h0Var4 != null) {
            i7 = h0Var4.hashCode();
        } else {
            i7 = 0;
        }
        int i22 = (i21 + i7) * 31;
        C9909c.C9910a aVar = this.f13780h;
        if (aVar != null) {
            i8 = aVar.hashCode();
        } else {
            i8 = 0;
        }
        int i23 = (i22 + i8) * 31;
        C9410e eVar = this.f13781i;
        if (eVar != null) {
            i9 = eVar.hashCode();
        } else {
            i9 = 0;
        }
        int i24 = (i23 + i9) * 31;
        Bitmap.Config config = this.f13782j;
        if (config != null) {
            i10 = config.hashCode();
        } else {
            i10 = 0;
        }
        int i25 = (i24 + i10) * 31;
        Boolean bool = this.f13783k;
        if (bool != null) {
            i11 = bool.hashCode();
        } else {
            i11 = 0;
        }
        int i26 = (i25 + i11) * 31;
        Boolean bool2 = this.f13784l;
        if (bool2 != null) {
            i12 = bool2.hashCode();
        } else {
            i12 = 0;
        }
        int i27 = (i26 + i12) * 31;
        C9332a aVar2 = this.f13785m;
        if (aVar2 != null) {
            i13 = aVar2.hashCode();
        } else {
            i13 = 0;
        }
        int i28 = (i27 + i13) * 31;
        C9332a aVar3 = this.f13786n;
        if (aVar3 != null) {
            i14 = aVar3.hashCode();
        } else {
            i14 = 0;
        }
        int i29 = (i28 + i14) * 31;
        C9332a aVar4 = this.f13787o;
        if (aVar4 != null) {
            i15 = aVar4.hashCode();
        }
        return i29 + i15;
    }

    /* renamed from: i */
    public final C9332a mo43676i() {
        return this.f13785m;
    }

    /* renamed from: j */
    public final C9332a mo43677j() {
        return this.f13787o;
    }

    /* renamed from: k */
    public final C9410e mo43678k() {
        return this.f13781i;
    }

    /* renamed from: l */
    public final C9413h mo43679l() {
        return this.f13775c;
    }

    /* renamed from: m */
    public final C9416j mo43680m() {
        return this.f13774b;
    }

    /* renamed from: n */
    public final C13971h0 mo43681n() {
        return this.f13779g;
    }

    /* renamed from: o */
    public final C9909c.C9910a mo43682o() {
        return this.f13780h;
    }
}
