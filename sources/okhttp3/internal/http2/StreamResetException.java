package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.C12775o;

/* compiled from: StreamResetException.kt */
public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode2) {
        super(C12775o.m28647q("stream was reset: ", errorCode2));
        C12775o.m28639i(errorCode2, "errorCode");
        this.errorCode = errorCode2;
    }
}
