package com.rmn.apiclient.core.data_access.base.call.exceptions;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.structure.IDocument;

public class ServerErrorCallException extends ParsingCallException {
    @Nullable
    public final String cloudflareDebugCode;
    @Nullable
    public final IDocument document;

    public ServerErrorCallException(int i, @NonNull String str, @Nullable IDocument iDocument) {
        this(i, str, iDocument, (String) null);
    }

    @Nullable
    public String getCloudflareDebugCode() {
        return this.cloudflareDebugCode;
    }

    public String toString() {
        return "HTTP ERROR (" + this.httpCode + "):\n" + this.rawResponse;
    }

    public ServerErrorCallException(int i, @NonNull String str, @Nullable IDocument iDocument, @Nullable String str2) {
        super(i, str);
        this.document = iDocument;
        this.cloudflareDebugCode = str2;
    }
}
