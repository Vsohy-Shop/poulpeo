package androidx.compose.foundation;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.ClipKt;
import androidx.compose.p002ui.draw.PainterModifierKt;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.FilterQuality;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.p002ui.graphics.painter.Painter;
import androidx.compose.p002ui.graphics.vector.ImageVector;
import androidx.compose.p002ui.graphics.vector.VectorPainter;
import androidx.compose.p002ui.graphics.vector.VectorPainterKt;
import androidx.compose.p002ui.layout.ContentScale;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,269:1\n36#2:270\n36#2:277\n456#2,14:297\n1114#3,6:271\n1114#3,6:278\n74#4:284\n75#4,11:286\n88#4:311\n76#5:285\n*S KotlinDebug\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n*L\n154#1:270\n246#1:277\n256#1:297,14\n154#1:271,6\n246#1:278,6\n256#1:284\n256#1:286,11\n256#1:311\n256#1:285\n*E\n"})
/* compiled from: Image.kt */
public final class ImageKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final /* synthetic */ void Image(ImageBitmap imageBitmap, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Composer composer, int i, int i2) {
        int i3 = i;
        ImageBitmap imageBitmap2 = imageBitmap;
        C12775o.m28639i(imageBitmap, "bitmap");
        composer.startReplaceableGroup(-2123228673);
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i2 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i2 & 16) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i2 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2123228673, i3, -1, "androidx.compose.foundation.Image (Image.kt:87)");
        }
        m33001Image5hnEew(imageBitmap, str, companion, center, fit, f2, colorFilter2, FilterQuality.Companion.m35766getLowfv9h1I(), composer, (i3 & 112) | 8 | (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.compose.ui.graphics.painter.BitmapPainter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Image-5h-nEew  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m33001Image5hnEew(androidx.compose.p002ui.graphics.ImageBitmap r16, java.lang.String r17, androidx.compose.p002ui.Modifier r18, androidx.compose.p002ui.Alignment r19, androidx.compose.p002ui.layout.ContentScale r20, float r21, androidx.compose.p002ui.graphics.ColorFilter r22, int r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            r0 = r16
            r10 = r24
            r8 = r25
            r1 = r26
            java.lang.String r2 = "bitmap"
            kotlin.jvm.internal.C12775o.m28639i(r0, r2)
            r2 = -1396260732(0xffffffffacc6c084, float:-5.648872E-12)
            r10.startReplaceableGroup(r2)
            r3 = r1 & 4
            if (r3 == 0) goto L_0x001b
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            r9 = r3
            goto L_0x001d
        L_0x001b:
            r9 = r18
        L_0x001d:
            r3 = r1 & 8
            if (r3 == 0) goto L_0x0029
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r3 = r3.getCenter()
            r11 = r3
            goto L_0x002b
        L_0x0029:
            r11 = r19
        L_0x002b:
            r3 = r1 & 16
            if (r3 == 0) goto L_0x0037
            androidx.compose.ui.layout.ContentScale$Companion r3 = androidx.compose.p002ui.layout.ContentScale.Companion
            androidx.compose.ui.layout.ContentScale r3 = r3.getFit()
            r12 = r3
            goto L_0x0039
        L_0x0037:
            r12 = r20
        L_0x0039:
            r3 = r1 & 32
            if (r3 == 0) goto L_0x0041
            r3 = 1065353216(0x3f800000, float:1.0)
            r13 = r3
            goto L_0x0043
        L_0x0041:
            r13 = r21
        L_0x0043:
            r3 = r1 & 64
            if (r3 == 0) goto L_0x004a
            r3 = 0
            r14 = r3
            goto L_0x004c
        L_0x004a:
            r14 = r22
        L_0x004c:
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0058
            androidx.compose.ui.graphics.drawscope.DrawScope$Companion r1 = androidx.compose.p002ui.graphics.drawscope.DrawScope.Companion
            int r1 = r1.m36276getDefaultFilterQualityfv9h1I()
            r5 = r1
            goto L_0x005a
        L_0x0058:
            r5 = r23
        L_0x005a:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0066
            r1 = -1
            java.lang.String r3 = "androidx.compose.foundation.Image (Image.kt:143)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r8, r1, r3)
        L_0x0066:
            r1 = 1157296644(0x44faf204, float:2007.563)
            r10.startReplaceableGroup(r1)
            boolean r1 = r10.changed((java.lang.Object) r0)
            java.lang.Object r2 = r24.rememberedValue()
            if (r1 != 0) goto L_0x007e
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r2 != r1) goto L_0x008d
        L_0x007e:
            r1 = 0
            r3 = 0
            r6 = 6
            r7 = 0
            r0 = r16
            androidx.compose.ui.graphics.painter.BitmapPainter r2 = androidx.compose.p002ui.graphics.painter.BitmapPainterKt.m36363BitmapPainterQZhYCtY$default(r0, r1, r3, r5, r6, r7)
            r10.updateRememberedValue(r2)
        L_0x008d:
            r24.endReplaceableGroup()
            r0 = r2
            androidx.compose.ui.graphics.painter.BitmapPainter r0 = (androidx.compose.p002ui.graphics.painter.BitmapPainter) r0
            r1 = r8 & 112(0x70, float:1.57E-43)
            r1 = r1 | 8
            r2 = r8 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r8 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r8
            r1 = r1 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r8
            r1 = r1 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r8
            r8 = r1 | r2
            r15 = 0
            r1 = r17
            r2 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r24
            r9 = r15
            Image((androidx.compose.p002ui.graphics.painter.Painter) r0, (java.lang.String) r1, (androidx.compose.p002ui.Modifier) r2, (androidx.compose.p002ui.Alignment) r3, (androidx.compose.p002ui.layout.ContentScale) r4, (float) r5, (androidx.compose.p002ui.graphics.ColorFilter) r6, (androidx.compose.runtime.Composer) r7, (int) r8, (int) r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x00c2
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00c2:
            r24.endReplaceableGroup()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ImageKt.m33001Image5hnEew(androidx.compose.ui.graphics.ImageBitmap, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, androidx.compose.ui.layout.ContentScale, float, androidx.compose.ui.graphics.ColorFilter, int, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Image(ImageVector imageVector, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Composer composer, int i, int i2) {
        ImageVector imageVector2 = imageVector;
        Composer composer2 = composer;
        int i3 = i;
        C12775o.m28639i(imageVector, "imageVector");
        composer2.startReplaceableGroup(1595907091);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i2 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i2 & 16) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i2 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1595907091, i3, -1, "androidx.compose.foundation.Image (Image.kt:189)");
        }
        Image((Painter) VectorPainterKt.rememberVectorPainter(imageVector, composer2, i3 & 14), str, modifier2, center, fit, f2, colorFilter2, composer, VectorPainter.$stable | (i3 & 112) | (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Image(Painter painter, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Composer composer, int i, int i2) {
        Modifier modifier2;
        String str2 = str;
        C12775o.m28639i(painter, "painter");
        Composer startRestartGroup = composer.startRestartGroup(1142754848);
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i2 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i2 & 16) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i2 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1142754848, i, -1, "androidx.compose.foundation.Image (Image.kt:235)");
        } else {
            int i3 = i;
        }
        startRestartGroup.startReplaceableGroup(-816794123);
        if (str2 != null) {
            Modifier.Companion companion2 = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed((Object) str2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ImageKt$Image$semantics$1$1(str2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            modifier2 = SemanticsModifierKt.semantics$default(companion2, false, (Function1) rememberedValue, 1, (Object) null);
        } else {
            modifier2 = Modifier.Companion;
        }
        startRestartGroup.endReplaceableGroup();
        Modifier paint$default = PainterModifierKt.paint$default(ClipKt.clipToBounds(companion.then(modifier2)), painter, false, center, fit, f2, colorFilter2, 2, (Object) null);
        ImageKt$Image$2 imageKt$Image$2 = ImageKt$Image$2.INSTANCE;
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        C13074a<ComposeUiNode> constructor = companion3.getConstructor();
        C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(paint$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer r9 = Updater.m35292constructorimpl(startRestartGroup);
        Updater.m35299setimpl(r9, imageKt$Image$2, companion3.getSetMeasurePolicy());
        Updater.m35299setimpl(r9, density, companion3.getSetDensity());
        Updater.m35299setimpl(r9, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m35299setimpl(r9, viewConfiguration, companion3.getSetViewConfiguration());
        materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ImageKt$Image$3(painter, str, companion, center, fit, f2, colorFilter2, i, i2));
        }
    }
}
