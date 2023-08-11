package p208r2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C12775o;

/* renamed from: r2.b */
/* compiled from: GateKeeperRuntimeCache.kt */
public final class C9369b {

    /* renamed from: a */
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, C9368a>> f13931a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final List<C9368a> mo43797a(String str) {
        C12775o.m28639i(str, "appId");
        ConcurrentHashMap concurrentHashMap = this.f13931a.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        for (Map.Entry value : concurrentHashMap.entrySet()) {
            arrayList.add((C9368a) value.getValue());
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo43798b(String str, List<C9368a> list) {
        C12775o.m28639i(str, "appId");
        C12775o.m28639i(list, "gateKeeperList");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (C9368a aVar : list) {
            concurrentHashMap.put(aVar.mo43792a(), aVar);
        }
        this.f13931a.put(str, concurrentHashMap);
    }
}
