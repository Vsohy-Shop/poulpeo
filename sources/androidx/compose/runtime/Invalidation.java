package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import kotlin.jvm.internal.C12775o;

/* compiled from: Composer.kt */
final class Invalidation {
    private IdentityArraySet<Object> instances;
    private final int location;
    private final RecomposeScopeImpl scope;

    public Invalidation(RecomposeScopeImpl recomposeScopeImpl, int i, IdentityArraySet<Object> identityArraySet) {
        C12775o.m28639i(recomposeScopeImpl, "scope");
        this.scope = recomposeScopeImpl;
        this.location = i;
        this.instances = identityArraySet;
    }

    public final IdentityArraySet<Object> getInstances() {
        return this.instances;
    }

    public final int getLocation() {
        return this.location;
    }

    public final RecomposeScopeImpl getScope() {
        return this.scope;
    }

    public final boolean isInvalid() {
        return this.scope.isInvalidFor(this.instances);
    }

    public final void setInstances(IdentityArraySet<Object> identityArraySet) {
        this.instances = identityArraySet;
    }
}
