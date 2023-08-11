package p072e3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e3.b */
/* compiled from: ShareHashtag */
public class C7456b implements Parcelable {
    public static final Parcelable.Creator<C7456b> CREATOR = new C7457a();

    /* renamed from: b */
    private final String f10342b;

    /* renamed from: e3.b$a */
    /* compiled from: ShareHashtag */
    static class C7457a implements Parcelable.Creator<C7456b> {
        C7457a() {
        }

        /* renamed from: a */
        public C7456b createFromParcel(Parcel parcel) {
            return new C7456b(parcel);
        }

        /* renamed from: b */
        public C7456b[] newArray(int i) {
            return new C7456b[i];
        }
    }

    /* renamed from: e3.b$b */
    /* compiled from: ShareHashtag */
    public static class C7458b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f10343a;

        /* renamed from: b */
        public C7456b mo41143b() {
            return new C7456b(this, (C7457a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C7458b mo41144c(Parcel parcel) {
            return mo41145d((C7456b) parcel.readParcelable(C7456b.class.getClassLoader()));
        }

        /* renamed from: d */
        public C7458b mo41145d(C7456b bVar) {
            if (bVar == null) {
                return this;
            }
            return mo41146e(bVar.mo41136a());
        }

        /* renamed from: e */
        public C7458b mo41146e(String str) {
            this.f10343a = str;
            return this;
        }
    }

    /* synthetic */ C7456b(C7458b bVar, C7457a aVar) {
        this(bVar);
    }

    /* renamed from: a */
    public String mo41136a() {
        return this.f10342b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10342b);
    }

    private C7456b(C7458b bVar) {
        this.f10342b = bVar.f10343a;
    }

    C7456b(Parcel parcel) {
        this.f10342b = parcel.readString();
    }
}
