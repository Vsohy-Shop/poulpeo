package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.Shadow */
/* compiled from: Shadow.kt */
public final class Shadow {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Shadow None = new Shadow(0, 0, 0.0f, 7, (DefaultConstructorMarker) null);
    private final float blurRadius;
    private final long color;
    private final long offset;

    public /* synthetic */ Shadow(long j, long j2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f);
    }

    /* renamed from: copy-qcb84PM$default  reason: not valid java name */
    public static /* synthetic */ Shadow m36019copyqcb84PM$default(Shadow shadow, long j, long j2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = shadow.color;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = shadow.offset;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            f = shadow.blurRadius;
        }
        return shadow.m36022copyqcb84PM(j3, j4, f);
    }

    /* renamed from: copy-qcb84PM  reason: not valid java name */
    public final Shadow m36022copyqcb84PM(long j, long j2, float f) {
        return new Shadow(j, j2, f, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        if (!Color.m35672equalsimpl0(this.color, shadow.color) || !Offset.m35419equalsimpl0(this.offset, shadow.offset)) {
            return false;
        }
        if (this.blurRadius == shadow.blurRadius) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public final long m36023getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getOffset-F1C5BW0  reason: not valid java name */
    public final long m36024getOffsetF1C5BW0() {
        return this.offset;
    }

    public int hashCode() {
        return (((Color.m35678hashCodeimpl(this.color) * 31) + Offset.m35424hashCodeimpl(this.offset)) * 31) + Float.hashCode(this.blurRadius);
    }

    public String toString() {
        return "Shadow(color=" + Color.m35679toStringimpl(this.color) + ", offset=" + Offset.m35430toStringimpl(this.offset) + ", blurRadius=" + this.blurRadius + ')';
    }

    private Shadow(long j, long j2, float f) {
        this.color = j;
        this.offset = j2;
        this.blurRadius = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Shadow(long j, long j2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ColorKt.Color(4278190080L) : j, (i & 2) != 0 ? Offset.Companion.m35438getZeroF1C5BW0() : j2, (i & 4) != 0 ? 0.0f : f, (DefaultConstructorMarker) null);
    }

    /* renamed from: androidx.compose.ui.graphics.Shadow$Companion */
    /* compiled from: Shadow.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Shadow getNone() {
            return Shadow.None;
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getBlurRadius$annotations() {
    }

    @Stable
    /* renamed from: getColor-0d7_KjU$annotations  reason: not valid java name */
    public static /* synthetic */ void m36020getColor0d7_KjU$annotations() {
    }

    @Stable
    /* renamed from: getOffset-F1C5BW0$annotations  reason: not valid java name */
    public static /* synthetic */ void m36021getOffsetF1C5BW0$annotations() {
    }
}
