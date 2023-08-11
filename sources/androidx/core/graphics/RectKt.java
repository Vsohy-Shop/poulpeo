package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.appboy.Constants;
import kotlin.jvm.internal.C12775o;

/* compiled from: Rect.kt */
public final class RectKt {
    public static final Rect and(Rect rect, Rect rect2) {
        C12775o.m28639i(rect, "<this>");
        C12775o.m28639i(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    public static final int component1(Rect rect) {
        C12775o.m28639i(rect, "<this>");
        return rect.left;
    }

    public static final int component2(Rect rect) {
        C12775o.m28639i(rect, "<this>");
        return rect.top;
    }

    public static final int component3(Rect rect) {
        C12775o.m28639i(rect, "<this>");
        return rect.right;
    }

    public static final int component4(Rect rect) {
        C12775o.m28639i(rect, "<this>");
        return rect.bottom;
    }

    public static final boolean contains(Rect rect, Point point) {
        C12775o.m28639i(rect, "<this>");
        C12775o.m28639i(point, Constants.APPBOY_PUSH_PRIORITY_KEY);
        return rect.contains(point.x, point.y);
    }

    public static final Region minus(Rect rect, Rect rect2) {
        C12775o.m28639i(rect, "<this>");
        C12775o.m28639i(rect2, "r");
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    /* renamed from: or */
    public static final Rect m957or(Rect rect, Rect rect2) {
        C12775o.m28639i(rect, "<this>");
        C12775o.m28639i(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    public static final Rect plus(Rect rect, Rect rect2) {
        C12775o.m28639i(rect, "<this>");
        C12775o.m28639i(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    public static final Rect times(Rect rect, int i) {
        C12775o.m28639i(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.top *= i;
        rect2.left *= i;
        rect2.right *= i;
        rect2.bottom *= i;
        return rect2;
    }

    public static final Rect toRect(RectF rectF) {
        C12775o.m28639i(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    public static final RectF toRectF(Rect rect) {
        C12775o.m28639i(rect, "<this>");
        return new RectF(rect);
    }

    public static final Region toRegion(Rect rect) {
        C12775o.m28639i(rect, "<this>");
        return new Region(rect);
    }

    public static final RectF transform(RectF rectF, Matrix matrix) {
        C12775o.m28639i(rectF, "<this>");
        C12775o.m28639i(matrix, "m");
        matrix.mapRect(rectF);
        return rectF;
    }

    public static final Region xor(Rect rect, Rect rect2) {
        C12775o.m28639i(rect, "<this>");
        C12775o.m28639i(rect2, "r");
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    public static final float component1(RectF rectF) {
        C12775o.m28639i(rectF, "<this>");
        return rectF.left;
    }

    public static final float component2(RectF rectF) {
        C12775o.m28639i(rectF, "<this>");
        return rectF.top;
    }

    public static final float component3(RectF rectF) {
        C12775o.m28639i(rectF, "<this>");
        return rectF.right;
    }

    public static final float component4(RectF rectF) {
        C12775o.m28639i(rectF, "<this>");
        return rectF.bottom;
    }

    public static final boolean contains(RectF rectF, PointF pointF) {
        C12775o.m28639i(rectF, "<this>");
        C12775o.m28639i(pointF, Constants.APPBOY_PUSH_PRIORITY_KEY);
        return rectF.contains(pointF.x, pointF.y);
    }

    public static final Region toRegion(RectF rectF) {
        C12775o.m28639i(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    public static final RectF and(RectF rectF, RectF rectF2) {
        C12775o.m28639i(rectF, "<this>");
        C12775o.m28639i(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    public static final Region minus(RectF rectF, RectF rectF2) {
        C12775o.m28639i(rectF, "<this>");
        C12775o.m28639i(rectF2, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    /* renamed from: or */
    public static final RectF m958or(RectF rectF, RectF rectF2) {
        C12775o.m28639i(rectF, "<this>");
        C12775o.m28639i(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    public static final RectF plus(RectF rectF, RectF rectF2) {
        C12775o.m28639i(rectF, "<this>");
        C12775o.m28639i(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    public static final Region xor(RectF rectF, RectF rectF2) {
        C12775o.m28639i(rectF, "<this>");
        C12775o.m28639i(rectF2, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    public static final Rect plus(Rect rect, int i) {
        C12775o.m28639i(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.offset(i, i);
        return rect2;
    }

    public static final RectF times(RectF rectF, float f) {
        C12775o.m28639i(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    public static final RectF plus(RectF rectF, float f) {
        C12775o.m28639i(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f, f);
        return rectF2;
    }

    public static final Rect plus(Rect rect, Point point) {
        C12775o.m28639i(rect, "<this>");
        C12775o.m28639i(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    public static final Rect minus(Rect rect, int i) {
        C12775o.m28639i(rect, "<this>");
        Rect rect2 = new Rect(rect);
        int i2 = -i;
        rect2.offset(i2, i2);
        return rect2;
    }

    public static final RectF plus(RectF rectF, PointF pointF) {
        C12775o.m28639i(rectF, "<this>");
        C12775o.m28639i(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    public static final RectF times(RectF rectF, int i) {
        C12775o.m28639i(rectF, "<this>");
        float f = (float) i;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    public static final RectF minus(RectF rectF, float f) {
        C12775o.m28639i(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        float f2 = -f;
        rectF2.offset(f2, f2);
        return rectF2;
    }

    public static final Rect minus(Rect rect, Point point) {
        C12775o.m28639i(rect, "<this>");
        C12775o.m28639i(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    public static final RectF minus(RectF rectF, PointF pointF) {
        C12775o.m28639i(rectF, "<this>");
        C12775o.m28639i(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }
}
