package com.rmn.api.p322v2.poulpeo.proxy.methods;

import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.api.p322v2.main.parser.ProxyMethodParserDefault;
import com.rmn.api.p322v2.main.proxy.BaseProxyMethodType;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsSupportTicket;
import com.rmn.api.p322v2.poulpeo.general.PLPApiType;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodNames;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.proxy.PLPDefaultProxy;
import java.util.HashSet;

/* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsSupportTicket */
public class ProxyMethodsSupportTicket {
    public static final IProxyMethodType SUPPORT_TICKET_GET_DETAILS;
    public static final IProxyMethodType SUPPORT_TICKET_GET_INVOICE;
    public static final IProxyMethodType SUPPORT_TICKET_GET_LIST;

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsSupportTicket$a */
    class C11571a extends HashSet<RMNMethodParam> {
        C11571a() {
            add(PLPMethodParameters.SUPPORT_TICKET_STATUS_FILTER);
            add(PLPMethodParameters.OFFSET);
            add(PLPMethodParameters.LIMIT);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsSupportTicket$b */
    class C11572b extends HashSet<RMNMethodReturnJSON> {
        C11572b() {
            add(PLPMethodReturns.SUPPORT_TICKET_ARRAY);
            add(PLPMethodReturns.TOTAL_COUNT);
            add(PLPMethodReturns.SUPPORT_TICKET_HELP);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsSupportTicket$c */
    class C11573c extends HashSet<RMNMethodParam> {
        C11573c() {
            add(PLPMethodParameters.ID_SUPPORT_TICKET_REQUIRED);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsSupportTicket$d */
    class C11574d extends HashSet<RMNMethodReturnJSON> {
        C11574d() {
            add(PLPMethodReturns.SUPPORT_TICKET_DETAIL);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsSupportTicket$e */
    class C11575e extends HashSet<RMNMethodParam> {
        C11575e() {
            add(PLPMethodParameters.ID_INVOICE_REQUIRED);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsSupportTicket$f */
    class C11576f extends HashSet<RMNMethodReturnJSON> {
        C11576f() {
            add(PLPMethodReturns.GENERIC_ELEMENT_DETAIL);
        }
    }

    static {
        PLPApiType pLPApiType = PLPApiType.PLP;
        PLPDefaultProxy pLPDefaultProxy = new PLPDefaultProxy();
        ProxyMethodParserDefault proxyMethodParserDefault = new ProxyMethodParserDefault();
        C11571a aVar = new C11571a();
        C11572b bVar = new C11572b();
        HttpMethod httpMethod = HttpMethod.GET;
        SUPPORT_TICKET_GET_LIST = new BaseProxyMethodType(PLPMethodNames.SUPPORT_TICKET_GET_LIST, pLPApiType, pLPDefaultProxy, proxyMethodParserDefault, aVar, bVar, httpMethod, true, CacheMethodsSupportTicket.GET_LIST);
        PLPApiType pLPApiType2 = pLPApiType;
        HttpMethod httpMethod2 = httpMethod;
        SUPPORT_TICKET_GET_DETAILS = new BaseProxyMethodType(PLPMethodNames.SUPPORT_TICKET_GET_DETAILS, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11573c(), new C11574d(), httpMethod2, true, CacheMethodsSupportTicket.GET_DETAILS);
        SUPPORT_TICKET_GET_INVOICE = new BaseProxyMethodType(PLPMethodNames.SUPPORT_TICKET_GET_INVOICE, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11575e(), new C11576f(), httpMethod2, true, (ICacheMethodType) null);
    }
}
