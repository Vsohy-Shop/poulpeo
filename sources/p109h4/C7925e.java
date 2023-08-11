package p109h4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: h4.e */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C7925e extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C7925e> CREATOR = new C7948l();
    @Nullable

    /* renamed from: b */
    private final String f11092b;
    @Nullable

    /* renamed from: c */
    private final String f11093c;

    @VisibleForTesting
    public C7925e(@Nullable String str, @Nullable String str2) {
        this.f11092b = str;
        this.f11093c = str2;
    }

    @Nullable
    /* renamed from: A */
    public String mo41682A() {
        return this.f11092b;
    }

    @Nullable
    /* renamed from: F */
    public String mo41683F() {
        return this.f11093c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7925e)) {
            return false;
        }
        C7925e eVar = (C7925e) obj;
        if (!C9705n.m20259b(this.f11092b, eVar.f11092b) || !C9705n.m20259b(this.f11093c, eVar.f11093c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C9705n.m20260c(this.f11092b, this.f11093c);
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 1, mo41682A(), false);
        C9883b.m20539s(parcel, 2, mo41683F(), false);
        C9883b.m20522b(parcel, a);
    }
}
