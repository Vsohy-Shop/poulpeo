package androidx.compose.p002ui.platform;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboardManager$1 */
/* compiled from: CompositionLocals.kt */
final class CompositionLocalsKt$LocalClipboardManager$1 extends C12777p implements C13074a<ClipboardManager> {
    public static final CompositionLocalsKt$LocalClipboardManager$1 INSTANCE = new CompositionLocalsKt$LocalClipboardManager$1();

    CompositionLocalsKt$LocalClipboardManager$1() {
        super(0);
    }

    public final ClipboardManager invoke() {
        Void unused = CompositionLocalsKt.noLocalProvidedFor("LocalClipboardManager");
        throw new KotlinNothingValueException();
    }
}
