package p021a3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.C4537e;
import com.facebook.FacebookException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p021a3.C2166l;
import p198q2.C9138d0;
import p198q2.C9208x;

/* renamed from: a3.h */
/* compiled from: GetTokenLoginMethodHandler */
class C2157h extends C2188q {
    public static final Parcelable.Creator<C2157h> CREATOR = new C2160c();

    /* renamed from: d */
    private C2156g f863d;

    /* renamed from: a3.h$a */
    /* compiled from: GetTokenLoginMethodHandler */
    class C2158a implements C9208x.C9210b {

        /* renamed from: a */
        final /* synthetic */ C2166l.C2170d f864a;

        C2158a(C2166l.C2170d dVar) {
            this.f864a = dVar;
        }

        /* renamed from: a */
        public void mo23341a(Bundle bundle) {
            C2157h.this.mo23339s(this.f864a, bundle);
        }
    }

    /* renamed from: a3.h$b */
    /* compiled from: GetTokenLoginMethodHandler */
    class C2159b implements C9138d0.C9139a {

        /* renamed from: a */
        final /* synthetic */ Bundle f866a;

        /* renamed from: b */
        final /* synthetic */ C2166l.C2170d f867b;

        C2159b(Bundle bundle, C2166l.C2170d dVar) {
            this.f866a = bundle;
            this.f867b = dVar;
        }

        /* renamed from: a */
        public void mo23342a(JSONObject jSONObject) {
            try {
                this.f866a.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
                C2157h.this.mo23340v(this.f867b, this.f866a);
            } catch (JSONException e) {
                C2166l lVar = C2157h.this.f956c;
                lVar.mo23379f(C2166l.C2172e.m1657c(lVar.mo23386s(), "Caught exception", e.getMessage()));
            }
        }

        /* renamed from: b */
        public void mo23343b(FacebookException facebookException) {
            C2166l lVar = C2157h.this.f956c;
            lVar.mo23379f(C2166l.C2172e.m1657c(lVar.mo23386s(), "Caught exception", facebookException.getMessage()));
        }
    }

    /* renamed from: a3.h$c */
    /* compiled from: GetTokenLoginMethodHandler */
    static class C2160c implements Parcelable.Creator {
        C2160c() {
        }

        /* renamed from: a */
        public C2157h createFromParcel(Parcel parcel) {
            return new C2157h(parcel);
        }

        /* renamed from: b */
        public C2157h[] newArray(int i) {
            return new C2157h[i];
        }
    }

    C2157h(C2166l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo23336b() {
        C2156g gVar = this.f863d;
        if (gVar != null) {
            gVar.mo43498b();
            this.f863d.mo43500f((C9208x.C9210b) null);
            this.f863d = null;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo23275g() {
        return "get_token";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo23279p(C2166l.C2170d dVar) {
        C2156g gVar = new C2156g(this.f956c.mo23381i(), dVar);
        this.f863d = gVar;
        if (!gVar.mo43501g()) {
            return 0;
        }
        this.f956c.mo23388x();
        this.f863d.mo43500f(new C2158a(dVar));
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo23338q(C2166l.C2170d dVar, Bundle bundle) {
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string == null || string.isEmpty()) {
            this.f956c.mo23388x();
            C9138d0.m18599A(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new C2159b(bundle, dVar));
            return;
        }
        mo23340v(dVar, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo23339s(C2166l.C2170d dVar, Bundle bundle) {
        C2156g gVar = this.f863d;
        if (gVar != null) {
            gVar.mo43500f((C9208x.C9210b) null);
        }
        this.f863d = null;
        this.f956c.mo23389y();
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> l = dVar.mo23409l();
            if (stringArrayList == null || (l != null && !stringArrayList.containsAll(l))) {
                HashSet hashSet = new HashSet();
                for (String next : l) {
                    if (!stringArrayList.contains(next)) {
                        hashSet.add(next);
                    }
                }
                if (!hashSet.isEmpty()) {
                    mo23463a("new_permissions", TextUtils.join(",", hashSet));
                }
                dVar.mo23417w(hashSet);
            } else {
                mo23338q(dVar, bundle);
                return;
            }
        }
        this.f956c.mo23372H();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo23340v(C2166l.C2170d dVar, Bundle bundle) {
        this.f956c.mo23380g(C2166l.C2172e.m1659e(this.f956c.mo23386s(), C2188q.m1710c(bundle, C4537e.FACEBOOK_APPLICATION_SERVICE, dVar.mo23398a())));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    C2157h(Parcel parcel) {
        super(parcel);
    }
}
