package p392mf;

import java.io.File;
import kotlin.jvm.internal.C12775o;

/* renamed from: mf.g */
/* compiled from: FilePathComponents.kt */
class C12953g {
    /* renamed from: a */
    private static final int m29266a(String str) {
        char c;
        int V;
        int V2 = C13755w.m31570V(str, File.separatorChar, 0, false, 4, (Object) null);
        if (V2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != (c = File.separatorChar) || (V = C13755w.m31570V(str, c, 2, false, 4, (Object) null)) < 0) {
                return 1;
            }
            int V3 = C13755w.m31570V(str, File.separatorChar, V + 1, false, 4, (Object) null);
            if (V3 >= 0) {
                return V3 + 1;
            }
            return str.length();
        } else if (V2 > 0 && str.charAt(V2 - 1) == ':') {
            return V2 + 1;
        } else {
            if (V2 != -1 || !C13755w.m31558M(str, ':', false, 2, (Object) null)) {
                return 0;
            }
            return str.length();
        }
    }

    /* renamed from: b */
    public static final boolean m29267b(File file) {
        C12775o.m28639i(file, "<this>");
        String path = file.getPath();
        C12775o.m28638h(path, "path");
        if (m29266a(path) > 0) {
            return true;
        }
        return false;
    }
}
