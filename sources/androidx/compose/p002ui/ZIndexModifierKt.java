package androidx.compose.p002ui;

import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nZIndexModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZIndexModifier.kt\nandroidx/compose/ui/ZIndexModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,76:1\n135#2:77\n*S KotlinDebug\n*F\n+ 1 ZIndexModifier.kt\nandroidx/compose/ui/ZIndexModifierKt\n*L\n45#1:77\n*E\n"})
/* renamed from: androidx.compose.ui.ZIndexModifierKt */
/* compiled from: ZIndexModifier.kt */
public final class ZIndexModifierKt {
    @Stable
    public static final Modifier zIndex(Modifier modifier, float f) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new ZIndexModifierKt$zIndex$$inlined$debugInspectorInfo$1(f);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new ZIndexModifier(f, function1));
    }
}
