package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.text.font.FontFamily;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontFamilyResolver$1 */
/* compiled from: CompositionLocals.kt */
final class CompositionLocalsKt$LocalFontFamilyResolver$1 extends C12777p implements C13074a<FontFamily.Resolver> {
    public static final CompositionLocalsKt$LocalFontFamilyResolver$1 INSTANCE = new CompositionLocalsKt$LocalFontFamilyResolver$1();

    CompositionLocalsKt$LocalFontFamilyResolver$1() {
        super(0);
    }

    public final FontFamily.Resolver invoke() {
        Void unused = CompositionLocalsKt.noLocalProvidedFor("LocalFontFamilyResolver");
        throw new KotlinNothingValueException();
    }
}
