package androidx.compose.p002ui.input.pointer.util;

import com.appboy.Constants;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.input.pointer.util.Vector */
/* compiled from: VelocityTracker.kt */
final class Vector {
    private final Float[] elements;
    private final int length;

    public Vector(int i) {
        this.length = i;
        Float[] fArr = new Float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.valueOf(0.0f);
        }
        this.elements = fArr;
    }

    public final float get(int i) {
        return this.elements[i].floatValue();
    }

    public final Float[] getElements() {
        return this.elements;
    }

    public final int getLength() {
        return this.length;
    }

    public final float norm() {
        return (float) Math.sqrt((double) times(this));
    }

    public final void set(int i, float f) {
        this.elements[i] = Float.valueOf(f);
    }

    public final float times(Vector vector) {
        C12775o.m28639i(vector, Constants.APPBOY_PUSH_CONTENT_KEY);
        int i = this.length;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += get(i2) * vector.get(i2);
        }
        return f;
    }
}
