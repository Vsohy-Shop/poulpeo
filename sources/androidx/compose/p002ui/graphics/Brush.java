package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;

@Immutable
/* renamed from: androidx.compose.ui.graphics.Brush */
/* compiled from: Brush.kt */
public abstract class Brush {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final long intrinsicSize;

    @SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/Brush$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,655:1\n1#2:656\n*E\n"})
    /* renamed from: androidx.compose.ui.graphics.Brush$Companion */
    /* compiled from: Brush.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: horizontalGradient-8A-3gB4$default  reason: not valid java name */
        public static /* synthetic */ Brush m35610horizontalGradient8A3gB4$default(Companion companion, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m36075getClamp3opZhB0();
            }
            return companion.m35620horizontalGradient8A3gB4((List<Color>) list, f, f2, i);
        }

        /* renamed from: linearGradient-mHitzGk$default  reason: not valid java name */
        public static /* synthetic */ Brush m35613linearGradientmHitzGk$default(Companion companion, C11906l[] lVarArr, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m35438getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = Offset.Companion.m35436getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m36075getClamp3opZhB0();
            }
            return companion.m35623linearGradientmHitzGk((C11906l<Float, Color>[]) lVarArr, j3, j4, i);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default  reason: not valid java name */
        public static /* synthetic */ Brush m35615radialGradientP_VxKs$default(Companion companion, C11906l[] lVarArr, long j, float f, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m35437getUnspecifiedF1C5BW0();
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m36075getClamp3opZhB0();
            }
            return companion.m35625radialGradientP_VxKs((C11906l<Float, Color>[]) lVarArr, j2, f2, i);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default  reason: not valid java name */
        public static /* synthetic */ Brush m35617sweepGradientUv8p0NA$default(Companion companion, C11906l[] lVarArr, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = Offset.Companion.m35437getUnspecifiedF1C5BW0();
            }
            return companion.m35627sweepGradientUv8p0NA((C11906l<Float, Color>[]) lVarArr, j);
        }

        /* renamed from: verticalGradient-8A-3gB4$default  reason: not valid java name */
        public static /* synthetic */ Brush m35618verticalGradient8A3gB4$default(Companion companion, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m36075getClamp3opZhB0();
            }
            return companion.m35628verticalGradient8A3gB4((List<Color>) list, f, f2, i);
        }

        @Stable
        /* renamed from: horizontalGradient-8A-3gB4  reason: not valid java name */
        public final Brush m35620horizontalGradient8A3gB4(List<Color> list, float f, float f2, int i) {
            C12775o.m28639i(list, "colors");
            return m35622linearGradientmHitzGk(list, OffsetKt.Offset(f, 0.0f), OffsetKt.Offset(f2, 0.0f), i);
        }

        @Stable
        /* renamed from: linearGradient-mHitzGk  reason: not valid java name */
        public final Brush m35623linearGradientmHitzGk(C11906l<Float, Color>[] lVarArr, long j, long j2, int i) {
            C11906l<Float, Color>[] lVarArr2 = lVarArr;
            C12775o.m28639i(lVarArr, "colorStops");
            ArrayList arrayList = new ArrayList(r1);
            for (C11906l<Float, Color> d : lVarArr2) {
                arrayList.add(Color.m35661boximpl(d.mo49112d().m35681unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(r1);
            for (C11906l<Float, Color> c : lVarArr2) {
                arrayList2.add(Float.valueOf(c.mo49111c().floatValue()));
            }
            return new LinearGradient(arrayList, arrayList2, j, j2, i, (DefaultConstructorMarker) null);
        }

        @Stable
        /* renamed from: radialGradient-P_Vx-Ks  reason: not valid java name */
        public final Brush m35625radialGradientP_VxKs(C11906l<Float, Color>[] lVarArr, long j, float f, int i) {
            C12775o.m28639i(lVarArr, "colorStops");
            ArrayList arrayList = new ArrayList(r0);
            for (C11906l<Float, Color> d : lVarArr) {
                arrayList.add(Color.m35661boximpl(d.mo49112d().m35681unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(r0);
            for (C11906l<Float, Color> c : lVarArr) {
                arrayList2.add(Float.valueOf(c.mo49111c().floatValue()));
            }
            return new RadialGradient(arrayList, arrayList2, j, f, i, (DefaultConstructorMarker) null);
        }

        @Stable
        /* renamed from: sweepGradient-Uv8p0NA  reason: not valid java name */
        public final Brush m35627sweepGradientUv8p0NA(C11906l<Float, Color>[] lVarArr, long j) {
            C12775o.m28639i(lVarArr, "colorStops");
            ArrayList arrayList = new ArrayList(r0);
            for (C11906l<Float, Color> d : lVarArr) {
                arrayList.add(Color.m35661boximpl(d.mo49112d().m35681unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(r0);
            for (C11906l<Float, Color> c : lVarArr) {
                arrayList2.add(Float.valueOf(c.mo49111c().floatValue()));
            }
            return new SweepGradient(j, arrayList, arrayList2, (DefaultConstructorMarker) null);
        }

        @Stable
        /* renamed from: verticalGradient-8A-3gB4  reason: not valid java name */
        public final Brush m35628verticalGradient8A3gB4(List<Color> list, float f, float f2, int i) {
            C12775o.m28639i(list, "colors");
            return m35622linearGradientmHitzGk(list, OffsetKt.Offset(0.0f, f), OffsetKt.Offset(0.0f, f2), i);
        }

        @Stable
        /* renamed from: horizontalGradient-8A-3gB4  reason: not valid java name */
        public final Brush m35621horizontalGradient8A3gB4(C11906l<Float, Color>[] lVarArr, float f, float f2, int i) {
            C12775o.m28639i(lVarArr, "colorStops");
            return m35623linearGradientmHitzGk((C11906l<Float, Color>[]) (C11906l[]) Arrays.copyOf(lVarArr, lVarArr.length), OffsetKt.Offset(f, 0.0f), OffsetKt.Offset(f2, 0.0f), i);
        }

        @Stable
        /* renamed from: verticalGradient-8A-3gB4  reason: not valid java name */
        public final Brush m35629verticalGradient8A3gB4(C11906l<Float, Color>[] lVarArr, float f, float f2, int i) {
            C12775o.m28639i(lVarArr, "colorStops");
            return m35623linearGradientmHitzGk((C11906l<Float, Color>[]) (C11906l[]) Arrays.copyOf(lVarArr, lVarArr.length), OffsetKt.Offset(0.0f, f), OffsetKt.Offset(0.0f, f2), i);
        }

        /* renamed from: horizontalGradient-8A-3gB4$default  reason: not valid java name */
        public static /* synthetic */ Brush m35611horizontalGradient8A3gB4$default(Companion companion, C11906l[] lVarArr, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m36075getClamp3opZhB0();
            }
            return companion.m35621horizontalGradient8A3gB4((C11906l<Float, Color>[]) lVarArr, f, f2, i);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default  reason: not valid java name */
        public static /* synthetic */ Brush m35616sweepGradientUv8p0NA$default(Companion companion, List list, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = Offset.Companion.m35437getUnspecifiedF1C5BW0();
            }
            return companion.m35626sweepGradientUv8p0NA((List<Color>) list, j);
        }

        /* renamed from: verticalGradient-8A-3gB4$default  reason: not valid java name */
        public static /* synthetic */ Brush m35619verticalGradient8A3gB4$default(Companion companion, C11906l[] lVarArr, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m36075getClamp3opZhB0();
            }
            return companion.m35629verticalGradient8A3gB4((C11906l<Float, Color>[]) lVarArr, f, f2, i);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default  reason: not valid java name */
        public static /* synthetic */ Brush m35614radialGradientP_VxKs$default(Companion companion, List list, long j, float f, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m35437getUnspecifiedF1C5BW0();
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m36075getClamp3opZhB0();
            }
            return companion.m35624radialGradientP_VxKs((List<Color>) list, j2, f2, i);
        }

        @Stable
        /* renamed from: linearGradient-mHitzGk  reason: not valid java name */
        public final Brush m35622linearGradientmHitzGk(List<Color> list, long j, long j2, int i) {
            C12775o.m28639i(list, "colors");
            return new LinearGradient(list, (List) null, j, j2, i, (DefaultConstructorMarker) null);
        }

        @Stable
        /* renamed from: radialGradient-P_Vx-Ks  reason: not valid java name */
        public final Brush m35624radialGradientP_VxKs(List<Color> list, long j, float f, int i) {
            C12775o.m28639i(list, "colors");
            return new RadialGradient(list, (List) null, j, f, i, (DefaultConstructorMarker) null);
        }

        @Stable
        /* renamed from: sweepGradient-Uv8p0NA  reason: not valid java name */
        public final Brush m35626sweepGradientUv8p0NA(List<Color> list, long j) {
            C12775o.m28639i(list, "colors");
            return new SweepGradient(j, list, (List) null, (DefaultConstructorMarker) null);
        }

        /* renamed from: linearGradient-mHitzGk$default  reason: not valid java name */
        public static /* synthetic */ Brush m35612linearGradientmHitzGk$default(Companion companion, List list, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m35438getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = Offset.Companion.m35436getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m36075getClamp3opZhB0();
            }
            return companion.m35622linearGradientmHitzGk((List<Color>) list, j3, j4, i);
        }
    }

    public /* synthetic */ Brush(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: applyTo-Pq9zytI  reason: not valid java name */
    public abstract void m35608applyToPq9zytI(long j, Paint paint, float f);

    /* renamed from: getIntrinsicSize-NH-jbRc  reason: not valid java name */
    public long m35609getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    private Brush() {
        this.intrinsicSize = Size.Companion.m35499getUnspecifiedNHjbRc();
    }
}
