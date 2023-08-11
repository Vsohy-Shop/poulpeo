package p109h4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p150l4.C8673a;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: h4.o */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7954o extends C9882a {
    public static final Parcelable.Creator<C7954o> CREATOR = new C7956p();
    @Nullable

    /* renamed from: b */
    private final C7950m f11181b;
    @Nullable

    /* renamed from: c */
    private final C7950m f11182c;

    public C7954o(@Nullable C7950m mVar, @Nullable C7950m mVar2) {
        this.f11181b = mVar;
        this.f11182c = mVar2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7954o)) {
            return false;
        }
        C7954o oVar = (C7954o) obj;
        if (!C8673a.m17455n(this.f11181b, oVar.f11181b) || !C8673a.m17455n(this.f11182c, oVar.f11182c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C9705n.m20260c(this.f11181b, this.f11182c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20538r(parcel, 2, this.f11181b, i, false);
        C9883b.m20538r(parcel, 3, this.f11182c, i, false);
        C9883b.m20522b(parcel, a);
    }
}
