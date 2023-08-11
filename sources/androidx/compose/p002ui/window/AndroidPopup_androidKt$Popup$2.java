package androidx.compose.p002ui.window;

import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,824:1\n62#2,5:825\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2\n*L\n271#1:825,5\n*E\n"})
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2 */
/* compiled from: AndroidPopup.android.kt */
final class AndroidPopup_androidKt$Popup$2 extends C12777p implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ C13074a<C11921v> $onDismissRequest;
    final /* synthetic */ PopupLayout $popupLayout;
    final /* synthetic */ PopupProperties $properties;
    final /* synthetic */ String $testTag;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$2(PopupLayout popupLayout, C13074a<C11921v> aVar, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        super(1);
        this.$popupLayout = popupLayout;
        this.$onDismissRequest = aVar;
        this.$properties = popupProperties;
        this.$testTag = str;
        this.$layoutDirection = layoutDirection;
    }

    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        C12775o.m28639i(disposableEffectScope, "$this$DisposableEffect");
        this.$popupLayout.show();
        this.$popupLayout.updateParameters(this.$onDismissRequest, this.$properties, this.$testTag, this.$layoutDirection);
        return new AndroidPopup_androidKt$Popup$2$invoke$$inlined$onDispose$1(this.$popupLayout);
    }
}
