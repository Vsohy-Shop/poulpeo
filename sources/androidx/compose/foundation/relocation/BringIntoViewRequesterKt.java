package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,154:1\n135#2:155\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterKt\n*L\n103#1:155\n*E\n"})
/* compiled from: BringIntoViewRequester.kt */
public final class BringIntoViewRequesterKt {
    @ExperimentalFoundationApi
    public static final BringIntoViewRequester BringIntoViewRequester() {
        return new BringIntoViewRequesterImpl();
    }

    @ExperimentalFoundationApi
    public static final Modifier bringIntoViewRequester(Modifier modifier, BringIntoViewRequester bringIntoViewRequester) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(bringIntoViewRequester, "bringIntoViewRequester");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0591xf3bab713(bringIntoViewRequester);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new BringIntoViewRequesterKt$bringIntoViewRequester$2(bringIntoViewRequester));
    }
}
