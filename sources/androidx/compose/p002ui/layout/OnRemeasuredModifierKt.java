package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nOnRemeasuredModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnRemeasuredModifier.kt\nandroidx/compose/ui/layout/OnRemeasuredModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,96:1\n135#2:97\n*S KotlinDebug\n*F\n+ 1 OnRemeasuredModifier.kt\nandroidx/compose/ui/layout/OnRemeasuredModifierKt\n*L\n50#1:97\n*E\n"})
/* renamed from: androidx.compose.ui.layout.OnRemeasuredModifierKt */
/* compiled from: OnRemeasuredModifier.kt */
public final class OnRemeasuredModifierKt {
    @Stable
    public static final Modifier onSizeChanged(Modifier modifier, Function1<? super IntSize, C11921v> function1) {
        Function1 function12;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "onSizeChanged");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function12 = new C1049x4cc3abe0(function1);
        } else {
            function12 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new OnSizeChangedModifier(function1, function12));
    }
}
