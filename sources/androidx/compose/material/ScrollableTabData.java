package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import androidx.compose.p002ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;
import p355hf.C12079g;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* compiled from: TabRow.kt */
final class ScrollableTabData {
    private final C13995l0 coroutineScope;
    /* access modifiers changed from: private */
    public final ScrollState scrollState;
    private Integer selectedTab;

    public ScrollableTabData(ScrollState scrollState2, C13995l0 l0Var) {
        C12775o.m28639i(scrollState2, "scrollState");
        C12775o.m28639i(l0Var, "coroutineScope");
        this.scrollState = scrollState2;
        this.coroutineScope = l0Var;
    }

    private final int calculateTabOffset(TabPosition tabPosition, Density density, int i, List<TabPosition> list) {
        int r6 = density.m38443roundToPx0680j_4(((TabPosition) C12686e0.m28231j0(list)).m34162getRightD9Ej5fM()) + i;
        int maxValue = r6 - this.scrollState.getMaxValue();
        return C13537l.m30886m(density.m38443roundToPx0680j_4(tabPosition.m34161getLeftD9Ej5fM()) - ((maxValue / 2) - (density.m38443roundToPx0680j_4(tabPosition.m34163getWidthD9Ej5fM()) / 2)), 0, C13537l.m30877d(r6 - maxValue, 0));
    }

    public final void onLaidOut(Density density, int i, List<TabPosition> list, int i2) {
        int calculateTabOffset;
        C12775o.m28639i(density, "density");
        C12775o.m28639i(list, "tabPositions");
        Integer num = this.selectedTab;
        if (num == null || num.intValue() != i2) {
            this.selectedTab = Integer.valueOf(i2);
            TabPosition tabPosition = (TabPosition) C12686e0.m28224c0(list, i2);
            if (tabPosition != null && this.scrollState.getValue() != (calculateTabOffset = calculateTabOffset(tabPosition, density, i, list))) {
                C14054y1 unused = C13985j.m32422d(this.coroutineScope, (C12079g) null, (C14004n0) null, new ScrollableTabData$onLaidOut$1$1(this, calculateTabOffset, (C12074d<? super ScrollableTabData$onLaidOut$1$1>) null), 3, (Object) null);
            }
        }
    }
}
