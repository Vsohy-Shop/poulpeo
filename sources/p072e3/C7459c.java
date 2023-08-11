package p072e3;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* renamed from: e3.c */
/* compiled from: ShareLinkContent */
public final class C7459c extends C7455a<C7459c, Object> {
    public static final Parcelable.Creator<C7459c> CREATOR = new C7460a();
    @Deprecated

    /* renamed from: h */
    private final String f10344h;
    @Deprecated

    /* renamed from: i */
    private final String f10345i;
    @Deprecated

    /* renamed from: j */
    private final Uri f10346j;

    /* renamed from: k */
    private final String f10347k;

    /* renamed from: e3.c$a */
    /* compiled from: ShareLinkContent */
    static class C7460a implements Parcelable.Creator<C7459c> {
        C7460a() {
        }

        /* renamed from: a */
        public C7459c createFromParcel(Parcel parcel) {
            return new C7459c(parcel);
        }

        /* renamed from: b */
        public C7459c[] newArray(int i) {
            return new C7459c[i];
        }
    }

    C7459c(Parcel parcel) {
        super(parcel);
        this.f10344h = parcel.readString();
        this.f10345i = parcel.readString();
        this.f10346j = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f10347k = parcel.readString();
    }

    @Nullable
    /* renamed from: d */
    public String mo41147d() {
        return this.f10347k;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f10344h);
        parcel.writeString(this.f10345i);
        parcel.writeParcelable(this.f10346j, 0);
        parcel.writeString(this.f10347k);
    }
}
