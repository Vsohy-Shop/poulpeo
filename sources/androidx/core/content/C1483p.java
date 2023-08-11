package androidx.core.content;

import android.content.ComponentName;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.p */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1483p implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f456a;

    public /* synthetic */ C1483p(String str) {
        this.f456a = str;
    }

    public final boolean test(Object obj) {
        return this.f456a.equals(((ComponentName) obj).getPackageName());
    }
}
