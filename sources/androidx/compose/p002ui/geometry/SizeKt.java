package androidx.compose.p002ui.geometry;

import androidx.compose.p002ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,225:1\n152#1:229\n25#2,3:226\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n166#1:229\n33#1:226,3\n*E\n"})
/* renamed from: androidx.compose.ui.geometry.SizeKt */
/* compiled from: Size.kt */
public final class SizeKt {
    @Stable
    public static final long Size(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return Size.m35482constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32));
    }

    /* renamed from: getCenter-uvyYCjk  reason: not valid java name */
    public static final long m35501getCenteruvyYCjk(long j) {
        return OffsetKt.Offset(Size.m35491getWidthimpl(j) / 2.0f, Size.m35488getHeightimpl(j) / 2.0f);
    }

    /* renamed from: isSpecified-uvyYCjk  reason: not valid java name */
    public static final boolean m35503isSpecifieduvyYCjk(long j) {
        if (j != Size.Companion.m35499getUnspecifiedNHjbRc()) {
            return true;
        }
        return false;
    }

    /* renamed from: isUnspecified-uvyYCjk  reason: not valid java name */
    public static final boolean m35505isUnspecifieduvyYCjk(long j) {
        if (j == Size.Companion.m35499getUnspecifiedNHjbRc()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: lerp-VgWVRYQ  reason: not valid java name */
    public static final long m35507lerpVgWVRYQ(long j, long j2, float f) {
        return Size(MathHelpersKt.lerp(Size.m35491getWidthimpl(j), Size.m35491getWidthimpl(j2), f), MathHelpersKt.lerp(Size.m35488getHeightimpl(j), Size.m35488getHeightimpl(j2), f));
    }

    /* renamed from: takeOrElse-TmRCtEA  reason: not valid java name */
    public static final long m35508takeOrElseTmRCtEA(long j, C13074a<Size> aVar) {
        boolean z;
        C12775o.m28639i(aVar, "block");
        if (j != Size.Companion.m35499getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return j;
        }
        return aVar.invoke().m35496unboximpl();
    }

    @Stable
    /* renamed from: times-d16Qtg0  reason: not valid java name */
    public static final long m35511timesd16Qtg0(int i, long j) {
        return Size.m35494times7Ah8Wj8(j, (float) i);
    }

    @Stable
    /* renamed from: toRect-uvyYCjk  reason: not valid java name */
    public static final Rect m35512toRectuvyYCjk(long j) {
        return RectKt.m35462Recttz77jQw(Offset.Companion.m35438getZeroF1C5BW0(), j);
    }

    @Stable
    /* renamed from: times-d16Qtg0  reason: not valid java name */
    public static final long m35509timesd16Qtg0(double d, long j) {
        return Size.m35494times7Ah8Wj8(j, (float) d);
    }

    @Stable
    /* renamed from: times-d16Qtg0  reason: not valid java name */
    public static final long m35510timesd16Qtg0(float f, long j) {
        return Size.m35494times7Ah8Wj8(j, f);
    }

    @Stable
    /* renamed from: getCenter-uvyYCjk$annotations  reason: not valid java name */
    public static /* synthetic */ void m35502getCenteruvyYCjk$annotations(long j) {
    }

    @Stable
    /* renamed from: isSpecified-uvyYCjk$annotations  reason: not valid java name */
    public static /* synthetic */ void m35504isSpecifieduvyYCjk$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-uvyYCjk$annotations  reason: not valid java name */
    public static /* synthetic */ void m35506isUnspecifieduvyYCjk$annotations(long j) {
    }
}
