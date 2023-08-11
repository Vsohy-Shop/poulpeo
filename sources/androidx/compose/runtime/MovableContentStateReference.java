package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import p336ef.C11906l;

@InternalComposeApi
@StabilityInferred(parameters = 0)
/* compiled from: Composer.kt */
public final class MovableContentStateReference {
    public static final int $stable = 8;
    private final Anchor anchor;
    private final ControlledComposition composition;
    private final MovableContent<Object> content;
    private final List<C11906l<RecomposeScopeImpl, IdentityArraySet<Object>>> invalidations;
    private final PersistentMap<CompositionLocal<Object>, State<Object>> locals;
    private final Object parameter;
    private final SlotTable slotTable;

    public MovableContentStateReference(MovableContent<Object> movableContent, Object obj, ControlledComposition controlledComposition, SlotTable slotTable2, Anchor anchor2, List<C11906l<RecomposeScopeImpl, IdentityArraySet<Object>>> list, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap) {
        C12775o.m28639i(movableContent, "content");
        C12775o.m28639i(controlledComposition, "composition");
        C12775o.m28639i(slotTable2, "slotTable");
        C12775o.m28639i(anchor2, "anchor");
        C12775o.m28639i(list, "invalidations");
        C12775o.m28639i(persistentMap, "locals");
        this.content = movableContent;
        this.parameter = obj;
        this.composition = controlledComposition;
        this.slotTable = slotTable2;
        this.anchor = anchor2;
        this.invalidations = list;
        this.locals = persistentMap;
    }

    public final Anchor getAnchor$runtime_release() {
        return this.anchor;
    }

    public final ControlledComposition getComposition$runtime_release() {
        return this.composition;
    }

    public final MovableContent<Object> getContent$runtime_release() {
        return this.content;
    }

    public final List<C11906l<RecomposeScopeImpl, IdentityArraySet<Object>>> getInvalidations$runtime_release() {
        return this.invalidations;
    }

    public final PersistentMap<CompositionLocal<Object>, State<Object>> getLocals$runtime_release() {
        return this.locals;
    }

    public final Object getParameter$runtime_release() {
        return this.parameter;
    }

    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }
}
