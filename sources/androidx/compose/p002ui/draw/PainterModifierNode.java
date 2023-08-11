package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.painter.Painter;
import androidx.compose.p002ui.layout.ContentScale;
import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.layout.ScaleFactorKt;
import androidx.compose.p002ui.node.DrawModifierNode;
import androidx.compose.p002ui.node.LayoutModifierNode;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSizeKt;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterModifierNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,366:1\n152#2:367\n120#3,4:368\n*S KotlinDebug\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterModifierNode\n*L\n170#1:367\n345#1:368,4\n*E\n"})
/* renamed from: androidx.compose.ui.draw.PainterModifierNode */
/* compiled from: PainterModifier.kt */
final class PainterModifierNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PainterModifierNode(Painter painter2, boolean z, Alignment alignment2, ContentScale contentScale2, float f, ColorFilter colorFilter2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter2, z, (i & 4) != 0 ? Alignment.Companion.getCenter() : alignment2, (i & 8) != 0 ? ContentScale.Companion.getInside() : contentScale2, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? null : colorFilter2);
    }

    /* renamed from: calculateScaledSize-E7KxVPU  reason: not valid java name */
    private final long m35331calculateScaledSizeE7KxVPU(long j) {
        float f;
        float f2;
        boolean z;
        if (!getUseIntrinsicSize()) {
            return j;
        }
        if (!m35333hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.m36369getIntrinsicSizeNHjbRc())) {
            f = Size.m35491getWidthimpl(j);
        } else {
            f = Size.m35491getWidthimpl(this.painter.m36369getIntrinsicSizeNHjbRc());
        }
        if (!m35332hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.m36369getIntrinsicSizeNHjbRc())) {
            f2 = Size.m35488getHeightimpl(j);
        } else {
            f2 = Size.m35488getHeightimpl(this.painter.m36369getIntrinsicSizeNHjbRc());
        }
        long Size = SizeKt.Size(f, f2);
        boolean z2 = true;
        if (Size.m35491getWidthimpl(j) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (Size.m35488getHeightimpl(j) != 0.0f) {
                z2 = false;
            }
            if (!z2) {
                return ScaleFactorKt.m37440timesUQTWf7w(Size, this.contentScale.m37308computeScaleFactorH7hwNQA(Size, j));
            }
        }
        return Size.Companion.m35500getZeroNHjbRc();
    }

    private final boolean getUseIntrinsicSize() {
        boolean z;
        if (!this.sizeToIntrinsics) {
            return false;
        }
        if (this.painter.m36369getIntrinsicSizeNHjbRc() != Size.Companion.m35499getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk  reason: not valid java name */
    private final boolean m35332hasSpecifiedAndFiniteHeightuvyYCjk(long j) {
        boolean z;
        if (Size.m35487equalsimpl0(j, Size.Companion.m35499getUnspecifiedNHjbRc())) {
            return false;
        }
        float r3 = Size.m35488getHeightimpl(j);
        if (Float.isInfinite(r3) || Float.isNaN(r3)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk  reason: not valid java name */
    private final boolean m35333hasSpecifiedAndFiniteWidthuvyYCjk(long j) {
        boolean z;
        if (Size.m35487equalsimpl0(j, Size.Companion.m35499getUnspecifiedNHjbRc())) {
            return false;
        }
        float r3 = Size.m35491getWidthimpl(j);
        if (Float.isInfinite(r3) || Float.isNaN(r3)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: modifyConstraints-ZezNO4M  reason: not valid java name */
    private final long m35334modifyConstraintsZezNO4M(long j) {
        boolean z;
        int i;
        int i2;
        boolean z2 = true;
        if (!Constraints.m38408getHasBoundedWidthimpl(j) || !Constraints.m38407getHasBoundedHeightimpl(j)) {
            z = false;
        } else {
            z = true;
        }
        if (!Constraints.m38410getHasFixedWidthimpl(j) || !Constraints.m38409getHasFixedHeightimpl(j)) {
            z2 = false;
        }
        if ((getUseIntrinsicSize() || !z) && !z2) {
            long r0 = this.painter.m36369getIntrinsicSizeNHjbRc();
            if (m35333hasSpecifiedAndFiniteWidthuvyYCjk(r0)) {
                i = C13265c.m30134c(Size.m35491getWidthimpl(r0));
            } else {
                i = Constraints.m38414getMinWidthimpl(j);
            }
            if (m35332hasSpecifiedAndFiniteHeightuvyYCjk(r0)) {
                i2 = C13265c.m30134c(Size.m35488getHeightimpl(r0));
            } else {
                i2 = Constraints.m38413getMinHeightimpl(j);
            }
            long r02 = m35331calculateScaledSizeE7KxVPU(SizeKt.Size((float) ConstraintsKt.m38426constrainWidthK40F9xA(j, i), (float) ConstraintsKt.m38425constrainHeightK40F9xA(j, i2)));
            return Constraints.m38403copyZbe2FdA$default(j, ConstraintsKt.m38426constrainWidthK40F9xA(j, C13265c.m30134c(Size.m35491getWidthimpl(r02))), 0, ConstraintsKt.m38425constrainHeightK40F9xA(j, C13265c.m30134c(Size.m35488getHeightimpl(r02))), 0, 10, (Object) null);
        }
        return Constraints.m38403copyZbe2FdA$default(j, Constraints.m38412getMaxWidthimpl(j), 0, Constraints.m38411getMaxHeightimpl(j), 0, 10, (Object) null);
    }

    public void draw(ContentDrawScope contentDrawScope) {
        float f;
        float f2;
        boolean z;
        long j;
        C12775o.m28639i(contentDrawScope, "<this>");
        long r0 = this.painter.m36369getIntrinsicSizeNHjbRc();
        if (m35333hasSpecifiedAndFiniteWidthuvyYCjk(r0)) {
            f = Size.m35491getWidthimpl(r0);
        } else {
            f = Size.m35491getWidthimpl(contentDrawScope.m36274getSizeNHjbRc());
        }
        if (m35332hasSpecifiedAndFiniteHeightuvyYCjk(r0)) {
            f2 = Size.m35488getHeightimpl(r0);
        } else {
            f2 = Size.m35488getHeightimpl(contentDrawScope.m36274getSizeNHjbRc());
        }
        long Size = SizeKt.Size(f, f2);
        boolean z2 = true;
        if (Size.m35491getWidthimpl(contentDrawScope.m36274getSizeNHjbRc()) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (Size.m35488getHeightimpl(contentDrawScope.m36274getSizeNHjbRc()) != 0.0f) {
                z2 = false;
            }
            if (!z2) {
                j = ScaleFactorKt.m37440timesUQTWf7w(Size, this.contentScale.m37308computeScaleFactorH7hwNQA(Size, contentDrawScope.m36274getSizeNHjbRc()));
                long j2 = j;
                long r02 = this.alignment.m35310alignKFBX0sM(IntSizeKt.IntSize(C13265c.m30134c(Size.m35491getWidthimpl(j2)), C13265c.m30134c(Size.m35488getHeightimpl(j2))), IntSizeKt.IntSize(C13265c.m30134c(Size.m35491getWidthimpl(contentDrawScope.m36274getSizeNHjbRc())), C13265c.m30134c(Size.m35488getHeightimpl(contentDrawScope.m36274getSizeNHjbRc()))), contentDrawScope.getLayoutDirection());
                float r8 = (float) IntOffset.m38586getXimpl(r02);
                float r03 = (float) IntOffset.m38587getYimpl(r02);
                contentDrawScope.getDrawContext().getTransform().translate(r8, r03);
                this.painter.m36368drawx_KDEd0(contentDrawScope, j2, this.alpha, this.colorFilter);
                contentDrawScope.getDrawContext().getTransform().translate(-r8, -r03);
                contentDrawScope.drawContent();
            }
        }
        j = Size.Companion.m35500getZeroNHjbRc();
        long j22 = j;
        long r022 = this.alignment.m35310alignKFBX0sM(IntSizeKt.IntSize(C13265c.m30134c(Size.m35491getWidthimpl(j22)), C13265c.m30134c(Size.m35488getHeightimpl(j22))), IntSizeKt.IntSize(C13265c.m30134c(Size.m35491getWidthimpl(contentDrawScope.m36274getSizeNHjbRc())), C13265c.m30134c(Size.m35488getHeightimpl(contentDrawScope.m36274getSizeNHjbRc()))), contentDrawScope.getLayoutDirection());
        float r82 = (float) IntOffset.m38586getXimpl(r022);
        float r032 = (float) IntOffset.m38587getYimpl(r022);
        contentDrawScope.getDrawContext().getTransform().translate(r82, r032);
        this.painter.m36368drawx_KDEd0(contentDrawScope, j22, this.alpha, this.colorFilter);
        contentDrawScope.getDrawContext().getTransform().translate(-r82, -r032);
        contentDrawScope.drawContent();
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }
        long r0 = m35334modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, (Object) null));
        return Math.max(Constraints.m38413getMinHeightimpl(r0), intrinsicMeasurable.maxIntrinsicHeight(i));
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicWidth(i);
        }
        long r0 = m35334modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, (Object) null));
        return Math.max(Constraints.m38414getMinWidthimpl(r0), intrinsicMeasurable.maxIntrinsicWidth(i));
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m35335measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        Placeable r9 = measurable.m37365measureBRTryo0(m35334modifyConstraintsZezNO4M(j));
        return MeasureScope.layout$default(measureScope, r9.getWidth(), r9.getHeight(), (Map) null, new PainterModifierNode$measure$1(r9), 4, (Object) null);
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        long r0 = m35334modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, (Object) null));
        return Math.max(Constraints.m38413getMinHeightimpl(r0), intrinsicMeasurable.minIntrinsicHeight(i));
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        long r0 = m35334modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, (Object) null));
        return Math.max(Constraints.m38414getMinWidthimpl(r0), intrinsicMeasurable.minIntrinsicWidth(i));
    }

    public final void setAlignment(Alignment alignment2) {
        C12775o.m28639i(alignment2, "<set-?>");
        this.alignment = alignment2;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setColorFilter(ColorFilter colorFilter2) {
        this.colorFilter = colorFilter2;
    }

    public final void setContentScale(ContentScale contentScale2) {
        C12775o.m28639i(contentScale2, "<set-?>");
        this.contentScale = contentScale2;
    }

    public final void setPainter(Painter painter2) {
        C12775o.m28639i(painter2, "<set-?>");
        this.painter = painter2;
    }

    public final void setSizeToIntrinsics(boolean z) {
        this.sizeToIntrinsics = z;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public PainterModifierNode(Painter painter2, boolean z, Alignment alignment2, ContentScale contentScale2, float f, ColorFilter colorFilter2) {
        C12775o.m28639i(painter2, "painter");
        C12775o.m28639i(alignment2, "alignment");
        C12775o.m28639i(contentScale2, "contentScale");
        this.painter = painter2;
        this.sizeToIntrinsics = z;
        this.alignment = alignment2;
        this.contentScale = contentScale2;
        this.alpha = f;
        this.colorFilter = colorFilter2;
    }
}
