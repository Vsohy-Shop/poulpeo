package com.rmn.api.p322v2.poulpeo.proxy.methods;

import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.api.p322v2.main.parser.ProxyMethodParserDefault;
import com.rmn.api.p322v2.main.proxy.BaseProxyMethodType;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPPinnedObject;
import com.rmn.api.p322v2.poulpeo.general.PLPApiType;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodNames;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.proxy.PLPDefaultProxy;
import com.rmn.api.p322v2.poulpeo.proxy.PLPPinnedObjectProxy;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPPinnedObject */
public class ProxyMethodsPLPPinnedObject {
    public static final IProxyMethodType PLP_PINNED_OBJECTS_ADD;
    public static final IProxyMethodType PLP_PINNED_OBJECT_GET_LIST;
    public static final IProxyMethodType PLP_PINNED_OBJECT_REMOVE;

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPPinnedObject$a */
    class C11534a extends HashSet<RMNMethodParam> {
        C11534a() {
            add(PLPMethodParameters.PLP_PINNED_OBJECT_TYPE_OPTIONAL);
            add(PLPMethodParameters.PLP_PINNED_OBJECT_MODEL_OPTIONAL);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPPinnedObject$b */
    class C11535b extends HashSet<RMNMethodReturnJSON> {
        C11535b() {
            add(PLPMethodReturns.PLP_PINNED_OBJECT_ARRAY);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPPinnedObject$c */
    class C11536c extends HashSet<RMNMethodParam> {
        C11536c() {
            add(PLPMethodParameters.IDS_ARRAY_REQUIRED);
            add(PLPMethodParameters.PLP_PINNED_OBJECT_TYPE_REQUIRED);
            add(PLPMethodParameters.PLP_PINNED_OBJECT_MODEL_REQUIRED);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPPinnedObject$d */
    class C11537d extends HashSet<RMNMethodParam> {
        C11537d() {
            add(PLPMethodParameters.IDS_ARRAY_REQUIRED);
            add(PLPMethodParameters.PLP_PINNED_OBJECT_TYPE_REQUIRED);
            add(PLPMethodParameters.PLP_PINNED_OBJECT_MODEL_REQUIRED);
        }
    }

    static {
        PLPApiType pLPApiType = PLPApiType.PLP;
        PLPPinnedObjectProxy pLPPinnedObjectProxy = new PLPPinnedObjectProxy();
        ProxyMethodParserDefault proxyMethodParserDefault = new ProxyMethodParserDefault();
        C11534a aVar = new C11534a();
        C11535b bVar = new C11535b();
        HttpMethod httpMethod = HttpMethod.GET;
        PLP_PINNED_OBJECT_GET_LIST = new BaseProxyMethodType(PLPMethodNames.PLP_PINNED_OBJECT_GET_LIST, pLPApiType, pLPPinnedObjectProxy, proxyMethodParserDefault, aVar, bVar, httpMethod, true, CacheMethodsPLPPinnedObject.GET_LIST);
        PLPApiType pLPApiType2 = pLPApiType;
        HttpMethod httpMethod2 = httpMethod;
        PLP_PINNED_OBJECTS_ADD = new BaseProxyMethodType(PLPMethodNames.PLP_PINNED_OBJECT_ADD, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11536c(), (Set<RMNMethodReturnJSON>) null, httpMethod2, true, (ICacheMethodType) null);
        PLP_PINNED_OBJECT_REMOVE = new BaseProxyMethodType(PLPMethodNames.PLP_PINNED_OBJECT_REMOVE, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11537d(), (Set<RMNMethodReturnJSON>) null, httpMethod2, true, (ICacheMethodType) null);
    }
}
