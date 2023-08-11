package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SurfaceKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.graphics.AndroidPath_androidKt;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.PathFillType;
import androidx.compose.p002ui.graphics.drawscope.DrawContext;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nPullRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,242:1\n50#2:243\n49#2:244\n25#2:252\n36#2:260\n1114#3,6:245\n1114#3,3:253\n1117#3,3:257\n1114#3,6:261\n154#4:251\n154#4:285\n164#4:286\n164#4:287\n154#4:288\n154#4:289\n154#4:290\n1#5:256\n136#6,5:267\n261#6,11:272\n76#7:283\n76#7:284\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt\n*L\n81#1:243\n81#1:244\n127#1:252\n129#1:260\n81#1:245,6\n127#1:253,3\n127#1:257,3\n129#1:261,6\n91#1:251\n230#1:285\n232#1:286\n233#1:287\n234#1:288\n235#1:289\n236#1:290\n222#1:267,5\n222#1:272,11\n81#1:283\n129#1:284\n*E\n"})
/* compiled from: PullRefreshIndicator.kt */
public final class PullRefreshIndicatorKt {
    private static final TweenSpec<Float> AlphaTween = AnimationSpecKt.tween$default(AnimationConstants.DefaultDurationMillis, 0, EasingKt.getLinearEasing(), 2, (Object) null);
    /* access modifiers changed from: private */
    public static final float ArcRadius = C1232Dp.m38468constructorimpl((float) 7.5d);
    private static final float ArrowHeight = C1232Dp.m38468constructorimpl((float) 5);
    private static final float ArrowWidth = C1232Dp.m38468constructorimpl((float) 10);
    private static final int CrossfadeDurationMs = 100;
    private static final float Elevation = C1232Dp.m38468constructorimpl((float) 6);
    private static final float IndicatorSize = C1232Dp.m38468constructorimpl((float) 40);
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final RoundedCornerShape SpinnerShape = RoundedCornerShapeKt.getCircleShape();
    /* access modifiers changed from: private */
    public static final float StrokeWidth = C1232Dp.m38468constructorimpl((float) 2.5d);

    /* access modifiers changed from: private */
    public static final ArrowValues ArrowValues(float f) {
        float max = (Math.max(Math.min(1.0f, f) - 0.4f, 0.0f) * ((float) 5)) / ((float) 3);
        float l = C13537l.m30885l(Math.abs(f) - 1.0f, 0.0f, 2.0f);
        float pow = (((0.4f * max) - 16.0f) + (l - (((float) Math.pow((double) l, (double) 2)) / ((float) 4)))) * 0.5f;
        float f2 = (float) 360;
        return new ArrowValues(pow, pow * f2, ((MaxProgressArc * max) + pow) * f2, Math.min(1.0f, max));
    }

