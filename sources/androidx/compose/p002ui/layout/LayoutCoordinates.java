package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.geometry.Rect;
import java.util.Set;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.layout.LayoutCoordinates */
/* compiled from: LayoutCoordinates.kt */
public interface LayoutCoordinates {

    /* renamed from: androidx.compose.ui.layout.LayoutCoordinates$DefaultImpls */
    /* compiled from: LayoutCoordinates.kt */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: transformFrom-EL8BTi8  reason: not valid java name */
        public static void m37347transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, float[] fArr) {
            C12775o.m28639i(layoutCoordinates2, "sourceCoordinates");
            C12775o.m28639i(fArr, "matrix");
            LayoutCoordinates.super.m37345transformFromEL8BTi8(layoutCoordinates2, fArr);
        }
    }

    static /* synthetic */ Rect localBoundingBoxOf$default(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
    }

    int get(AlignmentLine alignmentLine);

    LayoutCoordinates getParentCoordinates();

    LayoutCoordinates getParentLayoutCoordinates();

    Set<AlignmentLine> getProvidedAlignmentLines();

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    long m37341getSizeYbymL2g();

    boolean isAttached();

    Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z);

    /* renamed from: localPositionOf-R5De75A  reason: not valid java name */
    long m37342localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j);

    /* renamed from: localToRoot-MK-Hz9U  reason: not valid java name */
    long m37343localToRootMKHz9U(long j);

    /* renamed from: localToWindow-MK-Hz9U  reason: not valid java name */
    long m37344localToWindowMKHz9U(long j);

    /* renamed from: transformFrom-EL8BTi8  reason: not valid java name */
    void m37345transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        C12775o.m28639i(layoutCoordinates, "sourceCoordinates");
        C12775o.m28639i(fArr, "matrix");
        throw new UnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    /* renamed from: windowToLocal-MK-Hz9U  reason: not valid java name */
    long m37346windowToLocalMKHz9U(long j);
}
