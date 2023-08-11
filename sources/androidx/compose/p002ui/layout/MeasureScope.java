package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.layout.MeasureScope */
/* compiled from: MeasureScope.kt */
public interface MeasureScope extends IntrinsicMeasureScope {

    /* renamed from: androidx.compose.ui.layout.MeasureScope$DefaultImpls */
    /* compiled from: MeasureScope.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i, int i2, Map<AlignmentLine, Integer> map, Function1<? super Placeable.PlacementScope, C11921v> function1) {
            C12775o.m28639i(map, "alignmentLines");
            C12775o.m28639i(function1, "placementBlock");
            return MeasureScope.super.layout(i, i2, map, function1);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m37379roundToPxR2X_6o(MeasureScope measureScope, long j) {
            return MeasureScope.super.m38442roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m37380roundToPx0680j_4(MeasureScope measureScope, float f) {
            return MeasureScope.super.m38443roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m37381toDpGaN1DYA(MeasureScope measureScope, long j) {
            return MeasureScope.super.m38444toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m37382toDpu2uoSUM(MeasureScope measureScope, float f) {
            return MeasureScope.super.m38445toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m37384toDpSizekrfVVM(MeasureScope measureScope, long j) {
            return MeasureScope.super.m38447toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m37385toPxR2X_6o(MeasureScope measureScope, long j) {
            return MeasureScope.super.m38448toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m37386toPx0680j_4(MeasureScope measureScope, float f) {
            return MeasureScope.super.m38449toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        public static Rect toRect(MeasureScope measureScope, DpRect dpRect) {
            C12775o.m28639i(dpRect, "$receiver");
            return MeasureScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m37387toSizeXkaWNTQ(MeasureScope measureScope, long j) {
            return MeasureScope.super.m38450toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m37388toSp0xMU5do(MeasureScope measureScope, float f) {
            return MeasureScope.super.m38451toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m37389toSpkPz2Gy4(MeasureScope measureScope, float f) {
            return MeasureScope.super.m38452toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m37383toDpu2uoSUM(MeasureScope measureScope, int i) {
            return MeasureScope.super.m38446toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m37390toSpkPz2Gy4(MeasureScope measureScope, int i) {
            return MeasureScope.super.m38453toSpkPz2Gy4(i);
        }
    }

    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i, int i2, Map map, Function1 function1, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                map = C12716r0.m28416g();
            }
            return measureScope.layout(i, i2, map, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
    }

    MeasureResult layout(int i, int i2, Map<AlignmentLine, Integer> map, Function1<? super Placeable.PlacementScope, C11921v> function1) {
        C12775o.m28639i(map, "alignmentLines");
        C12775o.m28639i(function1, "placementBlock");
        return new MeasureScope$layout$1(i, i2, map, this, function1);
    }
}
