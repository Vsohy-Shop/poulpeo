package com.rmn.apiclient.core.data_access.proxy.processor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.OutputStatus;
import com.rmn.apiclient.core.data_access.base.call.exceptions.FailedCallException;
import com.rmn.apiclient.core.data_access.base.call.exceptions.ParsingCallException;
import com.rmn.apiclient.core.data_access.base.call.exceptions.ServerErrorCallException;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.service.call.ServiceInput;
import com.rmn.apiclient.core.data_access.service.call.ServiceOutput;
import com.rmn.apiclient.core.data_access.service.strategy.ServiceStrategy;
import com.rmn.iosadapters.android.content.ContextContainer;

public class ProxyProcessorCallService extends BaseProxyActionProcessor {
    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$process$0(IActionProcessorListener iActionProcessorListener, ProxyInput proxyInput, CallException callException) {
        if (callException instanceof FailedCallException) {
            FailedCallException failedCallException = (FailedCallException) callException;
            iActionProcessorListener.onActionProcessed(this, new ProxyOutput.Builder(proxyInput, OutputStatus.FAILURE).setException(failedCallException).setHasTimedOut(failedCallException.hasTimedOut).build());
        } else if (callException instanceof ServerErrorCallException) {
            ServerErrorCallException serverErrorCallException = (ServerErrorCallException) callException;
            iActionProcessorListener.onActionProcessed(this, new ProxyOutput.Builder(proxyInput, OutputStatus.FAILURE).setException(serverErrorCallException).setHttpCode(Integer.valueOf(serverErrorCallException.httpCode)).setRawResponse(serverErrorCallException.rawResponse).setDocument(serverErrorCallException.document).build());
        } else if (callException instanceof ParsingCallException) {
            ParsingCallException parsingCallException = (ParsingCallException) callException;
            iActionProcessorListener.onActionProcessed(this, new ProxyOutput.Builder(proxyInput, OutputStatus.FAILURE).setException(parsingCallException).setHttpCode(Integer.valueOf(parsingCallException.httpCode)).setRawResponse(parsingCallException.rawResponse).build());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$process$1(IActionProcessorListener iActionProcessorListener, ProxyInput proxyInput, ServiceOutput serviceOutput) {
        iActionProcessorListener.onActionProcessed(this, new ProxyOutput.Builder(proxyInput, OutputStatus.SUCCESS).setHttpCode(serviceOutput.httpCode).setRawResponse(serviceOutput.getRawResponse()).setDocument(serviceOutput.getDocument()).build());
    }

    public boolean isReadingData() {
        return true;
    }

    public boolean isWritingRetrievedData() {
        return false;
    }

    public void process(@NonNull ContextContainer contextContainer, @NonNull ProxyInput proxyInput, @NonNull ProxyOutput proxyOutput, @NonNull IActionProcessorListener<ProxyOutput> iActionProcessorListener) {
        new ServiceInput.Builder(getServiceMethodDescriptor(proxyInput), ServiceStrategy.callService().thenDeserialize()).addParamSet(proxyInput.getParams()).setBody(proxyInput.getBody()).build().call(contextContainer).addOnFailureListener(new C11594c(this, iActionProcessorListener, proxyInput)).addOnSuccessListener(new C11595d(this, iActionProcessorListener, proxyInput));
    }
}
