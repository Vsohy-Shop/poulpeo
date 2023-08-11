package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11905k;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,484:1\n1114#2,6:485\n1114#2,6:491\n1114#2,6:497\n1114#2,6:503\n1114#2,6:509\n*S KotlinDebug\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n25#1:485,6\n36#1:491,6\n49#1:497,6\n66#1:503,6\n85#1:509,6\n*E\n"})
/* compiled from: Composables.kt */
public final class ComposablesKt {
    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(C13074a<? extends T> aVar, Function1<? super Updater<T>, C11921v> function1, Composer composer, int i) {
        C12775o.m28639i(aVar, "factory");
        C12775o.m28639i(function1, "update");
        composer.startReplaceableGroup(1886828752);
        Applier<?> applier = composer.getApplier();
        C12775o.m28644n(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(new ComposablesKt$ComposeNode$1(aVar));
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m35291boximpl(Updater.m35292constructorimpl(composer)));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(C13074a<? extends T> aVar, Function1<? super Updater<T>, C11921v> function1, Composer composer, int i) {
        C12775o.m28639i(aVar, "factory");
        C12775o.m28639i(function1, "update");
        composer.startReplaceableGroup(1405779621);
        Applier<?> applier = composer.getApplier();
        C12775o.m28644n(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(new ComposablesKt$ReusableComposeNode$1(aVar));
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m35291boximpl(Updater.m35292constructorimpl(composer)));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void ReusableContent(Object obj, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        C12775o.m28639i(oVar, "content");
        composer.startReplaceableGroup(444418301);
        composer.startReusableGroup(ComposerKt.reuseKey, obj);
        oVar.invoke(composer, Integer.valueOf((i >> 3) & 14));
        composer.endReusableGroup();
        composer.endReplaceableGroup();
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    public static final void ReusableContentHost(boolean z, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        C12775o.m28639i(oVar, "content");
        composer.startReusableGroup(ComposerKt.reuseKey, Boolean.valueOf(z));
        boolean changed = composer.changed(z);
        if (z) {
            oVar.invoke(composer, Integer.valueOf((i >> 3) & 14));
        } else {
            composer.deactivateToEndGroup(changed);
        }
        composer.endReusableGroup();
    }

    @ReadOnlyComposable
    @Composable
    public static final Composer getCurrentComposer(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554250212, i, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:183)");
        }
        throw new C11905k("Implemented as an intrinsic");
    }

    @Composable
    public static final int getCurrentCompositeKeyHash(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(524444915, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:224)");
        }
        int compoundKeyHash = composer.getCompoundKeyHash();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compoundKeyHash;
    }

