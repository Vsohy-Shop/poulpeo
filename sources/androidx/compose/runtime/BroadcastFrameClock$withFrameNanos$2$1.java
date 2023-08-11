package androidx.compose.runtime;

import androidx.compose.runtime.BroadcastFrameClock;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$withFrameNanos$2$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,132:1\n70#2:133\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$withFrameNanos$2$1\n*L\n94#1:133\n*E\n"})
/* compiled from: BroadcastFrameClock.kt */
final class BroadcastFrameClock$withFrameNanos$2$1 extends C12777p implements Function1<Throwable, C11921v> {
    final /* synthetic */ Ref$ObjectRef<BroadcastFrameClock.FrameAwaiter<R>> $awaiter;
    final /* synthetic */ BroadcastFrameClock this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BroadcastFrameClock$withFrameNanos$2$1(BroadcastFrameClock broadcastFrameClock, Ref$ObjectRef<BroadcastFrameClock.FrameAwaiter<R>> ref$ObjectRef) {
        super(1);
        this.this$0 = broadcastFrameClock;
        this.$awaiter = ref$ObjectRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Throwable th) {
        BroadcastFrameClock.FrameAwaiter frameAwaiter;
        Object access$getLock$p = this.this$0.lock;
        BroadcastFrameClock broadcastFrameClock = this.this$0;
        Ref$ObjectRef<BroadcastFrameClock.FrameAwaiter<R>> ref$ObjectRef = this.$awaiter;
        synchronized (access$getLock$p) {
            List access$getAwaiters$p = broadcastFrameClock.awaiters;
            T t = ref$ObjectRef.f20403b;
            if (t == null) {
                C12775o.m28656z("awaiter");
                frameAwaiter = null;
            } else {
                frameAwaiter = (BroadcastFrameClock.FrameAwaiter) t;
            }
            access$getAwaiters$p.remove(frameAwaiter);
            C11921v vVar = C11921v.f18618a;
        }
    }
}
