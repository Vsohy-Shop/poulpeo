package p109h4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import p150l4.C8673a;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: h4.f */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C7928f extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C7928f> CREATOR = new C7953n0();

    /* renamed from: b */
    private boolean f11096b;

    /* renamed from: c */
    private String f11097c;

    /* renamed from: d */
    private boolean f11098d;
    @Nullable

    /* renamed from: e */
    private C7925e f11099e;

    public C7928f() {
        this(false, C8673a.m17451j(Locale.getDefault()), false, (C7925e) null);
    }

    /* renamed from: A */
    public boolean mo41692A() {
        return this.f11098d;
    }

    @Nullable
    /* renamed from: F */
    public C7925e mo41693F() {
        return this.f11099e;
    }

    @NonNull
    /* renamed from: G */
    public String mo41694G() {
        return this.f11097c;
    }

    /* renamed from: H */
    public boolean mo41695H() {
        return this.f11096b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7928f)) {
            return false;
        }
        C7928f fVar = (C7928f) obj;
        if (this.f11096b != fVar.f11096b || !C8673a.m17455n(this.f11097c, fVar.f11097c) || this.f11098d != fVar.f11098d || !C8673a.m17455n(this.f11099e, fVar.f11099e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C9705n.m20260c(Boolean.valueOf(this.f11096b), this.f11097c, Boolean.valueOf(this.f11098d), this.f11099e);
    }

    @NonNull
    public String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", new Object[]{Boolean.valueOf(this.f11096b), this.f11097c, Boolean.valueOf(this.f11098d)});
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20523c(parcel, 2, mo41695H());
        C9883b.m20539s(parcel, 3, mo41694G(), false);
        C9883b.m20523c(parcel, 4, mo41692A());
        C9883b.m20538r(parcel, 5, mo41693F(), i, false);
        C9883b.m20522b(parcel, a);
    }

    C7928f(boolean z, String str, boolean z2, @Nullable C7925e eVar) {
        this.f11096b = z;
        this.f11097c = str;
        this.f11098d = z2;
        this.f11099e = eVar;
    }
}
