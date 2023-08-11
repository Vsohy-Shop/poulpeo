package androidx.compose.foundation.layout;

import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
/* compiled from: Padding.kt */
public interface PaddingValues {

    @Immutable
    @SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n155#2:437\n155#2:438\n155#2:439\n155#2:440\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n*L\n218#1:437\n220#1:438\n222#1:439\n224#1:440\n*E\n"})
    /* compiled from: Padding.kt */
    public static final class Absolute implements PaddingValues {
        public static final int $stable = 0;
        private final float bottom;
        private final float left;
        private final float right;
        private final float top;

        public /* synthetic */ Absolute(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, f3, f4);
        }

        /* renamed from: calculateBottomPadding-D9Ej5fM  reason: not valid java name */
        public float m33286calculateBottomPaddingD9Ej5fM() {
            return this.bottom;
        }

        /* renamed from: calculateLeftPadding-u2uoSUM  reason: not valid java name */
        public float m33287calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
            C12775o.m28639i(layoutDirection, "layoutDirection");
            return this.left;
        }

        /* renamed from: calculateRightPadding-u2uoSUM  reason: not valid java name */
        public float m33288calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
            C12775o.m28639i(layoutDirection, "layoutDirection");
            return this.right;
        }

        /* renamed from: calculateTopPadding-D9Ej5fM  reason: not valid java name */
        public float m33289calculateTopPaddingD9Ej5fM() {
            return this.top;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Absolute)) {
                return false;
            }
            Absolute absolute = (Absolute) obj;
            if (!C1232Dp.m38473equalsimpl0(this.left, absolute.left) || !C1232Dp.m38473equalsimpl0(this.top, absolute.top) || !C1232Dp.m38473equalsimpl0(this.right, absolute.right) || !C1232Dp.m38473equalsimpl0(this.bottom, absolute.bottom)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((((C1232Dp.m38474hashCodeimpl(this.left) * 31) + C1232Dp.m38474hashCodeimpl(this.top)) * 31) + C1232Dp.m38474hashCodeimpl(this.right)) * 31) + C1232Dp.m38474hashCodeimpl(this.bottom);
        }

        public String toString() {
            return "PaddingValues.Absolute(left=" + C1232Dp.m38479toStringimpl(this.left) + ", top=" + C1232Dp.m38479toStringimpl(this.top) + ", right=" + C1232Dp.m38479toStringimpl(this.right) + ", bottom=" + C1232Dp.m38479toStringimpl(this.bottom) + ')';
        }

        private Absolute(float f, float f2, float f3, float f4) {
            this.left = f;
            this.top = f2;
            this.right = f3;
            this.bottom = f4;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Absolute(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C1232Dp.m38468constructorimpl((float) 0) : f, (i & 2) != 0 ? C1232Dp.m38468constructorimpl((float) 0) : f2, (i & 4) != 0 ? C1232Dp.m38468constructorimpl((float) 0) : f3, (i & 8) != 0 ? C1232Dp.m38468constructorimpl((float) 0) : f4, (DefaultConstructorMarker) null);
        }

        @Stable
        /* renamed from: getBottom-D9Ej5fM$annotations  reason: not valid java name */
        private static /* synthetic */ void m33282getBottomD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getLeft-D9Ej5fM$annotations  reason: not valid java name */
        private static /* synthetic */ void m33283getLeftD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getRight-D9Ej5fM$annotations  reason: not valid java name */
        private static /* synthetic */ void m33284getRightD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getTop-D9Ej5fM$annotations  reason: not valid java name */
        private static /* synthetic */ void m33285getTopD9Ej5fM$annotations() {
        }
    }

    /* renamed from: calculateBottomPadding-D9Ej5fM  reason: not valid java name */
    float m33278calculateBottomPaddingD9Ej5fM();

    /* renamed from: calculateLeftPadding-u2uoSUM  reason: not valid java name */
    float m33279calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection);

    /* renamed from: calculateRightPadding-u2uoSUM  reason: not valid java name */
    float m33280calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection);

    /* renamed from: calculateTopPadding-D9Ej5fM  reason: not valid java name */
    float m33281calculateTopPaddingD9Ej5fM();
}
