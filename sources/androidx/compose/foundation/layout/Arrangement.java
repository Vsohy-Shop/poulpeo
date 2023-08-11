package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@Immutable
@SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,709:1\n700#1,2:715\n703#1,5:720\n700#1,2:725\n703#1,5:730\n700#1,2:738\n703#1,5:743\n700#1,2:751\n703#1,5:756\n700#1,2:764\n703#1,5:769\n700#1,2:777\n703#1,5:782\n155#2:710\n155#2:711\n13032#3,3:712\n13674#3,3:717\n13674#3,3:727\n13032#3,3:735\n13674#3,3:740\n13032#3,3:748\n13674#3,3:753\n13032#3,3:761\n13674#3,3:766\n13032#3,3:774\n13674#3,3:779\n13674#3,3:787\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n*L\n618#1:715,2\n618#1:720,5\n626#1:725,2\n626#1:730,5\n640#1:738,2\n640#1:743,5\n655#1:751,2\n655#1:756,5\n674#1:764,2\n674#1:769,5\n693#1:777,2\n693#1:782,5\n354#1:710\n366#1:711\n616#1:712,3\n618#1:717,3\n626#1:727,3\n638#1:735,3\n640#1:740,3\n652#1:748,3\n655#1:753,3\n667#1:761,3\n674#1:766,3\n686#1:774,3\n693#1:779,3\n701#1:787,3\n*E\n"})
/* compiled from: Arrangement.kt */
public final class Arrangement {
    public static final int $stable = 0;
    private static final Vertical Bottom = new Arrangement$Bottom$1();
    private static final HorizontalOrVertical Center = new Arrangement$Center$1();
    private static final Horizontal End = new Arrangement$End$1();
    public static final Arrangement INSTANCE = new Arrangement();
    private static final HorizontalOrVertical SpaceAround = new Arrangement$SpaceAround$1();
    private static final HorizontalOrVertical SpaceBetween = new Arrangement$SpaceBetween$1();
    private static final HorizontalOrVertical SpaceEvenly = new Arrangement$SpaceEvenly$1();
    private static final Horizontal Start = new Arrangement$Start$1();
    private static final Vertical Top = new Arrangement$Top$1();

    @Immutable
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n*L\n555#1:710\n*E\n"})
    /* compiled from: Arrangement.kt */
    public static final class Absolute {
        public static final int $stable = 0;
        private static final Horizontal Center = new Arrangement$Absolute$Center$1();
        public static final Absolute INSTANCE = new Absolute();
        private static final Horizontal Left = new Arrangement$Absolute$Left$1();
        private static final Horizontal Right = new Arrangement$Absolute$Right$1();
        private static final Horizontal SpaceAround = new Arrangement$Absolute$SpaceAround$1();
        private static final Horizontal SpaceBetween = new Arrangement$Absolute$SpaceBetween$1();
        private static final Horizontal SpaceEvenly = new Arrangement$Absolute$SpaceEvenly$1();

        private Absolute() {
        }

        @Stable
        public final Horizontal aligned(Alignment.Horizontal horizontal) {
            C12775o.m28639i(horizontal, "alignment");
            return new SpacedAligned(C1232Dp.m38468constructorimpl((float) 0), false, new Arrangement$Absolute$aligned$1(horizontal), (DefaultConstructorMarker) null);
        }

        public final Horizontal getCenter() {
            return Center;
        }

        public final Horizontal getLeft() {
            return Left;
        }

        public final Horizontal getRight() {
            return Right;
        }

        public final Horizontal getSpaceAround() {
            return SpaceAround;
        }

        public final Horizontal getSpaceBetween() {
            return SpaceBetween;
        }

        public final Horizontal getSpaceEvenly() {
            return SpaceEvenly;
        }

        @Stable
        /* renamed from: spacedBy-0680j_4  reason: not valid java name */
        public final HorizontalOrVertical m33188spacedBy0680j_4(float f) {
            return new SpacedAligned(f, false, (C13088o) null, (DefaultConstructorMarker) null);
        }

        @Stable
        /* renamed from: spacedBy-D5KLDUw  reason: not valid java name */
        public final Horizontal m33189spacedByD5KLDUw(float f, Alignment.Horizontal horizontal) {
            C12775o.m28639i(horizontal, "alignment");
            return new SpacedAligned(f, false, new Arrangement$Absolute$spacedBy$1(horizontal), (DefaultConstructorMarker) null);
        }

        @Stable
        /* renamed from: spacedBy-D5KLDUw  reason: not valid java name */
        public final Vertical m33190spacedByD5KLDUw(float f, Alignment.Vertical vertical) {
            C12775o.m28639i(vertical, "alignment");
            return new SpacedAligned(f, false, new Arrangement$Absolute$spacedBy$2(vertical), (DefaultConstructorMarker) null);
        }

