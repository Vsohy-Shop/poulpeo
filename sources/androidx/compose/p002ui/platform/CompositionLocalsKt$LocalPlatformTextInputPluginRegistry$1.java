package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.text.input.PlatformTextInputPluginRegistry;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt$LocalPlatformTextInputPluginRegistry$1 */
/* compiled from: CompositionLocals.kt */
final class CompositionLocalsKt$LocalPlatformTextInputPluginRegistry$1 extends C12777p implements C13074a<PlatformTextInputPluginRegistry> {
    public static final CompositionLocalsKt$LocalPlatformTextInputPluginRegistry$1 INSTANCE = new CompositionLocalsKt$LocalPlatformTextInputPluginRegistry$1();

    CompositionLocalsKt$LocalPlatformTextInputPluginRegistry$1() {
        super(0);
    }

    public final PlatformTextInputPluginRegistry invoke() {
        throw new IllegalStateException("No PlatformTextInputServiceProvider provided".toString());
    }
}
