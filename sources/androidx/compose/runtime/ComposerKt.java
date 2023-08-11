package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4528:1\n309#1:4529\n4513#1,5:4546\n1#2:4530\n361#3,7:4531\n146#4,8:4538\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n325#1:4529\n4519#1:4546,5\n4253#1:4531,7\n4367#1:4538,8\n*E\n"})
/* compiled from: Composer.kt */
public final class ComposerKt {
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");
    public static final int compositionLocalMapKey = 202;
    /* access modifiers changed from: private */
    public static CompositionTracer compositionTracer = null;
    private static final int defaultsKey = -127;
    /* access modifiers changed from: private */
    public static final C13089p<Applier<?>, SlotWriter, RememberManager, C11921v> endGroupInstance = ComposerKt$endGroupInstance$1.INSTANCE;
    private static final int invalidGroupLocation = -2;
    private static final Object invocation = new OpaqueKey("provider");
    public static final int invocationKey = 200;
    private static final int nodeKey = 125;
    private static final Object provider = new OpaqueKey("provider");
    public static final int providerKey = 201;
    private static final Object providerMaps = new OpaqueKey("providers");
    public static final int providerMapsKey = 204;
    private static final Object providerValues = new OpaqueKey("providerValues");
    public static final int providerValuesKey = 203;
    private static final Object reference = new OpaqueKey("reference");
    public static final int referenceKey = 206;
    /* access modifiers changed from: private */
    public static final C13089p<Applier<?>, SlotWriter, RememberManager, C11921v> removeCurrentGroupInstance = ComposerKt$removeCurrentGroupInstance$1.INSTANCE;
    /* access modifiers changed from: private */
    public static final C13089p<Applier<?>, SlotWriter, RememberManager, C11921v> resetSlotsInstance = ComposerKt$resetSlotsInstance$1.INSTANCE;
    public static final int reuseKey = 207;
    private static final int rootKey = 100;
    /* access modifiers changed from: private */
    public static final C13089p<Applier<?>, SlotWriter, RememberManager, C11921v> skipToGroupEndInstance = ComposerKt$skipToGroupEndInstance$1.INSTANCE;
    /* access modifiers changed from: private */
    public static final C13089p<Applier<?>, SlotWriter, RememberManager, C11921v> startRootGroup = ComposerKt$startRootGroup$1.INSTANCE;

