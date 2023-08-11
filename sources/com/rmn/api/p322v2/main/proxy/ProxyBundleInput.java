package com.rmn.api.p322v2.main.proxy;

import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.oauth.BundleRequest;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.main.proxy.ProxyBundleInput */
public class ProxyBundleInput {
    private Map<RMNMethodParam, Object> args = new HashMap();
    private ContextContainer contextContainer;
    private LogoutListener logoutListener;
    private IProxyMethodType methodType;
    private ProxyNetworkOption networkOption;
    private ProxySourcesOption sourcesOption;

    /* renamed from: com.rmn.api.v2.main.proxy.ProxyBundleInput$ProxyNetworkOption */
    public enum ProxyNetworkOption {
        ADD_IN_CACHE,
        NO_CACHE;

        public static ProxyNetworkOption getDefaultOption() {
            return ADD_IN_CACHE;
        }
    }

    /* renamed from: com.rmn.api.v2.main.proxy.ProxyBundleInput$ProxySourcesOption */
    public enum ProxySourcesOption {
        CLEAR_CACHE_THEN_GET_FROM_NETWORK,
        GET_FROM_NETWORK_ONLY,
        GET_FROM_NETWORK_THEN_CLEAR_CACHE,
        GET_FROM_CACHE_ONLY,
        GET_FROM_CACHE_THEN_NETWORK;

        public static ProxySourcesOption getDefaultOption() {
            return GET_FROM_CACHE_THEN_NETWORK;
        }

        public static ProxySourcesOption getNoClearOption(ProxySourcesOption proxySourcesOption) {
            if (proxySourcesOption == null) {
                throw new IllegalArgumentException();
            } else if (proxySourcesOption == CLEAR_CACHE_THEN_GET_FROM_NETWORK) {
                return GET_FROM_CACHE_THEN_NETWORK;
            } else {
                if (proxySourcesOption == GET_FROM_NETWORK_THEN_CLEAR_CACHE) {
                    return GET_FROM_NETWORK_ONLY;
                }
                return proxySourcesOption;
            }
        }
    }

