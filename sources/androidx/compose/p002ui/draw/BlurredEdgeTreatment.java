package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.graphics.RectangleShapeKt;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.draw.BlurredEdgeTreatment */
/* compiled from: Blur.kt */
public final class BlurredEdgeTreatment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Shape Rectangle = m35320constructorimpl(RectangleShapeKt.getRectangleShape());
    /* access modifiers changed from: private */
    public static final Shape Unbounded = m35320constructorimpl((Shape) null);
    private final Shape shape;

    /* renamed from: androidx.compose.ui.draw.BlurredEdgeTreatment$Companion */
    /* compiled from: Blur.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getRectangle---Goahg  reason: not valid java name */
        public final Shape m35326getRectangleGoahg() {
            return BlurredEdgeTreatment.Rectangle;
        }

        /* renamed from: getUnbounded---Goahg  reason: not valid java name */
        public final Shape m35327getUnboundedGoahg() {
            return BlurredEdgeTreatment.Unbounded;
        }
    }

    private /* synthetic */ BlurredEdgeTreatment(Shape shape2) {
        this.shape = shape2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ BlurredEdgeTreatment m35319boximpl(Shape shape2) {
        return new BlurredEdgeTreatment(shape2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35321equalsimpl(Shape shape2, Object obj) {
        if ((obj instanceof BlurredEdgeTreatment) && C12775o.m28634d(shape2, ((BlurredEdgeTreatment) obj).m35325unboximpl())) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35322equalsimpl0(Shape shape2, Shape shape3) {
        return C12775o.m28634d(shape2, shape3);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35323hashCodeimpl(Shape shape2) {
        if (shape2 == null) {
            return 0;
        }
        return shape2.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35324toStringimpl(Shape shape2) {
        return "BlurredEdgeTreatment(shape=" + shape2 + ')';
    }

    public boolean equals(Object obj) {
        return m35321equalsimpl(this.shape, obj);
    }

    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return m35323hashCodeimpl(this.shape);
    }

    public String toString() {
        return m35324toStringimpl(this.shape);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Shape m35325unboximpl() {
        return this.shape;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static Shape m35320constructorimpl(Shape shape2) {
        return shape2;
    }
}
