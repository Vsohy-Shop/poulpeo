package p232t5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import java.util.List;
import p190p4.C9056e;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: t5.h */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9751h extends C9882a implements C9056e {
    public static final Parcelable.Creator<C9751h> CREATOR = new C9752i();

    /* renamed from: b */
    private final List<String> f14559b;
    @Nullable

    /* renamed from: c */
    private final String f14560c;

    public C9751h(List<String> list, @Nullable String str) {
        this.f14559b = list;
        this.f14560c = str;
    }

    public final Status getStatus() {
        if (this.f14560c != null) {
            return Status.f4889g;
        }
        return Status.f4893k;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20541u(parcel, 1, this.f14559b, false);
        C9883b.m20539s(parcel, 2, this.f14560c, false);
        C9883b.m20522b(parcel, a);
    }
}
