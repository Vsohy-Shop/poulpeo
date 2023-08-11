package androidx.compose.material;

import androidx.compose.p002ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: ExposedDropdownMenu.kt */
final class ExposedDropdownMenuKt$expandable$2 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    final /* synthetic */ String $menuLabel;
    final /* synthetic */ C13074a<C11921v> $onExpandedChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExposedDropdownMenuKt$expandable$2(String str, C13074a<C11921v> aVar) {
        super(1);
        this.$menuLabel = str;
        this.$onExpandedChange = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, this.$menuLabel);
        final C13074a<C11921v> aVar = this.$onExpandedChange;
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, (String) null, new C13074a<Boolean>() {
            public final Boolean invoke() {
                aVar.invoke();
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
    }
}
