package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@ExperimentalMaterialApi
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,731:1\n76#2:732\n76#2:733\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuDefaults\n*L\n353#1:732\n456#1:733\n*E\n"})
/* compiled from: ExposedDropdownMenu.kt */
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();

    private ExposedDropdownMenuDefaults() {
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @ExperimentalMaterialApi
    @Composable
    public final void TrailingIcon(boolean z, C13074a<C11921v> aVar, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(876077373);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (startRestartGroup.changed(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i6 != 0) {
                aVar = ExposedDropdownMenuDefaults$TrailingIcon$1.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(876077373, i3, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:285)");
            }
            IconButtonKt.IconButton(aVar, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, ExposedDropdownMenuDefaults$TrailingIcon$2.INSTANCE), false, (MutableInteractionSource) null, ComposableLambdaKt.composableLambda(startRestartGroup, 726122713, true, new ExposedDropdownMenuDefaults$TrailingIcon$3(z)), startRestartGroup, ((i3 >> 3) & 14) | 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        C13074a<C11921v> aVar2 = aVar;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ExposedDropdownMenuDefaults$TrailingIcon$4(this, z, aVar2, i, i2));
        }
    }

    @Composable
    /* renamed from: outlinedTextFieldColors-DlUQjxs  reason: not valid java name */
    public final TextFieldColors m34015outlinedTextFieldColorsDlUQjxs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, Composer composer, int i, int i2, int i3, int i4) {
        Composer composer2 = composer;
        int i5 = i4;
        composer2.startReplaceableGroup(1162641182);
        long r3 = (i5 & 1) != 0 ? Color.m35670copywmQWz5c$default(((Color) composer2.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl(), ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j;
        long r8 = (i5 & 2) != 0 ? Color.m35670copywmQWz5c$default(r3, ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long r36 = (i5 & 4) != 0 ? Color.Companion.m35706getTransparent0d7_KjU() : j3;
        long r10 = (i5 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer2, 6).m33952getPrimary0d7_KjU() : j4;
        long r14 = (i5 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer2, 6).m33946getError0d7_KjU() : j5;
        long r16 = (i5 & 32) != 0 ? Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33952getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j6;
        long r18 = (i5 & 64) != 0 ? Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j7;
        long r20 = (i5 & 128) != 0 ? Color.m35670copywmQWz5c$default(r18, ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long r22 = (i5 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer2, 6).m33946getError0d7_KjU() : j9;
        long r24 = (i5 & 512) != 0 ? Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j10;
        long r26 = (i5 & 1024) != 0 ? Color.m35670copywmQWz5c$default(r24, ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        long j23 = (i5 & 2048) != 0 ? r24 : j12;
        long r30 = (i5 & 4096) != 0 ? Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j13;
        long r32 = (i5 & 8192) != 0 ? Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33952getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j14;
        long r34 = (i5 & 16384) != 0 ? Color.m35670copywmQWz5c$default(r30, ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j15;
        long r38 = (32768 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer2, 6).m33946getError0d7_KjU() : j16;
        long r40 = (65536 & i5) != 0 ? Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33952getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j17;
        long r42 = (131072 & i5) != 0 ? Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j18;
        long r44 = (262144 & i5) != 0 ? Color.m35670copywmQWz5c$default(r42, ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j19;
        long r46 = (524288 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer2, 6).m33946getError0d7_KjU() : j20;
        long r48 = (1048576 & i5) != 0 ? Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j21;
        long r51 = (i5 & 2097152) != 0 ? Color.m35670copywmQWz5c$default(r48, ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j22;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1162641182, i, i2, "androidx.compose.material.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:454)");
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(r3, r8, r10, r14, r16, r18, r22, r20, r24, r26, j23, r30, r32, r34, r38, r36, r40, r42, r44, r46, r48, r51, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldForExposedDropdownMenusColors;
    }

    @Composable
    /* renamed from: textFieldColors-DlUQjxs  reason: not valid java name */
    public final TextFieldColors m34016textFieldColorsDlUQjxs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, Composer composer, int i, int i2, int i3, int i4) {
        Composer composer2 = composer;
        int i5 = i4;
        composer2.startReplaceableGroup(1208167904);
        long r3 = (i5 & 1) != 0 ? Color.m35670copywmQWz5c$default(((Color) composer2.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl(), ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j;
        long r8 = (i5 & 2) != 0 ? Color.m35670copywmQWz5c$default(r3, ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long r36 = (i5 & 4) != 0 ? Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long r10 = (i5 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer2, 6).m33952getPrimary0d7_KjU() : j4;
        long r14 = (i5 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer2, 6).m33946getError0d7_KjU() : j5;
        long r16 = (i5 & 32) != 0 ? Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33952getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j6;
        long r18 = (i5 & 64) != 0 ? Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j7;
        long r20 = (i5 & 128) != 0 ? Color.m35670copywmQWz5c$default(r18, ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long r22 = (i5 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer2, 6).m33946getError0d7_KjU() : j9;
        long r24 = (i5 & 512) != 0 ? Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j10;
        long r26 = (i5 & 1024) != 0 ? Color.m35670copywmQWz5c$default(r24, ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        long j23 = (i5 & 2048) != 0 ? r24 : j12;
        long r30 = (i5 & 4096) != 0 ? Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j13;
        long r32 = (i5 & 8192) != 0 ? Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33952getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j14;
        long r34 = (i5 & 16384) != 0 ? Color.m35670copywmQWz5c$default(r30, ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j15;
        long r38 = (32768 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer2, 6).m33946getError0d7_KjU() : j16;
        long r40 = (65536 & i5) != 0 ? Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33952getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j17;
        long r42 = (131072 & i5) != 0 ? Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j18;
        long r44 = (262144 & i5) != 0 ? Color.m35670copywmQWz5c$default(r42, ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j19;
        long r46 = (524288 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer2, 6).m33946getError0d7_KjU() : j20;
        long r48 = (1048576 & i5) != 0 ? Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j21;
        long r51 = (i5 & 2097152) != 0 ? Color.m35670copywmQWz5c$default(r48, ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j22;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1208167904, i, i2, "androidx.compose.material.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:351)");
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(r3, r8, r10, r14, r16, r18, r22, r20, r24, r26, j23, r30, r32, r34, r38, r36, r40, r42, r44, r46, r48, r51, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldForExposedDropdownMenusColors;
    }
}
