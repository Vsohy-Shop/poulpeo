package p150l4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Locale;
import p109h4.C7910b;
import p109h4.C7954o;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: l4.e */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C8681e extends C9882a {
    public static final Parcelable.Creator<C8681e> CREATOR = new C8683f();

    /* renamed from: b */
    private double f12416b;

    /* renamed from: c */
    private boolean f12417c;

    /* renamed from: d */
    private int f12418d;
    @Nullable

    /* renamed from: e */
    private C7910b f12419e;

    /* renamed from: f */
    private int f12420f;
    @Nullable

    /* renamed from: g */
    private C7954o f12421g;

    /* renamed from: h */
    private double f12422h;

    public C8681e() {
        this(Double.NaN, false, -1, (C7910b) null, -1, (C7954o) null, Double.NaN);
    }

    /* renamed from: A */
    public final double mo42770A() {
        return this.f12422h;
    }

    /* renamed from: F */
    public final double mo42771F() {
        return this.f12416b;
    }

    /* renamed from: G */
    public final int mo42772G() {
        return this.f12418d;
    }

    /* renamed from: H */
    public final int mo42773H() {
        return this.f12420f;
    }

    @Nullable
    /* renamed from: I */
    public final C7910b mo42774I() {
        return this.f12419e;
    }

    @Nullable
    /* renamed from: J */
    public final C7954o mo42775J() {
        return this.f12421g;
    }

    /* renamed from: K */
    public final boolean mo42776K() {
        return this.f12417c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8681e)) {
            return false;
        }
        C8681e eVar = (C8681e) obj;
        if (this.f12416b == eVar.f12416b && this.f12417c == eVar.f12417c && this.f12418d == eVar.f12418d && C8673a.m17455n(this.f12419e, eVar.f12419e) && this.f12420f == eVar.f12420f) {
            C7954o oVar = this.f12421g;
            if (!C8673a.m17455n(oVar, oVar) || this.f12422h != eVar.f12422h) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C9705n.m20260c(Double.valueOf(this.f12416b), Boolean.valueOf(this.f12417c), Integer.valueOf(this.f12418d), this.f12419e, Integer.valueOf(this.f12420f), this.f12421g, Double.valueOf(this.f12422h));
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", new Object[]{Double.valueOf(this.f12416b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20527g(parcel, 2, this.f12416b);
        C9883b.m20523c(parcel, 3, this.f12417c);
        C9883b.m20532l(parcel, 4, this.f12418d);
        C9883b.m20538r(parcel, 5, this.f12419e, i, false);
        C9883b.m20532l(parcel, 6, this.f12420f);
        C9883b.m20538r(parcel, 7, this.f12421g, i, false);
        C9883b.m20527g(parcel, 8, this.f12422h);
        C9883b.m20522b(parcel, a);
    }

    C8681e(double d, boolean z, int i, @Nullable C7910b bVar, int i2, @Nullable C7954o oVar, double d2) {
        this.f12416b = d;
        this.f12417c = z;
        this.f12418d = i;
        this.f12419e = bVar;
        this.f12420f = i2;
        this.f12421g = oVar;
        this.f12422h = d2;
    }
}
