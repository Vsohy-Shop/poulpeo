package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.PainterModifierKt;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.p002ui.graphics.painter.BitmapPainter;
import androidx.compose.p002ui.graphics.painter.Painter;
import androidx.compose.p002ui.graphics.vector.ImageVector;
import androidx.compose.p002ui.graphics.vector.VectorPainter;
import androidx.compose.p002ui.graphics.vector.VectorPainterKt;
import androidx.compose.p002ui.layout.ContentScale;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icon.kt\nandroidx/compose/material/IconKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,170:1\n76#2:171\n76#2:172\n76#2:180\n36#3:173\n36#3:181\n1114#4,6:174\n1114#4,6:182\n154#5:188\n*S KotlinDebug\n*F\n+ 1 Icon.kt\nandroidx/compose/material/IconKt\n*L\n66#1:171\n100#1:172\n134#1:180\n102#1:173\n139#1:181\n102#1:174,6\n139#1:182,6\n169#1:188\n*E\n"})
/* compiled from: Icon.kt */
public final class IconKt {
    private static final Modifier DefaultIconSizeModifier = SizeKt.m33338size3ABfNKs(Modifier.Companion, C1232Dp.m38468constructorimpl((float) 24));

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Icon-ww6aTOc  reason: not valid java name */
    public static final void m34035Iconww6aTOc(ImageVector imageVector, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        ImageVector imageVector2 = imageVector;
        Composer composer2 = composer;
        int i3 = i;
        C12775o.m28639i(imageVector2, "imageVector");
        composer2.startReplaceableGroup(-800853103);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        long r4 = (i2 & 8) != 0 ? Color.m35670copywmQWz5c$default(((Color) composer2.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl(), ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-800853103, i3, -1, "androidx.compose.material.Icon (Icon.kt:61)");
        }
        m34034Iconww6aTOc((Painter) VectorPainterKt.rememberVectorPainter(imageVector2, composer2, i3 & 14), str, modifier2, r4, composer, VectorPainter.$stable | (i3 & 112) | (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    private static final Modifier defaultSizeFor(Modifier modifier, Painter painter) {
        Modifier modifier2;
        if (Size.m35487equalsimpl0(painter.m36369getIntrinsicSizeNHjbRc(), Size.Companion.m35499getUnspecifiedNHjbRc()) || m34036isInfiniteuvyYCjk(painter.m36369getIntrinsicSizeNHjbRc())) {
            modifier2 = DefaultIconSizeModifier;
        } else {
            modifier2 = Modifier.Companion;
        }
        return modifier.then(modifier2);
    }

    /* renamed from: isInfinite-uvyYCjk  reason: not valid java name */
    private static final boolean m34036isInfiniteuvyYCjk(long j) {
        if (!Float.isInfinite(Size.m35491getWidthimpl(j)) || !Float.isInfinite(Size.m35488getHeightimpl(j))) {
            return false;
        }
        return true;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Icon-ww6aTOc  reason: not valid java name */
    public static final void m34033Iconww6aTOc(ImageBitmap imageBitmap, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        ImageBitmap imageBitmap2 = imageBitmap;
        Composer composer2 = composer;
        int i3 = i;
        C12775o.m28639i(imageBitmap2, "bitmap");
        composer2.startReplaceableGroup(-554892675);
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        long r11 = (i2 & 8) != 0 ? Color.m35670copywmQWz5c$default(((Color) composer2.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl(), ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554892675, i3, -1, "androidx.compose.material.Icon (Icon.kt:95)");
        }
        composer2.startReplaceableGroup(1157296644);
        boolean changed = composer2.changed((Object) imageBitmap2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, 0, 0, 6, (DefaultConstructorMarker) null);
            composer2.updateRememberedValue(bitmapPainter);
            rememberedValue = bitmapPainter;
        }
        composer.endReplaceableGroup();
        m34034Iconww6aTOc((Painter) (BitmapPainter) rememberedValue, str, companion, r11, composer, (i3 & 112) | 8 | (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Icon-ww6aTOc  reason: not valid java name */
    public static final void m34034Iconww6aTOc(Painter painter, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        long j2;
        int i3;
        Modifier modifier2;
        Painter painter2 = painter;
        String str2 = str;
        C12775o.m28639i(painter2, "painter");
        Composer startRestartGroup = composer.startRestartGroup(-1142959010);
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        if ((i2 & 8) != 0) {
            i3 = i & -7169;
            j2 = Color.m35670copywmQWz5c$default(((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl(), ((Number) startRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j2 = j;
            i3 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1142959010, i3, -1, "androidx.compose.material.Icon (Icon.kt:129)");
        }
        ColorFilter r6 = Color.m35672equalsimpl0(j2, Color.Companion.m35707getUnspecified0d7_KjU()) ? null : ColorFilter.Companion.m35712tintxETnrds$default(ColorFilter.Companion, j2, 0, 2, (Object) null);
        startRestartGroup.startReplaceableGroup(1547387026);
        if (str2 != null) {
            Modifier.Companion companion2 = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed((Object) str2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new IconKt$Icon$semantics$1$1(str2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            modifier2 = SemanticsModifierKt.semantics$default(companion2, false, (Function1) rememberedValue, 1, (Object) null);
        } else {
            modifier2 = Modifier.Companion;
        }
        startRestartGroup.endReplaceableGroup();
        long j3 = j2;
        BoxKt.Box(PainterModifierKt.paint$default(defaultSizeFor(GraphicsLayerModifierKt.toolingGraphicsLayer(companion), painter2), painter, false, (Alignment) null, ContentScale.Companion.getFit(), 0.0f, r6, 22, (Object) null).then(modifier2), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new IconKt$Icon$1(painter, str, companion, j3, i, i2));
        }
    }
}
