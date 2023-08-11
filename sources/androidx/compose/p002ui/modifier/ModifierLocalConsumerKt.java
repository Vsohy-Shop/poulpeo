package androidx.compose.p002ui.modifier;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nModifierLocalConsumer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalConsumer.kt\nandroidx/compose/ui/modifier/ModifierLocalConsumerKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,74:1\n135#2:75\n*S KotlinDebug\n*F\n+ 1 ModifierLocalConsumer.kt\nandroidx/compose/ui/modifier/ModifierLocalConsumerKt\n*L\n51#1:75\n*E\n"})
/* renamed from: androidx.compose.ui.modifier.ModifierLocalConsumerKt */
/* compiled from: ModifierLocalConsumer.kt */
public final class ModifierLocalConsumerKt {
    @ExperimentalComposeUiApi
    @Stable
    public static final Modifier modifierLocalConsumer(Modifier modifier, Function1<? super ModifierLocalReadScope, C11921v> function1) {
        Function1 function12;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "consumer");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function12 = new C1053x4a113c71(function1);
        } else {
            function12 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new ModifierLocalConsumerImpl(function1, function12));
    }
}
