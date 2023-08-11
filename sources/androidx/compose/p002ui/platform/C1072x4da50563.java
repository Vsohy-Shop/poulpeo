package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.semantics.SemanticsNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$4 */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
final class C1072x4da50563 extends C12777p implements Function1<SemanticsNode, Comparable<?>> {
    public static final C1072x4da50563 INSTANCE = new C1072x4da50563();

    C1072x4da50563() {
        super(1);
    }

    public final Comparable<?> invoke(SemanticsNode semanticsNode) {
        C12775o.m28639i(semanticsNode, "it");
        return Float.valueOf(semanticsNode.getBoundsInWindow().getLeft());
    }
}
