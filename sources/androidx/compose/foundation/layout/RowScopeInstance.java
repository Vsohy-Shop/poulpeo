package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.SiblingsAlignedModifier;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.AlignmentLineKt;
import androidx.compose.p002ui.layout.HorizontalAlignmentLine;
import androidx.compose.p002ui.layout.Measured;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,272:1\n1#2:273\n135#3:274\n135#3:275\n135#3:276\n135#3:277\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n*L\n227#1:274\n241#1:275\n252#1:276\n265#1:277\n*E\n"})
/* compiled from: Row.kt */
public final class RowScopeInstance implements RowScope {
    public static final RowScopeInstance INSTANCE = new RowScopeInstance();

    private RowScopeInstance() {
    }

    @Stable
    public Modifier align(Modifier modifier, Alignment.Vertical vertical) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(vertical, "alignment");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new RowScopeInstance$align$$inlined$debugInspectorInfo$1(vertical);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new VerticalAlignModifier(vertical, function1));
    }

    @Stable
    public Modifier alignBy(Modifier modifier, HorizontalAlignmentLine horizontalAlignmentLine) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(horizontalAlignmentLine, "alignmentLine");
        return modifier.then(new SiblingsAlignedModifier.WithAlignmentLine(horizontalAlignmentLine, InspectableValueKt.isDebugInspectorInfoEnabled() ? new RowScopeInstance$alignBy$$inlined$debugInspectorInfo$1(horizontalAlignmentLine) : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    public Modifier alignByBaseline(Modifier modifier) {
        C12775o.m28639i(modifier, "<this>");
        return alignBy(modifier, AlignmentLineKt.getFirstBaseline());
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
                function1 = new RowScopeInstance$weight$$inlined$debugInspectorInfo$1(f, z);
            } else {
                function1 = InspectableValueKt.getNoInspectorInfo();
            }
            return modifier.then(new LayoutWeightImpl(f, z, function1));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }

    public Modifier alignBy(Modifier modifier, Function1<? super Measured, Integer> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "alignmentLineBlock");
        return modifier.then(new SiblingsAlignedModifier.WithAlignmentLineBlock(function1, InspectableValueKt.isDebugInspectorInfoEnabled() ? new RowScopeInstance$alignBy$$inlined$debugInspectorInfo$2(function1) : InspectableValueKt.getNoInspectorInfo()));
    }
}
