package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n*L\n1#1,851:1\n*E\n"})
/* compiled from: TrieNode.kt */
public final class TrieNodeKt$filterTo$1 extends C12777p implements Function1<Object, Boolean> {
    public static final TrieNodeKt$filterTo$1 INSTANCE = new TrieNodeKt$filterTo$1();

    public TrieNodeKt$filterTo$1() {
        super(1);
    }

    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj != TrieNode.Companion.getEMPTY$runtime_release());
    }
}
