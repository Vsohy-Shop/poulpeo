package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: MaterialTheme.android.kt */
public final class MaterialTheme_androidKt {
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    public static final void PlatformMaterialTheme(C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        int i2;
        int i3;
        C12775o.m28639i(oVar, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1322912246);
        if ((i & 14) == 0) {
            if (startRestartGroup.changedInstance(oVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1322912246, i2, -1, "androidx.compose.material.PlatformMaterialTheme (MaterialTheme.android.kt:21)");
            }
            oVar.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new MaterialTheme_androidKt$PlatformMaterialTheme$1(oVar, i));
        }
    }
}
