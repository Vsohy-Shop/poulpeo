package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Slider.kt */
final class SliderKt$TempRangeSliderThumb$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C13089p<BoxScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ float $offset;
    final /* synthetic */ BoxScope $this_TempRangeSliderThumb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$TempRangeSliderThumb$1(BoxScope boxScope, float f, C13089p<? super BoxScope, ? super Composer, ? super Integer, C11921v> pVar, int i) {
        super(2);
        this.$this_TempRangeSliderThumb = boxScope;
        this.$offset = f;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        SliderKt.m34561TempRangeSliderThumbrAjV9yQ(this.$this_TempRangeSliderThumb, this.$offset, this.$content, composer, this.$$changed | 1);
    }
}
