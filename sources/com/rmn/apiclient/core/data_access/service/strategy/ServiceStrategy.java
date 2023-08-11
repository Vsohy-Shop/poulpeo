package com.rmn.apiclient.core.data_access.service.strategy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.processor.BaseActionProcessor;
import com.rmn.apiclient.core.data_access.service.call.ServiceInput;
import com.rmn.apiclient.core.data_access.service.call.ServiceOutput;
import com.rmn.apiclient.core.data_access.service.processor.ServiceProcessorCallHttp;
import com.rmn.apiclient.core.data_access.service.processor.ServiceProcessorDeserialize;
import java.util.List;

public final class ServiceStrategy {

    public static class ServiceStrategyRawData extends ServiceStrategyChain {
        @NonNull
        public ServiceStrategyChain thenDeserialize() {
            return new ServiceStrategyChain((List<BaseActionProcessor<ServiceInput, ServiceOutput>>) new ServiceActionProcessorList(getActions(), new ServiceProcessorDeserialize()));
        }

        private ServiceStrategyRawData(@Nullable ServiceActionProcessorList serviceActionProcessorList) {
            super((List<BaseActionProcessor<ServiceInput, ServiceOutput>>) serviceActionProcessorList);
        }
    }

    private ServiceStrategy() {
    }

    @NonNull
    public static ServiceStrategyRawData callService() {
        return new ServiceStrategyRawData(new ServiceActionProcessorList(new ServiceProcessorCallHttp()));
    }
}
