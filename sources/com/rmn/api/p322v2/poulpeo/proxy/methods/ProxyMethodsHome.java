package com.rmn.api.p322v2.poulpeo.proxy.methods;

import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.api.p322v2.main.parser.ProxyMethodParserDefault;
import com.rmn.api.p322v2.main.proxy.BaseProxyMethodType;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPHome;
import com.rmn.api.p322v2.poulpeo.general.PLPApiType;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodNames;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.proxy.PLPDefaultProxy;
import com.rmn.api.p322v2.poulpeo.proxy.PLPHomeProxy;
import java.util.HashSet;

/* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsHome */
public class ProxyMethodsHome {
    public static final IProxyMethodType APP_GET_MERCHANTS_BY_TAG;
    public static final IProxyMethodType APP_HOME;

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsHome$a */
    class C11516a extends HashSet<RMNMethodParam> {
        C11516a() {
            add(PLPMethodParameters.LIMIT);
            add(PLPMethodParameters.TIMESTAMP);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsHome$b */
    class C11517b extends HashSet<RMNMethodReturnJSON> {
        C11517b() {
            add(PLPMethodReturns.PLP_USER_DETAIL_NAMED);
            add(PLPMethodReturns.HOME_SECTION_REF_ARRAY);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsHome$c */
    class C11518c extends HashSet<RMNMethodParam> {
        C11518c() {
            add(PLPMethodParameters.SECTION_TAG);
            add(PLPMethodParameters.TIMESTAMP);
            add(PLPMethodParameters.OFFSET);
            add(PLPMethodParameters.LIMIT);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsHome$d */
    class C11519d extends HashSet<RMNMethodReturnJSON> {
        C11519d() {
            add(PLPMethodReturns.PLP_MERCHANT_ARRAY);
            add(PLPMethodReturns.TOTAL_COUNT);
        }
    }

    static {
        PLPApiType pLPApiType = PLPApiType.PLP;
        PLPHomeProxy pLPHomeProxy = new PLPHomeProxy();
        ProxyMethodParserDefault proxyMethodParserDefault = new ProxyMethodParserDefault();
        C11516a aVar = new C11516a();
        C11517b bVar = new C11517b();
        HttpMethod httpMethod = HttpMethod.GET;
        APP_HOME = new BaseProxyMethodType(PLPMethodNames.APP_HOME, pLPApiType, pLPHomeProxy, proxyMethodParserDefault, aVar, bVar, httpMethod, true, CacheMethodsPLPHome.APP_HOME);
        APP_GET_MERCHANTS_BY_TAG = new BaseProxyMethodType(PLPMethodNames.APP_GET_MERCHANTS_BY_TAG, pLPApiType, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11518c(), new C11519d(), httpMethod, true, CacheMethodsPLPHome.APP_GET_MERCHANTS_BY_TAG);
    }
}
