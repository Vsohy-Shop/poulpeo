package p180o4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.autofill.HintConstants;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: o4.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C8974c extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C8974c> CREATOR = new C8979h();

    /* renamed from: b */
    private final String f13059b;
    @Deprecated

    /* renamed from: c */
    private final int f13060c;

    /* renamed from: d */
    private final long f13061d;

    public C8974c(@NonNull String str, int i, long j) {
        this.f13059b = str;
        this.f13060c = i;
        this.f13061d = j;
    }

    @NonNull
    /* renamed from: A */
    public String mo43146A() {
        return this.f13059b;
    }

    /* renamed from: F */
    public long mo43147F() {
        long j = this.f13061d;
        if (j == -1) {
            return (long) this.f13060c;
        }
        return j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C8974c) {
            C8974c cVar = (C8974c) obj;
            if (((mo43146A() == null || !mo43146A().equals(cVar.mo43146A())) && (mo43146A() != null || cVar.mo43146A() != null)) || mo43147F() != cVar.mo43147F()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C9705n.m20260c(mo43146A(), Long.valueOf(mo43147F()));
    }

    @NonNull
    public final String toString() {
        C9705n.C9706a d = C9705n.m20261d(this);
        d.mo44228a(HintConstants.AUTOFILL_HINT_NAME, mo43146A());
        d.mo44228a("version", Long.valueOf(mo43147F()));
        return d.toString();
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 1, mo43146A(), false);
        C9883b.m20532l(parcel, 2, this.f13060c);
        C9883b.m20535o(parcel, 3, mo43147F());
        C9883b.m20522b(parcel, a);
    }

    public C8974c(@NonNull String str, long j) {
        this.f13059b = str;
        this.f13061d = j;
        this.f13060c = -1;
    }
}
