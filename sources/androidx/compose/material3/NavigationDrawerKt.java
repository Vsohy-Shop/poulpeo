package androidx.compose.material3;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.adjust.sdk.Constants;
import com.rmn.api.p322v2.main.oauth.OAuthErrorCodes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: NavigationDrawer.kt */
public final class NavigationDrawerKt {
    /* access modifiers changed from: private */
    public static final TweenSpec<Float> AnimationSpec = new TweenSpec(256, 0, (Easing) null, 6, (DefaultConstructorMarker) null);
    private static final float DrawerVelocityThreshold = C1232Dp.m38468constructorimpl((float) Constants.MINIMAL_ERROR_STATUS_CODE);
    /* access modifiers changed from: private */
    public static final float MinimumDrawerWidth = C1232Dp.m38468constructorimpl((float) OAuthErrorCodes.ERR_OAUTH_HEADERS);

    /* JADX WARNING: Removed duplicated region for block: B:121:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f6  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: DismissibleDrawerSheet-afqeVBk  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34511DismissibleDrawerSheetafqeVBk(androidx.compose.p002ui.Modifier r25, androidx.compose.p002ui.graphics.Shape r26, long r27, long r29, float r31, androidx.compose.foundation.layout.WindowInsets r32, p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r12 = r33
            r13 = r35
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            r0 = -588600583(0xffffffffdceaaaf9, float:-5.28425048E17)
            r1 = r34
            androidx.compose.runtime.Composer r14 = r1.startRestartGroup(r0)
            r1 = r36 & 1
            if (r1 == 0) goto L_0x001c
            r2 = r13 | 6
            r3 = r2
            r2 = r25
            goto L_0x0030
        L_0x001c:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x002d
            r2 = r25
            boolean r3 = r14.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x002a
            r3 = 4
            goto L_0x002b
        L_0x002a:
            r3 = 2
        L_0x002b:
            r3 = r3 | r13
            goto L_0x0030
        L_0x002d:
            r2 = r25
            r3 = r13
        L_0x0030:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x0037
            r3 = r3 | 48
            goto L_0x004a
        L_0x0037:
            r5 = r13 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r26
            boolean r6 = r14.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0046
            r6 = 32
            goto L_0x0048
        L_0x0046:
            r6 = 16
        L_0x0048:
            r3 = r3 | r6
            goto L_0x004c
        L_0x004a:
            r5 = r26
        L_0x004c:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0065
            r6 = r36 & 4
            if (r6 != 0) goto L_0x005f
            r6 = r27
            boolean r8 = r14.changed((long) r6)
            if (r8 == 0) goto L_0x0061
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x005f:
            r6 = r27
        L_0x0061:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r3 = r3 | r8
            goto L_0x0067
        L_0x0065:
            r6 = r27
        L_0x0067:
            r8 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0080
            r8 = r36 & 8
            if (r8 != 0) goto L_0x007a
            r8 = r29
            boolean r10 = r14.changed((long) r8)
            if (r10 == 0) goto L_0x007c
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007a:
            r8 = r29
        L_0x007c:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r3 = r3 | r10
            goto L_0x0082
        L_0x0080:
            r8 = r29
        L_0x0082:
            r10 = r36 & 16
            r11 = 57344(0xe000, float:8.0356E-41)
            if (r10 == 0) goto L_0x008c
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x008c:
            r15 = r13 & r11
            if (r15 != 0) goto L_0x00a0
            r15 = r31
            boolean r16 = r14.changed((float) r15)
            if (r16 == 0) goto L_0x009b
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r3 = r3 | r16
            goto L_0x00a2
        L_0x00a0:
            r15 = r31
        L_0x00a2:
            r16 = 458752(0x70000, float:6.42848E-40)
            r17 = r13 & r16
            if (r17 != 0) goto L_0x00bc
            r17 = r36 & 32
            r11 = r32
            if (r17 != 0) goto L_0x00b7
            boolean r17 = r14.changed((java.lang.Object) r11)
            if (r17 == 0) goto L_0x00b7
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r3 = r3 | r17
            goto L_0x00be
        L_0x00bc:
            r11 = r32
        L_0x00be:
            r17 = r36 & 64
            r18 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00c9
            r17 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c6:
            r3 = r3 | r17
            goto L_0x00d9
        L_0x00c9:
            r17 = r13 & r18
            if (r17 != 0) goto L_0x00d9
            boolean r17 = r14.changed((java.lang.Object) r12)
            if (r17 == 0) goto L_0x00d6
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c6
        L_0x00d6:
            r17 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c6
        L_0x00d9:
            r17 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r3 & r17
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r2) goto L_0x00f6
            boolean r0 = r14.getSkipping()
            if (r0 != 0) goto L_0x00ea
            goto L_0x00f6
        L_0x00ea:
            r14.skipToGroupEnd()
            r1 = r25
            r2 = r5
            r3 = r6
            r5 = r8
            r8 = r11
            r7 = r15
            goto L_0x01d1
        L_0x00f6:
            r14.startDefaults()
            r0 = r13 & 1
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x0128
            boolean r0 = r14.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0107
            goto L_0x0128
        L_0x0107:
            r14.skipToGroupEnd()
            r0 = r36 & 4
            if (r0 == 0) goto L_0x0110
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0110:
            r0 = r36 & 8
            if (r0 == 0) goto L_0x0116
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0116:
            r0 = r36 & 32
            if (r0 == 0) goto L_0x011b
            r3 = r3 & r2
        L_0x011b:
            r17 = r5
            r19 = r6
            r21 = r8
            r24 = r11
            r23 = r15
            r15 = r25
            goto L_0x017e
        L_0x0128:
            if (r1 == 0) goto L_0x012d
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x012f
        L_0x012d:
            r0 = r25
        L_0x012f:
            if (r4 == 0) goto L_0x0136
            androidx.compose.ui.graphics.Shape r1 = androidx.compose.p002ui.graphics.RectangleShapeKt.getRectangleShape()
            r5 = r1
        L_0x0136:
            r1 = r36 & 4
            r4 = 6
            if (r1 == 0) goto L_0x0147
            androidx.compose.material3.MaterialTheme r1 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.ColorScheme r1 = r1.getColorScheme(r14, r4)
            long r6 = r1.m34323getSurface0d7_KjU()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0147:
            r1 = r36 & 8
            if (r1 == 0) goto L_0x0156
            int r1 = r3 >> 6
            r1 = r1 & 14
            long r8 = androidx.compose.material3.ColorSchemeKt.m34359contentColorForek8zF_U(r6, r14, r1)
            r1 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r3 = r1
        L_0x0156:
            if (r10 == 0) goto L_0x015f
            androidx.compose.material3.DrawerDefaults r1 = androidx.compose.material3.DrawerDefaults.INSTANCE
            float r1 = r1.m34400getDismissibleDrawerElevationD9Ej5fM()
            r15 = r1
        L_0x015f:
            r1 = r36 & 32
            if (r1 == 0) goto L_0x0173
            androidx.compose.material3.DrawerDefaults r1 = androidx.compose.material3.DrawerDefaults.INSTANCE
            androidx.compose.foundation.layout.WindowInsets r1 = r1.getWindowInsets(r14, r4)
            r3 = r3 & r2
            r24 = r1
            r17 = r5
            r19 = r6
            r21 = r8
            goto L_0x017b
        L_0x0173:
            r17 = r5
            r19 = r6
            r21 = r8
            r24 = r11
        L_0x017b:
            r23 = r15
            r15 = r0
        L_0x017e:
            r14.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0190
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:496)"
            r2 = -588600583(0xffffffffdceaaaf9, float:-5.28425048E17)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r3, r0, r1)
        L_0x0190:
            int r0 = r3 >> 15
            r0 = r0 & 14
            int r1 = r3 << 3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r16
            r0 = r0 | r1
            r1 = r3 & r18
            r10 = r0 | r1
            r11 = 0
            r0 = r24
            r1 = r15
            r2 = r17
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r33
            r9 = r14
            m34512DrawerSheetvywBR7E(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01c6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01c6:
            r1 = r15
            r2 = r17
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r24
        L_0x01d1:
            androidx.compose.runtime.ScopeUpdateScope r14 = r14.endRestartGroup()
            if (r14 != 0) goto L_0x01d8
            goto L_0x01e7
        L_0x01d8:
            androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$1 r15 = new androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$1
            r0 = r15
            r9 = r33
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r14.updateScope(r15)
        L_0x01e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m34511DismissibleDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b3  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DismissibleNavigationDrawer(p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r28, androidx.compose.p002ui.Modifier r29, androidx.compose.material3.DrawerState r30, boolean r31, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r1 = r28
            r5 = r32
            r6 = r34
            java.lang.String r0 = "drawerContent"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            r0 = 398812198(0x17c56426, float:1.2756108E-24)
            r2 = r33
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            r3 = r35 & 1
            r4 = 2
            if (r3 == 0) goto L_0x0021
            r3 = r6 | 6
            goto L_0x0031
        L_0x0021:
            r3 = r6 & 14
            if (r3 != 0) goto L_0x0030
            boolean r3 = r2.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x002d
            r3 = 4
            goto L_0x002e
        L_0x002d:
            r3 = r4
        L_0x002e:
            r3 = r3 | r6
            goto L_0x0031
        L_0x0030:
            r3 = r6
        L_0x0031:
            r7 = r35 & 2
            if (r7 == 0) goto L_0x0038
            r3 = r3 | 48
            goto L_0x004b
        L_0x0038:
            r8 = r6 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x004b
            r8 = r29
            boolean r9 = r2.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0047
            r9 = 32
            goto L_0x0049
        L_0x0047:
            r9 = 16
        L_0x0049:
            r3 = r3 | r9
            goto L_0x004d
        L_0x004b:
            r8 = r29
        L_0x004d:
            r9 = r6 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0066
            r9 = r35 & 4
            if (r9 != 0) goto L_0x0060
            r9 = r30
            boolean r10 = r2.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x0062
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0060:
            r9 = r30
        L_0x0062:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r3 = r3 | r10
            goto L_0x0068
        L_0x0066:
            r9 = r30
        L_0x0068:
            r10 = r35 & 8
            if (r10 == 0) goto L_0x006f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r11 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0082
            r11 = r31
            boolean r12 = r2.changed((boolean) r11)
            if (r12 == 0) goto L_0x007e
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r3 = r3 | r12
            goto L_0x0084
        L_0x0082:
            r11 = r31
        L_0x0084:
            r12 = r35 & 16
            if (r12 == 0) goto L_0x008b
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x008b:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r6
            if (r12 != 0) goto L_0x009d
            boolean r12 = r2.changed((java.lang.Object) r5)
            if (r12 == 0) goto L_0x009a
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r3 = r3 | r12
        L_0x009d:
            r12 = 46811(0xb6db, float:6.5596E-41)
            r12 = r12 & r3
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r12 != r13) goto L_0x00b3
            boolean r12 = r2.getSkipping()
            if (r12 != 0) goto L_0x00ac
            goto L_0x00b3
        L_0x00ac:
            r2.skipToGroupEnd()
            r3 = r9
            r4 = r11
            goto L_0x0470
        L_0x00b3:
            r2.startDefaults()
            r12 = r6 & 1
            r13 = 0
            r14 = 6
            r15 = 1
            if (r12 == 0) goto L_0x00ce
            boolean r12 = r2.getDefaultsInvalid()
            if (r12 == 0) goto L_0x00c4
            goto L_0x00ce
        L_0x00c4:
            r2.skipToGroupEnd()
            r7 = r35 & 4
            if (r7 == 0) goto L_0x00e3
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00e3
        L_0x00ce:
            if (r7 == 0) goto L_0x00d3
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.p002ui.Modifier.Companion
            r8 = r7
        L_0x00d3:
            r7 = r35 & 4
            if (r7 == 0) goto L_0x00e0
            androidx.compose.material3.DrawerValue r7 = androidx.compose.material3.DrawerValue.Closed
            androidx.compose.material3.DrawerState r7 = rememberDrawerState(r7, r13, r2, r14, r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r9 = r7
        L_0x00e0:
            if (r10 == 0) goto L_0x00e3
            r11 = r15
        L_0x00e3:
            r2.endDefaults()
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x00f2
            r7 = -1
            java.lang.String r10 = "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:346)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r3, r7, r10)
        L_0x00f2:
            androidx.compose.material3.tokens.NavigationDrawerTokens r0 = androidx.compose.material3.tokens.NavigationDrawerTokens.INSTANCE
            float r0 = r0.m35030getContainerWidthD9Ej5fM()
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r7 = r2.consume(r7)
            androidx.compose.ui.unit.Density r7 = (androidx.compose.p002ui.unit.Density) r7
            float r0 = r7.m38449toPx0680j_4(r0)
            float r0 = -r0
            r7 = 773894976(0x2e20b340, float:3.6538994E-11)
            r2.startReplaceableGroup(r7)
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.startReplaceableGroup(r7)
            java.lang.Object r7 = r2.rememberedValue()
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r7 != r10) goto L_0x012e
            hf.h r7 = p355hf.C12085h.f18916b
            yf.l0 r7 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r7, r2)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r10 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r10.<init>(r7)
            r2.updateRememberedValue(r10)
            r7 = r10
        L_0x012e:
            r2.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r7 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r7
            yf.l0 r7 = r7.getCoroutineScope()
            r2.endReplaceableGroup()
            androidx.compose.material3.Strings$Companion r10 = androidx.compose.material3.Strings.Companion
            int r10 = r10.m34591getNavigationMenuadMyvUU()
            java.lang.String r10 = androidx.compose.material3.Strings_androidKt.m34594getStringNWtq28(r10, r2, r14)
            ef.l[] r4 = new p336ef.C11906l[r4]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.material3.DrawerValue r12 = androidx.compose.material3.DrawerValue.Closed
            ef.l r0 = p336ef.C11915r.m25707a(r0, r12)
            r12 = 0
            r4[r12] = r0
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.material3.DrawerValue r14 = androidx.compose.material3.DrawerValue.Open
            ef.l r0 = p336ef.C11915r.m25707a(r0, r14)
            r4[r15] = r0
            java.util.Map r18 = kotlin.collections.C12716r0.m28419j(r4)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r0 = r2.consume(r0)
            androidx.compose.ui.unit.LayoutDirection r4 = androidx.compose.p002ui.unit.LayoutDirection.Rtl
            if (r0 != r4) goto L_0x0173
            r21 = r15
            goto L_0x0175
        L_0x0173:
            r21 = r12
        L_0x0175:
            androidx.compose.material3.SwipeableState r17 = r9.getSwipeableState$material3_release()
            androidx.compose.foundation.gestures.Orientation r19 = androidx.compose.foundation.gestures.Orientation.Horizontal
            float r25 = DrawerVelocityThreshold
            r22 = 0
            androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$1 r23 = androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$1.INSTANCE
            r24 = 0
            r26 = 32
            r27 = 0
            r16 = r8
            r20 = r11
            androidx.compose.ui.Modifier r0 = androidx.compose.material3.SwipeableKt.m34613swipeablepPrIpRY$default(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r4 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r4)
            androidx.compose.ui.Alignment$Companion r14 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r4 = r14.getTopStart()
            androidx.compose.ui.layout.MeasurePolicy r4 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r4, r12, r2, r12)
            r13 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r13)
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r15 = r2.consume(r15)
            androidx.compose.ui.unit.Density r15 = (androidx.compose.p002ui.unit.Density) r15
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r13 = r2.consume(r13)
            androidx.compose.ui.unit.LayoutDirection r13 = (androidx.compose.p002ui.unit.LayoutDirection) r13
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r12 = r2.consume(r12)
            androidx.compose.ui.platform.ViewConfiguration r12 = (androidx.compose.p002ui.platform.ViewConfiguration) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r6 = r17.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            r18 = r8
            androidx.compose.runtime.Applier r8 = r2.getApplier()
            boolean r8 = r8 instanceof androidx.compose.runtime.Applier
            if (r8 != 0) goto L_0x01da
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x01da:
            r2.startReusableNode()
            boolean r8 = r2.getInserting()
            if (r8 == 0) goto L_0x01e7
            r2.createNode(r6)
            goto L_0x01ea
        L_0x01e7:
            r2.useNode()
        L_0x01ea:
            r2.disableReusing()
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.m35292constructorimpl(r2)
            of.o r8 = r17.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r4, r8)
            of.o r4 = r17.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r15, r4)
            of.o r4 = r17.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r13, r4)
            of.o r4 = r17.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r12, r4)
            r2.enableReusing()
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r4 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r4)
            r6 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r0.invoke(r4, r2, r8)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r4 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r2.startReplaceableGroup(r4)
            androidx.compose.foundation.layout.BoxScopeInstance r6 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            r6 = 254773804(0xf2f8a2c, float:8.654777E-30)
            r2.startReplaceableGroup(r6)
            androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2 r6 = new androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2
            r6.<init>(r9)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r8)
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r12 = r2.consume(r12)
            androidx.compose.ui.unit.Density r12 = (androidx.compose.p002ui.unit.Density) r12
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r13 = r2.consume(r13)
            androidx.compose.ui.unit.LayoutDirection r13 = (androidx.compose.p002ui.unit.LayoutDirection) r13
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r15 = r2.consume(r15)
            androidx.compose.ui.platform.ViewConfiguration r15 = (androidx.compose.p002ui.platform.ViewConfiguration) r15
            of.a r4 = r17.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r8)
            r21 = r11
            androidx.compose.runtime.Applier r11 = r2.getApplier()
            boolean r11 = r11 instanceof androidx.compose.runtime.Applier
            if (r11 != 0) goto L_0x0274
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0274:
            r2.startReusableNode()
            boolean r11 = r2.getInserting()
            if (r11 == 0) goto L_0x0281
            r2.createNode(r4)
            goto L_0x0284
        L_0x0281:
            r2.useNode()
        L_0x0284:
            r2.disableReusing()
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.Updater.m35292constructorimpl(r2)
            of.o r11 = r17.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r4, r6, r11)
            of.o r6 = r17.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r4, r12, r6)
            of.o r6 = r17.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r4, r13, r6)
            of.o r6 = r17.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r4, r15, r6)
            r2.enableReusing()
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r4 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r4)
            r6 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r0.invoke(r4, r2, r11)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r0 = 1983447907(0x76390363, float:9.381285E32)
            r2.startReplaceableGroup(r0)
            androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1 r0 = new androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1
            r0.<init>(r10, r9, r7)
            r4 = 0
            r7 = 1
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.semantics.SemanticsModifierKt.semantics$default(r8, r6, r0, r7, r4)
            r4 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r4)
            androidx.compose.ui.Alignment r4 = r14.getTopStart()
            androidx.compose.ui.layout.MeasurePolicy r4 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r4, r6, r2, r6)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r6)
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r6 = r2.consume(r6)
            androidx.compose.ui.unit.Density r6 = (androidx.compose.p002ui.unit.Density) r6
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r7 = r2.consume(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p002ui.unit.LayoutDirection) r7
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r10 = r2.consume(r10)
            androidx.compose.ui.platform.ViewConfiguration r10 = (androidx.compose.p002ui.platform.ViewConfiguration) r10
            of.a r11 = r17.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r12 = r2.getApplier()
            boolean r12 = r12 instanceof androidx.compose.runtime.Applier
            if (r12 != 0) goto L_0x0316
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0316:
            r2.startReusableNode()
            boolean r12 = r2.getInserting()
            if (r12 == 0) goto L_0x0323
            r2.createNode(r11)
            goto L_0x0326
        L_0x0323:
            r2.useNode()
        L_0x0326:
            r2.disableReusing()
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.m35292constructorimpl(r2)
            of.o r12 = r17.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r4, r12)
            of.o r4 = r17.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r6, r4)
            of.o r4 = r17.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r7, r4)
            of.o r4 = r17.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r11, r10, r4)
            r2.enableReusing()
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r4 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r4)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r0.invoke(r4, r2, r7)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r0 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r2.startReplaceableGroup(r0)
            r0 = -170061591(0xfffffffff5dd10e9, float:-5.6046904E32)
            r2.startReplaceableGroup(r0)
            r0 = r3 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.invoke(r2, r0)
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r0 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r0)
            androidx.compose.ui.Alignment r0 = r14.getTopStart()
            r4 = 0
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r0, r4, r2, r4)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r4)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r4 = r2.consume(r4)
            androidx.compose.ui.unit.Density r4 = (androidx.compose.p002ui.unit.Density) r4
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r6 = r2.consume(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p002ui.unit.LayoutDirection) r6
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r7 = r2.consume(r7)
            androidx.compose.ui.platform.ViewConfiguration r7 = (androidx.compose.p002ui.platform.ViewConfiguration) r7
            of.a r10 = r17.getConstructor()
            of.p r8 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r8)
            androidx.compose.runtime.Applier r11 = r2.getApplier()
            boolean r11 = r11 instanceof androidx.compose.runtime.Applier
            if (r11 != 0) goto L_0x03cf
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x03cf:
            r2.startReusableNode()
            boolean r11 = r2.getInserting()
            if (r11 == 0) goto L_0x03dc
            r2.createNode(r10)
            goto L_0x03df
        L_0x03dc:
            r2.useNode()
        L_0x03df:
            r2.disableReusing()
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.m35292constructorimpl(r2)
            of.o r11 = r17.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r0, r11)
            of.o r0 = r17.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r4, r0)
            of.o r0 = r17.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r6, r0)
            of.o r0 = r17.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r7, r0)
            r2.enableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r0)
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.invoke(r0, r2, r4)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r0 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r2.startReplaceableGroup(r0)
            r0 = 115715936(0x6e5af60, float:8.6397916E-35)
            r2.startReplaceableGroup(r0)
            int r0 = r3 >> 12
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.invoke(r2, r0)
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x046b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x046b:
            r3 = r9
            r8 = r18
            r4 = r21
        L_0x0470:
            androidx.compose.runtime.ScopeUpdateScope r9 = r2.endRestartGroup()
            if (r9 != 0) goto L_0x0477
            goto L_0x0489
        L_0x0477:
            androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$3 r10 = new androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$3
            r0 = r10
            r1 = r28
            r2 = r8
            r5 = r32
            r6 = r34
            r7 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.updateScope(r10)
        L_0x0489:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.DismissibleNavigationDrawer(of.o, androidx.compose.ui.Modifier, androidx.compose.material3.DrawerState, boolean, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ec  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: DrawerSheet-vywBR7E  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34512DrawerSheetvywBR7E(androidx.compose.foundation.layout.WindowInsets r26, androidx.compose.p002ui.Modifier r27, androidx.compose.p002ui.graphics.Shape r28, long r29, long r31, float r33, p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r1 = r26
            r9 = r34
            r10 = r36
            r0 = 175072821(0xa6f6635, float:1.15266544E-32)
            r2 = r35
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            r3 = r37 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r10 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r10
            goto L_0x0026
        L_0x0025:
            r3 = r10
        L_0x0026:
            r4 = r37 & 2
            if (r4 == 0) goto L_0x002d
            r3 = r3 | 48
            goto L_0x0040
        L_0x002d:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0040
            r5 = r27
            boolean r6 = r2.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x003c
            r6 = 32
            goto L_0x003e
        L_0x003c:
            r6 = 16
        L_0x003e:
            r3 = r3 | r6
            goto L_0x0042
        L_0x0040:
            r5 = r27
        L_0x0042:
            r6 = r37 & 4
            if (r6 == 0) goto L_0x0049
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x0049:
            r7 = r10 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x005c
            r7 = r28
            boolean r8 = r2.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0058
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r3 = r3 | r8
            goto L_0x005e
        L_0x005c:
            r7 = r28
        L_0x005e:
            r8 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0075
            r8 = r37 & 8
            r11 = r29
            if (r8 != 0) goto L_0x0071
            boolean r8 = r2.changed((long) r11)
            if (r8 == 0) goto L_0x0071
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x0071:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r3 = r3 | r8
            goto L_0x0077
        L_0x0075:
            r11 = r29
        L_0x0077:
            r8 = 57344(0xe000, float:8.0356E-41)
            r13 = r10 & r8
            if (r13 != 0) goto L_0x0093
            r13 = r37 & 16
            if (r13 != 0) goto L_0x008d
            r13 = r31
            boolean r15 = r2.changed((long) r13)
            if (r15 == 0) goto L_0x008f
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008d:
            r13 = r31
        L_0x008f:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r3 = r3 | r15
            goto L_0x0095
        L_0x0093:
            r13 = r31
        L_0x0095:
            r15 = r37 & 32
            if (r15 == 0) goto L_0x00a0
            r16 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r16
            r8 = r33
            goto L_0x00b5
        L_0x00a0:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r10 & r16
            r8 = r33
            if (r16 != 0) goto L_0x00b5
            boolean r16 = r2.changed((float) r8)
            if (r16 == 0) goto L_0x00b1
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r3 = r3 | r16
        L_0x00b5:
            r16 = r37 & 64
            if (r16 == 0) goto L_0x00be
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00bb:
            r3 = r3 | r16
            goto L_0x00d0
        L_0x00be:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x00d0
            boolean r16 = r2.changed((java.lang.Object) r9)
            if (r16 == 0) goto L_0x00cd
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00bb
        L_0x00cd:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00bb
        L_0x00d0:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r3 & r16
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r5) goto L_0x00ec
            boolean r0 = r2.getSkipping()
            if (r0 != 0) goto L_0x00e1
            goto L_0x00ec
        L_0x00e1:
            r2.skipToGroupEnd()
            r3 = r27
            r4 = r7
            r6 = r11
            r24 = r13
            goto L_0x01bf
        L_0x00ec:
            r2.startDefaults()
            r0 = r10 & 1
            r5 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0112
            boolean r0 = r2.getDefaultsInvalid()
            if (r0 == 0) goto L_0x00fd
            goto L_0x0112
        L_0x00fd:
            r2.skipToGroupEnd()
            r0 = r37 & 8
            if (r0 == 0) goto L_0x0106
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0106:
            r0 = r37 & 16
            if (r0 == 0) goto L_0x010b
            r3 = r3 & r5
        L_0x010b:
            r0 = r27
            r4 = r7
            r6 = r11
            r24 = r13
            goto L_0x014e
        L_0x0112:
            if (r4 == 0) goto L_0x0117
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0119
        L_0x0117:
            r0 = r27
        L_0x0119:
            if (r6 == 0) goto L_0x0120
            androidx.compose.ui.graphics.Shape r4 = androidx.compose.p002ui.graphics.RectangleShapeKt.getRectangleShape()
            goto L_0x0121
        L_0x0120:
            r4 = r7
        L_0x0121:
            r6 = r37 & 8
            if (r6 == 0) goto L_0x0133
            androidx.compose.material3.MaterialTheme r6 = androidx.compose.material3.MaterialTheme.INSTANCE
            r7 = 6
            androidx.compose.material3.ColorScheme r6 = r6.getColorScheme(r2, r7)
            long r6 = r6.m34323getSurface0d7_KjU()
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0134
        L_0x0133:
            r6 = r11
        L_0x0134:
            r11 = r37 & 16
            if (r11 == 0) goto L_0x0142
            int r11 = r3 >> 9
            r11 = r11 & 14
            long r11 = androidx.compose.material3.ColorSchemeKt.m34359contentColorForek8zF_U(r6, r2, r11)
            r3 = r3 & r5
            goto L_0x0143
        L_0x0142:
            r11 = r13
        L_0x0143:
            if (r15 == 0) goto L_0x014c
            androidx.compose.material3.DrawerDefaults r5 = androidx.compose.material3.DrawerDefaults.INSTANCE
            float r5 = r5.m34403getPermanentDrawerElevationD9Ej5fM()
            r8 = r5
        L_0x014c:
            r24 = r11
        L_0x014e:
            r2.endDefaults()
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L_0x0160
            r5 = -1
            java.lang.String r11 = "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:559)"
            r12 = 175072821(0xa6f6635, float:1.15266544E-32)
            androidx.compose.runtime.ComposerKt.traceEventStart(r12, r3, r5, r11)
        L_0x0160:
            float r5 = MinimumDrawerWidth
            r11 = 0
            androidx.compose.material3.DrawerDefaults r12 = androidx.compose.material3.DrawerDefaults.INSTANCE
            float r12 = r12.m34401getMaximumDrawerWidthD9Ej5fM()
            r13 = 0
            r14 = 10
            r15 = 0
            r27 = r0
            r28 = r5
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.m33342sizeInqDBjuR0$default(r27, r28, r29, r30, r31, r32, r33)
            r12 = 0
            r13 = 1
            androidx.compose.ui.Modifier r11 = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(r5, r11, r13, r12)
            r18 = 0
            r19 = 0
            androidx.compose.material3.NavigationDrawerKt$DrawerSheet$1 r5 = new androidx.compose.material3.NavigationDrawerKt$DrawerSheet$1
            r5.<init>(r1, r9, r3)
            r12 = 959363152(0x392eb850, float:1.6662595E-4)
            androidx.compose.runtime.internal.ComposableLambda r20 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r12, r13, r5)
            int r3 = r3 >> 3
            r5 = r3 & 112(0x70, float:1.57E-43)
            r12 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r12
            r12 = r3 & 896(0x380, float:1.256E-42)
            r5 = r5 | r12
            r12 = r3 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r12
            r22 = r5 | r3
            r23 = 96
            r12 = r4
            r13 = r6
            r15 = r24
            r17 = r8
            r21 = r2
            androidx.compose.material3.SurfaceKt.m34602SurfaceT9BRK9s(r11, r12, r13, r15, r17, r18, r19, r20, r21, r22, r23)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x01be
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01be:
            r3 = r0
        L_0x01bf:
            androidx.compose.runtime.ScopeUpdateScope r12 = r2.endRestartGroup()
            if (r12 != 0) goto L_0x01c6
            goto L_0x01dc
        L_0x01c6:
            androidx.compose.material3.NavigationDrawerKt$DrawerSheet$2 r13 = new androidx.compose.material3.NavigationDrawerKt$DrawerSheet$2
            r0 = r13
            r1 = r26
            r2 = r3
            r3 = r4
            r4 = r6
            r6 = r24
            r9 = r34
            r10 = r36
            r11 = r37
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11)
            r12.updateScope(r13)
        L_0x01dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m34512DrawerSheetvywBR7E(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f3  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: ModalDrawerSheet-afqeVBk  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34513ModalDrawerSheetafqeVBk(androidx.compose.p002ui.Modifier r25, androidx.compose.p002ui.graphics.Shape r26, long r27, long r29, float r31, androidx.compose.foundation.layout.WindowInsets r32, p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r12 = r33
            r13 = r35
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            r0 = 1001163336(0x3bac8a48, float:0.005265508)
            r1 = r34
            androidx.compose.runtime.Composer r14 = r1.startRestartGroup(r0)
            r1 = r36 & 1
            if (r1 == 0) goto L_0x001c
            r2 = r13 | 6
            r3 = r2
            r2 = r25
            goto L_0x0030
        L_0x001c:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x002d
            r2 = r25
            boolean r3 = r14.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x002a
            r3 = 4
            goto L_0x002b
        L_0x002a:
            r3 = 2
        L_0x002b:
            r3 = r3 | r13
            goto L_0x0030
        L_0x002d:
            r2 = r25
            r3 = r13
        L_0x0030:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0049
            r4 = r36 & 2
            if (r4 != 0) goto L_0x0043
            r4 = r26
            boolean r5 = r14.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0045
            r5 = 32
            goto L_0x0047
        L_0x0043:
            r4 = r26
        L_0x0045:
            r5 = 16
        L_0x0047:
            r3 = r3 | r5
            goto L_0x004b
        L_0x0049:
            r4 = r26
        L_0x004b:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0064
            r5 = r36 & 4
            if (r5 != 0) goto L_0x005e
            r5 = r27
            boolean r7 = r14.changed((long) r5)
            if (r7 == 0) goto L_0x0060
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x005e:
            r5 = r27
        L_0x0060:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r7
            goto L_0x0066
        L_0x0064:
            r5 = r27
        L_0x0066:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007f
            r7 = r36 & 8
            if (r7 != 0) goto L_0x0079
            r7 = r29
            boolean r9 = r14.changed((long) r7)
            if (r9 == 0) goto L_0x007b
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x0079:
            r7 = r29
        L_0x007b:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r9
            goto L_0x0081
        L_0x007f:
            r7 = r29
        L_0x0081:
            r9 = r36 & 16
            r10 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x008b
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008b:
            r11 = r13 & r10
            if (r11 != 0) goto L_0x009e
            r11 = r31
            boolean r15 = r14.changed((float) r11)
            if (r15 == 0) goto L_0x009a
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r3 = r3 | r15
            goto L_0x00a0
        L_0x009e:
            r11 = r31
        L_0x00a0:
            r15 = 458752(0x70000, float:6.42848E-40)
            r16 = r13 & r15
            if (r16 != 0) goto L_0x00ba
            r16 = r36 & 32
            r15 = r32
            if (r16 != 0) goto L_0x00b5
            boolean r16 = r14.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00b5
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r3 = r3 | r16
            goto L_0x00bc
        L_0x00ba:
            r15 = r32
        L_0x00bc:
            r16 = r36 & 64
            r17 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00c7
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c4:
            r3 = r3 | r16
            goto L_0x00d7
        L_0x00c7:
            r16 = r13 & r17
            if (r16 != 0) goto L_0x00d7
            boolean r16 = r14.changed((java.lang.Object) r12)
            if (r16 == 0) goto L_0x00d4
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c4
        L_0x00d4:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c4
        L_0x00d7:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r10 = r3 & r16
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r0) goto L_0x00f3
            boolean r0 = r14.getSkipping()
            if (r0 != 0) goto L_0x00e8
            goto L_0x00f3
        L_0x00e8:
            r14.skipToGroupEnd()
            r1 = r2
            r2 = r4
            r3 = r5
            r5 = r7
            r7 = r11
            r8 = r15
            goto L_0x01dd
        L_0x00f3:
            r14.startDefaults()
            r0 = r13 & 1
            r10 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x012b
            boolean r0 = r14.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0104
            goto L_0x012b
        L_0x0104:
            r14.skipToGroupEnd()
            r0 = r36 & 2
            if (r0 == 0) goto L_0x010d
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x010d:
            r0 = r36 & 4
            if (r0 == 0) goto L_0x0113
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0113:
            r0 = r36 & 8
            if (r0 == 0) goto L_0x0119
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0119:
            r0 = r36 & 32
            if (r0 == 0) goto L_0x011e
            r3 = r3 & r10
        L_0x011e:
            r18 = r4
            r19 = r5
            r21 = r7
            r23 = r11
            r24 = r15
            r15 = r2
            goto L_0x0189
        L_0x012b:
            if (r1 == 0) goto L_0x0130
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0131
        L_0x0130:
            r0 = r2
        L_0x0131:
            r1 = r36 & 2
            r2 = 6
            if (r1 == 0) goto L_0x013f
            androidx.compose.material3.DrawerDefaults r1 = androidx.compose.material3.DrawerDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r1 = r1.getShape(r14, r2)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            r4 = r1
        L_0x013f:
            r1 = r36 & 4
            if (r1 == 0) goto L_0x014f
            androidx.compose.material3.MaterialTheme r1 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.ColorScheme r1 = r1.getColorScheme(r14, r2)
            long r5 = r1.m34323getSurface0d7_KjU()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x014f:
            r1 = r36 & 8
            if (r1 == 0) goto L_0x015e
            int r1 = r3 >> 6
            r1 = r1 & 14
            long r7 = androidx.compose.material3.ColorSchemeKt.m34359contentColorForek8zF_U(r5, r14, r1)
            r1 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r3 = r1
        L_0x015e:
            if (r9 == 0) goto L_0x0167
            androidx.compose.material3.DrawerDefaults r1 = androidx.compose.material3.DrawerDefaults.INSTANCE
            float r1 = r1.m34402getModalDrawerElevationD9Ej5fM()
            r11 = r1
        L_0x0167:
            r1 = r36 & 32
            if (r1 == 0) goto L_0x017e
            androidx.compose.material3.DrawerDefaults r1 = androidx.compose.material3.DrawerDefaults.INSTANCE
            androidx.compose.foundation.layout.WindowInsets r1 = r1.getWindowInsets(r14, r2)
            r3 = r3 & r10
            r15 = r0
            r24 = r1
            r18 = r4
            r19 = r5
            r21 = r7
            r23 = r11
            goto L_0x0189
        L_0x017e:
            r18 = r4
            r19 = r5
            r21 = r7
            r23 = r11
            r24 = r15
            r15 = r0
        L_0x0189:
            r14.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x019b
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:458)"
            r2 = 1001163336(0x3bac8a48, float:0.005265508)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r3, r0, r1)
        L_0x019b:
            int r0 = r3 >> 15
            r0 = r0 & 14
            int r1 = r3 << 3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r0 = r0 | r1
            r1 = r3 & r17
            r10 = r0 | r1
            r11 = 0
            r0 = r24
            r1 = r15
            r2 = r18
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r33
            r9 = r14
            m34512DrawerSheetvywBR7E(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01d2
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01d2:
            r1 = r15
            r2 = r18
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r24
        L_0x01dd:
            androidx.compose.runtime.ScopeUpdateScope r14 = r14.endRestartGroup()
            if (r14 != 0) goto L_0x01e4
            goto L_0x01f3
        L_0x01e4:
            androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$1 r15 = new androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$1
            r0 = r15
            r9 = r33
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r14.updateScope(r15)
        L_0x01f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m34513ModalDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00ee, code lost:
        if ((r41 & 16) != 0) goto L_0x00f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ab  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: ModalNavigationDrawer-FHprtrg  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34514ModalNavigationDrawerFHprtrg(p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r32, androidx.compose.p002ui.Modifier r33, androidx.compose.material3.DrawerState r34, boolean r35, long r36, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r1 = r32
            r7 = r38
            r8 = r40
            java.lang.String r0 = "drawerContent"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            r0 = -1169303680(0xffffffffba4dd780, float:-7.8522414E-4)
            r2 = r39
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            r3 = r41 & 1
            r4 = 2
            if (r3 == 0) goto L_0x0021
            r3 = r8 | 6
            goto L_0x0031
        L_0x0021:
            r3 = r8 & 14
            if (r3 != 0) goto L_0x0030
            boolean r3 = r2.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x002d
            r3 = 4
            goto L_0x002e
        L_0x002d:
            r3 = r4
        L_0x002e:
            r3 = r3 | r8
            goto L_0x0031
        L_0x0030:
            r3 = r8
        L_0x0031:
            r5 = r41 & 2
            if (r5 == 0) goto L_0x0038
            r3 = r3 | 48
            goto L_0x004b
        L_0x0038:
            r6 = r8 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004b
            r6 = r33
            boolean r9 = r2.changed((java.lang.Object) r6)
            if (r9 == 0) goto L_0x0047
            r9 = 32
            goto L_0x0049
        L_0x0047:
            r9 = 16
        L_0x0049:
            r3 = r3 | r9
            goto L_0x004d
        L_0x004b:
            r6 = r33
        L_0x004d:
            r9 = r8 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0066
            r9 = r41 & 4
            if (r9 != 0) goto L_0x0060
            r9 = r34
            boolean r10 = r2.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x0062
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0060:
            r9 = r34
        L_0x0062:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r3 = r3 | r10
            goto L_0x0068
        L_0x0066:
            r9 = r34
        L_0x0068:
            r10 = r41 & 8
            if (r10 == 0) goto L_0x006f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0082
            r11 = r35
            boolean r12 = r2.changed((boolean) r11)
            if (r12 == 0) goto L_0x007e
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r3 = r3 | r12
            goto L_0x0084
        L_0x0082:
            r11 = r35
        L_0x0084:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r8
            if (r12 != 0) goto L_0x009f
            r12 = r41 & 16
            if (r12 != 0) goto L_0x0099
            r12 = r36
            boolean r14 = r2.changed((long) r12)
            if (r14 == 0) goto L_0x009b
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x0099:
            r12 = r36
        L_0x009b:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r3 = r3 | r14
            goto L_0x00a1
        L_0x009f:
            r12 = r36
        L_0x00a1:
            r14 = r41 & 32
            if (r14 == 0) goto L_0x00a9
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x00a7:
            r3 = r3 | r14
            goto L_0x00ba
        L_0x00a9:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r8
            if (r14 != 0) goto L_0x00ba
            boolean r14 = r2.changed((java.lang.Object) r7)
            if (r14 == 0) goto L_0x00b7
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a7
        L_0x00b7:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a7
        L_0x00ba:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r3
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00d1
            boolean r14 = r2.getSkipping()
            if (r14 != 0) goto L_0x00ca
            goto L_0x00d1
        L_0x00ca:
            r2.skipToGroupEnd()
            r3 = r9
            r4 = r11
            goto L_0x048f
        L_0x00d1:
            r2.startDefaults()
            r14 = r8 & 1
            r15 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = 1
            if (r14 == 0) goto L_0x00f7
            boolean r14 = r2.getDefaultsInvalid()
            if (r14 == 0) goto L_0x00e3
            goto L_0x00f7
        L_0x00e3:
            r2.skipToGroupEnd()
            r5 = r41 & 4
            if (r5 == 0) goto L_0x00ec
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ec:
            r5 = r41 & 16
            if (r5 == 0) goto L_0x00f1
        L_0x00f0:
            r3 = r3 & r15
        L_0x00f1:
            r15 = r3
            r3 = r9
            r5 = r11
            r30 = r12
            goto L_0x011a
        L_0x00f7:
            if (r5 == 0) goto L_0x00fc
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.p002ui.Modifier.Companion
            r6 = r5
        L_0x00fc:
            r5 = r41 & 4
            if (r5 == 0) goto L_0x010b
            androidx.compose.material3.DrawerValue r5 = androidx.compose.material3.DrawerValue.Closed
            r9 = 0
            r14 = 6
            androidx.compose.material3.DrawerState r5 = rememberDrawerState(r5, r9, r2, r14, r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r9 = r5
        L_0x010b:
            if (r10 == 0) goto L_0x010e
            r11 = r0
        L_0x010e:
            r5 = r41 & 16
            if (r5 == 0) goto L_0x00f1
            androidx.compose.material3.DrawerDefaults r5 = androidx.compose.material3.DrawerDefaults.INSTANCE
            r10 = 6
            long r12 = r5.getScrimColor(r2, r10)
            goto L_0x00f0
        L_0x011a:
            r2.endDefaults()
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r9 == 0) goto L_0x012c
            r9 = -1
            java.lang.String r10 = "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:255)"
            r11 = -1169303680(0xffffffffba4dd780, float:-7.8522414E-4)
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r15, r9, r10)
        L_0x012c:
            r9 = 773894976(0x2e20b340, float:3.6538994E-11)
            r2.startReplaceableGroup(r9)
            r9 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.startReplaceableGroup(r9)
            java.lang.Object r9 = r2.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r16.getEmpty()
            if (r9 != r10) goto L_0x0153
            hf.h r9 = p355hf.C12085h.f18916b
            yf.l0 r9 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r9, r2)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r10 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r10.<init>(r9)
            r2.updateRememberedValue(r10)
            r9 = r10
        L_0x0153:
            r2.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r9 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r9
            yf.l0 r14 = r9.getCoroutineScope()
            r2.endReplaceableGroup()
            androidx.compose.material3.Strings$Companion r9 = androidx.compose.material3.Strings.Companion
            int r9 = r9.m34591getNavigationMenuadMyvUU()
            r10 = 6
            java.lang.String r12 = androidx.compose.material3.Strings_androidKt.m34594getStringNWtq28(r9, r2, r10)
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r9 = r2.consume(r9)
            androidx.compose.ui.unit.Density r9 = (androidx.compose.p002ui.unit.Density) r9
            androidx.compose.material3.tokens.NavigationDrawerTokens r10 = androidx.compose.material3.tokens.NavigationDrawerTokens.INSTANCE
            float r10 = r10.m35030getContainerWidthD9Ej5fM()
            float r9 = r9.m38449toPx0680j_4(r10)
            float r9 = -r9
            ef.l[] r4 = new p336ef.C11906l[r4]
            java.lang.Float r10 = java.lang.Float.valueOf(r9)
            androidx.compose.material3.DrawerValue r11 = androidx.compose.material3.DrawerValue.Closed
            ef.l r10 = p336ef.C11915r.m25707a(r10, r11)
            r13 = 0
            r4[r13] = r10
            r10 = 0
            java.lang.Float r11 = java.lang.Float.valueOf(r10)
            androidx.compose.material3.DrawerValue r13 = androidx.compose.material3.DrawerValue.Open
            ef.l r11 = p336ef.C11915r.m25707a(r11, r13)
            r4[r0] = r11
            java.util.Map r20 = kotlin.collections.C12716r0.m28419j(r4)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r4 = r2.consume(r4)
            androidx.compose.ui.unit.LayoutDirection r11 = androidx.compose.p002ui.unit.LayoutDirection.Rtl
            if (r4 != r11) goto L_0x01af
            r23 = r0
            r4 = 0
            goto L_0x01b2
        L_0x01af:
            r4 = 0
            r23 = 0
        L_0x01b2:
            androidx.compose.ui.Modifier r18 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(r6, r10, r0, r4)
            androidx.compose.material3.SwipeableState r19 = r3.getSwipeableState$material3_release()
            androidx.compose.foundation.gestures.Orientation r21 = androidx.compose.foundation.gestures.Orientation.Horizontal
            float r27 = DrawerVelocityThreshold
            r24 = 0
            androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$1 r25 = androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$1.INSTANCE
            r26 = 0
            r28 = 32
            r29 = 0
            r22 = r5
            androidx.compose.ui.Modifier r4 = androidx.compose.material3.SwipeableKt.m34613swipeablepPrIpRY$default(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r13 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r13)
            androidx.compose.ui.Alignment$Companion r17 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r11 = r17.getTopStart()
            r0 = 0
            androidx.compose.ui.layout.MeasurePolicy r11 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r11, r0, r2, r0)
            r0 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r10 = r2.consume(r10)
            androidx.compose.ui.unit.Density r10 = (androidx.compose.p002ui.unit.Density) r10
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r0 = r2.consume(r0)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.p002ui.unit.LayoutDirection) r0
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r13 = r2.consume(r13)
            androidx.compose.ui.platform.ViewConfiguration r13 = (androidx.compose.p002ui.platform.ViewConfiguration) r13
            androidx.compose.ui.node.ComposeUiNode$Companion r19 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            r20 = r6
            of.a r6 = r19.getConstructor()
            of.p r4 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r4)
            androidx.compose.runtime.Applier r8 = r2.getApplier()
            boolean r8 = r8 instanceof androidx.compose.runtime.Applier
            if (r8 != 0) goto L_0x021a
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x021a:
            r2.startReusableNode()
            boolean r8 = r2.getInserting()
            if (r8 == 0) goto L_0x0227
            r2.createNode(r6)
            goto L_0x022a
        L_0x0227:
            r2.useNode()
        L_0x022a:
            r2.disableReusing()
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.m35292constructorimpl(r2)
            of.o r8 = r19.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r11, r8)
            of.o r8 = r19.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r10, r8)
            of.o r8 = r19.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r0, r8)
            of.o r0 = r19.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r13, r0)
            r2.enableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r0)
            r6 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r4.invoke(r0, r2, r8)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r4 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r2.startReplaceableGroup(r4)
            androidx.compose.foundation.layout.BoxScopeInstance r6 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            r6 = -1313342074(0xffffffffb1b7fd86, float:-5.3548233E-9)
            r2.startReplaceableGroup(r6)
            r6 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r6)
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.ui.Alignment r10 = r17.getTopStart()
            r11 = 0
            androidx.compose.ui.layout.MeasurePolicy r10 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r10, r11, r2, r11)
            r11 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r11)
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r11 = r2.consume(r11)
            androidx.compose.ui.unit.Density r11 = (androidx.compose.p002ui.unit.Density) r11
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r13 = r2.consume(r13)
            androidx.compose.ui.unit.LayoutDirection r13 = (androidx.compose.p002ui.unit.LayoutDirection) r13
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r6 = r2.consume(r6)
            androidx.compose.ui.platform.ViewConfiguration r6 = (androidx.compose.p002ui.platform.ViewConfiguration) r6
            of.a r4 = r19.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r8)
            r22 = r12
            androidx.compose.runtime.Applier r12 = r2.getApplier()
            boolean r12 = r12 instanceof androidx.compose.runtime.Applier
            if (r12 != 0) goto L_0x02be
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x02be:
            r2.startReusableNode()
            boolean r12 = r2.getInserting()
            if (r12 == 0) goto L_0x02cb
            r2.createNode(r4)
            goto L_0x02ce
        L_0x02cb:
            r2.useNode()
        L_0x02ce:
            r2.disableReusing()
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.Updater.m35292constructorimpl(r2)
            of.o r12 = r19.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r4, r10, r12)
            of.o r10 = r19.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r4, r11, r10)
            of.o r10 = r19.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r4, r13, r10)
            of.o r10 = r19.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r4, r6, r10)
            r2.enableReusing()
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r4 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r4)
            r6 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r0.invoke(r4, r2, r10)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r0 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r2.startReplaceableGroup(r0)
            r0 = 573344012(0x222c890c, float:2.3382899E-18)
            r2.startReplaceableGroup(r0)
            int r0 = r15 >> 15
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.invoke(r2, r0)
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            boolean r0 = r3.isOpen()
            androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2 r10 = new androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2
            r10.<init>(r5, r3, r14)
            java.lang.Float r4 = java.lang.Float.valueOf(r9)
            r11 = 0
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r11 = 1618982084(0x607fb4c4, float:7.370227E19)
            r2.startReplaceableGroup(r11)
            boolean r4 = r2.changed((java.lang.Object) r4)
            boolean r11 = r2.changed((java.lang.Object) r12)
            r4 = r4 | r11
            boolean r11 = r2.changed((java.lang.Object) r3)
            r4 = r4 | r11
            java.lang.Object r11 = r2.rememberedValue()
            if (r4 != 0) goto L_0x0365
            java.lang.Object r4 = r16.getEmpty()
            if (r11 != r4) goto L_0x036e
        L_0x0365:
            androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$3$1 r11 = new androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$3$1
            r4 = 0
            r11.<init>(r9, r4, r3)
            r2.updateRememberedValue(r11)
        L_0x036e:
            r2.endReplaceableGroup()
            of.a r11 = (p404of.C13074a) r11
            int r4 = r15 >> 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r9 = r0
            r0 = r22
            r12 = r30
            r6 = r14
            r14 = r2
            r22 = r15
            r15 = r4
            m34516ScrimBx497Mc(r9, r10, r11, r12, r14, r15)
            r4 = 1157296644(0x44faf204, float:2007.563)
            r2.startReplaceableGroup(r4)
            boolean r4 = r2.changed((java.lang.Object) r3)
            java.lang.Object r9 = r2.rememberedValue()
            if (r4 != 0) goto L_0x039a
            java.lang.Object r4 = r16.getEmpty()
            if (r9 != r4) goto L_0x03a2
        L_0x039a:
            androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$4$1 r9 = new androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$4$1
            r9.<init>(r3)
            r2.updateRememberedValue(r9)
        L_0x03a2:
            r2.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.OffsetKt.offset(r8, r9)
            androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5 r8 = new androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5
            r8.<init>(r0, r3, r6)
            r0 = 0
            r6 = 0
            r9 = 1
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.semantics.SemanticsModifierKt.semantics$default(r4, r6, r8, r9, r0)
            r4 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r4)
            androidx.compose.ui.Alignment r4 = r17.getTopStart()
            androidx.compose.ui.layout.MeasurePolicy r4 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r4, r6, r2, r6)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r6)
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r6 = r2.consume(r6)
            androidx.compose.ui.unit.Density r6 = (androidx.compose.p002ui.unit.Density) r6
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r8 = r2.consume(r8)
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.p002ui.unit.LayoutDirection) r8
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r9 = r2.consume(r9)
            androidx.compose.ui.platform.ViewConfiguration r9 = (androidx.compose.p002ui.platform.ViewConfiguration) r9
            of.a r10 = r19.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r11 = r2.getApplier()
            boolean r11 = r11 instanceof androidx.compose.runtime.Applier
            if (r11 != 0) goto L_0x03fc
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x03fc:
            r2.startReusableNode()
            boolean r11 = r2.getInserting()
            if (r11 == 0) goto L_0x0409
            r2.createNode(r10)
            goto L_0x040c
        L_0x0409:
            r2.useNode()
        L_0x040c:
            r2.disableReusing()
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.m35292constructorimpl(r2)
            of.o r11 = r19.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r4, r11)
            of.o r4 = r19.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r6, r4)
            of.o r4 = r19.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r8, r4)
            of.o r4 = r19.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r9, r4)
            r2.enableReusing()
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r4 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r4)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.invoke(r4, r2, r6)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r0 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r2.startReplaceableGroup(r0)
            r0 = 381037187(0x16b62a83, float:2.9430515E-25)
            r2.startReplaceableGroup(r0)
            r0 = r22 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.invoke(r2, r0)
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x048a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x048a:
            r4 = r5
            r6 = r20
            r12 = r30
        L_0x048f:
            androidx.compose.runtime.ScopeUpdateScope r10 = r2.endRestartGroup()
            if (r10 != 0) goto L_0x0496
            goto L_0x04a9
        L_0x0496:
            androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$3 r11 = new androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$3
            r0 = r11
            r1 = r32
            r2 = r6
            r5 = r12
            r7 = r38
            r8 = r40
            r9 = r41
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            r10.updateScope(r11)
        L_0x04a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m34514ModalNavigationDrawerFHprtrg(of.o, androidx.compose.ui.Modifier, androidx.compose.material3.DrawerState, boolean, long, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00ff  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void NavigationDrawerItem(p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r36, boolean r37, p404of.C13074a<p336ef.C11921v> r38, androidx.compose.p002ui.Modifier r39, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r40, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r41, androidx.compose.p002ui.graphics.Shape r42, androidx.compose.material3.NavigationDrawerItemColors r43, androidx.compose.foundation.interaction.MutableInteractionSource r44, androidx.compose.runtime.Composer r45, int r46, int r47) {
        /*
            r1 = r36
            r0 = r37
            r14 = r38
            r6 = r46
            r3 = r47
            java.lang.String r2 = "label"
            kotlin.jvm.internal.C12775o.m28639i(r1, r2)
            java.lang.String r2 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r14, r2)
            r2 = -1304626543(0xffffffffb23cfa91, float:-1.10000125E-8)
            r4 = r45
            androidx.compose.runtime.Composer r13 = r4.startRestartGroup(r2)
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0024
            r4 = r6 | 6
            goto L_0x0034
        L_0x0024:
            r4 = r6 & 14
            if (r4 != 0) goto L_0x0033
            boolean r4 = r13.changed((java.lang.Object) r1)
            if (r4 == 0) goto L_0x0030
            r4 = 4
            goto L_0x0031
        L_0x0030:
            r4 = 2
        L_0x0031:
            r4 = r4 | r6
            goto L_0x0034
        L_0x0033:
            r4 = r6
        L_0x0034:
            r5 = r3 & 2
            if (r5 == 0) goto L_0x003b
            r4 = r4 | 48
            goto L_0x004b
        L_0x003b:
            r5 = r6 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004b
            boolean r5 = r13.changed((boolean) r0)
            if (r5 == 0) goto L_0x0048
            r5 = 32
            goto L_0x004a
        L_0x0048:
            r5 = 16
        L_0x004a:
            r4 = r4 | r5
        L_0x004b:
            r5 = r3 & 4
            if (r5 == 0) goto L_0x0052
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0052:
            r5 = r6 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0062
            boolean r5 = r13.changed((java.lang.Object) r14)
            if (r5 == 0) goto L_0x005f
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r4 = r4 | r5
        L_0x0062:
            r5 = r3 & 8
            if (r5 == 0) goto L_0x0069
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x0069:
            r7 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007c
            r7 = r39
            boolean r8 = r13.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0078
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r4 = r4 | r8
            goto L_0x007e
        L_0x007c:
            r7 = r39
        L_0x007e:
            r8 = r3 & 16
            r35 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x0088
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0088:
            r9 = r6 & r35
            if (r9 != 0) goto L_0x009b
            r9 = r40
            boolean r10 = r13.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x0097
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r4 = r4 | r10
            goto L_0x009d
        L_0x009b:
            r9 = r40
        L_0x009d:
            r10 = r3 & 32
            if (r10 == 0) goto L_0x00a5
            r11 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r11
            goto L_0x00b9
        L_0x00a5:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r6
            if (r11 != 0) goto L_0x00b9
            r11 = r41
            boolean r12 = r13.changed((java.lang.Object) r11)
            if (r12 == 0) goto L_0x00b5
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r4 = r4 | r12
            goto L_0x00bb
        L_0x00b9:
            r11 = r41
        L_0x00bb:
            r12 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r6
            if (r12 != 0) goto L_0x00d5
            r12 = r3 & 64
            if (r12 != 0) goto L_0x00cf
            r12 = r42
            boolean r15 = r13.changed((java.lang.Object) r12)
            if (r15 == 0) goto L_0x00d1
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00cf:
            r12 = r42
        L_0x00d1:
            r15 = 524288(0x80000, float:7.34684E-40)
        L_0x00d3:
            r4 = r4 | r15
            goto L_0x00d7
        L_0x00d5:
            r12 = r42
        L_0x00d7:
            r15 = 29360128(0x1c00000, float:7.052966E-38)
            r15 = r15 & r6
            if (r15 != 0) goto L_0x00f2
            r15 = r3 & 128(0x80, float:1.794E-43)
            if (r15 != 0) goto L_0x00eb
            r15 = r43
            boolean r16 = r13.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00ed
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ef
        L_0x00eb:
            r15 = r43
        L_0x00ed:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ef:
            r4 = r4 | r16
            goto L_0x00f4
        L_0x00f2:
            r15 = r43
        L_0x00f4:
            r2 = r3 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x00ff
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            r4 = r4 | r16
            r1 = r44
            goto L_0x0114
        L_0x00ff:
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r6 & r16
            r1 = r44
            if (r16 != 0) goto L_0x0114
            boolean r16 = r13.changed((java.lang.Object) r1)
            if (r16 == 0) goto L_0x0110
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0112
        L_0x0110:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0112:
            r4 = r4 | r16
        L_0x0114:
            r16 = 191739611(0xb6db6db, float:4.5782105E-32)
            r1 = r4 & r16
            r7 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r7) goto L_0x0134
            boolean r1 = r13.getSkipping()
            if (r1 != 0) goto L_0x0125
            goto L_0x0134
        L_0x0125:
            r13.skipToGroupEnd()
            r4 = r39
            r5 = r9
            r6 = r11
            r7 = r12
            r24 = r13
            r8 = r15
            r9 = r44
            goto L_0x0277
        L_0x0134:
            r13.startDefaults()
            r1 = r6 & 1
            r16 = -3670017(0xffffffffffc7ffff, float:NaN)
            r7 = 0
            if (r1 == 0) goto L_0x0165
            boolean r1 = r13.getDefaultsInvalid()
            if (r1 == 0) goto L_0x0146
            goto L_0x0165
        L_0x0146:
            r13.skipToGroupEnd()
            r1 = r3 & 64
            if (r1 == 0) goto L_0x014f
            r4 = r4 & r16
        L_0x014f:
            r1 = r3 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0157
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r4 = r4 & r1
        L_0x0157:
            r1 = r39
            r23 = r44
            r20 = r9
            r21 = r11
            r22 = r12
            r2 = r15
            r15 = r4
            goto L_0x01d8
        L_0x0165:
            if (r5 == 0) goto L_0x016a
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x016c
        L_0x016a:
            r1 = r39
        L_0x016c:
            if (r8 == 0) goto L_0x016f
            r9 = r7
        L_0x016f:
            if (r10 == 0) goto L_0x0172
            r11 = r7
        L_0x0172:
            r5 = r3 & 64
            if (r5 == 0) goto L_0x0184
            androidx.compose.material3.tokens.NavigationDrawerTokens r5 = androidx.compose.material3.tokens.NavigationDrawerTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r5 = r5.getActiveIndicatorShape()
            r8 = 6
            androidx.compose.ui.graphics.Shape r5 = androidx.compose.material3.ShapesKt.toShape(r5, r13, r8)
            r4 = r4 & r16
            goto L_0x0185
        L_0x0184:
            r5 = r12
        L_0x0185:
            r8 = r3 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x01aa
            androidx.compose.material3.NavigationDrawerItemDefaults r15 = androidx.compose.material3.NavigationDrawerItemDefaults.INSTANCE
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r33 = 100663296(0x6000000, float:2.4074124E-35)
            r34 = 255(0xff, float:3.57E-43)
            r32 = r13
            androidx.compose.material3.NavigationDrawerItemColors r8 = r15.m34510colorsoq7We08(r16, r18, r20, r22, r24, r26, r28, r30, r32, r33, r34)
            r10 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r4 = r4 & r10
            goto L_0x01ab
        L_0x01aa:
            r8 = r15
        L_0x01ab:
            if (r2 == 0) goto L_0x01ce
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.startReplaceableGroup(r2)
            java.lang.Object r2 = r13.rememberedValue()
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r2 != r10) goto L_0x01c6
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r13.updateRememberedValue(r2)
        L_0x01c6:
            r13.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r23 = r2
            goto L_0x01d0
        L_0x01ce:
            r23 = r44
        L_0x01d0:
            r15 = r4
            r22 = r5
            r2 = r8
            r20 = r9
            r21 = r11
        L_0x01d8:
            r13.endDefaults()
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x01ea
            r4 = -1
            java.lang.String r5 = "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:659)"
            r8 = -1304626543(0xffffffffb23cfa91, float:-1.10000125E-8)
            androidx.compose.runtime.ComposerKt.traceEventStart(r8, r15, r4, r5)
        L_0x01ea:
            androidx.compose.material3.tokens.NavigationDrawerTokens r4 = androidx.compose.material3.tokens.NavigationDrawerTokens.INSTANCE
            float r4 = r4.m35028getActiveIndicatorHeightD9Ej5fM()
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.m33324height3ABfNKs(r1, r4)
            r5 = 0
            r12 = 1
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r4, r5, r12, r7)
            r5 = 0
            int r16 = r15 >> 3
            r17 = r16 & 14
            int r7 = r15 >> 18
            r7 = r7 & 112(0x70, float:1.57E-43)
            r7 = r17 | r7
            androidx.compose.runtime.State r7 = r2.containerColor(r0, r13, r7)
            java.lang.Object r7 = r7.getValue()
            androidx.compose.ui.graphics.Color r7 = (androidx.compose.p002ui.graphics.Color) r7
            long r7 = r7.m35681unboximpl()
            r9 = 0
            r11 = 0
            r18 = 0
            r5 = r12
            r12 = r18
            r18 = 0
            r9 = r13
            r13 = r18
            androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$2 r10 = new androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$2
            r39 = r10
            r40 = r20
            r41 = r2
            r42 = r37
            r43 = r15
            r44 = r21
            r45 = r36
            r39.<init>(r40, r41, r42, r43, r44, r45)
            r11 = 191488423(0xb69e1a7, float:4.504393E-32)
            androidx.compose.runtime.internal.ComposableLambda r5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r9, r11, r5, r10)
            r10 = r15
            r15 = r5
            r5 = r16 & 112(0x70, float:1.57E-43)
            r5 = r17 | r5
            int r11 = r10 >> 6
            r11 = r11 & r35
            r17 = r5 | r11
            int r5 = r10 >> 24
            r5 = r5 & 14
            r18 = r5 | 48
            r19 = 968(0x3c8, float:1.356E-42)
            r27 = r2
            r2 = r37
            r3 = r38
            r6 = r22
            r14 = r23
            r16 = r9
            r24 = r9
            r5 = 0
            r9 = 0
            r11 = 0
            androidx.compose.material3.SurfaceKt.m34604Surfaced85dljk((boolean) r2, (p404of.C13074a<p336ef.C11921v>) r3, (androidx.compose.p002ui.Modifier) r4, (boolean) r5, (androidx.compose.p002ui.graphics.Shape) r6, (long) r7, (long) r9, (float) r11, (float) r12, (androidx.compose.foundation.BorderStroke) r13, (androidx.compose.foundation.interaction.MutableInteractionSource) r14, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r15, (androidx.compose.runtime.Composer) r16, (int) r17, (int) r18, (int) r19)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x026c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x026c:
            r4 = r1
            r5 = r20
            r6 = r21
            r7 = r22
            r9 = r23
            r8 = r27
        L_0x0277:
            androidx.compose.runtime.ScopeUpdateScope r12 = r24.endRestartGroup()
            if (r12 != 0) goto L_0x027e
            goto L_0x0291
        L_0x027e:
            androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$3 r13 = new androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$3
            r0 = r13
            r1 = r36
            r2 = r37
            r3 = r38
            r10 = r46
            r11 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.updateScope(r13)
        L_0x0291:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.NavigationDrawerItem(of.o, boolean, of.a, androidx.compose.ui.Modifier, of.o, of.o, androidx.compose.ui.graphics.Shape, androidx.compose.material3.NavigationDrawerItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f6  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: PermanentDrawerSheet-afqeVBk  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34515PermanentDrawerSheetafqeVBk(androidx.compose.p002ui.Modifier r25, androidx.compose.p002ui.graphics.Shape r26, long r27, long r29, float r31, androidx.compose.foundation.layout.WindowInsets r32, p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r12 = r33
            r13 = r35
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            r0 = -1733353241(0xffffffff98af20e7, float:-4.5269663E-24)
            r1 = r34
            androidx.compose.runtime.Composer r14 = r1.startRestartGroup(r0)
            r1 = r36 & 1
            if (r1 == 0) goto L_0x001c
            r2 = r13 | 6
            r3 = r2
            r2 = r25
            goto L_0x0030
        L_0x001c:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x002d
            r2 = r25
            boolean r3 = r14.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x002a
            r3 = 4
            goto L_0x002b
        L_0x002a:
            r3 = 2
        L_0x002b:
            r3 = r3 | r13
            goto L_0x0030
        L_0x002d:
            r2 = r25
            r3 = r13
        L_0x0030:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x0037
            r3 = r3 | 48
            goto L_0x004a
        L_0x0037:
            r5 = r13 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r26
            boolean r6 = r14.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0046
            r6 = 32
            goto L_0x0048
        L_0x0046:
            r6 = 16
        L_0x0048:
            r3 = r3 | r6
            goto L_0x004c
        L_0x004a:
            r5 = r26
        L_0x004c:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0065
            r6 = r36 & 4
            if (r6 != 0) goto L_0x005f
            r6 = r27
            boolean r8 = r14.changed((long) r6)
            if (r8 == 0) goto L_0x0061
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x005f:
            r6 = r27
        L_0x0061:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r3 = r3 | r8
            goto L_0x0067
        L_0x0065:
            r6 = r27
        L_0x0067:
            r8 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0080
            r8 = r36 & 8
            if (r8 != 0) goto L_0x007a
            r8 = r29
            boolean r10 = r14.changed((long) r8)
            if (r10 == 0) goto L_0x007c
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007a:
            r8 = r29
        L_0x007c:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r3 = r3 | r10
            goto L_0x0082
        L_0x0080:
            r8 = r29
        L_0x0082:
            r10 = r36 & 16
            r11 = 57344(0xe000, float:8.0356E-41)
            if (r10 == 0) goto L_0x008c
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x008c:
            r15 = r13 & r11
            if (r15 != 0) goto L_0x00a0
            r15 = r31
            boolean r16 = r14.changed((float) r15)
            if (r16 == 0) goto L_0x009b
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r3 = r3 | r16
            goto L_0x00a2
        L_0x00a0:
            r15 = r31
        L_0x00a2:
            r16 = 458752(0x70000, float:6.42848E-40)
            r17 = r13 & r16
            if (r17 != 0) goto L_0x00bc
            r17 = r36 & 32
            r11 = r32
            if (r17 != 0) goto L_0x00b7
            boolean r17 = r14.changed((java.lang.Object) r11)
            if (r17 == 0) goto L_0x00b7
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r3 = r3 | r17
            goto L_0x00be
        L_0x00bc:
            r11 = r32
        L_0x00be:
            r17 = r36 & 64
            r18 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00c9
            r17 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c6:
            r3 = r3 | r17
            goto L_0x00d9
        L_0x00c9:
            r17 = r13 & r18
            if (r17 != 0) goto L_0x00d9
            boolean r17 = r14.changed((java.lang.Object) r12)
            if (r17 == 0) goto L_0x00d6
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c6
        L_0x00d6:
            r17 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c6
        L_0x00d9:
            r17 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r3 & r17
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r2) goto L_0x00f6
            boolean r0 = r14.getSkipping()
            if (r0 != 0) goto L_0x00ea
            goto L_0x00f6
        L_0x00ea:
            r14.skipToGroupEnd()
            r1 = r25
            r2 = r5
            r3 = r6
            r5 = r8
            r8 = r11
            r7 = r15
            goto L_0x0206
        L_0x00f6:
            r14.startDefaults()
            r0 = r13 & 1
            r2 = 6
            if (r0 == 0) goto L_0x0129
            boolean r0 = r14.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0105
            goto L_0x0129
        L_0x0105:
            r14.skipToGroupEnd()
            r0 = r36 & 4
            if (r0 == 0) goto L_0x010e
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x010e:
            r0 = r36 & 8
            if (r0 == 0) goto L_0x0114
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0114:
            r0 = r36 & 32
            if (r0 == 0) goto L_0x011c
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r0
        L_0x011c:
            r17 = r5
            r19 = r6
            r21 = r8
            r24 = r11
            r23 = r15
            r15 = r25
            goto L_0x0181
        L_0x0129:
            if (r1 == 0) goto L_0x012e
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0130
        L_0x012e:
            r0 = r25
        L_0x0130:
            if (r4 == 0) goto L_0x0137
            androidx.compose.ui.graphics.Shape r1 = androidx.compose.p002ui.graphics.RectangleShapeKt.getRectangleShape()
            r5 = r1
        L_0x0137:
            r1 = r36 & 4
            if (r1 == 0) goto L_0x0147
            androidx.compose.material3.MaterialTheme r1 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.ColorScheme r1 = r1.getColorScheme(r14, r2)
            long r6 = r1.m34323getSurface0d7_KjU()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0147:
            r1 = r36 & 8
            if (r1 == 0) goto L_0x0156
            int r1 = r3 >> 6
            r1 = r1 & 14
            long r8 = androidx.compose.material3.ColorSchemeKt.m34359contentColorForek8zF_U(r6, r14, r1)
            r1 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r3 = r1
        L_0x0156:
            if (r10 == 0) goto L_0x015f
            androidx.compose.material3.DrawerDefaults r1 = androidx.compose.material3.DrawerDefaults.INSTANCE
            float r1 = r1.m34403getPermanentDrawerElevationD9Ej5fM()
            r15 = r1
        L_0x015f:
            r1 = r36 & 32
            if (r1 == 0) goto L_0x0176
            androidx.compose.material3.DrawerDefaults r1 = androidx.compose.material3.DrawerDefaults.INSTANCE
            androidx.compose.foundation.layout.WindowInsets r1 = r1.getWindowInsets(r14, r2)
            r4 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r4
            r24 = r1
            r17 = r5
            r19 = r6
            r21 = r8
            goto L_0x017e
        L_0x0176:
            r17 = r5
            r19 = r6
            r21 = r8
            r24 = r11
        L_0x017e:
            r23 = r15
            r15 = r0
        L_0x0181:
            r14.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0193
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:534)"
            r4 = -1733353241(0xffffffff98af20e7, float:-4.5269663E-24)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r3, r0, r1)
        L_0x0193:
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m34591getNavigationMenuadMyvUU()
            java.lang.String r0 = androidx.compose.material3.Strings_androidKt.m34594getStringNWtq28(r0, r14, r2)
            r1 = 1157296644(0x44faf204, float:2007.563)
            r14.startReplaceableGroup(r1)
            boolean r1 = r14.changed((java.lang.Object) r0)
            java.lang.Object r2 = r14.rememberedValue()
            if (r1 != 0) goto L_0x01b5
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r2 != r1) goto L_0x01bd
        L_0x01b5:
            androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$1$1 r2 = new androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$1$1
            r2.<init>(r0)
            r14.updateRememberedValue(r2)
        L_0x01bd:
            r14.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r0 = 0
            r1 = 0
            r4 = 1
            androidx.compose.ui.Modifier r1 = androidx.compose.p002ui.semantics.SemanticsModifierKt.semantics$default(r15, r1, r2, r4, r0)
            int r0 = r3 >> 15
            r0 = r0 & 14
            int r2 = r3 << 3
            r4 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r4
            r4 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r2
            r0 = r0 | r4
            r2 = r2 & r16
            r0 = r0 | r2
            r2 = r3 & r18
            r10 = r0 | r2
            r11 = 0
            r0 = r24
            r2 = r17
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r33
            r9 = r14
            m34512DrawerSheetvywBR7E(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01fb
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01fb:
            r1 = r15
            r2 = r17
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r24
        L_0x0206:
            androidx.compose.runtime.ScopeUpdateScope r14 = r14.endRestartGroup()
            if (r14 != 0) goto L_0x020d
            goto L_0x021c
        L_0x020d:
            androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$2 r15 = new androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$2
            r0 = r15
            r9 = r33
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r14.updateScope(r15)
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m34515PermanentDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void PermanentNavigationDrawer(p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r16, androidx.compose.p002ui.Modifier r17, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            r1 = r16
            r3 = r18
            r4 = r20
            java.lang.String r0 = "drawerContent"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            r0 = -276843608(0xffffffffef7fb3a8, float:-7.913587E28)
            r2 = r19
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            r5 = r21 & 1
            if (r5 == 0) goto L_0x0020
            r5 = r4 | 6
            goto L_0x0030
        L_0x0020:
            r5 = r4 & 14
            if (r5 != 0) goto L_0x002f
            boolean r5 = r2.changed((java.lang.Object) r1)
            if (r5 == 0) goto L_0x002c
            r5 = 4
            goto L_0x002d
        L_0x002c:
            r5 = 2
        L_0x002d:
            r5 = r5 | r4
            goto L_0x0030
        L_0x002f:
            r5 = r4
        L_0x0030:
            r6 = r21 & 2
            if (r6 == 0) goto L_0x0037
            r5 = r5 | 48
            goto L_0x004a
        L_0x0037:
            r7 = r4 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004a
            r7 = r17
            boolean r8 = r2.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0046
            r8 = 32
            goto L_0x0048
        L_0x0046:
            r8 = 16
        L_0x0048:
            r5 = r5 | r8
            goto L_0x004c
        L_0x004a:
            r7 = r17
        L_0x004c:
            r8 = r21 & 4
            if (r8 == 0) goto L_0x0053
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0053:
            r8 = r4 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0063
            boolean r8 = r2.changed((java.lang.Object) r3)
            if (r8 == 0) goto L_0x0060
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r5 = r5 | r8
        L_0x0063:
            r8 = r5 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0076
            boolean r8 = r2.getSkipping()
            if (r8 != 0) goto L_0x0070
            goto L_0x0076
        L_0x0070:
            r2.skipToGroupEnd()
            r6 = r7
            goto L_0x0216
        L_0x0076:
            if (r6 == 0) goto L_0x007b
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x007c
        L_0x007b:
            r6 = r7
        L_0x007c:
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x0088
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:427)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r5, r7, r8)
        L_0x0088:
            r0 = 0
            r7 = 0
            r8 = 1
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(r6, r0, r8, r7)
            r7 = 693286680(0x2952b718, float:4.6788176E-14)
            r2.startReplaceableGroup(r7)
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r7 = r7.getStart()
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r9 = r8.getTop()
            r10 = 0
            androidx.compose.ui.layout.MeasurePolicy r7 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r7, r9, r2, r10)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r9)
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r11 = r2.consume(r11)
            androidx.compose.ui.unit.Density r11 = (androidx.compose.p002ui.unit.Density) r11
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r12 = r2.consume(r12)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.p002ui.unit.LayoutDirection) r12
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r13 = r2.consume(r13)
            androidx.compose.ui.platform.ViewConfiguration r13 = (androidx.compose.p002ui.platform.ViewConfiguration) r13
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r15 = r14.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r9 = r2.getApplier()
            boolean r9 = r9 instanceof androidx.compose.runtime.Applier
            if (r9 != 0) goto L_0x00df
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x00df:
            r2.startReusableNode()
            boolean r9 = r2.getInserting()
            if (r9 == 0) goto L_0x00ec
            r2.createNode(r15)
            goto L_0x00ef
        L_0x00ec:
            r2.useNode()
        L_0x00ef:
            r2.disableReusing()
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.m35292constructorimpl(r2)
            of.o r15 = r14.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r9, r7, r15)
            of.o r7 = r14.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r9, r11, r7)
            of.o r7 = r14.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r9, r12, r7)
            of.o r7 = r14.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r9, r13, r7)
            r2.enableReusing()
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r7 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r7)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r0.invoke(r7, r2, r9)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r7 = -678309503(0xffffffffd791d181, float:-3.20657997E14)
            r2.startReplaceableGroup(r7)
            androidx.compose.foundation.layout.RowScopeInstance r7 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            r7 = 109704460(0x689f50c, float:5.1893736E-35)
            r2.startReplaceableGroup(r7)
            r7 = r5 & 14
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1.invoke(r2, r7)
            r7 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r7)
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.ui.Alignment r8 = r8.getTopStart()
            androidx.compose.ui.layout.MeasurePolicy r8 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r8, r10, r2, r10)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r9)
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r9 = r2.consume(r9)
            androidx.compose.ui.unit.Density r9 = (androidx.compose.p002ui.unit.Density) r9
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r11 = r2.consume(r11)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.p002ui.unit.LayoutDirection) r11
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r12 = r2.consume(r12)
            androidx.compose.ui.platform.ViewConfiguration r12 = (androidx.compose.p002ui.platform.ViewConfiguration) r12
            of.a r13 = r14.getConstructor()
            of.p r7 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r7)
            androidx.compose.runtime.Applier r15 = r2.getApplier()
            boolean r15 = r15 instanceof androidx.compose.runtime.Applier
            if (r15 != 0) goto L_0x0188
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0188:
            r2.startReusableNode()
            boolean r15 = r2.getInserting()
            if (r15 == 0) goto L_0x0195
            r2.createNode(r13)
            goto L_0x0198
        L_0x0195:
            r2.useNode()
        L_0x0198:
            r2.disableReusing()
            androidx.compose.runtime.Composer r13 = androidx.compose.runtime.Updater.m35292constructorimpl(r2)
            of.o r15 = r14.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r13, r8, r15)
            of.o r8 = r14.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r13, r9, r8)
            of.o r8 = r14.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r13, r11, r8)
            of.o r8 = r14.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r13, r12, r8)
            r2.enableReusing()
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r8 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r7.invoke(r8, r2, r9)
            r2.startReplaceableGroup(r0)
            r0 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r2.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            r0 = 612624658(0x2483e912, float:5.720703E-17)
            r2.startReplaceableGroup(r0)
            int r0 = r5 >> 6
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.invoke(r2, r0)
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0216
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0216:
            androidx.compose.runtime.ScopeUpdateScope r7 = r2.endRestartGroup()
            if (r7 != 0) goto L_0x021d
            goto L_0x022f
        L_0x021d:
            androidx.compose.material3.NavigationDrawerKt$PermanentNavigationDrawer$2 r8 = new androidx.compose.material3.NavigationDrawerKt$PermanentNavigationDrawer$2
            r0 = r8
            r1 = r16
            r2 = r6
            r3 = r18
            r4 = r20
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r7.updateScope(r8)
        L_0x022f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.PermanentNavigationDrawer(of.o, androidx.compose.ui.Modifier, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-Bx497Mc  reason: not valid java name */
    public static final void m34516ScrimBx497Mc(boolean z, C13074a<C11921v> aVar, C13074a<Float> aVar2, long j, Composer composer, int i) {
        int i2;
        Modifier modifier;
        int i3;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(2106487387);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed((Object) aVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changed((Object) aVar2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changed(j)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2106487387, i2, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:854)");
            }
            String r0 = Strings_androidKt.m34594getStringNWtq28(Strings.Companion.m34584getCloseDraweradMyvUU(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1858703137);
            if (z) {
                Modifier.Companion companion = Modifier.Companion;
                startRestartGroup.startReplaceableGroup(1157296644);
                boolean changed = startRestartGroup.changed((Object) aVar);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(aVar, (C12074d<? super NavigationDrawerKt$Scrim$dismissDrawer$1$1>) null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion, (Object) aVar, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) (C13088o) rememberedValue);
                startRestartGroup.startReplaceableGroup(511388516);
                boolean changed2 = startRestartGroup.changed((Object) r0) | startRestartGroup.changed((Object) aVar);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new NavigationDrawerKt$Scrim$dismissDrawer$2$1(r0, aVar);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                modifier = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
            } else {
                modifier = Modifier.Companion;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null).then(modifier);
            Color r2 = Color.m35661boximpl(j);
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed3 = startRestartGroup.changed((Object) r2) | startRestartGroup.changed((Object) aVar2);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new NavigationDrawerKt$Scrim$1$1(j, aVar2);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new NavigationDrawerKt$Scrim$2(z, aVar, aVar2, j, i));
        }
    }

    /* access modifiers changed from: private */
    public static final float calculateFraction(float f, float f2, float f3) {
        return C13537l.m30885l((f3 - f) / (f2 - f), 0.0f, 1.0f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: androidx.compose.runtime.saveable.Saver<androidx.compose.material3.DrawerState, androidx.compose.material3.DrawerValue>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: of.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material3.DrawerState rememberDrawerState(androidx.compose.material3.DrawerValue r7, kotlin.jvm.functions.Function1<? super androidx.compose.material3.DrawerValue, java.lang.Boolean> r8, androidx.compose.runtime.Composer r9, int r10, int r11) {
        /*
            java.lang.String r0 = "initialValue"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            r0 = 2098699222(0x7d179bd6, float:1.2595161E37)
            r9.startReplaceableGroup(r0)
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0011
            androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$1 r8 = androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$1.INSTANCE
        L_0x0011:
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x001d
            r11 = -1
            java.lang.String r1 = "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:225)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r11, r1)
        L_0x001d:
            r10 = 0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            androidx.compose.material3.DrawerState$Companion r10 = androidx.compose.material3.DrawerState.Companion
            androidx.compose.runtime.saveable.Saver r1 = r10.Saver(r8)
            r2 = 0
            r10 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r9.startReplaceableGroup(r10)
            boolean r10 = r9.changed((java.lang.Object) r7)
            boolean r11 = r9.changed((java.lang.Object) r8)
            r10 = r10 | r11
            java.lang.Object r11 = r9.rememberedValue()
            if (r10 != 0) goto L_0x0044
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r11 != r10) goto L_0x004c
        L_0x0044:
            androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$2$1 r11 = new androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$2$1
            r11.<init>(r7, r8)
            r9.updateRememberedValue(r11)
        L_0x004c:
            r9.endReplaceableGroup()
            r3 = r11
            of.a r3 = (p404of.C13074a) r3
            r5 = 72
            r6 = 4
            r4 = r9
            java.lang.Object r7 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r0, r1, (java.lang.String) r2, r3, (androidx.compose.runtime.Composer) r4, (int) r5, (int) r6)
            androidx.compose.material3.DrawerState r7 = (androidx.compose.material3.DrawerState) r7
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x0065
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0065:
            r9.endReplaceableGroup()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.rememberDrawerState(androidx.compose.material3.DrawerValue, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):androidx.compose.material3.DrawerState");
    }
}
