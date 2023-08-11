package androidx.compose.foundation.lazy.layout;

import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.SubcomposeMeasureScope;
import androidx.compose.p002ui.unit.Constraints;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: LazyLayout.kt */
final class LazyLayoutKt$LazyLayout$1$2$1 extends C12777p implements C13088o<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ LazyLayoutItemContentFactory $itemContentFactory;
    final /* synthetic */ C13088o<LazyLayoutMeasureScope, Constraints, MeasureResult> $measurePolicy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyLayoutKt$LazyLayout$1$2$1(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, C13088o<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> oVar) {
        super(2);
        this.$itemContentFactory = lazyLayoutItemContentFactory;
        this.$measurePolicy = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m33516invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m38418unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m33516invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
        C12775o.m28639i(subcomposeMeasureScope, "$this$null");
        return this.$measurePolicy.invoke(new LazyLayoutMeasureScopeImpl(this.$itemContentFactory, subcomposeMeasureScope), Constraints.m38400boximpl(j));
    }
}
