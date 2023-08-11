package androidx.compose.material;

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
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Track$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1189:1\n1477#2:1190\n1502#2,3:1191\n1505#2,3:1201\n1549#2:1205\n1620#2,3:1206\n361#3,7:1194\n215#4:1204\n216#4:1209\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Track$1\n*L\n774#1:1190\n774#1:1191,3\n774#1:1201,3\n777#1:1205\n777#1:1206,3\n774#1:1194,7\n775#1:1204\n775#1:1209\n*E\n"})
/* compiled from: Slider.kt */
final class SliderKt$Track$1 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ State<Color> $activeTickColor;
    final /* synthetic */ State<Color> $activeTrackColor;
    final /* synthetic */ State<Color> $inactiveTickColor;
    final /* synthetic */ State<Color> $inactiveTrackColor;
    final /* synthetic */ float $positionFractionEnd;
    final /* synthetic */ float $positionFractionStart;
    final /* synthetic */ float $thumbPx;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ float $trackStrokeWidth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$Track$1(float f, State<Color> state, float f2, float f3, float f4, State<Color> state2, List<Float> list, State<Color> state3, State<Color> state4) {
        super(1);
        this.$thumbPx = f;
        this.$inactiveTrackColor = state;
        this.$trackStrokeWidth = f2;
        this.$positionFractionEnd = f3;
        this.$positionFractionStart = f4;
        this.$activeTrackColor = state2;
        this.$tickFractions = list;
        this.$inactiveTickColor = state3;
        this.$activeTickColor = state4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "$this$Canvas");
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
        long Offset = OffsetKt.Offset(this.$thumbPx, Offset.m35423getYimpl(drawScope.m36273getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m35491getWidthimpl(drawScope.m36274getSizeNHjbRc()) - this.$thumbPx, Offset.m35423getYimpl(drawScope.m36273getCenterF1C5BW0()));
        long j = z ? Offset2 : Offset;
        long j2 = z ? Offset : Offset2;
        long r3 = this.$inactiveTrackColor.getValue().m35681unboximpl();
        float f = this.$trackStrokeWidth;
        StrokeCap.Companion companion = StrokeCap.Companion;
        long j3 = j2;
        long j4 = j;
        DrawScope.m36242drawLineNGM6Ib0$default(drawScope, r3, j, j2, f, companion.m36055getRoundKaPHkGw(), (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
        DrawScope.m36242drawLineNGM6Ib0$default(drawScope, this.$activeTrackColor.getValue().m35681unboximpl(), OffsetKt.Offset(Offset.m35422getXimpl(j4) + ((Offset.m35422getXimpl(j3) - Offset.m35422getXimpl(j4)) * this.$positionFractionStart), Offset.m35423getYimpl(drawScope.m36273getCenterF1C5BW0())), OffsetKt.Offset(Offset.m35422getXimpl(j4) + ((Offset.m35422getXimpl(j3) - Offset.m35422getXimpl(j4)) * this.$positionFractionEnd), Offset.m35423getYimpl(drawScope.m36273getCenterF1C5BW0())), this.$trackStrokeWidth, companion.m36055getRoundKaPHkGw(), (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
        float f2 = this.$positionFractionEnd;
        float f3 = this.$positionFractionStart;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : this.$tickFractions) {
            float floatValue = ((Number) next).floatValue();
            Boolean valueOf = Boolean.valueOf(floatValue > f2 || floatValue < f3);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(next);
        }
        State<Color> state = this.$inactiveTickColor;
        State<Color> state2 = this.$activeTickColor;
        float f4 = this.$trackStrokeWidth;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            Iterable<Number> iterable = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(C12728x.m28544v(iterable, 10));
            for (Number floatValue2 : iterable) {
                arrayList.add(Offset.m35411boximpl(OffsetKt.Offset(Offset.m35422getXimpl(OffsetKt.m35445lerpWko1d7g(j4, j3, floatValue2.floatValue())), Offset.m35423getYimpl(drawScope.m36273getCenterF1C5BW0()))));
            }
            long j5 = j3;
            long j6 = j4;
            DrawScope.m36247drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.Companion.m35989getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m35681unboximpl(), f4, StrokeCap.Companion.m36055getRoundKaPHkGw(), (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
            j4 = j6;
            f4 = f4;
            j3 = j5;
        }
    }
}
