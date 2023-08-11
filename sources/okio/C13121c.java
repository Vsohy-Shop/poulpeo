package okio;

import androidx.compose.animation.core.AnimationKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import com.rmn.api.p322v2.main.oauth.OAuthErrorCodes;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.connection.RealConnection;
import p371jg.C12636f;
import p454wf.C13726d;

@SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer\n+ 2 -Util.kt\nokio/_UtilKt\n+ 3 -Buffer.kt\nokio/internal/_BufferKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,631:1\n87#2:632\n84#2:665\n84#2:667\n72#2:727\n72#2:753\n81#2:792\n75#2:803\n87#2:993\n72#2:1008\n84#2:1109\n87#2:1574\n242#3,32:633\n277#3,10:668\n290#3,18:678\n412#3,2:696\n110#3:698\n414#3:699\n112#3,18:700\n311#3,9:718\n320#3,15:728\n338#3,10:743\n348#3,3:754\n346#3,25:757\n374#3,10:782\n384#3:793\n382#3,9:794\n391#3,7:804\n389#3,20:811\n649#3,60:831\n712#3,56:891\n770#3:947\n773#3:948\n774#3,6:950\n784#3,7:956\n794#3,6:963\n802#3,5:969\n834#3,6:974\n844#3:980\n845#3,11:982\n856#3,5:994\n865#3,9:999\n875#3,61:1009\n603#3:1070\n606#3:1071\n607#3,5:1073\n614#3:1078\n617#3,7:1079\n626#3,17:1086\n418#3:1103\n421#3,5:1104\n426#3,10:1110\n437#3,7:1120\n442#3,2:1127\n940#3:1129\n941#3,87:1131\n1031#3,48:1218\n573#3:1266\n580#3,21:1267\n1082#3,7:1288\n1092#3,7:1295\n1102#3,4:1302\n1109#3,8:1306\n1120#3,10:1314\n1133#3,14:1324\n447#3,63:1338\n513#3,40:1401\n556#3:1441\n558#3,13:1443\n1150#3:1456\n1201#3:1457\n1202#3,39:1459\n1243#3,2:1498\n1245#3,4:1501\n1252#3,3:1505\n1256#3,4:1509\n110#3:1513\n1260#3,22:1514\n112#3,18:1536\n1286#3,2:1554\n1288#3,3:1557\n110#3:1560\n1291#3,13:1561\n1304#3,13:1575\n112#3,18:1588\n1321#3,2:1606\n1324#3:1609\n110#3:1610\n1325#3,50:1611\n112#3,18:1661\n1384#3,14:1679\n1401#3,32:1693\n1436#3,12:1725\n1451#3,18:1737\n1473#3:1755\n1474#3:1757\n1479#3,34:1758\n1#4:666\n1#4:949\n1#4:981\n1#4:1072\n1#4:1130\n1#4:1442\n1#4:1458\n1#4:1500\n1#4:1508\n1#4:1556\n1#4:1608\n1#4:1756\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer\n*L\n167#1:632\n197#1:665\n235#1:667\n261#1:727\n264#1:753\n267#1:792\n267#1:803\n335#1:993\n338#1:1008\n374#1:1109\n481#1:1574\n181#1:633,32\n252#1:668,10\n255#1:678,18\n258#1:696,2\n258#1:698\n258#1:699\n258#1:700,18\n261#1:718,9\n261#1:728,15\n264#1:743,10\n264#1:754,3\n264#1:757,25\n267#1:782,10\n267#1:793\n267#1:794,9\n267#1:804,7\n267#1:811,20\n279#1:831,60\n282#1:891,56\n284#1:947\n287#1:948\n287#1:950,6\n289#1:956,7\n292#1:963,6\n295#1:969,5\n329#1:974,6\n335#1:980\n335#1:982,11\n335#1:994,5\n338#1:999,9\n338#1:1009,61\n340#1:1070\n343#1:1071\n343#1:1073,5\n345#1:1078\n348#1:1079,7\n351#1:1086,17\n371#1:1103\n374#1:1104,5\n374#1:1110,10\n376#1:1120,7\n379#1:1127,2\n384#1:1129\n384#1:1131,87\n387#1:1218,48\n408#1:1266\n414#1:1267,21\n435#1:1288,7\n439#1:1295,7\n441#1:1302,4\n443#1:1306,8\n447#1:1314,10\n451#1:1324,14\n455#1:1338,63\n458#1:1401,40\n461#1:1441\n461#1:1443,13\n463#1:1456\n463#1:1457\n463#1:1459,39\n465#1:1498,2\n465#1:1501,4\n475#1:1505,3\n475#1:1509,4\n475#1:1513\n475#1:1514,22\n475#1:1536,18\n481#1:1554,2\n481#1:1557,3\n481#1:1560\n481#1:1561,13\n481#1:1575,13\n481#1:1588,18\n486#1:1606,2\n486#1:1609\n486#1:1610\n486#1:1611,50\n486#1:1661,18\n496#1:1679,14\n566#1:1693,32\n568#1:1725,12\n576#1:1737,18\n581#1:1755\n581#1:1757\n583#1:1758,34\n287#1:949\n335#1:981\n343#1:1072\n384#1:1130\n461#1:1442\n463#1:1458\n465#1:1500\n475#1:1508\n481#1:1556\n486#1:1608\n581#1:1756\n*E\n"})
/* renamed from: okio.c */
/* compiled from: Buffer.kt */
public final class C13121c implements C13130e, C13127d, Cloneable, ByteChannel {

    /* renamed from: b */
    public C13168t0 f20888b;

    /* renamed from: c */
    private long f20889c;

    @SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n+ 2 -Buffer.kt\nokio/internal/_BufferKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 -Util.kt\nokio/_UtilKt\n*L\n1#1,631:1\n1534#2:632\n1535#2:634\n1539#2:635\n1540#2,68:637\n1611#2:705\n1612#2,32:707\n1644#2,18:740\n1665#2:758\n1666#2,18:760\n1688#2:778\n1690#2,7:780\n1#3:633\n1#3:636\n1#3:706\n1#3:759\n1#3:779\n84#4:739\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n*L\n618#1:632\n618#1:634\n620#1:635\n620#1:637,68\n622#1:705\n622#1:707,32\n622#1:740,18\n624#1:758\n624#1:760,18\n627#1:778\n627#1:780,7\n618#1:633\n620#1:636\n622#1:706\n624#1:759\n627#1:779\n622#1:739\n*E\n"})
    /* renamed from: okio.c$a */
    /* compiled from: Buffer.kt */
    public static final class C13122a implements Closeable {

        /* renamed from: b */
        public C13121c f20890b;

        /* renamed from: c */
        public boolean f20891c;

        /* renamed from: d */
        private C13168t0 f20892d;

        /* renamed from: e */
        public long f20893e = -1;

        /* renamed from: f */
        public byte[] f20894f;

        /* renamed from: g */
        public int f20895g = -1;

        /* renamed from: h */
        public int f20896h = -1;

        /* renamed from: A */
        public final void mo52569A(C13168t0 t0Var) {
            this.f20892d = t0Var;
        }

        /* renamed from: a */
        public final C13168t0 mo52570a() {
            return this.f20892d;
        }

