package androidx.compose.p002ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nTransformOrigin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,83:1\n34#2:84\n41#2:85\n*S KotlinDebug\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n*L\n46#1:84\n55#1:85\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.TransformOrigin */
/* compiled from: TransformOrigin.kt */
public final class TransformOrigin {
    /* access modifiers changed from: private */
    public static final long Center = TransformOriginKt.TransformOrigin(0.5f, 0.5f);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final long packedValue;

    /* renamed from: androidx.compose.ui.graphics.TransformOrigin$Companion */
    /* compiled from: TransformOrigin.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCenter-SzJe1aQ  reason: not valid java name */
        public final long m36093getCenterSzJe1aQ() {
            return TransformOrigin.Center;
        }
    }

    private /* synthetic */ TransformOrigin(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TransformOrigin m36080boximpl(long j) {
        return new TransformOrigin(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m36081component1impl(long j) {
        return m36088getPivotFractionXimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m36082component2impl(long j) {
        return m36089getPivotFractionYimpl(j);
    }

    /* renamed from: copy-zey9I6w  reason: not valid java name */
    public static final long m36084copyzey9I6w(long j, float f, float f2) {
        return TransformOriginKt.TransformOrigin(f, f2);
    }

    /* renamed from: copy-zey9I6w$default  reason: not valid java name */
    public static /* synthetic */ long m36085copyzey9I6w$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m36088getPivotFractionXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m36089getPivotFractionYimpl(j);
        }
        return m36084copyzey9I6w(j, f, f2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m36086equalsimpl(long j, Object obj) {
        if ((obj instanceof TransformOrigin) && j == ((TransformOrigin) obj).m36092unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m36087equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getPivotFractionX-impl  reason: not valid java name */
    public static final float m36088getPivotFractionXimpl(long j) {
        C12763h hVar = C12763h.f20419a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getPivotFractionY-impl  reason: not valid java name */
    public static final float m36089getPivotFractionYimpl(long j) {
        C12763h hVar = C12763h.f20419a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m36090hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m36091toStringimpl(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m36086equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m36090hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m36091toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m36092unboximpl() {
        return this.packedValue;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m36083constructorimpl(long j) {
        return j;
    }
}
