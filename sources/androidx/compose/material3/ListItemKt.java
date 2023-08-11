package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: ListItem.kt */
public final class ListItemKt {
    /* access modifiers changed from: private */
    public static final float ContentEndPadding;
    /* access modifiers changed from: private */
    public static final float LeadingContentEndPadding;
    private static final float ListItemHorizontalPadding;
    private static final float ListItemThreeLineVerticalPadding;
    private static final float ListItemVerticalPadding;
    private static final float ThreeLineListItemContainerHeight = C1232Dp.m38468constructorimpl((float) 88);
    /* access modifiers changed from: private */
    public static final float TrailingHorizontalPadding;
    private static final float TwoLineListItemContainerHeight = C1232Dp.m38468constructorimpl((float) 72);

    static {
        float f = (float) 8;
        ListItemVerticalPadding = C1232Dp.m38468constructorimpl(f);
        float f2 = (float) 16;
        ListItemThreeLineVerticalPadding = C1232Dp.m38468constructorimpl(f2);
        ListItemHorizontalPadding = C1232Dp.m38468constructorimpl(f2);
        LeadingContentEndPadding = C1232Dp.m38468constructorimpl(f2);
        ContentEndPadding = C1232Dp.m38468constructorimpl(f);
        TrailingHorizontalPadding = C1232Dp.m38468constructorimpl(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0108  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: ListItem-HXNGIdc  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34476ListItemHXNGIdc(p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r36, androidx.compose.p002ui.Modifier r37, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r38, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r39, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r40, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r41, androidx.compose.material3.ListItemColors r42, float r43, float r44, androidx.compose.runtime.Composer r45, int r46, int r47) {
        /*
            r1 = r36
            r10 = r46
            r11 = r47
            java.lang.String r0 = "headlineText"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            r0 = -1647707763(0xffffffff9dc9f98d, float:-5.3462286E-21)
            r2 = r45
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            r3 = r11 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r10 | 6
            goto L_0x002b
        L_0x001b:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x002a
            boolean r3 = r2.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r10
            goto L_0x002b
        L_0x002a:
            r3 = r10
        L_0x002b:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
            goto L_0x0045
        L_0x0032:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0045
            r5 = r37
            boolean r6 = r2.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
            goto L_0x0047
        L_0x0045:
            r5 = r37
        L_0x0047:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x004e
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r7 = r10 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0061
            r7 = r38
            boolean r8 = r2.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x005d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r8
            goto L_0x0063
        L_0x0061:
            r7 = r38
        L_0x0063:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006a:
            r9 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007d
            r9 = r39
            boolean r12 = r2.changed((java.lang.Object) r9)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r12
            goto L_0x007f
        L_0x007d:
            r9 = r39
        L_0x007f:
            r12 = r11 & 16
            r34 = 57344(0xe000, float:8.0356E-41)
            if (r12 == 0) goto L_0x0089
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x0089:
            r13 = r10 & r34
            if (r13 != 0) goto L_0x009c
            r13 = r40
            boolean r14 = r2.changed((java.lang.Object) r13)
            if (r14 == 0) goto L_0x0098
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r3 = r3 | r14
            goto L_0x009e
        L_0x009c:
            r13 = r40
        L_0x009e:
            r14 = r11 & 32
            r35 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00a8
            r15 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r15
            goto L_0x00bc
        L_0x00a8:
            r15 = r10 & r35
            if (r15 != 0) goto L_0x00bc
            r15 = r41
            boolean r16 = r2.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00b7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r3 = r3 | r16
            goto L_0x00be
        L_0x00bc:
            r15 = r41
        L_0x00be:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x00d8
            r16 = r11 & 64
            r0 = r42
            if (r16 != 0) goto L_0x00d3
            boolean r16 = r2.changed((java.lang.Object) r0)
            if (r16 == 0) goto L_0x00d3
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r3 = r3 | r16
            goto L_0x00da
        L_0x00d8:
            r0 = r42
        L_0x00da:
            r15 = r11 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L_0x00e3
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r16
            goto L_0x00fb
        L_0x00e3:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x00fb
            r16 = r15
            r15 = r43
            boolean r17 = r2.changed((float) r15)
            if (r17 == 0) goto L_0x00f6
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f8
        L_0x00f6:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f8:
            r3 = r3 | r17
            goto L_0x00ff
        L_0x00fb:
            r16 = r15
            r15 = r43
        L_0x00ff:
            r15 = r11 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L_0x0108
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r17
            goto L_0x0120
        L_0x0108:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r10 & r17
            if (r17 != 0) goto L_0x0120
            r17 = r15
            r15 = r44
            boolean r18 = r2.changed((float) r15)
            if (r18 == 0) goto L_0x011b
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011d
        L_0x011b:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011d:
            r3 = r3 | r18
            goto L_0x0124
        L_0x0120:
            r17 = r15
            r15 = r44
        L_0x0124:
            r18 = 191739611(0xb6db6db, float:4.5782105E-32)
            r0 = r3 & r18
            r1 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 != r1) goto L_0x0143
            boolean r0 = r2.getSkipping()
            if (r0 != 0) goto L_0x0135
            goto L_0x0143
        L_0x0135:
            r2.skipToGroupEnd()
            r6 = r41
            r8 = r43
            r3 = r7
            r4 = r9
            r9 = r15
            r7 = r42
            goto L_0x03cb
        L_0x0143:
            r2.startDefaults()
            r0 = r10 & 1
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r0 == 0) goto L_0x0167
            boolean r0 = r2.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0154
            goto L_0x0167
        L_0x0154:
            r2.skipToGroupEnd()
            r0 = r11 & 64
            if (r0 == 0) goto L_0x015c
            r3 = r3 & r1
        L_0x015c:
            r0 = r41
            r1 = r42
            r8 = r3
            r4 = r13
            r6 = r15
            r3 = r43
            goto L_0x01c6
        L_0x0167:
            if (r4 == 0) goto L_0x016c
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            r5 = r0
        L_0x016c:
            r0 = 0
            if (r6 == 0) goto L_0x0170
            r7 = r0
        L_0x0170:
            if (r8 == 0) goto L_0x0173
            r9 = r0
        L_0x0173:
            if (r12 == 0) goto L_0x0177
            r4 = r0
            goto L_0x0178
        L_0x0177:
            r4 = r13
        L_0x0178:
            if (r14 == 0) goto L_0x017b
            goto L_0x017d
        L_0x017b:
            r0 = r41
        L_0x017d:
            r6 = r11 & 64
            if (r6 == 0) goto L_0x01a7
            androidx.compose.material3.ListItemDefaults r12 = androidx.compose.material3.ListItemDefaults.INSTANCE
            r13 = 0
            r18 = 0
            r6 = r16
            r8 = r17
            r15 = r18
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r32 = 805306368(0x30000000, float:4.656613E-10)
            r33 = 511(0x1ff, float:7.16E-43)
            r31 = r2
            androidx.compose.material3.ListItemColors r12 = r12.m34474colorsJ08w3E(r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r32, r33)
            r3 = r3 & r1
            goto L_0x01ad
        L_0x01a7:
            r6 = r16
            r8 = r17
            r12 = r42
        L_0x01ad:
            if (r6 == 0) goto L_0x01b6
            androidx.compose.material3.ListItemDefaults r1 = androidx.compose.material3.ListItemDefaults.INSTANCE
            float r1 = r1.m34475getElevationD9Ej5fM()
            goto L_0x01b8
        L_0x01b6:
            r1 = r43
        L_0x01b8:
            if (r8 == 0) goto L_0x01c1
            androidx.compose.material3.ListItemDefaults r6 = androidx.compose.material3.ListItemDefaults.INSTANCE
            float r6 = r6.m34475getElevationD9Ej5fM()
            goto L_0x01c3
        L_0x01c1:
            r6 = r44
        L_0x01c3:
            r8 = r3
            r3 = r1
            r1 = r12
        L_0x01c6:
            r2.endDefaults()
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x01d8
            r12 = -1
            java.lang.String r13 = "androidx.compose.material3.ListItem (ListItem.kt:71)"
            r14 = -1647707763(0xffffffff9dc9f98d, float:-5.3462286E-21)
            androidx.compose.runtime.ComposerKt.traceEventStart(r14, r8, r12, r13)
        L_0x01d8:
            r13 = 1
            if (r7 != 0) goto L_0x0255
            if (r9 != 0) goto L_0x0255
            r14 = -85614273(0xfffffffffae5a13f, float:-5.9615322E35)
            r2.startReplaceableGroup(r14)
            int r15 = r8 >> 18
            r15 = r15 & 14
            androidx.compose.runtime.State r15 = r1.containerColor$material3_release(r2, r15)
            java.lang.Object r15 = r15.getValue()
            androidx.compose.ui.graphics.Color r15 = (androidx.compose.p002ui.graphics.Color) r15
            long r15 = r15.m35681unboximpl()
            int r17 = r8 >> 15
            r17 = r17 & 112(0x70, float:1.57E-43)
            r14 = r17 | 6
            androidx.compose.runtime.State r14 = r1.headlineColor$material3_release(r13, r2, r14)
            java.lang.Object r14 = r14.getValue()
            androidx.compose.ui.graphics.Color r14 = (androidx.compose.p002ui.graphics.Color) r14
            long r17 = r14.m35681unboximpl()
            androidx.compose.material3.tokens.ListTokens r14 = androidx.compose.material3.tokens.ListTokens.INSTANCE
            float r20 = r14.m35009getListItemContainerHeightD9Ej5fM()
            float r14 = ListItemHorizontalPadding
            float r12 = ListItemVerticalPadding
            androidx.compose.foundation.layout.PaddingValues r21 = androidx.compose.foundation.layout.PaddingKt.m33262PaddingValuesYgX7TsA(r14, r12)
            androidx.compose.material3.ListItemKt$ListItem$1 r12 = new androidx.compose.material3.ListItemKt$ListItem$1
            r37 = r12
            r38 = r4
            r39 = r1
            r40 = r8
            r41 = r0
            r42 = r36
            r37.<init>(r38, r39, r40, r41, r42)
            r14 = 967218806(0x39a69676, float:3.177409E-4)
            androidx.compose.runtime.internal.ComposableLambda r22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r14, r13, r12)
            int r12 = r8 >> 3
            r12 = r12 & 14
            r13 = 114819072(0x6d80000, float:8.125017E-35)
            r12 = r12 | r13
            int r8 = r8 >> 9
            r13 = r8 & r34
            r12 = r12 | r13
            r8 = r8 & r35
            r24 = r12 | r8
            r25 = 2
            r12 = r5
            r8 = 0
            r13 = r8
            r14 = r15
            r16 = r17
            r18 = r3
            r19 = r6
            r23 = r2
            m34477ListItemxOgov6c(r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r24, r25)
            r2.endReplaceableGroup()
            goto L_0x03bb
        L_0x0255:
            if (r7 != 0) goto L_0x02cd
            r12 = -85612818(0xfffffffffae5a6ee, float:-5.9621086E35)
            r2.startReplaceableGroup(r12)
            int r12 = r8 >> 18
            r12 = r12 & 14
            androidx.compose.runtime.State r12 = r1.containerColor$material3_release(r2, r12)
            java.lang.Object r12 = r12.getValue()
            androidx.compose.ui.graphics.Color r12 = (androidx.compose.p002ui.graphics.Color) r12
            long r15 = r12.m35681unboximpl()
            int r12 = r8 >> 15
            r12 = r12 & 112(0x70, float:1.57E-43)
            r12 = r12 | 6
            androidx.compose.runtime.State r12 = r1.headlineColor$material3_release(r13, r2, r12)
            java.lang.Object r12 = r12.getValue()
            androidx.compose.ui.graphics.Color r12 = (androidx.compose.p002ui.graphics.Color) r12
            long r17 = r12.m35681unboximpl()
            float r20 = TwoLineListItemContainerHeight
            float r12 = ListItemHorizontalPadding
            float r14 = ListItemVerticalPadding
            androidx.compose.foundation.layout.PaddingValues r21 = androidx.compose.foundation.layout.PaddingKt.m33262PaddingValuesYgX7TsA(r12, r14)
            androidx.compose.material3.ListItemKt$ListItem$2 r12 = new androidx.compose.material3.ListItemKt$ListItem$2
            r37 = r12
            r38 = r4
            r39 = r1
            r40 = r8
            r41 = r0
            r42 = r36
            r43 = r9
            r37.<init>(r38, r39, r40, r41, r42, r43)
            r14 = 48069791(0x2dd7c9f, float:3.254456E-37)
            androidx.compose.runtime.internal.ComposableLambda r22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r14, r13, r12)
            int r12 = r8 >> 3
            r12 = r12 & 14
            r13 = 114819072(0x6d80000, float:8.125017E-35)
            r12 = r12 | r13
            int r8 = r8 >> 9
            r13 = r8 & r34
            r12 = r12 | r13
            r8 = r8 & r35
            r24 = r12 | r8
            r25 = 2
            r12 = r5
            r8 = 0
            r13 = r8
            r14 = r15
            r16 = r17
            r18 = r3
            r19 = r6
            r23 = r2
            m34477ListItemxOgov6c(r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r24, r25)
            r2.endReplaceableGroup()
            goto L_0x03bb
        L_0x02cd:
            if (r9 != 0) goto L_0x0345
            r12 = -85611073(0xfffffffffae5adbf, float:-5.9628E35)
            r2.startReplaceableGroup(r12)
            int r12 = r8 >> 18
            r12 = r12 & 14
            androidx.compose.runtime.State r12 = r1.containerColor$material3_release(r2, r12)
            java.lang.Object r12 = r12.getValue()
            androidx.compose.ui.graphics.Color r12 = (androidx.compose.p002ui.graphics.Color) r12
            long r15 = r12.m35681unboximpl()
            int r12 = r8 >> 15
            r12 = r12 & 112(0x70, float:1.57E-43)
            r12 = r12 | 6
            androidx.compose.runtime.State r12 = r1.headlineColor$material3_release(r13, r2, r12)
            java.lang.Object r12 = r12.getValue()
            androidx.compose.ui.graphics.Color r12 = (androidx.compose.p002ui.graphics.Color) r12
            long r17 = r12.m35681unboximpl()
            float r20 = TwoLineListItemContainerHeight
            float r12 = ListItemHorizontalPadding
            float r14 = ListItemVerticalPadding
            androidx.compose.foundation.layout.PaddingValues r21 = androidx.compose.foundation.layout.PaddingKt.m33262PaddingValuesYgX7TsA(r12, r14)
            androidx.compose.material3.ListItemKt$ListItem$3 r12 = new androidx.compose.material3.ListItemKt$ListItem$3
            r37 = r12
            r38 = r4
            r39 = r1
            r40 = r8
            r41 = r0
            r42 = r7
            r43 = r36
            r37.<init>(r38, r39, r40, r41, r42, r43)
            r14 = 1733969726(0x675a473e, float:1.0307901E24)
            androidx.compose.runtime.internal.ComposableLambda r22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r14, r13, r12)
            int r12 = r8 >> 3
            r12 = r12 & 14
            r13 = 114819072(0x6d80000, float:8.125017E-35)
            r12 = r12 | r13
            int r8 = r8 >> 9
            r13 = r8 & r34
            r12 = r12 | r13
            r8 = r8 & r35
            r24 = r12 | r8
            r25 = 2
            r12 = r5
            r8 = 0
            r13 = r8
            r14 = r15
            r16 = r17
            r18 = r3
            r19 = r6
            r23 = r2
            m34477ListItemxOgov6c(r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r24, r25)
            r2.endReplaceableGroup()
            goto L_0x03bb
        L_0x0345:
            r12 = -85609368(0xfffffffffae5b468, float:-5.9634753E35)
            r2.startReplaceableGroup(r12)
            int r12 = r8 >> 18
            r12 = r12 & 14
            androidx.compose.runtime.State r12 = r1.containerColor$material3_release(r2, r12)
            java.lang.Object r12 = r12.getValue()
            androidx.compose.ui.graphics.Color r12 = (androidx.compose.p002ui.graphics.Color) r12
            long r15 = r12.m35681unboximpl()
            int r12 = r8 >> 15
            r12 = r12 & 112(0x70, float:1.57E-43)
            r12 = r12 | 6
            androidx.compose.runtime.State r12 = r1.headlineColor$material3_release(r13, r2, r12)
            java.lang.Object r12 = r12.getValue()
            androidx.compose.ui.graphics.Color r12 = (androidx.compose.p002ui.graphics.Color) r12
            long r17 = r12.m35681unboximpl()
            float r20 = ThreeLineListItemContainerHeight
            float r12 = ListItemHorizontalPadding
            float r14 = ListItemThreeLineVerticalPadding
            androidx.compose.foundation.layout.PaddingValues r21 = androidx.compose.foundation.layout.PaddingKt.m33262PaddingValuesYgX7TsA(r12, r14)
            androidx.compose.material3.ListItemKt$ListItem$4 r12 = new androidx.compose.material3.ListItemKt$ListItem$4
            r37 = r12
            r38 = r4
            r39 = r1
            r40 = r8
            r41 = r0
            r42 = r7
            r43 = r36
            r44 = r9
            r37.<init>(r38, r39, r40, r41, r42, r43, r44)
            r14 = -1269203265(0xffffffffb4597ebf, float:-2.025581E-7)
            androidx.compose.runtime.internal.ComposableLambda r22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r14, r13, r12)
            int r12 = r8 >> 3
            r12 = r12 & 14
            r13 = 114819072(0x6d80000, float:8.125017E-35)
            r12 = r12 | r13
            int r8 = r8 >> 9
            r13 = r8 & r34
            r12 = r12 | r13
            r8 = r8 & r35
            r24 = r12 | r8
            r25 = 2
            r12 = r5
            r8 = 0
            r13 = r8
            r14 = r15
            r16 = r17
            r18 = r3
            r19 = r6
            r23 = r2
            m34477ListItemxOgov6c(r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r24, r25)
            r2.endReplaceableGroup()
        L_0x03bb:
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x03c4
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x03c4:
            r8 = r3
            r13 = r4
            r3 = r7
            r4 = r9
            r7 = r1
            r9 = r6
            r6 = r0
        L_0x03cb:
            androidx.compose.runtime.ScopeUpdateScope r12 = r2.endRestartGroup()
            if (r12 != 0) goto L_0x03d2
            goto L_0x03e3
        L_0x03d2:
            androidx.compose.material3.ListItemKt$ListItem$5 r14 = new androidx.compose.material3.ListItemKt$ListItem$5
            r0 = r14
            r1 = r36
            r2 = r5
            r5 = r13
            r10 = r46
            r11 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.updateScope(r14)
        L_0x03e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.m34476ListItemHXNGIdc(of.o, androidx.compose.ui.Modifier, of.o, of.o, of.o, of.o, androidx.compose.material3.ListItemColors, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0129  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: ListItem-xOgov6c  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34477ListItemxOgov6c(androidx.compose.p002ui.Modifier r29, androidx.compose.p002ui.graphics.Shape r30, long r31, long r33, float r35, float r36, float r37, androidx.compose.foundation.layout.PaddingValues r38, p404of.C13089p<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            r9 = r37
            r10 = r38
            r11 = r39
            r12 = r41
            r13 = r42
            r0 = 1069030861(0x3fb81dcd, float:1.4384094)
            r1 = r40
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x001d
            r3 = r12 | 6
            r4 = r3
            r3 = r29
            goto L_0x0031
        L_0x001d:
            r3 = r12 & 14
            if (r3 != 0) goto L_0x002e
            r3 = r29
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x002b
            r4 = 4
            goto L_0x002c
        L_0x002b:
            r4 = 2
        L_0x002c:
            r4 = r4 | r12
            goto L_0x0031
        L_0x002e:
            r3 = r29
            r4 = r12
        L_0x0031:
            r5 = r12 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r13 & 2
            if (r5 != 0) goto L_0x0044
            r5 = r30
            boolean r6 = r1.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0046
            r6 = 32
            goto L_0x0048
        L_0x0044:
            r5 = r30
        L_0x0046:
            r6 = 16
        L_0x0048:
            r4 = r4 | r6
            goto L_0x004c
        L_0x004a:
            r5 = r30
        L_0x004c:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0065
            r6 = r13 & 4
            if (r6 != 0) goto L_0x005f
            r6 = r31
            boolean r8 = r1.changed((long) r6)
            if (r8 == 0) goto L_0x0061
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x005f:
            r6 = r31
        L_0x0061:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r4 = r4 | r8
            goto L_0x0067
        L_0x0065:
            r6 = r31
        L_0x0067:
            r8 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007e
            r8 = r13 & 8
            r14 = r33
            if (r8 != 0) goto L_0x007a
            boolean r8 = r1.changed((long) r14)
            if (r8 == 0) goto L_0x007a
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r4 = r4 | r8
            goto L_0x0080
        L_0x007e:
            r14 = r33
        L_0x0080:
            r8 = r13 & 16
            r16 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x008c
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r0 = r35
            goto L_0x009f
        L_0x008c:
            r17 = r12 & r16
            r0 = r35
            if (r17 != 0) goto L_0x009f
            boolean r18 = r1.changed((float) r0)
            if (r18 == 0) goto L_0x009b
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r4 = r4 | r18
        L_0x009f:
            r18 = r13 & 32
            r19 = 458752(0x70000, float:6.42848E-40)
            if (r18 == 0) goto L_0x00ac
            r20 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r20
            r0 = r36
            goto L_0x00bf
        L_0x00ac:
            r20 = r12 & r19
            r0 = r36
            if (r20 != 0) goto L_0x00bf
            boolean r20 = r1.changed((float) r0)
            if (r20 == 0) goto L_0x00bb
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r4 = r4 | r20
        L_0x00bf:
            r20 = r13 & 64
            if (r20 == 0) goto L_0x00c8
            r20 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c5:
            r4 = r4 | r20
            goto L_0x00da
        L_0x00c8:
            r20 = 3670016(0x380000, float:5.142788E-39)
            r20 = r12 & r20
            if (r20 != 0) goto L_0x00da
            boolean r20 = r1.changed((float) r9)
            if (r20 == 0) goto L_0x00d7
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c5
        L_0x00d7:
            r20 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c5
        L_0x00da:
            r0 = r13 & 128(0x80, float:1.794E-43)
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e3
            r4 = r4 | r20
            goto L_0x00f4
        L_0x00e3:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r12
            if (r0 != 0) goto L_0x00f4
            boolean r0 = r1.changed((java.lang.Object) r10)
            if (r0 == 0) goto L_0x00f1
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f3
        L_0x00f1:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f3:
            r4 = r4 | r0
        L_0x00f4:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x00fc
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x00fa:
            r4 = r4 | r0
            goto L_0x010d
        L_0x00fc:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r12
            if (r0 != 0) goto L_0x010d
            boolean r0 = r1.changed((java.lang.Object) r11)
            if (r0 == 0) goto L_0x010a
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00fa
        L_0x010a:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x00fa
        L_0x010d:
            r0 = 191739611(0xb6db6db, float:4.5782105E-32)
            r0 = r0 & r4
            r3 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 != r3) goto L_0x0129
            boolean r0 = r1.getSkipping()
            if (r0 != 0) goto L_0x011d
            goto L_0x0129
        L_0x011d:
            r1.skipToGroupEnd()
            r2 = r29
            r8 = r36
            r3 = r6
            r7 = r35
            goto L_0x01f7
        L_0x0129:
            r1.startDefaults()
            r0 = r12 & 1
            if (r0 == 0) goto L_0x015a
            boolean r0 = r1.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0137
            goto L_0x015a
        L_0x0137:
            r1.skipToGroupEnd()
            r0 = r13 & 2
            if (r0 == 0) goto L_0x0140
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0140:
            r0 = r13 & 4
            if (r0 == 0) goto L_0x0146
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0146:
            r0 = r13 & 8
            if (r0 == 0) goto L_0x014c
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x014c:
            r0 = r29
            r8 = r36
            r2 = r5
            r5 = r6
            r7 = r35
        L_0x0154:
            r27 = r14
            r14 = r4
            r3 = r27
            goto L_0x01a4
        L_0x015a:
            if (r2 == 0) goto L_0x015f
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0161
        L_0x015f:
            r0 = r29
        L_0x0161:
            r2 = r13 & 2
            r3 = 6
            if (r2 == 0) goto L_0x016f
            androidx.compose.material3.ListItemDefaults r2 = androidx.compose.material3.ListItemDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r2 = r2.getShape(r1, r3)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0170
        L_0x016f:
            r2 = r5
        L_0x0170:
            r5 = r13 & 4
            if (r5 == 0) goto L_0x017d
            androidx.compose.material3.ListItemDefaults r5 = androidx.compose.material3.ListItemDefaults.INSTANCE
            long r5 = r5.getContainerColor(r1, r3)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x017e
        L_0x017d:
            r5 = r6
        L_0x017e:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x018b
            androidx.compose.material3.ListItemDefaults r7 = androidx.compose.material3.ListItemDefaults.INSTANCE
            long r14 = r7.getContentColor(r1, r3)
            r3 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            r4 = r3
        L_0x018b:
            if (r8 == 0) goto L_0x0194
            androidx.compose.material3.ListItemDefaults r3 = androidx.compose.material3.ListItemDefaults.INSTANCE
            float r3 = r3.m34475getElevationD9Ej5fM()
            goto L_0x0196
        L_0x0194:
            r3 = r35
        L_0x0196:
            if (r18 == 0) goto L_0x01a0
            androidx.compose.material3.ListItemDefaults r7 = androidx.compose.material3.ListItemDefaults.INSTANCE
            float r7 = r7.m34475getElevationD9Ej5fM()
            r8 = r7
            goto L_0x01a2
        L_0x01a0:
            r8 = r36
        L_0x01a2:
            r7 = r3
            goto L_0x0154
        L_0x01a4:
            r1.endDefaults()
            boolean r15 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r15 == 0) goto L_0x01b6
            r15 = -1
            java.lang.String r12 = "androidx.compose.material3.ListItem (ListItem.kt:280)"
            r13 = 1069030861(0x3fb81dcd, float:1.4384094)
            androidx.compose.runtime.ComposerKt.traceEventStart(r13, r14, r15, r12)
        L_0x01b6:
            r22 = 0
            androidx.compose.material3.ListItemKt$ListItem$6 r12 = new androidx.compose.material3.ListItemKt$ListItem$6
            r12.<init>(r9, r10, r11, r14)
            r13 = 1393735016(0x5312b568, float:6.3010872E11)
            r15 = 1
            androidx.compose.runtime.internal.ComposableLambda r23 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r13, r15, r12)
            r12 = r14 & 14
            r12 = r12 | r20
            r13 = r14 & 112(0x70, float:1.57E-43)
            r12 = r12 | r13
            r13 = r14 & 896(0x380, float:1.256E-42)
            r12 = r12 | r13
            r13 = r14 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | r13
            r13 = r14 & r16
            r12 = r12 | r13
            r13 = r14 & r19
            r25 = r12 | r13
            r26 = 64
            r14 = r0
            r15 = r2
            r16 = r5
            r18 = r3
            r20 = r7
            r21 = r8
            r24 = r1
            androidx.compose.material3.SurfaceKt.m34602SurfaceT9BRK9s(r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26)
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x01f3
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01f3:
            r14 = r3
            r3 = r5
            r5 = r2
            r2 = r0
        L_0x01f7:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.endRestartGroup()
            if (r13 != 0) goto L_0x01fe
            goto L_0x0216
        L_0x01fe:
            androidx.compose.material3.ListItemKt$ListItem$7 r12 = new androidx.compose.material3.ListItemKt$ListItem$7
            r0 = r12
            r1 = r2
            r2 = r5
            r5 = r14
            r9 = r37
            r10 = r38
            r11 = r39
            r14 = r12
            r12 = r41
            r15 = r13
            r13 = r42
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13)
            r15.updateScope(r14)
        L_0x0216:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.m34477ListItemxOgov6c(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, float, float, androidx.compose.foundation.layout.PaddingValues, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    /* renamed from: ProvideTextStyleFromToken-3J-VO9M  reason: not valid java name */
    public static final void m34478ProvideTextStyleFromToken3JVO9M(long j, TypographyKeyTokens typographyKeyTokens, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(1133967795);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(j)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed((Object) typographyKeyTokens)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changed((Object) oVar)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1133967795, i2, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:489)");
            }
            TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), typographyKeyTokens);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(j))}, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(startRestartGroup, -514310925, true, new ListItemKt$ProvideTextStyleFromToken$1(fromToken, oVar, i2)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ListItemKt$ProvideTextStyleFromToken$2(j, typographyKeyTokens, oVar, i));
        }
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[_[androidx.compose.ui.UiComposable]:[_]]")
    @Composable
    /* renamed from: leadingContent-iJQMabo  reason: not valid java name */
    public static final C13089p<RowScope, Composer, Integer, C11921v> m34483leadingContentiJQMabo(C13088o<? super Composer, ? super Integer, C11921v> oVar, long j, boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(292744125);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(292744125, i, -1, "androidx.compose.material3.leadingContent (ListItem.kt:309)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -1755598478, true, new ListItemKt$leadingContent$1(j, z, oVar, i));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[_[androidx.compose.ui.UiComposable]:[_]]")
    @Composable
    /* renamed from: trailingContent-iJQMabo  reason: not valid java name */
    public static final C13089p<RowScope, Composer, Integer, C11921v> m34484trailingContentiJQMabo(C13088o<? super Composer, ? super Integer, C11921v> oVar, long j, boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(2067138571);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2067138571, i, -1, "androidx.compose.material3.trailingContent (ListItem.kt:334)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -1301939978, true, new ListItemKt$trailingContent$1(z, j, oVar, i));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }
}
