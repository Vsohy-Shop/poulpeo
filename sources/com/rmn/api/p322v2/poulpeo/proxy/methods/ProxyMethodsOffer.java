package com.rmn.api.p322v2.poulpeo.proxy.methods;

import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.api.p322v2.main.parser.ProxyMethodParserDefault;
import com.rmn.api.p322v2.main.proxy.BaseProxyMethodType;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsOffer;
import com.rmn.api.p322v2.poulpeo.general.PLPApiType;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodNames;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.proxy.OfferProxy;
import java.util.HashSet;

/* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsOffer */
public class ProxyMethodsOffer {
    public static final IProxyMethodType GET_BY_MERCHANT;
    public static final IProxyMethodType GET_DETAILS;

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsOffer$a */
    class C11520a extends HashSet<RMNMethodParam> {
        C11520a() {
            add(PLPMethodParameters.ID_COUPON_REQUIRED);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsOffer$b */
    class C11521b extends HashSet<RMNMethodReturnJSON> {
        C11521b() {
            add(PLPMethodReturns.OFFER_DETAIL);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsOffer$c */
    class C11522c extends HashSet<RMNMethodParam> {
        C11522c() {
            add(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED);
            add(PLPMethodParameters.OFFSET);
            add(PLPMethodParameters.LIMIT);
            add(PLPMethodParameters.COUPON_TYPES);
            add(PLPMethodParameters.CODE_TYPES);
            add(PLPMethodParameters.ONLY_CASHBACK_CUMULATIVE);
            add(PLPMethodParameters.WITH_DYNAMIC);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsOffer$d */
    class C11523d extends HashSet<RMNMethodReturnJSON> {
        C11523d() {
            add(PLPMethodReturns.PLP_MERCHANT_OBJECT);
            add(PLPMethodReturns.OFFERS_ARRAY);
            add(PLPMethodReturns.TOTAL_COUNT);
        }
    }

    static {
        PLPApiType pLPApiType = PLPApiType.PLP;
        OfferProxy offerProxy = new OfferProxy();
        ProxyMethodParserDefault proxyMethodParserDefault = new ProxyMethodParserDefault();
        C11520a aVar = new C11520a();
        C11521b bVar = new C11521b();
        HttpMethod httpMethod = HttpMethod.GET;
        GET_DETAILS = new BaseProxyMethodType(PLPMethodNames.COUPON_GET_DETAILS, pLPApiType, offerProxy, proxyMethodParserDefault, aVar, bVar, httpMethod, true, CacheMethodsOffer.GET_DETAILS);
        GET_BY_MERCHANT = new BaseProxyMethodType(PLPMethodNames.COUPON_GET_BY_MERCHANT, pLPApiType, new OfferProxy(), new ProxyMethodParserDefault(), new C11522c(), new C11523d(), httpMethod, true, CacheMethodsOffer.GET_BY_MERCHANT);
    }
}
