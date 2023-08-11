package p072e3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p072e3.C7462e;

/* renamed from: e3.f */
/* compiled from: ShareOpenGraphContent */
public final class C7465f extends C7455a<C7465f, Object> {
    public static final Parcelable.Creator<C7465f> CREATOR = new C7466a();

    /* renamed from: h */
    private final C7462e f10349h;

    /* renamed from: i */
    private final String f10350i;

    /* renamed from: e3.f$a */
    /* compiled from: ShareOpenGraphContent */
    static class C7466a implements Parcelable.Creator<C7465f> {
        C7466a() {
        }

        /* renamed from: a */
        public C7465f createFromParcel(Parcel parcel) {
            return new C7465f(parcel);
        }

        /* renamed from: b */
        public C7465f[] newArray(int i) {
            return new C7465f[i];
        }
    }

    C7465f(Parcel parcel) {
        super(parcel);
        this.f10349h = new C7462e.C7464b().mo41159e(parcel).mo41158d();
        this.f10350i = parcel.readString();
    }

    @Nullable
    /* renamed from: d */
    public C7462e mo41162d() {
        return this.f10349h;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f10349h, 0);
        parcel.writeString(this.f10350i);
    }
}
