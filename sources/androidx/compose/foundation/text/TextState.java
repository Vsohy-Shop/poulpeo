package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,702:1\n76#2:703\n102#2,2:704\n76#2:706\n102#2,2:707\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextState\n*L\n579#1:703\n579#1:704,2\n581#1:706\n581#1:707,2\n*E\n"})
/* compiled from: CoreText.kt */
public final class TextState {
    private final MutableState drawScopeInvalidation$delegate;
    private LayoutCoordinates layoutCoordinates;
    private final MutableState layoutInvalidation$delegate;
    private TextLayoutResult layoutResult;
    private Function1<? super TextLayoutResult, C11921v> onTextLayout = TextState$onTextLayout$1.INSTANCE;
    private long previousGlobalPosition;
    private Selectable selectable;
    private final long selectableId;
    private long selectionBackgroundColor;
    private TextDelegate textDelegate;

    public TextState(TextDelegate textDelegate2, long j) {
        C12775o.m28639i(textDelegate2, "textDelegate");
        this.selectableId = j;
        this.textDelegate = textDelegate2;
        this.previousGlobalPosition = Offset.Companion.m35438getZeroF1C5BW0();
        this.selectionBackgroundColor = Color.Companion.m35707getUnspecified0d7_KjU();
        C11921v vVar = C11921v.f18618a;
        this.drawScopeInvalidation$delegate = SnapshotStateKt.mutableStateOf(vVar, SnapshotStateKt.neverEqualPolicy());
        this.layoutInvalidation$delegate = SnapshotStateKt.mutableStateOf(vVar, SnapshotStateKt.neverEqualPolicy());
    }

    private final void setDrawScopeInvalidation(C11921v vVar) {
        this.drawScopeInvalidation$delegate.setValue(vVar);
    }

    private final void setLayoutInvalidation(C11921v vVar) {
        this.layoutInvalidation$delegate.setValue(vVar);
    }

    public final C11921v getDrawScopeInvalidation() {
        this.drawScopeInvalidation$delegate.getValue();
        return C11921v.f18618a;
    }

    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public final C11921v getLayoutInvalidation() {
        this.layoutInvalidation$delegate.getValue();
        return C11921v.f18618a;
    }

    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    public final Function1<TextLayoutResult, C11921v> getOnTextLayout() {
        return this.onTextLayout;
    }

    /* renamed from: getPreviousGlobalPosition-F1C5BW0  reason: not valid java name */
    public final long m33744getPreviousGlobalPositionF1C5BW0() {
        return this.previousGlobalPosition;
    }

    public final Selectable getSelectable() {
        return this.selectable;
    }

    public final long getSelectableId() {
        return this.selectableId;
    }

    /* renamed from: getSelectionBackgroundColor-0d7_KjU  reason: not valid java name */
    public final long m33745getSelectionBackgroundColor0d7_KjU() {
        return this.selectionBackgroundColor;
    }

    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates2) {
        this.layoutCoordinates = layoutCoordinates2;
    }

    public final void setLayoutResult(TextLayoutResult textLayoutResult) {
        setDrawScopeInvalidation(C11921v.f18618a);
        this.layoutResult = textLayoutResult;
    }

    public final void setOnTextLayout(Function1<? super TextLayoutResult, C11921v> function1) {
        C12775o.m28639i(function1, "<set-?>");
        this.onTextLayout = function1;
    }

    /* renamed from: setPreviousGlobalPosition-k-4lQ0M  reason: not valid java name */
    public final void m33746setPreviousGlobalPositionk4lQ0M(long j) {
        this.previousGlobalPosition = j;
    }

    public final void setSelectable(Selectable selectable2) {
        this.selectable = selectable2;
    }

    /* renamed from: setSelectionBackgroundColor-8_81llA  reason: not valid java name */
    public final void m33747setSelectionBackgroundColor8_81llA(long j) {
        this.selectionBackgroundColor = j;
    }

    public final void setTextDelegate(TextDelegate textDelegate2) {
        C12775o.m28639i(textDelegate2, "value");
        setLayoutInvalidation(C11921v.f18618a);
        this.textDelegate = textDelegate2;
    }
}
