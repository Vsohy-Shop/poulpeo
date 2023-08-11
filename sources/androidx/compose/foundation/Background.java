package androidx.compose.foundation;

import androidx.compose.p002ui.draw.DrawModifier;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.Outline;
import androidx.compose.p002ui.graphics.OutlineKt;
import androidx.compose.p002ui.graphics.RectangleShapeKt;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/Background\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/* compiled from: Background.kt */
final class Background extends InspectorValueInfo implements DrawModifier {
    private final float alpha;
    private final Brush brush;
    private final Color color;
    private LayoutDirection lastLayoutDirection;
    private Outline lastOutline;
    private Size lastSize;
    private final Shape shape;

    public /* synthetic */ Background(Color color2, Brush brush2, float f, Shape shape2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(color2, brush2, f, shape2, function1);
    }

    private final void drawOutline(ContentDrawScope contentDrawScope) {
        Outline outline;
        if (!Size.m35486equalsimpl(contentDrawScope.m36274getSizeNHjbRc(), this.lastSize) || contentDrawScope.getLayoutDirection() != this.lastLayoutDirection) {
            outline = this.shape.m36025createOutlinePq9zytI(contentDrawScope.m36274getSizeNHjbRc(), contentDrawScope.getLayoutDirection(), contentDrawScope);
        } else {
            outline = this.lastOutline;
            C12775o.m28636f(outline);
        }
        Color color2 = this.color;
        if (color2 != null) {
            color2.m35681unboximpl();
            OutlineKt.m35926drawOutlinewDX37Ww$default(contentDrawScope, outline, this.color.m35681unboximpl(), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 60, (Object) null);
        }
        Brush brush2 = this.brush;
        if (brush2 != null) {
            OutlineKt.m35924drawOutlinehn5TExg$default(contentDrawScope, outline, brush2, this.alpha, (DrawStyle) null, (ColorFilter) null, 0, 56, (Object) null);
        }
        this.lastOutline = outline;
        this.lastSize = Size.m35479boximpl(contentDrawScope.m36274getSizeNHjbRc());
        this.lastLayoutDirection = contentDrawScope.getLayoutDirection();
    }

    private final void drawRect(ContentDrawScope contentDrawScope) {
        Color color2 = this.color;
        if (color2 != null) {
            DrawScope.m36250drawRectnJ9OG0$default(contentDrawScope, color2.m35681unboximpl(), 0, 0, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126, (Object) null);
        }
        Brush brush2 = this.brush;
        if (brush2 != null) {
            DrawScope.m36249drawRectAsUm42w$default(contentDrawScope, brush2, 0, 0, this.alpha, (DrawStyle) null, (ColorFilter) null, 0, 118, (Object) null);
        }
    }

    public void draw(ContentDrawScope contentDrawScope) {
        C12775o.m28639i(contentDrawScope, "<this>");
        if (this.shape == RectangleShapeKt.getRectangleShape()) {
            drawRect(contentDrawScope);
        } else {
            drawOutline(contentDrawScope);
        }
        contentDrawScope.drawContent();
    }

    public boolean equals(Object obj) {
        Background background;
        boolean z;
        if (obj instanceof Background) {
            background = (Background) obj;
        } else {
            background = null;
        }
        if (background == null || !C12775o.m28634d(this.color, background.color) || !C12775o.m28634d(this.brush, background.brush)) {
            return false;
        }
        if (this.alpha == background.alpha) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !C12775o.m28634d(this.shape, background.shape)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        Color color2 = this.color;
        int i2 = 0;
        if (color2 != null) {
            i = Color.m35678hashCodeimpl(color2.m35681unboximpl());
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Brush brush2 = this.brush;
        if (brush2 != null) {
            i2 = brush2.hashCode();
        }
        return ((((i3 + i2) * 31) + Float.hashCode(this.alpha)) * 31) + this.shape.hashCode();
    }

    public String toString() {
        return "Background(color=" + this.color + ", brush=" + this.brush + ", alpha = " + this.alpha + ", shape=" + this.shape + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Background(Color color2, Brush brush2, float f, Shape shape2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : color2, (i & 2) != 0 ? null : brush2, (i & 4) != 0 ? 1.0f : f, shape2, function1, (DefaultConstructorMarker) null);
    }

    private Background(Color color2, Brush brush2, float f, Shape shape2, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        this.color = color2;
        this.brush = brush2;
        this.alpha = f;
        this.shape = shape2;
    }
}
