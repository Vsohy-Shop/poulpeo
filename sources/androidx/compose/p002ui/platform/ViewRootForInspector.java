package androidx.compose.p002ui.platform;

import android.view.View;

/* renamed from: androidx.compose.ui.platform.ViewRootForInspector */
/* compiled from: ViewRootForInspector.android.kt */
public interface ViewRootForInspector {

    /* renamed from: androidx.compose.ui.platform.ViewRootForInspector$DefaultImpls */
    /* compiled from: ViewRootForInspector.android.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static AbstractComposeView getSubCompositionView(ViewRootForInspector viewRootForInspector) {
            return ViewRootForInspector.super.getSubCompositionView();
        }

        @Deprecated
        public static View getViewRoot(ViewRootForInspector viewRootForInspector) {
            return ViewRootForInspector.super.getViewRoot();
        }
    }

    AbstractComposeView getSubCompositionView() {
        return null;
    }

    View getViewRoot() {
        return null;
    }
}
