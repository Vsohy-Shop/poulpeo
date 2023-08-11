package com.rmn.apiclient.core.data_access.service.processor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.processor.BaseActionProcessor;
import com.rmn.apiclient.core.data_access.service.call.ServiceInput;
import com.rmn.apiclient.core.data_access.service.call.ServiceOutput;

public abstract class BaseServiceActionProcessor extends BaseActionProcessor<ServiceInput, ServiceOutput> {
    public boolean canProcessAction(@NonNull ServiceInput serviceInput, @NonNull ServiceOutput serviceOutput) {
        return true;
    }
}
