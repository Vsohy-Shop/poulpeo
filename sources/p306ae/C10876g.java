package p306ae;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.C13121c;
import okio.C13127d;
import okio.C13130e;
import okio.C13133f;
import okio.C13179y0;
import okio.C13181z0;
import p306ae.C10868b;
import p306ae.C10873f;

/* renamed from: ae.g */
/* compiled from: Http2 */
public final class C10876g implements C10884j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Logger f16718a = Logger.getLogger(C10878b.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C13133f f16719b = C13133f.m29652e("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: ae.g$b */
    /* compiled from: Http2 */
    static final class C10878b {

        /* renamed from: a */
        private static final String[] f16726a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b */
        private static final String[] f16727b = new String[64];

        /* renamed from: c */
        private static final String[] f16728c = new String[256];

        static {
            int i = 0;
            int i2 = 0;
            while (true) {
                String[] strArr = f16728c;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = String.format("%8s", new Object[]{Integer.toBinaryString(i2)}).replace(' ', '0');
                i2++;
            }
            String[] strArr2 = f16727b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            strArr2[1 | 8] = strArr2[1] + "|PADDED";
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = iArr2[i3];
                int i5 = iArr[0];
                String[] strArr3 = f16727b;
                int i6 = i5 | i4;
                strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
                strArr3[i6 | 8] = strArr3[i5] + '|' + strArr3[i4] + "|PADDED";
            }
            while (true) {
                String[] strArr4 = f16727b;
                if (i < strArr4.length) {
                    if (strArr4[i] == null) {
                        strArr4[i] = f16728c[i];
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        C10878b() {
        }

        /* renamed from: a */
        static String m23217a(byte b, byte b2) {
            String str;
            if (b2 == 0) {
                return "";
            }
            if (!(b == 2 || b == 3)) {
                if (b == 4 || b == 6) {
                    if (b2 == 1) {
                        return "ACK";
                    }
                    return f16728c[b2];
                } else if (!(b == 7 || b == 8)) {
                    String[] strArr = f16727b;
                    if (b2 < strArr.length) {
                        str = strArr[b2];
                    } else {
                        str = f16728c[b2];
                    }
                    if (b == 5 && (b2 & 4) != 0) {
                        return str.replace("HEADERS", "PUSH_PROMISE");
                    }
                    if (b != 0 || (b2 & 32) == 0) {
                        return str;
                    }
                    return str.replace("PRIORITY", "COMPRESSED");
                }
            }
            return f16728c[b2];
        }

        /* renamed from: b */
        static String m23218b(boolean z, int i, int i2, byte b, byte b2) {
            String str;
            String str2;
            String[] strArr = f16726a;
            if (b < strArr.length) {
                str = strArr[b];
            } else {
                str = String.format("0x%02x", new Object[]{Byte.valueOf(b)});
            }
            String a = m23217a(b, b2);
            Object[] objArr = new Object[5];
            if (z) {
                str2 = "<<";
            } else {
                str2 = ">>";
            }
            objArr[0] = str2;
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = str;
            objArr[4] = a;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* renamed from: ae.g$c */
    /* compiled from: Http2 */
    static final class C10879c implements C10868b {

        /* renamed from: b */
        private final C13130e f16729b;

        /* renamed from: c */
        private final C10877a f16730c;

        /* renamed from: d */
        private final boolean f16731d;

        /* renamed from: e */
        final C10873f.C10874a f16732e;

        C10879c(C13130e eVar, int i, boolean z) {
            this.f16729b = eVar;
            this.f16731d = z;
            C10877a aVar = new C10877a(eVar);
            this.f16730c = aVar;
            this.f16732e = new C10873f.C10874a(i, aVar);
        }

        /* renamed from: A */
        private void m23219A(C10868b.C10869a aVar, int i, byte b, int i2) {
            boolean z = false;
            if (i != 8) {
                throw C10876g.m23212i("TYPE_PING length != 8: %s", Integer.valueOf(i));
            } else if (i2 == 0) {
                int readInt = this.f16729b.readInt();
                int readInt2 = this.f16729b.readInt();
                if ((b & 1) != 0) {
                    z = true;
                }
                aVar.ping(z, readInt, readInt2);
            } else {
                throw C10876g.m23212i("TYPE_PING streamId != 0", new Object[0]);
            }
        }

        /* renamed from: G */
        private void m23220G(C10868b.C10869a aVar, int i) {
            boolean z;
            int readInt = this.f16729b.readInt();
            if ((Integer.MIN_VALUE & readInt) != 0) {
                z = true;
            } else {
                z = false;
            }
            aVar.priority(i, readInt & Integer.MAX_VALUE, (this.f16729b.readByte() & 255) + 1, z);
        }

        /* renamed from: O */
        private void m23221O(C10868b.C10869a aVar, int i, byte b, int i2) {
            if (i != 5) {
                throw C10876g.m23212i("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            } else if (i2 != 0) {
                m23220G(aVar, i2);
            } else {
                throw C10876g.m23212i("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
        }

        /* renamed from: Q */
        private void m23222Q(C10868b.C10869a aVar, int i, byte b, int i2) {
            short s = 0;
            if (i2 != 0) {
                if ((b & 8) != 0) {
                    s = (short) (this.f16729b.readByte() & 255);
                }
                aVar.pushPromise(i2, this.f16729b.readInt() & Integer.MAX_VALUE, m23228c(C10876g.m23213j(i - 4, b, s), s, b, i2));
                return;
            }
            throw C10876g.m23212i("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }

        /* renamed from: R */
        private void m23223R(C10868b.C10869a aVar, int i, byte b, int i2) {
            if (i != 4) {
                throw C10876g.m23212i("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            } else if (i2 != 0) {
                int readInt = this.f16729b.readInt();
                C10867a a = C10867a.m23164a(readInt);
                if (a != null) {
                    aVar.mo45826i(i2, a);
                } else {
                    throw C10876g.m23212i("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
                }
            } else {
                throw C10876g.m23212i("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
        }

        /* renamed from: V */
        private void m23224V(C10868b.C10869a aVar, int i, byte b, int i2) {
            if (i2 != 0) {
                throw C10876g.m23212i("TYPE_SETTINGS streamId != 0", new Object[0]);
            } else if ((b & 1) != 0) {
                if (i == 0) {
                    aVar.ackSettings();
                    return;
                }
                throw C10876g.m23212i("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            } else if (i % 6 == 0) {
                C10883i iVar = new C10883i();
                for (int i3 = 0; i3 < i; i3 += 6) {
                    short readShort = this.f16729b.readShort();
                    int readInt = this.f16729b.readInt();
                    switch (readShort) {
                        case 1:
                        case 6:
                            break;
                        case 2:
                            if (!(readInt == 0 || readInt == 1)) {
                                throw C10876g.m23212i("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            }
                        case 3:
                            readShort = 4;
                            break;
                        case 4:
                            if (readInt >= 0) {
                                readShort = 7;
                                break;
                            } else {
                                throw C10876g.m23212i("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            }
                        case 5:
                            if (readInt < 16384 || readInt > 16777215) {
                                throw C10876g.m23212i("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                            }
                    }
                    iVar.mo45872e(readShort, 0, readInt);
                }
                aVar.mo45828k(false, iVar);
                if (iVar.mo45869b() >= 0) {
                    this.f16732e.mo45849g(iVar.mo45869b());
                }
            } else {
                throw C10876g.m23212i("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            }
        }

        /* renamed from: X */
        private void m23225X(C10868b.C10869a aVar, int i, byte b, int i2) {
            if (i == 4) {
                long readInt = ((long) this.f16729b.readInt()) & 2147483647L;
                if (readInt != 0) {
                    aVar.windowUpdate(i2, readInt);
                    return;
                }
                throw C10876g.m23212i("windowSizeIncrement was 0", new Object[0]);
            }
            throw C10876g.m23212i("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }

        /* renamed from: a */
        private void m23226a(C10868b.C10869a aVar, int i, byte b, int i2) {
            boolean z;
            short s = 0;
            boolean z2 = true;
            if ((b & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((b & 32) == 0) {
                z2 = false;
            }
            if (!z2) {
                if ((b & 8) != 0) {
                    s = (short) (this.f16729b.readByte() & 255);
                }
                aVar.data(z, i2, this.f16729b, C10876g.m23213j(i, b, s));
                this.f16729b.skip((long) s);
                return;
            }
            throw C10876g.m23212i("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }

        /* renamed from: b */
        private void m23227b(C10868b.C10869a aVar, int i, byte b, int i2) {
            if (i < 8) {
                throw C10876g.m23212i("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            } else if (i2 == 0) {
                int readInt = this.f16729b.readInt();
                int readInt2 = this.f16729b.readInt();
                int i3 = i - 8;
                C10867a a = C10867a.m23164a(readInt2);
                if (a != null) {
                    C13133f fVar = C13133f.f20904f;
                    if (i3 > 0) {
                        fVar = this.f16729b.mo52534o((long) i3);
                    }
                    aVar.mo45829l(readInt, a, fVar);
                    return;
                }
                throw C10876g.m23212i("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            } else {
                throw C10876g.m23212i("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
        }

        /* renamed from: c */
        private List<C10871d> m23228c(int i, short s, byte b, int i2) {
            C10877a aVar = this.f16730c;
            aVar.f16724f = i;
            aVar.f16721c = i;
            aVar.f16725g = s;
            aVar.f16722d = b;
            aVar.f16723e = i2;
            this.f16732e.mo45851l();
            return this.f16732e.mo45848e();
        }

        /* renamed from: k */
        private void m23229k(C10868b.C10869a aVar, int i, byte b, int i2) {
            boolean z;
            short s = 0;
            if (i2 != 0) {
                if ((b & 1) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((b & 8) != 0) {
                    s = (short) (this.f16729b.readByte() & 255);
                }
                if ((b & 32) != 0) {
                    m23220G(aVar, i2);
                    i -= 5;
                }
                aVar.mo45827j(false, z, i2, -1, m23228c(C10876g.m23213j(i, b, s), s, b, i2), C10872e.HTTP_20_HEADERS);
                return;
            }
            throw C10876g.m23212i("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }

        /* renamed from: T */
        public boolean mo45823T(C10868b.C10869a aVar) {
            try {
                this.f16729b.mo52533m0(9);
                int d = C10876g.m23214k(this.f16729b);
                if (d < 0 || d > 16384) {
                    throw C10876g.m23212i("FRAME_SIZE_ERROR: %s", Integer.valueOf(d));
                }
                byte readByte = (byte) (this.f16729b.readByte() & 255);
                byte readByte2 = (byte) (this.f16729b.readByte() & 255);
                int readInt = this.f16729b.readInt() & Integer.MAX_VALUE;
                if (C10876g.f16718a.isLoggable(Level.FINE)) {
                    C10876g.f16718a.fine(C10878b.m23218b(true, readInt, d, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m23226a(aVar, d, readByte2, readInt);
                        break;
                    case 1:
                        m23229k(aVar, d, readByte2, readInt);
                        break;
                    case 2:
                        m23221O(aVar, d, readByte2, readInt);
                        break;
                    case 3:
                        m23223R(aVar, d, readByte2, readInt);
                        break;
                    case 4:
                        m23224V(aVar, d, readByte2, readInt);
                        break;
                    case 5:
                        m23222Q(aVar, d, readByte2, readInt);
                        break;
                    case 6:
                        m23219A(aVar, d, readByte2, readInt);
                        break;
                    case 7:
                        m23227b(aVar, d, readByte2, readInt);
                        break;
                    case 8:
                        m23225X(aVar, d, readByte2, readInt);
                        break;
                    default:
                        this.f16729b.skip((long) d);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        public void close() {
            this.f16729b.close();
        }
    }

    /* renamed from: ae.g$d */
    /* compiled from: Http2 */
    static final class C10880d implements C10870c {

        /* renamed from: b */
        private final C13127d f16733b;

        /* renamed from: c */
        private final boolean f16734c;

        /* renamed from: d */
        private final C13121c f16735d;

        /* renamed from: e */
        private final C10873f.C10875b f16736e;

        /* renamed from: f */
        private int f16737f = 16384;

        /* renamed from: g */
        private boolean f16738g;

        C10880d(C13127d dVar, boolean z) {
            this.f16733b = dVar;
            this.f16734c = z;
            C13121c cVar = new C13121c();
            this.f16735d = cVar;
            this.f16736e = new C10873f.C10875b(cVar);
        }

        /* renamed from: k */
        private void m23231k(int i, long j) {
            byte b;
            while (j > 0) {
                int min = (int) Math.min((long) this.f16737f, j);
                long j2 = (long) min;
                j -= j2;
                if (j == 0) {
                    b = 4;
                } else {
                    b = 0;
                }
                mo45862b(i, min, (byte) 9, b);
                this.f16733b.write(this.f16735d, j2);
            }
        }

        /* renamed from: C */
        public synchronized void mo45834C(int i, C10867a aVar, byte[] bArr) {
            if (this.f16738g) {
                throw new IOException("closed");
            } else if (aVar.f16679b != -1) {
                mo45862b(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f16733b.writeInt(i);
                this.f16733b.writeInt(aVar.f16679b);
                if (bArr.length > 0) {
                    this.f16733b.write(bArr);
                }
                this.f16733b.flush();
            } else {
                throw C10876g.m23211h("errorCode.httpCode == -1", new Object[0]);
            }
        }

        /* renamed from: S */
        public synchronized void mo45835S(C10883i iVar) {
            if (!this.f16738g) {
                this.f16737f = iVar.mo45870c(this.f16737f);
                mo45862b(0, 0, (byte) 4, (byte) 1);
                this.f16733b.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo45861a(int i, byte b, C13121c cVar, int i2) {
            mo45862b(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.f16733b.write(cVar, (long) i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo45862b(int i, int i2, byte b, byte b2) {
            if (C10876g.f16718a.isLoggable(Level.FINE)) {
                C10876g.f16718a.fine(C10878b.m23218b(false, i, i2, b, b2));
            }
            int i3 = this.f16737f;
            if (i2 > i3) {
                throw C10876g.m23211h("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            } else if ((Integer.MIN_VALUE & i) == 0) {
                C10876g.m23215l(this.f16733b, i2);
                this.f16733b.writeByte(b & 255);
                this.f16733b.writeByte(b2 & 255);
                this.f16733b.writeInt(i & Integer.MAX_VALUE);
            } else {
                throw C10876g.m23211h("reserved bit set: %s", Integer.valueOf(i));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo45863c(boolean z, int i, List<C10871d> list) {
            byte b;
            if (!this.f16738g) {
                this.f16736e.mo45854e(list);
                long size = this.f16735d.size();
                int min = (int) Math.min((long) this.f16737f, size);
                long j = (long) min;
                int i2 = (size > j ? 1 : (size == j ? 0 : -1));
                if (i2 == 0) {
                    b = 4;
                } else {
                    b = 0;
                }
                if (z) {
                    b = (byte) (b | 1);
                }
                mo45862b(i, min, (byte) 1, b);
                this.f16733b.write(this.f16735d, j);
                if (i2 > 0) {
                    m23231k(i, size - j);
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        public synchronized void close() {
            this.f16738g = true;
            this.f16733b.close();
        }

        public synchronized void connectionPreface() {
            if (this.f16738g) {
                throw new IOException("closed");
            } else if (this.f16734c) {
                if (C10876g.f16718a.isLoggable(Level.FINE)) {
                    C10876g.f16718a.fine(String.format(">> CONNECTION %s", new Object[]{C10876g.f16719b.mo52609l()}));
                }
                this.f16733b.write(C10876g.f16719b.mo52594M());
                this.f16733b.flush();
            }
        }

        public synchronized void data(boolean z, int i, C13121c cVar, int i2) {
            byte b;
            if (!this.f16738g) {
                if (z) {
                    b = (byte) 1;
                } else {
                    b = 0;
                }
                mo45861a(i, b, cVar, i2);
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: f0 */
        public synchronized void mo45838f0(C10883i iVar) {
            int i;
            if (!this.f16738g) {
                mo45862b(0, iVar.mo45873f() * 6, (byte) 4, (byte) 0);
                for (int i2 = 0; i2 < 10; i2++) {
                    if (iVar.mo45871d(i2)) {
                        if (i2 == 4) {
                            i = 3;
                        } else if (i2 == 7) {
                            i = 4;
                        } else {
                            i = i2;
                        }
                        this.f16733b.writeShort(i);
                        this.f16733b.writeInt(iVar.mo45868a(i2));
                    }
                }
                this.f16733b.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void flush() {
            if (!this.f16738g) {
                this.f16733b.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: i */
        public synchronized void mo45840i(int i, C10867a aVar) {
            if (this.f16738g) {
                throw new IOException("closed");
            } else if (aVar.f16679b != -1) {
                mo45862b(i, 4, (byte) 3, (byte) 0);
                this.f16733b.writeInt(aVar.f16679b);
                this.f16733b.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }

        public int maxDataLength() {
            return this.f16737f;
        }

        public synchronized void ping(boolean z, int i, int i2) {
            byte b;
            if (!this.f16738g) {
                if (z) {
                    b = 1;
                } else {
                    b = 0;
                }
                mo45862b(0, 8, (byte) 6, b);
                this.f16733b.writeInt(i);
                this.f16733b.writeInt(i2);
                this.f16733b.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void synStream(boolean z, boolean z2, int i, int i2, List<C10871d> list) {
            if (!z2) {
                try {
                    if (!this.f16738g) {
                        mo45863c(z, i, list);
                    } else {
                        throw new IOException("closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }

        public synchronized void windowUpdate(int i, long j) {
            if (this.f16738g) {
                throw new IOException("closed");
            } else if (j == 0 || j > 2147483647L) {
                throw C10876g.m23211h("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            } else {
                mo45862b(i, 4, (byte) 8, (byte) 0);
                this.f16733b.writeInt((int) j);
                this.f16733b.flush();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static IllegalArgumentException m23211h(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static IOException m23212i(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static int m23213j(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw m23212i("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static int m23214k(C13130e eVar) {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << 16) | ((eVar.readByte() & 255) << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m23215l(C13127d dVar, int i) {
        dVar.writeByte((i >>> 16) & 255);
        dVar.writeByte((i >>> 8) & 255);
        dVar.writeByte(i & 255);
    }

    public C10868b newReader(C13130e eVar, boolean z) {
        return new C10879c(eVar, 4096, z);
    }

    public C10870c newWriter(C13127d dVar, boolean z) {
        return new C10880d(dVar, z);
    }

    /* renamed from: ae.g$a */
    /* compiled from: Http2 */
    static final class C10877a implements C13179y0 {

        /* renamed from: b */
        private final C13130e f16720b;

        /* renamed from: c */
        int f16721c;

        /* renamed from: d */
        byte f16722d;

        /* renamed from: e */
        int f16723e;

        /* renamed from: f */
        int f16724f;

        /* renamed from: g */
        short f16725g;

        public C10877a(C13130e eVar) {
            this.f16720b = eVar;
        }

        /* renamed from: a */
        private void m23216a() {
            int i = this.f16723e;
            int d = C10876g.m23214k(this.f16720b);
            this.f16724f = d;
            this.f16721c = d;
            byte readByte = (byte) (this.f16720b.readByte() & 255);
            this.f16722d = (byte) (this.f16720b.readByte() & 255);
            if (C10876g.f16718a.isLoggable(Level.FINE)) {
                C10876g.f16718a.fine(C10878b.m23218b(true, this.f16723e, this.f16721c, readByte, this.f16722d));
            }
            int readInt = this.f16720b.readInt() & Integer.MAX_VALUE;
            this.f16723e = readInt;
            if (readByte != 9) {
                throw C10876g.m23212i("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            } else if (readInt != i) {
                throw C10876g.m23212i("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        public long read(C13121c cVar, long j) {
            while (true) {
                int i = this.f16724f;
                if (i == 0) {
                    this.f16720b.skip((long) this.f16725g);
                    this.f16725g = 0;
                    if ((this.f16722d & 4) != 0) {
                        return -1;
                    }
                    m23216a();
                } else {
                    long read = this.f16720b.read(cVar, Math.min(j, (long) i));
                    if (read == -1) {
                        return -1;
                    }
                    this.f16724f -= (int) read;
                    return read;
                }
            }
        }

        public C13181z0 timeout() {
            return this.f16720b.timeout();
        }

        public void close() {
        }
    }
}
