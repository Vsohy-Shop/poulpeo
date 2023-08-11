package p392mf;

import java.io.File;
import kotlin.jvm.internal.C12775o;

/* renamed from: mf.i */
/* compiled from: FileTreeWalk.kt */
class C12955i extends C12954h {
    /* renamed from: c */
    public static final C12943d m29268c(File file, C12951e eVar) {
        C12775o.m28639i(file, "<this>");
        C12775o.m28639i(eVar, "direction");
        return new C12943d(file, eVar);
    }

    /* renamed from: d */
    public static final C12943d m29269d(File file) {
        C12775o.m28639i(file, "<this>");
        return m29268c(file, C12951e.BOTTOM_UP);
    }
}
