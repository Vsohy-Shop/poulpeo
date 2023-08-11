package com.rmn.apiclient.core.data_access.base.call;

import androidx.annotation.NonNull;

public interface IOutputFactory {
    @NonNull
    IOutputBuilder newBuilder(BaseOutput<?> baseOutput, OutputStatus outputStatus);
}
