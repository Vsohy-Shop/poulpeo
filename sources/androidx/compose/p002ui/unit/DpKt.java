package androidx.compose.p002ui.unit;

import androidx.compose.p002ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n130#1:558\n337#1:562\n473#1:566\n544#1:570\n550#1:572\n25#2,3:559\n25#2,3:563\n71#3:567\n58#3:568\n58#3:569\n58#3:571\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n144#1:558\n351#1:562\n487#1:566\n556#1:570\n556#1:572\n254#1:559,3\n372#1:563,3\n495#1:567\n544#1:568\n550#1:569\n556#1:571\n*E\n"})
/* renamed from: androidx.compose.ui.unit.DpKt */
/* compiled from: Dp.kt */
public final class DpKt {
    @Stable
    /* renamed from: DpOffset-YgX7TsA  reason: not valid java name */
    public static final long m38489DpOffsetYgX7TsA(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return DpOffset.m38524constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32));
    }

    @Stable
    /* renamed from: DpSize-YgX7TsA  reason: not valid java name */
    public static final long m38490DpSizeYgX7TsA(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return DpSize.m38557constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32));
    }

    @Stable
    /* renamed from: coerceAtLeast-YgX7TsA  reason: not valid java name */
    public static final float m38491coerceAtLeastYgX7TsA(float f, float f2) {
        return C1232Dp.m38468constructorimpl(C13537l.m30876c(f, f2));
    }

    @Stable
    /* renamed from: coerceAtMost-YgX7TsA  reason: not valid java name */
    public static final float m38492coerceAtMostYgX7TsA(float f, float f2) {
        return C1232Dp.m38468constructorimpl(C13537l.m30881h(f, f2));
    }

    @Stable
    /* renamed from: coerceIn-2z7ARbQ  reason: not valid java name */
    public static final float m38493coerceIn2z7ARbQ(float f, float f2, float f3) {
        return C1232Dp.m38468constructorimpl(C13537l.m30885l(f, f2, f3));
    }

    /* renamed from: getCenter-EaSLcWc  reason: not valid java name */
    public static final long m38494getCenterEaSLcWc(long j) {
        return m38489DpOffsetYgX7TsA(C1232Dp.m38468constructorimpl(DpSize.m38566getWidthD9Ej5fM(j) / 2.0f), C1232Dp.m38468constructorimpl(DpSize.m38564getHeightD9Ej5fM(j) / 2.0f));
    }

    public static final float getDp(int i) {
        return C1232Dp.m38468constructorimpl((float) i);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d) {
    }

    public static final float getHeight(DpRect dpRect) {
        C12775o.m28639i(dpRect, "<this>");
        return C1232Dp.m38468constructorimpl(dpRect.m38550getBottomD9Ej5fM() - dpRect.m38553getTopD9Ej5fM());
    }

    public static final long getSize(DpRect dpRect) {
        C12775o.m28639i(dpRect, "<this>");
        return m38490DpSizeYgX7TsA(C1232Dp.m38468constructorimpl(dpRect.m38552getRightD9Ej5fM() - dpRect.m38551getLeftD9Ej5fM()), C1232Dp.m38468constructorimpl(dpRect.m38550getBottomD9Ej5fM() - dpRect.m38553getTopD9Ej5fM()));
    }

    public static final float getWidth(DpRect dpRect) {
        C12775o.m28639i(dpRect, "<this>");
        return C1232Dp.m38468constructorimpl(dpRect.m38552getRightD9Ej5fM() - dpRect.m38551getLeftD9Ej5fM());
    }

    /* renamed from: isFinite-0680j_4  reason: not valid java name */
    public static final boolean m38496isFinite0680j_4(float f) {
        boolean z;
        if (f == Float.POSITIVE_INFINITY) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    /* renamed from: isSpecified-0680j_4  reason: not valid java name */
    public static final boolean m38498isSpecified0680j_4(float f) {
        return !Float.isNaN(f);
    }

    /* renamed from: isSpecified-EaSLcWc  reason: not valid java name */
    public static final boolean m38500isSpecifiedEaSLcWc(long j) {
        if (j != DpSize.Companion.m38575getUnspecifiedMYxV2XQ()) {
            return true;
        }
        return false;
    }

    /* renamed from: isSpecified-jo-Fl9I  reason: not valid java name */
    public static final boolean m38502isSpecifiedjoFl9I(long j) {
        if (j != DpOffset.Companion.m38538getUnspecifiedRKDOV3M()) {
            return true;
        }
        return false;
    }

    /* renamed from: isUnspecified-0680j_4  reason: not valid java name */
    public static final boolean m38504isUnspecified0680j_4(float f) {
        return Float.isNaN(f);
    }

    /* renamed from: isUnspecified-EaSLcWc  reason: not valid java name */
    public static final boolean m38506isUnspecifiedEaSLcWc(long j) {
        if (j == DpSize.Companion.m38575getUnspecifiedMYxV2XQ()) {
            return true;
        }
        return false;
    }

    /* renamed from: isUnspecified-jo-Fl9I  reason: not valid java name */
    public static final boolean m38508isUnspecifiedjoFl9I(long j) {
        if (j == DpOffset.Companion.m38538getUnspecifiedRKDOV3M()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: lerp-IDex15A  reason: not valid java name */
    public static final long m38510lerpIDex15A(long j, long j2, float f) {
        return m38490DpSizeYgX7TsA(m38511lerpMdfbLM(DpSize.m38566getWidthD9Ej5fM(j), DpSize.m38566getWidthD9Ej5fM(j2), f), m38511lerpMdfbLM(DpSize.m38564getHeightD9Ej5fM(j), DpSize.m38564getHeightD9Ej5fM(j2), f));
    }

    @Stable
    /* renamed from: lerp-Md-fbLM  reason: not valid java name */
    public static final float m38511lerpMdfbLM(float f, float f2, float f3) {
        return C1232Dp.m38468constructorimpl(MathHelpersKt.lerp(f, f2, f3));
    }

    @Stable
    /* renamed from: lerp-xhh869w  reason: not valid java name */
    public static final long m38512lerpxhh869w(long j, long j2, float f) {
        return m38489DpOffsetYgX7TsA(m38511lerpMdfbLM(DpOffset.m38529getXD9Ej5fM(j), DpOffset.m38529getXD9Ej5fM(j2), f), m38511lerpMdfbLM(DpOffset.m38531getYD9Ej5fM(j), DpOffset.m38531getYD9Ej5fM(j2), f));
    }

    @Stable
    /* renamed from: max-YgX7TsA  reason: not valid java name */
    public static final float m38513maxYgX7TsA(float f, float f2) {
        return C1232Dp.m38468constructorimpl(Math.max(f, f2));
    }

    @Stable
    /* renamed from: min-YgX7TsA  reason: not valid java name */
    public static final float m38514minYgX7TsA(float f, float f2) {
        return C1232Dp.m38468constructorimpl(Math.min(f, f2));
    }

    /* renamed from: takeOrElse-D5KLDUw  reason: not valid java name */
    public static final float m38515takeOrElseD5KLDUw(float f, C13074a<C1232Dp> aVar) {
        C12775o.m28639i(aVar, "block");
        if (!Float.isNaN(f)) {
            return f;
        }
        return aVar.invoke().m38482unboximpl();
    }

    /* renamed from: takeOrElse-gVKV90s  reason: not valid java name */
    public static final long m38516takeOrElsegVKV90s(long j, C13074a<DpOffset> aVar) {
        boolean z;
        C12775o.m28639i(aVar, "block");
        if (j != DpOffset.Companion.m38538getUnspecifiedRKDOV3M()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return j;
        }
        return aVar.invoke().m38537unboximpl();
    }

    /* renamed from: takeOrElse-itqla9I  reason: not valid java name */
    public static final long m38517takeOrElseitqla9I(long j, C13074a<DpSize> aVar) {
        boolean z;
        C12775o.m28639i(aVar, "block");
        if (j != DpSize.Companion.m38575getUnspecifiedMYxV2XQ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return j;
        }
        return aVar.invoke().m38574unboximpl();
    }

    @Stable
    /* renamed from: times-3ABfNKs  reason: not valid java name */
    public static final float m38519times3ABfNKs(float f, float f2) {
        return C1232Dp.m38468constructorimpl(f * f2);
    }

    @Stable
    /* renamed from: times-6HolHcs  reason: not valid java name */
    public static final long m38522times6HolHcs(int i, long j) {
        return DpSize.m38572timesGh9hcWk(j, i);
    }

    public static final float getDp(double d) {
        return C1232Dp.m38468constructorimpl((float) d);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f) {
    }

    @Stable
    /* renamed from: times-3ABfNKs  reason: not valid java name */
    public static final float m38518times3ABfNKs(double d, float f) {
        return C1232Dp.m38468constructorimpl(((float) d) * f);
    }

    @Stable
    /* renamed from: times-6HolHcs  reason: not valid java name */
    public static final long m38521times6HolHcs(float f, long j) {
        return DpSize.m38571timesGh9hcWk(j, f);
    }

    public static final float getDp(float f) {
        return C1232Dp.m38468constructorimpl(f);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i) {
    }

    @Stable
    /* renamed from: times-3ABfNKs  reason: not valid java name */
    public static final float m38520times3ABfNKs(int i, float f) {
        return C1232Dp.m38468constructorimpl(((float) i) * f);
    }

    @Stable
    /* renamed from: getCenter-EaSLcWc$annotations  reason: not valid java name */
    public static /* synthetic */ void m38495getCenterEaSLcWc$annotations(long j) {
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    @Stable
    /* renamed from: isFinite-0680j_4$annotations  reason: not valid java name */
    public static /* synthetic */ void m38497isFinite0680j_4$annotations(float f) {
    }

    @Stable
    /* renamed from: isSpecified-0680j_4$annotations  reason: not valid java name */
    public static /* synthetic */ void m38499isSpecified0680j_4$annotations(float f) {
    }

    @Stable
    /* renamed from: isSpecified-EaSLcWc$annotations  reason: not valid java name */
    public static /* synthetic */ void m38501isSpecifiedEaSLcWc$annotations(long j) {
    }

    @Stable
    /* renamed from: isSpecified-jo-Fl9I$annotations  reason: not valid java name */
    public static /* synthetic */ void m38503isSpecifiedjoFl9I$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-0680j_4$annotations  reason: not valid java name */
    public static /* synthetic */ void m38505isUnspecified0680j_4$annotations(float f) {
    }

    @Stable
    /* renamed from: isUnspecified-EaSLcWc$annotations  reason: not valid java name */
    public static /* synthetic */ void m38507isUnspecifiedEaSLcWc$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-jo-Fl9I$annotations  reason: not valid java name */
    public static /* synthetic */ void m38509isUnspecifiedjoFl9I$annotations(long j) {
    }
}
