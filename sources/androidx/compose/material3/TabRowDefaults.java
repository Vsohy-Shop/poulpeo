package androidx.compose.material3;

import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* compiled from: TabRow.kt */
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final TabRowDefaults INSTANCE = new TabRowDefaults();

    private TabRowDefaults() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Indicator-9IZ8Weo  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m34636Indicator9IZ8Weo(androidx.compose.p002ui.Modifier r14, float r15, long r16, androidx.compose.runtime.Composer r18, int r19, int r20) {
        /*
            r13 = this;
            r6 = r19
            r0 = 1454716052(0x56b53494, float:9.9618713E13)
            r1 = r18
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r20 & 1
            if (r2 == 0) goto L_0x0014
            r3 = r6 | 6
            r4 = r3
            r3 = r14
            goto L_0x0026
        L_0x0014:
            r3 = r6 & 14
            if (r3 != 0) goto L_0x0024
            r3 = r14
            boolean r4 = r1.changed((java.lang.Object) r14)
            if (r4 == 0) goto L_0x0021
            r4 = 4
            goto L_0x0022
        L_0x0021:
            r4 = 2
        L_0x0022:
            r4 = r4 | r6
            goto L_0x0026
        L_0x0024:
            r3 = r14
            r4 = r6
        L_0x0026:
            r5 = r20 & 2
            if (r5 == 0) goto L_0x002d
            r4 = r4 | 48
            goto L_0x003f
        L_0x002d:
            r7 = r6 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x003f
            r7 = r15
            boolean r8 = r1.changed((float) r15)
            if (r8 == 0) goto L_0x003b
            r8 = 32
            goto L_0x003d
        L_0x003b:
            r8 = 16
        L_0x003d:
            r4 = r4 | r8
            goto L_0x0040
        L_0x003f:
            r7 = r15
        L_0x0040:
            r8 = r6 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0059
            r8 = r20 & 4
            if (r8 != 0) goto L_0x0053
            r8 = r16
            boolean r10 = r1.changed((long) r8)
            if (r10 == 0) goto L_0x0055
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0053:
            r8 = r16
        L_0x0055:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r4 = r4 | r10
            goto L_0x005b
        L_0x0059:
            r8 = r16
        L_0x005b:
            r4 = r4 & 731(0x2db, float:1.024E-42)
            r10 = 146(0x92, float:2.05E-43)
            if (r4 != r10) goto L_0x0070
            boolean r4 = r1.getSkipping()
            if (r4 != 0) goto L_0x0068
            goto L_0x0070
        L_0x0068:
            r1.skipToGroupEnd()
            r2 = r3
            r3 = r7
            r4 = r8
            goto L_0x00d9
        L_0x0070:
            r1.startDefaults()
            r4 = r6 & 1
            if (r4 == 0) goto L_0x0085
            boolean r4 = r1.getDefaultsInvalid()
            if (r4 == 0) goto L_0x007e
            goto L_0x0085
        L_0x007e:
            r1.skipToGroupEnd()
            r2 = r3
            r3 = r7
        L_0x0083:
            r4 = r8
            goto L_0x00aa
        L_0x0085:
            if (r2 == 0) goto L_0x008a
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x008b
        L_0x008a:
            r2 = r3
        L_0x008b:
            if (r5 == 0) goto L_0x0094
            androidx.compose.material3.tokens.PrimaryNavigationTabTokens r3 = androidx.compose.material3.tokens.PrimaryNavigationTabTokens.INSTANCE
            float r3 = r3.m35152getActiveIndicatorHeightD9Ej5fM()
            goto L_0x0095
        L_0x0094:
            r3 = r7
        L_0x0095:
            r4 = r20 & 4
            if (r4 == 0) goto L_0x0083
            androidx.compose.material3.MaterialTheme r4 = androidx.compose.material3.MaterialTheme.INSTANCE
            r5 = 6
            androidx.compose.material3.ColorScheme r4 = r4.getColorScheme(r1, r5)
            androidx.compose.material3.tokens.PrimaryNavigationTabTokens r5 = androidx.compose.material3.tokens.PrimaryNavigationTabTokens.INSTANCE
            androidx.compose.material3.tokens.ColorSchemeKeyTokens r5 = r5.getActiveIndicatorColor()
            long r4 = androidx.compose.material3.ColorSchemeKt.fromToken(r4, r5)
        L_0x00aa:
            r1.endDefaults()
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x00b9
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:372)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r6, r7, r8)
        L_0x00b9:
            r0 = 0
            r7 = 0
            r8 = 1
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r2, r0, r8, r7)
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.m33324height3ABfNKs(r0, r3)
            r10 = 0
            r11 = 2
            r12 = 0
            r8 = r4
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BackgroundKt.m32957backgroundbw27NRU$default(r7, r8, r10, r11, r12)
            r7 = 0
            androidx.compose.foundation.layout.BoxKt.Box(r0, r1, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x00d9
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00d9:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.endRestartGroup()
            if (r8 != 0) goto L_0x00e0
            goto L_0x00ee
        L_0x00e0:
            androidx.compose.material3.TabRowDefaults$Indicator$1 r9 = new androidx.compose.material3.TabRowDefaults$Indicator$1
            r0 = r9
            r1 = r13
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r8.updateScope(r9)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowDefaults.m34636Indicator9IZ8Weo(androidx.compose.ui.Modifier, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    public final long getContainerColor(Composer composer, int i) {
        composer.startReplaceableGroup(-2026555673);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2026555673, i, -1, "androidx.compose.material3.TabRowDefaults.<get-containerColor> (TabRow.kt:356)");
        }
        long color = ColorSchemeKt.toColor(PrimaryNavigationTabTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    public final long getContentColor(Composer composer, int i) {
        composer.startReplaceableGroup(1163072359);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1163072359, i, -1, "androidx.compose.material3.TabRowDefaults.<get-contentColor> (TabRow.kt:360)");
        }
        long color = ColorSchemeKt.toColor(PrimaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
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
