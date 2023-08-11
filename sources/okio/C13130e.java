package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: okio.e */
/* compiled from: BufferedSource.kt */
public interface C13130e extends C13179y0, ReadableByteChannel {
    /* renamed from: B */
    String mo52481B(long j);

    /* renamed from: H */
    boolean mo52489H(long j, C13133f fVar);

    /* renamed from: I */
    String mo52491I(Charset charset);

    /* renamed from: M */
    C13133f mo52498M();

    /* renamed from: U */
    String mo52507U();

    /* renamed from: W */
    int mo52510W();

    /* renamed from: Z */
    byte[] mo52513Z(long j);

    /* renamed from: d */
    C13121c mo52521d();

    /* renamed from: d0 */
    short mo52522d0();

    /* renamed from: f */
    C13121c mo52524f();

    /* renamed from: g0 */
    long mo52525g0();

    /* renamed from: h */
    boolean mo52526h(long j);

    /* renamed from: h0 */
    long mo52527h0(C13175w0 w0Var);

    /* renamed from: l */
    String mo52532l(long j);

    /* renamed from: m0 */
    void mo52533m0(long j);

    /* renamed from: o */
    C13133f mo52534o(long j);

    C13130e peek();

    /* renamed from: q0 */
    long mo52539q0();

    /* renamed from: r0 */
    InputStream mo52540r0();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    /* renamed from: s */
    byte[] mo52548s();

    /* renamed from: s0 */
    int mo52549s0(C13151m0 m0Var);

    void skip(long j);

    /* renamed from: t */
    boolean mo52552t();

    /* renamed from: x */
    void mo52564x(C13121c cVar, long j);

    /* renamed from: z */
    long mo52568z();
}
