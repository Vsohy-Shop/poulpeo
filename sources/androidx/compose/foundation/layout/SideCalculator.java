package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12775o;

@RequiresApi(30)
/* compiled from: WindowInsetsConnection.android.kt */
interface SideCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WindowInsetsConnection.android.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final SideCalculator$Companion$BottomSideCalculator$1 BottomSideCalculator = new SideCalculator$Companion$BottomSideCalculator$1();
        private static final SideCalculator$Companion$LeftSideCalculator$1 LeftSideCalculator = new SideCalculator$Companion$LeftSideCalculator$1();
        private static final SideCalculator$Companion$RightSideCalculator$1 RightSideCalculator = new SideCalculator$Companion$RightSideCalculator$1();
        private static final SideCalculator$Companion$TopSideCalculator$1 TopSideCalculator = new SideCalculator$Companion$TopSideCalculator$1();

        private Companion() {
        }

        /* renamed from: chooseCalculator-ni1skBw  reason: not valid java name */
        public final SideCalculator m33313chooseCalculatorni1skBw(int i, LayoutDirection layoutDirection) {
            C12775o.m28639i(layoutDirection, "layoutDirection");
            WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
            if (WindowInsetsSides.m33369equalsimpl0(i, companion.m33383getLeftJoeWqyM())) {
                return LeftSideCalculator;
            }
            if (WindowInsetsSides.m33369equalsimpl0(i, companion.m33386getTopJoeWqyM())) {
                return TopSideCalculator;
            }
            if (WindowInsetsSides.m33369equalsimpl0(i, companion.m33384getRightJoeWqyM())) {
                return RightSideCalculator;
            }
            if (WindowInsetsSides.m33369equalsimpl0(i, companion.m33380getBottomJoeWqyM())) {
                return BottomSideCalculator;
            }
            if (WindowInsetsSides.m33369equalsimpl0(i, companion.m33385getStartJoeWqyM())) {
                if (layoutDirection == LayoutDirection.Ltr) {
                    return LeftSideCalculator;
                }
                return RightSideCalculator;
            } else if (!WindowInsetsSides.m33369equalsimpl0(i, companion.m33381getEndJoeWqyM())) {
                throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed".toString());
            } else if (layoutDirection == LayoutDirection.Ltr) {
                return RightSideCalculator;
            } else {
                return LeftSideCalculator;
            }
        }
    }

    Insets adjustInsets(Insets insets, int i);

    /* renamed from: consumedOffsets-MK-Hz9U  reason: not valid java name */
    long m33311consumedOffsetsMKHz9U(long j);

    /* renamed from: consumedVelocity-QWom1Mo  reason: not valid java name */
    long m33312consumedVelocityQWom1Mo(long j, float f);

    float hideMotion(float f, float f2) {
        return C13537l.m30881h(motionOf(f, f2), 0.0f);
    }

    float motionOf(float f, float f2);

    float showMotion(float f, float f2) {
        return C13537l.m30876c(motionOf(f, f2), 0.0f);
    }

    int valueOf(Insets insets);
}
