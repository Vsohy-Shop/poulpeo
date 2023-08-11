package androidx.compose.foundation.text;

import androidx.compose.p002ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: CoreText.kt */
final class TextController$onRemembered$1$1 extends C12777p implements C13074a<LayoutCoordinates> {
    final /* synthetic */ TextController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextController$onRemembered$1$1(TextController textController) {
        super(0);
        this.this$0 = textController;
    }

    public final LayoutCoordinates invoke() {
        return this.this$0.getState().getLayoutCoordinates();
    }
}
