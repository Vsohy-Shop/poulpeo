package androidx.compose.material.pullrefresh;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12085h;
import p404of.C13074a;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshStateKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,233:1\n154#2:234\n1#3:235\n474#4,4:236\n478#4,2:244\n482#4:250\n25#5:240\n36#5:252\n1114#6,3:241\n1117#6,3:247\n1114#6,6:253\n474#7:246\n76#8:251\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshStateKt\n*L\n62#1:234\n64#1:236,4\n64#1:244,2\n64#1:250\n64#1:240\n74#1:252\n64#1:241,3\n64#1:247,3\n74#1:253,6\n64#1:246\n69#1:251\n*E\n"})
/* compiled from: PullRefreshState.kt */
public final class PullRefreshStateKt {
    private static final float DragMultiplier = 0.5f;

    @ExperimentalMaterialApi
    @Composable
    /* renamed from: rememberPullRefreshState-UuyPYSY  reason: not valid java name */
    public static final PullRefreshState m34223rememberPullRefreshStateUuyPYSY(boolean z, C13074a<C11921v> aVar, float f, float f2, Composer composer, int i, int i2) {
        boolean z2;
        C12775o.m28639i(aVar, "onRefresh");
        composer.startReplaceableGroup(-174977512);
        if ((i2 & 4) != 0) {
            f = PullRefreshDefaults.INSTANCE.m34213getRefreshThresholdD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f2 = PullRefreshDefaults.INSTANCE.m34214getRefreshingOffsetD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-174977512, i, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:55)");
        }
        if (C1232Dp.m38467compareTo0680j_4(f, C1232Dp.m38468constructorimpl((float) 0)) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(C12085h.f18916b, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            C13995l0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            State<T> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, composer, (i >> 3) & 14);
            C12757e0 e0Var = new C12757e0();
            C12757e0 e0Var2 = new C12757e0();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            e0Var.f20408b = density.m38449toPx0680j_4(f);
            e0Var2.f20408b = density.m38449toPx0680j_4(f2);
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed((Object) coroutineScope);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new PullRefreshState(coroutineScope, rememberUpdatedState, e0Var2.f20408b, e0Var.f20408b);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            PullRefreshState pullRefreshState = (PullRefreshState) rememberedValue2;
            EffectsKt.SideEffect(new PullRefreshStateKt$rememberPullRefreshState$3(pullRefreshState, z, e0Var, e0Var2), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return pullRefreshState;
        }
        throw new IllegalArgumentException("The refresh trigger must be greater than zero!".toString());
    }
}
