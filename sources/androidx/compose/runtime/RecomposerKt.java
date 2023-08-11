package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12074d;
import p404of.C13089p;
import p466yf.C13995l0;
import p466yf.C13999m0;

@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1408:1\n361#2,7:1409\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n*L\n1400#1:1409,7\n*E\n"})
/* compiled from: Recomposer.kt */
public final class RecomposerKt {
    /* access modifiers changed from: private */
    public static final Object FramePending = new Object();
    /* access modifiers changed from: private */
    public static final Object ProduceAnotherFrame = new Object();
    private static final int RecomposerCompoundHashKey = 1000;

    public static final <K, V> boolean addMultiValue(Map<K, List<V>> map, K k, V v) {
        C12775o.m28639i(map, "<this>");
        List<V> list = map.get(k);
        if (list == null) {
            list = new ArrayList<>();
            map.put(k, list);
        }
        return list.add(v);
    }

    public static final <K, V> V removeLastMultiValue(Map<K, List<V>> map, K k) {
        C12775o.m28639i(map, "<this>");
        List list = map.get(k);
        if (list == null) {
            return null;
        }
        V L = C12669b0.m28188L(list);
        if (!list.isEmpty()) {
            return L;
        }
        map.remove(k);
        return L;
    }

    public static final <R> Object withRunningRecomposer(C13089p<? super C13995l0, ? super Recomposer, ? super C12074d<? super R>, ? extends Object> pVar, C12074d<? super R> dVar) {
        return C13999m0.m32451e(new RecomposerKt$withRunningRecomposer$2(pVar, (C12074d<? super RecomposerKt$withRunningRecomposer$2>) null), dVar);
    }
}
