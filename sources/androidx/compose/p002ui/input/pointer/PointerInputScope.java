package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.input.pointer.PointerInputScope */
/* compiled from: SuspendingPointerInputFilter.kt */
public interface PointerInputScope extends Density {

    /* renamed from: androidx.compose.ui.input.pointer.PointerInputScope$DefaultImpls */
    /* compiled from: SuspendingPointerInputFilter.kt */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
        public static long m37206getExtendedTouchPaddingNHjbRc(PointerInputScope pointerInputScope) {
            return PointerInputScope.super.m37204getExtendedTouchPaddingNHjbRc();
        }

        @Deprecated
        public static boolean getInterceptOutOfBoundsChildEvents(PointerInputScope pointerInputScope) {
            return PointerInputScope.super.getInterceptOutOfBoundsChildEvents();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m37207roundToPxR2X_6o(PointerInputScope pointerInputScope, long j) {
            return PointerInputScope.super.m38442roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m37208roundToPx0680j_4(PointerInputScope pointerInputScope, float f) {
            return PointerInputScope.super.m38443roundToPx0680j_4(f);
        }

        @Deprecated
        public static void setInterceptOutOfBoundsChildEvents(PointerInputScope pointerInputScope, boolean z) {
            PointerInputScope.super.setInterceptOutOfBoundsChildEvents(z);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m37209toDpGaN1DYA(PointerInputScope pointerInputScope, long j) {
            return PointerInputScope.super.m38444toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m37210toDpu2uoSUM(PointerInputScope pointerInputScope, float f) {
            return PointerInputScope.super.m38445toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m37212toDpSizekrfVVM(PointerInputScope pointerInputScope, long j) {
            return PointerInputScope.super.m38447toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m37213toPxR2X_6o(PointerInputScope pointerInputScope, long j) {
            return PointerInputScope.super.m38448toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m37214toPx0680j_4(PointerInputScope pointerInputScope, float f) {
            return PointerInputScope.super.m38449toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        public static Rect toRect(PointerInputScope pointerInputScope, DpRect dpRect) {
            C12775o.m28639i(dpRect, "$receiver");
            return PointerInputScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m37215toSizeXkaWNTQ(PointerInputScope pointerInputScope, long j) {
            return PointerInputScope.super.m38450toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m37216toSp0xMU5do(PointerInputScope pointerInputScope, float f) {
            return PointerInputScope.super.m38451toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m37217toSpkPz2Gy4(PointerInputScope pointerInputScope, float f) {
            return PointerInputScope.super.m38452toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m37211toDpu2uoSUM(PointerInputScope pointerInputScope, int i) {
            return PointerInputScope.super.m38446toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m37218toSpkPz2Gy4(PointerInputScope pointerInputScope, int i) {
            return PointerInputScope.super.m38453toSpkPz2Gy4(i);
        }

        public static /* synthetic */ void getInterceptOutOfBoundsChildEvents$annotations() {
        }
    }

    <R> Object awaitPointerEventScope(C13088o<? super AwaitPointerEventScope, ? super C12074d<? super R>, ? extends Object> oVar, C12074d<? super R> dVar);

    /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
    long m37204getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m35500getZeroNHjbRc();
    }

    boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    long m37205getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    void setInterceptOutOfBoundsChildEvents(boolean z) {
    }
}
