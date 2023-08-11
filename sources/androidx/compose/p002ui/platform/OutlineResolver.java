package androidx.compose.p002ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.p002ui.geometry.CornerRadius;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.RoundRect;
import androidx.compose.p002ui.geometry.RoundRectKt;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.AndroidPath;
import androidx.compose.p002ui.graphics.AndroidPath_androidKt;
import androidx.compose.p002ui.graphics.Outline;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.RectangleShapeKt;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,356:1\n1#2:357\n35#3,5:358\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n*L\n330#1:358,5\n*E\n"})
/* renamed from: androidx.compose.ui.platform.OutlineResolver */
/* compiled from: OutlineResolver.android.kt */
public final class OutlineResolver {
    private boolean cacheIsDirty;
    private final Outline cachedOutline;
    private Path cachedRrectPath;
    private androidx.compose.p002ui.graphics.Outline calculatedOutline;
    private Density density;
    private boolean isSupportedOutline = true;
    private LayoutDirection layoutDirection;
    private boolean outlineNeeded;
    private Path outlinePath;
    private long rectSize;
    private long rectTopLeft;
    private float roundedCornerRadius;
    private Shape shape;
    private long size;
    private Path tmpOpPath;
    private Path tmpPath;
    private RoundRect tmpRoundRect;
    private Path tmpTouchPointPath;
    private boolean usePathForClip;

    public OutlineResolver(Density density2) {
        C12775o.m28639i(density2, "density");
        this.density = density2;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        Size.Companion companion = Size.Companion;
        this.size = companion.m35500getZeroNHjbRc();
        this.shape = RectangleShapeKt.getRectangleShape();
        this.rectTopLeft = Offset.Companion.m35438getZeroF1C5BW0();
        this.rectSize = companion.m35500getZeroNHjbRc();
        this.layoutDirection = LayoutDirection.Ltr;
    }

