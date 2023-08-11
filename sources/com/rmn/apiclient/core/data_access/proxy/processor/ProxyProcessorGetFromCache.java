package com.rmn.apiclient.core.data_access.proxy.processor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.OutputStatus;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.cache.call.CacheInput;
import com.rmn.apiclient.core.data_access.cache.call.CacheOutput;
import com.rmn.apiclient.core.data_access.cache.strategy.CacheStrategy;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.iosadapters.android.content.ContextContainer;

public class ProxyProcessorGetFromCache extends BaseProxyActionProcessor {
    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$process$0(IActionProcessorListener iActionProcessorListener, ProxyInput proxyInput, CallException callException) {
        iActionProcessorListener.onActionProcessed(this, new ProxyOutput.Builder(proxyInput, OutputStatus.FAILURE).setCacheHit(true).setException(callException).build());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$process$1(IActionProcessorListener iActionProcessorListener, ProxyInput proxyInput, CacheOutput cacheOutput) {
        iActionProcessorListener.onActionProcessed(this, new ProxyOutput.Builder(proxyInput, OutputStatus.SUCCESS).setCacheHit(true).setDocument(cacheOutput.getDocument()).build());
    }

    public boolean isReadingData() {
        return true;
    }

    public boolean isWritingRetrievedData() {
        return false;
    }

    public void process(@NonNull ContextContainer contextContainer, @NonNull ProxyInput proxyInput, @NonNull ProxyOutput proxyOutput, @NonNull IActionProcessorListener<ProxyOutput> iActionProcessorListener) {
        new CacheInput.Builder(getCacheMethodDescriptor(proxyInput), CacheStrategy.getFromMemory().orThenGetFromDatabase().thenDeserialize().thenAddInMemory()).addParamSet(proxyInput.getParams()).build().call(contextContainer).addOnFailureListener(new C11598g(this, iActionProcessorListener, proxyInput)).addOnSuccessListener(new C11599h(this, iActionProcessorListener, proxyInput));
    }
}
