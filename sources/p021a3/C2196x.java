package p021a3;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C4537e;
import com.facebook.FacebookException;
import p021a3.C2166l;
import p198q2.C9138d0;
import p198q2.C9146f0;
import p198q2.C9157g;

/* renamed from: a3.x */
/* compiled from: WebViewLoginMethodHandler */
class C2196x extends C2195w {
    public static final Parcelable.Creator<C2196x> CREATOR = new C2198b();

    /* renamed from: e */
    private C9146f0 f968e;

    /* renamed from: f */
    private String f969f;

    /* renamed from: a3.x$a */
    /* compiled from: WebViewLoginMethodHandler */
    class C2197a implements C9146f0.C9154h {

        /* renamed from: a */
        final /* synthetic */ C2166l.C2170d f970a;

        C2197a(C2166l.C2170d dVar) {
            this.f970a = dVar;
        }

        /* renamed from: a */
        public void mo23483a(Bundle bundle, FacebookException facebookException) {
            C2196x.this.mo23481C(this.f970a, bundle, facebookException);
        }
    }

    /* renamed from: a3.x$b */
    /* compiled from: WebViewLoginMethodHandler */
    static class C2198b implements Parcelable.Creator<C2196x> {
        C2198b() {
        }

        /* renamed from: a */
        public C2196x createFromParcel(Parcel parcel) {
            return new C2196x(parcel);
        }

        /* renamed from: b */
        public C2196x[] newArray(int i) {
            return new C2196x[i];
        }
    }

    /* renamed from: a3.x$c */
    /* compiled from: WebViewLoginMethodHandler */
    static class C2199c extends C9146f0.C9152f {

        /* renamed from: h */
        private String f972h;

        /* renamed from: i */
        private String f973i;

        /* renamed from: j */
        private String f974j = "fbconnect://success";

        /* renamed from: k */
        private C2165k f975k = C2165k.NATIVE_WITH_FALLBACK;

        /* renamed from: l */
        private C2190s f976l = C2190s.FACEBOOK;

        /* renamed from: m */
        private boolean f977m = false;

        /* renamed from: n */
        private boolean f978n = false;

        public C2199c(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }

        /* renamed from: a */
        public C9146f0 mo23488a() {
            String str;
            Bundle f = mo43426f();
            f.putString("redirect_uri", this.f974j);
            f.putString("client_id", mo43423c());
            f.putString("e2e", this.f972h);
            if (this.f976l == C2190s.INSTAGRAM) {
                str = "token,signed_request,graph_domain,granted_scopes";
            } else {
                str = "token,signed_request,graph_domain";
            }
            f.putString("response_type", str);
            f.putString("return_scopes", "true");
            f.putString("auth_type", this.f973i);
            f.putString("login_behavior", this.f975k.name());
            if (this.f977m) {
                f.putString("fx_app", this.f976l.toString());
            }
            if (this.f978n) {
                f.putString("skip_dedupe", "true");
            }
            return C9146f0.m18710q(mo43424d(), "oauth", f, mo43427g(), this.f976l, mo43425e());
        }

        /* renamed from: i */
        public C2199c mo23489i(String str) {
            this.f973i = str;
            return this;
        }

        /* renamed from: j */
        public C2199c mo23490j(String str) {
            this.f972h = str;
            return this;
        }

        /* renamed from: k */
        public C2199c mo23491k(boolean z) {
            this.f977m = z;
            return this;
        }

        /* renamed from: l */
        public C2199c mo23492l(boolean z) {
            String str;
            if (z) {
                str = "fbconnect://chrome_os_success";
            } else {
                str = "fbconnect://success";
            }
            this.f974j = str;
            return this;
        }

        /* renamed from: m */
        public C2199c mo23493m(C2165k kVar) {
            this.f975k = kVar;
            return this;
        }

        /* renamed from: n */
        public C2199c mo23494n(C2190s sVar) {
            this.f976l = sVar;
            return this;
        }

        /* renamed from: o */
        public C2199c mo23495o(boolean z) {
            this.f978n = z;
            return this;
        }
    }

    C2196x(C2166l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo23481C(C2166l.C2170d dVar, Bundle bundle, FacebookException facebookException) {
        super.mo23480z(dVar, bundle, facebookException);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo23336b() {
        C9146f0 f0Var = this.f968e;
        if (f0Var != null) {
            f0Var.cancel();
            this.f968e = null;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo23275g() {
        return "web_view";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo23466k() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo23279p(C2166l.C2170d dVar) {
        Bundle s = mo23479s(dVar);
        C2197a aVar = new C2197a(dVar);
        String l = C2166l.m1597l();
        this.f969f = l;
        mo23463a("e2e", l);
        FragmentActivity i = this.f956c.mo23381i();
        this.f968e = new C2199c(i, dVar.mo23398a(), s).mo23490j(this.f969f).mo23492l(C9138d0.m18613O(i)).mo23489i(dVar.mo23400c()).mo23493m(dVar.mo23405g()).mo23494n(dVar.mo23406h()).mo23491k(dVar.mo23412o()).mo23495o(dVar.mo23397A()).mo43428h(aVar).mo23488a();
        C9157g gVar = new C9157g();
        gVar.setRetainInstance(true);
        gVar.mo43438m2(this.f968e);
        gVar.show(i.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f969f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C4537e mo23283x() {
        return C4537e.WEB_VIEW;
    }

    C2196x(Parcel parcel) {
        super(parcel);
        this.f969f = parcel.readString();
    }
}
