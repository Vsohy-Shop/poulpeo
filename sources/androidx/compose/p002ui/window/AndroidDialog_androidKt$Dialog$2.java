package androidx.compose.p002ui.window;

import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2 */
/* compiled from: AndroidDialog.android.kt */
final class AndroidDialog_androidKt$Dialog$2 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ DialogWrapper $dialog;
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ C13074a<C11921v> $onDismissRequest;
    final /* synthetic */ DialogProperties $properties;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidDialog_androidKt$Dialog$2(DialogWrapper dialogWrapper, C13074a<C11921v> aVar, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        super(0);
        this.$dialog = dialogWrapper;
        this.$onDismissRequest = aVar;
        this.$properties = dialogProperties;
        this.$layoutDirection = layoutDirection;
    }

    public final void invoke() {
        this.$dialog.updateParameters(this.$onDismissRequest, this.$properties, this.$layoutDirection);
    }
}
