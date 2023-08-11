package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.text.selection.TextSelectionColors;
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
import p336ef.C11921v;

@Immutable
/* compiled from: TextFieldDefaults.kt */
public final class TextFieldColors {
    private final long containerColor;
    private final long cursorColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledSupportingTextColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorSupportingTextColor;
    private final long errorTrailingIconColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long focusedLeadingIconColor;
    private final long focusedSupportingTextColor;
    private final long focusedTrailingIconColor;
    private final long placeholderColor;
    private final long textColor;
    private final TextSelectionColors textSelectionColors;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;
    private final long unfocusedLeadingIconColor;
    private final long unfocusedSupportingTextColor;
    private final long unfocusedTrailingIconColor;

    public /* synthetic */ TextFieldColors(long j, long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors2, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, textSelectionColors2, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27);
    }

    /* renamed from: indicatorColor$lambda-2  reason: not valid java name */
    private static final boolean m34643indicatorColor$lambda2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* renamed from: labelColor$lambda-3  reason: not valid java name */
    private static final boolean m34644labelColor$lambda3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* renamed from: leadingIconColor$lambda-0  reason: not valid java name */
    private static final boolean m34645leadingIconColor$lambda0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* renamed from: supportingTextColor$lambda-4  reason: not valid java name */
    private static final boolean m34646supportingTextColor$lambda4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* renamed from: trailingIconColor$lambda-1  reason: not valid java name */
    private static final boolean m34647trailingIconColor$lambda1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @Composable
    public final State<Color> containerColor$material3_release(Composer composer, int i) {
        composer.startReplaceableGroup(954653884);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(954653884, i, -1, "androidx.compose.material3.TextFieldColors.containerColor (TextFieldDefaults.kt:794)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(this.containerColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> cursorColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1885422187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1885422187, i, -1, "androidx.compose.material3.TextFieldColors.cursorColor (TextFieldDefaults.kt:862)");
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
        if (obj == null || !(obj instanceof TextFieldColors)) {
            return false;
        }
        TextFieldColors textFieldColors = (TextFieldColors) obj;
        if (Color.m35672equalsimpl0(this.textColor, textFieldColors.textColor) && Color.m35672equalsimpl0(this.disabledTextColor, textFieldColors.disabledTextColor) && Color.m35672equalsimpl0(this.cursorColor, textFieldColors.cursorColor) && Color.m35672equalsimpl0(this.errorCursorColor, textFieldColors.errorCursorColor) && C12775o.m28634d(this.textSelectionColors, textFieldColors.textSelectionColors) && Color.m35672equalsimpl0(this.focusedIndicatorColor, textFieldColors.focusedIndicatorColor) && Color.m35672equalsimpl0(this.unfocusedIndicatorColor, textFieldColors.unfocusedIndicatorColor) && Color.m35672equalsimpl0(this.errorIndicatorColor, textFieldColors.errorIndicatorColor) && Color.m35672equalsimpl0(this.disabledIndicatorColor, textFieldColors.disabledIndicatorColor) && Color.m35672equalsimpl0(this.focusedLeadingIconColor, textFieldColors.focusedLeadingIconColor) && Color.m35672equalsimpl0(this.unfocusedLeadingIconColor, textFieldColors.unfocusedLeadingIconColor) && Color.m35672equalsimpl0(this.disabledLeadingIconColor, textFieldColors.disabledLeadingIconColor) && Color.m35672equalsimpl0(this.errorLeadingIconColor, textFieldColors.errorLeadingIconColor) && Color.m35672equalsimpl0(this.focusedTrailingIconColor, textFieldColors.focusedTrailingIconColor) && Color.m35672equalsimpl0(this.unfocusedTrailingIconColor, textFieldColors.unfocusedTrailingIconColor) && Color.m35672equalsimpl0(this.disabledTrailingIconColor, textFieldColors.disabledTrailingIconColor) && Color.m35672equalsimpl0(this.errorTrailingIconColor, textFieldColors.errorTrailingIconColor) && Color.m35672equalsimpl0(this.containerColor, textFieldColors.containerColor) && Color.m35672equalsimpl0(this.focusedLabelColor, textFieldColors.focusedLabelColor) && Color.m35672equalsimpl0(this.unfocusedLabelColor, textFieldColors.unfocusedLabelColor) && Color.m35672equalsimpl0(this.disabledLabelColor, textFieldColors.disabledLabelColor) && Color.m35672equalsimpl0(this.errorLabelColor, textFieldColors.errorLabelColor) && Color.m35672equalsimpl0(this.placeholderColor, textFieldColors.placeholderColor) && Color.m35672equalsimpl0(this.disabledPlaceholderColor, textFieldColors.disabledPlaceholderColor) && Color.m35672equalsimpl0(this.focusedSupportingTextColor, textFieldColors.focusedSupportingTextColor) && Color.m35672equalsimpl0(this.unfocusedSupportingTextColor, textFieldColors.unfocusedSupportingTextColor) && Color.m35672equalsimpl0(this.disabledSupportingTextColor, textFieldColors.disabledSupportingTextColor) && Color.m35672equalsimpl0(this.errorSupportingTextColor, textFieldColors.errorSupportingTextColor)) {
            return true;
        }
        return false;
    }

    @Composable
    public final TextSelectionColors getSelectionColors(Composer composer, int i) {
        composer.startReplaceableGroup(997785083);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(997785083, i, -1, "androidx.compose.material3.TextFieldColors.<get-selectionColors> (TextFieldDefaults.kt:870)");
        }
        TextSelectionColors textSelectionColors2 = this.textSelectionColors;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textSelectionColors2;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((Color.m35678hashCodeimpl(this.textColor) * 31) + Color.m35678hashCodeimpl(this.disabledTextColor)) * 31) + Color.m35678hashCodeimpl(this.cursorColor)) * 31) + Color.m35678hashCodeimpl(this.errorCursorColor)) * 31) + this.textSelectionColors.hashCode()) * 31) + Color.m35678hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m35678hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m35678hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m35678hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m35678hashCodeimpl(this.focusedLeadingIconColor)) * 31) + Color.m35678hashCodeimpl(this.unfocusedLeadingIconColor)) * 31) + Color.m35678hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m35678hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m35678hashCodeimpl(this.focusedTrailingIconColor)) * 31) + Color.m35678hashCodeimpl(this.unfocusedTrailingIconColor)) * 31) + Color.m35678hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m35678hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m35678hashCodeimpl(this.containerColor)) * 31) + Color.m35678hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m35678hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m35678hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m35678hashCodeimpl(this.errorLabelColor)) * 31) + Color.m35678hashCodeimpl(this.placeholderColor)) * 31) + Color.m35678hashCodeimpl(this.disabledPlaceholderColor)) * 31) + Color.m35678hashCodeimpl(this.focusedSupportingTextColor)) * 31) + Color.m35678hashCodeimpl(this.unfocusedSupportingTextColor)) * 31) + Color.m35678hashCodeimpl(this.disabledSupportingTextColor)) * 31) + Color.m35678hashCodeimpl(this.errorSupportingTextColor);
    }

    @Composable
    public final State<Color> indicatorColor$material3_release(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        State<Color> state;
        C12775o.m28639i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-1877482635);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877482635, i, -1, "androidx.compose.material3.TextFieldColors.indicatorColor (TextFieldDefaults.kt:770)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledIndicatorColor;
        } else if (z2) {
            j = this.errorIndicatorColor;
        } else if (m34643indicatorColor$lambda2(collectIsFocusedAsState)) {
            j = this.focusedIndicatorColor;
        } else {
            j = this.unfocusedIndicatorColor;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(715730990);
            state = SingleValueAnimationKt.m32872animateColorAsStateKTwxG1Y(j2, AnimationSpecKt.tween$default(150, 0, (Easing) null, 6, (Object) null), (Function1<? super Color, C11921v>) null, composer, 48, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(715731095);
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
    public final State<Color> labelColor$material3_release(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        C12775o.m28639i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(1167161306);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1167161306, i, -1, "androidx.compose.material3.TextFieldColors.labelColor (TextFieldDefaults.kt:817)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledLabelColor;
        } else if (z2) {
            j = this.errorLabelColor;
        } else if (m34644labelColor$lambda3(collectIsFocusedAsState)) {
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
    public final State<Color> leadingIconColor$material3_release(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        C12775o.m28639i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(925127045);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(925127045, i, -1, "androidx.compose.material3.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:718)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledLeadingIconColor;
        } else if (z2) {
            j = this.errorLeadingIconColor;
        } else if (m34645leadingIconColor$lambda0(collectIsFocusedAsState)) {
            j = this.focusedLeadingIconColor;
        } else {
            j = this.unfocusedLeadingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> placeholderColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-117469162);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-117469162, i, -1, "androidx.compose.material3.TextFieldColors.placeholderColor (TextFieldDefaults.kt:804)");
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
    public final State<Color> supportingTextColor$material3_release(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        C12775o.m28639i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(1464709698);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1464709698, i, -1, "androidx.compose.material3.TextFieldColors.supportingTextColor (TextFieldDefaults.kt:839)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledSupportingTextColor;
        } else if (z2) {
            j = this.errorSupportingTextColor;
        } else if (m34646supportingTextColor$lambda4(collectIsFocusedAsState)) {
            j = this.focusedSupportingTextColor;
        } else {
            j = this.unfocusedSupportingTextColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> textColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(2080722220);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2080722220, i, -1, "androidx.compose.material3.TextFieldColors.textColor (TextFieldDefaults.kt:834)");
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
    public final State<Color> trailingIconColor$material3_release(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        C12775o.m28639i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-109504137);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-109504137, i, -1, "androidx.compose.material3.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:744)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledTrailingIconColor;
        } else if (z2) {
            j = this.errorTrailingIconColor;
        } else if (m34647trailingIconColor$lambda1(collectIsFocusedAsState)) {
            j = this.focusedTrailingIconColor;
        } else {
            j = this.unfocusedTrailingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private TextFieldColors(long j, long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors2, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27) {
        this.textColor = j;
        this.disabledTextColor = j2;
        this.containerColor = j3;
        this.cursorColor = j4;
        this.errorCursorColor = j5;
        this.textSelectionColors = textSelectionColors2;
        this.focusedIndicatorColor = j6;
        this.unfocusedIndicatorColor = j7;
        this.errorIndicatorColor = j8;
        this.disabledIndicatorColor = j9;
        this.focusedLeadingIconColor = j10;
        this.unfocusedLeadingIconColor = j11;
        this.disabledLeadingIconColor = j12;
        this.errorLeadingIconColor = j13;
        this.focusedTrailingIconColor = j14;
        this.unfocusedTrailingIconColor = j15;
        this.disabledTrailingIconColor = j16;
        this.errorTrailingIconColor = j17;
        this.focusedLabelColor = j18;
        this.unfocusedLabelColor = j19;
        this.disabledLabelColor = j20;
        this.errorLabelColor = j21;
        this.placeholderColor = j22;
        this.disabledPlaceholderColor = j23;
        this.focusedSupportingTextColor = j24;
        this.unfocusedSupportingTextColor = j25;
        this.disabledSupportingTextColor = j26;
        this.errorSupportingTextColor = j27;
    }
}
