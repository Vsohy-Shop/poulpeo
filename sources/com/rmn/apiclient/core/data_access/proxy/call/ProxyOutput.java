package com.rmn.apiclient.core.data_access.proxy.call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data_access.base.call.BaseOutput;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.OutputStatus;

public class ProxyOutput extends BaseOutput<ProxyInput> {
    public final boolean hasTimedOut;
    @Nullable
    public final Integer httpCode;
    public final boolean isCacheHit;

    public static final class Builder {
        @Nullable
        private IDocument document;
        @Nullable
        private CallException exception;
        private boolean hasTimedOut;
        @Nullable
        private Integer httpCode;
        @NonNull
        private final ProxyInput input;
        private boolean isCacheHit;
        @Nullable
        private String rawResponse;
        @NonNull
        private final OutputStatus status;

        public Builder(@NonNull ProxyInput proxyInput, @NonNull OutputStatus outputStatus) {
            this.input = proxyInput;
            this.status = outputStatus;
        }

        @NonNull
        public ProxyOutput build() {
            return new ProxyOutput(this.input, this.status, this.document, this.exception, this.isCacheHit, this.hasTimedOut, this.httpCode, this.rawResponse);
        }

        @NonNull
        public Builder setCacheHit(boolean z) {
            this.isCacheHit = z;
            return this;
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
    }

    public ProxyOutput(@NonNull ProxyInput proxyInput, @NonNull OutputStatus outputStatus, @Nullable IDocument iDocument, @Nullable CallException callException, boolean z, boolean z2, @Nullable Integer num, @Nullable String str) {
        super(proxyInput, outputStatus, iDocument, callException, str);
        this.isCacheHit = z;
        this.hasTimedOut = z2;
        this.httpCode = num;
    }
}
