package androidx.compose.foundation;

import androidx.compose.p002ui.focus.FocusProperties;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Focusable.kt */
final class FocusableKt$focusGroup$1 extends C12777p implements Function1<FocusProperties, C11921v> {
    public static final FocusableKt$focusGroup$1 INSTANCE = new FocusableKt$focusGroup$1();

    FocusableKt$focusGroup$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FocusProperties) obj);
        return C11921v.f18618a;
    }

    public final void invoke(FocusProperties focusProperties) {
        C12775o.m28639i(focusProperties, "$this$focusProperties");
        focusProperties.setCanFocus(false);
    }
}
