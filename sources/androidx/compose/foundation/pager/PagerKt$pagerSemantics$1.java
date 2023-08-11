package androidx.compose.foundation.pager;

import androidx.compose.p002ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p466yf.C13995l0;

/* compiled from: Pager.kt */
final class PagerKt$pagerSemantics$1 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ C13995l0 $scope;
    final /* synthetic */ PagerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagerKt$pagerSemantics$1(boolean z, PagerState pagerState, C13995l0 l0Var) {
        super(1);
        this.$isVertical = z;
        this.$state = pagerState;
        this.$scope = l0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "$this$semantics");
        if (this.$isVertical) {
            final PagerState pagerState = this.$state;
            final C13995l0 l0Var = this.$scope;
            SemanticsPropertiesKt.pageUp$default(semanticsPropertyReceiver, (String) null, new C13074a<Boolean>() {
                public final Boolean invoke() {
                    return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState, l0Var));
                }
            }, 1, (Object) null);
            final PagerState pagerState2 = this.$state;
            final C13995l0 l0Var2 = this.$scope;
            SemanticsPropertiesKt.pageDown$default(semanticsPropertyReceiver, (String) null, new C13074a<Boolean>() {
                public final Boolean invoke() {
                    return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState2, l0Var2));
                }
            }, 1, (Object) null);
            return;
        }
        final PagerState pagerState3 = this.$state;
        final C13995l0 l0Var3 = this.$scope;
        SemanticsPropertiesKt.pageLeft$default(semanticsPropertyReceiver, (String) null, new C13074a<Boolean>() {
            public final Boolean invoke() {
                return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState3, l0Var3));
            }
        }, 1, (Object) null);
        final PagerState pagerState4 = this.$state;
        final C13995l0 l0Var4 = this.$scope;
        SemanticsPropertiesKt.pageRight$default(semanticsPropertyReceiver, (String) null, new C13074a<Boolean>() {
            public final Boolean invoke() {
                return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState4, l0Var4));
            }
        }, 1, (Object) null);
    }
}
