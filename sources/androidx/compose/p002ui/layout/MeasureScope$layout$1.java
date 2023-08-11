package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p002ui.node.LookaheadCapablePlaceable;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope$layout$1\n+ 2 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n*L\n1#1,61:1\n360#2,15:62\n*S KotlinDebug\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope$layout$1\n*L\n52#1:62,15\n*E\n"})
/* renamed from: androidx.compose.ui.layout.MeasureScope$layout$1 */
/* compiled from: MeasureScope.kt */
public final class MeasureScope$layout$1 implements MeasureResult {
    final /* synthetic */ Function1<Placeable.PlacementScope, C11921v> $placementBlock;
    final /* synthetic */ int $width;
    private final Map<AlignmentLine, Integer> alignmentLines;
    private final int height;
    final /* synthetic */ MeasureScope this$0;
    private final int width;

    MeasureScope$layout$1(int i, int i2, Map<AlignmentLine, Integer> map, MeasureScope measureScope, Function1<? super Placeable.PlacementScope, C11921v> function1) {
        this.$width = i;
        this.this$0 = measureScope;
        this.$placementBlock = function1;
        this.width = i;
        this.height = i2;
        this.alignmentLines = map;
    }

    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.alignmentLines;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void placeChildren() {
        LookaheadCapablePlaceable lookaheadCapablePlaceable;
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
        int i = this.$width;
        LayoutDirection layoutDirection = this.this$0.getLayoutDirection();
        MeasureScope measureScope = this.this$0;
        if (measureScope instanceof LookaheadCapablePlaceable) {
            lookaheadCapablePlaceable = (LookaheadCapablePlaceable) measureScope;
        } else {
            lookaheadCapablePlaceable = null;
        }
        Function1<Placeable.PlacementScope, C11921v> function1 = this.$placementBlock;
        LayoutCoordinates access$get_coordinates$cp = Placeable.PlacementScope._coordinates;
        int access$getParentWidth = companion.getParentWidth();
        LayoutDirection access$getParentLayoutDirection = companion.getParentLayoutDirection();
        LayoutNodeLayoutDelegate access$getLayoutDelegate$cp = Placeable.PlacementScope.layoutDelegate;
        Placeable.PlacementScope.parentWidth = i;
        Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
        boolean access$configureForPlacingForAlignment = companion.configureForPlacingForAlignment(lookaheadCapablePlaceable);
        function1.invoke(companion);
        if (lookaheadCapablePlaceable != null) {
            lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(access$configureForPlacingForAlignment);
        }
        Placeable.PlacementScope.parentWidth = access$getParentWidth;
        Placeable.PlacementScope.parentLayoutDirection = access$getParentLayoutDirection;
        Placeable.PlacementScope._coordinates = access$get_coordinates$cp;
        Placeable.PlacementScope.layoutDelegate = access$getLayoutDelegate$cp;
    }
}
