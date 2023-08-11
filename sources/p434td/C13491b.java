package p434td;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.utils_common.IListener;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Set;
import p305ad.C10863b;
import p305ad.C10864c;
import p440ud.C13548a;
import p440ud.C13558g;
import p440ud.C13560h;
import p440ud.C13573q;
import p440ud.C13574r;
import p440ud.C13577s;

/* renamed from: td.b */
/* compiled from: WebViewReloadController */
public class C13491b extends C10863b implements C13574r.C13576b {
    @NonNull

    /* renamed from: c */
    private final C13577s f21665c;
    @NonNull

    /* renamed from: d */
    private final C13558g f21666d;
    @NonNull

    /* renamed from: e */
    private final C13574r f21667e;
    @NonNull

    /* renamed from: f */
    private final C13548a f21668f;
    @NonNull

    /* renamed from: g */
    private final C13560h f21669g;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: h */
    public String f21670h;
    @Nullable

    /* renamed from: i */
    private String f21671i;
    @Nullable

    /* renamed from: j */
    private HttpMethod f21672j;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: k */
    public String f21673k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f21674l = false;
    @Nullable

    /* renamed from: m */
    private WeakReference<C13493c> f21675m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f21676n = false;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: o */
    public String[] f21677o = null;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: p */
    public String[] f21678p = null;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: q */
    public Set<String> f21679q = null;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: r */
    public IListener<String> f21680r = null;

    /* renamed from: td.b$a */
    /* compiled from: WebViewReloadController */
    class C13492a implements C13577s.C13579b {
        C13492a() {
        }

        /* renamed from: a */
        public void mo53110a(C13577s sVar, String str) {
            if (C13491b.this.f21673k == null) {
                C13491b bVar = C13491b.this;
                boolean z = true;
                bVar.f21676n = !bVar.f21674l;
                C13491b bVar2 = C13491b.this;
                if (bVar2.f21674l || C13491b.this.f21670h.equals("about:blank")) {
                    z = false;
                }
                bVar2.mo53105G2(false, z);
                C13493c u2 = C13491b.this.m30747w2();
                if (u2 != null) {
                    u2.mo53117d(C13491b.this, sVar, str);
                }
            }
        }

        /* renamed from: b */
        public void mo53111b(C13577s sVar, String str) {
            if (C13491b.this.f21673k == null) {
                if (!C13491b.this.f21670h.equals("about:blank")) {
                    C13491b.this.mo53105G2(true, true);
                }
                C13493c u2 = C13491b.this.m30747w2();
                if (u2 != null) {
                    u2.mo53114a(C13491b.this, sVar, str);
                }
            }
        }

        /* renamed from: c */
        public boolean mo53112c(C13577s sVar, String str) {
            if (str.startsWith("about:blank")) {
                return false;
            }
            if (str.startsWith(ProxyConfig.MATCH_HTTP) || str.startsWith("https") || str.startsWith("about")) {
                if (C13491b.this.f21679q != null) {
                    for (String contains : C13491b.this.f21679q) {
                        if (str.contains(contains)) {
                            if (C13491b.this.f21680r != null) {
                                C13491b.this.f21680r.mo40744J0(str);
                            }
                            return true;
                        }
                    }
                }
                if (C13491b.this.f21677o != null) {
                    for (String contains2 : C13491b.this.f21677o) {
                        if (!str.contains(contains2)) {
                            return true;
                        }
                    }
                }
                if (C13491b.this.f21678p != null) {
                    for (String contains3 : C13491b.this.f21678p) {
                        if (str.contains(contains3)) {
                            return true;
                        }
                    }
                }
                return false;
            } else if (sVar.mo53252u()) {
                return true;
            } else {
                if (C13491b.this.f21680r != null) {
                    C13491b.this.f21680r.mo40744J0(str);
                }
                return false;
            }
        }

        /* renamed from: d */
        public void mo53113d(C13577s sVar, int i, String str, String str2) {
            if (C13491b.this.f21673k == null) {
                C13491b.this.f21674l = true;
                C13491b.this.f21676n = false;
                C13491b.this.mo53105G2(false, false);
                C13493c u2 = C13491b.this.m30747w2();
                if (u2 != null) {
                    u2.mo53116c(C13491b.this, str2);
                }
            }
        }
    }

