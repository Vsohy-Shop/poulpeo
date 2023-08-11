package com.rmn.api.p322v2.poulpeo.proxy;

import androidx.annotation.Nullable;
import com.rmn.api.p322v2.main.general.ListenerSecurity;
import com.rmn.api.p322v2.main.proxy.AbstractProxy;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils_common.IListener;

/* renamed from: com.rmn.api.v2.poulpeo.proxy.PLPDefaultProxy */
public class PLPDefaultProxy extends AbstractProxy {
    @Nullable
    private IListener<PLPUser> userUpdateListener;

    /* access modifiers changed from: protected */
    public boolean doAdditionalOperationsBeforeNotifyingListener(ContextContainer contextContainer, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity, boolean z) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void notifyUserUpdate(@Nullable PLPUser pLPUser) {
        IListener<PLPUser> iListener = this.userUpdateListener;
        if (iListener != null) {
            iListener.mo40744J0(pLPUser);
        }
    }

    public void setUserUpdateListener(@Nullable IListener<PLPUser> iListener) {
        this.userUpdateListener = iListener;
    }

    /* access modifiers changed from: protected */
    public void doAdditionalOperationsAfterRetrievingData(ContextContainer contextContainer, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, boolean z) {
    }
}
