package com.rmn.api.p322v2.main.oauth;

import com.rmn.api.p322v2.main.debug.DebugRequestManager;
import com.rmn.api.p322v2.main.general.IApiType;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import p382lc.C12818a;
import p446vd.C13630k;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.main.oauth.b */
/* compiled from: AsyncTaskRequest */
class C11366b extends C12818a {

    /* renamed from: d */
    protected final HttpMethod f17881d;

    /* renamed from: e */
    private OkHttpClient.Builder f17882e;

    /* renamed from: f */
    private Request.Builder f17883f;

    /* renamed from: g */
    private Call f17884g;

    /* renamed from: h */
    private Response f17885h;

    /* renamed from: i */
    private Interceptor f17886i;

    /* renamed from: j */
    protected final ContextContainer f17887j;

    /* renamed from: k */
    protected final BundleRequest f17888k;

    /* renamed from: l */
    private boolean f17889l = false;

    /* renamed from: m */
    private boolean f17890m;

    /* renamed from: n */
    private Set<IAsyncTaskRequestsListener> f17891n = new HashSet();

    /* renamed from: o */
    protected boolean f17892o = false;

    /* renamed from: p */
    protected int f17893p = -1;

    /* renamed from: q */
    protected String f17894q = null;

    /* renamed from: com.rmn.api.v2.main.oauth.b$a */
    /* compiled from: AsyncTaskRequest */
    class C11367a extends C12818a {

        /* renamed from: d */
        final /* synthetic */ IAsyncTaskRequestsListener f17895d;

