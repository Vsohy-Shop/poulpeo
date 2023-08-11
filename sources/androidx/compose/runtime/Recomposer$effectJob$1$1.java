package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p336ef.C11921v;
import p466yf.C14000m1;
import p466yf.C14002n;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1408:1\n70#2:1409\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n*L\n234#1:1409\n*E\n"})
/* compiled from: Recomposer.kt */
final class Recomposer$effectJob$1$1 extends C12777p implements Function1<Throwable, C11921v> {
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$effectJob$1$1(Recomposer recomposer) {
        super(1);
        this.this$0 = recomposer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Throwable th) {
        C14002n nVar;
        C14002n nVar2;
        CancellationException a = C14000m1.m32454a("Recomposer effect job completed", th);
        Object access$getStateLock$p = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (access$getStateLock$p) {
            C14054y1 access$getRunnerJob$p = recomposer.runnerJob;
            nVar = null;
            if (access$getRunnerJob$p != null) {
                recomposer._state.setValue(Recomposer.State.ShuttingDown);
                if (!recomposer.isClosed) {
                    access$getRunnerJob$p.cancel(a);
                } else if (recomposer.workContinuation != null) {
                    nVar2 = recomposer.workContinuation;
                    recomposer.workContinuation = null;
                    access$getRunnerJob$p.mo53704O(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                    nVar = nVar2;
                }
                nVar2 = null;
                recomposer.workContinuation = null;
                access$getRunnerJob$p.mo53704O(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                nVar = nVar2;
            } else {
                recomposer.closeCause = a;
                recomposer._state.setValue(Recomposer.State.ShutDown);
                C11921v vVar = C11921v.f18618a;
            }
        }
        if (nVar != null) {
            C11907m.C11908a aVar = C11907m.f18600b;
            nVar.resumeWith(C11907m.m25696a(C11921v.f18618a));
        }
    }
}
