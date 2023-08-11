package androidx.compose.runtime;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13089p;

/* compiled from: Composer.kt */
final class ComposerImpl$updateValue$2 extends C12777p implements C13089p<Applier<?>, SlotWriter, RememberManager, C11921v> {
    final /* synthetic */ int $groupSlotIndex;
    final /* synthetic */ Object $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$updateValue$2(Object obj, int i) {
        super(3);
        this.$value = obj;
        this.$groupSlotIndex = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Applier<?>) (Applier) obj, (SlotWriter) obj2, (RememberManager) obj3);
        return C11921v.f18618a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        r2 = (androidx.compose.runtime.RecomposeScopeImpl) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.Applier<?> r2, androidx.compose.runtime.SlotWriter r3, androidx.compose.runtime.RememberManager r4) {
        /*
            r1 = this;
            java.lang.String r0 = "<anonymous parameter 0>"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            java.lang.String r2 = "slots"
            kotlin.jvm.internal.C12775o.m28639i(r3, r2)
            java.lang.String r2 = "rememberManager"
            kotlin.jvm.internal.C12775o.m28639i(r4, r2)
            java.lang.Object r2 = r1.$value
            boolean r0 = r2 instanceof androidx.compose.runtime.RememberObserver
            if (r0 == 0) goto L_0x001a
            androidx.compose.runtime.RememberObserver r2 = (androidx.compose.runtime.RememberObserver) r2
            r4.remembering(r2)
        L_0x001a:
            int r2 = r1.$groupSlotIndex
            java.lang.Object r0 = r1.$value
            java.lang.Object r2 = r3.set(r2, r0)
            boolean r3 = r2 instanceof androidx.compose.runtime.RememberObserver
            if (r3 == 0) goto L_0x002c
            androidx.compose.runtime.RememberObserver r2 = (androidx.compose.runtime.RememberObserver) r2
            r4.forgetting(r2)
            goto L_0x003f
        L_0x002c:
            boolean r3 = r2 instanceof androidx.compose.runtime.RecomposeScopeImpl
            if (r3 == 0) goto L_0x003f
            androidx.compose.runtime.RecomposeScopeImpl r2 = (androidx.compose.runtime.RecomposeScopeImpl) r2
            androidx.compose.runtime.CompositionImpl r3 = r2.getComposition()
            if (r3 == 0) goto L_0x003f
            r2.release()
            r2 = 1
            r3.setPendingInvalidScopes$runtime_release(r2)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl$updateValue$2.invoke(androidx.compose.runtime.Applier, androidx.compose.runtime.SlotWriter, androidx.compose.runtime.RememberManager):void");
    }
}
