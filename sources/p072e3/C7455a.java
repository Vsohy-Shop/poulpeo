package p072e3;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p072e3.C7455a;
import p072e3.C7456b;

/* renamed from: e3.a */
/* compiled from: ShareContent */
public abstract class C7455a<P extends C7455a, E> implements Parcelable {

    /* renamed from: b */
    private final Uri f10336b;

    /* renamed from: c */
    private final List<String> f10337c;

    /* renamed from: d */
    private final String f10338d;

    /* renamed from: e */
    private final String f10339e;

    /* renamed from: f */
    private final String f10340f;

    /* renamed from: g */
    private final C7456b f10341g;

    protected C7455a(Parcel parcel) {
        this.f10336b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f10337c = m14617c(parcel);
        this.f10338d = parcel.readString();
        this.f10339e = parcel.readString();
        this.f10340f = parcel.readString();
        this.f10341g = new C7456b.C7458b().mo41144c(parcel).mo41143b();
    }

    /* renamed from: c */
    private List<String> m14617c(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.size() == 0) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Nullable
    /* renamed from: a */
    public Uri mo41132a() {
        return this.f10336b;
    }

    @Nullable
    /* renamed from: b */
    public C7456b mo41133b() {
        return this.f10341g;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f10336b, 0);
        parcel.writeStringList(this.f10337c);
        parcel.writeString(this.f10338d);
        parcel.writeString(this.f10339e);
        parcel.writeString(this.f10340f);
        parcel.writeParcelable(this.f10341g, 0);
    }
}
