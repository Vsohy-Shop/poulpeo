package androidx.compose.foundation.text;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollBackward$2 */
/* compiled from: TextFieldScroll.kt */
final class C0647x355dcd8c extends C12777p implements C13074a<Boolean> {
    final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0647x355dcd8c(TextFieldScrollerPosition textFieldScrollerPosition) {
        super(0);
        this.$scrollerPosition = textFieldScrollerPosition;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(this.$scrollerPosition.getOffset() > 0.0f);
    }
}
