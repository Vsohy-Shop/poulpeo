package androidx.compose.runtime;

import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: Composer.kt */
public interface RememberManager {
    void deactivating(ComposeNodeLifecycleCallback composeNodeLifecycleCallback);

    void forgetting(RememberObserver rememberObserver);

    void releasing(ComposeNodeLifecycleCallback composeNodeLifecycleCallback);

    void remembering(RememberObserver rememberObserver);

    void sideEffect(C13074a<C11921v> aVar);
}
