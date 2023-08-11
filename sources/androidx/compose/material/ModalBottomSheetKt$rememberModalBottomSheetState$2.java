package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: ModalBottomSheet.kt */
final class ModalBottomSheetKt$rememberModalBottomSheetState$2 extends C12777p implements C13074a<ModalBottomSheetState> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<ModalBottomSheetValue, Boolean> $confirmValueChange;
    final /* synthetic */ ModalBottomSheetValue $initialValue;
    final /* synthetic */ boolean $skipHalfExpanded;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ModalBottomSheetKt$rememberModalBottomSheetState$2(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> function1, boolean z) {
        super(0);
        this.$initialValue = modalBottomSheetValue;
        this.$animationSpec = animationSpec;
        this.$confirmValueChange = function1;
        this.$skipHalfExpanded = z;
    }

    public final ModalBottomSheetState invoke() {
        return ModalBottomSheetKt.ModalBottomSheetState(this.$initialValue, this.$animationSpec, this.$confirmValueChange, this.$skipHalfExpanded);
    }
}
