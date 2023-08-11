package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: BackdropScaffold.kt */
final class BackdropScaffoldKt$rememberBackdropScaffoldState$3 extends C12777p implements C13074a<BackdropScaffoldState> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<BackdropValue, Boolean> $confirmStateChange;
    final /* synthetic */ BackdropValue $initialValue;
    final /* synthetic */ SnackbarHostState $snackbarHostState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BackdropScaffoldKt$rememberBackdropScaffoldState$3(BackdropValue backdropValue, AnimationSpec<Float> animationSpec, Function1<? super BackdropValue, Boolean> function1, SnackbarHostState snackbarHostState) {
        super(0);
        this.$initialValue = backdropValue;
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = function1;
        this.$snackbarHostState = snackbarHostState;
    }

    public final BackdropScaffoldState invoke() {
        return new BackdropScaffoldState(this.$initialValue, this.$animationSpec, this.$confirmStateChange, this.$snackbarHostState);
    }
}
