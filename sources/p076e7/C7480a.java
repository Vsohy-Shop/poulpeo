package p076e7;

import android.text.TextUtils;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p064d7.C7283f;
import p222s6.C9511f;
import p255v6.C10000m;
import p299z6.C10825a;
import p299z6.C10826b;
import p299z6.C10827c;

/* renamed from: e7.a */
/* compiled from: DefaultSettingsSpiCall */
public class C7480a implements C7481b {

    /* renamed from: a */
    private final String f10362a;

    /* renamed from: b */
    private final C10826b f10363b;

    /* renamed from: c */
    private final C9511f f10364c;

    public C7480a(String str, C10826b bVar) {
        this(str, bVar, C9511f.m19696f());
    }

    /* renamed from: b */
    private C10825a m14657b(C10825a aVar, C7283f fVar) {
        m14658c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", fVar.f10029a);
        m14658c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", SystemMediaRouteProvider.PACKAGE_NAME);
        m14658c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", C10000m.m20922i());
        m14658c(aVar, "Accept", "application/json");
        m14658c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", fVar.f10030b);
        m14658c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", fVar.f10031c);
        m14658c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", fVar.f10032d);
        m14658c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", fVar.f10033e.mo44604a());
        return aVar;
    }

    /* renamed from: c */
    private void m14658c(C10825a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.mo45774d(str, str2);
        }
    }

    /* renamed from: e */
    private JSONObject m14659e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            C9511f fVar = this.f10364c;
            fVar.mo43974l("Failed to parse settings JSON from " + this.f10362a, e);
            C9511f fVar2 = this.f10364c;
            fVar2.mo43973k("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    private Map<String, String> m14660f(C7283f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", fVar.f10036h);
        hashMap.put("display_version", fVar.f10035g);
        hashMap.put(APIParams.SOURCE, Integer.toString(fVar.f10037i));
        String str = fVar.f10034f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: a */
    public JSONObject mo41188a(C7283f fVar, boolean z) {
        if (z) {
            try {
                Map<String, String> f = m14660f(fVar);
                C10825a b = m14657b(mo41189d(f), fVar);
                C9511f fVar2 = this.f10364c;
                fVar2.mo43965b("Requesting settings from " + this.f10362a);
                C9511f fVar3 = this.f10364c;
                fVar3.mo43971i("Settings query params were: " + f);
                return mo41190g(b.mo45773c());
            } catch (IOException e) {
                this.f10364c.mo43968e("Settings request failed.", e);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10825a mo41189d(Map<String, String> map) {
        C10825a a = this.f10363b.mo45775a(this.f10362a, map);
        return a.mo45774d("User-Agent", "Crashlytics Android SDK/" + C10000m.m20922i()).mo45774d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public JSONObject mo41190g(C10827c cVar) {
        int b = cVar.mo45777b();
        C9511f fVar = this.f10364c;
        fVar.mo43971i("Settings response code was: " + b);
        if (mo41191h(b)) {
            return m14659e(cVar.mo45776a());
        }
        C9511f fVar2 = this.f10364c;
        fVar2.mo43967d("Settings request failed; (status: " + b + ") from " + this.f10362a);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo41191h(int i) {
        if (i == 200 || i == 201 || i == 202 || i == 203) {
            return true;
        }
        return false;
    }

    C7480a(String str, C10826b bVar, C9511f fVar) {
        if (str != null) {
            this.f10364c = fVar;
            this.f10363b = bVar;
            this.f10362a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
