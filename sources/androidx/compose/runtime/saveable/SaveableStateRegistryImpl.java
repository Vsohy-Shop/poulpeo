package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nSaveableStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,159:1\n1#2:160\n361#3,7:161\n215#4,2:168\n*S KotlinDebug\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n*L\n119#1:161,7\n134#1:168,2\n*E\n"})
/* compiled from: SaveableStateRegistry.kt */
final class SaveableStateRegistryImpl implements SaveableStateRegistry {
    private final Function1<Object, Boolean> canBeSaved;
    private final Map<String, List<Object>> restored;
    /* access modifiers changed from: private */
    public final Map<String, List<C13074a<Object>>> valueProviders;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = kotlin.collections.C12716r0.m28430u(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SaveableStateRegistryImpl(java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> r2, kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "canBeSaved"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            r1.<init>()
            r1.canBeSaved = r3
            if (r2 == 0) goto L_0x0012
            java.util.Map r2 = kotlin.collections.C12716r0.m28430u(r2)
            if (r2 != 0) goto L_0x0017
        L_0x0012:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
        L_0x0017:
            r1.restored = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.valueProviders = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.SaveableStateRegistryImpl.<init>(java.util.Map, kotlin.jvm.functions.Function1):void");
    }

    public boolean canBeSaved(Object obj) {
        C12775o.m28639i(obj, "value");
        return this.canBeSaved.invoke(obj).booleanValue();
    }

    public Object consumeRestored(String str) {
        C12775o.m28639i(str, "key");
        List remove = this.restored.remove(str);
        if (remove == null || !(!remove.isEmpty())) {
            return null;
        }
        if (remove.size() > 1) {
            this.restored.put(str, remove.subList(1, remove.size()));
        }
        return remove.get(0);
    }

    public Map<String, List<Object>> performSave() {
        Map<String, List<Object>> u = C12716r0.m28430u(this.restored);
        for (Map.Entry next : this.valueProviders.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            int i = 0;
            if (list.size() == 1) {
                Object invoke = ((C13074a) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else if (canBeSaved(invoke)) {
                    u.put(str, C12726w.m28518e(invoke));
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    Object invoke2 = ((C13074a) list.get(i)).invoke();
                    if (invoke2 == null || canBeSaved(invoke2)) {
                        arrayList.add(invoke2);
                        i++;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                u.put(str, arrayList);
            }
        }
        return u;
    }

    public SaveableStateRegistry.Entry registerProvider(String str, C13074a<? extends Object> aVar) {
        C12775o.m28639i(str, "key");
        C12775o.m28639i(aVar, "valueProvider");
        if (!C13754v.m31532t(str)) {
            Map<String, List<C13074a<Object>>> map = this.valueProviders;
            List<C13074a<Object>> list = map.get(str);
            if (list == null) {
                list = new ArrayList<>();
                map.put(str, list);
            }
            list.add(aVar);
            return new SaveableStateRegistryImpl$registerProvider$3(this, str, aVar);
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }
}
