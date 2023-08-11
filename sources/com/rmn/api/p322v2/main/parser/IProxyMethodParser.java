package com.rmn.api.p322v2.main.parser;

import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.general.responseobject.RMNResponseObjectImmutable;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.Map;

/* renamed from: com.rmn.api.v2.main.parser.IProxyMethodParser */
public interface IProxyMethodParser {
    Map<RMNMethodReturnType, RMNResponseObjectImmutable> parseResponseString(ContextContainer contextContainer, ProxyBundleOutput proxyBundleOutput, String str);
}
