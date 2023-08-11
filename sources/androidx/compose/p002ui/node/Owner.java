package androidx.compose.p002ui.node;

import android.view.KeyEvent;
import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.autofill.Autofill;
import androidx.compose.p002ui.autofill.AutofillTree;
import androidx.compose.p002ui.focus.FocusDirection;
import androidx.compose.p002ui.focus.FocusOwner;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.hapticfeedback.HapticFeedback;
import androidx.compose.p002ui.input.InputModeManager;
import androidx.compose.p002ui.input.pointer.PointerIconService;
import androidx.compose.p002ui.modifier.ModifierLocalManager;
import androidx.compose.p002ui.platform.AccessibilityManager;
import androidx.compose.p002ui.platform.ClipboardManager;
import androidx.compose.p002ui.platform.TextToolbar;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.platform.WindowInfo;
import androidx.compose.p002ui.text.font.Font;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.input.PlatformTextInputPluginRegistry;
import androidx.compose.p002ui.text.input.TextInputService;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.node.Owner */
/* compiled from: Owner.kt */
public interface Owner {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: androidx.compose.ui.node.Owner$Companion */
    /* compiled from: Owner.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean enableExtraAssertions;

        private Companion() {
        }

        public final boolean getEnableExtraAssertions() {
            return enableExtraAssertions;
        }

        public final void setEnableExtraAssertions(boolean z) {
            enableExtraAssertions = z;
        }
    }

    /* renamed from: androidx.compose.ui.node.Owner$OnLayoutCompletedListener */
    /* compiled from: Owner.kt */
    public interface OnLayoutCompletedListener {
        void onLayoutComplete();
    }

    static /* synthetic */ void measureAndLayout$default(Owner owner, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            owner.measureAndLayout(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
    }

    static /* synthetic */ void onRequestMeasure$default(Owner owner, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            owner.onRequestMeasure(layoutNode, z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
    }

    static /* synthetic */ void onRequestRelayout$default(Owner owner, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            owner.onRequestRelayout(layoutNode, z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
    }

    /* renamed from: calculateLocalPosition-MK-Hz9U  reason: not valid java name */
    long m37675calculateLocalPositionMKHz9U(long j);

    /* renamed from: calculatePositionInWindow-MK-Hz9U  reason: not valid java name */
    long m37676calculatePositionInWindowMKHz9U(long j);

    OwnedLayer createLayer(Function1<? super Canvas, C11921v> function1, C13074a<C11921v> aVar);

    void forceMeasureTheSubtree(LayoutNode layoutNode);

    AccessibilityManager getAccessibilityManager();

    @ExperimentalComposeUiApi
    Autofill getAutofill();

    @ExperimentalComposeUiApi
    AutofillTree getAutofillTree();

    ClipboardManager getClipboardManager();

    Density getDensity();

    /* renamed from: getFocusDirection-P8AzH3I  reason: not valid java name */
    FocusDirection m37677getFocusDirectionP8AzH3I(KeyEvent keyEvent);

    FocusOwner getFocusOwner();

    FontFamily.Resolver getFontFamilyResolver();

    Font.ResourceLoader getFontLoader();

    HapticFeedback getHapticFeedBack();

    InputModeManager getInputModeManager();

    LayoutDirection getLayoutDirection();

    long getMeasureIteration();

    ModifierLocalManager getModifierLocalManager();

    PlatformTextInputPluginRegistry getPlatformTextInputPluginRegistry();

    PointerIconService getPointerIconService();

    LayoutNode getRoot();

    RootForTest getRootForTest();

    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    TextInputService getTextInputService();

    TextToolbar getTextToolbar();

    ViewConfiguration getViewConfiguration();

    WindowInfo getWindowInfo();

    void measureAndLayout(boolean z);

    /* renamed from: measureAndLayout-0kLqBqw  reason: not valid java name */
    void m37678measureAndLayout0kLqBqw(LayoutNode layoutNode, long j);

    void onAttach(LayoutNode layoutNode);

    void onDetach(LayoutNode layoutNode);

    void onEndApplyChanges();

    void onLayoutChange(LayoutNode layoutNode);

    void onRequestMeasure(LayoutNode layoutNode, boolean z, boolean z2);

    void onRequestRelayout(LayoutNode layoutNode, boolean z, boolean z2);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(C13074a<C11921v> aVar);

    void registerOnLayoutCompletedListener(OnLayoutCompletedListener onLayoutCompletedListener);

    boolean requestFocus();

    void requestOnPositionedCallback(LayoutNode layoutNode);

    @InternalCoreApi
    void setShowLayoutBounds(boolean z);

    @ExperimentalComposeUiApi
    static /* synthetic */ void getAutofill$annotations() {
    }

    @ExperimentalComposeUiApi
    static /* synthetic */ void getAutofillTree$annotations() {
    }

    static /* synthetic */ void getFontLoader$annotations() {
    }

    static /* synthetic */ void getPlatformTextInputPluginRegistry$annotations() {
    }
}
