package android.support.p001v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0074a();

    /* renamed from: b */
    public int f121b;

    /* renamed from: c */
    public int f122c;

    /* renamed from: d */
    public int f123d;

    /* renamed from: e */
    public int f124e;

    /* renamed from: f */
    public int f125f;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    class C0074a implements Parcelable.Creator<ParcelableVolumeInfo> {
        C0074a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f121b = parcel.readInt();
        this.f123d = parcel.readInt();
        this.f124e = parcel.readInt();
        this.f125f = parcel.readInt();
        this.f122c = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121b);
        parcel.writeInt(this.f123d);
        parcel.writeInt(this.f124e);
        parcel.writeInt(this.f125f);
        parcel.writeInt(this.f122c);
    }
}
