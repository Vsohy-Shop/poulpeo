package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.TextLayoutResult;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: CoreText.kt */
final class TextState$onTextLayout$1 extends C12777p implements Function1<TextLayoutResult, C11921v> {
    public static final TextState$onTextLayout$1 INSTANCE = new TextState$onTextLayout$1();

    TextState$onTextLayout$1() {
        super(1);
    }

    public final void invoke(TextLayoutResult textLayoutResult) {
        C12775o.m28639i(textLayoutResult, "it");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextLayoutResult) obj);
        return C11921v.f18618a;
    }
}
