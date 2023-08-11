package com.rmn.apiclient.core.data_access.proxy.processor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.call.BaseCall;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.cache.call.CacheInput;
import com.rmn.apiclient.core.data_access.cache.strategy.CacheStrategy;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.iosadapters.android.content.ContextContainer;

public class ProxyProcessorClearCache extends BaseProxyActionProcessor {
    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$process$1(IActionProcessorListener iActionProcessorListener, ProxyOutput proxyOutput, BaseCall baseCall) {
        iActionProcessorListener.onActionProcessed(this, proxyOutput);
    }

    public boolean isReadingData() {
        return false;
    }

    public boolean isWritingRetrievedData() {
        return false;
    }

    public void process(@NonNull ContextContainer contextContainer, @NonNull ProxyInput proxyInput, @NonNull ProxyOutput proxyOutput, @NonNull IActionProcessorListener<ProxyOutput> iActionProcessorListener) {
        new CacheInput.Builder(getCacheMethodDescriptor(proxyInput), CacheStrategy.clearInMemory().thenClearInDatabase()).build().call(contextContainer).addOnFailureListener(new C11596e(proxyInput)).addOnCompleteListener(new C11597f(this, iActionProcessorListener, proxyOutput));
    }
}
