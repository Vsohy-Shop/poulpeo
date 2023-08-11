package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.focus.FocusChangedModifierKt;
import androidx.compose.p002ui.focus.FocusRequester;
import androidx.compose.p002ui.focus.FocusRequesterModifierKt;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.hapticfeedback.HapticFeedback;
import androidx.compose.p002ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p002ui.input.key.KeyInputModifierKt;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.LayoutCoordinatesKt;
import androidx.compose.p002ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p002ui.platform.ClipboardManager;
import androidx.compose.p002ui.platform.TextToolbar;
import androidx.compose.p002ui.platform.TextToolbarStatus;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;
import p404of.C13091r;

@SourceDebugExtension({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,914:1\n76#2:915\n102#2,2:916\n76#2:918\n102#2,2:919\n76#2:921\n102#2,2:922\n76#2:924\n102#2,2:925\n76#2:927\n102#2,2:928\n76#2:930\n102#2,2:931\n76#2:933\n102#2,2:934\n1#3:936\n59#4,3:937\n62#4,2:944\n64#4:947\n59#4,3:948\n62#4,2:955\n64#4:958\n33#5,4:940\n38#5:946\n33#5,4:951\n38#5:957\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n*L\n112#1:915\n112#1:916,2\n161#1:918\n161#1:919,2\n168#1:921\n168#1:922,2\n177#1:924\n177#1:925,2\n186#1:927\n186#1:928,2\n193#1:930\n193#1:931,2\n200#1:933\n200#1:934,2\n368#1:937,3\n368#1:944,2\n368#1:947\n752#1:948,3\n752#1:955,2\n752#1:958\n368#1:940,4\n368#1:946\n752#1:951,4\n752#1:957\n*E\n"})
/* compiled from: SelectionManager.kt */
public final class SelectionManager {
    private final MutableState<Selection> _selection = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
    private ClipboardManager clipboardManager;
    private LayoutCoordinates containerLayoutCoordinates;
    private final MutableState currentDragPosition$delegate;
    private final MutableState dragBeginPosition$delegate;
    private final MutableState dragTotalDistance$delegate;
    private final MutableState draggingHandle$delegate;
    private final MutableState endHandlePosition$delegate;
    private FocusRequester focusRequester = new FocusRequester();
    private HapticFeedback hapticFeedBack;
    private final MutableState hasFocus$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
    private Function1<? super Selection, C11921v> onSelectionChange = SelectionManager$onSelectionChange$1.INSTANCE;
    private Offset previousPosition;
    /* access modifiers changed from: private */
    public final SelectionRegistrarImpl selectionRegistrar;
    private final MutableState startHandlePosition$delegate;
    private TextToolbar textToolbar;
    private boolean touchMode = true;

    public SelectionManager(SelectionRegistrarImpl selectionRegistrarImpl) {
        C12775o.m28639i(selectionRegistrarImpl, "selectionRegistrar");
        this.selectionRegistrar = selectionRegistrarImpl;
        Offset.Companion companion = Offset.Companion;
        this.dragBeginPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m35411boximpl(companion.m35438getZeroF1C5BW0()), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.dragTotalDistance$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m35411boximpl(companion.m35438getZeroF1C5BW0()), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.startHandlePosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.endHandlePosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.draggingHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.currentDragPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        selectionRegistrarImpl.setOnPositionChangeCallback$foundation_release(new Function1<Long, C11921v>(this) {
            final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C11921v.f18618a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
                r0 = r0.getStart();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(long r6) {
                /*
                    r5 = this;
                    androidx.compose.foundation.text.selection.SelectionManager r0 = r5.this$0
                    androidx.compose.foundation.text.selection.Selection r0 = r0.getSelection()
                    r1 = 1
                    r2 = 0
                    if (r0 == 0) goto L_0x001a
                    androidx.compose.foundation.text.selection.Selection$AnchorInfo r0 = r0.getStart()
                    if (r0 == 0) goto L_0x001a
                    long r3 = r0.getSelectableId()
                    int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                    if (r0 != 0) goto L_0x001a
                    r0 = r1
                    goto L_0x001b
                L_0x001a:
                    r0 = r2
                L_0x001b:
                    if (r0 != 0) goto L_0x0037
                    androidx.compose.foundation.text.selection.SelectionManager r0 = r5.this$0
                    androidx.compose.foundation.text.selection.Selection r0 = r0.getSelection()
                    if (r0 == 0) goto L_0x0034
                    androidx.compose.foundation.text.selection.Selection$AnchorInfo r0 = r0.getEnd()
                    if (r0 == 0) goto L_0x0034
                    long r3 = r0.getSelectableId()
                    int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                    if (r6 != 0) goto L_0x0034
                    goto L_0x0035
                L_0x0034:
                    r1 = r2
                L_0x0035:
                    if (r1 == 0) goto L_0x0041
                L_0x0037:
                    androidx.compose.foundation.text.selection.SelectionManager r6 = r5.this$0
                    r6.updateHandleOffsets()
                    androidx.compose.foundation.text.selection.SelectionManager r6 = r5.this$0
                    r6.updateSelectionToolbarPosition()
                L_0x0041:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.C06581.invoke(long):void");
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateStartCallback$foundation_release(new C13089p<LayoutCoordinates, Offset, SelectionAdjustment, C11921v>(this) {
            final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                m33814invoked4ec7I((LayoutCoordinates) obj, ((Offset) obj2).m35432unboximpl(), (SelectionAdjustment) obj3);
                return C11921v.f18618a;
            }

            /* renamed from: invoke-d-4ec7I  reason: not valid java name */
            public final void m33814invoked4ec7I(LayoutCoordinates layoutCoordinates, long j, SelectionAdjustment selectionAdjustment) {
                C12775o.m28639i(layoutCoordinates, "layoutCoordinates");
                C12775o.m28639i(selectionAdjustment, "selectionMode");
                Offset r3 = this.this$0.m33799convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j);
                if (r3 != null) {
                    this.this$0.m33805startSelection9KIMszo(r3.m35432unboximpl(), false, selectionAdjustment);
                    this.this$0.getFocusRequester().requestFocus();
                    this.this$0.hideSelectionToolbar$foundation_release();
                }
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateSelectAll$foundation_release(new Function1<Long, C11921v>(this) {
            final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C11921v.f18618a;
            }

            public final void invoke(long j) {
                SelectionManager selectionManager = this.this$0;
                C11906l<Selection, Map<Long, Selection>> selectAll$foundation_release = selectionManager.selectAll$foundation_release(j, selectionManager.getSelection());
                Selection a = selectAll$foundation_release.mo49109a();
                Map b = selectAll$foundation_release.mo49110b();
                if (!C12775o.m28634d(a, this.this$0.getSelection())) {
                    this.this$0.selectionRegistrar.setSubselections(b);
                    this.this$0.getOnSelectionChange().invoke(a);
                }
                this.this$0.getFocusRequester().requestFocus();
                this.this$0.hideSelectionToolbar$foundation_release();
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateCallback$foundation_release(new C13091r<LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean>(this) {
            final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return m33815invoke5iVPX68((LayoutCoordinates) obj, ((Offset) obj2).m35432unboximpl(), ((Offset) obj3).m35432unboximpl(), ((Boolean) obj4).booleanValue(), (SelectionAdjustment) obj5);
            }

            /* renamed from: invoke-5iVPX68  reason: not valid java name */
            public final Boolean m33815invoke5iVPX68(LayoutCoordinates layoutCoordinates, long j, long j2, boolean z, SelectionAdjustment selectionAdjustment) {
                C12775o.m28639i(layoutCoordinates, "layoutCoordinates");
                C12775o.m28639i(selectionAdjustment, "selectionMode");
                return Boolean.valueOf(this.this$0.m33813updateSelectionRHHTvR4$foundation_release(this.this$0.m33799convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j), this.this$0.m33799convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j2), z, selectionAdjustment));
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateEndCallback$foundation_release(new C13074a<C11921v>(this) {
            final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                this.this$0.showSelectionToolbar$foundation_release();
                this.this$0.setDraggingHandle((Handle) null);
                this.this$0.m33800setCurrentDragPosition_kEHs6E((Offset) null);
            }
        });
        selectionRegistrarImpl.setOnSelectableChangeCallback$foundation_release(new Function1<Long, C11921v>(this) {
            final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C11921v.f18618a;
            }

            public final void invoke(long j) {
                if (this.this$0.selectionRegistrar.getSubselections().containsKey(Long.valueOf(j))) {
                    this.this$0.onRelease();
                    this.this$0.setSelection((Selection) null);
                }
            }
        });
        selectionRegistrarImpl.setAfterSelectableUnsubscribe$foundation_release(new Function1<Long, C11921v>(this) {
            final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C11921v.f18618a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
                r0 = r0.getStart();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(long r6) {
                /*
                    r5 = this;
                    androidx.compose.foundation.text.selection.SelectionManager r0 = r5.this$0
                    androidx.compose.foundation.text.selection.Selection r0 = r0.getSelection()
                    r1 = 1
                    r2 = 0
                    if (r0 == 0) goto L_0x001a
                    androidx.compose.foundation.text.selection.Selection$AnchorInfo r0 = r0.getStart()
                    if (r0 == 0) goto L_0x001a
                    long r3 = r0.getSelectableId()
                    int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                    if (r0 != 0) goto L_0x001a
                    r0 = r1
                    goto L_0x001b
                L_0x001a:
                    r0 = r2
                L_0x001b:
                    if (r0 != 0) goto L_0x0037
                    androidx.compose.foundation.text.selection.SelectionManager r0 = r5.this$0
                    androidx.compose.foundation.text.selection.Selection r0 = r0.getSelection()
                    if (r0 == 0) goto L_0x0034
                    androidx.compose.foundation.text.selection.Selection$AnchorInfo r0 = r0.getEnd()
                    if (r0 == 0) goto L_0x0034
                    long r3 = r0.getSelectableId()
                    int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                    if (r6 != 0) goto L_0x0034
                    goto L_0x0035
                L_0x0034:
                    r1 = r2
                L_0x0035:
                    if (r1 == 0) goto L_0x0042
                L_0x0037:
                    androidx.compose.foundation.text.selection.SelectionManager r6 = r5.this$0
                    r7 = 0
                    r6.m33804setStartHandlePosition_kEHs6E(r7)
                    androidx.compose.foundation.text.selection.SelectionManager r6 = r5.this$0
                    r6.m33803setEndHandlePosition_kEHs6E(r7)
                L_0x0042:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.C06647.invoke(long):void");
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: convertToContainerCoordinates-Q7Q5hAU  reason: not valid java name */
    public final Offset m33799convertToContainerCoordinatesQ7Q5hAU(LayoutCoordinates layoutCoordinates, long j) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        if (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) {
            return null;
        }
        return Offset.m35411boximpl(requireContainerCoordinates$foundation_release().m37342localPositionOfR5De75A(layoutCoordinates, j));
    }

    /* access modifiers changed from: private */
    public final Object detectNonConsumingTap(PointerInputScope pointerInputScope, Function1<? super Offset, C11921v> function1, C12074d<? super C11921v> dVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new SelectionManager$detectNonConsumingTap$2(function1, (C12074d<? super SelectionManager$detectNonConsumingTap$2>) null), dVar);
        if (awaitEachGesture == C12150d.m26492c()) {
            return awaitEachGesture;
        }
        return C11921v.f18618a;
    }

    private final Rect getContentRect() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2;
        Selection selection = getSelection();
        if (selection == null) {
            return Rect.Companion.getZero();
        }
        Selectable anchorSelectable$foundation_release = getAnchorSelectable$foundation_release(selection.getStart());
        Selectable anchorSelectable$foundation_release2 = getAnchorSelectable$foundation_release(selection.getEnd());
        if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
            return Rect.Companion.getZero();
        }
        if (anchorSelectable$foundation_release2 == null || (layoutCoordinates2 = anchorSelectable$foundation_release2.getLayoutCoordinates()) == null) {
            return Rect.Companion.getZero();
        }
        LayoutCoordinates layoutCoordinates3 = this.containerLayoutCoordinates;
        if (layoutCoordinates3 == null || !layoutCoordinates3.isAttached()) {
            return Rect.Companion.getZero();
        }
        long r6 = layoutCoordinates3.m37342localPositionOfR5De75A(layoutCoordinates, anchorSelectable$foundation_release.m33768getHandlePositiondBAh8RU(selection, true));
        long r8 = layoutCoordinates3.m37342localPositionOfR5De75A(layoutCoordinates2, anchorSelectable$foundation_release2.m33768getHandlePositiondBAh8RU(selection, false));
        long r62 = layoutCoordinates3.m37343localToRootMKHz9U(r6);
        long r82 = layoutCoordinates3.m37343localToRootMKHz9U(r8);
        float min = Math.min(Offset.m35422getXimpl(r62), Offset.m35422getXimpl(r82));
        float max = Math.max(Offset.m35422getXimpl(r62), Offset.m35422getXimpl(r82));
        long r13 = layoutCoordinates3.m37342localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(0.0f, anchorSelectable$foundation_release.getBoundingBox(selection.getStart().getOffset()).getTop()));
        long r0 = layoutCoordinates3.m37342localPositionOfR5De75A(layoutCoordinates2, OffsetKt.Offset(0.0f, anchorSelectable$foundation_release2.getBoundingBox(selection.getEnd().getOffset()).getTop()));
        return new Rect(min, Math.min(Offset.m35423getYimpl(layoutCoordinates3.m37343localToRootMKHz9U(r13)), Offset.m35423getYimpl(layoutCoordinates3.m37343localToRootMKHz9U(r0))), max, Math.max(Offset.m35423getYimpl(r62), Offset.m35423getYimpl(r82)) + ((float) (((double) SelectionHandlesKt.getHandleHeight()) * 4.0d)));
    }

    private final boolean getShouldShowMagnifier() {
        if (getDraggingHandle() != null) {
            return true;
        }
        return false;
    }

    private final Modifier onClearSelectionRequested(Modifier modifier, C13074a<C11921v> aVar) {
        if (getHasFocus()) {
            return SuspendingPointerInputFilterKt.pointerInput(modifier, (Object) C11921v.f18618a, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) new SelectionManager$onClearSelectionRequested$1(this, aVar, (C12074d<? super SelectionManager$onClearSelectionRequested$1>) null));
        }
        return modifier;
    }

    /* access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E  reason: not valid java name */
    public final void m33800setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }

    /* access modifiers changed from: private */
    /* renamed from: setDragBeginPosition-k-4lQ0M  reason: not valid java name */
    public final void m33801setDragBeginPositionk4lQ0M(long j) {
        this.dragBeginPosition$delegate.setValue(Offset.m35411boximpl(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: setDragTotalDistance-k-4lQ0M  reason: not valid java name */
    public final void m33802setDragTotalDistancek4lQ0M(long j) {
        this.dragTotalDistance$delegate.setValue(Offset.m35411boximpl(j));
    }

    /* access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    /* access modifiers changed from: private */
    /* renamed from: setEndHandlePosition-_kEHs6E  reason: not valid java name */
    public final void m33803setEndHandlePosition_kEHs6E(Offset offset) {
        this.endHandlePosition$delegate.setValue(offset);
    }

    /* access modifiers changed from: private */
    /* renamed from: setStartHandlePosition-_kEHs6E  reason: not valid java name */
    public final void m33804setStartHandlePosition_kEHs6E(Offset offset) {
        this.startHandlePosition$delegate.setValue(offset);
    }

    /* access modifiers changed from: private */
    /* renamed from: startSelection-9KIMszo  reason: not valid java name */
    public final void m33805startSelection9KIMszo(long j, boolean z, SelectionAdjustment selectionAdjustment) {
        m33812updateSelection3R_tFg$foundation_release(j, j, (Offset) null, z, selectionAdjustment);
    }

    /* access modifiers changed from: private */
    public final void updateHandleOffsets() {
        Selectable selectable;
        Selectable selectable2;
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2;
        boolean z;
        Selection.AnchorInfo end;
        Selection.AnchorInfo start;
        Selection selection = getSelection();
        LayoutCoordinates layoutCoordinates3 = this.containerLayoutCoordinates;
        Offset offset = null;
        if (selection == null || (start = selection.getStart()) == null) {
            selectable = null;
        } else {
            selectable = getAnchorSelectable$foundation_release(start);
        }
        if (selection == null || (end = selection.getEnd()) == null) {
            selectable2 = null;
        } else {
            selectable2 = getAnchorSelectable$foundation_release(end);
        }
        if (selectable != null) {
            layoutCoordinates = selectable.getLayoutCoordinates();
        } else {
            layoutCoordinates = null;
        }
        if (selectable2 != null) {
            layoutCoordinates2 = selectable2.getLayoutCoordinates();
        } else {
            layoutCoordinates2 = null;
        }
        if (selection == null || layoutCoordinates3 == null || !layoutCoordinates3.isAttached() || layoutCoordinates == null || layoutCoordinates2 == null) {
            m33804setStartHandlePosition_kEHs6E((Offset) null);
            m33803setEndHandlePosition_kEHs6E((Offset) null);
            return;
        }
        boolean z2 = true;
        long r8 = layoutCoordinates3.m37342localPositionOfR5De75A(layoutCoordinates, selectable.m33768getHandlePositiondBAh8RU(selection, true));
        long r4 = layoutCoordinates3.m37342localPositionOfR5De75A(layoutCoordinates2, selectable2.m33768getHandlePositiondBAh8RU(selection, false));
        Rect visibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates3);
        Offset r1 = Offset.m35411boximpl(r8);
        r1.m35432unboximpl();
        if (SelectionManagerKt.m33822containsInclusiveUv8p0NA(visibleBounds, r8) || getDraggingHandle() == Handle.SelectionStart) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            r1 = null;
        }
        m33804setStartHandlePosition_kEHs6E(r1);
        Offset r12 = Offset.m35411boximpl(r4);
        r12.m35432unboximpl();
        if (!SelectionManagerKt.m33822containsInclusiveUv8p0NA(visibleBounds, r4) && getDraggingHandle() != Handle.SelectionEnd) {
            z2 = false;
        }
        if (z2) {
            offset = r12;
        }
        m33803setEndHandlePosition_kEHs6E(offset);
    }

    /* access modifiers changed from: private */
    public final void updateSelectionToolbarPosition() {
        TextToolbarStatus textToolbarStatus;
        if (getHasFocus()) {
            TextToolbar textToolbar2 = this.textToolbar;
            if (textToolbar2 != null) {
                textToolbarStatus = textToolbar2.getStatus();
            } else {
                textToolbarStatus = null;
            }
            if (textToolbarStatus == TextToolbarStatus.Shown) {
                showSelectionToolbar$foundation_release();
            }
        }
    }

    /* renamed from: contextMenuOpenAdjustment-k-4lQ0M  reason: not valid java name */
    public final void m33806contextMenuOpenAdjustmentk4lQ0M(long j) {
        boolean z;
        Selection selection = getSelection();
        if (selection != null) {
            z = TextRange.m37969getCollapsedimpl(selection.m33771toTextRanged9O1mEE());
        } else {
            z = true;
        }
        if (z) {
            m33805startSelection9KIMszo(j, true, SelectionAdjustment.Companion.getWord());
        }
    }

    public final void copy$foundation_release() {
        ClipboardManager clipboardManager2;
        AnnotatedString selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release != null && (clipboardManager2 = this.clipboardManager) != null) {
            clipboardManager2.setText(selectedText$foundation_release);
        }
    }

    public final Selectable getAnchorSelectable$foundation_release(Selection.AnchorInfo anchorInfo) {
        C12775o.m28639i(anchorInfo, "anchor");
        return this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(anchorInfo.getSelectableId()));
    }

    public final ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    /* renamed from: getCurrentDragPosition-_m7T9-E  reason: not valid java name */
    public final Offset m33807getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    /* renamed from: getDragBeginPosition-F1C5BW0$foundation_release  reason: not valid java name */
    public final long m33808getDragBeginPositionF1C5BW0$foundation_release() {
        return ((Offset) this.dragBeginPosition$delegate.getValue()).m35432unboximpl();
    }

    /* renamed from: getDragTotalDistance-F1C5BW0$foundation_release  reason: not valid java name */
    public final long m33809getDragTotalDistanceF1C5BW0$foundation_release() {
        return ((Offset) this.dragTotalDistance$delegate.getValue()).m35432unboximpl();
    }

    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    /* renamed from: getEndHandlePosition-_m7T9-E  reason: not valid java name */
    public final Offset m33810getEndHandlePosition_m7T9E() {
        return (Offset) this.endHandlePosition$delegate.getValue();
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    public final Modifier getModifier() {
        Modifier modifier = Modifier.Companion;
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(modifier, new SelectionManager$modifier$1(this)), new SelectionManager$modifier$2(this)), this.focusRequester), new SelectionManager$modifier$3(this)), false, (MutableInteractionSource) null, 3, (Object) null), new SelectionManager$modifier$4(this));
        if (getShouldShowMagnifier()) {
            modifier = SelectionManager_androidKt.selectionMagnifier(modifier, this);
        }
        return onKeyEvent.then(modifier);
    }

    public final Function1<Selection, C11921v> getOnSelectionChange() {
        return this.onSelectionChange;
    }

    public final AnnotatedString getSelectedText$foundation_release() {
        AnnotatedString plus;
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        Selection selection = getSelection();
        AnnotatedString annotatedString = null;
        if (selection == null) {
            return null;
        }
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            Selectable selectable = sort.get(i);
            if (selectable.getSelectableId() == selection.getStart().getSelectableId() || selectable.getSelectableId() == selection.getEnd().getSelectableId() || annotatedString != null) {
                AnnotatedString currentSelectedText = SelectionManagerKt.getCurrentSelectedText(selectable, selection);
                if (!(annotatedString == null || (plus = annotatedString.plus(currentSelectedText)) == null)) {
                    currentSelectedText = plus;
                }
                if ((selectable.getSelectableId() == selection.getEnd().getSelectableId() && !selection.getHandlesCrossed()) || (selectable.getSelectableId() == selection.getStart().getSelectableId() && selection.getHandlesCrossed())) {
                    return currentSelectedText;
                }
                annotatedString = currentSelectedText;
            }
        }
        return annotatedString;
    }

    public final Selection getSelection() {
        return this._selection.getValue();
    }

    /* renamed from: getStartHandlePosition-_m7T9-E  reason: not valid java name */
    public final Offset m33811getStartHandlePosition_m7T9E() {
        return (Offset) this.startHandlePosition$delegate.getValue();
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final boolean getTouchMode() {
        return this.touchMode;
    }

    public final TextDragObserver handleDragObserver(boolean z) {
        return new SelectionManager$handleDragObserver$1(this, z);
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbarStatus textToolbarStatus;
        TextToolbar textToolbar2;
        if (getHasFocus()) {
            TextToolbar textToolbar3 = this.textToolbar;
            if (textToolbar3 != null) {
                textToolbarStatus = textToolbar3.getStatus();
            } else {
                textToolbarStatus = null;
            }
            if (textToolbarStatus == TextToolbarStatus.Shown && (textToolbar2 = this.textToolbar) != null) {
                textToolbar2.hide();
            }
        }
    }

    public final void onRelease() {
        this.selectionRegistrar.setSubselections(C12716r0.m28416g());
        hideSelectionToolbar$foundation_release();
        if (getSelection() != null) {
            this.onSelectionChange.invoke(null);
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.m36401performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m36410getTextHandleMove5zf0vsI());
            }
        }
    }

    public final LayoutCoordinates requireContainerCoordinates$foundation_release() {
        boolean z;
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (layoutCoordinates.isAttached()) {
            return layoutCoordinates;
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final C11906l<Selection, Map<Long, Selection>> selectAll$foundation_release(long j, Selection selection) {
        HapticFeedback hapticFeedback;
        Selection selection2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        Selection selection3 = null;
        for (int i = 0; i < size; i++) {
            Selectable selectable = sort.get(i);
            if (selectable.getSelectableId() == j) {
                selection2 = selectable.getSelectAllSelection();
            } else {
                selection2 = null;
            }
            if (selection2 != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selection2);
            }
            selection3 = SelectionManagerKt.merge(selection3, selection2);
        }
        if (!C12775o.m28634d(selection3, selection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.m36401performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m36410getTextHandleMove5zf0vsI());
        }
        return new C11906l<>(selection3, linkedHashMap);
    }

    public final void setClipboardManager(ClipboardManager clipboardManager2) {
        this.clipboardManager = clipboardManager2;
    }

    public final void setContainerLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        Offset offset;
        this.containerLayoutCoordinates = layoutCoordinates;
        if (getHasFocus() && getSelection() != null) {
            if (layoutCoordinates != null) {
                offset = Offset.m35411boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates));
            } else {
                offset = null;
            }
            if (!C12775o.m28634d(this.previousPosition, offset)) {
                this.previousPosition = offset;
                updateHandleOffsets();
                updateSelectionToolbarPosition();
            }
        }
    }

    public final void setFocusRequester(FocusRequester focusRequester2) {
        C12775o.m28639i(focusRequester2, "<set-?>");
        this.focusRequester = focusRequester2;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setOnSelectionChange(Function1<? super Selection, C11921v> function1) {
        C12775o.m28639i(function1, "<set-?>");
        this.onSelectionChange = function1;
    }

    public final void setSelection(Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    public final void setTextToolbar(TextToolbar textToolbar2) {
        this.textToolbar = textToolbar2;
    }

    public final void setTouchMode(boolean z) {
        this.touchMode = z;
    }

    public final void showSelectionToolbar$foundation_release() {
        TextToolbar textToolbar2;
        if (getHasFocus() && getSelection() != null && (textToolbar2 = this.textToolbar) != null) {
            TextToolbar.showMenu$default(textToolbar2, getContentRect(), new SelectionManager$showSelectionToolbar$1$1(this), (C13074a) null, (C13074a) null, (C13074a) null, 28, (Object) null);
        }
    }

    /* renamed from: updateSelection-3R_-tFg$foundation_release  reason: not valid java name */
    public final boolean m33812updateSelection3R_tFg$foundation_release(long j, long j2, Offset offset, boolean z, SelectionAdjustment selectionAdjustment) {
        Handle handle;
        Offset offset2;
        C12775o.m28639i(selectionAdjustment, "adjustment");
        if (z) {
            handle = Handle.SelectionStart;
        } else {
            handle = Handle.SelectionEnd;
        }
        setDraggingHandle(handle);
        if (z) {
            offset2 = Offset.m35411boximpl(j);
        } else {
            offset2 = Offset.m35411boximpl(j2);
        }
        m33800setCurrentDragPosition_kEHs6E(offset2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        Selection selection = null;
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            Selectable selectable = sort.get(i);
            int i2 = i;
            Selection selection2 = selection;
            C11906l<Selection, Boolean> r1 = selectable.m33770updateSelectionqCDeeow(j, j2, offset, z, requireContainerCoordinates$foundation_release(), selectionAdjustment, this.selectionRegistrar.getSubselections().get(Long.valueOf(selectable.getSelectableId())));
            Selection a = r1.mo49109a();
            boolean booleanValue = r1.mo49110b().booleanValue();
            if (z2 || booleanValue) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (a != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), a);
            }
            selection = SelectionManagerKt.merge(selection2, a);
            i = i2 + 1;
        }
        Selection selection3 = selection;
        if (!C12775o.m28634d(selection3, getSelection())) {
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.m36401performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m36410getTextHandleMove5zf0vsI());
            }
            this.selectionRegistrar.setSubselections(linkedHashMap);
            this.onSelectionChange.invoke(selection3);
        }
        return z2;
    }

    /* renamed from: updateSelection-RHHTvR4$foundation_release  reason: not valid java name */
    public final boolean m33813updateSelectionRHHTvR4$foundation_release(Offset offset, Offset offset2, boolean z, SelectionAdjustment selectionAdjustment) {
        Selection selection;
        long j;
        Offset offset3;
        long j2;
        C12775o.m28639i(selectionAdjustment, "adjustment");
        if (offset == null || (selection = getSelection()) == null) {
            return false;
        }
        if (z) {
            j = selection.getEnd().getSelectableId();
        } else {
            j = selection.getStart().getSelectableId();
        }
        Selectable selectable = this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(j));
        if (selectable == null) {
            offset3 = null;
        } else {
            LayoutCoordinates layoutCoordinates = selectable.getLayoutCoordinates();
            C12775o.m28636f(layoutCoordinates);
            offset3 = m33799convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, SelectionHandlesKt.m33786getAdjustedCoordinatesk4lQ0M(selectable.m33768getHandlePositiondBAh8RU(selection, !z)));
        }
        if (offset3 == null) {
            return false;
        }
        long r0 = offset3.m35432unboximpl();
        if (z) {
            j2 = offset.m35432unboximpl();
        } else {
            j2 = r0;
        }
        if (!z) {
            r0 = offset.m35432unboximpl();
        }
        return m33812updateSelection3R_tFg$foundation_release(j2, r0, offset2, z, selectionAdjustment);
    }
}
