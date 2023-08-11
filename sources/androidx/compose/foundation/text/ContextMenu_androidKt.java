package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: ContextMenu.android.kt */
public final class ContextMenu_androidKt {
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    public static final void ContextMenuArea(TextFieldSelectionManager textFieldSelectionManager, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        int i2;
        C12775o.m28639i(textFieldSelectionManager, "manager");
        C12775o.m28639i(oVar, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1985516685);
        if ((i & 112) == 0) {
            i2 = (startRestartGroup.changedInstance(oVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) != 16 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985516685, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:23)");
            }
            oVar.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ContextMenu_androidKt$ContextMenuArea$1(textFieldSelectionManager, oVar, i));
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    public static final void ContextMenuArea(SelectionManager selectionManager, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        int i2;
        C12775o.m28639i(selectionManager, "manager");
        C12775o.m28639i(oVar, "content");
        Composer startRestartGroup = composer.startRestartGroup(605522716);
        if ((i & 112) == 0) {
            i2 = (startRestartGroup.changedInstance(oVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) != 16 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(605522716, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:31)");
            }
            oVar.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ContextMenu_androidKt$ContextMenuArea$2(selectionManager, oVar, i));
        }
    }
}
