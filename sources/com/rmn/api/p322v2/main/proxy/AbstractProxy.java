package com.rmn.api.p322v2.main.proxy;

import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.cache.CacheBundleOutput;
import com.rmn.api.p322v2.main.cache.ICacheListenerAdd;
import com.rmn.api.p322v2.main.cache.ICacheListenerClear;
import com.rmn.api.p322v2.main.cache.ICacheListenerGet;
import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.cache.cacheaccess.AbstractCache;
import com.rmn.api.p322v2.main.cache.cachebundleinput.AbstractCacheBundleInput;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputClear;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputGet;
import com.rmn.api.p322v2.main.general.ListenerSecurity;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.oauth.AsyncTaskRequestsManager;
import com.rmn.api.p322v2.main.oauth.BundleRequest;
import com.rmn.api.p322v2.main.oauth.IAsyncTaskRequestsListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.main.proxy.AbstractProxy */
public abstract class AbstractProxy {
    /* access modifiers changed from: private */
    public static Set<ProxyBundleInput> cancelledProxies = new HashSet();
    private static Map<BundleProxyRequest, IAsyncTaskRequestsListener> currentRequestListeners = new HashMap();
    private static Map<ProxyBundleInput, List<AbstractCacheBundleInput>> runningCacheAction = new HashMap();
    private Set<ProxyActionsPool> poolObservers = new HashSet();

    /* renamed from: com.rmn.api.v2.main.proxy.AbstractProxy$a */
    class C11371a implements ICacheListenerClear {

        /* renamed from: a */
        final /* synthetic */ ProxyBundleInput f17897a;

        /* renamed from: b */
        final /* synthetic */ ContextContainer f17898b;

        /* renamed from: c */
        final /* synthetic */ IProxyListener f17899c;

        /* renamed from: d */
        final /* synthetic */ ListenerSecurity f17900d;

        C11371a(ProxyBundleInput proxyBundleInput, ContextContainer contextContainer, IProxyListener iProxyListener, ListenerSecurity listenerSecurity) {
            this.f17897a = proxyBundleInput;
            this.f17898b = contextContainer;
            this.f17899c = iProxyListener;
            this.f17900d = listenerSecurity;
        }

        public void onCacheActionClearExecuted(CacheBundleInputClear cacheBundleInputClear, CacheBundleOutput.CacheOutputStatus cacheOutputStatus) {
            if (AbstractProxy.cancelledProxies.contains(this.f17897a)) {
                ProxyBundleOutput proxyBundleOutput = new ProxyBundleOutput(this.f17898b, this.f17897a.getProxyMethod());
                proxyBundleOutput.setStatus(ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED);
                AbstractProxy.this.prepareToNotifyListener(this.f17899c, this.f17897a, proxyBundleOutput, this.f17900d, false);
                return;
            }
            if (cacheOutputStatus == CacheBundleOutput.CacheOutputStatus.PROBLEM) {
                C13633n.m31163s(this, "Problem : cache not cleared : " + this.f17897a.getProxyMethod().getName());
            }
            AbstractProxy.this.retrieveDataFromNetwork(this.f17899c, this.f17897a, this.f17900d, false);
        }
    }

    /* renamed from: com.rmn.api.v2.main.proxy.AbstractProxy$b */
    class C11372b implements IAsyncTaskRequestsListener {

        /* renamed from: a */
        final /* synthetic */ BundleProxyRequest f17902a;

        /* renamed from: b */
        final /* synthetic */ ProxyBundleOutput f17903b;

        /* renamed from: c */
        final /* synthetic */ ProxyBundleInput f17904c;

        /* renamed from: d */
        final /* synthetic */ ContextContainer f17905d;

        /* renamed from: e */
        final /* synthetic */ IProxyListener f17906e;

        /* renamed from: f */
        final /* synthetic */ ListenerSecurity f17907f;

