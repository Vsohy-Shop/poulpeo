package com.rmn.apiclient.core.data_access.base.call.listeners;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.call.BaseCall;
import com.rmn.apiclient.core.data_access.base.call.BaseInput;
import com.rmn.apiclient.core.data_access.base.call.BaseOutput;

public interface OnCompleteListener<I extends BaseInput<I, O>, O extends BaseOutput<I>> {
    void onComplete(@NonNull BaseCall<I, O> baseCall);
}
