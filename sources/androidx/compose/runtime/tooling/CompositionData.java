package androidx.compose.runtime.tooling;

import kotlin.jvm.internal.C12775o;

/* compiled from: CompositionData.kt */
public interface CompositionData {
    CompositionGroup find(Object obj) {
        C12775o.m28639i(obj, "identityToFind");
        return null;
    }

    Iterable<CompositionGroup> getCompositionGroups();

    boolean isEmpty();
}
