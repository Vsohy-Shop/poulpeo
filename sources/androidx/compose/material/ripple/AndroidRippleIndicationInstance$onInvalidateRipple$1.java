package androidx.compose.material.ripple;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: Ripple.android.kt */
final class AndroidRippleIndicationInstance$onInvalidateRipple$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ AndroidRippleIndicationInstance this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidRippleIndicationInstance$onInvalidateRipple$1(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        super(0);
        this.this$0 = androidRippleIndicationInstance;
    }

    public final void invoke() {
        AndroidRippleIndicationInstance androidRippleIndicationInstance = this.this$0;
        androidRippleIndicationInstance.setInvalidateTick(!androidRippleIndicationInstance.getInvalidateTick());
    }
}
