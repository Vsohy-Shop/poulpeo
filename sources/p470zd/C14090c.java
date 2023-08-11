package p470zd;

import javax.security.auth.x500.X500Principal;

/* renamed from: zd.c */
/* compiled from: DistinguishedNameParser */
final class C14090c {

    /* renamed from: a */
    private final String f23122a;

    /* renamed from: b */
    private final int f23123b;

    /* renamed from: c */
    private int f23124c;

    /* renamed from: d */
    private int f23125d;

    /* renamed from: e */
    private int f23126e;

    /* renamed from: f */
    private int f23127f;

    /* renamed from: g */
    private char[] f23128g;

    public C14090c(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f23122a = name;
        this.f23123b = name.length();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        return new java.lang.String(r1, r2, r8.f23127f - r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m32692a() {
        /*
            r8 = this;
            int r0 = r8.f23124c
            r8.f23125d = r0
            r8.f23126e = r0
        L_0x0006:
            int r0 = r8.f23124c
            int r1 = r8.f23123b
            if (r0 < r1) goto L_0x0019
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f23128g
            int r2 = r8.f23125d
            int r3 = r8.f23126e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0019:
            char[] r1 = r8.f23128g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L_0x005c
            if (r2 == r5) goto L_0x0051
            r5 = 92
            if (r2 == r5) goto L_0x003e
            if (r2 == r4) goto L_0x0051
            if (r2 == r3) goto L_0x0051
            int r3 = r8.f23126e
            int r4 = r3 + 1
            r8.f23126e = r4
            r1[r3] = r2
            int r0 = r0 + 1
            r8.f23124c = r0
            goto L_0x0006
        L_0x003e:
            int r0 = r8.f23126e
            int r2 = r0 + 1
            r8.f23126e = r2
            char r2 = r8.m32694d()
            r1[r0] = r2
            int r0 = r8.f23124c
            int r0 = r0 + 1
            r8.f23124c = r0
            goto L_0x0006
        L_0x0051:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f23125d
            int r3 = r8.f23126e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x005c:
            int r2 = r8.f23126e
            r8.f23127f = r2
            int r0 = r0 + 1
            r8.f23124c = r0
            int r0 = r2 + 1
            r8.f23126e = r0
            r1[r2] = r6
        L_0x006a:
            int r0 = r8.f23124c
            int r1 = r8.f23123b
            if (r0 >= r1) goto L_0x0083
            char[] r2 = r8.f23128g
            char r7 = r2[r0]
            if (r7 != r6) goto L_0x0083
            int r1 = r8.f23126e
            int r7 = r1 + 1
            r8.f23126e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f23124c = r0
            goto L_0x006a
        L_0x0083:
            if (r0 == r1) goto L_0x008f
            char[] r1 = r8.f23128g
            char r0 = r1[r0]
            if (r0 == r3) goto L_0x008f
            if (r0 == r4) goto L_0x008f
            if (r0 != r5) goto L_0x0006
        L_0x008f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f23128g
            int r2 = r8.f23125d
            int r3 = r8.f23127f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p470zd.C14090c.m32692a():java.lang.String");
    }

    /* renamed from: c */
    private int m32693c(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.f23123b) {
            char[] cArr = this.f23128g;
            char c = cArr[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f23122a);
            } else {
                i2 = c - '7';
            }
            char c2 = cArr[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f23122a);
            } else {
                i3 = c2 - '7';
            }
            return (i2 << 4) + i3;
        }
        throw new IllegalStateException("Malformed DN: " + this.f23122a);
    }

