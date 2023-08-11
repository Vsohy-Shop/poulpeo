package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n305#1,4:361\n1#2:365\n1#2:366\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n*L\n286#1:361,4\n286#1:365\n*E\n"})
/* compiled from: SnapshotStateMap.kt */
abstract class StateMapMutableIterator<K, V> {
    private Map.Entry<? extends K, ? extends V> current;
    private final Iterator<Map.Entry<K, V>> iterator;
    private final SnapshotStateMap<K, V> map;
    /* access modifiers changed from: private */
    public int modification;
    private Map.Entry<? extends K, ? extends V> next;

    public StateMapMutableIterator(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        C12775o.m28639i(snapshotStateMap, "map");
        C12775o.m28639i(it, "iterator");
        this.map = snapshotStateMap;
        this.iterator = it;
        this.modification = snapshotStateMap.getModification$runtime_release();
        advance();
    }

    /* access modifiers changed from: protected */
    public final void advance() {
        Map.Entry<? extends K, ? extends V> entry;
        this.current = this.next;
        if (this.iterator.hasNext()) {
            entry = this.iterator.next();
        } else {
            entry = null;
        }
        this.next = entry;
    }

    /* access modifiers changed from: protected */
    public final Map.Entry<K, V> getCurrent() {
        return this.current;
    }

    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    public final SnapshotStateMap<K, V> getMap() {
        return this.map;
    }

    /* access modifiers changed from: protected */
    public final int getModification() {
        return this.modification;
    }

    /* access modifiers changed from: protected */
    public final Map.Entry<K, V> getNext() {
        return this.next;
    }

    public final boolean hasNext() {
        if (this.next != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final <T> T modify(C13074a<? extends T> aVar) {
        C12775o.m28639i(aVar, "block");
        if (getMap().getModification$runtime_release() == this.modification) {
            T invoke = aVar.invoke();
            this.modification = getMap().getModification$runtime_release();
            return invoke;
        }
        throw new ConcurrentModificationException();
    }

    public final void remove() {
        if (getMap().getModification$runtime_release() == this.modification) {
            Map.Entry<? extends K, ? extends V> entry = this.current;
            if (entry != null) {
                this.map.remove(entry.getKey());
                this.current = null;
                C11921v vVar = C11921v.f18618a;
                this.modification = getMap().getModification$runtime_release();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }

    /* access modifiers changed from: protected */
    public final void setCurrent(Map.Entry<? extends K, ? extends V> entry) {
        this.current = entry;
    }

    /* access modifiers changed from: protected */
    public final void setModification(int i) {
        this.modification = i;
    }

    /* access modifiers changed from: protected */
    public final void setNext(Map.Entry<? extends K, ? extends V> entry) {
        this.next = entry;
    }
}
