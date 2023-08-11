package com.rmn.apiclient.core.data_access.cache.strategy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.processor.BaseActionProcessor;
import com.rmn.apiclient.core.data_access.cache.call.CacheInput;
import com.rmn.apiclient.core.data_access.cache.call.CacheOutput;
import java.util.ArrayList;
import java.util.List;

class CacheActionProcessorList extends ArrayList<BaseActionProcessor<CacheInput, CacheOutput>> {
    public CacheActionProcessorList() {
    }

    @SafeVarargs
    public CacheActionProcessorList(@NonNull BaseActionProcessor<CacheInput, CacheOutput>... baseActionProcessorArr) {
        this((List<BaseActionProcessor<CacheInput, CacheOutput>>) null, baseActionProcessorArr);
    }

    @SafeVarargs
    public CacheActionProcessorList(@Nullable List<BaseActionProcessor<CacheInput, CacheOutput>> list, @NonNull BaseActionProcessor<CacheInput, CacheOutput>... baseActionProcessorArr) {
        if (list != null) {
            addAll(list);
        }
        for (BaseActionProcessor<CacheInput, CacheOutput> baseActionProcessor : baseActionProcessorArr) {
            if (baseActionProcessor != null) {
                add(baseActionProcessor);
            }
        }
    }
}
