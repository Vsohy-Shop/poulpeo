package p231t4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: t4.e */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C9677e extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C9677e> CREATOR = new C9695j1();

    /* renamed from: b */
    private final C9719r f14435b;

    /* renamed from: c */
    private final boolean f14436c;

    /* renamed from: d */
    private final boolean f14437d;
    @Nullable

    /* renamed from: e */
    private final int[] f14438e;

    /* renamed from: f */
    private final int f14439f;
    @Nullable

    /* renamed from: g */
    private final int[] f14440g;

    public C9677e(@NonNull C9719r rVar, boolean z, boolean z2, @Nullable int[] iArr, int i, @Nullable int[] iArr2) {
        this.f14435b = rVar;
        this.f14436c = z;
        this.f14437d = z2;
        this.f14438e = iArr;
        this.f14439f = i;
        this.f14440g = iArr2;
    }

    /* renamed from: A */
    public int mo44177A() {
        return this.f14439f;
    }

    @Nullable
    /* renamed from: F */
    public int[] mo44178F() {
        return this.f14438e;
    }

    @Nullable
    /* renamed from: G */
    public int[] mo44179G() {
        return this.f14440g;
    }

    /* renamed from: H */
    public boolean mo44180H() {
        return this.f14436c;
    }

    /* renamed from: I */
    public boolean mo44181I() {
        return this.f14437d;
    }

    @NonNull
    /* renamed from: J */
    public final C9719r mo44182J() {
        return this.f14435b;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20538r(parcel, 1, this.f14435b, i, false);
        C9883b.m20523c(parcel, 2, mo44180H());
        C9883b.m20523c(parcel, 3, mo44181I());
        C9883b.m20533m(parcel, 4, mo44178F(), false);
        C9883b.m20532l(parcel, 5, mo44177A());
        C9883b.m20533m(parcel, 6, mo44179G(), false);
        C9883b.m20522b(parcel, a);
    }
}
