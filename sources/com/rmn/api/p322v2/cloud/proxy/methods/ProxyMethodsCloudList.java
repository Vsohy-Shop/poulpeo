package com.rmn.api.p322v2.cloud.proxy.methods;

import com.rmn.api.p322v2.cloud.cache.methods.CacheMethodsCloudList;
import com.rmn.api.p322v2.cloud.general.CloudApiType;
import com.rmn.api.p322v2.cloud.general.CloudMethodNames;
import com.rmn.api.p322v2.cloud.general.CloudMethodParameters;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import com.rmn.api.p322v2.cloud.proxy.CloudListProxy;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.api.p322v2.main.parser.ProxyMethodParserDefault;
import com.rmn.api.p322v2.main.proxy.BaseProxyMethodType;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import java.util.HashSet;

/* renamed from: com.rmn.api.v2.cloud.proxy.methods.ProxyMethodsCloudList */
public class ProxyMethodsCloudList {
    public static final CloudListProxy CLOUD_LIST_PROXY;
    public static final IProxyMethodType GET_DETAILS;

    /* renamed from: com.rmn.api.v2.cloud.proxy.methods.ProxyMethodsCloudList$a */
    class C11238a extends HashSet<RMNMethodParam> {
        C11238a() {
            add(CloudMethodParameters.ID_LIST);
            add(CloudMethodParameters.WITH_ALL_VALUES);
            add(CloudMethodParameters.WITH_SCHEDULING);
        }
    }

    /* renamed from: com.rmn.api.v2.cloud.proxy.methods.ProxyMethodsCloudList$b */
    class C11239b extends HashSet<RMNMethodReturnJSON> {
        C11239b() {
            add(CloudMethodReturns.CLOUD_LIST_DETAIL);
        }
    }

    static {
        CloudListProxy cloudListProxy = new CloudListProxy();
        CLOUD_LIST_PROXY = cloudListProxy;
        GET_DETAILS = new BaseProxyMethodType(CloudMethodNames.CLOUD_LIST_GET_DETAILS, CloudApiType.CLOUD, cloudListProxy, new ProxyMethodParserDefault(), new C11238a(), new C11239b(), HttpMethod.POST, true, CacheMethodsCloudList.GET_DETAILS);
    }
}
