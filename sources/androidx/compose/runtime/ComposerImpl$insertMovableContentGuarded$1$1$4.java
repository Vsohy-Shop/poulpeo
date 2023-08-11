package androidx.compose.runtime;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$4\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4528:1\n33#2,6:4529\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$4\n*L\n3156#1:4529,6\n*E\n"})
/* compiled from: Composer.kt */
final class ComposerImpl$insertMovableContentGuarded$1$1$4 extends C12777p implements C13089p<Applier<?>, SlotWriter, RememberManager, C11921v> {
    final /* synthetic */ MovableContentStateReference $from;
    final /* synthetic */ MovableContentState $resolvedState;
    final /* synthetic */ MovableContentStateReference $to;
    final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$insertMovableContentGuarded$1$1$4(MovableContentState movableContentState, ComposerImpl composerImpl, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        super(3);
        this.$resolvedState = movableContentState;
        this.this$0 = composerImpl;
        this.$from = movableContentStateReference;
        this.$to = movableContentStateReference2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Applier<?>) (Applier) obj, (SlotWriter) obj2, (RememberManager) obj3);
        return C11921v.f18618a;
    }

    public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        C12775o.m28639i(applier, "<anonymous parameter 0>");
        C12775o.m28639i(slotWriter, "slots");
        C12775o.m28639i(rememberManager, "<anonymous parameter 2>");
        MovableContentState movableContentState = this.$resolvedState;
        if (movableContentState == null && (movableContentState = this.this$0.parentContext.movableContentStateResolve$runtime_release(this.$from)) == null) {
            ComposerKt.composeRuntimeError("Could not resolve state for movable content");
            throw new KotlinNothingValueException();
        }
        List<Anchor> moveIntoGroupFrom = slotWriter.moveIntoGroupFrom(1, movableContentState.getSlotTable$runtime_release(), 2);
        if (!moveIntoGroupFrom.isEmpty()) {
            ControlledComposition composition$runtime_release = this.$to.getComposition$runtime_release();
            C12775o.m28637g(composition$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            CompositionImpl compositionImpl = (CompositionImpl) composition$runtime_release;
            int size = moveIntoGroupFrom.size();
            for (int i = 0; i < size; i++) {
                Object slot = slotWriter.slot(moveIntoGroupFrom.get(i), 0);
                RecomposeScopeImpl recomposeScopeImpl = slot instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) slot : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.adoptedBy(compositionImpl);
                }
            }
        }
    }
}
