package com.google.common.p056io;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import p111h6.C7987a;
import p111h6.C8007k;
import p111h6.C8012n;
import p132j6.C8420a;

/* renamed from: com.google.common.io.BaseEncoding */
public abstract class BaseEncoding {

    /* renamed from: a */
    private static final BaseEncoding f9038a = new C6886c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b */
    private static final BaseEncoding f9039b = new C6886c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c */
    private static final BaseEncoding f9040c = new C6887d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d */
    private static final BaseEncoding f9041d = new C6887d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e */
    private static final BaseEncoding f9042e = new C6885b("base16()", "0123456789ABCDEF");

    /* renamed from: com.google.common.io.BaseEncoding$DecodingException */
    public static final class DecodingException extends IOException {
        DecodingException(String str) {
            super(str);
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$a */
    private static final class C6884a {

        /* renamed from: a */
        private final String f9043a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final char[] f9044b;

        /* renamed from: c */
        final int f9045c;

        /* renamed from: d */
        final int f9046d;

        /* renamed from: e */
        final int f9047e;

        /* renamed from: f */
        final int f9048f;

        /* renamed from: g */
        private final byte[] f9049g;

        /* renamed from: h */
        private final boolean[] f9050h;

        C6884a(String str, char[] cArr) {
            String str2;
            boolean z;
            boolean z2;
            this.f9043a = (String) C8012n.m15755n(str);
            this.f9044b = (char[]) C8012n.m15755n(cArr);
            try {
                int d = C8420a.m16841d(cArr.length, RoundingMode.UNNECESSARY);
                this.f9046d = d;
                int min = Math.min(8, Integer.lowestOneBit(d));
                try {
                    this.f9047e = 8 / min;
                    this.f9048f = d / min;
                    this.f9045c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i = 0; i < cArr.length; i++) {
                        char c = cArr[i];
                        if (c < 128) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C8012n.m15747f(z, "Non-ASCII character: %s", c);
                        if (bArr[c] == -1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C8012n.m15747f(z2, "Duplicate character: %s", c);
                        bArr[c] = (byte) i;
                    }
                    this.f9049g = bArr;
                    boolean[] zArr = new boolean[this.f9047e];
                    for (int i2 = 0; i2 < this.f9048f; i2++) {
                        zArr[C8420a.m16838a(i2 * 8, this.f9046d, RoundingMode.CEILING)] = true;
                    }
                    this.f9050h = zArr;
                } catch (ArithmeticException e) {
                    String str3 = new String(cArr);
                    if (str3.length() != 0) {
                        str2 = "Illegal alphabet ".concat(str3);
                    } else {
                        str2 = new String("Illegal alphabet ");
                    }
                    throw new IllegalArgumentException(str2, e);
                }
            } catch (ArithmeticException e2) {
                int length = cArr.length;
                StringBuilder sb = new StringBuilder(35);
                sb.append("Illegal alphabet length ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString(), e2);
            }
        }

        /* renamed from: d */
        private boolean m11914d() {
            for (char a : this.f9044b) {
                if (C7987a.m15693a(a)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        private boolean m11915e() {
            for (char b : this.f9044b) {
                if (C7987a.m15694b(b)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo39707b(char c) {
            String str;
            String str2;
            if (c > 127) {
                String valueOf = String.valueOf(Integer.toHexString(c));
                if (valueOf.length() != 0) {
                    str2 = "Unrecognized character: 0x".concat(valueOf);
                } else {
                    str2 = new String("Unrecognized character: 0x");
                }
                throw new DecodingException(str2);
            }
            byte b = this.f9049g[c];
            if (b != -1) {
                return b;
            }
            if (c <= ' ' || c == 127) {
                String valueOf2 = String.valueOf(Integer.toHexString(c));
                if (valueOf2.length() != 0) {
                    str = "Unrecognized character: 0x".concat(valueOf2);
                } else {
                    str = new String("Unrecognized character: 0x");
                }
                throw new DecodingException(str);
            }
            StringBuilder sb = new StringBuilder(25);
            sb.append("Unrecognized character: ");
            sb.append(c);
            throw new DecodingException(sb.toString());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public char mo39708c(int i) {
            return this.f9044b[i];
        }

        public boolean equals(Object obj) {
            if (obj instanceof C6884a) {
                return Arrays.equals(this.f9044b, ((C6884a) obj).f9044b);
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo39710f(int i) {
            return this.f9050h[i % this.f9047e];
        }

        /* renamed from: g */
        public boolean mo39711g(char c) {
            byte[] bArr = this.f9049g;
            if (c >= bArr.length || bArr[c] == -1) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C6884a mo39712h() {
            if (!m11914d()) {
                return this;
            }
            C8012n.m15762u(!m11915e(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f9044b.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.f9044b;
                if (i >= cArr2.length) {
                    return new C6884a(String.valueOf(this.f9043a).concat(".upperCase()"), cArr);
                }
                cArr[i] = C7987a.m15696d(cArr2[i]);
                i++;
            }
        }

        public int hashCode() {
            return Arrays.hashCode(this.f9044b);
        }

        public String toString() {
            return this.f9043a;
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$b */
    static final class C6885b extends C6887d {

        /* renamed from: i */
        final char[] f9051i;

        C6885b(String str, String str2) {
            this(new C6884a(str, str2.toCharArray()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo39698e(byte[] bArr, CharSequence charSequence) {
            C8012n.m15755n(bArr);
            if (charSequence.length() % 2 != 1) {
                int i = 0;
                int i2 = 0;
                while (i < charSequence.length()) {
                    bArr[i2] = (byte) ((this.f9052f.mo39707b(charSequence.charAt(i)) << 4) | this.f9052f.mo39707b(charSequence.charAt(i + 1)));
                    i += 2;
                    i2++;
                }
                return i2;
            }
            int length = charSequence.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new DecodingException(sb.toString());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo39701h(Appendable appendable, byte[] bArr, int i, int i2) {
            C8012n.m15755n(appendable);
            C8012n.m15760s(i, i + i2, bArr.length);
            for (int i3 = 0; i3 < i2; i3++) {
                byte b = bArr[i + i3] & 255;
                appendable.append(this.f9051i[b]);
                appendable.append(this.f9051i[b | 256]);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public BaseEncoding mo39715p(C6884a aVar, Character ch) {
            return new C6885b(aVar);
        }

        private C6885b(C6884a aVar) {
            super(aVar, (Character) null);
            this.f9051i = new char[512];
            C8012n.m15745d(aVar.f9044b.length == 16);
            for (int i = 0; i < 256; i++) {
                this.f9051i[i] = aVar.mo39708c(i >>> 4);
                this.f9051i[i | 256] = aVar.mo39708c(i & 15);
            }
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$c */
    static final class C6886c extends C6887d {
        C6886c(String str, String str2, Character ch) {
            this(new C6884a(str, str2.toCharArray()), ch);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo39698e(byte[] bArr, CharSequence charSequence) {
            C8012n.m15755n(bArr);
            CharSequence m = mo39705m(charSequence);
            if (this.f9052f.mo39710f(m.length())) {
                int i = 0;
                int i2 = 0;
                while (i < m.length()) {
                    int i3 = i + 1;
                    int i4 = i3 + 1;
                    int b = (this.f9052f.mo39707b(m.charAt(i)) << 18) | (this.f9052f.mo39707b(m.charAt(i3)) << 12);
                    int i5 = i2 + 1;
                    bArr[i2] = (byte) (b >>> 16);
                    if (i4 < m.length()) {
                        int i6 = i4 + 1;
                        int b2 = b | (this.f9052f.mo39707b(m.charAt(i4)) << 6);
                        i2 = i5 + 1;
                        bArr[i5] = (byte) ((b2 >>> 8) & 255);
                        if (i6 < m.length()) {
                            i4 = i6 + 1;
                            i5 = i2 + 1;
                            bArr[i2] = (byte) ((b2 | this.f9052f.mo39707b(m.charAt(i6))) & 255);
                        } else {
                            i = i6;
                        }
                    }
                    i2 = i5;
                    i = i4;
                }
                return i2;
            }
            int length = m.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new DecodingException(sb.toString());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo39701h(Appendable appendable, byte[] bArr, int i, int i2) {
            C8012n.m15755n(appendable);
            int i3 = i + i2;
            C8012n.m15760s(i, i3, bArr.length);
            while (i2 >= 3) {
                int i4 = i + 1;
                int i5 = i4 + 1;
                byte b = ((bArr[i] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                appendable.append(this.f9052f.mo39708c(b >>> 18));
                appendable.append(this.f9052f.mo39708c((b >>> 12) & 63));
                appendable.append(this.f9052f.mo39708c((b >>> 6) & 63));
                appendable.append(this.f9052f.mo39708c(b & 63));
                i2 -= 3;
                i = i5 + 1;
            }
            if (i < i3) {
                mo39718o(appendable, bArr, i, i3 - i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public BaseEncoding mo39715p(C6884a aVar, Character ch) {
            return new C6886c(aVar, ch);
        }

        private C6886c(C6884a aVar, Character ch) {
            super(aVar, ch);
            C8012n.m15745d(aVar.f9044b.length == 64);
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$d */
    static class C6887d extends BaseEncoding {

        /* renamed from: f */
        final C6884a f9052f;

        /* renamed from: g */
        final Character f9053g;

        /* renamed from: h */
        private transient BaseEncoding f9054h;

        C6887d(String str, String str2, Character ch) {
            this(new C6884a(str, str2.toCharArray()), ch);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo39698e(byte[] bArr, CharSequence charSequence) {
            C6884a aVar;
            C8012n.m15755n(bArr);
            CharSequence m = mo39705m(charSequence);
            if (this.f9052f.mo39710f(m.length())) {
                int i = 0;
                int i2 = 0;
                while (i < m.length()) {
                    long j = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        aVar = this.f9052f;
                        if (i3 >= aVar.f9047e) {
                            break;
                        }
                        j <<= aVar.f9046d;
                        if (i + i3 < m.length()) {
                            j |= (long) this.f9052f.mo39707b(m.charAt(i4 + i));
                            i4++;
                        }
                        i3++;
                    }
                    int i5 = aVar.f9048f;
                    int i6 = (i5 * 8) - (i4 * aVar.f9046d);
                    int i7 = (i5 - 1) * 8;
                    while (i7 >= i6) {
                        bArr[i2] = (byte) ((int) ((j >>> i7) & 255));
                        i7 -= 8;
                        i2++;
                    }
                    i += this.f9052f.f9047e;
                }
                return i2;
            }
            int length = m.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new DecodingException(sb.toString());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C6887d)) {
                return false;
            }
            C6887d dVar = (C6887d) obj;
            if (!this.f9052f.equals(dVar.f9052f) || !C8007k.m15735a(this.f9053g, dVar.f9053g)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo39701h(Appendable appendable, byte[] bArr, int i, int i2) {
            C8012n.m15755n(appendable);
            C8012n.m15760s(i, i + i2, bArr.length);
            int i3 = 0;
            while (i3 < i2) {
                mo39718o(appendable, bArr, i + i3, Math.min(this.f9052f.f9048f, i2 - i3));
                i3 += this.f9052f.f9048f;
            }
        }

        public int hashCode() {
            return this.f9052f.hashCode() ^ C8007k.m15736b(this.f9053g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo39702j(int i) {
            return (int) (((((long) this.f9052f.f9046d) * ((long) i)) + 7) / 8);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public int mo39703k(int i) {
            C6884a aVar = this.f9052f;
            return aVar.f9047e * C8420a.m16838a(i, aVar.f9048f, RoundingMode.CEILING);
        }

        /* renamed from: l */
        public BaseEncoding mo39704l() {
            if (this.f9053g == null) {
                return this;
            }
            return mo39715p(this.f9052f, (Character) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public CharSequence mo39705m(CharSequence charSequence) {
            C8012n.m15755n(charSequence);
            Character ch = this.f9053g;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        /* renamed from: n */
        public BaseEncoding mo39706n() {
            BaseEncoding baseEncoding = this.f9054h;
            if (baseEncoding == null) {
                C6884a h = this.f9052f.mo39712h();
                if (h == this.f9052f) {
                    baseEncoding = this;
                } else {
                    baseEncoding = mo39715p(h, this.f9053g);
                }
                this.f9054h = baseEncoding;
            }
            return baseEncoding;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo39718o(Appendable appendable, byte[] bArr, int i, int i2) {
            boolean z;
            C8012n.m15755n(appendable);
            C8012n.m15760s(i, i + i2, bArr.length);
            int i3 = 0;
            if (i2 <= this.f9052f.f9048f) {
                z = true;
            } else {
                z = false;
            }
            C8012n.m15745d(z);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | ((long) (bArr[i + i4] & 255))) << 8;
            }
            int i5 = ((i2 + 1) * 8) - this.f9052f.f9046d;
            while (i3 < i2 * 8) {
                C6884a aVar = this.f9052f;
                appendable.append(aVar.mo39708c(((int) (j >>> (i5 - i3))) & aVar.f9045c));
                i3 += this.f9052f.f9046d;
            }
            if (this.f9053g != null) {
                while (i3 < this.f9052f.f9048f * 8) {
                    appendable.append(this.f9053g.charValue());
                    i3 += this.f9052f.f9046d;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public BaseEncoding mo39715p(C6884a aVar, Character ch) {
            return new C6887d(aVar, ch);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f9052f.toString());
            if (8 % this.f9052f.f9046d != 0) {
                if (this.f9053g == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f9053g);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        C6887d(C6884a aVar, Character ch) {
            this.f9052f = (C6884a) C8012n.m15755n(aVar);
            C8012n.m15751j(ch == null || !aVar.mo39711g(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.f9053g = ch;
        }
    }

    BaseEncoding() {
    }

    /* renamed from: a */
    public static BaseEncoding m11899a() {
        return f9042e;
    }

    /* renamed from: b */
    public static BaseEncoding m11900b() {
        return f9038a;
    }

    /* renamed from: i */
    private static byte[] m11901i(byte[] bArr, int i) {
        if (i == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    /* renamed from: c */
    public final byte[] mo39696c(CharSequence charSequence) {
        try {
            return mo39697d(charSequence);
        } catch (DecodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final byte[] mo39697d(CharSequence charSequence) {
        CharSequence m = mo39705m(charSequence);
        byte[] bArr = new byte[mo39702j(m.length())];
        return m11901i(bArr, mo39698e(bArr, m));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo39698e(byte[] bArr, CharSequence charSequence);

    /* renamed from: f */
    public String mo39699f(byte[] bArr) {
        return mo39700g(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public final String mo39700g(byte[] bArr, int i, int i2) {
        C8012n.m15760s(i, i + i2, bArr.length);
        StringBuilder sb = new StringBuilder(mo39703k(i2));
        try {
            mo39701h(sb, bArr, i, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo39701h(Appendable appendable, byte[] bArr, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract int mo39702j(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract int mo39703k(int i);

    /* renamed from: l */
    public abstract BaseEncoding mo39704l();

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract CharSequence mo39705m(CharSequence charSequence);

    /* renamed from: n */
    public abstract BaseEncoding mo39706n();
}
