package com.rmn.apiclient.core.data_access.service.strategy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.processor.BaseActionProcessor;
import com.rmn.apiclient.core.data_access.service.call.ServiceInput;
import com.rmn.apiclient.core.data_access.service.call.ServiceOutput;
import java.util.ArrayList;
import java.util.List;

public class ServiceActionProcessorList extends ArrayList<BaseActionProcessor<ServiceInput, ServiceOutput>> {
    public ServiceActionProcessorList() {
    }

    @SafeVarargs
    public ServiceActionProcessorList(@NonNull BaseActionProcessor<ServiceInput, ServiceOutput>... baseActionProcessorArr) {
        this((List<BaseActionProcessor<ServiceInput, ServiceOutput>>) null, baseActionProcessorArr);
    }

    @SafeVarargs
    public ServiceActionProcessorList(@Nullable List<BaseActionProcessor<ServiceInput, ServiceOutput>> list, @NonNull BaseActionProcessor<ServiceInput, ServiceOutput>... baseActionProcessorArr) {
        if (list != null) {
            addAll(list);
        }
        for (BaseActionProcessor<ServiceInput, ServiceOutput> baseActionProcessor : baseActionProcessorArr) {
            if (baseActionProcessor != null) {
                add(baseActionProcessor);
            }
        }
    }
}
