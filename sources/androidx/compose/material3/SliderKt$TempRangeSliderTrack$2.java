package androidx.compose.material3;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.PathEffect;
import androidx.compose.p002ui.graphics.PointMode;
import androidx.compose.p002ui.graphics.StrokeCap;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.State;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Slider.kt */
final class SliderKt$TempRangeSliderTrack$2 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ State<Color> $activeTickColor;
    final /* synthetic */ State<Color> $activeTrackColor;
    final /* synthetic */ State<Color> $inactiveTickColor;
    final /* synthetic */ State<Color> $inactiveTrackColor;
    final /* synthetic */ float $positionFractionEnd;
    final /* synthetic */ float $positionFractionStart;
    final /* synthetic */ C12757e0 $thumbRadiusPx;
    final /* synthetic */ float[] $tickFractions;
    final /* synthetic */ C12757e0 $tickSize;
    final /* synthetic */ float $trackStrokeWidth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$TempRangeSliderTrack$2(C12757e0 e0Var, State<Color> state, float f, float f2, float f3, State<Color> state2, float[] fArr, State<Color> state3, State<Color> state4, C12757e0 e0Var2) {
        super(1);
        this.$thumbRadiusPx = e0Var;
        this.$inactiveTrackColor = state;
        this.$trackStrokeWidth = f;
        this.$positionFractionEnd = f2;
        this.$positionFractionStart = f3;
        this.$activeTrackColor = state2;
        this.$tickFractions = fArr;
        this.$inactiveTickColor = state3;
        this.$activeTickColor = state4;
        this.$tickSize = e0Var2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "$this$Canvas");
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
        long Offset = OffsetKt.Offset(this.$thumbRadiusPx.f20408b, Offset.m35423getYimpl(drawScope.m36273getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m35491getWidthimpl(drawScope.m36274getSizeNHjbRc()) - this.$thumbRadiusPx.f20408b, Offset.m35423getYimpl(drawScope.m36273getCenterF1C5BW0()));
        long j = z ? Offset2 : Offset;
        long j2 = z ? Offset : Offset2;
        long r3 = this.$inactiveTrackColor.getValue().m35681unboximpl();
        float f = this.$trackStrokeWidth;
        StrokeCap.Companion companion = StrokeCap.Companion;
        long j3 = j2;
        long j4 = j;
        DrawScope.m36242drawLineNGM6Ib0$default(drawScope, r3, j, j2, f, companion.m36055getRoundKaPHkGw(), (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
        DrawScope.m36242drawLineNGM6Ib0$default(drawScope, this.$activeTrackColor.getValue().m35681unboximpl(), OffsetKt.Offset(Offset.m35422getXimpl(j4) + ((Offset.m35422getXimpl(j3) - Offset.m35422getXimpl(j4)) * this.$positionFractionStart), Offset.m35423getYimpl(drawScope.m36273getCenterF1C5BW0())), OffsetKt.Offset(Offset.m35422getXimpl(j4) + ((Offset.m35422getXimpl(j3) - Offset.m35422getXimpl(j4)) * this.$positionFractionEnd), Offset.m35423getYimpl(drawScope.m36273getCenterF1C5BW0())), this.$trackStrokeWidth, companion.m36055getRoundKaPHkGw(), (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
        float[] fArr = this.$tickFractions;
        float f2 = this.$positionFractionEnd;
        float f3 = this.$positionFractionStart;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f4 = fArr[i];
            Boolean valueOf = Boolean.valueOf(f4 > f2 || f4 < f3);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(Float.valueOf(f4));
        }
        State<Color> state = this.$inactiveTickColor;
        State<Color> state2 = this.$activeTickColor;
        C12757e0 e0Var = this.$tickSize;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            Iterable<Number> iterable = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(C12728x.m28544v(iterable, 10));
            for (Number floatValue : iterable) {
                arrayList.add(Offset.m35411boximpl(OffsetKt.Offset(Offset.m35422getXimpl(OffsetKt.m35445lerpWko1d7g(j4, j3, floatValue.floatValue())), Offset.m35423getYimpl(drawScope.m36273getCenterF1C5BW0()))));
            }
            long j5 = j3;
            long j6 = j4;
            DrawScope.m36247drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.Companion.m35989getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m35681unboximpl(), e0Var.f20408b, StrokeCap.Companion.m36055getRoundKaPHkGw(), (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
            j4 = j6;
            e0Var = e0Var;
            j3 = j5;
        }
    }
}
