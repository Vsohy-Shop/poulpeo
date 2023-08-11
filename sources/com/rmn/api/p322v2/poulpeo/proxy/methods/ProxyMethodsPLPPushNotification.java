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

/* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPPushNotification */
public class ProxyMethodsPLPPushNotification {
    public static final IProxyMethodType CONFIGURE = new BaseProxyMethodType(PLPMethodNames.PLP_PUSH_NOTIFICATION_CONFIGURE, PLPApiType.PLP, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11538a(), new C11539b(), HttpMethod.GET, true, (ICacheMethodType) null);

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPPushNotification$a */
    class C11538a extends HashSet<RMNMethodParam> {
        C11538a() {
            add(PLPMethodParameters.PLP_PUSH_NOTIFICATION_EARNING);
            add(PLPMethodParameters.PLP_PUSH_NOTIFICATION_CASHBACK_INCREASE);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPPushNotification$b */
    class C11539b extends HashSet<RMNMethodReturnJSON> {
        C11539b() {
            add(PLPMethodReturns.PLP_PUSH_NOTIFICATION_EARNING);
            add(PLPMethodReturns.PLP_PUSH_NOTIFICATION_CASHBACK_INCREASE);
        }
    }
}
