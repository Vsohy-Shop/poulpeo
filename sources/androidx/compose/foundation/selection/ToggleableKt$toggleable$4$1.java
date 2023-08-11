package androidx.compose.foundation.selection;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: Toggleable.kt */
final class ToggleableKt$toggleable$4$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ Function1<Boolean, C11921v> $onValueChange;
    final /* synthetic */ boolean $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ToggleableKt$toggleable$4$1(Function1<? super Boolean, C11921v> function1, boolean z) {
        super(0);
        this.$onValueChange = function1;
        this.$value = z;
    }

    public final void invoke() {
        this.$onValueChange.invoke(Boolean.valueOf(!this.$value));
    }
}
