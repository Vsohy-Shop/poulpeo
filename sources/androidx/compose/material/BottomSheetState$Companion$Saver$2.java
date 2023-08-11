package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: BottomSheetScaffold.kt */
final class BottomSheetState$Companion$Saver$2 extends C12777p implements Function1<BottomSheetValue, BottomSheetState> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<BottomSheetValue, Boolean> $confirmStateChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BottomSheetState$Companion$Saver$2(AnimationSpec<Float> animationSpec, Function1<? super BottomSheetValue, Boolean> function1) {
        super(1);
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = function1;
    }

    public final BottomSheetState invoke(BottomSheetValue bottomSheetValue) {
        C12775o.m28639i(bottomSheetValue, "it");
        return new BottomSheetState(bottomSheetValue, this.$animationSpec, this.$confirmStateChange);
    }
}
