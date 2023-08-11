package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p355hf.C12074d;

@Stable
@ExperimentalMaterialApi
/* compiled from: BackdropScaffold.kt */
public final class BackdropScaffoldState extends SwipeableState<BackdropValue> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final NestedScrollConnection nestedScrollConnection;
    private final SnackbarHostState snackbarHostState;

    /* compiled from: BackdropScaffold.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<BackdropScaffoldState, ?> Saver(AnimationSpec<Float> animationSpec, Function1<? super BackdropValue, Boolean> function1, SnackbarHostState snackbarHostState) {
            C12775o.m28639i(animationSpec, "animationSpec");
            C12775o.m28639i(function1, "confirmStateChange");
            C12775o.m28639i(snackbarHostState, "snackbarHostState");
            return SaverKt.Saver(BackdropScaffoldState$Companion$Saver$1.INSTANCE, new BackdropScaffoldState$Companion$Saver$2(animationSpec, function1, snackbarHostState));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BackdropScaffoldState(BackdropValue backdropValue, AnimationSpec animationSpec, Function1 function1, SnackbarHostState snackbarHostState2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(backdropValue, (i & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i & 4) != 0 ? C06891.INSTANCE : function1, (i & 8) != 0 ? new SnackbarHostState() : snackbarHostState2);
    }

    public final Object conceal(C12074d<? super C11921v> dVar) {
        Object animateTo$default = SwipeableState.animateTo$default(this, BackdropValue.Concealed, (AnimationSpec) null, dVar, 2, (Object) null);
        if (animateTo$default == C12150d.m26492c()) {
            return animateTo$default;
        }
        return C11921v.f18618a;
    }

    public final NestedScrollConnection getNestedScrollConnection$material_release() {
        return this.nestedScrollConnection;
    }

    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }

    public final boolean isConcealed() {
        if (getCurrentValue() == BackdropValue.Concealed) {
            return true;
        }
        return false;
    }

    public final boolean isRevealed() {
        if (getCurrentValue() == BackdropValue.Revealed) {
            return true;
        }
        return false;
    }

    public final Object reveal(C12074d<? super C11921v> dVar) {
        Object animateTo$default = SwipeableState.animateTo$default(this, BackdropValue.Revealed, (AnimationSpec) null, dVar, 2, (Object) null);
        if (animateTo$default == C12150d.m26492c()) {
            return animateTo$default;
        }
        return C11921v.f18618a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldState(BackdropValue backdropValue, AnimationSpec<Float> animationSpec, Function1<? super BackdropValue, Boolean> function1, SnackbarHostState snackbarHostState2) {
        super(backdropValue, animationSpec, function1);
        C12775o.m28639i(backdropValue, "initialValue");
        C12775o.m28639i(animationSpec, "animationSpec");
        C12775o.m28639i(function1, "confirmStateChange");
        C12775o.m28639i(snackbarHostState2, "snackbarHostState");
        this.snackbarHostState = snackbarHostState2;
        this.nestedScrollConnection = SwipeableKt.getPreUpPostDownNestedScrollConnection(this);
    }
}
