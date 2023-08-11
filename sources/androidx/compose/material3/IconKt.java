package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.IconButtonTokens;
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
import androidx.compose.p002ui.layout.ContentScale;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Icon.kt */
public final class IconKt {
    private static final Modifier DefaultIconSizeModifier = SizeKt.m33338size3ABfNKs(Modifier.Companion, IconButtonTokens.INSTANCE.m34996getIconSizeD9Ej5fM());

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Icon-ww6aTOc  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34466Iconww6aTOc(androidx.compose.p002ui.graphics.vector.ImageVector r17, java.lang.String r18, androidx.compose.p002ui.Modifier r19, long r20, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r1 = r17
            r6 = r23
            java.lang.String r0 = "imageVector"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            r0 = -126890956(0xfffffffff86fcc34, float:-1.9454698E34)
            r2 = r22
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            r3 = r24 & 1
            if (r3 == 0) goto L_0x0019
            r3 = r6 | 6
            goto L_0x0029
        L_0x0019:
            r3 = r6 & 14
            if (r3 != 0) goto L_0x0028
            boolean r3 = r2.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r6
            goto L_0x0029
        L_0x0028:
            r3 = r6
        L_0x0029:
            r4 = r24 & 2
            if (r4 == 0) goto L_0x0030
            r3 = r3 | 48
            goto L_0x0043
        L_0x0030:
            r4 = r6 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0043
            r4 = r18
            boolean r5 = r2.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x003f
            r5 = 32
            goto L_0x0041
        L_0x003f:
            r5 = 16
        L_0x0041:
            r3 = r3 | r5
            goto L_0x0045
        L_0x0043:
            r4 = r18
        L_0x0045:
            r5 = r24 & 4
            if (r5 == 0) goto L_0x004c
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r7 = r6 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x005f
            r7 = r19
            boolean r8 = r2.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x005b
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r3 = r3 | r8
            goto L_0x0061
        L_0x005f:
            r7 = r19
        L_0x0061:
            r8 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007a
            r8 = r24 & 8
            if (r8 != 0) goto L_0x0074
            r8 = r20
            boolean r10 = r2.changed((long) r8)
            if (r10 == 0) goto L_0x0076
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0074:
            r8 = r20
        L_0x0076:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r3 = r3 | r10
            goto L_0x007c
        L_0x007a:
            r8 = r20
        L_0x007c:
            r10 = r3 & 5851(0x16db, float:8.199E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x008f
            boolean r10 = r2.getSkipping()
            if (r10 != 0) goto L_0x0089
            goto L_0x008f
        L_0x0089:
            r2.skipToGroupEnd()
            r3 = r7
            goto L_0x00fa
        L_0x008f:
            r2.startDefaults()
            r10 = r6 & 1
            if (r10 == 0) goto L_0x00a8
            boolean r10 = r2.getDefaultsInvalid()
            if (r10 == 0) goto L_0x009d
            goto L_0x00a8
        L_0x009d:
            r2.skipToGroupEnd()
            r5 = r24 & 8
            if (r5 == 0) goto L_0x00a6
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00a6:
            r5 = r7
            goto L_0x00c4
        L_0x00a8:
            if (r5 == 0) goto L_0x00ad
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00ae
        L_0x00ad:
            r5 = r7
        L_0x00ae:
            r7 = r24 & 8
            if (r7 == 0) goto L_0x00c4
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.material3.ContentColorKt.getLocalContentColor()
            java.lang.Object r7 = r2.consume(r7)
            androidx.compose.ui.graphics.Color r7 = (androidx.compose.p002ui.graphics.Color) r7
            long r7 = r7.m35681unboximpl()
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r15 = r7
            goto L_0x00c5
        L_0x00c4:
            r15 = r8
        L_0x00c5:
            r2.endDefaults()
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x00d4
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.Icon (Icon.kt:55)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r3, r7, r8)
        L_0x00d4:
            r0 = r3 & 14
            androidx.compose.ui.graphics.vector.VectorPainter r7 = androidx.compose.p002ui.graphics.vector.VectorPainterKt.rememberVectorPainter(r1, r2, r0)
            int r0 = androidx.compose.p002ui.graphics.vector.VectorPainter.$stable
            r8 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r8
            r8 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r8
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r13 = r0 | r3
            r14 = 0
            r8 = r18
            r9 = r5
            r10 = r15
            r12 = r2
            m34465Iconww6aTOc((androidx.compose.p002ui.graphics.painter.Painter) r7, (java.lang.String) r8, (androidx.compose.p002ui.Modifier) r9, (long) r10, (androidx.compose.runtime.Composer) r12, (int) r13, (int) r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x00f8
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00f8:
            r3 = r5
            r8 = r15
        L_0x00fa:
            androidx.compose.runtime.ScopeUpdateScope r10 = r2.endRestartGroup()
            if (r10 != 0) goto L_0x0101
            goto L_0x0113
        L_0x0101:
            androidx.compose.material3.IconKt$Icon$1 r11 = new androidx.compose.material3.IconKt$Icon$1
            r0 = r11
            r1 = r17
            r2 = r18
            r4 = r8
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r10.updateScope(r11)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconKt.m34466Iconww6aTOc(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Modifier defaultSizeFor(Modifier modifier, Painter painter) {
        Modifier modifier2;
        if (Size.m35487equalsimpl0(painter.m36369getIntrinsicSizeNHjbRc(), Size.Companion.m35499getUnspecifiedNHjbRc()) || m34467isInfiniteuvyYCjk(painter.m36369getIntrinsicSizeNHjbRc())) {
            modifier2 = DefaultIconSizeModifier;
        } else {
            modifier2 = Modifier.Companion;
        }
        return modifier.then(modifier2);
    }

    /* renamed from: isInfinite-uvyYCjk  reason: not valid java name */
    private static final boolean m34467isInfiniteuvyYCjk(long j) {
        if (!Float.isInfinite(Size.m35491getWidthimpl(j)) || !Float.isInfinite(Size.m35488getHeightimpl(j))) {
            return false;
        }
        return true;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Icon-ww6aTOc  reason: not valid java name */
    public static final void m34464Iconww6aTOc(ImageBitmap imageBitmap, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        long j2;
        int i3;
        ImageBitmap imageBitmap2 = imageBitmap;
        C12775o.m28639i(imageBitmap2, "bitmap");
        Composer startRestartGroup = composer.startRestartGroup(-1092052280);
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        if ((i2 & 8) != 0) {
            j2 = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl();
            i3 = i & -7169;
        } else {
            j2 = j;
            i3 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1092052280, i3, -1, "androidx.compose.material3.Icon (Icon.kt:85)");
        }
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed((Object) imageBitmap2);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, 0, 0, 6, (DefaultConstructorMarker) null);
            startRestartGroup.updateRememberedValue(bitmapPainter);
            rememberedValue = bitmapPainter;
        }
        startRestartGroup.endReplaceableGroup();
        Composer composer2 = startRestartGroup;
        m34465Iconww6aTOc((Painter) (BitmapPainter) rememberedValue, str, companion, j2, startRestartGroup, (i3 & 112) | 8 | (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new IconKt$Icon$2(imageBitmap, str, companion, j2, i, i2));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Icon-ww6aTOc  reason: not valid java name */
    public static final void m34465Iconww6aTOc(Painter painter, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        long j2;
        int i3;
        Modifier modifier2;
        Painter painter2 = painter;
        String str2 = str;
        C12775o.m28639i(painter2, "painter");
        Composer startRestartGroup = composer.startRestartGroup(-2142239481);
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        if ((i2 & 8) != 0) {
            i3 = i & -7169;
            j2 = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl();
        } else {
            j2 = j;
            i3 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2142239481, i3, -1, "androidx.compose.material3.Icon (Icon.kt:116)");
        }
        ColorFilter r6 = Color.m35672equalsimpl0(j2, Color.Companion.m35707getUnspecified0d7_KjU()) ? null : ColorFilter.Companion.m35712tintxETnrds$default(ColorFilter.Companion, j2, 0, 2, (Object) null);
        startRestartGroup.startReplaceableGroup(69355216);
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
            endRestartGroup.updateScope(new IconKt$Icon$3(painter, str, companion, j3, i, i2));
        }
    }
}
