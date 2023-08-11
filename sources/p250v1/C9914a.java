package p250v1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.C4368f;
import com.bumptech.glide.load.resource.bitmap.C4467m;
import java.util.Map;
import p058d1.C7215b;
import p058d1.C7218e;
import p058d1.C7222g;
import p058d1.C7226k;
import p094g1.C7737a;
import p197q1.C9112i;
import p250v1.C9914a;
import p283y1.C10651a;
import p294z1.C10781b;
import p294z1.C10791j;
import p294z1.C10792k;

/* renamed from: v1.a */
/* compiled from: BaseRequestOptions */
public abstract class C9914a<T extends C9914a<T>> implements Cloneable {

    /* renamed from: A */
    private boolean f14842A;

    /* renamed from: b */
    private int f14843b;

    /* renamed from: c */
    private float f14844c = 1.0f;
    @NonNull

    /* renamed from: d */
    private C7737a f14845d = C7737a.f10719e;
    @NonNull

    /* renamed from: e */
    private C4368f f14846e = C4368f.NORMAL;
    @Nullable

    /* renamed from: f */
    private Drawable f14847f;

    /* renamed from: g */
    private int f14848g;
    @Nullable

    /* renamed from: h */
    private Drawable f14849h;

    /* renamed from: i */
    private int f14850i;

    /* renamed from: j */
    private boolean f14851j = true;

    /* renamed from: k */
    private int f14852k = -1;

    /* renamed from: l */
    private int f14853l = -1;
    @NonNull

    /* renamed from: m */
    private C7218e f14854m = C10651a.m22610c();

    /* renamed from: n */
    private boolean f14855n;

    /* renamed from: o */
    private boolean f14856o = true;
    @Nullable

    /* renamed from: p */
    private Drawable f14857p;

    /* renamed from: q */
    private int f14858q;
    @NonNull

    /* renamed from: r */
    private C7222g f14859r = new C7222g();
    @NonNull

    /* renamed from: s */
    private Map<Class<?>, C7226k<?>> f14860s = new C10781b();
    @NonNull

    /* renamed from: t */
    private Class<?> f14861t = Object.class;

    /* renamed from: u */
    private boolean f14862u;
    @Nullable

    /* renamed from: v */
    private Resources.Theme f14863v;

    /* renamed from: w */
    private boolean f14864w;

    /* renamed from: x */
    private boolean f14865x;

    /* renamed from: y */
    private boolean f14866y;

    /* renamed from: z */
    private boolean f14867z = true;

    /* renamed from: E */
    private boolean m20609E(int i) {
        return m20610F(this.f14843b, i);
    }

