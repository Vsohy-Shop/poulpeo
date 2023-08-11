package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.f0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1473f0 implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ UriMatcher f450a;

    public /* synthetic */ C1473f0(UriMatcher uriMatcher) {
        this.f450a = uriMatcher;
    }

    public final boolean test(Object obj) {
        return UriMatcherCompat.lambda$asPredicate$0(this.f450a, (Uri) obj);
    }
}
