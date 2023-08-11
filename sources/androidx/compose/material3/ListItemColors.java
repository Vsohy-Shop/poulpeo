package androidx.compose.material3;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
@ExperimentalMaterial3Api
/* compiled from: ListItem.kt */
public final class ListItemColors {
    private final long containerColor;
    private final long disabledHeadlineColor;
    private final long disabledLeadingIconColor;
    private final long disabledTrailingIconColor;
    private final long headlineColor;
    private final long leadingIconColor;
    private final long overlineColor;
    private final long supportingTextColor;
    private final long trailingIconColor;

    public /* synthetic */ ListItemColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9);
    }

    @Composable
    public final State<Color> containerColor$material3_release(Composer composer, int i) {
        composer.startReplaceableGroup(-380363090);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-380363090, i, -1, "androidx.compose.material3.ListItemColors.containerColor (ListItem.kt:447)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(this.containerColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> headlineColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1254314043);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1254314043, i, -1, "androidx.compose.material3.ListItemColors.headlineColor (ListItem.kt:453)");
        }
        if (z) {
            j = this.headlineColor;
        } else {
            j = this.disabledHeadlineColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> leadingIconColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(694213044);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(694213044, i, -1, "androidx.compose.material3.ListItemColors.leadingIconColor (ListItem.kt:461)");
        }
        if (z) {
            j = this.leadingIconColor;
        } else {
            j = this.disabledLeadingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> overlineColor$material3_release(Composer composer, int i) {
        composer.startReplaceableGroup(-1467587733);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1467587733, i, -1, "androidx.compose.material3.ListItemColors.overlineColor (ListItem.kt:469)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(this.overlineColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> supportingColor$material3_release(Composer composer, int i) {
        composer.startReplaceableGroup(-1251828896);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1251828896, i, -1, "androidx.compose.material3.ListItemColors.supportingColor (ListItem.kt:475)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(this.supportingTextColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> trailingIconColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-778325338);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-778325338, i, -1, "androidx.compose.material3.ListItemColors.trailingIconColor (ListItem.kt:481)");
        }
        if (z) {
            j = this.trailingIconColor;
        } else {
            j = this.disabledTrailingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private ListItemColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.containerColor = j;
        this.headlineColor = j2;
        this.leadingIconColor = j3;
        this.overlineColor = j4;
        this.supportingTextColor = j5;
        this.trailingIconColor = j6;
        this.disabledHeadlineColor = j7;
        this.disabledLeadingIconColor = j8;
        this.disabledTrailingIconColor = j9;
    }
}
