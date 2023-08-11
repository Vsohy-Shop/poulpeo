package okio;

import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nInflaterSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -Util.kt\nokio/_UtilKt\n*L\n1#1,147:1\n1#2:148\n84#3:149\n*S KotlinDebug\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n*L\n73#1:149\n*E\n"})
/* renamed from: okio.p */
/* compiled from: InflaterSource.kt */
public final class C13157p implements C13179y0 {

    /* renamed from: b */
    private final C13130e f20943b;

    /* renamed from: c */
    private final Inflater f20944c;

    /* renamed from: d */
    private int f20945d;

    /* renamed from: e */
    private boolean f20946e;

    public C13157p(C13130e eVar, Inflater inflater) {
        C12775o.m28639i(eVar, APIParams.SOURCE);
        C12775o.m28639i(inflater, "inflater");
        this.f20943b = eVar;
        this.f20944c = inflater;
    }

    /* renamed from: c */
    private final void m29791c() {
        int i = this.f20945d;
        if (i != 0) {
            int remaining = i - this.f20944c.getRemaining();
            this.f20945d -= remaining;
            this.f20943b.skip((long) remaining);
        }
    }

    /* renamed from: a */
    public final long mo52678a(C13121c cVar, long j) {
        boolean z;
        C12775o.m28639i(cVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(!this.f20946e)) {
            throw new IllegalStateException("closed".toString());
        } else if (i == 0) {
            return 0;
        } else {
            try {
                C13168t0 F0 = cVar.mo52487F0(1);
                mo52679b();
                int inflate = this.f20944c.inflate(F0.f20967a, F0.f20969c, (int) Math.min(j, (long) (8192 - F0.f20969c)));
                m29791c();
                if (inflate > 0) {
                    F0.f20969c += inflate;
                    long j2 = (long) inflate;
                    cVar.mo52483C0(cVar.size() + j2);
                    return j2;
                }
                if (F0.f20968b == F0.f20969c) {
                    cVar.f20888b = F0.mo52717b();
                    C13171u0.m29872b(F0);
                }
                return 0;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo52679b() {
        if (!this.f20944c.needsInput()) {
            return false;
        }
        if (this.f20943b.mo52552t()) {
            return true;
        }
        C13168t0 t0Var = this.f20943b.mo52524f().f20888b;
        C12775o.m28636f(t0Var);
        int i = t0Var.f20969c;
        int i2 = t0Var.f20968b;
        int i3 = i - i2;
        this.f20945d = i3;
        this.f20944c.setInput(t0Var.f20967a, i2, i3);
        return false;
    }

    public void close() {
        if (!this.f20946e) {
            this.f20944c.end();
            this.f20946e = true;
            this.f20943b.close();
        }
    }

    public long read(C13121c cVar, long j) {
        C12775o.m28639i(cVar, "sink");
        do {
            long a = mo52678a(cVar, j);
            if (a > 0) {
                return a;
            }
            if (this.f20944c.finished() || this.f20944c.needsDictionary()) {
                return -1;
            }
        } while (!this.f20943b.mo52552t());
        throw new EOFException("source exhausted prematurely");
    }

    public C13181z0 timeout() {
        return this.f20943b.timeout();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C13157p(C13179y0 y0Var, Inflater inflater) {
        this(C13145j0.m29739d(y0Var), inflater);
        C12775o.m28639i(y0Var, APIParams.SOURCE);
        C12775o.m28639i(inflater, "inflater");
    }
}
