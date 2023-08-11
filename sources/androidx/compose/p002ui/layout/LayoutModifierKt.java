package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.unit.Constraints;
import kotlin.jvm.internal.C12775o;
import p404of.C13089p;

/* renamed from: androidx.compose.ui.layout.LayoutModifierKt */
/* compiled from: LayoutModifier.kt */
public final class LayoutModifierKt {
    public static final Modifier layout(Modifier modifier, C13089p<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> pVar) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(pVar, "measure");
        return modifier.then(new LayoutModifierElement(pVar));
    }
}
