package p124i8;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: i8.f */
/* compiled from: RandomFidGenerator */
public class C8215f {

    /* renamed from: a */
    private static final byte f11539a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f11540b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    private static String m16259b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    private static byte[] m16260c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    @NonNull
    /* renamed from: a */
    public String mo42126a() {
        byte[] c = m16260c(UUID.randomUUID(), new byte[17]);
        byte b = c[0];
        c[16] = b;
        c[0] = (byte) ((b & f11540b) | f11539a);
        return m16259b(c);
    }
}
