package p021a3;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.Nullable;
import com.facebook.C4537e;
import com.facebook.FacebookException;
import p021a3.C2166l;
import p198q2.C9138d0;
import p198q2.C9212z;

/* renamed from: a3.t */
/* compiled from: NativeAppLoginMethodHandler */
abstract class C2192t extends C2188q {
    C2192t(C2166l lVar) {
        super(lVar);
    }

    /* renamed from: q */
    private void m1729q(@Nullable C2166l.C2172e eVar) {
        if (eVar != null) {
            this.f956c.mo23380g(eVar);
        } else {
            this.f956c.mo23372H();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public boolean mo23472A(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            this.f956c.mo23383m().startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo23276l(int i, int i2, Intent intent) {
        C2166l.C2170d s = this.f956c.mo23386s();
        if (intent == null) {
            m1729q(C2166l.C2172e.m1655a(s, "Operation canceled"));
        } else if (i2 == 0) {
            mo23475x(s, intent);
        } else {
            String str = null;
            if (i2 != -1) {
                m1729q(C2166l.C2172e.m1657c(s, "Unexpected resultCode from authorization.", (String) null));
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    m1729q(C2166l.C2172e.m1657c(s, "Unexpected null from returned authorization data.", (String) null));
                    return true;
                }
                String s2 = mo23473s(extras);
                if (extras.get("error_code") != null) {
                    str = extras.get("error_code").toString();
                }
                String v = mo23474v(extras);
                String string = extras.getString("e2e");
                if (!C9138d0.m18618T(string)) {
                    mo23465i(string);
                }
                if (s2 == null && str == null && v == null) {
                    mo23477z(s, extras);
                } else {
                    mo23476y(s, s2, v, str);
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: s */
    public String mo23473s(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString(MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
        if (string == null) {
            return bundle.getString("error_type");
        }
        return string;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: v */
    public String mo23474v(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_message");
        if (string == null) {
            return bundle.getString("error_description");
        }
        return string;
    }

    /* renamed from: w */
    public C4537e mo23349w() {
        return C4537e.FACEBOOK_APPLICATION_WEB;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo23475x(C2166l.C2170d dVar, Intent intent) {
        String str;
        Bundle extras = intent.getExtras();
        String s = mo23473s(extras);
        if (extras.get("error_code") != null) {
            str = extras.get("error_code").toString();
        } else {
            str = null;
        }
        if (C9212z.m18910c().equals(str)) {
            m1729q(C2166l.C2172e.m1658d(dVar, s, mo23474v(extras), str));
        }
        m1729q(C2166l.C2172e.m1655a(dVar, s));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo23476y(C2166l.C2170d dVar, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (str != null && str.equals("logged_out")) {
            C2137a.f818h = true;
            m1729q((C2166l.C2172e) null);
        } else if (C9212z.m18911d().contains(str)) {
            m1729q((C2166l.C2172e) null);
        } else if (C9212z.m18912e().contains(str)) {
            m1729q(C2166l.C2172e.m1655a(dVar, (String) null));
        } else {
            m1729q(C2166l.C2172e.m1658d(dVar, str, str2, str3));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo23477z(C2166l.C2170d dVar, Bundle bundle) {
        try {
            m1729q(C2166l.C2172e.m1656b(dVar, C2188q.m1711d(dVar.mo23409l(), bundle, mo23349w(), dVar.mo23398a()), C2188q.m1712e(bundle, dVar.mo23408k())));
        } catch (FacebookException e) {
            m1729q(C2166l.C2172e.m1657c(dVar, (String) null, e.getMessage()));
        }
    }

    C2192t(Parcel parcel) {
        super(parcel);
    }
}
