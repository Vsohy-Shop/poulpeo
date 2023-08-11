package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: BackdropScaffold.kt */
final class BackdropScaffoldState$Companion$Saver$2 extends C12777p implements Function1<BackdropValue, BackdropScaffoldState> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<BackdropValue, Boolean> $confirmStateChange;
    final /* synthetic */ SnackbarHostState $snackbarHostState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BackdropScaffoldState$Companion$Saver$2(AnimationSpec<Float> animationSpec, Function1<? super BackdropValue, Boolean> function1, SnackbarHostState snackbarHostState) {
        super(1);
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = function1;
        this.$snackbarHostState = snackbarHostState;
    }

    public final BackdropScaffoldState invoke(BackdropValue backdropValue) {
        C12775o.m28639i(backdropValue, "it");
        return new BackdropScaffoldState(backdropValue, this.$animationSpec, this.$confirmStateChange, this.$snackbarHostState);
    }
}
