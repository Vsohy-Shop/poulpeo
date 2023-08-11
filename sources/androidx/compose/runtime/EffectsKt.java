package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13934b2;
import p466yf.C13995l0;
import p466yf.C13999m0;
import p466yf.C14054y1;
import p466yf.C14058z;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,484:1\n36#2:485\n50#2:492\n49#2:493\n67#2,3:500\n66#2:503\n83#2,3:510\n36#2:519\n50#2:526\n49#2:527\n67#2,3:534\n66#2:537\n83#2,3:544\n25#2:553\n1114#3,6:486\n1114#3,6:494\n1114#3,6:504\n1114#3,6:513\n1114#3,6:520\n1114#3,6:528\n1114#3,6:538\n1114#3,6:547\n1114#3,6:554\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n*L\n155#1:485\n195#1:492\n195#1:493\n236#1:500,3\n236#1:503\n276#1:510,3\n337#1:519\n360#1:526\n360#1:527\n384#1:534,3\n384#1:537\n407#1:544,3\n477#1:553\n155#1:486,6\n195#1:494,6\n236#1:504,6\n276#1:513,6\n337#1:520,6\n360#1:528,6\n384#1:538,6\n407#1:547,6\n477#1:554,6\n*E\n"})
/* compiled from: Effects.kt */
public final class EffectsKt {
    private static final String DisposableEffectNoParamError = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";
    /* access modifiers changed from: private */
    public static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();
    private static final String LaunchedEffectNoParamError = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    @Composable
    public static final void DisposableEffect(Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> function1, Composer composer, int i) {
        C12775o.m28639i(function1, "effect");
        composer.startReplaceableGroup(-904483903);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-904483903, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:115)");
        }
        throw new IllegalStateException(DisposableEffectNoParamError.toString());
    }

    @Composable
    public static final void LaunchedEffect(C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object> oVar, Composer composer, int i) {
        C12775o.m28639i(oVar, "block");
        Composer startRestartGroup = composer.startRestartGroup(-805415771);
        if ((i & 1) != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-805415771, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:313)");
            }
            throw new IllegalStateException(LaunchedEffectNoParamError.toString());
        }
        startRestartGroup.skipToGroupEnd();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new EffectsKt$LaunchedEffect$1(oVar, i));
        }
    }

    @Composable
    public static final void SideEffect(C13074a<C11921v> aVar, Composer composer, int i) {
        C12775o.m28639i(aVar, "effect");
        composer.startReplaceableGroup(-1288466761);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1288466761, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:44)");
        }
        composer.recordSideEffect(aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final C13995l0 createCompositionCoroutineScope(C12079g gVar, Composer composer) {
        C12775o.m28639i(gVar, "coroutineContext");
        C12775o.m28639i(composer, "composer");
        C14054y1.C14056b bVar = C14054y1.f22970b0;
        if (gVar.get(bVar) != null) {
            C14058z b = C13944d2.m32235b((C14054y1) null, 1, (Object) null);
            b.mo53679V(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return C13999m0.m32447a(b);
        }
        C12079g applyCoroutineContext = composer.getApplyCoroutineContext();
        return C13999m0.m32447a(applyCoroutineContext.plus(C13934b2.m32213a((C14054y1) applyCoroutineContext.get(bVar))).plus(gVar));
    }

    @Composable
    public static final C13995l0 rememberCoroutineScope(C13074a<? extends C12079g> aVar, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(773894976);
        if ((i2 & 1) != 0) {
            aVar = EffectsKt$rememberCoroutineScope$1.INSTANCE;
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new CompositionScopedCoroutineScopeCanceller(createCompositionCoroutineScope((C12079g) aVar.invoke(), composer));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        C13995l0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        return coroutineScope;
    }

    @Composable
    public static final void DisposableEffect(Object obj, Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> function1, Composer composer, int i) {
        C12775o.m28639i(function1, "effect");
        composer.startReplaceableGroup(-1371986847);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1371986847, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:150)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(function1));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(Object obj, C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object> oVar, Composer composer, int i) {
        C12775o.m28639i(oVar, "block");
        composer.startReplaceableGroup(1179185413);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1179185413, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:331)");
        }
        C12079g applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, oVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(Object obj, Object obj2, Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> function1, Composer composer, int i) {
        C12775o.m28639i(function1, "effect");
        composer.startReplaceableGroup(1429097729);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1429097729, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:189)");
        }
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(function1));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(Object obj, Object obj2, C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object> oVar, Composer composer, int i) {
        C12775o.m28639i(oVar, "block");
        composer.startReplaceableGroup(590241125);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590241125, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:353)");
        }
        C12079g applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, oVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(Object obj, Object obj2, Object obj3, Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> function1, Composer composer, int i) {
        C12775o.m28639i(function1, "effect");
        composer.startReplaceableGroup(-1239538271);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1239538271, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:229)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(function1));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(Object obj, Object obj2, Object obj3, C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object> oVar, Composer composer, int i) {
        C12775o.m28639i(oVar, "block");
        composer.startReplaceableGroup(-54093371);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-54093371, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:376)");
        }
        C12079g applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, oVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(Object[] objArr, Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> function1, Composer composer, int i) {
        C12775o.m28639i(objArr, "keys");
        C12775o.m28639i(function1, "effect");
        composer.startReplaceableGroup(-1307627122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1307627122, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:271)");
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        composer.startReplaceableGroup(-568225417);
        boolean z = false;
        for (Object changed : copyOf) {
            z |= composer.changed(changed);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(function1));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(Object[] objArr, C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object> oVar, Composer composer, int i) {
        C12775o.m28639i(objArr, "keys");
        C12775o.m28639i(oVar, "block");
        composer.startReplaceableGroup(-139560008);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-139560008, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:401)");
        }
        C12079g applyCoroutineContext = composer.getApplyCoroutineContext();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        composer.startReplaceableGroup(-568225417);
        boolean z = false;
        for (Object changed : copyOf) {
            z |= composer.changed(changed);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, oVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
