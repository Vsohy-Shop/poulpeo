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

/* renamed from: androidx.compose.ui.input.pointer.AwaitPointerEventScope */
/* compiled from: SuspendingPointerInputFilter.kt */
public interface AwaitPointerEventScope extends Density {

    /* renamed from: androidx.compose.ui.input.pointer.AwaitPointerEventScope$DefaultImpls */
    /* compiled from: SuspendingPointerInputFilter.kt */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
        public static long m37086getExtendedTouchPaddingNHjbRc(AwaitPointerEventScope awaitPointerEventScope) {
            return AwaitPointerEventScope.super.m37084getExtendedTouchPaddingNHjbRc();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m37087roundToPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.m38442roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m37088roundToPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.m38443roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m37089toDpGaN1DYA(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.m38444toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m37090toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.m38445toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m37092toDpSizekrfVVM(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.m38447toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m37093toPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.m38448toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m37094toPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.m38449toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        public static Rect toRect(AwaitPointerEventScope awaitPointerEventScope, DpRect dpRect) {
            C12775o.m28639i(dpRect, "$receiver");
            return AwaitPointerEventScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m37095toSizeXkaWNTQ(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.m38450toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m37096toSp0xMU5do(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.m38451toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m37097toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.m38452toSpkPz2Gy4(f);
        }

        @Deprecated
        public static <T> Object withTimeout(AwaitPointerEventScope awaitPointerEventScope, long j, C13088o<? super AwaitPointerEventScope, ? super C12074d<? super T>, ? extends Object> oVar, C12074d<? super T> dVar) {
            return AwaitPointerEventScope.super.withTimeout(j, oVar, dVar);
        }

        @Deprecated
        public static <T> Object withTimeoutOrNull(AwaitPointerEventScope awaitPointerEventScope, long j, C13088o<? super AwaitPointerEventScope, ? super C12074d<? super T>, ? extends Object> oVar, C12074d<? super T> dVar) {
            return AwaitPointerEventScope.super.withTimeoutOrNull(j, oVar, dVar);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m37091toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, int i) {
            return AwaitPointerEventScope.super.m38446toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m37098toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, int i) {
            return AwaitPointerEventScope.super.m38453toSpkPz2Gy4(i);
        }
    }

    static /* synthetic */ Object awaitPointerEvent$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, C12074d dVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                pointerEventPass = PointerEventPass.Main;
            }
            return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
    }

    Object awaitPointerEvent(PointerEventPass pointerEventPass, C12074d<? super PointerEvent> dVar);

    PointerEvent getCurrentEvent();

    /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
    long m37084getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m35500getZeroNHjbRc();
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    long m37085getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    <T> Object withTimeout(long j, C13088o<? super AwaitPointerEventScope, ? super C12074d<? super T>, ? extends Object> oVar, C12074d<? super T> dVar) {
        return oVar.invoke(this, dVar);
    }

    <T> Object withTimeoutOrNull(long j, C13088o<? super AwaitPointerEventScope, ? super C12074d<? super T>, ? extends Object> oVar, C12074d<? super T> dVar) {
        return oVar.invoke(this, dVar);
    }
}
