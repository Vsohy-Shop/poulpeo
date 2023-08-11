package androidx.compose.p002ui.platform;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry */
/* compiled from: DisposableSaveableStateRegistry.android.kt */
public final class DisposableSaveableStateRegistry implements SaveableStateRegistry {
    private final /* synthetic */ SaveableStateRegistry $$delegate_0;
    private final C13074a<C11921v> onDispose;

    public DisposableSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry, C13074a<C11921v> aVar) {
        C12775o.m28639i(saveableStateRegistry, "saveableStateRegistry");
        C12775o.m28639i(aVar, "onDispose");
        this.onDispose = aVar;
        this.$$delegate_0 = saveableStateRegistry;
    }

    public boolean canBeSaved(Object obj) {
        C12775o.m28639i(obj, "value");
        return this.$$delegate_0.canBeSaved(obj);
    }

    public Object consumeRestored(String str) {
        C12775o.m28639i(str, "key");
        return this.$$delegate_0.consumeRestored(str);
    }

    public final void dispose() {
        this.onDispose.invoke();
    }

    public Map<String, List<Object>> performSave() {
        return this.$$delegate_0.performSave();
    }

    public SaveableStateRegistry.Entry registerProvider(String str, C13074a<? extends Object> aVar) {
        C12775o.m28639i(str, "key");
        C12775o.m28639i(aVar, "valueProvider");
        return this.$$delegate_0.registerProvider(str, aVar);
    }
}
