package okio;

import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nGzipSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 GzipSource.kt\nokio/-GzipSourceExtensions\n+ 5 -Util.kt\nokio/_UtilKt\n*L\n1#1,220:1\n1#2:221\n61#3:222\n61#3:224\n61#3:226\n61#3:227\n61#3:228\n61#3:230\n61#3:232\n202#4:223\n202#4:225\n202#4:229\n202#4:231\n87#5:233\n*S KotlinDebug\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n*L\n105#1:222\n107#1:224\n119#1:226\n120#1:227\n122#1:228\n133#1:230\n144#1:232\n106#1:223\n117#1:225\n130#1:229\n141#1:231\n187#1:233\n*E\n"})
/* renamed from: okio.o */
/* compiled from: GzipSource.kt */
public final class C13155o implements C13179y0 {

    /* renamed from: b */
    private byte f20938b;

    /* renamed from: c */
    private final C13165s0 f20939c;

    /* renamed from: d */
    private final Inflater f20940d;

    /* renamed from: e */
    private final C13157p f20941e;

    /* renamed from: f */
    private final CRC32 f20942f = new CRC32();

    public C13155o(C13179y0 y0Var) {
        C12775o.m28639i(y0Var, APIParams.SOURCE);
        C13165s0 s0Var = new C13165s0(y0Var);
        this.f20939c = s0Var;
        Inflater inflater = new Inflater(true);
        this.f20940d = inflater;
        this.f20941e = new C13157p((C13130e) s0Var, inflater);
    }

    /* renamed from: a */
    private final void m29786a(String str, int i, int i2) {
        if (i2 != i) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
            C12775o.m28638h(format, "format(this, *args)");
            throw new IOException(format);
        }
    }

    /* renamed from: b */
    private final void m29787b() {
        boolean z;
        boolean z2;
        boolean z3;
        this.f20939c.mo52533m0(10);
        byte j0 = this.f20939c.f20963c.mo52530j0(3);
        boolean z4 = true;
        if (((j0 >> 1) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m29789k(this.f20939c.f20963c, 0, 10);
        }
        m29786a("ID1ID2", 8075, this.f20939c.readShort());
        this.f20939c.skip(8);
        if (((j0 >> 2) & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f20939c.mo52533m0(2);
            if (z) {
                m29789k(this.f20939c.f20963c, 0, 2);
            }
            long d0 = (long) this.f20939c.f20963c.mo52522d0();
            this.f20939c.mo52533m0(d0);
            if (z) {
                m29789k(this.f20939c.f20963c, 0, d0);
            }
            this.f20939c.skip(d0);
        }
        if (((j0 >> 3) & 1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            long a = this.f20939c.mo52705a((byte) 0);
            if (a != -1) {
                if (z) {
                    m29789k(this.f20939c.f20963c, 0, a + 1);
                }
                this.f20939c.skip(a + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((j0 >> 4) & 1) != 1) {
            z4 = false;
        }
        if (z4) {
            long a2 = this.f20939c.mo52705a((byte) 0);
            if (a2 != -1) {
                if (z) {
                    m29789k(this.f20939c.f20963c, 0, a2 + 1);
                }
                this.f20939c.skip(a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m29786a("FHCRC", this.f20939c.mo52522d0(), (short) ((int) this.f20942f.getValue()));
            this.f20942f.reset();
        }
    }

    /* renamed from: c */
    private final void m29788c() {
        m29786a("CRC", this.f20939c.mo52510W(), (int) this.f20942f.getValue());
        m29786a("ISIZE", this.f20939c.mo52510W(), (int) this.f20940d.getBytesWritten());
    }

    /* renamed from: k */
    private final void m29789k(C13121c cVar, long j, long j2) {
        C13168t0 t0Var = cVar.f20888b;
        C12775o.m28636f(t0Var);
        while (true) {
            int i = t0Var.f20969c;
            int i2 = t0Var.f20968b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            t0Var = t0Var.f20972f;
            C12775o.m28636f(t0Var);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) t0Var.f20968b) + j);
            int min = (int) Math.min((long) (t0Var.f20969c - i3), j2);
            this.f20942f.update(t0Var.f20967a, i3, min);
            j2 -= (long) min;
            t0Var = t0Var.f20972f;
            C12775o.m28636f(t0Var);
            j = 0;
        }
    }

    public void close() {
        this.f20941e.close();
    }

    public long read(C13121c cVar, long j) {
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
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f20938b == 0) {
                m29787b();
                this.f20938b = 1;
            }
            if (this.f20938b == 1) {
                long size = cVar.size();
                long read = this.f20941e.read(cVar, j);
                if (read != -1) {
                    m29789k(cVar, size, read);
                    return read;
                }
                this.f20938b = 2;
            }
            if (this.f20938b == 2) {
                m29788c();
                this.f20938b = 3;
                if (!this.f20939c.mo52552t()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public C13181z0 timeout() {
        return this.f20939c.timeout();
    }
}
