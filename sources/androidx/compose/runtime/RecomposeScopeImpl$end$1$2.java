package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n+ 2 IdentityArrayIntMap.kt\nandroidx/compose/runtime/collection/IdentityArrayIntMap\n*L\n1#1,349:1\n132#2,18:350\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n*L\n327#1:350,18\n*E\n"})
/* compiled from: RecomposeScopeImpl.kt */
final class RecomposeScopeImpl$end$1$2 extends C12777p implements Function1<Composition, C11921v> {
    final /* synthetic */ IdentityArrayIntMap $instances;
    final /* synthetic */ int $token;
    final /* synthetic */ RecomposeScopeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RecomposeScopeImpl$end$1$2(RecomposeScopeImpl recomposeScopeImpl, int i, IdentityArrayIntMap identityArrayIntMap) {
        super(1);
        this.this$0 = recomposeScopeImpl;
        this.$token = i;
        this.$instances = identityArrayIntMap;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Composition) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Composition composition) {
        C12775o.m28639i(composition, "composition");
        if (this.this$0.currentToken == this.$token && C12775o.m28634d(this.$instances, this.this$0.trackedInstances) && (composition instanceof CompositionImpl)) {
            IdentityArrayIntMap identityArrayIntMap = this.$instances;
            int i = this.$token;
            RecomposeScopeImpl recomposeScopeImpl = this.this$0;
            int size = identityArrayIntMap.getSize();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = identityArrayIntMap.getKeys()[i3];
                C12775o.m28637g(obj, "null cannot be cast to non-null type kotlin.Any");
                int i4 = identityArrayIntMap.getValues()[i3];
                boolean z = i4 != i;
                if (z) {
                    CompositionImpl compositionImpl = (CompositionImpl) composition;
                    compositionImpl.removeObservation$runtime_release(obj, recomposeScopeImpl);
                    DerivedState derivedState = obj instanceof DerivedState ? (DerivedState) obj : null;
                    if (derivedState != null) {
                        compositionImpl.removeDerivedStateObservation$runtime_release(derivedState);
                        IdentityArrayMap access$getTrackedDependencies$p = recomposeScopeImpl.trackedDependencies;
                        if (access$getTrackedDependencies$p != null) {
                            access$getTrackedDependencies$p.remove(derivedState);
                            if (access$getTrackedDependencies$p.getSize$runtime_release() == 0) {
                                recomposeScopeImpl.trackedDependencies = null;
                            }
                        }
                    }
                }
                if (!z) {
                    if (i2 != i3) {
                        identityArrayIntMap.getKeys()[i2] = obj;
                        identityArrayIntMap.getValues()[i2] = i4;
                    }
                    i2++;
                }
            }
            int size2 = identityArrayIntMap.getSize();
            for (int i5 = i2; i5 < size2; i5++) {
                identityArrayIntMap.getKeys()[i5] = null;
            }
            identityArrayIntMap.setSize(i2);
            if (this.$instances.getSize() == 0) {
                this.this$0.trackedInstances = null;
            }
        }
    }
}
