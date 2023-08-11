package p246u8;

import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import p235t8.C9764a;

/* renamed from: u8.a */
/* compiled from: JsonReader */
public class C9899a implements Closeable {

    /* renamed from: q */
    private static final char[] f14802q = ")]}'\n".toCharArray();

    /* renamed from: b */
    private final Reader f14803b;

    /* renamed from: c */
    private boolean f14804c = false;

    /* renamed from: d */
    private final char[] f14805d = new char[1024];

    /* renamed from: e */
    private int f14806e = 0;

    /* renamed from: f */
    private int f14807f = 0;

    /* renamed from: g */
    private int f14808g = 0;

    /* renamed from: h */
    private int f14809h = 0;

    /* renamed from: i */
    int f14810i = 0;

    /* renamed from: j */
    private long f14811j;

    /* renamed from: k */
    private int f14812k;

    /* renamed from: l */
    private String f14813l;

    /* renamed from: m */
    private int[] f14814m;

    /* renamed from: n */
    private int f14815n;

    /* renamed from: o */
    private String[] f14816o;

    /* renamed from: p */
    private int[] f14817p;

    /* renamed from: u8.a$a */
    /* compiled from: JsonReader */
    class C9900a extends C9764a {
        C9900a() {
        }
    }

    static {
        C9764a.f14574a = new C9900a();
    }

