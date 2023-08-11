package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.List;
import kotlin.collections.C12671c;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* compiled from: ImmutableList.kt */
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E>, C13212a {

    /* compiled from: ImmutableList.kt */
    private static final class SubList<E> extends C12671c<E> implements ImmutableList<E> {
        private int _size;
        private final int fromIndex;
        private final ImmutableList<E> source;
        private final int toIndex;

        public SubList(ImmutableList<? extends E> immutableList, int i, int i2) {
            C12775o.m28639i(immutableList, APIParams.SOURCE);
            this.source = immutableList;
            this.fromIndex = i;
            this.toIndex = i2;
            ListImplementation.checkRangeIndexes$runtime_release(i, i2, immutableList.size());
            this._size = i2 - i;
        }

        public E get(int i) {
            ListImplementation.checkElementIndex$runtime_release(i, this._size);
            return this.source.get(this.fromIndex + i);
        }

        public int getSize() {
            return this._size;
        }

        public ImmutableList<E> subList(int i, int i2) {
            ListImplementation.checkRangeIndexes$runtime_release(i, i2, this._size);
            ImmutableList<E> immutableList = this.source;
            int i3 = this.fromIndex;
            return new SubList(immutableList, i + i3, i3 + i2);
        }
    }

    ImmutableList<E> subList(int i, int i2) {
        return new SubList(this, i, i2);
    }
}
