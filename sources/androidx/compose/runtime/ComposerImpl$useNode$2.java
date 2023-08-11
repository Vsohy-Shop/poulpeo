package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13089p;

/* compiled from: Composer.kt */
final class ComposerImpl$useNode$2 extends C12777p implements C13089p<Applier<?>, SlotWriter, RememberManager, C11921v> {
    public static final ComposerImpl$useNode$2 INSTANCE = new ComposerImpl$useNode$2();

    ComposerImpl$useNode$2() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Applier<?>) (Applier) obj, (SlotWriter) obj2, (RememberManager) obj3);
        return C11921v.f18618a;
    }

    public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        C12775o.m28639i(applier, "applier");
        C12775o.m28639i(slotWriter, "<anonymous parameter 1>");
        C12775o.m28639i(rememberManager, "<anonymous parameter 2>");
        Object current = applier.getCurrent();
        C12775o.m28637g(current, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
        ((ComposeNodeLifecycleCallback) current).onReuse();
    }
}
