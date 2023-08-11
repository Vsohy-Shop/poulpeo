package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.AlphaKt;
import androidx.compose.p002ui.layout.LayoutIdKt;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
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
import java.util.Map;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: NavigationRail.kt */
public final class NavigationRailKt {
    private static final String IconLayoutIdTag = "icon";
    /* access modifiers changed from: private */
    public static final float IndicatorHorizontalPadding;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    /* access modifiers changed from: private */
    public static final float IndicatorVerticalPaddingNoLabel;
    /* access modifiers changed from: private */
    public static final float IndicatorVerticalPaddingWithLabel;
    private static final int ItemAnimationDurationMillis = 150;
    private static final String LabelLayoutIdTag = "label";
    /* access modifiers changed from: private */
    public static final float NavigationRailHeaderPadding = C1232Dp.m38468constructorimpl((float) 8);
    private static final float NavigationRailItemHeight;
    private static final float NavigationRailItemVerticalPadding;
    private static final float NavigationRailItemWidth;
    private static final float NavigationRailVerticalPadding;

    static {
        float f = (float) 4;
        NavigationRailVerticalPadding = C1232Dp.m38468constructorimpl(f);
        NavigationRailTokens navigationRailTokens = NavigationRailTokens.INSTANCE;
        NavigationRailItemWidth = navigationRailTokens.m35037getContainerWidthD9Ej5fM();
        NavigationRailItemHeight = navigationRailTokens.m35040getNoLabelActiveIndicatorHeightD9Ej5fM();
        NavigationRailItemVerticalPadding = C1232Dp.m38468constructorimpl(f);
        float f2 = (float) 2;
        IndicatorHorizontalPadding = C1232Dp.m38468constructorimpl(C1232Dp.m38468constructorimpl(navigationRailTokens.m35035getActiveIndicatorWidthD9Ej5fM() - navigationRailTokens.m35038getIconSizeD9Ej5fM()) / f2);
        IndicatorVerticalPaddingWithLabel = C1232Dp.m38468constructorimpl(C1232Dp.m38468constructorimpl(navigationRailTokens.m35034getActiveIndicatorHeightD9Ej5fM() - navigationRailTokens.m35038getIconSizeD9Ej5fM()) / f2);
        IndicatorVerticalPaddingNoLabel = C1232Dp.m38468constructorimpl(C1232Dp.m38468constructorimpl(navigationRailTokens.m35040getNoLabelActiveIndicatorHeightD9Ej5fM() - navigationRailTokens.m35038getIconSizeD9Ej5fM()) / f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cd  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: NavigationRail-qi6gXK8  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34523NavigationRailqi6gXK8(androidx.compose.p002ui.Modifier r25, long r26, long r28, p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r30, androidx.compose.foundation.layout.WindowInsets r31, p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r8 = r32
            r9 = r34
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            r0 = 118552648(0x710f848, float:1.0906319E-34)
            r1 = r33
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r35 & 1
            if (r2 == 0) goto L_0x001c
            r3 = r9 | 6
            r4 = r3
            r3 = r25
            goto L_0x0030
        L_0x001c:
            r3 = r9 & 14
            if (r3 != 0) goto L_0x002d
            r3 = r25
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x002a
            r4 = 4
            goto L_0x002b
        L_0x002a:
            r4 = 2
        L_0x002b:
            r4 = r4 | r9
            goto L_0x0030
        L_0x002d:
            r3 = r25
            r4 = r9
        L_0x0030:
            r5 = r9 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0049
            r5 = r35 & 2
            if (r5 != 0) goto L_0x0043
            r5 = r26
            boolean r7 = r1.changed((long) r5)
            if (r7 == 0) goto L_0x0045
            r7 = 32
            goto L_0x0047
        L_0x0043:
            r5 = r26
        L_0x0045:
            r7 = 16
        L_0x0047:
            r4 = r4 | r7
            goto L_0x004b
        L_0x0049:
            r5 = r26
        L_0x004b:
            r7 = r9 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0062
            r7 = r35 & 4
            r10 = r28
            if (r7 != 0) goto L_0x005e
            boolean r7 = r1.changed((long) r10)
            if (r7 == 0) goto L_0x005e
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r7
            goto L_0x0064
        L_0x0062:
            r10 = r28
        L_0x0064:
            r7 = r35 & 8
            if (r7 == 0) goto L_0x006b
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006b:
            r12 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x007e
            r12 = r30
            boolean r13 = r1.changed((java.lang.Object) r12)
            if (r13 == 0) goto L_0x007a
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r4 = r4 | r13
            goto L_0x0080
        L_0x007e:
            r12 = r30
        L_0x0080:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r9
            if (r13 != 0) goto L_0x009b
            r13 = r35 & 16
            if (r13 != 0) goto L_0x0095
            r13 = r31
            boolean r14 = r1.changed((java.lang.Object) r13)
            if (r14 == 0) goto L_0x0097
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0095:
            r13 = r31
        L_0x0097:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r4 = r4 | r14
            goto L_0x009d
        L_0x009b:
            r13 = r31
        L_0x009d:
            r14 = r35 & 32
            if (r14 == 0) goto L_0x00a5
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x00a3:
            r4 = r4 | r14
            goto L_0x00b6
        L_0x00a5:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x00b6
            boolean r14 = r1.changed((java.lang.Object) r8)
            if (r14 == 0) goto L_0x00b3
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a3
        L_0x00b3:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a3
        L_0x00b6:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r4
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00cd
            boolean r14 = r1.getSkipping()
            if (r14 != 0) goto L_0x00c6
            goto L_0x00cd
        L_0x00c6:
            r1.skipToGroupEnd()
            r2 = r3
            r7 = r12
            goto L_0x0176
        L_0x00cd:
            r1.startDefaults()
            r14 = r9 & 1
            r15 = -57345(0xffffffffffff1fff, float:NaN)
            if (r14 == 0) goto L_0x00fb
            boolean r14 = r1.getDefaultsInvalid()
            if (r14 == 0) goto L_0x00de
            goto L_0x00fb
        L_0x00de:
            r1.skipToGroupEnd()
            r2 = r35 & 2
            if (r2 == 0) goto L_0x00e7
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00e7:
            r2 = r35 & 4
            if (r2 == 0) goto L_0x00ed
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ed:
            r2 = r35 & 16
            if (r2 == 0) goto L_0x00f2
            r4 = r4 & r15
        L_0x00f2:
            r2 = r3
        L_0x00f3:
            r7 = r12
            r14 = r13
        L_0x00f5:
            r23 = r10
            r10 = r4
            r3 = r23
            goto L_0x012f
        L_0x00fb:
            if (r2 == 0) goto L_0x0100
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0101
        L_0x0100:
            r2 = r3
        L_0x0101:
            r3 = r35 & 2
            r14 = 6
            if (r3 == 0) goto L_0x010e
            androidx.compose.material3.NavigationRailDefaults r3 = androidx.compose.material3.NavigationRailDefaults.INSTANCE
            long r5 = r3.getContainerColor(r1, r14)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x010e:
            r3 = r35 & 4
            if (r3 == 0) goto L_0x011d
            int r3 = r4 >> 3
            r3 = r3 & 14
            long r10 = androidx.compose.material3.ColorSchemeKt.m34359contentColorForek8zF_U(r5, r1, r3)
            r3 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r4 = r3
        L_0x011d:
            if (r7 == 0) goto L_0x0121
            r3 = 0
            r12 = r3
        L_0x0121:
            r3 = r35 & 16
            if (r3 == 0) goto L_0x00f3
            androidx.compose.material3.NavigationRailDefaults r3 = androidx.compose.material3.NavigationRailDefaults.INSTANCE
            androidx.compose.foundation.layout.WindowInsets r3 = r3.getWindowInsets(r1, r14)
            r4 = r4 & r15
            r14 = r3
            r7 = r12
            goto L_0x00f5
        L_0x012f:
            r1.endDefaults()
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x013e
            r11 = -1
            java.lang.String r12 = "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r11, r12)
        L_0x013e:
            r11 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            androidx.compose.material3.NavigationRailKt$NavigationRail$1 r0 = new androidx.compose.material3.NavigationRailKt$NavigationRail$1
            r0.<init>(r14, r7, r10, r8)
            r12 = -2092683357(0xffffffff83442fa3, float:-5.7653907E-37)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r19 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r12, r13, r0)
            r0 = r10 & 14
            r12 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r12
            int r10 = r10 << 3
            r12 = r10 & 896(0x380, float:1.256E-42)
            r0 = r0 | r12
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r21 = r0 | r10
            r22 = 114(0x72, float:1.6E-43)
            r10 = r2
            r12 = r5
            r0 = r14
            r14 = r3
            r20 = r1
            androidx.compose.material3.SurfaceKt.m34602SurfaceT9BRK9s(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22)
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x0174
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0174:
            r13 = r0
            r10 = r3
        L_0x0176:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.endRestartGroup()
            if (r12 != 0) goto L_0x017d
            goto L_0x0191
        L_0x017d:
            androidx.compose.material3.NavigationRailKt$NavigationRail$2 r14 = new androidx.compose.material3.NavigationRailKt$NavigationRail$2
            r0 = r14
            r1 = r2
            r2 = r5
            r4 = r10
            r6 = r7
            r7 = r13
            r8 = r32
            r9 = r34
            r10 = r35
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10)
            r12.updateScope(r14)
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationRailKt.m34523NavigationRailqi6gXK8(androidx.compose.ui.Modifier, long, long, of.p, androidx.compose.foundation.layout.WindowInsets, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0102  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void NavigationRailItem(boolean r31, p404of.C13074a<p336ef.C11921v> r32, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r33, androidx.compose.p002ui.Modifier r34, boolean r35, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r36, boolean r37, androidx.compose.material3.NavigationRailItemColors r38, androidx.compose.foundation.interaction.MutableInteractionSource r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            r1 = r31
            r2 = r32
            r3 = r33
            r10 = r41
            r11 = r42
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            java.lang.String r0 = "icon"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            r0 = -1533971045(0xffffffffa491759b, float:-6.308296E-17)
            r4 = r40
            androidx.compose.runtime.Composer r4 = r4.startRestartGroup(r0)
            r5 = r11 & 1
            if (r5 == 0) goto L_0x0024
            r5 = r10 | 6
            goto L_0x0034
        L_0x0024:
            r5 = r10 & 14
            if (r5 != 0) goto L_0x0033
            boolean r5 = r4.changed((boolean) r1)
            if (r5 == 0) goto L_0x0030
            r5 = 4
            goto L_0x0031
        L_0x0030:
            r5 = 2
        L_0x0031:
            r5 = r5 | r10
            goto L_0x0034
        L_0x0033:
            r5 = r10
        L_0x0034:
            r7 = r11 & 2
            if (r7 == 0) goto L_0x003b
            r5 = r5 | 48
            goto L_0x004b
        L_0x003b:
            r7 = r10 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004b
            boolean r7 = r4.changed((java.lang.Object) r2)
            if (r7 == 0) goto L_0x0048
            r7 = 32
            goto L_0x004a
        L_0x0048:
            r7 = 16
        L_0x004a:
            r5 = r5 | r7
        L_0x004b:
            r7 = r11 & 4
            if (r7 == 0) goto L_0x0052
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0052:
            r7 = r10 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0062
            boolean r7 = r4.changed((java.lang.Object) r3)
            if (r7 == 0) goto L_0x005f
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r5 = r5 | r7
        L_0x0062:
            r7 = r11 & 8
            if (r7 == 0) goto L_0x0069
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x0069:
            r8 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007c
            r8 = r34
            boolean r9 = r4.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0078
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r5 = r5 | r9
            goto L_0x007e
        L_0x007c:
            r8 = r34
        L_0x007e:
            r9 = r11 & 16
            r26 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x0088
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0088:
            r12 = r10 & r26
            if (r12 != 0) goto L_0x009b
            r12 = r35
            boolean r13 = r4.changed((boolean) r12)
            if (r13 == 0) goto L_0x0097
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r5 = r5 | r13
            goto L_0x009d
        L_0x009b:
            r12 = r35
        L_0x009d:
            r13 = r11 & 32
            if (r13 == 0) goto L_0x00a5
            r14 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r14
            goto L_0x00b9
        L_0x00a5:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00b9
            r14 = r36
            boolean r15 = r4.changed((java.lang.Object) r14)
            if (r15 == 0) goto L_0x00b5
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r5 = r5 | r15
            goto L_0x00bb
        L_0x00b9:
            r14 = r36
        L_0x00bb:
            r15 = r11 & 64
            if (r15 == 0) goto L_0x00c6
            r16 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 | r16
            r6 = r37
            goto L_0x00db
        L_0x00c6:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r10 & r16
            r6 = r37
            if (r16 != 0) goto L_0x00db
            boolean r16 = r4.changed((boolean) r6)
            if (r16 == 0) goto L_0x00d7
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r5 = r5 | r16
        L_0x00db:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x00f7
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00f0
            r0 = r38
            boolean r16 = r4.changed((java.lang.Object) r0)
            if (r16 == 0) goto L_0x00f2
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f4
        L_0x00f0:
            r0 = r38
        L_0x00f2:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f4:
            r5 = r5 | r16
            goto L_0x00f9
        L_0x00f7:
            r0 = r38
        L_0x00f9:
            r14 = r11 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x0102
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = r5 | r16
            goto L_0x011a
        L_0x0102:
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x011a
            r16 = r14
            r14 = r39
            boolean r17 = r4.changed((java.lang.Object) r14)
            if (r17 == 0) goto L_0x0115
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0117
        L_0x0115:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0117:
            r5 = r5 | r17
            goto L_0x011e
        L_0x011a:
            r16 = r14
            r14 = r39
        L_0x011e:
            r17 = 191739611(0xb6db6db, float:4.5782105E-32)
            r0 = r5 & r17
            r2 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 != r2) goto L_0x013d
            boolean r0 = r4.getSkipping()
            if (r0 != 0) goto L_0x012f
            goto L_0x013d
        L_0x012f:
            r4.skipToGroupEnd()
            r7 = r6
            r21 = r8
            r5 = r12
            r9 = r14
            r6 = r36
            r8 = r38
            goto L_0x03cf
        L_0x013d:
            r4.startDefaults()
            r0 = r10 & 1
            r2 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r14 = 1
            if (r0 == 0) goto L_0x0160
            boolean r0 = r4.getDefaultsInvalid()
            if (r0 == 0) goto L_0x014f
            goto L_0x0160
        L_0x014f:
            r4.skipToGroupEnd()
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0157
            r5 = r5 & r2
        L_0x0157:
            r7 = r36
            r9 = r38
            r2 = r39
            r0 = r12
            goto L_0x01c5
        L_0x0160:
            if (r7 == 0) goto L_0x0165
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            r8 = r0
        L_0x0165:
            if (r9 == 0) goto L_0x0169
            r0 = r14
            goto L_0x016a
        L_0x0169:
            r0 = r12
        L_0x016a:
            if (r13 == 0) goto L_0x016e
            r7 = 0
            goto L_0x0170
        L_0x016e:
            r7 = r36
        L_0x0170:
            if (r15 == 0) goto L_0x0173
            r6 = r14
        L_0x0173:
            r9 = r11 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x019e
            androidx.compose.material3.NavigationRailItemDefaults r12 = androidx.compose.material3.NavigationRailItemDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r27 = 0
            r9 = 196608(0x30000, float:2.75506E-40)
            r25 = 31
            r29 = r16
            r15 = 0
            r13 = r17
            r15 = r19
            r17 = r21
            r19 = r23
            r21 = r27
            r23 = r4
            r24 = r9
            androidx.compose.material3.NavigationRailItemColors r9 = r12.m34522colorszjMxDiM(r13, r15, r17, r19, r21, r23, r24, r25)
            r5 = r5 & r2
            goto L_0x01a2
        L_0x019e:
            r29 = r16
            r9 = r38
        L_0x01a2:
            if (r29 == 0) goto L_0x01c3
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.startReplaceableGroup(r2)
            java.lang.Object r2 = r4.rememberedValue()
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r12 = r12.getEmpty()
            if (r2 != r12) goto L_0x01bd
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r4.updateRememberedValue(r2)
        L_0x01bd:
            r4.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            goto L_0x01c5
        L_0x01c3:
            r2 = r39
        L_0x01c5:
            r4.endDefaults()
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x01d7
            r12 = -1
            java.lang.String r13 = "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)"
            r14 = -1533971045(0xffffffffa491759b, float:-6.308296E-17)
            androidx.compose.runtime.ComposerKt.traceEventStart(r14, r5, r12, r13)
        L_0x01d7:
            androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1 r12 = new androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
            r34 = r12
            r35 = r9
            r36 = r31
            r37 = r5
            r38 = r7
            r39 = r6
            r40 = r33
            r34.<init>(r35, r36, r37, r38, r39, r40)
            r13 = -1023357515(0xffffffffc300cdb5, float:-128.80354)
            r14 = 1
            androidx.compose.runtime.internal.ComposableLambda r15 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r4, r13, r14, r12)
            if (r7 == 0) goto L_0x0203
            androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1 r12 = new androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
            r12.<init>(r9, r1, r5, r7)
            r13 = -105269599(0xfffffffff9b9b6a1, float:-1.2053488E35)
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r4, r13, r14, r12)
            r16 = r12
            goto L_0x0205
        L_0x0203:
            r16 = 0
        L_0x0205:
            androidx.compose.ui.semantics.Role$Companion r12 = androidx.compose.p002ui.semantics.Role.Companion
            int r12 = r12.m37820getTabo7Vup1c()
            r13 = 0
            androidx.compose.ui.semantics.Role r12 = androidx.compose.p002ui.semantics.Role.m37807boximpl(r12)
            r34 = r8
            r35 = r31
            r36 = r2
            r37 = r13
            r38 = r0
            r39 = r12
            r40 = r32
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.selection.SelectableKt.m33587selectableO2vRcR0(r34, r35, r36, r37, r38, r39, r40)
            float r13 = NavigationRailItemHeight
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.SizeKt.m33324height3ABfNKs(r12, r13)
            float r13 = NavigationRailItemWidth
            r14 = 0
            r20 = r0
            r0 = 2
            r3 = 0
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.SizeKt.m33345widthInVpY3zN4$default(r12, r13, r14, r0, r3)
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r0 = r0.getCenter()
            r14 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r4.startReplaceableGroup(r14)
            r14 = 0
            r3 = 6
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r0, r14, r4, r3)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r4.startReplaceableGroup(r3)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r3 = r4.consume(r3)
            androidx.compose.ui.unit.Density r3 = (androidx.compose.p002ui.unit.Density) r3
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r14 = r4.consume(r14)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.p002ui.unit.LayoutDirection) r14
            r21 = r8
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r8 = r4.consume(r8)
            androidx.compose.ui.platform.ViewConfiguration r8 = (androidx.compose.p002ui.platform.ViewConfiguration) r8
            androidx.compose.ui.node.ComposeUiNode$Companion r19 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r10 = r19.getConstructor()
            of.p r12 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r12)
            androidx.compose.runtime.Applier r11 = r4.getApplier()
            boolean r11 = r11 instanceof androidx.compose.runtime.Applier
            if (r11 != 0) goto L_0x0280
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0280:
            r4.startReusableNode()
            boolean r11 = r4.getInserting()
            if (r11 == 0) goto L_0x028d
            r4.createNode(r10)
            goto L_0x0290
        L_0x028d:
            r4.useNode()
        L_0x0290:
            r4.disableReusing()
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.m35292constructorimpl(r4)
            of.o r11 = r19.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r0, r11)
            of.o r0 = r19.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r3, r0)
            of.o r0 = r19.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r14, r0)
            of.o r0 = r19.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r8, r0)
            r4.enableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r4)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r0)
            r3 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r12.invoke(r0, r4, r8)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r4.startReplaceableGroup(r0)
            r0 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r4.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            r0 = 752355157(0x2cd80755, float:6.1399033E-12)
            r4.startReplaceableGroup(r0)
            if (r1 == 0) goto L_0x02df
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x02e0
        L_0x02df:
            r0 = 0
        L_0x02e0:
            r3 = 150(0x96, float:2.1E-43)
            r8 = 0
            r10 = 0
            r11 = 6
            androidx.compose.animation.core.TweenSpec r3 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r3, r8, r10, r11, r10)
            r8 = 0
            r10 = 0
            r11 = 48
            r12 = 12
            r34 = r0
            r35 = r3
            r36 = r8
            r37 = r10
            r38 = r4
            r39 = r11
            r40 = r12
            androidx.compose.runtime.State r0 = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(r34, r35, r36, r37, r38, r39, r40)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r3 = r4.consume(r3)
            androidx.compose.ui.unit.Density r3 = (androidx.compose.p002ui.unit.Density) r3
            int r8 = r3.m38443roundToPx0680j_4(r13)
            androidx.compose.material3.tokens.NavigationRailTokens r10 = androidx.compose.material3.tokens.NavigationRailTokens.INSTANCE
            float r11 = r10.m35035getActiveIndicatorWidthD9Ej5fM()
            int r3 = r3.m38443roundToPx0680j_4(r11)
            int r8 = r8 - r3
            float r3 = (float) r8
            r8 = 2
            float r8 = (float) r8
            float r3 = r3 / r8
            r8 = 0
            long r11 = androidx.compose.p002ui.geometry.OffsetKt.Offset(r3, r8)
            ef.v r3 = p336ef.C11921v.f18618a
            androidx.compose.ui.geometry.Offset r3 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r11)
            r8 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r4.startReplaceableGroup(r8)
            boolean r8 = r4.changed((java.lang.Object) r2)
            boolean r3 = r4.changed((java.lang.Object) r3)
            r3 = r3 | r8
            java.lang.Object r8 = r4.rememberedValue()
            if (r3 != 0) goto L_0x0346
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r8 != r3) goto L_0x034f
        L_0x0346:
            androidx.compose.material3.MappedInteractionSource r8 = new androidx.compose.material3.MappedInteractionSource
            r3 = 0
            r8.<init>(r2, r11, r3)
            r4.updateRememberedValue(r8)
        L_0x034f:
            r4.endReplaceableGroup()
            androidx.compose.material3.MappedInteractionSource r8 = (androidx.compose.material3.MappedInteractionSource) r8
            if (r7 == 0) goto L_0x0369
            r3 = 1104516937(0x41d59749, float:26.69887)
            r4.startReplaceableGroup(r3)
            androidx.compose.material3.tokens.ShapeKeyTokens r3 = r10.getActiveIndicatorShape()
            r11 = 6
            androidx.compose.ui.graphics.Shape r3 = androidx.compose.material3.ShapesKt.toShape(r3, r4, r11)
            r4.endReplaceableGroup()
            goto L_0x037b
        L_0x0369:
            r11 = 6
            r3 = 1104517018(0x41d5979a, float:26.699024)
            r4.startReplaceableGroup(r3)
            androidx.compose.material3.tokens.ShapeKeyTokens r3 = r10.getNoLabelActiveIndicatorShape()
            androidx.compose.ui.graphics.Shape r3 = androidx.compose.material3.ShapesKt.toShape(r3, r4, r11)
            r4.endReplaceableGroup()
        L_0x037b:
            androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1 r10 = new androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
            r10.<init>(r3, r8)
            r8 = 211026382(0xc9401ce, float:2.2804097E-31)
            r11 = 1
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r4, r8, r11, r10)
            androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1 r8 = new androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
            r8.<init>(r9, r5, r3, r0)
            r3 = -1862011490(0xffffffff9103f59e, float:-1.0409764E-28)
            androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r4, r3, r11, r8)
            float r17 = m34524NavigationRailItem$lambda5$lambda2(r0)
            r0 = 6
            int r0 = r5 >> 6
            r0 = r0 & r26
            r0 = r0 | 438(0x1b6, float:6.14E-43)
            r14 = r15
            r15 = r16
            r16 = r6
            r18 = r4
            r19 = r0
            NavigationRailItemBaselineLayout(r12, r13, r14, r15, r16, r17, r18, r19)
            r4.endReplaceableGroup()
            r4.endReplaceableGroup()
            r4.endReplaceableGroup()
            r4.endNode()
            r4.endReplaceableGroup()
            r4.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x03c6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x03c6:
            r8 = r9
            r5 = r20
            r9 = r2
            r30 = r7
            r7 = r6
            r6 = r30
        L_0x03cf:
            androidx.compose.runtime.ScopeUpdateScope r12 = r4.endRestartGroup()
            if (r12 != 0) goto L_0x03d6
            goto L_0x03eb
        L_0x03d6:
            androidx.compose.material3.NavigationRailKt$NavigationRailItem$3 r13 = new androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
            r0 = r13
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r21
            r10 = r41
            r11 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.updateScope(r13)
        L_0x03eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationRailKt.NavigationRailItem(boolean, of.a, of.o, androidx.compose.ui.Modifier, boolean, of.o, boolean, androidx.compose.material3.NavigationRailItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: NavigationRailItem$lambda-5$lambda-2  reason: not valid java name */
    public static final float m34524NavigationRailItem$lambda5$lambda2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void NavigationRailItemBaselineLayout(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, boolean z, float f, Composer composer, int i) {
        int i2;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C13088o<? super Composer, ? super Integer, C11921v> oVar5 = oVar;
        C13088o<? super Composer, ? super Integer, C11921v> oVar6 = oVar2;
        C13088o<? super Composer, ? super Integer, C11921v> oVar7 = oVar3;
        C13088o<? super Composer, ? super Integer, C11921v> oVar8 = oVar4;
        boolean z2 = z;
        float f3 = f;
        int i9 = i;
        Composer startRestartGroup = composer.startRestartGroup(-876426901);
        if ((i9 & 14) == 0) {
            if (startRestartGroup.changed((Object) oVar5)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i9;
        } else {
            i2 = i9;
        }
        if ((i9 & 112) == 0) {
            if (startRestartGroup.changed((Object) oVar6)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i9 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changed((Object) oVar7)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i9 & 7168) == 0) {
            if (startRestartGroup.changed((Object) oVar8)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((57344 & i9) == 0) {
            if (startRestartGroup.changed(z2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((458752 & i9) == 0) {
            if (startRestartGroup.changed(f3)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((374491 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-876426901, i2, -1, "androidx.compose.material3.NavigationRailItemBaselineLayout (NavigationRail.kt:381)");
            }
            NavigationRailKt$NavigationRailItemBaselineLayout$2 navigationRailKt$NavigationRailItemBaselineLayout$2 = new NavigationRailKt$NavigationRailItemBaselineLayout$2(f3, oVar8, z2);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.Companion;
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Composer r5 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r5, navigationRailKt$NavigationRailItemBaselineLayout$2, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r5, density, companion2.getSetDensity());
            Updater.m35299setimpl(r5, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r5, viewConfiguration, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(2083574754);
            oVar5.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.startReplaceableGroup(935754904);
            if (f3 > 0.0f) {
                oVar6.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier layoutId = LayoutIdKt.layoutId(companion, IconLayoutIdTag);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            C13074a<ComposeUiNode> constructor2 = companion2.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(layoutId);
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
            Composer r1 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r1, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r1, density2, companion2.getSetDensity());
            Updater.m35299setimpl(r1, layoutDirection2, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r1, viewConfiguration2, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1582262808);
            oVar7.invoke(startRestartGroup, Integer.valueOf((i2 >> 6) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (oVar8 != null) {
                Modifier layoutId2 = LayoutIdKt.layoutId(companion, LabelLayoutIdTag);
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = f3;
                }
                Modifier alpha = AlphaKt.alpha(layoutId2, f2);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                C13074a<ComposeUiNode> constructor3 = companion2.getConstructor();
                C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf3 = LayoutKt.materializerOf(alpha);
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
                Composer r12 = Updater.m35292constructorimpl(startRestartGroup);
                Updater.m35299setimpl(r12, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m35299setimpl(r12, density3, companion2.getSetDensity());
                Updater.m35299setimpl(r12, layoutDirection3, companion2.getSetLayoutDirection());
                Updater.m35299setimpl(r12, viewConfiguration3, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                startRestartGroup.startReplaceableGroup(6101178);
                oVar8.invoke(startRestartGroup, Integer.valueOf((i2 >> 9) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new NavigationRailKt$NavigationRailItemBaselineLayout$3(oVar, oVar2, oVar3, oVar4, z, f, i));
        }
    }

    public static final float getNavigationRailItemHeight() {
        return NavigationRailItemHeight;
    }

    public static final float getNavigationRailItemVerticalPadding() {
        return NavigationRailItemVerticalPadding;
    }

    public static final float getNavigationRailItemWidth() {
        return NavigationRailItemWidth;
    }

    public static final float getNavigationRailVerticalPadding() {
        return NavigationRailVerticalPadding;
    }

    /* access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4  reason: not valid java name */
    public static final MeasureResult m34528placeIconX9ElhV4(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j) {
        int i;
        int width = placeable.getWidth();
        int width2 = placeable2.getWidth();
        if (placeable3 != null) {
            i = placeable3.getWidth();
        } else {
            i = 0;
        }
        int r0 = ConstraintsKt.m38426constrainWidthK40F9xA(j, Math.max(width, Math.max(width2, i)));
        int r12 = Constraints.m38411getMaxHeightimpl(j);
        return MeasureScope.layout$default(measureScope, r0, r12, (Map) null, new NavigationRailKt$placeIcon$1(placeable3, placeable, (r0 - placeable.getWidth()) / 2, (r12 - placeable.getHeight()) / 2, placeable2, (r0 - placeable2.getWidth()) / 2, (r12 - placeable2.getHeight()) / 2, r0, r12), 4, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0  reason: not valid java name */
    public static final MeasureResult m34529placeLabelAndIconzUg2_y0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j, boolean z, float f) {
        int i;
        int i2;
        MeasureScope measureScope2 = measureScope;
        int r16 = Constraints.m38411getMaxHeightimpl(j);
        float f2 = NavigationRailItemVerticalPadding;
        int height = (r16 - placeable.getHeight()) - measureScope2.m38443roundToPx0680j_4(f2);
        int r10 = measureScope2.m38443roundToPx0680j_4(f2);
        if (z) {
            i = r10;
        } else {
            i = (r16 - placeable2.getHeight()) / 2;
        }
        int c = C13265c.m30134c(((float) (i - r10)) * (((float) 1) - f));
        int width = placeable2.getWidth();
        int width2 = placeable.getWidth();
        if (placeable4 != null) {
            i2 = placeable4.getWidth();
        } else {
            i2 = 0;
        }
        int r17 = ConstraintsKt.m38426constrainWidthK40F9xA(j, Math.max(width, Math.max(width2, i2)));
        return MeasureScope.layout$default(measureScope, r17, r16, (Map) null, new NavigationRailKt$placeLabelAndIcon$1(placeable4, z, f, placeable, (r17 - placeable.getWidth()) / 2, height, c, placeable2, (r17 - placeable2.getWidth()) / 2, r10, placeable3, (r17 - placeable3.getWidth()) / 2, r10 - measureScope2.m38443roundToPx0680j_4(IndicatorVerticalPaddingWithLabel), r17, measureScope), 4, (Object) null);
    }
}
