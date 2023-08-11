package okio;

import androidx.core.location.LocationRequestCompat;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p371jg.C12636f;

@SourceDebugExtension({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 2 -RealBufferedSource.kt\nokio/internal/_RealBufferedSourceKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 -Util.kt\nokio/_UtilKt\n*L\n1#1,182:1\n61#1:188\n61#1:198\n61#1:205\n61#1:211\n61#1:213\n61#1:217\n61#1:222\n61#1:237\n61#1:241\n61#1:248\n61#1:261\n61#1:269\n61#1:270\n61#1:271\n61#1:277\n61#1:285\n61#1:298\n61#1:302\n61#1:303\n61#1:304\n61#1:305\n61#1:310\n61#1:322\n61#1:338\n61#1:348\n61#1:351\n61#1:354\n61#1:357\n61#1:360\n61#1:363\n61#1:369\n61#1:386\n61#1:406\n61#1:421\n61#1:438\n61#1:451\n61#1:472\n61#1:479\n35#2:183\n36#2,3:185\n39#2,6:189\n48#2:195\n49#2:197\n53#2,2:199\n57#2:201\n58#2,2:203\n60#2,3:206\n66#2,2:209\n71#2:212\n72#2:214\n76#2,2:215\n81#2:218\n83#2,2:220\n85#2,13:223\n104#2:236\n105#2:238\n109#2,2:239\n114#2,6:242\n120#2,9:249\n131#2,3:258\n134#2,5:262\n139#2:268\n143#2,5:272\n148#2,5:278\n155#2,2:283\n157#2,11:286\n171#2:297\n172#2:299\n176#2,2:300\n181#2,4:306\n185#2,6:311\n195#2:317\n196#2,3:319\n199#2,8:323\n207#2,3:332\n214#2,3:335\n217#2,7:339\n227#2,2:346\n232#2,2:349\n237#2,2:352\n242#2,2:355\n247#2,2:358\n252#2,2:361\n257#2,5:364\n262#2,11:370\n276#2,5:381\n281#2,14:387\n298#2,2:401\n300#2,2:404\n302#2,7:407\n311#2,2:414\n313#2,4:417\n317#2,11:422\n331#2,2:433\n334#2,2:436\n336#2,7:439\n347#2,2:446\n350#2,2:449\n352#2,7:452\n368#2:459\n370#2,11:461\n382#2:473\n386#2:474\n390#2,4:475\n394#2:480\n396#2:481\n398#2:482\n1#3:184\n1#3:196\n1#3:202\n1#3:219\n1#3:318\n1#3:403\n1#3:416\n1#3:435\n1#3:448\n1#3:460\n87#4:267\n87#4:331\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n*L\n65#1:188\n66#1:198\n68#1:205\n69#1:211\n70#1:213\n71#1:217\n72#1:222\n73#1:237\n74#1:241\n76#1:248\n78#1:261\n81#1:269\n82#1:270\n86#1:271\n89#1:277\n90#1:285\n91#1:298\n92#1:302\n95#1:303\n96#1:304\n101#1:305\n104#1:310\n106#1:322\n107#1:338\n108#1:348\n109#1:351\n110#1:354\n111#1:357\n112#1:360\n113#1:363\n114#1:369\n115#1:386\n116#1:406\n120#1:421\n123#1:438\n126#1:451\n138#1:472\n178#1:479\n65#1:183\n65#1:185,3\n65#1:189,6\n66#1:195\n66#1:197\n67#1:199,2\n68#1:201\n68#1:203,2\n68#1:206,3\n69#1:209,2\n70#1:212\n70#1:214\n71#1:215,2\n72#1:218\n72#1:220,2\n72#1:223,13\n73#1:236\n73#1:238\n74#1:239,2\n76#1:242,6\n76#1:249,9\n78#1:258,3\n78#1:262,5\n78#1:268\n89#1:272,5\n89#1:278,5\n90#1:283,2\n90#1:286,11\n91#1:297\n91#1:299\n92#1:300,2\n104#1:306,4\n104#1:311,6\n106#1:317\n106#1:319,3\n106#1:323,8\n106#1:332,3\n107#1:335,3\n107#1:339,7\n108#1:346,2\n109#1:349,2\n110#1:352,2\n111#1:355,2\n112#1:358,2\n113#1:361,2\n114#1:364,5\n114#1:370,11\n115#1:381,5\n115#1:387,14\n116#1:401,2\n116#1:404,2\n116#1:407,7\n120#1:414,2\n120#1:417,4\n120#1:422,11\n123#1:433,2\n123#1:436,2\n123#1:439,7\n126#1:446,2\n126#1:449,2\n126#1:452,7\n138#1:459\n138#1:461,11\n138#1:473\n140#1:474\n178#1:475,4\n178#1:480\n179#1:481\n180#1:482\n65#1:184\n66#1:196\n68#1:202\n72#1:219\n106#1:318\n116#1:403\n120#1:416\n123#1:435\n126#1:448\n138#1:460\n78#1:267\n106#1:331\n*E\n"})
/* renamed from: okio.s0 */
/* compiled from: RealBufferedSource.kt */
public final class C13165s0 implements C13130e {

    /* renamed from: b */
    public final C13179y0 f20962b;

    /* renamed from: c */
    public final C13121c f20963c = new C13121c();

    /* renamed from: d */
    public boolean f20964d;

    public C13165s0(C13179y0 y0Var) {
        C12775o.m28639i(y0Var, APIParams.SOURCE);
        this.f20962b = y0Var;
    }

    /* renamed from: B */
    public String mo52481B(long j) {
        boolean z;
        long j2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long b = mo52706b((byte) 10, 0, j2);
            if (b != -1) {
                return C12636f.m28067d(this.f20963c, b);
            }
            if (j2 < LocationRequestCompat.PASSIVE_INTERVAL && mo52526h(j2) && this.f20963c.mo52530j0(j2 - 1) == 13 && mo52526h(1 + j2) && this.f20963c.mo52530j0(j2) == 10) {
                return C12636f.m28067d(this.f20963c, j2);
            }
            C13121c cVar = new C13121c();
            C13121c cVar2 = this.f20963c;
            cVar2.mo52512Y(cVar, 0, Math.min((long) 32, cVar2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f20963c.size(), j) + " content=" + cVar.mo52498M().mo52609l() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    /* renamed from: H */
    public boolean mo52489H(long j, C13133f fVar) {
        C12775o.m28639i(fVar, "bytes");
        return mo52707c(j, fVar, 0, fVar.mo52590H());
    }

    /* renamed from: I */
    public String mo52491I(Charset charset) {
        C12775o.m28639i(charset, "charset");
        this.f20963c.mo52494K(this.f20962b);
        return this.f20963c.mo52491I(charset);
    }

    /* renamed from: M */
    public C13133f mo52498M() {
        this.f20963c.mo52494K(this.f20962b);
        return this.f20963c.mo52498M();
    }

    /* renamed from: U */
    public String mo52507U() {
        return mo52481B(LocationRequestCompat.PASSIVE_INTERVAL);
    }

    /* renamed from: W */
    public int mo52510W() {
        mo52533m0(4);
        return this.f20963c.mo52510W();
    }

    /* renamed from: Z */
    public byte[] mo52513Z(long j) {
        mo52533m0(j);
        return this.f20963c.mo52513Z(j);
    }

    /* renamed from: a */
    public long mo52705a(byte b) {
        return mo52706b(b, 0, LocationRequestCompat.PASSIVE_INTERVAL);
    }

    /* renamed from: b */
    public long mo52706b(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f20964d) {
            if (0 > j || j > j2) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long k0 = this.f20963c.mo52531k0(b, j, j2);
                    if (k0 != -1) {
                        return k0;
                    }
                    long size = this.f20963c.size();
                    if (size >= j2 || this.f20962b.read(this.f20963c, 8192) == -1) {
                        return -1;
                    }
                    j = Math.max(j, size);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: c */
    public boolean mo52707c(long j, C13133f fVar, int i, int i2) {
        C12775o.m28639i(fVar, "bytes");
        if (!this.f20964d) {
            if (j >= 0 && i >= 0 && i2 >= 0 && fVar.mo52590H() - i >= i2) {
                int i3 = 0;
                while (i3 < i2) {
                    long j2 = ((long) i3) + j;
                    if (mo52526h(1 + j2) && this.f20963c.mo52530j0(j2) == fVar.mo52603g(i + i3)) {
                        i3++;
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    public void close() {
        if (!this.f20964d) {
            this.f20964d = true;
            this.f20962b.close();
            this.f20963c.mo52514a();
        }
    }

    /* renamed from: d */
    public C13121c mo52521d() {
        return this.f20963c;
    }

    /* renamed from: d0 */
    public short mo52522d0() {
        mo52533m0(2);
        return this.f20963c.mo52522d0();
    }

    /* renamed from: f */
    public C13121c mo52524f() {
        return this.f20963c;
    }

    /* renamed from: g0 */
    public long mo52525g0() {
        mo52533m0(8);
        return this.f20963c.mo52525g0();
    }

    /* renamed from: h */
    public boolean mo52526h(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!this.f20964d) {
            while (this.f20963c.size() < j) {
                if (this.f20962b.read(this.f20963c, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: h0 */
    public long mo52527h0(C13175w0 w0Var) {
        C12775o.m28639i(w0Var, "sink");
        long j = 0;
        while (this.f20962b.read(this.f20963c, 8192) != -1) {
            long c = this.f20963c.mo52518c();
            if (c > 0) {
                j += c;
                w0Var.write(this.f20963c, c);
            }
        }
        if (this.f20963c.size() <= 0) {
            return j;
        }
        long size = j + this.f20963c.size();
        C13121c cVar = this.f20963c;
        w0Var.write(cVar, cVar.size());
        return size;
    }

    public boolean isOpen() {
        return !this.f20964d;
    }

    /* renamed from: l */
    public String mo52532l(long j) {
        mo52533m0(j);
        return this.f20963c.mo52532l(j);
    }

    /* renamed from: m0 */
    public void mo52533m0(long j) {
        if (!mo52526h(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: o */
    public C13133f mo52534o(long j) {
        mo52533m0(j);
        return this.f20963c.mo52534o(j);
    }

    public C13130e peek() {
        return C13145j0.m29739d(new C13161q0(this));
    }

    /* renamed from: q0 */
    public long mo52539q0() {
        mo52533m0(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo52526h((long) i2)) {
                break;
            }
            byte j0 = this.f20963c.mo52530j0((long) i);
            if ((j0 >= 48 && j0 <= 57) || ((j0 >= 97 && j0 <= 102) || (j0 >= 65 && j0 <= 70))) {
                i = i2;
            } else if (i == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9a-fA-F] character but was 0x");
                String num = Integer.toString(j0, C13724b.m31415a(C13724b.m31415a(16)));
                C12775o.m28638h(num, "toString(this, checkRadix(radix))");
                sb.append(num);
                throw new NumberFormatException(sb.toString());
            }
        }
        return this.f20963c.mo52539q0();
    }

    /* renamed from: r0 */
    public InputStream mo52540r0() {
        return new C13166a(this);
    }

    public long read(C13121c cVar, long j) {
        C12775o.m28639i(cVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(!this.f20964d)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f20963c.size() == 0 && this.f20962b.read(this.f20963c, 8192) == -1) {
            return -1;
        } else {
            return this.f20963c.read(cVar, Math.min(j, this.f20963c.size()));
        }
    }

    public byte readByte() {
        mo52533m0(1);
        return this.f20963c.readByte();
    }

    public void readFully(byte[] bArr) {
        C12775o.m28639i(bArr, "sink");
        try {
            mo52533m0((long) bArr.length);
            this.f20963c.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.f20963c.size() > 0) {
                C13121c cVar = this.f20963c;
                int read = cVar.read(bArr, i, (int) cVar.size());
                if (read != -1) {
                    i += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    public int readInt() {
        mo52533m0(4);
        return this.f20963c.readInt();
    }

    public long readLong() {
        mo52533m0(8);
        return this.f20963c.readLong();
    }

    public short readShort() {
        mo52533m0(2);
        return this.f20963c.readShort();
    }

    /* renamed from: s */
    public byte[] mo52548s() {
        this.f20963c.mo52494K(this.f20962b);
        return this.f20963c.mo52548s();
    }

    /* renamed from: s0 */
    public int mo52549s0(C13151m0 m0Var) {
        C12775o.m28639i(m0Var, "options");
        if (!this.f20964d) {
            while (true) {
                int e = C12636f.m28068e(this.f20963c, m0Var, true);
                if (e == -2) {
                    if (this.f20962b.read(this.f20963c, 8192) == -1) {
                        break;
                    }
                } else if (e != -1) {
                    this.f20963c.skip((long) m0Var.mo52662k()[e].mo52590H());
                    return e;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public void skip(long j) {
        if (!this.f20964d) {
            while (j > 0) {
                if (this.f20963c.size() == 0 && this.f20962b.read(this.f20963c, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f20963c.size());
                this.f20963c.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: t */
    public boolean mo52552t() {
        if (!(!this.f20964d)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.f20963c.mo52552t() || this.f20962b.read(this.f20963c, 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    public C13181z0 timeout() {
        return this.f20962b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f20962b + ')';
    }

    /* renamed from: x */
    public void mo52564x(C13121c cVar, long j) {
        C12775o.m28639i(cVar, "sink");
        try {
            mo52533m0(j);
            this.f20963c.mo52564x(cVar, j);
        } catch (EOFException e) {
            cVar.mo52494K(this.f20963c);
            throw e;
        }
    }

    /* renamed from: z */
    public long mo52568z() {
        int i;
        mo52533m0(1);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!mo52526h(j2)) {
                break;
            }
            byte j0 = this.f20963c.mo52530j0(j);
            if ((j0 >= 48 && j0 <= 57) || (j == 0 && j0 == 45)) {
                j = j2;
            } else if (i == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a digit or '-' but was 0x");
                String num = Integer.toString(j0, C13724b.m31415a(C13724b.m31415a(16)));
                C12775o.m28638h(num, "toString(this, checkRadix(radix))");
                sb.append(num);
                throw new NumberFormatException(sb.toString());
            }
        }
        return this.f20963c.mo52568z();
    }

    @SourceDebugExtension({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource$inputStream$1\n+ 2 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 3 -Util.kt\nokio/_UtilKt\n*L\n1#1,182:1\n61#2:183\n61#2:184\n61#2:185\n61#2:187\n61#2:188\n61#2:189\n61#2:190\n72#3:186\n84#3:191\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource$inputStream$1\n*L\n146#1:183\n147#1:184\n150#1:185\n157#1:187\n158#1:188\n162#1:189\n167#1:190\n150#1:186\n167#1:191\n*E\n"})
    /* renamed from: okio.s0$a */
    /* compiled from: RealBufferedSource.kt */
    public static final class C13166a extends InputStream {

        /* renamed from: b */
        final /* synthetic */ C13165s0 f20965b;

        C13166a(C13165s0 s0Var) {
            this.f20965b = s0Var;
        }

        public int available() {
            C13165s0 s0Var = this.f20965b;
            if (!s0Var.f20964d) {
                return (int) Math.min(s0Var.f20963c.size(), (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f20965b.close();
        }

        public int read() {
            C13165s0 s0Var = this.f20965b;
            if (!s0Var.f20964d) {
                if (s0Var.f20963c.size() == 0) {
                    C13165s0 s0Var2 = this.f20965b;
                    if (s0Var2.f20962b.read(s0Var2.f20963c, 8192) == -1) {
                        return -1;
                    }
                }
                return this.f20965b.f20963c.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return this.f20965b + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            C12775o.m28639i(bArr, "data");
            if (!this.f20965b.f20964d) {
                C13132e1.m29639b((long) bArr.length, (long) i, (long) i2);
                if (this.f20965b.f20963c.size() == 0) {
                    C13165s0 s0Var = this.f20965b;
                    if (s0Var.f20962b.read(s0Var.f20963c, 8192) == -1) {
                        return -1;
                    }
                }
                return this.f20965b.f20963c.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }

    public int read(ByteBuffer byteBuffer) {
        C12775o.m28639i(byteBuffer, "sink");
        if (this.f20963c.size() == 0 && this.f20962b.read(this.f20963c, 8192) == -1) {
            return -1;
        }
        return this.f20963c.read(byteBuffer);
    }
}
