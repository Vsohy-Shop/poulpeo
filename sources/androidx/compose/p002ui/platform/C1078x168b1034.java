package androidx.compose.p002ui.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeededLambda$1 */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
final class C1078x168b1034 extends C12777p implements Function1<ScrollObservationScope, C11921v> {
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1078x168b1034(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(1);
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ScrollObservationScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(ScrollObservationScope scrollObservationScope) {
        C12775o.m28639i(scrollObservationScope, "it");
        this.this$0.sendScrollEventIfNeeded(scrollObservationScope);
    }
}