    /* renamed from: F */
    private static boolean m20610F(int i, int i2) {
        if ((i & i2) != 0) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: P */
    private T m20612P() {
        if (!this.f14862u) {
            return m20611N();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* renamed from: B */
    public final boolean mo44438B() {
        return this.f14851j;
    }

    /* renamed from: C */
    public final boolean mo44439C() {
        return m20609E(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo44440D() {
        return this.f14867z;
    }

    /* renamed from: H */
    public final boolean mo44441H() {
        return this.f14855n;
    }

    /* renamed from: I */
    public final boolean mo44442I() {
        return C10792k.m22967r(this.f14853l, this.f14852k);
    }

    @NonNull
    /* renamed from: J */
    public T mo44443J() {
        this.f14862u = true;
        return m20611N();
    }

    @CheckResult
    @NonNull
    /* renamed from: K */
    public T mo44444K(int i, int i2) {
        if (this.f14864w) {
            return clone().mo44444K(i, i2);
        }
        this.f14853l = i;
        this.f14852k = i2;
        this.f14843b |= 512;
        return m20612P();
    }

    @CheckResult
    @NonNull
    /* renamed from: L */
    public T mo44445L(@DrawableRes int i) {
        if (this.f14864w) {
            return clone().mo44445L(i);
        }
        this.f14850i = i;
        this.f14849h = null;
        this.f14843b = (this.f14843b | 128) & -65;
        return m20612P();
    }

    @CheckResult
    @NonNull
    /* renamed from: M */
    public T mo44446M(@NonNull C4368f fVar) {
        if (this.f14864w) {
            return clone().mo44446M(fVar);
        }
        this.f14846e = (C4368f) C10791j.m22948d(fVar);
        this.f14843b |= 8;
        return m20612P();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [d1.f<Y>, java.lang.Object, d1.f] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.CheckResult
    @androidx.annotation.NonNull
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo44447S(@androidx.annotation.NonNull p058d1.C7219f<Y> r2, @androidx.annotation.NonNull Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.f14864w
            if (r0 == 0) goto L_0x000d
            v1.a r0 = r1.clone()
            v1.a r2 = r0.mo44447S(r2, r3)
            return r2
        L_0x000d:
            p294z1.C10791j.m22948d(r2)
            p294z1.C10791j.m22948d(r3)
            d1.g r0 = r1.f14859r
            r0.mo40781e(r2, r3)
            v1.a r2 = r1.m20612P()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p250v1.C9914a.mo44447S(d1.f, java.lang.Object):v1.a");
    }

    @CheckResult
    @NonNull
    /* renamed from: T */
    public T mo44448T(@NonNull C7218e eVar) {
        if (this.f14864w) {
            return clone().mo44448T(eVar);
        }
        this.f14854m = (C7218e) C10791j.m22948d(eVar);
        this.f14843b |= 1024;
        return m20612P();
    }

    @CheckResult
    @NonNull
    /* renamed from: U */
    public T mo44449U(@FloatRange(from = 0.0d, mo636to = 1.0d) float f) {
        if (this.f14864w) {
            return clone().mo44449U(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f14844c = f;
        this.f14843b |= 2;
        return m20612P();
    }

    @CheckResult
    @NonNull
    /* renamed from: W */
    public T mo44450W(boolean z) {
        if (this.f14864w) {
            return clone().mo44450W(true);
        }
        this.f14851j = !z;
        this.f14843b |= 256;
        return m20612P();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [d1.k, d1.k<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.CheckResult
    @androidx.annotation.NonNull
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo44451X(@androidx.annotation.NonNull p058d1.C7226k<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 1
            v1.a r2 = r1.mo44452Y(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p250v1.C9914a.mo44451X(d1.k):v1.a");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [d1.k, d1.k<android.graphics.Bitmap>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.NonNull
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo44452Y(@androidx.annotation.NonNull p058d1.C7226k<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f14864w
            if (r0 == 0) goto L_0x000d
            v1.a r0 = r2.clone()
            v1.a r3 = r0.mo44452Y(r3, r4)
            return r3
        L_0x000d:
            com.bumptech.glide.load.resource.bitmap.o r0 = new com.bumptech.glide.load.resource.bitmap.o
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.mo44453Z(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.mo44453Z(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            d1.k r0 = r0.mo31431c()
            r2.mo44453Z(r1, r0, r4)
            q1.f r0 = new q1.f
            r0.<init>(r3)
            java.lang.Class<q1.c> r3 = p197q1.C9102c.class
            r2.mo44453Z(r3, r0, r4)
            v1.a r3 = r2.m20612P()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p250v1.C9914a.mo44452Y(d1.k, boolean):v1.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [d1.k, java.lang.Object, d1.k<Y>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 2 */
    @androidx.annotation.NonNull
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo44453Z(@androidx.annotation.NonNull java.lang.Class<Y> r2, @androidx.annotation.NonNull p058d1.C7226k<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.f14864w
            if (r0 == 0) goto L_0x000d
            v1.a r0 = r1.clone()
            v1.a r2 = r0.mo44453Z(r2, r3, r4)
            return r2
        L_0x000d:
            p294z1.C10791j.m22948d(r2)
            p294z1.C10791j.m22948d(r3)
            java.util.Map<java.lang.Class<?>, d1.k<?>> r0 = r1.f14860s
            r0.put(r2, r3)
            int r2 = r1.f14843b
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3 = 1
            r1.f14856o = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f14843b = r2
            r0 = 0
            r1.f14867z = r0
            if (r4 == 0) goto L_0x0030
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f14843b = r2
            r1.f14855n = r3
        L_0x0030:
            v1.a r2 = r1.m20612P()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p250v1.C9914a.mo44453Z(java.lang.Class, d1.k, boolean):v1.a");
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public T mo31201a(@NonNull C9914a<?> aVar) {
        if (this.f14864w) {
            return clone().mo31201a(aVar);
        }
        if (m20610F(aVar.f14843b, 2)) {
            this.f14844c = aVar.f14844c;
        }
        if (m20610F(aVar.f14843b, 262144)) {
            this.f14865x = aVar.f14865x;
        }
        if (m20610F(aVar.f14843b, 1048576)) {
            this.f14842A = aVar.f14842A;
        }
        if (m20610F(aVar.f14843b, 4)) {
            this.f14845d = aVar.f14845d;
        }
        if (m20610F(aVar.f14843b, 8)) {
            this.f14846e = aVar.f14846e;
        }
        if (m20610F(aVar.f14843b, 16)) {
            this.f14847f = aVar.f14847f;
            this.f14848g = 0;
            this.f14843b &= -33;
        }
        if (m20610F(aVar.f14843b, 32)) {
            this.f14848g = aVar.f14848g;
            this.f14847f = null;
            this.f14843b &= -17;
        }
        if (m20610F(aVar.f14843b, 64)) {
            this.f14849h = aVar.f14849h;
            this.f14850i = 0;
            this.f14843b &= -129;
        }
        if (m20610F(aVar.f14843b, 128)) {
            this.f14850i = aVar.f14850i;
            this.f14849h = null;
            this.f14843b &= -65;
        }
        if (m20610F(aVar.f14843b, 256)) {
            this.f14851j = aVar.f14851j;
        }
        if (m20610F(aVar.f14843b, 512)) {
            this.f14853l = aVar.f14853l;
            this.f14852k = aVar.f14852k;
        }
        if (m20610F(aVar.f14843b, 1024)) {
            this.f14854m = aVar.f14854m;
        }
        if (m20610F(aVar.f14843b, 4096)) {
            this.f14861t = aVar.f14861t;
        }
        if (m20610F(aVar.f14843b, 8192)) {
            this.f14857p = aVar.f14857p;
            this.f14858q = 0;
            this.f14843b &= -16385;
        }
        if (m20610F(aVar.f14843b, 16384)) {
            this.f14858q = aVar.f14858q;
            this.f14857p = null;
            this.f14843b &= -8193;
        }
        if (m20610F(aVar.f14843b, 32768)) {
            this.f14863v = aVar.f14863v;
        }
        if (m20610F(aVar.f14843b, 65536)) {
            this.f14856o = aVar.f14856o;
        }
        if (m20610F(aVar.f14843b, 131072)) {
            this.f14855n = aVar.f14855n;
        }
        if (m20610F(aVar.f14843b, 2048)) {
            this.f14860s.putAll(aVar.f14860s);
            this.f14867z = aVar.f14867z;
        }
        if (m20610F(aVar.f14843b, 524288)) {
            this.f14866y = aVar.f14866y;
        }
        if (!this.f14856o) {
            this.f14860s.clear();
            this.f14855n = false;
            this.f14843b = this.f14843b & -2049 & -131073;
            this.f14867z = true;
        }
        this.f14843b |= aVar.f14843b;
        this.f14859r.mo40780d(aVar.f14859r);
        return m20612P();
    }

    @CheckResult
    @NonNull
    /* renamed from: a0 */
    public T mo44454a0(boolean z) {
        if (this.f14864w) {
            return clone().mo44454a0(z);
        }
        this.f14842A = z;
        this.f14843b |= 1048576;
        return m20612P();
    }

    @NonNull
    /* renamed from: b */
    public T mo44455b() {
        if (!this.f14862u || this.f14864w) {
            this.f14864w = true;
            return mo44443J();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    @CheckResult
    /* renamed from: c */
    public T clone() {
        try {
            T t = (C9914a) super.clone();
            C7222g gVar = new C7222g();
            t.f14859r = gVar;
            gVar.mo40780d(this.f14859r);
            C10781b bVar = new C10781b();
            t.f14860s = bVar;
            bVar.putAll(this.f14860s);
            t.f14862u = false;
            t.f14864w = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @CheckResult
    @NonNull
    /* renamed from: d */
    public T mo44456d(@NonNull Class<?> cls) {
        if (this.f14864w) {
            return clone().mo44456d(cls);
        }
        this.f14861t = (Class) C10791j.m22948d(cls);
        this.f14843b |= 4096;
        return m20612P();
    }

    @CheckResult
    @NonNull
    /* renamed from: e */
    public T mo44457e(@NonNull C7737a aVar) {
        if (this.f14864w) {
            return clone().mo44457e(aVar);
        }
        this.f14845d = (C7737a) C10791j.m22948d(aVar);
        this.f14843b |= 4;
        return m20612P();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9914a)) {
            return false;
        }
        C9914a aVar = (C9914a) obj;
        if (Float.compare(aVar.f14844c, this.f14844c) == 0 && this.f14848g == aVar.f14848g && C10792k.m22952c(this.f14847f, aVar.f14847f) && this.f14850i == aVar.f14850i && C10792k.m22952c(this.f14849h, aVar.f14849h) && this.f14858q == aVar.f14858q && C10792k.m22952c(this.f14857p, aVar.f14857p) && this.f14851j == aVar.f14851j && this.f14852k == aVar.f14852k && this.f14853l == aVar.f14853l && this.f14855n == aVar.f14855n && this.f14856o == aVar.f14856o && this.f14865x == aVar.f14865x && this.f14866y == aVar.f14866y && this.f14845d.equals(aVar.f14845d) && this.f14846e == aVar.f14846e && this.f14859r.equals(aVar.f14859r) && this.f14860s.equals(aVar.f14860s) && this.f14861t.equals(aVar.f14861t) && C10792k.m22952c(this.f14854m, aVar.f14854m) && C10792k.m22952c(this.f14863v, aVar.f14863v)) {
            return true;
        }
        return false;
    }

    @CheckResult
    @NonNull
    /* renamed from: f */
    public T mo44459f(@NonNull C7215b bVar) {
        C10791j.m22948d(bVar);
        return mo44447S(C4467m.f4026f, bVar).mo44447S(C9112i.f13285a, bVar);
    }

    @NonNull
    /* renamed from: g */
    public final C7737a mo44460g() {
        return this.f14845d;
    }

    /* renamed from: h */
    public final int mo44461h() {
        return this.f14848g;
    }

    public int hashCode() {
        return C10792k.m22962m(this.f14863v, C10792k.m22962m(this.f14854m, C10792k.m22962m(this.f14861t, C10792k.m22962m(this.f14860s, C10792k.m22962m(this.f14859r, C10792k.m22962m(this.f14846e, C10792k.m22962m(this.f14845d, C10792k.m22963n(this.f14866y, C10792k.m22963n(this.f14865x, C10792k.m22963n(this.f14856o, C10792k.m22963n(this.f14855n, C10792k.m22961l(this.f14853l, C10792k.m22961l(this.f14852k, C10792k.m22963n(this.f14851j, C10792k.m22962m(this.f14857p, C10792k.m22961l(this.f14858q, C10792k.m22962m(this.f14849h, C10792k.m22961l(this.f14850i, C10792k.m22962m(this.f14847f, C10792k.m22961l(this.f14848g, C10792k.m22959j(this.f14844c)))))))))))))))))))));
    }

    @Nullable
    /* renamed from: i */
    public final Drawable mo44463i() {
        return this.f14847f;
    }

    @Nullable
    /* renamed from: j */
    public final Drawable mo44464j() {
        return this.f14857p;
    }

    /* renamed from: l */
    public final int mo44465l() {
        return this.f14858q;
    }

    /* renamed from: m */
    public final boolean mo44466m() {
        return this.f14866y;
    }

    @NonNull
    /* renamed from: n */
    public final C7222g mo44467n() {
        return this.f14859r;
    }

    /* renamed from: o */
    public final int mo44468o() {
        return this.f14852k;
    }

    /* renamed from: p */
    public final int mo44469p() {
        return this.f14853l;
    }

    @Nullable
    /* renamed from: q */
    public final Drawable mo44470q() {
        return this.f14849h;
    }

    /* renamed from: r */
    public final int mo44471r() {
        return this.f14850i;
    }

    @NonNull
    /* renamed from: s */
    public final C4368f mo44472s() {
        return this.f14846e;
    }

    @NonNull
    /* renamed from: t */
    public final Class<?> mo44473t() {
        return this.f14861t;
    }

    @NonNull
    /* renamed from: u */
    public final C7218e mo44474u() {
        return this.f14854m;
    }

    /* renamed from: v */
    public final float mo44475v() {
        return this.f14844c;
    }

    @Nullable
    /* renamed from: w */
    public final Resources.Theme mo44476w() {
        return this.f14863v;
    }

    @NonNull
    /* renamed from: x */
    public final Map<Class<?>, C7226k<?>> mo44477x() {
        return this.f14860s;
    }

    /* renamed from: y */
    public final boolean mo44478y() {
        return this.f14842A;
    }

    /* renamed from: z */
    public final boolean mo44479z() {
        return this.f14865x;
    }

    /* renamed from: N */
    private T m20611N() {
        return this;
    }
}
