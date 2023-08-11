package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.focus.FocusManager;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt$LocalFocusManager$1 */
/* compiled from: CompositionLocals.kt */
final class CompositionLocalsKt$LocalFocusManager$1 extends C12777p implements C13074a<FocusManager> {
    public static final CompositionLocalsKt$LocalFocusManager$1 INSTANCE = new CompositionLocalsKt$LocalFocusManager$1();

    CompositionLocalsKt$LocalFocusManager$1() {
        super(0);
    }

    public final FocusManager invoke() {
        Void unused = CompositionLocalsKt.noLocalProvidedFor("LocalFocusManager");
        throw new KotlinNothingValueException();
    }
}
