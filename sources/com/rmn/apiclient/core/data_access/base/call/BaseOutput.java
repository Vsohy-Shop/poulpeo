package com.rmn.apiclient.core.data_access.base.call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data_access.base.call.BaseInput;

public abstract class BaseOutput<I extends BaseInput<?, ?>> {
    @Nullable
    private final IDocument document;
    @Nullable
    private final CallException exception;
    @NonNull
    private final I input;
    @NonNull
    private final String rawResponse;
    @NonNull
    private final OutputStatus status;

    protected BaseOutput(@NonNull I i, @NonNull OutputStatus outputStatus, @Nullable IDocument iDocument, @Nullable CallException callException, @Nullable String str) {
        this.input = i;
        this.status = outputStatus;
        this.document = iDocument;
        this.exception = callException;
        this.rawResponse = str == null ? "" : str;
    }

    @Nullable
    public IDocument getDocument() {
        return this.document;
    }

    @Nullable
    public CallException getException() {
        return this.exception;
    }

    @NonNull
    public I getInput() {
        return this.input;
    }

    @NonNull
    public IDocument getNonNullDocument() {
        return this.document;
    }

    @NonNull
    public CallException getNonNullException() {
        return this.exception;
    }

    @NonNull
    public String getRawResponse() {
        return this.rawResponse;
    }

    @NonNull
    public OutputStatus getStatus() {
        return this.status;
    }

    public boolean hasDocument() {
        if (this.document != null) {
            return true;
        }
        return false;
    }

    public boolean hasException() {
        if (this.exception != null) {
            return true;
        }
        return false;
    }
}
