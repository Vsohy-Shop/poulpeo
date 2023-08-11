package p392mf;

import java.io.File;
import kotlin.jvm.internal.C12775o;

/* renamed from: mf.c */
/* compiled from: Exceptions.kt */
public final class C12942c {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final String m29247b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "sb.toString()");
        return sb2;
    }
}
