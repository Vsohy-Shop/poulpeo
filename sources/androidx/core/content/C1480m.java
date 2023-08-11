package androidx.core.content;

import android.net.Uri;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.m */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1480m implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f453a;

    public /* synthetic */ C1480m(String str) {
        this.f453a = str;
    }

    public final boolean test(Object obj) {
        return this.f453a.equals(((Uri) obj).getAuthority());
    }
}
