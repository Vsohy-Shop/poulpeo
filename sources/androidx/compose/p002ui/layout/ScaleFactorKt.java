package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,197:1\n130#1:201\n25#2,3:198\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n144#1:201\n31#1:198,3\n*E\n"})
/* renamed from: androidx.compose.ui.layout.ScaleFactorKt */
/* compiled from: ScaleFactor.kt */
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return ScaleFactor.m37419constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32));
    }

    @Stable
    /* renamed from: div-UQTWf7w  reason: not valid java name */
    public static final long m37433divUQTWf7w(long j, long j2) {
        return SizeKt.Size(Size.m35491getWidthimpl(j) / ScaleFactor.m37425getScaleXimpl(j2), Size.m35488getHeightimpl(j) / ScaleFactor.m37426getScaleYimpl(j2));
    }

    /* renamed from: isSpecified-FK8aYYs  reason: not valid java name */
    public static final boolean m37434isSpecifiedFK8aYYs(long j) {
        if (j != ScaleFactor.Companion.m37432getUnspecified_hLwfpc()) {
            return true;
        }
        return false;
    }

    /* renamed from: isUnspecified-FK8aYYs  reason: not valid java name */
    public static final boolean m37436isUnspecifiedFK8aYYs(long j) {
        if (j == ScaleFactor.Companion.m37432getUnspecified_hLwfpc()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: lerp--bDIf60  reason: not valid java name */
    public static final long m37438lerpbDIf60(long j, long j2, float f) {
        return ScaleFactor(MathHelpersKt.lerp(ScaleFactor.m37425getScaleXimpl(j), ScaleFactor.m37425getScaleXimpl(j2), f), MathHelpersKt.lerp(ScaleFactor.m37426getScaleYimpl(j), ScaleFactor.m37426getScaleYimpl(j2), f));
    }

    /* access modifiers changed from: private */
    public static final float roundToTenths(float f) {
        float f2 = (float) 10;
        float f3 = f * f2;
        int i = (int) f3;
        if (f3 - ((float) i) >= 0.5f) {
            i++;
        }
        return ((float) i) / f2;
    }

    /* renamed from: takeOrElse-oyDd2qo  reason: not valid java name */
    public static final long m37439takeOrElseoyDd2qo(long j, C13074a<ScaleFactor> aVar) {
        boolean z;
        C12775o.m28639i(aVar, "block");
        if (j != ScaleFactor.Companion.m37432getUnspecified_hLwfpc()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return j;
        }
        return aVar.invoke().m37430unboximpl();
    }

    @Stable
    /* renamed from: times-UQTWf7w  reason: not valid java name */
    public static final long m37440timesUQTWf7w(long j, long j2) {
        return SizeKt.Size(Size.m35491getWidthimpl(j) * ScaleFactor.m37425getScaleXimpl(j2), Size.m35488getHeightimpl(j) * ScaleFactor.m37426getScaleYimpl(j2));
    }

    @Stable
    /* renamed from: times-m-w2e94  reason: not valid java name */
    public static final long m37441timesmw2e94(long j, long j2) {
        return m37440timesUQTWf7w(j2, j);
    }

    @Stable
    /* renamed from: isSpecified-FK8aYYs$annotations  reason: not valid java name */
    public static /* synthetic */ void m37435isSpecifiedFK8aYYs$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-FK8aYYs$annotations  reason: not valid java name */
    public static /* synthetic */ void m37437isUnspecifiedFK8aYYs$annotations(long j) {
    }
}
