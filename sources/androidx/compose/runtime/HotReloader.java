package androidx.compose.runtime;

import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Composition.kt */
final class HotReloader {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* compiled from: Composition.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void loadStateAndCompose(Object obj) {
            Recomposer.Companion.loadStateAndComposeForHotReload$runtime_release(obj);
        }

        private final Object saveStateAndDispose(Object obj) {
            return Recomposer.Companion.saveStateAndDisposeForHotReload$runtime_release();
        }

        public final void clearErrors$runtime_release() {
            Recomposer.Companion.clearErrors$runtime_release();
        }

        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            return Recomposer.Companion.getCurrentErrors$runtime_release();
        }

        public final void invalidateGroupsWithKey$runtime_release(int i) {
            Recomposer.Companion.invalidateGroupsWithKey$runtime_release(i);
        }

        public final void simulateHotReload$runtime_release(Object obj) {
            C12775o.m28639i(obj, "context");
            loadStateAndCompose(saveStateAndDispose(obj));
        }
    }
}
