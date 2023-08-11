package p444vb;

import androidx.annotation.NonNull;

/* renamed from: vb.b */
/* compiled from: PLPPasswordValidator */
public class C13611b {

    /* renamed from: a */
    public final String f21870a;

    /* renamed from: b */
    public final boolean f21871b;

    /* renamed from: c */
    public final boolean f21872c;

    /* renamed from: d */
    public final boolean f21873d;

    /* renamed from: e */
    public final boolean f21874e;

    public C13611b(@NonNull String str) {
        boolean z;
        this.f21870a = str;
        boolean matches = str.matches(".*\\p{Lu}.*");
        this.f21871b = matches;
        boolean matches2 = str.matches(".*[0-9].*");
        this.f21872c = matches2;
        boolean z2 = true;
        if (str.length() >= 6) {
            z = true;
        } else {
            z = false;
        }
        this.f21873d = z;
        this.f21874e = (!matches || !matches2 || !z) ? false : z2;
    }
}
