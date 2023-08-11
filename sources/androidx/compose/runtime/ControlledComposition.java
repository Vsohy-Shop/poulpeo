package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import p336ef.C11906l;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: Composition.kt */
public interface ControlledComposition extends Composition {
    void applyChanges();

    void applyLateChanges();

    void changesApplied();

    void composeContent(C13088o<? super Composer, ? super Integer, C11921v> oVar);

    <R> R delegateInvalidations(ControlledComposition controlledComposition, int i, C13074a<? extends R> aVar);

    @InternalComposeApi
    void disposeUnusedMovableContent(MovableContentState movableContentState);

    boolean getHasPendingChanges();

    @InternalComposeApi
    void insertMovableContent(List<C11906l<MovableContentStateReference, MovableContentStateReference>> list);

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(Set<? extends Object> set);

    void prepareCompose(C13074a<C11921v> aVar);

    boolean recompose();

    void recordModificationsOf(Set<? extends Object> set);

    void recordReadOf(Object obj);

    void recordWriteOf(Object obj);

    @InternalComposeApi
    void verifyConsistent();
}
