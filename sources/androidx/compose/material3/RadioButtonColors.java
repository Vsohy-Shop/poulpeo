package androidx.compose.material3;

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
public final class RadioButtonColors {
    private final long disabledSelectedColor;
    private final long disabledUnselectedColor;
    private final long selectedColor;
    private final long unselectedColor;

    public /* synthetic */ RadioButtonColors(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RadioButtonColors)) {
            return false;
        }
        RadioButtonColors radioButtonColors = (RadioButtonColors) obj;
        if (Color.m35672equalsimpl0(this.selectedColor, radioButtonColors.selectedColor) && Color.m35672equalsimpl0(this.unselectedColor, radioButtonColors.unselectedColor) && Color.m35672equalsimpl0(this.disabledSelectedColor, radioButtonColors.disabledSelectedColor) && Color.m35672equalsimpl0(this.disabledUnselectedColor, radioButtonColors.disabledUnselectedColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Color.m35678hashCodeimpl(this.selectedColor) * 31) + Color.m35678hashCodeimpl(this.unselectedColor)) * 31) + Color.m35678hashCodeimpl(this.disabledSelectedColor)) * 31) + Color.m35678hashCodeimpl(this.disabledUnselectedColor);
    }

    @Composable
    public final State<Color> radioColor$material3_release(boolean z, boolean z2, Composer composer, int i) {
        long j;
        State<Color> state;
        composer.startReplaceableGroup(-1840145292);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1840145292, i, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:182)");
        }
        if (z && z2) {
            j = this.selectedColor;
        } else if (z && !z2) {
            j = this.unselectedColor;
        } else if (z || !z2) {
            j = this.disabledUnselectedColor;
        } else {
            j = this.disabledSelectedColor;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(-1943770140);
            state = SingleValueAnimationKt.m32872animateColorAsStateKTwxG1Y(j2, AnimationSpecKt.tween$default(100, 0, (Easing) null, 6, (Object) null), (Function1<? super Color, C11921v>) null, composer, 48, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1943770035);
            state = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return state;
    }

    private RadioButtonColors(long j, long j2, long j3, long j4) {
        this.selectedColor = j;
        this.unselectedColor = j2;
        this.disabledSelectedColor = j3;
        this.disabledUnselectedColor = j4;
    }
}
