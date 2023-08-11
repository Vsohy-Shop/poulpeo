package p042bo.app;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import p042bo.app.C3453n0;

/* renamed from: bo.app.t0 */
final class C3694t0 {

    /* renamed from: a */
    final String f2596a;

    /* renamed from: b */
    final long[] f2597b;

    /* renamed from: c */
    boolean f2598c;

    /* renamed from: d */
    C3453n0.C3456c f2599d;

    /* renamed from: e */
    long f2600e;

    /* renamed from: f */
    private final int f2601f;

    /* renamed from: g */
    private final File f2602g;

    C3694t0(String str, int i, File file) {
        this.f2596a = str;
        this.f2601f = i;
        this.f2602g = file;
        this.f2597b = new long[i];
    }

    /* renamed from: a */
    public String mo29676a() {
        StringBuilder sb = new StringBuilder();
        for (long append : this.f2597b) {
            sb.append(' ');
            sb.append(append);
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo29678b(String[] strArr) {
        if (strArr.length == this.f2601f) {
            int i = 0;
            while (i < strArr.length) {
                try {
                    this.f2597b[i] = Long.parseLong(strArr[i]);
                    i++;
                } catch (NumberFormatException unused) {
                    throw mo29675a(strArr);
                }
            }
            return;
        }
        throw mo29675a(strArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public IOException mo29675a(String[] strArr) {
        throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
    }

    /* renamed from: a */
    public File mo29674a(int i) {
        File file = this.f2602g;
        return new File(file, this.f2596a + "." + i);
    }

    /* renamed from: b */
    public File mo29677b(int i) {
        File file = this.f2602g;
        return new File(file, this.f2596a + "." + i + ".tmp");
    }
}
