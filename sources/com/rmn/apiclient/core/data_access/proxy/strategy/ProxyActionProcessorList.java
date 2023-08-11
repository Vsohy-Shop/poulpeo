package com.rmn.apiclient.core.data_access.proxy.strategy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.processor.BaseActionProcessor;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import java.util.ArrayList;
import java.util.List;

class ProxyActionProcessorList extends ArrayList<BaseActionProcessor<ProxyInput, ProxyOutput>> {
    public ProxyActionProcessorList() {
    }

    @SafeVarargs
    public ProxyActionProcessorList(@NonNull BaseActionProcessor<ProxyInput, ProxyOutput>... baseActionProcessorArr) {
        this((List<BaseActionProcessor<ProxyInput, ProxyOutput>>) null, baseActionProcessorArr);
    }

    @SafeVarargs
    public ProxyActionProcessorList(@Nullable List<BaseActionProcessor<ProxyInput, ProxyOutput>> list, @NonNull BaseActionProcessor<ProxyInput, ProxyOutput>... baseActionProcessorArr) {
        if (list != null) {
            addAll(list);
        }
        for (BaseActionProcessor<ProxyInput, ProxyOutput> baseActionProcessor : baseActionProcessorArr) {
            if (baseActionProcessor != null) {
                add(baseActionProcessor);
            }
        }
    }
}
