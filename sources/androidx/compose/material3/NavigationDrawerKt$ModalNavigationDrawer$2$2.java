package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
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

/* compiled from: NavigationDrawer.kt */
final class NavigationDrawerKt$ModalNavigationDrawer$2$2 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ C13995l0 $scope;

    @C12739f(mo50609c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1", mo50610f = "NavigationDrawer.kt", mo50611l = {295}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1 */
    /* compiled from: NavigationDrawer.kt */
    static final class C08781 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C08781(drawerState, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                DrawerState drawerState = drawerState;
                this.label = 1;
                if (drawerState.close(this) == c) {
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
            return ((C08781) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationDrawerKt$ModalNavigationDrawer$2$2(boolean z, DrawerState drawerState, C13995l0 l0Var) {
        super(0);
        this.$gesturesEnabled = z;
        this.$drawerState = drawerState;
        this.$scope = l0Var;
    }

    public final void invoke() {
        if (this.$gesturesEnabled && this.$drawerState.getSwipeableState$material3_release().getConfirmStateChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
            C13995l0 l0Var = this.$scope;
            final DrawerState drawerState = this.$drawerState;
            C14054y1 unused = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new C08781((C12074d<? super C08781>) null), 3, (Object) null);
        }
    }
}
