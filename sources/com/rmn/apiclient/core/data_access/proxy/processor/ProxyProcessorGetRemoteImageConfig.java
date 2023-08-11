package com.rmn.apiclient.core.data_access.proxy.processor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.config.IAPIConfig;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data_access.base.call.BaseCall;
import com.rmn.apiclient.core.data_access.base.call.OutputStatus;
import com.rmn.apiclient.core.data_access.base.call.exceptions.RemoteImageConfigCallException;
import com.rmn.apiclient.core.data_access.base.methods.BaseApiMethod;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.cache.memory.MemoryCacheRemoteImageConfig;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.model.IRemoteImageConfig;
import com.rmn.iosadapters.android.content.ContextContainer;

public class ProxyProcessorGetRemoteImageConfig extends BaseProxyActionProcessor {
    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$process$0(IActionProcessorListener iActionProcessorListener, ProxyOutput proxyOutput, BaseCall baseCall) {
        IRemoteImageConfig iRemoteImageConfig;
        IDocument document;
        if (!baseCall.isSuccessful() || (document = ((ProxyOutput) baseCall.getOutput()).getDocument()) == null) {
            iRemoteImageConfig = null;
        } else {
            iRemoteImageConfig = (IRemoteImageConfig) document.optFirstModel();
        }
        if (iRemoteImageConfig == null) {
            iActionProcessorListener.onActionProcessed(this, new ProxyOutput.Builder((ProxyInput) baseCall.input, OutputStatus.FAILURE).setException(new RemoteImageConfigCallException((ProxyOutput) baseCall.getOutput())).build());
            return;
        }
        MemoryCacheRemoteImageConfig.instance.setConfig(iRemoteImageConfig);
        iActionProcessorListener.onActionProcessed(this, proxyOutput);
    }

    public boolean isReadingData() {
        return false;
    }

    public boolean isWritingRetrievedData() {
        return false;
    }

    public boolean canProcessAction(@NonNull ProxyInput proxyInput, @NonNull ProxyOutput proxyOutput) {
        IAPIConfig aPIConfig;
        BaseApiMethod remoteConfigMethod;
        if (MemoryCacheRemoteImageConfig.instance.hasConfig() || (aPIConfig = getAPIConfig((ProxyInput) proxyOutput.getInput())) == null || (remoteConfigMethod = aPIConfig.getRemoteConfigMethod()) == null || remoteConfigMethod.getMethodDescriptor() == ((ProxyInput) proxyOutput.getInput()).getMethodDescriptor()) {
            return false;
        }
        return true;
    }

    public void process(@NonNull ContextContainer contextContainer, @NonNull ProxyInput proxyInput, @NonNull ProxyOutput proxyOutput, @NonNull IActionProcessorListener<ProxyOutput> iActionProcessorListener) {
        getAPIConfig(proxyInput).getRemoteConfigMethod().call(contextContainer).addOnCompleteListener(new C11600i(this, iActionProcessorListener, proxyOutput));
    }
}
