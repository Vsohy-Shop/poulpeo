package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;
import p404of.C13091r;

@SourceDebugExtension({"SMAP\nSelectionRegistrarImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,205:1\n76#2:206\n102#2,2:207\n*S KotlinDebug\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n*L\n99#1:206\n99#1:207,2\n*E\n"})
/* compiled from: SelectionRegistrarImpl.kt */
public final class SelectionRegistrarImpl implements SelectionRegistrar {
    private final Map<Long, Selectable> _selectableMap = new LinkedHashMap();
    private final List<Selectable> _selectables = new ArrayList();
    private Function1<? super Long, C11921v> afterSelectableUnsubscribe;
    private AtomicLong incrementId = new AtomicLong(1);
    private Function1<? super Long, C11921v> onPositionChangeCallback;
    private Function1<? super Long, C11921v> onSelectableChangeCallback;
    private C13091r<? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> onSelectionUpdateCallback;
    private C13074a<C11921v> onSelectionUpdateEndCallback;
    private Function1<? super Long, C11921v> onSelectionUpdateSelectAll;
    private C13089p<? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, C11921v> onSelectionUpdateStartCallback;
    private boolean sorted;
    private final MutableState subselections$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C12716r0.m28416g(), (SnapshotMutationPolicy) null, 2, (Object) null);

    /* access modifiers changed from: private */
    public static final int sort$lambda$2(C13088o oVar, Object obj, Object obj2) {
        C12775o.m28639i(oVar, "$tmp0");
        return ((Number) oVar.invoke(obj, obj2)).intValue();
    }

    public final Function1<Long, C11921v> getAfterSelectableUnsubscribe$foundation_release() {
        return this.afterSelectableUnsubscribe;
    }

    public final Function1<Long, C11921v> getOnPositionChangeCallback$foundation_release() {
        return this.onPositionChangeCallback;
    }

    public final Function1<Long, C11921v> getOnSelectableChangeCallback$foundation_release() {
        return this.onSelectableChangeCallback;
    }

    public final C13091r<LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean> getOnSelectionUpdateCallback$foundation_release() {
        return this.onSelectionUpdateCallback;
    }

    public final C13074a<C11921v> getOnSelectionUpdateEndCallback$foundation_release() {
        return this.onSelectionUpdateEndCallback;
    }

    public final Function1<Long, C11921v> getOnSelectionUpdateSelectAll$foundation_release() {
        return this.onSelectionUpdateSelectAll;
    }

    public final C13089p<LayoutCoordinates, Offset, SelectionAdjustment, C11921v> getOnSelectionUpdateStartCallback$foundation_release() {
        return this.onSelectionUpdateStartCallback;
    }

    public final Map<Long, Selectable> getSelectableMap$foundation_release() {
        return this._selectableMap;
    }

    public final List<Selectable> getSelectables$foundation_release() {
        return this._selectables;
    }

    public final boolean getSorted$foundation_release() {
        return this.sorted;
    }

    public Map<Long, Selection> getSubselections() {
        return (Map) this.subselections$delegate.getValue();
    }

    public long nextSelectableId() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    public void notifyPositionChange(long j) {
        this.sorted = false;
        Function1<? super Long, C11921v> function1 = this.onPositionChangeCallback;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j));
        }
    }

    public void notifySelectableChange(long j) {
        Function1<? super Long, C11921v> function1 = this.onSelectableChangeCallback;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j));
        }
    }

    /* renamed from: notifySelectionUpdate-5iVPX68  reason: not valid java name */
    public boolean m33833notifySelectionUpdate5iVPX68(LayoutCoordinates layoutCoordinates, long j, long j2, boolean z, SelectionAdjustment selectionAdjustment) {
        C12775o.m28639i(layoutCoordinates, "layoutCoordinates");
        C12775o.m28639i(selectionAdjustment, "adjustment");
        C13091r<? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> rVar = this.onSelectionUpdateCallback;
        if (rVar == null) {
            return true;
        }
        return rVar.invoke(layoutCoordinates, Offset.m35411boximpl(j), Offset.m35411boximpl(j2), Boolean.valueOf(z), selectionAdjustment).booleanValue();
    }

    public void notifySelectionUpdateEnd() {
        C13074a<C11921v> aVar = this.onSelectionUpdateEndCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public void notifySelectionUpdateSelectAll(long j) {
        Function1<? super Long, C11921v> function1 = this.onSelectionUpdateSelectAll;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j));
        }
    }

    /* renamed from: notifySelectionUpdateStart-d-4ec7I  reason: not valid java name */
    public void m33834notifySelectionUpdateStartd4ec7I(LayoutCoordinates layoutCoordinates, long j, SelectionAdjustment selectionAdjustment) {
        C12775o.m28639i(layoutCoordinates, "layoutCoordinates");
        C12775o.m28639i(selectionAdjustment, "adjustment");
        C13089p<? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, C11921v> pVar = this.onSelectionUpdateStartCallback;
        if (pVar != null) {
            pVar.invoke(layoutCoordinates, Offset.m35411boximpl(j), selectionAdjustment);
        }
    }

    public final void setAfterSelectableUnsubscribe$foundation_release(Function1<? super Long, C11921v> function1) {
        this.afterSelectableUnsubscribe = function1;
    }

    public final void setOnPositionChangeCallback$foundation_release(Function1<? super Long, C11921v> function1) {
        this.onPositionChangeCallback = function1;
    }

    public final void setOnSelectableChangeCallback$foundation_release(Function1<? super Long, C11921v> function1) {
        this.onSelectableChangeCallback = function1;
    }

    public final void setOnSelectionUpdateCallback$foundation_release(C13091r<? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> rVar) {
        this.onSelectionUpdateCallback = rVar;
    }

    public final void setOnSelectionUpdateEndCallback$foundation_release(C13074a<C11921v> aVar) {
        this.onSelectionUpdateEndCallback = aVar;
    }

    public final void setOnSelectionUpdateSelectAll$foundation_release(Function1<? super Long, C11921v> function1) {
        this.onSelectionUpdateSelectAll = function1;
    }

    public final void setOnSelectionUpdateStartCallback$foundation_release(C13089p<? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, C11921v> pVar) {
        this.onSelectionUpdateStartCallback = pVar;
    }

    public final void setSorted$foundation_release(boolean z) {
        this.sorted = z;
    }

    public void setSubselections(Map<Long, Selection> map) {
        C12775o.m28639i(map, "<set-?>");
        this.subselections$delegate.setValue(map);
    }

    public final List<Selectable> sort(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "containerLayoutCoordinates");
        if (!this.sorted) {
            C12664a0.m28170A(this._selectables, new C0674a(new SelectionRegistrarImpl$sort$1(layoutCoordinates)));
            this.sorted = true;
        }
        return getSelectables$foundation_release();
    }

    public Selectable subscribe(Selectable selectable) {
        boolean z;
        C12775o.m28639i(selectable, "selectable");
        if (selectable.getSelectableId() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + selectable.getSelectableId()).toString());
        } else if (!this._selectableMap.containsKey(Long.valueOf(selectable.getSelectableId()))) {
            this._selectableMap.put(Long.valueOf(selectable.getSelectableId()), selectable);
            this._selectables.add(selectable);
            this.sorted = false;
            return selectable;
        } else {
            throw new IllegalArgumentException(("Another selectable with the id: " + selectable + ".selectableId has already subscribed.").toString());
        }
    }

    public void unsubscribe(Selectable selectable) {
        C12775o.m28639i(selectable, "selectable");
        if (this._selectableMap.containsKey(Long.valueOf(selectable.getSelectableId()))) {
            this._selectables.remove(selectable);
            this._selectableMap.remove(Long.valueOf(selectable.getSelectableId()));
            Function1<? super Long, C11921v> function1 = this.afterSelectableUnsubscribe;
            if (function1 != null) {
                function1.invoke(Long.valueOf(selectable.getSelectableId()));
            }
        }
    }
}