    public C13491b(@NonNull C13577s sVar, @NonNull C13558g gVar, @NonNull C13574r rVar, @NonNull C13548a aVar, @NonNull C13560h hVar) {
        super((C10864c) null);
        this.f21665c = sVar;
        this.f21666d = gVar;
        this.f21667e = rVar;
        this.f21668f = aVar;
        this.f21669g = hVar;
        aVar.mo53229f(this);
        sVar.mo53257z(new C13492a());
        C13573q qVar = C13573q.GONE;
        gVar.mo53230g(qVar);
        rVar.mo53230g(qVar);
        hVar.mo53230g(qVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public C13493c m30747w2() {
        WeakReference<C13493c> weakReference = this.f21675m;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: A2 */
    public void mo53099A2() {
        this.f21674l = false;
        mo53105G2(true, true);
        this.f21665c.mo53256y();
    }

    /* renamed from: B2 */
    public void mo53100B2(String[] strArr) {
        this.f21678p = (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    /* renamed from: C2 */
    public void mo53101C2(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f21673k = str;
        }
    }

    /* renamed from: D2 */
    public void mo53102D2(String str, String str2, HttpMethod httpMethod) {
        if (TextUtils.isEmpty(str)) {
            this.f21670h = "about:blank";
            return;
        }
        this.f21670h = str;
        this.f21671i = str2;
        this.f21672j = httpMethod;
    }

    /* renamed from: E */
    public void mo49068E(C13574r rVar) {
        if (rVar != this.f21668f) {
            return;
        }
        if (TextUtils.isEmpty(this.f21670h)) {
            mo53099A2();
        } else {
            mo53109z2();
        }
    }

    /* renamed from: E2 */
    public void mo53103E2(String[] strArr) {
        this.f21677o = (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    /* renamed from: F2 */
    public void mo53104F2(float f) {
        if (this.f21676n && !this.f21669g.mo53245c()) {
            this.f21669g.mo53230g(C13573q.VISIBLE);
        }
        this.f21669g.mo53208j(f);
        if (f >= 1.0f) {
            this.f21669g.mo53230g(C13573q.GONE);
            this.f21669g.mo53210l();
        }
    }

    /* renamed from: G2 */
    public void mo53105G2(boolean z, boolean z2) {
        C13558g gVar = this.f21666d;
        C13573q qVar = C13573q.GONE;
        gVar.mo53230g(qVar);
        this.f21666d.mo53205l();
        this.f21667e.mo53230g(qVar);
        this.f21669g.mo53230g(qVar);
        this.f21669g.mo53210l();
        this.f21669g.mo53208j(0.0f);
        if (z) {
            if (this.f21676n) {
                this.f21669g.mo53230g(C13573q.VISIBLE);
                this.f21669g.mo53209k();
                return;
            }
            this.f21666d.mo53230g(C13573q.VISIBLE);
            this.f21666d.mo53204k(500);
        } else if (!z2) {
            this.f21667e.mo53230g(C13573q.VISIBLE);
        }
    }

    /* renamed from: v2 */
    public boolean mo53106v2() {
        return this.f21665c.mo53250n();
    }

    /* renamed from: x2 */
    public void mo53107x2() {
        this.f21665c.mo53251p();
    }

    /* renamed from: y2 */
    public boolean mo53108y2() {
        return this.f21674l;
    }

    /* renamed from: z2 */
    public void mo53109z2() {
        String str = this.f21673k;
        if (str != null) {
            this.f21665c.mo53253v(str);
            mo53105G2(false, true);
            return;
        }
        C13493c w2 = m30747w2();
        if (w2 == null || !w2.mo53115b(this)) {
            this.f21674l = false;
            String str2 = this.f21670h;
            if (str2 == null || str2.equals("")) {
                if (w2 != null) {
                    w2.mo53116c(this, "");
                }
                mo53105G2(false, false);
                return;
            }
            HttpMethod httpMethod = this.f21672j;
            if (httpMethod == HttpMethod.POST) {
                this.f21665c.mo53255x(this.f21670h, this.f21671i);
            } else if (httpMethod == HttpMethod.GET) {
                if (!TextUtils.isEmpty(this.f21671i)) {
                    if (!this.f21670h.contains("?") && !this.f21671i.startsWith("?")) {
                        this.f21671i = "?" + this.f21671i;
                    }
                    this.f21670h += this.f21671i;
                }
                this.f21665c.mo53254w(this.f21670h);
            }
        } else {
            mo53105G2(true, false);
        }
    }
}
