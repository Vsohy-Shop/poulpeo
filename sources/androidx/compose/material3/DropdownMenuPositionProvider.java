package androidx.compose.material3;

import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DpOffset;
import androidx.compose.p002ui.unit.IntRect;
import androidx.compose.p002ui.window.PopupPositionProvider;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p404of.C13088o;

@Immutable
/* compiled from: Menu.kt */
public final class DropdownMenuPositionProvider implements PopupPositionProvider {
    private final long contentOffset;
    private final Density density;
    private final C13088o<IntRect, IntRect, C11921v> onPositionCalculated;

    public /* synthetic */ DropdownMenuPositionProvider(long j, Density density2, C13088o oVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density2, oVar);
    }

    /* renamed from: copy-rOJDEFc$default  reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m34404copyrOJDEFc$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j, Density density2, C13088o<IntRect, IntRect, C11921v> oVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dropdownMenuPositionProvider.contentOffset;
        }
        if ((i & 2) != 0) {
            density2 = dropdownMenuPositionProvider.density;
        }
        if ((i & 4) != 0) {
            oVar = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m34407copyrOJDEFc(j, density2, oVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: calculatePosition-llwVHH4  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long m34405calculatePositionllwVHH4(androidx.compose.p002ui.unit.IntRect r15, long r16, androidx.compose.p002ui.unit.LayoutDirection r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            r2 = r18
            java.lang.String r3 = "anchorBounds"
            kotlin.jvm.internal.C12775o.m28639i(r15, r3)
            java.lang.String r3 = "layoutDirection"
            kotlin.jvm.internal.C12775o.m28639i(r2, r3)
            androidx.compose.ui.unit.Density r3 = r0.density
            float r4 = androidx.compose.material3.MenuKt.getMenuVerticalMargin()
            int r3 = r3.m38443roundToPx0680j_4(r4)
            androidx.compose.ui.unit.Density r4 = r0.density
            long r5 = r0.contentOffset
            float r5 = androidx.compose.p002ui.unit.DpOffset.m38529getXD9Ej5fM(r5)
            int r4 = r4.m38443roundToPx0680j_4(r5)
            androidx.compose.ui.unit.Density r5 = r0.density
            long r6 = r0.contentOffset
            float r6 = androidx.compose.p002ui.unit.DpOffset.m38531getYD9Ej5fM(r6)
            int r5 = r5.m38443roundToPx0680j_4(r6)
            int r6 = r15.getLeft()
            int r6 = r6 + r4
            int r7 = r15.getRight()
            int r7 = r7 - r4
            int r4 = androidx.compose.p002ui.unit.IntSize.m38628getWidthimpl(r19)
            int r7 = r7 - r4
            int r4 = androidx.compose.p002ui.unit.IntSize.m38628getWidthimpl(r16)
            int r8 = androidx.compose.p002ui.unit.IntSize.m38628getWidthimpl(r19)
            int r4 = r4 - r8
            androidx.compose.ui.unit.LayoutDirection r8 = androidx.compose.p002ui.unit.LayoutDirection.Ltr
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 0
            if (r2 != r8) goto L_0x0071
            java.lang.Integer[] r2 = new java.lang.Integer[r9]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r12] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r2[r11] = r6
            int r6 = r15.getLeft()
            if (r6 < 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r4 = r12
        L_0x0066:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r10] = r4
            vf.g r2 = p448vf.C13657m.m31275i(r2)
            goto L_0x0094
        L_0x0071:
            java.lang.Integer[] r2 = new java.lang.Integer[r9]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r2[r12] = r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r11] = r6
            int r6 = r15.getRight()
            int r8 = androidx.compose.p002ui.unit.IntSize.m38628getWidthimpl(r16)
            if (r6 > r8) goto L_0x008a
            r4 = r12
        L_0x008a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r10] = r4
            vf.g r2 = p448vf.C13657m.m31275i(r2)
        L_0x0094:
            java.util.Iterator r2 = r2.iterator()
        L_0x0098:
            boolean r4 = r2.hasNext()
            r6 = 0
            if (r4 == 0) goto L_0x00bd
            java.lang.Object r4 = r2.next()
            r8 = r4
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 < 0) goto L_0x00b9
            int r13 = androidx.compose.p002ui.unit.IntSize.m38628getWidthimpl(r19)
            int r8 = r8 + r13
            int r13 = androidx.compose.p002ui.unit.IntSize.m38628getWidthimpl(r16)
            if (r8 > r13) goto L_0x00b9
            r8 = r11
            goto L_0x00ba
        L_0x00b9:
            r8 = r12
        L_0x00ba:
            if (r8 == 0) goto L_0x0098
            goto L_0x00be
        L_0x00bd:
            r4 = r6
        L_0x00be:
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L_0x00c6
            int r7 = r4.intValue()
        L_0x00c6:
            int r2 = r15.getBottom()
            int r2 = r2 + r5
            int r2 = java.lang.Math.max(r2, r3)
            int r4 = r15.getTop()
            int r4 = r4 - r5
            int r5 = androidx.compose.p002ui.unit.IntSize.m38627getHeightimpl(r19)
            int r4 = r4 - r5
            int r5 = r15.getTop()
            int r8 = androidx.compose.p002ui.unit.IntSize.m38627getHeightimpl(r19)
            int r8 = r8 / r10
            int r5 = r5 - r8
            int r8 = androidx.compose.p002ui.unit.IntSize.m38627getHeightimpl(r16)
            int r13 = androidx.compose.p002ui.unit.IntSize.m38627getHeightimpl(r19)
            int r8 = r8 - r13
            int r8 = r8 - r3
            r13 = 4
            java.lang.Integer[] r13 = new java.lang.Integer[r13]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r13[r12] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r13[r11] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r13[r10] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r13[r9] = r2
            vf.g r2 = p448vf.C13657m.m31275i(r13)
            java.util.Iterator r2 = r2.iterator()
        L_0x0110:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0135
            java.lang.Object r5 = r2.next()
            r8 = r5
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 < r3) goto L_0x0131
            int r9 = androidx.compose.p002ui.unit.IntSize.m38627getHeightimpl(r19)
            int r8 = r8 + r9
            int r9 = androidx.compose.p002ui.unit.IntSize.m38627getHeightimpl(r16)
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0131
            r8 = r11
            goto L_0x0132
        L_0x0131:
            r8 = r12
        L_0x0132:
            if (r8 == 0) goto L_0x0110
            r6 = r5
        L_0x0135:
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x013d
            int r4 = r6.intValue()
        L_0x013d:
            of.o<androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect, ef.v> r2 = r0.onPositionCalculated
            androidx.compose.ui.unit.IntRect r3 = new androidx.compose.ui.unit.IntRect
            int r5 = androidx.compose.p002ui.unit.IntSize.m38628getWidthimpl(r19)
            int r5 = r5 + r7
            int r6 = androidx.compose.p002ui.unit.IntSize.m38627getHeightimpl(r19)
            int r6 = r6 + r4
            r3.<init>(r7, r4, r5, r6)
            r2.invoke(r15, r3)
            long r1 = androidx.compose.p002ui.unit.IntOffsetKt.IntOffset(r7, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DropdownMenuPositionProvider.m34405calculatePositionllwVHH4(androidx.compose.ui.unit.IntRect, long, androidx.compose.ui.unit.LayoutDirection, long):long");
    }

    /* renamed from: component1-RKDOV3M  reason: not valid java name */
    public final long m34406component1RKDOV3M() {
        return this.contentOffset;
    }

    public final Density component2() {
        return this.density;
    }

    public final C13088o<IntRect, IntRect, C11921v> component3() {
        return this.onPositionCalculated;
    }

    /* renamed from: copy-rOJDEFc  reason: not valid java name */
    public final DropdownMenuPositionProvider m34407copyrOJDEFc(long j, Density density2, C13088o<? super IntRect, ? super IntRect, C11921v> oVar) {
        C12775o.m28639i(density2, "density");
        C12775o.m28639i(oVar, "onPositionCalculated");
        return new DropdownMenuPositionProvider(j, density2, oVar, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
        if (DpOffset.m38528equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && C12775o.m28634d(this.density, dropdownMenuPositionProvider.density) && C12775o.m28634d(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated)) {
            return true;
        }
        return false;
    }

    /* renamed from: getContentOffset-RKDOV3M  reason: not valid java name */
    public final long m34408getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final C13088o<IntRect, IntRect, C11921v> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public int hashCode() {
        return (((DpOffset.m38533hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + DpOffset.m38536toStringimpl(this.contentOffset) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    private DropdownMenuPositionProvider(long j, Density density2, C13088o<? super IntRect, ? super IntRect, C11921v> oVar) {
        this.contentOffset = j;
        this.density = density2;
        this.onPositionCalculated = oVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DropdownMenuPositionProvider(long j, Density density2, C13088o oVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density2, (i & 4) != 0 ? C08481.INSTANCE : oVar, (DefaultConstructorMarker) null);
    }
}
