package androidx.core.content;

import android.net.Uri;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1478k implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f451a;

    public /* synthetic */ C1478k(String str) {
        this.f451a = str;
    }

    public final boolean test(Object obj) {
        return this.f451a.equals(((Uri) obj).getAuthority());
    }
}