    @Composable
    public static final CompositionLocalContext getCurrentCompositionLocalContext(Composer composer, int i) {
        composer.startReplaceableGroup(-43352356);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-43352356, i, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:207)");
        }
        CompositionLocalContext compositionLocalContext = new CompositionLocalContext(composer.buildContext().getCompositionLocalScope$runtime_release());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return compositionLocalContext;
    }

    @ReadOnlyComposable
    @Composable
    public static final RecomposeScope getCurrentRecomposeScope(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394957799, i, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:192)");
        }
        RecomposeScope recomposeScope = composer.getRecomposeScope();
        if (recomposeScope != null) {
            composer.recordUsed(recomposeScope);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return recomposeScope;
        }
        throw new IllegalStateException("no recompose scope found".toString());
    }

    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    public static final <T> T key(Object[] objArr, C13088o<? super Composer, ? super Integer, ? extends T> oVar, Composer composer, int i) {
        C12775o.m28639i(objArr, "keys");
        C12775o.m28639i(oVar, "block");
        composer.startReplaceableGroup(-11941951);
        T invoke = oVar.invoke(composer, Integer.valueOf((i >> 3) & 14));
        composer.endReplaceableGroup();
        return invoke;
    }

    @Composable
    public static final <T> T remember(Object obj, C13074a<? extends T> aVar, Composer composer, int i) {
        C12775o.m28639i(aVar, "calculation");
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(obj);
        T rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = aVar.invoke();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        return rememberedValue;
    }

    @Composable
    public static final CompositionContext rememberCompositionContext(Composer composer, int i) {
        composer.startReplaceableGroup(-1165786124);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1165786124, i, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:480)");
        }
        CompositionContext buildContext = composer.buildContext();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buildContext;
    }

    @Composable
    public static final <T> T remember(Object obj, Object obj2, C13074a<? extends T> aVar, Composer composer, int i) {
        C12775o.m28639i(aVar, "calculation");
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        T rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = aVar.invoke();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        return rememberedValue;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(C13074a<? extends T> aVar, Function1<? super Updater<T>, C11921v> function1, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        C12775o.m28639i(aVar, "factory");
        C12775o.m28639i(function1, "update");
        C12775o.m28639i(oVar, "content");
        composer.startReplaceableGroup(-548224868);
        Applier<?> applier = composer.getApplier();
        C12775o.m28644n(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m35291boximpl(Updater.m35292constructorimpl(composer)));
        oVar.invoke(composer, Integer.valueOf((i >> 6) & 14));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(C13074a<? extends T> aVar, Function1<? super Updater<T>, C11921v> function1, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        C12775o.m28639i(aVar, "factory");
        C12775o.m28639i(function1, "update");
        C12775o.m28639i(oVar, "content");
        composer.startReplaceableGroup(-692256719);
        Applier<?> applier = composer.getApplier();
        C12775o.m28644n(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m35291boximpl(Updater.m35292constructorimpl(composer)));
        oVar.invoke(composer, Integer.valueOf((i >> 6) & 14));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final <T> T remember(Object obj, Object obj2, Object obj3, C13074a<? extends T> aVar, Composer composer, int i) {
        C12775o.m28639i(aVar, "calculation");
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        T rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = aVar.invoke();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        return rememberedValue;
    }

    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(C13074a<? extends T> aVar, Function1<? super Updater<T>, C11921v> function1, C13089p<? super SkippableUpdater<T>, ? super Composer, ? super Integer, C11921v> pVar, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        C12775o.m28639i(aVar, "factory");
        C12775o.m28639i(function1, "update");
        C12775o.m28639i(pVar, "skippableUpdate");
        C12775o.m28639i(oVar, "content");
        Applier<?> applier = composer.getApplier();
        C12775o.m28644n(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m35291boximpl(Updater.m35292constructorimpl(composer)));
        pVar.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, Integer.valueOf((i >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        oVar.invoke(composer, Integer.valueOf((i >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(C13074a<? extends T> aVar, Function1<? super Updater<T>, C11921v> function1, C13089p<? super SkippableUpdater<T>, ? super Composer, ? super Integer, C11921v> pVar, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        C12775o.m28639i(aVar, "factory");
        C12775o.m28639i(function1, "update");
        C12775o.m28639i(pVar, "skippableUpdate");
        C12775o.m28639i(oVar, "content");
        Applier<?> applier = composer.getApplier();
        C12775o.m28644n(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m35291boximpl(Updater.m35292constructorimpl(composer)));
        pVar.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, Integer.valueOf((i >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        oVar.invoke(composer, Integer.valueOf((i >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations() {
    }

    @Composable
    public static final <T> T remember(Object[] objArr, C13074a<? extends T> aVar, Composer composer, int i) {
        C12775o.m28639i(objArr, "keys");
        C12775o.m28639i(aVar, "calculation");
        composer.startReplaceableGroup(-568225417);
        boolean z = false;
        for (Object changed : objArr) {
            z |= composer.changed(changed);
        }
        T rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = aVar.invoke();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        return rememberedValue;
    }

    @Composable
    public static final <T> T remember(C13074a<? extends T> aVar, Composer composer, int i) {
        C12775o.m28639i(aVar, "calculation");
        composer.startReplaceableGroup(-492369756);
        T rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = aVar.invoke();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        return rememberedValue;
    }
}
