package androidx.compose.p002ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,374:1\n25#2:375\n251#2,10:386\n25#2:396\n286#2,10:407\n1114#3,6:376\n1114#3,6:397\n76#4:382\n76#4:383\n76#4:384\n76#4:385\n76#4:403\n76#4:404\n76#4:405\n76#4:406\n76#4:417\n76#4:418\n*S KotlinDebug\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n*L\n101#1:375\n115#1:386,10\n204#1:396\n219#1:407,10\n101#1:376,6\n204#1:397,6\n105#1:382\n106#1:383\n112#1:384\n113#1:385\n209#1:403\n210#1:404\n216#1:405\n217#1:406\n241#1:417\n243#1:418\n*E\n"})
/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt */
/* compiled from: AndroidView.android.kt */
public final class AndroidView_androidKt {
    private static final AndroidView_androidKt$NoOpScrollConnection$1 NoOpScrollConnection = new AndroidView_androidKt$NoOpScrollConnection$1();
    private static final Function1<View, C11921v> NoOpUpdate = AndroidView_androidKt$NoOpUpdate$1.INSTANCE;

    /* JADX WARNING: Failed to insert additional move for type inference */
    @androidx.compose.runtime.Composable
    @androidx.compose.p002ui.UiComposable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends android.view.View> void AndroidView(kotlin.jvm.functions.Function1<? super android.content.Context, ? extends T> r9, androidx.compose.p002ui.Modifier r10, kotlin.jvm.functions.Function1<? super T, p336ef.C11921v> r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            r0 = -1783766393(0xffffffff95ade287, float:-7.023154E-26)
            androidx.compose.runtime.Composer r12 = r12.startRestartGroup(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0013
            r1 = r13 | 6
            goto L_0x0023
        L_0x0013:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0022
            boolean r1 = r12.changedInstance(r9)
            if (r1 == 0) goto L_0x001f
            r1 = 4
            goto L_0x0020
        L_0x001f:
            r1 = 2
        L_0x0020:
            r1 = r1 | r13
            goto L_0x0023
        L_0x0022:
            r1 = r13
        L_0x0023:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x002a
            r1 = r1 | 48
            goto L_0x003a
        L_0x002a:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x003a
            boolean r3 = r12.changed((java.lang.Object) r10)
            if (r3 == 0) goto L_0x0037
            r3 = 32
            goto L_0x0039
        L_0x0037:
            r3 = 16
        L_0x0039:
            r1 = r1 | r3
        L_0x003a:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x0041
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0051
        L_0x0041:
            r4 = r13 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0051
            boolean r4 = r12.changedInstance(r11)
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
            if (r4 != r5) goto L_0x0065
            boolean r4 = r12.getSkipping()
            if (r4 != 0) goto L_0x005e
            goto L_0x0065
        L_0x005e:
            r12.skipToGroupEnd()
        L_0x0061:
            r3 = r10
            r4 = r11
            goto L_0x011a
        L_0x0065:
            if (r2 == 0) goto L_0x0069
            androidx.compose.ui.Modifier$Companion r10 = androidx.compose.p002ui.Modifier.Companion
        L_0x0069:
            if (r3 == 0) goto L_0x006d
            kotlin.jvm.functions.Function1<android.view.View, ef.v> r11 = NoOpUpdate
        L_0x006d:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0079
            r2 = -1
            java.lang.String r3 = "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:95)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x0079:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.startReplaceableGroup(r0)
            java.lang.Object r0 = r12.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x0093
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r0.<init>()
            r12.updateRememberedValue(r0)
        L_0x0093:
            r12.endReplaceableGroup()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = (androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher) r0
            androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpScrollConnection$1 r2 = NoOpScrollConnection
            androidx.compose.ui.Modifier r2 = androidx.compose.p002ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll(r10, r2, r0)
            androidx.compose.ui.Modifier r4 = androidx.compose.p002ui.ComposedModifierKt.materialize(r12, r2)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r2 = r12.consume(r2)
            r5 = r2
            androidx.compose.ui.unit.Density r5 = (androidx.compose.p002ui.unit.Density) r5
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r2 = r12.consume(r2)
            r8 = r2
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.p002ui.unit.LayoutDirection) r8
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()
            java.lang.Object r2 = r12.consume(r2)
            r6 = r2
            androidx.lifecycle.LifecycleOwner r6 = (androidx.lifecycle.LifecycleOwner) r6
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()
            java.lang.Object r2 = r12.consume(r2)
            r7 = r2
            androidx.savedstate.SavedStateRegistryOwner r7 = (androidx.savedstate.SavedStateRegistryOwner) r7
            r1 = r1 & 14
            r1 = r1 | 64
            of.a r0 = createAndroidViewNodeFactory(r9, r0, r12, r1)
            r1 = 1886828752(0x7076b8d0, float:3.0542695E29)
            r12.startReplaceableGroup(r1)
            androidx.compose.runtime.Applier r1 = r12.getApplier()
            boolean r1 = r1 instanceof androidx.compose.p002ui.node.UiApplier
            if (r1 != 0) goto L_0x00e7
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x00e7:
            r12.startNode()
            boolean r1 = r12.getInserting()
            if (r1 == 0) goto L_0x00f9
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1 r1 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
            r1.<init>(r0)
            r12.createNode(r1)
            goto L_0x00fc
        L_0x00f9:
            r12.useNode()
        L_0x00fc:
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.Updater.m35292constructorimpl(r12)
            r3 = r0
            m38706updateViewHolderParamsOlIkWs8(r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1$1 r1 = androidx.compose.p002ui.viewinterop.AndroidView_androidKt$AndroidView$1$1.INSTANCE
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r0, r11, r1)
            r12.endNode()
            r12.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0061
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L_0x0061
        L_0x011a:
            androidx.compose.runtime.ScopeUpdateScope r10 = r12.endRestartGroup()
            if (r10 != 0) goto L_0x0121
            goto L_0x012d
        L_0x0121:
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2 r11 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2
            r1 = r11
            r2 = r9
            r5 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            r10.updateScope(r11)
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.viewinterop.AndroidView_androidKt.AndroidView(kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    private static final <T extends View> C13074a<LayoutNode> createAndroidViewNodeFactory(Function1<? super Context, ? extends T> function1, NestedScrollDispatcher nestedScrollDispatcher, Composer composer, int i) {
        composer.startReplaceableGroup(-430628662);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-430628662, i, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:236)");
        }
        AndroidView_androidKt$createAndroidViewNodeFactory$1 androidView_androidKt$createAndroidViewNodeFactory$1 = new AndroidView_androidKt$createAndroidViewNodeFactory$1((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), function1, ComposablesKt.rememberCompositionContext(composer, 0), nestedScrollDispatcher, (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry()), String.valueOf(ComposablesKt.getCurrentCompositeKeyHash(composer, 0)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidView_androidKt$createAndroidViewNodeFactory$1;
    }

    public static final Function1<View, C11921v> getNoOpUpdate() {
        return NoOpUpdate;
    }

    /* access modifiers changed from: private */
    public static final <T extends View> ViewFactoryHolder<T> requireViewFactoryHolder(LayoutNode layoutNode) {
        AndroidViewHolder interopViewFactoryHolder$ui_release = layoutNode.getInteropViewFactoryHolder$ui_release();
        if (interopViewFactoryHolder$ui_release != null) {
            C12775o.m28637g(interopViewFactoryHolder$ui_release, "null cannot be cast to non-null type androidx.compose.ui.viewinterop.ViewFactoryHolder<T of androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder>");
            return (ViewFactoryHolder) interopViewFactoryHolder$ui_release;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: updateViewHolderParams-OlIkWs8  reason: not valid java name */
    private static final <T extends View> void m38706updateViewHolderParamsOlIkWs8(Composer composer, Modifier modifier, Density density, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, LayoutDirection layoutDirection) {
        Updater.m35299setimpl(composer, modifier, AndroidView_androidKt$updateViewHolderParams$1.INSTANCE);
        Updater.m35299setimpl(composer, density, AndroidView_androidKt$updateViewHolderParams$2.INSTANCE);
        Updater.m35299setimpl(composer, lifecycleOwner, AndroidView_androidKt$updateViewHolderParams$3.INSTANCE);
        Updater.m35299setimpl(composer, savedStateRegistryOwner, AndroidView_androidKt$updateViewHolderParams$4.INSTANCE);
        Updater.m35299setimpl(composer, layoutDirection, AndroidView_androidKt$updateViewHolderParams$5.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.p002ui.ExperimentalComposeUiApi
    @androidx.compose.p002ui.UiComposable
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends android.view.View> void AndroidView(kotlin.jvm.functions.Function1<? super android.content.Context, ? extends T> r18, kotlin.jvm.functions.Function1<? super T, p336ef.C11921v> r19, androidx.compose.p002ui.Modifier r20, kotlin.jvm.functions.Function1<? super T, p336ef.C11921v> r21, kotlin.jvm.functions.Function1<? super T, p336ef.C11921v> r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r1 = r18
            r2 = r19
            r6 = r24
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            java.lang.String r0 = "onReset"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            r0 = -841537049(0xffffffffcdd729e7, float:-4.51230944E8)
            r3 = r23
            androidx.compose.runtime.Composer r3 = r3.startRestartGroup(r0)
            r4 = r25 & 1
            if (r4 == 0) goto L_0x0020
            r4 = r6 | 6
            goto L_0x0030
        L_0x0020:
            r4 = r6 & 14
            if (r4 != 0) goto L_0x002f
            boolean r4 = r3.changedInstance(r1)
            if (r4 == 0) goto L_0x002c
            r4 = 4
            goto L_0x002d
        L_0x002c:
            r4 = 2
        L_0x002d:
            r4 = r4 | r6
            goto L_0x0030
        L_0x002f:
            r4 = r6
        L_0x0030:
            r5 = r25 & 2
            if (r5 == 0) goto L_0x0037
            r4 = r4 | 48
            goto L_0x0047
        L_0x0037:
            r5 = r6 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0047
            boolean r5 = r3.changedInstance(r2)
            if (r5 == 0) goto L_0x0044
            r5 = 32
            goto L_0x0046
        L_0x0044:
            r5 = 16
        L_0x0046:
            r4 = r4 | r5
        L_0x0047:
            r5 = r25 & 4
            if (r5 == 0) goto L_0x004e
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r7 = r6 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0061
            r7 = r20
            boolean r8 = r3.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x005d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r4 = r4 | r8
            goto L_0x0063
        L_0x0061:
            r7 = r20
        L_0x0063:
            r8 = r25 & 8
            if (r8 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006a:
            r9 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007d
            r9 = r21
            boolean r10 = r3.changedInstance(r9)
            if (r10 == 0) goto L_0x0079
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r10
            goto L_0x007f
        L_0x007d:
            r9 = r21
        L_0x007f:
            r10 = r25 & 16
            if (r10 == 0) goto L_0x0086
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0086:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r6
            if (r11 != 0) goto L_0x009b
            r11 = r22
            boolean r12 = r3.changedInstance(r11)
            if (r12 == 0) goto L_0x0097
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r4 = r4 | r12
            goto L_0x009d
        L_0x009b:
            r11 = r22
        L_0x009d:
            r12 = 46811(0xb6db, float:6.5596E-41)
            r12 = r12 & r4
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r12 != r13) goto L_0x00b3
            boolean r12 = r3.getSkipping()
            if (r12 != 0) goto L_0x00ac
            goto L_0x00b3
        L_0x00ac:
            r3.skipToGroupEnd()
            r5 = r7
        L_0x00b0:
            r4 = r9
            goto L_0x017c
        L_0x00b3:
            if (r5 == 0) goto L_0x00b8
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00b9
        L_0x00b8:
            r5 = r7
        L_0x00b9:
            if (r8 == 0) goto L_0x00be
            kotlin.jvm.functions.Function1<android.view.View, ef.v> r7 = NoOpUpdate
            r9 = r7
        L_0x00be:
            if (r10 == 0) goto L_0x00c3
            kotlin.jvm.functions.Function1<android.view.View, ef.v> r7 = NoOpUpdate
            r11 = r7
        L_0x00c3:
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x00cf
            r7 = -1
            java.lang.String r8 = "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:187)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r4, r7, r8)
        L_0x00cf:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.startReplaceableGroup(r0)
            java.lang.Object r0 = r3.rememberedValue()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            if (r0 != r7) goto L_0x00e9
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r0.<init>()
            r3.updateRememberedValue(r0)
        L_0x00e9:
            r3.endReplaceableGroup()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = (androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher) r0
            androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpScrollConnection$1 r7 = NoOpScrollConnection
            androidx.compose.ui.Modifier r7 = androidx.compose.p002ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll(r5, r7, r0)
            androidx.compose.ui.Modifier r13 = androidx.compose.p002ui.ComposedModifierKt.materialize(r3, r7)
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r7 = r3.consume(r7)
            r14 = r7
            androidx.compose.ui.unit.Density r14 = (androidx.compose.p002ui.unit.Density) r14
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r7 = r3.consume(r7)
            r17 = r7
            androidx.compose.ui.unit.LayoutDirection r17 = (androidx.compose.p002ui.unit.LayoutDirection) r17
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()
            java.lang.Object r7 = r3.consume(r7)
            r15 = r7
            androidx.lifecycle.LifecycleOwner r15 = (androidx.lifecycle.LifecycleOwner) r15
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()
            java.lang.Object r7 = r3.consume(r7)
            r16 = r7
            androidx.savedstate.SavedStateRegistryOwner r16 = (androidx.savedstate.SavedStateRegistryOwner) r16
            r4 = r4 & 14
            r4 = r4 | 64
            of.a r0 = createAndroidViewNodeFactory(r1, r0, r3, r4)
            r4 = 1405779621(0x53ca7ea5, float:1.73941627E12)
            r3.startReplaceableGroup(r4)
            androidx.compose.runtime.Applier r4 = r3.getApplier()
            boolean r4 = r4 instanceof androidx.compose.p002ui.node.UiApplier
            if (r4 != 0) goto L_0x013f
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x013f:
            r3.startReusableNode()
            boolean r4 = r3.getInserting()
            if (r4 == 0) goto L_0x0151
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1 r4 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
            r4.<init>(r0)
            r3.createNode(r4)
            goto L_0x0154
        L_0x0151:
            r3.useNode()
        L_0x0154:
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.Updater.m35292constructorimpl(r3)
            r12 = r0
            m38706updateViewHolderParamsOlIkWs8(r12, r13, r14, r15, r16, r17)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1 r4 = androidx.compose.p002ui.viewinterop.AndroidView_androidKt$AndroidView$3$1.INSTANCE
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r0, r2, r4)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2 r4 = androidx.compose.p002ui.viewinterop.AndroidView_androidKt$AndroidView$3$2.INSTANCE
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r0, r9, r4)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$3 r4 = androidx.compose.p002ui.viewinterop.AndroidView_androidKt$AndroidView$3$3.INSTANCE
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r0, r11, r4)
            r3.endNode()
            r3.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x00b0
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L_0x00b0
        L_0x017c:
            androidx.compose.runtime.ScopeUpdateScope r8 = r3.endRestartGroup()
            if (r8 != 0) goto L_0x0183
            goto L_0x0196
        L_0x0183:
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4 r9 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
            r0 = r9
            r1 = r18
            r2 = r19
            r3 = r5
            r5 = r11
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.updateScope(r9)
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.viewinterop.AndroidView_androidKt.AndroidView(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }
}
