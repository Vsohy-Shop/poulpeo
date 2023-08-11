package androidx.compose.material3;

import androidx.compose.p002ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: ExposedDropdownMenu.kt */
final class ExposedDropdownMenuKt$expandable$2$1 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    final /* synthetic */ String $collapsedDescription;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ String $expandedDescription;
    final /* synthetic */ String $menuDescription;
    final /* synthetic */ C13074a<C11921v> $onExpandedChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExposedDropdownMenuKt$expandable$2$1(boolean z, String str, String str2, String str3, C13074a<C11921v> aVar) {
        super(1);
        this.$expanded = z;
        this.$expandedDescription = str;
        this.$collapsedDescription = str2;
        this.$menuDescription = str3;
        this.$onExpandedChange = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, this.$expanded ? this.$expandedDescription : this.$collapsedDescription);
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, this.$menuDescription);
        final C13074a<C11921v> aVar = this.$onExpandedChange;
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, (String) null, new C13074a<Boolean>() {
            public final Boolean invoke() {
                aVar.invoke();
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
    }
}
