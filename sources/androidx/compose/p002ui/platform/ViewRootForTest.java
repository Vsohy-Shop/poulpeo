package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p002ui.node.RootForTest;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;

@VisibleForTesting
/* renamed from: androidx.compose.ui.platform.ViewRootForTest */
/* compiled from: ViewRootForTest.android.kt */
public interface ViewRootForTest extends RootForTest {
    public static final Companion Companion = Companion.$$INSTANCE;

    boolean getHasPendingMeasureOrLayout();

    View getView();

    void invalidateDescendants();

    boolean isLifecycleInResumedState();

    /* renamed from: androidx.compose.ui.platform.ViewRootForTest$Companion */
    /* compiled from: ViewRootForTest.android.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static Function1<? super ViewRootForTest, C11921v> onViewCreatedCallback;

        private Companion() {
        }

        public final Function1<ViewRootForTest, C11921v> getOnViewCreatedCallback() {
            return onViewCreatedCallback;
        }

        public final void setOnViewCreatedCallback(Function1<? super ViewRootForTest, C11921v> function1) {
            onViewCreatedCallback = function1;
        }

        @VisibleForTesting
        public static /* synthetic */ void getOnViewCreatedCallback$annotations() {
        }
    }
}
