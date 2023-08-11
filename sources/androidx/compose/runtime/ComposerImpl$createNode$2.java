package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13089p;

/* compiled from: Composer.kt */
final class ComposerImpl$createNode$2 extends C12777p implements C13089p<Applier<?>, SlotWriter, RememberManager, C11921v> {
    final /* synthetic */ C13074a<T> $factory;
    final /* synthetic */ Anchor $groupAnchor;
    final /* synthetic */ int $insertIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$createNode$2(C13074a<? extends T> aVar, Anchor anchor, int i) {
        super(3);
        this.$factory = aVar;
        this.$groupAnchor = anchor;
        this.$insertIndex = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Applier<?>) (Applier) obj, (SlotWriter) obj2, (RememberManager) obj3);
        return C11921v.f18618a;
    }

    public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        C12775o.m28639i(applier, "applier");
        C12775o.m28639i(slotWriter, "slots");
        C12775o.m28639i(rememberManager, "<anonymous parameter 2>");
        T invoke = this.$factory.invoke();
        slotWriter.updateNode(this.$groupAnchor, invoke);
        applier.insertTopDown(this.$insertIndex, invoke);
        applier.down(invoke);
    }
}
