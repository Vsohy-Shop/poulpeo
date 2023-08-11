package androidx.compose.p002ui.platform;

import androidx.savedstate.SavedStateRegistry;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 */
/* compiled from: DisposableSaveableStateRegistry.android.kt */
final class C1092xec1ea390 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ SavedStateRegistry $androidxRegistry;
    final /* synthetic */ String $key;
    final /* synthetic */ boolean $registered;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1092xec1ea390(boolean z, SavedStateRegistry savedStateRegistry, String str) {
        super(0);
        this.$registered = z;
        this.$androidxRegistry = savedStateRegistry;
        this.$key = str;
    }

    public final void invoke() {
        if (this.$registered) {
            this.$androidxRegistry.unregisterSavedStateProvider(this.$key);
        }
    }
}
