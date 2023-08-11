package androidx.compose.p002ui.node;

import androidx.compose.p002ui.layout.AlignmentLine;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines$recalculate$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,246:1\n215#2,2:247\n1855#3,2:249\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines$recalculate$1\n*L\n163#1:247,2\n170#1:249,2\n*E\n"})
/* renamed from: androidx.compose.ui.node.AlignmentLines$recalculate$1 */
/* compiled from: LayoutNodeAlignmentLines.kt */
final class AlignmentLines$recalculate$1 extends C12777p implements Function1<AlignmentLinesOwner, C11921v> {
    final /* synthetic */ AlignmentLines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlignmentLines$recalculate$1(AlignmentLines alignmentLines) {
        super(1);
        this.this$0 = alignmentLines;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AlignmentLinesOwner) obj);
        return C11921v.f18618a;
    }

    public final void invoke(AlignmentLinesOwner alignmentLinesOwner) {
        C12775o.m28639i(alignmentLinesOwner, "childOwner");
        if (alignmentLinesOwner.isPlaced()) {
            if (alignmentLinesOwner.getAlignmentLines().getDirty$ui_release()) {
                alignmentLinesOwner.layoutChildren();
            }
            Map access$getAlignmentLineMap$p = alignmentLinesOwner.getAlignmentLines().alignmentLineMap;
            AlignmentLines alignmentLines = this.this$0;
            for (Map.Entry entry : access$getAlignmentLineMap$p.entrySet()) {
                alignmentLines.addAlignmentLine((AlignmentLine) entry.getKey(), ((Number) entry.getValue()).intValue(), alignmentLinesOwner.getInnerCoordinator());
            }
            NodeCoordinator wrappedBy$ui_release = alignmentLinesOwner.getInnerCoordinator().getWrappedBy$ui_release();
            C12775o.m28636f(wrappedBy$ui_release);
            while (!C12775o.m28634d(wrappedBy$ui_release, this.this$0.getAlignmentLinesOwner().getInnerCoordinator())) {
                Set<AlignmentLine> keySet = this.this$0.getAlignmentLinesMap(wrappedBy$ui_release).keySet();
                AlignmentLines alignmentLines2 = this.this$0;
                for (AlignmentLine alignmentLine : keySet) {
                    alignmentLines2.addAlignmentLine(alignmentLine, alignmentLines2.getPositionFor(wrappedBy$ui_release, alignmentLine), wrappedBy$ui_release);
                }
                wrappedBy$ui_release = wrappedBy$ui_release.getWrappedBy$ui_release();
                C12775o.m28636f(wrappedBy$ui_release);
            }
        }
    }
}
