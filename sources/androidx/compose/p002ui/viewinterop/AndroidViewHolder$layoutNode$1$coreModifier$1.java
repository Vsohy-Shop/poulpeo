package androidx.compose.p002ui.viewinterop;

import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1 */
/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$layoutNode$1$coreModifier$1 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    public static final AndroidViewHolder$layoutNode$1$coreModifier$1 INSTANCE = new AndroidViewHolder$layoutNode$1$coreModifier$1();

    AndroidViewHolder$layoutNode$1$coreModifier$1() {
        super(1);
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "$this$semantics");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }
}
