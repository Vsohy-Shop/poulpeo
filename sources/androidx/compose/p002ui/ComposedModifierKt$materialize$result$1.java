package androidx.compose.p002ui;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;
import p404of.C13089p;

/* renamed from: androidx.compose.ui.ComposedModifierKt$materialize$result$1 */
/* compiled from: ComposedModifier.kt */
final class ComposedModifierKt$materialize$result$1 extends C12777p implements C13088o<Modifier, Modifier.Element, Modifier> {
    final /* synthetic */ Composer $this_materialize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposedModifierKt$materialize$result$1(Composer composer) {
        super(2);
        this.$this_materialize = composer;
    }

    public final Modifier invoke(Modifier modifier, Modifier.Element element) {
        C12775o.m28639i(modifier, "acc");
        C12775o.m28639i(element, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        boolean z = element instanceof ComposedModifier;
        Modifier modifier2 = element;
        if (z) {
            C13089p<Modifier, Composer, Integer, Modifier> factory = ((ComposedModifier) element).getFactory();
            C12775o.m28637g(factory, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
            modifier2 = ComposedModifierKt.materialize(this.$this_materialize, (Modifier) ((C13089p) C12772l0.m28614f(factory, 3)).invoke(Modifier.Companion, this.$this_materialize, 0));
        }
        return modifier.then(modifier2);
    }
}
