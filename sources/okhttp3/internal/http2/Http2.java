package okhttp3.internal.http2;

import kotlin.jvm.internal.C12775o;
import okhttp3.internal.Util;
import okio.C13133f;

/* compiled from: Http2.kt */
public final class Http2 {
    private static final String[] BINARY;
    public static final C13133f CONNECTION_PREFACE = C13133f.f20903e.mo52622d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] FLAGS = new String[64];
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final Http2 INSTANCE = new Http2();
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;

    static {
        String[] strArr = new String[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            C12775o.m28638h(binaryString, "toBinaryString(it)");
            strArr[i2] = C13754v.m31538z(Util.format("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[1 | 8] = C12775o.m28647q("END_STREAM", "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i3 = 0;
        while (i3 < 3) {
            int i4 = iArr2[i3];
            i3++;
            int i5 = iArr[0];
            String[] strArr3 = FLAGS;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            strArr3[i6 | 8] = strArr3[i5] + '|' + strArr3[i4] + "|PADDED";
        }
        int length = FLAGS.length;
        while (i < length) {
            int i7 = i + 1;
            String[] strArr4 = FLAGS;
            if (strArr4[i] == null) {
                strArr4[i] = BINARY[i];
            }
            i = i7;
        }
    }

    private Http2() {
    }

    public final String formatFlags(int i, int i2) {
        String str;
        if (i2 == 0) {
            return "";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4 || i == 6) {
                if (i2 == 1) {
                    return "ACK";
                }
                return BINARY[i2];
            } else if (!(i == 7 || i == 8)) {
                String[] strArr = FLAGS;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                    C12775o.m28636f(str);
                } else {
                    str = BINARY[i2];
                }
                String str2 = str;
                if (i == 5 && (i2 & 4) != 0) {
                    return C13754v.m31521A(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
                }
                if (i != 0 || (i2 & 32) == 0) {
                    return str2;
                }
                return C13754v.m31521A(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null);
            }
        }
        return BINARY[i2];
    }

    public final String formattedType$okhttp(int i) {
        String[] strArr = FRAME_NAMES;
        if (i < strArr.length) {
            return strArr[i];
        }
        return Util.format("0x%02x", Integer.valueOf(i));
    }

    public final String frameLog(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String formattedType$okhttp = formattedType$okhttp(i3);
        String formatFlags = formatFlags(i3, i4);
        if (z) {
            str = "<<";
        } else {
            str = ">>";
        }
        return Util.format("%s 0x%08x %5d %-13s %s", str, Integer.valueOf(i), Integer.valueOf(i2), formattedType$okhttp, formatFlags);
    }
}
