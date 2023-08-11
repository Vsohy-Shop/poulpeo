package androidx.compose.material.internal;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: ExposedDropdownMenuPopup.kt */
final class PopupLayout$canCalculatePosition$2 extends C12777p implements C13074a<Boolean> {
    final /* synthetic */ PopupLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PopupLayout$canCalculatePosition$2(PopupLayout popupLayout) {
        super(0);
        this.this$0 = popupLayout;
    }

    public final Boolean invoke() {
        return Boolean.valueOf((this.this$0.getParentBounds() == null || this.this$0.m34210getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
