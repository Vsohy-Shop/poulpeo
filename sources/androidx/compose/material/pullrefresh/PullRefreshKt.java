package androidx.compose.material.pullrefresh;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p002ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nPullRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefresh.kt\nandroidx/compose/material/pullrefresh/PullRefreshKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,119:1\n135#2:120\n146#2:121\n135#2:122\n146#2:123\n*S KotlinDebug\n*F\n+ 1 PullRefresh.kt\nandroidx/compose/material/pullrefresh/PullRefreshKt\n*L\n47#1:120\n47#1:121\n82#1:122\n82#1:123\n*E\n"})
/* compiled from: PullRefresh.kt */
public final class PullRefreshKt {
    @ExperimentalMaterialApi
    public static final Modifier pullRefresh(Modifier modifier, PullRefreshState pullRefreshState, boolean z) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(pullRefreshState, "state");
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$1(pullRefreshState, z) : InspectableValueKt.getNoInspectorInfo(), pullRefresh(Modifier.Companion, new PullRefreshKt$pullRefresh$2$1(pullRefreshState), new PullRefreshKt$pullRefresh$2$2(pullRefreshState), z));
    }

    public static /* synthetic */ Modifier pullRefresh$default(Modifier modifier, PullRefreshState pullRefreshState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return pullRefresh(modifier, pullRefreshState, z);
    }

    public static /* synthetic */ Modifier pullRefresh$default(Modifier modifier, Function1 function1, C13088o oVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return pullRefresh(modifier, function1, oVar, z);
    }

    @ExperimentalMaterialApi
    public static final Modifier pullRefresh(Modifier modifier, Function1<? super Float, Float> function1, C13088o<? super Float, ? super C12074d<? super Float>, ? extends Object> oVar, boolean z) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "onPull");
        C12775o.m28639i(oVar, "onRelease");
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2(function1, oVar, z) : InspectableValueKt.getNoInspectorInfo(), NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, new PullRefreshNestedScrollConnection(function1, oVar, z), (NestedScrollDispatcher) null, 2, (Object) null));
    }
}
