package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p002ui.platform.AccessibilityManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.core.location.LocationRequestCompat;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,373:1\n76#2:374\n76#2:396\n25#3:375\n460#3,13:408\n473#3,3:428\n25#3:433\n25#3:440\n1114#4,6:376\n1114#4,6:434\n1114#4,6:441\n1549#5:382\n1620#5,3:383\n1620#5,3:386\n67#6,6:389\n73#6:421\n77#6:432\n75#7:395\n76#7,11:397\n89#7:431\n33#8,6:422\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt\n*L\n157#1:374\n316#1:396\n262#1:375\n316#1:408,13\n316#1:428,3\n348#1:433\n361#1:440\n262#1:376,6\n348#1:434,6\n361#1:441,6\n265#1:382\n265#1:383,3\n270#1:386,3\n316#1:389,6\n316#1:421\n316#1:432\n316#1:395\n316#1:397,11\n316#1:431\n318#1:422,6\n*E\n"})
/* compiled from: SnackbarHost.kt */
public final class SnackbarHostKt {
    private static final int SnackbarFadeInMillis = 150;
    private static final int SnackbarFadeOutMillis = 75;
    private static final int SnackbarInBetweenDelayMillis = 0;

    /* compiled from: SnackbarHost.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material.SnackbarDuration[] r0 = androidx.compose.material.SnackbarDuration.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material.SnackbarDuration r1 = androidx.compose.material.SnackbarDuration.Indefinite     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material.SnackbarDuration r1 = androidx.compose.material.SnackbarDuration.Long     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material.SnackbarDuration r1 = androidx.compose.material.SnackbarDuration.Short     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.WhenMappings.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void FadeInFadeOutWithScale(androidx.compose.material.SnackbarData r17, androidx.compose.p002ui.Modifier r18, p404of.C13089p<? super androidx.compose.material.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            r1 = r17
            r3 = r19
            r4 = r21
            r0 = 2036134589(0x795cf2bd, float:7.170179E34)
            r2 = r20
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            r5 = r22 & 1
            if (r5 == 0) goto L_0x0016
            r5 = r4 | 6
            goto L_0x0026
        L_0x0016:
            r5 = r4 & 14
            if (r5 != 0) goto L_0x0025
            boolean r5 = r2.changed((java.lang.Object) r1)
            if (r5 == 0) goto L_0x0022
            r5 = 4
            goto L_0x0023
        L_0x0022:
            r5 = 2
        L_0x0023:
            r5 = r5 | r4
            goto L_0x0026
        L_0x0025:
            r5 = r4
        L_0x0026:
            r6 = r22 & 2
            if (r6 == 0) goto L_0x002d
            r5 = r5 | 48
            goto L_0x0040
        L_0x002d:
            r7 = r4 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0040
            r7 = r18
            boolean r8 = r2.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x003c
            r8 = 32
            goto L_0x003e
        L_0x003c:
            r8 = 16
        L_0x003e:
            r5 = r5 | r8
            goto L_0x0042
        L_0x0040:
            r7 = r18
        L_0x0042:
            r8 = r22 & 4
            if (r8 == 0) goto L_0x0049
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0059
        L_0x0049:
            r8 = r4 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0059
            boolean r8 = r2.changedInstance(r3)
            if (r8 == 0) goto L_0x0056
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r5 = r5 | r8
        L_0x0059:
            r8 = r5 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x006c
            boolean r8 = r2.getSkipping()
            if (r8 != 0) goto L_0x0066
            goto L_0x006c
        L_0x0066:
            r2.skipToGroupEnd()
            r6 = r7
            goto L_0x0231
        L_0x006c:
            if (r6 == 0) goto L_0x0071
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0072
        L_0x0071:
            r6 = r7
        L_0x0072:
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x007e
            r7 = -1
            java.lang.String r8 = "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:256)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r5, r7, r8)
        L_0x007e:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.startReplaceableGroup(r0)
            java.lang.Object r0 = r2.rememberedValue()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            if (r0 != r7) goto L_0x0098
            androidx.compose.material.FadeInFadeOutState r0 = new androidx.compose.material.FadeInFadeOutState
            r0.<init>()
            r2.updateRememberedValue(r0)
        L_0x0098:
            r2.endReplaceableGroup()
            androidx.compose.material.FadeInFadeOutState r0 = (androidx.compose.material.FadeInFadeOutState) r0
            java.lang.Object r7 = r0.getCurrent()
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r1, r7)
            r8 = 1
            if (r7 != 0) goto L_0x011e
            r0.setCurrent(r1)
            java.util.List r7 = r0.getItems()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = kotlin.collections.C12728x.m28544v(r7, r10)
            r9.<init>(r10)
            java.util.Iterator r7 = r7.iterator()
        L_0x00c0:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x00d6
            java.lang.Object r10 = r7.next()
            androidx.compose.material.FadeInFadeOutAnimationItem r10 = (androidx.compose.material.FadeInFadeOutAnimationItem) r10
            java.lang.Object r10 = r10.getKey()
            androidx.compose.material.SnackbarData r10 = (androidx.compose.material.SnackbarData) r10
            r9.add(r10)
            goto L_0x00c0
        L_0x00d6:
            java.util.List r7 = kotlin.collections.C12686e0.m28207D0(r9)
            boolean r9 = r7.contains(r1)
            if (r9 != 0) goto L_0x00e3
            r7.add(r1)
        L_0x00e3:
            java.util.List r9 = r0.getItems()
            r9.clear()
            r9 = r7
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r9 = kotlin.collections.C12686e0.m28218W(r9)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r10 = r0.getItems()
            java.util.Collection r10 = (java.util.Collection) r10
            java.util.Iterator r9 = r9.iterator()
        L_0x00fd:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x011e
            java.lang.Object r11 = r9.next()
            androidx.compose.material.SnackbarData r11 = (androidx.compose.material.SnackbarData) r11
            androidx.compose.material.FadeInFadeOutAnimationItem r12 = new androidx.compose.material.FadeInFadeOutAnimationItem
            androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1 r13 = new androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1
            r13.<init>(r11, r1, r7, r0)
            r14 = -94104314(0xfffffffffa641506, float:-2.9606752E35)
            androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r14, r8, r13)
            r12.<init>(r11, r13)
            r10.add(r12)
            goto L_0x00fd
        L_0x011e:
            int r7 = r5 >> 3
            r7 = r7 & 14
            r9 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r9)
            androidx.compose.ui.Alignment$Companion r9 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r9 = r9.getTopStart()
            int r10 = r7 >> 3
            r11 = r10 & 14
            r10 = r10 & 112(0x70, float:1.57E-43)
            r10 = r10 | r11
            r11 = 0
            androidx.compose.ui.layout.MeasurePolicy r9 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r9, r11, r2, r10)
            int r7 = r7 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r10)
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r10 = r2.consume(r10)
            androidx.compose.ui.unit.Density r10 = (androidx.compose.p002ui.unit.Density) r10
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r12 = r2.consume(r12)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.p002ui.unit.LayoutDirection) r12
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r13 = r2.consume(r13)
            androidx.compose.ui.platform.ViewConfiguration r13 = (androidx.compose.p002ui.platform.ViewConfiguration) r13
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r15 = r14.getConstructor()
            of.p r8 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r6)
            int r7 = r7 << 9
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r16 = 6
            r7 = r7 | 6
            androidx.compose.runtime.Applier r11 = r2.getApplier()
            boolean r11 = r11 instanceof androidx.compose.runtime.Applier
            if (r11 != 0) goto L_0x017f
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x017f:
            r2.startReusableNode()
            boolean r11 = r2.getInserting()
            if (r11 == 0) goto L_0x018c
            r2.createNode(r15)
            goto L_0x018f
        L_0x018c:
            r2.useNode()
        L_0x018f:
            r2.disableReusing()
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.m35292constructorimpl(r2)
            of.o r15 = r14.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r9, r15)
            of.o r9 = r14.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r10, r9)
            of.o r9 = r14.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r12, r9)
            of.o r9 = r14.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r13, r9)
            r2.enableReusing()
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r9 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r9)
            int r7 = r7 >> 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8.invoke(r9, r2, r7)
            r7 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r7)
            androidx.compose.foundation.layout.BoxScopeInstance r7 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            r7 = 0
            androidx.compose.runtime.RecomposeScope r8 = androidx.compose.runtime.ComposablesKt.getCurrentRecomposeScope(r2, r7)
            r0.setScope(r8)
            r8 = -1656513320(0xffffffff9d439cd8, float:-2.5889121E-21)
            r2.startReplaceableGroup(r8)
            java.util.List r0 = r0.getItems()
            int r8 = r0.size()
            r11 = r7
        L_0x01e7:
            if (r11 >= r8) goto L_0x0219
            java.lang.Object r7 = r0.get(r11)
            androidx.compose.material.FadeInFadeOutAnimationItem r7 = (androidx.compose.material.FadeInFadeOutAnimationItem) r7
            java.lang.Object r9 = r7.component1()
            androidx.compose.material.SnackbarData r9 = (androidx.compose.material.SnackbarData) r9
            of.p r7 = r7.component2()
            r10 = -208579897(0xfffffffff39152c7, float:-2.3027404E31)
            r2.startMovableGroup(r10, r9)
            androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1 r10 = new androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
            r10.<init>(r3, r9, r5)
            r9 = 2041982076(0x79b62c7c, float:1.1823753E35)
            r12 = 1
            androidx.compose.runtime.internal.ComposableLambda r9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r9, r12, r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)
            r7.invoke(r9, r2, r10)
            r2.endMovableGroup()
            int r11 = r11 + 1
            goto L_0x01e7
        L_0x0219:
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0231
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0231:
            androidx.compose.runtime.ScopeUpdateScope r7 = r2.endRestartGroup()
            if (r7 != 0) goto L_0x0238
            goto L_0x024a
        L_0x0238:
            androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$3 r8 = new androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$3
            r0 = r8
            r1 = r17
            r2 = r6
            r3 = r19
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r7.updateScope(r8)
        L_0x024a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale(androidx.compose.material.SnackbarData, androidx.compose.ui.Modifier, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SnackbarHost(androidx.compose.material.SnackbarHostState r7, androidx.compose.p002ui.Modifier r8, p404of.C13089p<? super androidx.compose.material.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r9, androidx.compose.runtime.Composer r10, int r11, int r12) {
        /*
            java.lang.String r0 = "hostState"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            r0 = 431012348(0x19b0b9fc, float:1.8273092E-23)
            androidx.compose.runtime.Composer r10 = r10.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0013
            r1 = r11 | 6
            goto L_0x0023
        L_0x0013:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x0022
            boolean r1 = r10.changed((java.lang.Object) r7)
            if (r1 == 0) goto L_0x001f
            r1 = 4
            goto L_0x0020
        L_0x001f:
            r1 = 2
        L_0x0020:
            r1 = r1 | r11
            goto L_0x0023
        L_0x0022:
            r1 = r11
        L_0x0023:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x002a
            r1 = r1 | 48
            goto L_0x003a
        L_0x002a:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x003a
            boolean r3 = r10.changed((java.lang.Object) r8)
            if (r3 == 0) goto L_0x0037
            r3 = 32
            goto L_0x0039
        L_0x0037:
            r3 = 16
        L_0x0039:
            r1 = r1 | r3
        L_0x003a:
            r3 = r12 & 4
            if (r3 == 0) goto L_0x0041
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0051
        L_0x0041:
            r4 = r11 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0051
            boolean r4 = r10.changedInstance(r9)
            if (r4 == 0) goto L_0x004e
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0050
        L_0x004e:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0050:
            r1 = r1 | r4
        L_0x0051:
            r4 = r1 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x0064
            boolean r4 = r10.getSkipping()
            if (r4 != 0) goto L_0x005e
            goto L_0x0064
        L_0x005e:
            r10.skipToGroupEnd()
        L_0x0061:
            r3 = r8
            r4 = r9
            goto L_0x00b1
        L_0x0064:
            if (r2 == 0) goto L_0x0068
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.p002ui.Modifier.Companion
        L_0x0068:
            if (r3 == 0) goto L_0x0070
            androidx.compose.material.ComposableSingletons$SnackbarHostKt r9 = androidx.compose.material.ComposableSingletons$SnackbarHostKt.INSTANCE
            of.p r9 = r9.m33982getLambda1$material_release()
        L_0x0070:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x007c
            r2 = -1
            java.lang.String r3 = "androidx.compose.material.SnackbarHost (SnackbarHost.kt:150)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x007c:
            androidx.compose.material.SnackbarData r0 = r7.getCurrentSnackbarData()
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalAccessibilityManager()
            java.lang.Object r2 = r10.consume(r2)
            androidx.compose.ui.platform.AccessibilityManager r2 = (androidx.compose.p002ui.platform.AccessibilityManager) r2
            androidx.compose.material.SnackbarHostKt$SnackbarHost$1 r3 = new androidx.compose.material.SnackbarHostKt$SnackbarHost$1
            r4 = 0
            r3.<init>(r0, r2, r4)
            r2 = 64
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r0, (p404of.C13088o<? super p466yf.C13995l0, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object>) r3, (androidx.compose.runtime.Composer) r10, (int) r2)
            androidx.compose.material.SnackbarData r0 = r7.getCurrentSnackbarData()
            r2 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 & 896(0x380, float:1.256E-42)
            r5 = r2 | r1
            r6 = 0
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            FadeInFadeOutWithScale(r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0061
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L_0x0061
        L_0x00b1:
            androidx.compose.runtime.ScopeUpdateScope r8 = r10.endRestartGroup()
            if (r8 != 0) goto L_0x00b8
            goto L_0x00c4
        L_0x00b8:
            androidx.compose.material.SnackbarHostKt$SnackbarHost$2 r9 = new androidx.compose.material.SnackbarHostKt$SnackbarHost$2
            r1 = r9
            r2 = r7
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r8.updateScope(r9)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.SnackbarHost(androidx.compose.material.SnackbarHostState, androidx.compose.ui.Modifier, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    @Composable
    public static final State<Float> animatedOpacity(AnimationSpec<Float> animationSpec, boolean z, C13074a<C11921v> aVar, Composer composer, int i, int i2) {
        float f;
        composer.startReplaceableGroup(1016418159);
        if ((i2 & 4) != 0) {
            aVar = SnackbarHostKt$animatedOpacity$1.INSTANCE;
        }
        C13074a<C11921v> aVar2 = aVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1016418159, i, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:342)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            if (!z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            rememberedValue = AnimatableKt.Animatable$default(f, 0.0f, 2, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue;
        EffectsKt.LaunchedEffect((Object) Boolean.valueOf(z), (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) new SnackbarHostKt$animatedOpacity$2(animatable, z, animationSpec, aVar2, (C12074d<? super SnackbarHostKt$animatedOpacity$2>) null), composer, ((i >> 3) & 14) | 64);
        State<Float> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    /* access modifiers changed from: private */
    @Composable
    public static final State<Float> animatedScale(AnimationSpec<Float> animationSpec, boolean z, Composer composer, int i) {
        float f;
        composer.startReplaceableGroup(2003504988);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2003504988, i, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:359)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            if (!z) {
                f = 1.0f;
            } else {
                f = 0.8f;
            }
            rememberedValue = AnimatableKt.Animatable$default(f, 0.0f, 2, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue;
        EffectsKt.LaunchedEffect((Object) Boolean.valueOf(z), (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) new SnackbarHostKt$animatedScale$1(animatable, z, animationSpec, (C12074d<? super SnackbarHostKt$animatedScale$1>) null), composer, ((i >> 3) & 14) | 64);
        State<Float> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    public static final long toMillis(SnackbarDuration snackbarDuration, boolean z, AccessibilityManager accessibilityManager) {
        long j;
        C12775o.m28639i(snackbarDuration, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i == 1) {
            j = LocationRequestCompat.PASSIVE_INTERVAL;
        } else if (i == 2) {
            j = 10000;
        } else if (i == 3) {
            j = 4000;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        long j2 = j;
        if (accessibilityManager == null) {
            return j2;
        }
        return accessibilityManager.calculateRecommendedTimeoutMillis(j2, true, true, z);
    }
}
