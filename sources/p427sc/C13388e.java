package p427sc;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p415qc.C13236a;
import p415qc.C13238c;
import p415qc.C13241f;
import p415qc.C13242g;
import p446vd.C13633n;

/* renamed from: sc.e */
/* compiled from: CTTrackingCommandDefault */
public abstract class C13388e extends C13241f {

    /* renamed from: b */
    private Map<C13238c, Object> f21452b = new HashMap();

    /* renamed from: sc.e$a */
    /* compiled from: CTTrackingCommandDefault */
    class C13389a extends Thread {

        /* renamed from: b */
        final /* synthetic */ C13236a f21453b;

        C13389a(C13236a aVar) {
            this.f21453b = aVar;
        }

        public void run() {
            HttpURLConnection httpURLConnection;
            super.run();
            try {
                URL b = this.f21453b.mo52878b();
                try {
                    httpURLConnection = (HttpURLConnection) b.openConnection();
                } catch (Exception e) {
                    C13633n.m31165u(C13388e.this, e);
                    httpURLConnection = null;
                }
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.connect();
                        int responseCode = httpURLConnection.getResponseCode();
                        C13388e eVar = C13388e.this;
                        C13633n.m31155k(eVar, "The tracking has been sent [http = " + responseCode + "] :");
                        C13633n.m31155k(C13388e.this, b.toString());
                    } catch (Exception e2) {
                        C13633n.m31165u(C13388e.this, e2);
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        throw th;
                    }
                    httpURLConnection.disconnect();
                }
            } catch (Exception e3) {
                C13633n.m31165u(C13388e.this, e3);
            }
        }
    }

    public C13388e() {
        HashSet hashSet = new HashSet();
        hashSet.add(C13242g.f21096h);
        hashSet.add(C13242g.f21095g);
        mo52895f(hashSet);
    }

    /* renamed from: h */
    private void m30461h() {
        if (mo52893d(this.f21452b.keySet())) {
            for (Map.Entry next : this.f21452b.entrySet()) {
                C13238c cVar = (C13238c) next.getKey();
                Object value = next.getValue();
                if (value == null) {
                    throw new IllegalStateException("The value is null for the param : " + cVar.mo52882b());
                } else if (!cVar.mo52883c(value.getClass())) {
                    throw new IllegalStateException("The type of the value (" + value.getClass().getSimpleName() + ") does not fit the param : " + cVar.mo52882b());
                }
            }
            return;
        }
        throw new IllegalStateException("Some required params are missing");
    }

    /* renamed from: a */
    public final C13241f mo52890a(C13238c cVar, Object obj) {
        if (cVar == null) {
            throw new IllegalArgumentException();
        } else if (obj == null) {
            return this;
        } else {
            this.f21452b.put(cVar, obj);
            return this;
        }
    }

    /* renamed from: b */
    public final C13241f mo52891b(Map<C13238c, Object> map) {
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                Object value = next.getValue();
                if (value != null) {
                    this.f21452b.put((C13238c) next.getKey(), value);
                }
            }
            return this;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public final void mo52896g(String str, boolean z) {
        try {
            mo53005i();
        } catch (Exception e) {
            C13633n.m31165u(this, e);
        }
        m30461h();
        C13236a aVar = new C13236a(str);
        for (Map.Entry next : this.f21452b.entrySet()) {
            C13238c cVar = (C13238c) next.getKey();
            Object value = next.getValue();
            if (value != null) {
                String b = cVar.mo52882b();
                if (cVar.equals(C13242g.f21087R)) {
                    for (Object a : (List) value) {
                        try {
                            aVar.mo52877a(b, cVar.mo52881a(a));
                        } catch (Exception e2) {
                            C13633n.m31164t(this, "Param " + b + " removed from tracking", e2);
                        }
                    }
                } else {
                    try {
                        aVar.mo52877a(b, cVar.mo52881a(value));
                    } catch (Exception e3) {
                        C13633n.m31164t(this, "Param " + b + " removed from tracking", e3);
                    }
                }
            } else {
                throw new IllegalStateException("Value is null in values to send");
            }
        }
        if (z) {
            C13633n.m31159o(this, "The tracking has been opted out :");
            try {
                C13633n.m31159o(this, aVar.mo52878b().toString());
            } catch (Exception e4) {
                C13633n.m31165u(this, e4);
            }
        } else {
            C13389a aVar2 = new C13389a(aVar);
            aVar2.setPriority(1);
            aVar2.start();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo53005i();
}
