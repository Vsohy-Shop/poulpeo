package com.google.protobuf;

import java.util.List;

public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* renamed from: b */
    private final List<String> f9503b = null;

    public UninitializedMessageException(C7149p0 p0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public InvalidProtocolBufferException mo40148a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
