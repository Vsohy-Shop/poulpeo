package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.state.ToggleableState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

@Stable
/* compiled from: Checkbox.kt */
final class DefaultCheckboxColors implements CheckboxColors {
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

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.state.ToggleableState[] r0 = androidx.compose.p002ui.state.ToggleableState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.p002ui.state.ToggleableState.On     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.p002ui.state.ToggleableState.Indeterminate     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.p002ui.state.ToggleableState.Off     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DefaultCheckboxColors.WhenMappings.<clinit>():void");
        }
    }

    public /* synthetic */ DefaultCheckboxColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11);
    }

    @Composable
    public State<Color> borderColor(boolean z, ToggleableState toggleableState, Composer composer, int i) {
        long j;
        State<Color> state;
        int i2;
        C12775o.m28639i(toggleableState, "state");
        composer.startReplaceableGroup(-1568341342);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1568341342, i, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:451)");
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
            composer.startReplaceableGroup(-796405227);
            if (toggleableState == ToggleableState.Off) {
                i2 = 100;
            } else {
                i2 = 50;
            }
            state = SingleValueAnimationKt.m32872animateColorAsStateKTwxG1Y(j2, AnimationSpecKt.tween$default(i2, 0, (Easing) null, 6, (Object) null), (Function1<? super Color, C11921v>) null, composer, 0, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-796405041);
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
    public State<Color> boxColor(boolean z, ToggleableState toggleableState, Composer composer, int i) {
        long j;
        State<Color> state;
        int i2;
        C12775o.m28639i(toggleableState, "state");
        composer.startReplaceableGroup(840901029);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(840901029, i, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:426)");
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
            composer.startReplaceableGroup(-2010643468);
            if (toggleableState == ToggleableState.Off) {
                i2 = 100;
            } else {
                i2 = 50;
            }
            state = SingleValueAnimationKt.m32872animateColorAsStateKTwxG1Y(j2, AnimationSpecKt.tween$default(i2, 0, (Easing) null, 6, (Object) null), (Function1<? super Color, C11921v>) null, composer, 0, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-2010643282);
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
    public State<Color> checkmarkColor(ToggleableState toggleableState, Composer composer, int i) {
        long j;
        int i2;
        C12775o.m28639i(toggleableState, "state");
        composer.startReplaceableGroup(544656267);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(544656267, i, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:414)");
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

    private DefaultCheckboxColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
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
