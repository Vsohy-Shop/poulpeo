package p021a3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C4537e;
import p021a3.C2166l;
import p198q2.C9196w;

/* renamed from: a3.i */
/* compiled from: InstagramAppLoginMethodHandler */
class C2161i extends C2192t {
    public static final Parcelable.Creator<C2161i> CREATOR = new C2162a();

    /* renamed from: a3.i$a */
    /* compiled from: InstagramAppLoginMethodHandler */
    static class C2162a implements Parcelable.Creator {
        C2162a() {
        }

        /* renamed from: a */
        public C2161i createFromParcel(Parcel parcel) {
            return new C2161i(parcel);
        }

        /* renamed from: b */
        public C2161i[] newArray(int i) {
            return new C2161i[i];
        }
    }

    C2161i(C2166l lVar) {
        super(lVar);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo23275g() {
        return "instagram_login";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo23279p(C2166l.C2170d dVar) {
        String l = C2166l.m1597l();
        Intent l2 = C9196w.m18855l(this.f956c.mo23381i(), dVar.mo23398a(), dVar.mo23409l(), l, dVar.mo23414q(), dVar.mo23411n(), dVar.mo23401d(), mo23464f(dVar.mo23399b()), dVar.mo23400c(), dVar.mo23407i(), dVar.mo23410m(), dVar.mo23412o(), dVar.mo23397A());
        mo23463a("e2e", l);
        return mo23472A(l2, C2166l.m1599q()) ? 1 : 0;
    }

    /* renamed from: w */
    public C4537e mo23349w() {
        return C4537e.INSTAGRAM_APPLICATION_WEB;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    C2161i(Parcel parcel) {
        super(parcel);
    }
}
