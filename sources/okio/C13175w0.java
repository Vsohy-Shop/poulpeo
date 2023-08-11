package okio;

import java.io.Closeable;
import java.io.Flushable;

/* renamed from: okio.w0 */
/* compiled from: Sink.kt */
public interface C13175w0 extends Closeable, Flushable {
    void close();

    void flush();

    C13181z0 timeout();

    void write(C13121c cVar, long j);
}
