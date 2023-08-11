package androidx.compose.foundation.text;

import androidx.compose.p002ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.TextLayoutResult;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: CoreText.kt */
final class TextController$createSemanticsModifierFor$1 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    final /* synthetic */ AnnotatedString $text;
    final /* synthetic */ TextController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextController$createSemanticsModifierFor$1(AnnotatedString annotatedString, TextController textController) {
        super(1);
        this.$text = annotatedString;
        this.this$0 = textController;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, this.$text);
        final TextController textController = this.this$0;
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, (String) null, new Function1<List<TextLayoutResult>, Boolean>() {
            public final Boolean invoke(List<TextLayoutResult> list) {
                boolean z;
                C12775o.m28639i(list, "it");
                if (textController.getState().getLayoutResult() != null) {
                    TextLayoutResult layoutResult = textController.getState().getLayoutResult();
                    C12775o.m28636f(layoutResult);
                    list.add(layoutResult);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }, 1, (Object) null);
    }
}
