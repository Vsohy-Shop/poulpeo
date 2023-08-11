package okio;

import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.OutputStream;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n+ 2 -Util.kt\nokio/_UtilKt\n*L\n1#1,242:1\n84#2:243\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n*L\n56#1:243\n*E\n"})
/* renamed from: okio.n0 */
/* compiled from: JvmOkio.kt */
final class C13154n0 implements C13175w0 {

    /* renamed from: b */
    private final OutputStream f20936b;

    /* renamed from: c */
    private final C13181z0 f20937c;

    public C13154n0(OutputStream outputStream, C13181z0 z0Var) {
        C12775o.m28639i(outputStream, "out");
        C12775o.m28639i(z0Var, "timeout");
        this.f20936b = outputStream;
        this.f20937c = z0Var;
    }

    public void close() {
        this.f20936b.close();
    }

    public void flush() {
        this.f20936b.flush();
    }

    public C13181z0 timeout() {
        return this.f20937c;
    }

    public String toString() {
        return "sink(" + this.f20936b + ')';
    }

    public void write(C13121c cVar, long j) {
        C12775o.m28639i(cVar, APIParams.SOURCE);
        C13132e1.m29639b(cVar.size(), 0, j);
        while (j > 0) {
            this.f20937c.throwIfReached();
            C13168t0 t0Var = cVar.f20888b;
            C12775o.m28636f(t0Var);
            int min = (int) Math.min(j, (long) (t0Var.f20969c - t0Var.f20968b));
            this.f20936b.write(t0Var.f20967a, t0Var.f20968b, min);
            t0Var.f20968b += min;
            long j2 = (long) min;
            j -= j2;
            cVar.mo52483C0(cVar.size() - j2);
            if (t0Var.f20968b == t0Var.f20969c) {
                cVar.f20888b = t0Var.mo52717b();
                C13171u0.m29872b(t0Var);
            }
        }
    }
}
