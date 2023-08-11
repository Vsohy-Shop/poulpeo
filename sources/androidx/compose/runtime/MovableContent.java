package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13089p;

@InternalComposeApi
@StabilityInferred(parameters = 0)
/* compiled from: Composer.kt */
public final class MovableContent<P> {
    public static final int $stable = 0;
    private final C13089p<P, Composer, Integer, C11921v> content;

    public MovableContent(C13089p<? super P, ? super Composer, ? super Integer, C11921v> pVar) {
        C12775o.m28639i(pVar, "content");
        this.content = pVar;
    }

    public final C13089p<P, Composer, Integer, C11921v> getContent() {
        return this.content;
    }
}
