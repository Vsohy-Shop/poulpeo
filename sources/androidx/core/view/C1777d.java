package androidx.core.view;

import android.content.ClipData;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.view.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1777d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ java.util.function.Predicate f525a;

    public /* synthetic */ C1777d(java.util.function.Predicate predicate) {
        this.f525a = predicate;
    }

    public final boolean test(Object obj) {
        return this.f525a.test((ClipData.Item) obj);
    }
}
