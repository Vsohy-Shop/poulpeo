package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.focus.FocusModifierKt;
import androidx.compose.p002ui.focus.FocusPropertiesKt;
import androidx.compose.p002ui.platform.InspectableModifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,227:1\n135#2:228\n135#2:229\n135#2:230\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n63#1:228\n212#1:229\n225#1:230\n*E\n"})
/* compiled from: Focusable.kt */
public final class FocusableKt {
    private static final InspectableModifier focusGroupInspectorInfo;

    static {
        Function1 function1;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new FocusableKt$special$$inlined$debugInspectorInfo$1();
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        focusGroupInspectorInfo = new InspectableModifier(function1);
    }

    @ExperimentalFoundationApi
    public static final Modifier focusGroup(Modifier modifier) {
        C12775o.m28639i(modifier, "<this>");
        return FocusModifierKt.focusTarget(FocusPropertiesKt.focusProperties(modifier.then(focusGroupInspectorInfo), FocusableKt$focusGroup$1.INSTANCE));
    }

    public static final Modifier focusable(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new FocusableKt$focusable$$inlined$debugInspectorInfo$1(z, mutableInteractionSource);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new FocusableKt$focusable$2(mutableInteractionSource, z));
    }

    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z, mutableInteractionSource);
    }

    public static final Modifier focusableInNonTouchMode(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0365x7ba24b5b(z, mutableInteractionSource);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new FocusableKt$focusableInNonTouchMode$2(z, mutableInteractionSource));
    }
}
