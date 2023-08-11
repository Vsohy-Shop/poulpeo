package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.input.rotary.RotaryScrollEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$rotaryInputModifier$1 */
/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeView$rotaryInputModifier$1 extends C12777p implements Function1<RotaryScrollEvent, Boolean> {
    public static final AndroidComposeView$rotaryInputModifier$1 INSTANCE = new AndroidComposeView$rotaryInputModifier$1();

    AndroidComposeView$rotaryInputModifier$1() {
        super(1);
    }

    public final Boolean invoke(RotaryScrollEvent rotaryScrollEvent) {
        C12775o.m28639i(rotaryScrollEvent, "it");
        return Boolean.FALSE;
    }
}
