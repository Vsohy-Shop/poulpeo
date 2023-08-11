package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.AnnotatedString;
import java.util.Comparator;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n1#1,328:1\n86#2:329\n*E\n"})
/* renamed from: androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1 */
/* compiled from: Comparisons.kt */
public final class AnnotatedString$special$$inlined$sortedBy$1<T> implements Comparator {
    public final int compare(T t, T t2) {
        return C12019b.m26106c(Integer.valueOf(((AnnotatedString.Range) t).getStart()), Integer.valueOf(((AnnotatedString.Range) t2).getStart()));
    }
}
