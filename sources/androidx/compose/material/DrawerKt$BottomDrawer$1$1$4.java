package androidx.compose.material;

import androidx.compose.p002ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* compiled from: Drawer.kt */
final class DrawerKt$BottomDrawer$1$1$4 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    final /* synthetic */ BottomDrawerState $drawerState;
    final /* synthetic */ String $navigationMenu;
    final /* synthetic */ C13995l0 $scope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$BottomDrawer$1$1$4(String str, BottomDrawerState bottomDrawerState, C13995l0 l0Var) {
        super(1);
        this.$navigationMenu = str;
        this.$drawerState = bottomDrawerState;
        this.$scope = l0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, this.$navigationMenu);
        if (this.$drawerState.isOpen()) {
            final BottomDrawerState bottomDrawerState = this.$drawerState;
            final C13995l0 l0Var = this.$scope;
            SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, (String) null, new C13074a<Boolean>() {

                @C12739f(mo50609c = "androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1$1", mo50610f = "Drawer.kt", mo50611l = {603}, mo50612m = "invokeSuspend")
                /* renamed from: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1$1 */
                /* compiled from: Drawer.kt */
                static final class C07201 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
                    int label;

                    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                        return new C07201(bottomDrawerState, dVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object c = C12150d.m26492c();
                        int i = this.label;
                        if (i == 0) {
                            C11910n.m25701b(obj);
                            BottomDrawerState bottomDrawerState = bottomDrawerState;
                            this.label = 1;
                            if (bottomDrawerState.close(this) == c) {
                                return c;
                            }
                        } else if (i == 1) {
                            C11910n.m25701b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return C11921v.f18618a;
                    }

                    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
                        return ((C07201) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
                    }
                }

                public final Boolean invoke() {
                    if (((Boolean) bottomDrawerState.getConfirmStateChange$material_release().invoke(BottomDrawerValue.Closed)).booleanValue()) {
                        C13995l0 l0Var = l0Var;
                        final BottomDrawerState bottomDrawerState = bottomDrawerState;
                        C14054y1 unused = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new C07201((C12074d<? super C07201>) null), 3, (Object) null);
                    }
                    return Boolean.TRUE;
                }
            }, 1, (Object) null);
        }
    }
}
