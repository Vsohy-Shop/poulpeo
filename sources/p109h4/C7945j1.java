package p109h4;

import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Locale;
import p150l4.C8673a;

/* renamed from: h4.j1 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C7945j1 {

    /* renamed from: a */
    private final String f11146a;
    @Nullable

    /* renamed from: b */
    private final String f11147b;
    @Nullable

    /* renamed from: c */
    private final Collection f11148c;

    /* synthetic */ C7945j1(String str, String str2, Collection collection, boolean z, boolean z2, C7942i1 i1Var) {
        this.f11146a = str;
        this.f11147b = str2;
        this.f11148c = collection;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ String m15631a(C7945j1 j1Var) {
        StringBuilder sb = new StringBuilder(j1Var.f11146a);
        String str = j1Var.f11147b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (upperCase.matches("[A-F0-9]+")) {
                sb.append("/");
                sb.append(upperCase);
            } else {
                throw new IllegalArgumentException("Invalid application ID: ".concat(String.valueOf(j1Var.f11147b)));
            }
        }
        Collection collection = j1Var.f11148c;
        if (collection != null) {
            if (!collection.isEmpty()) {
                if (j1Var.f11147b == null) {
                    sb.append("/");
                }
                sb.append("/");
                boolean z = true;
                for (String str2 : j1Var.f11148c) {
                    C8673a.m17447f(str2);
                    if (!z) {
                        sb.append(",");
                    }
                    sb.append(C8673a.m17452k(str2));
                    z = false;
                }
            } else {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
        }
        if (j1Var.f11147b == null && j1Var.f11148c == null) {
            sb.append("/");
        }
        if (j1Var.f11148c == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }
}
