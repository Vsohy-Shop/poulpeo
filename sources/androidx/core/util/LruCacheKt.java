package androidx.core.util;

import android.util.LruCache;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13090q;

/* compiled from: LruCache.kt */
public final class LruCacheKt {
    public static final <K, V> LruCache<K, V> lruCache(int i, C13088o<? super K, ? super V, Integer> oVar, Function1<? super K, ? extends V> function1, C13090q<? super Boolean, ? super K, ? super V, ? super V, C11921v> qVar) {
        C12775o.m28639i(oVar, "sizeOf");
        C12775o.m28639i(function1, "create");
        C12775o.m28639i(qVar, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i, oVar, function1, qVar);
    }

    public static /* synthetic */ LruCache lruCache$default(int i, C13088o oVar, Function1 function1, C13090q qVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            oVar = LruCacheKt$lruCache$1.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            function1 = LruCacheKt$lruCache$2.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            qVar = LruCacheKt$lruCache$3.INSTANCE;
        }
        C12775o.m28639i(oVar, "sizeOf");
        C12775o.m28639i(function1, "create");
        C12775o.m28639i(qVar, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i, oVar, function1, qVar);
    }
}
