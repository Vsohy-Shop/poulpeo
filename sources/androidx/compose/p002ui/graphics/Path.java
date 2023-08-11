package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.RoundRect;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.Path */
/* compiled from: Path.kt */
public interface Path {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: androidx.compose.ui.graphics.Path$Companion */
    /* compiled from: Path.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* renamed from: combine-xh6zSI8  reason: not valid java name */
        public final Path m35954combinexh6zSI8(int i, Path path, Path path2) {
            C12775o.m28639i(path, "path1");
            C12775o.m28639i(path2, "path2");
            Path Path = AndroidPath_androidKt.Path();
            if (Path.m35951opN5in7k0(path, path2, i)) {
                return Path;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }

    /* renamed from: androidx.compose.ui.graphics.Path$DefaultImpls */
    /* compiled from: Path.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static void arcToRad(Path path, Rect rect, float f, float f2, boolean z) {
            C12775o.m28639i(rect, "rect");
            Path.super.arcToRad(rect, f, f2, z);
        }
    }

    /* renamed from: addPath-Uv8p0NA$default  reason: not valid java name */
    static /* synthetic */ void m35948addPathUv8p0NA$default(Path path, Path path2, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = Offset.Companion.m35438getZeroF1C5BW0();
            }
            path.m35949addPathUv8p0NA(path2, j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
    }

    void addArc(Rect rect, float f, float f2);

    void addArcRad(Rect rect, float f, float f2);

    void addOval(Rect rect);

    /* renamed from: addPath-Uv8p0NA  reason: not valid java name */
    void m35949addPathUv8p0NA(Path path, long j);

    void addRect(Rect rect);

    void addRoundRect(RoundRect roundRect);

    void arcTo(Rect rect, float f, float f2, boolean z);

    void arcToRad(Rect rect, float f, float f2, boolean z) {
        C12775o.m28639i(rect, "rect");
        arcTo(rect, DegreesKt.degrees(f), DegreesKt.degrees(f2), z);
    }

    void close();

    void cubicTo(float f, float f2, float f3, float f4, float f5, float f6);

    Rect getBounds();

    /* renamed from: getFillType-Rg-k1Os  reason: not valid java name */
    int m35950getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    void lineTo(float f, float f2);

    void moveTo(float f, float f2);

    /* renamed from: op-N5in7k0  reason: not valid java name */
    boolean m35951opN5in7k0(Path path, Path path2, int i);

    void quadraticBezierTo(float f, float f2, float f3, float f4);

    void relativeCubicTo(float f, float f2, float f3, float f4, float f5, float f6);

    void relativeLineTo(float f, float f2);

    void relativeMoveTo(float f, float f2);

    void relativeQuadraticBezierTo(float f, float f2, float f3, float f4);

    void reset();

    /* renamed from: setFillType-oQ8Xj4U  reason: not valid java name */
    void m35952setFillTypeoQ8Xj4U(int i);

    /* renamed from: translate-k-4lQ0M  reason: not valid java name */
    void m35953translatek4lQ0M(long j);
}