    /* access modifiers changed from: private */
    public static final boolean asBool(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    @ComposeCompilerApi
    public static final <T> T cache(Composer composer, boolean z, C13074a<? extends T> aVar) {
        C12775o.m28639i(composer, "<this>");
        C12775o.m28639i(aVar, "block");
        T rememberedValue = composer.rememberedValue();
        if (!z && rememberedValue != Composer.Companion.getEmpty()) {
            return rememberedValue;
        }
        T invoke = aVar.invoke();
        composer.updateRememberedValue(invoke);
        return invoke;
    }

    /* access modifiers changed from: private */
    public static final List<Object> collectNodesFrom(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader openReader = slotTable.openReader();
        try {
            collectNodesFrom$lambda$10$collectFromGroup(openReader, arrayList, slotTable.anchorIndex(anchor));
            C11921v vVar = C11921v.f18618a;
            return arrayList;
        } finally {
            openReader.close();
        }
    }

    private static final void collectNodesFrom$lambda$10$collectFromGroup(SlotReader slotReader, List<Object> list, int i) {
        if (slotReader.isNode(i)) {
            list.add(slotReader.node(i));
            return;
        }
        int i2 = i + 1;
        int groupSize = i + slotReader.groupSize(i);
        while (i2 < groupSize) {
            collectNodesFrom$lambda$10$collectFromGroup(slotReader, list, i2);
            i2 += slotReader.groupSize(i2);
        }
    }

    public static final Void composeRuntimeError(String str) {
        C12775o.m28639i(str, "message");
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    /* access modifiers changed from: private */
    @Composable
    public static final PersistentMap<CompositionLocal<Object>, State<Object>> compositionLocalMapOf(ProvidedValue<?>[] providedValueArr, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, Composer composer, int i) {
        composer.startReplaceableGroup(721128344);
        if (isTraceInProgress()) {
            traceEventStart(721128344, i, -1, "androidx.compose.runtime.compositionLocalMapOf (Composer.kt:319)");
        }
        PersistentMap.Builder builder = ExtensionsKt.persistentHashMapOf().builder();
        for (ProvidedValue<?> providedValue : providedValueArr) {
            composer.startReplaceableGroup(680853375);
            if (providedValue.getCanOverride() || !contains(persistentMap, providedValue.getCompositionLocal())) {
                CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
                C12775o.m28637g(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                builder.put(compositionLocal, providedValue.getCompositionLocal().provided$runtime_release(providedValue.getValue(), composer, 8));
            }
            composer.endReplaceableGroup();
        }
        PersistentMap<CompositionLocal<Object>, State<Object>> build = builder.build();
        if (isTraceInProgress()) {
            traceEventEnd();
        }
        composer.endReplaceableGroup();
        return build;
    }

    public static final <T> boolean contains(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, CompositionLocal<T> compositionLocal) {
        C12775o.m28639i(persistentMap, "<this>");
        C12775o.m28639i(compositionLocal, "key");
        return persistentMap.containsKey(compositionLocal);
    }

    private static final int distanceFrom(SlotReader slotReader, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = slotReader.parent(i);
            i3++;
        }
        return i3;
    }

    /* access modifiers changed from: private */
    public static final List<Invalidation> filterToRange(List<Invalidation> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (int findInsertLocation = findInsertLocation(list, i); findInsertLocation < list.size(); findInsertLocation++) {
            Invalidation invalidation = list.get(findInsertLocation);
            if (invalidation.getLocation() >= i2) {
                break;
            }
            arrayList.add(invalidation);
        }
        return arrayList;
    }

    private static final int findInsertLocation(List<Invalidation> list, int i) {
        int findLocation = findLocation(list, i);
        if (findLocation < 0) {
            return -(findLocation + 1);
        }
        return findLocation;
    }

    private static final int findLocation(List<Invalidation> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int k = C12775o.m28641k(list.get(i3).getLocation(), i);
            if (k < 0) {
                i2 = i3 + 1;
            } else if (k <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* access modifiers changed from: private */
    public static final Invalidation firstInRange(List<Invalidation> list, int i, int i2) {
        int findInsertLocation = findInsertLocation(list, i);
        if (findInsertLocation >= list.size()) {
            return null;
        }
        Invalidation invalidation = list.get(findInsertLocation);
        if (invalidation.getLocation() < i2) {
            return invalidation;
        }
        return null;
    }

    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    public static final Object getInvocation() {
        return invocation;
    }

    /* access modifiers changed from: private */
    public static final Object getJoinedKey(KeyInfo keyInfo) {
        if (keyInfo.getObjectKey() != null) {
            return new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey());
        }
        return Integer.valueOf(keyInfo.getKey());
    }

    /* access modifiers changed from: private */
    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey;
        if (obj instanceof JoinedKey) {
            joinedKey = (JoinedKey) obj;
        } else {
            joinedKey = null;
        }
        if (joinedKey == null) {
            return null;
        }
        if ((!C12775o.m28634d(joinedKey.getLeft(), obj2) || !C12775o.m28634d(joinedKey.getRight(), obj3)) && (obj = getKey(joinedKey.getLeft(), obj2, obj3)) == null) {
            obj = getKey(joinedKey.getRight(), obj2, obj3);
        }
        return obj;
    }

    public static final Object getProvider() {
        return provider;
    }

    public static final Object getProviderMaps() {
        return providerMaps;
    }

    public static final Object getProviderValues() {
        return providerValues;
    }

    public static final Object getReference() {
        return reference;
    }

    public static final <T> T getValueOf(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, CompositionLocal<T> compositionLocal) {
        C12775o.m28639i(persistentMap, "<this>");
        C12775o.m28639i(compositionLocal, "key");
        State state = (State) persistentMap.get(compositionLocal);
        if (state != null) {
            return state.getValue();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final void insertIfMissing(List<Invalidation> list, int i, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int findLocation = findLocation(list, i);
        IdentityArraySet identityArraySet = null;
        if (findLocation < 0) {
            int i2 = -(findLocation + 1);
            if (obj != null) {
                identityArraySet = new IdentityArraySet();
                identityArraySet.add(obj);
            }
            list.add(i2, new Invalidation(recomposeScopeImpl, i, identityArraySet));
        } else if (obj == null) {
            list.get(findLocation).setInstances((IdentityArraySet<Object>) null);
        } else {
            IdentityArraySet<Object> instances = list.get(findLocation).getInstances();
            if (instances != null) {
                instances.add(obj);
            }
        }
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 == null || !compositionTracer2.isTraceInProgress()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final <K, V> HashMap<K, LinkedHashSet<V>> multiMap() {
        return new HashMap<>();
    }

    public static final PersistentMap<CompositionLocal<Object>, State<Object>> mutate(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, Function1<? super Map<CompositionLocal<Object>, State<Object>>, C11921v> function1) {
        C12775o.m28639i(persistentMap, "<this>");
        C12775o.m28639i(function1, "mutator");
        PersistentMap.Builder<CompositionLocal<Object>, ? extends State<? extends Object>> builder = persistentMap.builder();
        function1.invoke(builder);
        return builder.build();
    }

    /* access modifiers changed from: private */
    public static final int nearestCommonRootOf(SlotReader slotReader, int i, int i2, int i3) {
        if (i == i2) {
            return i;
        }
        if (i == i3 || i2 == i3) {
            return i3;
        }
        if (slotReader.parent(i) == i2) {
            return i2;
        }
        if (slotReader.parent(i2) == i) {
            return i;
        }
        if (slotReader.parent(i) == slotReader.parent(i2)) {
            return slotReader.parent(i);
        }
        int distanceFrom = distanceFrom(slotReader, i, i3);
        int distanceFrom2 = distanceFrom(slotReader, i2, i3);
        int i4 = distanceFrom - distanceFrom2;
        for (int i5 = 0; i5 < i4; i5++) {
            i = slotReader.parent(i);
        }
        int i6 = distanceFrom2 - distanceFrom;
        for (int i7 = 0; i7 < i6; i7++) {
            i2 = slotReader.parent(i2);
        }
        while (i != i2) {
            i = slotReader.parent(i);
            i2 = slotReader.parent(i2);
        }
        return i;
    }

    /* access modifiers changed from: private */
    public static final <K, V> V pop(HashMap<K, LinkedHashSet<V>> hashMap, K k) {
        V a0;
        LinkedHashSet linkedHashSet = hashMap.get(k);
        if (linkedHashSet == null || (a0 = C12686e0.m28222a0(linkedHashSet)) == null) {
            return null;
        }
        remove(hashMap, k, a0);
        return a0;
    }

    /* access modifiers changed from: private */
    public static final <K, V> boolean put(HashMap<K, LinkedHashSet<V>> hashMap, K k, V v) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            hashMap.put(k, linkedHashSet);
        }
        return linkedHashSet.add(v);
    }

    private static final <K, V> C11921v remove(HashMap<K, LinkedHashSet<V>> hashMap, K k, V v) {
        LinkedHashSet linkedHashSet = hashMap.get(k);
        if (linkedHashSet == null) {
            return null;
        }
        linkedHashSet.remove(v);
        if (linkedHashSet.isEmpty()) {
            hashMap.remove(k);
        }
        return C11921v.f18618a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        r1 = (androidx.compose.runtime.RecomposeScopeImpl) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void removeCurrentGroup(androidx.compose.runtime.SlotWriter r4, androidx.compose.runtime.RememberManager r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            java.lang.String r0 = "rememberManager"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            java.util.Iterator r0 = r4.groupSlots()
        L_0x000e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0040
            java.lang.Object r1 = r0.next()
            boolean r2 = r1 instanceof androidx.compose.runtime.ComposeNodeLifecycleCallback
            if (r2 == 0) goto L_0x0022
            r2 = r1
            androidx.compose.runtime.ComposeNodeLifecycleCallback r2 = (androidx.compose.runtime.ComposeNodeLifecycleCallback) r2
            r5.releasing(r2)
        L_0x0022:
            boolean r2 = r1 instanceof androidx.compose.runtime.RememberObserver
            if (r2 == 0) goto L_0x002c
            r2 = r1
            androidx.compose.runtime.RememberObserver r2 = (androidx.compose.runtime.RememberObserver) r2
            r5.forgetting(r2)
        L_0x002c:
            boolean r2 = r1 instanceof androidx.compose.runtime.RecomposeScopeImpl
            if (r2 == 0) goto L_0x000e
            androidx.compose.runtime.RecomposeScopeImpl r1 = (androidx.compose.runtime.RecomposeScopeImpl) r1
            androidx.compose.runtime.CompositionImpl r2 = r1.getComposition()
            if (r2 == 0) goto L_0x000e
            r3 = 1
            r2.setPendingInvalidScopes$runtime_release(r3)
            r1.release()
            goto L_0x000e
        L_0x0040:
            r4.removeGroup()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerKt.removeCurrentGroup(androidx.compose.runtime.SlotWriter, androidx.compose.runtime.RememberManager):void");
    }

    /* access modifiers changed from: private */
    public static final Invalidation removeLocation(List<Invalidation> list, int i) {
        int findLocation = findLocation(list, i);
        if (findLocation >= 0) {
            return list.remove(findLocation);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final void removeRange(List<Invalidation> list, int i, int i2) {
        int findInsertLocation = findInsertLocation(list, i);
        while (findInsertLocation < list.size() && list.get(findInsertLocation).getLocation() < i2) {
            list.remove(findInsertLocation);
        }
    }

    public static final void runtimeCheck(boolean z, C13074a<? extends Object> aVar) {
        C12775o.m28639i(aVar, "lazyMessage");
        if (!z) {
            composeRuntimeError(aVar.invoke().toString());
            throw new KotlinNothingValueException();
        }
    }

    @ComposeCompilerApi
    public static final void sourceInformation(Composer composer, String str) {
        C12775o.m28639i(composer, "composer");
        C12775o.m28639i(str, "sourceInformation");
        composer.sourceInformation(str);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(Composer composer) {
        C12775o.m28639i(composer, "composer");
        composer.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(Composer composer, int i, String str) {
        C12775o.m28639i(composer, "composer");
        C12775o.m28639i(str, "sourceInformation");
        composer.sourceInformationMarkerStart(i, str);
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventEnd();
        }
    }

    @ComposeCompilerApi
    public static final /* synthetic */ void traceEventStart(int i, String str) {
        C12775o.m28639i(str, "info");
        traceEventStart(i, -1, -1, str);
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int i, int i2, int i3, String str) {
        C12775o.m28639i(str, "info");
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventStart(i, i2, i3, str);
        }
    }

    public static final void runtimeCheck(boolean z) {
        if (!z) {
            composeRuntimeError("Check failed".toString());
            throw new KotlinNothingValueException();
        }
    }

    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    private static /* synthetic */ void getCompositionTracer$annotations() {
    }

    public static /* synthetic */ void getInvocation$annotations() {
    }

    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    public static /* synthetic */ void getProvider$annotations() {
    }

    public static /* synthetic */ void getProviderKey$annotations() {
    }

    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    public static /* synthetic */ void getProviderValues$annotations() {
    }

    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    public static /* synthetic */ void getReference$annotations() {
    }

    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    public static /* synthetic */ void getReuseKey$annotations() {
    }

    /* access modifiers changed from: private */
    public static final int asInt(boolean z) {
        return z ? 1 : 0;
    }
}
