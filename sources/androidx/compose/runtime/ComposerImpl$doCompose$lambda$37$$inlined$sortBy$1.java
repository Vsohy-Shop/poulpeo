package androidx.compose.runtime;

import java.util.Comparator;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1#1,328:1\n3347#2:329\n*E\n"})
/* compiled from: Comparisons.kt */
public final class ComposerImpl$doCompose$lambda$37$$inlined$sortBy$1<T> implements Comparator {
    public final int compare(T t, T t2) {
        return C12019b.m26106c(Integer.valueOf(((Invalidation) t).getLocation()), Integer.valueOf(((Invalidation) t2).getLocation()));
    }
}
