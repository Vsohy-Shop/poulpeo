package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13089p;

/* compiled from: Composer.kt */
final class ComposerImpl$insertMovableContentGuarded$1$2 extends C12777p implements C13089p<Applier<?>, SlotWriter, RememberManager, C11921v> {
    public static final ComposerImpl$insertMovableContentGuarded$1$2 INSTANCE = new ComposerImpl$insertMovableContentGuarded$1$2();

    ComposerImpl$insertMovableContentGuarded$1$2() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Applier<?>) (Applier) obj, (SlotWriter) obj2, (RememberManager) obj3);
        return C11921v.f18618a;
    }

    public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        C12775o.m28639i(applier, "applier");
        C12775o.m28639i(slotWriter, "slots");
        C12775o.m28639i(rememberManager, "<anonymous parameter 2>");
        ComposerImpl.insertMovableContentGuarded$positionToParentOf(slotWriter, applier, 0);
        slotWriter.endGroup();
    }
}
