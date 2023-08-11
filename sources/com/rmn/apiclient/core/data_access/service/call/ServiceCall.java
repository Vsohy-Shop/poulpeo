package com.rmn.apiclient.core.data_access.service.call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.call.BaseCall;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.OutputStatus;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnCompleteListener;
import com.rmn.apiclient.core.data_access.service.call.ServiceOutput;

public class ServiceCall extends BaseCall<ServiceInput, ServiceOutput> {
    public ServiceCall(@NonNull ServiceInput serviceInput) {
        super(serviceInput, (OnCompleteListener) null);
    }

    public ServiceCall(@NonNull ServiceInput serviceInput, @Nullable OnCompleteListener<ServiceInput, ServiceOutput> onCompleteListener) {
        super(serviceInput, onCompleteListener);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public ServiceOutput newOutput(@NonNull OutputStatus outputStatus, @Nullable CallException callException) {
        return new ServiceOutput.Builder((ServiceInput) getInput(), outputStatus).setException(callException).build();
    }
}
