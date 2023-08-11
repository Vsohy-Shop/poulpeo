package androidx.compose.p002ui.graphics.painter;

import androidx.compose.p002ui.graphics.FilterQuality;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSizeKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.graphics.painter.BitmapPainterKt */
/* compiled from: BitmapPainter.kt */
public final class BitmapPainterKt {
    /* renamed from: BitmapPainter-QZhYCtY  reason: not valid java name */
    public static final BitmapPainter m36362BitmapPainterQZhYCtY(ImageBitmap imageBitmap, long j, long j2, int i) {
        C12775o.m28639i(imageBitmap, "image");
        BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, j, j2, (DefaultConstructorMarker) null);
        bitmapPainter.m36361setFilterQualityvDHp3xo$ui_graphics_release(i);
        return bitmapPainter;
    }

    /* renamed from: BitmapPainter-QZhYCtY$default  reason: not valid java name */
    public static /* synthetic */ BitmapPainter m36363BitmapPainterQZhYCtY$default(ImageBitmap imageBitmap, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = IntOffset.Companion.m38596getZeronOccac();
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            i = FilterQuality.Companion.m35766getLowfv9h1I();
        }
        return m36362BitmapPainterQZhYCtY(imageBitmap, j3, j4, i);
    }
}
