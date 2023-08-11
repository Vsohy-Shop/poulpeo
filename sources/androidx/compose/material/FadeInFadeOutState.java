package androidx.compose.material;

import androidx.compose.runtime.RecomposeScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* compiled from: SnackbarHost.kt */
final class FadeInFadeOutState<T> {
    private Object current = new Object();
    private List<FadeInFadeOutAnimationItem<T>> items = new ArrayList();
    private RecomposeScope scope;

    public final Object getCurrent() {
        return this.current;
    }

    public final List<FadeInFadeOutAnimationItem<T>> getItems() {
        return this.items;
    }

    public final RecomposeScope getScope() {
        return this.scope;
    }

    public final void setCurrent(Object obj) {
        this.current = obj;
    }

    public final void setItems(List<FadeInFadeOutAnimationItem<T>> list) {
        C12775o.m28639i(list, "<set-?>");
        this.items = list;
    }

    public final void setScope(RecomposeScope recomposeScope) {
        this.scope = recomposeScope;
    }
}
