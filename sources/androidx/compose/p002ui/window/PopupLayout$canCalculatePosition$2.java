package androidx.compose.p002ui.window;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2 */
/* compiled from: AndroidPopup.android.kt */
final class PopupLayout$canCalculatePosition$2 extends C12777p implements C13074a<Boolean> {
    final /* synthetic */ PopupLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PopupLayout$canCalculatePosition$2(PopupLayout popupLayout) {
        super(0);
        this.this$0 = popupLayout;
    }

    public final Boolean invoke() {
        return Boolean.valueOf((this.this$0.getParentLayoutCoordinates() == null || this.this$0.m38716getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
