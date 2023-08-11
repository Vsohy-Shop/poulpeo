package androidx.compose.p002ui.graphics;

import android.graphics.Path;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.graphics.AndroidPath_androidKt */
/* compiled from: AndroidPath.android.kt */
public final class AndroidPath_androidKt {
    public static final Path Path() {
        return new AndroidPath((Path) null, 1, (DefaultConstructorMarker) null);
    }

    public static final Path asAndroidPath(Path path) {
        C12775o.m28639i(path, "<this>");
        if (path instanceof AndroidPath) {
            return ((AndroidPath) path).getInternalPath();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public static final Path asComposePath(Path path) {
        C12775o.m28639i(path, "<this>");
        return new AndroidPath(path);
    }
}
