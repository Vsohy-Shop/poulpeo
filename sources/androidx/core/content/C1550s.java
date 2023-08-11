package androidx.core.content;

import android.content.ComponentName;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.s */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1550s implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ ComponentName f470a;

    public /* synthetic */ C1550s(ComponentName componentName) {
        this.f470a = componentName;
    }

    public final boolean test(Object obj) {
        return this.f470a.equals((ComponentName) obj);
    }
}
