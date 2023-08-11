package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13158p0;
import p371jg.C12631d;

@SourceDebugExtension({"SMAP\nZipFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,174:1\n52#2,18:175\n52#2,18:193\n*S KotlinDebug\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n*L\n102#1:175,18\n131#1:193,18\n*E\n"})
/* renamed from: okio.b1 */
/* compiled from: ZipFileSystem.kt */
public final class C13119b1 extends C13143j {

    /* renamed from: i */
    private static final C13120a f20882i = new C13120a((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: j */
    private static final C13158p0 f20883j = C13158p0.C13159a.m29807e(C13158p0.f20947c, "/", false, 1, (Object) null);

    /* renamed from: e */
    private final C13158p0 f20884e;

    /* renamed from: f */
    private final C13143j f20885f;

    /* renamed from: g */
    private final Map<C13158p0, C12631d> f20886g;

    /* renamed from: h */
    private final String f20887h;

    /* renamed from: okio.b1$a */
    /* compiled from: ZipFileSystem.kt */
    private static final class C13120a {
        private C13120a() {
        }

        public /* synthetic */ C13120a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C13119b1(C13158p0 p0Var, C13143j jVar, Map<C13158p0, C12631d> map, String str) {
        C12775o.m28639i(p0Var, "zipPath");
        C12775o.m28639i(jVar, "fileSystem");
        C12775o.m28639i(map, "entries");
        this.f20884e = p0Var;
        this.f20885f = jVar;
        this.f20886g = map;
        this.f20887h = str;
    }

    /* renamed from: r */
    private final C13158p0 m29512r(C13158p0 p0Var) {
        return f20883j.mo52693j(p0Var, true);
    }

    /* renamed from: s */
    private final List<C13158p0> m29513s(C13158p0 p0Var, boolean z) {
        C12631d dVar = this.f20886g.get(m29512r(p0Var));
        if (dVar != null) {
            return C12686e0.m28205B0(dVar.mo50382b());
        }
        if (!z) {
            return null;
        }
        throw new IOException("not a directory: " + p0Var);
    }

    /* renamed from: b */
    public C13175w0 mo50367b(C13158p0 p0Var, boolean z) {
        C12775o.m28639i(p0Var, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* renamed from: c */
    public void mo50368c(C13158p0 p0Var, C13158p0 p0Var2) {
        C12775o.m28639i(p0Var, APIParams.SOURCE);
        C12775o.m28639i(p0Var2, TypedValues.AttributesType.S_TARGET);
        throw new IOException("zip file systems are read-only");
    }

    /* renamed from: g */
    public void mo50369g(C13158p0 p0Var, boolean z) {
        C12775o.m28639i(p0Var, "dir");
        throw new IOException("zip file systems are read-only");
    }

    /* renamed from: i */
    public void mo50370i(C13158p0 p0Var, boolean z) {
        C12775o.m28639i(p0Var, "path");
        throw new IOException("zip file systems are read-only");
    }

    /* renamed from: k */
    public List<C13158p0> mo50371k(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "dir");
        List<C13158p0> s = m29513s(p0Var, true);
        C12775o.m28636f(s);
        return s;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okio.C13141i mo50372m(okio.C13158p0 r15) {
        /*
            r14 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            okio.p0 r15 = r14.m29512r(r15)
            java.util.Map<okio.p0, jg.d> r0 = r14.f20886g
            java.lang.Object r15 = r0.get(r15)
            jg.d r15 = (p371jg.C12631d) r15
            r0 = 0
            if (r15 != 0) goto L_0x0015
            return r0
        L_0x0015:
            okio.i r12 = new okio.i
            boolean r1 = r15.mo50388h()
            r2 = r1 ^ 1
            boolean r3 = r15.mo50388h()
            r4 = 0
            boolean r1 = r15.mo50388h()
            if (r1 == 0) goto L_0x002a
            r5 = r0
            goto L_0x0033
        L_0x002a:
            long r5 = r15.mo50387g()
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r5 = r1
        L_0x0033:
            r6 = 0
            java.lang.Long r7 = r15.mo50385e()
            r8 = 0
            r9 = 0
            r10 = 128(0x80, float:1.794E-43)
            r11 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            long r1 = r15.mo50386f()
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x004c
            return r12
        L_0x004c:
            okio.j r1 = r14.f20885f
            okio.p0 r2 = r14.f20884e
            okio.h r1 = r1.mo50373n(r2)
            long r2 = r15.mo50386f()     // Catch:{ all -> 0x0068 }
            okio.y0 r15 = r1.mo52632V(r2)     // Catch:{ all -> 0x0068 }
            okio.e r15 = okio.C13145j0.m29739d(r15)     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x0076
            r1.close()     // Catch:{ all -> 0x0066 }
            goto L_0x0076
        L_0x0066:
            r0 = move-exception
            goto L_0x0076
        L_0x0068:
            r15 = move-exception
            if (r1 == 0) goto L_0x0073
            r1.close()     // Catch:{ all -> 0x006f }
            goto L_0x0073
        L_0x006f:
            r1 = move-exception
            p336ef.C11894b.m25683a(r15, r1)
        L_0x0073:
            r13 = r0
            r0 = r15
            r15 = r13
        L_0x0076:
            if (r0 != 0) goto L_0x0080
            kotlin.jvm.internal.C12775o.m28636f(r15)
            okio.i r15 = p371jg.C12632e.m28058h(r15, r12)
            return r15
        L_0x0080:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C13119b1.mo50372m(okio.p0):okio.i");
    }

    /* renamed from: n */
    public C13138h mo50373n(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    /* renamed from: p */
    public C13175w0 mo42170p(C13158p0 p0Var, boolean z) {
        C12775o.m28639i(p0Var, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0076  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okio.C13179y0 mo50374q(okio.C13158p0 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            okio.p0 r0 = r7.m29512r(r8)
            java.util.Map<okio.p0, jg.d> r1 = r7.f20886g
            java.lang.Object r0 = r1.get(r0)
            jg.d r0 = (p371jg.C12631d) r0
            if (r0 == 0) goto L_0x0077
            okio.j r8 = r7.f20885f
            okio.p0 r1 = r7.f20884e
            okio.h r8 = r8.mo50373n(r1)
            r1 = 0
            long r2 = r0.mo50386f()     // Catch:{ all -> 0x0030 }
            okio.y0 r2 = r8.mo52632V(r2)     // Catch:{ all -> 0x0030 }
            okio.e r2 = okio.C13145j0.m29739d(r2)     // Catch:{ all -> 0x0030 }
            if (r8 == 0) goto L_0x003e
            r8.close()     // Catch:{ all -> 0x002e }
            goto L_0x003e
        L_0x002e:
            r1 = move-exception
            goto L_0x003e
        L_0x0030:
            r2 = move-exception
            if (r8 == 0) goto L_0x003b
            r8.close()     // Catch:{ all -> 0x0037 }
            goto L_0x003b
        L_0x0037:
            r8 = move-exception
            p336ef.C11894b.m25683a(r2, r8)
        L_0x003b:
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x003e:
            if (r1 != 0) goto L_0x0076
            kotlin.jvm.internal.C12775o.m28636f(r2)
            p371jg.C12632e.m28061k(r2)
            int r8 = r0.mo50384d()
            r1 = 1
            if (r8 != 0) goto L_0x0057
            jg.b r8 = new jg.b
            long r3 = r0.mo50387g()
            r8.<init>(r2, r3, r1)
            goto L_0x0075
        L_0x0057:
            okio.p r8 = new okio.p
            jg.b r3 = new jg.b
            long r4 = r0.mo50383c()
            r3.<init>(r2, r4, r1)
            java.util.zip.Inflater r2 = new java.util.zip.Inflater
            r2.<init>(r1)
            r8.<init>((okio.C13179y0) r3, (java.util.zip.Inflater) r2)
            jg.b r1 = new jg.b
            long r2 = r0.mo50387g()
            r0 = 0
            r1.<init>(r8, r2, r0)
            r8 = r1
        L_0x0075:
            return r8
        L_0x0076:
            throw r1
        L_0x0077:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no such file: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C13119b1.mo50374q(okio.p0):okio.y0");
    }
}
