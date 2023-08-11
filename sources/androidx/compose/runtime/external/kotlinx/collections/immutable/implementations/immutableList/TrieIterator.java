package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;

/* compiled from: TrieIterator.kt */
public final class TrieIterator<E> extends AbstractListIterator<E> {
    private int height;
    private boolean isInRightEdge;
    private Object[] path;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrieIterator(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        boolean z;
        C12775o.m28639i(objArr, "root");
        this.height = i3;
        Object[] objArr2 = new Object[i3];
        this.path = objArr2;
        if (i == i2) {
            z = true;
        } else {
            z = false;
        }
        this.isInRightEdge = z;
        objArr2[0] = objArr;
        fillPath(i - (z ? 1 : 0), 1);
    }

    private final E elementAtCurrentIndex() {
        Object obj = this.path[this.height - 1];
        C12775o.m28637g(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[getIndex() & 31];
    }

    private final void fillPath(int i, int i2) {
        int i3 = (this.height - i2) * 5;
        while (i2 < this.height) {
            Object[] objArr = this.path;
            Object[] objArr2 = objArr[i2 - 1];
            C12775o.m28637g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = objArr2[UtilsKt.indexSegment(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    private final void fillPathIfNeeded(int i) {
        int i2 = 0;
        while (UtilsKt.indexSegment(getIndex(), i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            fillPath(getIndex(), ((this.height - 1) - (i2 / 5)) + 1);
        }
    }

    public E next() {
        if (hasNext()) {
            E elementAtCurrentIndex = elementAtCurrentIndex();
            setIndex(getIndex() + 1);
            if (getIndex() == getSize()) {
                this.isInRightEdge = true;
                return elementAtCurrentIndex;
            }
            fillPathIfNeeded(0);
            return elementAtCurrentIndex;
        }
        throw new NoSuchElementException();
    }

    public E previous() {
        if (hasPrevious()) {
            setIndex(getIndex() - 1);
            if (this.isInRightEdge) {
                this.isInRightEdge = false;
                return elementAtCurrentIndex();
            }
            fillPathIfNeeded(31);
            return elementAtCurrentIndex();
        }
        throw new NoSuchElementException();
    }

    public final void reset$runtime_release(Object[] objArr, int i, int i2, int i3) {
        C12775o.m28639i(objArr, "root");
        setIndex(i);
        setSize(i2);
        this.height = i3;
        if (this.path.length < i3) {
            this.path = new Object[i3];
        }
        boolean z = false;
        this.path[0] = objArr;
        if (i == i2) {
            z = true;
        }
        this.isInRightEdge = z;
        fillPath(i - (z ? 1 : 0), 1);
    }
}
