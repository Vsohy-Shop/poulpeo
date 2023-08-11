package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: CompositionLocal.kt */
final class CompositionLocalKt$CompositionLocalProvider$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ ProvidedValue<?>[] $values;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CompositionLocalKt$CompositionLocalProvider$1(ProvidedValue<?>[] providedValueArr, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i) {
        super(2);
        this.$values = providedValueArr;
        this.$content = oVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        ProvidedValue<?>[] providedValueArr = this.$values;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) (ProvidedValue[]) Arrays.copyOf(providedValueArr, providedValueArr.length), (C13088o<? super Composer, ? super Integer, C11921v>) this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
