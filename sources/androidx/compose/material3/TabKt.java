package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.layout.LayoutIdKt;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.p002ui.unit.TextUnitKt;
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
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Tab.kt */
public final class TabKt {
    private static final float DoubleLineTextBaselineWithIcon = C1232Dp.m38468constructorimpl((float) 6);
    /* access modifiers changed from: private */
    public static final float HorizontalTextPadding = C1232Dp.m38468constructorimpl((float) 16);
    /* access modifiers changed from: private */
    public static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    /* access modifiers changed from: private */
    public static final float LargeTabHeight = C1232Dp.m38468constructorimpl((float) 72);
    private static final float SingleLineTextBaselineWithIcon = C1232Dp.m38468constructorimpl((float) 14);
    /* access modifiers changed from: private */
    public static final float SmallTabHeight = PrimaryNavigationTabTokens.INSTANCE.m35154getContainerHeightD9Ej5fM();
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    /* access modifiers changed from: private */
    public static final float TextDistanceFromLeadingIcon = C1232Dp.m38468constructorimpl((float) 8);

    /* JADX WARNING: Removed duplicated region for block: B:137:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0138  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: LeadingIconTab-wqdebIU  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34626LeadingIconTabwqdebIU(boolean r24, p404of.C13074a<p336ef.C11921v> r25, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r26, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r27, androidx.compose.p002ui.Modifier r28, boolean r29, long r30, long r32, androidx.compose.foundation.interaction.MutableInteractionSource r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r36
            r14 = r37
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            java.lang.String r0 = "icon"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            r0 = -777316544(0xffffffffd1ab1740, float:-9.1853685E10)
            r1 = r35
            androidx.compose.runtime.Composer r15 = r1.startRestartGroup(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x002b
            r1 = r13 | 6
            r9 = r24
            goto L_0x003d
        L_0x002b:
            r1 = r13 & 14
            r9 = r24
            if (r1 != 0) goto L_0x003c
            boolean r1 = r15.changed((boolean) r9)
            if (r1 == 0) goto L_0x0039
            r1 = 4
            goto L_0x003a
        L_0x0039:
            r1 = 2
        L_0x003a:
            r1 = r1 | r13
            goto L_0x003d
        L_0x003c:
            r1 = r13
        L_0x003d:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0044
            r1 = r1 | 48
            goto L_0x0054
        L_0x0044:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0054
            boolean r2 = r15.changed((java.lang.Object) r10)
            if (r2 == 0) goto L_0x0051
            r2 = 32
            goto L_0x0053
        L_0x0051:
            r2 = 16
        L_0x0053:
            r1 = r1 | r2
        L_0x0054:
            r2 = r14 & 4
            if (r2 == 0) goto L_0x005b
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006b
        L_0x005b:
            r2 = r13 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x006b
            boolean r2 = r15.changed((java.lang.Object) r11)
            if (r2 == 0) goto L_0x0068
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r2 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r1 = r1 | r2
        L_0x006b:
            r2 = r14 & 8
            if (r2 == 0) goto L_0x0072
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x0072:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0082
            boolean r2 = r15.changed((java.lang.Object) r12)
            if (r2 == 0) goto L_0x007f
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r2
        L_0x0082:
            r2 = r14 & 16
            if (r2 == 0) goto L_0x0089
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x0089:
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r13
            if (r3 != 0) goto L_0x009e
            r3 = r28
            boolean r4 = r15.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x009a
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r4
            goto L_0x00a0
        L_0x009e:
            r3 = r28
        L_0x00a0:
            r4 = r14 & 32
            if (r4 == 0) goto L_0x00a8
            r5 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r5
            goto L_0x00bc
        L_0x00a8:
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r13
            if (r5 != 0) goto L_0x00bc
            r5 = r29
            boolean r6 = r15.changed((boolean) r5)
            if (r6 == 0) goto L_0x00b8
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r6
            goto L_0x00be
        L_0x00bc:
            r5 = r29
        L_0x00be:
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r13
            if (r6 != 0) goto L_0x00d8
            r6 = r14 & 64
            if (r6 != 0) goto L_0x00d2
            r6 = r30
            boolean r8 = r15.changed((long) r6)
            if (r8 == 0) goto L_0x00d4
            r8 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d6
        L_0x00d2:
            r6 = r30
        L_0x00d4:
            r8 = 524288(0x80000, float:7.34684E-40)
        L_0x00d6:
            r1 = r1 | r8
            goto L_0x00da
        L_0x00d8:
            r6 = r30
        L_0x00da:
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00f5
            r8 = r14 & 128(0x80, float:1.794E-43)
            r35 = r1
            r0 = r32
            if (r8 != 0) goto L_0x00f0
            boolean r16 = r15.changed((long) r0)
            if (r16 == 0) goto L_0x00f0
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f2
        L_0x00f0:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f2:
            r16 = r35 | r16
            goto L_0x00fb
        L_0x00f5:
            r35 = r1
            r0 = r32
            r16 = r35
        L_0x00fb:
            r8 = r14 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x0106
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r16 = r16 | r17
            r0 = r34
            goto L_0x011b
        L_0x0106:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r13 & r17
            r0 = r34
            if (r17 != 0) goto L_0x011b
            boolean r1 = r15.changed((java.lang.Object) r0)
            if (r1 == 0) goto L_0x0117
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0119
        L_0x0117:
            r1 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0119:
            r16 = r16 | r1
        L_0x011b:
            r1 = 191739611(0xb6db6db, float:4.5782105E-32)
            r1 = r16 & r1
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r0) goto L_0x0138
            boolean r0 = r15.getSkipping()
            if (r0 != 0) goto L_0x012c
            goto L_0x0138
        L_0x012c:
            r15.skipToGroupEnd()
            r9 = r32
            r11 = r34
            r7 = r6
            r6 = r5
            r5 = r3
            goto L_0x023f
        L_0x0138:
            r15.startDefaults()
            r0 = r13 & 1
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = 1
            if (r0 == 0) goto L_0x0169
            boolean r0 = r15.getDefaultsInvalid()
            if (r0 == 0) goto L_0x014a
            goto L_0x0169
        L_0x014a:
            r15.skipToGroupEnd()
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0153
            r16 = r16 & r17
        L_0x0153:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x015c
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r16 = r16 & r0
        L_0x015c:
            r20 = r32
            r22 = r34
            r17 = r5
            r18 = r6
            r8 = r16
            r16 = r3
            goto L_0x01c4
        L_0x0169:
            if (r2 == 0) goto L_0x016e
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            r3 = r0
        L_0x016e:
            if (r4 == 0) goto L_0x0171
            r5 = r1
        L_0x0171:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0185
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material3.ContentColorKt.getLocalContentColor()
            java.lang.Object r0 = r15.consume(r0)
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.p002ui.graphics.Color) r0
            long r6 = r0.m35681unboximpl()
            r16 = r16 & r17
        L_0x0185:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0191
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r16 & r0
            r16 = r6
            goto L_0x0195
        L_0x0191:
            r0 = r16
            r16 = r32
        L_0x0195:
            if (r8 == 0) goto L_0x01b9
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.startReplaceableGroup(r2)
            java.lang.Object r2 = r15.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r2 != r4) goto L_0x01b0
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r15.updateRememberedValue(r2)
        L_0x01b0:
            r15.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r8 = r0
            r22 = r2
            goto L_0x01bc
        L_0x01b9:
            r22 = r34
            r8 = r0
        L_0x01bc:
            r18 = r6
            r20 = r16
            r16 = r3
            r17 = r5
        L_0x01c4:
            r15.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01d6
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.LeadingIconTab (Tab.kt:154)"
            r3 = -777316544(0xffffffffd1ab1740, float:-9.1853685E10)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r8, r0, r2)
        L_0x01d6:
            r0 = 1
            r2 = 0
            int r3 = r8 >> 12
            r3 = r3 & 896(0x380, float:1.256E-42)
            r3 = r3 | 6
            r4 = 2
            r28 = r0
            r29 = r2
            r30 = r18
            r32 = r15
            r33 = r3
            r34 = r4
            androidx.compose.foundation.Indication r4 = androidx.compose.material.ripple.RippleKt.m34235rememberRipple9IZ8Weo(r28, r29, r30, r32, r33, r34)
            androidx.compose.material3.TabKt$LeadingIconTab$2 r7 = new androidx.compose.material3.TabKt$LeadingIconTab$2
            r0 = r7
            r6 = r1
            r1 = r16
            r2 = r24
            r3 = r22
            r5 = r17
            r10 = r6
            r6 = r25
            r11 = r7
            r7 = r27
            r23 = r8
            r9 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -429037564(0xffffffffe66d6804, float:-2.802799E23)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r0, r10, r11)
            int r1 = r23 >> 18
            r2 = r1 & 14
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r2 = r23 << 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r28 = r18
            r30 = r20
            r32 = r24
            r33 = r0
            r34 = r15
            r35 = r1
            m34629TabTransitionKlgxPg(r28, r30, r32, r33, r34, r35)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0235
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0235:
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r20
            r11 = r22
        L_0x023f:
            androidx.compose.runtime.ScopeUpdateScope r15 = r15.endRestartGroup()
            if (r15 != 0) goto L_0x0246
            goto L_0x025c
        L_0x0246:
            androidx.compose.material3.TabKt$LeadingIconTab$3 r4 = new androidx.compose.material3.TabKt$LeadingIconTab$3
            r0 = r4
            r1 = r24
            r2 = r25
            r3 = r26
            r14 = r4
            r4 = r27
            r12 = r36
            r13 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13)
            r15.updateScope(r14)
        L_0x025c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m34626LeadingIconTabwqdebIU(boolean, of.a, of.o, of.o, androidx.compose.ui.Modifier, boolean, long, long, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0116  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: Tab-bogVsAg  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34627TabbogVsAg(boolean r23, p404of.C13074a<p336ef.C11921v> r24, androidx.compose.p002ui.Modifier r25, boolean r26, long r27, long r29, androidx.compose.foundation.interaction.MutableInteractionSource r31, p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r9 = r24
            r10 = r32
            r11 = r34
            r12 = r35
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            r0 = -202735880(0xfffffffff3ea7ef8, float:-3.715737E31)
            r1 = r33
            androidx.compose.runtime.Composer r13 = r1.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r11 | 6
            r14 = r23
            goto L_0x0036
        L_0x0024:
            r1 = r11 & 14
            r14 = r23
            if (r1 != 0) goto L_0x0035
            boolean r1 = r13.changed((boolean) r14)
            if (r1 == 0) goto L_0x0032
            r1 = 4
            goto L_0x0033
        L_0x0032:
            r1 = 2
        L_0x0033:
            r1 = r1 | r11
            goto L_0x0036
        L_0x0035:
            r1 = r11
        L_0x0036:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x003d
            r1 = r1 | 48
            goto L_0x004d
        L_0x003d:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004d
            boolean r2 = r13.changed((java.lang.Object) r9)
            if (r2 == 0) goto L_0x004a
            r2 = 32
            goto L_0x004c
        L_0x004a:
            r2 = 16
        L_0x004c:
            r1 = r1 | r2
        L_0x004d:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r3 = r11 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0067
            r3 = r25
            boolean r4 = r13.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0063
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r4
            goto L_0x0069
        L_0x0067:
            r3 = r25
        L_0x0069:
            r4 = r12 & 8
            if (r4 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r5 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0083
            r5 = r26
            boolean r6 = r13.changed((boolean) r5)
            if (r6 == 0) goto L_0x007f
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r6
            goto L_0x0085
        L_0x0083:
            r5 = r26
        L_0x0085:
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r11
            if (r6 != 0) goto L_0x00a0
            r6 = r12 & 16
            if (r6 != 0) goto L_0x009a
            r6 = r27
            boolean r8 = r13.changed((long) r6)
            if (r8 == 0) goto L_0x009c
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r6 = r27
        L_0x009c:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r8
            goto L_0x00a2
        L_0x00a0:
            r6 = r27
        L_0x00a2:
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r11
            if (r8 != 0) goto L_0x00bd
            r8 = r12 & 32
            r33 = r1
            r0 = r29
            if (r8 != 0) goto L_0x00b8
            boolean r15 = r13.changed((long) r0)
            if (r15 == 0) goto L_0x00b8
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r15 = r33 | r15
            goto L_0x00c3
        L_0x00bd:
            r33 = r1
            r0 = r29
            r15 = r33
        L_0x00c3:
            r16 = r12 & 64
            if (r16 == 0) goto L_0x00ce
            r17 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 | r17
            r8 = r31
            goto L_0x00e3
        L_0x00ce:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r11 & r17
            r8 = r31
            if (r17 != 0) goto L_0x00e3
            boolean r17 = r13.changed((java.lang.Object) r8)
            if (r17 == 0) goto L_0x00df
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e1
        L_0x00df:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00e1:
            r15 = r15 | r17
        L_0x00e3:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00eb
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e9:
            r15 = r15 | r0
            goto L_0x00fc
        L_0x00eb:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r11
            if (r0 != 0) goto L_0x00fc
            boolean r0 = r13.changed((java.lang.Object) r10)
            if (r0 == 0) goto L_0x00f9
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00f9:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e9
        L_0x00fc:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r15
            r1 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r1) goto L_0x0116
            boolean r0 = r13.getSkipping()
            if (r0 != 0) goto L_0x010c
            goto L_0x0116
        L_0x010c:
            r13.skipToGroupEnd()
            r4 = r5
            r5 = r6
            r9 = r8
            r7 = r29
            goto L_0x0210
        L_0x0116:
            r13.startDefaults()
            r0 = r11 & 1
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = 1
            if (r0 == 0) goto L_0x0144
            boolean r0 = r13.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0128
            goto L_0x0144
        L_0x0128:
            r13.skipToGroupEnd()
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0131
            r15 = r15 & r17
        L_0x0131:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0139
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r15 = r15 & r0
        L_0x0139:
            r19 = r29
            r16 = r5
            r17 = r6
            r21 = r8
            r8 = r15
            r15 = r3
            goto L_0x019d
        L_0x0144:
            if (r2 == 0) goto L_0x0149
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            r3 = r0
        L_0x0149:
            if (r4 == 0) goto L_0x014c
            r5 = r1
        L_0x014c:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0160
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material3.ContentColorKt.getLocalContentColor()
            java.lang.Object r0 = r13.consume(r0)
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.p002ui.graphics.Color) r0
            long r6 = r0.m35681unboximpl()
            r15 = r15 & r17
        L_0x0160:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x016c
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r15
            r15 = r0
            r17 = r6
            goto L_0x016e
        L_0x016c:
            r17 = r29
        L_0x016e:
            if (r16 == 0) goto L_0x0193
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.startReplaceableGroup(r0)
            java.lang.Object r0 = r13.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x0189
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r13.updateRememberedValue(r0)
        L_0x0189:
            r13.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r21 = r0
            r16 = r5
            goto L_0x0197
        L_0x0193:
            r16 = r5
            r21 = r8
        L_0x0197:
            r8 = r15
            r19 = r17
            r15 = r3
            r17 = r6
        L_0x019d:
            r13.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01af
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.Tab (Tab.kt:225)"
            r3 = -202735880(0xfffffffff3ea7ef8, float:-3.715737E31)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r8, r0, r2)
        L_0x01af:
            r0 = 1
            r2 = 0
            int r3 = r8 >> 6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r3 = r3 | 6
            r4 = 2
            r25 = r0
            r26 = r2
            r27 = r17
            r29 = r13
            r30 = r3
            r31 = r4
            androidx.compose.foundation.Indication r4 = androidx.compose.material.ripple.RippleKt.m34235rememberRipple9IZ8Weo(r25, r26, r27, r29, r30, r31)
            androidx.compose.material3.TabKt$Tab$5 r7 = new androidx.compose.material3.TabKt$Tab$5
            r0 = r7
            r6 = r1
            r1 = r15
            r2 = r23
            r3 = r21
            r5 = r16
            r9 = r6
            r6 = r24
            r10 = r7
            r7 = r32
            r22 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -551896140(0xffffffffdf1abbb4, float:-1.1149703E19)
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r0, r9, r10)
            int r0 = r22 >> 12
            r1 = r0 & 14
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r22 << 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r8 = r0 | r1
            r1 = r17
            r3 = r19
            r5 = r23
            r7 = r13
            m34629TabTransitionKlgxPg(r1, r3, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0207
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0207:
            r3 = r15
            r4 = r16
            r5 = r17
            r7 = r19
            r9 = r21
        L_0x0210:
            androidx.compose.runtime.ScopeUpdateScope r13 = r13.endRestartGroup()
            if (r13 != 0) goto L_0x0217
            goto L_0x022a
        L_0x0217:
            androidx.compose.material3.TabKt$Tab$6 r15 = new androidx.compose.material3.TabKt$Tab$6
            r0 = r15
            r1 = r23
            r2 = r24
            r10 = r32
            r11 = r34
            r12 = r35
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12)
            r13.updateScope(r15)
        L_0x022a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m34627TabbogVsAg(boolean, of.a, androidx.compose.ui.Modifier, boolean, long, long, androidx.compose.foundation.interaction.MutableInteractionSource, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:146:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0138  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: Tab-wqdebIU  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34628TabwqdebIU(boolean r27, p404of.C13074a<p336ef.C11921v> r28, androidx.compose.p002ui.Modifier r29, boolean r30, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r31, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r32, long r33, long r35, androidx.compose.foundation.interaction.MutableInteractionSource r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r13 = r28
            r14 = r39
            r15 = r40
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            r0 = -350627181(0xffffffffeb19da93, float:-1.8599784E26)
            r1 = r38
            androidx.compose.runtime.Composer r12 = r1.startRestartGroup(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x001d
            r1 = r14 | 6
            r11 = r27
            goto L_0x002f
        L_0x001d:
            r1 = r14 & 14
            r11 = r27
            if (r1 != 0) goto L_0x002e
            boolean r1 = r12.changed((boolean) r11)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r14
            goto L_0x002f
        L_0x002e:
            r1 = r14
        L_0x002f:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0046
        L_0x0036:
            r2 = r14 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0046
            boolean r2 = r12.changed((java.lang.Object) r13)
            if (r2 == 0) goto L_0x0043
            r2 = 32
            goto L_0x0045
        L_0x0043:
            r2 = 16
        L_0x0045:
            r1 = r1 | r2
        L_0x0046:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x004d
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0060
        L_0x004d:
            r3 = r14 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0060
            r3 = r29
            boolean r4 = r12.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x005c
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r1 = r1 | r4
            goto L_0x0062
        L_0x0060:
            r3 = r29
        L_0x0062:
            r4 = r15 & 8
            if (r4 == 0) goto L_0x0069
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x0069:
            r5 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007c
            r5 = r30
            boolean r6 = r12.changed((boolean) r5)
            if (r6 == 0) goto L_0x0078
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r1 = r1 | r6
            goto L_0x007e
        L_0x007c:
            r5 = r30
        L_0x007e:
            r6 = r15 & 16
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x0088
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0088:
            r8 = r14 & r7
            if (r8 != 0) goto L_0x009b
            r8 = r31
            boolean r9 = r12.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0097
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r1 = r1 | r9
            goto L_0x009d
        L_0x009b:
            r8 = r31
        L_0x009d:
            r9 = r15 & 32
            r10 = 458752(0x70000, float:6.42848E-40)
            if (r9 == 0) goto L_0x00aa
            r16 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r16
            r10 = r32
            goto L_0x00bd
        L_0x00aa:
            r16 = r14 & r10
            r10 = r32
            if (r16 != 0) goto L_0x00bd
            boolean r16 = r12.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x00b9
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r1 = r1 | r16
        L_0x00bd:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r17 = r14 & r16
            if (r17 != 0) goto L_0x00d7
            r17 = r15 & 64
            r7 = r33
            if (r17 != 0) goto L_0x00d2
            boolean r18 = r12.changed((long) r7)
            if (r18 == 0) goto L_0x00d2
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d4
        L_0x00d2:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00d4:
            r1 = r1 | r18
            goto L_0x00d9
        L_0x00d7:
            r7 = r33
        L_0x00d9:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r14 & r18
            if (r18 != 0) goto L_0x00f2
            r0 = r15 & 128(0x80, float:1.794E-43)
            r7 = r35
            if (r0 != 0) goto L_0x00ee
            boolean r0 = r12.changed((long) r7)
            if (r0 == 0) goto L_0x00ee
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f0
        L_0x00ee:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f0:
            r1 = r1 | r0
            goto L_0x00f4
        L_0x00f2:
            r7 = r35
        L_0x00f4:
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x00ff
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r19
            r3 = r37
            goto L_0x0114
        L_0x00ff:
            r19 = 234881024(0xe000000, float:1.5777218E-30)
            r19 = r14 & r19
            r3 = r37
            if (r19 != 0) goto L_0x0114
            boolean r19 = r12.changed((java.lang.Object) r3)
            if (r19 == 0) goto L_0x0110
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0112
        L_0x0110:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0112:
            r1 = r1 | r19
        L_0x0114:
            r19 = 191739611(0xb6db6db, float:4.5782105E-32)
            r3 = r1 & r19
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r5) goto L_0x0138
            boolean r3 = r12.getSkipping()
            if (r3 != 0) goto L_0x0125
            goto L_0x0138
        L_0x0125:
            r12.skipToGroupEnd()
            r3 = r29
            r4 = r30
            r5 = r31
            r11 = r37
            r6 = r10
            r16 = r12
            r9 = r7
            r7 = r33
            goto L_0x0254
        L_0x0138:
            r12.startDefaults()
            r3 = r14 & 1
            r19 = -3670017(0xffffffffffc7ffff, float:NaN)
            r20 = 0
            r5 = 1
            if (r3 == 0) goto L_0x016c
            boolean r3 = r12.getDefaultsInvalid()
            if (r3 == 0) goto L_0x014c
            goto L_0x016c
        L_0x014c:
            r12.skipToGroupEnd()
            r0 = r15 & 64
            if (r0 == 0) goto L_0x0155
            r1 = r1 & r19
        L_0x0155:
            r0 = r15 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x015d
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r0
        L_0x015d:
            r19 = r29
            r21 = r30
            r22 = r33
            r26 = r37
            r24 = r7
            r9 = r10
            r10 = r31
            goto L_0x01d2
        L_0x016c:
            if (r2 == 0) goto L_0x0171
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0173
        L_0x0171:
            r2 = r29
        L_0x0173:
            if (r4 == 0) goto L_0x0177
            r3 = r5
            goto L_0x0179
        L_0x0177:
            r3 = r30
        L_0x0179:
            if (r6 == 0) goto L_0x017e
            r4 = r20
            goto L_0x0180
        L_0x017e:
            r4 = r31
        L_0x0180:
            if (r9 == 0) goto L_0x0184
            r10 = r20
        L_0x0184:
            r6 = r15 & 64
            if (r6 == 0) goto L_0x0199
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.material3.ContentColorKt.getLocalContentColor()
            java.lang.Object r6 = r12.consume(r6)
            androidx.compose.ui.graphics.Color r6 = (androidx.compose.p002ui.graphics.Color) r6
            long r22 = r6.m35681unboximpl()
            r1 = r1 & r19
            goto L_0x019b
        L_0x0199:
            r22 = r33
        L_0x019b:
            r6 = r15 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x01a5
            r6 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r6
            r7 = r22
        L_0x01a5:
            if (r0 == 0) goto L_0x01c8
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.startReplaceableGroup(r0)
            java.lang.Object r0 = r12.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r0 != r6) goto L_0x01c0
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r12.updateRememberedValue(r0)
        L_0x01c0:
            r12.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r26 = r0
            goto L_0x01ca
        L_0x01c8:
            r26 = r37
        L_0x01ca:
            r19 = r2
            r21 = r3
            r24 = r7
            r9 = r10
            r10 = r4
        L_0x01d2:
            r12.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01e4
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.Tab (Tab.kt:91)"
            r3 = -350627181(0xffffffffeb19da93, float:-1.8599784E26)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x01e4:
            if (r10 == 0) goto L_0x01f2
            androidx.compose.material3.TabKt$Tab$styledText$1$1 r0 = new androidx.compose.material3.TabKt$Tab$styledText$1$1
            r0.<init>(r10, r1)
            r2 = 708874428(0x2a4090bc, float:1.710324E-13)
            androidx.compose.runtime.internal.ComposableLambda r20 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r12, r2, r5, r0)
        L_0x01f2:
            r0 = r20
            androidx.compose.material3.TabKt$Tab$2 r2 = new androidx.compose.material3.TabKt$Tab$2
            r2.<init>(r0, r9, r1)
            r0 = 1540996038(0x5bd9bbc6, float:1.22573058E17)
            androidx.compose.runtime.internal.ComposableLambda r18 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r12, r0, r5, r2)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r1 & 14
            r0 = r0 | r2
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r1 = r1 >> 6
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r16
            r16 = r0 | r1
            r17 = 0
            r0 = r27
            r1 = r28
            r2 = r19
            r3 = r21
            r4 = r22
            r6 = r24
            r8 = r26
            r20 = r9
            r9 = r18
            r18 = r10
            r10 = r12
            r11 = r16
            r16 = r12
            r12 = r17
            m34627TabbogVsAg(r0, r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0246
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0246:
            r5 = r18
            r3 = r19
            r6 = r20
            r4 = r21
            r7 = r22
            r9 = r24
            r11 = r26
        L_0x0254:
            androidx.compose.runtime.ScopeUpdateScope r12 = r16.endRestartGroup()
            if (r12 != 0) goto L_0x025b
            goto L_0x026f
        L_0x025b:
            androidx.compose.material3.TabKt$Tab$3 r2 = new androidx.compose.material3.TabKt$Tab$3
            r0 = r2
            r1 = r27
            r14 = r2
            r2 = r28
            r13 = r12
            r12 = r39
            r15 = r13
            r13 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13)
            r15.updateScope(r14)
        L_0x026f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m34628TabwqdebIU(boolean, of.a, androidx.compose.ui.Modifier, boolean, of.o, of.o, long, long, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void TabBaselineLayout(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        C13088o<? super Composer, ? super Integer, C11921v> oVar3 = oVar;
        C13088o<? super Composer, ? super Integer, C11921v> oVar4 = oVar2;
        int i5 = i;
        Composer startRestartGroup = composer.startRestartGroup(514131524);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed((Object) oVar3)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed((Object) oVar4)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(514131524, i2, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:302)");
            }
            TabKt$TabBaselineLayout$2 tabKt$TabBaselineLayout$2 = new TabKt$TabBaselineLayout$2(oVar3, oVar4);
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
            Composer r13 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r13, tabKt$TabBaselineLayout$2, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r13, density, companion2.getSetDensity());
            Updater.m35299setimpl(r13, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r13, viewConfiguration, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(1480471867);
            startRestartGroup.startReplaceableGroup(720850841);
            if (oVar3 != null) {
                Modifier r6 = PaddingKt.m33270paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), HorizontalTextPadding, 0.0f, 2, (Object) null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                C13074a<ComposeUiNode> constructor2 = companion2.getConstructor();
                C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf2 = LayoutKt.materializerOf(r6);
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
                Composer r7 = Updater.m35292constructorimpl(startRestartGroup);
                Updater.m35299setimpl(r7, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m35299setimpl(r7, density2, companion2.getSetDensity());
                Updater.m35299setimpl(r7, layoutDirection2, companion2.getSetLayoutDirection());
                Updater.m35299setimpl(r7, viewConfiguration2, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-947514212);
                oVar3.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            if (oVar4 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(companion, "icon");
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                C13074a<ComposeUiNode> constructor3 = companion2.getConstructor();
                C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf3 = LayoutKt.materializerOf(layoutId);
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
                Composer r132 = Updater.m35292constructorimpl(startRestartGroup);
                Updater.m35299setimpl(r132, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m35299setimpl(r132, density3, companion2.getSetDensity());
                Updater.m35299setimpl(r132, layoutDirection3, companion2.getSetLayoutDirection());
                Updater.m35299setimpl(r132, viewConfiguration3, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-1983967725);
                oVar4.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
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
            endRestartGroup.updateScope(new TabKt$TabBaselineLayout$3(oVar3, oVar4, i5));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: androidx.compose.animation.core.TwoWayConverter} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    @androidx.compose.runtime.Composable
    /* renamed from: TabTransition-Klgx-Pg  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34629TabTransitionKlgxPg(long r18, long r20, boolean r22, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r23, androidx.compose.runtime.Composer r24, int r25) {
        /*
            r6 = r23
            r7 = r25
            r0 = 735731848(0x2bda6088, float:1.5516624E-12)
            r1 = r24
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r7 & 14
            r3 = 2
            r4 = r18
            if (r2 != 0) goto L_0x001f
            boolean r2 = r1.changed((long) r4)
            if (r2 == 0) goto L_0x001c
            r2 = 4
            goto L_0x001d
        L_0x001c:
            r2 = r3
        L_0x001d:
            r2 = r2 | r7
            goto L_0x0020
        L_0x001f:
            r2 = r7
        L_0x0020:
            r8 = r7 & 112(0x70, float:1.57E-43)
            r14 = r20
            if (r8 != 0) goto L_0x0032
            boolean r8 = r1.changed((long) r14)
            if (r8 == 0) goto L_0x002f
            r8 = 32
            goto L_0x0031
        L_0x002f:
            r8 = 16
        L_0x0031:
            r2 = r2 | r8
        L_0x0032:
            r8 = r7 & 896(0x380, float:1.256E-42)
            r13 = r22
            if (r8 != 0) goto L_0x0044
            boolean r8 = r1.changed((boolean) r13)
            if (r8 == 0) goto L_0x0041
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r2 = r2 | r8
        L_0x0044:
            r8 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0054
            boolean r8 = r1.changed((java.lang.Object) r6)
            if (r8 == 0) goto L_0x0051
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0053
        L_0x0051:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            r2 = r2 | r8
        L_0x0054:
            r8 = r2 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r8 != r9) goto L_0x0066
            boolean r8 = r1.getSkipping()
            if (r8 != 0) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            r1.skipToGroupEnd()
            goto L_0x0194
        L_0x0066:
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r9 = -1
            if (r8 == 0) goto L_0x0072
            java.lang.String r8 = "androidx.compose.material3.TabTransition (Tab.kt:265)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r2, r9, r8)
        L_0x0072:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)
            int r2 = r2 >> 6
            r8 = r2 & 14
            r10 = 0
            androidx.compose.animation.core.Transition r8 = androidx.compose.animation.core.TransitionKt.updateTransition(r0, (java.lang.String) r10, (androidx.compose.runtime.Composer) r1, (int) r8, (int) r3)
            androidx.compose.material3.TabKt$TabTransition$color$2 r0 = androidx.compose.material3.TabKt$TabTransition$color$2.INSTANCE
            r3 = -1462136984(0xffffffffa8d98f68, float:-2.4154032E-14)
            r1.startReplaceableGroup(r3)
            java.lang.String r3 = "ColorAnimation"
            java.lang.Object r10 = r8.getTargetState()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r11 = -1997025499(0xffffffff88f7cf25, float:-1.4914471E-33)
            r1.startReplaceableGroup(r11)
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r9 = "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:287)"
            r15 = 0
            if (r12 == 0) goto L_0x00a6
            r12 = -1
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r15, r12, r9)
        L_0x00a6:
            if (r10 == 0) goto L_0x00ab
            r16 = r4
            goto L_0x00ad
        L_0x00ab:
            r16 = r20
        L_0x00ad:
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x00b6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00b6:
            r1.endReplaceableGroup()
            androidx.compose.ui.graphics.colorspace.ColorSpace r10 = androidx.compose.p002ui.graphics.Color.m35675getColorSpaceimpl(r16)
            r12 = -3686930(0xffffffffffc7bdee, float:NaN)
            r1.startReplaceableGroup(r12)
            boolean r12 = r1.changed((java.lang.Object) r10)
            java.lang.Object r14 = r1.rememberedValue()
            if (r12 != 0) goto L_0x00d5
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r12 = r12.getEmpty()
            if (r14 != r12) goto L_0x00e5
        L_0x00d5:
            androidx.compose.ui.graphics.Color$Companion r12 = androidx.compose.p002ui.graphics.Color.Companion
            kotlin.jvm.functions.Function1 r12 = androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(r12)
            java.lang.Object r10 = r12.invoke(r10)
            r14 = r10
            androidx.compose.animation.core.TwoWayConverter r14 = (androidx.compose.animation.core.TwoWayConverter) r14
            r1.updateRememberedValue(r14)
        L_0x00e5:
            r1.endReplaceableGroup()
            r12 = r14
            androidx.compose.animation.core.TwoWayConverter r12 = (androidx.compose.animation.core.TwoWayConverter) r12
            r10 = 1847725064(0x6e220c08, float:1.2537779E28)
            r1.startReplaceableGroup(r10)
            java.lang.Object r10 = r8.getCurrentState()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r1.startReplaceableGroup(r11)
            boolean r14 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r14 == 0) goto L_0x0108
            r14 = -1
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r15, r14, r9)
        L_0x0108:
            if (r10 == 0) goto L_0x010d
            r16 = r4
            goto L_0x010f
        L_0x010d:
            r16 = r20
        L_0x010f:
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x0118
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0118:
            r1.endReplaceableGroup()
            androidx.compose.ui.graphics.Color r10 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r16)
            java.lang.Object r14 = r8.getTargetState()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            r1.startReplaceableGroup(r11)
            boolean r16 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r16 == 0) goto L_0x0136
            r4 = -1
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r15, r4, r9)
        L_0x0136:
            if (r14 == 0) goto L_0x013b
            r4 = r18
            goto L_0x013d
        L_0x013b:
            r4 = r20
        L_0x013d:
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r9 == 0) goto L_0x0146
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0146:
            r1.endReplaceableGroup()
            androidx.compose.ui.graphics.Color r4 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r4)
            androidx.compose.animation.core.Transition$Segment r5 = r8.getSegment()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            java.lang.Object r0 = r0.invoke(r5, r1, r9)
            r11 = r0
            androidx.compose.animation.core.FiniteAnimationSpec r11 = (androidx.compose.animation.core.FiniteAnimationSpec) r11
            r0 = 32768(0x8000, float:4.5918E-41)
            r9 = r10
            r10 = r4
            r13 = r3
            r14 = r1
            r3 = r15
            r15 = r0
            androidx.compose.runtime.State r0 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r8, r9, r10, r11, r12, r13, r14, r15)
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            r4 = 1
            androidx.compose.runtime.ProvidedValue[] r4 = new androidx.compose.runtime.ProvidedValue[r4]
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.material3.ContentColorKt.getLocalContentColor()
            long r8 = m34630TabTransition_Klgx_Pg$lambda5(r0)
            androidx.compose.ui.graphics.Color r0 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r8)
            androidx.compose.runtime.ProvidedValue r0 = r5.provides(r0)
            r4[r3] = r0
            r0 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | 8
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r4, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r6, (androidx.compose.runtime.Composer) r1, (int) r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0194
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0194:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.endRestartGroup()
            if (r8 != 0) goto L_0x019b
            goto L_0x01ae
        L_0x019b:
            androidx.compose.material3.TabKt$TabTransition$1 r9 = new androidx.compose.material3.TabKt$TabTransition$1
            r0 = r9
            r1 = r18
            r3 = r20
            r5 = r22
            r6 = r23
            r7 = r25
            r0.<init>(r1, r3, r5, r6, r7)
            r8.updateScope(r9)
        L_0x01ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m34629TabTransitionKlgxPg(long, long, boolean, of.o, androidx.compose.runtime.Composer, int):void");
    }

    /* renamed from: TabTransition_Klgx_Pg$lambda-5  reason: not valid java name */
    private static final long m34630TabTransition_Klgx_Pg$lambda5(State<Color> state) {
        return state.getValue().m35681unboximpl();
    }

    /* access modifiers changed from: private */
    public static final void placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i, int i2, int i3, int i4) {
        float f;
        Density density2 = density;
        int i5 = i3;
        int i6 = i4;
        if (i5 == i6) {
            f = SingleLineTextBaselineWithIcon;
        } else {
            f = DoubleLineTextBaselineWithIcon;
        }
        int r3 = density.m38443roundToPx0680j_4(f) + density.m38443roundToPx0680j_4(PrimaryNavigationTabTokens.INSTANCE.m35152getActiveIndicatorHeightD9Ej5fM());
        int height = (placeable2.getHeight() + density.m38442roundToPxR2X_6o(IconDistanceFromBaseline)) - i5;
        int i7 = (i2 - i6) - r3;
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, (i - placeable.getWidth()) / 2, i7, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.placeRelative$default(placementScope2, placeable2, (i - placeable2.getWidth()) / 2, i7 - height, 0.0f, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void placeTextOrIcon(Placeable.PlacementScope placementScope, Placeable placeable, int i) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i - placeable.getHeight()) / 2, 0.0f, 4, (Object) null);
    }
}
