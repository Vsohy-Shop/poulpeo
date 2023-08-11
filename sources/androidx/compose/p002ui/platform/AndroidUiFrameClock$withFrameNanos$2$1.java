package androidx.compose.p002ui.platform;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1 */
/* compiled from: AndroidUiFrameClock.android.kt */
final class AndroidUiFrameClock$withFrameNanos$2$1 extends C12777p implements Function1<Throwable, C11921v> {
    final /* synthetic */ Choreographer.FrameCallback $callback;
    final /* synthetic */ AndroidUiDispatcher $uiDispatcher;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidUiFrameClock$withFrameNanos$2$1(AndroidUiDispatcher androidUiDispatcher, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.$uiDispatcher = androidUiDispatcher;
        this.$callback = frameCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Throwable th) {
        this.$uiDispatcher.removeFrameCallback$ui_release(this.$callback);
    }
}