        /* renamed from: b */
        public final int mo52571b() {
            boolean z;
            long j;
            long j2 = this.f20893e;
            C13121c cVar = this.f20890b;
            C12775o.m28636f(cVar);
            if (j2 != cVar.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long j3 = this.f20893e;
                if (j3 == -1) {
                    j = 0;
                } else {
                    j = j3 + ((long) (this.f20896h - this.f20895g));
                }
                return mo52574k(j);
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        /* renamed from: c */
        public final long mo52572c(long j) {
            boolean z;
            long j2 = j;
            C13121c cVar = this.f20890b;
            if (cVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            } else if (this.f20891c) {
                long size = cVar.size();
                int i = (j2 > size ? 1 : (j2 == size ? 0 : -1));
                int i2 = 1;
                if (i <= 0) {
                    if (j2 >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        long j3 = size - j2;
                        while (true) {
                            if (j3 <= 0) {
                                break;
                            }
                            C13168t0 t0Var = cVar.f20888b;
                            C12775o.m28636f(t0Var);
                            C13168t0 t0Var2 = t0Var.f20973g;
                            C12775o.m28636f(t0Var2);
                            int i3 = t0Var2.f20969c;
                            long j4 = (long) (i3 - t0Var2.f20968b);
                            if (j4 > j3) {
                                t0Var2.f20969c = i3 - ((int) j3);
                                break;
                            }
                            cVar.f20888b = t0Var2.mo52717b();
                            C13171u0.m29872b(t0Var2);
                            j3 -= j4;
                        }
                        mo52569A((C13168t0) null);
                        this.f20893e = j2;
                        this.f20894f = null;
                        this.f20895g = -1;
                        this.f20896h = -1;
                    } else {
                        throw new IllegalArgumentException(("newSize < 0: " + j2).toString());
                    }
                } else if (i > 0) {
                    long j5 = j2 - size;
                    boolean z2 = true;
                    while (j5 > 0) {
                        C13168t0 F0 = cVar.mo52487F0(i2);
                        int min = (int) Math.min(j5, (long) (8192 - F0.f20969c));
                        F0.f20969c += min;
                        j5 -= (long) min;
                        if (z2) {
                            mo52569A(F0);
                            this.f20893e = size;
                            this.f20894f = F0.f20967a;
                            int i4 = F0.f20969c;
                            this.f20895g = i4 - min;
                            this.f20896h = i4;
                            z2 = false;
                        }
                        i2 = 1;
                    }
                }
                cVar.mo52483C0(j2);
                return size;
            } else {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
        }

        public void close() {
            boolean z;
            if (this.f20890b != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f20890b = null;
                mo52569A((C13168t0) null);
                this.f20893e = -1;
                this.f20894f = null;
                this.f20895g = -1;
                this.f20896h = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        /* renamed from: k */
        public final int mo52574k(long j) {
            C13168t0 t0Var;
            C13121c cVar = this.f20890b;
            if (cVar != null) {
                int i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
                if (i < 0 || j > cVar.size()) {
                    throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + cVar.size());
                } else if (i == 0 || j == cVar.size()) {
                    mo52569A((C13168t0) null);
                    this.f20893e = j;
                    this.f20894f = null;
                    this.f20895g = -1;
                    this.f20896h = -1;
                    return -1;
                } else {
                    long size = cVar.size();
                    C13168t0 t0Var2 = cVar.f20888b;
                    long j2 = 0;
                    if (mo52570a() != null) {
                        long j3 = this.f20893e;
                        int i2 = this.f20895g;
                        C13168t0 a = mo52570a();
                        C12775o.m28636f(a);
                        long j4 = j3 - ((long) (i2 - a.f20968b));
                        if (j4 > j) {
                            t0Var = t0Var2;
                            t0Var2 = mo52570a();
                            size = j4;
                        } else {
                            t0Var = mo52570a();
                            j2 = j4;
                        }
                    } else {
                        t0Var = t0Var2;
                    }
                    if (size - j > j - j2) {
                        while (true) {
                            C12775o.m28636f(t0Var);
                            int i3 = t0Var.f20969c;
                            int i4 = t0Var.f20968b;
                            if (j < ((long) (i3 - i4)) + j2) {
                                break;
                            }
                            j2 += (long) (i3 - i4);
                            t0Var = t0Var.f20972f;
                        }
                    } else {
                        while (size > j) {
                            C12775o.m28636f(t0Var2);
                            t0Var2 = t0Var2.f20973g;
                            C12775o.m28636f(t0Var2);
                            size -= (long) (t0Var2.f20969c - t0Var2.f20968b);
                        }
                        j2 = size;
                        t0Var = t0Var2;
                    }
                    if (this.f20891c) {
                        C12775o.m28636f(t0Var);
                        if (t0Var.f20970d) {
                            C13168t0 f = t0Var.mo52721f();
                            if (cVar.f20888b == t0Var) {
                                cVar.f20888b = f;
                            }
                            t0Var = t0Var.mo52718c(f);
                            C13168t0 t0Var3 = t0Var.f20973g;
                            C12775o.m28636f(t0Var3);
                            t0Var3.mo52717b();
                        }
                    }
                    mo52569A(t0Var);
                    this.f20893e = j;
                    C12775o.m28636f(t0Var);
                    this.f20894f = t0Var.f20967a;
                    int i5 = t0Var.f20968b + ((int) (j - j2));
                    this.f20895g = i5;
                    int i6 = t0Var.f20969c;
                    this.f20896h = i6;
                    return i6 - i5;
                }
            } else {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
        }
    }

    /* renamed from: okio.c$c */
    /* compiled from: Buffer.kt */
    public static final class C13124c extends OutputStream {

        /* renamed from: b */
        final /* synthetic */ C13121c f20898b;

        C13124c(C13121c cVar) {
            this.f20898b = cVar;
        }

        public String toString() {
            return this.f20898b + ".outputStream()";
        }

        public void write(int i) {
            this.f20898b.writeByte(i);
        }

        public void write(byte[] bArr, int i, int i2) {
            C12775o.m28639i(bArr, "data");
            this.f20898b.write(bArr, i, i2);
        }

        public void close() {
        }

        public void flush() {
        }
    }

    /* renamed from: z0 */
    public static /* synthetic */ C13122a m29523z0(C13121c cVar, C13122a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = C13132e1.m29641d();
        }
        return cVar.mo52567y0(aVar);
    }

    /* renamed from: A0 */
    public String mo52480A0(long j, Charset charset) {
        boolean z;
        C12775o.m28639i(charset, "charset");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0 || j > 2147483647L) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (this.f20889c < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            C13168t0 t0Var = this.f20888b;
            C12775o.m28636f(t0Var);
            int i2 = t0Var.f20968b;
            if (((long) i2) + j > ((long) t0Var.f20969c)) {
                return new String(mo52513Z(j), charset);
            }
            int i3 = (int) j;
            String str = new String(t0Var.f20967a, i2, i3, charset);
            int i4 = t0Var.f20968b + i3;
            t0Var.f20968b = i4;
            this.f20889c -= j;
            if (i4 == t0Var.f20969c) {
                this.f20888b = t0Var.mo52717b();
                C13171u0.m29872b(t0Var);
            }
            return str;
        }
    }

    /* renamed from: B */
    public String mo52481B(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = LocationRequestCompat.PASSIVE_INTERVAL;
            if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
                j2 = j + 1;
            }
            long k0 = mo52531k0((byte) 10, 0, j2);
            if (k0 != -1) {
                return C12636f.m28067d(this, k0);
            }
            if (j2 < size() && mo52530j0(j2 - 1) == 13 && mo52530j0(j2) == 10) {
                return C12636f.m28067d(this, j2);
            }
            C13121c cVar = new C13121c();
            mo52512Y(cVar, 0, Math.min((long) 32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + cVar.mo52498M().mo52609l() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    /* renamed from: B0 */
    public String mo52482B0() {
        return mo52480A0(this.f20889c, C13726d.f22152b);
    }

    /* renamed from: C0 */
    public final void mo52483C0(long j) {
        this.f20889c = j;
    }

    /* renamed from: D0 */
    public final C13133f mo52484D0() {
        boolean z;
        if (size() <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return mo52485E0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    /* renamed from: E0 */
    public final C13133f mo52485E0(int i) {
        if (i == 0) {
            return C13133f.f20904f;
        }
        C13132e1.m29639b(size(), 0, (long) i);
        C13168t0 t0Var = this.f20888b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C12775o.m28636f(t0Var);
            int i5 = t0Var.f20969c;
            int i6 = t0Var.f20968b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                t0Var = t0Var.f20972f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        C13168t0 t0Var2 = this.f20888b;
        int i7 = 0;
        while (i2 < i) {
            C12775o.m28636f(t0Var2);
            bArr[i7] = t0Var2.f20967a;
            i2 += t0Var2.f20969c - t0Var2.f20968b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = t0Var2.f20968b;
            t0Var2.f20970d = true;
            i7++;
            t0Var2 = t0Var2.f20972f;
        }
        return new C13173v0(bArr, iArr);
    }

    /* renamed from: F0 */
    public final C13168t0 mo52487F0(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            C13168t0 t0Var = this.f20888b;
            if (t0Var == null) {
                C13168t0 c = C13171u0.m29873c();
                this.f20888b = c;
                c.f20973g = c;
                c.f20972f = c;
                return c;
            }
            C12775o.m28636f(t0Var);
            C13168t0 t0Var2 = t0Var.f20973g;
            C12775o.m28636f(t0Var2);
            if (t0Var2.f20969c + i > 8192 || !t0Var2.f20971e) {
                return t0Var2.mo52718c(C13171u0.m29873c());
            }
            return t0Var2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    /* renamed from: G0 */
    public C13121c mo52517b0(C13133f fVar) {
        C12775o.m28639i(fVar, "byteString");
        fVar.mo52596O(this, 0, fVar.mo52590H());
        return this;
    }

    /* renamed from: H */
    public boolean mo52489H(long j, C13133f fVar) {
        C12775o.m28639i(fVar, "bytes");
        return mo52565x0(j, fVar, 0, fVar.mo52590H());
    }

    /* renamed from: H0 */
    public C13121c mo52490H0(C13179y0 y0Var, long j) {
        C12775o.m28639i(y0Var, APIParams.SOURCE);
        while (j > 0) {
            long read = y0Var.read(this, j);
            if (read != -1) {
                j -= read;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    /* renamed from: I */
    public String mo52491I(Charset charset) {
        C12775o.m28639i(charset, "charset");
        return mo52480A0(this.f20889c, charset);
    }

    /* renamed from: I0 */
    public C13121c write(byte[] bArr) {
        C12775o.m28639i(bArr, APIParams.SOURCE);
        return write(bArr, 0, bArr.length);
    }

    /* renamed from: J0 */
    public C13121c write(byte[] bArr, int i, int i2) {
        C12775o.m28639i(bArr, APIParams.SOURCE);
        long j = (long) i2;
        C13132e1.m29639b((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C13168t0 F0 = mo52487F0(1);
            int min = Math.min(i3 - i, 8192 - F0.f20969c);
            int i4 = i + min;
            byte[] unused = C12708o.m28337d(bArr, F0.f20967a, F0.f20969c, i, i4);
            F0.f20969c += min;
            i = i4;
        }
        mo52483C0(size() + j);
        return this;
    }

    /* renamed from: K */
    public long mo52494K(C13179y0 y0Var) {
        C12775o.m28639i(y0Var, APIParams.SOURCE);
        long j = 0;
        while (true) {
            long read = y0Var.read(this, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    /* renamed from: K0 */
    public C13121c writeByte(int i) {
        C13168t0 F0 = mo52487F0(1);
        byte[] bArr = F0.f20967a;
        int i2 = F0.f20969c;
        F0.f20969c = i2 + 1;
        bArr[i2] = (byte) i;
        mo52483C0(size() + 1);
        return this;
    }

    /* renamed from: L0 */
    public C13121c mo52535o0(long j) {
        boolean z;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return writeByte(48);
        }
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return mo52486F("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i2 = 2;
                    }
                } else if (j < 1000) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
            } else if (j < AnimationKt.MillisToNanos) {
                if (j < 100000) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
            } else if (j < 10000000) {
                i2 = 7;
            } else {
                i2 = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                if (j < 1000000000) {
                    i2 = 9;
                } else {
                    i2 = 10;
                }
            } else if (j < 100000000000L) {
                i2 = 11;
            } else {
                i2 = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i2 = 13;
            } else if (j < 100000000000000L) {
                i2 = 14;
            } else {
                i2 = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i2 = 16;
            } else {
                i2 = 17;
            }
        } else if (j < 1000000000000000000L) {
            i2 = 18;
        } else {
            i2 = 19;
        }
        if (z) {
            i2++;
        }
        C13168t0 F0 = mo52487F0(i2);
        byte[] bArr = F0.f20967a;
        int i3 = F0.f20969c + i2;
        while (j != 0) {
            long j2 = (long) 10;
            i3--;
            bArr[i3] = C12636f.m28065b()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        F0.f20969c += i2;
        mo52483C0(size() + ((long) i2));
        return this;
    }

    /* renamed from: M */
    public C13133f mo52498M() {
        return mo52534o(size());
    }

    /* renamed from: M0 */
    public C13121c mo52496L(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C13168t0 F0 = mo52487F0(i);
        byte[] bArr = F0.f20967a;
        int i2 = F0.f20969c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = C12636f.m28065b()[(int) (15 & j)];
            j >>>= 4;
        }
        F0.f20969c += i;
        mo52483C0(size() + ((long) i));
        return this;
    }

    /* renamed from: N0 */
    public C13121c writeInt(int i) {
        C13168t0 F0 = mo52487F0(4);
        byte[] bArr = F0.f20967a;
        int i2 = F0.f20969c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        F0.f20969c = i5 + 1;
        mo52483C0(size() + 4);
        return this;
    }

    /* renamed from: O0 */
    public C13121c mo52501O0(long j) {
        C13168t0 F0 = mo52487F0(8);
        byte[] bArr = F0.f20967a;
        int i = F0.f20969c;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i8] = (byte) ((int) (j & 255));
        F0.f20969c = i8 + 1;
        mo52483C0(size() + 8);
        return this;
    }

    /* renamed from: P0 */
    public C13121c writeShort(int i) {
        C13168t0 F0 = mo52487F0(2);
        byte[] bArr = F0.f20967a;
        int i2 = F0.f20969c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        F0.f20969c = i3 + 1;
        mo52483C0(size() + 2);
        return this;
    }

    /* renamed from: Q0 */
    public C13121c mo52503Q0(String str, int i, int i2, Charset charset) {
        boolean z;
        boolean z2;
        C12775o.m28639i(str, TypedValues.Custom.S_STRING);
        C12775o.m28639i(charset, "charset");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > str.length()) {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
                } else if (C12775o.m28634d(charset, C13726d.f22152b)) {
                    return mo52508U0(str, i, i2);
                } else {
                    String substring = str.substring(i, i2);
                    C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    byte[] bytes = substring.getBytes(charset);
                    C12775o.m28638h(bytes, "this as java.lang.String).getBytes(charset)");
                    return write(bytes, 0, bytes.length);
                }
            } else {
                throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
            }
        } else {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
    }

    /* renamed from: R0 */
    public C13121c mo52504R0(String str, Charset charset) {
        C12775o.m28639i(str, TypedValues.Custom.S_STRING);
        C12775o.m28639i(charset, "charset");
        return mo52503Q0(str, 0, str.length(), charset);
    }

    /* renamed from: S0 */
    public final C13121c mo52505S0(OutputStream outputStream, long j) {
        C12775o.m28639i(outputStream, "out");
        C13132e1.m29639b(this.f20889c, 0, j);
        C13168t0 t0Var = this.f20888b;
        while (j > 0) {
            C12775o.m28636f(t0Var);
            int min = (int) Math.min(j, (long) (t0Var.f20969c - t0Var.f20968b));
            outputStream.write(t0Var.f20967a, t0Var.f20968b, min);
            int i = t0Var.f20968b + min;
            t0Var.f20968b = i;
            long j2 = (long) min;
            this.f20889c -= j2;
            j -= j2;
            if (i == t0Var.f20969c) {
                C13168t0 b = t0Var.mo52717b();
                this.f20888b = b;
                C13171u0.m29872b(t0Var);
                t0Var = b;
            }
        }
        return this;
    }

    /* renamed from: T0 */
    public C13121c mo52486F(String str) {
        C12775o.m28639i(str, TypedValues.Custom.S_STRING);
        return mo52508U0(str, 0, str.length());
    }

    /* renamed from: U */
    public String mo52507U() {
        return mo52481B(LocationRequestCompat.PASSIVE_INTERVAL);
    }

    /* renamed from: U0 */
    public C13121c mo52508U0(String str, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        char c;
        boolean z4;
        char charAt;
        C12775o.m28639i(str, TypedValues.Custom.S_STRING);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= str.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            C13168t0 F0 = mo52487F0(1);
                            byte[] bArr = F0.f20967a;
                            int i3 = F0.f20969c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    int i5 = F0.f20969c;
                                    int i6 = (i3 + i) - i5;
                                    F0.f20969c = i5 + i6;
                                    mo52483C0(size() + ((long) i6));
                                } else {
                                    i4 = i + 1;
                                    bArr[i + i3] = (byte) charAt;
                                }
                            }
                            int i52 = F0.f20969c;
                            int i62 = (i3 + i) - i52;
                            F0.f20969c = i52 + i62;
                            mo52483C0(size() + ((long) i62));
                        } else {
                            if (charAt2 < 2048) {
                                C13168t0 F02 = mo52487F0(2);
                                byte[] bArr2 = F02.f20967a;
                                int i7 = F02.f20969c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                F02.f20969c = i7 + 2;
                                mo52483C0(size() + 2);
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                C13168t0 F03 = mo52487F0(3);
                                byte[] bArr3 = F03.f20967a;
                                int i8 = F03.f20969c;
                                bArr3[i8] = (byte) ((charAt2 >> 12) | OAuthErrorCodes.ERR_OAUTH_INVALID_CONSUMER);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                                F03.f20969c = i8 + 3;
                                mo52483C0(size() + 3);
                            } else {
                                int i9 = i + 1;
                                if (i9 < i2) {
                                    c = str.charAt(i9);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 <= 56319) {
                                    if (56320 > c || c >= 57344) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (z4) {
                                        int i10 = (((charAt2 & 1023) << 10) | (c & 1023)) + 0;
                                        C13168t0 F04 = mo52487F0(4);
                                        byte[] bArr4 = F04.f20967a;
                                        int i11 = F04.f20969c;
                                        bArr4[i11] = (byte) ((i10 >> 18) | OAuthErrorCodes.ERR_OAUTH_HEADERS);
                                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                                        F04.f20969c = i11 + 4;
                                        mo52483C0(size() + 4);
                                        i += 2;
                                    }
                                }
                                writeByte(63);
                                i = i9;
                            }
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    /* renamed from: V0 */
    public C13121c mo52509V0(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            C13168t0 F0 = mo52487F0(2);
            byte[] bArr = F0.f20967a;
            int i2 = F0.f20969c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            F0.f20969c = i2 + 2;
            mo52483C0(size() + 2);
        } else {
            boolean z = false;
            if (55296 <= i && i < 57344) {
                z = true;
            }
            if (z) {
                writeByte(63);
            } else if (i < 65536) {
                C13168t0 F02 = mo52487F0(3);
                byte[] bArr2 = F02.f20967a;
                int i3 = F02.f20969c;
                bArr2[i3] = (byte) ((i >> 12) | OAuthErrorCodes.ERR_OAUTH_INVALID_CONSUMER);
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                F02.f20969c = i3 + 3;
                mo52483C0(size() + 3);
            } else if (i <= 1114111) {
                C13168t0 F03 = mo52487F0(4);
                byte[] bArr3 = F03.f20967a;
                int i4 = F03.f20969c;
                bArr3[i4] = (byte) ((i >> 18) | OAuthErrorCodes.ERR_OAUTH_HEADERS);
                bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i4 + 3] = (byte) ((i & 63) | 128);
                F03.f20969c = i4 + 4;
                mo52483C0(size() + 4);
            } else {
                throw new IllegalArgumentException("Unexpected code point: 0x" + C13132e1.m29649l(i));
            }
        }
        return this;
    }

    /* renamed from: W */
    public int mo52510W() {
        return C13132e1.m29645h(readInt());
    }

    /* renamed from: X */
    public final C13121c mo52511X() {
        C13121c cVar = new C13121c();
        if (size() != 0) {
            C13168t0 t0Var = this.f20888b;
            C12775o.m28636f(t0Var);
            C13168t0 d = t0Var.mo52719d();
            cVar.f20888b = d;
            d.f20973g = d;
            d.f20972f = d;
            for (C13168t0 t0Var2 = t0Var.f20972f; t0Var2 != t0Var; t0Var2 = t0Var2.f20972f) {
                C13168t0 t0Var3 = d.f20973g;
                C12775o.m28636f(t0Var3);
                C12775o.m28636f(t0Var2);
                t0Var3.mo52718c(t0Var2.mo52719d());
            }
            cVar.mo52483C0(size());
        }
        return cVar;
    }

    /* renamed from: Y */
    public final C13121c mo52512Y(C13121c cVar, long j, long j2) {
        C12775o.m28639i(cVar, "out");
        C13132e1.m29639b(size(), j, j2);
        if (j2 != 0) {
            cVar.mo52483C0(cVar.size() + j2);
            C13168t0 t0Var = this.f20888b;
            while (true) {
                C12775o.m28636f(t0Var);
                int i = t0Var.f20969c;
                int i2 = t0Var.f20968b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                t0Var = t0Var.f20972f;
            }
            while (j2 > 0) {
                C12775o.m28636f(t0Var);
                C13168t0 d = t0Var.mo52719d();
                int i3 = d.f20968b + ((int) j);
                d.f20968b = i3;
                d.f20969c = Math.min(i3 + ((int) j2), d.f20969c);
                C13168t0 t0Var2 = cVar.f20888b;
                if (t0Var2 == null) {
                    d.f20973g = d;
                    d.f20972f = d;
                    cVar.f20888b = d;
                } else {
                    C12775o.m28636f(t0Var2);
                    C13168t0 t0Var3 = t0Var2.f20973g;
                    C12775o.m28636f(t0Var3);
                    t0Var3.mo52718c(d);
                }
                j2 -= (long) (d.f20969c - d.f20968b);
                t0Var = t0Var.f20972f;
                j = 0;
            }
        }
        return this;
    }

    /* renamed from: Z */
    public byte[] mo52513Z(long j) {
        boolean z;
        if (j < 0 || j > 2147483647L) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (size() >= j) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public final void mo52514a() {
        skip(size());
    }

    /* renamed from: b */
    public C13121c clone() {
        return mo52511X();
    }

    /* renamed from: c */
    public final long mo52518c() {
        long size = size();
        if (size == 0) {
            return 0;
        }
        C13168t0 t0Var = this.f20888b;
        C12775o.m28636f(t0Var);
        C13168t0 t0Var2 = t0Var.f20973g;
        C12775o.m28636f(t0Var2);
        int i = t0Var2.f20969c;
        if (i < 8192 && t0Var2.f20971e) {
            size -= (long) (i - t0Var2.f20968b);
        }
        return size;
    }

    /* renamed from: d0 */
    public short mo52522d0() {
        return C13132e1.m29647j(readShort());
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r0 != r1) goto L_0x0009
            goto L_0x0081
        L_0x0009:
            boolean r3 = r1 instanceof okio.C13121c
            r4 = 0
            if (r3 != 0) goto L_0x0011
        L_0x000e:
            r2 = r4
            goto L_0x0081
        L_0x0011:
            long r5 = r18.size()
            okio.c r1 = (okio.C13121c) r1
            long r7 = r1.size()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0020
            goto L_0x000e
        L_0x0020:
            long r5 = r18.size()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x002b
            goto L_0x0081
        L_0x002b:
            okio.t0 r3 = r0.f20888b
            kotlin.jvm.internal.C12775o.m28636f(r3)
            okio.t0 r1 = r1.f20888b
            kotlin.jvm.internal.C12775o.m28636f(r1)
            int r5 = r3.f20968b
            int r6 = r1.f20968b
            r9 = r7
        L_0x003a:
            long r11 = r18.size()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0081
            int r11 = r3.f20969c
            int r11 = r11 - r5
            int r12 = r1.f20969c
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L_0x004e:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x0069
            byte[] r15 = r3.f20967a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f20967a
            int r17 = r6 + 1
            byte r6 = r15[r6]
            if (r5 == r6) goto L_0x0061
            goto L_0x000e
        L_0x0061:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L_0x004e
        L_0x0069:
            int r13 = r3.f20969c
            if (r5 != r13) goto L_0x0074
            okio.t0 r3 = r3.f20972f
            kotlin.jvm.internal.C12775o.m28636f(r3)
            int r5 = r3.f20968b
        L_0x0074:
            int r13 = r1.f20969c
            if (r6 != r13) goto L_0x007f
            okio.t0 r1 = r1.f20972f
            kotlin.jvm.internal.C12775o.m28636f(r1)
            int r6 = r1.f20968b
        L_0x007f:
            long r9 = r9 + r11
            goto L_0x003a
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C13121c.equals(java.lang.Object):boolean");
    }

    /* renamed from: g0 */
    public long mo52525g0() {
        return C13132e1.m29646i(readLong());
    }

    /* renamed from: h */
    public boolean mo52526h(long j) {
        if (this.f20889c >= j) {
            return true;
        }
        return false;
    }

    /* renamed from: h0 */
    public long mo52527h0(C13175w0 w0Var) {
        C12775o.m28639i(w0Var, "sink");
        long size = size();
        if (size > 0) {
            w0Var.write(this, size);
        }
        return size;
    }

    public int hashCode() {
        C13168t0 t0Var = this.f20888b;
        if (t0Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = t0Var.f20969c;
            for (int i3 = t0Var.f20968b; i3 < i2; i3++) {
                i = (i * 31) + t0Var.f20967a[i3];
            }
            t0Var = t0Var.f20972f;
            C12775o.m28636f(t0Var);
        } while (t0Var != this.f20888b);
        return i;
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j0 */
    public final byte mo52530j0(long j) {
        C13132e1.m29639b(size(), j, 1);
        C13168t0 t0Var = this.f20888b;
        if (t0Var == null) {
            C12775o.m28636f((Object) null);
            throw null;
        } else if (size() - j < j) {
            long size = size();
            while (size > j) {
                t0Var = t0Var.f20973g;
                C12775o.m28636f(t0Var);
                size -= (long) (t0Var.f20969c - t0Var.f20968b);
            }
            C12775o.m28636f(t0Var);
            return t0Var.f20967a[(int) ((((long) t0Var.f20968b) + j) - size)];
        } else {
            long j2 = 0;
            while (true) {
                long j3 = ((long) (t0Var.f20969c - t0Var.f20968b)) + j2;
                if (j3 <= j) {
                    t0Var = t0Var.f20972f;
                    C12775o.m28636f(t0Var);
                    j2 = j3;
                } else {
                    C12775o.m28636f(t0Var);
                    return t0Var.f20967a[(int) ((((long) t0Var.f20968b) + j) - j2)];
                }
            }
        }
    }

    /* renamed from: k0 */
    public long mo52531k0(byte b, long j, long j2) {
        C13168t0 t0Var;
        int i;
        long j3;
        long j4 = 0;
        boolean z = false;
        if (0 <= j && j <= j2) {
            z = true;
        }
        if (z) {
            if (j2 > size()) {
                j2 = size();
            }
            if (j == j2 || (t0Var = this.f20888b) == null) {
                return -1;
            }
            if (size() - j < j) {
                j3 = size();
                while (j3 > j) {
                    t0Var = t0Var.f20973g;
                    C12775o.m28636f(t0Var);
                    j3 -= (long) (t0Var.f20969c - t0Var.f20968b);
                }
                while (j3 < j2) {
                    byte[] bArr = t0Var.f20967a;
                    int min = (int) Math.min((long) t0Var.f20969c, (((long) t0Var.f20968b) + j2) - j3);
                    i = (int) ((((long) t0Var.f20968b) + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b) {
                            i++;
                        }
                    }
                    j3 += (long) (t0Var.f20969c - t0Var.f20968b);
                    t0Var = t0Var.f20972f;
                    C12775o.m28636f(t0Var);
                    j = j3;
                }
                return -1;
            }
            while (true) {
                long j5 = ((long) (t0Var.f20969c - t0Var.f20968b)) + j4;
                if (j5 > j) {
                    break;
                }
                t0Var = t0Var.f20972f;
                C12775o.m28636f(t0Var);
                j4 = j5;
            }
            while (j3 < j2) {
                byte[] bArr2 = t0Var.f20967a;
                int min2 = (int) Math.min((long) t0Var.f20969c, (((long) t0Var.f20968b) + j2) - j3);
                int i2 = (int) ((((long) t0Var.f20968b) + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b) {
                        i2 = i + 1;
                    }
                }
                j4 = j3 + ((long) (t0Var.f20969c - t0Var.f20968b));
                t0Var = t0Var.f20972f;
                C12775o.m28636f(t0Var);
                j = j4;
            }
            return -1;
            return ((long) (i - t0Var.f20968b)) + j3;
        }
        throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    /* renamed from: l */
    public String mo52532l(long j) {
        return mo52480A0(j, C13726d.f22152b);
    }

    /* renamed from: m0 */
    public void mo52533m0(long j) {
        if (this.f20889c < j) {
            throw new EOFException();
        }
    }

    /* renamed from: o */
    public C13133f mo52534o(long j) {
        boolean z;
        if (j < 0 || j > 2147483647L) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (size() < j) {
            throw new EOFException();
        } else if (j < 4096) {
            return new C13133f(mo52513Z(j));
        } else {
            C13133f E0 = mo52485E0((int) j);
            skip(j);
            return E0;
        }
    }

    /* renamed from: p0 */
    public long mo52537p0(C13133f fVar) {
        C12775o.m28639i(fVar, "bytes");
        return mo52553t0(fVar, 0);
    }

    public C13130e peek() {
        return C13145j0.m29739d(new C13161q0(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        if (r8 != r9) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0098, code lost:
        r14.f20888b = r6.mo52717b();
        okio.C13171u0.m29872b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a2, code lost:
        r6.f20968b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (r1 != false) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007b A[SYNTHETIC] */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo52539q0() {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00b4
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000d:
            okio.t0 r6 = r14.f20888b
            kotlin.jvm.internal.C12775o.m28636f(r6)
            byte[] r7 = r6.f20967a
            int r8 = r6.f20968b
            int r9 = r6.f20969c
        L_0x0018:
            if (r8 >= r9) goto L_0x0096
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0027
            r11 = 57
            if (r10 > r11) goto L_0x0027
            int r11 = r10 + -48
            goto L_0x003f
        L_0x0027:
            r11 = 97
            if (r10 < r11) goto L_0x0034
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x0034
            int r11 = r10 + -97
        L_0x0031:
            int r11 = r11 + 10
            goto L_0x003f
        L_0x0034:
            r11 = 65
            if (r10 < r11) goto L_0x0077
            r11 = 70
            if (r10 > r11) goto L_0x0077
            int r11 = r10 + -65
            goto L_0x0031
        L_0x003f:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x004f
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0018
        L_0x004f:
            okio.c r0 = new okio.c
            r0.<init>()
            okio.c r0 = r0.mo52496L(r4)
            okio.c r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo52482B0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0077:
            if (r0 == 0) goto L_0x007b
            r1 = 1
            goto L_0x0096
        L_0x007b:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = okio.C13132e1.m29648k(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0096:
            if (r8 != r9) goto L_0x00a2
            okio.t0 r7 = r6.mo52717b()
            r14.f20888b = r7
            okio.C13171u0.m29872b(r6)
            goto L_0x00a4
        L_0x00a2:
            r6.f20968b = r8
        L_0x00a4:
            if (r1 != 0) goto L_0x00aa
            okio.t0 r6 = r14.f20888b
            if (r6 != 0) goto L_0x000d
        L_0x00aa:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.mo52483C0(r1)
            return r4
        L_0x00b4:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C13121c.mo52539q0():long");
    }

    /* renamed from: r0 */
    public InputStream mo52540r0() {
        return new C13123b(this);
    }

    public int read(ByteBuffer byteBuffer) {
        C12775o.m28639i(byteBuffer, "sink");
        C13168t0 t0Var = this.f20888b;
        if (t0Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), t0Var.f20969c - t0Var.f20968b);
        byteBuffer.put(t0Var.f20967a, t0Var.f20968b, min);
        int i = t0Var.f20968b + min;
        t0Var.f20968b = i;
        this.f20889c -= (long) min;
        if (i == t0Var.f20969c) {
            this.f20888b = t0Var.mo52717b();
            C13171u0.m29872b(t0Var);
        }
        return min;
    }

    public byte readByte() {
        if (size() != 0) {
            C13168t0 t0Var = this.f20888b;
            C12775o.m28636f(t0Var);
            int i = t0Var.f20968b;
            int i2 = t0Var.f20969c;
            int i3 = i + 1;
            byte b = t0Var.f20967a[i];
            mo52483C0(size() - 1);
            if (i3 == i2) {
                this.f20888b = t0Var.mo52717b();
                C13171u0.m29872b(t0Var);
            } else {
                t0Var.f20968b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public void readFully(byte[] bArr) {
        C12775o.m28639i(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        if (size() >= 4) {
            C13168t0 t0Var = this.f20888b;
            C12775o.m28636f(t0Var);
            int i = t0Var.f20968b;
            int i2 = t0Var.f20969c;
            if (((long) (i2 - i)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = t0Var.f20967a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            mo52483C0(size() - 4);
            if (i6 == i2) {
                this.f20888b = t0Var.mo52717b();
                C13171u0.m29872b(t0Var);
            } else {
                t0Var.f20968b = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    public long readLong() {
        if (size() >= 8) {
            C13168t0 t0Var = this.f20888b;
            C12775o.m28636f(t0Var);
            int i = t0Var.f20968b;
            int i2 = t0Var.f20969c;
            if (((long) (i2 - i)) < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = t0Var.f20967a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j2 = j | ((((long) bArr[i8]) & 255) << 8) | (((long) bArr[i9]) & 255);
            mo52483C0(size() - 8);
            if (i10 == i2) {
                this.f20888b = t0Var.mo52717b();
                C13171u0.m29872b(t0Var);
            } else {
                t0Var.f20968b = i10;
            }
            return j2;
        }
        throw new EOFException();
    }

    public short readShort() {
        if (size() >= 2) {
            C13168t0 t0Var = this.f20888b;
            C12775o.m28636f(t0Var);
            int i = t0Var.f20968b;
            int i2 = t0Var.f20969c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = t0Var.f20967a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            mo52483C0(size() - 2);
            if (i4 == i2) {
                this.f20888b = t0Var.mo52717b();
                C13171u0.m29872b(t0Var);
            } else {
                t0Var.f20968b = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    /* renamed from: s */
    public byte[] mo52548s() {
        return mo52513Z(size());
    }

    /* renamed from: s0 */
    public int mo52549s0(C13151m0 m0Var) {
        C12775o.m28639i(m0Var, "options");
        int f = C12636f.m28069f(this, m0Var, false, 2, (Object) null);
        if (f == -1) {
            return -1;
        }
        skip((long) m0Var.mo52662k()[f].mo52590H());
        return f;
    }

    public final long size() {
        return this.f20889c;
    }

    public void skip(long j) {
        while (j > 0) {
            C13168t0 t0Var = this.f20888b;
            if (t0Var != null) {
                int min = (int) Math.min(j, (long) (t0Var.f20969c - t0Var.f20968b));
                long j2 = (long) min;
                mo52483C0(size() - j2);
                j -= j2;
                int i = t0Var.f20968b + min;
                t0Var.f20968b = i;
                if (i == t0Var.f20969c) {
                    this.f20888b = t0Var.mo52717b();
                    C13171u0.m29872b(t0Var);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: t */
    public boolean mo52552t() {
        if (this.f20889c == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t0 */
    public long mo52553t0(C13133f fVar, long j) {
        boolean z;
        boolean z2;
        long j2 = j;
        C12775o.m28639i(fVar, "bytes");
        if (fVar.mo52590H() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j3 = 0;
            if (j2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C13168t0 t0Var = this.f20888b;
                if (t0Var != null) {
                    if (size() - j2 < j2) {
                        long size = size();
                        while (size > j2) {
                            t0Var = t0Var.f20973g;
                            C12775o.m28636f(t0Var);
                            size -= (long) (t0Var.f20969c - t0Var.f20968b);
                        }
                        byte[] p = fVar.mo52612p();
                        byte b = p[0];
                        int H = fVar.mo52590H();
                        long size2 = (size() - ((long) H)) + 1;
                        while (size < size2) {
                            byte[] bArr = t0Var.f20967a;
                            long j4 = size;
                            int min = (int) Math.min((long) t0Var.f20969c, (((long) t0Var.f20968b) + size2) - size);
                            long j5 = ((long) t0Var.f20968b) + j2;
                            long j6 = j4;
                            for (int i = (int) (j5 - j6); i < min; i++) {
                                if (bArr[i] == b && C12636f.m28066c(t0Var, i + 1, p, 1, H)) {
                                    return ((long) (i - t0Var.f20968b)) + j6;
                                }
                            }
                            size = j6 + ((long) (t0Var.f20969c - t0Var.f20968b));
                            t0Var = t0Var.f20972f;
                            C12775o.m28636f(t0Var);
                            j2 = size;
                        }
                    } else {
                        while (true) {
                            long j7 = ((long) (t0Var.f20969c - t0Var.f20968b)) + j3;
                            if (j7 > j2) {
                                break;
                            }
                            t0Var = t0Var.f20972f;
                            C12775o.m28636f(t0Var);
                            j3 = j7;
                        }
                        byte[] p2 = fVar.mo52612p();
                        byte b2 = p2[0];
                        int H2 = fVar.mo52590H();
                        long size3 = (size() - ((long) H2)) + 1;
                        while (j3 < size3) {
                            byte[] bArr2 = t0Var.f20967a;
                            long j8 = size3;
                            int min2 = (int) Math.min((long) t0Var.f20969c, (((long) t0Var.f20968b) + size3) - j3);
                            for (int i2 = (int) ((((long) t0Var.f20968b) + j2) - j3); i2 < min2; i2++) {
                                if (bArr2[i2] == b2) {
                                    if (C12636f.m28066c(t0Var, i2 + 1, p2, 1, H2)) {
                                        return ((long) (i2 - t0Var.f20968b)) + j3;
                                    }
                                }
                            }
                            j3 += (long) (t0Var.f20969c - t0Var.f20968b);
                            t0Var = t0Var.f20972f;
                            C12775o.m28636f(t0Var);
                            j2 = j3;
                            size3 = j8;
                        }
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public C13181z0 timeout() {
        return C13181z0.NONE;
    }

    public String toString() {
        return mo52484D0().toString();
    }

    /* renamed from: u0 */
    public long mo52555u0(C13133f fVar) {
        C12775o.m28639i(fVar, "targetBytes");
        return mo52556v0(fVar, 0);
    }

    /* renamed from: v0 */
    public long mo52556v0(C13133f fVar, long j) {
        boolean z;
        int i;
        long j2;
        int i2;
        int i3;
        C12775o.m28639i(fVar, "targetBytes");
        long j3 = 0;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C13168t0 t0Var = this.f20888b;
            if (t0Var == null) {
                return -1;
            }
            if (size() - j < j) {
                j2 = size();
                while (j2 > j) {
                    t0Var = t0Var.f20973g;
                    C12775o.m28636f(t0Var);
                    j2 -= (long) (t0Var.f20969c - t0Var.f20968b);
                }
                if (fVar.mo52590H() == 2) {
                    byte g = fVar.mo52603g(0);
                    byte g2 = fVar.mo52603g(1);
                    while (j2 < size()) {
                        byte[] bArr = t0Var.f20967a;
                        i = (int) ((((long) t0Var.f20968b) + j) - j2);
                        int i4 = t0Var.f20969c;
                        while (i < i4) {
                            byte b = bArr[i];
                            if (!(b == g || b == g2)) {
                                i++;
                            }
                        }
                        j2 += (long) (t0Var.f20969c - t0Var.f20968b);
                        t0Var = t0Var.f20972f;
                        C12775o.m28636f(t0Var);
                        j = j2;
                    }
                    return -1;
                }
                byte[] p = fVar.mo52612p();
                while (j2 < size()) {
                    byte[] bArr2 = t0Var.f20967a;
                    i3 = (int) ((((long) t0Var.f20968b) + j) - j2);
                    int i5 = t0Var.f20969c;
                    while (i3 < i5) {
                        byte b2 = bArr2[i3];
                        for (byte b3 : p) {
                            if (b2 == b3) {
                                i2 = t0Var.f20968b;
                                return ((long) (i - i2)) + j2;
                            }
                        }
                        i3++;
                    }
                    j2 += (long) (t0Var.f20969c - t0Var.f20968b);
                    t0Var = t0Var.f20972f;
                    C12775o.m28636f(t0Var);
                    j = j2;
                }
                return -1;
            }
            while (true) {
                long j4 = ((long) (t0Var.f20969c - t0Var.f20968b)) + j3;
                if (j4 > j) {
                    break;
                }
                t0Var = t0Var.f20972f;
                C12775o.m28636f(t0Var);
                j3 = j4;
            }
            if (fVar.mo52590H() == 2) {
                byte g3 = fVar.mo52603g(0);
                byte g4 = fVar.mo52603g(1);
                while (j2 < size()) {
                    byte[] bArr3 = t0Var.f20967a;
                    int i6 = (int) ((((long) t0Var.f20968b) + j) - j2);
                    int i7 = t0Var.f20969c;
                    while (i < i7) {
                        byte b4 = bArr3[i];
                        if (!(b4 == g3 || b4 == g4)) {
                            i6 = i + 1;
                        }
                    }
                    j3 = j2 + ((long) (t0Var.f20969c - t0Var.f20968b));
                    t0Var = t0Var.f20972f;
                    C12775o.m28636f(t0Var);
                    j = j3;
                }
                return -1;
            }
            byte[] p2 = fVar.mo52612p();
            while (j2 < size()) {
                byte[] bArr4 = t0Var.f20967a;
                int i8 = (int) ((((long) t0Var.f20968b) + j) - j2);
                int i9 = t0Var.f20969c;
                while (i3 < i9) {
                    byte b5 = bArr4[i3];
                    for (byte b6 : p2) {
                        if (b5 == b6) {
                            i2 = t0Var.f20968b;
                            return ((long) (i - i2)) + j2;
                        }
                    }
                    i8 = i3 + 1;
                }
                j3 = j2 + ((long) (t0Var.f20969c - t0Var.f20968b));
                t0Var = t0Var.f20972f;
                C12775o.m28636f(t0Var);
                j = j3;
            }
            return -1;
            i2 = t0Var.f20968b;
            return ((long) (i - i2)) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
    }

    /* renamed from: w0 */
    public OutputStream mo52557w0() {
        return new C13124c(this);
    }

    /* renamed from: x */
    public void mo52564x(C13121c cVar, long j) {
        C12775o.m28639i(cVar, "sink");
        if (size() >= j) {
            cVar.write(this, j);
        } else {
            cVar.write(this, size());
            throw new EOFException();
        }
    }

    /* renamed from: x0 */
    public boolean mo52565x0(long j, C13133f fVar, int i, int i2) {
        C12775o.m28639i(fVar, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || size() - j < ((long) i2) || fVar.mo52590H() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (mo52530j0(((long) i3) + j) != fVar.mo52603g(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: y0 */
    public final C13122a mo52567y0(C13122a aVar) {
        C12775o.m28639i(aVar, "unsafeCursor");
        return C12636f.m28064a(this, aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a4, code lost:
        if (r2 == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a6, code lost:
        r14 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        r14 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        if (r1 >= r14) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
        if (size() == 0) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b5, code lost:
        if (r2 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b7, code lost:
        r1 = "Expected a digit";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ba, code lost:
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00df, code lost:
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + okio.C13132e1.m29648k(mo52530j0(0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e5, code lost:
        throw new java.io.EOFException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e6, code lost:
        if (r2 == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return -r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return r8;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo52568z() {
        /*
            r18 = this;
            r0 = r18
            long r1 = r18.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00eb
            r1 = 0
            r5 = -7
            r2 = r1
            r8 = r3
            r6 = r5
            r5 = r2
        L_0x0013:
            okio.t0 r10 = r0.f20888b
            kotlin.jvm.internal.C12775o.m28636f(r10)
            byte[] r11 = r10.f20967a
            int r12 = r10.f20968b
            int r13 = r10.f20969c
        L_0x001e:
            if (r12 >= r13) goto L_0x0082
            byte r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L_0x0070
            r14 = 57
            if (r15 > r14) goto L_0x0070
            int r14 = 48 - r15
            r16 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r16 < 0) goto L_0x0043
            if (r16 != 0) goto L_0x003d
            long r3 = (long) r14
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            r3 = 10
            long r8 = r8 * r3
            long r3 = (long) r14
            long r8 = r8 + r3
            goto L_0x007a
        L_0x0043:
            okio.c r1 = new okio.c
            r1.<init>()
            okio.c r1 = r1.mo52535o0(r8)
            okio.c r1 = r1.writeByte(r15)
            if (r2 != 0) goto L_0x0055
            r1.readByte()
        L_0x0055:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.mo52482B0()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0070:
            r3 = 45
            if (r15 != r3) goto L_0x0081
            if (r1 != 0) goto L_0x0081
            r2 = 1
            long r6 = r6 - r2
            r2 = 1
        L_0x007a:
            int r12 = r12 + 1
            int r1 = r1 + 1
            r3 = 0
            goto L_0x001e
        L_0x0081:
            r5 = 1
        L_0x0082:
            if (r12 != r13) goto L_0x008e
            okio.t0 r3 = r10.mo52717b()
            r0.f20888b = r3
            okio.C13171u0.m29872b(r10)
            goto L_0x0090
        L_0x008e:
            r10.f20968b = r12
        L_0x0090:
            if (r5 != 0) goto L_0x009b
            okio.t0 r3 = r0.f20888b
            if (r3 != 0) goto L_0x0097
            goto L_0x009b
        L_0x0097:
            r3 = 0
            goto L_0x0013
        L_0x009b:
            long r3 = r18.size()
            long r5 = (long) r1
            long r3 = r3 - r5
            r0.mo52483C0(r3)
            if (r2 == 0) goto L_0x00a8
            r14 = 2
            goto L_0x00a9
        L_0x00a8:
            r14 = 1
        L_0x00a9:
            if (r1 >= r14) goto L_0x00e6
            long r3 = r18.size()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00e0
            if (r2 == 0) goto L_0x00ba
            java.lang.String r1 = "Expected a digit"
            goto L_0x00bc
        L_0x00ba:
            java.lang.String r1 = "Expected a digit or '-'"
        L_0x00bc:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " but was 0x"
            r3.append(r1)
            r4 = 0
            byte r1 = r0.mo52530j0(r4)
            java.lang.String r1 = okio.C13132e1.m29648k(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x00e0:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L_0x00e6:
            if (r2 == 0) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            long r8 = -r8
        L_0x00ea:
            return r8
        L_0x00eb:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C13121c.mo52568z():long");
    }

    @SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n+ 2 -Util.kt\nokio/_UtilKt\n*L\n1#1,631:1\n72#2:632\n84#2:633\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n*L\n126#1:632\n136#1:633\n*E\n"})
    /* renamed from: okio.c$b */
    /* compiled from: Buffer.kt */
    public static final class C13123b extends InputStream {

        /* renamed from: b */
        final /* synthetic */ C13121c f20897b;

        C13123b(C13121c cVar) {
            this.f20897b = cVar;
        }

        public int available() {
            return (int) Math.min(this.f20897b.size(), (long) Integer.MAX_VALUE);
        }

        public int read() {
            if (this.f20897b.size() > 0) {
                return this.f20897b.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return this.f20897b + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            C12775o.m28639i(bArr, "sink");
            return this.f20897b.read(bArr, i, i2);
        }

        public void close() {
        }
    }

    public int write(ByteBuffer byteBuffer) {
        C12775o.m28639i(byteBuffer, APIParams.SOURCE);
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C13168t0 F0 = mo52487F0(1);
            int min = Math.min(i, 8192 - F0.f20969c);
            byteBuffer.get(F0.f20967a, F0.f20969c, min);
            i -= min;
            F0.f20969c += min;
        }
        this.f20889c += (long) remaining;
        return remaining;
    }

    public int read(byte[] bArr, int i, int i2) {
        C12775o.m28639i(bArr, "sink");
        C13132e1.m29639b((long) bArr.length, (long) i, (long) i2);
        C13168t0 t0Var = this.f20888b;
        if (t0Var == null) {
            return -1;
        }
        int min = Math.min(i2, t0Var.f20969c - t0Var.f20968b);
        byte[] bArr2 = t0Var.f20967a;
        int i3 = t0Var.f20968b;
        byte[] unused = C12708o.m28337d(bArr2, bArr, i, i3, i3 + min);
        t0Var.f20968b += min;
        mo52483C0(size() - ((long) min));
        if (t0Var.f20968b == t0Var.f20969c) {
            this.f20888b = t0Var.mo52717b();
            C13171u0.m29872b(t0Var);
        }
        return min;
    }

    public void write(C13121c cVar, long j) {
        C13168t0 t0Var;
        C12775o.m28639i(cVar, APIParams.SOURCE);
        if (cVar != this) {
            C13132e1.m29639b(cVar.size(), 0, j);
            while (j > 0) {
                C13168t0 t0Var2 = cVar.f20888b;
                C12775o.m28636f(t0Var2);
                int i = t0Var2.f20969c;
                C13168t0 t0Var3 = cVar.f20888b;
                C12775o.m28636f(t0Var3);
                if (j < ((long) (i - t0Var3.f20968b))) {
                    C13168t0 t0Var4 = this.f20888b;
                    if (t0Var4 != null) {
                        C12775o.m28636f(t0Var4);
                        t0Var = t0Var4.f20973g;
                    } else {
                        t0Var = null;
                    }
                    if (t0Var != null && t0Var.f20971e) {
                        if ((((long) t0Var.f20969c) + j) - ((long) (t0Var.f20970d ? 0 : t0Var.f20968b)) <= 8192) {
                            C13168t0 t0Var5 = cVar.f20888b;
                            C12775o.m28636f(t0Var5);
                            t0Var5.mo52722g(t0Var, (int) j);
                            cVar.mo52483C0(cVar.size() - j);
                            mo52483C0(size() + j);
                            return;
                        }
                    }
                    C13168t0 t0Var6 = cVar.f20888b;
                    C12775o.m28636f(t0Var6);
                    cVar.f20888b = t0Var6.mo52720e((int) j);
                }
                C13168t0 t0Var7 = cVar.f20888b;
                C12775o.m28636f(t0Var7);
                long j2 = (long) (t0Var7.f20969c - t0Var7.f20968b);
                cVar.f20888b = t0Var7.mo52717b();
                C13168t0 t0Var8 = this.f20888b;
                if (t0Var8 == null) {
                    this.f20888b = t0Var7;
                    t0Var7.f20973g = t0Var7;
                    t0Var7.f20972f = t0Var7;
                } else {
                    C12775o.m28636f(t0Var8);
                    C13168t0 t0Var9 = t0Var8.f20973g;
                    C12775o.m28636f(t0Var9);
                    t0Var9.mo52718c(t0Var7).mo52716a();
                }
                cVar.mo52483C0(cVar.size() - j2);
                mo52483C0(size() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public long read(C13121c cVar, long j) {
        C12775o.m28639i(cVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (size() == 0) {
            return -1;
        } else {
            if (j > size()) {
                j = size();
            }
            cVar.write(this, j);
            return j;
        }
    }

    /* renamed from: a0 */
    public C13121c mo52536p() {
        return this;
    }

    /* renamed from: c0 */
    public C13121c mo52566y() {
        return this;
    }

    public void close() {
    }

    /* renamed from: d */
    public C13121c mo52521d() {
        return this;
    }

    /* renamed from: f */
    public C13121c mo52524f() {
        return this;
    }

    public void flush() {
    }
}
