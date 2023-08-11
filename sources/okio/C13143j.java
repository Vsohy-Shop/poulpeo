package okio;

import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13158p0;
import p371jg.C12627c;
import p371jg.C12638h;

@SourceDebugExtension({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,160:1\n52#2,18:161\n52#2,18:179\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n*L\n66#1:161,18\n80#1:179,18\n*E\n"})
/* renamed from: okio.j */
/* compiled from: FileSystem.kt */
public abstract class C13143j {

    /* renamed from: a */
    public static final C13144a f20926a = new C13144a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final C13143j f20927b;

    /* renamed from: c */
    public static final C13158p0 f20928c;

    /* renamed from: d */
    public static final C13143j f20929d;

    /* renamed from: okio.j$a */
    /* compiled from: FileSystem.kt */
    public static final class C13144a {
        private C13144a() {
        }

        public /* synthetic */ C13144a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C13143j jVar;
        try {
            Class.forName("java.nio.file.Files");
            jVar = new C13142i0();
        } catch (ClassNotFoundException unused) {
            jVar = new C13164s();
        }
        f20927b = jVar;
        C13158p0.C13159a aVar = C13158p0.f20947c;
        String property = System.getProperty("java.io.tmpdir");
        C12775o.m28638h(property, "getProperty(\"java.io.tmpdir\")");
        f20928c = C13158p0.C13159a.m29807e(aVar, property, false, 1, (Object) null);
        ClassLoader classLoader = C12627c.class.getClassLoader();
        C12775o.m28638h(classLoader, "ResourceFileSystem::class.java.classLoader");
        f20929d = new C12627c(classLoader, false);
    }

    /* renamed from: a */
    public final C13175w0 mo52643a(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "file");
        return mo50367b(p0Var, false);
    }

    /* renamed from: b */
    public abstract C13175w0 mo50367b(C13158p0 p0Var, boolean z);

    /* renamed from: c */
    public abstract void mo50368c(C13158p0 p0Var, C13158p0 p0Var2);

    /* renamed from: d */
    public final void mo52644d(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "dir");
        mo52645e(p0Var, false);
    }

    /* renamed from: e */
    public final void mo52645e(C13158p0 p0Var, boolean z) {
        C12775o.m28639i(p0Var, "dir");
        C12638h.m28076a(this, p0Var, z);
    }

    /* renamed from: f */
    public final void mo52646f(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "dir");
        mo50369g(p0Var, false);
    }

    /* renamed from: g */
    public abstract void mo50369g(C13158p0 p0Var, boolean z);

    /* renamed from: h */
    public final void mo52647h(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "path");
        mo50370i(p0Var, false);
    }

    /* renamed from: i */
    public abstract void mo50370i(C13158p0 p0Var, boolean z);

    /* renamed from: j */
    public final boolean mo52648j(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "path");
        return C12638h.m28077b(this, p0Var);
    }

    /* renamed from: k */
    public abstract List<C13158p0> mo50371k(C13158p0 p0Var);

    /* renamed from: l */
    public final C13141i mo52649l(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "path");
        return C12638h.m28078c(this, p0Var);
    }

    /* renamed from: m */
    public abstract C13141i mo50372m(C13158p0 p0Var);

    /* renamed from: n */
    public abstract C13138h mo50373n(C13158p0 p0Var);

    /* renamed from: o */
    public final C13175w0 mo52650o(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "file");
        return mo42170p(p0Var, false);
    }

    /* renamed from: p */
    public abstract C13175w0 mo42170p(C13158p0 p0Var, boolean z);

    /* renamed from: q */
    public abstract C13179y0 mo50374q(C13158p0 p0Var);
}
