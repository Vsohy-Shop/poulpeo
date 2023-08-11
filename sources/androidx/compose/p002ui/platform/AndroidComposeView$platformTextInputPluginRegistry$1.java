package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.text.input.PlatformTextInput;
import androidx.compose.p002ui.text.input.PlatformTextInputAdapter;
import androidx.compose.p002ui.text.input.PlatformTextInputPlugin;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$platformTextInputPluginRegistry$1 */
/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeView$platformTextInputPluginRegistry$1 extends C12777p implements C13088o<PlatformTextInputPlugin<?>, PlatformTextInput, PlatformTextInputAdapter> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidComposeView$platformTextInputPluginRegistry$1(AndroidComposeView androidComposeView) {
        super(2);
        this.this$0 = androidComposeView;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.compose.ui.text.input.PlatformTextInputPlugin<?>, androidx.compose.ui.text.input.PlatformTextInputPlugin, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p002ui.text.input.PlatformTextInputAdapter invoke(androidx.compose.p002ui.text.input.PlatformTextInputPlugin<?> r2, androidx.compose.p002ui.text.input.PlatformTextInput r3) {
        /*
            r1 = this;
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            java.lang.String r0 = "platformTextInput"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            androidx.compose.ui.platform.AndroidComposeView r0 = r1.this$0
            androidx.compose.ui.text.input.PlatformTextInputAdapter r2 = r2.createAdapter(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.AndroidComposeView$platformTextInputPluginRegistry$1.invoke(androidx.compose.ui.text.input.PlatformTextInputPlugin, androidx.compose.ui.text.input.PlatformTextInput):androidx.compose.ui.text.input.PlatformTextInputAdapter");
    }
}
