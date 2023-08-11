package com.rmn.api.p322v2.main.proxy;

import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.general.responseobject.RMNResponseObjectImmutable;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.main.proxy.ProxyBundleOutput */
public class ProxyBundleOutput {
    private ContextContainer contextContainer;
    private int errorCode;
    private JSONObject errorData;
    private boolean hasTimedOut = false;
    private int httpStatusCode = -1;
    private boolean isCacheHit = false;
    private IProxyMethodType methodType;
    private Map<RMNMethodReturnType, RMNResponseObjectImmutable> responseObjects;
    private ProxyOutputStatus status;
    private String userMessage;

    /* renamed from: com.rmn.api.v2.main.proxy.ProxyBundleOutput$ProxyOutputStatus */
    public enum ProxyOutputStatus {
        PENDING,
        REQUEST_ABORTED,
        REQUEST_CANCELLED,
        REQUEST_FAILED,
        PARSING_FAILED,
        ERROR,
        CACHE_PROBLEM,
        OK
    }

    public ProxyBundleOutput(ContextContainer contextContainer2, IProxyMethodType iProxyMethodType) {
        if (contextContainer2 == null) {
            throw new IllegalArgumentException();
        } else if (iProxyMethodType != null) {
            this.contextContainer = contextContainer2;
            this.status = ProxyOutputStatus.PENDING;
            this.methodType = iProxyMethodType;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void addResponseObject(RMNMethodReturnType rMNMethodReturnType, ProxyResponseObject proxyResponseObject, boolean z) {
        if (rMNMethodReturnType == null) {
            throw new IllegalArgumentException();
        } else if (proxyResponseObject != null) {
            Map<RMNMethodReturnType, RMNResponseObjectImmutable> map = this.responseObjects;
            if (map == null) {
                this.responseObjects = new HashMap();
            } else if (map.containsKey(rMNMethodReturnType)) {
                throw new IllegalStateException("Response object already put in the proxy output");
            }
            this.responseObjects.put(rMNMethodReturnType, proxyResponseObject);
            this.isCacheHit = z;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public ContextContainer getContextContainer() {
        return this.contextContainer;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public JSONObject getErrorData() {
        return this.errorData;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public IProxyMethodType getMethodType() {
        return this.methodType;
    }

    public final Object getResponseObject(RMNMethodReturnType rMNMethodReturnType) {
        RMNResponseObjectImmutable rMNResponseObjectImmutable;
        if (rMNMethodReturnType == null) {
            throw new IllegalArgumentException();
        } else if (!this.methodType.hasReturn(this.contextContainer, rMNMethodReturnType)) {
            C13633n.m31166v("The methodType " + this.methodType.getName() + " does not have a methodReturn with keyName =" + rMNMethodReturnType.getKeyName() + " and type = " + rMNMethodReturnType.getReturnType().getSimpleName());
            return null;
        } else {
            Map<RMNMethodReturnType, RMNResponseObjectImmutable> map = this.responseObjects;
            if (map == null) {
                C13633n.m31166v("No responseObjects has been provided for the methodType " + this.methodType.getName());
                return null;
            } else if (map.containsKey(rMNMethodReturnType) && (rMNResponseObjectImmutable = this.responseObjects.get(rMNMethodReturnType)) != null) {
                return rMNResponseObjectImmutable.getRetrievedObject();
            } else {
                return null;
            }
        }
    }

    public final ProxyOutputStatus getStatus() {
        return this.status;
    }

    public String getUserMessage() {
        return this.userMessage;
    }

    public final boolean hasResponseObject(RMNMethodReturnType rMNMethodReturnType) {
        if (rMNMethodReturnType == null) {
            throw new IllegalArgumentException();
        } else if (!this.methodType.hasReturn(this.contextContainer, rMNMethodReturnType)) {
            C13633n.m31166v("The methodType " + this.methodType.getName() + " does not have a methodReturn with keyName =" + rMNMethodReturnType.getKeyName() + " and type = " + rMNMethodReturnType.getReturnType().getSimpleName());
            return false;
        } else {
            Map<RMNMethodReturnType, RMNResponseObjectImmutable> map = this.responseObjects;
            if (map != null) {
                return map.containsKey(rMNMethodReturnType);
            }
            C13633n.m31166v("No responseObjects has been provided for the methodType " + this.methodType.getName());
            return false;
        }
    }

    public boolean hasTimedOut() {
        return this.hasTimedOut;
    }

    public boolean isCacheHit() {
        return this.isCacheHit;
    }

    public void setErrorCode(int i) {
        if (this.status == ProxyOutputStatus.ERROR) {
            this.errorCode = i;
            return;
        }
        throw new IllegalStateException("Try to set an error code but the status is not ERROR : " + this.status);
    }

    public void setErrorData(JSONObject jSONObject) {
        if (this.status == ProxyOutputStatus.ERROR) {
            this.errorData = jSONObject;
            return;
        }
        throw new IllegalStateException("Try to set error data but the status is not ERROR : " + this.status);
    }

    public void setHasTimedOut(boolean z) {
        if (this.status == ProxyOutputStatus.REQUEST_FAILED) {
            this.hasTimedOut = z;
            return;
        }
        throw new IllegalStateException("Try to set has timed out bool but the request is not REQUEST_FAILED : " + this.status);
    }

    public void setHttpStatusCode(int i) {
        if (this.status == ProxyOutputStatus.REQUEST_FAILED) {
            this.httpStatusCode = i;
            return;
        }
        throw new IllegalStateException("Try to set a http status code but the request is not REQUEST_FAILED : " + this.status);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        if (r7.responseObjects.size() < r5) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResponseCacheOutput(com.rmn.api.p322v2.main.cache.CacheBundleOutput r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x00aa
            com.rmn.api.v2.main.cache.ICacheMethodType r0 = r8.getMethodType()
            com.rmn.api.v2.main.proxy.IProxyMethodType r1 = r7.methodType
            com.rmn.iosadapters.android.content.ContextContainer r2 = r7.contextContainer
            com.rmn.api.v2.main.cache.ICacheMethodType r1 = r1.getCacheMethod(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a4
            java.util.Map r0 = r8.getRetrievedCachedObjects()
            r7.responseObjects = r0
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0020
            r3 = r2
            goto L_0x0021
        L_0x0020:
            r3 = r1
        L_0x0021:
            if (r3 != 0) goto L_0x0096
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x002b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0048
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            com.rmn.api.v2.main.general.responseobject.RMNResponseObjectImmutable r4 = (com.rmn.api.p322v2.main.general.responseobject.RMNResponseObjectImmutable) r4
            if (r4 == 0) goto L_0x0040
            goto L_0x002b
        L_0x0040:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Null response object"
            r8.<init>(r0)
            throw r8
        L_0x0048:
            com.rmn.api.v2.main.cache.ICacheMethodType r8 = r8.getMethodType()
            com.rmn.iosadapters.android.content.ContextContainer r0 = r7.contextContainer
            com.rmn.api.v2.main.cache.cacheaccess.AbstractCache r8 = r8.getCache(r0)
            com.rmn.api.v2.main.general.methodreturn.RMNMethodReturnType[] r8 = r8.getMethodReturns()
            java.util.Map<com.rmn.api.v2.main.general.methodreturn.RMNMethodReturnType, com.rmn.api.v2.main.general.responseobject.RMNResponseObjectImmutable> r0 = r7.responseObjects
            int r0 = r0.size()
            int r4 = r8.length
            if (r0 <= r4) goto L_0x0061
        L_0x005f:
            r3 = r2
            goto L_0x007c
        L_0x0061:
            int r0 = r8.length
            r4 = r1
            r5 = r4
        L_0x0064:
            if (r4 >= r0) goto L_0x0073
            r6 = r8[r4]
            boolean r6 = r6.isRequired()
            if (r6 == 0) goto L_0x0070
            int r5 = r5 + 1
        L_0x0070:
            int r4 = r4 + 1
            goto L_0x0064
        L_0x0073:
            java.util.Map<com.rmn.api.v2.main.general.methodreturn.RMNMethodReturnType, com.rmn.api.v2.main.general.responseobject.RMNResponseObjectImmutable> r0 = r7.responseObjects
            int r0 = r0.size()
            if (r0 >= r5) goto L_0x007c
            goto L_0x005f
        L_0x007c:
            if (r3 != 0) goto L_0x0096
            int r0 = r8.length
        L_0x007f:
            if (r1 >= r0) goto L_0x0096
            r4 = r8[r1]
            boolean r5 = r4.isRequired()
            if (r5 == 0) goto L_0x0093
            java.util.Map<com.rmn.api.v2.main.general.methodreturn.RMNMethodReturnType, com.rmn.api.v2.main.general.responseobject.RMNResponseObjectImmutable> r5 = r7.responseObjects
            boolean r4 = r5.containsKey(r4)
            if (r4 != 0) goto L_0x0093
            r3 = r2
            goto L_0x0096
        L_0x0093:
            int r1 = r1 + 1
            goto L_0x007f
        L_0x0096:
            if (r3 == 0) goto L_0x009d
            com.rmn.api.v2.main.proxy.ProxyBundleOutput$ProxyOutputStatus r8 = com.rmn.api.p322v2.main.proxy.ProxyBundleOutput.ProxyOutputStatus.CACHE_PROBLEM
            r7.status = r8
            goto L_0x00a3
        L_0x009d:
            com.rmn.api.v2.main.proxy.ProxyBundleOutput$ProxyOutputStatus r8 = com.rmn.api.p322v2.main.proxy.ProxyBundleOutput.ProxyOutputStatus.OK
            r7.status = r8
            r7.isCacheHit = r2
        L_0x00a3:
            return
        L_0x00a4:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
        L_0x00aa:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.proxy.ProxyBundleOutput.setResponseCacheOutput(com.rmn.api.v2.main.cache.CacheBundleOutput):void");
    }

    public final void setResponseString(String str) {
        if (str != null) {
            Map<RMNMethodReturnType, RMNResponseObjectImmutable> parseResponseString = this.methodType.getMethodParser().parseResponseString(this.contextContainer, this, str);
            this.responseObjects = parseResponseString;
            if (parseResponseString != null) {
                for (Map.Entry next : parseResponseString.entrySet()) {
                    if (((RMNResponseObjectImmutable) next.getValue()) == null) {
                        throw new IllegalStateException("Null response entry : " + ((RMNMethodReturnType) next.getKey()).getKeyName());
                    }
                }
                this.isCacheHit = false;
                return;
            }
            throw new IllegalStateException("Null response object");
        }
        throw new IllegalArgumentException();
    }

    public void setStatus(ProxyOutputStatus proxyOutputStatus) {
        if (proxyOutputStatus == null) {
            throw new IllegalArgumentException();
        } else if (this.status == ProxyOutputStatus.PENDING) {
            this.status = proxyOutputStatus;
        } else {
            throw new IllegalStateException("Can't change proxy output status, already set : " + this.status + " => new value : " + proxyOutputStatus);
        }
    }

    public void setUserMessage(String str) {
        if (this.status == ProxyOutputStatus.ERROR) {
            this.userMessage = str;
            return;
        }
        throw new IllegalStateException("Try to set user message but the status is not ERROR : " + this.status);
    }
}
