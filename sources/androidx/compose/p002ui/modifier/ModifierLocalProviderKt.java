package androidx.compose.p002ui.modifier;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nModifierLocalProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,69:1\n135#2:70\n*S KotlinDebug\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n*L\n59#1:70\n*E\n"})
/* renamed from: androidx.compose.ui.modifier.ModifierLocalProviderKt */
/* compiled from: ModifierLocalProvider.kt */
public final class ModifierLocalProviderKt {
    @ExperimentalComposeUiApi
    public static final <T> Modifier modifierLocalProvider(Modifier modifier, ProvidableModifierLocal<T> providableModifierLocal, C13074a<? extends T> aVar) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(providableModifierLocal, "key");
        C12775o.m28639i(aVar, "value");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C1054xd651ace7(providableModifierLocal, aVar);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new ModifierLocalProviderKt$modifierLocalProvider$1(providableModifierLocal, aVar, function1));
    }
}
