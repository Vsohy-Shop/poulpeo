package p454wf;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C12703l0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11906l;
import p336ef.C11915r;
import p404of.C13088o;
import p436tf.C13525d;
import p436tf.C13528f;
import p448vf.C13650g;

/* renamed from: wf.w */
/* compiled from: Strings.kt */
class C13755w extends C13754v {

    /* renamed from: wf.w$a */
    /* compiled from: Strings.kt */
    static final class C13756a extends C12777p implements C13088o<CharSequence, Integer, C11906l<? extends Integer, ? extends Integer>> {

        /* renamed from: g */
        final /* synthetic */ char[] f22190g;

        /* renamed from: h */
        final /* synthetic */ boolean f22191h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13756a(char[] cArr, boolean z) {
            super(2);
            this.f22190g = cArr;
            this.f22191h = z;
        }

        /* renamed from: a */
        public final C11906l<Integer, Integer> mo53421a(CharSequence charSequence, int i) {
            C12775o.m28639i(charSequence, "$this$$receiver");
            int X = C13755w.m31572X(charSequence, this.f22190g, i, this.f22191h);
            if (X < 0) {
                return null;
            }
            return C11915r.m25707a(Integer.valueOf(X), 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo53421a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: wf.w$b */
    /* compiled from: Strings.kt */
    static final class C13757b extends C12777p implements C13088o<CharSequence, Integer, C11906l<? extends Integer, ? extends Integer>> {

        /* renamed from: g */
        final /* synthetic */ List<String> f22192g;

        /* renamed from: h */
        final /* synthetic */ boolean f22193h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13757b(List<String> list, boolean z) {
            super(2);
            this.f22192g = list;
            this.f22193h = z;
        }

        /* renamed from: a */
        public final C11906l<Integer, Integer> mo53422a(CharSequence charSequence, int i) {
            C12775o.m28639i(charSequence, "$this$$receiver");
            C11906l F = C13755w.m31562O(charSequence, this.f22192g, i, this.f22193h, false);
            if (F != null) {
                return C11915r.m25707a(F.mo49111c(), Integer.valueOf(((String) F.mo49112d()).length()));
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo53422a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: wf.w$c */
    /* compiled from: Strings.kt */
    static final class C13758c extends C12777p implements Function1<C13528f, String> {

        /* renamed from: g */
        final /* synthetic */ CharSequence f22194g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13758c(CharSequence charSequence) {
            super(1);
            this.f22194g = charSequence;
        }

        /* renamed from: a */
        public final String invoke(C13528f fVar) {
            C12775o.m28639i(fVar, "it");
            return C13755w.m31539A0(this.f22194g, fVar);
        }
    }

    /* renamed from: A0 */
    public static final String m31539A0(CharSequence charSequence, C13528f fVar) {
        C12775o.m28639i(charSequence, "<this>");
        C12775o.m28639i(fVar, "range");
        return charSequence.subSequence(fVar.getStart().intValue(), fVar.getEndInclusive().intValue() + 1).toString();
    }

    /* renamed from: B0 */
    public static final String m31540B0(String str, char c, String str2) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(str2, "missingDelimiterValue");
        int V = m31570V(str, c, 0, false, 6, (Object) null);
        if (V == -1) {
            return str2;
        }
        String substring = str.substring(V + 1, str.length());
        C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: C0 */
    public static final String m31541C0(String str, String str2, String str3) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(str2, "delimiter");
        C12775o.m28639i(str3, "missingDelimiterValue");
        int W = m31571W(str, str2, 0, false, 6, (Object) null);
        if (W == -1) {
            return str3;
        }
        String substring = str.substring(W + str2.length(), str.length());
        C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: D0 */
    public static /* synthetic */ String m31542D0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m31540B0(str, c, str2);
    }

    /* renamed from: E0 */
    public static /* synthetic */ String m31543E0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m31541C0(str, str2, str3);
    }

    /* renamed from: F0 */
    public static String m31545F0(String str, char c, String str2) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(str2, "missingDelimiterValue");
        int a0 = m31575a0(str, c, 0, false, 6, (Object) null);
        if (a0 == -1) {
            return str2;
        }
        String substring = str.substring(a0 + 1, str.length());
        C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: G */
    public static final boolean m31546G(CharSequence charSequence, char c, boolean z) {
        C12775o.m28639i(charSequence, "<this>");
        if (m31570V(charSequence, c, 0, z, 2, (Object) null) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: G0 */
    public static /* synthetic */ String m31547G0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m31545F0(str, c, str2);
    }

    /* renamed from: H */
    public static boolean m31548H(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C12775o.m28639i(charSequence, "<this>");
        C12775o.m28639i(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m31571W(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (m31569U(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: H0 */
    public static String m31549H0(String str, char c, String str2) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(str2, "missingDelimiterValue");
        int V = m31570V(str, c, 0, false, 6, (Object) null);
        if (V == -1) {
            return str2;
        }
        String substring = str.substring(0, V);
        C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: I */
    public static /* synthetic */ boolean m31550I(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m31546G(charSequence, c, z);
    }

    /* renamed from: I0 */
    public static final String m31551I0(String str, String str2, String str3) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(str2, "delimiter");
        C12775o.m28639i(str3, "missingDelimiterValue");
        int W = m31571W(str, str2, 0, false, 6, (Object) null);
        if (W == -1) {
            return str3;
        }
        String substring = str.substring(0, W);
        C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: J */
    public static /* synthetic */ boolean m31552J(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m31548H(charSequence, charSequence2, z);
    }

    /* renamed from: J0 */
    public static /* synthetic */ String m31553J0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m31549H0(str, c, str2);
    }

    /* renamed from: K */
    public static final boolean m31554K(CharSequence charSequence, char c, boolean z) {
        C12775o.m28639i(charSequence, "<this>");
        if (charSequence.length() <= 0 || !C13725c.m31422h(charSequence.charAt(m31565Q(charSequence)), c, z)) {
            return false;
        }
        return true;
    }

    /* renamed from: K0 */
    public static /* synthetic */ String m31555K0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m31551I0(str, str2, str3);
    }

    /* renamed from: L */
    public static final boolean m31556L(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C12775o.m28639i(charSequence, "<this>");
        C12775o.m28639i(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C13754v.m31529q((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return m31584j0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: L0 */
    public static final String m31557L0(String str, char c, String str2) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(str2, "missingDelimiterValue");
        int a0 = m31575a0(str, c, 0, false, 6, (Object) null);
        if (a0 == -1) {
            return str2;
        }
        String substring = str.substring(0, a0);
        C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: M */
    public static /* synthetic */ boolean m31558M(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m31554K(charSequence, c, z);
    }

    /* renamed from: M0 */
    public static /* synthetic */ String m31559M0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m31557L0(str, c, str2);
    }

    /* renamed from: N */
    public static /* synthetic */ boolean m31560N(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m31556L(charSequence, charSequence2, z);
    }

    /* renamed from: N0 */
    public static CharSequence m31561N0(CharSequence charSequence) {
        int i;
        C12775o.m28639i(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean c = C13724b.m31417c(charSequence.charAt(i));
            if (!z) {
                if (!c) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!c) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public static final C11906l<Integer, String> m31562O(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        C13525d dVar;
        Object obj;
        Object obj2;
        int i2;
        if (z || collection.size() != 1) {
            if (!z2) {
                dVar = new C13528f(C13537l.m30877d(i, 0), charSequence.length());
            } else {
                dVar = C13537l.m30890q(C13537l.m30882i(i, m31565Q(charSequence)), 0);
            }
            if (charSequence instanceof String) {
                int j = dVar.mo53147j();
                int k = dVar.mo53148k();
                int q = dVar.mo53149q();
                if ((q > 0 && j <= k) || (q < 0 && k <= j)) {
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (C13754v.m31533u(str, 0, (String) charSequence, j, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (j == k) {
                                break;
                            }
                            j += q;
                        } else {
                            return C11915r.m25707a(Integer.valueOf(j), str2);
                        }
                    }
                }
            } else {
                int j2 = dVar.mo53147j();
                int k2 = dVar.mo53148k();
                int q2 = dVar.mo53149q();
                if ((q2 > 0 && j2 <= k2) || (q2 < 0 && k2 <= j2)) {
                    while (true) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (m31584j0(str3, 0, charSequence, j2, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (j2 == k2) {
                                break;
                            }
                            j2 += q2;
                        } else {
                            return C11915r.m25707a(Integer.valueOf(j2), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) C12686e0.m28238q0(collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i3 = i;
        if (!z2) {
            i2 = m31571W(charSequence2, str6, i3, false, 4, (Object) null);
        } else {
            i2 = m31576b0(charSequence2, str6, i3, false, 4, (Object) null);
        }
        if (i2 < 0) {
            return null;
        }
        return C11915r.m25707a(Integer.valueOf(i2), str5);
    }

    /* renamed from: O0 */
    public static CharSequence m31563O0(CharSequence charSequence) {
        C12775o.m28639i(charSequence, "<this>");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C13724b.m31417c(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    /* renamed from: P */
    public static C13528f m31564P(CharSequence charSequence) {
        C12775o.m28639i(charSequence, "<this>");
        return new C13528f(0, charSequence.length() - 1);
    }

    /* renamed from: Q */
    public static int m31565Q(CharSequence charSequence) {
        C12775o.m28639i(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: R */
    public static final int m31566R(CharSequence charSequence, char c, int i, boolean z) {
        C12775o.m28639i(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m31572X(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: S */
    public static final int m31567S(CharSequence charSequence, String str, int i, boolean z) {
        C12775o.m28639i(charSequence, "<this>");
        C12775o.m28639i(str, TypedValues.Custom.S_STRING);
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m31569U(charSequence, str, i, charSequence.length(), z, false, 16, (Object) null);
    }

    /* renamed from: T */
    private static final int m31568T(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C13525d dVar;
        if (!z2) {
            dVar = new C13528f(C13537l.m30877d(i, 0), C13537l.m30882i(i2, charSequence.length()));
        } else {
            dVar = C13537l.m30890q(C13537l.m30882i(i, m31565Q(charSequence)), C13537l.m30877d(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int j = dVar.mo53147j();
            int k = dVar.mo53148k();
            int q = dVar.mo53149q();
            if ((q <= 0 || j > k) && (q >= 0 || k > j)) {
                return -1;
            }
            while (true) {
                if (m31584j0(charSequence2, 0, charSequence, j, charSequence2.length(), z)) {
                    return j;
                }
                if (j == k) {
                    return -1;
                }
                j += q;
            }
        } else {
            int j2 = dVar.mo53147j();
            int k2 = dVar.mo53148k();
            int q2 = dVar.mo53149q();
            if ((q2 <= 0 || j2 > k2) && (q2 >= 0 || k2 > j2)) {
                return -1;
            }
            while (true) {
                if (C13754v.m31533u((String) charSequence2, 0, (String) charSequence, j2, charSequence2.length(), z)) {
                    return j2;
                }
                if (j2 == k2) {
                    return -1;
                }
                j2 += q2;
            }
        }
    }

    /* renamed from: U */
    static /* synthetic */ int m31569U(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return m31568T(charSequence, charSequence2, i, i2, z, z2);
    }

    /* renamed from: V */
    public static /* synthetic */ int m31570V(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m31566R(charSequence, c, i, z);
    }

    /* renamed from: W */
    public static /* synthetic */ int m31571W(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m31567S(charSequence, str, i, z);
    }

    /* renamed from: X */
    public static final int m31572X(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C12775o.m28639i(charSequence, "<this>");
        C12775o.m28639i(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            C12703l0 r = new C13528f(C13537l.m30877d(i, 0), m31565Q(charSequence)).iterator();
            while (r.hasNext()) {
                int nextInt = r.nextInt();
                char charAt = charSequence.charAt(nextInt);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        continue;
                        break;
                    } else if (C13725c.m31422h(cArr[i2], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return nextInt;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C12710p.m28397Y(cArr), i);
    }

    /* renamed from: Y */
    public static final int m31573Y(CharSequence charSequence, char c, int i, boolean z) {
        C12775o.m28639i(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m31577c0(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: Z */
    public static final int m31574Z(CharSequence charSequence, String str, int i, boolean z) {
        C12775o.m28639i(charSequence, "<this>");
        C12775o.m28639i(str, TypedValues.Custom.S_STRING);
        if (z || !(charSequence instanceof String)) {
            return m31568T(charSequence, str, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: a0 */
    public static /* synthetic */ int m31575a0(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m31565Q(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m31573Y(charSequence, c, i, z);
    }

    /* renamed from: b0 */
    public static /* synthetic */ int m31576b0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m31565Q(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m31574Z(charSequence, str, i, z);
    }

    /* renamed from: c0 */
    public static final int m31577c0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C12775o.m28639i(charSequence, "<this>");
        C12775o.m28639i(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int i2 = C13537l.m30882i(i, m31565Q(charSequence)); -1 < i2; i2--) {
                char charAt = charSequence.charAt(i2);
                int length = cArr.length;
                boolean z2 = false;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    } else if (C13725c.m31422h(cArr[i3], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z2) {
                    return i2;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C12710p.m28397Y(cArr), i);
    }

    /* renamed from: d0 */
    public static final C13650g<String> m31578d0(CharSequence charSequence) {
        C12775o.m28639i(charSequence, "<this>");
        return m31596v0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    /* renamed from: e0 */
    public static final List<String> m31579e0(CharSequence charSequence) {
        C12775o.m28639i(charSequence, "<this>");
        return C13662o.m31293z(m31578d0(charSequence));
    }

    /* renamed from: f0 */
    private static final C13650g<C13528f> m31580f0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        m31589o0(i2);
        return new C13727e(charSequence, i, i2, new C13756a(cArr, z));
    }

    /* renamed from: g0 */
    private static final C13650g<C13528f> m31581g0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        m31589o0(i2);
        return new C13727e(charSequence, i, i2, new C13757b(C12708o.m28336c(strArr), z));
    }

    /* renamed from: h0 */
    static /* synthetic */ C13650g m31582h0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m31580f0(charSequence, cArr, i, z, i2);
    }

    /* renamed from: i0 */
    static /* synthetic */ C13650g m31583i0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m31581g0(charSequence, strArr, i, z, i2);
    }

    /* renamed from: j0 */
    public static final boolean m31584j0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C12775o.m28639i(charSequence, "<this>");
        C12775o.m28639i(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C13725c.m31422h(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k0 */
    public static String m31585k0(String str, CharSequence charSequence) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(charSequence, "prefix");
        if (!m31600z0(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C12775o.m28638h(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: l0 */
    public static String m31586l0(String str, CharSequence charSequence) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(charSequence, "suffix");
        if (!m31560N(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: m0 */
    public static String m31587m0(String str, CharSequence charSequence) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(charSequence, "delimiter");
        return m31588n0(str, charSequence, charSequence);
    }

    /* renamed from: n0 */
    public static final String m31588n0(String str, CharSequence charSequence, CharSequence charSequence2) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(charSequence, "prefix");
        C12775o.m28639i(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !m31600z0(str, charSequence, false, 2, (Object) null) || !m31560N(str, charSequence2, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: o0 */
    public static final void m31589o0(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
        }
    }

    /* renamed from: p0 */
    public static final List<String> m31590p0(CharSequence charSequence, char[] cArr, boolean z, int i) {
        C12775o.m28639i(charSequence, "<this>");
        C12775o.m28639i(cArr, "delimiters");
        if (cArr.length == 1) {
            return m31592r0(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<C13528f> j = C13662o.m31277j(m31582h0(charSequence, cArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C12728x.m28544v(j, 10));
        for (C13528f A0 : j) {
            arrayList.add(m31539A0(charSequence, A0));
        }
        return arrayList;
    }

    /* renamed from: q0 */
    public static final List<String> m31591q0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C12775o.m28639i(charSequence, "<this>");
        C12775o.m28639i(strArr, "delimiters");
        boolean z2 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return m31592r0(charSequence, str, z, i);
            }
        }
        Iterable<C13528f> j = C13662o.m31277j(m31583i0(charSequence, strArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C12728x.m28544v(j, 10));
        for (C13528f A0 : j) {
            arrayList.add(m31539A0(charSequence, A0));
        }
        return arrayList;
    }

    /* renamed from: r0 */
    private static final List<String> m31592r0(CharSequence charSequence, String str, boolean z, int i) {
        boolean z2;
        m31589o0(i);
        int i2 = 0;
        int S = m31567S(charSequence, str, 0, z);
        if (S == -1 || i == 1) {
            return C12723v.m28509d(charSequence.toString());
        }
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = 10;
        if (z2) {
            i3 = C13537l.m30882i(i, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, S).toString());
            i2 = str.length() + S;
            if ((z2 && arrayList.size() == i - 1) || (S = m31567S(charSequence, str, i2, z)) == -1) {
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i2, S).toString());
            i2 = str.length() + S;
            break;
        } while ((S = m31567S(charSequence, str, i2, z)) == -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: s0 */
    public static /* synthetic */ List m31593s0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m31590p0(charSequence, cArr, z, i);
    }

    /* renamed from: t0 */
    public static /* synthetic */ List m31594t0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m31591q0(charSequence, strArr, z, i);
    }

    /* renamed from: u0 */
    public static final C13650g<String> m31595u0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C12775o.m28639i(charSequence, "<this>");
        C12775o.m28639i(strArr, "delimiters");
        return C13662o.m31287t(m31583i0(charSequence, strArr, 0, z, i, 2, (Object) null), new C13758c(charSequence));
    }

    /* renamed from: v0 */
    public static /* synthetic */ C13650g m31596v0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m31595u0(charSequence, strArr, z, i);
    }

    /* renamed from: w0 */
    public static final boolean m31597w0(CharSequence charSequence, char c, boolean z) {
        C12775o.m28639i(charSequence, "<this>");
        if (charSequence.length() <= 0 || !C13725c.m31422h(charSequence.charAt(0), c, z)) {
            return false;
        }
        return true;
    }

    /* renamed from: x0 */
    public static final boolean m31598x0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C12775o.m28639i(charSequence, "<this>");
        C12775o.m28639i(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C13754v.m31525E((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return m31584j0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: y0 */
    public static /* synthetic */ boolean m31599y0(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m31597w0(charSequence, c, z);
    }

    /* renamed from: z0 */
    public static /* synthetic */ boolean m31600z0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m31598x0(charSequence, charSequence2, z);
    }
}
