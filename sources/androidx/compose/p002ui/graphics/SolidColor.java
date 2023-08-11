package androidx.compose.p002ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import com.appboy.Constants;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.SolidColor */
/* compiled from: Brush.kt */
public final class SolidColor extends Brush {
    private final long value;

    public /* synthetic */ SolidColor(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* renamed from: applyTo-Pq9zytI  reason: not valid java name */
    public void m36035applyToPq9zytI(long j, Paint paint, float f) {
        boolean z;
        long j2;
        C12775o.m28639i(paint, Constants.APPBOY_PUSH_PRIORITY_KEY);
        paint.setAlpha(1.0f);
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            long j3 = this.value;
            j2 = Color.m35670copywmQWz5c$default(j3, Color.m35673getAlphaimpl(j3) * f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j2 = this.value;
        }
        paint.m35934setColor8_81llA(j2);
        if (paint.getShader() != null) {
            paint.setShader((Shader) null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SolidColor) && Color.m35672equalsimpl0(this.value, ((SolidColor) obj).value)) {
            return true;
        }
        return false;
    }

    /* renamed from: getValue-0d7_KjU  reason: not valid java name */
    public final long m36036getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m35678hashCodeimpl(this.value);
    }

    public String toString() {
        return "SolidColor(value=" + Color.m35679toStringimpl(this.value) + ')';
    }

    private SolidColor(long j) {
        super((DefaultConstructorMarker) null);
        this.value = j;
    }
}
