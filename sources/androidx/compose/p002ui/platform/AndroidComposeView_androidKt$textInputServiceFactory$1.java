package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.text.input.PlatformTextInputService;
import androidx.compose.p002ui.text.input.TextInputService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView_androidKt$textInputServiceFactory$1 */
/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeView_androidKt$textInputServiceFactory$1 extends C12777p implements Function1<PlatformTextInputService, TextInputService> {
    public static final AndroidComposeView_androidKt$textInputServiceFactory$1 INSTANCE = new AndroidComposeView_androidKt$textInputServiceFactory$1();

    AndroidComposeView_androidKt$textInputServiceFactory$1() {
        super(1);
    }

    public final TextInputService invoke(PlatformTextInputService platformTextInputService) {
        C12775o.m28639i(platformTextInputService, "it");
        return new TextInputService(platformTextInputService);
    }
}
