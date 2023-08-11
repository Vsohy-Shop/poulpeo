package androidx.compose.material3;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.semantics.Role;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Menu.kt */
public final class MenuKt {
    private static final float DropdownMenuItemDefaultMaxWidth = C1232Dp.m38468constructorimpl((float) 280);
    private static final float DropdownMenuItemDefaultMinWidth = C1232Dp.m38468constructorimpl((float) 112);
    /* access modifiers changed from: private */
    public static final float DropdownMenuItemHorizontalPadding = C1232Dp.m38468constructorimpl((float) 12);
    private static final float DropdownMenuVerticalPadding = C1232Dp.m38468constructorimpl((float) 8);
    public static final int InTransitionDuration = 120;
    private static final float MenuVerticalMargin = C1232Dp.m38468constructorimpl((float) 48);
    public static final int OutTransitionDuration = 75;

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DropdownMenuContent(androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r22, androidx.compose.runtime.MutableState<androidx.compose.p002ui.graphics.TransformOrigin> r23, androidx.compose.p002ui.Modifier r24, p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r1 = r22
            r2 = r23
            r4 = r25
            r5 = r27
            java.lang.String r0 = "expandedStates"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            java.lang.String r0 = "transformOriginState"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            r0 = -159754260(0xfffffffff67a57ec, float:-1.2693921E33)
            r3 = r26
            androidx.compose.runtime.Composer r3 = r3.startRestartGroup(r0)
            r6 = r28 & 1
            if (r6 == 0) goto L_0x0027
            r6 = r5 | 6
            goto L_0x0037
        L_0x0027:
            r6 = r5 & 14
            if (r6 != 0) goto L_0x0036
            boolean r6 = r3.changed((java.lang.Object) r1)
            if (r6 == 0) goto L_0x0033
            r6 = 4
            goto L_0x0034
        L_0x0033:
            r6 = 2
        L_0x0034:
            r6 = r6 | r5
            goto L_0x0037
        L_0x0036:
            r6 = r5
        L_0x0037:
            r7 = r28 & 2
            if (r7 == 0) goto L_0x003e
            r6 = r6 | 48
            goto L_0x004e
        L_0x003e:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004e
            boolean r7 = r3.changed((java.lang.Object) r2)
            if (r7 == 0) goto L_0x004b
            r7 = 32
            goto L_0x004d
        L_0x004b:
            r7 = 16
        L_0x004d:
            r6 = r6 | r7
        L_0x004e:
            r7 = r28 & 4
            if (r7 == 0) goto L_0x0055
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0068
            r8 = r24
            boolean r9 = r3.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0064
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r6 = r6 | r9
            goto L_0x006a
        L_0x0068:
            r8 = r24
        L_0x006a:
            r9 = r28 & 8
            if (r9 == 0) goto L_0x0071
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x0071:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0081
            boolean r9 = r3.changed((java.lang.Object) r4)
            if (r9 == 0) goto L_0x007e
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r6 = r6 | r9
        L_0x0081:
            r14 = r6
            r6 = r14 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r6 != r9) goto L_0x0094
            boolean r6 = r3.getSkipping()
            if (r6 != 0) goto L_0x008f
            goto L_0x0094
        L_0x008f:
            r3.skipToGroupEnd()
            goto L_0x025e
        L_0x0094:
            if (r7 == 0) goto L_0x009a
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.p002ui.Modifier.Companion
            r15 = r6
            goto L_0x009b
        L_0x009a:
            r15 = r8
        L_0x009b:
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r13 = -1
            if (r6 == 0) goto L_0x00a7
            java.lang.String r6 = "androidx.compose.material3.DropdownMenuContent (Menu.kt:65)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r14, r13, r6)
        L_0x00a7:
            int r0 = androidx.compose.animation.core.MutableTransitionState.$stable
            r0 = r0 | 48
            r6 = r14 & 14
            r0 = r0 | r6
            java.lang.String r6 = "DropDownMenu"
            r12 = 0
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.updateTransition(r1, (java.lang.String) r6, (androidx.compose.runtime.Composer) r3, (int) r0, (int) r12)
            androidx.compose.material3.MenuKt$DropdownMenuContent$scale$2 r6 = androidx.compose.material3.MenuKt$DropdownMenuContent$scale$2.INSTANCE
            r11 = 1399891485(0x5370a61d, float:1.03357907E12)
            r3.startReplaceableGroup(r11)
            java.lang.String r16 = "FloatAnimation"
            kotlin.jvm.internal.h r17 = kotlin.jvm.internal.C12763h.f20419a
            androidx.compose.animation.core.TwoWayConverter r10 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.C12763h) r17)
            r9 = 1847725064(0x6e220c08, float:1.2537779E28)
            r3.startReplaceableGroup(r9)
            java.lang.Object r7 = r0.getCurrentState()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = 1808111696(0x6bc59850, float:4.7775532E26)
            r3.startReplaceableGroup(r8)
            boolean r18 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r9 = "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:90)"
            if (r18 == 0) goto L_0x00e6
            androidx.compose.runtime.ComposerKt.traceEventStart(r8, r12, r13, r9)
        L_0x00e6:
            r18 = 1061997773(0x3f4ccccd, float:0.8)
            r19 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L_0x00f0
            r7 = r19
            goto L_0x00f2
        L_0x00f0:
            r7 = r18
        L_0x00f2:
            boolean r20 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r20 == 0) goto L_0x00fb
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00fb:
            r3.endReplaceableGroup()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r20 = r0.getTargetState()
            java.lang.Boolean r20 = (java.lang.Boolean) r20
            boolean r20 = r20.booleanValue()
            r3.startReplaceableGroup(r8)
            boolean r21 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r21 == 0) goto L_0x0118
            androidx.compose.runtime.ComposerKt.traceEventStart(r8, r12, r13, r9)
        L_0x0118:
            if (r20 == 0) goto L_0x011c
            r18 = r19
        L_0x011c:
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x0125
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0125:
            r3.endReplaceableGroup()
            java.lang.Float r8 = java.lang.Float.valueOf(r18)
            androidx.compose.animation.core.Transition$Segment r9 = r0.getSegment()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.Object r6 = r6.invoke(r9, r3, r11)
            r9 = r6
            androidx.compose.animation.core.FiniteAnimationSpec r9 = (androidx.compose.animation.core.FiniteAnimationSpec) r9
            r18 = 0
            r6 = r0
            r11 = 1847725064(0x6e220c08, float:1.2537779E28)
            r11 = r16
            r1 = r12
            r12 = r3
            r5 = r13
            r13 = r18
            androidx.compose.runtime.State r13 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r6, r7, r8, r9, r10, r11, r12, r13)
            r3.endReplaceableGroup()
            r3.endReplaceableGroup()
            androidx.compose.material3.MenuKt$DropdownMenuContent$alpha$2 r6 = androidx.compose.material3.MenuKt$DropdownMenuContent$alpha$2.INSTANCE
            r7 = 1399891485(0x5370a61d, float:1.03357907E12)
            r3.startReplaceableGroup(r7)
            java.lang.String r11 = "FloatAnimation"
            androidx.compose.animation.core.TwoWayConverter r10 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.C12763h) r17)
            r7 = 1847725064(0x6e220c08, float:1.2537779E28)
            r3.startReplaceableGroup(r7)
            java.lang.Object r7 = r0.getCurrentState()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = 1864763068(0x6f2606bc, float:5.1382653E28)
            r3.startReplaceableGroup(r8)
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r12 = "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:110)"
            if (r9 == 0) goto L_0x0181
            androidx.compose.runtime.ComposerKt.traceEventStart(r8, r1, r5, r12)
        L_0x0181:
            r9 = 0
            if (r7 == 0) goto L_0x0187
            r7 = r19
            goto L_0x0188
        L_0x0187:
            r7 = r9
        L_0x0188:
            boolean r16 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r16 == 0) goto L_0x0191
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0191:
            r3.endReplaceableGroup()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r16 = r0.getTargetState()
            java.lang.Boolean r16 = (java.lang.Boolean) r16
            boolean r16 = r16.booleanValue()
            r3.startReplaceableGroup(r8)
            boolean r17 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r17 == 0) goto L_0x01ae
            androidx.compose.runtime.ComposerKt.traceEventStart(r8, r1, r5, r12)
        L_0x01ae:
            if (r16 == 0) goto L_0x01b1
            goto L_0x01b3
        L_0x01b1:
            r19 = r9
        L_0x01b3:
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L_0x01bc
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01bc:
            r3.endReplaceableGroup()
            java.lang.Float r8 = java.lang.Float.valueOf(r19)
            androidx.compose.animation.core.Transition$Segment r5 = r0.getSegment()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r6.invoke(r5, r3, r1)
            r9 = r1
            androidx.compose.animation.core.FiniteAnimationSpec r9 = (androidx.compose.animation.core.FiniteAnimationSpec) r9
            r6 = r0
            r12 = r3
            r0 = r13
            r13 = r18
            androidx.compose.runtime.State r1 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r6, r7, r8, r9, r10, r11, r12, r13)
            r3.endReplaceableGroup()
            r3.endReplaceableGroup()
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.p002ui.Modifier.Companion
            r6 = 1618982084(0x607fb4c4, float:7.370227E19)
            r3.startReplaceableGroup(r6)
            boolean r6 = r3.changed((java.lang.Object) r0)
            boolean r7 = r3.changed((java.lang.Object) r1)
            r6 = r6 | r7
            boolean r7 = r3.changed((java.lang.Object) r2)
            r6 = r6 | r7
            java.lang.Object r7 = r3.rememberedValue()
            if (r6 != 0) goto L_0x0205
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r7 != r6) goto L_0x020d
        L_0x0205:
            androidx.compose.material3.MenuKt$DropdownMenuContent$1$1 r7 = new androidx.compose.material3.MenuKt$DropdownMenuContent$1$1
            r7.<init>(r2, r0, r1)
            r3.updateRememberedValue(r7)
        L_0x020d:
            r3.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            androidx.compose.ui.Modifier r6 = androidx.compose.p002ui.graphics.GraphicsLayerModifierKt.graphicsLayer(r5, r7)
            androidx.compose.material3.tokens.MenuTokens r0 = androidx.compose.material3.tokens.MenuTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r1 = r0.getContainerShape()
            r5 = 6
            androidx.compose.ui.graphics.Shape r7 = androidx.compose.material3.ShapesKt.toShape(r1, r3, r5)
            androidx.compose.material3.MaterialTheme r1 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.ColorScheme r1 = r1.getColorScheme(r3, r5)
            androidx.compose.material3.tokens.ColorSchemeKeyTokens r5 = r0.getContainerColor()
            long r8 = androidx.compose.material3.ColorSchemeKt.fromToken(r1, r5)
            r10 = 0
            float r12 = r0.m35019getContainerElevationD9Ej5fM()
            float r13 = r0.m35019getContainerElevationD9Ej5fM()
            r0 = 0
            androidx.compose.material3.MenuKt$DropdownMenuContent$2 r1 = new androidx.compose.material3.MenuKt$DropdownMenuContent$2
            r1.<init>(r15, r4, r14)
            r5 = -1651673913(0xffffffff9d8d74c7, float:-3.7443134E-21)
            r14 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r3, r5, r14, r1)
            r17 = 12804096(0xc36000, float:1.794236E-38)
            r18 = 72
            r14 = r0
            r0 = r15
            r15 = r1
            r16 = r3
            androidx.compose.material3.SurfaceKt.m34602SurfaceT9BRK9s(r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x025d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x025d:
            r8 = r0
        L_0x025e:
            androidx.compose.runtime.ScopeUpdateScope r7 = r3.endRestartGroup()
            if (r7 != 0) goto L_0x0265
            goto L_0x0279
        L_0x0265:
            androidx.compose.material3.MenuKt$DropdownMenuContent$3 r9 = new androidx.compose.material3.MenuKt$DropdownMenuContent$3
            r0 = r9
            r1 = r22
            r2 = r23
            r3 = r8
            r4 = r25
            r5 = r27
            r6 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.updateScope(r9)
        L_0x0279:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.DropdownMenuContent(androidx.compose.animation.core.MutableTransitionState, androidx.compose.runtime.MutableState, androidx.compose.ui.Modifier, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: DropdownMenuContent$lambda-1  reason: not valid java name */
    public static final float m34487DropdownMenuContent$lambda1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: DropdownMenuContent$lambda-3  reason: not valid java name */
    public static final float m34488DropdownMenuContent$lambda3(State<Float> state) {
        return state.getValue().floatValue();
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void DropdownMenuItemContent(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13074a<C11921v> aVar, Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C13088o<? super Composer, ? super Integer, C11921v> oVar4 = oVar;
        C13074a<C11921v> aVar2 = aVar;
        Modifier modifier2 = modifier;
        MenuItemColors menuItemColors2 = menuItemColors;
        PaddingValues paddingValues2 = paddingValues;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        int i12 = i;
        C12775o.m28639i(oVar4, "text");
        C12775o.m28639i(aVar2, "onClick");
        C12775o.m28639i(modifier2, "modifier");
        C12775o.m28639i(menuItemColors2, "colors");
        C12775o.m28639i(paddingValues2, "contentPadding");
        C12775o.m28639i(mutableInteractionSource2, "interactionSource");
        Composer startRestartGroup = composer.startRestartGroup(-1564716777);
        if ((i12 & 14) == 0) {
            if (startRestartGroup.changed((Object) oVar4)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i12;
        } else {
            i2 = i12;
        }
        if ((i12 & 112) == 0) {
            if (startRestartGroup.changed((Object) aVar2)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i12 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changed((Object) modifier2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        C13088o<? super Composer, ? super Integer, C11921v> oVar5 = oVar2;
        if ((i12 & 7168) == 0) {
            if (startRestartGroup.changed((Object) oVar5)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        C13088o<? super Composer, ? super Integer, C11921v> oVar6 = oVar3;
        if ((57344 & i12) == 0) {
            if (startRestartGroup.changed((Object) oVar6)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        boolean z2 = z;
        if ((458752 & i12) == 0) {
            if (startRestartGroup.changed(z2)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((3670016 & i12) == 0) {
            if (startRestartGroup.changed((Object) menuItemColors2)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((29360128 & i12) == 0) {
            if (startRestartGroup.changed((Object) paddingValues2)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((234881024 & i12) == 0) {
            if (startRestartGroup.changed((Object) mutableInteractionSource2)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        }
        int i13 = i2;
        if ((191739611 & i13) != 38347922 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1564716777, i13, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:142)");
            }
            int i14 = i13;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(ClickableKt.m32979clickableO2vRcR0$default(modifier, mutableInteractionSource, RippleKt.m34235rememberRipple9IZ8Weo(true, 0.0f, 0, startRestartGroup, 6, 6), z, (String) null, (Role) null, aVar, 24, (Object) null), 0.0f, 1, (Object) null);
            float f = DropdownMenuItemDefaultMinWidth;
            float f2 = DropdownMenuItemDefaultMaxWidth;
            MenuTokens menuTokens = MenuTokens.INSTANCE;
            Modifier padding = PaddingKt.padding(SizeKt.m33342sizeInqDBjuR0$default(fillMaxWidth$default, f, menuTokens.m35020getListItemContainerHeightD9Ej5fM(), f2, 0.0f, 8, (Object) null), paddingValues2);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(padding);
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
            Composer r11 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r11, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m35299setimpl(r11, density, companion.getSetDensity());
            Updater.m35299setimpl(r11, layoutDirection, companion.getSetLayoutDirection());
            Updater.m35299setimpl(r11, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-678309503);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-837672837);
            composer2 = startRestartGroup;
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), menuTokens.getListItemLabelTextFont()), ComposableLambdaKt.composableLambda(composer2, 1065051884, true, new MenuKt$DropdownMenuItemContent$1$1(oVar2, menuItemColors, z, i14, oVar3, rowScopeInstance, oVar)), composer2, 48);
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new MenuKt$DropdownMenuItemContent$2(oVar, aVar, modifier, oVar2, oVar3, z, menuItemColors, paddingValues, mutableInteractionSource, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long calculateTransformOrigin(androidx.compose.p002ui.unit.IntRect r5, androidx.compose.p002ui.unit.IntRect r6) {
        /*
            java.lang.String r0 = "parentBounds"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            java.lang.String r0 = "menuBounds"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            int r0 = r6.getLeft()
            int r1 = r5.getRight()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto L_0x0019
        L_0x0017:
            r0 = r3
            goto L_0x0053
        L_0x0019:
            int r0 = r6.getRight()
            int r1 = r5.getLeft()
            if (r0 > r1) goto L_0x0025
            r0 = r2
            goto L_0x0053
        L_0x0025:
            int r0 = r6.getWidth()
            if (r0 != 0) goto L_0x002c
            goto L_0x0017
        L_0x002c:
            int r0 = r5.getLeft()
            int r1 = r6.getLeft()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.getRight()
            int r4 = r6.getRight()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
        L_0x0053:
            int r1 = r6.getTop()
            int r4 = r5.getBottom()
            if (r1 < r4) goto L_0x005f
        L_0x005d:
            r2 = r3
            goto L_0x0099
        L_0x005f:
            int r1 = r6.getBottom()
            int r4 = r5.getTop()
            if (r1 > r4) goto L_0x006a
            goto L_0x0099
        L_0x006a:
            int r1 = r6.getHeight()
            if (r1 != 0) goto L_0x0071
            goto L_0x005d
        L_0x0071:
            int r1 = r5.getTop()
            int r2 = r6.getTop()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.getBottom()
            int r2 = r6.getBottom()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.getTop()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r2 = r5 / r6
        L_0x0099:
            long r5 = androidx.compose.p002ui.graphics.TransformOriginKt.TransformOrigin(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.calculateTransformOrigin(androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect):long");
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }
}
