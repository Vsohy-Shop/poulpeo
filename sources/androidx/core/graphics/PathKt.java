package androidx.core.graphics;

import android.graphics.Path;
import androidx.annotation.RequiresApi;
import com.appboy.Constants;
import java.util.Collection;
import kotlin.jvm.internal.C12775o;

/* compiled from: Path.kt */
public final class PathKt {
    @RequiresApi(19)
    public static final Path and(Path path, Path path2) {
        C12775o.m28639i(path, "<this>");
        C12775o.m28639i(path2, Constants.APPBOY_PUSH_PRIORITY_KEY);
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    @RequiresApi(26)
    public static final Iterable<PathSegment> flatten(Path path, float f) {
        C12775o.m28639i(path, "<this>");
        Collection<PathSegment> flatten = PathUtils.flatten(path, f);
        C12775o.m28638h(flatten, "flatten(this, error)");
        return flatten;
    }

    public static /* synthetic */ Iterable flatten$default(Path path, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.5f;
        }
        return flatten(path, f);
    }

    @RequiresApi(19)
    public static final Path minus(Path path, Path path2) {
        C12775o.m28639i(path, "<this>");
        C12775o.m28639i(path2, Constants.APPBOY_PUSH_PRIORITY_KEY);
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }

    @RequiresApi(19)
    /* renamed from: or */
    public static final Path m956or(Path path, Path path2) {
        C12775o.m28639i(path, "<this>");
        C12775o.m28639i(path2, Constants.APPBOY_PUSH_PRIORITY_KEY);
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @RequiresApi(19)
    public static final Path plus(Path path, Path path2) {
        C12775o.m28639i(path, "<this>");
        C12775o.m28639i(path2, Constants.APPBOY_PUSH_PRIORITY_KEY);
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @RequiresApi(19)
    public static final Path xor(Path path, Path path2) {
        C12775o.m28639i(path, "<this>");
        C12775o.m28639i(path2, Constants.APPBOY_PUSH_PRIORITY_KEY);
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }
}
