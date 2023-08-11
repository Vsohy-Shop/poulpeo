package androidx.compose.foundation.relocation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBringIntoViewResponder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.android.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponder_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,48:1\n76#2:49\n36#3:50\n1114#4,6:51\n*S KotlinDebug\n*F\n+ 1 BringIntoViewResponder.android.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponder_androidKt\n*L\n30#1:49\n31#1:50\n31#1:51,6\n*E\n"})
/* compiled from: BringIntoViewResponder.android.kt */
public final class BringIntoViewResponder_androidKt {
    @Composable
    public static final BringIntoViewParent rememberDefaultBringIntoViewParent(Composer composer, int i) {
        composer.startReplaceableGroup(-1031410916);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1031410916, i, -1, "androidx.compose.foundation.relocation.rememberDefaultBringIntoViewParent (BringIntoViewResponder.android.kt:28)");
        }
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) view);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AndroidBringIntoViewParent(view);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        AndroidBringIntoViewParent androidBringIntoViewParent = (AndroidBringIntoViewParent) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidBringIntoViewParent;
    }

    /* access modifiers changed from: private */
    public static final Rect toRect(androidx.compose.p002ui.geometry.Rect rect) {
        return new Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }
}
