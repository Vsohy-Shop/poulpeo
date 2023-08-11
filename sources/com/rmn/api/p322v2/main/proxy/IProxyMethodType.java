package com.rmn.api.p322v2.main.proxy;

import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.general.IApiType;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.api.p322v2.main.parser.IProxyMethodParser;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.Set;

/* renamed from: com.rmn.api.v2.main.proxy.IProxyMethodType */
public interface IProxyMethodType {
    IApiType getApiType();

    ICacheMethodType getCacheMethod(ContextContainer contextContainer);

    String getCompleteUrl();

    HttpMethod getHttpMethod();

    IProxyMethodParser getMethodParser();

    String getName();

    AbstractProxy getProxy();

    Set<RMNMethodReturnType> getReturns(ContextContainer contextContainer);

    boolean has2LeggedRequests();

    boolean hasParam(ContextContainer contextContainer, RMNMethodParam rMNMethodParam);

    boolean hasReturn(ContextContainer contextContainer, RMNMethodReturnType rMNMethodReturnType);
}
