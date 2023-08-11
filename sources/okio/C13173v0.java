package okio;

import java.security.MessageDigest;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p371jg.C12640j;

@SourceDebugExtension({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n+ 2 -SegmentedByteString.kt\nokio/internal/_SegmentedByteStringKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n60#2,12:141\n60#2,12:153\n101#2,2:165\n103#2,26:168\n132#2,5:194\n139#2:199\n142#2,3:200\n60#2,8:203\n145#2,6:211\n68#2,4:217\n151#2:221\n60#2,12:222\n155#2:234\n82#2,10:235\n156#2,9:245\n92#2,4:254\n165#2,2:258\n174#2,4:260\n82#2,10:264\n178#2,3:274\n92#2,4:277\n181#2:281\n190#2,8:282\n82#2,10:290\n198#2,3:300\n92#2,4:303\n201#2:307\n210#2,5:308\n82#2,10:313\n215#2,3:323\n92#2,4:326\n218#2:330\n221#2,4:331\n229#2,6:335\n60#2,8:341\n235#2,7:349\n68#2,4:356\n242#2,2:360\n1#3:167\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n*L\n54#1:141,12\n66#1:153,12\n78#1:165,2\n78#1:168,26\n80#1:194,5\n82#1:199\n84#1:200,3\n84#1:203,8\n84#1:211,6\n84#1:217,4\n84#1:221\n90#1:222,12\n96#1:234\n96#1:235,10\n96#1:245,9\n96#1:254,4\n96#1:258,2\n103#1:260,4\n103#1:264,10\n103#1:274,3\n103#1:277,4\n103#1:281\n110#1:282,8\n110#1:290,10\n110#1:300,3\n110#1:303,4\n110#1:307\n117#1:308,5\n117#1:313,10\n117#1:323,3\n117#1:326,4\n117#1:330\n131#1:331,4\n133#1:335,6\n133#1:341,8\n133#1:349,7\n133#1:356,4\n133#1:360,2\n78#1:167\n*E\n"})
/* renamed from: okio.v0 */
/* compiled from: SegmentedByteString.kt */
public final class C13173v0 extends C13133f {

    /* renamed from: g */
    private final transient byte[][] f20979g;

    /* renamed from: h */
    private final transient int[] f20980h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13173v0(byte[][] bArr, int[] iArr) {
        super(C13133f.f20904f.mo52604h());
        C12775o.m28639i(bArr, "segments");
        C12775o.m28639i(iArr, "directory");
        this.f20979g = bArr;
        this.f20980h = iArr;
    }

    /* renamed from: R */
    private final C13133f m29875R() {
        return new C13133f(mo52594M());
    }

    private final Object writeReplace() {
        C13133f R = m29875R();
        C12775o.m28637g(R, "null cannot be cast to non-null type java.lang.Object");
        return R;
    }

    /* renamed from: B */
    public boolean mo52585B(int i, byte[] bArr, int i2, int i3) {
        int i4;
        C12775o.m28639i(bArr, "other");
        if (i < 0 || i > mo52590H() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int b = C12640j.m28099b(this, i);
        while (i < i5) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = mo52723P()[b - 1];
            }
            int i6 = mo52723P()[mo52724Q().length + b];
            int min = Math.min(i5, (mo52723P()[b] - i4) + i4) - i;
            if (!C13132e1.m29638a(mo52724Q()[b], i6 + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }

    /* renamed from: J */
    public C13133f mo52592J(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int e = C13132e1.m29642e(this, i2);
        int i3 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (e <= mo52590H()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i4 = e - i;
                if (i4 >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException(("endIndex=" + e + " < beginIndex=" + i).toString());
                } else if (i == 0 && e == mo52590H()) {
                    return this;
                } else {
                    if (i == e) {
                        return C13133f.f20904f;
                    }
                    int b = C12640j.m28099b(this, i);
                    int b2 = C12640j.m28099b(this, e - 1);
                    byte[][] bArr = (byte[][]) C12708o.m28349p(mo52724Q(), b, b2 + 1);
                    int[] iArr = new int[(bArr.length * 2)];
                    if (b <= b2) {
                        int i5 = 0;
                        int i6 = b;
                        while (true) {
                            iArr[i5] = Math.min(mo52723P()[i6] - i, i4);
                            int i7 = i5 + 1;
                            iArr[i5 + bArr.length] = mo52723P()[mo52724Q().length + i6];
                            if (i6 == b2) {
                                break;
                            }
                            i6++;
                            i5 = i7;
                        }
                    }
                    if (b != 0) {
                        i3 = mo52723P()[b - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = iArr[length] + (i - i3);
                    return new C13173v0(bArr, iArr);
                }
            } else {
                throw new IllegalArgumentException(("endIndex=" + e + " > length(" + mo52590H() + ')').toString());
            }
        } else {
            throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
        }
    }

    /* renamed from: L */
    public C13133f mo52593L() {
        return m29875R().mo52593L();
    }

    /* renamed from: M */
    public byte[] mo52594M() {
        byte[] bArr = new byte[mo52590H()];
        int length = mo52724Q().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = mo52723P()[length + i];
            int i5 = mo52723P()[i];
            int i6 = i5 - i2;
            byte[] unused = C12708o.m28337d(mo52724Q()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    /* renamed from: O */
    public void mo52596O(C13121c cVar, int i, int i2) {
        int i3;
        C12775o.m28639i(cVar, "buffer");
        int i4 = i + i2;
        int b = C12640j.m28099b(this, i);
        while (i < i4) {
            if (b == 0) {
                i3 = 0;
            } else {
                i3 = mo52723P()[b - 1];
            }
            int i5 = mo52723P()[mo52724Q().length + b];
            int min = Math.min(i4, (mo52723P()[b] - i3) + i3) - i;
            int i6 = i5 + (i - i3);
            C13168t0 t0Var = new C13168t0(mo52724Q()[b], i6, i6 + min, true, false);
            C13168t0 t0Var2 = cVar.f20888b;
            if (t0Var2 == null) {
                t0Var.f20973g = t0Var;
                t0Var.f20972f = t0Var;
                cVar.f20888b = t0Var;
            } else {
                C12775o.m28636f(t0Var2);
                C13168t0 t0Var3 = t0Var2.f20973g;
                C12775o.m28636f(t0Var3);
                t0Var3.mo52718c(t0Var);
            }
            i += min;
            b++;
        }
        cVar.mo52483C0(cVar.size() + ((long) i2));
    }

    /* renamed from: P */
    public final int[] mo52723P() {
        return this.f20980h;
    }

    /* renamed from: Q */
    public final byte[][] mo52724Q() {
        return this.f20979g;
    }

    /* renamed from: a */
    public String mo52597a() {
        return m29875R().mo52597a();
    }

    /* renamed from: d */
    public C13133f mo52600d(String str) {
        C12775o.m28639i(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = mo52724Q().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = mo52723P()[length + i];
            int i4 = mo52723P()[i];
            instance.update(mo52724Q()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
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
            if (fVar.mo52590H() == mo52590H() && mo52618w(0, fVar, 0, mo52590H())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = mo52606i();
        if (i != 0) {
            return i;
        }
        int length = mo52724Q().length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int i5 = mo52723P()[length + i2];
            int i6 = mo52723P()[i2];
            byte[] bArr = mo52724Q()[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        mo52586C(i3);
        return i3;
    }

    /* renamed from: j */
    public int mo52607j() {
        return mo52723P()[mo52724Q().length - 1];
    }

    /* renamed from: l */
    public String mo52609l() {
        return m29875R().mo52609l();
    }

    /* renamed from: n */
    public int mo52611n(byte[] bArr, int i) {
        C12775o.m28639i(bArr, "other");
        return m29875R().mo52611n(bArr, i);
    }

    /* renamed from: p */
    public byte[] mo52612p() {
        return mo52594M();
    }

    /* renamed from: q */
    public byte mo52613q(int i) {
        int i2;
        C13132e1.m29639b((long) mo52723P()[mo52724Q().length - 1], (long) i, 1);
        int b = C12640j.m28099b(this, i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = mo52723P()[b - 1];
        }
        return mo52724Q()[b][(i - i2) + mo52723P()[mo52724Q().length + b]];
    }

    /* renamed from: s */
    public int mo52615s(byte[] bArr, int i) {
        C12775o.m28639i(bArr, "other");
        return m29875R().mo52615s(bArr, i);
    }

    public String toString() {
        return m29875R().toString();
    }

    /* renamed from: w */
    public boolean mo52618w(int i, C13133f fVar, int i2, int i3) {
        int i4;
        C12775o.m28639i(fVar, "other");
        if (i < 0 || i > mo52590H() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int b = C12640j.m28099b(this, i);
        while (i < i5) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = mo52723P()[b - 1];
            }
            int i6 = mo52723P()[mo52724Q().length + b];
            int min = Math.min(i5, (mo52723P()[b] - i4) + i4) - i;
            if (!fVar.mo52585B(i2, mo52724Q()[b], i6 + (i - i4), min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }
}
