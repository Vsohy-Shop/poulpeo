package com.rmn.api.p322v2.main.oauth;

import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.LinkedHashMap;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.main.oauth.AsyncTaskRequestsManager */
public class AsyncTaskRequestsManager {
    private static volatile AsyncTaskRequestsManager instance;
    private ContextContainer contextContainer;
    private LinkedHashMap<BundleRequest, C11359a> executingTasks = new LinkedHashMap<>();

    /* renamed from: com.rmn.api.v2.main.oauth.AsyncTaskRequestsManager$a */
    private class C11359a {

        /* renamed from: a */
        private ContextContainer f17860a;

        /* renamed from: b */
        private C11366b f17861b;

        /* renamed from: c */
        private BundleRequest f17862c;

        /* renamed from: d */
        private HttpMethod f17863d;

        /* renamed from: e */
        private boolean f17864e;

        /* renamed from: f */
        private int f17865f;

        public C11359a(ContextContainer contextContainer, BundleRequest bundleRequest, HttpMethod httpMethod, boolean z) {
            if (bundleRequest != null) {
                this.f17860a = contextContainer;
                this.f17862c = bundleRequest;
                this.f17863d = httpMethod;
                this.f17864e = z;
                this.f17865f = 2;
                return;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: c */
        private void m24905c() {
            synchronized (C11366b.class) {
                C13633n.m31149e(this, "Fallback mode activated, remaining : " + this.f17865f);
                this.f17865f = this.f17865f + -1;
            }
        }

        /* renamed from: e */
        private void m24906e(C11366b bVar) {
            C11366b bVar2;
            synchronized (C11366b.class) {
                if (bVar != null) {
                    boolean z = true;
                    if (!this.f17864e) {
                        ContextContainer contextContainer = this.f17860a;
                        BundleRequest bundleRequest = this.f17862c;
                        HttpMethod httpMethod = this.f17863d;
                        if (this.f17865f <= 0) {
                            z = false;
                        }
                        bVar2 = new C11366b(contextContainer, bundleRequest, httpMethod, z);
                    } else {
                        ContextContainer contextContainer2 = this.f17860a;
                        BundleRequest bundleRequest2 = this.f17862c;
                        HttpMethod httpMethod2 = this.f17863d;
                        if (this.f17865f <= 0) {
                            z = false;
                        }
                        bVar2 = new C11365a(contextContainer2, bundleRequest2, httpMethod2, z);
                    }
                    bVar2.mo47096r(bVar);
                    this.f17861b = bVar2;
                    bVar2.mo50711e();
                }
            }
        }

        /* renamed from: a */
        public void mo47020a(IAsyncTaskRequestsListener iAsyncTaskRequestsListener) {
            synchronized (C11366b.class) {
                C11366b bVar = this.f17861b;
                if (bVar != null) {
                    bVar.mo47090j(iAsyncTaskRequestsListener);
                }
            }
        }

        /* renamed from: b */
        public void mo47021b() {
            synchronized (C11366b.class) {
                C11366b bVar = this.f17861b;
                if (bVar != null) {
                    bVar.mo47091k();
                }
            }
        }

        /* renamed from: d */
        public void mo47022d() {
            m24905c();
            m24906e(this.f17861b);
        }

        /* renamed from: f */
        public void mo47023f(IAsyncTaskRequestsListener iAsyncTaskRequestsListener) {
            synchronized (C11366b.class) {
                if (this.f17861b == null) {
                    boolean z = true;
                    if (!this.f17864e) {
                        ContextContainer contextContainer = this.f17860a;
                        BundleRequest bundleRequest = this.f17862c;
                        HttpMethod httpMethod = this.f17863d;
                        if (this.f17865f <= 0) {
                            z = false;
                        }
                        this.f17861b = new C11366b(contextContainer, bundleRequest, httpMethod, z);
                    } else {
                        ContextContainer contextContainer2 = this.f17860a;
                        BundleRequest bundleRequest2 = this.f17862c;
                        HttpMethod httpMethod2 = this.f17863d;
                        if (this.f17865f <= 0) {
                            z = false;
                        }
                        this.f17861b = new C11365a(contextContainer2, bundleRequest2, httpMethod2, z);
                    }
                    if (iAsyncTaskRequestsListener != null) {
                        this.f17861b.mo47090j(iAsyncTaskRequestsListener);
                    }
                    this.f17861b.mo50711e();
                }
            }
        }
    }

    private AsyncTaskRequestsManager(ContextContainer contextContainer2) {
        this.contextContainer = contextContainer2;
    }

    public static AsyncTaskRequestsManager getInstance(ContextContainer contextContainer2) {
        if (instance == null) {
            synchronized (AsyncTaskRequestsManager.class) {
                if (instance == null) {
                    instance = new AsyncTaskRequestsManager(contextContainer2);
                }
            }
        }
        return instance;
    }

    public void cancelRequest(BundleRequest bundleRequest) {
        synchronized (C11366b.class) {
            if (this.executingTasks.containsKey(bundleRequest)) {
                this.executingTasks.get(bundleRequest).mo47021b();
                this.executingTasks.remove(bundleRequest);
            }
        }
    }

    public boolean isExecutingRequest(BundleRequest bundleRequest) {
        boolean containsKey;
        synchronized (C11366b.class) {
            containsKey = this.executingTasks.containsKey(bundleRequest);
        }
        return containsKey;
    }

    /* access modifiers changed from: package-private */
    public void requestFinished(BundleRequest bundleRequest, boolean z) {
        synchronized (C11366b.class) {
            if (this.executingTasks.containsKey(bundleRequest)) {
                if (z) {
                    this.executingTasks.get(bundleRequest).mo47022d();
                } else {
                    this.executingTasks.remove(bundleRequest);
                }
            }
        }
    }

    public void sendRequest(BundleRequest bundleRequest, IAsyncTaskRequestsListener iAsyncTaskRequestsListener, HttpMethod httpMethod, boolean z) {
        if (bundleRequest != null) {
            synchronized (C11366b.class) {
                if (this.executingTasks.containsKey(bundleRequest)) {
                    this.executingTasks.get(bundleRequest).mo47020a(iAsyncTaskRequestsListener);
                } else {
                    C11359a aVar = new C11359a(this.contextContainer, bundleRequest, httpMethod, z);
                    this.executingTasks.put(bundleRequest, aVar);
                    aVar.mo47023f(iAsyncTaskRequestsListener);
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
