package androidx.compose.p002ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.Ref$ObjectRef;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy */
/* compiled from: ViewCompositionStrategy.android.kt */
public interface ViewCompositionStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$Companion */
    /* compiled from: ViewCompositionStrategy.android.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ViewCompositionStrategy getDefault() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow */
    /* compiled from: ViewCompositionStrategy.android.kt */
    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final DisposeOnDetachedFromWindow INSTANCE = new DisposeOnDetachedFromWindow();

        private DisposeOnDetachedFromWindow() {
        }

        public C13074a<C11921v> installFor(AbstractComposeView abstractComposeView) {
            C12775o.m28639i(abstractComposeView, "view");
            C1096xb3f1a111 viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1 = new C1096xb3f1a111(abstractComposeView);
            abstractComposeView.addOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1);
            return new ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1(abstractComposeView, viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool */
    /* compiled from: ViewCompositionStrategy.android.kt */
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool INSTANCE = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        private DisposeOnDetachedFromWindowOrReleasedFromPool() {
        }

        public C13074a<C11921v> installFor(AbstractComposeView abstractComposeView) {
            C12775o.m28639i(abstractComposeView, "view");
            C1098x994eb477 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 = new C1098x994eb477(abstractComposeView);
            abstractComposeView.addOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1);
            C1099x65f92fb2 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$poolingContainerListener$1 = new C1099x65f92fb2(abstractComposeView);
            PoolingContainer.addPoolingContainerListener(abstractComposeView, viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$poolingContainerListener$1);
            return new C1097x11b1833b(abstractComposeView, viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1, viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$poolingContainerListener$1);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed */
    /* compiled from: ViewCompositionStrategy.android.kt */
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final DisposeOnViewTreeLifecycleDestroyed INSTANCE = new DisposeOnViewTreeLifecycleDestroyed();

        private DisposeOnViewTreeLifecycleDestroyed() {
        }

        public C13074a<C11921v> installFor(AbstractComposeView abstractComposeView) {
            C12775o.m28639i(abstractComposeView, "view");
            if (abstractComposeView.isAttachedToWindow()) {
                LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(abstractComposeView);
                if (lifecycleOwner != null) {
                    return ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView, lifecycleOwner.getLifecycle());
                }
                throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            C1102xe2c59457 viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1 = new C1102xe2c59457(abstractComposeView, ref$ObjectRef);
            abstractComposeView.addOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1);
            ref$ObjectRef.f20403b = new C1100x565475b(abstractComposeView, viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1);
            return new C1101x565475c(ref$ObjectRef);
        }
    }

    C13074a<C11921v> installFor(AbstractComposeView abstractComposeView);

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnLifecycleDestroyed */
    /* compiled from: ViewCompositionStrategy.android.kt */
    public static final class DisposeOnLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 8;
        private final Lifecycle lifecycle;

        public DisposeOnLifecycleDestroyed(Lifecycle lifecycle2) {
            C12775o.m28639i(lifecycle2, "lifecycle");
            this.lifecycle = lifecycle2;
        }

        public C13074a<C11921v> installFor(AbstractComposeView abstractComposeView) {
            C12775o.m28639i(abstractComposeView, "view");
            return ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView, this.lifecycle);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public DisposeOnLifecycleDestroyed(LifecycleOwner lifecycleOwner) {
            this(lifecycleOwner.getLifecycle());
            C12775o.m28639i(lifecycleOwner, "lifecycleOwner");
        }
    }
}
