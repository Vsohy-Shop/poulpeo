package p371jg;

import java.io.IOException;
import kotlin.jvm.internal.C12775o;
import okio.C13121c;
import okio.C13150m;
import okio.C13179y0;

/* renamed from: jg.b */
/* compiled from: FixedLengthSource.kt */
public final class C12626b extends C13150m {

    /* renamed from: b */
    private final long f20276b;

    /* renamed from: c */
    private final boolean f20277c;

    /* renamed from: d */
    private long f20278d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12626b(C13179y0 y0Var, long j, boolean z) {
        super(y0Var);
        C12775o.m28639i(y0Var, "delegate");
        this.f20276b = j;
        this.f20277c = z;
    }

    /* renamed from: a */
    private final void m28020a(C13121c cVar, long j) {
        C13121c cVar2 = new C13121c();
        cVar2.mo52494K(cVar);
        cVar.write(cVar2, j);
        cVar2.mo52514a();
    }

    public long read(C13121c cVar, long j) {
        C12775o.m28639i(cVar, "sink");
        long j2 = this.f20278d;
        long j3 = this.f20276b;
        if (j2 > j3) {
            j = 0;
        } else if (this.f20277c) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1;
            }
            j = Math.min(j, j4);
        }
        long read = super.read(cVar, j);
        int i = (read > -1 ? 1 : (read == -1 ? 0 : -1));
        if (i != 0) {
            this.f20278d += read;
        }
        long j5 = this.f20278d;
        long j6 = this.f20276b;
        if ((j5 >= j6 || i != 0) && j5 <= j6) {
            return read;
        }
        if (read > 0 && j5 > j6) {
            m28020a(cVar, cVar.size() - (this.f20278d - this.f20276b));
        }
        throw new IOException("expected " + this.f20276b + " bytes but got " + this.f20278d);
    }
}
