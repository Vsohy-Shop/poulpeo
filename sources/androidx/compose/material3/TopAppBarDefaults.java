package androidx.compose.material3;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallCenteredTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13074a;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* compiled from: AppBar.kt */
public final class TopAppBarDefaults {
    public static final int $stable = 0;
    public static final TopAppBarDefaults INSTANCE = new TopAppBarDefaults();

    private TopAppBarDefaults() {
    }

    @Composable
    /* renamed from: centerAlignedTopAppBarColors-zjMxDiM  reason: not valid java name */
    public final TopAppBarColors m34753centerAlignedTopAppBarColorszjMxDiM(long j, long j2, long j3, long j4, long j5, Composer composer, int i, int i2) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(1896017784);
        if ((i2 & 1) != 0) {
            j6 = ColorSchemeKt.toColor(TopAppBarSmallCenteredTokens.INSTANCE.getContainerColor(), composer2, 6);
        } else {
            j6 = j;
        }
        if ((i2 & 2) != 0) {
            j7 = ColorSchemeKt.m34357applyTonalElevationHht5A8o(MaterialTheme.INSTANCE.getColorScheme(composer2, 6), j6, TopAppBarSmallTokens.INSTANCE.m35219getOnScrollContainerElevationD9Ej5fM());
        } else {
            j7 = j2;
        }
        if ((i2 & 4) != 0) {
            j8 = ColorSchemeKt.toColor(TopAppBarSmallCenteredTokens.INSTANCE.getLeadingIconColor(), composer2, 6);
        } else {
            j8 = j3;
        }
        if ((i2 & 8) != 0) {
            j9 = ColorSchemeKt.toColor(TopAppBarSmallCenteredTokens.INSTANCE.getHeadlineColor(), composer2, 6);
        } else {
            j9 = j4;
        }
        if ((i2 & 16) != 0) {
            j10 = ColorSchemeKt.toColor(TopAppBarSmallCenteredTokens.INSTANCE.getTrailingIconColor(), composer2, 6);
        } else {
            j10 = j5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896017784, i, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:582)");
        }
        TopAppBarColors topAppBarColors = new TopAppBarColors(j6, j7, j8, j9, j10, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarColors;
    }

    @ExperimentalMaterial3Api
    @Composable
    public final TopAppBarScrollBehavior enterAlwaysScrollBehavior(TopAppBarState topAppBarState, C13074a<Boolean> aVar, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(959086674);
        if ((i2 & 1) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((i2 & 2) != 0) {
            aVar = TopAppBarDefaults$enterAlwaysScrollBehavior$1.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i2 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(959086674, i, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:695)");
        }
        EnterAlwaysScrollBehavior enterAlwaysScrollBehavior = new EnterAlwaysScrollBehavior(topAppBarState, animationSpec, decayAnimationSpec, aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return enterAlwaysScrollBehavior;
    }

    @ExperimentalMaterial3Api
    @Composable
    public final TopAppBarScrollBehavior exitUntilCollapsedScrollBehavior(TopAppBarState topAppBarState, C13074a<Boolean> aVar, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1757023234);
        if ((i2 & 1) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((i2 & 2) != 0) {
            aVar = TopAppBarDefaults$exitUntilCollapsedScrollBehavior$1.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i2 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1757023234, i, -1, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:728)");
        }
        ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior = new ExitUntilCollapsedScrollBehavior(topAppBarState, animationSpec, decayAnimationSpec, aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return exitUntilCollapsedScrollBehavior;
    }

    @Composable
    public final WindowInsets getWindowInsets(Composer composer, int i) {
        composer.startReplaceableGroup(2143182847);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143182847, i, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:567)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 8);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets r5 = WindowInsetsKt.m33358onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m33372plusgK_yJZ4(companion.m33382getHorizontalJoeWqyM(), companion.m33386getTopJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r5;
    }

    @Composable
    /* renamed from: largeTopAppBarColors-zjMxDiM  reason: not valid java name */
    public final TopAppBarColors m34754largeTopAppBarColorszjMxDiM(long j, long j2, long j3, long j4, long j5, Composer composer, int i, int i2) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(-1471507700);
        if ((i2 & 1) != 0) {
            j6 = ColorSchemeKt.toColor(TopAppBarLargeTokens.INSTANCE.getContainerColor(), composer2, 6);
        } else {
            j6 = j;
        }
        if ((i2 & 2) != 0) {
            j7 = ColorSchemeKt.m34357applyTonalElevationHht5A8o(MaterialTheme.INSTANCE.getColorScheme(composer2, 6), j6, TopAppBarSmallTokens.INSTANCE.m35219getOnScrollContainerElevationD9Ej5fM());
        } else {
            j7 = j2;
        }
        if ((i2 & 4) != 0) {
            j8 = ColorSchemeKt.toColor(TopAppBarLargeTokens.INSTANCE.getLeadingIconColor(), composer2, 6);
        } else {
            j8 = j3;
        }
        if ((i2 & 8) != 0) {
            j9 = ColorSchemeKt.toColor(TopAppBarLargeTokens.INSTANCE.getHeadlineColor(), composer2, 6);
        } else {
            j9 = j4;
        }
        if ((i2 & 16) != 0) {
            j10 = ColorSchemeKt.toColor(TopAppBarLargeTokens.INSTANCE.getTrailingIconColor(), composer2, 6);
        } else {
            j10 = j5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1471507700, i, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:644)");
        }
        TopAppBarColors topAppBarColors = new TopAppBarColors(j6, j7, j8, j9, j10, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarColors;
    }

    @Composable
    /* renamed from: mediumTopAppBarColors-zjMxDiM  reason: not valid java name */
    public final TopAppBarColors m34755mediumTopAppBarColorszjMxDiM(long j, long j2, long j3, long j4, long j5, Composer composer, int i, int i2) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(-582474442);
        if ((i2 & 1) != 0) {
            j6 = ColorSchemeKt.toColor(TopAppBarMediumTokens.INSTANCE.getContainerColor(), composer2, 6);
        } else {
            j6 = j;
        }
        if ((i2 & 2) != 0) {
            j7 = ColorSchemeKt.m34357applyTonalElevationHht5A8o(MaterialTheme.INSTANCE.getColorScheme(composer2, 6), j6, TopAppBarSmallTokens.INSTANCE.m35219getOnScrollContainerElevationD9Ej5fM());
        } else {
            j7 = j2;
        }
        if ((i2 & 4) != 0) {
            j8 = ColorSchemeKt.toColor(TopAppBarMediumTokens.INSTANCE.getLeadingIconColor(), composer2, 6);
        } else {
            j8 = j3;
        }
        if ((i2 & 8) != 0) {
            j9 = ColorSchemeKt.toColor(TopAppBarMediumTokens.INSTANCE.getHeadlineColor(), composer2, 6);
        } else {
            j9 = j4;
        }
        if ((i2 & 16) != 0) {
            j10 = ColorSchemeKt.toColor(TopAppBarMediumTokens.INSTANCE.getTrailingIconColor(), composer2, 6);
        } else {
            j10 = j5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-582474442, i, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:613)");
        }
        TopAppBarColors topAppBarColors = new TopAppBarColors(j6, j7, j8, j9, j10, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarColors;
    }

    @ExperimentalMaterial3Api
    @Composable
    public final TopAppBarScrollBehavior pinnedScrollBehavior(TopAppBarState topAppBarState, C13074a<Boolean> aVar, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(286497075);
        if ((i2 & 1) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((i2 & 2) != 0) {
            aVar = TopAppBarDefaults$pinnedScrollBehavior$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(286497075, i, -1, "androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior (AppBar.kt:673)");
        }
        PinnedScrollBehavior pinnedScrollBehavior = new PinnedScrollBehavior(topAppBarState, aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pinnedScrollBehavior;
    }

    @Composable
    /* renamed from: smallTopAppBarColors-zjMxDiM  reason: not valid java name */
    public final TopAppBarColors m34756smallTopAppBarColorszjMxDiM(long j, long j2, long j3, long j4, long j5, Composer composer, int i, int i2) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(-1717201472);
        if ((i2 & 1) != 0) {
            j6 = ColorSchemeKt.toColor(TopAppBarSmallTokens.INSTANCE.getContainerColor(), composer2, 6);
        } else {
            j6 = j;
        }
        if ((i2 & 2) != 0) {
            j7 = ColorSchemeKt.m34357applyTonalElevationHht5A8o(MaterialTheme.INSTANCE.getColorScheme(composer2, 6), j6, TopAppBarSmallTokens.INSTANCE.m35219getOnScrollContainerElevationD9Ej5fM());
        } else {
            j7 = j2;
        }
        if ((i2 & 4) != 0) {
            j8 = ColorSchemeKt.toColor(TopAppBarSmallTokens.INSTANCE.getLeadingIconColor(), composer2, 6);
        } else {
            j8 = j3;
        }
        if ((i2 & 8) != 0) {
            j9 = ColorSchemeKt.toColor(TopAppBarSmallTokens.INSTANCE.getHeadlineColor(), composer2, 6);
        } else {
            j9 = j4;
        }
        if ((i2 & 16) != 0) {
            j10 = ColorSchemeKt.toColor(TopAppBarSmallTokens.INSTANCE.getTrailingIconColor(), composer2, 6);
        } else {
            j10 = j5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1717201472, i, -1, "androidx.compose.material3.TopAppBarDefaults.smallTopAppBarColors (AppBar.kt:544)");
        }
        TopAppBarColors topAppBarColors = new TopAppBarColors(j6, j7, j8, j9, j10, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarColors;
    }
}
