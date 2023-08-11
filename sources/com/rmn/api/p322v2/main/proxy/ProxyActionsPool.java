package com.rmn.api.p322v2.main.proxy;

import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.main.proxy.ProxyActionsPool */
public class ProxyActionsPool {
    private Map<IProxyMethodType, Set<ProxyBundleInput>> pool = new HashMap();

    public synchronized void cancelAndRemoveAllActions() {
        C13633n.m31159o(this, "cancelAndRemoveAllActions");
        for (IProxyMethodType iProxyMethodType : new HashMap(this.pool).keySet()) {
            if (this.pool.containsKey(iProxyMethodType)) {
                cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
            }
        }
    }

    public synchronized void cancelAndRemoveAllActionsWithMethod(IProxyMethodType iProxyMethodType) {
        if (iProxyMethodType != null) {
            C13633n.m31159o(this, "cancelAndRemoveAllActionsWithMethod : " + iProxyMethodType.getName());
            Set set = this.pool.get(iProxyMethodType);
            if (set != null) {
                for (ProxyBundleInput proxyBundleInput : new HashSet(set)) {
                    if (set.contains(proxyBundleInput)) {
                        try {
                            proxyBundleInput.getProxy().cancelProxyAction(proxyBundleInput);
                        } catch (Exception unused) {
                        }
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public synchronized void executeProxyAction(IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput) {
        if (iProxyListener == null) {
            throw new IllegalArgumentException();
        } else if (proxyBundleInput != null) {
            IProxyMethodType proxyMethod = proxyBundleInput.getProxyMethod();
            AbstractProxy proxy = proxyBundleInput.getProxy();
            C13633n.m31159o(this, "executeProxyAction : " + proxyMethod.getName() + " => " + proxyBundleInput);
            proxy.addProxyActionsPoolObserver(this);
            Set set = this.pool.get(proxyMethod);
            if (set == null) {
                set = new HashSet();
                this.pool.put(proxyMethod, set);
            }
            set.add(proxyBundleInput);
            proxy.executeProxyAction(iProxyListener, proxyBundleInput);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void finalize() {
        for (Map.Entry entry : new HashMap(this.pool).entrySet()) {
            if (this.pool.containsKey(entry.getKey())) {
                for (ProxyBundleInput proxy : (Set) entry.getValue()) {
                    proxy.getProxy().removeProxyActionsPoolObserver(this);
                }
            }
        }
        super.finalize();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onProxyActionFinished(com.rmn.api.p322v2.main.proxy.ProxyBundleInput r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L_0x0057
            com.rmn.api.v2.main.proxy.IProxyMethodType r0 = r5.getProxyMethod()     // Catch:{ all -> 0x0055 }
            java.util.Map<com.rmn.api.v2.main.proxy.IProxyMethodType, java.util.Set<com.rmn.api.v2.main.proxy.ProxyBundleInput>> r1 = r4.pool     // Catch:{ all -> 0x0055 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0055 }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x0053
            boolean r2 = r1.contains(r5)     // Catch:{ all -> 0x0055 }
            if (r2 != 0) goto L_0x0018
            goto L_0x0053
        L_0x0018:
            r1.remove(r5)     // Catch:{ all -> 0x0055 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0055 }
            r2.<init>()     // Catch:{ all -> 0x0055 }
            java.lang.String r3 = "removeActionFromPool : "
            r2.append(r3)     // Catch:{ all -> 0x0055 }
            com.rmn.api.v2.main.proxy.IProxyMethodType r3 = r5.getProxyMethod()     // Catch:{ all -> 0x0055 }
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x0055 }
            r2.append(r3)     // Catch:{ all -> 0x0055 }
            java.lang.String r3 = " => "
            r2.append(r3)     // Catch:{ all -> 0x0055 }
            r2.append(r5)     // Catch:{ all -> 0x0055 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0055 }
            p446vd.C13633n.m31159o(r4, r2)     // Catch:{ all -> 0x0055 }
            com.rmn.api.v2.main.proxy.AbstractProxy r5 = r5.getProxy()     // Catch:{ all -> 0x0055 }
            r5.removeProxyActionsPoolObserver(r4)     // Catch:{ all -> 0x0055 }
            boolean r5 = r1.isEmpty()     // Catch:{ all -> 0x0055 }
            if (r5 == 0) goto L_0x0051
            java.util.Map<com.rmn.api.v2.main.proxy.IProxyMethodType, java.util.Set<com.rmn.api.v2.main.proxy.ProxyBundleInput>> r5 = r4.pool     // Catch:{ all -> 0x0055 }
            r5.remove(r0)     // Catch:{ all -> 0x0055 }
        L_0x0051:
            monitor-exit(r4)
            return
        L_0x0053:
            monitor-exit(r4)
            return
        L_0x0055:
            r5 = move-exception
            goto L_0x005d
        L_0x0057:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0055 }
            r5.<init>()     // Catch:{ all -> 0x0055 }
            throw r5     // Catch:{ all -> 0x0055 }
        L_0x005d:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.proxy.ProxyActionsPool.onProxyActionFinished(com.rmn.api.v2.main.proxy.ProxyBundleInput):void");
    }

    public void cancelAndRemoveAllActionsWithMethod(IProxyMethodType iProxyMethodType, RMNMethodParam rMNMethodParam, Object obj) {
        if (rMNMethodParam == null) {
            cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(rMNMethodParam, obj);
        cancelAndRemoveAllActionsWithMethod(iProxyMethodType, hashMap);
    }

    public synchronized void cancelAndRemoveAllActionsWithMethod(IProxyMethodType iProxyMethodType, Map<RMNMethodParam, Object> map) {
        boolean z;
        if (map != null) {
            if (!map.isEmpty()) {
                if (iProxyMethodType != null) {
                    C13633n.m31159o(this, "cancelAndRemoveAllActionsWithMethod : " + iProxyMethodType.getName() + " + " + map.size() + " params");
                    Set set = this.pool.get(iProxyMethodType);
                    if (set != null) {
                        for (ProxyBundleInput proxyBundleInput : new HashSet(set)) {
                            if (set.contains(proxyBundleInput)) {
                                Iterator<Map.Entry<RMNMethodParam, Object>> it = map.entrySet().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z = true;
                                        break;
                                    }
                                    Map.Entry next = it.next();
                                    if (!proxyBundleInput.getParamValue((RMNMethodParam) next.getKey()).equals(next.getValue())) {
                                        z = false;
                                        break;
                                    }
                                }
                                if (z) {
                                    try {
                                        proxyBundleInput.getProxy().cancelProxyAction(proxyBundleInput);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
        }
        cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
    }
}
