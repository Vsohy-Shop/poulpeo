package androidx.compose.p002ui.tooling.preview.datasource;

import androidx.compose.p002ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12760f0;
import p448vf.C13650g;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.tooling.preview.datasource.LoremIpsum */
/* compiled from: LoremIpsum.kt */
public final class LoremIpsum implements PreviewParameterProvider<String> {
    public static final int $stable = 0;
    private final int words;

    public LoremIpsum(int i) {
        this.words = i;
    }

    private final String generateLoremIpsum(int i) {
        return C13662o.m31286s(C13662o.m31290w(C13657m.m31273g(new LoremIpsum$generateLoremIpsum$1(new C12760f0(), LoremIpsumKt.LOREM_IPSUM_SOURCE.size())), i), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    public C13650g<String> getValues() {
        return C13657m.m31275i(generateLoremIpsum(this.words));
    }

    public LoremIpsum() {
        this(500);
    }
}
