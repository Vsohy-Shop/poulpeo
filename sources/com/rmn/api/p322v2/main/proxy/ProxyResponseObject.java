package com.rmn.api.p322v2.main.proxy;

import com.rmn.api.p322v2.main.cache.CacheResponseObject;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.general.responseobject.RMNResponseObjectImmutable;

/* renamed from: com.rmn.api.v2.main.proxy.ProxyResponseObject */
public class ProxyResponseObject extends RMNResponseObjectImmutable {
    public ProxyResponseObject(RMNMethodReturnType rMNMethodReturnType) {
        super(rMNMethodReturnType);
    }

    public final boolean setCacheResponseObject(CacheResponseObject cacheResponseObject) {
        if (cacheResponseObject != null) {
            this.retrievedObject = cacheResponseObject.getRetrievedObject();
            return true;
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: org.json.JSONObject} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean setJSONObject(org.json.JSONObject r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x005b
            com.rmn.api.v2.main.general.methodreturn.RMNMethodReturnType r0 = r4.getmethodReturnType()
            boolean r1 = r0 instanceof com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON
            if (r1 == 0) goto L_0x0033
            r1 = r0
            com.rmn.api.v2.main.general.methodreturn.RMNMethodReturnJSON r1 = (com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON) r1
            org.json.JSONObject r5 = r1.locateContainer(r5)
            if (r5 == 0) goto L_0x0018
            java.lang.String r1 = r1.getTreeName()
            goto L_0x0034
        L_0x0018:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "The jsonContainer is null for : "
            r0.append(r2)
            java.lang.String r1 = r1.getTreeName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0033:
            r1 = 0
        L_0x0034:
            if (r1 == 0) goto L_0x003a
            java.lang.Object r5 = r5.opt(r1)
        L_0x003a:
            r1 = 0
            if (r5 == 0) goto L_0x0055
            java.lang.Object r2 = org.json.JSONObject.NULL
            if (r5 != r2) goto L_0x0042
            goto L_0x0055
        L_0x0042:
            com.rmn.api.v2.main.json.ParsingMode r2 = com.rmn.api.p322v2.main.json.ParsingMode.NETWORK     // Catch:{ Exception -> 0x0050 }
            java.lang.Class r0 = r0.getReturnType()     // Catch:{ Exception -> 0x0050 }
            r3 = 1
            java.lang.Object r5 = com.rmn.api.p322v2.main.json.ParsingManagerJson.convertJSONValueToObjectValue(r2, r0, r5, r3)     // Catch:{ Exception -> 0x0050 }
            r4.retrievedObject = r5     // Catch:{ Exception -> 0x0050 }
            return r3
        L_0x0050:
            r5 = move-exception
            p446vd.C13633n.m31165u(r4, r5)
            return r1
        L_0x0055:
            java.lang.String r5 = "JSON container object not found"
            p446vd.C13633n.m31163s(r4, r5)
            return r1
        L_0x005b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.proxy.ProxyResponseObject.setJSONObject(org.json.JSONObject):boolean");
    }
}
