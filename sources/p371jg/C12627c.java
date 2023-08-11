package p371jg;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13138h;
import okio.C13141i;
import okio.C13143j;
import okio.C13158p0;
import okio.C13175w0;
import okio.C13179y0;
import p336ef.C11906l;
import p336ef.C11915r;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nResourceFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,212:1\n766#2:213\n857#2,2:214\n1549#2:216\n1620#2,3:217\n766#2:220\n857#2,2:221\n1549#2:223\n1620#2,3:224\n*S KotlinDebug\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n*L\n72#1:213\n72#1:214,2\n73#1:216\n73#1:217,3\n88#1:220\n88#1:221,2\n89#1:223\n89#1:224,3\n*E\n"})
/* renamed from: jg.c */
/* compiled from: ResourceFileSystem.kt */
public final class C12627c extends C13143j {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C12628a f20279f = new C12628a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    @Deprecated

    /* renamed from: g */
    public static final C13158p0 f20280g = C13158p0.C13159a.m29807e(C13158p0.f20947c, "/", false, 1, (Object) null);

    /* renamed from: e */
    private final Lazy f20281e;

    @SourceDebugExtension({"SMAP\nResourceFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1603#2,9:213\n1855#2:222\n1856#2:224\n1612#2:225\n1603#2,9:226\n1855#2:235\n1856#2:237\n1612#2:238\n1#3:223\n1#3:236\n*S KotlinDebug\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem$Companion\n*L\n183#1:213,9\n183#1:222\n183#1:224\n183#1:225\n184#1:226,9\n184#1:235\n184#1:237\n184#1:238\n183#1:223\n184#1:236\n*E\n"})
    /* renamed from: jg.c$a */
    /* compiled from: ResourceFileSystem.kt */
    private static final class C12628a {

        /* renamed from: jg.c$a$a */
        /* compiled from: ResourceFileSystem.kt */
        static final class C12629a extends C12777p implements Function1<C12631d, Boolean> {

            /* renamed from: g */
            public static final C12629a f20282g = new C12629a();

            C12629a() {
                super(1);
            }

            /* renamed from: a */
            public final Boolean invoke(C12631d dVar) {
                C12775o.m28639i(dVar, "entry");
                return Boolean.valueOf(C12627c.f20279f.m28036c(dVar.mo50381a()));
            }
        }

        private C12628a() {
        }

        public /* synthetic */ C12628a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final boolean m28036c(C13158p0 p0Var) {
            return !C13754v.m31528p(p0Var.mo52685e(), ".class", true);
        }

        /* renamed from: b */
        public final C13158p0 mo50375b() {
            return C12627c.f20280g;
        }

        /* renamed from: d */
        public final C13158p0 mo50376d(C13158p0 p0Var, C13158p0 p0Var2) {
            C12775o.m28639i(p0Var, "<this>");
            C12775o.m28639i(p0Var2, "base");
            return mo50375b().mo52691i(C13754v.m31538z(C13755w.m31585k0(p0Var.toString(), p0Var2.toString()), '\\', '/', false, 4, (Object) null));
        }

        /* renamed from: e */
        public final List<C11906l<C13143j, C13158p0>> mo50377e(ClassLoader classLoader) {
            C12775o.m28639i(classLoader, "<this>");
            Enumeration<URL> resources = classLoader.getResources("");
            C12775o.m28638h(resources, "getResources(\"\")");
            ArrayList<T> list = Collections.list(resources);
            C12775o.m28638h(list, "list(this)");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                C12628a r = C12627c.f20279f;
                C12775o.m28638h(t, "it");
                C11906l<C13143j, C13158p0> f = r.mo50378f(t);
                if (f != null) {
                    arrayList.add(f);
                }
            }
            Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
            C12775o.m28638h(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
            ArrayList<T> list2 = Collections.list(resources2);
            C12775o.m28638h(list2, "list(this)");
            ArrayList arrayList2 = new ArrayList();
            for (T t2 : list2) {
                C12628a r2 = C12627c.f20279f;
                C12775o.m28638h(t2, "it");
                C11906l<C13143j, C13158p0> g = r2.mo50379g(t2);
                if (g != null) {
                    arrayList2.add(g);
                }
            }
            return C12686e0.m28236o0(arrayList, arrayList2);
        }

        /* renamed from: f */
        public final C11906l<C13143j, C13158p0> mo50378f(URL url) {
            C12775o.m28639i(url, "<this>");
            if (!C12775o.m28634d(url.getProtocol(), "file")) {
                return null;
            }
            return C11915r.m25707a(C13143j.f20927b, C13158p0.C13159a.m29806d(C13158p0.f20947c, new File(url.toURI()), false, 1, (Object) null));
        }