        /* renamed from: com.rmn.api.v2.main.proxy.AbstractProxy$b$a */
        class C11373a implements ICacheListenerClear {
            C11373a() {
            }

            public void onCacheActionClearExecuted(CacheBundleInputClear cacheBundleInputClear, CacheBundleOutput.CacheOutputStatus cacheOutputStatus) {
                if (cacheOutputStatus == CacheBundleOutput.CacheOutputStatus.PROBLEM) {
                    C13633n.m31163s(this, "Problem : cache not cleared : " + C11372b.this.f17904c.getProxyMethod().getName());
                }
                C11372b bVar = C11372b.this;
                AbstractProxy.this.manageRetrievedDataFromNetwork(bVar.f17906e, bVar.f17904c, bVar.f17903b, bVar.f17907f);
            }
        }

        C11372b(BundleProxyRequest bundleProxyRequest, ProxyBundleOutput proxyBundleOutput, ProxyBundleInput proxyBundleInput, ContextContainer contextContainer, IProxyListener iProxyListener, ListenerSecurity listenerSecurity) {
            this.f17902a = bundleProxyRequest;
            this.f17903b = proxyBundleOutput;
            this.f17904c = proxyBundleInput;
            this.f17905d = contextContainer;
            this.f17906e = iProxyListener;
            this.f17907f = listenerSecurity;
        }

        public void onRequestCancelled(BundleRequest bundleRequest) {
            AbstractProxy.removeCurrentRequestListener(this.f17902a);
            this.f17903b.setStatus(ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED);
            AbstractProxy.this.prepareToNotifyListener(this.f17906e, this.f17904c, this.f17903b, this.f17907f, false);
        }

        public void onRequestFailed(BundleRequest bundleRequest, boolean z, int i) {
            AbstractProxy.removeCurrentRequestListener(this.f17902a);
            this.f17903b.setStatus(ProxyBundleOutput.ProxyOutputStatus.REQUEST_FAILED);
            this.f17903b.setHasTimedOut(z);
            this.f17903b.setHttpStatusCode(i);
            AbstractProxy.this.prepareToNotifyListener(this.f17906e, this.f17904c, this.f17903b, this.f17907f, false);
        }

        public void onRequestSucceededInsideUIThread(BundleRequest bundleRequest, boolean z) {
            if (this.f17903b.getStatus() == ProxyBundleOutput.ProxyOutputStatus.OK && this.f17904c.getSourcesOption() == ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_THEN_CLEAR_CACHE) {
                AbstractProxy.this.getCache(this.f17904c).executeCacheActionClear(new C11373a(), new CacheBundleInputClear(this.f17905d, this.f17904c.getProxyMethod().getCacheMethod(this.f17905d)));
                return;
            }
            AbstractProxy.this.manageRetrievedDataFromNetwork(this.f17906e, this.f17904c, this.f17903b, this.f17907f);
        }

        public boolean onRequestSucceededOutsideUIThread(BundleRequest bundleRequest, String str) {
            AbstractProxy.removeCurrentRequestListener(this.f17902a);
            try {
                this.f17903b.setResponseString(str);
                return true;
            } catch (Exception e) {
                C13633n.m31165u(this, e);
                return false;
            }
        }
    }

    /* renamed from: com.rmn.api.v2.main.proxy.AbstractProxy$c */
    class C11374c implements ICacheListenerGet {

        /* renamed from: a */
        final /* synthetic */ ProxyBundleInput f17910a;

        /* renamed from: b */
        final /* synthetic */ ContextContainer f17911b;

        /* renamed from: c */
        final /* synthetic */ IProxyListener f17912c;

        /* renamed from: d */
        final /* synthetic */ ListenerSecurity f17913d;

