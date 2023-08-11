package androidx.compose.material3.internal;

import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* compiled from: ExposedDropdownMenuPopup.kt */
final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6 implements MeasurePolicy {
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ PopupLayout $popupLayout;

    ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6(PopupLayout popupLayout, LayoutDirection layoutDirection) {
        this.$popupLayout = popupLayout;
        this.$layoutDirection = layoutDirection;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m34760measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        C12775o.m28639i(measureScope, "$this$Layout");
        C12775o.m28639i(list, "<anonymous parameter 0>");
        this.$popupLayout.setParentLayoutDirection(this.$layoutDirection);
        return MeasureScope.layout$default(measureScope, 0, 0, (Map) null, ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6$measure$1.INSTANCE, 4, (Object) null);
    }
}
