package okio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p371jg.C12639i;

@SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/Path\n+ 2 -Path.kt\nokio/internal/_PathKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,128:1\n42#2,3:129\n50#2,28:132\n56#2,22:164\n109#2:186\n114#2:187\n119#2,6:188\n136#2,5:194\n146#2:199\n151#2,25:200\n191#2:225\n196#2,11:226\n201#2,6:237\n196#2,11:243\n201#2,6:254\n225#2,36:260\n265#2:296\n279#2:297\n284#2:298\n289#2:299\n294#2:300\n1549#3:160\n1620#3,3:161\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/Path\n*L\n45#1:129,3\n48#1:132,28\n51#1:164,22\n54#1:186\n57#1:187\n61#1:188,6\n65#1:194,5\n69#1:199\n73#1:200,25\n76#1:225\n79#1:226,11\n82#1:237,6\n88#1:243,11\n91#1:254,6\n96#1:260,36\n98#1:296\n105#1:297\n107#1:298\n109#1:299\n111#1:300\n48#1:160\n48#1:161,3\n*E\n"})
/* renamed from: okio.p0 */
/* compiled from: Path.kt */
public final class C13158p0 implements Comparable<C13158p0> {

    /* renamed from: c */
    public static final C13159a f20947c = new C13159a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final String f20948d;

    /* renamed from: b */
    private final C13133f f20949b;

    /* renamed from: okio.p0$a */
    /* compiled from: Path.kt */
    public static final class C13159a {
        private C13159a() {
        }

        public /* synthetic */ C13159a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ C13158p0 m29806d(C13159a aVar, File file, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return aVar.mo52698a(file, z);
        }

        /* renamed from: e */
        public static /* synthetic */ C13158p0 m29807e(C13159a aVar, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return aVar.mo52699b(str, z);
        }

        /* renamed from: f */
        public static /* synthetic */ C13158p0 m29808f(C13159a aVar, Path path, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return aVar.mo52700c(path, z);
        }

        /* renamed from: a */
        public final C13158p0 mo52698a(File file, boolean z) {
            C12775o.m28639i(file, "<this>");
            String file2 = file.toString();
            C12775o.m28638h(file2, "toString()");
            return mo52699b(file2, z);
        }

        /* renamed from: b */
        public final C13158p0 mo52699b(String str, boolean z) {
            C12775o.m28639i(str, "<this>");
            return C12639i.m28089k(str, z);
        }

        /* renamed from: c */
        public final C13158p0 mo52700c(Path path, boolean z) {
            C12775o.m28639i(path, "<this>");
            return mo52699b(path.toString(), z);
        }
    }

    static {
        String str = File.separator;
        C12775o.m28638h(str, "separator");
        f20948d = str;
    }

    public C13158p0(C13133f fVar) {
        C12775o.m28639i(fVar, "bytes");
        this.f20949b = fVar;
    }

