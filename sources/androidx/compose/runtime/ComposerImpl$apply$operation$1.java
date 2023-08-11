package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Composer.kt */
final class ComposerImpl$apply$operation$1 extends C12777p implements C13089p<Applier<?>, SlotWriter, RememberManager, C11921v> {
    final /* synthetic */ C13088o<T, V, C11921v> $block;
    final /* synthetic */ V $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$apply$operation$1(C13088o<? super T, ? super V, C11921v> oVar, V v) {
        super(3);
        this.$block = oVar;
        this.$value = v;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Applier<?>) (Applier) obj, (SlotWriter) obj2, (RememberManager) obj3);
        return C11921v.f18618a;
    }

    public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        C12775o.m28639i(applier, "applier");
        C12775o.m28639i(slotWriter, "<anonymous parameter 1>");
        C12775o.m28639i(rememberManager, "<anonymous parameter 2>");
        this.$block.invoke(applier.getCurrent(), this.$value);
    }
}
