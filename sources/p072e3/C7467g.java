package p072e3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e3.g */
/* compiled from: ShareOpenGraphObject */
public final class C7467g extends C7469h<C7467g, Object> {
    public static final Parcelable.Creator<C7467g> CREATOR = new C7468a();

    /* renamed from: e3.g$a */
    /* compiled from: ShareOpenGraphObject */
    static class C7468a implements Parcelable.Creator<C7467g> {
        C7468a() {
        }

        /* renamed from: a */
        public C7467g createFromParcel(Parcel parcel) {
            return new C7467g(parcel);
        }

        /* renamed from: b */
        public C7467g[] newArray(int i) {
            return new C7467g[i];
        }
    }

    C7467g(Parcel parcel) {
        super(parcel);
    }
}
