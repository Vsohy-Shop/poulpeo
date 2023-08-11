package com.rmn.api.p322v2.poulpeo.proxy.methods;

import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.api.p322v2.main.parser.ProxyMethodParserDefault;
import com.rmn.api.p322v2.main.proxy.BaseProxyMethodType;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsCountry;
import com.rmn.api.p322v2.poulpeo.general.PLPApiType;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodNames;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.proxy.PLPDefaultProxy;
import java.util.HashSet;

/* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsCountry */
public class ProxyMethodsCountry {
    public static final IProxyMethodType SEARCH = new BaseProxyMethodType(PLPMethodNames.COUNTRY_SEARCH, PLPApiType.PLP, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11514a(), new C11515b(), HttpMethod.GET, true, CacheMethodsCountry.SEARCH);

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsCountry$a */
    class C11514a extends HashSet<RMNMethodParam> {
        C11514a() {
            add(PLPMethodParameters.QUERY_REQUIRED);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsCountry$b */
    class C11515b extends HashSet<RMNMethodReturnJSON> {
        C11515b() {
            add(PLPMethodReturns.COUNTRY_ARRAY);
        }
    }
}
