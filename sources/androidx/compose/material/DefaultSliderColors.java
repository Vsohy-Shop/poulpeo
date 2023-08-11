package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* compiled from: Slider.kt */
final class DefaultSliderColors implements SliderColors {
    private final long activeTickColor;
    private final long activeTrackColor;
    private final long disabledActiveTickColor;
    private final long disabledActiveTrackColor;
    private final long disabledInactiveTickColor;
    private final long disabledInactiveTrackColor;
    private final long disabledThumbColor;
    private final long inactiveTickColor;
    private final long inactiveTrackColor;
    private final long thumbColor;

    public /* synthetic */ DefaultSliderColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultSliderColors.class != obj.getClass()) {
            return false;
        }
        DefaultSliderColors defaultSliderColors = (DefaultSliderColors) obj;
        if (Color.m35672equalsimpl0(this.thumbColor, defaultSliderColors.thumbColor) && Color.m35672equalsimpl0(this.disabledThumbColor, defaultSliderColors.disabledThumbColor) && Color.m35672equalsimpl0(this.activeTrackColor, defaultSliderColors.activeTrackColor) && Color.m35672equalsimpl0(this.inactiveTrackColor, defaultSliderColors.inactiveTrackColor) && Color.m35672equalsimpl0(this.disabledActiveTrackColor, defaultSliderColors.disabledActiveTrackColor) && Color.m35672equalsimpl0(this.disabledInactiveTrackColor, defaultSliderColors.disabledInactiveTrackColor) && Color.m35672equalsimpl0(this.activeTickColor, defaultSliderColors.activeTickColor) && Color.m35672equalsimpl0(this.inactiveTickColor, defaultSliderColors.inactiveTickColor) && Color.m35672equalsimpl0(this.disabledActiveTickColor, defaultSliderColors.disabledActiveTickColor) && Color.m35672equalsimpl0(this.disabledInactiveTickColor, defaultSliderColors.disabledInactiveTickColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((Color.m35678hashCodeimpl(this.thumbColor) * 31) + Color.m35678hashCodeimpl(this.disabledThumbColor)) * 31) + Color.m35678hashCodeimpl(this.activeTrackColor)) * 31) + Color.m35678hashCodeimpl(this.inactiveTrackColor)) * 31) + Color.m35678hashCodeimpl(this.disabledActiveTrackColor)) * 31) + Color.m35678hashCodeimpl(this.disabledInactiveTrackColor)) * 31) + Color.m35678hashCodeimpl(this.activeTickColor)) * 31) + Color.m35678hashCodeimpl(this.inactiveTickColor)) * 31) + Color.m35678hashCodeimpl(this.disabledActiveTickColor)) * 31) + Color.m35678hashCodeimpl(this.disabledInactiveTickColor);
    }

    @Composable
    public State<Color> thumbColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1733795637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1733795637, i, -1, "androidx.compose.material.DefaultSliderColors.thumbColor (Slider.kt:1085)");
        }
        if (z) {
            j = this.thumbColor;
        } else {
            j = this.disabledThumbColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public State<Color> tickColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1491563694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1491563694, i, -1, "androidx.compose.material.DefaultSliderColors.tickColor (Slider.kt:1101)");
        }
        if (z) {
            if (z2) {
                j = this.activeTickColor;
            } else {
                j = this.inactiveTickColor;
            }
        } else if (z2) {
            j = this.disabledActiveTickColor;
        } else {
            j = this.disabledInactiveTickColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public State<Color> trackColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1575395620);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1575395620, i, -1, "androidx.compose.material.DefaultSliderColors.trackColor (Slider.kt:1090)");
        }
        if (z) {
            if (z2) {
                j = this.activeTrackColor;
            } else {
                j = this.inactiveTrackColor;
            }
        } else if (z2) {
            j = this.disabledActiveTrackColor;
        } else {
            j = this.disabledInactiveTrackColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private DefaultSliderColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.thumbColor = j;
        this.disabledThumbColor = j2;
        this.activeTrackColor = j3;
        this.inactiveTrackColor = j4;
        this.disabledActiveTrackColor = j5;
        this.disabledInactiveTrackColor = j6;
        this.activeTickColor = j7;
        this.inactiveTickColor = j8;
        this.disabledActiveTickColor = j9;
        this.disabledInactiveTickColor = j10;
    }
}
