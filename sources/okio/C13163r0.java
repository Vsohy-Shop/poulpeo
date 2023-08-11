package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 2 -RealBufferedSink.kt\nokio/internal/_RealBufferedSinkKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n50#1:145\n50#1:151\n50#1:156\n50#1:161\n50#1:166\n50#1:171\n50#1:174\n50#1:175\n50#1:179\n50#1:184\n50#1:187\n50#1:191\n50#1:200\n50#1:209\n50#1:214\n50#1:219\n50#1:224\n50#1:229\n50#1:234\n50#1:239\n50#1:244\n50#1:249\n50#1:254\n50#1:260\n50#1:266\n50#1:278\n31#2:142\n32#2:144\n33#2,2:146\n37#2:148\n38#2:150\n39#2:152\n47#2:153\n48#2:155\n49#2:157\n53#2:158\n54#2:160\n55#2:162\n63#2:163\n64#2:165\n65#2:167\n69#2:168\n70#2:170\n71#2:172\n75#2:176\n76#2:178\n77#2:180\n85#2:181\n86#2:183\n87#2:185\n91#2,3:188\n94#2,5:192\n102#2,3:197\n105#2,5:201\n113#2:206\n114#2:208\n115#2:210\n119#2:211\n120#2:213\n121#2:215\n125#2:216\n126#2:218\n127#2:220\n131#2:221\n132#2:223\n133#2:225\n137#2:226\n138#2:228\n139#2:230\n143#2:231\n144#2:233\n145#2:235\n149#2:236\n150#2:238\n151#2:240\n155#2:241\n156#2:243\n157#2:245\n161#2:246\n162#2:248\n163#2:250\n167#2:251\n168#2:253\n169#2,2:255\n174#2:257\n175#2:259\n176#2,2:261\n181#2:263\n182#2:265\n183#2,4:267\n189#2,7:271\n196#2,16:279\n213#2:295\n215#2:296\n1#3:143\n1#3:149\n1#3:154\n1#3:159\n1#3:164\n1#3:169\n1#3:173\n1#3:177\n1#3:182\n1#3:186\n1#3:207\n1#3:212\n1#3:217\n1#3:222\n1#3:227\n1#3:232\n1#3:237\n1#3:242\n1#3:247\n1#3:252\n1#3:258\n1#3:264\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n54#1:145\n55#1:151\n57#1:156\n58#1:161\n60#1:166\n62#1:171\n66#1:174\n77#1:175\n81#1:179\n83#1:184\n87#1:187\n92#1:191\n93#1:200\n94#1:209\n95#1:214\n96#1:219\n97#1:224\n98#1:229\n99#1:234\n100#1:239\n101#1:244\n102#1:249\n103#1:254\n104#1:260\n133#1:266\n137#1:278\n54#1:142\n54#1:144\n54#1:146,2\n55#1:148\n55#1:150\n55#1:152\n57#1:153\n57#1:155\n57#1:157\n58#1:158\n58#1:160\n58#1:162\n60#1:163\n60#1:165\n60#1:167\n62#1:168\n62#1:170\n62#1:172\n81#1:176\n81#1:178\n81#1:180\n83#1:181\n83#1:183\n83#1:185\n92#1:188,3\n92#1:192,5\n93#1:197,3\n93#1:201,5\n94#1:206\n94#1:208\n94#1:210\n95#1:211\n95#1:213\n95#1:215\n96#1:216\n96#1:218\n96#1:220\n97#1:221\n97#1:223\n97#1:225\n98#1:226\n98#1:228\n98#1:230\n99#1:231\n99#1:233\n99#1:235\n100#1:236\n100#1:238\n100#1:240\n101#1:241\n101#1:243\n101#1:245\n102#1:246\n102#1:248\n102#1:250\n103#1:251\n103#1:253\n103#1:255,2\n104#1:257\n104#1:259\n104#1:261,2\n133#1:263\n133#1:265\n133#1:267,4\n137#1:271,7\n137#1:279,16\n138#1:295\n139#1:296\n54#1:143\n55#1:149\n57#1:154\n58#1:159\n60#1:164\n62#1:169\n81#1:177\n83#1:182\n94#1:207\n95#1:212\n96#1:217\n97#1:222\n98#1:227\n99#1:232\n100#1:237\n101#1:242\n102#1:247\n103#1:252\n104#1:258\n133#1:264\n*E\n"})
/* renamed from: okio.r0 */
/* compiled from: RealBufferedSink.kt */
public final class C13163r0 implements C13127d {

