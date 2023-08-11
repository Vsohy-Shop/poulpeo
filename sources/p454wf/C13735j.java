package p454wf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12771l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13074a;
import p448vf.C13650g;

/* renamed from: wf.j */
/* compiled from: Regex.kt */
public final class C13735j implements Serializable {

    /* renamed from: c */
    public static final C13736a f22177c = new C13736a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final Pattern f22178b;

    /* renamed from: wf.j$a */
    /* compiled from: Regex.kt */
    public static final class C13736a {
        private C13736a() {
        }

        public /* synthetic */ C13736a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: wf.j$b */
    /* compiled from: Regex.kt */
    private static final class C13737b implements Serializable {

        /* renamed from: d */
        public static final C13738a f22179d = new C13738a((DefaultConstructorMarker) null);
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private final String f22180b;

        /* renamed from: c */
        private final int f22181c;

        /* renamed from: wf.j$b$a */
        /* compiled from: Regex.kt */
        public static final class C13738a {
            private C13738a() {
            }

            public /* synthetic */ C13738a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C13737b(String str, int i) {
            C12775o.m28639i(str, "pattern");
            this.f22180b = str;
            this.f22181c = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f22180b, this.f22181c);
            C12775o.m28638h(compile, "compile(pattern, flags)");
            return new C13735j(compile);
        }
    }

    /* renamed from: wf.j$c */
    /* compiled from: Regex.kt */
    static final class C13739c extends C12777p implements C13074a<C13731h> {

        /* renamed from: g */
        final /* synthetic */ C13735j f22182g;

        /* renamed from: h */
        final /* synthetic */ CharSequence f22183h;

        /* renamed from: i */
        final /* synthetic */ int f22184i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13739c(C13735j jVar, CharSequence charSequence, int i) {
            super(0);
            this.f22182g = jVar;
            this.f22183h = charSequence;
            this.f22184i = i;
        }

        /* renamed from: b */
        public final C13731h invoke() {
            return this.f22182g.mo53410a(this.f22183h, this.f22184i);
        }
    }

    /* renamed from: wf.j$d */
    /* compiled from: Regex.kt */
    /* synthetic */ class C13740d extends C12771l implements Function1<C13731h, C13731h> {

        /* renamed from: b */
        public static final C13740d f22185b = new C13740d();

        C13740d() {
            super(1, C13731h.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        /* renamed from: b */
        public final C13731h invoke(C13731h hVar) {
            C12775o.m28639i(hVar, "p0");
            return hVar.next();
        }
    }

    public C13735j(Pattern pattern) {
        C12775o.m28639i(pattern, "nativePattern");
        this.f22178b = pattern;
    }

    /* renamed from: b */
    public static /* synthetic */ C13731h m31438b(C13735j jVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return jVar.mo53410a(charSequence, i);
    }

    /* renamed from: d */
    public static /* synthetic */ C13650g m31439d(C13735j jVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return jVar.mo53411c(charSequence, i);
    }

    private final Object writeReplace() {
        String pattern = this.f22178b.pattern();
        C12775o.m28638h(pattern, "nativePattern.pattern()");
        return new C13737b(pattern, this.f22178b.flags());
    }

    /* renamed from: a */
    public final C13731h mo53410a(CharSequence charSequence, int i) {
        C12775o.m28639i(charSequence, "input");
        Matcher matcher = this.f22178b.matcher(charSequence);
        C12775o.m28638h(matcher, "nativePattern.matcher(input)");
        return C13741k.m31451d(matcher, i, charSequence);
    }

    /* renamed from: c */
    public final C13650g<C13731h> mo53411c(CharSequence charSequence, int i) {
        C12775o.m28639i(charSequence, "input");
        if (i >= 0 && i <= charSequence.length()) {
            return C13657m.m31274h(new C13739c(this, charSequence, i), C13740d.f22185b);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + charSequence.length());
    }

    /* renamed from: e */
    public final boolean mo53412e(CharSequence charSequence) {
        C12775o.m28639i(charSequence, "input");
        return this.f22178b.matcher(charSequence).matches();
    }

    /* renamed from: f */
    public final String mo53413f(CharSequence charSequence, String str) {
        C12775o.m28639i(charSequence, "input");
        C12775o.m28639i(str, "replacement");
        String replaceAll = this.f22178b.matcher(charSequence).replaceAll(str);
        C12775o.m28638h(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    /* renamed from: g */
    public final String mo53414g(CharSequence charSequence, String str) {
        C12775o.m28639i(charSequence, "input");
        C12775o.m28639i(str, "replacement");
        String replaceFirst = this.f22178b.matcher(charSequence).replaceFirst(str);
        C12775o.m28638h(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    /* renamed from: h */
    public final List<String> mo53415h(CharSequence charSequence, int i) {
        C12775o.m28639i(charSequence, "input");
        C13755w.m31589o0(i);
        Matcher matcher = this.f22178b.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return C12723v.m28509d(charSequence.toString());
        }
        int i2 = 10;
        if (i > 0) {
            i2 = C13537l.m30882i(i, 10);
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i - 1;
        int i4 = 0;
        do {
            arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            if ((i3 >= 0 && arrayList.size() == i3) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.f22178b.toString();
        C12775o.m28638h(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13735j(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.C12775o.m28638h(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p454wf.C13735j.<init>(java.lang.String):void");
    }
}
