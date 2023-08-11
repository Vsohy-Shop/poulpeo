package androidx.core.util;

import android.util.LruCache;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13090q;

/* compiled from: LruCache.kt */
public final class LruCacheKt$lruCache$4 extends LruCache<K, V> {
    final /* synthetic */ Function1<K, V> $create;
    final /* synthetic */ C13090q<Boolean, K, V, V, C11921v> $onEntryRemoved;
    final /* synthetic */ C13088o<K, V, Integer> $sizeOf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LruCacheKt$lruCache$4(int i, C13088o<? super K, ? super V, Integer> oVar, Function1<? super K, ? extends V> function1, C13090q<? super Boolean, ? super K, ? super V, ? super V, C11921v> qVar) {
        super(i);
        this.$sizeOf = oVar;
        this.$create = function1;
        this.$onEntryRemoved = qVar;
    }

    /* access modifiers changed from: protected */
    public V create(K k) {
        C12775o.m28639i(k, "key");
        return this.$create.invoke(k);
    }

    /* access modifiers changed from: protected */
    public void entryRemoved(boolean z, K k, V v, V v2) {
        C12775o.m28639i(k, "key");
        C12775o.m28639i(v, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z), k, v, v2);
    }

    /* access modifiers changed from: protected */
    public int sizeOf(K k, V v) {
        C12775o.m28639i(k, "key");
        C12775o.m28639i(v, "value");
        return this.$sizeOf.invoke(k, v).intValue();
    }
}
