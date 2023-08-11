package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.Placeholder;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13089p;

@Immutable
/* compiled from: InlineTextContent.kt */
public final class InlineTextContent {
    public static final int $stable = 0;
    private final C13089p<String, Composer, Integer, C11921v> children;
    private final Placeholder placeholder;

    public InlineTextContent(Placeholder placeholder2, C13089p<? super String, ? super Composer, ? super Integer, C11921v> pVar) {
        C12775o.m28639i(placeholder2, "placeholder");
        C12775o.m28639i(pVar, "children");
        this.placeholder = placeholder2;
        this.children = pVar;
    }

    public final C13089p<String, Composer, Integer, C11921v> getChildren() {
        return this.children;
    }

    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }
}
