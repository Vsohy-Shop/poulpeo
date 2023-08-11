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
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Slider.kt */
final class SliderDefaults$Track$1$1 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ State<Color> $activeTickColor;
    final /* synthetic */ State<Color> $activeTrackColor;
    final /* synthetic */ State<Color> $inactiveTickColor;
    final /* synthetic */ State<Color> $inactiveTrackColor;
    final /* synthetic */ SliderPositions $sliderPositions;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderDefaults$Track$1$1(State<Color> state, SliderPositions sliderPositions, State<Color> state2, State<Color> state3, State<Color> state4) {
        super(1);
        this.$inactiveTrackColor = state;
        this.$sliderPositions = sliderPositions;
        this.$activeTrackColor = state2;
        this.$inactiveTickColor = state3;
        this.$activeTickColor = state4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        DrawScope drawScope2 = drawScope;
        C12775o.m28639i(drawScope2, "$this$Canvas");
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
        long Offset = OffsetKt.Offset(0.0f, Offset.m35423getYimpl(drawScope.m36273getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m35491getWidthimpl(drawScope.m36274getSizeNHjbRc()), Offset.m35423getYimpl(drawScope.m36273getCenterF1C5BW0()));
        long j = z ? Offset2 : Offset;
        long j2 = z ? Offset : Offset2;
        float r18 = drawScope2.m38449toPx0680j_4(SliderKt.TickSize);
        float r19 = drawScope2.m38449toPx0680j_4(SliderKt.getTrackHeight());
        long r2 = this.$inactiveTrackColor.getValue().m35681unboximpl();
        StrokeCap.Companion companion = StrokeCap.Companion;
        float f = r19;
        long j3 = j2;
        long j4 = j;
        DrawScope.m36242drawLineNGM6Ib0$default(drawScope, r2, j, j2, f, companion.m36055getRoundKaPHkGw(), (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
        DrawScope.m36242drawLineNGM6Ib0$default(drawScope, this.$activeTrackColor.getValue().m35681unboximpl(), OffsetKt.Offset(Offset.m35422getXimpl(j4) + ((Offset.m35422getXimpl(j3) - Offset.m35422getXimpl(j4)) * 0.0f), Offset.m35423getYimpl(drawScope.m36273getCenterF1C5BW0())), OffsetKt.Offset(Offset.m35422getXimpl(j4) + ((Offset.m35422getXimpl(j3) - Offset.m35422getXimpl(j4)) * this.$sliderPositions.getPositionFraction()), Offset.m35423getYimpl(drawScope.m36273getCenterF1C5BW0())), f, companion.m36055getRoundKaPHkGw(), (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
        float[] tickFractions = this.$sliderPositions.getTickFractions();
        SliderPositions sliderPositions = this.$sliderPositions;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = tickFractions.length;
        for (int i = 0; i < length; i++) {
            float f2 = tickFractions[i];
            Boolean valueOf = Boolean.valueOf(f2 > sliderPositions.getPositionFraction() || f2 < 0.0f);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(Float.valueOf(f2));
        }
        State<Color> state = this.$inactiveTickColor;
        State<Color> state2 = this.$activeTickColor;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            Iterable<Number> iterable = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(C12728x.m28544v(iterable, 10));
            for (Number floatValue : iterable) {
                arrayList.add(Offset.m35411boximpl(OffsetKt.Offset(Offset.m35422getXimpl(OffsetKt.m35445lerpWko1d7g(j4, j3, floatValue.floatValue())), Offset.m35423getYimpl(drawScope.m36273getCenterF1C5BW0()))));
            }
            long j5 = j4;
            long j6 = j3;
            DrawScope.m36247drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.Companion.m35989getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m35681unboximpl(), r18, StrokeCap.Companion.m36055getRoundKaPHkGw(), (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
            j3 = j6;
            j4 = j5;
        }
    }
}
