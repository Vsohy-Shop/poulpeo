package com.rmn.api.p322v2.main.proxy;

import com.rmn.api.p322v2.main.oauth.BundleRequest;

/* renamed from: com.rmn.api.v2.main.proxy.BundleProxyRequest */
class BundleProxyRequest {

    /* renamed from: a */
    private BundleRequest f17923a;

    /* renamed from: b */
    private IProxyListener f17924b;

    public BundleProxyRequest(BundleRequest bundleRequest, IProxyListener iProxyListener) {
        if (bundleRequest != null) {
            this.f17923a = bundleRequest;
            this.f17924b = iProxyListener;
            return;
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BundleProxyRequest bundleProxyRequest = (BundleProxyRequest) obj;
        BundleRequest bundleRequest = this.f17923a;
        if (bundleRequest == null) {
            if (bundleProxyRequest.f17923a != null) {
                return false;
            }
        } else if (!bundleRequest.equals(bundleProxyRequest.f17923a)) {
            return false;
        }
        IProxyListener iProxyListener = this.f17924b;
        if (iProxyListener == null) {
            if (bundleProxyRequest.f17924b != null) {
                return false;
            }
        } else if (!iProxyListener.equals(bundleProxyRequest.f17924b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        BundleRequest bundleRequest = this.f17923a;
        int i2 = 0;
        if (bundleRequest == null) {
            i = 0;
        } else {
            i = bundleRequest.hashCode();
        }
        int i3 = (i + 31) * 31;
        IProxyListener iProxyListener = this.f17924b;
        if (iProxyListener != null) {
            i2 = iProxyListener.hashCode();
        }
        return i3 + i2;
    }
}
