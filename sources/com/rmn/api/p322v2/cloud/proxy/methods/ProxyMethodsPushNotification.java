package com.rmn.api.p322v2.cloud.proxy.methods;

import com.rmn.api.p322v2.cloud.general.CloudApiType;
import com.rmn.api.p322v2.cloud.general.CloudMethodNames;
import com.rmn.api.p322v2.cloud.general.CloudMethodParameters;
import com.rmn.api.p322v2.cloud.proxy.CloudDefaultProxy;
import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.api.p322v2.main.parser.ProxyMethodParserDefault;
import com.rmn.api.p322v2.main.proxy.BaseProxyMethodType;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.rmn.api.v2.cloud.proxy.methods.ProxyMethodsPushNotification */
public class ProxyMethodsPushNotification {
    public static final IProxyMethodType REGISTER;
    public static final IProxyMethodType UNREGISTER;

    /* renamed from: com.rmn.api.v2.cloud.proxy.methods.ProxyMethodsPushNotification$a */
    class C11240a extends HashSet<RMNMethodParam> {
        C11240a() {
            add(CloudMethodParameters.PUSH_APPLICATION_NAME_REQUIRED);
            add(CloudMethodParameters.PUSH_APPLICATION_VERSION_REQUIRED);
            add(CloudMethodParameters.PUSH_DEVICE_ID_REQUIRED);
            add(CloudMethodParameters.PUSH_DEVICE_NAME);
            add(CloudMethodParameters.PUSH_DEVICE_MODEL);
            add(CloudMethodParameters.PUSH_DEVICE_TOKEN_REQUIRED);
            add(CloudMethodParameters.PUSH_PLATFORM_NAME);
            add(CloudMethodParameters.PUSH_PLATFORM_VERSION);
            add(CloudMethodParameters.PUSH_USER_AGENT);
            add(CloudMethodParameters.PUSH_USER_ID);
            add(CloudMethodParameters.PUSH_SCREEN_SIZE);
            add(CloudMethodParameters.PUSH_FINGER_PRINT_REQUIRED);
            add(CloudMethodParameters.PUSH_VIEWPORT);
            add(CloudMethodParameters.PUSH_SENDER);
        }
    }

    /* renamed from: com.rmn.api.v2.cloud.proxy.methods.ProxyMethodsPushNotification$b */
    class C11241b extends HashSet<RMNMethodParam> {
        C11241b() {
            add(CloudMethodParameters.PUSH_APPLICATION_NAME_REQUIRED);
            add(CloudMethodParameters.PUSH_APPLICATION_VERSION_REQUIRED);
            add(CloudMethodParameters.PUSH_DEVICE_ID_REQUIRED);
            add(CloudMethodParameters.PUSH_DEVICE_NAME);
            add(CloudMethodParameters.PUSH_DEVICE_MODEL);
            add(CloudMethodParameters.PUSH_DEVICE_TOKEN_REQUIRED);
            add(CloudMethodParameters.PUSH_PLATFORM_NAME);
            add(CloudMethodParameters.PUSH_PLATFORM_VERSION);
            add(CloudMethodParameters.PUSH_USER_AGENT);
            add(CloudMethodParameters.PUSH_USER_ID);
            add(CloudMethodParameters.PUSH_SCREEN_SIZE);
            add(CloudMethodParameters.PUSH_FINGER_PRINT_REQUIRED);
            add(CloudMethodParameters.PUSH_VIEWPORT);
            add(CloudMethodParameters.PUSH_SENDER);
        }
    }

    static {
        CloudApiType cloudApiType = CloudApiType.CLOUD;
        CloudDefaultProxy cloudDefaultProxy = new CloudDefaultProxy();
        ProxyMethodParserDefault proxyMethodParserDefault = new ProxyMethodParserDefault();
        C11240a aVar = new C11240a();
        HttpMethod httpMethod = HttpMethod.POST;
        REGISTER = new BaseProxyMethodType(CloudMethodNames.PUSH_NOTIFICATION_REGISTER, cloudApiType, cloudDefaultProxy, proxyMethodParserDefault, aVar, (Set<RMNMethodReturnJSON>) null, httpMethod, true, (ICacheMethodType) null);
        UNREGISTER = new BaseProxyMethodType(CloudMethodNames.PUSH_NOTIFICATION_UNREGISTER, cloudApiType, new CloudDefaultProxy(), new ProxyMethodParserDefault(), new C11241b(), (Set<RMNMethodReturnJSON>) null, httpMethod, true, (ICacheMethodType) null);
    }
}
