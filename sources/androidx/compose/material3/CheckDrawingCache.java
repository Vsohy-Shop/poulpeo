package androidx.compose.material3;

import androidx.compose.p002ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.p002ui.graphics.AndroidPath_androidKt;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.PathMeasure;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* compiled from: Checkbox.kt */
final class CheckDrawingCache {
    private final Path checkPath;
    private final PathMeasure pathMeasure;
    private final Path pathToDraw;

    public CheckDrawingCache() {
        this((Path) null, (PathMeasure) null, (Path) null, 7, (DefaultConstructorMarker) null);
    }

    public final Path getCheckPath() {
        return this.checkPath;
    }

    public final PathMeasure getPathMeasure() {
        return this.pathMeasure;
    }

    public final Path getPathToDraw() {
        return this.pathToDraw;
    }

    public CheckDrawingCache(Path path, PathMeasure pathMeasure2, Path path2) {
        C12775o.m28639i(path, "checkPath");
        C12775o.m28639i(pathMeasure2, "pathMeasure");
        C12775o.m28639i(path2, "pathToDraw");
        this.checkPath = path;
        this.pathMeasure = pathMeasure2;
        this.pathToDraw = path2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckDrawingCache(Path path, PathMeasure pathMeasure2, Path path2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AndroidPath_androidKt.Path() : path, (i & 2) != 0 ? AndroidPathMeasure_androidKt.PathMeasure() : pathMeasure2, (i & 4) != 0 ? AndroidPath_androidKt.Path() : path2);
    }
}
