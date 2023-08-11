package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1", mo50610f = "Clickable.kt", mo50611l = {549}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1 */
/* compiled from: Clickable.kt */
final class C0364x8f00ca0b extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ PressInteraction.Press $it;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0364x8f00ca0b(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, C12074d<? super C0364x8f00ca0b> dVar) {
        super(2, dVar);
        this.$interactionSource = mutableInteractionSource;
        this.$it = press;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new C0364x8f00ca0b(this.$interactionSource, this.$it, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            PressInteraction.Release release = new PressInteraction.Release(this.$it);
            this.label = 1;
            if (mutableInteractionSource.emit(release, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((C0364x8f00ca0b) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
