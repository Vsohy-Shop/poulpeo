package androidx.compose.foundation;

import androidx.compose.p002ui.graphics.AndroidPath_androidKt;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.drawscope.CanvasDrawScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,459:1\n1#2:460\n558#3,17:461\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n*L\n207#1:461,17\n*E\n"})
/* compiled from: Border.kt */
final class BorderCache {
    private Path borderPath;
    /* access modifiers changed from: private */
    public Canvas canvas;
    /* access modifiers changed from: private */
    public CanvasDrawScope canvasDrawScope;
    /* access modifiers changed from: private */
    public ImageBitmap imageBitmap;

    public BorderCache() {
        this((ImageBitmap) null, (Canvas) null, (CanvasDrawScope) null, (Path) null, 15, (DefaultConstructorMarker) null);
    }

    private final ImageBitmap component1() {
        return this.imageBitmap;
    }

    private final Canvas component2() {
        return this.canvas;
    }

    private final CanvasDrawScope component3() {
        return this.canvasDrawScope;
    }

    private final Path component4() {
        return this.borderPath;
    }

    public static /* synthetic */ BorderCache copy$default(BorderCache borderCache, ImageBitmap imageBitmap2, Canvas canvas2, CanvasDrawScope canvasDrawScope2, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            imageBitmap2 = borderCache.imageBitmap;
        }
        if ((i & 2) != 0) {
            canvas2 = borderCache.canvas;
        }
        if ((i & 4) != 0) {
            canvasDrawScope2 = borderCache.canvasDrawScope;
        }
        if ((i & 8) != 0) {
            path = borderCache.borderPath;
        }
        return borderCache.copy(imageBitmap2, canvas2, canvasDrawScope2, path);
    }

    public final BorderCache copy(ImageBitmap imageBitmap2, Canvas canvas2, CanvasDrawScope canvasDrawScope2, Path path) {
        return new BorderCache(imageBitmap2, canvas2, canvasDrawScope2, path);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (androidx.compose.p002ui.graphics.ImageBitmapConfig.m35882equalsimpl(r31, r5) != false) goto L_0x004f;
     */
    /* renamed from: drawBorderCache-EMwLDEs  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p002ui.graphics.ImageBitmap m32963drawBorderCacheEMwLDEs(androidx.compose.p002ui.draw.CacheDrawScope r28, long r29, int r31, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.graphics.drawscope.DrawScope, p336ef.C11921v> r32) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r32
            java.lang.String r3 = "$this$drawBorderCache"
            kotlin.jvm.internal.C12775o.m28639i(r1, r3)
            java.lang.String r3 = "block"
            kotlin.jvm.internal.C12775o.m28639i(r2, r3)
            androidx.compose.ui.graphics.ImageBitmap r3 = r27.imageBitmap
            androidx.compose.ui.graphics.Canvas r4 = r27.canvas
            r5 = 0
            if (r3 == 0) goto L_0x0024
            int r6 = r3.m35879getConfig_sVssgQ()
            androidx.compose.ui.graphics.ImageBitmapConfig r6 = androidx.compose.p002ui.graphics.ImageBitmapConfig.m35880boximpl(r6)
            goto L_0x0025
        L_0x0024:
            r6 = r5
        L_0x0025:
            androidx.compose.ui.graphics.ImageBitmapConfig$Companion r7 = androidx.compose.p002ui.graphics.ImageBitmapConfig.Companion
            int r7 = r7.m35888getArgb8888_sVssgQ()
            r8 = 0
            if (r6 != 0) goto L_0x0030
            r6 = r8
            goto L_0x0038
        L_0x0030:
            int r6 = r6.m35886unboximpl()
            boolean r6 = androidx.compose.p002ui.graphics.ImageBitmapConfig.m35883equalsimpl0(r6, r7)
        L_0x0038:
            if (r6 != 0) goto L_0x004d
            if (r3 == 0) goto L_0x0044
            int r5 = r3.m35879getConfig_sVssgQ()
            androidx.compose.ui.graphics.ImageBitmapConfig r5 = androidx.compose.p002ui.graphics.ImageBitmapConfig.m35880boximpl(r5)
        L_0x0044:
            r6 = r31
            boolean r5 = androidx.compose.p002ui.graphics.ImageBitmapConfig.m35882equalsimpl(r6, r5)
            if (r5 == 0) goto L_0x0050
            goto L_0x004f
        L_0x004d:
            r6 = r31
        L_0x004f:
            r8 = 1
        L_0x0050:
            if (r3 == 0) goto L_0x0078
            if (r4 == 0) goto L_0x0078
            long r9 = r28.m35329getSizeNHjbRc()
            float r5 = androidx.compose.p002ui.geometry.Size.m35491getWidthimpl(r9)
            int r7 = r3.getWidth()
            float r7 = (float) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x0078
            long r9 = r28.m35329getSizeNHjbRc()
            float r5 = androidx.compose.p002ui.geometry.Size.m35488getHeightimpl(r9)
            int r7 = r3.getHeight()
            float r7 = (float) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x0078
            if (r8 != 0) goto L_0x0095
        L_0x0078:
            int r9 = androidx.compose.p002ui.unit.IntSize.m38628getWidthimpl(r29)
            int r10 = androidx.compose.p002ui.unit.IntSize.m38627getHeightimpl(r29)
            r12 = 0
            r13 = 0
            r14 = 24
            r15 = 0
            r11 = r31
            androidx.compose.ui.graphics.ImageBitmap r3 = androidx.compose.p002ui.graphics.ImageBitmapKt.m35893ImageBitmapx__hDU$default(r9, r10, r11, r12, r13, r14, r15)
            r0.imageBitmap = r3
            androidx.compose.ui.graphics.Canvas r4 = androidx.compose.p002ui.graphics.CanvasKt.Canvas(r3)
            r0.canvas = r4
        L_0x0095:
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope r5 = r27.canvasDrawScope
            if (r5 != 0) goto L_0x00a3
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope r5 = new androidx.compose.ui.graphics.drawscope.CanvasDrawScope
            r5.<init>()
            r0.canvasDrawScope = r5
        L_0x00a3:
            long r11 = androidx.compose.p002ui.unit.IntSizeKt.m38638toSizeozmzZPI(r29)
            androidx.compose.ui.unit.LayoutDirection r6 = r28.getLayoutDirection()
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope$DrawParams r7 = r5.getDrawParams()
            androidx.compose.ui.unit.Density r15 = r7.component1()
            androidx.compose.ui.unit.LayoutDirection r14 = r7.component2()
            androidx.compose.ui.graphics.Canvas r13 = r7.component3()
            long r9 = r7.m36174component4NHjbRc()
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope$DrawParams r7 = r5.getDrawParams()
            r7.setDensity(r1)
            r7.setLayoutDirection(r6)
            r7.setCanvas(r4)
            r7.m36177setSizeuvyYCjk(r11)
            r4.save()
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.p002ui.graphics.Color.Companion
            long r7 = r1.m35697getBlack0d7_KjU()
            r16 = 0
            r1 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.graphics.BlendMode$Companion r6 = androidx.compose.p002ui.graphics.BlendMode.Companion
            int r20 = r6.m35577getClear0nO6VwU()
            r21 = 58
            r22 = 0
            r6 = r5
            r23 = r9
            r9 = r16
            r25 = r13
            r13 = r1
            r1 = r14
            r14 = r18
            r26 = r15
            r15 = r19
            r16 = r20
            r17 = r21
            r18 = r22
            androidx.compose.p002ui.graphics.drawscope.DrawScope.m36250drawRectnJ9OG0$default(r6, r7, r9, r11, r13, r14, r15, r16, r17, r18)
            r2.invoke(r5)
            r4.restore()
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope$DrawParams r2 = r5.getDrawParams()
            r4 = r26
            r2.setDensity(r4)
            r2.setLayoutDirection(r1)
            r1 = r25
            r2.setCanvas(r1)
            r4 = r23
            r2.m36177setSizeuvyYCjk(r4)
            r3.prepareToDraw()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderCache.m32963drawBorderCacheEMwLDEs(androidx.compose.ui.draw.CacheDrawScope, long, int, kotlin.jvm.functions.Function1):androidx.compose.ui.graphics.ImageBitmap");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderCache)) {
            return false;
        }
        BorderCache borderCache = (BorderCache) obj;
        if (C12775o.m28634d(this.imageBitmap, borderCache.imageBitmap) && C12775o.m28634d(this.canvas, borderCache.canvas) && C12775o.m28634d(this.canvasDrawScope, borderCache.canvasDrawScope) && C12775o.m28634d(this.borderPath, borderCache.borderPath)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        ImageBitmap imageBitmap2 = this.imageBitmap;
        int i4 = 0;
        if (imageBitmap2 == null) {
            i = 0;
        } else {
            i = imageBitmap2.hashCode();
        }
        int i5 = i * 31;
        Canvas canvas2 = this.canvas;
        if (canvas2 == null) {
            i2 = 0;
        } else {
            i2 = canvas2.hashCode();
        }
        int i6 = (i5 + i2) * 31;
        CanvasDrawScope canvasDrawScope2 = this.canvasDrawScope;
        if (canvasDrawScope2 == null) {
            i3 = 0;
        } else {
            i3 = canvasDrawScope2.hashCode();
        }
        int i7 = (i6 + i3) * 31;
        Path path = this.borderPath;
        if (path != null) {
            i4 = path.hashCode();
        }
        return i7 + i4;
    }

    public final Path obtainPath() {
        Path path = this.borderPath;
        if (path != null) {
            return path;
        }
        Path Path = AndroidPath_androidKt.Path();
        this.borderPath = Path;
        return Path;
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.imageBitmap + ", canvas=" + this.canvas + ", canvasDrawScope=" + this.canvasDrawScope + ", borderPath=" + this.borderPath + ')';
    }

    public BorderCache(ImageBitmap imageBitmap2, Canvas canvas2, CanvasDrawScope canvasDrawScope2, Path path) {
        this.imageBitmap = imageBitmap2;
        this.canvas = canvas2;
        this.canvasDrawScope = canvasDrawScope2;
        this.borderPath = path;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BorderCache(ImageBitmap imageBitmap2, Canvas canvas2, CanvasDrawScope canvasDrawScope2, Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : imageBitmap2, (i & 2) != 0 ? null : canvas2, (i & 4) != 0 ? null : canvasDrawScope2, (i & 8) != 0 ? null : path);
    }
}
