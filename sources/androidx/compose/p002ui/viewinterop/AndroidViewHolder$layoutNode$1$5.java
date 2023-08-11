package androidx.compose.p002ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5 */
/* compiled from: AndroidViewHolder.android.kt */
public final class AndroidViewHolder$layoutNode$1$5 implements MeasurePolicy {
    final /* synthetic */ LayoutNode $layoutNode;
    final /* synthetic */ AndroidViewHolder $this_run;

    AndroidViewHolder$layoutNode$1$5(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        this.$this_run = androidViewHolder;
        this.$layoutNode = layoutNode;
    }

    private final int intrinsicHeight(int i) {
        AndroidViewHolder androidViewHolder = this.$this_run;
        ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
        C12775o.m28636f(layoutParams);
        androidViewHolder.measure(androidViewHolder.obtainMeasureSpec(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return this.$this_run.getMeasuredHeight();
    }

    private final int intrinsicWidth(int i) {
        AndroidViewHolder androidViewHolder = this.$this_run;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        AndroidViewHolder androidViewHolder2 = this.$this_run;
        ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
        C12775o.m28636f(layoutParams);
        androidViewHolder.measure(makeMeasureSpec, androidViewHolder2.obtainMeasureSpec(0, i, layoutParams.height));
        return this.$this_run.getMeasuredWidth();
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        return intrinsicHeight(i);
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        return intrinsicWidth(i);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m38705measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(list, "measurables");
        if (this.$this_run.getChildCount() == 0) {
            return MeasureScope.layout$default(measureScope, Constraints.m38414getMinWidthimpl(j), Constraints.m38413getMinHeightimpl(j), (Map) null, AndroidViewHolder$layoutNode$1$5$measure$1.INSTANCE, 4, (Object) null);
        }
        if (Constraints.m38414getMinWidthimpl(j) != 0) {
            this.$this_run.getChildAt(0).setMinimumWidth(Constraints.m38414getMinWidthimpl(j));
        }
        if (Constraints.m38413getMinHeightimpl(j) != 0) {
            this.$this_run.getChildAt(0).setMinimumHeight(Constraints.m38413getMinHeightimpl(j));
        }
        AndroidViewHolder androidViewHolder = this.$this_run;
        int r0 = Constraints.m38414getMinWidthimpl(j);
        int r1 = Constraints.m38412getMaxWidthimpl(j);
        ViewGroup.LayoutParams layoutParams = this.$this_run.getLayoutParams();
        C12775o.m28636f(layoutParams);
        int access$obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(r0, r1, layoutParams.width);
        AndroidViewHolder androidViewHolder2 = this.$this_run;
        int r2 = Constraints.m38413getMinHeightimpl(j);
        int r10 = Constraints.m38411getMaxHeightimpl(j);
        ViewGroup.LayoutParams layoutParams2 = this.$this_run.getLayoutParams();
        C12775o.m28636f(layoutParams2);
        androidViewHolder.measure(access$obtainMeasureSpec, androidViewHolder2.obtainMeasureSpec(r2, r10, layoutParams2.height));
        return MeasureScope.layout$default(measureScope, this.$this_run.getMeasuredWidth(), this.$this_run.getMeasuredHeight(), (Map) null, new AndroidViewHolder$layoutNode$1$5$measure$2(this.$this_run, this.$layoutNode), 4, (Object) null);
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        return intrinsicHeight(i);
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(list, "measurables");
        return intrinsicWidth(i);
    }
}
