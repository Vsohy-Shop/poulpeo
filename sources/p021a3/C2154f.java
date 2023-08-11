package p021a3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p021a3.C2166l;
import p198q2.C9196w;

/* renamed from: a3.f */
/* compiled from: FacebookLiteLoginMethodHandler */
class C2154f extends C2192t {
    public static final Parcelable.Creator<C2154f> CREATOR = new C2155a();

    /* renamed from: a3.f$a */
    /* compiled from: FacebookLiteLoginMethodHandler */
    static class C2155a implements Parcelable.Creator<C2154f> {
        C2155a() {
        }

        /* renamed from: a */
        public C2154f createFromParcel(Parcel parcel) {
            return new C2154f(parcel);
        }

        /* renamed from: b */
        public C2154f[] newArray(int i) {
            return new C2154f[i];
        }
    }

    C2154f(C2166l lVar) {
        super(lVar);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo23275g() {
        return "fb_lite_login";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo23279p(C2166l.C2170d dVar) {
        String l = C2166l.m1597l();
        Intent k = C9196w.m18854k(this.f956c.mo23381i(), dVar.mo23398a(), dVar.mo23409l(), l, dVar.mo23414q(), dVar.mo23411n(), dVar.mo23401d(), mo23464f(dVar.mo23399b()), dVar.mo23400c(), dVar.mo23407i(), dVar.mo23410m(), dVar.mo23412o(), dVar.mo23397A());
        mo23463a("e2e", l);
        return mo23472A(k, C2166l.m1599q()) ? 1 : 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    C2154f(Parcel parcel) {
        super(parcel);
    }
}
