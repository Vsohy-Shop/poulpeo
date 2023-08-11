package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p002ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

@ExperimentalFoundationApi
/* compiled from: LazyLayout.kt */
final class LazyLayoutItemReusePolicy implements SubcomposeSlotReusePolicy {
    private final Map<Object, Integer> countPerType = new LinkedHashMap();
    private final LazyLayoutItemContentFactory factory;

    public LazyLayoutItemReusePolicy(LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
        C12775o.m28639i(lazyLayoutItemContentFactory, "factory");
        this.factory = lazyLayoutItemContentFactory;
    }

    public boolean areCompatible(Object obj, Object obj2) {
        return C12775o.m28634d(this.factory.getContentType(obj), this.factory.getContentType(obj2));
    }

    public void getSlotsToRetain(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        int i;
        C12775o.m28639i(slotIdsSet, "slotIds");
        this.countPerType.clear();
        Iterator<Object> it = slotIdsSet.iterator();
        while (it.hasNext()) {
            Object contentType = this.factory.getContentType(it.next());
            Integer num = this.countPerType.get(contentType);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            if (i == 7) {
                it.remove();
            } else {
                this.countPerType.put(contentType, Integer.valueOf(i + 1));
            }
        }
    }
}
