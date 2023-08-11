package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.TransformOrigin;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: AndroidMenu.android.kt */
final class AndroidMenu_androidKt$DropdownMenu$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13089p<ColumnScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ MutableTransitionState<Boolean> $expandedStates;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ MutableState<TransformOrigin> $transformOriginState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidMenu_androidKt$DropdownMenu$1(MutableTransitionState<Boolean> mutableTransitionState, MutableState<TransformOrigin> mutableState, Modifier modifier, C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar, int i) {
        super(2);
        this.$expandedStates = mutableTransitionState;
        this.$transformOriginState = mutableState;
        this.$modifier = modifier;
        this.$content = pVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1192563503, i, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:98)");
            }
            MutableTransitionState<Boolean> mutableTransitionState = this.$expandedStates;
            MutableState<TransformOrigin> mutableState = this.$transformOriginState;
            Modifier modifier = this.$modifier;
            C13089p<ColumnScope, Composer, Integer, C11921v> pVar = this.$content;
            int i2 = this.$$dirty;
            MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, modifier, pVar, composer, MutableTransitionState.$stable | 48 | (i2 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i2 >> 6) & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
