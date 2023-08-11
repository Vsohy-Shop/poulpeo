package androidx.core.content;

import android.net.Uri;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.q */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1543q implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f457a;

    public /* synthetic */ C1543q(String str) {
        this.f457a = str;
    }

    public final boolean test(Object obj) {
        return this.f457a.equals(((Uri) obj).getAuthority());
    }
}
