package com.rmn.apiclient.core.data_access.cache.processor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.structure.IResource;
import com.rmn.apiclient.core.data_access.base.call.APIParam;
import com.rmn.apiclient.core.data_access.base.call.BaseInput;
import com.rmn.apiclient.core.data_access.base.processor.BaseActionProcessor;
import com.rmn.apiclient.core.data_access.cache.call.CacheInput;
import com.rmn.apiclient.core.data_access.cache.call.CacheOutput;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public abstract class BaseCacheActionProcessor extends BaseActionProcessor<CacheInput, CacheOutput> {
    @Nullable
    public static Set<String> extractFieldsFilter(@NonNull IResource<?> iResource, @NonNull BaseInput<?, ?> baseInput) {
        APIParam<?> findParam = baseInput.getParams().findParam("fields[" + iResource.getResourceId().getType() + "]", Collection.class);
        if (findParam == null || findParam.value == null) {
            return null;
        }
        return new HashSet((Collection) findParam.value);
    }

    public boolean canProcessAction(@NonNull CacheInput cacheInput, @NonNull CacheOutput cacheOutput) {
        return true;
    }
}
