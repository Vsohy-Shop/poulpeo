package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.geometry.CornerRadius;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.RoundRect;
import androidx.compose.p002ui.graphics.AndroidPath_androidKt;
import androidx.compose.p002ui.graphics.Outline;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.PathOperation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.platform.ShapeContainingUtilKt */
/* compiled from: ShapeContainingUtil.kt */
public final class ShapeContainingUtilKt {
    private static final boolean cornersFit(RoundRect roundRect) {
        if (CornerRadius.m35397getXimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs()) + CornerRadius.m35397getXimpl(roundRect.m35473getTopRightCornerRadiuskKHJgLs()) > roundRect.getWidth() || CornerRadius.m35397getXimpl(roundRect.m35470getBottomLeftCornerRadiuskKHJgLs()) + CornerRadius.m35397getXimpl(roundRect.m35471getBottomRightCornerRadiuskKHJgLs()) > roundRect.getWidth() || CornerRadius.m35398getYimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs()) + CornerRadius.m35398getYimpl(roundRect.m35470getBottomLeftCornerRadiuskKHJgLs()) > roundRect.getHeight() || CornerRadius.m35398getYimpl(roundRect.m35473getTopRightCornerRadiuskKHJgLs()) + CornerRadius.m35398getYimpl(roundRect.m35471getBottomRightCornerRadiuskKHJgLs()) > roundRect.getHeight()) {
            return false;
        }
        return true;
    }

    public static final boolean isInOutline(Outline outline, float f, float f2, Path path, Path path2) {
        C12775o.m28639i(outline, "outline");
        if (outline instanceof Outline.Rectangle) {
            return isInRectangle(((Outline.Rectangle) outline).getRect(), f, f2);
        }
        if (outline instanceof Outline.Rounded) {
            return isInRoundedRect((Outline.Rounded) outline, f, f2, path, path2);
        }
        if (outline instanceof Outline.Generic) {
            return isInPath(((Outline.Generic) outline).getPath(), f, f2, path, path2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean isInOutline$default(Outline outline, float f, float f2, Path path, Path path2, int i, Object obj) {
        if ((i & 8) != 0) {
            path = null;
        }
        if ((i & 16) != 0) {
            path2 = null;
        }
        return isInOutline(outline, f, f2, path, path2);
    }

    private static final boolean isInPath(Path path, float f, float f2, Path path2, Path path3) {
        Rect rect = new Rect(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.Path();
        }
        path2.addRect(rect);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.Path();
        }
        path3.m35951opN5in7k0(path, path2, PathOperation.Companion.m35976getIntersectb3I0S0c());
        boolean isEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !isEmpty;
    }

    private static final boolean isInRectangle(Rect rect, float f, float f2) {
        if (rect.getLeft() > f || f >= rect.getRight() || rect.getTop() > f2 || f2 >= rect.getBottom()) {
            return false;
        }
        return true;
    }

    private static final boolean isInRoundedRect(Outline.Rounded rounded, float f, float f2, Path path, Path path2) {
        Path path3;
        float f3 = f;
        float f4 = f2;
        Path path4 = path2;
        RoundRect roundRect = rounded.getRoundRect();
        if (f3 < roundRect.getLeft() || f3 >= roundRect.getRight() || f4 < roundRect.getTop() || f4 >= roundRect.getBottom()) {
            return false;
        }
        if (!cornersFit(roundRect)) {
            if (path4 == null) {
                path3 = AndroidPath_androidKt.Path();
            } else {
                path3 = path4;
            }
            path3.addRoundRect(roundRect);
            return isInPath(path3, f, f2, path, path4);
        }
        float r4 = CornerRadius.m35397getXimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
        float r5 = CornerRadius.m35398getYimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs()) + roundRect.getTop();
        float right = roundRect.getRight() - CornerRadius.m35397getXimpl(roundRect.m35473getTopRightCornerRadiuskKHJgLs());
        float r7 = CornerRadius.m35398getYimpl(roundRect.m35473getTopRightCornerRadiuskKHJgLs()) + roundRect.getTop();
        float right2 = roundRect.getRight() - CornerRadius.m35397getXimpl(roundRect.m35471getBottomRightCornerRadiuskKHJgLs());
        float bottom = roundRect.getBottom() - CornerRadius.m35398getYimpl(roundRect.m35471getBottomRightCornerRadiuskKHJgLs());
        float bottom2 = roundRect.getBottom() - CornerRadius.m35398getYimpl(roundRect.m35470getBottomLeftCornerRadiuskKHJgLs());
        float r11 = CornerRadius.m35397getXimpl(roundRect.m35470getBottomLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
        if (f3 < r4 && f4 < r5) {
            return m37781isWithinEllipseVE1yxkc(f, f2, roundRect.m35472getTopLeftCornerRadiuskKHJgLs(), r4, r5);
        } else if (f3 < r11 && f4 > bottom2) {
            return m37781isWithinEllipseVE1yxkc(f, f2, roundRect.m35470getBottomLeftCornerRadiuskKHJgLs(), r11, bottom2);
        } else if (f3 > right && f4 < r7) {
            return m37781isWithinEllipseVE1yxkc(f, f2, roundRect.m35473getTopRightCornerRadiuskKHJgLs(), right, r7);
        } else if (f3 <= right2 || f4 <= bottom) {
            return true;
        } else {
            return m37781isWithinEllipseVE1yxkc(f, f2, roundRect.m35471getBottomRightCornerRadiuskKHJgLs(), right2, bottom);
        }
    }

    /* renamed from: isWithinEllipse-VE1yxkc  reason: not valid java name */
    private static final boolean m37781isWithinEllipseVE1yxkc(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float r4 = CornerRadius.m35397getXimpl(j);
        float r2 = CornerRadius.m35398getYimpl(j);
        if (((f5 * f5) / (r4 * r4)) + ((f6 * f6) / (r2 * r2)) <= 1.0f) {
            return true;
        }
        return false;
    }
}
