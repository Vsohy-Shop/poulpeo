package androidx.compose.p002ui.graphics;

/* renamed from: androidx.compose.ui.graphics.PathMeasure */
/* compiled from: PathMeasure.kt */
public interface PathMeasure {

    /* renamed from: androidx.compose.ui.graphics.PathMeasure$DefaultImpls */
    /* compiled from: PathMeasure.kt */
    public static final class DefaultImpls {
    }

    static /* synthetic */ boolean getSegment$default(PathMeasure pathMeasure, float f, float f2, Path path, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                z = true;
            }
            return pathMeasure.getSegment(f, f2, path, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
    }

    float getLength();

    /* renamed from: getPosition-tuRUvjQ  reason: not valid java name */
    long m35966getPositiontuRUvjQ(float f);

    boolean getSegment(float f, float f2, Path path, boolean z);

    /* renamed from: getTangent-tuRUvjQ  reason: not valid java name */
    long m35967getTangenttuRUvjQ(float f);

    void setPath(Path path, boolean z);
}
