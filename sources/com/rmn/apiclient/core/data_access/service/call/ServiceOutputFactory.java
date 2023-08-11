package com.rmn.apiclient.core.data_access.service.call;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.call.BaseOutput;
import com.rmn.apiclient.core.data_access.base.call.IOutputFactory;
import com.rmn.apiclient.core.data_access.base.call.OutputStatus;
import com.rmn.apiclient.core.data_access.service.call.ServiceOutput;

public class ServiceOutputFactory implements IOutputFactory {
    @NonNull
    public static final ServiceOutputFactory instance = new ServiceOutputFactory();

    private ServiceOutputFactory() {
    }

    @NonNull
    public ServiceOutput.Builder newBuilder(@NonNull BaseOutput<?> baseOutput, @NonNull OutputStatus outputStatus) {
        return ServiceOutput.Builder.newBuilder((ServiceOutput) baseOutput, outputStatus);
    }
}
