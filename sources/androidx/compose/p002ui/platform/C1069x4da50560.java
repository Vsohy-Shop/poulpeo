package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.semantics.SemanticsNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$1 */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
final class C1069x4da50560 extends C12777p implements Function1<SemanticsNode, Comparable<?>> {
    public static final C1069x4da50560 INSTANCE = new C1069x4da50560();

    C1069x4da50560() {
        super(1);
    }

    public final Comparable<?> invoke(SemanticsNode semanticsNode) {
        C12775o.m28639i(semanticsNode, "it");
        return Float.valueOf(semanticsNode.getBoundsInWindow().getRight());
    }
}
