package com.rmn.apiclient.core.data_access.cache.call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data_access.base.call.BaseOutput;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.IOutputBuilder;
import com.rmn.apiclient.core.data_access.base.call.OutputStatus;

public class CacheOutput extends BaseOutput<CacheInput> {

    public static final class Builder implements IOutputBuilder {
        @Nullable
        private IDocument document;
        @Nullable
        private CallException exception;
        @NonNull
        private final CacheInput input;
        @Nullable
        private String rawResponse;
        @NonNull
        private final OutputStatus status;

        public Builder(@NonNull CacheInput cacheInput, @NonNull OutputStatus outputStatus) {
            this.input = cacheInput;
            this.status = outputStatus;
        }

        public static Builder newBuilder(@NonNull CacheOutput cacheOutput, @NonNull OutputStatus outputStatus) {
            return new Builder((CacheInput) cacheOutput.getInput(), outputStatus).setDocument(cacheOutput.getDocument()).setException(cacheOutput.getException()).setRawResponse(cacheOutput.getRawResponse());
        }

        @NonNull
        public Builder setRawResponse(@Nullable String str) {
            this.rawResponse = str;
            return this;
        }

        @NonNull
        public CacheOutput build() {
            return new CacheOutput(this.input, this.status, this.document, this.exception, this.rawResponse);
        }

        @NonNull
        public Builder setDocument(@Nullable IDocument iDocument) {
            this.document = iDocument;
            return this;
        }

        @NonNull
        public Builder setException(@Nullable CallException callException) {
            this.exception = callException;
            return this;
        }
    }

    public CacheOutput(@NonNull CacheInput cacheInput, @NonNull OutputStatus outputStatus, @Nullable IDocument iDocument, @Nullable CallException callException, @Nullable String str) {
        super(cacheInput, outputStatus, iDocument, callException, str);
    }
}
