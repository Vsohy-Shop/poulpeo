package p072e3;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* renamed from: e3.i */
/* compiled from: SharePhoto */
public final class C7471i extends C7461d {
    public static final Parcelable.Creator<C7471i> CREATOR = new C7472a();

    /* renamed from: c */
    private final Bitmap f10353c;

    /* renamed from: d */
    private final Uri f10354d;

    /* renamed from: e */
    private final boolean f10355e;

    /* renamed from: f */
    private final String f10356f;

    /* renamed from: e3.i$a */
    /* compiled from: SharePhoto */
    static class C7472a implements Parcelable.Creator<C7471i> {
        C7472a() {
        }

        /* renamed from: a */
        public C7471i createFromParcel(Parcel parcel) {
            return new C7471i(parcel);
        }

        /* renamed from: b */
        public C7471i[] newArray(int i) {
            return new C7471i[i];
        }
    }

    C7471i(Parcel parcel) {
        super(parcel);
        boolean z;
        this.f10353c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f10354d = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f10355e = z;
        this.f10356f = parcel.readString();
    }

    @Nullable
    /* renamed from: a */
    public Uri mo41179a() {
        return this.f10354d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f10353c, 0);
        parcel.writeParcelable(this.f10354d, 0);
        parcel.writeByte(this.f10355e ? (byte) 1 : 0);
        parcel.writeString(this.f10356f);
    }
}
