package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.input.InputModeManager;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt$LocalInputModeManager$1 */
/* compiled from: CompositionLocals.kt */
final class CompositionLocalsKt$LocalInputModeManager$1 extends C12777p implements C13074a<InputModeManager> {
    public static final CompositionLocalsKt$LocalInputModeManager$1 INSTANCE = new CompositionLocalsKt$LocalInputModeManager$1();

    CompositionLocalsKt$LocalInputModeManager$1() {
        super(0);
    }

    public final InputModeManager invoke() {
        Void unused = CompositionLocalsKt.noLocalProvidedFor("LocalInputManager");
        throw new KotlinNothingValueException();
    }
}
