package androidx.compose.material3;

import androidx.compose.p002ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p002ui.util.MathHelpersKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p436tf.C13522b;

/* compiled from: Slider.kt */
final class SliderKt$sliderSemantics$1 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    final /* synthetic */ float $coerced;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function1<Float, C11921v> $onValueChange;
    final /* synthetic */ C13074a<C11921v> $onValueChangeFinished;
    final /* synthetic */ int $steps;
    final /* synthetic */ C13522b<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$sliderSemantics$1(boolean z, C13522b<Float> bVar, int i, float f, Function1<? super Float, C11921v> function1, C13074a<C11921v> aVar) {
        super(1);
        this.$enabled = z;
        this.$valueRange = bVar;
        this.$steps = i;
        this.$coerced = f;
        this.$onValueChange = function1;
        this.$onValueChangeFinished = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "$this$semantics");
        if (!this.$enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        final C13522b<Float> bVar = this.$valueRange;
        final int i = this.$steps;
        final float f = this.$coerced;
        final Function1<Float, C11921v> function1 = this.$onValueChange;
        final C13074a<C11921v> aVar = this.$onValueChangeFinished;
        SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, (String) null, new Function1<Float, Boolean>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).floatValue());
            }

            public final Boolean invoke(float f) {
                int i;
                float l = C13537l.m30885l(f, bVar.getStart().floatValue(), bVar.getEndInclusive().floatValue());
                int i2 = i;
                boolean z = false;
                if (i2 > 0 && (i = i2 + 1) >= 0) {
                    float f2 = l;
                    float f3 = f2;
                    int i3 = 0;
                    while (true) {
                        float lerp = MathHelpersKt.lerp(bVar.getStart().floatValue(), bVar.getEndInclusive().floatValue(), ((float) i3) / ((float) (i + 1)));
                        float f4 = lerp - l;
                        if (Math.abs(f4) <= f2) {
                            f2 = Math.abs(f4);
                            f3 = lerp;
                        }
                        if (i3 == i) {
                            break;
                        }
                        i3++;
                    }
                    l = f3;
                }
                if (!(l == f)) {
                    function1.invoke(Float.valueOf(l));
                    C13074a<C11921v> aVar = aVar;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, 1, (Object) null);
    }
}
