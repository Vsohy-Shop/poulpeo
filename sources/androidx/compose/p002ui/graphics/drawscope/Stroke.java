package androidx.compose.p002ui.graphics.drawscope;

import androidx.compose.p002ui.graphics.PathEffect;
import androidx.compose.p002ui.graphics.StrokeCap;
import androidx.compose.p002ui.graphics.StrokeJoin;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.graphics.drawscope.Stroke */
/* compiled from: DrawScope.kt */
public final class Stroke extends DrawStyle {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int DefaultCap = StrokeCap.Companion.m36054getButtKaPHkGw();
    /* access modifiers changed from: private */
    public static final int DefaultJoin = StrokeJoin.Companion.m36065getMiterLxFBmk8();
    public static final float DefaultMiter = 4.0f;
    public static final float HairlineWidth = 0.0f;
    private final int cap;
    private final int join;
    private final float miter;
    private final PathEffect pathEffect;
    private final float width;

    /* renamed from: androidx.compose.ui.graphics.drawscope.Stroke$Companion */
    /* compiled from: DrawScope.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDefaultCap-KaPHkGw  reason: not valid java name */
        public final int m36356getDefaultCapKaPHkGw() {
            return Stroke.DefaultCap;
        }

        /* renamed from: getDefaultJoin-LxFBmk8  reason: not valid java name */
        public final int m36357getDefaultJoinLxFBmk8() {
            return Stroke.DefaultJoin;
        }
    }

    public /* synthetic */ Stroke(float f, float f2, int i, int i2, PathEffect pathEffect2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, i, i2, pathEffect2);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) obj;
        if (this.width == stroke.width) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.miter == stroke.miter) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && StrokeCap.m36050equalsimpl0(this.cap, stroke.cap) && StrokeJoin.m36060equalsimpl0(this.join, stroke.join) && C12775o.m28634d(this.pathEffect, stroke.pathEffect)) {
            return true;
        }
        return false;
    }

    /* renamed from: getCap-KaPHkGw  reason: not valid java name */
    public final int m36354getCapKaPHkGw() {
        return this.cap;
    }

    /* renamed from: getJoin-LxFBmk8  reason: not valid java name */
    public final int m36355getJoinLxFBmk8() {
        return this.join;
    }

    public final float getMiter() {
        return this.miter;
    }

    public final PathEffect getPathEffect() {
        return this.pathEffect;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((((Float.hashCode(this.width) * 31) + Float.hashCode(this.miter)) * 31) + StrokeCap.m36051hashCodeimpl(this.cap)) * 31) + StrokeJoin.m36061hashCodeimpl(this.join)) * 31;
        PathEffect pathEffect2 = this.pathEffect;
        if (pathEffect2 != null) {
            i = pathEffect2.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + StrokeCap.m36052toStringimpl(this.cap) + ", join=" + StrokeJoin.m36062toStringimpl(this.join) + ", pathEffect=" + this.pathEffect + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Stroke(float f, float f2, int i, int i2, PathEffect pathEffect2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0.0f : f, (i3 & 2) != 0 ? 4.0f : f2, (i3 & 4) != 0 ? DefaultCap : i, (i3 & 8) != 0 ? DefaultJoin : i2, (i3 & 16) != 0 ? null : pathEffect2, (DefaultConstructorMarker) null);
    }

    private Stroke(float f, float f2, int i, int i2, PathEffect pathEffect2) {
        super((DefaultConstructorMarker) null);
        this.width = f;
        this.miter = f2;
        this.cap = i;
        this.join = i2;
        this.pathEffect = pathEffect2;
    }
}
