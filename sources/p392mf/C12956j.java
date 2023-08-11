package p392mf;

import androidx.autofill.HintConstants;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.C12775o;

/* renamed from: mf.j */
/* compiled from: Utils.kt */
class C12956j extends C12955i {
    /* renamed from: e */
    public static boolean m29270e(File file) {
        C12775o.m28639i(file, "<this>");
        Iterator it = C12955i.m29269d(file).iterator();
        while (true) {
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                File file2 = (File) it.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }

    /* renamed from: f */
    public static String m29271f(File file) {
        C12775o.m28639i(file, "<this>");
        String name = file.getName();
        C12775o.m28638h(name, HintConstants.AUTOFILL_HINT_NAME);
        return C13755w.m31545F0(name, '.', "");
    }

    /* renamed from: g */
    public static final File m29272g(File file, File file2) {
        boolean z;
        C12775o.m28639i(file, "<this>");
        C12775o.m28639i(file2, "relative");
        if (C12953g.m29267b(file2)) {
            return file2;
        }
        String file3 = file.toString();
        C12775o.m28638h(file3, "this.toString()");
        if (file3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || C13755w.m31558M(file3, File.separatorChar, false, 2, (Object) null)) {
            return new File(file3 + file2);
        }
        return new File(file3 + File.separatorChar + file2);
    }

    /* renamed from: h */
    public static File m29273h(File file, String str) {
        C12775o.m28639i(file, "<this>");
        C12775o.m28639i(str, "relative");
        return m29272g(file, new File(str));
    }
}
