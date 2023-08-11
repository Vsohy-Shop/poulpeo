package androidx.compose.p002ui.platform;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1 */
/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeView$snapshotObserver$1 extends C12777p implements Function1<C13074a<? extends C11921v>, C11921v> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$0(C13074a aVar) {
        C12775o.m28639i(aVar, "$tmp0");
        aVar.invoke();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C13074a<C11921v>) (C13074a) obj);
        return C11921v.f18618a;
    }

    public final void invoke(C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "command");
        Handler handler = this.this$0.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            aVar.invoke();
            return;
        }
        Handler handler2 = this.this$0.getHandler();
        if (handler2 != null) {
            handler2.post(new C1134g(aVar));
        }
    }
}