        C11374c(ProxyBundleInput proxyBundleInput, ContextContainer contextContainer, IProxyListener iProxyListener, ListenerSecurity listenerSecurity) {
            this.f17910a = proxyBundleInput;
            this.f17911b = contextContainer;
            this.f17912c = iProxyListener;
            this.f17913d = listenerSecurity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x008e  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00af  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onCacheActionGetExecuted(com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputGet r11, com.rmn.api.p322v2.main.cache.CacheBundleOutput r12) {
            /*
                r10 = this;
                java.util.Set r11 = com.rmn.api.p322v2.main.proxy.AbstractProxy.cancelledProxies
                com.rmn.api.v2.main.proxy.ProxyBundleInput r0 = r10.f17910a
                boolean r11 = r11.contains(r0)
                if (r11 == 0) goto L_0x002b
                com.rmn.api.v2.main.proxy.ProxyBundleOutput r3 = new com.rmn.api.v2.main.proxy.ProxyBundleOutput
                com.rmn.iosadapters.android.content.ContextContainer r11 = r10.f17911b
                com.rmn.api.v2.main.proxy.ProxyBundleInput r12 = r10.f17910a
                com.rmn.api.v2.main.proxy.IProxyMethodType r12 = r12.getProxyMethod()
                r3.<init>(r11, r12)
                com.rmn.api.v2.main.proxy.ProxyBundleOutput$ProxyOutputStatus r11 = com.rmn.api.p322v2.main.proxy.ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED
                r3.setStatus(r11)
                com.rmn.api.v2.main.proxy.AbstractProxy r0 = com.rmn.api.p322v2.main.proxy.AbstractProxy.this
                com.rmn.api.v2.main.proxy.IProxyListener r1 = r10.f17912c
                com.rmn.api.v2.main.proxy.ProxyBundleInput r2 = r10.f17910a
                com.rmn.api.v2.main.general.ListenerSecurity r4 = r10.f17913d
                r5 = 0
                r0.prepareToNotifyListener(r1, r2, r3, r4, r5)
                return
            L_0x002b:
                int[] r11 = com.rmn.api.p322v2.main.proxy.AbstractProxy.C11376e.f17922c
                com.rmn.api.v2.main.cache.CacheBundleOutput$CacheOutputStatus r0 = r12.getStatus()
                int r0 = r0.ordinal()
                r11 = r11[r0]
                r0 = 1
                if (r11 == r0) goto L_0x00bb
                r1 = 2
                r2 = 0
                if (r11 == r1) goto L_0x004b
                r1 = 3
                if (r11 != r1) goto L_0x0045
                r11 = 0
                r7 = r11
            L_0x0043:
                r11 = r0
                goto L_0x005e
            L_0x0045:
                java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
                r11.<init>()
                throw r11
            L_0x004b:
                com.rmn.api.v2.main.proxy.AbstractProxy r11 = com.rmn.api.p322v2.main.proxy.AbstractProxy.this
                com.rmn.api.v2.main.proxy.ProxyBundleInput r1 = r10.f17910a
                com.rmn.api.v2.main.proxy.ProxyBundleOutput r11 = r11.getProxyOutputFromCacheOutput((com.rmn.api.p322v2.main.proxy.ProxyBundleInput) r1, (com.rmn.api.p322v2.main.cache.CacheBundleOutput) r12)
                com.rmn.api.v2.main.proxy.ProxyBundleOutput$ProxyOutputStatus r1 = r11.getStatus()
                com.rmn.api.v2.main.proxy.ProxyBundleOutput$ProxyOutputStatus r3 = com.rmn.api.p322v2.main.proxy.ProxyBundleOutput.ProxyOutputStatus.OK
                r7 = r11
                if (r1 == r3) goto L_0x005d
                goto L_0x0043
            L_0x005d:
                r11 = r2
            L_0x005e:
                if (r7 == 0) goto L_0x007d
                if (r11 != 0) goto L_0x007d
                com.rmn.api.v2.main.proxy.AbstractProxy r11 = com.rmn.api.p322v2.main.proxy.AbstractProxy.this     // Catch:{ Exception -> 0x006c }
                com.rmn.iosadapters.android.content.ContextContainer r12 = r10.f17911b     // Catch:{ Exception -> 0x006c }
                com.rmn.api.v2.main.proxy.ProxyBundleInput r1 = r10.f17910a     // Catch:{ Exception -> 0x006c }
                r11.doAdditionalOperationsAfterRetrievingData(r12, r1, r7, r0)     // Catch:{ Exception -> 0x006c }
                goto L_0x0070
            L_0x006c:
                r11 = move-exception
                p446vd.C13633n.m31165u(r10, r11)
            L_0x0070:
                com.rmn.api.v2.main.proxy.AbstractProxy r4 = com.rmn.api.p322v2.main.proxy.AbstractProxy.this
                com.rmn.api.v2.main.proxy.IProxyListener r5 = r10.f17912c
                com.rmn.api.v2.main.proxy.ProxyBundleInput r6 = r10.f17910a
                com.rmn.api.v2.main.general.ListenerSecurity r8 = r10.f17913d
                r9 = 1
                r4.prepareToNotifyListener(r5, r6, r7, r8, r9)
                goto L_0x00ba
            L_0x007d:
                int[] r11 = com.rmn.api.p322v2.main.proxy.AbstractProxy.C11376e.f17920a
                com.rmn.api.v2.main.proxy.ProxyBundleInput r0 = r10.f17910a
                com.rmn.api.v2.main.proxy.ProxyBundleInput$ProxySourcesOption r0 = r0.getSourcesOption()
                int r0 = r0.ordinal()
                r11 = r11[r0]
                r0 = 4
                if (r11 == r0) goto L_0x00af
                r0 = 5
                if (r11 != r0) goto L_0x00a9
                if (r7 != 0) goto L_0x009b
                com.rmn.api.v2.main.proxy.AbstractProxy r11 = com.rmn.api.p322v2.main.proxy.AbstractProxy.this
                com.rmn.api.v2.main.proxy.ProxyBundleInput r0 = r10.f17910a
                com.rmn.api.v2.main.proxy.ProxyBundleOutput r7 = r11.getProxyOutputFromCacheOutput((com.rmn.api.p322v2.main.proxy.ProxyBundleInput) r0, (com.rmn.api.p322v2.main.cache.CacheBundleOutput) r12)
            L_0x009b:
                r3 = r7
                com.rmn.api.v2.main.proxy.AbstractProxy r0 = com.rmn.api.p322v2.main.proxy.AbstractProxy.this
                com.rmn.api.v2.main.proxy.IProxyListener r1 = r10.f17912c
                com.rmn.api.v2.main.proxy.ProxyBundleInput r2 = r10.f17910a
                com.rmn.api.v2.main.general.ListenerSecurity r4 = r10.f17913d
                r5 = 0
                r0.prepareToNotifyListener(r1, r2, r3, r4, r5)
                goto L_0x00ba
            L_0x00a9:
                java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
                r11.<init>()
                throw r11
            L_0x00af:
                com.rmn.api.v2.main.proxy.AbstractProxy r11 = com.rmn.api.p322v2.main.proxy.AbstractProxy.this
                com.rmn.api.v2.main.proxy.IProxyListener r12 = r10.f17912c
                com.rmn.api.v2.main.proxy.ProxyBundleInput r0 = r10.f17910a
                com.rmn.api.v2.main.general.ListenerSecurity r1 = r10.f17913d
                r11.retrieveDataFromNetwork(r12, r0, r1, r2)
            L_0x00ba:
                return
            L_0x00bb:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "The cache output status must have been set before notifying the proxy response listener"
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.proxy.AbstractProxy.C11374c.onCacheActionGetExecuted(com.rmn.api.v2.main.cache.cachebundleinput.CacheBundleInputGet, com.rmn.api.v2.main.cache.CacheBundleOutput):void");
        }
    }

    /* renamed from: com.rmn.api.v2.main.proxy.AbstractProxy$d */
    class C11375d implements ICacheListenerAdd {

        /* renamed from: a */
        final /* synthetic */ IProxyListener f17915a;

        /* renamed from: b */
        final /* synthetic */ ProxyBundleInput f17916b;

        /* renamed from: c */
        final /* synthetic */ ProxyBundleOutput f17917c;

        /* renamed from: d */
        final /* synthetic */ ListenerSecurity f17918d;

        C11375d(IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity) {
            this.f17915a = iProxyListener;
            this.f17916b = proxyBundleInput;
            this.f17917c = proxyBundleOutput;
            this.f17918d = listenerSecurity;
        }

        public void onCacheActionAddExecuted(CacheBundleInputAdd cacheBundleInputAdd, CacheBundleOutput.CacheOutputStatus cacheOutputStatus) {
            AbstractProxy.this.prepareToNotifyListener(this.f17915a, this.f17916b, this.f17917c, this.f17918d, false);
        }
    }

    /* renamed from: com.rmn.api.v2.main.proxy.AbstractProxy$e */
    static /* synthetic */ class C11376e {

        /* renamed from: a */
        static final /* synthetic */ int[] f17920a;

        /* renamed from: b */
        static final /* synthetic */ int[] f17921b;

        /* renamed from: c */
        static final /* synthetic */ int[] f17922c;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|(2:15|16)|17|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0073 */
        static {
            /*
                com.rmn.api.v2.main.cache.CacheBundleOutput$CacheOutputStatus[] r0 = com.rmn.api.p322v2.main.cache.CacheBundleOutput.CacheOutputStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17922c = r0
                r1 = 1
                com.rmn.api.v2.main.cache.CacheBundleOutput$CacheOutputStatus r2 = com.rmn.api.p322v2.main.cache.CacheBundleOutput.CacheOutputStatus.PENDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f17922c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.rmn.api.v2.main.cache.CacheBundleOutput$CacheOutputStatus r3 = com.rmn.api.p322v2.main.cache.CacheBundleOutput.CacheOutputStatus.OK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f17922c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.rmn.api.v2.main.cache.CacheBundleOutput$CacheOutputStatus r4 = com.rmn.api.p322v2.main.cache.CacheBundleOutput.CacheOutputStatus.PROBLEM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.rmn.api.v2.main.proxy.ProxyBundleInput$ProxyNetworkOption[] r3 = com.rmn.api.p322v2.main.proxy.ProxyBundleInput.ProxyNetworkOption.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f17921b = r3
                com.rmn.api.v2.main.proxy.ProxyBundleInput$ProxyNetworkOption r4 = com.rmn.api.p322v2.main.proxy.ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r3 = f17921b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.rmn.api.v2.main.proxy.ProxyBundleInput$ProxyNetworkOption r4 = com.rmn.api.p322v2.main.proxy.ProxyBundleInput.ProxyNetworkOption.NO_CACHE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                com.rmn.api.v2.main.proxy.ProxyBundleInput$ProxySourcesOption[] r3 = com.rmn.api.p322v2.main.proxy.ProxyBundleInput.ProxySourcesOption.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f17920a = r3
                com.rmn.api.v2.main.proxy.ProxyBundleInput$ProxySourcesOption r4 = com.rmn.api.p322v2.main.proxy.ProxyBundleInput.ProxySourcesOption.CLEAR_CACHE_THEN_GET_FROM_NETWORK     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r1 = f17920a     // Catch:{ NoSuchFieldError -> 0x005e }
                com.rmn.api.v2.main.proxy.ProxyBundleInput$ProxySourcesOption r3 = com.rmn.api.p322v2.main.proxy.ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY     // Catch:{ NoSuchFieldError -> 0x005e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = f17920a     // Catch:{ NoSuchFieldError -> 0x0068 }
                com.rmn.api.v2.main.proxy.ProxyBundleInput$ProxySourcesOption r1 = com.rmn.api.p322v2.main.proxy.ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_THEN_CLEAR_CACHE     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                int[] r0 = f17920a     // Catch:{ NoSuchFieldError -> 0x0073 }
                com.rmn.api.v2.main.proxy.ProxyBundleInput$ProxySourcesOption r1 = com.rmn.api.p322v2.main.proxy.ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f17920a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.rmn.api.v2.main.proxy.ProxyBundleInput$ProxySourcesOption r1 = com.rmn.api.p322v2.main.proxy.ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_ONLY     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.proxy.AbstractProxy.C11376e.<clinit>():void");
        }
    }

    public static void addCurrentRequestListener(BundleProxyRequest bundleProxyRequest, IAsyncTaskRequestsListener iAsyncTaskRequestsListener) {
        if (bundleProxyRequest == null) {
            throw new IllegalArgumentException();
        } else if (iAsyncTaskRequestsListener != null) {
            synchronized (BundleProxyRequest.class) {
                if (!currentRequestListeners.containsKey(bundleProxyRequest)) {
                    currentRequestListeners.put(bundleProxyRequest, iAsyncTaskRequestsListener);
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    private void addRetrievedDataToCache(IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity) {
        if (!proxyBundleOutput.getStatus().equals(ProxyBundleOutput.ProxyOutputStatus.OK)) {
            prepareToNotifyListener(iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity, false);
            return;
        }
        ContextContainer contextContainer = proxyBundleInput.getContextContainer();
        ICacheMethodType cacheMethod = proxyBundleInput.getProxyMethod().getCacheMethod(contextContainer);
        Set<RMNMethodReturnType> returns = proxyBundleInput.getProxyMethod().getReturns(contextContainer);
        CacheBundleInputAdd cacheBundleInputAdd = new CacheBundleInputAdd(contextContainer, proxyBundleInput.getProxyMethod().getCacheMethod(contextContainer), CacheBundleInputAdd.AddOption.REPLACE_IF_EXISTING);
        cacheBundleInputAdd.addParamValues(proxyBundleInput.getParamValues());
        for (RMNMethodReturnType next : returns) {
            Object responseObject = proxyBundleOutput.getResponseObject(next);
            if (responseObject != null && cacheMethod.getCache(contextContainer).hasMethodReturn(next)) {
                cacheBundleInputAdd.addObjectToStore(next, responseObject);
            }
        }
        getCache(proxyBundleInput).executeCacheActionAdd(new C11375d(iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity), cacheBundleInputAdd);
    }

    /* access modifiers changed from: private */
    public AbstractCache getCache(ProxyBundleInput proxyBundleInput) {
        if (proxyBundleInput != null) {
            return getCache(proxyBundleInput.getContextContainer(), proxyBundleInput.getProxyMethod());
        }
        throw new IllegalArgumentException();
    }

    public static IAsyncTaskRequestsListener getCurrentRequestListener(BundleProxyRequest bundleProxyRequest) {
        if (bundleProxyRequest != null) {
            synchronized (BundleProxyRequest.class) {
                if (!currentRequestListeners.containsKey(bundleProxyRequest)) {
                    return null;
                }
                IAsyncTaskRequestsListener iAsyncTaskRequestsListener = currentRequestListeners.get(bundleProxyRequest);
                return iAsyncTaskRequestsListener;
            }
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: private */
    public ProxyBundleOutput getProxyOutputFromCacheOutput(ProxyBundleInput proxyBundleInput, CacheBundleOutput cacheBundleOutput) {
        return getProxyOutputFromCacheOutput(proxyBundleInput.getProxyMethod(), cacheBundleOutput);
    }

    /* access modifiers changed from: private */
    public void manageRetrievedDataFromNetwork(IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity) {
        try {
            doAdditionalOperationsAfterRetrievingData(proxyBundleInput.getContextContainer(), proxyBundleInput, proxyBundleOutput, false);
        } catch (Exception e) {
            C13633n.m31165u(this, e);
        }
        int i = C11376e.f17921b[proxyBundleInput.getNetworkOption().ordinal()];
        if (i == 1) {
            addRetrievedDataToCache(iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
        } else if (i == 2) {
            prepareToNotifyListener(iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity, false);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* access modifiers changed from: private */
    public void prepareToNotifyListener(IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity, boolean z) {
        boolean z2;
        if (proxyBundleInput == null) {
            throw new IllegalArgumentException();
        } else if (proxyBundleOutput == null) {
            throw new IllegalArgumentException();
        } else if (listenerSecurity == null) {
            throw new IllegalArgumentException();
        } else if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.PENDING) {
            LogoutListener logoutListener = proxyBundleInput.getLogoutListener();
            if (logoutListener != null && proxyBundleOutput.getStatus() == ProxyBundleOutput.ProxyOutputStatus.ERROR && proxyBundleOutput.getErrorCode() == 257) {
                logoutListener.onLogout(true);
                notifyListener((IProxyListener) null, proxyBundleInput, proxyBundleOutput, listenerSecurity);
                return;
            }
            try {
                z2 = doAdditionalOperationsBeforeNotifyingListener(proxyBundleInput.getContextContainer(), iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity, z);
            } catch (Exception e) {
                C13633n.m31165u(this, e);
                z2 = false;
            }
            if (!z2) {
                notifyListener(iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
            }
        } else {
            throw new IllegalStateException("The proxy output status must have been set before notifying the proxy response listener");
        }
    }

    public static void removeCurrentRequestListener(BundleProxyRequest bundleProxyRequest) {
        if (bundleProxyRequest != null) {
            synchronized (BundleProxyRequest.class) {
                if (currentRequestListeners.containsKey(bundleProxyRequest)) {
                    currentRequestListeners.remove(bundleProxyRequest);
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    private void retrieveDataFromCache(IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ListenerSecurity listenerSecurity) {
        ContextContainer contextContainer = proxyBundleInput.getContextContainer();
        AbstractCache cache = getCache(proxyBundleInput);
        ICacheMethodType cacheMethod = proxyBundleInput.getProxyMethod().getCacheMethod(contextContainer);
        if (cacheMethod != null) {
            CacheBundleInputGet cacheBundleInputGet = new CacheBundleInputGet(contextContainer, cacheMethod);
            cacheBundleInputGet.addParamValues(proxyBundleInput.getParamValues());
            cache.executeCacheActionGet(new C11374c(proxyBundleInput, contextContainer, iProxyListener, listenerSecurity), cacheBundleInputGet);
            return;
        }
        throw new IllegalArgumentException("Try to get data from cache but no cache method has been set in the proxy : " + proxyBundleInput.getProxyMethod().getName());
    }

    /* access modifiers changed from: private */
    public void retrieveDataFromNetwork(IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ListenerSecurity listenerSecurity, boolean z) {
        ContextContainer contextContainer = proxyBundleInput.getContextContainer();
        ProxyBundleOutput proxyBundleOutput = new ProxyBundleOutput(contextContainer, proxyBundleInput.getProxyMethod());
        BundleRequest bundleRequest = proxyBundleInput.getBundleRequest();
        if (bundleRequest == null) {
            proxyBundleOutput.setStatus(ProxyBundleOutput.ProxyOutputStatus.REQUEST_ABORTED);
            prepareToNotifyListener(iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity, z);
            return;
        }
        IProxyListener iProxyListener2 = iProxyListener;
        BundleProxyRequest bundleProxyRequest = new BundleProxyRequest(bundleRequest, iProxyListener);
        if (getCurrentRequestListener(bundleProxyRequest) == null) {
            C11372b bVar = new C11372b(bundleProxyRequest, proxyBundleOutput, proxyBundleInput, contextContainer, iProxyListener, listenerSecurity);
            addCurrentRequestListener(bundleProxyRequest, bVar);
            AsyncTaskRequestsManager.getInstance(proxyBundleInput.getContextContainer()).sendRequest(bundleRequest, bVar, proxyBundleInput.getProxyMethod().getHttpMethod(), proxyBundleInput.getProxyMethod().has2LeggedRequests());
        }
    }

    public void addProxyActionsPoolObserver(ProxyActionsPool proxyActionsPool) {
        if (proxyActionsPool != null) {
            synchronized (ProxyActionsPool.class) {
                this.poolObservers.add(proxyActionsPool);
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void cancelProxyAction(ProxyBundleInput proxyBundleInput) {
        if (proxyBundleInput != null) {
            BundleRequest bundleRequest = proxyBundleInput.getBundleRequest();
            if (bundleRequest != null && AsyncTaskRequestsManager.getInstance(proxyBundleInput.getContextContainer()).isExecutingRequest(bundleRequest)) {
                cancelledProxies.add(proxyBundleInput);
                AsyncTaskRequestsManager.getInstance(proxyBundleInput.getContextContainer()).cancelRequest(bundleRequest);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    public abstract void doAdditionalOperationsAfterRetrievingData(ContextContainer contextContainer, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, boolean z);

    /* access modifiers changed from: protected */
    public abstract boolean doAdditionalOperationsBeforeNotifyingListener(ContextContainer contextContainer, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity, boolean z);

    public final void executeProxyAction(IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput) {
        if (proxyBundleInput != null) {
            ContextContainer contextContainer = proxyBundleInput.getContextContainer();
            ListenerSecurity listenerSecurity = new ListenerSecurity();
            int i = C11376e.f17920a[proxyBundleInput.getSourcesOption().ordinal()];
            if (i == 1) {
                getCache(proxyBundleInput).executeCacheActionClear(new C11371a(proxyBundleInput, contextContainer, iProxyListener, listenerSecurity), new CacheBundleInputClear(contextContainer, proxyBundleInput.getProxyMethod().getCacheMethod(contextContainer)));
            } else if (i == 2 || i == 3) {
                retrieveDataFromNetwork(iProxyListener, proxyBundleInput, listenerSecurity, false);
            } else if (i == 4 || i == 5) {
                retrieveDataFromCache(iProxyListener, proxyBundleInput, listenerSecurity);
            } else {
                throw new UnsupportedOperationException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: protected */
    public final void notifyListener(IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity) {
        listenerSecurity.setListenerNotified();
        synchronized (ProxyActionsPool.class) {
            cancelledProxies.remove(proxyBundleInput);
            for (ProxyActionsPool proxyActionsPool : new HashSet(this.poolObservers)) {
                if (this.poolObservers.contains(proxyActionsPool)) {
                    proxyActionsPool.onProxyActionFinished(proxyBundleInput);
                }
            }
        }
        if (iProxyListener != null) {
            iProxyListener.onProxyActionExecuted(proxyBundleInput, proxyBundleOutput);
        }
    }

    public void removeProxyActionsPoolObserver(ProxyActionsPool proxyActionsPool) {
        if (proxyActionsPool != null) {
            synchronized (ProxyActionsPool.class) {
                this.poolObservers.remove(proxyActionsPool);
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    private ProxyBundleOutput getProxyOutputFromCacheOutput(IProxyMethodType iProxyMethodType, CacheBundleOutput cacheBundleOutput) {
        ProxyBundleOutput proxyBundleOutput = new ProxyBundleOutput(cacheBundleOutput.getContextContainer(), iProxyMethodType);
        proxyBundleOutput.setResponseCacheOutput(cacheBundleOutput);
        return proxyBundleOutput;
    }

    private AbstractCache getCache(ContextContainer contextContainer, IProxyMethodType iProxyMethodType) {
        if (iProxyMethodType != null) {
            ICacheMethodType cacheMethod = iProxyMethodType.getCacheMethod(contextContainer);
            if (cacheMethod == null) {
                return null;
            }
            return cacheMethod.getCache(contextContainer);
        }
        throw new IllegalArgumentException();
    }
}
