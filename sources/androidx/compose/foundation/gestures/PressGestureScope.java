package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;

/* compiled from: TapGestureDetector.kt */
public interface PressGestureScope extends Density {

    /* compiled from: TapGestureDetector.kt */
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m33105roundToPxR2X_6o(PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.m38442roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m33106roundToPx0680j_4(PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.m38443roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m33107toDpGaN1DYA(PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.m38444toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m33108toDpu2uoSUM(PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.m38445toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m33110toDpSizekrfVVM(PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.m38447toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m33111toPxR2X_6o(PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.m38448toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m33112toPx0680j_4(PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.m38449toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        public static Rect toRect(PressGestureScope pressGestureScope, DpRect dpRect) {
            C12775o.m28639i(dpRect, "$receiver");
            return PressGestureScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m33113toSizeXkaWNTQ(PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.m38450toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m33114toSp0xMU5do(PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.m38451toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m33115toSpkPz2Gy4(PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.m38452toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m33109toDpu2uoSUM(PressGestureScope pressGestureScope, int i) {
            return PressGestureScope.super.m38446toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m33116toSpkPz2Gy4(PressGestureScope pressGestureScope, int i) {
            return PressGestureScope.super.m38453toSpkPz2Gy4(i);
        }
    }

    Object awaitRelease(C12074d<? super C11921v> dVar);

    Object tryAwaitRelease(C12074d<? super Boolean> dVar);
}