        @Stable
        public static /* synthetic */ void getCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getLeft$annotations() {
        }

        @Stable
        public static /* synthetic */ void getRight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceAround$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceBetween$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceEvenly$annotations() {
        }
    }

    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n*L\n50#1:710\n*E\n"})
    @Stable
    /* compiled from: Arrangement.kt */
    public interface Horizontal {

        /* compiled from: Arrangement.kt */
        public static final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM  reason: not valid java name */
            public static float m33194getSpacingD9Ej5fM(Horizontal horizontal) {
                return Horizontal.super.m33193getSpacingD9Ej5fM();
            }
        }

        void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);

        /* renamed from: getSpacing-D9Ej5fM  reason: not valid java name */
        float m33193getSpacingD9Ej5fM() {
            return C1232Dp.m38468constructorimpl((float) 0);
        }
    }

    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n*L\n107#1:710\n*E\n"})
    @Stable
    /* compiled from: Arrangement.kt */
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        /* compiled from: Arrangement.kt */
        public static final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM  reason: not valid java name */
            public static float m33197getSpacingD9Ej5fM(HorizontalOrVertical horizontalOrVertical) {
                return HorizontalOrVertical.super.m33196getSpacingD9Ej5fM();
            }
        }

        /* renamed from: getSpacing-D9Ej5fM  reason: not valid java name */
        float m33196getSpacingD9Ej5fM() {
            return C1232Dp.m38468constructorimpl((float) 0);
        }
    }

    @Immutable
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n+ 2 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,709:1\n700#2,2:710\n703#2,5:715\n13674#3,3:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n*L\n585#1:710,2\n585#1:715,5\n585#1:712,3\n*E\n"})
    /* compiled from: Arrangement.kt */
    public static final class SpacedAligned implements HorizontalOrVertical {
        private final C13088o<Integer, LayoutDirection, Integer> alignment;
        private final boolean rtlMirror;
        private final float space;
        private final float spacing;

        public /* synthetic */ SpacedAligned(float f, boolean z, C13088o oVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, z, oVar);
        }

        /* renamed from: copy-8Feqmps$default  reason: not valid java name */
        public static /* synthetic */ SpacedAligned m33201copy8Feqmps$default(SpacedAligned spacedAligned, float f, boolean z, C13088o<Integer, LayoutDirection, Integer> oVar, int i, Object obj) {
            if ((i & 1) != 0) {
                f = spacedAligned.space;
            }
            if ((i & 2) != 0) {
                z = spacedAligned.rtlMirror;
            }
            if ((i & 4) != 0) {
                oVar = spacedAligned.alignment;
            }
            return spacedAligned.m33203copy8Feqmps(f, z, oVar);
        }

        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i2;
            int i3;
            C12775o.m28639i(density, "<this>");
            C12775o.m28639i(iArr, "sizes");
            C12775o.m28639i(layoutDirection, "layoutDirection");
            C12775o.m28639i(iArr2, "outPositions");
            if (!(iArr.length == 0)) {
                int r10 = density.m38443roundToPx0680j_4(this.space);
                boolean z = this.rtlMirror && layoutDirection == LayoutDirection.Rtl;
                Arrangement arrangement = Arrangement.INSTANCE;
                if (!z) {
                    int length = iArr.length;
                    int i4 = 0;
                    i3 = 0;
                    i2 = 0;
                    int i5 = 0;
                    while (i4 < length) {
                        int i6 = iArr[i4];
                        int min = Math.min(i3, i - i6);
                        iArr2[i5] = min;
                        int min2 = Math.min(r10, (i - min) - i6);
                        int i7 = iArr2[i5] + i6 + min2;
                        i4++;
                        i5++;
                        int i8 = i7;
                        i2 = min2;
                        i3 = i8;
                    }
                } else {
                    int i9 = 0;
                    int i10 = 0;
                    for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                        int i11 = iArr[length2];
                        int min3 = Math.min(i3, i - i11);
                        iArr2[length2] = min3;
                        i10 = Math.min(r10, (i - min3) - i11);
                        i9 = iArr2[length2] + i11 + i10;
                    }
                }
                int i12 = i3 - i2;
                C13088o<Integer, LayoutDirection, Integer> oVar = this.alignment;
                if (oVar != null && i12 < i) {
                    int intValue = oVar.invoke(Integer.valueOf(i - i12), layoutDirection).intValue();
                    int length3 = iArr2.length;
                    for (int i13 = 0; i13 < length3; i13++) {
                        iArr2[i13] = iArr2[i13] + intValue;
                    }
                }
            }
        }

        /* renamed from: component1-D9Ej5fM  reason: not valid java name */
        public final float m33202component1D9Ej5fM() {
            return this.space;
        }

        public final boolean component2() {
            return this.rtlMirror;
        }

        public final C13088o<Integer, LayoutDirection, Integer> component3() {
            return this.alignment;
        }

        /* renamed from: copy-8Feqmps  reason: not valid java name */
        public final SpacedAligned m33203copy8Feqmps(float f, boolean z, C13088o<? super Integer, ? super LayoutDirection, Integer> oVar) {
            return new SpacedAligned(f, z, oVar, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpacedAligned)) {
                return false;
            }
            SpacedAligned spacedAligned = (SpacedAligned) obj;
            if (C1232Dp.m38473equalsimpl0(this.space, spacedAligned.space) && this.rtlMirror == spacedAligned.rtlMirror && C12775o.m28634d(this.alignment, spacedAligned.alignment)) {
                return true;
            }
            return false;
        }

        public final C13088o<Integer, LayoutDirection, Integer> getAlignment() {
            return this.alignment;
        }

        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        /* renamed from: getSpace-D9Ej5fM  reason: not valid java name */
        public final float m33204getSpaceD9Ej5fM() {
            return this.space;
        }

        /* renamed from: getSpacing-D9Ej5fM  reason: not valid java name */
        public float m33205getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public int hashCode() {
            int i;
            int r0 = C1232Dp.m38474hashCodeimpl(this.space) * 31;
            boolean z = this.rtlMirror;
            if (z) {
                z = true;
            }
            int i2 = (r0 + (z ? 1 : 0)) * 31;
            C13088o<Integer, LayoutDirection, Integer> oVar = this.alignment;
            if (oVar == null) {
                i = 0;
            } else {
                i = oVar.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            if (this.rtlMirror) {
                str = "";
            } else {
                str = "Absolute";
            }
            sb.append(str);
            sb.append("Arrangement#spacedAligned(");
            sb.append(C1232Dp.m38479toStringimpl(this.space));
            sb.append(", ");
            sb.append(this.alignment);
            sb.append(')');
            return sb.toString();
        }

        private SpacedAligned(float f, boolean z, C13088o<? super Integer, ? super LayoutDirection, Integer> oVar) {
            this.space = f;
            this.rtlMirror = z;
            this.alignment = oVar;
            this.spacing = f;
        }

        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            C12775o.m28639i(density, "<this>");
            C12775o.m28639i(iArr, "sizes");
            C12775o.m28639i(iArr2, "outPositions");
            arrange(density, i, iArr, LayoutDirection.Ltr, iArr2);
        }
    }

    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n*L\n79#1:710\n*E\n"})
    @Stable
    /* compiled from: Arrangement.kt */
    public interface Vertical {

        /* compiled from: Arrangement.kt */
        public static final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM  reason: not valid java name */
            public static float m33208getSpacingD9Ej5fM(Vertical vertical) {
                return Vertical.super.m33207getSpacingD9Ej5fM();
            }
        }

        void arrange(Density density, int i, int[] iArr, int[] iArr2);

        /* renamed from: getSpacing-D9Ej5fM  reason: not valid java name */
        float m33207getSpacingD9Ej5fM() {
            return C1232Dp.m38468constructorimpl((float) 0);
        }
    }

    private Arrangement() {
    }

    private final void forEachIndexed(int[] iArr, boolean z, C13088o<? super Integer, ? super Integer, C11921v> oVar) {
        if (!z) {
            int length = iArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                oVar.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i]));
                i++;
                i2++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                oVar.invoke(Integer.valueOf(length2), Integer.valueOf(iArr[length2]));
            } else {
                return;
            }
        }
    }

    @Stable
    public final Horizontal aligned(Alignment.Horizontal horizontal) {
        C12775o.m28639i(horizontal, "alignment");
        return new SpacedAligned(C1232Dp.m38468constructorimpl((float) 0), true, new Arrangement$aligned$1(horizontal), (DefaultConstructorMarker) null);
    }

    public final Vertical getBottom() {
        return Bottom;
    }

    public final HorizontalOrVertical getCenter() {
        return Center;
    }

    public final Horizontal getEnd() {
        return End;
    }

    public final HorizontalOrVertical getSpaceAround() {
        return SpaceAround;
    }

    public final HorizontalOrVertical getSpaceBetween() {
        return SpaceBetween;
    }

    public final HorizontalOrVertical getSpaceEvenly() {
        return SpaceEvenly;
    }

    public final Horizontal getStart() {
        return Start;
    }

    public final Vertical getTop() {
        return Top;
    }

    public final void placeCenter$foundation_layout_release(int i, int[] iArr, int[] iArr2, boolean z) {
        C12775o.m28639i(iArr, "size");
        C12775o.m28639i(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = ((float) (i - i3)) / ((float) 2);
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = C13265c.m30134c(f);
                f += (float) i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i7 = iArr[length2];
                iArr2[length2] = C13265c.m30134c(f);
                f += (float) i7;
            } else {
                return;
            }
        }
    }

    public final void placeLeftOrTop$foundation_layout_release(int[] iArr, int[] iArr2, boolean z) {
        C12775o.m28639i(iArr, "size");
        C12775o.m28639i(iArr2, "outPosition");
        int i = 0;
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                iArr2[i2] = i3;
                i3 += i4;
                i++;
                i2++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i5 = iArr[length2];
                iArr2[length2] = i;
                i += i5;
            } else {
                return;
            }
        }
    }

    public final void placeRightOrBottom$foundation_layout_release(int i, int[] iArr, int[] iArr2, boolean z) {
        C12775o.m28639i(iArr, "size");
        C12775o.m28639i(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i8 = iArr[length2];
                iArr2[length2] = i5;
                i5 += i8;
            } else {
                return;
            }
        }
    }

    public final void placeSpaceAround$foundation_layout_release(int i, int[] iArr, int[] iArr2, boolean z) {
        boolean z2;
        float f;
        C12775o.m28639i(iArr, "size");
        C12775o.m28639i(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        if (iArr.length == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            f = ((float) (i - i3)) / ((float) iArr.length);
        } else {
            f = 0.0f;
        }
        float f2 = f / ((float) 2);
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = C13265c.m30134c(f2);
                f2 += ((float) i6) + f;
                i2++;
                i5++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i7 = iArr[length2];
            iArr2[length2] = C13265c.m30134c(f2);
            f2 += ((float) i7) + f;
        }
    }

    public final void placeSpaceBetween$foundation_layout_release(int i, int[] iArr, int[] iArr2, boolean z) {
        float f;
        C12775o.m28639i(iArr, "size");
        C12775o.m28639i(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f2 = 0.0f;
        if (iArr.length > 1) {
            f = ((float) (i - i3)) / ((float) (iArr.length - 1));
        } else {
            f = 0.0f;
        }
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = C13265c.m30134c(f2);
                f2 += ((float) i6) + f;
                i2++;
                i5++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i7 = iArr[length2];
            iArr2[length2] = C13265c.m30134c(f2);
            f2 += ((float) i7) + f;
        }
    }

    public final void placeSpaceEvenly$foundation_layout_release(int i, int[] iArr, int[] iArr2, boolean z) {
        C12775o.m28639i(iArr, "size");
        C12775o.m28639i(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = ((float) (i - i3)) / ((float) (iArr.length + 1));
        if (!z) {
            int length2 = iArr.length;
            float f = length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = C13265c.m30134c(f);
                f += ((float) i6) + length;
                i2++;
                i5++;
            }
            return;
        }
        float f2 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i7 = iArr[length3];
            iArr2[length3] = C13265c.m30134c(f2);
            f2 += ((float) i7) + length;
        }
    }

    @Stable
    /* renamed from: spacedBy-0680j_4  reason: not valid java name */
    public final HorizontalOrVertical m33185spacedBy0680j_4(float f) {
        return new SpacedAligned(f, true, Arrangement$spacedBy$1.INSTANCE, (DefaultConstructorMarker) null);
    }

    @Stable
    /* renamed from: spacedBy-D5KLDUw  reason: not valid java name */
    public final Horizontal m33186spacedByD5KLDUw(float f, Alignment.Horizontal horizontal) {
        C12775o.m28639i(horizontal, "alignment");
        return new SpacedAligned(f, true, new Arrangement$spacedBy$2(horizontal), (DefaultConstructorMarker) null);
    }

    @Stable
    /* renamed from: spacedBy-D5KLDUw  reason: not valid java name */
    public final Vertical m33187spacedByD5KLDUw(float f, Alignment.Vertical vertical) {
        C12775o.m28639i(vertical, "alignment");
        return new SpacedAligned(f, false, new Arrangement$spacedBy$3(vertical), (DefaultConstructorMarker) null);
    }

    @Stable
    public final Vertical aligned(Alignment.Vertical vertical) {
        C12775o.m28639i(vertical, "alignment");
        return new SpacedAligned(C1232Dp.m38468constructorimpl((float) 0), false, new Arrangement$aligned$2(vertical), (DefaultConstructorMarker) null);
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getCenter$annotations() {
    }

    @Stable
    public static /* synthetic */ void getEnd$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceAround$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceBetween$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceEvenly$annotations() {
    }

    @Stable
    public static /* synthetic */ void getStart$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }
}
