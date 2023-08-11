package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.geometry.Size;

/* renamed from: androidx.compose.ui.layout.ContentScale$Companion$Inside$1 */
/* compiled from: ContentScale.kt */
public final class ContentScale$Companion$Inside$1 implements ContentScale {
    ContentScale$Companion$Inside$1() {
    }

    /* renamed from: computeScaleFactor-H7hwNQA  reason: not valid java name */
    public long m37314computeScaleFactorH7hwNQA(long j, long j2) {
        if (Size.m35491getWidthimpl(j) <= Size.m35491getWidthimpl(j2) && Size.m35488getHeightimpl(j) <= Size.m35488getHeightimpl(j2)) {
            return ScaleFactorKt.ScaleFactor(1.0f, 1.0f);
        }
        float r3 = ContentScaleKt.m37321computeFillMinDimensioniLBOSCw(j, j2);
        return ScaleFactorKt.ScaleFactor(r3, r3);
    }
}
