package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPointerIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,101:1\n135#2:102\n*S KotlinDebug\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt\n*L\n74#1:102\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.PointerIconKt */
/* compiled from: PointerIcon.kt */
public final class PointerIconKt {
    @Stable
    public static final Modifier pointerHoverIcon(Modifier modifier, PointerIcon pointerIcon, boolean z) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(pointerIcon, "icon");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1(pointerIcon, z);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new PointerIconKt$pointerHoverIcon$2(pointerIcon, z));
    }

    public static /* synthetic */ Modifier pointerHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return pointerHoverIcon(modifier, pointerIcon, z);
    }
}
