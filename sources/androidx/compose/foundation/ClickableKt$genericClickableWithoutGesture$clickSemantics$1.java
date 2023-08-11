package androidx.compose.foundation;

import androidx.compose.p002ui.semantics.Role;
import androidx.compose.p002ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: Clickable.kt */
final class ClickableKt$genericClickableWithoutGesture$clickSemantics$1 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C13074a<C11921v> $onClick;
    final /* synthetic */ String $onClickLabel;
    final /* synthetic */ C13074a<C11921v> $onLongClick;
    final /* synthetic */ String $onLongClickLabel;
    final /* synthetic */ Role $role;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$genericClickableWithoutGesture$clickSemantics$1(Role role, String str, C13074a<C11921v> aVar, String str2, boolean z, C13074a<C11921v> aVar2) {
        super(1);
        this.$role = role;
        this.$onClickLabel = str;
        this.$onLongClick = aVar;
        this.$onLongClickLabel = str2;
        this.$enabled = z;
        this.$onClick = aVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "$this$semantics");
        Role role = this.$role;
        if (role != null) {
            SemanticsPropertiesKt.m37828setRolekuIjeqM(semanticsPropertyReceiver, role.m37813unboximpl());
        }
        String str = this.$onClickLabel;
        final C13074a<C11921v> aVar = this.$onClick;
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, str, new C13074a<Boolean>() {
            public final Boolean invoke() {
                aVar.invoke();
                return Boolean.TRUE;
            }
        });
        final C13074a<C11921v> aVar2 = this.$onLongClick;
        if (aVar2 != null) {
            SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, this.$onLongClickLabel, new C13074a<Boolean>() {
                public final Boolean invoke() {
                    aVar2.invoke();
                    return Boolean.TRUE;
                }
            });
        }
        if (!this.$enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
    }
}
