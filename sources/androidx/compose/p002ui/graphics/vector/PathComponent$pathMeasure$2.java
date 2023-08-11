package androidx.compose.p002ui.graphics.vector;

import androidx.compose.p002ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.p002ui.graphics.PathMeasure;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.graphics.vector.PathComponent$pathMeasure$2 */
/* compiled from: Vector.kt */
final class PathComponent$pathMeasure$2 extends C12777p implements C13074a<PathMeasure> {
    public static final PathComponent$pathMeasure$2 INSTANCE = new PathComponent$pathMeasure$2();

    PathComponent$pathMeasure$2() {
        super(0);
    }

    public final PathMeasure invoke() {
        return AndroidPathMeasure_androidKt.PathMeasure();
    }
}
