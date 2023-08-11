package androidx.compose.material3.internal;

import androidx.compose.p002ui.window.PopupPositionProvider;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: ExposedDropdownMenuPopup.kt */
final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3 extends C12777p implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ PopupLayout $popupLayout;
    final /* synthetic */ PopupPositionProvider $popupPositionProvider;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3(PopupLayout popupLayout, PopupPositionProvider popupPositionProvider) {
        super(1);
        this.$popupLayout = popupLayout;
        this.$popupPositionProvider = popupPositionProvider;
    }

    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        C12775o.m28639i(disposableEffectScope, "$this$DisposableEffect");
        this.$popupLayout.setPositionProvider(this.$popupPositionProvider);
        this.$popupLayout.updatePosition();
        return new C0933x9f31cd02();
    }
}
