package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.ClipKt;
import androidx.compose.p002ui.draw.ShadowKt;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.RectangleShapeKt;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: Surface.kt */
public final class SurfaceKt {
    private static final ProvidableCompositionLocal<C1232Dp> LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default((SnapshotMutationPolicy) null, SurfaceKt$LocalAbsoluteTonalElevation$1.INSTANCE, 1, (Object) null);

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    /* renamed from: Surface-T9BRK9s  reason: not valid java name */
    public static final void m34602SurfaceT9BRK9s(Modifier modifier, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i, int i2) {
        Modifier modifier2;
        Shape shape2;
        long j3;
        long j4;
        float f3;
        float f4;
        BorderStroke borderStroke2;
        Composer composer2 = composer;
        int i3 = i;
        C12775o.m28639i(oVar, "content");
        composer2.startReplaceableGroup(-513881741);
        if ((i2 & 1) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i2 & 2) != 0) {
            shape2 = RectangleShapeKt.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i2 & 4) != 0) {
            j3 = MaterialTheme.INSTANCE.getColorScheme(composer2, 6).m34323getSurface0d7_KjU();
        } else {
            j3 = j;
        }
        if ((i2 & 8) != 0) {
            j4 = ColorSchemeKt.m34359contentColorForek8zF_U(j3, composer2, (i3 >> 6) & 14);
        } else {
            j4 = j2;
        }
        if ((i2 & 16) != 0) {
            f3 = C1232Dp.m38468constructorimpl((float) 0);
        } else {
            f3 = f;
        }
        if ((i2 & 32) != 0) {
            f4 = C1232Dp.m38468constructorimpl((float) 0);
        } else {
            f4 = f2;
        }
        if ((i2 & 64) != 0) {
            borderStroke2 = null;
        } else {
            borderStroke2 = borderStroke;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-513881741, i3, -1, "androidx.compose.material3.Surface (Surface.kt:98)");
        }
        ProvidableCompositionLocal providableCompositionLocal = LocalAbsoluteTonalElevation;
        float r6 = C1232Dp.m38468constructorimpl(((C1232Dp) composer2.consume(providableCompositionLocal)).m38482unboximpl() + f3);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(j4)), providableCompositionLocal.provides(C1232Dp.m38466boximpl(r6))}, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer2, -70914509, true, new SurfaceKt$Surface$1(modifier2, shape2, j3, r6, i, borderStroke2, f4, oVar)), composer2, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    /* renamed from: Surface-d85dljk  reason: not valid java name */
    public static final void m34604Surfaced85dljk(boolean z, C13074a<C11921v> aVar, Modifier modifier, boolean z2, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i, int i2, int i3) {
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2 = composer;
        int i4 = i;
        int i5 = i3;
        C12775o.m28639i(aVar, "onClick");
        C12775o.m28639i(oVar, "content");
        composer2.startReplaceableGroup(540296512);
        Modifier modifier2 = (i5 & 4) != 0 ? Modifier.Companion : modifier;
        boolean z3 = (i5 & 8) != 0 ? true : z2;
        Shape rectangleShape = (i5 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long r5 = (i5 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer2, 6).m34323getSurface0d7_KjU() : j;
        long r8 = (i5 & 64) != 0 ? ColorSchemeKt.m34359contentColorForek8zF_U(r5, composer2, (i4 >> 15) & 14) : j2;
        float r10 = (i5 & 128) != 0 ? C1232Dp.m38468constructorimpl((float) 0) : f;
        float r15 = (i5 & 256) != 0 ? C1232Dp.m38468constructorimpl((float) 0) : f2;
        BorderStroke borderStroke2 = (i5 & 512) != 0 ? null : borderStroke;
        if ((i5 & 1024) != 0) {
            composer2.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer2.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(540296512, i4, i2, "androidx.compose.material3.Surface (Surface.kt:311)");
        } else {
            int i6 = i2;
        }
        ProvidableCompositionLocal providableCompositionLocal = LocalAbsoluteTonalElevation;
        float r102 = C1232Dp.m38468constructorimpl(((C1232Dp) composer2.consume(providableCompositionLocal)).m38482unboximpl() + r10);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(r8)), providableCompositionLocal.provides(C1232Dp.m38466boximpl(r102))}, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer2, -1164547968, true, new SurfaceKt$Surface$5(modifier2, rectangleShape, r5, r102, i, borderStroke2, r15, z, mutableInteractionSource2, z3, aVar, oVar, i2)), composer2, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    /* renamed from: Surface-o_FOJdg  reason: not valid java name */
    public static final void m34605Surfaceo_FOJdg(C13074a<C11921v> aVar, Modifier modifier, boolean z, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i, int i2, int i3) {
        Modifier modifier2;
        boolean z2;
        Shape shape2;
        long j3;
        long j4;
        float f3;
        float f4;
        BorderStroke borderStroke2;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2 = composer;
        int i4 = i;
        int i5 = i3;
        C12775o.m28639i(aVar, "onClick");
        C12775o.m28639i(oVar, "content");
        composer2.startReplaceableGroup(-789752804);
        if ((i5 & 2) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i5 & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i5 & 8) != 0) {
            shape2 = RectangleShapeKt.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i5 & 16) != 0) {
            j3 = MaterialTheme.INSTANCE.getColorScheme(composer2, 6).m34323getSurface0d7_KjU();
        } else {
            j3 = j;
        }
        if ((i5 & 32) != 0) {
            j4 = ColorSchemeKt.m34359contentColorForek8zF_U(j3, composer2, (i4 >> 12) & 14);
        } else {
            j4 = j2;
        }
        if ((i5 & 64) != 0) {
            f3 = C1232Dp.m38468constructorimpl((float) 0);
        } else {
            f3 = f;
        }
        if ((i5 & 128) != 0) {
            f4 = C1232Dp.m38468constructorimpl((float) 0);
        } else {
            f4 = f2;
        }
        if ((i5 & 256) != 0) {
            borderStroke2 = null;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i5 & 512) != 0) {
            composer2.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer2.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-789752804, i4, i2, "androidx.compose.material3.Surface (Surface.kt:200)");
        } else {
            int i6 = i2;
        }
        ProvidableCompositionLocal providableCompositionLocal = LocalAbsoluteTonalElevation;
        float r10 = C1232Dp.m38468constructorimpl(((C1232Dp) composer2.consume(providableCompositionLocal)).m38482unboximpl() + f3);
        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(j4)), providableCompositionLocal.provides(C1232Dp.m38466boximpl(r10))};
        ProvidedValue[] providedValueArr2 = providedValueArr;
        SurfaceKt$Surface$3 surfaceKt$Surface$3 = r1;
        SurfaceKt$Surface$3 surfaceKt$Surface$32 = new SurfaceKt$Surface$3(modifier2, shape2, j3, r10, i, borderStroke2, f4, mutableInteractionSource2, z2, aVar, oVar, i2);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer2, 1279702876, true, surfaceKt$Surface$3), composer2, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final ProvidableCompositionLocal<C1232Dp> getLocalAbsoluteTonalElevation() {
        return LocalAbsoluteTonalElevation;
    }

    /* access modifiers changed from: private */
    /* renamed from: surface-8ww4TTg  reason: not valid java name */
    public static final Modifier m34608surface8ww4TTg(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        Modifier modifier2;
        Modifier r10 = ShadowKt.m35337shadows4CzXII$default(modifier, f, shape, false, 0, 0, 24, (Object) null);
        if (borderStroke != null) {
            modifier2 = BorderKt.border(Modifier.Companion, borderStroke, shape);
        } else {
            modifier2 = Modifier.Companion;
        }
        return ClipKt.clip(BackgroundKt.m32956backgroundbw27NRU(r10.then(modifier2), j, shape), shape);
    }

    /* access modifiers changed from: private */
    @Composable
    /* renamed from: surfaceColorAtElevation-CLU3JFs  reason: not valid java name */
    public static final long m34609surfaceColorAtElevationCLU3JFs(long j, float f, Composer composer, int i) {
        composer.startReplaceableGroup(-2079918090);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:481)");
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        if (Color.m35672equalsimpl0(j, materialTheme.getColorScheme(composer, 6).m34323getSurface0d7_KjU())) {
            j = ColorSchemeKt.m34364surfaceColorAtElevation3ABfNKs(materialTheme.getColorScheme(composer, 6), f);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    /* renamed from: Surface-d85dljk  reason: not valid java name */
    public static final void m34603Surfaced85dljk(boolean z, Function1<? super Boolean, C11921v> function1, Modifier modifier, boolean z2, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i, int i2, int i3) {
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2 = composer;
        int i4 = i;
        int i5 = i3;
        C12775o.m28639i(function1, "onCheckedChange");
        C12775o.m28639i(oVar, "content");
        composer2.startReplaceableGroup(-1877401889);
        Modifier modifier2 = (i5 & 4) != 0 ? Modifier.Companion : modifier;
        boolean z3 = (i5 & 8) != 0 ? true : z2;
        Shape rectangleShape = (i5 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long r5 = (i5 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer2, 6).m34323getSurface0d7_KjU() : j;
        long r8 = (i5 & 64) != 0 ? ColorSchemeKt.m34359contentColorForek8zF_U(r5, composer2, (i4 >> 15) & 14) : j2;
        float r10 = (i5 & 128) != 0 ? C1232Dp.m38468constructorimpl((float) 0) : f;
        float r15 = (i5 & 256) != 0 ? C1232Dp.m38468constructorimpl((float) 0) : f2;
        BorderStroke borderStroke2 = (i5 & 512) != 0 ? null : borderStroke;
        if ((i5 & 1024) != 0) {
            composer2.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer2.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877401889, i4, i2, "androidx.compose.material3.Surface (Surface.kt:424)");
        } else {
            int i6 = i2;
        }
        ProvidableCompositionLocal providableCompositionLocal = LocalAbsoluteTonalElevation;
        float r102 = C1232Dp.m38468constructorimpl(((C1232Dp) composer2.consume(providableCompositionLocal)).m38482unboximpl() + r10);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(r8)), providableCompositionLocal.provides(C1232Dp.m38466boximpl(r102))}, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer2, 712720927, true, new SurfaceKt$Surface$7(modifier2, rectangleShape, r5, r102, i, borderStroke2, r15, z, mutableInteractionSource2, z3, function1, oVar, i2)), composer2, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
