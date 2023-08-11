package com.rmn.apiclient.core.data_access.proxy.processor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data_access.base.call.BaseCall;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.cache.call.CacheBodyContainer;
import com.rmn.apiclient.core.data_access.cache.call.CacheInput;
import com.rmn.apiclient.core.data_access.cache.strategy.CacheStrategy;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.iosadapters.android.content.ContextContainer;

public class ProxyProcessorAddToCache extends BaseProxyActionProcessor {
    @Nullable
    private CacheBodyContainer extractBody(@NonNull ProxyOutput proxyOutput) {
        IDocument document = proxyOutput.getDocument();
        if (document == null) {
            return null;
        }
        return new CacheBodyContainer(document, proxyOutput.getRawResponse());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$process$1(IActionProcessorListener iActionProcessorListener, ProxyOutput proxyOutput, BaseCall baseCall) {
        iActionProcessorListener.onActionProcessed(this, proxyOutput);
    }

    public boolean isReadingData() {
        return false;
    }

    public boolean isWritingRetrievedData() {
        return true;
    }

    public void process(@NonNull ContextContainer contextContainer, @NonNull ProxyInput proxyInput, @NonNull ProxyOutput proxyOutput, @NonNull IActionProcessorListener<ProxyOutput> iActionProcessorListener) {
        CacheBodyContainer extractBody = extractBody(proxyOutput);
        if (extractBody == null) {
            iActionProcessorListener.onActionProcessed(this, proxyOutput);
        } else {
            new CacheInput.Builder(getCacheMethodDescriptor(proxyInput), CacheStrategy.addInMemory().thenAddInDatabase()).addParamSet(proxyInput.getParams()).setBody(extractBody).build().call(contextContainer).addOnFailureListener(new C11592a(proxyInput)).addOnCompleteListener(new C11593b(this, iActionProcessorListener, proxyOutput));
        }
    }
}
