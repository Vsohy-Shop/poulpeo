package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p466yf.C14002n;

@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1408:1\n46#2,5:1409\n46#2,3:1414\n50#2:1443\n70#3:1417\n70#3:1442\n33#4,6:1418\n33#4,6:1424\n33#4,6:1430\n33#4,6:1436\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n*L\n788#1:1409,5\n798#1:1414,3\n798#1:1443\n802#1:1417\n837#1:1442\n805#1:1418,6\n807#1:1424,6\n815#1:1430,6\n830#1:1436,6\n*E\n"})
/* compiled from: Recomposer.kt */
final class Recomposer$runFrameLoop$2 extends C12777p implements Function1<Long, C14002n<? super C11921v>> {
    final /* synthetic */ ProduceFrameSignal $frameSignal;
    final /* synthetic */ List<ControlledComposition> $toApply;
    final /* synthetic */ List<ControlledComposition> $toRecompose;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$runFrameLoop$2(Recomposer recomposer, List<ControlledComposition> list, List<ControlledComposition> list2, ProduceFrameSignal produceFrameSignal) {
        super(1);
        this.this$0 = recomposer;
        this.$toRecompose = list;
        this.$toApply = list2;
        this.$frameSignal = produceFrameSignal;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }

    public final C14002n<C11921v> invoke(long j) {
        int i;
        C14002n<C11921v> access$deriveStateLocked;
        if (this.this$0.broadcastFrameClock.getHasAwaiters()) {
            Recomposer recomposer = this.this$0;
            Trace trace = Trace.INSTANCE;
            Object beginSection = trace.beginSection("Recomposer:animation");
            try {
                recomposer.broadcastFrameClock.sendFrame(j);
                Snapshot.Companion.sendApplyNotifications();
                C11921v vVar = C11921v.f18618a;
                trace.endSection(beginSection);
            } catch (Throwable th) {
                Trace.INSTANCE.endSection(beginSection);
                throw th;
            }
        }
        Recomposer recomposer2 = this.this$0;
        List<ControlledComposition> list = this.$toRecompose;
        List<ControlledComposition> list2 = this.$toApply;
        ProduceFrameSignal produceFrameSignal = this.$frameSignal;
        Object beginSection2 = Trace.INSTANCE.beginSection("Recomposer:recompose");
        synchronized (recomposer2.stateLock) {
            recomposer2.recordComposerModificationsLocked();
            List access$getCompositionsAwaitingApply$p = recomposer2.compositionsAwaitingApply;
            int size = access$getCompositionsAwaitingApply$p.size();
            for (int i2 = 0; i2 < size; i2++) {
                list2.add((ControlledComposition) access$getCompositionsAwaitingApply$p.get(i2));
            }
            recomposer2.compositionsAwaitingApply.clear();
            List access$getCompositionInvalidations$p = recomposer2.compositionInvalidations;
            int size2 = access$getCompositionInvalidations$p.size();
            for (int i3 = 0; i3 < size2; i3++) {
                list.add((ControlledComposition) access$getCompositionInvalidations$p.get(i3));
            }
            recomposer2.compositionInvalidations.clear();
            produceFrameSignal.takeFrameRequestLocked();
            C11921v vVar2 = C11921v.f18618a;
        }
        IdentityArraySet identityArraySet = new IdentityArraySet();
        try {
            int size3 = list.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ControlledComposition access$performRecompose = recomposer2.performRecompose(list.get(i4), identityArraySet);
                if (access$performRecompose != null) {
                    list2.add(access$performRecompose);
                }
            }
            list.clear();
            if (!list2.isEmpty()) {
                recomposer2.changeCount = recomposer2.getChangeCount() + 1;
            }
            int size4 = list2.size();
            for (i = 0; i < size4; i++) {
                list2.get(i).applyChanges();
            }
            list2.clear();
            synchronized (recomposer2.stateLock) {
                access$deriveStateLocked = recomposer2.deriveStateLocked();
            }
            Trace.INSTANCE.endSection(beginSection2);
            return access$deriveStateLocked;
        } catch (Throwable th2) {
            Trace.INSTANCE.endSection(beginSection2);
            throw th2;
        }
    }
}
