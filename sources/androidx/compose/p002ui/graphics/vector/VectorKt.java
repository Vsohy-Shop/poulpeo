package androidx.compose.p002ui.graphics.vector;

import androidx.compose.p002ui.graphics.BlendMode;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.PathFillType;
import androidx.compose.p002ui.graphics.StrokeCap;
import androidx.compose.p002ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.graphics.vector.VectorKt */
/* compiled from: Vector.kt */
public final class VectorKt {
    private static final int DefaultFillType = PathFillType.Companion.m35965getNonZeroRgk1Os();
    public static final String DefaultGroupName = "";
    public static final String DefaultPathName = "";
    public static final float DefaultPivotX = 0.0f;
    public static final float DefaultPivotY = 0.0f;
    public static final float DefaultRotation = 0.0f;
    public static final float DefaultScaleX = 1.0f;
    public static final float DefaultScaleY = 1.0f;
    private static final int DefaultStrokeLineCap = StrokeCap.Companion.m36054getButtKaPHkGw();
    private static final int DefaultStrokeLineJoin = StrokeJoin.Companion.m36065getMiterLxFBmk8();
    public static final float DefaultStrokeLineMiter = 4.0f;
    public static final float DefaultStrokeLineWidth = 0.0f;
    private static final int DefaultTintBlendMode = BlendMode.Companion.m35602getSrcIn0nO6VwU();
    private static final long DefaultTintColor = Color.Companion.m35706getTransparent0d7_KjU();
    public static final float DefaultTranslationX = 0.0f;
    public static final float DefaultTranslationY = 0.0f;
    public static final float DefaultTrimPathEnd = 1.0f;
    public static final float DefaultTrimPathOffset = 0.0f;
    public static final float DefaultTrimPathStart = 0.0f;
    private static final List<PathNode> EmptyPath = C12726w.m28524k();

    public static final List<PathNode> PathData(Function1<? super PathBuilder, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        PathBuilder pathBuilder = new PathBuilder();
        function1.invoke(pathBuilder);
        return pathBuilder.getNodes();
    }

    public static final List<PathNode> addPathNodes(String str) {
        if (str == null) {
            return EmptyPath;
        }
        return new PathParser().parsePathString(str).toNodes();
    }

    public static final int getDefaultFillType() {
        return DefaultFillType;
    }

    public static final int getDefaultStrokeLineCap() {
        return DefaultStrokeLineCap;
    }

    public static final int getDefaultStrokeLineJoin() {
        return DefaultStrokeLineJoin;
    }

    public static final int getDefaultTintBlendMode() {
        return DefaultTintBlendMode;
    }

    public static final long getDefaultTintColor() {
        return DefaultTintColor;
    }

    public static final List<PathNode> getEmptyPath() {
        return EmptyPath;
    }
}
