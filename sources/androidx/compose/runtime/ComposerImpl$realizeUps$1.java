package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$realizeUps$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4528:1\n1#2:4529\n*E\n"})
/* compiled from: Composer.kt */
final class ComposerImpl$realizeUps$1 extends C12777p implements C13089p<Applier<?>, SlotWriter, RememberManager, C11921v> {
    final /* synthetic */ int $count;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$realizeUps$1(int i) {
        super(3);
        this.$count = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Applier<?>) (Applier) obj, (SlotWriter) obj2, (RememberManager) obj3);
        return C11921v.f18618a;
    }

    public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        C12775o.m28639i(applier, "applier");
        C12775o.m28639i(slotWriter, "<anonymous parameter 1>");
        C12775o.m28639i(rememberManager, "<anonymous parameter 2>");
        int i = this.$count;
        for (int i2 = 0; i2 < i; i2++) {
            applier.mo10550up();
        }
    }
}
