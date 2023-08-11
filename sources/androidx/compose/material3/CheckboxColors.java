package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.state.ToggleableState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

@Immutable
/* compiled from: Checkbox.kt */
public final class CheckboxColors {
    private final long checkedBorderColor;
    private final long checkedBoxColor;
    private final long checkedCheckmarkColor;
    private final long disabledBorderColor;
    private final long disabledCheckedBoxColor;
    private final long disabledIndeterminateBorderColor;
    private final long disabledIndeterminateBoxColor;
    private final long disabledUncheckedBoxColor;
    private final long uncheckedBorderColor;
    private final long uncheckedBoxColor;
    private final long uncheckedCheckmarkColor;

    /* compiled from: Checkbox.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            iArr[ToggleableState.Off.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CheckboxColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11);
    }

    @Composable
    public final State<Color> borderColor$material3_release(boolean z, ToggleableState toggleableState, Composer composer, int i) {
        long j;
        State<Color> state;
        int i2;
        C12775o.m28639i(toggleableState, "state");
        composer.startReplaceableGroup(1009643462);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009643462, i, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:446)");
        }
        if (z) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i3 == 1 || i3 == 2) {
                j = this.checkedBorderColor;
            } else if (i3 == 3) {
                j = this.uncheckedBorderColor;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int i4 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    j = this.disabledIndeterminateBorderColor;
                } else if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            j = this.disabledBorderColor;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(1209369334);
            if (toggleableState == ToggleableState.Off) {
                i2 = 100;
            } else {
                i2 = 50;
            }
            state = SingleValueAnimationKt.m32872animateColorAsStateKTwxG1Y(j2, AnimationSpecKt.tween$default(i2, 0, (Easing) null, 6, (Object) null), (Function1<? super Color, C11921v>) null, composer, 0, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1209369520);
            state = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return state;
    }

    @Composable
    public final State<Color> boxColor$material3_release(boolean z, ToggleableState toggleableState, Composer composer, int i) {
        long j;
        State<Color> state;
        int i2;
        C12775o.m28639i(toggleableState, "state");
        composer.startReplaceableGroup(360729865);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(360729865, i, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:415)");
        }
        if (z) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i3 == 1 || i3 == 2) {
                j = this.checkedBoxColor;
            } else if (i3 == 3) {
                j = this.uncheckedBoxColor;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int i4 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i4 == 1) {
                j = this.disabledCheckedBoxColor;
            } else if (i4 == 2) {
                j = this.disabledIndeterminateBoxColor;
            } else if (i4 == 3) {
                j = this.disabledUncheckedBoxColor;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(1143718194);
            if (toggleableState == ToggleableState.Off) {
                i2 = 100;
            } else {
                i2 = 50;
            }
            state = SingleValueAnimationKt.m32872animateColorAsStateKTwxG1Y(j2, AnimationSpecKt.tween$default(i2, 0, (Easing) null, 6, (Object) null), (Function1<? super Color, C11921v>) null, composer, 0, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1143718380);
            state = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return state;
    }

    @Composable
    public final State<Color> checkmarkColor$material3_release(ToggleableState toggleableState, Composer composer, int i) {
        long j;
        int i2;
        C12775o.m28639i(toggleableState, "state");
        composer.startReplaceableGroup(-507585681);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-507585681, i, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:396)");
        }
        ToggleableState toggleableState2 = ToggleableState.Off;
        if (toggleableState == toggleableState2) {
            j = this.uncheckedCheckmarkColor;
        } else {
            j = this.checkedCheckmarkColor;
        }
        long j2 = j;
        if (toggleableState == toggleableState2) {
            i2 = 100;
        } else {
            i2 = 50;
        }
        State<Color> r10 = SingleValueAnimationKt.m32872animateColorAsStateKTwxG1Y(j2, AnimationSpecKt.tween$default(i2, 0, (Easing) null, 6, (Object) null), (Function1<? super Color, C11921v>) null, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CheckboxColors)) {
            return false;
        }
        CheckboxColors checkboxColors = (CheckboxColors) obj;
        if (Color.m35672equalsimpl0(this.checkedCheckmarkColor, checkboxColors.checkedCheckmarkColor) && Color.m35672equalsimpl0(this.uncheckedCheckmarkColor, checkboxColors.uncheckedCheckmarkColor) && Color.m35672equalsimpl0(this.checkedBoxColor, checkboxColors.checkedBoxColor) && Color.m35672equalsimpl0(this.uncheckedBoxColor, checkboxColors.uncheckedBoxColor) && Color.m35672equalsimpl0(this.disabledCheckedBoxColor, checkboxColors.disabledCheckedBoxColor) && Color.m35672equalsimpl0(this.disabledUncheckedBoxColor, checkboxColors.disabledUncheckedBoxColor) && Color.m35672equalsimpl0(this.disabledIndeterminateBoxColor, checkboxColors.disabledIndeterminateBoxColor) && Color.m35672equalsimpl0(this.checkedBorderColor, checkboxColors.checkedBorderColor) && Color.m35672equalsimpl0(this.uncheckedBorderColor, checkboxColors.uncheckedBorderColor) && Color.m35672equalsimpl0(this.disabledBorderColor, checkboxColors.disabledBorderColor) && Color.m35672equalsimpl0(this.disabledIndeterminateBorderColor, checkboxColors.disabledIndeterminateBorderColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((Color.m35678hashCodeimpl(this.checkedCheckmarkColor) * 31) + Color.m35678hashCodeimpl(this.uncheckedCheckmarkColor)) * 31) + Color.m35678hashCodeimpl(this.checkedBoxColor)) * 31) + Color.m35678hashCodeimpl(this.uncheckedBoxColor)) * 31) + Color.m35678hashCodeimpl(this.disabledCheckedBoxColor)) * 31) + Color.m35678hashCodeimpl(this.disabledUncheckedBoxColor)) * 31) + Color.m35678hashCodeimpl(this.disabledIndeterminateBoxColor)) * 31) + Color.m35678hashCodeimpl(this.checkedBorderColor)) * 31) + Color.m35678hashCodeimpl(this.uncheckedBorderColor)) * 31) + Color.m35678hashCodeimpl(this.disabledBorderColor)) * 31) + Color.m35678hashCodeimpl(this.disabledIndeterminateBorderColor);
    }

    private CheckboxColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.checkedCheckmarkColor = j;
        this.uncheckedCheckmarkColor = j2;
        this.checkedBoxColor = j3;
        this.uncheckedBoxColor = j4;
        this.disabledCheckedBoxColor = j5;
        this.disabledUncheckedBoxColor = j6;
        this.disabledIndeterminateBoxColor = j7;
        this.checkedBorderColor = j8;
        this.uncheckedBorderColor = j9;
        this.disabledBorderColor = j10;
        this.disabledIndeterminateBorderColor = j11;
    }
}
