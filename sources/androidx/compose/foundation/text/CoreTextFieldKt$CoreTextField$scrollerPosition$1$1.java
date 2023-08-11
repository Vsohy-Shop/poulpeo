package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13074a;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$scrollerPosition$1$1 extends C12777p implements C13074a<TextFieldScrollerPosition> {
    final /* synthetic */ Orientation $orientation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$scrollerPosition$1$1(Orientation orientation) {
        super(0);
        this.$orientation = orientation;
    }

    public final TextFieldScrollerPosition invoke() {
        return new TextFieldScrollerPosition(this.$orientation, 0.0f, 2, (DefaultConstructorMarker) null);
    }
}
