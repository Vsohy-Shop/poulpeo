package com.rmn.apiclient.core.data_access.base.processor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.call.BaseOutput;

public interface IActionProcessorListener<O extends BaseOutput<?>> {
    void onActionProcessed(@NonNull BaseActionProcessor<?, ?> baseActionProcessor, @NonNull O o);
}
