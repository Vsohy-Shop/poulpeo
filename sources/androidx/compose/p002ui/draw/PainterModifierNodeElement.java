package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.painter.Painter;
import androidx.compose.p002ui.layout.ContentScale;
import androidx.compose.p002ui.node.DrawModifierNodeKt;
import androidx.compose.p002ui.node.LayoutModifierNodeKt;
import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.internal.C12775o;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.draw.PainterModifierNodeElement */
/* compiled from: PainterModifier.kt */
final class PainterModifierNodeElement extends ModifierNodeElement<PainterModifierNode> {
    private final Alignment alignment;
    private final float alpha;
    private final ColorFilter colorFilter;
    private final ContentScale contentScale;
    private final Painter painter;
    private final boolean sizeToIntrinsics;

    public PainterModifierNodeElement(Painter painter2, boolean z, Alignment alignment2, ContentScale contentScale2, float f, ColorFilter colorFilter2) {
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

    public static /* synthetic */ PainterModifierNodeElement copy$default(PainterModifierNodeElement painterModifierNodeElement, Painter painter2, boolean z, Alignment alignment2, ContentScale contentScale2, float f, ColorFilter colorFilter2, int i, Object obj) {
        if ((i & 1) != 0) {
            painter2 = painterModifierNodeElement.painter;
        }
        if ((i & 2) != 0) {
            z = painterModifierNodeElement.sizeToIntrinsics;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            alignment2 = painterModifierNodeElement.alignment;
        }
        Alignment alignment3 = alignment2;
        if ((i & 8) != 0) {
            contentScale2 = painterModifierNodeElement.contentScale;
        }
        ContentScale contentScale3 = contentScale2;
        if ((i & 16) != 0) {
            f = painterModifierNodeElement.alpha;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            colorFilter2 = painterModifierNodeElement.colorFilter;
        }
        return painterModifierNodeElement.copy(painter2, z2, alignment3, contentScale3, f2, colorFilter2);
    }

    public final Painter component1() {
        return this.painter;
    }

    public final boolean component2() {
        return this.sizeToIntrinsics;
    }

    public final Alignment component3() {
        return this.alignment;
    }

    public final ContentScale component4() {
        return this.contentScale;
    }

    public final float component5() {
        return this.alpha;
    }

    public final ColorFilter component6() {
        return this.colorFilter;
    }

    public final PainterModifierNodeElement copy(Painter painter2, boolean z, Alignment alignment2, ContentScale contentScale2, float f, ColorFilter colorFilter2) {
        C12775o.m28639i(painter2, "painter");
        C12775o.m28639i(alignment2, "alignment");
        C12775o.m28639i(contentScale2, "contentScale");
        return new PainterModifierNodeElement(painter2, z, alignment2, contentScale2, f, colorFilter2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterModifierNodeElement)) {
            return false;
        }
        PainterModifierNodeElement painterModifierNodeElement = (PainterModifierNodeElement) obj;
        if (C12775o.m28634d(this.painter, painterModifierNodeElement.painter) && this.sizeToIntrinsics == painterModifierNodeElement.sizeToIntrinsics && C12775o.m28634d(this.alignment, painterModifierNodeElement.alignment) && C12775o.m28634d(this.contentScale, painterModifierNodeElement.contentScale) && Float.compare(this.alpha, painterModifierNodeElement.alpha) == 0 && C12775o.m28634d(this.colorFilter, painterModifierNodeElement.colorFilter)) {
            return true;
        }
        return false;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public boolean getAutoInvalidate() {
        return false;
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

    public int hashCode() {
        int i;
        int hashCode = this.painter.hashCode() * 31;
        boolean z = this.sizeToIntrinsics;
        if (z) {
            z = true;
        }
        int hashCode2 = (((((((hashCode + (z ? 1 : 0)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        ColorFilter colorFilter2 = this.colorFilter;
        if (colorFilter2 == null) {
            i = 0;
        } else {
            i = colorFilter2.hashCode();
        }
        return hashCode2 + i;
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "<this>");
        inspectorInfo.setName("paint");
        inspectorInfo.getProperties().set("painter", this.painter);
        inspectorInfo.getProperties().set("sizeToIntrinsics", Boolean.valueOf(this.sizeToIntrinsics));
        inspectorInfo.getProperties().set("alignment", this.alignment);
        inspectorInfo.getProperties().set("contentScale", this.contentScale);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("colorFilter", this.colorFilter);
    }

    public String toString() {
        return "PainterModifierNodeElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public PainterModifierNode create() {
        return new PainterModifierNode(this.painter, this.sizeToIntrinsics, this.alignment, this.contentScale, this.alpha, this.colorFilter);
    }

    public PainterModifierNode update(PainterModifierNode painterModifierNode) {
        C12775o.m28639i(painterModifierNode, "node");
        boolean sizeToIntrinsics2 = painterModifierNode.getSizeToIntrinsics();
        boolean z = this.sizeToIntrinsics;
        boolean z2 = sizeToIntrinsics2 != z || (z && !Size.m35487equalsimpl0(painterModifierNode.getPainter().m36369getIntrinsicSizeNHjbRc(), this.painter.m36369getIntrinsicSizeNHjbRc()));
        painterModifierNode.setPainter(this.painter);
        painterModifierNode.setSizeToIntrinsics(this.sizeToIntrinsics);
        painterModifierNode.setAlignment(this.alignment);
        painterModifierNode.setContentScale(this.contentScale);
        painterModifierNode.setAlpha(this.alpha);
        painterModifierNode.setColorFilter(this.colorFilter);
        if (z2) {
            LayoutModifierNodeKt.invalidateMeasurements(painterModifierNode);
        }
        DrawModifierNodeKt.invalidateDraw(painterModifierNode);
        return painterModifierNode;
    }
}
