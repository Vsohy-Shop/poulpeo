package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewModifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: BringIntoViewRequestPriorityQueue.kt */
final class BringIntoViewRequestPriorityQueue$enqueue$1 extends C12777p implements Function1<Throwable, C11921v> {
    final /* synthetic */ ContentInViewModifier.Request $request;
    final /* synthetic */ BringIntoViewRequestPriorityQueue this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BringIntoViewRequestPriorityQueue$enqueue$1(BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue, ContentInViewModifier.Request request) {
        super(1);
        this.this$0 = bringIntoViewRequestPriorityQueue;
        this.$request = request;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Throwable th) {
        this.this$0.requests.remove(this.$request);
    }
}
