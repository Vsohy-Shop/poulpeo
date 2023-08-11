package okio;

import com.adjust.sdk.Constants;
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p371jg.C12637g;

@SourceDebugExtension({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString\n+ 2 -ByteString.kt\nokio/internal/_ByteStringKt\n+ 3 -Util.kt\nokio/_UtilKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n41#2,7:364\n51#2:371\n54#2:372\n62#2,4:373\n66#2:378\n68#2:380\n74#2,23:381\n102#2,23:404\n129#2,2:427\n131#2,9:430\n143#2:439\n146#2:440\n149#2:441\n152#2:442\n160#2:443\n170#2,3:444\n169#2:447\n183#2,2:448\n188#2:450\n192#2:451\n196#2:452\n200#2:453\n204#2,7:454\n217#2:461\n221#2,8:462\n233#2,4:470\n242#2,5:474\n251#2,6:479\n257#2,9:486\n320#2,8:495\n129#2,2:503\n131#2,9:506\n331#2,9:515\n66#3:377\n72#3:379\n72#3:485\n1#4:429\n1#4:505\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString\n*L\n66#1:364,7\n71#1:371\n108#1:372\n110#1:373,4\n110#1:378\n110#1:380\n112#1:381,23\n114#1:404,23\n118#1:427,2\n118#1:430,9\n120#1:439\n128#1:440\n130#1:441\n132#1:442\n151#1:443\n158#1:444,3\n158#1:447\n165#1:448,2\n167#1:450\n169#1:451\n171#1:452\n173#1:453\n179#1:454,7\n182#1:461\n185#1:462,8\n187#1:470,4\n189#1:474,5\n191#1:479,6\n191#1:486,9\n193#1:495,8\n193#1:503,2\n193#1:506,9\n193#1:515,9\n110#1:377\n110#1:379\n191#1:485\n118#1:429\n193#1:505\n*E\n"})
/* renamed from: okio.f */
/* compiled from: ByteString.kt */
public class C13133f implements Serializable, Comparable<C13133f> {

    /* renamed from: e */
    public static final C13134a f20903e = new C13134a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final C13133f f20904f = new C13133f(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    private final byte[] f20905b;

    /* renamed from: c */
    private transient int f20906c;

    /* renamed from: d */
    private transient String f20907d;

    @SourceDebugExtension({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n+ 2 -ByteString.kt\nokio/internal/_ByteStringKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n269#2:364\n273#2,3:365\n280#2,3:368\n287#2,2:371\n293#2:373\n295#2,7:375\n1#3:374\n1#3:382\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n*L\n233#1:364\n238#1:365,3\n250#1:368,3\n258#1:371,2\n261#1:373\n261#1:375,7\n261#1:374\n*E\n"})
    /* renamed from: okio.f$a */
    /* compiled from: ByteString.kt */
    public static final class C13134a {
        private C13134a() {
        }

        public /* synthetic */ C13134a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: g */
        public static /* synthetic */ C13133f m29686g(C13134a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = C13132e1.m29640c();
            }
            return aVar.mo52624f(bArr, i, i2);
        }

        /* renamed from: a */
        public final C13133f mo52619a(String str) {
            C12775o.m28639i(str, "<this>");
            byte[] a = C13126c1.m29598a(str);
            if (a != null) {
                return new C13133f(a);
            }
            return null;
        }

        /* renamed from: b */
        public final C13133f mo52620b(String str) {
            boolean z;
            C12775o.m28639i(str, "<this>");
            if (str.length() % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) ((C12637g.m28074e(str.charAt(i2)) << 4) + C12637g.m28074e(str.charAt(i2 + 1)));
                }
                return new C13133f(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        /* renamed from: c */
        public final C13133f mo52621c(String str, Charset charset) {
            C12775o.m28639i(str, "<this>");
            C12775o.m28639i(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            C12775o.m28638h(bytes, "this as java.lang.String).getBytes(charset)");
            return new C13133f(bytes);
        }

        /* renamed from: d */
        public final C13133f mo52622d(String str) {
            C12775o.m28639i(str, "<this>");
            C13133f fVar = new C13133f(C13129d1.m29611a(str));
            fVar.mo52587D(str);
            return fVar;
        }

        /* renamed from: e */
        public final C13133f mo52623e(byte... bArr) {
            C12775o.m28639i(bArr, "data");
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            C12775o.m28638h(copyOf, "copyOf(this, size)");
            return new C13133f(copyOf);
        }

        /* renamed from: f */
        public final C13133f mo52624f(byte[] bArr, int i, int i2) {
            C12775o.m28639i(bArr, "<this>");
            int f = C13132e1.m29643f(bArr, i2);
            C13132e1.m29639b((long) bArr.length, (long) i, (long) f);
            return new C13133f(C12708o.m28347n(bArr, i, f + i));
        }

        /* renamed from: h */
        public final C13133f mo52625h(InputStream inputStream, int i) {
            boolean z;
            C12775o.m28639i(inputStream, "<this>");
            int i2 = 0;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new C13133f(bArr);
            }
            throw new IllegalArgumentException(("byteCount < 0: " + i).toString());
        }
    }

    public C13133f(byte[] bArr) {
        C12775o.m28639i(bArr, "data");
        this.f20905b = bArr;
    }

    /* renamed from: K */
    public static /* synthetic */ C13133f m29650K(C13133f fVar, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = C13132e1.m29640c();
            }
            return fVar.mo52592J(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    /* renamed from: c */
    public static final C13133f m29651c(String str) {
        return f20903e.mo52619a(str);
    }

    /* renamed from: e */
    public static final C13133f m29652e(String str) {
        return f20903e.mo52622d(str);
    }

    /* renamed from: o */
    public static /* synthetic */ int m29653o(C13133f fVar, C13133f fVar2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return fVar.mo52610m(fVar2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        C13133f h = f20903e.mo52625h(objectInputStream, objectInputStream.readInt());
        Field declaredField = C13133f.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this, h.f20905b);
    }

    /* renamed from: t */
    public static /* synthetic */ int m29654t(C13133f fVar, C13133f fVar2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = C13132e1.m29640c();
            }
            return fVar.mo52614r(fVar2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    /* renamed from: v */
    public static final C13133f m29655v(byte... bArr) {
        return f20903e.mo52623e(bArr);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f20905b.length);
        objectOutputStream.write(this.f20905b);
    }

    /* renamed from: B */
    public boolean mo52585B(int i, byte[] bArr, int i2, int i3) {
        C12775o.m28639i(bArr, "other");
        if (i < 0 || i > mo52604h().length - i3 || i2 < 0 || i2 > bArr.length - i3 || !C13132e1.m29638a(mo52604h(), i, bArr, i2, i3)) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final void mo52586C(int i) {
        this.f20906c = i;
    }

    /* renamed from: D */
    public final void mo52587D(String str) {
        this.f20907d = str;
    }

    /* renamed from: E */
    public final C13133f mo52588E() {
        return mo52600d(Constants.SHA1);
    }

    /* renamed from: F */
    public final C13133f mo52589F() {
        return mo52600d(Constants.SHA256);
    }

    /* renamed from: H */
    public final int mo52590H() {
        return mo52607j();
    }

    /* renamed from: I */
    public final boolean mo52591I(C13133f fVar) {
        C12775o.m28639i(fVar, "prefix");
        return mo52618w(0, fVar, 0, fVar.mo52590H());
    }

    /* renamed from: J */
    public C13133f mo52592J(int i, int i2) {
        boolean z;
        boolean z2;
        int e = C13132e1.m29642e(this, i2);
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (e <= mo52604h().length) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (e - i < 0) {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                } else if (i == 0 && e == mo52604h().length) {
                    return this;
                } else {
                    return new C13133f(C12708o.m28347n(mo52604h(), i, e));
                }
            } else {
                throw new IllegalArgumentException(("endIndex > length(" + mo52604h().length + ')').toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
    }

    /* renamed from: L */
    public C13133f mo52593L() {
        int i = 0;
        while (i < mo52604h().length) {
            byte b = mo52604h()[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] h = mo52604h();
                byte[] copyOf = Arrays.copyOf(h, h.length);
                C12775o.m28638h(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C13133f(copyOf);
            }
        }
        return this;
    }

    /* renamed from: M */
    public byte[] mo52594M() {
        byte[] h = mo52604h();
        byte[] copyOf = Arrays.copyOf(h, h.length);
        C12775o.m28638h(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: N */
    public String mo52595N() {
        String k = mo52608k();
        if (k != null) {
            return k;
        }
        String c = C13129d1.m29613c(mo52612p());
        mo52587D(c);
        return c;
    }

    /* renamed from: O */
    public void mo52596O(C13121c cVar, int i, int i2) {
        C12775o.m28639i(cVar, "buffer");
        C12637g.m28073d(this, cVar, i, i2);
    }

    /* renamed from: a */
    public String mo52597a() {
        return C13126c1.m29600c(mo52604h(), (byte[]) null, 1, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r7 < r8) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r0 < r1) goto L_0x0030;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(okio.C13133f r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            int r0 = r9.mo52590H()
            int r1 = r10.mo52590H()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.mo52603g(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.mo52603g(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x0032
            goto L_0x0030
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            if (r0 >= r1) goto L_0x0032
        L_0x0030:
            r3 = r5
            goto L_0x0033
        L_0x0032:
            r3 = r6
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C13133f.compareTo(okio.f):int");
    }

    /* renamed from: d */
    public C13133f mo52600d(String str) {
        C12775o.m28639i(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(this.f20905b, 0, mo52590H());
        byte[] digest = instance.digest();
        C12775o.m28638h(digest, "digestBytes");
        return new C13133f(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13133f) {
            C13133f fVar = (C13133f) obj;
            if (fVar.mo52590H() == mo52604h().length && fVar.mo52585B(0, mo52604h(), 0, mo52604h().length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo52602f(C13133f fVar) {
        C12775o.m28639i(fVar, "suffix");
        return mo52618w(mo52590H() - fVar.mo52590H(), fVar, 0, fVar.mo52590H());
    }

    /* renamed from: g */
    public final byte mo52603g(int i) {
        return mo52613q(i);
    }

    /* renamed from: h */
    public final byte[] mo52604h() {
        return this.f20905b;
    }

    public int hashCode() {
        int i = mo52606i();
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(mo52604h());
        mo52586C(hashCode);
        return hashCode;
    }

    /* renamed from: i */
    public final int mo52606i() {
        return this.f20906c;
    }

    /* renamed from: j */
    public int mo52607j() {
        return mo52604h().length;
    }

    /* renamed from: k */
    public final String mo52608k() {
        return this.f20907d;
    }

    /* renamed from: l */
    public String mo52609l() {
        char[] cArr = new char[(mo52604h().length * 2)];
        int i = 0;
        for (byte b : mo52604h()) {
            int i2 = i + 1;
            cArr[i] = C12637g.m28075f()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = C12637g.m28075f()[b & 15];
        }
        return C13754v.m31526n(cArr);
    }

    /* renamed from: m */
    public final int mo52610m(C13133f fVar, int i) {
        C12775o.m28639i(fVar, "other");
        return mo52611n(fVar.mo52612p(), i);
    }

    /* renamed from: n */
    public int mo52611n(byte[] bArr, int i) {
        C12775o.m28639i(bArr, "other");
        int length = mo52604h().length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!C13132e1.m29638a(mo52604h(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    /* renamed from: p */
    public byte[] mo52612p() {
        return mo52604h();
    }

    /* renamed from: q */
    public byte mo52613q(int i) {
        return mo52604h()[i];
    }

    /* renamed from: r */
    public final int mo52614r(C13133f fVar, int i) {
        C12775o.m28639i(fVar, "other");
        return mo52615s(fVar.mo52612p(), i);
    }

    /* renamed from: s */
    public int mo52615s(byte[] bArr, int i) {
        C12775o.m28639i(bArr, "other");
        for (int min = Math.min(C13132e1.m29642e(this, i), mo52604h().length - bArr.length); -1 < min; min--) {
            if (C13132e1.m29638a(mo52604h(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public String toString() {
        boolean z;
        boolean z2;
        C13133f fVar;
        String str;
        boolean z3 = true;
        if (mo52604h().length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "[size=0]";
        } else {
            int a = C12637g.m28072c(mo52604h(), 64);
            if (a != -1) {
                String N = mo52595N();
                String substring = N.substring(0, a);
                C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String A = C13754v.m31521A(C13754v.m31521A(C13754v.m31521A(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                if (a < N.length()) {
                    return "[size=" + mo52604h().length + " text=" + A + "…]";
                }
                return "[text=" + A + ']';
            } else if (mo52604h().length <= 64) {
                str = "[hex=" + mo52609l() + ']';
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("[size=");
                sb.append(mo52604h().length);
                sb.append(" hex=");
                int e = C13132e1.m29642e(this, 64);
                if (e <= mo52604h().length) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (e + 0 < 0) {
                        z3 = false;
                    }
                    if (z3) {
                        if (e == mo52604h().length) {
                            fVar = this;
                        } else {
                            fVar = new C13133f(C12708o.m28347n(mo52604h(), 0, e));
                        }
                        sb.append(fVar.mo52609l());
                        sb.append("…]");
                        return sb.toString();
                    }
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                }
                throw new IllegalArgumentException(("endIndex > length(" + mo52604h().length + ')').toString());
            }
        }
        return str;
    }

    /* renamed from: u */
    public final C13133f mo52617u() {
        return mo52600d(Constants.MD5);
    }

    /* renamed from: w */
    public boolean mo52618w(int i, C13133f fVar, int i2, int i3) {
        C12775o.m28639i(fVar, "other");
        return fVar.mo52585B(i2, mo52604h(), i, i3);
    }
}
