package androidx.compose.material;

import androidx.compose.p002ui.platform.AccessibilityManager;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14041v0;

@C12739f(mo50609c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1", mo50610f = "SnackbarHost.kt", mo50611l = {164}, mo50612m = "invokeSuspend")
/* compiled from: SnackbarHost.kt */
final class SnackbarHostKt$SnackbarHost$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ AccessibilityManager $accessibilityManager;
    final /* synthetic */ SnackbarData $currentSnackbarData;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$SnackbarHost$1(SnackbarData snackbarData, AccessibilityManager accessibilityManager, C12074d<? super SnackbarHostKt$SnackbarHost$1> dVar) {
        super(2, dVar);
        this.$currentSnackbarData = snackbarData;
        this.$accessibilityManager = accessibilityManager;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new SnackbarHostKt$SnackbarHost$1(this.$currentSnackbarData, this.$accessibilityManager, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            SnackbarData snackbarData = this.$currentSnackbarData;
            if (snackbarData != null) {
                SnackbarDuration duration = snackbarData.getDuration();
                if (this.$currentSnackbarData.getActionLabel() != null) {
                    z = true;
                } else {
                    z = false;
                }
                long millis = SnackbarHostKt.toMillis(duration, z, this.$accessibilityManager);
                this.label = 1;
                if (C14041v0.m32563a(millis, this) == c) {
                    return c;
                }
            }
            return C11921v.f18618a;
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$currentSnackbarData.dismiss();
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((SnackbarHostKt$SnackbarHost$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
