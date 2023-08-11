package androidx.compose.p002ui.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$focusOwner$1 */
/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeView$focusOwner$1 extends C12777p implements Function1<C13074a<? extends C11921v>, C11921v> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidComposeView$focusOwner$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C13074a<C11921v>) (C13074a) obj);
        return C11921v.f18618a;
    }

    public final void invoke(C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "it");
        this.this$0.registerOnEndApplyChangesListener(aVar);
    }
}
