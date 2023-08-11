package androidx.compose.p002ui.node;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.C12761g;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p412pf.C13212a;

@SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,340:1\n1855#2,2:341\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n194#1:341,2\n*E\n"})
/* renamed from: androidx.compose.ui.node.HitTestResult */
/* compiled from: HitTestResult.kt */
public final class HitTestResult<T> implements List<T>, C13212a {
    private long[] distanceFromEdgeAndInLayer = new long[16];
    /* access modifiers changed from: private */
    public int hitDepth = -1;
    private int size;
    /* access modifiers changed from: private */
    public Object[] values = new Object[16];

    @SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,340:1\n1855#2,2:341\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n*L\n272#1:341,2\n*E\n"})
    /* renamed from: androidx.compose.ui.node.HitTestResult$SubList */
    /* compiled from: HitTestResult.kt */
    private final class SubList implements List<T>, C13212a {
        private final int maxIndex;
        private final int minIndex;

        public SubList(int i, int i2) {
            this.minIndex = i;
            this.maxIndex = i2;
        }

        public void add(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(int i, Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean contains(Object obj) {
            if (indexOf(obj) != -1) {
                return true;
            }
            return false;
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            C12775o.m28639i(collection, "elements");
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public T get(int i) {
            return HitTestResult.this.values[i + this.minIndex];
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        public int getSize() {
            return this.maxIndex - this.minIndex;
        }

        public int indexOf(Object obj) {
            int i = this.minIndex;
            int i2 = this.maxIndex;
            if (i > i2) {
                return -1;
            }
            while (!C12775o.m28634d(HitTestResult.this.values[i], obj)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.minIndex;
        }

        public boolean isEmpty() {
            if (size() == 0) {
                return true;
            }
            return false;
        }

        public Iterator<T> iterator() {
            HitTestResult<T> hitTestResult = HitTestResult.this;
            int i = this.minIndex;
            return new HitTestResultIterator(i, i, this.maxIndex);
        }

        public int lastIndexOf(Object obj) {
            int i = this.maxIndex;
            int i2 = this.minIndex;
            if (i2 > i) {
                return -1;
            }
            while (!C12775o.m28634d(HitTestResult.this.values[i], obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.minIndex;
        }

        public ListIterator<T> listIterator() {
            HitTestResult<T> hitTestResult = HitTestResult.this;
            int i = this.minIndex;
            return new HitTestResultIterator(i, i, this.maxIndex);
        }

        public T remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void replaceAll(UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public T set(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ int size() {
            return getSize();
        }

        public void sort(Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public List<T> subList(int i, int i2) {
            HitTestResult<T> hitTestResult = HitTestResult.this;
            int i3 = this.minIndex;
            return new SubList(i + i3, i3 + i2);
        }

        public Object[] toArray() {
            return C12761g.m28583a(this);
        }

        public boolean add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public ListIterator<T> listIterator(int i) {
            HitTestResult<T> hitTestResult = HitTestResult.this;
            int i2 = this.minIndex;
            return new HitTestResultIterator(i + i2, i2, this.maxIndex);
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public <T> T[] toArray(T[] tArr) {
            C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
            return C12761g.m28584b(this, tArr);
        }
    }

    private final void ensureContainerSize() {
        int i = this.hitDepth;
        Object[] objArr = this.values;
        if (i >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            C12775o.m28638h(copyOf, "copyOf(this, newSize)");
            this.values = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.distanceFromEdgeAndInLayer, length);
            C12775o.m28638h(copyOf2, "copyOf(this, newSize)");
            this.distanceFromEdgeAndInLayer = copyOf2;
        }
    }

    /* renamed from: findBestHitDistance-ptXAw2c  reason: not valid java name */
    private final long m37484findBestHitDistanceptXAw2c() {
        long access$DistanceAndInLayer = HitTestResultKt.DistanceAndInLayer(Float.POSITIVE_INFINITY, false);
        int i = this.hitDepth + 1;
        int m = C12726w.m28526m(this);
        if (i <= m) {
            while (true) {
                long r4 = DistanceAndInLayer.m37476constructorimpl(this.distanceFromEdgeAndInLayer[i]);
                if (DistanceAndInLayer.m37475compareToS_HNhKs(r4, access$DistanceAndInLayer) < 0) {
                    access$DistanceAndInLayer = r4;
                }
                if (DistanceAndInLayer.m37479getDistanceimpl(access$DistanceAndInLayer) >= 0.0f || !DistanceAndInLayer.m37481isInLayerimpl(access$DistanceAndInLayer)) {
                    if (i == m) {
                        break;
                    }
                    i++;
                } else {
                    return access$DistanceAndInLayer;
                }
            }
        }
        return access$DistanceAndInLayer;
    }

    private final void resizeToHitDepth() {
        int i = this.hitDepth + 1;
        int m = C12726w.m28526m(this);
        if (i <= m) {
            while (true) {
                this.values[i] = null;
                if (i == m) {
                    break;
                }
                i++;
            }
        }
        this.size = this.hitDepth + 1;
    }

    public final void acceptHits() {
        this.hitDepth = size() - 1;
    }

    public void add(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        this.hitDepth = -1;
        resizeToHitDepth();
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public T get(int i) {
        return this.values[i];
    }

    public int getSize() {
        return this.size;
    }

    public final boolean hasHit() {
        long r0 = m37484findBestHitDistanceptXAw2c();
        if (DistanceAndInLayer.m37479getDistanceimpl(r0) >= 0.0f || !DistanceAndInLayer.m37481isInLayerimpl(r0)) {
            return false;
        }
        return true;
    }

    public final void hit(T t, boolean z, C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "childHitTest");
        hitInMinimumTouchTarget(t, -1.0f, z, aVar);
    }

    public final void hitInMinimumTouchTarget(T t, float f, boolean z, C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "childHitTest");
        int i = this.hitDepth;
        this.hitDepth = i + 1;
        ensureContainerSize();
        Object[] objArr = this.values;
        int i2 = this.hitDepth;
        objArr[i2] = t;
        this.distanceFromEdgeAndInLayer[i2] = HitTestResultKt.DistanceAndInLayer(f, z);
        resizeToHitDepth();
        aVar.invoke();
        this.hitDepth = i;
    }

    public int indexOf(Object obj) {
        int m = C12726w.m28526m(this);
        if (m < 0) {
            return -1;
        }
        int i = 0;
        while (!C12775o.m28634d(this.values[i], obj)) {
            if (i == m) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isHitInMinimumTouchTargetBetter(float f, boolean z) {
        if (this.hitDepth == C12726w.m28526m(this)) {
            return true;
        }
        if (DistanceAndInLayer.m37475compareToS_HNhKs(m37484findBestHitDistanceptXAw2c(), HitTestResultKt.DistanceAndInLayer(f, z)) > 0) {
            return true;
        }
        return false;
    }

    public Iterator<T> iterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public int lastIndexOf(Object obj) {
        for (int m = C12726w.m28526m(this); -1 < m; m--) {
            if (C12775o.m28634d(this.values[m], obj)) {
                return m;
            }
        }
        return -1;
    }

    public ListIterator<T> listIterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public T remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public T set(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void siblingHits(C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "block");
        int access$getHitDepth$p = this.hitDepth;
        aVar.invoke();
        this.hitDepth = access$getHitDepth$p;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void speculativeHit(T t, float f, boolean z, C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "childHitTest");
        if (this.hitDepth == C12726w.m28526m(this)) {
            hitInMinimumTouchTarget(t, f, z, aVar);
            if (this.hitDepth + 1 == C12726w.m28526m(this)) {
                resizeToHitDepth();
                return;
            }
            return;
        }
        long r0 = m37484findBestHitDistanceptXAw2c();
        int i = this.hitDepth;
        this.hitDepth = C12726w.m28526m(this);
        hitInMinimumTouchTarget(t, f, z, aVar);
        if (this.hitDepth + 1 < C12726w.m28526m(this) && DistanceAndInLayer.m37475compareToS_HNhKs(r0, m37484findBestHitDistanceptXAw2c()) > 0) {
            int i2 = this.hitDepth + 1;
            int i3 = i + 1;
            Object[] objArr = this.values;
            Object[] unused = C12708o.m28342i(objArr, objArr, i3, i2, size());
            long[] jArr = this.distanceFromEdgeAndInLayer;
            long[] unused2 = C12708o.m28341h(jArr, jArr, i3, i2, size());
            this.hitDepth = ((size() + i) - this.hitDepth) - 1;
        }
        resizeToHitDepth();
        this.hitDepth = i;
    }

    public List<T> subList(int i, int i2) {
        return new SubList(i, i2);
    }

    public Object[] toArray() {
        return C12761g.m28583a(this);
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator<T> listIterator(int i) {
        return new HitTestResultIterator(this, i, 0, 0, 6, (DefaultConstructorMarker) null);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public <T> T[] toArray(T[] tArr) {
        C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        return C12761g.m28584b(this, tArr);
    }

    /* renamed from: androidx.compose.ui.node.HitTestResult$HitTestResultIterator */
    /* compiled from: HitTestResult.kt */
    private final class HitTestResultIterator implements ListIterator<T>, C13212a {
        private int index;
        private final int maxIndex;
        private final int minIndex;

        public HitTestResultIterator(int i, int i2, int i3) {
            this.index = i;
            this.minIndex = i2;
            this.maxIndex = i3;
        }

        public void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        public boolean hasNext() {
            if (this.index < this.maxIndex) {
                return true;
            }
            return false;
        }

        public boolean hasPrevious() {
            if (this.index > this.minIndex) {
                return true;
            }
            return false;
        }

        public T next() {
            T[] access$getValues$p = HitTestResult.this.values;
            int i = this.index;
            this.index = i + 1;
            return access$getValues$p[i];
        }

        public int nextIndex() {
            return this.index - this.minIndex;
        }

        public T previous() {
            T[] access$getValues$p = HitTestResult.this.values;
            int i = this.index - 1;
            this.index = i;
            return access$getValues$p[i];
        }

        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i) {
            this.index = i;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ HitTestResultIterator(HitTestResult hitTestResult, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? hitTestResult.size() : i3);
        }
    }
}
