package p352hc;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.rmn.iosadapters.android.content.ContextContainer;
import org.json.JSONException;
import org.json.JSONObject;
import p446vd.C13621b;
import p446vd.C13628i;
import p446vd.C13633n;
import p446vd.C13636q;

/* renamed from: hc.b */
/* compiled from: AppUpdater */
public class C12055b {

    /* renamed from: a */
    private String f18857a;

    /* renamed from: b */
    private String f18858b;

    /* renamed from: c */
    private ContextContainer f18859c;

    /* renamed from: d */
    private C12056c f18860d;

    /* renamed from: e */
    private boolean f18861e = false;

    public C12055b(ContextContainer contextContainer, C12056c cVar) {
        if (contextContainer == null) {
            throw new IllegalArgumentException();
        } else if (cVar != null) {
            this.f18859c = contextContainer;
            this.f18860d = cVar;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    private boolean m26228b(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return !C13621b.m31096j(str, C13621b.m31090d(this.f18859c));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (p446vd.C13636q.m31181b(r4.f18859c).mo53294e("MR_app_updater_popup_shown", false) == false) goto L_0x0012;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26229c(boolean r5) {
        /*
            r4 = this;
            java.lang.String r0 = "MR_app_updater_popup_shown"
            r1 = 1
            if (r5 != 0) goto L_0x0012
            com.rmn.iosadapters.android.content.ContextContainer r2 = r4.f18859c
            vd.q r2 = p446vd.C13636q.m31181b(r2)
            r3 = 0
            boolean r2 = r2.mo53294e(r0, r3)
            if (r2 != 0) goto L_0x0013
        L_0x0012:
            r3 = r1
        L_0x0013:
            if (r3 == 0) goto L_0x0023
            com.rmn.iosadapters.android.content.ContextContainer r2 = r4.f18859c
            vd.q r2 = p446vd.C13636q.m31181b(r2)
            r2.mo53299j(r0, r1)
            hc.c r0 = r4.f18860d
            r0.mo49461a(r5)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p352hc.C12055b.m26229c(boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m26230d(@Nullable String str) {
        if (str != null && !str.equals("")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f18857a = jSONObject.optString("force");
                this.f18858b = jSONObject.optString("advise");
                m26231f();
                String optString = jSONObject.optString("minSdkVersion", "");
                if (optString.isEmpty() || !C13621b.m31094h(optString) || this.f18860d == null) {
                    return;
                }
                if (!m26228b(this.f18857a)) {
                    m26229c(true);
                } else if (!m26228b(this.f18858b)) {
                    m26229c(false);
                }
            } catch (JSONException e) {
                C13633n.m31165u(this, e);
            }
        }
    }

    /* renamed from: f */
    private void m26231f() {
        String str = this.f18857a;
        if (str == null || str.equals("")) {
            C13636q.m31181b(this.f18859c).mo53293d("MR_app_updater_force_version");
        } else {
            C13636q.m31181b(this.f18859c).mo53303n("MR_app_updater_force_version", this.f18857a);
        }
        String str2 = this.f18858b;
        if (str2 == null || str2.equals("")) {
            C13636q.m31181b(this.f18859c).mo53293d("MR_app_updater_advise_version");
            return;
        }
        String i = C13636q.m31181b(this.f18859c).mo53298i("MR_app_updater_advise_version", (String) null);
        if (i == null || C13621b.m31096j(this.f18858b, i)) {
            C13636q.m31181b(this.f18859c).mo53299j("MR_app_updater_popup_shown", false);
        }
        C13636q.m31181b(this.f18859c).mo53303n("MR_app_updater_advise_version", this.f18858b);
    }

    /* renamed from: e */
    public void mo49497e() {
        if (this.f18861e) {
            C13633n.m31152h("AppUpdater instance can be used once, create a new instance to retrieve the app version from the server");
            return;
        }
        this.f18861e = true;
        if (!m26228b(C13636q.m31181b(this.f18859c).mo53298i("MR_app_updater_force_version", (String) null))) {
            m26229c(true);
            this.f18860d = null;
        }
        C13628i.m31123f(3600, new C12054a(this), "update");
    }
}