        C11367a(IAsyncTaskRequestsListener iAsyncTaskRequestsListener) {
            this.f17895d = iAsyncTaskRequestsListener;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public boolean mo46874d() {
            try {
                IAsyncTaskRequestsListener iAsyncTaskRequestsListener = this.f17895d;
                C11366b bVar = C11366b.this;
                return iAsyncTaskRequestsListener.onRequestSucceededOutsideUIThread(bVar.f17888k, bVar.f17894q);
            } catch (Exception e) {
                C13633n.m31165u(C11366b.class, e);
                return false;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo46875h(boolean z) {
            this.f17895d.onRequestSucceededInsideUIThread(C11366b.this.f17888k, z);
        }
    }

    public C11366b(ContextContainer contextContainer, BundleRequest bundleRequest, HttpMethod httpMethod, boolean z) {
        if (bundleRequest != null) {
            this.f17887j = contextContainer;
            this.f17888k = bundleRequest;
            this.f17881d = httpMethod;
            this.f17890m = z;
            this.f17886i = new UserAgentInterceptor(contextContainer);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo46874d() {
        if (DebugRequestManager.ENABLED) {
            mo47093m("DebugRequestManager");
            String fakeResponse = DebugRequestManager.getInstance().getFakeResponse(this.f17888k);
            this.f17894q = fakeResponse;
            if (fakeResponse != null) {
                return true;
            }
            if (!DebugRequestManager.RETRY_WITH_NETWORK_IF_NULL_RESPONSE) {
                return false;
            }
        }
        return mo47099v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo47088g() {
        this.f17889l = true;
        mo47092l();
        AsyncTaskRequestsManager.getInstance(this.f17887j).requestFinished(this.f17888k, false);
        super.mo47088g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo46875h(boolean z) {
        boolean z2;
        mo47087s(z);
        if (this.f17889l || z || this.f17892o || !this.f17890m) {
            z2 = false;
        } else {
            z2 = true;
        }
        AsyncTaskRequestsManager.getInstance(this.f17887j).requestFinished(this.f17888k, z2);
        if (!z2) {
            ArrayList<IAsyncTaskRequestsListener> arrayList = new ArrayList<>(this.f17891n.size());
            synchronized (C11366b.class) {
                for (IAsyncTaskRequestsListener add : this.f17891n) {
                    arrayList.add(add);
                }
            }
            if (!z) {
                for (IAsyncTaskRequestsListener onRequestFailed : arrayList) {
                    onRequestFailed.onRequestFailed(this.f17888k, this.f17892o, this.f17893p);
                }
                return;
            }
            C13633n.m31162r(this.f17894q);
            for (IAsyncTaskRequestsListener aVar : arrayList) {
                new C11367a(aVar).mo50711e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo47089i() {
        super.mo47089i();
        this.f17894q = null;
        mo47097t();
        mo47098u();
    }

    /* renamed from: j */
    public final void mo47090j(IAsyncTaskRequestsListener iAsyncTaskRequestsListener) {
        if (iAsyncTaskRequestsListener != null) {
            synchronized (C11366b.class) {
                this.f17891n.add(iAsyncTaskRequestsListener);
            }
        }
    }

    /* renamed from: k */
    public final void mo47091k() {
        synchronized (C11366b.class) {
            AsyncTaskRequestsManager.getInstance(this.f17887j).requestFinished(this.f17888k, false);
            this.f17889l = true;
            mo50710c(true);
            for (IAsyncTaskRequestsListener onRequestCancelled : this.f17891n) {
                onRequestCancelled.onRequestCancelled(this.f17888k);
            }
            this.f17891n.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo47092l() {
        Call call = this.f17884g;
        if (call != null) {
            call.cancel();
        }
        Response response = this.f17885h;
        if (response != null) {
            response.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo47093m(String str) {
        C13633n.m31148d("[" + this.f17881d.toString() + "] " + this.f17888k.getUrl(HttpMethod.GET).toString() + " => " + str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public List<Interceptor> mo47085n() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f17886i);
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public Map<String, String> mo47086o() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public IApiType mo47094p() {
        return this.f17888k.getApi();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public BundleRequest mo47095q() {
        return this.f17888k;
    }

    /* renamed from: r */
    public final void mo47096r(C11366b bVar) {
        if (bVar != null) {
            synchronized (C11366b.class) {
                for (IAsyncTaskRequestsListener j : bVar.f17891n) {
                    mo47090j(j);
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo47097t() {
        this.f17884g = null;
        this.f17885h = null;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f17882e = builder.connectTimeout(30, timeUnit).readTimeout(20, timeUnit).writeTimeout(20, timeUnit);
        this.f17883f = new Request.Builder().url(this.f17888k.getUrl(this.f17881d));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo47098u() {
        if (this.f17881d == HttpMethod.POST) {
            try {
                Map<String, String> args = this.f17888k.getArgs();
                Map<String, String> o = mo47086o();
                if (o != null) {
                    if (args == null) {
                        args = o;
                    } else {
                        args.putAll(o);
                    }
                }
                C13630k.m31142g(this.f17883f, args, this.f17888k.getArrayArgs());
            } catch (Exception e) {
                C13633n.m31165u(this, e);
                mo47091k();
                return;
            }
        }
        List<Interceptor> n = mo47085n();
        if (n != null) {
            for (Interceptor addInterceptor : n) {
                this.f17882e.addInterceptor(addInterceptor);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo47099v() {
        Call newCall = this.f17882e.build().newCall(this.f17883f.build());
        this.f17884g = newCall;
        try {
            Response execute = newCall.execute();
            this.f17885h = execute;
            if (execute == null) {
                C13633n.m31165u(this, new IllegalStateException());
                return false;
            }
            this.f17893p = execute.code();
            mo47093m("" + this.f17893p);
            try {
                this.f17894q = this.f17885h.body().string();
                return true;
            } catch (IOException e) {
                C13633n.m31165u(this, e);
                return false;
            } finally {
                this.f17885h.close();
            }
        } catch (SocketTimeoutException e2) {
            this.f17892o = true;
            C13633n.m31165u(this, e2);
            return false;
        } catch (Exception e3) {
            C13633n.m31165u(this, e3);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo47087s(boolean z) {
    }
}
