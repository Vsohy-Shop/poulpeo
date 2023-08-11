package androidx.compose.foundation.text;

import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.text.input.OffsetMapping;
import androidx.compose.p002ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$drawModifier$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1087:1\n245#2:1088\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$drawModifier$1\n*L\n372#1:1088\n*E\n"})
/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$drawModifier$1 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$drawModifier$1(TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        super(1);
        this.$state = textFieldState;
        this.$value = textFieldValue;
        this.$offsetMapping = offsetMapping;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "$this$drawBehind");
        TextLayoutResultProxy layoutResult = this.$state.getLayoutResult();
        if (layoutResult != null) {
            TextFieldValue textFieldValue = this.$value;
            OffsetMapping offsetMapping = this.$offsetMapping;
            TextFieldState textFieldState = this.$state;
            Canvas canvas = drawScope.getDrawContext().getCanvas();
            TextFieldDelegate.Companion.draw$foundation_release(canvas, textFieldValue, offsetMapping, layoutResult.getValue(), textFieldState.getSelectionPaint());
        }
    }
}
