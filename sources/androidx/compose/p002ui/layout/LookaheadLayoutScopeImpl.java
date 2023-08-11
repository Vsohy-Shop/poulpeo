package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.node.NodeCoordinator;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13090q;

@SourceDebugExtension({"SMAP\nLookaheadLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutScopeImpl\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,200:1\n135#2:201\n135#2:202\n*S KotlinDebug\n*F\n+ 1 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutScopeImpl\n*L\n173#1:201\n194#1:202\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LookaheadLayoutScopeImpl */
/* compiled from: LookaheadLayout.kt */
final class LookaheadLayoutScopeImpl implements LookaheadLayoutScope {
    private NodeCoordinator root;

    public final NodeCoordinator getRoot() {
        return this.root;
    }

    public Modifier intermediateLayout(Modifier modifier, C13090q<? super MeasureScope, ? super Measurable, ? super Constraints, ? super IntSize, ? extends MeasureResult> qVar) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(qVar, "measure");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C1047xcead6af7(qVar);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new LookaheadIntermediateLayoutModifierImpl(qVar, function1));
    }

    public Modifier onPlaced(Modifier modifier, C13088o<? super LookaheadLayoutCoordinates, ? super LookaheadLayoutCoordinates, C11921v> oVar) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(oVar, "onPlaced");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new LookaheadLayoutScopeImpl$onPlaced$$inlined$debugInspectorInfo$1(oVar);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new LookaheadLayoutScopeImpl$onPlaced$2(oVar, this));
    }

    public final void setRoot(NodeCoordinator nodeCoordinator) {
        this.root = nodeCoordinator;
    }
}
