package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: BottomSheetScaffold.kt */
final class BottomSheetScaffoldKt$rememberBottomSheetState$2 extends C12777p implements C13074a<BottomSheetState> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<BottomSheetValue, Boolean> $confirmStateChange;
    final /* synthetic */ BottomSheetValue $initialValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BottomSheetScaffoldKt$rememberBottomSheetState$2(BottomSheetValue bottomSheetValue, AnimationSpec<Float> animationSpec, Function1<? super BottomSheetValue, Boolean> function1) {
        super(0);
        this.$initialValue = bottomSheetValue;
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = function1;
    }

    public final BottomSheetState invoke() {
        return new BottomSheetState(this.$initialValue, this.$animationSpec, this.$confirmStateChange);
    }
}