    /* renamed from: a */
    public int compareTo(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "other");
        return mo52681b().compareTo(p0Var.mo52681b());
    }

    /* renamed from: b */
    public final C13133f mo52681b() {
        return this.f20949b;
    }

    /* renamed from: c */
    public final C13158p0 mo52682c() {
        int h = C12639i.m28093o(this);
        if (h == -1) {
            return null;
        }
        return new C13158p0(mo52681b().mo52592J(0, h));
    }

    /* renamed from: d */
    public final List<C13133f> mo52684d() {
        ArrayList arrayList = new ArrayList();
        int h = C12639i.m28093o(this);
        if (h == -1) {
            h = 0;
        } else if (h < mo52681b().mo52590H() && mo52681b().mo52603g(h) == 92) {
            h++;
        }
        int H = mo52681b().mo52590H();
        int i = h;
        while (h < H) {
            if (mo52681b().mo52603g(h) == 47 || mo52681b().mo52603g(h) == 92) {
                arrayList.add(mo52681b().mo52592J(i, h));
                i = h + 1;
            }
            h++;
        }
        if (i < mo52681b().mo52590H()) {
            arrayList.add(mo52681b().mo52592J(i, mo52681b().mo52590H()));
        }
        return arrayList;
    }

    /* renamed from: e */
    public final String mo52685e() {
        return mo52687f().mo52595N();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13158p0) || !C12775o.m28634d(((C13158p0) obj).mo52681b(), mo52681b())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C13133f mo52687f() {
        int d = C12639i.m28090l(this);
        if (d != -1) {
            return C13133f.m29650K(mo52681b(), d + 1, 0, 2, (Object) null);
        }
        if (mo52695l() == null || mo52681b().mo52590H() != 2) {
            return mo52681b();
        }
        return C13133f.f20904f;
    }

    /* renamed from: g */
    public final C13158p0 mo52688g() {
        C13158p0 p0Var;
        if (C12775o.m28634d(mo52681b(), C12639i.f20309d) || C12775o.m28634d(mo52681b(), C12639i.f20306a) || C12775o.m28634d(mo52681b(), C12639i.f20307b) || C12639i.m28092n(this)) {
            return null;
        }
        int d = C12639i.m28090l(this);
        if (d != 2 || mo52695l() == null) {
            if (d == 1 && mo52681b().mo52591I(C12639i.f20307b)) {
                return null;
            }
            if (d != -1 || mo52695l() == null) {
                if (d == -1) {
                    return new C13158p0(C12639i.f20309d);
                }
                if (d != 0) {
                    return new C13158p0(C13133f.m29650K(mo52681b(), 0, d, 1, (Object) null));
                }
                p0Var = new C13158p0(C13133f.m29650K(mo52681b(), 0, 1, 1, (Object) null));
            } else if (mo52681b().mo52590H() == 2) {
                return null;
            } else {
                p0Var = new C13158p0(C13133f.m29650K(mo52681b(), 0, 2, 1, (Object) null));
            }
        } else if (mo52681b().mo52590H() == 3) {
            return null;
        } else {
            p0Var = new C13158p0(C13133f.m29650K(mo52681b(), 0, 3, 1, (Object) null));
        }
        return p0Var;
    }

    /* renamed from: h */
    public final C13158p0 mo52689h(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "other");
        if (C12775o.m28634d(mo52682c(), p0Var.mo52682c())) {
            List<C13133f> d = mo52684d();
            List<C13133f> d2 = p0Var.mo52684d();
            int min = Math.min(d.size(), d2.size());
            int i = 0;
            while (i < min && C12775o.m28634d(d.get(i), d2.get(i))) {
                i++;
            }
            boolean z = true;
            if (i == min && mo52681b().mo52590H() == p0Var.mo52681b().mo52590H()) {
                return C13159a.m29807e(f20947c, ".", false, 1, (Object) null);
            }
            if (d2.subList(i, d2.size()).indexOf(C12639i.f20310e) != -1) {
                z = false;
            }
            if (z) {
                C13121c cVar = new C13121c();
                C13133f f = C12639i.m28091m(p0Var);
                if (f == null && (f = C12639i.m28091m(this)) == null) {
                    f = C12639i.m28097s(f20948d);
                }
                int size = d2.size();
                for (int i2 = i; i2 < size; i2++) {
                    cVar.mo52517b0(C12639i.f20310e);
                    cVar.mo52517b0(f);
                }
                int size2 = d.size();
                while (i < size2) {
                    cVar.mo52517b0(d.get(i));
                    cVar.mo52517b0(f);
                    i++;
                }
                return C12639i.m28095q(cVar, false);
            }
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + p0Var).toString());
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + p0Var).toString());
    }

    public int hashCode() {
        return mo52681b().hashCode();
    }

    /* renamed from: i */
    public final C13158p0 mo52691i(String str) {
        C12775o.m28639i(str, "child");
        return C12639i.m28088j(this, C12639i.m28095q(new C13121c().mo52486F(str), false), false);
    }

    public final boolean isAbsolute() {
        if (C12639i.m28093o(this) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final C13158p0 mo52693j(C13158p0 p0Var, boolean z) {
        C12775o.m28639i(p0Var, "child");
        return C12639i.m28088j(this, p0Var, z);
    }

    /* renamed from: k */
    public final Path mo52694k() {
        Path a = Paths.get(toString(), new String[0]);
        C12775o.m28638h(a, "get(toString())");
        return a;
    }

    /* renamed from: l */
    public final Character mo52695l() {
        boolean z;
        boolean z2 = false;
        if (C13133f.m29653o(mo52681b(), C12639i.f20306a, 0, 2, (Object) null) != -1 || mo52681b().mo52590H() < 2 || mo52681b().mo52603g(1) != 58) {
            return null;
        }
        char g = (char) mo52681b().mo52603g(0);
        if ('a' > g || g >= '{') {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if ('A' <= g && g < '[') {
                z2 = true;
            }
            if (!z2) {
                return null;
            }
        }
        return Character.valueOf(g);
    }

    public final File toFile() {
        return new File(toString());
    }

    public String toString() {
        return mo52681b().mo52595N();
    }
}