    /* renamed from: d */
    private char m32694d() {
        int i = this.f23124c + 1;
        this.f23124c = i;
        if (i != this.f23123b) {
            char c = this.f23128g[i];
            if (c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#') {
                return c;
            }
            switch (c) {
                case '*':
                case '+':
                case ',':
                    return c;
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            return c;
                        default:
                            return m32695e();
                    }
            }
        } else {
            throw new IllegalStateException("Unexpected end of DN: " + this.f23122a);
        }
    }

    /* renamed from: e */
    private char m32695e() {
        int i;
        int i2;
        int c = m32693c(this.f23124c);
        this.f23124c++;
        if (c < 128) {
            return (char) c;
        }
        if (c < 192 || c > 247) {
            return '?';
        }
        if (c <= 223) {
            i2 = c & 31;
            i = 1;
        } else if (c <= 239) {
            i2 = c & 15;
            i = 2;
        } else {
            i2 = c & 7;
            i = 3;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.f23124c + 1;
            this.f23124c = i4;
            if (i4 == this.f23123b || this.f23128g[i4] != '\\') {
                return '?';
            }
            int i5 = i4 + 1;
            this.f23124c = i5;
            int c2 = m32693c(i5);
            this.f23124c++;
            if ((c2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (c2 & 63);
        }
        return (char) i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r1 = r6.f23128g;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m32696f() {
        /*
            r6 = this;
            int r0 = r6.f23124c
            int r1 = r0 + 4
            int r2 = r6.f23123b
            java.lang.String r3 = "Unexpected end of DN: "
            if (r1 >= r2) goto L_0x0098
            r6.f23125d = r0
            int r0 = r0 + 1
            r6.f23124c = r0
        L_0x0010:
            int r0 = r6.f23124c
            int r1 = r6.f23123b
            if (r0 == r1) goto L_0x0054
            char[] r1 = r6.f23128g
            char r2 = r1[r0]
            r4 = 43
            if (r2 == r4) goto L_0x0054
            r4 = 44
            if (r2 == r4) goto L_0x0054
            r4 = 59
            if (r2 != r4) goto L_0x0027
            goto L_0x0054
        L_0x0027:
            r4 = 32
            if (r2 != r4) goto L_0x0042
            r6.f23126e = r0
            int r0 = r0 + 1
            r6.f23124c = r0
        L_0x0031:
            int r0 = r6.f23124c
            int r1 = r6.f23123b
            if (r0 >= r1) goto L_0x0056
            char[] r1 = r6.f23128g
            char r1 = r1[r0]
            if (r1 != r4) goto L_0x0056
            int r0 = r0 + 1
            r6.f23124c = r0
            goto L_0x0031
        L_0x0042:
            r4 = 65
            if (r2 < r4) goto L_0x004f
            r4 = 70
            if (r2 > r4) goto L_0x004f
            int r2 = r2 + 32
            char r2 = (char) r2
            r1[r0] = r2
        L_0x004f:
            int r0 = r0 + 1
            r6.f23124c = r0
            goto L_0x0010
        L_0x0054:
            r6.f23126e = r0
        L_0x0056:
            int r0 = r6.f23126e
            int r1 = r6.f23125d
            int r0 = r0 - r1
            r2 = 5
            if (r0 < r2) goto L_0x0081
            r2 = r0 & 1
            if (r2 == 0) goto L_0x0081
            int r2 = r0 / 2
            byte[] r3 = new byte[r2]
            int r1 = r1 + 1
            r4 = 0
        L_0x0069:
            if (r4 >= r2) goto L_0x0077
            int r5 = r6.m32693c(r1)
            byte r5 = (byte) r5
            r3[r4] = r5
            int r1 = r1 + 2
            int r4 = r4 + 1
            goto L_0x0069
        L_0x0077:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f23128g
            int r3 = r6.f23125d
            r1.<init>(r2, r3, r0)
            return r1
        L_0x0081:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.f23122a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0098:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.f23122a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p470zd.C14090c.m32696f():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m32697g() {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r6.f23124c
            int r1 = r6.f23123b
            r2 = 32
            if (r0 >= r1) goto L_0x0013
            char[] r3 = r6.f23128g
            char r3 = r3[r0]
            if (r3 != r2) goto L_0x0013
            int r0 = r0 + 1
            r6.f23124c = r0
            goto L_0x0000
        L_0x0013:
            if (r0 != r1) goto L_0x0017
            r0 = 0
            return r0
        L_0x0017:
            r6.f23125d = r0
            int r0 = r0 + 1
            r6.f23124c = r0
        L_0x001d:
            int r0 = r6.f23124c
            int r1 = r6.f23123b
            r3 = 61
            if (r0 >= r1) goto L_0x0032
            char[] r4 = r6.f23128g
            char r4 = r4[r0]
            if (r4 == r3) goto L_0x0032
            if (r4 == r2) goto L_0x0032
            int r0 = r0 + 1
            r6.f23124c = r0
            goto L_0x001d
        L_0x0032:
            java.lang.String r4 = "Unexpected end of DN: "
            if (r0 >= r1) goto L_0x00d3
            r6.f23126e = r0
            char[] r1 = r6.f23128g
            char r0 = r1[r0]
            if (r0 != r2) goto L_0x0071
        L_0x003e:
            int r0 = r6.f23124c
            int r1 = r6.f23123b
            if (r0 >= r1) goto L_0x0051
            char[] r5 = r6.f23128g
            char r5 = r5[r0]
            if (r5 == r3) goto L_0x0051
            if (r5 != r2) goto L_0x0051
            int r0 = r0 + 1
            r6.f23124c = r0
            goto L_0x003e
        L_0x0051:
            char[] r5 = r6.f23128g
            char r5 = r5[r0]
            if (r5 != r3) goto L_0x005a
            if (r0 == r1) goto L_0x005a
            goto L_0x0071
        L_0x005a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r6.f23122a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0071:
            int r0 = r6.f23124c
            int r0 = r0 + 1
            r6.f23124c = r0
        L_0x0077:
            int r0 = r6.f23124c
            int r1 = r6.f23123b
            if (r0 >= r1) goto L_0x0088
            char[] r1 = r6.f23128g
            char r1 = r1[r0]
            if (r1 != r2) goto L_0x0088
            int r0 = r0 + 1
            r6.f23124c = r0
            goto L_0x0077
        L_0x0088:
            int r0 = r6.f23126e
            int r1 = r6.f23125d
            int r2 = r0 - r1
            r3 = 4
            if (r2 <= r3) goto L_0x00c8
            char[] r2 = r6.f23128g
            int r4 = r1 + 3
            char r4 = r2[r4]
            r5 = 46
            if (r4 != r5) goto L_0x00c8
            char r4 = r2[r1]
            r5 = 79
            if (r4 == r5) goto L_0x00a5
            r5 = 111(0x6f, float:1.56E-43)
            if (r4 != r5) goto L_0x00c8
        L_0x00a5:
            int r4 = r1 + 1
            char r4 = r2[r4]
            r5 = 73
            if (r4 == r5) goto L_0x00b5
            int r4 = r1 + 1
            char r4 = r2[r4]
            r5 = 105(0x69, float:1.47E-43)
            if (r4 != r5) goto L_0x00c8
        L_0x00b5:
            int r4 = r1 + 2
            char r4 = r2[r4]
            r5 = 68
            if (r4 == r5) goto L_0x00c5
            int r4 = r1 + 2
            char r2 = r2[r4]
            r4 = 100
            if (r2 != r4) goto L_0x00c8
        L_0x00c5:
            int r1 = r1 + r3
            r6.f23125d = r1
        L_0x00c8:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f23128g
            int r3 = r6.f23125d
            int r0 = r0 - r3
            r1.<init>(r2, r3, r0)
            return r1
        L_0x00d3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r6.f23122a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p470zd.C14090c.m32697g():java.lang.String");
    }

    /* renamed from: h */
    private String m32698h() {
        int i = this.f23124c + 1;
        this.f23124c = i;
        this.f23125d = i;
        this.f23126e = i;
        while (true) {
            int i2 = this.f23124c;
            if (i2 != this.f23123b) {
                char[] cArr = this.f23128g;
                char c = cArr[i2];
                if (c == '\"') {
                    this.f23124c = i2 + 1;
                    while (true) {
                        int i3 = this.f23124c;
                        if (i3 >= this.f23123b || this.f23128g[i3] != ' ') {
                            char[] cArr2 = this.f23128g;
                            int i4 = this.f23125d;
                        } else {
                            this.f23124c = i3 + 1;
                        }
                    }
                    char[] cArr22 = this.f23128g;
                    int i42 = this.f23125d;
                    return new String(cArr22, i42, this.f23126e - i42);
                }
                if (c == '\\') {
                    cArr[this.f23126e] = m32694d();
                } else {
                    cArr[this.f23126e] = c;
                }
                this.f23124c++;
                this.f23126e++;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.f23122a);
            }
        }
    }

    /* renamed from: b */
    public String mo53858b(String str) {
        String str2;
        this.f23124c = 0;
        this.f23125d = 0;
        this.f23126e = 0;
        this.f23127f = 0;
        this.f23128g = this.f23122a.toCharArray();
        String g = m32697g();
        if (g == null) {
            return null;
        }
        do {
            int i = this.f23124c;
            if (i == this.f23123b) {
                return null;
            }
            char c = this.f23128g[i];
            if (c == '\"') {
                str2 = m32698h();
            } else if (c == '#') {
                str2 = m32696f();
            } else if (c == '+' || c == ',' || c == ';') {
                str2 = "";
            } else {
                str2 = m32692a();
            }
            if (str.equalsIgnoreCase(g)) {
                return str2;
            }
            int i2 = this.f23124c;
            if (i2 >= this.f23123b) {
                return null;
            }
            char c2 = this.f23128g[i2];
            if (c2 == ',' || c2 == ';' || c2 == '+') {
                this.f23124c = i2 + 1;
                g = m32697g();
            } else {
                throw new IllegalStateException("Malformed DN: " + this.f23122a);
            }
        } while (g != null);
        throw new IllegalStateException("Malformed DN: " + this.f23122a);
    }
}
