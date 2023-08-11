package androidx.compose.p002ui.graphics;

import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidPathMeasure.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,86:1\n35#2,5:87\n35#2,5:92\n*S KotlinDebug\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n*L\n43#1:87,5\n49#1:92,5\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.AndroidPathMeasure */
/* compiled from: AndroidPathMeasure.android.kt */
public final class AndroidPathMeasure implements PathMeasure {
    private final PathMeasure internalPathMeasure;
    private float[] positionArray;
    private float[] tangentArray;

    public AndroidPathMeasure(PathMeasure pathMeasure) {
        C12775o.m28639i(pathMeasure, "internalPathMeasure");
        this.internalPathMeasure = pathMeasure;
    }

    public float getLength() {
        return this.internalPathMeasure.getLength();
    }

    /* renamed from: getPosition-tuRUvjQ  reason: not valid java name */
    public long m35560getPositiontuRUvjQ(float f) {
        if (this.positionArray == null) {
            this.positionArray = new float[2];
        }
        if (this.tangentArray == null) {
            this.tangentArray = new float[2];
        }
        if (!this.internalPathMeasure.getPosTan(f, this.positionArray, this.tangentArray)) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        float[] fArr = this.positionArray;
        C12775o.m28636f(fArr);
        float f2 = fArr[0];
        float[] fArr2 = this.positionArray;
        C12775o.m28636f(fArr2);
        return OffsetKt.Offset(f2, fArr2[1]);
    }

    public boolean getSegment(float f, float f2, Path path, boolean z) {
        C12775o.m28639i(path, "destination");
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (path instanceof AndroidPath) {
            return pathMeasure.getSegment(f, f2, ((AndroidPath) path).getInternalPath(), z);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: getTangent-tuRUvjQ  reason: not valid java name */
    public long m35561getTangenttuRUvjQ(float f) {
        if (this.positionArray == null) {
            this.positionArray = new float[2];
        }
        if (this.tangentArray == null) {
            this.tangentArray = new float[2];
        }
        if (!this.internalPathMeasure.getPosTan(f, this.positionArray, this.tangentArray)) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        float[] fArr = this.tangentArray;
        C12775o.m28636f(fArr);
        float f2 = fArr[0];
        float[] fArr2 = this.tangentArray;
        C12775o.m28636f(fArr2);
        return OffsetKt.Offset(f2, fArr2[1]);
    }

    public void setPath(Path path, boolean z) {
        Path path2;
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (path == null) {
            path2 = null;
        } else if (path instanceof AndroidPath) {
            path2 = ((AndroidPath) path).getInternalPath();
        } else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        pathMeasure.setPath(path2, z);
    }
}
