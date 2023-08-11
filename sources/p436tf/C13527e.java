package p436tf;

import java.util.NoSuchElementException;
import kotlin.collections.C12703l0;

/* renamed from: tf.e */
/* compiled from: ProgressionIterators.kt */
public final class C13527e extends C12703l0 {

    /* renamed from: b */
    private final int f21770b;

    /* renamed from: c */
    private final int f21771c;

    /* renamed from: d */
    private boolean f21772d;

    /* renamed from: e */
    private int f21773e;

    public C13527e(int i, int i2, int i3) {
        this.f21770b = i3;
        this.f21771c = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f21772d = z;
        this.f21773e = !z ? i2 : i;
    }

    public boolean hasNext() {
        return this.f21772d;
    }

    public int nextInt() {
        int i = this.f21773e;
        if (i != this.f21771c) {
            this.f21773e = this.f21770b + i;
        } else if (this.f21772d) {
            this.f21772d = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
