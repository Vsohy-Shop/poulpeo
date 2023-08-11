package androidx.compose.material;

import androidx.compose.p002ui.unit.IntSize;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: Drawer.kt */
final class DrawerKt$ModalDrawer$1$1$1 extends C12777p implements C13088o<DrawerValue, IntSize, Float> {
    final /* synthetic */ float $maxValue;
    final /* synthetic */ float $minValue;

    /* compiled from: Drawer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.material.DrawerValue[] r0 = androidx.compose.material.DrawerValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material.DrawerValue r1 = androidx.compose.material.DrawerValue.Closed     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material.DrawerValue r1 = androidx.compose.material.DrawerValue.Open     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$ModalDrawer$1$1$1(float f, float f2) {
        super(2);
        this.$minValue = f;
        this.$maxValue = f2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m34001invokeO0kMr_c((DrawerValue) obj, ((IntSize) obj2).m38632unboximpl());
    }

    /* renamed from: invoke-O0kMr_c  reason: not valid java name */
    public final Float m34001invokeO0kMr_c(DrawerValue drawerValue, long j) {
        C12775o.m28639i(drawerValue, "value");
        int i = WhenMappings.$EnumSwitchMapping$0[drawerValue.ordinal()];
        if (i == 1) {
            return Float.valueOf(this.$minValue);
        }
        if (i == 2) {
            return Float.valueOf(this.$maxValue);
        }
        throw new NoWhenBranchMatchedException();
    }
}
