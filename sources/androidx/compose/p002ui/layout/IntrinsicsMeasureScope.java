package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DpRect;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.layout.IntrinsicsMeasureScope */
/* compiled from: Layout.kt */
public final class IntrinsicsMeasureScope implements MeasureScope, Density {
    private final /* synthetic */ Density $$delegate_0;
    private final LayoutDirection layoutDirection;

    public IntrinsicsMeasureScope(Density density, LayoutDirection layoutDirection2) {
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection2, "layoutDirection");
        this.layoutDirection = layoutDirection2;
        this.$$delegate_0 = density;
    }

    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Stable
    /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
    public int m37328roundToPxR2X_6o(long j) {
        return this.$$delegate_0.m38442roundToPxR2X_6o(j);
    }

    @Stable
    /* renamed from: roundToPx-0680j_4  reason: not valid java name */
    public int m37329roundToPx0680j_4(float f) {
        return this.$$delegate_0.m38443roundToPx0680j_4(f);
    }

    @Stable
    /* renamed from: toDp-GaN1DYA  reason: not valid java name */
    public float m37330toDpGaN1DYA(long j) {
        return this.$$delegate_0.m38444toDpGaN1DYA(j);
    }

    @Stable
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float m37331toDpu2uoSUM(float f) {
        return this.$$delegate_0.m38445toDpu2uoSUM(f);
    }

    @Stable
    /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
    public long m37333toDpSizekrfVVM(long j) {
        return this.$$delegate_0.m38447toDpSizekrfVVM(j);
    }

    @Stable
    /* renamed from: toPx--R2X_6o  reason: not valid java name */
    public float m37334toPxR2X_6o(long j) {
        return this.$$delegate_0.m38448toPxR2X_6o(j);
    }

    @Stable
    /* renamed from: toPx-0680j_4  reason: not valid java name */
    public float m37335toPx0680j_4(float f) {
        return this.$$delegate_0.m38449toPx0680j_4(f);
    }

    @Stable
    public Rect toRect(DpRect dpRect) {
        C12775o.m28639i(dpRect, "<this>");
        return this.$$delegate_0.toRect(dpRect);
    }

    @Stable
    /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
    public long m37336toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.m38450toSizeXkaWNTQ(j);
    }

    @Stable
    /* renamed from: toSp-0xMU5do  reason: not valid java name */
    public long m37337toSp0xMU5do(float f) {
        return this.$$delegate_0.m38451toSp0xMU5do(f);
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long m37338toSpkPz2Gy4(float f) {
        return this.$$delegate_0.m38452toSpkPz2Gy4(f);
    }

    @Stable
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float m37332toDpu2uoSUM(int i) {
        return this.$$delegate_0.m38446toDpu2uoSUM(i);
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long m37339toSpkPz2Gy4(int i) {
        return this.$$delegate_0.m38453toSpkPz2Gy4(i);
    }
}
