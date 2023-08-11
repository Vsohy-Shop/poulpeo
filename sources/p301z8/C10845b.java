package p301z8;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p027a9.C2239a;
import p290y8.C10716e;

/* renamed from: z8.b */
/* compiled from: NumericEntityDecoder.kt */
public final class C10845b extends C10716e {

    /* renamed from: b */
    public static final C10846a f16629b = new C10846a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private static final Set<C10847b> f16630c = C12729x0.m28549c(C10847b.SemiColonRequired);

    /* renamed from: a */
    private final Set<C10847b> f16631a;

    /* renamed from: z8.b$a */
    /* compiled from: NumericEntityDecoder.kt */
    public static final class C10846a {
        private C10846a() {
        }

        public /* synthetic */ C10846a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: z8.b$b */
    /* compiled from: NumericEntityDecoder.kt */
    public enum C10847b {
        SemiColonRequired,
        SemiColonOptional,
        ErrorIfNoSemiColon
    }

    public C10845b(C10847b... bVarArr) {
        boolean z;
        Set<C10847b> set;
        C12775o.m28639i(bVarArr, "options");
        if (bVarArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            set = f16630c;
        } else {
            set = C12731y0.m28555i(Arrays.copyOf(bVarArr, bVarArr.length));
        }
        this.f16631a = set;
    }

    /* renamed from: d */
    private final boolean m23125d(C10847b bVar) {
        return this.f16631a.contains(bVar);
    }

    /* renamed from: a */
    public int mo45638a(String str, int i, StringBuilder sb) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        C12775o.m28639i(str, "input");
        C12775o.m28639i(sb, "stringBuilder");
        int length = str.length();
        if (str.charAt(i) == '&' && i < length - 2 && str.charAt(i + 1) == '#') {
            int i5 = i + 2;
            char charAt = str.charAt(i5);
            if (charAt == 'x' || charAt == 'X') {
                i5++;
                if (i5 == length) {
                    return 0;
                }
                i2 = 1;
            } else {
                i2 = 0;
            }
            int i6 = i5;
            while (i6 < length) {
                char charAt2 = str.charAt(i6);
                if ('0' > charAt2 || charAt2 >= ':') {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    char charAt3 = str.charAt(i6);
                    if ('a' > charAt3 || charAt3 >= 'g') {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        char charAt4 = str.charAt(i6);
                        if ('A' > charAt4 || charAt4 >= 'G') {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (!z3) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i6++;
            }
            if (i6 == length || str.charAt(i6) != ';') {
                i3 = 0;
            } else {
                i3 = 1;
            }
            if (i3 == 0) {
                if (m23125d(C10847b.SemiColonRequired)) {
                    return 0;
                }
                if (m23125d(C10847b.ErrorIfNoSemiColon)) {
                    throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
                }
            }
            if (i2 != 0) {
                try {
                    i4 = Integer.parseInt(str.subSequence(i5, i6).toString(), C13724b.m31415a(16));
                } catch (NumberFormatException unused) {
                }
            } else {
                i4 = Integer.parseInt(str.subSequence(i5, i6).toString(), C13724b.m31415a(10));
            }
            if (i4 > 65535) {
                char[] e = C2239a.f1041a.mo23595e(i4);
                sb.append(e[0]);
                sb.append(e[1]);
            } else if (i4 < 0 || i4 > 65535) {
                throw new IllegalArgumentException("Invalid Char code: " + i4);
            } else {
                sb.append((char) i4);
            }
            return ((i6 + 2) - i5) + i2 + i3;
        }
        return 0;
    }
}
