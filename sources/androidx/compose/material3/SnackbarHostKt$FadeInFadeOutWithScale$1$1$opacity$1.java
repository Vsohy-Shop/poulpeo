package androidx.compose.material3;

import androidx.compose.runtime.RecomposeScope;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: SnackbarHost.kt */
final class SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ SnackbarData $key;
    final /* synthetic */ FadeInFadeOutState<SnackbarData> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1(SnackbarData snackbarData, FadeInFadeOutState<SnackbarData> fadeInFadeOutState) {
        super(0);
        this.$key = snackbarData;
        this.$state = fadeInFadeOutState;
    }

    public final void invoke() {
        if (!C12775o.m28634d(this.$key, this.$state.getCurrent())) {
            List<FadeInFadeOutAnimationItem<SnackbarData>> items = this.$state.getItems();
            final SnackbarData snackbarData = this.$key;
            boolean unused = C12669b0.m28187K(items, new Function1<FadeInFadeOutAnimationItem<SnackbarData>, Boolean>() {
                public final Boolean invoke(FadeInFadeOutAnimationItem<SnackbarData> fadeInFadeOutAnimationItem) {
                    C12775o.m28639i(fadeInFadeOutAnimationItem, "it");
                    return Boolean.valueOf(C12775o.m28634d(fadeInFadeOutAnimationItem.getKey(), snackbarData));
                }
            });
            RecomposeScope scope = this.$state.getScope();
            if (scope != null) {
                scope.invalidate();
            }
        }
    }
}
