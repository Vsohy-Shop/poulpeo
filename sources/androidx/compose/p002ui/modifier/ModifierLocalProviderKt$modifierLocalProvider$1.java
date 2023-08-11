package androidx.compose.p002ui.modifier;

import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nModifierLocalProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt$modifierLocalProvider$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,69:1\n76#2:70\n*S KotlinDebug\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt$modifierLocalProvider$1\n*L\n66#1:70\n*E\n"})
/* renamed from: androidx.compose.ui.modifier.ModifierLocalProviderKt$modifierLocalProvider$1 */
/* compiled from: ModifierLocalProvider.kt */
public final class ModifierLocalProviderKt$modifierLocalProvider$1 extends InspectorValueInfo implements ModifierLocalProvider<T> {
    private final ProvidableModifierLocal<T> key;
    private final State value$delegate;

    ModifierLocalProviderKt$modifierLocalProvider$1(ProvidableModifierLocal<T> providableModifierLocal, C13074a<? extends T> aVar, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        this.key = providableModifierLocal;
        this.value$delegate = SnapshotStateKt.derivedStateOf(aVar);
    }

    public ProvidableModifierLocal<T> getKey() {
        return this.key;
    }

    public T getValue() {
        return this.value$delegate.getValue();
    }
}
