package androidx.compose.p002ui.graphics.painter;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.FilterQuality;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.graphics.painter.BitmapPainter */
/* compiled from: BitmapPainter.kt */
public final class BitmapPainter extends Painter {
    private float alpha;
    private ColorFilter colorFilter;
    private int filterQuality;
    private final ImageBitmap image;
    private final long size;
    private final long srcOffset;
    private final long srcSize;

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, j, j2);
    }

    /* renamed from: validateSize-N5eqBDc  reason: not valid java name */
    private final long m36358validateSizeN5eqBDc(long j, long j2) {
        boolean z;
        if (IntOffset.m38586getXimpl(j) < 0 || IntOffset.m38587getYimpl(j) < 0 || IntSize.m38628getWidthimpl(j2) < 0 || IntSize.m38627getHeightimpl(j2) < 0 || IntSize.m38628getWidthimpl(j2) > this.image.getWidth() || IntSize.m38627getHeightimpl(j2) > this.image.getHeight()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return j2;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* access modifiers changed from: protected */
    public boolean applyAlpha(float f) {
        this.alpha = f;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean applyColorFilter(ColorFilter colorFilter2) {
        this.colorFilter = colorFilter2;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        if (C12775o.m28634d(this.image, bitmapPainter.image) && IntOffset.m38585equalsimpl0(this.srcOffset, bitmapPainter.srcOffset) && IntSize.m38626equalsimpl0(this.srcSize, bitmapPainter.srcSize) && FilterQuality.m35761equalsimpl0(this.filterQuality, bitmapPainter.filterQuality)) {
            return true;
        }
        return false;
    }

    /* renamed from: getFilterQuality-f-v9h1I$ui_graphics_release  reason: not valid java name */
    public final int m36359getFilterQualityfv9h1I$ui_graphics_release() {
        return this.filterQuality;
    }

    /* renamed from: getIntrinsicSize-NH-jbRc  reason: not valid java name */
    public long m36360getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m38638toSizeozmzZPI(this.size);
    }

    public int hashCode() {
        return (((((this.image.hashCode() * 31) + IntOffset.m38588hashCodeimpl(this.srcOffset)) * 31) + IntSize.m38629hashCodeimpl(this.srcSize)) * 31) + FilterQuality.m35762hashCodeimpl(this.filterQuality);
    }

    /* access modifiers changed from: protected */
    public void onDraw(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "<this>");
        DrawScope.m36239drawImageAZ2fEMs$default(drawScope, this.image, this.srcOffset, this.srcSize, 0, IntSizeKt.IntSize(C13265c.m30134c(Size.m35491getWidthimpl(drawScope.m36274getSizeNHjbRc())), C13265c.m30134c(Size.m35488getHeightimpl(drawScope.m36274getSizeNHjbRc()))), this.alpha, (DrawStyle) null, this.colorFilter, 0, this.filterQuality, 328, (Object) null);
    }

    /* renamed from: setFilterQuality-vDHp3xo$ui_graphics_release  reason: not valid java name */
    public final void m36361setFilterQualityvDHp3xo$ui_graphics_release(int i) {
        this.filterQuality = i;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + IntOffset.m38593toStringimpl(this.srcOffset) + ", srcSize=" + IntSize.m38631toStringimpl(this.srcSize) + ", filterQuality=" + FilterQuality.m35763toStringimpl(this.filterQuality) + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, (i & 2) != 0 ? IntOffset.Companion.m38596getZeronOccac() : j, (i & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j2, (DefaultConstructorMarker) null);
    }

    private BitmapPainter(ImageBitmap imageBitmap, long j, long j2) {
        this.image = imageBitmap;
        this.srcOffset = j;
        this.srcSize = j2;
        this.filterQuality = FilterQuality.Companion.m35766getLowfv9h1I();
        this.size = m36358validateSizeN5eqBDc(j, j2);
        this.alpha = 1.0f;
    }
}
