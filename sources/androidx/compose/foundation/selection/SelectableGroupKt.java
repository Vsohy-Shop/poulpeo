package androidx.compose.foundation.selection;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import kotlin.jvm.internal.C12775o;

/* compiled from: SelectableGroup.kt */
public final class SelectableGroupKt {
    public static final Modifier selectableGroup(Modifier modifier) {
        C12775o.m28639i(modifier, "<this>");
        return SemanticsModifierKt.semantics$default(modifier, false, SelectableGroupKt$selectableGroup$1.INSTANCE, 1, (Object) null);
    }
}
