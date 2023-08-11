package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
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
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import java.util.Map;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: NavigationBar.kt */
public final class NavigationBarKt {
    private static final String IconLayoutIdTag = "icon";
    /* access modifiers changed from: private */
    public static final float IndicatorHorizontalPadding;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalOffset = C1232Dp.m38468constructorimpl((float) 12);
    /* access modifiers changed from: private */
    public static final float IndicatorVerticalPadding;
    private static final int ItemAnimationDurationMillis = 100;
    private static final String LabelLayoutIdTag = "label";
    /* access modifiers changed from: private */
    public static final float NavigationBarHeight;
    private static final float NavigationBarItemHorizontalPadding = C1232Dp.m38468constructorimpl((float) 8);
    private static final float NavigationBarItemVerticalPadding = C1232Dp.m38468constructorimpl((float) 16);

    static {
        NavigationBarTokens navigationBarTokens = NavigationBarTokens.INSTANCE;
        NavigationBarHeight = navigationBarTokens.m35026getContainerHeightD9Ej5fM();
        float f = (float) 2;
        IndicatorHorizontalPadding = C1232Dp.m38468constructorimpl(C1232Dp.m38468constructorimpl(navigationBarTokens.m35024getActiveIndicatorWidthD9Ej5fM() - navigationBarTokens.m35027getIconSizeD9Ej5fM()) / f);
        IndicatorVerticalPadding = C1232Dp.m38468constructorimpl(C1232Dp.m38468constructorimpl(navigationBarTokens.m35023getActiveIndicatorHeightD9Ej5fM() - navigationBarTokens.m35027getIconSizeD9Ej5fM()) / f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ce  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: NavigationBar-HsRjFd4  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34496NavigationBarHsRjFd4(androidx.compose.p002ui.Modifier r25, long r26, long r28, float r30, androidx.compose.foundation.layout.WindowInsets r31, p404of.C13089p<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r8 = r32
            r9 = r34
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            r0 = 1596802123(0x5f2d444b, float:1.2485187E19)
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
            boolean r13 = r1.changed((float) r12)
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
            r14 = r9 & r13
            if (r14 != 0) goto L_0x009c
            r14 = r35 & 16
            if (r14 != 0) goto L_0x0096
            r14 = r31
            boolean r15 = r1.changed((java.lang.Object) r14)
            if (r15 == 0) goto L_0x0098
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0096:
            r14 = r31
        L_0x0098:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r4 = r4 | r15
            goto L_0x009e
        L_0x009c:
            r14 = r31
        L_0x009e:
            r15 = r35 & 32
            if (r15 == 0) goto L_0x00a6
            r15 = 196608(0x30000, float:2.75506E-40)
        L_0x00a4:
            r4 = r4 | r15
            goto L_0x00b7
        L_0x00a6:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x00b7
            boolean r15 = r1.changed((java.lang.Object) r8)
            if (r15 == 0) goto L_0x00b4
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a4
        L_0x00b4:
            r15 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a4
        L_0x00b7:
            r15 = 374491(0x5b6db, float:5.24774E-40)
            r15 = r15 & r4
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r13) goto L_0x00ce
            boolean r13 = r1.getSkipping()
            if (r13 != 0) goto L_0x00c7
            goto L_0x00ce
        L_0x00c7:
            r1.skipToGroupEnd()
            r2 = r3
            r7 = r12
            goto L_0x0181
        L_0x00ce:
            r1.startDefaults()
            r13 = r9 & 1
            r15 = -57345(0xffffffffffff1fff, float:NaN)
            if (r13 == 0) goto L_0x00fb
            boolean r13 = r1.getDefaultsInvalid()
            if (r13 == 0) goto L_0x00df
            goto L_0x00fb
        L_0x00df:
            r1.skipToGroupEnd()
            r2 = r35 & 2
            if (r2 == 0) goto L_0x00e8
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00e8:
            r2 = r35 & 4
            if (r2 == 0) goto L_0x00ee
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ee:
            r2 = r35 & 16
            if (r2 == 0) goto L_0x00f3
            r4 = r4 & r15
        L_0x00f3:
            r2 = r3
        L_0x00f4:
            r7 = r12
            r23 = r10
            r10 = r4
            r3 = r23
            goto L_0x0135
        L_0x00fb:
            if (r2 == 0) goto L_0x0100
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0101
        L_0x0100:
            r2 = r3
        L_0x0101:
            r3 = r35 & 2
            r13 = 6
            if (r3 == 0) goto L_0x010e
            androidx.compose.material3.NavigationBarDefaults r3 = androidx.compose.material3.NavigationBarDefaults.INSTANCE
            long r5 = r3.getContainerColor(r1, r13)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x010e:
            r3 = r35 & 4
            if (r3 == 0) goto L_0x011f
            androidx.compose.material3.MaterialTheme r3 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.ColorScheme r3 = r3.getColorScheme(r1, r13)
            long r10 = androidx.compose.material3.ColorSchemeKt.m34358contentColorFor4WTKRHQ(r3, r5)
            r3 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r4 = r3
        L_0x011f:
            if (r7 == 0) goto L_0x0128
            androidx.compose.material3.NavigationBarDefaults r3 = androidx.compose.material3.NavigationBarDefaults.INSTANCE
            float r3 = r3.m34493getElevationD9Ej5fM()
            r12 = r3
        L_0x0128:
            r3 = r35 & 16
            if (r3 == 0) goto L_0x00f4
            androidx.compose.material3.NavigationBarDefaults r3 = androidx.compose.material3.NavigationBarDefaults.INSTANCE
            androidx.compose.foundation.layout.WindowInsets r3 = r3.getWindowInsets(r1, r13)
            r4 = r4 & r15
            r14 = r3
            goto L_0x00f4
        L_0x0135:
            r1.endDefaults()
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x0144
            r11 = -1
            java.lang.String r12 = "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r11, r12)
        L_0x0144:
            r11 = 0
            r17 = 0
            r18 = 0
            androidx.compose.material3.NavigationBarKt$NavigationBar$1 r0 = new androidx.compose.material3.NavigationBarKt$NavigationBar$1
            r0.<init>(r14, r8, r10)
            r12 = 105663120(0x64c4a90, float:3.8422915E-35)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r19 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r12, r13, r0)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r12 = r10 & 14
            r0 = r0 | r12
            int r10 = r10 << 3
            r12 = r10 & 896(0x380, float:1.256E-42)
            r0 = r0 | r12
            r12 = r10 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r12
            r21 = r0 | r10
            r22 = 98
            r10 = r2
            r12 = r5
            r0 = r14
            r14 = r3
            r16 = r7
            r20 = r1
            androidx.compose.material3.SurfaceKt.m34602SurfaceT9BRK9s(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22)
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x017f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x017f:
            r14 = r0
            r10 = r3
        L_0x0181:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.endRestartGroup()
            if (r12 != 0) goto L_0x0188
            goto L_0x019c
        L_0x0188:
            androidx.compose.material3.NavigationBarKt$NavigationBar$2 r13 = new androidx.compose.material3.NavigationBarKt$NavigationBar$2
            r0 = r13
            r1 = r2
            r2 = r5
            r4 = r10
            r6 = r7
            r7 = r14
            r8 = r32
            r9 = r34
            r10 = r35
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10)
            r12.updateScope(r13)
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.m34496NavigationBarHsRjFd4(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.WindowInsets, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0125  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void NavigationBarItem(androidx.compose.foundation.layout.RowScope r30, boolean r31, p404of.C13074a<p336ef.C11921v> r32, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r33, androidx.compose.p002ui.Modifier r34, boolean r35, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r36, boolean r37, androidx.compose.material3.NavigationBarItemColors r38, androidx.compose.foundation.interaction.MutableInteractionSource r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r11 = r41
            r12 = r42
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            java.lang.String r0 = "icon"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            r0 = -663510974(0xffffffffd873a042, float:-1.07147851E15)
            r5 = r40
            androidx.compose.runtime.Composer r5 = r5.startRestartGroup(r0)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r6 & r12
            if (r6 == 0) goto L_0x002c
            r6 = r11 | 6
            goto L_0x003c
        L_0x002c:
            r6 = r11 & 14
            if (r6 != 0) goto L_0x003b
            boolean r6 = r5.changed((java.lang.Object) r1)
            if (r6 == 0) goto L_0x0038
            r6 = 4
            goto L_0x0039
        L_0x0038:
            r6 = 2
        L_0x0039:
            r6 = r6 | r11
            goto L_0x003c
        L_0x003b:
            r6 = r11
        L_0x003c:
            r8 = r12 & 1
            if (r8 == 0) goto L_0x0043
            r6 = r6 | 48
            goto L_0x0053
        L_0x0043:
            r8 = r11 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0053
            boolean r8 = r5.changed((boolean) r2)
            if (r8 == 0) goto L_0x0050
            r8 = 32
            goto L_0x0052
        L_0x0050:
            r8 = 16
        L_0x0052:
            r6 = r6 | r8
        L_0x0053:
            r8 = r12 & 2
            if (r8 == 0) goto L_0x005a
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x005a:
            r8 = r11 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x006a
            boolean r8 = r5.changed((java.lang.Object) r3)
            if (r8 == 0) goto L_0x0067
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r6 = r6 | r8
        L_0x006a:
            r8 = r12 & 4
            if (r8 == 0) goto L_0x0071
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x0071:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0081
            boolean r8 = r5.changed((java.lang.Object) r4)
            if (r8 == 0) goto L_0x007e
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r6 = r6 | r8
        L_0x0081:
            r8 = r12 & 8
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x008b
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008b:
            r10 = r11 & r9
            if (r10 != 0) goto L_0x009e
            r10 = r34
            boolean r13 = r5.changed((java.lang.Object) r10)
            if (r13 == 0) goto L_0x009a
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r6 = r6 | r13
            goto L_0x00a0
        L_0x009e:
            r10 = r34
        L_0x00a0:
            r13 = r12 & 16
            if (r13 == 0) goto L_0x00a8
            r14 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 | r14
            goto L_0x00bc
        L_0x00a8:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r11
            if (r14 != 0) goto L_0x00bc
            r14 = r35
            boolean r15 = r5.changed((boolean) r14)
            if (r15 == 0) goto L_0x00b8
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r6 = r6 | r15
            goto L_0x00be
        L_0x00bc:
            r14 = r35
        L_0x00be:
            r15 = r12 & 32
            if (r15 == 0) goto L_0x00c9
            r16 = 1572864(0x180000, float:2.204052E-39)
            r6 = r6 | r16
            r9 = r36
            goto L_0x00de
        L_0x00c9:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r11 & r16
            r9 = r36
            if (r16 != 0) goto L_0x00de
            boolean r16 = r5.changed((java.lang.Object) r9)
            if (r16 == 0) goto L_0x00da
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r6 = r6 | r16
        L_0x00de:
            r16 = r12 & 64
            if (r16 == 0) goto L_0x00e9
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r6 = r6 | r17
            r7 = r37
            goto L_0x00fe
        L_0x00e9:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r11 & r17
            r7 = r37
            if (r17 != 0) goto L_0x00fe
            boolean r17 = r5.changed((boolean) r7)
            if (r17 == 0) goto L_0x00fa
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r6 = r6 | r17
        L_0x00fe:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r11 & r17
            if (r17 != 0) goto L_0x011a
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0113
            r0 = r38
            boolean r17 = r5.changed((java.lang.Object) r0)
            if (r17 == 0) goto L_0x0115
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0117
        L_0x0113:
            r0 = r38
        L_0x0115:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0117:
            r6 = r6 | r17
            goto L_0x011c
        L_0x011a:
            r0 = r38
        L_0x011c:
            r14 = r12 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x0125
            r17 = 805306368(0x30000000, float:4.656613E-10)
            r6 = r6 | r17
            goto L_0x013d
        L_0x0125:
            r17 = 1879048192(0x70000000, float:1.58456325E29)
            r17 = r11 & r17
            if (r17 != 0) goto L_0x013d
            r17 = r14
            r14 = r39
            boolean r18 = r5.changed((java.lang.Object) r14)
            if (r18 == 0) goto L_0x0138
            r18 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r18 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r6 = r6 | r18
            goto L_0x0141
        L_0x013d:
            r17 = r14
            r14 = r39
        L_0x0141:
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r6 & r18
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r1) goto L_0x0160
            boolean r0 = r5.getSkipping()
            if (r0 != 0) goto L_0x0152
            goto L_0x0160
        L_0x0152:
            r5.skipToGroupEnd()
            r6 = r35
            r8 = r7
            r7 = r9
            r23 = r10
            r10 = r14
            r9 = r38
            goto L_0x0428
        L_0x0160:
            r5.startDefaults()
            r0 = r11 & 1
            r27 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            if (r0 == 0) goto L_0x0182
            boolean r0 = r5.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0171
            goto L_0x0182
        L_0x0171:
            r5.skipToGroupEnd()
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x017a
            r6 = r6 & r27
        L_0x017a:
            r0 = r35
            r8 = r38
            r13 = r6
            r6 = r14
            goto L_0x01ea
        L_0x0182:
            if (r8 == 0) goto L_0x0187
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            r10 = r0
        L_0x0187:
            if (r13 == 0) goto L_0x018b
            r0 = 1
            goto L_0x018d
        L_0x018b:
            r0 = r35
        L_0x018d:
            if (r15 == 0) goto L_0x0190
            r9 = 0
        L_0x0190:
            if (r16 == 0) goto L_0x0193
            r7 = 1
        L_0x0193:
            r8 = r12 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x01bd
            androidx.compose.material3.NavigationBarItemDefaults r13 = androidx.compose.material3.NavigationBarItemDefaults.INSTANCE
            r15 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r8 = 196608(0x30000, float:2.75506E-40)
            r26 = 31
            r28 = r17
            r14 = r15
            r16 = r18
            r18 = r20
            r20 = r22
            r22 = r24
            r24 = r5
            r25 = r8
            androidx.compose.material3.NavigationBarItemColors r8 = r13.m34495colorszjMxDiM(r14, r16, r18, r20, r22, r24, r25, r26)
            r6 = r6 & r27
            goto L_0x01c1
        L_0x01bd:
            r28 = r17
            r8 = r38
        L_0x01c1:
            if (r28 == 0) goto L_0x01e7
            r13 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.startReplaceableGroup(r13)
            java.lang.Object r13 = r5.rememberedValue()
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r14 = r14.getEmpty()
            if (r13 != r14) goto L_0x01dc
            androidx.compose.foundation.interaction.MutableInteractionSource r13 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r5.updateRememberedValue(r13)
        L_0x01dc:
            r5.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r13 = (androidx.compose.foundation.interaction.MutableInteractionSource) r13
            r29 = r13
            r13 = r6
            r6 = r29
            goto L_0x01ea
        L_0x01e7:
            r13 = r6
            r6 = r39
        L_0x01ea:
            r5.endDefaults()
            boolean r14 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r14 == 0) goto L_0x01fc
            r14 = -1
            java.lang.String r15 = "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)"
            r1 = -663510974(0xffffffffd873a042, float:-1.07147851E15)
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r13, r14, r15)
        L_0x01fc:
            androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1 r1 = new androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
            r34 = r1
            r35 = r8
            r36 = r31
            r37 = r13
            r38 = r9
            r39 = r7
            r40 = r33
            r34.<init>(r35, r36, r37, r38, r39, r40)
            r14 = -1419576100(0xffffffffab62fcdc, float:-8.064224E-13)
            r15 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r5, r14, r15, r1)
            if (r9 == 0) goto L_0x0226
            androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1 r14 = new androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
            r14.<init>(r8, r2, r13, r9)
            r3 = 1644987592(0x620c84c8, float:6.48028E20)
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r5, r3, r15, r14)
            goto L_0x0227
        L_0x0226:
            r3 = 0
        L_0x0227:
            r14 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.startReplaceableGroup(r14)
            java.lang.Object r14 = r5.rememberedValue()
            androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r15.getEmpty()
            r21 = r9
            r9 = 0
            if (r14 != r4) goto L_0x024a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r9 = 0
            r14 = 2
            androidx.compose.runtime.MutableState r4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r4, r9, r14, r9)
            r5.updateRememberedValue(r4)
            r14 = r4
        L_0x024a:
            r5.endReplaceableGroup()
            androidx.compose.runtime.MutableState r14 = (androidx.compose.runtime.MutableState) r14
            androidx.compose.ui.semantics.Role$Companion r4 = androidx.compose.p002ui.semantics.Role.Companion
            int r4 = r4.m37820getTabo7Vup1c()
            r9 = 0
            androidx.compose.ui.semantics.Role r4 = androidx.compose.p002ui.semantics.Role.m37807boximpl(r4)
            r34 = r10
            r35 = r31
            r36 = r6
            r37 = r9
            r38 = r0
            r39 = r4
            r40 = r32
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.selection.SelectableKt.m33587selectableO2vRcR0(r34, r35, r36, r37, r38, r39, r40)
            r9 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r19 = 2
            r20 = 0
            r34 = r30
            r35 = r4
            r36 = r9
            r37 = r18
            r38 = r19
            r39 = r20
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.RowScope.weight$default(r34, r35, r36, r37, r38, r39)
            r9 = 1157296644(0x44faf204, float:2007.563)
            r5.startReplaceableGroup(r9)
            boolean r9 = r5.changed((java.lang.Object) r14)
            r22 = r0
            java.lang.Object r0 = r5.rememberedValue()
            if (r9 != 0) goto L_0x029c
            java.lang.Object r9 = r15.getEmpty()
            if (r0 != r9) goto L_0x02a4
        L_0x029c:
            androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1 r0 = new androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
            r0.<init>(r14)
            r5.updateRememberedValue(r0)
        L_0x02a4:
            r5.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.layout.OnRemeasuredModifierKt.onSizeChanged(r4, r0)
            androidx.compose.ui.Alignment$Companion r4 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r4 = r4.getCenter()
            r9 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r5.startReplaceableGroup(r9)
            r9 = 6
            r23 = r10
            r10 = 0
            androidx.compose.ui.layout.MeasurePolicy r4 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r4, r10, r5, r9)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5.startReplaceableGroup(r10)
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r10 = r5.consume(r10)
            androidx.compose.ui.unit.Density r10 = (androidx.compose.p002ui.unit.Density) r10
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r9 = r5.consume(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p002ui.unit.LayoutDirection) r9
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r11 = r5.consume(r11)
            androidx.compose.ui.platform.ViewConfiguration r11 = (androidx.compose.p002ui.platform.ViewConfiguration) r11
            androidx.compose.ui.node.ComposeUiNode$Companion r18 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r12 = r18.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            r24 = r7
            androidx.compose.runtime.Applier r7 = r5.getApplier()
            boolean r7 = r7 instanceof androidx.compose.runtime.Applier
            if (r7 != 0) goto L_0x02fc
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x02fc:
            r5.startReusableNode()
            boolean r7 = r5.getInserting()
            if (r7 == 0) goto L_0x0309
            r5.createNode(r12)
            goto L_0x030c
        L_0x0309:
            r5.useNode()
        L_0x030c:
            r5.disableReusing()
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.m35292constructorimpl(r5)
            of.o r12 = r18.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r7, r4, r12)
            of.o r4 = r18.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r7, r10, r4)
            of.o r4 = r18.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r7, r9, r4)
            of.o r4 = r18.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r7, r11, r4)
            r5.enableReusing()
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r5)
            androidx.compose.runtime.SkippableUpdater r4 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r4)
            r7 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r0.invoke(r4, r5, r9)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r5.startReplaceableGroup(r0)
            r0 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r5.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            r0 = 1796243068(0x6b107e7c, float:1.7468262E26)
            r5.startReplaceableGroup(r0)
            if (r2 == 0) goto L_0x035b
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x035c
        L_0x035b:
            r0 = 0
        L_0x035c:
            r4 = 100
            r7 = 6
            r9 = 0
            r10 = 0
            androidx.compose.animation.core.TweenSpec r4 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r4, r9, r10, r7, r10)
            r7 = 0
            r9 = 0
            r10 = 48
            r11 = 12
            r34 = r0
            r35 = r4
            r36 = r7
            r37 = r9
            r38 = r5
            r39 = r10
            r40 = r11
            androidx.compose.runtime.State r0 = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(r34, r35, r36, r37, r38, r39, r40)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r4 = r5.consume(r4)
            androidx.compose.ui.unit.Density r4 = (androidx.compose.p002ui.unit.Density) r4
            androidx.compose.material3.tokens.NavigationBarTokens r7 = androidx.compose.material3.tokens.NavigationBarTokens.INSTANCE
            float r7 = r7.m35024getActiveIndicatorWidthD9Ej5fM()
            int r7 = r4.m38443roundToPx0680j_4(r7)
            int r9 = m34497NavigationBarItem$lambda3(r14)
            int r9 = r9 - r7
            float r7 = (float) r9
            r9 = 2
            float r9 = (float) r9
            float r7 = r7 / r9
            float r9 = IndicatorVerticalOffset
            float r4 = r4.m38449toPx0680j_4(r9)
            long r9 = androidx.compose.p002ui.geometry.OffsetKt.Offset(r7, r4)
            ef.v r4 = p336ef.C11921v.f18618a
            androidx.compose.ui.geometry.Offset r4 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r9)
            r7 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r5.startReplaceableGroup(r7)
            boolean r7 = r5.changed((java.lang.Object) r6)
            boolean r4 = r5.changed((java.lang.Object) r4)
            r4 = r4 | r7
            java.lang.Object r7 = r5.rememberedValue()
            if (r4 != 0) goto L_0x03c5
            java.lang.Object r4 = r15.getEmpty()
            if (r7 != r4) goto L_0x03ce
        L_0x03c5:
            androidx.compose.material3.MappedInteractionSource r7 = new androidx.compose.material3.MappedInteractionSource
            r4 = 0
            r7.<init>(r6, r9, r4)
            r5.updateRememberedValue(r7)
        L_0x03ce:
            r5.endReplaceableGroup()
            androidx.compose.material3.MappedInteractionSource r7 = (androidx.compose.material3.MappedInteractionSource) r7
            androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1 r4 = new androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1
            r4.<init>(r7)
            r7 = 691730997(0x293afa35, float:4.1517317E-14)
            r9 = 1
            androidx.compose.runtime.internal.ComposableLambda r4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r5, r7, r9, r4)
            androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1 r7 = new androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1
            r7.<init>(r8, r0)
            r10 = -474426875(0xffffffffe3b8d205, float:-6.818669E21)
            androidx.compose.runtime.internal.ComposableLambda r14 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r5, r10, r9, r7)
            float r18 = m34499NavigationBarItem$lambda9$lambda6(r0)
            int r0 = r13 >> 9
            r7 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r7
            r0 = r0 | 438(0x1b6, float:6.14E-43)
            r13 = r4
            r15 = r1
            r16 = r3
            r17 = r24
            r19 = r5
            r20 = r0
            NavigationBarItemBaselineLayout(r13, r14, r15, r16, r17, r18, r19, r20)
            r5.endReplaceableGroup()
            r5.endReplaceableGroup()
            r5.endReplaceableGroup()
            r5.endNode()
            r5.endReplaceableGroup()
            r5.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0420
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0420:
            r10 = r6
            r9 = r8
            r7 = r21
            r6 = r22
            r8 = r24
        L_0x0428:
            androidx.compose.runtime.ScopeUpdateScope r13 = r5.endRestartGroup()
            if (r13 != 0) goto L_0x042f
            goto L_0x0446
        L_0x042f:
            androidx.compose.material3.NavigationBarKt$NavigationBarItem$4 r14 = new androidx.compose.material3.NavigationBarKt$NavigationBarItem$4
            r0 = r14
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r23
            r11 = r41
            r12 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.updateScope(r14)
        L_0x0446:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.NavigationBarItem(androidx.compose.foundation.layout.RowScope, boolean, of.a, of.o, androidx.compose.ui.Modifier, boolean, of.o, boolean, androidx.compose.material3.NavigationBarItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: NavigationBarItem$lambda-3  reason: not valid java name */
    private static final int m34497NavigationBarItem$lambda3(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: NavigationBarItem$lambda-4  reason: not valid java name */
    public static final void m34498NavigationBarItem$lambda4(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: NavigationBarItem$lambda-9$lambda-6  reason: not valid java name */
    public static final float m34499NavigationBarItem$lambda9$lambda6(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void NavigationBarItemBaselineLayout(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, boolean z, float f, Composer composer, int i) {
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
        Composer startRestartGroup = composer.startRestartGroup(591111291);
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
                ComposerKt.traceEventStart(591111291, i2, -1, "androidx.compose.material3.NavigationBarItemBaselineLayout (NavigationBar.kt:381)");
            }
            NavigationBarKt$NavigationBarItemBaselineLayout$2 navigationBarKt$NavigationBarItemBaselineLayout$2 = new NavigationBarKt$NavigationBarItemBaselineLayout$2(f3, oVar8, z2);
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
            Composer r7 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r7, navigationBarKt$NavigationBarItemBaselineLayout$2, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r7, density, companion2.getSetDensity());
            Updater.m35299setimpl(r7, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r7, viewConfiguration, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(1170727090);
            oVar5.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.startReplaceableGroup(-311736667);
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
            startRestartGroup.startReplaceableGroup(-1237554120);
            oVar7.invoke(startRestartGroup, Integer.valueOf((i2 >> 6) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (oVar8 != null) {
                Modifier layoutId2 = LayoutIdKt.layoutId(companion, LabelLayoutIdTag);
                if (z2) {
                    f2 = 1.0f;
                } else {
                    f2 = f3;
                }
                Modifier r12 = PaddingKt.m33270paddingVpY3zN4$default(AlphaKt.alpha(layoutId2, f2), C1232Dp.m38468constructorimpl(NavigationBarItemHorizontalPadding / ((float) 2)), 0.0f, 2, (Object) null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                C13074a<ComposeUiNode> constructor3 = companion2.getConstructor();
                C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf3 = LayoutKt.materializerOf(r12);
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
                Composer r13 = Updater.m35292constructorimpl(startRestartGroup);
                Updater.m35299setimpl(r13, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m35299setimpl(r13, density3, companion2.getSetDensity());
                Updater.m35299setimpl(r13, layoutDirection3, companion2.getSetLayoutDirection());
                Updater.m35299setimpl(r13, viewConfiguration3, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                startRestartGroup.startReplaceableGroup(359627658);
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
            endRestartGroup.updateScope(new NavigationBarKt$NavigationBarItemBaselineLayout$3(oVar, oVar2, oVar3, oVar4, z, f, i));
        }
    }

    public static final float getNavigationBarItemHorizontalPadding() {
        return NavigationBarItemHorizontalPadding;
    }

    public static final float getNavigationBarItemVerticalPadding() {
        return NavigationBarItemVerticalPadding;
    }

    /* access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4  reason: not valid java name */
    public static final MeasureResult m34504placeIconX9ElhV4(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j) {
        int r10 = Constraints.m38412getMaxWidthimpl(j);
        int r11 = Constraints.m38411getMaxHeightimpl(j);
        return MeasureScope.layout$default(measureScope, r10, r11, (Map) null, new NavigationBarKt$placeIcon$1(placeable3, placeable, (r10 - placeable.getWidth()) / 2, (r11 - placeable.getHeight()) / 2, placeable2, (r10 - placeable2.getWidth()) / 2, (r11 - placeable2.getHeight()) / 2, r10, r11), 4, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0  reason: not valid java name */
    public static final MeasureResult m34505placeLabelAndIconzUg2_y0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j, boolean z, float f) {
        int i;
        MeasureScope measureScope2 = measureScope;
        int r16 = Constraints.m38411getMaxHeightimpl(j);
        float f2 = NavigationBarItemVerticalPadding;
        int height = (r16 - placeable.getHeight()) - measureScope2.m38443roundToPx0680j_4(f2);
        int r10 = measureScope2.m38443roundToPx0680j_4(f2);
        if (z) {
            i = r10;
        } else {
            i = (r16 - placeable2.getHeight()) / 2;
        }
        int c = C13265c.m30134c(((float) (i - r10)) * (((float) 1) - f));
        int r17 = Constraints.m38412getMaxWidthimpl(j);
        return MeasureScope.layout$default(measureScope, r17, r16, (Map) null, new NavigationBarKt$placeLabelAndIcon$1(placeable4, z, f, placeable, (r17 - placeable.getWidth()) / 2, height, c, placeable2, (r17 - placeable2.getWidth()) / 2, r10, placeable3, (r17 - placeable3.getWidth()) / 2, r10 - measureScope2.m38443roundToPx0680j_4(IndicatorVerticalPadding), r17, measureScope), 4, (Object) null);
    }
}
