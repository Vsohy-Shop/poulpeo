package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.node.NodeCoordinator;
import androidx.compose.p002ui.unit.IntSize;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.layout.LayoutCoordinatesKt */
/* compiled from: LayoutCoordinates.kt */
public final class LayoutCoordinatesKt {
    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect localBoundingBoxOf$default;
        C12775o.m28639i(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || (localBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, (Object) null)) == null) {
            return new Rect(0.0f, 0.0f, (float) IntSize.m38628getWidthimpl(layoutCoordinates.m37341getSizeYbymL2g()), (float) IntSize.m38627getHeightimpl(layoutCoordinates.m37341getSizeYbymL2g()));
        }
        return localBoundingBoxOf$default;
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "<this>");
        return LayoutCoordinates.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, (Object) null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates) {
        boolean z;
        boolean z2;
        C12775o.m28639i(layoutCoordinates, "<this>");
        LayoutCoordinates findRootCoordinates = findRootCoordinates(layoutCoordinates);
        Rect boundsInRoot = boundsInRoot(layoutCoordinates);
        float r2 = (float) IntSize.m38628getWidthimpl(findRootCoordinates.m37341getSizeYbymL2g());
        float r3 = (float) IntSize.m38627getHeightimpl(findRootCoordinates.m37341getSizeYbymL2g());
        float l = C13537l.m30885l(boundsInRoot.getLeft(), 0.0f, r2);
        float l2 = C13537l.m30885l(boundsInRoot.getTop(), 0.0f, r3);
        float l3 = C13537l.m30885l(boundsInRoot.getRight(), 0.0f, r2);
        float l4 = C13537l.m30885l(boundsInRoot.getBottom(), 0.0f, r3);
        if (l == l3) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (l2 == l4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                long r8 = findRootCoordinates.m37344localToWindowMKHz9U(OffsetKt.Offset(l, l2));
                long r10 = findRootCoordinates.m37344localToWindowMKHz9U(OffsetKt.Offset(l3, l2));
                long r22 = findRootCoordinates.m37344localToWindowMKHz9U(OffsetKt.Offset(l3, l4));
                long r0 = findRootCoordinates.m37344localToWindowMKHz9U(OffsetKt.Offset(l, l4));
                return new Rect(C12021c.m26110g(Offset.m35422getXimpl(r8), Offset.m35422getXimpl(r10), Offset.m35422getXimpl(r0), Offset.m35422getXimpl(r22)), C12021c.m26110g(Offset.m35423getYimpl(r8), Offset.m35423getYimpl(r10), Offset.m35423getYimpl(r0), Offset.m35423getYimpl(r22)), C12021c.m26109f(Offset.m35422getXimpl(r8), Offset.m35422getXimpl(r10), Offset.m35422getXimpl(r0), Offset.m35422getXimpl(r22)), C12021c.m26109f(Offset.m35423getYimpl(r8), Offset.m35423getYimpl(r10), Offset.m35423getYimpl(r0), Offset.m35423getYimpl(r22)));
            }
        }
        return Rect.Companion.getZero();
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        NodeCoordinator nodeCoordinator;
        C12775o.m28639i(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        if (layoutCoordinates2 instanceof NodeCoordinator) {
            nodeCoordinator = (NodeCoordinator) layoutCoordinates2;
        } else {
            nodeCoordinator = null;
        }
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy$ui_release;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release();
        }
    }

    public static final long positionInParent(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            return parentLayoutCoordinates.m37342localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m35438getZeroF1C5BW0());
        }
        return Offset.Companion.m35438getZeroF1C5BW0();
    }

    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "<this>");
        return layoutCoordinates.m37343localToRootMKHz9U(Offset.Companion.m35438getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "<this>");
        return layoutCoordinates.m37344localToWindowMKHz9U(Offset.Companion.m35438getZeroF1C5BW0());
    }
}
