package androidx.compose.foundation;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.LayoutCoordinatesKt;
import androidx.compose.p002ui.layout.OnGloballyPositionedModifier;
import androidx.compose.runtime.collection.MutableVector;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi(29)
@SourceDebugExtension({"SMAP\nSystemGestureExclusion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureModifier\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n1182#2:163\n1161#2,2:164\n138#3:166\n728#3,2:168\n1#4:167\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureModifier\n*L\n117#1:163\n117#1:164,2\n118#1:166\n123#1:168,2\n*E\n"})
/* compiled from: SystemGestureExclusion.kt */
final class ExcludeFromSystemGestureModifier implements OnGloballyPositionedModifier {
    private final Function1<LayoutCoordinates, Rect> exclusion;
    private android.graphics.Rect rect;
    private final View view;

    public ExcludeFromSystemGestureModifier(View view2, Function1<? super LayoutCoordinates, Rect> function1) {
        C12775o.m28639i(view2, "view");
        this.view = view2;
        this.exclusion = function1;
    }

    private final android.graphics.Rect calcBounds(LayoutCoordinates layoutCoordinates, Rect rect2) {
        LayoutCoordinates layoutCoordinates2 = layoutCoordinates;
        LayoutCoordinates findRoot = findRoot(layoutCoordinates);
        long r2 = findRoot.m37342localPositionOfR5De75A(layoutCoordinates2, rect2.m35457getTopLeftF1C5BW0());
        long r4 = findRoot.m37342localPositionOfR5De75A(layoutCoordinates2, rect2.m35458getTopRightF1C5BW0());
        long r6 = findRoot.m37342localPositionOfR5De75A(layoutCoordinates2, rect2.m35450getBottomLeftF1C5BW0());
        long r0 = findRoot.m37342localPositionOfR5De75A(layoutCoordinates2, rect2.m35451getBottomRightF1C5BW0());
        return new android.graphics.Rect(C13265c.m30134c(C12021c.m26110g(Offset.m35422getXimpl(r2), Offset.m35422getXimpl(r4), Offset.m35422getXimpl(r6), Offset.m35422getXimpl(r0))), C13265c.m30134c(C12021c.m26110g(Offset.m35423getYimpl(r2), Offset.m35423getYimpl(r4), Offset.m35423getYimpl(r6), Offset.m35423getYimpl(r0))), C13265c.m30134c(C12021c.m26109f(Offset.m35422getXimpl(r2), Offset.m35422getXimpl(r4), Offset.m35422getXimpl(r6), Offset.m35422getXimpl(r0))), C13265c.m30134c(C12021c.m26109f(Offset.m35423getYimpl(r2), Offset.m35423getYimpl(r4), Offset.m35423getYimpl(r6), Offset.m35423getYimpl(r0))));
    }

    private final LayoutCoordinates findRoot(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates2 = parentLayoutCoordinates;
            LayoutCoordinates layoutCoordinates3 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates2;
            if (layoutCoordinates == null) {
                return layoutCoordinates3;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
    }

    public final Function1<LayoutCoordinates, Rect> getExclusion() {
        return this.exclusion;
    }

    public final android.graphics.Rect getRect() {
        return this.rect;
    }

    public final View getView() {
        return this.view;
    }

    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        android.graphics.Rect rect2;
        C12775o.m28639i(layoutCoordinates, "coordinates");
        Function1<LayoutCoordinates, Rect> function1 = this.exclusion;
        if (function1 == null) {
            Rect boundsInRoot = LayoutCoordinatesKt.boundsInRoot(layoutCoordinates);
            rect2 = new android.graphics.Rect(C13265c.m30134c(boundsInRoot.getLeft()), C13265c.m30134c(boundsInRoot.getTop()), C13265c.m30134c(boundsInRoot.getRight()), C13265c.m30134c(boundsInRoot.getBottom()));
        } else {
            rect2 = calcBounds(layoutCoordinates, function1.invoke(layoutCoordinates));
        }
        replaceRect(rect2);
    }

    public final void removeRect() {
        replaceRect((android.graphics.Rect) null);
    }

    public final void replaceRect(android.graphics.Rect rect2) {
        boolean z = false;
        MutableVector mutableVector = new MutableVector(new android.graphics.Rect[16], 0);
        List a = this.view.getSystemGestureExclusionRects();
        C12775o.m28638h(a, "view.systemGestureExclusionRects");
        mutableVector.addAll(mutableVector.getSize(), a);
        android.graphics.Rect rect3 = this.rect;
        if (rect3 != null) {
            mutableVector.remove(rect3);
        }
        if (rect2 != null && !rect2.isEmpty()) {
            z = true;
        }
        if (z) {
            mutableVector.add(rect2);
        }
        this.view.setSystemGestureExclusionRects(mutableVector.asMutableList());
        this.rect = rect2;
    }

    public final void setRect(android.graphics.Rect rect2) {
        this.rect = rect2;
    }
}
