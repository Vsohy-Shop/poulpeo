package androidx.core.content;

import android.net.Uri;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.r */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1544r implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f458a;

    public /* synthetic */ C1544r(String str) {
        this.f458a = str;
    }

    public final boolean test(Object obj) {
        return this.f458a.equals(((Uri) obj).getAuthority());
    }
}
