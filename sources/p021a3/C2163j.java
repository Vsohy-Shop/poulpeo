package p021a3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookSdk;
import java.util.List;
import p021a3.C2166l;
import p198q2.C9145f;
import p198q2.C9196w;

/* renamed from: a3.j */
/* compiled from: KatanaProxyLoginMethodHandler */
class C2163j extends C2192t {
    public static final Parcelable.Creator<C2163j> CREATOR = new C2164a();

    /* renamed from: a3.j$a */
    /* compiled from: KatanaProxyLoginMethodHandler */
    static class C2164a implements Parcelable.Creator<C2163j> {
        C2164a() {
        }

        /* renamed from: a */
        public C2163j createFromParcel(Parcel parcel) {
            return new C2163j(parcel);
        }

        /* renamed from: b */
        public C2163j[] newArray(int i) {
            return new C2163j[i];
        }
    }

    C2163j(C2166l lVar) {
        super(lVar);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo23275g() {
        return "katana_proxy_auth";
    }

    /* renamed from: o */
    public boolean mo23278o() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo23279p(C2166l.C2170d dVar) {
        boolean z;
        C2165k g = dVar.mo23405g();
        if (!FacebookSdk.ignoreAppSwitchToLoggedOut || C9145f.m18694a() == null || !g.mo23359a()) {
            z = false;
        } else {
            z = true;
        }
        String l = C2166l.m1597l();
        List<Intent> p = C9196w.m18859p(this.f956c.mo23381i(), dVar.mo23398a(), dVar.mo23409l(), l, dVar.mo23414q(), dVar.mo23411n(), dVar.mo23401d(), mo23464f(dVar.mo23399b()), dVar.mo23400c(), z, dVar.mo23407i(), dVar.mo23410m(), dVar.mo23412o(), dVar.mo23397A());
        mo23463a("e2e", l);
        for (int i = 0; i < p.size(); i++) {
            if (mo23472A(p.get(i), C2166l.m1599q())) {
                return i + 1;
            }
        }
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    C2163j(Parcel parcel) {
        super(parcel);
    }
}
