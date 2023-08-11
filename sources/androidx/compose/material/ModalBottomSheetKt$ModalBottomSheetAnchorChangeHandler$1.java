package androidx.compose.material;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: ModalBottomSheet.kt */
final class ModalBottomSheetKt$ModalBottomSheetAnchorChangeHandler$1 implements AnchorChangeHandler<ModalBottomSheetValue> {
    final /* synthetic */ C13088o<ModalBottomSheetValue, Float, C11921v> $animateTo;
    final /* synthetic */ Function1<ModalBottomSheetValue, C11921v> $snapTo;
    final /* synthetic */ ModalBottomSheetState $state;

    /* compiled from: ModalBottomSheet.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material.ModalBottomSheetValue[] r0 = androidx.compose.material.ModalBottomSheetValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material.ModalBottomSheetValue r1 = androidx.compose.material.ModalBottomSheetValue.Hidden     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material.ModalBottomSheetValue r1 = androidx.compose.material.ModalBottomSheetValue.HalfExpanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material.ModalBottomSheetValue r1 = androidx.compose.material.ModalBottomSheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetAnchorChangeHandler$1.WhenMappings.<clinit>():void");
        }
    }

    ModalBottomSheetKt$ModalBottomSheetAnchorChangeHandler$1(ModalBottomSheetState modalBottomSheetState, C13088o<? super ModalBottomSheetValue, ? super Float, C11921v> oVar, Function1<? super ModalBottomSheetValue, C11921v> function1) {
        this.$state = modalBottomSheetState;
        this.$animateTo = oVar;
        this.$snapTo = function1;
    }

    public final void onAnchorsChanged(ModalBottomSheetValue modalBottomSheetValue, Map<ModalBottomSheetValue, Float> map, Map<ModalBottomSheetValue, Float> map2) {
        ModalBottomSheetValue modalBottomSheetValue2;
        C12775o.m28639i(modalBottomSheetValue, "previousTarget");
        C12775o.m28639i(map, "previousAnchors");
        C12775o.m28639i(map2, "newAnchors");
        Float f = map.get(modalBottomSheetValue);
        int i = WhenMappings.$EnumSwitchMapping$0[modalBottomSheetValue.ordinal()];
        if (i == 1) {
            modalBottomSheetValue2 = ModalBottomSheetValue.Hidden;
        } else if (i == 2 || i == 3) {
            modalBottomSheetValue2 = ModalBottomSheetValue.HalfExpanded;
            if (!map2.containsKey(modalBottomSheetValue2)) {
                modalBottomSheetValue2 = ModalBottomSheetValue.Expanded;
                if (!map2.containsKey(modalBottomSheetValue2)) {
                    modalBottomSheetValue2 = ModalBottomSheetValue.Hidden;
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (C12775o.m28631a(((Number) C12716r0.m28417h(map2, modalBottomSheetValue2)).floatValue(), f)) {
            return;
        }
        if (this.$state.isAnimationRunning$material_release()) {
            this.$animateTo.invoke(modalBottomSheetValue2, Float.valueOf(this.$state.getLastVelocity$material_release()));
        } else {
            this.$snapTo.invoke(modalBottomSheetValue2);
        }
    }
}
