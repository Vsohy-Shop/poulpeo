package com.rmn.api.p322v2.main.proxy;

/* renamed from: com.rmn.api.v2.main.proxy.ProxyBundleWrapper */
public class ProxyBundleWrapper {
    public final ProxyBundleInput input;
    public final ProxyBundleOutput output;

    public ProxyBundleWrapper(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleInput == null) {
            throw new IllegalArgumentException();
        } else if (proxyBundleOutput != null) {
            this.input = proxyBundleInput;
            this.output = proxyBundleOutput;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
