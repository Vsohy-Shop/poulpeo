package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nHoverable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,116:1\n135#2:117\n*S KotlinDebug\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt\n*L\n50#1:117\n*E\n"})
/* compiled from: Hoverable.kt */
public final class HoverableKt {
    public static final Modifier hoverable(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(mutableInteractionSource, "interactionSource");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new HoverableKt$hoverable$$inlined$debugInspectorInfo$1(mutableInteractionSource, z);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new HoverableKt$hoverable$2(mutableInteractionSource, z));
    }

    public static /* synthetic */ Modifier hoverable$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return hoverable(modifier, mutableInteractionSource, z);
    }
}
