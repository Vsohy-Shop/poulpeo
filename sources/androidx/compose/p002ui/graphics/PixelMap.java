package androidx.compose.p002ui.graphics;

import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.PixelMap */
/* compiled from: PixelMap.kt */
public final class PixelMap {
    private final int[] buffer;
    private final int bufferOffset;
    private final int height;
    private final int stride;
    private final int width;

    public PixelMap(int[] iArr, int i, int i2, int i3, int i4) {
        C12775o.m28639i(iArr, "buffer");
        this.buffer = iArr;
        this.width = i;
        this.height = i2;
        this.bufferOffset = i3;
        this.stride = i4;
    }

    /* renamed from: get-WaAFU9c  reason: not valid java name */
    public final long m35980getWaAFU9c(int i, int i2) {
        return ColorKt.Color(this.buffer[this.bufferOffset + (i2 * this.stride) + i]);
    }

    public final int[] getBuffer() {
        return this.buffer;
    }

    public final int getBufferOffset() {
        return this.bufferOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getStride() {
        return this.stride;
    }

    public final int getWidth() {
        return this.width;
    }
}
