package p331dg;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: dg.b0 */
/* compiled from: ResizableAtomicArray.kt */
public final class C11818b0<T> {
    private volatile AtomicReferenceArray<T> array;

    public C11818b0(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    /* renamed from: a */
    public final int mo48977a() {
        return this.array.length();
    }

    /* renamed from: b */
    public final T mo48978b(int i) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo48979c(int i, T t) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, t);
            return;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(C13537l.m30877d(i + 1, length * 2));
        for (int i2 = 0; i2 < length; i2++) {
            atomicReferenceArray2.set(i2, atomicReferenceArray.get(i2));
        }
        atomicReferenceArray2.set(i, t);
        this.array = atomicReferenceArray2;
    }
}
