package p109h4;

import androidx.annotation.NonNull;
import java.util.Collection;

/* renamed from: h4.d */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7922d {
    @NonNull
    /* renamed from: a */
    public static String m15559a(@NonNull String str) {
        if (str != null) {
            C7938h1 h1Var = new C7938h1((C7934g1) null);
            C7938h1 unused = h1Var.f11123b = str;
            return C7945j1.m15631a(C7938h1.m15596c(h1Var));
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }

    @NonNull
    /* renamed from: b */
    public static String m15560b(@NonNull String str, @NonNull Collection<String> collection) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        } else if (collection != null) {
            C7938h1 h1Var = new C7938h1((C7934g1) null);
            C7938h1 unused = h1Var.f11123b = str;
            C7938h1 unused2 = h1Var.f11124c = collection;
            return C7945j1.m15631a(C7938h1.m15596c(h1Var));
        } else {
            throw new IllegalArgumentException("namespaces cannot be null");
        }
    }
}
