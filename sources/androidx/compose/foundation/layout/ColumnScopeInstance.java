package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.SiblingsAlignedModifier;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.Measured;
import androidx.compose.p002ui.layout.VerticalAlignmentLine;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,250:1\n1#2:251\n135#3:252\n135#3:253\n135#3:254\n135#3:255\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n*L\n207#1:252\n221#1:253\n232#1:254\n243#1:255\n*E\n"})
/* compiled from: Column.kt */
public final class ColumnScopeInstance implements ColumnScope {
    public static final ColumnScopeInstance INSTANCE = new ColumnScopeInstance();

    private ColumnScopeInstance() {
    }

    @Stable
    public Modifier align(Modifier modifier, Alignment.Horizontal horizontal) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(horizontal, "alignment");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new ColumnScopeInstance$align$$inlined$debugInspectorInfo$1(horizontal);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new HorizontalAlignModifier(horizontal, function1));
    }

    @Stable
    public Modifier alignBy(Modifier modifier, VerticalAlignmentLine verticalAlignmentLine) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(verticalAlignmentLine, "alignmentLine");
        return modifier.then(new SiblingsAlignedModifier.WithAlignmentLine(verticalAlignmentLine, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ColumnScopeInstance$alignBy$$inlined$debugInspectorInfo$1(verticalAlignmentLine) : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    public Modifier weight(Modifier modifier, float f, boolean z) {
        boolean z2;
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (((double) f) > 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                function1 = new ColumnScopeInstance$weight$$inlined$debugInspectorInfo$1(f, z);
            } else {
                function1 = InspectableValueKt.getNoInspectorInfo();
            }
            return modifier.then(new LayoutWeightImpl(f, z, function1));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }

    @Stable
    public Modifier alignBy(Modifier modifier, Function1<? super Measured, Integer> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "alignmentLineBlock");
        return modifier.then(new SiblingsAlignedModifier.WithAlignmentLineBlock(function1, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ColumnScopeInstance$alignBy$$inlined$debugInspectorInfo$2(function1) : InspectableValueKt.getNoInspectorInfo()));
    }
}
