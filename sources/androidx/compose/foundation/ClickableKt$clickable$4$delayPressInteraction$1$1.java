package androidx.compose.foundation;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: Clickable.kt */
final class ClickableKt$clickable$4$delayPressInteraction$1$1 extends C12777p implements C13074a<Boolean> {
    final /* synthetic */ MutableState<Boolean> $isClickableInScrollableContainer;
    final /* synthetic */ C13074a<Boolean> $isRootInScrollableContainer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$clickable$4$delayPressInteraction$1$1(MutableState<Boolean> mutableState, C13074a<Boolean> aVar) {
        super(0);
        this.$isClickableInScrollableContainer = mutableState;
        this.$isRootInScrollableContainer = aVar;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(this.$isClickableInScrollableContainer.getValue().booleanValue() || this.$isRootInScrollableContainer.invoke().booleanValue());
    }
}
