package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.geometry.Size;

/* renamed from: androidx.compose.ui.layout.ContentScaleKt */
/* compiled from: ContentScale.kt */
public final class ContentScaleKt {
    /* access modifiers changed from: private */
    /* renamed from: computeFillHeight-iLBOSCw  reason: not valid java name */
    public static final float m37319computeFillHeightiLBOSCw(long j, long j2) {
        return Size.m35488getHeightimpl(j2) / Size.m35488getHeightimpl(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: computeFillMaxDimension-iLBOSCw  reason: not valid java name */
    public static final float m37320computeFillMaxDimensioniLBOSCw(long j, long j2) {
        return Math.max(m37322computeFillWidthiLBOSCw(j, j2), m37319computeFillHeightiLBOSCw(j, j2));
    }

    /* access modifiers changed from: private */
    /* renamed from: computeFillMinDimension-iLBOSCw  reason: not valid java name */
    public static final float m37321computeFillMinDimensioniLBOSCw(long j, long j2) {
        return Math.min(m37322computeFillWidthiLBOSCw(j, j2), m37319computeFillHeightiLBOSCw(j, j2));
    }

    /* access modifiers changed from: private */
    /* renamed from: computeFillWidth-iLBOSCw  reason: not valid java name */
    public static final float m37322computeFillWidthiLBOSCw(long j, long j2) {
        return Size.m35491getWidthimpl(j2) / Size.m35491getWidthimpl(j);
    }
}
