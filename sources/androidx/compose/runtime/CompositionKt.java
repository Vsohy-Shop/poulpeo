package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11915r;
import p336ef.C11921v;
import p355hf.C12079g;
import p355hf.C12085h;

@SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1257:1\n1549#2:1258\n1620#2,3:1259\n1#3:1262\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionKt\n*L\n1227#1:1258\n1227#1:1259,3\n*E\n"})
/* compiled from: Composition.kt */
public final class CompositionKt {
    /* access modifiers changed from: private */
    public static final Object PendingApplyNoModifications = new Object();

    public static final Composition Composition(Applier<?> applier, CompositionContext compositionContext) {
        C12775o.m28639i(applier, "applier");
        C12775o.m28639i(compositionContext, "parent");
        return new CompositionImpl(compositionContext, applier, (C12079g) null, 4, (DefaultConstructorMarker) null);
    }

    public static final ControlledComposition ControlledComposition(Applier<?> applier, CompositionContext compositionContext) {
        C12775o.m28639i(applier, "applier");
        C12775o.m28639i(compositionContext, "parent");
        return new CompositionImpl(compositionContext, applier, (C12079g) null, 4, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final <K, V> void addValue(IdentityArrayMap<K, IdentityArraySet<V>> identityArrayMap, K k, V v) {
        if (identityArrayMap.contains(k)) {
            IdentityArraySet identityArraySet = identityArrayMap.get(k);
            if (identityArraySet != null) {
                identityArraySet.add(v);
                return;
            }
            return;
        }
        IdentityArraySet identityArraySet2 = new IdentityArraySet();
        identityArraySet2.add(v);
        C11921v vVar = C11921v.f18618a;
        identityArrayMap.set(k, identityArraySet2);
    }

    public static final void clearCompositionErrors() {
        HotReloader.Companion.clearErrors$runtime_release();
    }

    public static final List<C11906l<Exception, Boolean>> currentCompositionErrors() {
        Iterable<RecomposerErrorInfo> currentErrors$runtime_release = HotReloader.Companion.getCurrentErrors$runtime_release();
        ArrayList arrayList = new ArrayList(C12728x.m28544v(currentErrors$runtime_release, 10));
        for (RecomposerErrorInfo recomposerErrorInfo : currentErrors$runtime_release) {
            arrayList.add(C11915r.m25707a(recomposerErrorInfo.getCause(), Boolean.valueOf(recomposerErrorInfo.getRecoverable())));
        }
        return arrayList;
    }

    @ExperimentalComposeApi
    public static final C12079g getRecomposeCoroutineContext(ControlledComposition controlledComposition) {
        CompositionImpl compositionImpl;
        C12079g recomposeContext;
        C12775o.m28639i(controlledComposition, "<this>");
        if (controlledComposition instanceof CompositionImpl) {
            compositionImpl = (CompositionImpl) controlledComposition;
        } else {
            compositionImpl = null;
        }
        if (compositionImpl == null || (recomposeContext = compositionImpl.getRecomposeContext()) == null) {
            return C12085h.f18916b;
        }
        return recomposeContext;
    }

    public static final void invalidateGroupsWithKey(int i) {
        HotReloader.Companion.invalidateGroupsWithKey$runtime_release(i);
    }

    private static final <E> void removeValueIf(HashSet<E> hashSet, Function1<? super E, Boolean> function1) {
        Iterator<E> it = hashSet.iterator();
        C12775o.m28638h(it, "iterator()");
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue()) {
                it.remove();
            }
        }
    }

    public static final void simulateHotReload(Object obj) {
        C12775o.m28639i(obj, "context");
        HotReloader.Companion.simulateHotReload$runtime_release(obj);
    }

    @ExperimentalComposeApi
    public static final Composition Composition(Applier<?> applier, CompositionContext compositionContext, C12079g gVar) {
        C12775o.m28639i(applier, "applier");
        C12775o.m28639i(compositionContext, "parent");
        C12775o.m28639i(gVar, "recomposeCoroutineContext");
        return new CompositionImpl(compositionContext, applier, gVar);
    }

    @ExperimentalComposeApi
    public static final ControlledComposition ControlledComposition(Applier<?> applier, CompositionContext compositionContext, C12079g gVar) {
        C12775o.m28639i(applier, "applier");
        C12775o.m28639i(compositionContext, "parent");
        C12775o.m28639i(gVar, "recomposeCoroutineContext");
        return new CompositionImpl(compositionContext, applier, gVar);
    }

    @ExperimentalComposeApi
    public static /* synthetic */ void getRecomposeCoroutineContext$annotations(ControlledComposition controlledComposition) {
    }
}
