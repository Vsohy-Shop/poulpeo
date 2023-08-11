package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,287:1\n135#2:288\n135#2:289\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n*L\n243#1:288\n255#1:289\n*E\n"})
/* compiled from: Box.kt */
public final class BoxScopeInstance implements BoxScope {
    public static final BoxScopeInstance INSTANCE = new BoxScopeInstance();

    private BoxScopeInstance() {
    }

    @Stable
    public Modifier align(Modifier modifier, Alignment alignment) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(alignment, "alignment");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new BoxScopeInstance$align$$inlined$debugInspectorInfo$1(alignment);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new BoxChildData(alignment, false, function1));
    }

    @Stable
    public Modifier matchParentSize(Modifier modifier) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        Alignment center = Alignment.Companion.getCenter();
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new BoxScopeInstance$matchParentSize$$inlined$debugInspectorInfo$1();
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new BoxChildData(center, true, function1));
    }
}
