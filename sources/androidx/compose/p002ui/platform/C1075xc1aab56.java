package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.semantics.SemanticsNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$3 */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
final class C1075xc1aab56 extends C12777p implements Function1<SemanticsNode, Comparable<?>> {
    public static final C1075xc1aab56 INSTANCE = new C1075xc1aab56();

    C1075xc1aab56() {
        super(1);
    }

    public final Comparable<?> invoke(SemanticsNode semanticsNode) {
        C12775o.m28639i(semanticsNode, "it");
        return Float.valueOf(semanticsNode.getBoundsInWindow().getBottom());
    }
}
