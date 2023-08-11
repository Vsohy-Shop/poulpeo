package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,906:1\n50#2:907\n49#2:908\n1114#3,6:909\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n*L\n809#1:907\n809#1:908\n809#1:909,6\n*E\n"})
/* compiled from: TextFieldSelectionManager.kt */
public final class TextFieldSelectionManagerKt {

    /* compiled from: TextFieldSelectionManager.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.foundation.text.Handle[] r0 = androidx.compose.foundation.text.Handle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.Cursor     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.SelectionStart     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.SelectionEnd     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.WhenMappings.<clinit>():void");
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldSelectionHandle(boolean z, ResolvedTextDirection resolvedTextDirection, TextFieldSelectionManager textFieldSelectionManager, Composer composer, int i) {
        C12775o.m28639i(resolvedTextDirection, "direction");
        C12775o.m28639i(textFieldSelectionManager, "manager");
        Composer startRestartGroup = composer.startRestartGroup(-1344558920);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344558920, i, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:803)");
        }
        Boolean valueOf = Boolean.valueOf(z);
        startRestartGroup.startReplaceableGroup(511388516);
        boolean changed = startRestartGroup.changed((Object) valueOf) | startRestartGroup.changed((Object) textFieldSelectionManager);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = textFieldSelectionManager.handleDragObserver$foundation_release(z);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
        int i2 = i << 3;
        AndroidSelectionHandles_androidKt.m33750SelectionHandle8fL75g(textFieldSelectionManager.m33846getHandlePositiontuRUvjQ$foundation_release(z), z, resolvedTextDirection, TextRange.m37974getReversedimpl(textFieldSelectionManager.getValue$foundation_release().m38194getSelectiond9O1mEE()), SuspendingPointerInputFilterKt.pointerInput((Modifier) Modifier.Companion, (Object) textDragObserver, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) new TextFieldSelectionManagerKt$TextFieldSelectionHandle$1(textDragObserver, (C12074d<? super TextFieldSelectionManagerKt$TextFieldSelectionHandle$1>) null)), (C13088o<? super Composer, ? super Integer, C11921v>) null, startRestartGroup, (i2 & 112) | ProfileVerifier.CompilationStatus.f1069xf2722a21 | (i2 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(z, resolvedTextDirection, textFieldSelectionManager, i));
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c  reason: not valid java name */
    public static final long m33860calculateSelectionMagnifierCenterAndroidO0kMr_c(TextFieldSelectionManager textFieldSelectionManager, long j) {
        boolean z;
        int i;
        int i2;
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        TextDelegate textDelegate;
        AnnotatedString text;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResultProxy layoutResult2;
        LayoutCoordinates innerTextFieldCoordinates;
        boolean z2;
        TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
        C12775o.m28639i(textFieldSelectionManager, "manager");
        if (textFieldSelectionManager.getValue$foundation_release().getText().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = textFieldSelectionManager.getDraggingHandle();
        if (draggingHandle == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        }
        if (i == -1) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        if (i == 1 || i == 2) {
            i2 = TextRange.m37975getStartimpl(textFieldSelectionManager.getValue$foundation_release().m38194getSelectiond9O1mEE());
        } else if (i == 3) {
            i2 = TextRange.m37970getEndimpl(textFieldSelectionManager.getValue$foundation_release().m38194getSelectiond9O1mEE());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int originalToTransformed = textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(i2);
        TextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        TextFieldState state$foundation_release2 = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release2 == null || (textDelegate = state$foundation_release2.getTextDelegate()) == null || (text = textDelegate.getText()) == null) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        int n = C13537l.m30887n(originalToTransformed, C13755w.m31564P(text));
        long r6 = value.getBoundingBox(n).m35452getCenterF1C5BW0();
        TextFieldState state$foundation_release3 = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release3 == null || (layoutCoordinates = state$foundation_release3.getLayoutCoordinates()) == null) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        TextFieldState state$foundation_release4 = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release4 == null || (layoutResult2 = state$foundation_release4.getLayoutResult()) == null || (innerTextFieldCoordinates = layoutResult2.getInnerTextFieldCoordinates()) == null) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        Offset r10 = textFieldSelectionManager.m33844getCurrentDragPosition_m7T9E();
        if (r10 == null) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        float r102 = Offset.m35422getXimpl(innerTextFieldCoordinates.m37342localPositionOfR5De75A(layoutCoordinates, r10.m35432unboximpl()));
        int lineForOffset = value.getLineForOffset(n);
        int lineStart = value.getLineStart(lineForOffset);
        int lineEnd = value.getLineEnd(lineForOffset, true);
        if (TextRange.m37975getStartimpl(textFieldSelectionManager.getValue$foundation_release().m38194getSelectiond9O1mEE()) > TextRange.m37970getEndimpl(textFieldSelectionManager.getValue$foundation_release().m38194getSelectiond9O1mEE())) {
            z2 = true;
        } else {
            z2 = false;
        }
        float horizontalPosition = TextSelectionDelegateKt.getHorizontalPosition(value, lineStart, true, z2);
        float horizontalPosition2 = TextSelectionDelegateKt.getHorizontalPosition(value, lineEnd, false, z2);
        float l = C13537l.m30885l(r102, Math.min(horizontalPosition, horizontalPosition2), Math.max(horizontalPosition, horizontalPosition2));
        if (Math.abs(r102 - l) > ((float) (IntSize.m38628getWidthimpl(j) / 2))) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        return layoutCoordinates.m37342localPositionOfR5De75A(innerTextFieldCoordinates, OffsetKt.Offset(l, Offset.m35423getYimpl(r6)));
    }

    public static final boolean isSelectionHandleInVisibleBound(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        LayoutCoordinates layoutCoordinates;
        Rect visibleBounds;
        C12775o.m28639i(textFieldSelectionManager, "<this>");
        TextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release == null || (layoutCoordinates = state$foundation_release.getLayoutCoordinates()) == null || (visibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates)) == null) {
            return false;
        }
        return SelectionManagerKt.m33822containsInclusiveUv8p0NA(visibleBounds, textFieldSelectionManager.m33846getHandlePositiontuRUvjQ$foundation_release(z));
    }
}
