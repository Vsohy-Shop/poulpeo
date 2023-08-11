package com.rmn.apiclient.core.data_access.base.call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.structure.IDocument;

public interface IOutputBuilder {
    @NonNull
    BaseOutput<?> build();

    @NonNull
    IOutputBuilder setDocument(@Nullable IDocument iDocument);

    @NonNull
    IOutputBuilder setException(@Nullable CallException callException);
}
