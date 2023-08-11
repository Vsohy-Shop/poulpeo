package androidx.compose.foundation.text;

import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.text.TextStyle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,134:1\n135#2:135\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n53#1:135\n*E\n"})
/* compiled from: HeightInLinesModifier.kt */
public final class HeightInLinesModifierKt {
    public static final int DefaultMinLines = 1;

    public static final Modifier heightInLines(Modifier modifier, TextStyle textStyle, int i, int i2) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(textStyle, "textStyle");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0616x3f87673a(i, i2, textStyle);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new HeightInLinesModifierKt$heightInLines$2(i, i2, textStyle));
    }

    public static /* synthetic */ Modifier heightInLines$default(Modifier modifier, TextStyle textStyle, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 1;
        }
        if ((i3 & 4) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return heightInLines(modifier, textStyle, i, i2);
    }

    public static final void validateMinMaxLines(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i <= 0 || i2 <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (i > i2) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(("minLines " + i + " must be less than or equal to maxLines " + i2).toString());
            }
            return;
        }
        throw new IllegalArgumentException(("both minLines " + i + " and maxLines " + i2 + " must be greater than zero").toString());
    }
}
