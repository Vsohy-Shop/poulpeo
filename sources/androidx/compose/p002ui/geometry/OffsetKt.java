package androidx.compose.p002ui.geometry;

import androidx.compose.p002ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,266:1\n25#2,3:267\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n31#1:267,3\n*E\n"})
/* renamed from: androidx.compose.ui.geometry.OffsetKt */
/* compiled from: Offset.kt */
public final class OffsetKt {
    @Stable
    public static final long Offset(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return Offset.m35414constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32));
    }

    /* renamed from: isFinite-k-4lQ0M  reason: not valid java name */
    public static final boolean m35439isFinitek4lQ0M(long j) {
        boolean z;
        boolean z2;
        float r0 = Offset.m35422getXimpl(j);
        if (Float.isInfinite(r0) || Float.isNaN(r0)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            float r4 = Offset.m35423getYimpl(j);
            if (Float.isInfinite(r4) || Float.isNaN(r4)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isSpecified-k-4lQ0M  reason: not valid java name */
    public static final boolean m35441isSpecifiedk4lQ0M(long j) {
        if (j != Offset.Companion.m35437getUnspecifiedF1C5BW0()) {
            return true;
        }
        return false;
    }

    /* renamed from: isUnspecified-k-4lQ0M  reason: not valid java name */
    public static final boolean m35443isUnspecifiedk4lQ0M(long j) {
        if (j == Offset.Companion.m35437getUnspecifiedF1C5BW0()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: lerp-Wko1d7g  reason: not valid java name */
    public static final long m35445lerpWko1d7g(long j, long j2, float f) {
        return Offset(MathHelpersKt.lerp(Offset.m35422getXimpl(j), Offset.m35422getXimpl(j2), f), MathHelpersKt.lerp(Offset.m35423getYimpl(j), Offset.m35423getYimpl(j2), f));
    }

    /* renamed from: takeOrElse-3MmeM6k  reason: not valid java name */
    public static final long m35446takeOrElse3MmeM6k(long j, C13074a<Offset> aVar) {
        C12775o.m28639i(aVar, "block");
        if (m35441isSpecifiedk4lQ0M(j)) {
            return j;
        }
        return aVar.invoke().m35432unboximpl();
    }

    @Stable
    /* renamed from: isFinite-k-4lQ0M$annotations  reason: not valid java name */
    public static /* synthetic */ void m35440isFinitek4lQ0M$annotations(long j) {
    }

    @Stable
    /* renamed from: isSpecified-k-4lQ0M$annotations  reason: not valid java name */
    public static /* synthetic */ void m35442isSpecifiedk4lQ0M$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-k-4lQ0M$annotations  reason: not valid java name */
    public static /* synthetic */ void m35444isUnspecifiedk4lQ0M$annotations(long j) {
    }
}
