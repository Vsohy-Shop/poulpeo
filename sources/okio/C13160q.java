package okio;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -Util.kt\nokio/_UtilKt\n*L\n1#1,242:1\n1#2:243\n84#3:244\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n*L\n93#1:244\n*E\n"})
/* renamed from: okio.q */
/* compiled from: JvmOkio.kt */
class C13160q implements C13179y0 {

    /* renamed from: b */
    private final InputStream f20950b;

    /* renamed from: c */
    private final C13181z0 f20951c;

    public C13160q(InputStream inputStream, C13181z0 z0Var) {
        C12775o.m28639i(inputStream, "input");
        C12775o.m28639i(z0Var, "timeout");
        this.f20950b = inputStream;
        this.f20951c = z0Var;
    }

    public void close() {
        this.f20950b.close();
    }

    public long read(C13121c cVar, long j) {
        boolean z;
        C12775o.m28639i(cVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                this.f20951c.throwIfReached();
                C13168t0 F0 = cVar.mo52487F0(1);
                int read = this.f20950b.read(F0.f20967a, F0.f20969c, (int) Math.min(j, (long) (8192 - F0.f20969c)));
                if (read != -1) {
                    F0.f20969c += read;
                    long j2 = (long) read;
                    cVar.mo52483C0(cVar.size() + j2);
                    return j2;
                } else if (F0.f20968b != F0.f20969c) {
                    return -1;
                } else {
                    cVar.f20888b = F0.mo52717b();
                    C13171u0.m29872b(F0);
                    return -1;
                }
            } catch (AssertionError e) {
                if (C13145j0.m29740e(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    public C13181z0 timeout() {
        return this.f20951c;
    }

    public String toString() {
        return "source(" + this.f20950b + ')';
    }
}
