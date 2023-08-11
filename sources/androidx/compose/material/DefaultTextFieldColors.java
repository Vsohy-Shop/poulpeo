package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@Immutable
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/DefaultTextFieldColors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,855:1\n76#2:856\n76#2:857\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/DefaultTextFieldColors\n*L\n726#1:856\n757#1:857\n*E\n"})
/* compiled from: TextFieldDefaults.kt */
final class DefaultTextFieldColors implements TextFieldColors {
    private final long backgroundColor;
    private final long cursorColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorTrailingIconColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long leadingIconColor;
    private final long placeholderColor;
    private final long textColor;
    private final long trailingIconColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;

    public /* synthetic */ DefaultTextFieldColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21);
    }

    private static final boolean indicatorColor$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean labelColor$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @Composable
    public State<Color> backgroundColor(boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(-1423938813);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1423938813, i, -1, "androidx.compose.material.DefaultTextFieldColors.backgroundColor (TextFieldDefaults.kt:741)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(this.backgroundColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public State<Color> cursorColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1446422485);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1446422485, i, -1, "androidx.compose.material.DefaultTextFieldColors.cursorColor (TextFieldDefaults.kt:773)");
        }
        if (z) {
            j = this.errorCursorColor;
        } else {
            j = this.cursorColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultTextFieldColors.class != obj.getClass()) {
            return false;
        }
        DefaultTextFieldColors defaultTextFieldColors = (DefaultTextFieldColors) obj;
        if (Color.m35672equalsimpl0(this.textColor, defaultTextFieldColors.textColor) && Color.m35672equalsimpl0(this.disabledTextColor, defaultTextFieldColors.disabledTextColor) && Color.m35672equalsimpl0(this.cursorColor, defaultTextFieldColors.cursorColor) && Color.m35672equalsimpl0(this.errorCursorColor, defaultTextFieldColors.errorCursorColor) && Color.m35672equalsimpl0(this.focusedIndicatorColor, defaultTextFieldColors.focusedIndicatorColor) && Color.m35672equalsimpl0(this.unfocusedIndicatorColor, defaultTextFieldColors.unfocusedIndicatorColor) && Color.m35672equalsimpl0(this.errorIndicatorColor, defaultTextFieldColors.errorIndicatorColor) && Color.m35672equalsimpl0(this.disabledIndicatorColor, defaultTextFieldColors.disabledIndicatorColor) && Color.m35672equalsimpl0(this.leadingIconColor, defaultTextFieldColors.leadingIconColor) && Color.m35672equalsimpl0(this.disabledLeadingIconColor, defaultTextFieldColors.disabledLeadingIconColor) && Color.m35672equalsimpl0(this.errorLeadingIconColor, defaultTextFieldColors.errorLeadingIconColor) && Color.m35672equalsimpl0(this.trailingIconColor, defaultTextFieldColors.trailingIconColor) && Color.m35672equalsimpl0(this.disabledTrailingIconColor, defaultTextFieldColors.disabledTrailingIconColor) && Color.m35672equalsimpl0(this.errorTrailingIconColor, defaultTextFieldColors.errorTrailingIconColor) && Color.m35672equalsimpl0(this.backgroundColor, defaultTextFieldColors.backgroundColor) && Color.m35672equalsimpl0(this.focusedLabelColor, defaultTextFieldColors.focusedLabelColor) && Color.m35672equalsimpl0(this.unfocusedLabelColor, defaultTextFieldColors.unfocusedLabelColor) && Color.m35672equalsimpl0(this.disabledLabelColor, defaultTextFieldColors.disabledLabelColor) && Color.m35672equalsimpl0(this.errorLabelColor, defaultTextFieldColors.errorLabelColor) && Color.m35672equalsimpl0(this.placeholderColor, defaultTextFieldColors.placeholderColor) && Color.m35672equalsimpl0(this.disabledPlaceholderColor, defaultTextFieldColors.disabledPlaceholderColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((Color.m35678hashCodeimpl(this.textColor) * 31) + Color.m35678hashCodeimpl(this.disabledTextColor)) * 31) + Color.m35678hashCodeimpl(this.cursorColor)) * 31) + Color.m35678hashCodeimpl(this.errorCursorColor)) * 31) + Color.m35678hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m35678hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m35678hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m35678hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m35678hashCodeimpl(this.leadingIconColor)) * 31) + Color.m35678hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m35678hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m35678hashCodeimpl(this.trailingIconColor)) * 31) + Color.m35678hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m35678hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m35678hashCodeimpl(this.backgroundColor)) * 31) + Color.m35678hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m35678hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m35678hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m35678hashCodeimpl(this.errorLabelColor)) * 31) + Color.m35678hashCodeimpl(this.placeholderColor)) * 31) + Color.m35678hashCodeimpl(this.disabledPlaceholderColor);
    }

    @Composable
    public State<Color> indicatorColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        State<Color> state;
        C12775o.m28639i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(998675979);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(998675979, i, -1, "androidx.compose.material.DefaultTextFieldColors.indicatorColor (TextFieldDefaults.kt:720)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledIndicatorColor;
        } else if (z2) {
            j = this.errorIndicatorColor;
        } else if (indicatorColor$lambda$0(collectIsFocusedAsState)) {
            j = this.focusedIndicatorColor;
        } else {
            j = this.unfocusedIndicatorColor;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(-2054190397);
            state = SingleValueAnimationKt.m32872animateColorAsStateKTwxG1Y(j2, AnimationSpecKt.tween$default(150, 0, (Easing) null, 6, (Object) null), (Function1<? super Color, C11921v>) null, composer, 48, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-2054190292);
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
    public State<Color> labelColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        C12775o.m28639i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(727091888);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(727091888, i, -1, "androidx.compose.material.DefaultTextFieldColors.labelColor (TextFieldDefaults.kt:751)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledLabelColor;
        } else if (z2) {
            j = this.errorLabelColor;
        } else if (labelColor$lambda$1(collectIsFocusedAsState)) {
            j = this.focusedLabelColor;
        } else {
            j = this.unfocusedLabelColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public State<Color> leadingIconColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1016171324);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1016171324, i, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:698)");
        }
        if (!z) {
            j = this.disabledLeadingIconColor;
        } else if (z2) {
            j = this.errorLeadingIconColor;
        } else {
            j = this.leadingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public State<Color> placeholderColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(264799724);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(264799724, i, -1, "androidx.compose.material.DefaultTextFieldColors.placeholderColor (TextFieldDefaults.kt:746)");
        }
        if (z) {
            j = this.placeholderColor;
        } else {
            j = this.disabledPlaceholderColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public State<Color> textColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(9804418);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(9804418, i, -1, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:768)");
        }
        if (z) {
            j = this.textColor;
        } else {
            j = this.disabledTextColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public State<Color> trailingIconColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(225259054);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(225259054, i, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:709)");
        }
        if (!z) {
            j = this.disabledTrailingIconColor;
        } else if (z2) {
            j = this.errorTrailingIconColor;
        } else {
            j = this.trailingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private DefaultTextFieldColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.textColor = j;
        this.disabledTextColor = j2;
        this.cursorColor = j3;
        this.errorCursorColor = j4;
        this.focusedIndicatorColor = j5;
        this.unfocusedIndicatorColor = j6;
        this.errorIndicatorColor = j7;
        this.disabledIndicatorColor = j8;
        this.leadingIconColor = j9;
        this.disabledLeadingIconColor = j10;
        this.errorLeadingIconColor = j11;
        this.trailingIconColor = j12;
        this.disabledTrailingIconColor = j13;
        this.errorTrailingIconColor = j14;
        this.backgroundColor = j15;
        this.focusedLabelColor = j16;
        this.unfocusedLabelColor = j17;
        this.disabledLabelColor = j18;
        this.errorLabelColor = j19;
        this.placeholderColor = j20;
        this.disabledPlaceholderColor = j21;
    }
}
