package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.CacheDrawScope;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.graphics.BlendMode;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.CanvasKt;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.p002ui.graphics.ImageBitmapConfig;
import androidx.compose.p002ui.graphics.ImageBitmapKt;
import androidx.compose.p002ui.graphics.colorspace.ColorSpace;
import androidx.compose.p002ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,331:1\n558#2,17:332\n50#3:349\n49#3:350\n1114#4,6:351\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n*L\n194#1:332,17\n232#1:349\n232#1:350\n232#1:351,6\n*E\n"})
/* compiled from: AndroidSelectionHandles.android.kt */
public final class AndroidSelectionHandles_androidKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DefaultSelectionHandle(Modifier modifier, boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C12775o.m28639i(modifier, "modifier");
        C12775o.m28639i(resolvedTextDirection, "direction");
        Composer startRestartGroup = composer.startRestartGroup(47957398);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed((Object) modifier)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changed((Object) resolvedTextDirection)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changed(z2)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(47957398, i, -1, "androidx.compose.foundation.text.selection.DefaultSelectionHandle (AndroidSelectionHandles.android.kt:95)");
            }
            SpacerKt.Spacer(drawSelectionHandle(SizeKt.m33340sizeVpY3zN4(modifier, SelectionHandlesKt.getHandleWidth(), SelectionHandlesKt.getHandleHeight()), z, resolvedTextDirection, z2), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidSelectionHandles_androidKt$DefaultSelectionHandle$1(modifier, z, resolvedTextDirection, z2, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.compose.foundation.text.selection.HandlePositionProvider} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: HandlePopup-ULxng0E  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m33749HandlePopupULxng0E(long r24, androidx.compose.foundation.text.selection.HandleReferencePoint r26, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            r3 = r26
            r11 = r27
            r12 = r29
            java.lang.String r0 = "handleReferencePoint"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r0 = -1409050158(0xffffffffac0399d2, float:-1.8701607E-12)
            r1 = r28
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r12 & 14
            r13 = r24
            if (r2 != 0) goto L_0x002a
            boolean r2 = r1.changed((long) r13)
            if (r2 == 0) goto L_0x0027
            r2 = 4
            goto L_0x0028
        L_0x0027:
            r2 = 2
        L_0x0028:
            r2 = r2 | r12
            goto L_0x002b
        L_0x002a:
            r2 = r12
        L_0x002b:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x003b
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0038
            r4 = 32
            goto L_0x003a
        L_0x0038:
            r4 = 16
        L_0x003a:
            r2 = r2 | r4
        L_0x003b:
            r4 = r12 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x004b
            boolean r4 = r1.changedInstance(r11)
            if (r4 == 0) goto L_0x0048
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x004a
        L_0x0048:
            r4 = 128(0x80, float:1.794E-43)
        L_0x004a:
            r2 = r2 | r4
        L_0x004b:
            r4 = r2 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x005d
            boolean r4 = r1.getSkipping()
            if (r4 != 0) goto L_0x0058
            goto L_0x005d
        L_0x0058:
            r1.skipToGroupEnd()
            goto L_0x00da
        L_0x005d:
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x0069
            r4 = -1
            java.lang.String r5 = "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:224)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r2, r4, r5)
        L_0x0069:
            float r0 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r24)
            int r0 = p418qf.C13265c.m30134c(r0)
            float r4 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r24)
            int r4 = p418qf.C13265c.m30134c(r4)
            long r4 = androidx.compose.p002ui.unit.IntOffsetKt.IntOffset(r0, r4)
            androidx.compose.ui.unit.IntOffset r0 = androidx.compose.p002ui.unit.IntOffset.m38577boximpl(r4)
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.startReplaceableGroup(r6)
            boolean r6 = r1.changed((java.lang.Object) r3)
            boolean r0 = r1.changed((java.lang.Object) r0)
            r0 = r0 | r6
            java.lang.Object r6 = r1.rememberedValue()
            if (r0 != 0) goto L_0x009e
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r6 != r0) goto L_0x00a7
        L_0x009e:
            androidx.compose.foundation.text.selection.HandlePositionProvider r6 = new androidx.compose.foundation.text.selection.HandlePositionProvider
            r0 = 0
            r6.<init>(r3, r4, r0)
            r1.updateRememberedValue(r6)
        L_0x00a7:
            r1.endReplaceableGroup()
            r4 = r6
            androidx.compose.foundation.text.selection.HandlePositionProvider r4 = (androidx.compose.foundation.text.selection.HandlePositionProvider) r4
            r5 = 0
            androidx.compose.ui.window.PopupProperties r6 = new androidx.compose.ui.window.PopupProperties
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 1
            r21 = 0
            r22 = 15
            r23 = 0
            r15 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            int r0 = r2 << 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r9 = r0 | 384(0x180, float:5.38E-43)
            r10 = 2
            r7 = r27
            r8 = r1
            androidx.compose.p002ui.window.AndroidPopup_androidKt.Popup(r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x00da
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00da:
            androidx.compose.runtime.ScopeUpdateScope r6 = r1.endRestartGroup()
            if (r6 != 0) goto L_0x00e1
            goto L_0x00f2
        L_0x00e1:
            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1 r7 = new androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1
            r0 = r7
            r1 = r24
            r3 = r26
            r4 = r27
            r5 = r29
            r0.<init>(r1, r3, r4, r5)
            r6.updateScope(r7)
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.m33749HandlePopupULxng0E(long, androidx.compose.foundation.text.selection.HandleReferencePoint, of.o, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    /* renamed from: SelectionHandle-8fL75-g  reason: not valid java name */
    public static final void m33750SelectionHandle8fL75g(long j, boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2, Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        int i2;
        HandleReferencePoint handleReferencePoint;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ResolvedTextDirection resolvedTextDirection2 = resolvedTextDirection;
        Modifier modifier2 = modifier;
        int i9 = i;
        C12775o.m28639i(resolvedTextDirection2, "direction");
        C12775o.m28639i(modifier2, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(-616295642);
        long j2 = j;
        if ((i9 & 14) == 0) {
            if (startRestartGroup.changed(j2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i9;
        } else {
            i2 = i9;
        }
        boolean z3 = z;
        if ((i9 & 112) == 0) {
            if (startRestartGroup.changed(z3)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i9 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changed((Object) resolvedTextDirection2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        boolean z4 = z2;
        if ((i9 & 7168) == 0) {
            if (startRestartGroup.changed(z4)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((57344 & i9) == 0) {
            if (startRestartGroup.changed((Object) modifier2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        C13088o<? super Composer, ? super Integer, C11921v> oVar2 = oVar;
        if ((458752 & i9) == 0) {
            if (startRestartGroup.changedInstance(oVar2)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        int i10 = i2;
        if ((374491 & i10) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-616295642, i10, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:53)");
            }
            if (isLeft(z, resolvedTextDirection, z2)) {
                handleReferencePoint = HandleReferencePoint.TopRight;
            } else {
                handleReferencePoint = HandleReferencePoint.TopLeft;
            }
            HandleReferencePoint handleReferencePoint2 = handleReferencePoint;
            AndroidSelectionHandles_androidKt$SelectionHandle$1 androidSelectionHandles_androidKt$SelectionHandle$1 = r0;
            AndroidSelectionHandles_androidKt$SelectionHandle$1 androidSelectionHandles_androidKt$SelectionHandle$12 = new AndroidSelectionHandles_androidKt$SelectionHandle$1(oVar, modifier, z, j, i10, resolvedTextDirection, z2);
            m33749HandlePopupULxng0E(j, handleReferencePoint2, ComposableLambdaKt.composableLambda(startRestartGroup, 732099485, true, androidSelectionHandles_androidKt$SelectionHandle$1), startRestartGroup, (i10 & 14) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidSelectionHandles_androidKt$SelectionHandle$2(j, z, resolvedTextDirection, z2, modifier, oVar, i));
        }
    }

    public static final ImageBitmap createHandleImage(CacheDrawScope cacheDrawScope, float f) {
        CacheDrawScope cacheDrawScope2 = cacheDrawScope;
        float f2 = f;
        C12775o.m28639i(cacheDrawScope2, "<this>");
        int ceil = ((int) ((float) Math.ceil((double) f2))) * 2;
        HandleImageCache handleImageCache = HandleImageCache.INSTANCE;
        ImageBitmap imageBitmap = handleImageCache.getImageBitmap();
        Canvas canvas = handleImageCache.getCanvas();
        CanvasDrawScope canvasDrawScope = handleImageCache.getCanvasDrawScope();
        if (imageBitmap == null || canvas == null || ceil > imageBitmap.getWidth() || ceil > imageBitmap.getHeight()) {
            imageBitmap = ImageBitmapKt.m35893ImageBitmapx__hDU$default(ceil, ceil, ImageBitmapConfig.Companion.m35887getAlpha8_sVssgQ(), false, (ColorSpace) null, 24, (Object) null);
            handleImageCache.setImageBitmap(imageBitmap);
            canvas = CanvasKt.Canvas(imageBitmap);
            handleImageCache.setCanvas(canvas);
        }
        ImageBitmap imageBitmap2 = imageBitmap;
        Canvas canvas2 = canvas;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            handleImageCache.setCanvasDrawScope(canvasDrawScope);
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        long Size = androidx.compose.p002ui.geometry.SizeKt.Size((float) imageBitmap2.getWidth(), (float) imageBitmap2.getHeight());
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long r7 = drawParams.m36174component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope2);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas2);
        drawParams2.m36177setSizeuvyYCjk(Size);
        canvas2.save();
        CanvasDrawScope canvasDrawScope3 = canvasDrawScope2;
        DrawScope.m36250drawRectnJ9OG0$default(canvasDrawScope3, Color.Companion.m35697getBlack0d7_KjU(), 0, canvasDrawScope2.m36274getSizeNHjbRc(), 0.0f, (DrawStyle) null, (ColorFilter) null, BlendMode.Companion.m35577getClear0nO6VwU(), 58, (Object) null);
        DrawScope.m36250drawRectnJ9OG0$default(canvasDrawScope3, ColorKt.Color(4278190080L), Offset.Companion.m35438getZeroF1C5BW0(), androidx.compose.p002ui.geometry.SizeKt.Size(f2, f2), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120, (Object) null);
        ImageBitmap imageBitmap3 = imageBitmap2;
        DrawScope.m36237drawCircleVaOC9Bg$default(canvasDrawScope2, ColorKt.Color(4278190080L), f, OffsetKt.Offset(f2, f2), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120, (Object) null);
        canvas2.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m36177setSizeuvyYCjk(r7);
        return imageBitmap3;
    }

    public static final Modifier drawSelectionHandle(Modifier modifier, boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(resolvedTextDirection, "direction");
        return ComposedModifierKt.composed$default(modifier, (Function1) null, new AndroidSelectionHandles_androidKt$drawSelectionHandle$1(z, resolvedTextDirection, z2), 1, (Object) null);
    }

    public static final boolean isHandleLtrDirection(ResolvedTextDirection resolvedTextDirection, boolean z) {
        C12775o.m28639i(resolvedTextDirection, "direction");
        if ((resolvedTextDirection != ResolvedTextDirection.Ltr || z) && (resolvedTextDirection != ResolvedTextDirection.Rtl || !z)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final boolean isLeft(boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        if (z) {
            return isHandleLtrDirection(resolvedTextDirection, z2);
        }
        if (!isHandleLtrDirection(resolvedTextDirection, z2)) {
            return true;
        }
        return false;
    }
}
