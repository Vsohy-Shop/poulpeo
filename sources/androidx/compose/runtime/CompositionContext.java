package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12079g;
import p404of.C13088o;

@StabilityInferred(parameters = 0)
/* compiled from: CompositionContext.kt */
public abstract class CompositionContext {
    public static final int $stable = 0;

    public abstract void composeInitial$runtime_release(ControlledComposition controlledComposition, C13088o<? super Composer, ? super Integer, C11921v> oVar);

    public abstract void deletedMovableContent$runtime_release(MovableContentStateReference movableContentStateReference);

    public abstract boolean getCollectingParameterInformation$runtime_release();

    public PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocalScope$runtime_release() {
        return CompositionContextKt.EmptyCompositionLocalMap;
    }

    public abstract int getCompoundHashKey$runtime_release();

    public abstract C12079g getEffectCoroutineContext$runtime_release();

    public abstract C12079g getRecomposeCoroutineContext$runtime_release();

    public abstract void insertMovableContent$runtime_release(MovableContentStateReference movableContentStateReference);

    public abstract void invalidate$runtime_release(ControlledComposition controlledComposition);

    public abstract void invalidateScope$runtime_release(RecomposeScopeImpl recomposeScopeImpl);

    public abstract void movableContentStateReleased$runtime_release(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState);

    public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference movableContentStateReference) {
        C12775o.m28639i(movableContentStateReference, "reference");
        return null;
    }

    public void recordInspectionTable$runtime_release(Set<CompositionData> set) {
        C12775o.m28639i(set, "table");
    }

    public void registerComposer$runtime_release(Composer composer) {
        C12775o.m28639i(composer, "composer");
    }

    public abstract void registerComposition$runtime_release(ControlledComposition controlledComposition);

    public void unregisterComposer$runtime_release(Composer composer) {
        C12775o.m28639i(composer, "composer");
    }

    public abstract void unregisterComposition$runtime_release(ControlledComposition controlledComposition);

    public void doneComposing$runtime_release() {
    }

    public void startComposing$runtime_release() {
    }
}
