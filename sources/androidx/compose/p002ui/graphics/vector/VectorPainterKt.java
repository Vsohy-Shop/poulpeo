package androidx.compose.p002ui.graphics.vector;

import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.BlendMode;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawContext;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.vector.VectorProperty;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableOpenTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13090q;

@SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,420:1\n76#2:421\n1#3:422\n50#4:423\n49#4:424\n25#4:431\n1114#5,6:425\n1114#5,6:432\n173#6,6:438\n261#6,11:444\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n*L\n127#1:421\n134#1:423\n134#1:424\n142#1:431\n134#1:425,6\n142#1:432,6\n281#1:438,6\n281#1:444,11\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.VectorPainterKt */
/* compiled from: VectorPainter.kt */
public final class VectorPainterKt {
    public static final String RootGroupName = "VectorRootGroup";

    @ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    @Composable
    public static final void RenderVectorGroup(VectorGroup vectorGroup, Map<String, ? extends VectorConfig> map, Composer composer, int i, int i2) {
        int i3;
        Map<String, ? extends VectorConfig> map2;
        Composer composer2;
        Map<String, ? extends VectorConfig> map3;
        Map<String, ? extends VectorConfig> map4;
        Map<String, ? extends VectorConfig> map5;
        int i4;
        VectorGroup vectorGroup2 = vectorGroup;
        int i5 = i;
        int i6 = i2;
        C12775o.m28639i(vectorGroup2, "group");
        Composer startRestartGroup = composer.startRestartGroup(-446179233);
        if ((i6 & 1) != 0) {
            i3 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            if (startRestartGroup.changed((Object) vectorGroup2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i5;
        } else {
            i3 = i5;
        }
        int i7 = i6 & 2;
        if (i7 != 0) {
            i3 |= 16;
        }
        if (i7 == 2 && (i3 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            map2 = map;
            composer2 = startRestartGroup;
        } else {
            if (i7 != 0) {
                map3 = C12716r0.m28416g();
            } else {
                map3 = map;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-446179233, i5, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:327)");
            }
            Iterator<VectorNode> it = vectorGroup.iterator();
            while (it.hasNext()) {
                VectorNode next = it.next();
                if (next instanceof VectorPath) {
                    startRestartGroup.startReplaceableGroup(-326285735);
                    VectorPath vectorPath = (VectorPath) next;
                    VectorConfig vectorConfig = (VectorConfig) map3.get(vectorPath.getName());
                    if (vectorConfig == null) {
                        vectorConfig = new VectorPainterKt$RenderVectorGroup$config$1();
                    }
                    VectorConfig vectorConfig2 = vectorConfig;
                    Iterator<VectorNode> it2 = it;
                    VectorConfig vectorConfig3 = vectorConfig2;
                    Composer composer3 = startRestartGroup;
                    Map<String, ? extends VectorConfig> map6 = map3;
                    VectorComposeKt.m36385Path9cdaXJ4((List) vectorConfig2.getOrDefault(VectorProperty.PathData.INSTANCE, vectorPath.getPathData()), vectorPath.m36394getPathFillTypeRgk1Os(), vectorPath.getName(), (Brush) vectorConfig2.getOrDefault(VectorProperty.Fill.INSTANCE, vectorPath.getFill()), ((Number) vectorConfig2.getOrDefault(VectorProperty.FillAlpha.INSTANCE, Float.valueOf(vectorPath.getFillAlpha()))).floatValue(), (Brush) vectorConfig2.getOrDefault(VectorProperty.Stroke.INSTANCE, vectorPath.getStroke()), ((Number) vectorConfig2.getOrDefault(VectorProperty.StrokeAlpha.INSTANCE, Float.valueOf(vectorPath.getStrokeAlpha()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.StrokeLineWidth.INSTANCE, Float.valueOf(vectorPath.getStrokeLineWidth()))).floatValue(), vectorPath.m36395getStrokeLineCapKaPHkGw(), vectorPath.m36396getStrokeLineJoinLxFBmk8(), vectorPath.getStrokeLineMiter(), ((Number) vectorConfig3.getOrDefault(VectorProperty.TrimPathStart.INSTANCE, Float.valueOf(vectorPath.getTrimPathStart()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.TrimPathEnd.INSTANCE, Float.valueOf(vectorPath.getTrimPathEnd()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.TrimPathOffset.INSTANCE, Float.valueOf(vectorPath.getTrimPathOffset()))).floatValue(), composer3, 8, 0, 0);
                    composer3.endReplaceableGroup();
                    VectorGroup vectorGroup3 = vectorGroup;
                    it = it2;
                    map5 = map6;
                    int i8 = i2;
                    startRestartGroup = composer3;
                } else {
                    Iterator<VectorNode> it3 = it;
                    Map<String, ? extends VectorConfig> map7 = map3;
                    Composer composer4 = startRestartGroup;
                    if (next instanceof VectorGroup) {
                        composer4.startReplaceableGroup(-326283877);
                        VectorGroup vectorGroup4 = (VectorGroup) next;
                        map4 = map7;
                        VectorConfig vectorConfig4 = (VectorConfig) map4.get(vectorGroup4.getName());
                        if (vectorConfig4 == null) {
                            vectorConfig4 = new VectorPainterKt$RenderVectorGroup$config$2();
                        }
                        String name = vectorGroup4.getName();
                        float floatValue = ((Number) vectorConfig4.getOrDefault(VectorProperty.Rotation.INSTANCE, Float.valueOf(vectorGroup4.getRotation()))).floatValue();
                        float floatValue2 = ((Number) vectorConfig4.getOrDefault(VectorProperty.ScaleX.INSTANCE, Float.valueOf(vectorGroup4.getScaleX()))).floatValue();
                        float floatValue3 = ((Number) vectorConfig4.getOrDefault(VectorProperty.ScaleY.INSTANCE, Float.valueOf(vectorGroup4.getScaleY()))).floatValue();
                        float floatValue4 = ((Number) vectorConfig4.getOrDefault(VectorProperty.TranslateX.INSTANCE, Float.valueOf(vectorGroup4.getTranslationX()))).floatValue();
                        float floatValue5 = ((Number) vectorConfig4.getOrDefault(VectorProperty.TranslateY.INSTANCE, Float.valueOf(vectorGroup4.getTranslationY()))).floatValue();
                        VectorComposeKt.Group(name, floatValue, ((Number) vectorConfig4.getOrDefault(VectorProperty.PivotX.INSTANCE, Float.valueOf(vectorGroup4.getPivotX()))).floatValue(), ((Number) vectorConfig4.getOrDefault(VectorProperty.PivotY.INSTANCE, Float.valueOf(vectorGroup4.getPivotY()))).floatValue(), floatValue2, floatValue3, floatValue4, floatValue5, (List) vectorConfig4.getOrDefault(VectorProperty.PathData.INSTANCE, vectorGroup4.getClipPathData()), ComposableLambdaKt.composableLambda(composer4, 1450046638, true, new VectorPainterKt$RenderVectorGroup$1(next, map4)), composer4, 939524096, 0);
                        composer4.endReplaceableGroup();
                    } else {
                        map4 = map7;
                        composer4.startReplaceableGroup(-326282407);
                        composer4.endReplaceableGroup();
                    }
                    VectorGroup vectorGroup5 = vectorGroup;
                    int i9 = i2;
                    startRestartGroup = composer4;
                    map5 = map4;
                    it = it3;
                }
                int i10 = i;
            }
            map2 = map3;
            composer2 = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new VectorPainterKt$RenderVectorGroup$2(vectorGroup, map2, i, i2));
        }
    }

    private static final void mirror(DrawScope drawScope, Function1<? super DrawScope, C11921v> function1) {
        long r0 = drawScope.m36273getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long r3 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().m36333scale0AR0LA0(-1.0f, 1.0f, r0);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r3);
    }

    @Composable
    public static final VectorPainter rememberVectorPainter(ImageVector imageVector, Composer composer, int i) {
        ImageVector imageVector2 = imageVector;
        Composer composer2 = composer;
        C12775o.m28639i(imageVector, "image");
        composer.startReplaceableGroup(1413834416);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1413834416, i, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:157)");
        }
        VectorPainter r0 = m36393rememberVectorPaintervIP8VLU(imageVector.m36372getDefaultWidthD9Ej5fM(), imageVector.m36371getDefaultHeightD9Ej5fM(), imageVector.getViewportWidth(), imageVector.getViewportHeight(), imageVector.getName(), imageVector.m36374getTintColor0d7_KjU(), imageVector.m36373getTintBlendMode0nO6VwU(), imageVector.getAutoMirror(), ComposableLambdaKt.composableLambda(composer, 1873274766, true, new VectorPainterKt$rememberVectorPainter$3(imageVector)), composer, 100663296, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    @Composable
    @ComposableOpenTarget(index = -1)
    /* renamed from: rememberVectorPainter-mlNsNFs  reason: not valid java name */
    public static final VectorPainter m36392rememberVectorPaintermlNsNFs(float f, float f2, float f3, float f4, String str, long j, int i, C13090q<? super Float, ? super Float, ? super Composer, ? super Integer, C11921v> qVar, Composer composer, int i2, int i3) {
        float f5;
        float f6;
        long j2;
        int i4;
        int i5 = i2;
        C12775o.m28639i(qVar, "content");
        composer.startReplaceableGroup(-964365210);
        if ((i3 & 4) != 0) {
            f5 = Float.NaN;
        } else {
            f5 = f3;
        }
        if ((i3 & 8) != 0) {
            f6 = Float.NaN;
        } else {
            f6 = f4;
        }
        String str2 = (i3 & 16) != 0 ? RootGroupName : str;
        if ((i3 & 32) != 0) {
            j2 = Color.Companion.m35707getUnspecified0d7_KjU();
        } else {
            j2 = j;
        }
        if ((i3 & 64) != 0) {
            i4 = BlendMode.Companion.m35602getSrcIn0nO6VwU();
        } else {
            i4 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-964365210, i5, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:73)");
        }
        VectorPainter r0 = m36393rememberVectorPaintervIP8VLU(f, f2, f5, f6, str2, j2, i4, false, qVar, composer, (i5 & 14) | 12582912 | (i5 & 112) | (i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | ((i5 << 3) & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    @Composable
    @ComposableOpenTarget(index = -1)
    /* renamed from: rememberVectorPainter-vIP8VLU  reason: not valid java name */
    public static final VectorPainter m36393rememberVectorPaintervIP8VLU(float f, float f2, float f3, float f4, String str, long j, int i, boolean z, C13090q<? super Float, ? super Float, ? super Composer, ? super Integer, C11921v> qVar, Composer composer, int i2, int i3) {
        float f5;
        String str2;
        long j2;
        int i4;
        boolean z2;
        ColorFilter colorFilter;
        Composer composer2 = composer;
        int i5 = i2;
        int i6 = i3;
        C12775o.m28639i(qVar, "content");
        composer2.startReplaceableGroup(1068590786);
        float f6 = Float.NaN;
        if ((i6 & 4) != 0) {
            f5 = Float.NaN;
        } else {
            f5 = f3;
        }
        if ((i6 & 8) == 0) {
            f6 = f4;
        }
        if ((i6 & 16) != 0) {
            str2 = RootGroupName;
        } else {
            str2 = str;
        }
        if ((i6 & 32) != 0) {
            j2 = Color.Companion.m35707getUnspecified0d7_KjU();
        } else {
            j2 = j;
        }
        if ((i6 & 64) != 0) {
            i4 = BlendMode.Companion.m35602getSrcIn0nO6VwU();
        } else {
            i4 = i;
        }
        if ((i6 & 128) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1068590786, i5, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:115)");
        }
        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
        float r11 = density.m38449toPx0680j_4(f);
        float r3 = density.m38449toPx0680j_4(f2);
        if (Float.isNaN(f5)) {
            f5 = r11;
        }
        if (Float.isNaN(f6)) {
            f6 = r3;
        }
        Color r12 = Color.m35661boximpl(j2);
        BlendMode r13 = BlendMode.m35570boximpl(i4);
        int i7 = i5 >> 15;
        composer2.startReplaceableGroup(511388516);
        boolean changed = composer2.changed((Object) r12) | composer2.changed((Object) r13);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            if (!Color.m35672equalsimpl0(j2, Color.Companion.m35707getUnspecified0d7_KjU())) {
                colorFilter = ColorFilter.Companion.m35715tintxETnrds(j2, i4);
            } else {
                colorFilter = null;
            }
            rememberedValue = colorFilter;
            composer2.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ColorFilter colorFilter2 = (ColorFilter) rememberedValue;
        composer2.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new VectorPainter();
            composer2.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        VectorPainter vectorPainter = (VectorPainter) rememberedValue2;
        vectorPainter.m36391setSizeuvyYCjk$ui_release(SizeKt.Size(r11, r3));
        vectorPainter.setAutoMirror$ui_release(z2);
        vectorPainter.setIntrinsicColorFilter$ui_release(colorFilter2);
        vectorPainter.RenderVector$ui_release(str2, f5, f6, qVar, composer, ((i5 >> 12) & 14) | 32768 | (i7 & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return vectorPainter;
    }
}
