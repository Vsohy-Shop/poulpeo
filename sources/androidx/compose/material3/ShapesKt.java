package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.p002ui.graphics.RectangleShapeKt;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;

/* compiled from: Shapes.kt */
public final class ShapesKt {
    private static final ProvidableCompositionLocal<Shapes> LocalShapes = CompositionLocalKt.staticCompositionLocalOf(ShapesKt$LocalShapes$1.INSTANCE);

    /* compiled from: Shapes.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShapeKeyTokens.values().length];
            iArr[ShapeKeyTokens.CornerExtraLarge.ordinal()] = 1;
            iArr[ShapeKeyTokens.CornerExtraLargeTop.ordinal()] = 2;
            iArr[ShapeKeyTokens.CornerExtraSmall.ordinal()] = 3;
            iArr[ShapeKeyTokens.CornerExtraSmallTop.ordinal()] = 4;
            iArr[ShapeKeyTokens.CornerFull.ordinal()] = 5;
            iArr[ShapeKeyTokens.CornerLarge.ordinal()] = 6;
            iArr[ShapeKeyTokens.CornerLargeEnd.ordinal()] = 7;
            iArr[ShapeKeyTokens.CornerLargeTop.ordinal()] = 8;
            iArr[ShapeKeyTokens.CornerMedium.ordinal()] = 9;
            iArr[ShapeKeyTokens.CornerNone.ordinal()] = 10;
            iArr[ShapeKeyTokens.CornerSmall.ordinal()] = 11;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final CornerBasedShape end(CornerBasedShape cornerBasedShape) {
        C12775o.m28639i(cornerBasedShape, "<this>");
        float f = (float) 0.0d;
        return CornerBasedShape.copy$default(cornerBasedShape, CornerSizeKt.m33611CornerSize0680j_4(C1232Dp.m38468constructorimpl(f)), (CornerSize) null, (CornerSize) null, CornerSizeKt.m33611CornerSize0680j_4(C1232Dp.m38468constructorimpl(f)), 6, (Object) null);
    }

    public static final Shape fromToken(Shapes shapes, ShapeKeyTokens shapeKeyTokens) {
        C12775o.m28639i(shapes, "<this>");
        C12775o.m28639i(shapeKeyTokens, "value");
        switch (WhenMappings.$EnumSwitchMapping$0[shapeKeyTokens.ordinal()]) {
            case 1:
                return shapes.getExtraLarge();
            case 2:
                return top(shapes.getExtraLarge());
            case 3:
                return shapes.getExtraSmall();
            case 4:
                return top(shapes.getExtraSmall());
            case 5:
                return RoundedCornerShapeKt.getCircleShape();
            case 6:
                return shapes.getLarge();
            case 7:
                return end(shapes.getLarge());
            case 8:
                return top(shapes.getLarge());
            case 9:
                return shapes.getMedium();
            case 10:
                return RectangleShapeKt.getRectangleShape();
            case 11:
                return shapes.getSmall();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ProvidableCompositionLocal<Shapes> getLocalShapes() {
        return LocalShapes;
    }

    @Composable
    public static final Shape toShape(ShapeKeyTokens shapeKeyTokens, Composer composer, int i) {
        C12775o.m28639i(shapeKeyTokens, "<this>");
        composer.startReplaceableGroup(-612531606);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-612531606, i, -1, "androidx.compose.material3.toShape (Shapes.kt:174)");
        }
        Shape fromToken = fromToken(MaterialTheme.INSTANCE.getShapes(composer, 6), shapeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return fromToken;
    }

    public static final CornerBasedShape top(CornerBasedShape cornerBasedShape) {
        C12775o.m28639i(cornerBasedShape, "<this>");
        float f = (float) 0.0d;
        return CornerBasedShape.copy$default(cornerBasedShape, (CornerSize) null, (CornerSize) null, CornerSizeKt.m33611CornerSize0680j_4(C1232Dp.m38468constructorimpl(f)), CornerSizeKt.m33611CornerSize0680j_4(C1232Dp.m38468constructorimpl(f)), 3, (Object) null);
    }
}
