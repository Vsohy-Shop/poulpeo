package androidx.compose.material;

import androidx.compose.p002ui.unit.IntSize;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: BottomSheetScaffold.kt */
final class BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$2$1 extends C12777p implements C13088o<BottomSheetValue, IntSize, Float> {
    final /* synthetic */ int $layoutHeight;
    final /* synthetic */ float $peekHeightPx;

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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$2$1.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$2$1(int i, float f) {
        super(2);
        this.$layoutHeight = i;
        this.$peekHeightPx = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m33911invokeO0kMr_c((BottomSheetValue) obj, ((IntSize) obj2).m38632unboximpl());
    }

    /* renamed from: invoke-O0kMr_c  reason: not valid java name */
    public final Float m33911invokeO0kMr_c(BottomSheetValue bottomSheetValue, long j) {
        C12775o.m28639i(bottomSheetValue, "state");
        int i = WhenMappings.$EnumSwitchMapping$0[bottomSheetValue.ordinal()];
        if (i == 1) {
            return Float.valueOf(((float) this.$layoutHeight) - this.$peekHeightPx);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        } else if (IntSize.m38627getHeightimpl(j) == C13265c.m30134c(this.$peekHeightPx)) {
            return null;
        } else {
            return Float.valueOf(((float) this.$layoutHeight) - ((float) IntSize.m38627getHeightimpl(j)));
        }
    }
}