        /* renamed from: g */
        public final C11906l<C13143j, C13158p0> mo50379g(URL url) {
            int b0;
            C12775o.m28639i(url, "<this>");
            String url2 = url.toString();
            C12775o.m28638h(url2, "toString()");
            if (!C13754v.m31525E(url2, "jar:file:", false, 2, (Object) null) || (b0 = C13755w.m31576b0(url2, "!", 0, false, 6, (Object) null)) == -1) {
                return null;
            }
            C13158p0.C13159a aVar = C13158p0.f20947c;
            String substring = url2.substring(4, b0);
            C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return C11915r.m25707a(C12632e.m28054d(C13158p0.C13159a.m29806d(aVar, new File(URI.create(substring)), false, 1, (Object) null), C13143j.f20927b, C12629a.f20282g), mo50375b());
        }
    }

    /* renamed from: jg.c$b */
    /* compiled from: ResourceFileSystem.kt */
    static final class C12630b extends C12777p implements C13074a<List<? extends C11906l<? extends C13143j, ? extends C13158p0>>> {

        /* renamed from: g */
        final /* synthetic */ ClassLoader f20283g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12630b(ClassLoader classLoader) {
            super(0);
            this.f20283g = classLoader;
        }

        public final List<C11906l<C13143j, C13158p0>> invoke() {
            return C12627c.f20279f.mo50377e(this.f20283g);
        }
    }

    public C12627c(ClassLoader classLoader, boolean z) {
        C12775o.m28639i(classLoader, "classLoader");
        this.f20281e = C11901h.m25690b(new C12630b(classLoader));
        if (z) {
            m28024u().size();
        }
    }

    /* renamed from: t */
    private final C13158p0 m28023t(C13158p0 p0Var) {
        return f20280g.mo52693j(p0Var, true);
    }

    /* renamed from: u */
    private final List<C11906l<C13143j, C13158p0>> m28024u() {
        return (List) this.f20281e.getValue();
    }

    /* renamed from: v */
    private final String m28025v(C13158p0 p0Var) {
        return m28023t(p0Var).mo52689h(f20280g).toString();
    }

    /* renamed from: b */
    public C13175w0 mo50367b(C13158p0 p0Var, boolean z) {
        C12775o.m28639i(p0Var, "file");
        throw new IOException(this + " is read-only");
    }

    /* renamed from: c */
    public void mo50368c(C13158p0 p0Var, C13158p0 p0Var2) {
        C12775o.m28639i(p0Var, APIParams.SOURCE);
        C12775o.m28639i(p0Var2, TypedValues.AttributesType.S_TARGET);
        throw new IOException(this + " is read-only");
    }

    /* renamed from: g */
    public void mo50369g(C13158p0 p0Var, boolean z) {
        C12775o.m28639i(p0Var, "dir");
        throw new IOException(this + " is read-only");
    }

    /* renamed from: i */
    public void mo50370i(C13158p0 p0Var, boolean z) {
        C12775o.m28639i(p0Var, "path");
        throw new IOException(this + " is read-only");
    }

    /* renamed from: k */
    public List<C13158p0> mo50371k(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "dir");
        String v = m28025v(p0Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (C11906l next : m28024u()) {
            C13143j jVar = (C13143j) next.mo49109a();
            C13158p0 p0Var2 = (C13158p0) next.mo49110b();
            try {
                ArrayList<C13158p0> arrayList = new ArrayList<>();
                for (Object next2 : jVar.mo50371k(p0Var2.mo52691i(v))) {
                    if (f20279f.m28036c((C13158p0) next2)) {
                        arrayList.add(next2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C12728x.m28544v(arrayList, 10));
                for (C13158p0 d : arrayList) {
                    arrayList2.add(f20279f.mo50376d(d, p0Var2));
                }
                boolean unused = C12669b0.m28178B(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused2) {
            }
        }
        if (z) {
            return C12686e0.m28205B0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + p0Var);
    }

    /* renamed from: m */
    public C13141i mo50372m(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "path");
        if (!f20279f.m28036c(p0Var)) {
            return null;
        }
        String v = m28025v(p0Var);
        for (C11906l next : m28024u()) {
            C13141i m = ((C13143j) next.mo49109a()).mo50372m(((C13158p0) next.mo49110b()).mo52691i(v));
            if (m != null) {
                return m;
            }
        }
        return null;
    }

    /* renamed from: n */
    public C13138h mo50373n(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "file");
        if (f20279f.m28036c(p0Var)) {
            String v = m28025v(p0Var);
            for (C11906l next : m28024u()) {
                try {
                    return ((C13143j) next.mo49109a()).mo50373n(((C13158p0) next.mo49110b()).mo52691i(v));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + p0Var);
        }
        throw new FileNotFoundException("file not found: " + p0Var);
    }

    /* renamed from: p */
    public C13175w0 mo42170p(C13158p0 p0Var, boolean z) {
        C12775o.m28639i(p0Var, "file");
        throw new IOException(this + " is read-only");
    }

    /* renamed from: q */
    public C13179y0 mo50374q(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "file");
        if (f20279f.m28036c(p0Var)) {
            String v = m28025v(p0Var);
            for (C11906l next : m28024u()) {
                try {
                    return ((C13143j) next.mo49109a()).mo50374q(((C13158p0) next.mo49110b()).mo52691i(v));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + p0Var);
        }
        throw new FileNotFoundException("file not found: " + p0Var);
    }
}
