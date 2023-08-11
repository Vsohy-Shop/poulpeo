package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Composer.kt */
final class ComposerImpl$deactivateToEndGroup$3 extends C12777p implements C13088o<Integer, Object, C11921v> {
    final /* synthetic */ int $group;
    final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$deactivateToEndGroup$3(ComposerImpl composerImpl, int i) {
        super(2);
        this.this$0 = composerImpl;
        this.$group = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).intValue(), obj2);
        return C11921v.f18618a;
    }

    public final void invoke(final int i, final Object obj) {
        if (obj instanceof RememberObserver) {
            this.this$0.reader.reposition(this.$group);
            ComposerImpl composerImpl = this.this$0;
            final int i2 = this.$group;
            ComposerImpl.recordSlotTableOperation$default(composerImpl, false, new C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((Applier<?>) (Applier) obj, (SlotWriter) obj2, (RememberManager) obj3);
                    return C11921v.f18618a;
                }

                public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    C12775o.m28639i(applier, "<anonymous parameter 0>");
                    C12775o.m28639i(slotWriter, "slots");
                    C12775o.m28639i(rememberManager, "rememberManager");
                    if (C12775o.m28634d(obj, slotWriter.slot(i2, i))) {
                        rememberManager.forgetting((RememberObserver) obj);
                        slotWriter.set(i, Composer.Companion.getEmpty());
                        return;
                    }
                    ComposerKt.composeRuntimeError("Slot table is out of sync".toString());
                    throw new KotlinNothingValueException();
                }
            }, 1, (Object) null);
        } else if (obj instanceof RecomposeScopeImpl) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
            CompositionImpl composition = recomposeScopeImpl.getComposition();
            if (composition != null) {
                composition.setPendingInvalidScopes$runtime_release(true);
                recomposeScopeImpl.release();
            }
            this.this$0.reader.reposition(this.$group);
            ComposerImpl composerImpl2 = this.this$0;
            final int i3 = this.$group;
            ComposerImpl.recordSlotTableOperation$default(composerImpl2, false, new C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((Applier<?>) (Applier) obj, (SlotWriter) obj2, (RememberManager) obj3);
                    return C11921v.f18618a;
                }

                public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    C12775o.m28639i(applier, "<anonymous parameter 0>");
                    C12775o.m28639i(slotWriter, "slots");
                    C12775o.m28639i(rememberManager, "<anonymous parameter 2>");
                    if (C12775o.m28634d(obj, slotWriter.slot(i3, i))) {
                        slotWriter.set(i, Composer.Companion.getEmpty());
                    } else {
                        ComposerKt.composeRuntimeError("Slot table is out of sync".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            }, 1, (Object) null);
        }
    }
}
