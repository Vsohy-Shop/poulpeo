package androidx.core.content;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.o */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1482o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Class f454a;

    /* renamed from: b */
    public final /* synthetic */ Predicate f455b;

    public /* synthetic */ C1482o(Class cls, Predicate predicate) {
        this.f454a = cls;
        this.f455b = predicate;
    }

    public final boolean test(Object obj) {
        return IntentSanitizer.Builder.lambda$allowExtra$13(this.f454a, this.f455b, obj);
    }
}
