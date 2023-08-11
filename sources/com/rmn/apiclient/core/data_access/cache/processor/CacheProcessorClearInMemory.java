package com.rmn.apiclient.core.data_access.cache.processor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.call.OutputStatus;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.cache.call.CacheInput;
import com.rmn.apiclient.core.data_access.cache.call.CacheOutput;
import com.rmn.apiclient.core.data_access.cache.memory.MemoryCacheMethods;
import com.rmn.iosadapters.android.content.ContextContainer;

public class CacheProcessorClearInMemory extends BaseCacheActionProcessor {
    public boolean canProcessAction(@NonNull CacheInput cacheInput, @NonNull CacheOutput cacheOutput) {
        return true;
    }

    public void process(@NonNull ContextContainer contextContainer, @NonNull CacheInput cacheInput, @NonNull CacheOutput cacheOutput, @NonNull IActionProcessorListener<CacheOutput> iActionProcessorListener) {
        MemoryCacheMethods memoryCacheMethods = cacheInput.getMethodDescriptor().getCacheAccessDescriptor().getMemoryCacheMethods();
        if (memoryCacheMethods != null) {
            memoryCacheMethods.clearTable(cacheInput.getMethodDescriptor());
        }
        iActionProcessorListener.onActionProcessed(this, CacheOutput.Builder.newBuilder(cacheOutput, OutputStatus.SUCCESS).build());
    }
}
