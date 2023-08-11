package androidx.compose.p002ui.window;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", mo50610f = "AndroidPopup.android.kt", mo50611l = {301}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5 */
/* compiled from: AndroidPopup.android.kt */
final class AndroidPopup_androidKt$Popup$5 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ PopupLayout $popupLayout;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$5(PopupLayout popupLayout, C12074d<? super AndroidPopup_androidKt$Popup$5> dVar) {
        super(2, dVar);
        this.$popupLayout = popupLayout;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        AndroidPopup_androidKt$Popup$5 androidPopup_androidKt$Popup$5 = new AndroidPopup_androidKt$Popup$5(this.$popupLayout, dVar);
        androidPopup_androidKt$Popup$5.L$0 = obj;
        return androidPopup_androidKt$Popup$5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            java.lang.Object r1 = r4.L$0
            yf.l0 r1 = (p466yf.C13995l0) r1
            p336ef.C11910n.m25701b(r5)
            r5 = r4
            goto L_0x0038
        L_0x0014:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001c:
            p336ef.C11910n.m25701b(r5)
            java.lang.Object r5 = r4.L$0
            yf.l0 r5 = (p466yf.C13995l0) r5
            r1 = r5
            r5 = r4
        L_0x0025:
            boolean r3 = p466yf.C13999m0.m32453g(r1)
            if (r3 == 0) goto L_0x003e
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1 r3 = androidx.compose.p002ui.window.AndroidPopup_androidKt$Popup$5.C12391.INSTANCE
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r3 = androidx.compose.p002ui.platform.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r3, r5)
            if (r3 != r0) goto L_0x0038
            return r0
        L_0x0038:
            androidx.compose.ui.window.PopupLayout r3 = r5.$popupLayout
            r3.pollForLocationOnScreenChange()
            goto L_0x0025
        L_0x003e:
            ef.v r5 = p336ef.C11921v.f18618a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.window.AndroidPopup_androidKt$Popup$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((AndroidPopup_androidKt$Popup$5) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
