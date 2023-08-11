package com.rmn.apiclient.core.data_access.service.call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data_access.base.call.BaseOutput;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.IOutputBuilder;
import com.rmn.apiclient.core.data_access.base.call.OutputStatus;

public class ServiceOutput extends BaseOutput<ServiceInput> {
    public final boolean hasTimedOut;
    @Nullable
    public final Integer httpCode;

    public static final class Builder implements IOutputBuilder {
        @Nullable
        private IDocument document;
        @Nullable
        private CallException exception;
        private boolean hasTimedOut;
        @Nullable
        private Integer httpCode;
        @NonNull
        private final ServiceInput input;
        @Nullable
        private String rawResponse;
        @NonNull
        private final OutputStatus status;

        public Builder(@NonNull ServiceInput serviceInput, @NonNull OutputStatus outputStatus) {
            this.input = serviceInput;
            this.status = outputStatus;
        }

        public static Builder newBuilder(@NonNull ServiceOutput serviceOutput, @NonNull OutputStatus outputStatus) {
            return new Builder((ServiceInput) serviceOutput.getInput(), outputStatus).setDocument(serviceOutput.getDocument()).setException(serviceOutput.getException()).setHasTimedOut(serviceOutput.hasTimedOut).setHttpCode(serviceOutput.httpCode).setRawResponse(serviceOutput.getRawResponse());
        }

        @NonNull
        public Builder setHasTimedOut(boolean z) {
            this.hasTimedOut = z;
            return this;
        }

        @NonNull
        public Builder setHttpCode(@Nullable Integer num) {
            this.httpCode = num;
            return this;
        }

        @NonNull
        public Builder setRawResponse(@Nullable String str) {
            this.rawResponse = str;
            return this;
        }

        @NonNull
        public ServiceOutput build() {
            return new ServiceOutput(this.input, this.status, this.document, this.exception, this.hasTimedOut, this.httpCode, this.rawResponse);
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

    public ServiceOutput(@NonNull ServiceInput serviceInput, @NonNull OutputStatus outputStatus, @Nullable IDocument iDocument, @Nullable CallException callException, boolean z, @Nullable Integer num, @Nullable String str) {
        super(serviceInput, outputStatus, iDocument, callException, str);
        this.hasTimedOut = z;
        this.httpCode = num;
    }
}
