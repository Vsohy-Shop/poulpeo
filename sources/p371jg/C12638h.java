package p371jg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.collections.C12699k;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13141i;
import okio.C13143j;
import okio.C13158p0;

@SourceDebugExtension({"SMAP\n-FileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -FileSystem.kt\nokio/internal/_FileSystemKt\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,152:1\n52#2,5:153\n52#2,18:158\n60#2,7:176\n57#2,13:183\n*S KotlinDebug\n*F\n+ 1 -FileSystem.kt\nokio/internal/_FileSystemKt\n*L\n62#1:153,5\n63#1:158,18\n62#1:176,7\n62#1:183,13\n*E\n"})
/* renamed from: jg.h */
/* compiled from: -FileSystem.kt */
public final class C12638h {
    /* renamed from: a */
    public static final void m28076a(C13143j jVar, C13158p0 p0Var, boolean z) {
        C12775o.m28639i(jVar, "<this>");
        C12775o.m28639i(p0Var, "dir");
        C12699k kVar = new C12699k();
        C13158p0 p0Var2 = p0Var;
        while (p0Var2 != null && !jVar.mo52648j(p0Var2)) {
            kVar.addFirst(p0Var2);
            p0Var2 = p0Var2.mo52688g();
        }
        if (!z || !kVar.isEmpty()) {
            Iterator it = kVar.iterator();
            while (it.hasNext()) {
                jVar.mo52646f((C13158p0) it.next());
            }
            return;
        }
        throw new IOException(p0Var + " already exist.");
    }

    /* renamed from: b */
    public static final boolean m28077b(C13143j jVar, C13158p0 p0Var) {
        C12775o.m28639i(jVar, "<this>");
        C12775o.m28639i(p0Var, "path");
        if (jVar.mo50372m(p0Var) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final C13141i m28078c(C13143j jVar, C13158p0 p0Var) {
        C12775o.m28639i(jVar, "<this>");
        C12775o.m28639i(p0Var, "path");
        C13141i m = jVar.mo50372m(p0Var);
        if (m != null) {
            return m;
        }
        throw new FileNotFoundException("no such file: " + p0Var);
    }
}
