package androidx.compose.foundation.text;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.text.input.OffsetMapping;
import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTextFieldCursor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,100:1\n154#2:101\n*S KotlinDebug\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt\n*L\n95#1:101\n*E\n"})
/* compiled from: TextFieldCursor.kt */
public final class TextFieldCursorKt {
    private static final float DefaultCursorThickness = C1232Dp.m38468constructorimpl((float) 2);
    /* access modifiers changed from: private */
    public static final AnimationSpec<Float> cursorAnimationSpec = AnimationSpecKt.m32896infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(TextFieldCursorKt$cursorAnimationSpec$1.INSTANCE), (RepeatMode) null, 0, 6, (Object) null);

    public static final Modifier cursor(Modifier modifier, TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Brush brush, boolean z) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(textFieldState, "state");
        C12775o.m28639i(textFieldValue, "value");
        C12775o.m28639i(offsetMapping, "offsetMapping");
        C12775o.m28639i(brush, "cursorBrush");
        if (z) {
            return ComposedModifierKt.composed$default(modifier, (Function1) null, new TextFieldCursorKt$cursor$1(brush, textFieldState, textFieldValue, offsetMapping), 1, (Object) null);
        }
        return modifier;
    }

    public static final float getDefaultCursorThickness() {
        return DefaultCursorThickness;
    }
}
