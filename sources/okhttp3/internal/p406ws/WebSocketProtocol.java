package okhttp3.internal.p406ws;

import kotlin.jvm.internal.C12775o;
import okio.C13121c;
import okio.C13133f;

/* renamed from: okhttp3.internal.ws.WebSocketProtocol */
/* compiled from: WebSocketProtocol.kt */
public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
    }

    public final String acceptHeader(String str) {
        C12775o.m28639i(str, "key");
        return C13133f.f20903e.mo52622d(C12775o.m28647q(str, ACCEPT_MAGIC)).mo52588E().mo52597a();
    }

    public final String closeCodeExceptionMessage(int i) {
        boolean z;
        if (i < 1000 || i >= 5000) {
            return C12775o.m28647q("Code must be in range [1000,5000): ", Integer.valueOf(i));
        }
        boolean z2 = true;
        if (1004 > i || i >= 1007) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (1015 > i || i >= 3000) {
                z2 = false;
            }
            if (!z2) {
                return null;
            }
        }
        return "Code " + i + " is reserved and may not be used.";
    }

    public final void toggleMask(C13121c.C13122a aVar, byte[] bArr) {
        C12775o.m28639i(aVar, "cursor");
        C12775o.m28639i(bArr, "key");
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = aVar.f20894f;
            int i2 = aVar.f20895g;
            int i3 = aVar.f20896h;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
        } while (aVar.mo52571b() != -1);
    }

    public final void validateCloseCode(int i) {
        boolean z;
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i);
        if (closeCodeExceptionMessage == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C12775o.m28636f(closeCodeExceptionMessage);
            throw new IllegalArgumentException(closeCodeExceptionMessage.toString());
        }
    }
}
