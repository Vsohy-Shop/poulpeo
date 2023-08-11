package androidx.compose.p002ui.unit;

import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,163:1\n1#2:164\n174#3:165\n174#3:166\n473#3:167\n152#4:168\n*S KotlinDebug\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n*L\n114#1:165\n124#1:166\n147#1:167\n157#1:168\n*E\n"})
/* renamed from: androidx.compose.ui.unit.Density */
/* compiled from: Density.kt */
public interface Density {

    /* renamed from: androidx.compose.ui.unit.Density$DefaultImpls */
    /* compiled from: Density.kt */
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m38454roundToPxR2X_6o(Density density, long j) {
            return Density.super.m38442roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m38455roundToPx0680j_4(Density density, float f) {
            return Density.super.m38443roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m38456toDpGaN1DYA(Density density, long j) {
            return Density.super.m38444toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m38458toDpu2uoSUM(Density density, int i) {
            return Density.super.m38446toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m38459toDpSizekrfVVM(Density density, long j) {
            return Density.super.m38447toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m38460toPxR2X_6o(Density density, long j) {
            return Density.super.m38448toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m38461toPx0680j_4(Density density, float f) {
            return Density.super.m38449toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        public static Rect toRect(Density density, DpRect dpRect) {
            C12775o.m28639i(dpRect, "$receiver");
            return Density.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m38462toSizeXkaWNTQ(Density density, long j) {
            return Density.super.m38450toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m38463toSp0xMU5do(Density density, float f) {
            return Density.super.m38451toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m38465toSpkPz2Gy4(Density density, int i) {
            return Density.super.m38453toSpkPz2Gy4(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m38457toDpu2uoSUM(Density density, float f) {
            return Density.super.m38445toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m38464toSpkPz2Gy4(Density density, float f) {
            return Density.super.m38452toSpkPz2Gy4(f);
        }

        @Stable
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFontScale$annotations() {
        }
    }

    float getDensity();

    float getFontScale();

    @Stable
    /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
    int m38442roundToPxR2X_6o(long j) {
        return C13265c.m30134c(m38448toPxR2X_6o(j));
    }

    @Stable
    /* renamed from: roundToPx-0680j_4  reason: not valid java name */
    int m38443roundToPx0680j_4(float f) {
        float r2 = m38449toPx0680j_4(f);
        if (Float.isInfinite(r2)) {
            return Integer.MAX_VALUE;
        }
        return C13265c.m30134c(r2);
    }

    @Stable
    /* renamed from: toDp-GaN1DYA  reason: not valid java name */
    float m38444toDpGaN1DYA(long j) {
        if (TextUnitType.m38677equalsimpl0(TextUnit.m38648getTypeUIouoOA(j), TextUnitType.Companion.m38682getSpUIouoOA())) {
            return C1232Dp.m38468constructorimpl(TextUnit.m38649getValueimpl(j) * getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @Stable
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    float m38446toDpu2uoSUM(int i) {
        return C1232Dp.m38468constructorimpl(((float) i) / getDensity());
    }

    @Stable
    /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
    long m38447toDpSizekrfVVM(long j) {
        boolean z;
        if (j != Size.Companion.m35499getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return DpKt.m38490DpSizeYgX7TsA(m38445toDpu2uoSUM(Size.m35491getWidthimpl(j)), m38445toDpu2uoSUM(Size.m35488getHeightimpl(j)));
        }
        return DpSize.Companion.m38575getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* renamed from: toPx--R2X_6o  reason: not valid java name */
    float m38448toPxR2X_6o(long j) {
        if (TextUnitType.m38677equalsimpl0(TextUnit.m38648getTypeUIouoOA(j), TextUnitType.Companion.m38682getSpUIouoOA())) {
            return TextUnit.m38649getValueimpl(j) * getFontScale() * getDensity();
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @Stable
    /* renamed from: toPx-0680j_4  reason: not valid java name */
    float m38449toPx0680j_4(float f) {
        return f * getDensity();
    }

    @Stable
    Rect toRect(DpRect dpRect) {
        C12775o.m28639i(dpRect, "<this>");
        return new Rect(m38449toPx0680j_4(dpRect.m38551getLeftD9Ej5fM()), m38449toPx0680j_4(dpRect.m38553getTopD9Ej5fM()), m38449toPx0680j_4(dpRect.m38552getRightD9Ej5fM()), m38449toPx0680j_4(dpRect.m38550getBottomD9Ej5fM()));
    }

    @Stable
    /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
    long m38450toSizeXkaWNTQ(long j) {
        boolean z;
        if (j != DpSize.Companion.m38575getUnspecifiedMYxV2XQ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return SizeKt.Size(m38449toPx0680j_4(DpSize.m38566getWidthD9Ej5fM(j)), m38449toPx0680j_4(DpSize.m38564getHeightD9Ej5fM(j)));
        }
        return Size.Companion.m35499getUnspecifiedNHjbRc();
    }

    @Stable
    /* renamed from: toSp-0xMU5do  reason: not valid java name */
    long m38451toSp0xMU5do(float f) {
        return TextUnitKt.getSp(f / getFontScale());
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    long m38453toSpkPz2Gy4(int i) {
        return TextUnitKt.getSp(((float) i) / (getFontScale() * getDensity()));
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    long m38452toSpkPz2Gy4(float f) {
        return TextUnitKt.getSp(f / (getFontScale() * getDensity()));
    }

    @Stable
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    float m38445toDpu2uoSUM(float f) {
        return C1232Dp.m38468constructorimpl(f / getDensity());
    }
}
