package androidx.compose.runtime.internal;

import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nThreadMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadMap.kt\nandroidx/compose/runtime/internal/ThreadMapKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,111:1\n26#2:112\n*S KotlinDebug\n*F\n+ 1 ThreadMap.kt\nandroidx/compose/runtime/internal/ThreadMapKt\n*L\n111#1:112\n*E\n"})
/* compiled from: ThreadMap.kt */
public final class ThreadMapKt {
    private static final ThreadMap emptyThreadMap = new ThreadMap(0, new long[0], new Object[0]);

    public static final ThreadMap getEmptyThreadMap() {
        return emptyThreadMap;
    }
}
