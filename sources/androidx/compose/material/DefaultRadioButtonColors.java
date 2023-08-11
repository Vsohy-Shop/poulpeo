package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

@Immutable
/* compiled from: RadioButton.kt */
final class DefaultRadioButtonColors implements RadioButtonColors {
    private final long disabledColor;
    private final long selectedColor;
    private final long unselectedColor;

    public /* synthetic */ DefaultRadioButtonColors(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultRadioButtonColors.class != obj.getClass()) {
            return false;
        }
        DefaultRadioButtonColors defaultRadioButtonColors = (DefaultRadioButtonColors) obj;
        if (Color.m35672equalsimpl0(this.selectedColor, defaultRadioButtonColors.selectedColor) && Color.m35672equalsimpl0(this.unselectedColor, defaultRadioButtonColors.unselectedColor) && Color.m35672equalsimpl0(this.disabledColor, defaultRadioButtonColors.disabledColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Color.m35678hashCodeimpl(this.selectedColor) * 31) + Color.m35678hashCodeimpl(this.unselectedColor)) * 31) + Color.m35678hashCodeimpl(this.disabledColor);
    }

    @Composable
    public State<Color> radioColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        State<Color> state;
        composer.startReplaceableGroup(1243421834);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1243421834, i, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:187)");
        }
        if (!z) {
            j = this.disabledColor;
        } else if (!z2) {
            j = this.unselectedColor;
        } else {
            j = this.selectedColor;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(-1052799107);
            state = SingleValueAnimationKt.m32872animateColorAsStateKTwxG1Y(j2, AnimationSpecKt.tween$default(100, 0, (Easing) null, 6, (Object) null), (Function1<? super Color, C11921v>) null, composer, 48, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1052799002);
            state = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return state;
    }

    private DefaultRadioButtonColors(long j, long j2, long j3) {
        this.selectedColor = j;
        this.unselectedColor = j2;
        this.disabledColor = j3;
    }
}
