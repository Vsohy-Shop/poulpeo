package androidx.compose.runtime.tooling;

import kotlin.jvm.internal.C12775o;

/* compiled from: CompositionData.kt */
public interface CompositionGroup extends CompositionData {

    /* compiled from: CompositionData.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static CompositionGroup find(CompositionGroup compositionGroup, Object obj) {
            C12775o.m28639i(obj, "identityToFind");
            return CompositionGroup.super.find(obj);
        }

        @Deprecated
        public static int getGroupSize(CompositionGroup compositionGroup) {
            return CompositionGroup.super.getGroupSize();
        }

        @Deprecated
        public static Object getIdentity(CompositionGroup compositionGroup) {
            return CompositionGroup.super.getIdentity();
        }

        @Deprecated
        public static int getSlotsSize(CompositionGroup compositionGroup) {
            return CompositionGroup.super.getSlotsSize();
        }
    }

    Iterable<Object> getData();

    int getGroupSize() {
        return 0;
    }

    Object getIdentity() {
        return null;
    }

    Object getKey();

    Object getNode();

    int getSlotsSize() {
        return 0;
    }

    String getSourceInfo();
}
