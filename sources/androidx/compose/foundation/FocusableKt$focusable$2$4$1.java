package androidx.compose.foundation;

import androidx.compose.p002ui.focus.FocusRequester;
import androidx.compose.p002ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: Focusable.kt */
final class FocusableKt$focusable$2$4$1 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ MutableState<Boolean> $isFocused$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FocusableKt$focusable$2$4$1(MutableState<Boolean> mutableState, FocusRequester focusRequester) {
        super(1);
        this.$isFocused$delegate = mutableState;
        this.$focusRequester = focusRequester;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, FocusableKt$focusable$2.invoke$lambda$2(this.$isFocused$delegate));
        final FocusRequester focusRequester = this.$focusRequester;
        final MutableState<Boolean> mutableState = this.$isFocused$delegate;
        SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver, (String) null, new C13074a<Boolean>() {
            public final Boolean invoke() {
                focusRequester.requestFocus();
                return Boolean.valueOf(FocusableKt$focusable$2.invoke$lambda$2(mutableState));
            }
        }, 1, (Object) null);
    }
}
