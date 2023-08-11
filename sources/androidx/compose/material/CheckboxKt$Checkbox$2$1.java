package androidx.compose.material;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: Checkbox.kt */
final class CheckboxKt$Checkbox$2$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ boolean $checked;
    final /* synthetic */ Function1<Boolean, C11921v> $onCheckedChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CheckboxKt$Checkbox$2$1(Function1<? super Boolean, C11921v> function1, boolean z) {
        super(0);
        this.$onCheckedChange = function1;
        this.$checked = z;
    }

    public final void invoke() {
        this.$onCheckedChange.invoke(Boolean.valueOf(!this.$checked));
    }
}
