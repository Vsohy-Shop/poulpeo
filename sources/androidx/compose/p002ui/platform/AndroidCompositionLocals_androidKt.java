package androidx.compose.p002ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.p002ui.platform.AndroidComposeView;
import androidx.compose.p002ui.res.ImageVectorCache;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,170:1\n25#2:171\n36#2:178\n25#2:185\n25#2:192\n25#2:199\n25#2:206\n25#2:214\n1114#3,6:172\n1114#3,6:179\n1114#3,6:186\n1114#3,6:193\n1114#3,6:200\n1114#3,3:207\n1117#3,3:211\n1114#3,6:215\n1#4:210\n76#5:221\n102#5,2:222\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n*L\n90#1:171\n97#1:178\n99#1:185\n104#1:192\n137#1:199\n138#1:206\n141#1:214\n90#1:172,6\n97#1:179,6\n99#1:186,6\n104#1:193,6\n137#1:200,6\n138#1:207,3\n138#1:211,3\n141#1:215,6\n90#1:221\n90#1:222,2\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt */
/* compiled from: AndroidCompositionLocals.android.kt */
public final class AndroidCompositionLocals_androidKt {
    private static final ProvidableCompositionLocal<Configuration> LocalConfiguration = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.neverEqualPolicy(), AndroidCompositionLocals_androidKt$LocalConfiguration$1.INSTANCE);
    private static final ProvidableCompositionLocal<Context> LocalContext = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalContext$1.INSTANCE);
    private static final ProvidableCompositionLocal<ImageVectorCache> LocalImageVectorCache = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.INSTANCE);
    private static final ProvidableCompositionLocal<LifecycleOwner> LocalLifecycleOwner = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1.INSTANCE);
    private static final ProvidableCompositionLocal<SavedStateRegistryOwner> LocalSavedStateRegistryOwner = CompositionLocalKt.staticCompositionLocalOf(C1086x7efe3756.INSTANCE);
    private static final ProvidableCompositionLocal<View> LocalView = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalView$1.INSTANCE);

    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    public static final void ProvideAndroidCompositionLocals(AndroidComposeView androidComposeView, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        C12775o.m28639i(androidComposeView, "owner");
        C12775o.m28639i(oVar, "content");
        Composer startRestartGroup = composer.startRestartGroup(1396852028);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1396852028, i, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:83)");
        }
        Context context = androidComposeView.getContext();
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateOf(context.getResources().getConfiguration(), SnapshotStateKt.neverEqualPolicy());
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed((Object) mutableState);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new C1087x68d8e1f6(mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        androidComposeView.setConfigurationChangeObserver((Function1) rememberedValue2);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            C12775o.m28638h(context, "context");
            rememberedValue3 = new AndroidUriHandler(context);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        AndroidUriHandler androidUriHandler = (AndroidUriHandler) rememberedValue3;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners != null) {
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry((View) androidComposeView, viewTreeOwners.getSavedStateRegistryOwner());
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            DisposableSaveableStateRegistry disposableSaveableStateRegistry = (DisposableSaveableStateRegistry) rememberedValue4;
            EffectsKt.DisposableEffect((Object) C11921v.f18618a, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new C1088x611323aa(disposableSaveableStateRegistry), startRestartGroup, 6);
            C12775o.m28638h(context, "context");
            ImageVectorCache obtainImageVectorCache = obtainImageVectorCache(context, ProvideAndroidCompositionLocals$lambda$1(mutableState), startRestartGroup, 72);
            ProvidableCompositionLocal<Configuration> providableCompositionLocal = LocalConfiguration;
            Configuration ProvideAndroidCompositionLocals$lambda$1 = ProvideAndroidCompositionLocals$lambda$1(mutableState);
            C12775o.m28638h(ProvideAndroidCompositionLocals$lambda$1, "configuration");
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{providableCompositionLocal.provides(ProvideAndroidCompositionLocals$lambda$1), LocalContext.provides(context), LocalLifecycleOwner.provides(viewTreeOwners.getLifecycleOwner()), LocalSavedStateRegistryOwner.provides(viewTreeOwners.getSavedStateRegistryOwner()), SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(disposableSaveableStateRegistry), LocalView.provides(androidComposeView.getView()), LocalImageVectorCache.provides(obtainImageVectorCache)}, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(startRestartGroup, 1471621628, true, new C1089x611323ab(androidComposeView, androidUriHandler, oVar, i)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new C1090x611323ac(androidComposeView, oVar, i));
                return;
            }
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    private static final Configuration ProvideAndroidCompositionLocals$lambda$1(MutableState<Configuration> mutableState) {
        return mutableState.getValue();
    }

    /* access modifiers changed from: private */
    public static final void ProvideAndroidCompositionLocals$lambda$2(MutableState<Configuration> mutableState, Configuration configuration) {
        mutableState.setValue(configuration);
    }

    public static final ProvidableCompositionLocal<Configuration> getLocalConfiguration() {
        return LocalConfiguration;
    }

    public static final ProvidableCompositionLocal<Context> getLocalContext() {
        return LocalContext;
    }

    public static final ProvidableCompositionLocal<ImageVectorCache> getLocalImageVectorCache() {
        return LocalImageVectorCache;
    }

    public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
        return LocalLifecycleOwner;
    }

    public static final ProvidableCompositionLocal<SavedStateRegistryOwner> getLocalSavedStateRegistryOwner() {
        return LocalSavedStateRegistryOwner;
    }

    public static final ProvidableCompositionLocal<View> getLocalView() {
        return LocalView;
    }

    /* access modifiers changed from: private */
    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @Stable
    @Composable
    private static final ImageVectorCache obtainImageVectorCache(Context context, Configuration configuration, Composer composer, int i) {
        composer.startReplaceableGroup(-485908294);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-485908294, i, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:132)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new ImageVectorCache();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ImageVectorCache imageVectorCache = (ImageVectorCache) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        Configuration configuration2 = rememberedValue2;
        if (rememberedValue2 == companion.getEmpty()) {
            Configuration configuration3 = new Configuration();
            if (configuration != null) {
                configuration3.setTo(configuration);
            }
            composer.updateRememberedValue(configuration3);
            configuration2 = configuration3;
        }
        composer.endReplaceableGroup();
        Configuration configuration4 = (Configuration) configuration2;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new C1091x477bcb35(configuration4, imageVectorCache);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect((Object) imageVectorCache, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(context, (C1091x477bcb35) rememberedValue3), composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageVectorCache;
    }
}
