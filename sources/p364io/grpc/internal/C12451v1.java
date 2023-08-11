package p364io.grpc.internal;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: io.grpc.internal.v1 */
/* compiled from: ReadableBuffer */
public interface C12451v1 extends Closeable {
    /* renamed from: J */
    void mo50015J(byte[] bArr, int i, int i2);

    /* renamed from: N */
    void mo49747N();

    void close();

    /* renamed from: e */
    int mo50016e();

    /* renamed from: e0 */
    void mo50017e0(OutputStream outputStream, int i);

    boolean markSupported();

    /* renamed from: n0 */
    void mo50018n0(ByteBuffer byteBuffer);

    /* renamed from: q */
    C12451v1 mo50019q(int i);

    int readUnsignedByte();

    void reset();

    void skipBytes(int i);
}
