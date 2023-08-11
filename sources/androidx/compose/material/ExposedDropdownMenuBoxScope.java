package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13089p;

@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuBoxScope\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,731:1\n25#2:732\n25#2:739\n36#2:747\n1114#3,6:733\n1114#3,6:740\n1114#3,6:748\n76#4:746\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuBoxScope\n*L\n244#1:732\n248#1:739\n253#1:747\n244#1:733,6\n248#1:740,6\n253#1:748,6\n249#1:746\n*E\n"})
/* compiled from: ExposedDropdownMenu.kt */
public interface ExposedDropdownMenuBoxScope {

    /* compiled from: ExposedDropdownMenu.kt */
    public static final class DefaultImpls {
        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        @Deprecated
        @Composable
        public static void ExposedDropdownMenu(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, C13074a<C11921v> aVar, Modifier modifier, C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar, Composer composer, int i, int i2) {
            C12775o.m28639i(aVar, "onDismissRequest");
            C12775o.m28639i(pVar, "content");
            ExposedDropdownMenuBoxScope.super.ExposedDropdownMenu(z, aVar, modifier, pVar, composer, i, i2);
        }
    }

    static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: of.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void ExposedDropdownMenu(boolean r24, p404of.C13074a<p336ef.C11921v> r25, androidx.compose.p002ui.Modifier r26, p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            r23 = this;
            r6 = r25
            r14 = r27
            r15 = r29
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = -1165636223(0xffffffffba85cd81, float:-0.001020834)
            r1 = r28
            androidx.compose.runtime.Composer r5 = r1.startRestartGroup(r0)
            r1 = r30 & 1
            r2 = 2
            if (r1 == 0) goto L_0x0023
            r1 = r15 | 6
            r4 = r24
            goto L_0x0035
        L_0x0023:
            r1 = r15 & 14
            r4 = r24
            if (r1 != 0) goto L_0x0034
            boolean r1 = r5.changed((boolean) r4)
            if (r1 == 0) goto L_0x0031
            r1 = 4
            goto L_0x0032
        L_0x0031:
            r1 = r2
        L_0x0032:
            r1 = r1 | r15
            goto L_0x0035
        L_0x0034:
            r1 = r15
        L_0x0035:
            r3 = r30 & 2
            if (r3 == 0) goto L_0x003c
            r1 = r1 | 48
            goto L_0x004c
        L_0x003c:
            r3 = r15 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004c
            boolean r3 = r5.changedInstance(r6)
            if (r3 == 0) goto L_0x0049
            r3 = 32
            goto L_0x004b
        L_0x0049:
            r3 = 16
        L_0x004b:
            r1 = r1 | r3
        L_0x004c:
            r3 = r30 & 4
            if (r3 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r7 = r15 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0066
            r7 = r26
            boolean r8 = r5.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0062
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r8
            goto L_0x0068
        L_0x0066:
            r7 = r26
        L_0x0068:
            r8 = r30 & 8
            if (r8 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006f:
            r8 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007f
            boolean r8 = r5.changedInstance(r14)
            if (r8 == 0) goto L_0x007c
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r1 = r1 | r8
        L_0x007f:
            r8 = r30 & 16
            if (r8 == 0) goto L_0x0088
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r13 = r23
            goto L_0x009c
        L_0x0088:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r15
            r13 = r23
            if (r8 != 0) goto L_0x009c
            boolean r8 = r5.changed((java.lang.Object) r13)
            if (r8 == 0) goto L_0x0099
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r1 = r1 | r8
        L_0x009c:
            r8 = 46811(0xb6db, float:6.5596E-41)
            r8 = r8 & r1
            r9 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r9) goto L_0x00b2
            boolean r8 = r5.getSkipping()
            if (r8 != 0) goto L_0x00ab
            goto L_0x00b2
        L_0x00ab:
            r5.skipToGroupEnd()
            r4 = r7
            r7 = r5
            goto L_0x01a3
        L_0x00b2:
            if (r3 == 0) goto L_0x00b9
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            r16 = r3
            goto L_0x00bb
        L_0x00b9:
            r16 = r7
        L_0x00bb:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x00c7
            r3 = -1
            java.lang.String r7 = "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:228)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r3, r7)
        L_0x00c7:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.startReplaceableGroup(r0)
            java.lang.Object r3 = r5.rememberedValue()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r8 = r7.getEmpty()
            if (r3 != r8) goto L_0x00e3
            androidx.compose.animation.core.MutableTransitionState r3 = new androidx.compose.animation.core.MutableTransitionState
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r3.<init>(r8)
            r5.updateRememberedValue(r3)
        L_0x00e3:
            r5.endReplaceableGroup()
            r8 = r3
            androidx.compose.animation.core.MutableTransitionState r8 = (androidx.compose.animation.core.MutableTransitionState) r8
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r24)
            r8.setTargetState(r3)
            java.lang.Object r3 = r8.getCurrentState()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x010c
            java.lang.Object r3 = r8.getTargetState()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0109
            goto L_0x010c
        L_0x0109:
            r7 = r5
            goto L_0x0198
        L_0x010c:
            r5.startReplaceableGroup(r0)
            java.lang.Object r0 = r5.rememberedValue()
            java.lang.Object r3 = r7.getEmpty()
            if (r0 != r3) goto L_0x012b
            androidx.compose.ui.graphics.TransformOrigin$Companion r0 = androidx.compose.p002ui.graphics.TransformOrigin.Companion
            long r9 = r0.m36093getCenterSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r0 = androidx.compose.p002ui.graphics.TransformOrigin.m36080boximpl(r9)
            r3 = 0
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r0, r3, r2, r3)
            r5.updateRememberedValue(r0)
        L_0x012b:
            r5.endReplaceableGroup()
            r9 = r0
            androidx.compose.runtime.MutableState r9 = (androidx.compose.runtime.MutableState) r9
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r0 = r5.consume(r0)
            r20 = r0
            androidx.compose.ui.unit.Density r20 = (androidx.compose.p002ui.unit.Density) r20
            androidx.compose.ui.unit.DpOffset$Companion r0 = androidx.compose.p002ui.unit.DpOffset.Companion
            long r18 = r0.m38539getZeroRKDOV3M()
            r0 = 1157296644(0x44faf204, float:2007.563)
            r5.startReplaceableGroup(r0)
            boolean r0 = r5.changed((java.lang.Object) r9)
            java.lang.Object r2 = r5.rememberedValue()
            if (r0 != 0) goto L_0x0159
            java.lang.Object r0 = r7.getEmpty()
            if (r2 != r0) goto L_0x0161
        L_0x0159:
            androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1 r2 = new androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
            r2.<init>(r9)
            r5.updateRememberedValue(r2)
        L_0x0161:
            r5.endReplaceableGroup()
            r21 = r2
            of.o r21 = (p404of.C13088o) r21
            r22 = 0
            androidx.compose.material.DropdownMenuPositionProvider r2 = new androidx.compose.material.DropdownMenuPositionProvider
            r17 = r2
            r17.<init>(r18, r20, r21, r22)
            androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1 r0 = new androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
            r7 = r0
            r10 = r23
            r11 = r16
            r12 = r27
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r3 = -406650841(0xffffffffe7c30027, float:-1.8417285E24)
            r7 = 1
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r5, r3, r7, r0)
            int r0 = r1 >> 3
            r0 = r0 & 14
            r7 = r0 | 384(0x180, float:5.38E-43)
            r8 = 0
            r0 = r25
            r1 = r2
            r2 = r3
            r3 = r5
            r4 = r7
            r7 = r5
            r5 = r8
            androidx.compose.material.internal.ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(r0, r1, r2, r3, r4, r5)
        L_0x0198:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01a1
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01a1:
            r4 = r16
        L_0x01a3:
            androidx.compose.runtime.ScopeUpdateScope r8 = r7.endRestartGroup()
            if (r8 != 0) goto L_0x01aa
            goto L_0x01bf
        L_0x01aa:
            androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2 r9 = new androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
            r0 = r9
            r1 = r23
            r2 = r24
            r3 = r25
            r5 = r27
            r6 = r29
            r7 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.updateScope(r9)
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu(boolean, of.a, androidx.compose.ui.Modifier, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    Modifier exposedDropdownSize(Modifier modifier, boolean z);
}
