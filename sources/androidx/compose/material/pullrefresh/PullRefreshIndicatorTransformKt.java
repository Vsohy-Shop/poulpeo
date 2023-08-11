package androidx.compose.material.pullrefresh;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.DrawModifierKt;
import androidx.compose.p002ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p002ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPullRefreshIndicatorTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,75:1\n135#2:76\n146#2:77\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt\n*L\n42#1:76\n42#1:77\n*E\n"})
/* compiled from: PullRefreshIndicatorTransform.kt */
public final class PullRefreshIndicatorTransformKt {
    @ExperimentalMaterialApi
    public static final Modifier pullRefreshIndicatorTransform(Modifier modifier, PullRefreshState pullRefreshState, boolean z) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(pullRefreshState, "state");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0824xed34cb43(pullRefreshState, z);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return InspectableValueKt.inspectableWrapper(modifier, function1, GraphicsLayerModifierKt.graphicsLayer(DrawModifierKt.drawWithContent(Modifier.Companion, C0825xe053f546.INSTANCE), new C0826xe053f547(pullRefreshState, z)));
    }

    public static /* synthetic */ Modifier pullRefreshIndicatorTransform$default(Modifier modifier, PullRefreshState pullRefreshState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return pullRefreshIndicatorTransform(modifier, pullRefreshState, z);
    }
}
