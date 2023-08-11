package androidx.compose.runtime;

import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ReusableComposeNode$1\n*L\n1#1,484:1\n*E\n"})
/* compiled from: Composables.kt */
public final class ComposablesKt$ReusableComposeNode$1 extends C12777p implements C13074a<T> {
    final /* synthetic */ C13074a<T> $factory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposablesKt$ReusableComposeNode$1(C13074a<? extends T> aVar) {
        super(0);
        this.$factory = aVar;
    }

    public final T invoke() {
        return this.$factory.invoke();
    }
}
