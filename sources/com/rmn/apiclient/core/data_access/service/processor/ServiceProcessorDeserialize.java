package com.rmn.apiclient.core.data_access.service.processor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.base.processor.ProcessorDeserializeManager;
import com.rmn.apiclient.core.data_access.service.call.ServiceInput;
import com.rmn.apiclient.core.data_access.service.call.ServiceOutput;
import com.rmn.apiclient.core.data_access.service.call.ServiceOutputFactory;
import com.rmn.iosadapters.android.content.ContextContainer;

public class ServiceProcessorDeserialize extends BaseServiceActionProcessor {
    public void process(@NonNull ContextContainer contextContainer, @NonNull ServiceInput serviceInput, @NonNull ServiceOutput serviceOutput, @NonNull IActionProcessorListener<ServiceOutput> iActionProcessorListener) {
        Integer num = serviceOutput.httpCode;
        if (num == null) {
            num = -1;
        }
        ProcessorDeserializeManager.processDeserialize(this, getDocumentSerializer(serviceInput), serviceOutput, num.intValue(), iActionProcessorListener, ServiceOutputFactory.instance);
    }
}