    /* renamed from: b */
    public final C13175w0 f20959b;

    /* renamed from: c */
    public final C13121c f20960c = new C13121c();

    /* renamed from: d */
    public boolean f20961d;

    public C13163r0(C13175w0 w0Var) {
        C12775o.m28639i(w0Var, "sink");
        this.f20959b = w0Var;
    }

    /* renamed from: F */
    public C13127d mo52486F(String str) {
        C12775o.m28639i(str, TypedValues.Custom.S_STRING);
        if (!this.f20961d) {
            this.f20960c.mo52486F(str);
            return mo52566y();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: K */
    public long mo52494K(C13179y0 y0Var) {
        C12775o.m28639i(y0Var, APIParams.SOURCE);
        long j = 0;
        while (true) {
            long read = y0Var.read(this.f20960c, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
            mo52566y();
        }
    }

    /* renamed from: L */
    public C13127d mo52496L(long j) {
        if (!this.f20961d) {
            this.f20960c.mo52496L(j);
            return mo52566y();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: b0 */
    public C13127d mo52517b0(C13133f fVar) {
        C12775o.m28639i(fVar, "byteString");
        if (!this.f20961d) {
            this.f20960c.mo52517b0(fVar);
            return mo52566y();
        }
        throw new IllegalStateException("closed".toString());
    }

    public void close() {
        if (!this.f20961d) {
            try {
                if (this.f20960c.size() > 0) {
                    C13175w0 w0Var = this.f20959b;
                    C13121c cVar = this.f20960c;
                    w0Var.write(cVar, cVar.size());
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f20959b.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f20961d = true;
            if (th != null) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public C13121c mo52521d() {
        return this.f20960c;
    }

    /* renamed from: f */
    public C13121c mo52524f() {
        return this.f20960c;
    }

    public void flush() {
        if (!this.f20961d) {
            if (this.f20960c.size() > 0) {
                C13175w0 w0Var = this.f20959b;
                C13121c cVar = this.f20960c;
                w0Var.write(cVar, cVar.size());
            }
            this.f20959b.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f20961d;
    }

    /* renamed from: o0 */
    public C13127d mo52535o0(long j) {
        if (!this.f20961d) {
            this.f20960c.mo52535o0(j);
            return mo52566y();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: p */
    public C13127d mo52536p() {
        if (!this.f20961d) {
            long size = this.f20960c.size();
            if (size > 0) {
                this.f20959b.write(this.f20960c, size);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C13181z0 timeout() {
        return this.f20959b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f20959b + ')';
    }

    public int write(ByteBuffer byteBuffer) {
        C12775o.m28639i(byteBuffer, APIParams.SOURCE);
        if (!this.f20961d) {
            int write = this.f20960c.write(byteBuffer);
            mo52566y();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C13127d writeByte(int i) {
        if (!this.f20961d) {
            this.f20960c.writeByte(i);
            return mo52566y();
        }
        throw new IllegalStateException("closed".toString());
    }

    public C13127d writeInt(int i) {
        if (!this.f20961d) {
            this.f20960c.writeInt(i);
            return mo52566y();
        }
        throw new IllegalStateException("closed".toString());
    }

    public C13127d writeShort(int i) {
        if (!this.f20961d) {
            this.f20960c.writeShort(i);
            return mo52566y();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: y */
    public C13127d mo52566y() {
        if (!this.f20961d) {
            long c = this.f20960c.mo52518c();
            if (c > 0) {
                this.f20959b.write(this.f20960c, c);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public void write(C13121c cVar, long j) {
        C12775o.m28639i(cVar, APIParams.SOURCE);
        if (!this.f20961d) {
            this.f20960c.write(cVar, j);
            mo52566y();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C13127d write(byte[] bArr) {
        C12775o.m28639i(bArr, APIParams.SOURCE);
        if (!this.f20961d) {
            this.f20960c.write(bArr);
            return mo52566y();
        }
        throw new IllegalStateException("closed".toString());
    }

    public C13127d write(byte[] bArr, int i, int i2) {
        C12775o.m28639i(bArr, APIParams.SOURCE);
        if (!this.f20961d) {
            this.f20960c.write(bArr, i, i2);
            return mo52566y();
        }
        throw new IllegalStateException("closed".toString());
    }
}
