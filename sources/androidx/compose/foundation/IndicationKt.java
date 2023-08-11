package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,186:1\n135#2:187\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt\n*L\n115#1:187\n*E\n"})
/* compiled from: Indication.kt */
public final class IndicationKt {
    private static final ProvidableCompositionLocal<Indication> LocalIndication = CompositionLocalKt.staticCompositionLocalOf(IndicationKt$LocalIndication$1.INSTANCE);

    public static final ProvidableCompositionLocal<Indication> getLocalIndication() {
        return LocalIndication;
    }

    public static final Modifier indication(Modifier modifier, InteractionSource interactionSource, Indication indication) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(interactionSource, "interactionSource");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new IndicationKt$indication$$inlined$debugInspectorInfo$1(indication, interactionSource);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new IndicationKt$indication$2(indication, interactionSource));
    }
}
