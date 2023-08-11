package p205r;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Headers;
import p115i.C8046i;
import p145l.C8606i;
import p185p.C9016c;
import p205r.C9346l;
import p215s.C9409d;
import p215s.C9410e;
import p215s.C9413h;
import p215s.C9414i;
import p215s.C9416j;
import p215s.C9417k;
import p215s.C9418l;
import p215s.C9421m;
import p226t.C9587a;
import p226t.C9588b;
import p237u.C9779a;
import p248v.C9909c;
import p259w.C10064d;
import p259w.C10068h;
import p259w.C10070i;
import p336ef.C11906l;
import p466yf.C13971h0;

/* renamed from: r.g */
/* compiled from: ImageRequest.kt */
public final class C9339g {

    /* renamed from: A */
    private final Lifecycle f13793A;

    /* renamed from: B */
    private final C9416j f13794B;

    /* renamed from: C */
    private final C9413h f13795C;

    /* renamed from: D */
    private final C9346l f13796D;

    /* renamed from: E */
    private final C9016c.C9018b f13797E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final Integer f13798F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final Drawable f13799G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public final Integer f13800H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final Drawable f13801I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final Integer f13802J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final Drawable f13803K;

    /* renamed from: L */
    private final C9334c f13804L;

    /* renamed from: M */
    private final C9333b f13805M;

    /* renamed from: a */
    private final Context f13806a;

    /* renamed from: b */
    private final Object f13807b;

    /* renamed from: c */
    private final C9587a f13808c;

    /* renamed from: d */
    private final C9341b f13809d;

    /* renamed from: e */
    private final C9016c.C9018b f13810e;

    /* renamed from: f */
    private final String f13811f;

    /* renamed from: g */
    private final Bitmap.Config f13812g;

    /* renamed from: h */
    private final ColorSpace f13813h;

    /* renamed from: i */
    private final C9410e f13814i;

    /* renamed from: j */
    private final C11906l<C8606i.C8607a<?>, Class<?>> f13815j;

    /* renamed from: k */
    private final C8046i.C8047a f13816k;

    /* renamed from: l */
    private final List<C9779a> f13817l;

    /* renamed from: m */
    private final C9909c.C9910a f13818m;

    /* renamed from: n */
    private final Headers f13819n;

    /* renamed from: o */
    private final C9353p f13820o;

    /* renamed from: p */
    private final boolean f13821p;

    /* renamed from: q */
    private final boolean f13822q;

    /* renamed from: r */
    private final boolean f13823r;

    /* renamed from: s */
    private final boolean f13824s;

    /* renamed from: t */
    private final C9332a f13825t;

    /* renamed from: u */
    private final C9332a f13826u;

    /* renamed from: v */
    private final C9332a f13827v;

    /* renamed from: w */
    private final C13971h0 f13828w;

    /* renamed from: x */
    private final C13971h0 f13829x;

    /* renamed from: y */
    private final C13971h0 f13830y;

    /* renamed from: z */
    private final C13971h0 f13831z;

