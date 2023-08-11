package p231t4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: t4.t */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C9725t extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C9725t> CREATOR = new C9738x();

    /* renamed from: b */
    private final int f14541b;

    /* renamed from: c */
    private List<C9702m> f14542c;

    public C9725t(int i, List<C9702m> list) {
        this.f14541b = i;
        this.f14542c = list;
    }

    /* renamed from: A */
    public final int mo44253A() {
        return this.f14541b;
    }

    @Nullable
    /* renamed from: F */
    public final List<C9702m> mo44254F() {
        return this.f14542c;
    }

    /* renamed from: G */
    public final void mo44255G(@NonNull C9702m mVar) {
        if (this.f14542c == null) {
            this.f14542c = new ArrayList();
        }
        this.f14542c.add(mVar);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 1, this.f14541b);
        C9883b.m20543w(parcel, 2, this.f14542c, false);
        C9883b.m20522b(parcel, a);
    }
}
