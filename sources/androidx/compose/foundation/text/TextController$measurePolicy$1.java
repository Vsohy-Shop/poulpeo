package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.layout.AlignmentLineKt;
import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11915r;

@SourceDebugExtension({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$measurePolicy$1\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n80#2,3:703\n83#2:710\n84#2:712\n85#2:714\n69#3,4:706\n74#3:713\n1#4:711\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$measurePolicy$1\n*L\n343#1:703,3\n343#1:710\n343#1:712\n343#1:714\n343#1:706,4\n343#1:713\n343#1:711\n*E\n"})
/* compiled from: CoreText.kt */
public final class TextController$measurePolicy$1 implements MeasurePolicy {
    final /* synthetic */ TextController this$0;

    TextController$measurePolicy$1(TextController textController) {
        this.this$0 = textController;
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        return IntSize.m38627getHeightimpl(TextDelegate.m33706layoutNN6EwU$default(this.this$0.getState().getTextDelegate(), ConstraintsKt.Constraints(0, i, 0, Integer.MAX_VALUE), intrinsicMeasureScope.getLayoutDirection(), (TextLayoutResult) null, 4, (Object) null).m37948getSizeYbymL2g());
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        this.this$0.getState().getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
        return this.this$0.getState().getTextDelegate().getMaxIntrinsicWidth();
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33698measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        boolean z;
        int i;
        C11906l lVar;
        SelectionRegistrar access$getSelectionRegistrar$p;
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        C12775o.m28639i(measureScope2, "$this$measure");
        C12775o.m28639i(list2, "measurables");
        this.this$0.getState().getLayoutInvalidation();
        TextLayoutResult layoutResult = this.this$0.getState().getLayoutResult();
        TextLayoutResult r4 = this.this$0.getState().getTextDelegate().m33709layoutNN6EwU(j, measureScope.getLayoutDirection(), layoutResult);
        if (!C12775o.m28634d(layoutResult, r4)) {
            this.this$0.getState().getOnTextLayout().invoke(r4);
            if (layoutResult != null) {
                TextController textController = this.this$0;
                if (!C12775o.m28634d(layoutResult.getLayoutInput().getText(), r4.getLayoutInput().getText()) && (access$getSelectionRegistrar$p = textController.selectionRegistrar) != null) {
                    access$getSelectionRegistrar$p.notifySelectableChange(textController.getState().getSelectableId());
                }
            }
        }
        this.this$0.getState().setLayoutResult(r4);
        if (list.size() >= r4.getPlaceholderRects().size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            List<Rect> placeholderRects = r4.getPlaceholderRects();
            ArrayList arrayList = new ArrayList(placeholderRects.size());
            int size = placeholderRects.size();
            int i2 = 0;
            while (i2 < size) {
                Rect rect = placeholderRects.get(i2);
                if (rect != null) {
                    i = size;
                    lVar = new C11906l(((Measurable) list2.get(i2)).m37365measureBRTryo0(ConstraintsKt.Constraints$default(0, (int) ((float) Math.floor((double) rect.getWidth())), 0, (int) ((float) Math.floor((double) rect.getHeight())), 5, (Object) null)), IntOffset.m38577boximpl(IntOffsetKt.IntOffset(C13265c.m30134c(rect.getLeft()), C13265c.m30134c(rect.getTop()))));
                } else {
                    i = size;
                    lVar = null;
                }
                if (lVar != null) {
                    arrayList.add(lVar);
                }
                i2++;
                size = i;
            }
            return measureScope2.layout(IntSize.m38628getWidthimpl(r4.m37948getSizeYbymL2g()), IntSize.m38627getHeightimpl(r4.m37948getSizeYbymL2g()), C12716r0.m28419j(C11915r.m25707a(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(C13265c.m30134c(r4.getFirstBaseline()))), C11915r.m25707a(AlignmentLineKt.getLastBaseline(), Integer.valueOf(C13265c.m30134c(r4.getLastBaseline())))), new TextController$measurePolicy$1$measure$2(arrayList));
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        return IntSize.m38627getHeightimpl(TextDelegate.m33706layoutNN6EwU$default(this.this$0.getState().getTextDelegate(), ConstraintsKt.Constraints(0, i, 0, Integer.MAX_VALUE), intrinsicMeasureScope.getLayoutDirection(), (TextLayoutResult) null, 4, (Object) null).m37948getSizeYbymL2g());
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        this.this$0.getState().getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
        return this.this$0.getState().getTextDelegate().getMinIntrinsicWidth();
    }
}
