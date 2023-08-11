package com.rmn.apiclient.core.data_access.base.call.listeners;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.call.BaseOutput;

public interface OnSuccessListener<O extends BaseOutput<?>> {
    void onSuccess(@NonNull O o);
}
