package androidx.compose.p002ui.window;

import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3 */
/* compiled from: AndroidPopup.android.kt */
final class AndroidPopup_androidKt$Popup$3 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ C13074a<C11921v> $onDismissRequest;
    final /* synthetic */ PopupLayout $popupLayout;
    final /* synthetic */ PopupProperties $properties;
    final /* synthetic */ String $testTag;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$3(PopupLayout popupLayout, C13074a<C11921v> aVar, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        super(0);
        this.$popupLayout = popupLayout;
        this.$onDismissRequest = aVar;
        this.$properties = popupProperties;
        this.$testTag = str;
        this.$layoutDirection = layoutDirection;
    }

    public final void invoke() {
        this.$popupLayout.updateParameters(this.$onDismissRequest, this.$properties, this.$testTag, this.$layoutDirection);
    }
}
