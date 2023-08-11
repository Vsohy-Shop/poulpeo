package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;

/* compiled from: Divider.kt */
public final class DividerKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Divider-9IZ8Weo  reason: not valid java name */
    public static final void m34395Divider9IZ8Weo(Modifier modifier, float f, long j, Composer composer, int i, int i2) {
        int i3;
        float f2;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(1562471785);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (startRestartGroup.changed((Object) modifier)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (startRestartGroup.changed(f)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if ((i2 & 4) != 0 || !startRestartGroup.changed(j)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    modifier = Modifier.Companion;
                }
                if (i8 != 0) {
                    f = DividerDefaults.INSTANCE.m34394getThicknessD9Ej5fM();
                }
                if ((i2 & 4) != 0) {
                    j = DividerDefaults.INSTANCE.getColor(startRestartGroup, 6);
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1562471785, i, -1, "androidx.compose.material3.Divider (Divider.kt:43)");
            }
            startRestartGroup.startReplaceableGroup(1232935509);
            if (C1232Dp.m38473equalsimpl0(f, C1232Dp.Companion.m38486getHairlineD9Ej5fM())) {
                f2 = C1232Dp.m38468constructorimpl(1.0f / ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
            } else {
                f2 = f;
            }
            startRestartGroup.endReplaceableGroup();
            BoxKt.Box(BackgroundKt.m32957backgroundbw27NRU$default(SizeKt.m33324height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, (Object) null), f2), j, (Shape) null, 2, (Object) null), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        float f3 = f;
        long j2 = j;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DividerKt$Divider$1(modifier2, f3, j2, i, i2));
        }
    }
}