    public ProxyBundleInput(ContextContainer contextContainer2, IProxyMethodType iProxyMethodType, ProxySourcesOption proxySourcesOption, ProxyNetworkOption proxyNetworkOption, LogoutListener logoutListener2) {
        if (contextContainer2 == null) {
            throw new IllegalArgumentException();
        } else if (iProxyMethodType == null) {
            throw new IllegalArgumentException();
        } else if (proxySourcesOption == null) {
            throw new IllegalArgumentException();
        } else if (proxyNetworkOption != null) {
            this.contextContainer = contextContainer2;
            this.methodType = iProxyMethodType;
            this.sourcesOption = proxySourcesOption;
            this.networkOption = proxyNetworkOption;
            this.logoutListener = logoutListener2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void addParamValue(RMNMethodParam rMNMethodParam, Object obj) {
        if (rMNMethodParam == null) {
            throw new IllegalArgumentException();
        } else if (obj == null) {
            throw new IllegalArgumentException();
        } else if (!this.methodType.hasParam(this.contextContainer, rMNMethodParam)) {
            throw new IllegalArgumentException("The methodType " + this.methodType.getName() + " has no param " + rMNMethodParam.getKeyName() + " with required=" + rMNMethodParam.isRequired());
        } else if (!this.args.containsKey(rMNMethodParam)) {
            this.args.put(rMNMethodParam, rMNMethodParam.formatValue(obj));
        } else {
            throw new IllegalArgumentException("The methodParam " + rMNMethodParam.getKeyName() + " has already been added to the bundle");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProxyBundleInput proxyBundleInput = (ProxyBundleInput) obj;
        Map<RMNMethodParam, Object> map = this.args;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                RMNMethodParam rMNMethodParam = (RMNMethodParam) next.getKey();
                if (rMNMethodParam != null) {
                    Object value = next.getValue();
                    Object obj2 = proxyBundleInput.args.get(rMNMethodParam);
                    if (value == null) {
                        if (obj2 != null) {
                            return false;
                        }
                    } else if (!value.equals(obj2)) {
                        return false;
                    }
                }
            }
        } else if (proxyBundleInput.args != null) {
            return false;
        }
        IProxyMethodType iProxyMethodType = this.methodType;
        if (iProxyMethodType == null) {
            if (proxyBundleInput.methodType != null) {
                return false;
            }
        } else if (!iProxyMethodType.equals(proxyBundleInput.methodType)) {
            return false;
        }
        return true;
    }

    public final void executeProxyAction(IProxyListener iProxyListener) {
        this.methodType.getProxy().executeProxyAction(iProxyListener, this);
    }

    public final BundleRequest getBundleRequest() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry next : this.args.entrySet()) {
            RMNMethodParam rMNMethodParam = (RMNMethodParam) next.getKey();
            Object value = next.getValue();
            if (!rMNMethodParam.isArray()) {
                hashMap.put(rMNMethodParam.getKeyName(), rMNMethodParam.convertValue(value));
            } else {
                hashMap2.put(rMNMethodParam.getKeyName(), rMNMethodParam.convertArrayValue(value));
            }
        }
        try {
            return new BundleRequest(this.methodType.getApiType(), this.methodType.getCompleteUrl(), (Map<String, String>) hashMap, (Map<String, String[]>) hashMap2);
        } catch (MalformedURLException e) {
            C13633n.m31165u(this, e);
            return null;
        }
    }

    public final ContextContainer getContextContainer() {
        return this.contextContainer;
    }

    public final LogoutListener getLogoutListener() {
        return this.logoutListener;
    }

    public final ProxyNetworkOption getNetworkOption() {
        return this.networkOption;
    }

    public final Object getParamValue(RMNMethodParam rMNMethodParam) {
        if (rMNMethodParam == null) {
            throw new IllegalArgumentException();
        } else if (this.methodType.hasParam(this.contextContainer, rMNMethodParam)) {
            return this.args.get(rMNMethodParam);
        } else {
            throw new IllegalArgumentException("The methodType " + this.methodType.getName() + " has no param " + rMNMethodParam.getKeyName());
        }
    }

    public final Map<RMNMethodParam, Object> getParamValues() {
        return new HashMap(this.args);
    }

    public final AbstractProxy getProxy() {
        return this.methodType.getProxy();
    }

    public final IProxyMethodType getProxyMethod() {
        return this.methodType;
    }

    public final ProxySourcesOption getSourcesOption() {
        return this.sourcesOption;
    }

    public final boolean hasParamValue(RMNMethodParam rMNMethodParam) {
        if (rMNMethodParam != null) {
            return this.args.containsKey(rMNMethodParam);
        }
        throw new IllegalArgumentException();
    }

    public final boolean hasParams() {
        if (this.args.size() > 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        Map<RMNMethodParam, Object> map = this.args;
        int i2 = 0;
        if (map == null) {
            i = 0;
        } else {
            i = map.hashCode();
        }
        int i3 = (i + 31) * 31;
        IProxyMethodType iProxyMethodType = this.methodType;
        if (iProxyMethodType != null) {
            i2 = iProxyMethodType.hashCode();
        }
        return i3 + i2;
    }

    public final void setNetworkOption(ProxyNetworkOption proxyNetworkOption) {
        if (proxyNetworkOption != null) {
            this.networkOption = proxyNetworkOption;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void setSourceOption(ProxySourcesOption proxySourcesOption) {
        if (proxySourcesOption != null) {
            this.sourcesOption = proxySourcesOption;
            return;
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProxyBundleInput : ");
        IProxyMethodType iProxyMethodType = this.methodType;
        if (iProxyMethodType != null) {
            sb.append(iProxyMethodType.getName());
        }
        Map<RMNMethodParam, Object> map = this.args;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                sb.append(" - ");
                sb.append(((RMNMethodParam) next.getKey()).getKeyName());
                sb.append("=");
                sb.append(next.getValue());
            }
        }
        return sb.toString();
    }
}
