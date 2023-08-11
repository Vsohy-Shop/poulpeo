package androidx.compose.p002ui.viewinterop;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p002ui.platform.ViewRootForInspector;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/ViewFactoryHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,374:1\n1#2:375\n*E\n"})
/* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder */
/* compiled from: AndroidView.android.kt */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {
    private final NestedScrollDispatcher dispatcher;
    private Function1<? super T, C11921v> releaseBlock;
    private Function1<? super T, C11921v> resetBlock;
    private final String saveStateKey;
    private final SaveableStateRegistry saveStateRegistry;
    private SaveableStateRegistry.Entry saveableRegistryEntry;
    private final T typedView;
    private Function1<? super T, C11921v> updateBlock;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ ViewFactoryHolder(Context context, CompositionContext compositionContext, View view, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : compositionContext, view, nestedScrollDispatcher, saveableStateRegistry, str);
    }

    private final void registerSaveStateProvider() {
        SaveableStateRegistry saveableStateRegistry = this.saveStateRegistry;
        if (saveableStateRegistry != null) {
            setSaveableRegistryEntry(saveableStateRegistry.registerProvider(this.saveStateKey, new ViewFactoryHolder$registerSaveStateProvider$1(this)));
        }
    }

    private final void setSaveableRegistryEntry(SaveableStateRegistry.Entry entry) {
        SaveableStateRegistry.Entry entry2 = this.saveableRegistryEntry;
        if (entry2 != null) {
            entry2.unregister();
        }
        this.saveableRegistryEntry = entry;
    }

    /* access modifiers changed from: private */
    public final void unregisterSaveStateProvider() {
        setSaveableRegistryEntry((SaveableStateRegistry.Entry) null);
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final Function1<T, C11921v> getReleaseBlock() {
        return this.releaseBlock;
    }

    public final Function1<T, C11921v> getResetBlock() {
        return this.resetBlock;
    }

    public final T getTypedView() {
        return this.typedView;
    }

    public final Function1<T, C11921v> getUpdateBlock() {
        return this.updateBlock;
    }

    public final void setReleaseBlock(Function1<? super T, C11921v> function1) {
        C12775o.m28639i(function1, "value");
        this.releaseBlock = function1;
        setRelease(new ViewFactoryHolder$releaseBlock$1(this));
    }

    public final void setResetBlock(Function1<? super T, C11921v> function1) {
        C12775o.m28639i(function1, "value");
        this.resetBlock = function1;
        setReset(new ViewFactoryHolder$resetBlock$1(this));
    }

    public final void setUpdateBlock(Function1<? super T, C11921v> function1) {
        C12775o.m28639i(function1, "value");
        this.updateBlock = function1;
        setUpdate(new ViewFactoryHolder$updateBlock$1(this));
    }

    private ViewFactoryHolder(Context context, CompositionContext compositionContext, T t, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, String str) {
        super(context, compositionContext, nestedScrollDispatcher);
        this.typedView = t;
        this.dispatcher = nestedScrollDispatcher;
        this.saveStateRegistry = saveableStateRegistry;
        this.saveStateKey = str;
        setClipChildren(false);
        setView$ui_release(t);
        SparseArray sparseArray = null;
        Object consumeRestored = saveableStateRegistry != null ? saveableStateRegistry.consumeRestored(str) : null;
        sparseArray = consumeRestored instanceof SparseArray ? (SparseArray) consumeRestored : sparseArray;
        if (sparseArray != null) {
            t.restoreHierarchyState(sparseArray);
        }
        registerSaveStateProvider();
        this.updateBlock = AndroidView_androidKt.getNoOpUpdate();
        this.resetBlock = AndroidView_androidKt.getNoOpUpdate();
        this.releaseBlock = AndroidView_androidKt.getNoOpUpdate();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewFactoryHolder(Context context, Function1 function1, CompositionContext compositionContext, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, function1, (i & 4) != 0 ? null : compositionContext, nestedScrollDispatcher, saveableStateRegistry, str);
    }

    public View getViewRoot() {
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder(Context context, Function1<? super Context, ? extends T> function1, CompositionContext compositionContext, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, String str) {
        this(context, compositionContext, (View) function1.invoke(context), nestedScrollDispatcher, saveableStateRegistry, str);
        C12775o.m28639i(context, "context");
        C12775o.m28639i(function1, "factory");
        C12775o.m28639i(nestedScrollDispatcher, "dispatcher");
        C12775o.m28639i(str, "saveStateKey");
    }
}