    /* renamed from: isSameBounds-4L21HEs  reason: not valid java name */
    private final boolean m37767isSameBounds4L21HEs(RoundRect roundRect, long j, long j2, float f) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (roundRect == null || !RoundRectKt.isSimple(roundRect)) {
            return false;
        }
        if (roundRect.getLeft() == Offset.m35422getXimpl(j)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (roundRect.getTop() == Offset.m35423getYimpl(j)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (roundRect.getRight() == Offset.m35422getXimpl(j) + Size.m35491getWidthimpl(j2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (roundRect.getBottom() == Offset.m35423getYimpl(j) + Size.m35488getHeightimpl(j2)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (CornerRadius.m35397getXimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs()) == f) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return true;
        }
        return false;
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = Offset.Companion.m35438getZeroF1C5BW0();
            long j = this.size;
            this.rectSize = j;
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            if (!this.outlineNeeded || Size.m35491getWidthimpl(j) <= 0.0f || Size.m35488getHeightimpl(this.size) <= 0.0f) {
                this.cachedOutline.setEmpty();
                return;
            }
            this.isSupportedOutline = true;
            androidx.compose.p002ui.graphics.Outline r0 = this.shape.m36025createOutlinePq9zytI(this.size, this.layoutDirection, this.density);
            this.calculatedOutline = r0;
            if (r0 instanceof Outline.Rectangle) {
                updateCacheWithRect(((Outline.Rectangle) r0).getRect());
            } else if (r0 instanceof Outline.Rounded) {
                updateCacheWithRoundRect(((Outline.Rounded) r0).getRoundRect());
            } else if (r0 instanceof Outline.Generic) {
                updateCacheWithPath(((Outline.Generic) r0).getPath());
            }
        }
    }

    private final void updateCacheWithPath(Path path) {
        if (Build.VERSION.SDK_INT > 28 || path.isConvex()) {
            android.graphics.Outline outline = this.cachedOutline;
            if (path instanceof AndroidPath) {
                outline.setConvexPath(((AndroidPath) path).getInternalPath());
                this.usePathForClip = !this.cachedOutline.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = path;
    }

    private final void updateCacheWithRect(Rect rect) {
        this.rectTopLeft = OffsetKt.Offset(rect.getLeft(), rect.getTop());
        this.rectSize = SizeKt.Size(rect.getWidth(), rect.getHeight());
        this.cachedOutline.setRect(C13265c.m30134c(rect.getLeft()), C13265c.m30134c(rect.getTop()), C13265c.m30134c(rect.getRight()), C13265c.m30134c(rect.getBottom()));
    }

    private final void updateCacheWithRoundRect(RoundRect roundRect) {
        float r0 = CornerRadius.m35397getXimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs());
        this.rectTopLeft = OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
        this.rectSize = SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
        if (RoundRectKt.isSimple(roundRect)) {
            this.cachedOutline.setRoundRect(C13265c.m30134c(roundRect.getLeft()), C13265c.m30134c(roundRect.getTop()), C13265c.m30134c(roundRect.getRight()), C13265c.m30134c(roundRect.getBottom()), r0);
            this.roundedCornerRadius = r0;
            return;
        }
        Path path = this.cachedRrectPath;
        if (path == null) {
            path = AndroidPath_androidKt.Path();
            this.cachedRrectPath = path;
        }
        path.reset();
        path.addRoundRect(roundRect);
        updateCacheWithPath(path);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (m37767isSameBounds4L21HEs(r1, r7.rectTopLeft, r7.rectSize, r6) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clipToOutline(androidx.compose.p002ui.graphics.Canvas r21) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            androidx.compose.ui.graphics.Path r0 = r20.getClipPath()
            r9 = 0
            r10 = 0
            r11 = 2
            if (r0 == 0) goto L_0x0017
            androidx.compose.p002ui.graphics.Canvas.m35632clipPathmtrdDE$default(r8, r0, r9, r11, r10)
            goto L_0x00a9
        L_0x0017:
            float r6 = r7.roundedCornerRadius
            r12 = 0
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0078
            androidx.compose.ui.graphics.Path r13 = r7.tmpPath
            androidx.compose.ui.geometry.RoundRect r1 = r7.tmpRoundRect
            if (r13 == 0) goto L_0x0030
            long r2 = r7.rectTopLeft
            long r4 = r7.rectSize
            r0 = r20
            boolean r0 = r0.m37767isSameBounds4L21HEs(r1, r2, r4, r6)
            if (r0 != 0) goto L_0x0074
        L_0x0030:
            long r0 = r7.rectTopLeft
            float r14 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r0)
            long r0 = r7.rectTopLeft
            float r15 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r0)
            long r0 = r7.rectTopLeft
            float r0 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r0)
            long r1 = r7.rectSize
            float r1 = androidx.compose.p002ui.geometry.Size.m35491getWidthimpl(r1)
            float r16 = r0 + r1
            long r0 = r7.rectTopLeft
            float r0 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r0)
            long r1 = r7.rectSize
            float r1 = androidx.compose.p002ui.geometry.Size.m35488getHeightimpl(r1)
            float r17 = r0 + r1
            float r0 = r7.roundedCornerRadius
            long r18 = androidx.compose.p002ui.geometry.CornerRadiusKt.CornerRadius$default(r0, r12, r11, r10)
            androidx.compose.ui.geometry.RoundRect r0 = androidx.compose.p002ui.geometry.RoundRectKt.m35476RoundRectgG7oq9Y(r14, r15, r16, r17, r18)
            if (r13 != 0) goto L_0x006a
            androidx.compose.ui.graphics.Path r1 = androidx.compose.p002ui.graphics.AndroidPath_androidKt.Path()
            r13 = r1
            goto L_0x006d
        L_0x006a:
            r13.reset()
        L_0x006d:
            r13.addRoundRect(r0)
            r7.tmpRoundRect = r0
            r7.tmpPath = r13
        L_0x0074:
            androidx.compose.p002ui.graphics.Canvas.m35632clipPathmtrdDE$default(r8, r13, r9, r11, r10)
            goto L_0x00a9
        L_0x0078:
            long r0 = r7.rectTopLeft
            float r9 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r0)
            long r0 = r7.rectTopLeft
            float r10 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r0)
            long r0 = r7.rectTopLeft
            float r0 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r0)
            long r1 = r7.rectSize
            float r1 = androidx.compose.p002ui.geometry.Size.m35491getWidthimpl(r1)
            float r11 = r0 + r1
            long r0 = r7.rectTopLeft
            float r0 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r0)
            long r1 = r7.rectSize
            float r1 = androidx.compose.p002ui.geometry.Size.m35488getHeightimpl(r1)
            float r12 = r0 + r1
            r13 = 0
            r14 = 16
            r15 = 0
            r8 = r21
            androidx.compose.p002ui.graphics.Canvas.m35633clipRectN_I0leg$default(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.OutlineResolver.clipToOutline(androidx.compose.ui.graphics.Canvas):void");
    }

    public final Path getClipPath() {
        updateCache();
        return this.outlinePath;
    }

    public final android.graphics.Outline getOutline() {
        updateCache();
        if (!this.outlineNeeded || !this.isSupportedOutline) {
            return null;
        }
        return this.cachedOutline;
    }

    public final boolean getOutlineClipSupported() {
        return !this.usePathForClip;
    }

    /* renamed from: isInOutline-k-4lQ0M  reason: not valid java name */
    public final boolean m37768isInOutlinek4lQ0M(long j) {
        androidx.compose.p002ui.graphics.Outline outline;
        if (this.outlineNeeded && (outline = this.calculatedOutline) != null) {
            return ShapeContainingUtilKt.isInOutline(outline, Offset.m35422getXimpl(j), Offset.m35423getYimpl(j), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    public final boolean update(Shape shape2, float f, boolean z, float f2, LayoutDirection layoutDirection2, Density density2) {
        boolean z2;
        C12775o.m28639i(shape2, "shape");
        C12775o.m28639i(layoutDirection2, "layoutDirection");
        C12775o.m28639i(density2, "density");
        this.cachedOutline.setAlpha(f);
        boolean z3 = !C12775o.m28634d(this.shape, shape2);
        if (z3) {
            this.shape = shape2;
            this.cacheIsDirty = true;
        }
        if (z || f2 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.outlineNeeded != z2) {
            this.outlineNeeded = z2;
            this.cacheIsDirty = true;
        }
        if (this.layoutDirection != layoutDirection2) {
            this.layoutDirection = layoutDirection2;
            this.cacheIsDirty = true;
        }
        if (!C12775o.m28634d(this.density, density2)) {
            this.density = density2;
            this.cacheIsDirty = true;
        }
        return z3;
    }

    /* renamed from: update-uvyYCjk  reason: not valid java name */
    public final void m37769updateuvyYCjk(long j) {
        if (!Size.m35487equalsimpl0(this.size, j)) {
            this.size = j;
            this.cacheIsDirty = true;
        }
    }
}