    public /* synthetic */ C9339g(Context context, Object obj, C9587a aVar, C9341b bVar, C9016c.C9018b bVar2, String str, Bitmap.Config config, ColorSpace colorSpace, C9410e eVar, C11906l lVar, C8046i.C8047a aVar2, List list, C9909c.C9910a aVar3, Headers headers, C9353p pVar, boolean z, boolean z2, boolean z3, boolean z4, C9332a aVar4, C9332a aVar5, C9332a aVar6, C13971h0 h0Var, C13971h0 h0Var2, C13971h0 h0Var3, C13971h0 h0Var4, Lifecycle lifecycle, C9416j jVar, C9413h hVar, C9346l lVar2, C9016c.C9018b bVar3, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, C9334c cVar, C9333b bVar4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, aVar, bVar, bVar2, str, config, colorSpace, eVar, lVar, aVar2, list, aVar3, headers, pVar, z, z2, z3, z4, aVar4, aVar5, aVar6, h0Var, h0Var2, h0Var3, h0Var4, lifecycle, jVar, hVar, lVar2, bVar3, num, drawable, num2, drawable2, num3, drawable3, cVar, bVar4);
    }

    /* renamed from: R */
    public static /* synthetic */ C9340a m19270R(C9339g gVar, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = gVar.f13806a;
        }
        return gVar.mo43705Q(context);
    }

    /* renamed from: A */
    public final C9341b mo43689A() {
        return this.f13809d;
    }

    /* renamed from: B */
    public final C9016c.C9018b mo43690B() {
        return this.f13810e;
    }

    /* renamed from: C */
    public final C9332a mo43691C() {
        return this.f13825t;
    }

    /* renamed from: D */
    public final C9332a mo43692D() {
        return this.f13827v;
    }

    /* renamed from: E */
    public final C9346l mo43693E() {
        return this.f13796D;
    }

    /* renamed from: F */
    public final Drawable mo43694F() {
        return C10068h.m21139c(this, this.f13799G, this.f13798F, this.f13805M.mo43662l());
    }

    /* renamed from: G */
    public final C9016c.C9018b mo43695G() {
        return this.f13797E;
    }

    /* renamed from: H */
    public final C9410e mo43696H() {
        return this.f13814i;
    }

    /* renamed from: I */
    public final boolean mo43697I() {
        return this.f13824s;
    }

    /* renamed from: J */
    public final C9413h mo43698J() {
        return this.f13795C;
    }

    /* renamed from: K */
    public final C9416j mo43699K() {
        return this.f13794B;
    }

    /* renamed from: L */
    public final C9353p mo43700L() {
        return this.f13820o;
    }

    /* renamed from: M */
    public final C9587a mo43701M() {
        return this.f13808c;
    }

    /* renamed from: N */
    public final C13971h0 mo43702N() {
        return this.f13831z;
    }

    /* renamed from: O */
    public final List<C9779a> mo43703O() {
        return this.f13817l;
    }

    /* renamed from: P */
    public final C9909c.C9910a mo43704P() {
        return this.f13818m;
    }

    /* renamed from: Q */
    public final C9340a mo43705Q(Context context) {
        return new C9340a(this, context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9339g) {
            C9339g gVar = (C9339g) obj;
            if (!C12775o.m28634d(this.f13806a, gVar.f13806a) || !C12775o.m28634d(this.f13807b, gVar.f13807b) || !C12775o.m28634d(this.f13808c, gVar.f13808c) || !C12775o.m28634d(this.f13809d, gVar.f13809d) || !C12775o.m28634d(this.f13810e, gVar.f13810e) || !C12775o.m28634d(this.f13811f, gVar.f13811f) || this.f13812g != gVar.f13812g || ((Build.VERSION.SDK_INT >= 26 && !C12775o.m28634d(this.f13813h, gVar.f13813h)) || this.f13814i != gVar.f13814i || !C12775o.m28634d(this.f13815j, gVar.f13815j) || !C12775o.m28634d(this.f13816k, gVar.f13816k) || !C12775o.m28634d(this.f13817l, gVar.f13817l) || !C12775o.m28634d(this.f13818m, gVar.f13818m) || !C12775o.m28634d(this.f13819n, gVar.f13819n) || !C12775o.m28634d(this.f13820o, gVar.f13820o) || this.f13821p != gVar.f13821p || this.f13822q != gVar.f13822q || this.f13823r != gVar.f13823r || this.f13824s != gVar.f13824s || this.f13825t != gVar.f13825t || this.f13826u != gVar.f13826u || this.f13827v != gVar.f13827v || !C12775o.m28634d(this.f13828w, gVar.f13828w) || !C12775o.m28634d(this.f13829x, gVar.f13829x) || !C12775o.m28634d(this.f13830y, gVar.f13830y) || !C12775o.m28634d(this.f13831z, gVar.f13831z) || !C12775o.m28634d(this.f13797E, gVar.f13797E) || !C12775o.m28634d(this.f13798F, gVar.f13798F) || !C12775o.m28634d(this.f13799G, gVar.f13799G) || !C12775o.m28634d(this.f13800H, gVar.f13800H) || !C12775o.m28634d(this.f13801I, gVar.f13801I) || !C12775o.m28634d(this.f13802J, gVar.f13802J) || !C12775o.m28634d(this.f13803K, gVar.f13803K) || !C12775o.m28634d(this.f13793A, gVar.f13793A) || !C12775o.m28634d(this.f13794B, gVar.f13794B) || this.f13795C != gVar.f13795C || !C12775o.m28634d(this.f13796D, gVar.f13796D) || !C12775o.m28634d(this.f13804L, gVar.f13804L) || !C12775o.m28634d(this.f13805M, gVar.f13805M))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo43707g() {
        return this.f13821p;
    }

    /* renamed from: h */
    public final boolean mo43708h() {
        return this.f13822q;
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
        int hashCode = ((this.f13806a.hashCode() * 31) + this.f13807b.hashCode()) * 31;
        C9587a aVar = this.f13808c;
        int i14 = 0;
        if (aVar != null) {
            i = aVar.hashCode();
        } else {
            i = 0;
        }
        int i15 = (hashCode + i) * 31;
        C9341b bVar = this.f13809d;
        if (bVar != null) {
            i2 = bVar.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (i15 + i2) * 31;
        C9016c.C9018b bVar2 = this.f13810e;
        if (bVar2 != null) {
            i3 = bVar2.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 31;
        String str = this.f13811f;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode2 = (((i17 + i4) * 31) + this.f13812g.hashCode()) * 31;
        ColorSpace colorSpace = this.f13813h;
        if (colorSpace != null) {
            i5 = colorSpace.hashCode();
        } else {
            i5 = 0;
        }
        int hashCode3 = (((hashCode2 + i5) * 31) + this.f13814i.hashCode()) * 31;
        C11906l<C8606i.C8607a<?>, Class<?>> lVar = this.f13815j;
        if (lVar != null) {
            i6 = lVar.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (hashCode3 + i6) * 31;
        C8046i.C8047a aVar2 = this.f13816k;
        if (aVar2 != null) {
            i7 = aVar2.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode4 = (((((((((((((((((((((((((((((((((((((((i18 + i7) * 31) + this.f13817l.hashCode()) * 31) + this.f13818m.hashCode()) * 31) + this.f13819n.hashCode()) * 31) + this.f13820o.hashCode()) * 31) + Boolean.hashCode(this.f13821p)) * 31) + Boolean.hashCode(this.f13822q)) * 31) + Boolean.hashCode(this.f13823r)) * 31) + Boolean.hashCode(this.f13824s)) * 31) + this.f13825t.hashCode()) * 31) + this.f13826u.hashCode()) * 31) + this.f13827v.hashCode()) * 31) + this.f13828w.hashCode()) * 31) + this.f13829x.hashCode()) * 31) + this.f13830y.hashCode()) * 31) + this.f13831z.hashCode()) * 31) + this.f13793A.hashCode()) * 31) + this.f13794B.hashCode()) * 31) + this.f13795C.hashCode()) * 31) + this.f13796D.hashCode()) * 31;
        C9016c.C9018b bVar3 = this.f13797E;
        if (bVar3 != null) {
            i8 = bVar3.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (hashCode4 + i8) * 31;
        Integer num = this.f13798F;
        if (num != null) {
            i9 = num.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 31;
        Drawable drawable = this.f13799G;
        if (drawable != null) {
            i10 = drawable.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = (i20 + i10) * 31;
        Integer num2 = this.f13800H;
        if (num2 != null) {
            i11 = num2.hashCode();
        } else {
            i11 = 0;
        }
        int i22 = (i21 + i11) * 31;
        Drawable drawable2 = this.f13801I;
        if (drawable2 != null) {
            i12 = drawable2.hashCode();
        } else {
            i12 = 0;
        }
        int i23 = (i22 + i12) * 31;
        Integer num3 = this.f13802J;
        if (num3 != null) {
            i13 = num3.hashCode();
        } else {
            i13 = 0;
        }
        int i24 = (i23 + i13) * 31;
        Drawable drawable3 = this.f13803K;
        if (drawable3 != null) {
            i14 = drawable3.hashCode();
        }
        return ((((i24 + i14) * 31) + this.f13804L.hashCode()) * 31) + this.f13805M.hashCode();
    }

    /* renamed from: i */
    public final boolean mo43710i() {
        return this.f13823r;
    }

    /* renamed from: j */
    public final Bitmap.Config mo43711j() {
        return this.f13812g;
    }

    /* renamed from: k */
    public final ColorSpace mo43712k() {
        return this.f13813h;
    }

    /* renamed from: l */
    public final Context mo43713l() {
        return this.f13806a;
    }

    /* renamed from: m */
    public final Object mo43714m() {
        return this.f13807b;
    }

    /* renamed from: n */
    public final C13971h0 mo43715n() {
        return this.f13830y;
    }

    /* renamed from: o */
    public final C8046i.C8047a mo43716o() {
        return this.f13816k;
    }

    /* renamed from: p */
    public final C9333b mo43717p() {
        return this.f13805M;
    }

    /* renamed from: q */
    public final C9334c mo43718q() {
        return this.f13804L;
    }

    /* renamed from: r */
    public final String mo43719r() {
        return this.f13811f;
    }

    /* renamed from: s */
    public final C9332a mo43720s() {
        return this.f13826u;
    }

    /* renamed from: t */
    public final Drawable mo43721t() {
        return C10068h.m21139c(this, this.f13801I, this.f13800H, this.f13805M.mo43655f());
    }

    /* renamed from: u */
    public final Drawable mo43722u() {
        return C10068h.m21139c(this, this.f13803K, this.f13802J, this.f13805M.mo43656g());
    }

    /* renamed from: v */
    public final C13971h0 mo43723v() {
        return this.f13829x;
    }

    /* renamed from: w */
    public final C11906l<C8606i.C8607a<?>, Class<?>> mo43724w() {
        return this.f13815j;
    }

    /* renamed from: x */
    public final Headers mo43725x() {
        return this.f13819n;
    }

    /* renamed from: y */
    public final C13971h0 mo43726y() {
        return this.f13828w;
    }

    /* renamed from: z */
    public final Lifecycle mo43727z() {
        return this.f13793A;
    }

    private C9339g(Context context, Object obj, C9587a aVar, C9341b bVar, C9016c.C9018b bVar2, String str, Bitmap.Config config, ColorSpace colorSpace, C9410e eVar, C11906l<? extends C8606i.C8607a<?>, ? extends Class<?>> lVar, C8046i.C8047a aVar2, List<? extends C9779a> list, C9909c.C9910a aVar3, Headers headers, C9353p pVar, boolean z, boolean z2, boolean z3, boolean z4, C9332a aVar4, C9332a aVar5, C9332a aVar6, C13971h0 h0Var, C13971h0 h0Var2, C13971h0 h0Var3, C13971h0 h0Var4, Lifecycle lifecycle, C9416j jVar, C9413h hVar, C9346l lVar2, C9016c.C9018b bVar3, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, C9334c cVar, C9333b bVar4) {
        this.f13806a = context;
        this.f13807b = obj;
        this.f13808c = aVar;
        this.f13809d = bVar;
        this.f13810e = bVar2;
        this.f13811f = str;
        this.f13812g = config;
        this.f13813h = colorSpace;
        this.f13814i = eVar;
        this.f13815j = lVar;
        this.f13816k = aVar2;
        this.f13817l = list;
        this.f13818m = aVar3;
        this.f13819n = headers;
        this.f13820o = pVar;
        this.f13821p = z;
        this.f13822q = z2;
        this.f13823r = z3;
        this.f13824s = z4;
        this.f13825t = aVar4;
        this.f13826u = aVar5;
        this.f13827v = aVar6;
        this.f13828w = h0Var;
        this.f13829x = h0Var2;
        this.f13830y = h0Var3;
        this.f13831z = h0Var4;
        this.f13793A = lifecycle;
        this.f13794B = jVar;
        this.f13795C = hVar;
        this.f13796D = lVar2;
        this.f13797E = bVar3;
        this.f13798F = num;
        this.f13799G = drawable;
        this.f13800H = num2;
        this.f13801I = drawable2;
        this.f13802J = num3;
        this.f13803K = drawable3;
        this.f13804L = cVar;
        this.f13805M = bVar4;
    }

    /* renamed from: r.g$b */
    /* compiled from: ImageRequest.kt */
    public interface C9341b {
        @MainThread
        /* renamed from: a */
        void mo41264a(C9339g gVar) {
        }

        @MainThread
        /* renamed from: d */
        void mo41267d(C9339g gVar) {
        }

        @MainThread
        /* renamed from: b */
        void mo41265b(C9339g gVar, C9352o oVar) {
        }

        @MainThread
        /* renamed from: c */
        void mo41266c(C9339g gVar, C9336e eVar) {
        }
    }

    @SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1057:1\n1#2:1058\n*E\n"})
    /* renamed from: r.g$a */
    /* compiled from: ImageRequest.kt */
    public static final class C9340a {

        /* renamed from: A */
        private C13971h0 f13832A;

        /* renamed from: B */
        private C9346l.C9347a f13833B;

        /* renamed from: C */
        private C9016c.C9018b f13834C;
        @DrawableRes

        /* renamed from: D */
        private Integer f13835D;

        /* renamed from: E */
        private Drawable f13836E;
        @DrawableRes

        /* renamed from: F */
        private Integer f13837F;

        /* renamed from: G */
        private Drawable f13838G;
        @DrawableRes

        /* renamed from: H */
        private Integer f13839H;

        /* renamed from: I */
        private Drawable f13840I;

        /* renamed from: J */
        private Lifecycle f13841J;

        /* renamed from: K */
        private C9416j f13842K;

        /* renamed from: L */
        private C9413h f13843L;

        /* renamed from: M */
        private Lifecycle f13844M;

        /* renamed from: N */
        private C9416j f13845N;

        /* renamed from: O */
        private C9413h f13846O;

        /* renamed from: a */
        private final Context f13847a;

        /* renamed from: b */
        private C9333b f13848b;

        /* renamed from: c */
        private Object f13849c;

        /* renamed from: d */
        private C9587a f13850d;

        /* renamed from: e */
        private C9341b f13851e;

        /* renamed from: f */
        private C9016c.C9018b f13852f;

        /* renamed from: g */
        private String f13853g;

        /* renamed from: h */
        private Bitmap.Config f13854h;

        /* renamed from: i */
        private ColorSpace f13855i;

        /* renamed from: j */
        private C9410e f13856j;

        /* renamed from: k */
        private C11906l<? extends C8606i.C8607a<?>, ? extends Class<?>> f13857k;

        /* renamed from: l */
        private C8046i.C8047a f13858l;

        /* renamed from: m */
        private List<? extends C9779a> f13859m;

        /* renamed from: n */
        private C9909c.C9910a f13860n;

        /* renamed from: o */
        private Headers.Builder f13861o;

        /* renamed from: p */
        private Map<Class<?>, Object> f13862p;

        /* renamed from: q */
        private boolean f13863q;

        /* renamed from: r */
        private Boolean f13864r;

        /* renamed from: s */
        private Boolean f13865s;

        /* renamed from: t */
        private boolean f13866t;

        /* renamed from: u */
        private C9332a f13867u;

        /* renamed from: v */
        private C9332a f13868v;

        /* renamed from: w */
        private C9332a f13869w;

        /* renamed from: x */
        private C13971h0 f13870x;

        /* renamed from: y */
        private C13971h0 f13871y;

        /* renamed from: z */
        private C13971h0 f13872z;

        public C9340a(Context context) {
            this.f13847a = context;
            this.f13848b = C10068h.m21138b();
            this.f13849c = null;
            this.f13850d = null;
            this.f13851e = null;
            this.f13852f = null;
            this.f13853g = null;
            this.f13854h = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f13855i = null;
            }
            this.f13856j = null;
            this.f13857k = null;
            this.f13858l = null;
            this.f13859m = C12726w.m28524k();
            this.f13860n = null;
            this.f13861o = null;
            this.f13862p = null;
            this.f13863q = true;
            this.f13864r = null;
            this.f13865s = null;
            this.f13866t = true;
            this.f13867u = null;
            this.f13868v = null;
            this.f13869w = null;
            this.f13870x = null;
            this.f13871y = null;
            this.f13872z = null;
            this.f13832A = null;
            this.f13833B = null;
            this.f13834C = null;
            this.f13835D = null;
            this.f13836E = null;
            this.f13837F = null;
            this.f13838G = null;
            this.f13839H = null;
            this.f13840I = null;
            this.f13841J = null;
            this.f13842K = null;
            this.f13843L = null;
            this.f13844M = null;
            this.f13845N = null;
            this.f13846O = null;
        }

        /* renamed from: e */
        private final void m19314e() {
            this.f13846O = null;
        }

        /* renamed from: f */
        private final void m19315f() {
            this.f13844M = null;
            this.f13845N = null;
            this.f13846O = null;
        }

        /* renamed from: g */
        private final Lifecycle m19316g() {
            Context context;
            C9587a aVar = this.f13850d;
            if (aVar instanceof C9588b) {
                context = ((C9588b) aVar).getView().getContext();
            } else {
                context = this.f13847a;
            }
            Lifecycle c = C10064d.m21130c(context);
            if (c == null) {
                return C9337f.f13791a;
            }
            return c;
        }

        /* renamed from: h */
        private final C9413h m19317h() {
            C9418l lVar;
            C9588b bVar;
            View view;
            C9416j jVar = this.f13842K;
            View view2 = null;
            if (jVar instanceof C9418l) {
                lVar = (C9418l) jVar;
            } else {
                lVar = null;
            }
            if (lVar == null || (view = lVar.getView()) == null) {
                C9587a aVar = this.f13850d;
                if (aVar instanceof C9588b) {
                    bVar = (C9588b) aVar;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    view2 = bVar.getView();
                }
            } else {
                view2 = view;
            }
            if (view2 instanceof ImageView) {
                return C10070i.m21154n((ImageView) view2);
            }
            return C9413h.FIT;
        }

        /* renamed from: i */
        private final C9416j m19318i() {
            boolean z;
            C9587a aVar = this.f13850d;
            if (!(aVar instanceof C9588b)) {
                return new C9409d(this.f13847a);
            }
            View view = ((C9588b) aVar).getView();
            if (view instanceof ImageView) {
                ImageView.ScaleType scaleType = ((ImageView) view).getScaleType();
                if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return C9417k.m19467a(C9414i.f13995d);
                }
            }
            return C9421m.m19476b(view, false, 2, (Object) null);
        }

        /* renamed from: a */
        public final C9339g mo43728a() {
            Headers headers;
            C9353p pVar;
            boolean z;
            boolean z2;
            C9346l lVar;
            Context context = this.f13847a;
            Object obj = this.f13849c;
            if (obj == null) {
                obj = C9343i.f13873a;
            }
            Object obj2 = obj;
            C9587a aVar = this.f13850d;
            C9341b bVar = this.f13851e;
            C9016c.C9018b bVar2 = this.f13852f;
            String str = this.f13853g;
            Bitmap.Config config = this.f13854h;
            if (config == null) {
                config = this.f13848b.mo43651c();
            }
            Bitmap.Config config2 = config;
            ColorSpace colorSpace = this.f13855i;
            C9410e eVar = this.f13856j;
            if (eVar == null) {
                eVar = this.f13848b.mo43663m();
            }
            C9410e eVar2 = eVar;
            C11906l<? extends C8606i.C8607a<?>, ? extends Class<?>> lVar2 = this.f13857k;
            C8046i.C8047a aVar2 = this.f13858l;
            List<? extends C9779a> list = this.f13859m;
            C9909c.C9910a aVar3 = this.f13860n;
            if (aVar3 == null) {
                aVar3 = this.f13848b.mo43665o();
            }
            C9909c.C9910a aVar4 = aVar3;
            Headers.Builder builder = this.f13861o;
            if (builder != null) {
                headers = builder.build();
            } else {
                headers = null;
            }
            Headers v = C10070i.m21162v(headers);
            Map<Class<?>, Object> map = this.f13862p;
            if (map != null) {
                pVar = C9353p.f13906b.mo43777a(map);
            } else {
                pVar = null;
            }
            C9353p x = C10070i.m21164x(pVar);
            boolean z3 = this.f13863q;
            Boolean bool = this.f13864r;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = this.f13848b.mo43649a();
            }
            boolean z4 = z;
            Boolean bool2 = this.f13865s;
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            } else {
                z2 = this.f13848b.mo43650b();
            }
            boolean z5 = z2;
            boolean z6 = this.f13866t;
            C9332a aVar5 = this.f13867u;
            if (aVar5 == null) {
                aVar5 = this.f13848b.mo43660j();
            }
            C9332a aVar6 = aVar5;
            C9332a aVar7 = this.f13868v;
            if (aVar7 == null) {
                aVar7 = this.f13848b.mo43653e();
            }
            C9332a aVar8 = aVar7;
            C9332a aVar9 = this.f13869w;
            if (aVar9 == null) {
                aVar9 = this.f13848b.mo43661k();
            }
            C9332a aVar10 = aVar9;
            C13971h0 h0Var = this.f13870x;
            if (h0Var == null) {
                h0Var = this.f13848b.mo43659i();
            }
            C13971h0 h0Var2 = h0Var;
            C13971h0 h0Var3 = this.f13871y;
            if (h0Var3 == null) {
                h0Var3 = this.f13848b.mo43657h();
            }
            C13971h0 h0Var4 = h0Var3;
            C13971h0 h0Var5 = this.f13872z;
            if (h0Var5 == null) {
                h0Var5 = this.f13848b.mo43652d();
            }
            C13971h0 h0Var6 = h0Var5;
            C13971h0 h0Var7 = this.f13832A;
            if (h0Var7 == null) {
                h0Var7 = this.f13848b.mo43664n();
            }
            C13971h0 h0Var8 = h0Var7;
            Lifecycle lifecycle = this.f13841J;
            if (lifecycle == null && (lifecycle = this.f13844M) == null) {
                lifecycle = m19316g();
            }
            Lifecycle lifecycle2 = lifecycle;
            C9416j jVar = this.f13842K;
            if (jVar == null && (jVar = this.f13845N) == null) {
                jVar = m19318i();
            }
            C9416j jVar2 = jVar;
            C9413h hVar = this.f13843L;
            if (hVar == null && (hVar = this.f13846O) == null) {
                hVar = m19317h();
            }
            C9413h hVar2 = hVar;
            C9346l.C9347a aVar11 = this.f13833B;
            if (aVar11 != null) {
                lVar = aVar11.mo43759a();
            } else {
                lVar = null;
            }
            C9346l w = C10070i.m21163w(lVar);
            C9016c.C9018b bVar3 = this.f13834C;
            Integer num = this.f13835D;
            Drawable drawable = this.f13836E;
            Integer num2 = this.f13837F;
            Drawable drawable2 = this.f13838G;
            Integer num3 = this.f13839H;
            Drawable drawable3 = this.f13840I;
            C9334c cVar = r43;
            boolean z7 = z3;
            C9909c.C9910a aVar12 = aVar4;
            List<? extends C9779a> list2 = list;
            C8046i.C8047a aVar13 = aVar2;
            C11906l<? extends C8606i.C8607a<?>, ? extends Class<?>> lVar3 = lVar2;
            C9410e eVar3 = eVar2;
            ColorSpace colorSpace2 = colorSpace;
            Bitmap.Config config3 = config2;
            String str2 = str;
            C9016c.C9018b bVar4 = bVar2;
            C9341b bVar5 = bVar;
            C9587a aVar14 = aVar;
            Object obj3 = obj2;
            C9334c cVar2 = new C9334c(this.f13841J, this.f13842K, this.f13843L, this.f13870x, this.f13871y, this.f13872z, this.f13832A, this.f13860n, this.f13856j, this.f13854h, this.f13864r, this.f13865s, this.f13867u, this.f13868v, this.f13869w);
            return new C9339g(context, obj3, aVar14, bVar5, bVar4, str2, config3, colorSpace2, eVar3, lVar3, aVar13, list2, aVar12, v, x, z7, z4, z5, z6, aVar6, aVar8, aVar10, h0Var2, h0Var4, h0Var6, h0Var8, lifecycle2, jVar2, hVar2, w, bVar3, num, drawable, num2, drawable2, num3, drawable3, cVar, this.f13848b, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public final C9340a mo43729b(Object obj) {
            this.f13849c = obj;
            return this;
        }

        /* renamed from: c */
        public final C9340a mo43730c(C9333b bVar) {
            this.f13848b = bVar;
            m19314e();
            return this;
        }

        /* renamed from: d */
        public final C9340a mo43731d(C9410e eVar) {
            this.f13856j = eVar;
            return this;
        }

        /* renamed from: j */
        public final C9340a mo43732j(C9413h hVar) {
            this.f13843L = hVar;
            return this;
        }

        /* renamed from: k */
        public final C9340a mo43733k(C9416j jVar) {
            this.f13842K = jVar;
            m19315f();
            return this;
        }

        /* renamed from: l */
        public final C9340a mo43734l(C9587a aVar) {
            this.f13850d = aVar;
            m19315f();
            return this;
        }

        public C9340a(C9339g gVar, Context context) {
            this.f13847a = context;
            this.f13848b = gVar.mo43717p();
            this.f13849c = gVar.mo43714m();
            this.f13850d = gVar.mo43701M();
            this.f13851e = gVar.mo43689A();
            this.f13852f = gVar.mo43690B();
            this.f13853g = gVar.mo43719r();
            this.f13854h = gVar.mo43718q().mo43668c();
            if (Build.VERSION.SDK_INT >= 26) {
                this.f13855i = gVar.mo43712k();
            }
            this.f13856j = gVar.mo43718q().mo43678k();
            this.f13857k = gVar.mo43724w();
            this.f13858l = gVar.mo43716o();
            this.f13859m = gVar.mo43703O();
            this.f13860n = gVar.mo43718q().mo43682o();
            this.f13861o = gVar.mo43725x().newBuilder();
            this.f13862p = C12716r0.m28430u(gVar.mo43700L().mo43773a());
            this.f13863q = gVar.mo43707g();
            this.f13864r = gVar.mo43718q().mo43666a();
            this.f13865s = gVar.mo43718q().mo43667b();
            this.f13866t = gVar.mo43697I();
            this.f13867u = gVar.mo43718q().mo43676i();
            this.f13868v = gVar.mo43718q().mo43670e();
            this.f13869w = gVar.mo43718q().mo43677j();
            this.f13870x = gVar.mo43718q().mo43673g();
            this.f13871y = gVar.mo43718q().mo43672f();
            this.f13872z = gVar.mo43718q().mo43669d();
            this.f13832A = gVar.mo43718q().mo43681n();
            this.f13833B = gVar.mo43693E().mo43757k();
            this.f13834C = gVar.mo43695G();
            this.f13835D = gVar.f13798F;
            this.f13836E = gVar.f13799G;
            this.f13837F = gVar.f13800H;
            this.f13838G = gVar.f13801I;
            this.f13839H = gVar.f13802J;
            this.f13840I = gVar.f13803K;
            this.f13841J = gVar.mo43718q().mo43674h();
            this.f13842K = gVar.mo43718q().mo43680m();
            this.f13843L = gVar.mo43718q().mo43679l();
            if (gVar.mo43713l() == context) {
                this.f13844M = gVar.mo43727z();
                this.f13845N = gVar.mo43699K();
                this.f13846O = gVar.mo43698J();
                return;
            }
            this.f13844M = null;
            this.f13845N = null;
            this.f13846O = null;
        }
    }
}
