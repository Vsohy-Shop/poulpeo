package androidx.compose.p002ui.input.rotary;

import androidx.compose.p002ui.Modifier;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.input.rotary.RotaryInputModifierNodeImpl */
/* compiled from: RotaryInputModifierNode.kt */
public final class RotaryInputModifierNodeImpl extends Modifier.Node implements RotaryInputModifierNode {
    private Function1<? super RotaryScrollEvent, Boolean> onEvent;
    private Function1<? super RotaryScrollEvent, Boolean> onPreEvent;

    public RotaryInputModifierNodeImpl(Function1<? super RotaryScrollEvent, Boolean> function1, Function1<? super RotaryScrollEvent, Boolean> function12) {
        this.onEvent = function1;
        this.onPreEvent = function12;
    }

    public final Function1<RotaryScrollEvent, Boolean> getOnEvent() {
        return this.onEvent;
    }

    public final Function1<RotaryScrollEvent, Boolean> getOnPreEvent() {
        return this.onPreEvent;
    }

    public boolean onPreRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
        C12775o.m28639i(rotaryScrollEvent, NotificationCompat.CATEGORY_EVENT);
        Function1<? super RotaryScrollEvent, Boolean> function1 = this.onPreEvent;
        if (function1 != null) {
            return function1.invoke(rotaryScrollEvent).booleanValue();
        }
        return false;
    }

    public boolean onRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
        C12775o.m28639i(rotaryScrollEvent, NotificationCompat.CATEGORY_EVENT);
        Function1<? super RotaryScrollEvent, Boolean> function1 = this.onEvent;
        if (function1 != null) {
            return function1.invoke(rotaryScrollEvent).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(Function1<? super RotaryScrollEvent, Boolean> function1) {
        this.onEvent = function1;
    }

    public final void setOnPreEvent(Function1<? super RotaryScrollEvent, Boolean> function1) {
        this.onPreEvent = function1;
    }
}
