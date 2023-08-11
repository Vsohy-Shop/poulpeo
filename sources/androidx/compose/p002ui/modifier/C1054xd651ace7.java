package androidx.compose.p002ui.modifier;

import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n*L\n1#1,170:1\n60#2,4:171\n*E\n"})
/* renamed from: androidx.compose.ui.modifier.ModifierLocalProviderKt$modifierLocalProvider$$inlined$debugInspectorInfo$1 */
/* compiled from: InspectableValue.kt */
public final class C1054xd651ace7 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ ProvidableModifierLocal $key$inlined;
    final /* synthetic */ C13074a $value$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1054xd651ace7(ProvidableModifierLocal providableModifierLocal, C13074a aVar) {
        super(1);
        this.$key$inlined = providableModifierLocal;
        this.$value$inlined = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("modifierLocalProvider");
        inspectorInfo.getProperties().set("key", this.$key$inlined);
        inspectorInfo.getProperties().set("value", this.$value$inlined);
    }
}
