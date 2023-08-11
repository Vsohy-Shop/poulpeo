package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nOnGloballyPositionedModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnGloballyPositionedModifier.kt\nandroidx/compose/ui/layout/OnGloballyPositionedModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,92:1\n135#2:93\n*S KotlinDebug\n*F\n+ 1 OnGloballyPositionedModifier.kt\nandroidx/compose/ui/layout/OnGloballyPositionedModifierKt\n*L\n47#1:93\n*E\n"})
/* renamed from: androidx.compose.ui.layout.OnGloballyPositionedModifierKt */
/* compiled from: OnGloballyPositionedModifier.kt */
public final class OnGloballyPositionedModifierKt {
    @Stable
    public static final Modifier onGloballyPositioned(Modifier modifier, Function1<? super LayoutCoordinates, C11921v> function1) {
        Function1 function12;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "onGloballyPositioned");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function12 = new C1048x5a2de8bc(function1);
        } else {
            function12 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new OnGloballyPositionedModifierImpl(function1, function12));
    }
}
