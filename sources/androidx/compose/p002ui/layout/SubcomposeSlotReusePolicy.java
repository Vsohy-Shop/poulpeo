package androidx.compose.p002ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12761g;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p412pf.C13212a;

/* renamed from: androidx.compose.ui.layout.SubcomposeSlotReusePolicy */
/* compiled from: SubcomposeLayout.kt */
public interface SubcomposeSlotReusePolicy {

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.layout.SubcomposeSlotReusePolicy$SlotIdsSet */
    /* compiled from: SubcomposeLayout.kt */
    public static final class SlotIdsSet implements Collection<Object>, C13212a {
        public static final int $stable = 8;
        private final Set<Object> set;

        public SlotIdsSet() {
            this((Set) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: add$ui_release */
        public final boolean add(Object obj) {
            return this.set.add(obj);
        }

        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void clear() {
            this.set.clear();
        }

        public boolean contains(Object obj) {
            return this.set.contains(obj);
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            C12775o.m28639i(collection, "elements");
            return this.set.containsAll(collection);
        }

        public int getSize() {
            return this.set.size();
        }

        public boolean isEmpty() {
            return this.set.isEmpty();
        }

        public Iterator<Object> iterator() {
            return this.set.iterator();
        }

        public final boolean remove(Object obj) {
            return this.set.remove(obj);
        }

        public final boolean removeAll(Collection<? extends Object> collection) {
            C12775o.m28639i(collection, "slotIds");
            return this.set.remove(collection);
        }

        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean retainAll(Collection<? extends Object> collection) {
            C12775o.m28639i(collection, "slotIds");
            return this.set.retainAll(collection);
        }

        public final /* bridge */ int size() {
            return getSize();
        }

        public Object[] toArray() {
            return C12761g.m28583a(this);
        }

        public SlotIdsSet(Set<Object> set2) {
            C12775o.m28639i(set2, "set");
            this.set = set2;
        }

        public final boolean removeAll(Function1<Object, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return C12669b0.m28183G(this.set, function1);
        }

        public final boolean retainAll(Function1<Object, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return C12669b0.m28192P(this.set, function1);
        }

        public <T> T[] toArray(T[] tArr) {
            C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
            return C12761g.m28584b(this, tArr);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SlotIdsSet(Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new LinkedHashSet() : set2);
        }
    }

    boolean areCompatible(Object obj, Object obj2);

    void getSlotsToRetain(SlotIdsSet slotIdsSet);
}
