package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: ModalBottomSheet.kt */
final class ModalBottomSheetState$Companion$Saver$2 extends C12777p implements Function1<ModalBottomSheetValue, ModalBottomSheetState> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<ModalBottomSheetValue, Boolean> $confirmValueChange;
    final /* synthetic */ boolean $skipHalfExpanded;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ModalBottomSheetState$Companion$Saver$2(AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> function1, boolean z) {
        super(1);
        this.$animationSpec = animationSpec;
        this.$confirmValueChange = function1;
        this.$skipHalfExpanded = z;
    }

    public final ModalBottomSheetState invoke(ModalBottomSheetValue modalBottomSheetValue) {
        C12775o.m28639i(modalBottomSheetValue, "it");
        return ModalBottomSheetKt.ModalBottomSheetState(modalBottomSheetValue, this.$animationSpec, this.$confirmValueChange, this.$skipHalfExpanded);
    }
}
