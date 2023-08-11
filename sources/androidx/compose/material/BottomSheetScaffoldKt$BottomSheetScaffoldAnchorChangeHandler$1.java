package androidx.compose.material;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: BottomSheetScaffold.kt */
final class BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeHandler$1 implements AnchorChangeHandler<BottomSheetValue> {
    final /* synthetic */ Function1<BottomSheetValue, C11921v> $animateTo;
    final /* synthetic */ Function1<BottomSheetValue, C11921v> $snapTo;
    final /* synthetic */ BottomSheetState $state;

    /* compiled from: BottomSheetScaffold.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.material.BottomSheetValue[] r0 = androidx.compose.material.BottomSheetValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material.BottomSheetValue r1 = androidx.compose.material.BottomSheetValue.Collapsed     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material.BottomSheetValue r1 = androidx.compose.material.BottomSheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeHandler$1.WhenMappings.<clinit>():void");
        }
    }

    BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeHandler$1(BottomSheetState bottomSheetState, Function1<? super BottomSheetValue, C11921v> function1, Function1<? super BottomSheetValue, C11921v> function12) {
        this.$state = bottomSheetState;
        this.$animateTo = function1;
        this.$snapTo = function12;
    }

    public final void onAnchorsChanged(BottomSheetValue bottomSheetValue, Map<BottomSheetValue, Float> map, Map<BottomSheetValue, Float> map2) {
        BottomSheetValue bottomSheetValue2;
        C12775o.m28639i(bottomSheetValue, "previousTarget");
        C12775o.m28639i(map, "previousAnchors");
        C12775o.m28639i(map2, "newAnchors");
        Float f = map.get(bottomSheetValue);
        int i = WhenMappings.$EnumSwitchMapping$0[bottomSheetValue.ordinal()];
        if (i == 1) {
            bottomSheetValue2 = BottomSheetValue.Collapsed;
        } else if (i == 2) {
            bottomSheetValue2 = BottomSheetValue.Expanded;
            if (!map2.containsKey(bottomSheetValue2)) {
                bottomSheetValue2 = BottomSheetValue.Collapsed;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (C12775o.m28631a(((Number) C12716r0.m28417h(map2, bottomSheetValue2)).floatValue(), f)) {
            return;
        }
        if (this.$state.isAnimationRunning$material_release()) {
            this.$animateTo.invoke(bottomSheetValue2);
        } else {
            this.$snapTo.invoke(bottomSheetValue2);
        }
    }
}
