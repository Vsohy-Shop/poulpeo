package p205r;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import kotlin.jvm.internal.C12775o;
import okhttp3.Headers;
import p215s.C9413h;
import p215s.C9414i;

/* renamed from: r.k */
/* compiled from: Options.kt */
public final class C9345k {

    /* renamed from: a */
    private final Context f13875a;

    /* renamed from: b */
    private final Bitmap.Config f13876b;

    /* renamed from: c */
    private final ColorSpace f13877c;

    /* renamed from: d */
    private final C9414i f13878d;

    /* renamed from: e */
    private final C9413h f13879e;

    /* renamed from: f */
    private final boolean f13880f;

    /* renamed from: g */
    private final boolean f13881g;

    /* renamed from: h */
    private final boolean f13882h;

    /* renamed from: i */
    private final String f13883i;

    /* renamed from: j */
    private final Headers f13884j;

    /* renamed from: k */
    private final C9353p f13885k;

    /* renamed from: l */
    private final C9346l f13886l;

    /* renamed from: m */
    private final C9332a f13887m;

    /* renamed from: n */
    private final C9332a f13888n;

    /* renamed from: o */
    private final C9332a f13889o;

    public C9345k(Context context, Bitmap.Config config, ColorSpace colorSpace, C9414i iVar, C9413h hVar, boolean z, boolean z2, boolean z3, String str, Headers headers, C9353p pVar, C9346l lVar, C9332a aVar, C9332a aVar2, C9332a aVar3) {
        this.f13875a = context;
        this.f13876b = config;
        this.f13877c = colorSpace;
        this.f13878d = iVar;
        this.f13879e = hVar;
        this.f13880f = z;
        this.f13881g = z2;
        this.f13882h = z3;
        this.f13883i = str;
        this.f13884j = headers;
        this.f13885k = pVar;
        this.f13886l = lVar;
        this.f13887m = aVar;
        this.f13888n = aVar2;
        this.f13889o = aVar3;
    }

    /* renamed from: b */
    public static /* synthetic */ C9345k m19332b(C9345k kVar, Context context, Bitmap.Config config, ColorSpace colorSpace, C9414i iVar, C9413h hVar, boolean z, boolean z2, boolean z3, String str, Headers headers, C9353p pVar, C9346l lVar, C9332a aVar, C9332a aVar2, C9332a aVar3, int i, Object obj) {
        C9345k kVar2 = kVar;
        int i2 = i;
        return kVar.mo43736a((i2 & 1) != 0 ? kVar2.f13875a : context, (i2 & 2) != 0 ? kVar2.f13876b : config, (i2 & 4) != 0 ? kVar2.f13877c : colorSpace, (i2 & 8) != 0 ? kVar2.f13878d : iVar, (i2 & 16) != 0 ? kVar2.f13879e : hVar, (i2 & 32) != 0 ? kVar2.f13880f : z, (i2 & 64) != 0 ? kVar2.f13881g : z2, (i2 & 128) != 0 ? kVar2.f13882h : z3, (i2 & 256) != 0 ? kVar2.f13883i : str, (i2 & 512) != 0 ? kVar2.f13884j : headers, (i2 & 1024) != 0 ? kVar2.f13885k : pVar, (i2 & 2048) != 0 ? kVar2.f13886l : lVar, (i2 & 4096) != 0 ? kVar2.f13887m : aVar, (i2 & 8192) != 0 ? kVar2.f13888n : aVar2, (i2 & 16384) != 0 ? kVar2.f13889o : aVar3);
    }

    /* renamed from: a */
    public final C9345k mo43736a(Context context, Bitmap.Config config, ColorSpace colorSpace, C9414i iVar, C9413h hVar, boolean z, boolean z2, boolean z3, String str, Headers headers, C9353p pVar, C9346l lVar, C9332a aVar, C9332a aVar2, C9332a aVar3) {
        return new C9345k(context, config, colorSpace, iVar, hVar, z, z2, z3, str, headers, pVar, lVar, aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public final boolean mo43737c() {
        return this.f13880f;
    }

    /* renamed from: d */
    public final boolean mo43738d() {
        return this.f13881g;
    }

    /* renamed from: e */
    public final ColorSpace mo43739e() {
        return this.f13877c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9345k) {
            C9345k kVar = (C9345k) obj;
            if (C12775o.m28634d(this.f13875a, kVar.f13875a) && this.f13876b == kVar.f13876b && ((Build.VERSION.SDK_INT < 26 || C12775o.m28634d(this.f13877c, kVar.f13877c)) && C12775o.m28634d(this.f13878d, kVar.f13878d) && this.f13879e == kVar.f13879e && this.f13880f == kVar.f13880f && this.f13881g == kVar.f13881g && this.f13882h == kVar.f13882h && C12775o.m28634d(this.f13883i, kVar.f13883i) && C12775o.m28634d(this.f13884j, kVar.f13884j) && C12775o.m28634d(this.f13885k, kVar.f13885k) && C12775o.m28634d(this.f13886l, kVar.f13886l) && this.f13887m == kVar.f13887m && this.f13888n == kVar.f13888n && this.f13889o == kVar.f13889o)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final Bitmap.Config mo43741f() {
        return this.f13876b;
    }

    /* renamed from: g */
    public final Context mo43742g() {
        return this.f13875a;
    }

    /* renamed from: h */
    public final String mo43743h() {
        return this.f13883i;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f13875a.hashCode() * 31) + this.f13876b.hashCode()) * 31;
        ColorSpace colorSpace = this.f13877c;
        int i2 = 0;
        if (colorSpace != null) {
            i = colorSpace.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((((((((((hashCode + i) * 31) + this.f13878d.hashCode()) * 31) + this.f13879e.hashCode()) * 31) + Boolean.hashCode(this.f13880f)) * 31) + Boolean.hashCode(this.f13881g)) * 31) + Boolean.hashCode(this.f13882h)) * 31;
        String str = this.f13883i;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((((((((((((hashCode2 + i2) * 31) + this.f13884j.hashCode()) * 31) + this.f13885k.hashCode()) * 31) + this.f13886l.hashCode()) * 31) + this.f13887m.hashCode()) * 31) + this.f13888n.hashCode()) * 31) + this.f13889o.hashCode();
    }

    /* renamed from: i */
    public final C9332a mo43745i() {
        return this.f13888n;
    }

    /* renamed from: j */
    public final Headers mo43746j() {
        return this.f13884j;
    }

    /* renamed from: k */
    public final C9332a mo43747k() {
        return this.f13889o;
    }

    /* renamed from: l */
    public final boolean mo43748l() {
        return this.f13882h;
    }

    /* renamed from: m */
    public final C9413h mo43749m() {
        return this.f13879e;
    }

    /* renamed from: n */
    public final C9414i mo43750n() {
        return this.f13878d;
    }

    /* renamed from: o */
    public final C9353p mo43751o() {
        return this.f13885k;
    }
}
