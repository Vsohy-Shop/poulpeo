package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import com.appboy.Constants;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: Region.kt */
public final class RegionKt {
    public static final Region and(Region region, Rect rect) {
        C12775o.m28639i(region, "<this>");
        C12775o.m28639i(rect, "r");
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.INTERSECT);
        return region2;
    }

    public static final boolean contains(Region region, Point point) {
        C12775o.m28639i(region, "<this>");
        C12775o.m28639i(point, Constants.APPBOY_PUSH_PRIORITY_KEY);
        return region.contains(point.x, point.y);
    }

    public static final void forEach(Region region, Function1<? super Rect, C11921v> function1) {
        C12775o.m28639i(region, "<this>");
        C12775o.m28639i(function1, "action");
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (regionIterator.next(rect)) {
                function1.invoke(rect);
            } else {
                return;
            }
        }
    }

    public static final Iterator<Rect> iterator(Region region) {
        C12775o.m28639i(region, "<this>");
        return new RegionKt$iterator$1(region);
    }

    public static final Region minus(Region region, Rect rect) {
        C12775o.m28639i(region, "<this>");
        C12775o.m28639i(rect, "r");
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region not(Region region) {
        C12775o.m28639i(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    /* renamed from: or */
    public static final Region m959or(Region region, Rect rect) {
        C12775o.m28639i(region, "<this>");
        C12775o.m28639i(rect, "r");
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    public static final Region plus(Region region, Rect rect) {
        C12775o.m28639i(region, "<this>");
        C12775o.m28639i(rect, "r");
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    public static final Region unaryMinus(Region region) {
        C12775o.m28639i(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region xor(Region region, Rect rect) {
        C12775o.m28639i(region, "<this>");
        C12775o.m28639i(rect, "r");
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.XOR);
        return region2;
    }

    public static final Region and(Region region, Region region2) {
        C12775o.m28639i(region, "<this>");
        C12775o.m28639i(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.INTERSECT);
        return region3;
    }

    public static final Region minus(Region region, Region region2) {
        C12775o.m28639i(region, "<this>");
        C12775o.m28639i(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.DIFFERENCE);
        return region3;
    }

    /* renamed from: or */
    public static final Region m960or(Region region, Region region2) {
        C12775o.m28639i(region, "<this>");
        C12775o.m28639i(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    public static final Region plus(Region region, Region region2) {
        C12775o.m28639i(region, "<this>");
        C12775o.m28639i(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    public static final Region xor(Region region, Region region2) {
        C12775o.m28639i(region, "<this>");
        C12775o.m28639i(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.XOR);
        return region3;
    }
}
