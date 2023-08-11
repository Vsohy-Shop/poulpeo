package com.rmn.apiclient.core.data_access.cache.processor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data_access.cache.call.CacheInput;
import com.rmn.apiclient.core.data_access.cache.call.CacheOutput;

public abstract class BaseCacheProcessorAdd extends BaseCacheActionProcessor {
    /* access modifiers changed from: protected */
    @NonNull
    public IDocument getNonNullDocumentToAddInCache(@NonNull CacheInput cacheInput) {
        T t = cacheInput.getBody().body;
        if (t instanceof IDocument) {
            return (IDocument) t;
        }
        throw new IllegalStateException("The body document must exist in the input to add it in cache");
    }

    public boolean canProcessAction(@NonNull CacheInput cacheInput, @NonNull CacheOutput cacheOutput) {
        return cacheInput.getBody().body instanceof IDocument;
    }
}
