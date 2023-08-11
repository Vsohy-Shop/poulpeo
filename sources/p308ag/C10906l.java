package p308ag;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.SourceDebugExtension;
import p466yf.C14000m1;

@SourceDebugExtension({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,141:1\n82#1,11:142\n105#1:153\n82#1,6:154\n106#1,2:160\n92#1:162\n88#1,3:163\n33#1,5:166\n*S KotlinDebug\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n105#1:142,11\n116#1:153\n116#1:154,6\n116#1:160,2\n116#1:162\n116#1:163,3\n129#1:166,5\n*E\n"})
/* renamed from: ag.l */
/* compiled from: Channels.common.kt */
final /* synthetic */ class C10906l {
    /* renamed from: a */
    public static final void m23449a(C10914r<?> rVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = C14000m1.m32454a("Channel was consumed, consumer had failed", th);
            }
        }
        rVar.cancel(cancellationException);
    }
}
