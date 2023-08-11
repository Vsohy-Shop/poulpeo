package p454wf;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: wf.o */
/* compiled from: Indent.kt */
class C13745o extends C13744n {

    /* renamed from: wf.o$a */
    /* compiled from: Indent.kt */
    static final class C13746a extends C12777p implements Function1<String, String> {

        /* renamed from: g */
        public static final C13746a f22188g = new C13746a();

        C13746a() {
            super(1);
        }

        /* renamed from: b */
        public final String invoke(String str) {
            C12775o.m28639i(str, "line");
            return str;
        }
    }

    /* renamed from: wf.o$b */
    /* compiled from: Indent.kt */
    static final class C13747b extends C12777p implements Function1<String, String> {

        /* renamed from: g */
        final /* synthetic */ String f22189g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13747b(String str) {
            super(1);
            this.f22189g = str;
        }

        /* renamed from: b */
        public final String invoke(String str) {
            C12775o.m28639i(str, "line");
            return this.f22189g + str;
        }
    }

    /* renamed from: b */
    private static final Function1<String, String> m31507b(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C13746a.f22188g;
        }
        return new C13747b(str);
    }

    /* renamed from: c */
    private static final int m31508c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!C13724b.m31417c(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return str.length();
        }
        return i;
    }

    /* renamed from: d */
    public static final String m31509d(String str, String str2) {
        int i;
        String invoke;
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(str2, "newIndent");
        List<String> e0 = C13755w.m31579e0(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object next : e0) {
            if (!C13754v.m31532t((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C12728x.m28544v(arrayList, 10));
        for (String c : arrayList) {
            arrayList2.add(Integer.valueOf(m31508c(c)));
        }
        Integer num = (Integer) C12686e0.m28234m0(arrayList2);
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int length = str.length() + (str2.length() * e0.size());
        Function1<String, String> b = m31507b(str2);
        int m = C12726w.m28526m(e0);
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : e0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C12726w.m28534u();
            }
            String str3 = (String) next2;
            if ((i2 == 0 || i2 == m) && C13754v.m31532t(str3)) {
                str3 = null;
            } else {
                String P0 = C13760y.m31604P0(str3, i);
                if (!(P0 == null || (invoke = b.invoke(P0)) == null)) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i2 = i3;
        }
        String sb = ((StringBuilder) C12686e0.m28227f0(arrayList3, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 124, (Object) null)).toString();
        C12775o.m28638h(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    /* renamed from: e */
    public static final String m31510e(String str, String str2, String str3) {
        int i;
        String invoke;
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(str2, "newIndent");
        C12775o.m28639i(str3, "marginPrefix");
        if (!C13754v.m31532t(str3)) {
            List<String> e0 = C13755w.m31579e0(str);
            int length = str.length() + (str2.length() * e0.size());
            Function1<String, String> b = m31507b(str2);
            int m = C12726w.m28526m(e0);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object next : e0) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C12726w.m28534u();
                }
                String str4 = (String) next;
                String str5 = null;
                if ((i2 == 0 || i2 == m) && C13754v.m31532t(str4)) {
                    str4 = null;
                } else {
                    int length2 = str4.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i = -1;
                            break;
                        } else if (!C13724b.m31417c(str4.charAt(i4))) {
                            i = i4;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i != -1) {
                        int i5 = i;
                        if (C13754v.m31524D(str4, str3, i, false, 4, (Object) null)) {
                            C12775o.m28637g(str4, "null cannot be cast to non-null type java.lang.String");
                            str5 = str4.substring(i5 + str3.length());
                            C12775o.m28638h(str5, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                    if (!(str5 == null || (invoke = b.invoke(str5)) == null)) {
                        str4 = invoke;
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i2 = i3;
            }
            String sb = ((StringBuilder) C12686e0.m28227f0(arrayList, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 124, (Object) null)).toString();
            C12775o.m28638h(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    /* renamed from: f */
    public static String m31511f(String str) {
        C12775o.m28639i(str, "<this>");
        return m31509d(str, "");
    }

    /* renamed from: g */
    public static final String m31512g(String str, String str2) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(str2, "marginPrefix");
        return m31510e(str, "", str2);
    }

    /* renamed from: h */
    public static /* synthetic */ String m31513h(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return m31512g(str, str2);
    }
}
