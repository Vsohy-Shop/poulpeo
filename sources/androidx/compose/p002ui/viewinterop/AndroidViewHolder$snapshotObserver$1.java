package androidx.compose.p002ui.viewinterop;

import android.os.Looper;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$snapshotObserver$1 */
/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$snapshotObserver$1 extends C12777p implements Function1<C13074a<? extends C11921v>, C11921v> {
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$snapshotObserver$1(AndroidViewHolder androidViewHolder) {
        super(1);
        this.this$0 = androidViewHolder;
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
        if (this.this$0.getHandler().getLooper() == Looper.myLooper()) {
            aVar.invoke();
        } else {
            this.this$0.getHandler().post(new C1236b(aVar));
        }
    }
}
