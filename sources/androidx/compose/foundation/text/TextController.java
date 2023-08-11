package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.DrawModifierKt;
import androidx.compose.p002ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p002ui.graphics.RenderEffect;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.input.pointer.PointerIconKt;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n1#2:703\n*E\n"})
/* compiled from: CoreText.kt */
public final class TextController implements RememberObserver {
    private final Modifier coreModifiers;
    public TextDragObserver longPressDragObserver;
    private final MeasurePolicy measurePolicy = new TextController$measurePolicy$1(this);
    private Modifier selectionModifiers;
    /* access modifiers changed from: private */
    public SelectionRegistrar selectionRegistrar;
    private Modifier semanticsModifier;
    private final TextState state;

    public TextController(TextState textState) {
        C12775o.m28639i(textState, "state");
        this.state = textState;
        Modifier.Companion companion = Modifier.Companion;
        this.coreModifiers = OnGloballyPositionedModifierKt.onGloballyPositioned(drawTextAndSelectionBehind(companion), new TextController$coreModifiers$1(this));
        this.semanticsModifier = createSemanticsModifierFor(textState.getTextDelegate().getText());
        this.selectionModifiers = companion;
    }

    private final Modifier createSemanticsModifierFor(AnnotatedString annotatedString) {
        return SemanticsModifierKt.semantics$default(Modifier.Companion, false, new TextController$createSemanticsModifierFor$1(annotatedString, this), 1, (Object) null);
    }

    @Stable
    private final Modifier drawTextAndSelectionBehind(Modifier modifier) {
        return DrawModifierKt.drawBehind(GraphicsLayerModifierKt.m35817graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (Shape) null, false, (RenderEffect) null, 0, 0, 0, 131071, (Object) null), new TextController$drawTextAndSelectionBehind$1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: outOfBoundary-0a9Yr6o  reason: not valid java name */
    public final boolean m33697outOfBoundary0a9Yr6o(long j, long j2) {
        TextLayoutResult layoutResult = this.state.getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        int length = layoutResult.getLayoutInput().getText().getText().length();
        int r4 = layoutResult.m37947getOffsetForPositionk4lQ0M(j);
        int r5 = layoutResult.m37947getOffsetForPositionk4lQ0M(j2);
        int i = length - 1;
        if ((r4 < i || r5 < i) && (r4 >= 0 || r5 >= 0)) {
            return false;
        }
        return true;
    }

    public final TextDragObserver getLongPressDragObserver() {
        TextDragObserver textDragObserver = this.longPressDragObserver;
        if (textDragObserver != null) {
            return textDragObserver;
        }
        C12775o.m28656z("longPressDragObserver");
        return null;
    }

    public final MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    public final Modifier getModifiers() {
        return HeightInLinesModifierKt.heightInLines$default(this.coreModifiers, this.state.getTextDelegate().getStyle(), this.state.getTextDelegate().getMinLines(), 0, 4, (Object) null).then(this.semanticsModifier).then(this.selectionModifiers);
    }

    public final Modifier getSemanticsModifier$foundation_release() {
        return this.semanticsModifier;
    }

    public final TextState getState() {
        return this.state;
    }

    public void onAbandoned() {
        SelectionRegistrar selectionRegistrar2;
        Selectable selectable = this.state.getSelectable();
        if (selectable != null && (selectionRegistrar2 = this.selectionRegistrar) != null) {
            selectionRegistrar2.unsubscribe(selectable);
        }
    }

    public void onForgotten() {
        SelectionRegistrar selectionRegistrar2;
        Selectable selectable = this.state.getSelectable();
        if (selectable != null && (selectionRegistrar2 = this.selectionRegistrar) != null) {
            selectionRegistrar2.unsubscribe(selectable);
        }
    }

    public void onRemembered() {
        SelectionRegistrar selectionRegistrar2 = this.selectionRegistrar;
        if (selectionRegistrar2 != null) {
            TextState textState = this.state;
            textState.setSelectable(selectionRegistrar2.subscribe(new MultiWidgetSelectionDelegate(textState.getSelectableId(), new TextController$onRemembered$1$1(this), new TextController$onRemembered$1$2(this))));
        }
    }

    public final void setLongPressDragObserver(TextDragObserver textDragObserver) {
        C12775o.m28639i(textDragObserver, "<set-?>");
        this.longPressDragObserver = textDragObserver;
    }

    public final void setTextDelegate(TextDelegate textDelegate) {
        C12775o.m28639i(textDelegate, "textDelegate");
        if (this.state.getTextDelegate() != textDelegate) {
            this.state.setTextDelegate(textDelegate);
            this.semanticsModifier = createSemanticsModifierFor(this.state.getTextDelegate().getText());
        }
    }

    public final void update(SelectionRegistrar selectionRegistrar2) {
        Modifier modifier;
        this.selectionRegistrar = selectionRegistrar2;
        if (selectionRegistrar2 == null) {
            modifier = Modifier.Companion;
        } else if (TouchMode_androidKt.isInTouchMode()) {
            setLongPressDragObserver(new TextController$update$1(this, selectionRegistrar2));
            modifier = SuspendingPointerInputFilterKt.pointerInput((Modifier) Modifier.Companion, (Object) getLongPressDragObserver(), (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) new TextController$update$2(this, (C12074d<? super TextController$update$2>) null));
        } else {
            TextController$update$mouseSelectionObserver$1 textController$update$mouseSelectionObserver$1 = new TextController$update$mouseSelectionObserver$1(this, selectionRegistrar2);
            modifier = PointerIconKt.pointerHoverIcon$default(SuspendingPointerInputFilterKt.pointerInput((Modifier) Modifier.Companion, (Object) textController$update$mouseSelectionObserver$1, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) new TextController$update$3(textController$update$mouseSelectionObserver$1, (C12074d<? super TextController$update$3>) null)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, (Object) null);
        }
        this.selectionModifiers = modifier;
    }
}
