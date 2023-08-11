package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.semantics.SemanticsNode;
import java.util.Comparator;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n1#1,328:1\n544#2:329\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2 */
/* compiled from: Comparisons.kt */
public final class C1066xaf6f85ce<T> implements Comparator {
    final /* synthetic */ Comparator $this_thenBy;

    public C1066xaf6f85ce(Comparator comparator) {
        this.$this_thenBy = comparator;
    }

    public final int compare(T t, T t2) {
        int compare = this.$this_thenBy.compare(t, t2);
        if (compare != 0) {
            return compare;
        }
        return C12019b.m26106c(Integer.valueOf(((SemanticsNode) t).getId()), Integer.valueOf(((SemanticsNode) t2).getId()));
    }
}
