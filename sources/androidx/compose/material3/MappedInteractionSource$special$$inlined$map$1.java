package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import p314bg.C10962f;
import p314bg.C10967g;
import p336ef.C11921v;
import p355hf.C12074d;

/* compiled from: SafeCollector.common.kt */
public final class MappedInteractionSource$special$$inlined$map$1 implements C10962f<Interaction> {
    final /* synthetic */ C10962f $this_unsafeTransform$inlined;
    final /* synthetic */ MappedInteractionSource this$0;

    public MappedInteractionSource$special$$inlined$map$1(C10962f fVar, MappedInteractionSource mappedInteractionSource) {
        this.$this_unsafeTransform$inlined = fVar;
        this.this$0 = mappedInteractionSource;
    }

    public Object collect(final C10967g gVar, C12074d dVar) {
        C10962f fVar = this.$this_unsafeTransform$inlined;
        final MappedInteractionSource mappedInteractionSource = this.this$0;
        Object collect = fVar.collect(new C10967g() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, p355hf.C12074d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1.C08692.C08701
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = (androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1.C08692.C08701) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = new androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = p362if.C12150d.m26492c()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    p336ef.C11910n.m25701b(r7)
                    goto L_0x0097
                L_0x002a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0032:
                    p336ef.C11910n.m25701b(r7)
                    bg.g r7 = r4
                    androidx.compose.foundation.interaction.Interaction r6 = (androidx.compose.foundation.interaction.Interaction) r6
                    boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
                    if (r2 == 0) goto L_0x0051
                    androidx.compose.material3.MappedInteractionSource r2 = r2
                    r4 = r6
                    androidx.compose.foundation.interaction.PressInteraction$Press r4 = (androidx.compose.foundation.interaction.PressInteraction.Press) r4
                    androidx.compose.foundation.interaction.PressInteraction$Press r2 = r2.mapPress(r4)
                    androidx.compose.material3.MappedInteractionSource r4 = r2
                    java.util.Map r4 = r4.mappedPresses
                    r4.put(r6, r2)
                    r6 = r2
                    goto L_0x008e
                L_0x0051:
                    boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel
                    if (r2 == 0) goto L_0x0070
                    androidx.compose.material3.MappedInteractionSource r2 = r2
                    java.util.Map r2 = r2.mappedPresses
                    androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = (androidx.compose.foundation.interaction.PressInteraction.Cancel) r6
                    androidx.compose.foundation.interaction.PressInteraction$Press r4 = r6.getPress()
                    java.lang.Object r2 = r2.remove(r4)
                    androidx.compose.foundation.interaction.PressInteraction$Press r2 = (androidx.compose.foundation.interaction.PressInteraction.Press) r2
                    if (r2 != 0) goto L_0x006a
                    goto L_0x008e
                L_0x006a:
                    androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                    r6.<init>(r2)
                    goto L_0x008e
                L_0x0070:
                    boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Release
                    if (r2 == 0) goto L_0x008e
                    androidx.compose.material3.MappedInteractionSource r2 = r2
                    java.util.Map r2 = r2.mappedPresses
                    androidx.compose.foundation.interaction.PressInteraction$Release r6 = (androidx.compose.foundation.interaction.PressInteraction.Release) r6
                    androidx.compose.foundation.interaction.PressInteraction$Press r4 = r6.getPress()
                    java.lang.Object r2 = r2.remove(r4)
                    androidx.compose.foundation.interaction.PressInteraction$Press r2 = (androidx.compose.foundation.interaction.PressInteraction.Press) r2
                    if (r2 != 0) goto L_0x0089
                    goto L_0x008e
                L_0x0089:
                    androidx.compose.foundation.interaction.PressInteraction$Release r6 = new androidx.compose.foundation.interaction.PressInteraction$Release
                    r6.<init>(r2)
                L_0x008e:
                    r0.label = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x0097
                    return r1
                L_0x0097:
                    ef.v r6 = p336ef.C11921v.f18618a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1.C08692.emit(java.lang.Object, hf.d):java.lang.Object");
            }
        }, dVar);
        if (collect == C12150d.m26492c()) {
            return collect;
        }
        return C11921v.f18618a;
    }
}
