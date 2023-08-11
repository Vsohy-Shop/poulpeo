package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.text.font.Font;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontLoader$1 */
/* compiled from: CompositionLocals.kt */
final class CompositionLocalsKt$LocalFontLoader$1 extends C12777p implements C13074a<Font.ResourceLoader> {
    public static final CompositionLocalsKt$LocalFontLoader$1 INSTANCE = new CompositionLocalsKt$LocalFontLoader$1();

    CompositionLocalsKt$LocalFontLoader$1() {
        super(0);
    }

    public final Font.ResourceLoader invoke() {
        Void unused = CompositionLocalsKt.noLocalProvidedFor("LocalFontLoader");
        throw new KotlinNothingValueException();
    }
}
