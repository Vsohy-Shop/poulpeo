package androidx.compose.runtime;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: ActualAndroid.android.kt */
final class DefaultChoreographerFrameClock$withFrameNanos$2$1 extends C12777p implements Function1<Throwable, C11921v> {
    final /* synthetic */ Choreographer.FrameCallback $callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultChoreographerFrameClock$withFrameNanos$2$1(Choreographer.FrameCallback frameCallback) {
        super(1);
        this.$callback = frameCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Throwable th) {
        DefaultChoreographerFrameClock.choreographer.removeFrameCallback(this.$callback);
    }
}
