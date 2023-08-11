package androidx.compose.foundation;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import p436tf.C13522b;

/* compiled from: ProgressSemantics.kt */
public final class ProgressSemanticsKt {
    @Stable
    public static final Modifier progressSemantics(Modifier modifier, float f, C13522b<Float> bVar, int i) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(bVar, "valueRange");
        return SemanticsModifierKt.semantics(modifier, true, new ProgressSemanticsKt$progressSemantics$1(f, bVar, i));
    }

    public static /* synthetic */ Modifier progressSemantics$default(Modifier modifier, float f, C13522b bVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bVar = C13536k.m30875b(0.0f, 1.0f);
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return progressSemantics(modifier, f, bVar, i);
    }

    @Stable
    public static final Modifier progressSemantics(Modifier modifier) {
        C12775o.m28639i(modifier, "<this>");
        return SemanticsModifierKt.semantics(modifier, true, ProgressSemanticsKt$progressSemantics$2.INSTANCE);
    }
}
