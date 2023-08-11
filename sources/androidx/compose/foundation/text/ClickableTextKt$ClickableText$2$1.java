package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: ClickableText.kt */
final class ClickableTextKt$ClickableText$2$1 extends C12777p implements Function1<TextLayoutResult, C11921v> {
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
    final /* synthetic */ Function1<TextLayoutResult, C11921v> $onTextLayout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableTextKt$ClickableText$2$1(MutableState<TextLayoutResult> mutableState, Function1<? super TextLayoutResult, C11921v> function1) {
        super(1);
        this.$layoutResult = mutableState;
        this.$onTextLayout = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextLayoutResult) obj);
        return C11921v.f18618a;
    }

    public final void invoke(TextLayoutResult textLayoutResult) {
        C12775o.m28639i(textLayoutResult, "it");
        this.$layoutResult.setValue(textLayoutResult);
        this.$onTextLayout.invoke(textLayoutResult);
    }
}
