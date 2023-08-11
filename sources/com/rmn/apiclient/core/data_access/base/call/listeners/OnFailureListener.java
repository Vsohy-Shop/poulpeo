package com.rmn.apiclient.core.data_access.base.call.listeners;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.call.CallException;

public interface OnFailureListener {
    void onFailure(@NonNull CallException callException);
}
