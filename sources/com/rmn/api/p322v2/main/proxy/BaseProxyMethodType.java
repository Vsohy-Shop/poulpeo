package com.rmn.api.p322v2.main.proxy;

import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.general.IApiType;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.api.p322v2.main.parser.IProxyMethodParser;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.rmn.api.v2.main.proxy.BaseProxyMethodType */
public class BaseProxyMethodType implements IProxyMethodType {
    private final IApiType apiType;
    private final ICacheMethodType cacheMethod;
    private final boolean has2LeggedRequests;
    private final HttpMethod httpMethod;
    private boolean isCacheChecked = false;
    private final IProxyMethodParser methodParser;
    private final String name;
    private final Set<RMNMethodParam> paramsTypeSet;
    private final AbstractProxy proxy;
    private final Set<RMNMethodReturnType> returnsTypeSet;

    public BaseProxyMethodType(String str, IApiType iApiType, AbstractProxy abstractProxy, IProxyMethodParser iProxyMethodParser, Set<RMNMethodParam> set, Set<RMNMethodReturnJSON> set2, HttpMethod httpMethod2, boolean z, ICacheMethodType iCacheMethodType) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        } else if (iApiType == null) {
            throw new IllegalArgumentException();
        } else if (abstractProxy == null) {
            throw new IllegalArgumentException();
        } else if (iProxyMethodParser != null) {
            this.name = str;
            this.apiType = iApiType;
            this.proxy = abstractProxy;
            this.methodParser = iProxyMethodParser;
            if (set != null) {
                this.paramsTypeSet = new HashSet(set);
            } else {
                this.paramsTypeSet = null;
            }
            if (set2 != null) {
                this.returnsTypeSet = new HashSet(set2);
            } else {
                this.returnsTypeSet = null;
            }
            if (httpMethod2 == null) {
                this.httpMethod = HttpMethod.GET;
            } else {
                this.httpMethod = httpMethod2;
            }
            this.has2LeggedRequests = z;
            this.cacheMethod = iCacheMethodType;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        r7 = r6.cacheMethod.getCache(r7);
        r0 = r7.getMethodReturns();
        r1 = r0.length;
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r3 >= r1) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        r4 = r0[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r6.returnsTypeSet.contains(r4) == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        throw new java.lang.IllegalStateException("A method return exists in cache but not in proxy : " + r4.getKeyName() + " in " + getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        r7 = r7.getParams();
        r0 = r7.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r2 >= r0) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        r1 = r7[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r6.paramsTypeSet.contains(r1) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        throw new java.lang.IllegalStateException("A method param exists in cache but not in proxy : " + r1.getKeyName() + " in " + getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void checkCacheCorrespondance(com.rmn.iosadapters.android.content.ContextContainer r7) {
        /*
            r6 = this;
            com.rmn.api.v2.main.cache.ICacheMethodType r0 = r6.cacheMethod
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r6)
            boolean r0 = r6.isCacheChecked     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x008f }
            return
        L_0x000c:
            r0 = 1
            r6.isCacheChecked = r0     // Catch:{ all -> 0x008f }
            monitor-exit(r6)     // Catch:{ all -> 0x008f }
            com.rmn.api.v2.main.cache.ICacheMethodType r0 = r6.cacheMethod
            com.rmn.api.v2.main.cache.cacheaccess.AbstractCache r7 = r0.getCache(r7)
            com.rmn.api.v2.main.general.methodreturn.RMNMethodReturnType[] r0 = r7.getMethodReturns()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x001d:
            if (r3 >= r1) goto L_0x0053
            r4 = r0[r3]
            java.util.Set<com.rmn.api.v2.main.general.methodreturn.RMNMethodReturnType> r5 = r6.returnsTypeSet
            boolean r5 = r5.contains(r4)
            if (r5 == 0) goto L_0x002c
            int r3 = r3 + 1
            goto L_0x001d
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A method return exists in cache but not in proxy : "
            r0.append(r1)
            java.lang.String r1 = r4.getKeyName()
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            java.lang.String r1 = r6.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x0053:
            com.rmn.api.v2.main.general.methodparam.RMNMethodParam[] r7 = r7.getParams()
            int r0 = r7.length
        L_0x0058:
            if (r2 >= r0) goto L_0x008e
            r1 = r7[r2]
            java.util.Set<com.rmn.api.v2.main.general.methodparam.RMNMethodParam> r3 = r6.paramsTypeSet
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x0067
            int r2 = r2 + 1
            goto L_0x0058
        L_0x0067:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "A method param exists in cache but not in proxy : "
            r0.append(r2)
            java.lang.String r1 = r1.getKeyName()
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            java.lang.String r1 = r6.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x008e:
            return
        L_0x008f:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x008f }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.proxy.BaseProxyMethodType.checkCacheCorrespondance(com.rmn.iosadapters.android.content.ContextContainer):void");
    }

    public IApiType getApiType() {
        return this.apiType;
    }

    public ICacheMethodType getCacheMethod(ContextContainer contextContainer) {
        checkCacheCorrespondance(contextContainer);
        return this.cacheMethod;
    }

    public String getCompleteUrl() {
        return getApiType().getApiUrl() + getName() + "/";
    }

    public HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public IProxyMethodParser getMethodParser() {
        return this.methodParser;
    }

    public final String getName() {
        return this.name;
    }

    public AbstractProxy getProxy() {
        return this.proxy;
    }

    public Set<RMNMethodReturnType> getReturns(ContextContainer contextContainer) {
        if (this.returnsTypeSet == null) {
            return new HashSet();
        }
        return new HashSet(this.returnsTypeSet);
    }

    public boolean has2LeggedRequests() {
        return this.has2LeggedRequests;
    }

    public final boolean hasParam(ContextContainer contextContainer, RMNMethodParam rMNMethodParam) {
        if (rMNMethodParam != null) {
            Set<RMNMethodParam> set = this.paramsTypeSet;
            if (set == null) {
                return false;
            }
            return set.contains(rMNMethodParam);
        }
        throw new IllegalArgumentException();
    }

    public boolean hasReturn(ContextContainer contextContainer, RMNMethodReturnType rMNMethodReturnType) {
        if (rMNMethodReturnType != null) {
            Set<RMNMethodReturnType> set = this.returnsTypeSet;
            if (set == null) {
                return false;
            }
            return set.contains(rMNMethodReturnType);
        }
        throw new IllegalArgumentException();
    }
}
