package com.rmn.api.p322v2.main.oauth;

/* renamed from: com.rmn.api.v2.main.oauth.IAsyncTaskRequestsListener */
public interface IAsyncTaskRequestsListener {
    void onRequestCancelled(BundleRequest bundleRequest);

    void onRequestFailed(BundleRequest bundleRequest, boolean z, int i);

    void onRequestSucceededInsideUIThread(BundleRequest bundleRequest, boolean z);

    boolean onRequestSucceededOutsideUIThread(BundleRequest bundleRequest, String str);
}