    /* access modifiers changed from: private */
    @ExperimentalMaterialApi
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CircularArrowIndicator-iJQMabo  reason: not valid java name */
    public static final void m34215CircularArrowIndicatoriJQMabo(PullRefreshState pullRefreshState, long j, Modifier modifier, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-486016981);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-486016981, i, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:121)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        Path path = rememberedValue;
        if (rememberedValue == companion.getEmpty()) {
            Path Path = AndroidPath_androidKt.Path();
            Path.m35952setFillTypeoQ8Xj4U(PathFillType.Companion.m35964getEvenOddRgk1Os());
            startRestartGroup.updateRememberedValue(Path);
            path = Path;
        }
        startRestartGroup.endReplaceableGroup();
        Path path2 = (Path) path;
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed((Object) pullRefreshState);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1(pullRefreshState));
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        CanvasKt.Canvas(SemanticsModifierKt.semantics$default(modifier, false, PullRefreshIndicatorKt$CircularArrowIndicator$1.INSTANCE, 1, (Object) null), new PullRefreshIndicatorKt$CircularArrowIndicator$2(pullRefreshState, AnimateAsStateKt.animateFloatAsState(CircularArrowIndicator_iJQMabo$lambda$5((State) rememberedValue2), AlphaTween, 0.0f, (Function1<? super Float, C11921v>) null, startRestartGroup, 48, 12), j, path2), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PullRefreshIndicatorKt$CircularArrowIndicator$3(pullRefreshState, j, modifier, i));
        }
    }

    private static final float CircularArrowIndicator_iJQMabo$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    @ExperimentalMaterialApi
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: PullRefreshIndicator-jB83MbM  reason: not valid java name */
    public static final void m34216PullRefreshIndicatorjB83MbM(boolean z, PullRefreshState pullRefreshState, Modifier modifier, long j, long j2, boolean z2, Composer composer, int i, int i2) {
        Modifier.Companion companion;
        long j3;
        int i3;
        long j4;
        boolean z3;
        float f;
        PullRefreshState pullRefreshState2 = pullRefreshState;
        C12775o.m28639i(pullRefreshState2, "state");
        Composer startRestartGroup = composer.startRestartGroup(308716636);
        if ((i2 & 4) != 0) {
            companion = Modifier.Companion;
        } else {
            companion = modifier;
        }
        if ((i2 & 8) != 0) {
            i3 = i & -7169;
            j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m33956getSurface0d7_KjU();
        } else {
            j3 = j;
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            i3 &= -57345;
            j4 = ColorsKt.m33970contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
        } else {
            j4 = j2;
        }
        if ((i2 & 32) != 0) {
            z3 = false;
        } else {
            z3 = z2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(308716636, i3, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:72)");
        }
        Boolean valueOf = Boolean.valueOf(z);
        startRestartGroup.startReplaceableGroup(511388516);
        boolean changed = startRestartGroup.changed((Object) valueOf) | startRestartGroup.changed((Object) pullRefreshState2);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1(z, pullRefreshState2));
            startRestartGroup.updateRememberedValue(rememberedValue);
        } else {
            boolean z4 = z;
        }
        startRestartGroup.endReplaceableGroup();
        Modifier pullRefreshIndicatorTransform = PullRefreshIndicatorTransformKt.pullRefreshIndicatorTransform(SizeKt.m33338size3ABfNKs(companion, IndicatorSize), pullRefreshState2, z3);
        RoundedCornerShape roundedCornerShape = SpinnerShape;
        if (PullRefreshIndicator_jB83MbM$lambda$1((State) rememberedValue)) {
            f = Elevation;
        } else {
            f = C1232Dp.m38468constructorimpl((float) 0);
        }
        boolean z5 = z3;
        long j5 = j3;
        SurfaceKt.m34127SurfaceFjzlyU(pullRefreshIndicatorTransform, roundedCornerShape, j3, 0, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(startRestartGroup, -194757728, true, new PullRefreshIndicatorKt$PullRefreshIndicator$1(z, i3, j4, pullRefreshState)), startRestartGroup, ((i3 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 1572912, 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PullRefreshIndicatorKt$PullRefreshIndicator$2(z, pullRefreshState, companion, j5, j4, z5, i, i2));
        }
    }

    private static final boolean PullRefreshIndicator_jB83MbM$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: drawArrow-Bx497Mc  reason: not valid java name */
    public static final void m34219drawArrowBx497Mc(DrawScope drawScope, Path path, Rect rect, long j, float f, ArrowValues arrowValues) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f2 = ArrowWidth;
        path.lineTo(drawScope.m38449toPx0680j_4(f2) * arrowValues.getScale(), 0.0f);
        path.lineTo((drawScope.m38449toPx0680j_4(f2) * arrowValues.getScale()) / ((float) 2), drawScope.m38449toPx0680j_4(ArrowHeight) * arrowValues.getScale());
        path.m35953translatek4lQ0M(OffsetKt.Offset(((Math.min(rect.getWidth(), rect.getHeight()) / 2.0f) + Offset.m35422getXimpl(rect.m35452getCenterF1C5BW0())) - ((drawScope.m38449toPx0680j_4(f2) * arrowValues.getScale()) / 2.0f), Offset.m35423getYimpl(rect.m35452getCenterF1C5BW0()) + (drawScope.m38449toPx0680j_4(StrokeWidth) / 2.0f)));
        path.close();
        float endAngle = arrowValues.getEndAngle();
        long r3 = drawScope.m36273getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long r11 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().m36332rotateUv8p0NA(endAngle, r3);
        DrawScope.m36246drawPathLG529CI$default(drawScope, path, j, f, (DrawStyle) null, (ColorFilter) null, 0, 56, (Object) null);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r11);
    }
}
