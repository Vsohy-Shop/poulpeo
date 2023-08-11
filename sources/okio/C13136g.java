package okio;

import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.zip.Deflater;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nDeflaterSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n+ 2 -Util.kt\nokio/_UtilKt\n*L\n1#1,162:1\n84#2:163\n*S KotlinDebug\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n*L\n60#1:163\n*E\n"})
/* renamed from: okio.g */
/* compiled from: DeflaterSink.kt */
public final class C13136g implements C13175w0 {

    /* renamed from: b */
    private final C13127d f20908b;

    /* renamed from: c */
    private final Deflater f20909c;

    /* renamed from: d */
    private boolean f20910d;

    public C13136g(C13127d dVar, Deflater deflater) {
        C12775o.m28639i(dVar, "sink");
        C12775o.m28639i(deflater, "deflater");
        this.f20908b = dVar;
        this.f20909c = deflater;
    }

    /* renamed from: a */
    private final void m29695a(boolean z) {
        C13168t0 F0;
        int i;
        C13121c f = this.f20908b.mo52524f();
        while (true) {
            F0 = f.mo52487F0(1);
            if (z) {
                Deflater deflater = this.f20909c;
                byte[] bArr = F0.f20967a;
                int i2 = F0.f20969c;
                i = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.f20909c;
                byte[] bArr2 = F0.f20967a;
                int i3 = F0.f20969c;
                i = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (i > 0) {
                F0.f20969c += i;
                f.mo52483C0(f.size() + ((long) i));
                this.f20908b.mo52566y();
            } else if (this.f20909c.needsInput()) {
                break;
            }
        }
        if (F0.f20968b == F0.f20969c) {
            f.f20888b = F0.mo52717b();
            C13171u0.m29872b(F0);
        }
    }

    /* renamed from: b */
    public final void mo52626b() {
        this.f20909c.finish();
        m29695a(false);
    }

    public void close() {
        if (!this.f20910d) {
            try {
                mo52626b();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f20909c.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                this.f20908b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f20910d = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public void flush() {
        m29695a(true);
        this.f20908b.flush();
    }

    public C13181z0 timeout() {
        return this.f20908b.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f20908b + ')';
    }

    public void write(C13121c cVar, long j) {
        C12775o.m28639i(cVar, APIParams.SOURCE);
        C13132e1.m29639b(cVar.size(), 0, j);
        while (j > 0) {
            C13168t0 t0Var = cVar.f20888b;
            C12775o.m28636f(t0Var);
            int min = (int) Math.min(j, (long) (t0Var.f20969c - t0Var.f20968b));
            this.f20909c.setInput(t0Var.f20967a, t0Var.f20968b, min);
            m29695a(false);
            long j2 = (long) min;
            cVar.mo52483C0(cVar.size() - j2);
            int i = t0Var.f20968b + min;
            t0Var.f20968b = i;
            if (i == t0Var.f20969c) {
                cVar.f20888b = t0Var.mo52717b();
                C13171u0.m29872b(t0Var);
            }
            j -= j2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C13136g(C13175w0 w0Var, Deflater deflater) {
        this(C13145j0.m29738c(w0Var), deflater);
        C12775o.m28639i(w0Var, "sink");
        C12775o.m28639i(deflater, "deflater");
    }
}
