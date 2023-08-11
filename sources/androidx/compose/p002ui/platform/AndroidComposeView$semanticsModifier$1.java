package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$semanticsModifier$1 */
/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeView$semanticsModifier$1 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    public static final AndroidComposeView$semanticsModifier$1 INSTANCE = new AndroidComposeView$semanticsModifier$1();

    AndroidComposeView$semanticsModifier$1() {
        super(1);
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "$this$$receiver");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }
}
