package com.rmn.api.p322v2.poulpeo.proxy.methods;

import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.api.p322v2.main.parser.ProxyMethodParserDefault;
import com.rmn.api.p322v2.main.proxy.BaseProxyMethodType;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.poulpeo.general.PLPApiType;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodNames;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.proxy.PLPDefaultProxy;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUserConsent */
public class ProxyMethodsPLPUserConsent {
    public static final IProxyMethodType APPROVE_PAGES;
    public static final IProxyMethodType GET_PAGES_TO_APPROVE;

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUserConsent$a */
    class C11565a extends HashSet<RMNMethodReturnJSON> {
        C11565a() {
            add(PLPMethodReturns.CURRENT_TERMS);
            add(PLPMethodReturns.LAST_TERMS_ACCEPTED);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUserConsent$b */
    class C11566b extends HashSet<RMNMethodParam> {
        C11566b() {
            add(PLPMethodParameters.CURRENT_TERMS);
        }
    }

    static {
        PLPApiType pLPApiType = PLPApiType.PLP;
        PLPDefaultProxy pLPDefaultProxy = new PLPDefaultProxy();
        ProxyMethodParserDefault proxyMethodParserDefault = new ProxyMethodParserDefault();
        C11565a aVar = new C11565a();
        HttpMethod httpMethod = HttpMethod.GET;
        GET_PAGES_TO_APPROVE = new BaseProxyMethodType(PLPMethodNames.GET_PAGES_TO_APPROVE, pLPApiType, pLPDefaultProxy, proxyMethodParserDefault, (Set<RMNMethodParam>) null, aVar, httpMethod, true, (ICacheMethodType) null);
        APPROVE_PAGES = new BaseProxyMethodType(PLPMethodNames.APPROVE_PAGES, pLPApiType, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11566b(), (Set<RMNMethodReturnJSON>) null, httpMethod, true, (ICacheMethodType) null);
    }
}
