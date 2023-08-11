package okhttp3.internal.http;

import java.net.ProtocolException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Protocol;
import okhttp3.Response;

/* compiled from: StatusLine.kt */
public final class StatusLine {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final String message;
    public final Protocol protocol;

    /* compiled from: StatusLine.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StatusLine get(Response response) {
            C12775o.m28639i(response, "response");
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        public final StatusLine parse(String str) {
            int i;
            Protocol protocol;
            String str2;
            C12775o.m28639i(str, "statusLine");
            if (C13754v.m31525E(str, "HTTP/1.", false, 2, (Object) null)) {
                i = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException(C12775o.m28647q("Unexpected status line: ", str));
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else if (charAt == 1) {
                    protocol = Protocol.HTTP_1_1;
                } else {
                    throw new ProtocolException(C12775o.m28647q("Unexpected status line: ", str));
                }
            } else if (C13754v.m31525E(str, "ICY ", false, 2, (Object) null)) {
                protocol = Protocol.HTTP_1_0;
                i = 4;
            } else {
                throw new ProtocolException(C12775o.m28647q("Unexpected status line: ", str));
            }
            int i2 = i + 3;
            if (str.length() >= i2) {
                try {
                    String substring = str.substring(i, i2);
                    C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i2) {
                        str2 = "";
                    } else if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                        C12775o.m28638h(str2, "this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException(C12775o.m28647q("Unexpected status line: ", str));
                    }
                    return new StatusLine(protocol, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(C12775o.m28647q("Unexpected status line: ", str));
                }
            } else {
                throw new ProtocolException(C12775o.m28647q("Unexpected status line: ", str));
            }
        }
    }

    public StatusLine(Protocol protocol2, int i, String str) {
        C12775o.m28639i(protocol2, "protocol");
        C12775o.m28639i(str, "message");
        this.protocol = protocol2;
        this.code = i;
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
