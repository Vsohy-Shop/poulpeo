package androidx.compose.p002ui.semantics;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nSemanticsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,147:1\n135#2:148\n135#2:149\n*S KotlinDebug\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n*L\n114#1:148\n142#1:149\n*E\n"})
/* renamed from: androidx.compose.ui.semantics.SemanticsModifierKt */
/* compiled from: SemanticsModifier.kt */
public final class SemanticsModifierKt {
    public static final Modifier clearAndSetSemantics(Modifier modifier, Function1<? super SemanticsPropertyReceiver, C11921v> function1) {
        Function1 function12;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "properties");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function12 = new C1194x10017f64(function1);
        } else {
            function12 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SemanticsModifierCore(false, true, function1, function12));
    }

    public static final Modifier semantics(Modifier modifier, boolean z, Function1<? super SemanticsPropertyReceiver, C11921v> function1) {
        Function1 function12;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "properties");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function12 = new SemanticsModifierKt$semantics$$inlined$debugInspectorInfo$1(z, function1);
        } else {
            function12 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SemanticsModifierCore(z, false, function1, function12));
    }

    public static /* synthetic */ Modifier semantics$default(Modifier modifier, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return semantics(modifier, z, function1);
    }
}
