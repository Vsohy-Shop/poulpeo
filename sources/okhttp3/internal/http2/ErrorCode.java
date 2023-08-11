package okhttp3.internal.http2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ErrorCode.kt */
public enum ErrorCode {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    
    public static final Companion Companion = null;
    private final int httpCode;

    /* compiled from: ErrorCode.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorCode fromHttp2(int i) {
            boolean z;
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (errorCode.getHttpCode() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return errorCode;
                }
            }
            return null;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private ErrorCode(int i) {
        this.httpCode = i;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}
