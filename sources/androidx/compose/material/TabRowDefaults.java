package androidx.compose.material;

import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,517:1\n76#2:518\n76#2:519\n135#3:520\n154#4:521\n154#4:522\n154#4:523\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults\n*L\n367#1:518\n384#1:519\n404#1:520\n431#1:521\n436#1:522\n441#1:523\n*E\n"})
/* compiled from: TabRow.kt */
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final float DividerOpacity = 0.12f;
    private static final float DividerThickness = C1232Dp.m38468constructorimpl((float) 1);
    public static final TabRowDefaults INSTANCE = new TabRowDefaults();
    private static final float IndicatorHeight = C1232Dp.m38468constructorimpl((float) 2);
    private static final float ScrollableTabRowPadding = C1232Dp.m38468constructorimpl((float) 52);

    private TabRowDefaults() {
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Divider-9IZ8Weo  reason: not valid java name */
    public final void m34164Divider9IZ8Weo(Modifier modifier, float f, long j, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        float f2;
        long j2;
        long j3;
        float f3;
        Modifier modifier3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        Composer startRestartGroup = composer.startRestartGroup(910934799);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i8 | 6;
            modifier2 = modifier;
        } else if ((i8 & 14) == 0) {
            modifier2 = modifier;
            if (startRestartGroup.changed((Object) modifier2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i8;
        } else {
            modifier2 = modifier;
            i3 = i8;
        }
        if ((i8 & 112) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                if (startRestartGroup.changed(f2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                f2 = f;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            f2 = f;
        }
        if ((i8 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (startRestartGroup.changed(j2)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                j2 = j;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i8 & 7168) == 0) {
                if (startRestartGroup.changed((Object) this)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i8 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i9 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    f3 = DividerThickness;
                    i3 &= -113;
                } else {
                    f3 = f2;
                }
                if ((i2 & 4) != 0) {
                    j2 = Color.m35670copywmQWz5c$default(((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                    i3 &= -897;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                modifier3 = modifier2;
                f3 = f2;
            }
            long j4 = j2;
            int i10 = i3;
            j3 = j4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(910934799, i10, -1, "androidx.compose.material.TabRowDefaults.Divider (TabRow.kt:363)");
            }
            DividerKt.m33987DivideroMI9zvI(modifier3, j3, f3, 0.0f, startRestartGroup, (i10 & 14) | ((i10 >> 3) & 112) | ((i10 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            f3 = f2;
            j3 = j2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TabRowDefaults$Divider$1(this, modifier3, f3, j3, i, i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Indicator-9IZ8Weo  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m34165Indicator9IZ8Weo(androidx.compose.p002ui.Modifier r17, float r18, long r19, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r16 = this;
            r6 = r22
            r0 = 1499002201(0x5958f559, float:3.81677235E15)
            r1 = r21
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r6 | 6
            r4 = r3
            r3 = r17
            goto L_0x0029
        L_0x0015:
            r3 = r6 & 14
            if (r3 != 0) goto L_0x0026
            r3 = r17
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r6
            goto L_0x0029
        L_0x0026:
            r3 = r17
            r4 = r6
        L_0x0029:
            r5 = r6 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0042
            r5 = r23 & 2
            if (r5 != 0) goto L_0x003c
            r5 = r18
            boolean r7 = r1.changed((float) r5)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003c:
            r5 = r18
        L_0x003e:
            r7 = 16
        L_0x0040:
            r4 = r4 | r7
            goto L_0x0044
        L_0x0042:
            r5 = r18
        L_0x0044:
            r7 = r6 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x005d
            r7 = r23 & 4
            if (r7 != 0) goto L_0x0057
            r7 = r19
            boolean r9 = r1.changed((long) r7)
            if (r9 == 0) goto L_0x0059
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r7 = r19
        L_0x0059:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r9
            goto L_0x005f
        L_0x005d:
            r7 = r19
        L_0x005f:
            r9 = r23 & 8
            if (r9 == 0) goto L_0x0066
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0079
        L_0x0066:
            r9 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0079
            r9 = r16
            boolean r10 = r1.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x0075
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r4 = r4 | r10
            goto L_0x007b
        L_0x0079:
            r9 = r16
        L_0x007b:
            r4 = r4 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r4 != r10) goto L_0x0090
            boolean r4 = r1.getSkipping()
            if (r4 != 0) goto L_0x0088
            goto L_0x0090
        L_0x0088:
            r1.skipToGroupEnd()
            r2 = r3
            r3 = r5
        L_0x008d:
            r4 = r7
            goto L_0x00f5
        L_0x0090:
            r1.startDefaults()
            r4 = r6 & 1
            if (r4 == 0) goto L_0x00a4
            boolean r4 = r1.getDefaultsInvalid()
            if (r4 == 0) goto L_0x009e
            goto L_0x00a4
        L_0x009e:
            r1.skipToGroupEnd()
            r2 = r3
            r3 = r5
            goto L_0x00c5
        L_0x00a4:
            if (r2 == 0) goto L_0x00a9
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00aa
        L_0x00a9:
            r2 = r3
        L_0x00aa:
            r3 = r23 & 2
            if (r3 == 0) goto L_0x00b1
            float r3 = IndicatorHeight
            goto L_0x00b2
        L_0x00b1:
            r3 = r5
        L_0x00b2:
            r4 = r23 & 4
            if (r4 == 0) goto L_0x00c5
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.material.ContentColorKt.getLocalContentColor()
            java.lang.Object r4 = r1.consume(r4)
            androidx.compose.ui.graphics.Color r4 = (androidx.compose.p002ui.graphics.Color) r4
            long r4 = r4.m35681unboximpl()
            r7 = r4
        L_0x00c5:
            r1.endDefaults()
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x00d4
            r4 = -1
            java.lang.String r5 = "androidx.compose.material.TabRowDefaults.Indicator (TabRow.kt:380)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r6, r4, r5)
        L_0x00d4:
            r0 = 0
            r4 = 0
            r5 = 1
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r2, r0, r5, r4)
            androidx.compose.ui.Modifier r10 = androidx.compose.foundation.layout.SizeKt.m33324height3ABfNKs(r0, r3)
            r13 = 0
            r14 = 2
            r15 = 0
            r11 = r7
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BackgroundKt.m32957backgroundbw27NRU$default(r10, r11, r13, r14, r15)
            r4 = 0
            androidx.compose.foundation.layout.BoxKt.Box(r0, r1, r4)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x008d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L_0x008d
        L_0x00f5:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.endRestartGroup()
            if (r8 != 0) goto L_0x00fc
            goto L_0x010b
        L_0x00fc:
            androidx.compose.material.TabRowDefaults$Indicator$1 r10 = new androidx.compose.material.TabRowDefaults$Indicator$1
            r0 = r10
            r1 = r16
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r8.updateScope(r10)
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowDefaults.m34165Indicator9IZ8Weo(androidx.compose.ui.Modifier, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: getDividerThickness-D9Ej5fM  reason: not valid java name */
    public final float m34166getDividerThicknessD9Ej5fM() {
        return DividerThickness;
    }

    /* renamed from: getIndicatorHeight-D9Ej5fM  reason: not valid java name */
    public final float m34167getIndicatorHeightD9Ej5fM() {
        return IndicatorHeight;
    }

    /* renamed from: getScrollableTabRowPadding-D9Ej5fM  reason: not valid java name */
    public final float m34168getScrollableTabRowPaddingD9Ej5fM() {
        return ScrollableTabRowPadding;
    }

    public final Modifier tabIndicatorOffset(Modifier modifier, TabPosition tabPosition) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(tabPosition, "currentTabPosition");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1(tabPosition);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new TabRowDefaults$tabIndicatorOffset$2(tabPosition));
    }
}
