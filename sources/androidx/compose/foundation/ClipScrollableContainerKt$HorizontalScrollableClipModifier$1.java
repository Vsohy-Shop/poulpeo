package androidx.compose.foundation;

import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.Outline;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt$HorizontalScrollableClipModifier$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
/* compiled from: ClipScrollableContainer.kt */
public final class ClipScrollableContainerKt$HorizontalScrollableClipModifier$1 implements Shape {
    ClipScrollableContainerKt$HorizontalScrollableClipModifier$1() {
    }

    /* renamed from: createOutline-Pq9zytI  reason: not valid java name */
    public Outline m32999createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        C12775o.m28639i(layoutDirection, "layoutDirection");
        C12775o.m28639i(density, "density");
        float r6 = (float) density.m38443roundToPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
        return new Outline.Rectangle(new Rect(0.0f, -r6, Size.m35491getWidthimpl(j), Size.m35488getHeightimpl(j) + r6));
    }
}
