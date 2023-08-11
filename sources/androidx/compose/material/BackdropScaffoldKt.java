package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.UiComposable;
import androidx.compose.p002ui.ZIndexModifierKt;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p002ui.graphics.RenderEffect;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.SubcomposeLayoutKt;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;
import p404of.C13090q;

@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,522:1\n25#2:523\n36#2:533\n36#2:541\n50#2:548\n49#2:549\n460#2,13:577\n460#2,13:610\n473#2,3:624\n460#2,13:648\n473#2,3:662\n473#2,3:667\n67#2,3:672\n66#2:675\n1114#3,6:524\n1114#3,6:534\n1114#3,6:542\n1114#3,6:550\n1114#3,6:676\n76#4:530\n76#4:532\n76#4:556\n76#4:565\n76#4:598\n76#4:636\n1#5:531\n646#6:540\n66#7,7:557\n73#7:590\n67#7,6:591\n73#7:623\n77#7:628\n67#7,6:629\n73#7:661\n77#7:666\n77#7:671\n75#8:564\n76#8,11:566\n75#8:597\n76#8,11:599\n89#8:627\n75#8:635\n76#8,11:637\n89#8:665\n89#8:670\n76#9:682\n76#9:683\n154#10:684\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt\n*L\n172#1:523\n289#1:533\n394#1:541\n402#1:548\n402#1:549\n430#1:577,13\n431#1:610,13\n431#1:624,3\n439#1:648,13\n439#1:662,3\n430#1:667,3\n458#1:672,3\n458#1:675\n172#1:524,6\n289#1:534,6\n394#1:542,6\n402#1:550,6\n458#1:676,6\n276#1:530\n277#1:532\n425#1:556\n430#1:565\n431#1:598\n439#1:636\n388#1:540\n430#1:557,7\n430#1:590\n431#1:591,6\n431#1:623\n431#1:628\n439#1:629,6\n439#1:661\n439#1:666\n430#1:671\n430#1:564\n430#1:566,11\n431#1:597\n431#1:599,11\n431#1:627\n439#1:635\n439#1:637,11\n439#1:665\n430#1:670\n389#1:682\n422#1:683\n521#1:684\n*E\n"})
/* compiled from: BackdropScaffold.kt */
public final class BackdropScaffoldKt {
    private static final float AnimationSlideOffset = C1232Dp.m38468constructorimpl((float) 20);

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void BackLayerTransition(BackdropValue backdropValue, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, Composer composer, int i) {
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        BackdropValue backdropValue2 = backdropValue;
        C13088o<? super Composer, ? super Integer, C11921v> oVar3 = oVar;
        C13088o<? super Composer, ? super Integer, C11921v> oVar4 = oVar2;
        int i6 = i;
        Composer startRestartGroup = composer.startRestartGroup(-950970976);
        if ((i6 & 14) == 0) {
            if (startRestartGroup.changed((Object) backdropValue2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (startRestartGroup.changedInstance(oVar3)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changedInstance(oVar4)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        int i7 = i2;
        if ((i7 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-950970976, i7, -1, "androidx.compose.material.BackLayerTransition (BackdropScaffold.kt:414)");
            }
            if (backdropValue2 == BackdropValue.Revealed) {
                f = 0.0f;
            } else {
                f = 2.0f;
            }
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, new TweenSpec(0, 0, (Easing) null, 7, (DefaultConstructorMarker) null), 0.0f, (Function1<? super Float, C11921v>) null, startRestartGroup, 48, 12);
            float r5 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).m38449toPx0680j_4(AnimationSlideOffset);
            float f2 = (float) 1;
            float l = C13537l.m30885l(BackLayerTransition$lambda$7(animateFloatAsState) - f2, 0.0f, 1.0f);
            float l2 = C13537l.m30885l(f2 - BackLayerTransition$lambda$7(animateFloatAsState), 0.0f, 1.0f);
            startRestartGroup.startReplaceableGroup(733328855);
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion3.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r0 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r0, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m35299setimpl(r0, density, companion3.getSetDensity());
            Updater.m35299setimpl(r0, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m35299setimpl(r0, viewConfiguration, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier r3 = GraphicsLayerModifierKt.m35817graphicsLayerAp8cVGQ$default(ZIndexModifierKt.zIndex(companion, l), 0.0f, 0.0f, l, 0.0f, (f2 - l) * r5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (Shape) null, false, (RenderEffect) null, 0, 0, 0, 131051, (Object) null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            C13074a<ComposeUiNode> constructor2 = companion3.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(r3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r2 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r2, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m35299setimpl(r2, density2, companion3.getSetDensity());
            Updater.m35299setimpl(r2, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.m35299setimpl(r2, viewConfiguration2, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            oVar3.invoke(startRestartGroup, Integer.valueOf((i7 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier r22 = GraphicsLayerModifierKt.m35817graphicsLayerAp8cVGQ$default(ZIndexModifierKt.zIndex(companion, l2), 0.0f, 0.0f, l2, 0.0f, (f2 - l2) * (-r5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (Shape) null, false, (RenderEffect) null, 0, 0, 0, 131051, (Object) null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            C13074a<ComposeUiNode> constructor3 = companion3.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf3 = LayoutKt.materializerOf(r22);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r7 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r7, rememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m35299setimpl(r7, density3, companion3.getSetDensity());
            Updater.m35299setimpl(r7, layoutDirection3, companion3.getSetLayoutDirection());
            Updater.m35299setimpl(r7, viewConfiguration3, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            oVar4 = oVar2;
            oVar4.invoke(startRestartGroup, Integer.valueOf((i7 >> 6) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BackdropScaffoldKt$BackLayerTransition$2(backdropValue, oVar3, oVar4, i));
        }
    }

    private static final float BackLayerTransition$lambda$7(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v0, resolved type: of.p<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v1, resolved type: of.p<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v2, resolved type: of.p<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v3, resolved type: of.p<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v4, resolved type: of.p<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0149  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.Composable
    /* renamed from: BackdropScaffold-BZszfkY  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m33883BackdropScaffoldBZszfkY(p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r53, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r54, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r55, androidx.compose.p002ui.Modifier r56, androidx.compose.material.BackdropScaffoldState r57, boolean r58, float r59, float r60, boolean r61, boolean r62, long r63, long r65, androidx.compose.p002ui.graphics.Shape r67, float r68, long r69, long r71, long r73, p404of.C13089p<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r75, androidx.compose.runtime.Composer r76, int r77, int r78, int r79) {
        /*
            r1 = r53
            r2 = r54
            r0 = r55
            r14 = r77
            r15 = r78
            r13 = r79
            java.lang.String r3 = "appBar"
            kotlin.jvm.internal.C12775o.m28639i(r1, r3)
            java.lang.String r3 = "backLayerContent"
            kotlin.jvm.internal.C12775o.m28639i(r2, r3)
            java.lang.String r3 = "frontLayerContent"
            kotlin.jvm.internal.C12775o.m28639i(r0, r3)
            r3 = 1397420093(0x534af03d, float:8.7161392E11)
            r4 = r76
            androidx.compose.runtime.Composer r12 = r4.startRestartGroup(r3)
            r4 = r13 & 1
            if (r4 == 0) goto L_0x002b
            r4 = r14 | 6
            goto L_0x003b
        L_0x002b:
            r4 = r14 & 14
            if (r4 != 0) goto L_0x003a
            boolean r4 = r12.changedInstance(r1)
            if (r4 == 0) goto L_0x0037
            r4 = 4
            goto L_0x0038
        L_0x0037:
            r4 = 2
        L_0x0038:
            r4 = r4 | r14
            goto L_0x003b
        L_0x003a:
            r4 = r14
        L_0x003b:
            r7 = r13 & 2
            r9 = 16
            if (r7 == 0) goto L_0x0044
            r4 = r4 | 48
            goto L_0x0053
        L_0x0044:
            r7 = r14 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0053
            boolean r7 = r12.changedInstance(r2)
            if (r7 == 0) goto L_0x0051
            r7 = 32
            goto L_0x0052
        L_0x0051:
            r7 = r9
        L_0x0052:
            r4 = r4 | r7
        L_0x0053:
            r7 = r13 & 4
            if (r7 == 0) goto L_0x005a
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x005a:
            r7 = r14 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x006a
            boolean r7 = r12.changedInstance(r0)
            if (r7 == 0) goto L_0x0067
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r4 = r4 | r7
        L_0x006a:
            r7 = r13 & 8
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x0075
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x0075:
            r5 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0089
            r5 = r56
            boolean r18 = r12.changed((java.lang.Object) r5)
            if (r18 == 0) goto L_0x0084
            r18 = r16
            goto L_0x0086
        L_0x0084:
            r18 = r17
        L_0x0086:
            r4 = r4 | r18
            goto L_0x008b
        L_0x0089:
            r5 = r56
        L_0x008b:
            r18 = 57344(0xe000, float:8.0356E-41)
            r18 = r14 & r18
            r19 = 8192(0x2000, float:1.14794E-41)
            r20 = 16384(0x4000, float:2.2959E-41)
            if (r18 != 0) goto L_0x00aa
            r18 = r13 & 16
            r6 = r57
            if (r18 != 0) goto L_0x00a5
            boolean r21 = r12.changed((java.lang.Object) r6)
            if (r21 == 0) goto L_0x00a5
            r21 = r20
            goto L_0x00a7
        L_0x00a5:
            r21 = r19
        L_0x00a7:
            r4 = r4 | r21
            goto L_0x00ac
        L_0x00aa:
            r6 = r57
        L_0x00ac:
            r21 = r13 & 32
            r22 = 131072(0x20000, float:1.83671E-40)
            r23 = 65536(0x10000, float:9.18355E-41)
            if (r21 == 0) goto L_0x00bb
            r24 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r24
            r11 = r58
            goto L_0x00d0
        L_0x00bb:
            r24 = 458752(0x70000, float:6.42848E-40)
            r24 = r14 & r24
            r11 = r58
            if (r24 != 0) goto L_0x00d0
            boolean r25 = r12.changed((boolean) r11)
            if (r25 == 0) goto L_0x00cc
            r25 = r22
            goto L_0x00ce
        L_0x00cc:
            r25 = r23
        L_0x00ce:
            r4 = r4 | r25
        L_0x00d0:
            r25 = r13 & 64
            if (r25 == 0) goto L_0x00db
            r26 = 1572864(0x180000, float:2.204052E-39)
            r4 = r4 | r26
            r3 = r59
            goto L_0x00f0
        L_0x00db:
            r26 = 3670016(0x380000, float:5.142788E-39)
            r26 = r14 & r26
            r3 = r59
            if (r26 != 0) goto L_0x00f0
            boolean r27 = r12.changed((float) r3)
            if (r27 == 0) goto L_0x00ec
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ee
        L_0x00ec:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00ee:
            r4 = r4 | r27
        L_0x00f0:
            r10 = r13 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x00f9
            r28 = 12582912(0xc00000, float:1.7632415E-38)
            r4 = r4 | r28
            goto L_0x0111
        L_0x00f9:
            r28 = 29360128(0x1c00000, float:7.052966E-38)
            r28 = r14 & r28
            if (r28 != 0) goto L_0x0111
            r28 = r10
            r10 = r60
            boolean r29 = r12.changed((float) r10)
            if (r29 == 0) goto L_0x010c
            r29 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010e
        L_0x010c:
            r29 = 4194304(0x400000, float:5.877472E-39)
        L_0x010e:
            r4 = r4 | r29
            goto L_0x0115
        L_0x0111:
            r28 = r10
            r10 = r60
        L_0x0115:
            r10 = r13 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x011e
            r29 = 100663296(0x6000000, float:2.4074124E-35)
            r4 = r4 | r29
            goto L_0x0136
        L_0x011e:
            r29 = 234881024(0xe000000, float:1.5777218E-30)
            r29 = r14 & r29
            if (r29 != 0) goto L_0x0136
            r29 = r10
            r10 = r61
            boolean r30 = r12.changed((boolean) r10)
            if (r30 == 0) goto L_0x0131
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0133
        L_0x0131:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0133:
            r4 = r4 | r30
            goto L_0x013a
        L_0x0136:
            r29 = r10
            r10 = r61
        L_0x013a:
            r10 = r13 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0149
            r30 = 805306368(0x30000000, float:4.656613E-10)
            r4 = r4 | r30
            r31 = r4
            r30 = r10
            r10 = r62
            goto L_0x0167
        L_0x0149:
            r30 = 1879048192(0x70000000, float:1.58456325E29)
            r30 = r14 & r30
            if (r30 != 0) goto L_0x0161
            r30 = r10
            r10 = r62
            boolean r31 = r12.changed((boolean) r10)
            if (r31 == 0) goto L_0x015c
            r31 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x015e
        L_0x015c:
            r31 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x015e:
            r4 = r4 | r31
            goto L_0x0165
        L_0x0161:
            r30 = r10
            r10 = r62
        L_0x0165:
            r31 = r4
        L_0x0167:
            r4 = r15 & 14
            if (r4 != 0) goto L_0x017f
            r4 = r13 & 1024(0x400, float:1.435E-42)
            r10 = r63
            if (r4 != 0) goto L_0x017a
            boolean r4 = r12.changed((long) r10)
            if (r4 == 0) goto L_0x017a
            r18 = 4
            goto L_0x017c
        L_0x017a:
            r18 = 2
        L_0x017c:
            r4 = r15 | r18
            goto L_0x0182
        L_0x017f:
            r10 = r63
            r4 = r15
        L_0x0182:
            r18 = r15 & 112(0x70, float:1.57E-43)
            if (r18 != 0) goto L_0x0198
            r8 = r13 & 2048(0x800, float:2.87E-42)
            r10 = r65
            if (r8 != 0) goto L_0x0195
            boolean r8 = r12.changed((long) r10)
            if (r8 == 0) goto L_0x0195
            r8 = 32
            goto L_0x0196
        L_0x0195:
            r8 = r9
        L_0x0196:
            r4 = r4 | r8
            goto L_0x019a
        L_0x0198:
            r10 = r65
        L_0x019a:
            r8 = r15 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x01b2
            r8 = r13 & 4096(0x1000, float:5.74E-42)
            r9 = r67
            if (r8 != 0) goto L_0x01ad
            boolean r8 = r12.changed((java.lang.Object) r9)
            if (r8 == 0) goto L_0x01ad
            r24 = 256(0x100, float:3.59E-43)
            goto L_0x01af
        L_0x01ad:
            r24 = 128(0x80, float:1.794E-43)
        L_0x01af:
            r4 = r4 | r24
            goto L_0x01b4
        L_0x01b2:
            r9 = r67
        L_0x01b4:
            r8 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x01bb
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x01cd
        L_0x01bb:
            r0 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x01cd
            r0 = r68
            boolean r18 = r12.changed((float) r0)
            if (r18 == 0) goto L_0x01c8
            goto L_0x01ca
        L_0x01c8:
            r16 = r17
        L_0x01ca:
            r4 = r4 | r16
            goto L_0x01cf
        L_0x01cd:
            r0 = r68
        L_0x01cf:
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x01e7
            r0 = r13 & 16384(0x4000, float:2.2959E-41)
            r10 = r69
            if (r0 != 0) goto L_0x01e4
            boolean r0 = r12.changed((long) r10)
            if (r0 == 0) goto L_0x01e4
            r19 = r20
        L_0x01e4:
            r4 = r4 | r19
            goto L_0x01e9
        L_0x01e7:
            r10 = r69
        L_0x01e9:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r15
            r16 = 32768(0x8000, float:4.5918E-41)
            if (r0 != 0) goto L_0x0204
            r0 = r13 & r16
            r10 = r71
            if (r0 != 0) goto L_0x0200
            boolean r0 = r12.changed((long) r10)
            if (r0 == 0) goto L_0x0200
            r0 = r22
            goto L_0x0202
        L_0x0200:
            r0 = r23
        L_0x0202:
            r4 = r4 | r0
            goto L_0x0206
        L_0x0204:
            r10 = r71
        L_0x0206:
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r15
            if (r0 != 0) goto L_0x021e
            r0 = r13 & r23
            r10 = r73
            if (r0 != 0) goto L_0x021a
            boolean r0 = r12.changed((long) r10)
            if (r0 == 0) goto L_0x021a
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x021c
        L_0x021a:
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x021c:
            r4 = r4 | r0
            goto L_0x0220
        L_0x021e:
            r10 = r73
        L_0x0220:
            r0 = r13 & r22
            if (r0 == 0) goto L_0x022b
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r4 = r4 | r17
            r10 = r75
            goto L_0x023f
        L_0x022b:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r15 & r17
            r10 = r75
            if (r17 != 0) goto L_0x023f
            boolean r11 = r12.changedInstance(r10)
            if (r11 == 0) goto L_0x023c
            r11 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x023e
        L_0x023c:
            r11 = 4194304(0x400000, float:5.877472E-39)
        L_0x023e:
            r4 = r4 | r11
        L_0x023f:
            r11 = r4
            r4 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r4 = r31 & r4
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r1) goto L_0x027a
            r1 = 23967451(0x16db6db, float:4.3661218E-38)
            r1 = r1 & r11
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r4) goto L_0x027a
            boolean r1 = r12.getSkipping()
            if (r1 != 0) goto L_0x025a
            goto L_0x027a
        L_0x025a:
            r12.skipToGroupEnd()
            r8 = r60
            r13 = r65
            r16 = r68
            r17 = r69
            r19 = r71
            r21 = r73
            r7 = r3
            r4 = r5
            r5 = r6
            r15 = r9
            r23 = r10
            r0 = r12
            r6 = r58
            r9 = r61
            r10 = r62
            r11 = r63
            goto L_0x04fe
        L_0x027a:
            r12.startDefaults()
            r1 = r14 & 1
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            r4 = 6
            r10 = 1
            if (r1 == 0) goto L_0x02df
            boolean r1 = r12.getDefaultsInvalid()
            if (r1 == 0) goto L_0x028d
            goto L_0x02df
        L_0x028d:
            r12.skipToGroupEnd()
            r0 = r13 & 16
            if (r0 == 0) goto L_0x0296
            r31 = r31 & r17
        L_0x0296:
            r0 = r13 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x029c
            r11 = r11 & -15
        L_0x029c:
            r0 = r13 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x02a2
            r11 = r11 & -113(0xffffffffffffff8f, float:NaN)
        L_0x02a2:
            r0 = r13 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x02a8
            r11 = r11 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x02a8:
            r0 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x02ae
            r11 = r11 & r17
        L_0x02ae:
            r0 = r13 & r16
            if (r0 == 0) goto L_0x02b6
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r11 = r11 & r0
        L_0x02b6:
            r0 = r13 & r23
            if (r0 == 0) goto L_0x02be
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r11 = r11 & r0
        L_0x02be:
            r28 = r58
            r10 = r60
            r29 = r61
            r30 = r62
            r33 = r65
            r36 = r68
            r37 = r69
            r39 = r71
            r41 = r73
            r43 = r75
            r1 = r4
            r0 = r5
            r2 = r6
            r35 = r9
            r9 = r11
            r8 = r31
            r31 = r63
            r11 = r3
            goto L_0x0401
        L_0x02df:
            if (r7 == 0) goto L_0x02e4
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x02e5
        L_0x02e4:
            r1 = r5
        L_0x02e5:
            r5 = r13 & 16
            if (r5 == 0) goto L_0x0310
            androidx.compose.material.BackdropValue r5 = androidx.compose.material.BackdropValue.Concealed
            r6 = 0
            r7 = 0
            r18 = 0
            r19 = 6
            r20 = 14
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r18
            r18 = r8
            r8 = r12
            r9 = r19
            r56 = r1
            r1 = r10
            r19 = r28
            r22 = r29
            r24 = r30
            r10 = r20
            androidx.compose.material.BackdropScaffoldState r4 = rememberBackdropScaffoldState(r4, r5, r6, r7, r8, r9, r10)
            r31 = r31 & r17
            r6 = r4
            goto L_0x031b
        L_0x0310:
            r56 = r1
            r18 = r8
            r1 = r10
            r19 = r28
            r22 = r29
            r24 = r30
        L_0x031b:
            if (r21 == 0) goto L_0x031f
            r4 = r1
            goto L_0x0321
        L_0x031f:
            r4 = r58
        L_0x0321:
            if (r25 == 0) goto L_0x0329
            androidx.compose.material.BackdropScaffoldDefaults r3 = androidx.compose.material.BackdropScaffoldDefaults.INSTANCE
            float r3 = r3.m33882getPeekHeightD9Ej5fM()
        L_0x0329:
            if (r19 == 0) goto L_0x0332
            androidx.compose.material.BackdropScaffoldDefaults r5 = androidx.compose.material.BackdropScaffoldDefaults.INSTANCE
            float r5 = r5.m33881getHeaderHeightD9Ej5fM()
            goto L_0x0334
        L_0x0332:
            r5 = r60
        L_0x0334:
            if (r22 == 0) goto L_0x0338
            r7 = r1
            goto L_0x033a
        L_0x0338:
            r7 = r61
        L_0x033a:
            if (r24 == 0) goto L_0x033e
            r8 = r1
            goto L_0x0340
        L_0x033e:
            r8 = r62
        L_0x0340:
            r9 = r13 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0354
            androidx.compose.material.MaterialTheme r9 = androidx.compose.material.MaterialTheme.INSTANCE
            r10 = 6
            androidx.compose.material.Colors r9 = r9.getColors(r12, r10)
            long r19 = r9.m33952getPrimary0d7_KjU()
            r11 = r11 & -15
            r1 = r19
            goto L_0x0357
        L_0x0354:
            r10 = 6
            r1 = r63
        L_0x0357:
            r9 = r13 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0364
            r9 = r11 & 14
            long r19 = androidx.compose.material.ColorsKt.m33970contentColorForek8zF_U(r1, r12, r9)
            r11 = r11 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0366
        L_0x0364:
            r19 = r65
        L_0x0366:
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0373
            androidx.compose.material.BackdropScaffoldDefaults r9 = androidx.compose.material.BackdropScaffoldDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r9 = r9.getFrontLayerShape(r12, r10)
            r11 = r11 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0375
        L_0x0373:
            r9 = r67
        L_0x0375:
            if (r18 == 0) goto L_0x037e
            androidx.compose.material.BackdropScaffoldDefaults r18 = androidx.compose.material.BackdropScaffoldDefaults.INSTANCE
            float r18 = r18.m33880getFrontLayerElevationD9Ej5fM()
            goto L_0x0380
        L_0x037e:
            r18 = r68
        L_0x0380:
            r10 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x0394
            androidx.compose.material.MaterialTheme r10 = androidx.compose.material.MaterialTheme.INSTANCE
            r21 = r1
            r1 = 6
            androidx.compose.material.Colors r2 = r10.getColors(r12, r1)
            long r1 = r2.m33956getSurface0d7_KjU()
            r11 = r11 & r17
            goto L_0x0398
        L_0x0394:
            r21 = r1
            r1 = r69
        L_0x0398:
            r10 = r13 & r16
            if (r10 == 0) goto L_0x03a9
            int r10 = r11 >> 12
            r10 = r10 & 14
            long r16 = androidx.compose.material.ColorsKt.m33970contentColorForek8zF_U(r1, r12, r10)
            r10 = -458753(0xfffffffffff8ffff, float:NaN)
            r11 = r11 & r10
            goto L_0x03ab
        L_0x03a9:
            r16 = r71
        L_0x03ab:
            r10 = r13 & r23
            if (r10 == 0) goto L_0x03be
            androidx.compose.material.BackdropScaffoldDefaults r10 = androidx.compose.material.BackdropScaffoldDefaults.INSTANCE
            r23 = r1
            r1 = 6
            long r28 = r10.getFrontLayerScrimColor(r12, r1)
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            r2 = r2 & r11
            r11 = r2
            goto L_0x03c3
        L_0x03be:
            r23 = r1
            r1 = 6
            r28 = r73
        L_0x03c3:
            if (r0 == 0) goto L_0x03e3
            androidx.compose.material.ComposableSingletons$BackdropScaffoldKt r0 = androidx.compose.material.ComposableSingletons$BackdropScaffoldKt.INSTANCE
            of.p r0 = r0.m33976getLambda1$material_release()
            r43 = r0
            r10 = r5
            r2 = r6
            r30 = r8
            r35 = r9
            r9 = r11
            r39 = r16
            r36 = r18
            r33 = r19
            r37 = r23
            r41 = r28
            r8 = r31
            r0 = r56
            goto L_0x03fa
        L_0x03e3:
            r0 = r56
            r43 = r75
            r10 = r5
            r2 = r6
            r30 = r8
            r35 = r9
            r9 = r11
            r39 = r16
            r36 = r18
            r33 = r19
            r37 = r23
            r41 = r28
            r8 = r31
        L_0x03fa:
            r11 = r3
            r28 = r4
            r29 = r7
            r31 = r21
        L_0x0401:
            r12.endDefaults()
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0412
            java.lang.String r3 = "androidx.compose.material.BackdropScaffold (BackdropScaffold.kt:255)"
            r4 = 1397420093(0x534af03d, float:8.7161392E11)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r8, r9, r3)
        L_0x0412:
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r3 = r12.consume(r3)
            androidx.compose.ui.unit.Density r3 = (androidx.compose.p002ui.unit.Density) r3
            float r16 = r3.m38449toPx0680j_4(r11)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r3 = r12.consume(r3)
            androidx.compose.ui.unit.Density r3 = (androidx.compose.p002ui.unit.Density) r3
            float r7 = r3.m38449toPx0680j_4(r10)
            androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1 r3 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
            r56 = r3
            r57 = r29
            r58 = r2
            r59 = r53
            r60 = r54
            r61 = r8
            r56.<init>(r57, r58, r59, r60, r61)
            r4 = 1744778315(0x67ff344b, float:2.4103362E24)
            r5 = 1
            androidx.compose.runtime.internal.ComposableLambda r17 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r12, r4, r5, r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r7)
            r4 = 1157296644(0x44faf204, float:2007.563)
            r12.startReplaceableGroup(r4)
            boolean r3 = r12.changed((java.lang.Object) r3)
            java.lang.Object r4 = r12.rememberedValue()
            if (r3 != 0) goto L_0x0463
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r4 != r3) goto L_0x046b
        L_0x0463:
            androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 r4 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
            r4.<init>(r7)
            r12.updateRememberedValue(r4)
        L_0x046b:
            r12.endReplaceableGroup()
            r6 = r4
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r26 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1 r5 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
            r3 = r5
            r4 = r0
            r1 = r5
            r5 = r17
            r17 = r8
            r8 = r30
            r47 = r9
            r9 = r28
            r48 = r10
            r49 = 6
            r10 = r2
            r50 = r11
            r11 = r16
            r68 = r0
            r0 = r12
            r12 = r17
            r13 = r35
            r14 = r37
            r16 = r39
            r18 = r36
            r19 = r47
            r20 = r48
            r21 = r50
            r22 = r55
            r23 = r41
            r25 = r43
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r25)
            r3 = -1049909631(0xffffffffc16ba681, float:-14.72815)
            r4 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r0, r3, r4, r1)
            int r3 = r47 << 6
            r4 = r3 & 896(0x380, float:1.256E-42)
            r5 = 1572864(0x180000, float:2.204052E-39)
            r4 = r4 | r5
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            r4 = 51
            r56 = r26
            r57 = r44
            r58 = r31
            r60 = r33
            r62 = r45
            r63 = r46
            r64 = r1
            r65 = r0
            r66 = r3
            r67 = r4
            androidx.compose.material.SurfaceKt.m34127SurfaceFjzlyU(r56, r57, r58, r60, r62, r63, r64, r65, r66, r67)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x04e1
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x04e1:
            r4 = r68
            r5 = r2
            r6 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r13 = r33
            r15 = r35
            r16 = r36
            r17 = r37
            r19 = r39
            r21 = r41
            r23 = r43
            r8 = r48
            r7 = r50
        L_0x04fe:
            androidx.compose.runtime.ScopeUpdateScope r3 = r0.endRestartGroup()
            if (r3 != 0) goto L_0x0505
            goto L_0x0522
        L_0x0505:
            androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2 r2 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2
            r0 = r2
            r1 = r53
            r51 = r2
            r2 = r54
            r52 = r3
            r3 = r55
            r24 = r77
            r25 = r78
            r26 = r79
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r16, r17, r19, r21, r23, r24, r25, r26)
            r1 = r51
            r0 = r52
            r0.updateScope(r1)
        L_0x0522:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.m33883BackdropScaffoldBZszfkY(of.o, of.o, of.o, androidx.compose.ui.Modifier, androidx.compose.material.BackdropScaffoldState, boolean, float, float, boolean, boolean, long, long, androidx.compose.ui.graphics.Shape, float, long, long, long, of.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* access modifiers changed from: private */
    @Composable
    @UiComposable
    public static final void BackdropStack(Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, Function1<? super Constraints, Constraints> function1, C13090q<? super Constraints, ? super Float, ? super Composer, ? super Integer, C11921v> qVar, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1248995194);
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
            if (startRestartGroup.changedInstance(oVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changedInstance(function1)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1248995194, i2, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:451)");
            }
            startRestartGroup.startReplaceableGroup(1618982084);
            boolean changed = startRestartGroup.changed((Object) oVar) | startRestartGroup.changed((Object) function1) | startRestartGroup.changed((Object) qVar);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BackdropScaffoldKt$BackdropStack$1$1(oVar, function1, qVar, i2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (C13088o) rememberedValue, startRestartGroup, i2 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BackdropScaffoldKt$BackdropStack$2(modifier, oVar, function1, qVar, i));
        }
    }

    /* access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-3J-VO9M  reason: not valid java name */
    public static final void m33884Scrim3JVO9M(long j, C13074a<C11921v> aVar, boolean z, Composer composer, int i) {
        int i2;
        boolean z2;
        float f;
        Modifier modifier;
        int i3;
        int i4;
        int i5;
        long j2 = j;
        C13074a<C11921v> aVar2 = aVar;
        boolean z3 = z;
        int i6 = i;
        Composer startRestartGroup = composer.startRestartGroup(-92141505);
        if ((i6 & 14) == 0) {
            if (startRestartGroup.changed(j2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (startRestartGroup.changedInstance(aVar2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changed(z3)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-92141505, i2, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:382)");
            }
            if (j2 != Color.Companion.m35707getUnspecified0d7_KjU()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, new TweenSpec(0, 0, (Easing) null, 7, (DefaultConstructorMarker) null), 0.0f, (Function1<? super Float, C11921v>) null, startRestartGroup, 48, 12);
                startRestartGroup.startReplaceableGroup(1010547004);
                if (z3) {
                    Modifier.Companion companion = Modifier.Companion;
                    C11921v vVar = C11921v.f18618a;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    boolean changed = startRestartGroup.changed((Object) aVar2);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(aVar2, (C12074d<? super BackdropScaffoldKt$Scrim$dismissModifier$1$1>) null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    modifier = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion, (Object) vVar, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) (C13088o) rememberedValue);
                } else {
                    modifier = Modifier.Companion;
                }
                startRestartGroup.endReplaceableGroup();
                Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null).then(modifier);
                Color r7 = Color.m35661boximpl(j);
                startRestartGroup.startReplaceableGroup(511388516);
                boolean changed2 = startRestartGroup.changed((Object) r7) | startRestartGroup.changed((Object) animateFloatAsState);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new BackdropScaffoldKt$Scrim$1$1(j2, animateFloatAsState);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(then, (Function1) rememberedValue2, startRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BackdropScaffoldKt$Scrim$2(j, aVar, z, i));
        }
    }

    /* access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    @ExperimentalMaterialApi
    @Composable
    public static final BackdropScaffoldState rememberBackdropScaffoldState(BackdropValue backdropValue, AnimationSpec<Float> animationSpec, Function1<? super BackdropValue, Boolean> function1, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        C12775o.m28639i(backdropValue, "initialValue");
        composer.startReplaceableGroup(-862178912);
        SpringSpec<Float> springSpec = animationSpec;
        if ((i2 & 2) != 0) {
            springSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        BackdropScaffoldKt$rememberBackdropScaffoldState$1 backdropScaffoldKt$rememberBackdropScaffoldState$1 = function1;
        if ((i2 & 4) != 0) {
            backdropScaffoldKt$rememberBackdropScaffoldState$1 = BackdropScaffoldKt$rememberBackdropScaffoldState$1.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-862178912, i, -1, "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:167)");
        }
        BackdropScaffoldState backdropScaffoldState = (BackdropScaffoldState) RememberSaveableKt.rememberSaveable(new Object[]{springSpec, backdropScaffoldKt$rememberBackdropScaffoldState$1, snackbarHostState}, BackdropScaffoldState.Companion.Saver(springSpec, backdropScaffoldKt$rememberBackdropScaffoldState$1, snackbarHostState), (String) null, new BackdropScaffoldKt$rememberBackdropScaffoldState$3(backdropValue, springSpec, backdropScaffoldKt$rememberBackdropScaffoldState$1, snackbarHostState), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return backdropScaffoldState;
    }
}
