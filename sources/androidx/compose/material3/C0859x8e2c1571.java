package androidx.compose.material3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$2$1 */
/* compiled from: ExposedDropdownMenu.kt */
final class C0859x8e2c1571 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ Function1<Boolean, C11921v> $onExpandedChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0859x8e2c1571(Function1<? super Boolean, C11921v> function1, boolean z) {
        super(0);
        this.$onExpandedChange = function1;
        this.$expanded = z;
    }

    public final void invoke() {
        this.$onExpandedChange.invoke(Boolean.valueOf(!this.$expanded));
    }
}
