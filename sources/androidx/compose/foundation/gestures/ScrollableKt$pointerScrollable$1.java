package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.PointerInputChange;
import androidx.compose.p002ui.input.pointer.PointerType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: Scrollable.kt */
final class ScrollableKt$pointerScrollable$1 extends C12777p implements Function1<PointerInputChange, Boolean> {
    public static final ScrollableKt$pointerScrollable$1 INSTANCE = new ScrollableKt$pointerScrollable$1();

    ScrollableKt$pointerScrollable$1() {
        super(1);
    }

    public final Boolean invoke(PointerInputChange pointerInputChange) {
        C12775o.m28639i(pointerInputChange, "down");
        return Boolean.valueOf(!PointerType.m37241equalsimpl0(pointerInputChange.m37172getTypeT8wyACA(), PointerType.Companion.m37246getMouseT8wyACA()));
    }
}
