package com.rmn.api.p322v2.poulpeo.proxy.methods;

import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.api.p322v2.main.parser.ProxyMethodParserDefault;
import com.rmn.api.p322v2.main.proxy.BaseProxyMethodType;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPMerchant;
import com.rmn.api.p322v2.poulpeo.general.PLPApiType;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodNames;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.proxy.PLPDefaultProxy;
import java.util.HashSet;

/* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant */
public class ProxyMethodsPLPMerchant {
    public static final IProxyMethodType ACTIVATE_CASHBACK;
    public static final IProxyMethodType GET_DETAILS;
    public static final IProxyMethodType GET_SIMILAR;
    public static final IProxyMethodType SEARCH;

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant$a */
    class C11526a extends HashSet<RMNMethodParam> {
        C11526a() {
            add(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant$b */
    class C11527b extends HashSet<RMNMethodReturnJSON> {
        C11527b() {
            add(PLPMethodReturns.PLP_MERCHANT_DETAIL);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant$c */
    class C11528c extends HashSet<RMNMethodParam> {
        C11528c() {
            add(PLPMethodParameters.QUERY_REQUIRED);
            add(PLPMethodParameters.OFFSET);
            add(PLPMethodParameters.LIMIT);
            add(PLPMethodParameters.SORT_PROPERTY);
            add(PLPMethodParameters.SORT_ORDER);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant$d */
    class C11529d extends HashSet<RMNMethodReturnJSON> {
        C11529d() {
            add(PLPMethodReturns.PLP_MERCHANT_ARRAY);
            add(PLPMethodReturns.TOTAL_COUNT);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant$e */
    class C11530e extends HashSet<RMNMethodParam> {
        C11530e() {
            add(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED);
            add(PLPMethodParameters.OFFSET);
            add(PLPMethodParameters.LIMIT);
            add(PLPMethodParameters.HAS_CASHBACK);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant$f */
    class C11531f extends HashSet<RMNMethodReturnJSON> {
        C11531f() {
            add(PLPMethodReturns.PLP_MERCHANT_ARRAY);
            add(PLPMethodReturns.TOTAL_COUNT);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant$g */
    class C11532g extends HashSet<RMNMethodParam> {
        C11532g() {
            add(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED);
            add(PLPMethodParameters.ID_COUPON_OPTIONAL);
            add(PLPMethodParameters.OPEN_DATA);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant$h */
    class C11533h extends HashSet<RMNMethodReturnJSON> {
        C11533h() {
            add(PLPMethodReturns.PLP_MERCHANT_URL);
        }
    }

    static {
        PLPApiType pLPApiType = PLPApiType.PLP;
        PLPDefaultProxy pLPDefaultProxy = new PLPDefaultProxy();
        ProxyMethodParserDefault proxyMethodParserDefault = new ProxyMethodParserDefault();
        C11526a aVar = new C11526a();
        C11527b bVar = new C11527b();
        HttpMethod httpMethod = HttpMethod.GET;
        GET_DETAILS = new BaseProxyMethodType(PLPMethodNames.PLP_MERCHANT_GET_DETAILS, pLPApiType, pLPDefaultProxy, proxyMethodParserDefault, aVar, bVar, httpMethod, true, CacheMethodsPLPMerchant.GET_DETAILS);
        PLPApiType pLPApiType2 = pLPApiType;
        HttpMethod httpMethod2 = httpMethod;
        SEARCH = new BaseProxyMethodType(PLPMethodNames.PLP_MERCHANT_SEARCH, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11528c(), new C11529d(), httpMethod2, true, CacheMethodsPLPMerchant.SEARCH);
        GET_SIMILAR = new BaseProxyMethodType(PLPMethodNames.PLP_MERCHANT_GET_SIMILAR, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11530e(), new C11531f(), httpMethod2, true, CacheMethodsPLPMerchant.GET_SIMILAR);
        ACTIVATE_CASHBACK = new BaseProxyMethodType(PLPMethodNames.PLP_MERCHANT_ACTIVATE_CASHBACK, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11532g(), new C11533h(), HttpMethod.POST, true, (ICacheMethodType) null);
    }
}
