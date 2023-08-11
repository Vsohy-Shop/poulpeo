package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DensityKt;
import androidx.compose.p002ui.unit.LayoutDirection;

/* renamed from: androidx.compose.ui.draw.EmptyBuildDrawCacheParams */
/* compiled from: DrawModifier.kt */
final class EmptyBuildDrawCacheParams implements BuildDrawCacheParams {
    public static final EmptyBuildDrawCacheParams INSTANCE = new EmptyBuildDrawCacheParams();
    private static final Density density = DensityKt.Density(1.0f, 1.0f);
    private static final LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private static final long size = Size.Companion.m35499getUnspecifiedNHjbRc();

    private EmptyBuildDrawCacheParams() {
    }

    public Density getDensity() {
        return density;
    }

    public LayoutDirection getLayoutDirection() {
        return layoutDirection;
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public long m35330getSizeNHjbRc() {
        return size;
    }
}