    public C9899a(Reader reader) {
        int[] iArr = new int[32];
        this.f14814m = iArr;
        this.f14815n = 0 + 1;
        iArr[0] = 6;
        this.f14816o = new String[32];
        this.f14817p = new int[32];
        if (reader != null) {
            this.f14803b = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: A0 */
    private char m20568A0() {
        int i;
        int i2;
        if (this.f14806e != this.f14807f || m20572Q(1)) {
            char[] cArr = this.f14805d;
            int i3 = this.f14806e;
            int i4 = i3 + 1;
            this.f14806e = i4;
            char c = cArr[i3];
            if (c == 10) {
                this.f14808g++;
                this.f14809h = i4;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    throw m20571D0("Invalid escape sequence");
                } else if (i4 + 4 <= this.f14807f || m20572Q(4)) {
                    int i5 = this.f14806e;
                    int i6 = i5 + 4;
                    char c2 = 0;
                    while (i5 < i6) {
                        char c3 = this.f14805d[i5];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f14805d, this.f14806e, 4));
                            } else {
                                i = c3 - 'A';
                            }
                            i2 = i + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (c4 + i2);
                        i5++;
                    }
                    this.f14806e += 4;
                    return c2;
                } else {
                    throw m20571D0("Unterminated escape sequence");
                }
            }
            return c;
        }
        throw m20571D0("Unterminated escape sequence");
    }

    /* renamed from: B0 */
    private boolean m20569B0(String str) {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f14806e + length > this.f14807f && !m20572Q(length)) {
                return false;
            }
            char[] cArr = this.f14805d;
            int i2 = this.f14806e;
            if (cArr[i2] == 10) {
                this.f14808g++;
                this.f14809h = i2 + 1;
            } else {
                while (i < length) {
                    if (this.f14805d[this.f14806e + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f14806e++;
        }
    }

    /* renamed from: C0 */
    private void m20570C0() {
        char c;
        do {
            if (this.f14806e < this.f14807f || m20572Q(1)) {
                char[] cArr = this.f14805d;
                int i = this.f14806e;
                int i2 = i + 1;
                this.f14806e = i2;
                c = cArr[i];
                if (c == 10) {
                    this.f14808g++;
                    this.f14809h = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* renamed from: D0 */
    private IOException m20571D0(String str) {
        throw new MalformedJsonException(str + mo44420Y());
    }

    /* renamed from: Q */
    private boolean m20572Q(int i) {
        int i2;
        int i3;
        char[] cArr = this.f14805d;
        int i4 = this.f14809h;
        int i5 = this.f14806e;
        this.f14809h = i4 - i5;
        int i6 = this.f14807f;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f14807f = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f14807f = 0;
        }
        this.f14806e = 0;
        do {
            Reader reader = this.f14803b;
            int i8 = this.f14807f;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f14807f + read;
            this.f14807f = i2;
            if (this.f14808g == 0 && (i3 = this.f14809h) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f14806e++;
                this.f14809h = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: X */
    private boolean m20573X(char c) {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m20574c();
        return false;
    }

    /* renamed from: c */
    private void m20574c() {
        if (!this.f14804c) {
            throw m20571D0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: k */
    private void m20575k() {
        m20576k0(true);
        int i = this.f14806e - 1;
        this.f14806e = i;
        char[] cArr = f14802q;
        if (i + cArr.length <= this.f14807f || m20572Q(cArr.length)) {
            int i2 = 0;
            while (true) {
                char[] cArr2 = f14802q;
                if (i2 >= cArr2.length) {
                    this.f14806e += cArr2.length;
                    return;
                } else if (this.f14805d[this.f14806e + i2] == cArr2[i2]) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: k0 */
    private int m20576k0(boolean z) {
        char[] cArr = this.f14805d;
        int i = this.f14806e;
        int i2 = this.f14807f;
        while (true) {
            if (i == i2) {
                this.f14806e = i;
                if (m20572Q(1)) {
                    i = this.f14806e;
                    i2 = this.f14807f;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + mo44420Y());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.f14808g++;
                this.f14809h = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f14806e = i3;
                    if (i3 == i2) {
                        this.f14806e = i3 - 1;
                        boolean Q = m20572Q(2);
                        this.f14806e++;
                        if (!Q) {
                            return c;
                        }
                    }
                    m20574c();
                    int i4 = this.f14806e;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f14806e = i4 + 1;
                        if (m20569B0("*/")) {
                            i = this.f14806e + 2;
                            i2 = this.f14807f;
                        } else {
                            throw m20571D0("Unterminated comment");
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f14806e = i4 + 1;
                        m20570C0();
                        i = this.f14806e;
                        i2 = this.f14807f;
                    }
                } else if (c == '#') {
                    this.f14806e = i3;
                    m20574c();
                    m20570C0();
                    i = this.f14806e;
                    i2 = this.f14807f;
                } else {
                    this.f14806e = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r1 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r1.append(r0, r3, r2 - r3);
        r9.f14806e = r2;
     */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m20577t0(char r10) {
        /*
            r9 = this;
            char[] r0 = r9.f14805d
            r1 = 0
        L_0x0003:
            int r2 = r9.f14806e
            int r3 = r9.f14807f
        L_0x0007:
            r4 = r3
            r3 = r2
        L_0x0009:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L_0x005c
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L_0x0028
            r9.f14806e = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L_0x0020
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L_0x0020:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x0028:
            r8 = 92
            if (r2 != r8) goto L_0x004f
            r9.f14806e = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L_0x0040
            int r1 = r7 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L_0x0040:
            r1.append(r0, r3, r7)
            char r2 = r9.m20568A0()
            r1.append(r2)
            int r2 = r9.f14806e
            int r3 = r9.f14807f
            goto L_0x0007
        L_0x004f:
            r5 = 10
            if (r2 != r5) goto L_0x005a
            int r2 = r9.f14808g
            int r2 = r2 + r6
            r9.f14808g = r2
            r9.f14809h = r7
        L_0x005a:
            r2 = r7
            goto L_0x0009
        L_0x005c:
            if (r1 != 0) goto L_0x006c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L_0x006c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f14806e = r2
            boolean r2 = r9.m20572Q(r6)
            if (r2 == 0) goto L_0x007a
            goto L_0x0003
        L_0x007a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.m20571D0(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p246u8.C9899a.m20577t0(char):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        m20574c();
     */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m20578v0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r1
        L_0x0003:
            int r3 = r6.f14806e
            int r4 = r3 + r2
            int r5 = r6.f14807f
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f14805d
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.m20574c()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f14805d
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.m20572Q(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r1 = r2
            goto L_0x007e
        L_0x005e:
            if (r0 != 0) goto L_0x006b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f14805d
            int r4 = r6.f14806e
            r0.append(r3, r4, r2)
            int r3 = r6.f14806e
            int r3 = r3 + r2
            r6.f14806e = r3
            r2 = 1
            boolean r2 = r6.m20572Q(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f14805d
            int r3 = r6.f14806e
            r0.<init>(r2, r3, r1)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f14805d
            int r3 = r6.f14806e
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L_0x0095:
            int r2 = r6.f14806e
            int r2 = r2 + r1
            r6.f14806e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p246u8.C9899a.m20578v0():java.lang.String");
    }

    /* renamed from: x0 */
    private int m20579x0() {
        int i;
        String str;
        String str2;
        char c = this.f14805d[this.f14806e];
        if (c == 't' || c == 'T') {
            str2 = "true";
            str = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str2 = "false";
            str = "FALSE";
            i = 6;
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            str2 = "null";
            str = "NULL";
            i = 7;
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f14806e + i2 >= this.f14807f && !m20572Q(i2 + 1)) {
                return 0;
            }
            char c2 = this.f14805d[this.f14806e + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f14806e + length < this.f14807f || m20572Q(length + 1)) && m20573X(this.f14805d[this.f14806e + length])) {
            return 0;
        }
        this.f14806e += length;
        this.f14810i = i;
        return i;
    }

    /* renamed from: y0 */
    private int m20580y0() {
        char c;
        char c2;
        boolean z;
        char[] cArr = this.f14805d;
        int i = this.f14806e;
        int i2 = this.f14807f;
        int i3 = 0;
        int i4 = 0;
        char c3 = 0;
        boolean z2 = false;
        boolean z3 = true;
        long j = 0;
        while (true) {
            if (i + i4 == i2) {
                if (i4 == cArr.length) {
                    return i3;
                }
                if (!m20572Q(i4 + 1)) {
                    break;
                }
                i = this.f14806e;
                i2 = this.f14807f;
            }
            c = cArr[i + i4];
            if (c == '+') {
                c2 = 6;
                i3 = 0;
                if (c3 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i3 = 0;
                if (c3 != 2 && c3 != 4) {
                    return 0;
                }
                c3 = 5;
                i4++;
            } else if (c != '-') {
                c2 = 3;
                if (c == '.') {
                    i3 = 0;
                    if (c3 != 2) {
                        return 0;
                    }
                } else if (c >= '0' && c <= '9') {
                    if (c3 == 1 || c3 == 0) {
                        j = (long) (-(c - '0'));
                        c3 = 2;
                    } else if (c3 != 2) {
                        if (c3 == 3) {
                            i3 = 0;
                            c3 = 4;
                        } else if (c3 == 5 || c3 == 6) {
                            i3 = 0;
                            c3 = 7;
                        }
                        i4++;
                    } else if (j == 0) {
                        return 0;
                    } else {
                        long j2 = (10 * j) - ((long) (c - '0'));
                        int i5 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                        if (i5 > 0 || (i5 == 0 && j2 < j)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z3 &= z;
                        j = j2;
                    }
                    i3 = 0;
                    i4++;
                }
            } else {
                c2 = 6;
                i3 = 0;
                if (c3 == 0) {
                    c3 = 1;
                    z2 = true;
                    i4++;
                } else if (c3 != 5) {
                    return 0;
                }
            }
            c3 = c2;
            i4++;
        }
        if (m20573X(c)) {
            return 0;
        }
        if (c3 == 2 && z3 && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.f14811j = j;
            this.f14806e += i4;
            this.f14810i = 15;
            return 15;
        } else if (c3 != 2 && c3 != 4 && c3 != 7) {
            return 0;
        } else {
            this.f14812k = i4;
            this.f14810i = 16;
            return 16;
        }
    }

    /* renamed from: z0 */
    private void m20581z0(int i) {
        int i2 = this.f14815n;
        int[] iArr = this.f14814m;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f14814m = Arrays.copyOf(iArr, i3);
            this.f14817p = Arrays.copyOf(this.f14817p, i3);
            this.f14816o = (String[]) Arrays.copyOf(this.f14816o, i3);
        }
        int[] iArr2 = this.f14814m;
        int i4 = this.f14815n;
        this.f14815n = i4 + 1;
        iArr2[i4] = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public int mo44415A() {
        int k0;
        int[] iArr = this.f14814m;
        int i = this.f14815n;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int k02 = m20576k0(true);
            if (k02 != 44) {
                if (k02 == 59) {
                    m20574c();
                } else if (k02 == 93) {
                    this.f14810i = 4;
                    return 4;
                } else {
                    throw m20571D0("Unterminated array");
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5 && (k0 = m20576k0(true)) != 44) {
                if (k0 == 59) {
                    m20574c();
                } else if (k0 == 125) {
                    this.f14810i = 2;
                    return 2;
                } else {
                    throw m20571D0("Unterminated object");
                }
            }
            int k03 = m20576k0(true);
            if (k03 == 34) {
                this.f14810i = 13;
                return 13;
            } else if (k03 == 39) {
                m20574c();
                this.f14810i = 12;
                return 12;
            } else if (k03 != 125) {
                m20574c();
                this.f14806e--;
                if (m20573X((char) k03)) {
                    this.f14810i = 14;
                    return 14;
                }
                throw m20571D0("Expected name");
            } else if (i2 != 5) {
                this.f14810i = 2;
                return 2;
            } else {
                throw m20571D0("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int k04 = m20576k0(true);
            if (k04 != 58) {
                if (k04 == 61) {
                    m20574c();
                    if (this.f14806e < this.f14807f || m20572Q(1)) {
                        char[] cArr = this.f14805d;
                        int i3 = this.f14806e;
                        if (cArr[i3] == '>') {
                            this.f14806e = i3 + 1;
                        }
                    }
                } else {
                    throw m20571D0("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            if (this.f14804c) {
                m20575k();
            }
            this.f14814m[this.f14815n - 1] = 7;
        } else if (i2 == 7) {
            if (m20576k0(false) == -1) {
                this.f14810i = 17;
                return 17;
            }
            m20574c();
            this.f14806e--;
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int k05 = m20576k0(true);
        if (k05 == 34) {
            this.f14810i = 9;
            return 9;
        } else if (k05 != 39) {
            if (!(k05 == 44 || k05 == 59)) {
                if (k05 == 91) {
                    this.f14810i = 3;
                    return 3;
                } else if (k05 != 93) {
                    if (k05 != 123) {
                        this.f14806e--;
                        int x0 = m20579x0();
                        if (x0 != 0) {
                            return x0;
                        }
                        int y0 = m20580y0();
                        if (y0 != 0) {
                            return y0;
                        }
                        if (m20573X(this.f14805d[this.f14806e])) {
                            m20574c();
                            this.f14810i = 10;
                            return 10;
                        }
                        throw m20571D0("Expected value");
                    }
                    this.f14810i = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f14810i = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                m20574c();
                this.f14806e--;
                this.f14810i = 7;
                return 7;
            }
            throw m20571D0("Unexpected value");
        } else {
            m20574c();
            this.f14810i = 8;
            return 8;
        }
    }

    /* renamed from: G */
    public void mo44416G() {
        int i = this.f14810i;
        if (i == 0) {
            i = mo44415A();
        }
        if (i == 4) {
            int i2 = this.f14815n - 1;
            this.f14815n = i2;
            int[] iArr = this.f14817p;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f14810i = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + mo44430w0() + mo44420Y());
    }

    /* renamed from: O */
    public void mo44417O() {
        int i = this.f14810i;
        if (i == 0) {
            i = mo44415A();
        }
        if (i == 2) {
            int i2 = this.f14815n - 1;
            this.f14815n = i2;
            this.f14816o[i2] = null;
            int[] iArr = this.f14817p;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f14810i = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + mo44430w0() + mo44420Y());
    }

    /* renamed from: R */
    public String mo44418R() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.f14815n;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f14814m[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f14817p[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.f14816o[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: V */
    public boolean mo44419V() {
        int i = this.f14810i;
        if (i == 0) {
            i = mo44415A();
        }
        if (i == 2 || i == 4) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public String mo44420Y() {
        return " at line " + (this.f14808g + 1) + " column " + ((this.f14806e - this.f14809h) + 1) + " path " + mo44418R();
    }

    /* renamed from: a */
    public void mo44421a() {
        int i = this.f14810i;
        if (i == 0) {
            i = mo44415A();
        }
        if (i == 3) {
            m20581z0(1);
            this.f14817p[this.f14815n - 1] = 0;
            this.f14810i = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo44430w0() + mo44420Y());
    }

    /* renamed from: a0 */
    public boolean mo44422a0() {
        int i = this.f14810i;
        if (i == 0) {
            i = mo44415A();
        }
        if (i == 5) {
            this.f14810i = 0;
            int[] iArr = this.f14817p;
            int i2 = this.f14815n - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f14810i = 0;
            int[] iArr2 = this.f14817p;
            int i3 = this.f14815n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + mo44430w0() + mo44420Y());
        }
    }

    /* renamed from: b */
    public void mo44423b() {
        int i = this.f14810i;
        if (i == 0) {
            i = mo44415A();
        }
        if (i == 1) {
            m20581z0(3);
            this.f14810i = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo44430w0() + mo44420Y());
    }

    /* renamed from: c0 */
    public double mo44424c0() {
        char c;
        int i = this.f14810i;
        if (i == 0) {
            i = mo44415A();
        }
        if (i == 15) {
            this.f14810i = 0;
            int[] iArr = this.f14817p;
            int i2 = this.f14815n - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f14811j;
        }
        if (i == 16) {
            this.f14813l = new String(this.f14805d, this.f14806e, this.f14812k);
            this.f14806e += this.f14812k;
        } else if (i == 8 || i == 9) {
            if (i == 8) {
                c = '\'';
            } else {
                c = '\"';
            }
            this.f14813l = m20577t0(c);
        } else if (i == 10) {
            this.f14813l = m20578v0();
        } else if (i != 11) {
            throw new IllegalStateException("Expected a double but was " + mo44430w0() + mo44420Y());
        }
        this.f14810i = 11;
        double parseDouble = Double.parseDouble(this.f14813l);
        if (this.f14804c || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f14813l = null;
            this.f14810i = 0;
            int[] iArr2 = this.f14817p;
            int i3 = this.f14815n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + mo44420Y());
    }

    public void close() {
        this.f14810i = 0;
        this.f14814m[0] = 8;
        this.f14815n = 1;
        this.f14803b.close();
    }

    /* renamed from: j0 */
    public String mo44426j0() {
        String str;
        int i = this.f14810i;
        if (i == 0) {
            i = mo44415A();
        }
        if (i == 14) {
            str = m20578v0();
        } else if (i == 12) {
            str = m20577t0('\'');
        } else if (i == 13) {
            str = m20577t0('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + mo44430w0() + mo44420Y());
        }
        this.f14810i = 0;
        this.f14816o[this.f14815n - 1] = str;
        return str;
    }

    /* renamed from: p0 */
    public void mo44427p0() {
        int i = this.f14810i;
        if (i == 0) {
            i = mo44415A();
        }
        if (i == 7) {
            this.f14810i = 0;
            int[] iArr = this.f14817p;
            int i2 = this.f14815n - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo44430w0() + mo44420Y());
    }

    public String toString() {
        return getClass().getSimpleName() + mo44420Y();
    }

    /* renamed from: u0 */
    public String mo44429u0() {
        String str;
        int i = this.f14810i;
        if (i == 0) {
            i = mo44415A();
        }
        if (i == 10) {
            str = m20578v0();
        } else if (i == 8) {
            str = m20577t0('\'');
        } else if (i == 9) {
            str = m20577t0('\"');
        } else if (i == 11) {
            str = this.f14813l;
            this.f14813l = null;
        } else if (i == 15) {
            str = Long.toString(this.f14811j);
        } else if (i == 16) {
            str = new String(this.f14805d, this.f14806e, this.f14812k);
            this.f14806e += this.f14812k;
        } else {
            throw new IllegalStateException("Expected a string but was " + mo44430w0() + mo44420Y());
        }
        this.f14810i = 0;
        int[] iArr = this.f14817p;
        int i2 = this.f14815n - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: w0 */
    public C9901b mo44430w0() {
        int i = this.f14810i;
        if (i == 0) {
            i = mo44415A();
        }
        switch (i) {
            case 1:
                return C9901b.BEGIN_OBJECT;
            case 2:
                return C9901b.END_OBJECT;
            case 3:
                return C9901b.BEGIN_ARRAY;
            case 4:
                return C9901b.END_ARRAY;
            case 5:
            case 6:
                return C9901b.BOOLEAN;
            case 7:
                return C9901b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C9901b.STRING;
            case 12:
            case 13:
            case 14:
                return C9901b.NAME;
            case 15:
            case 16:
                return C9901b.NUMBER;
            case 17:
                return C9901b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }
}
