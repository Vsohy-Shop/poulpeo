package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
/* compiled from: SavedStateRegistry.kt */
public final class SavedStateRegistry {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    private static final String SAVED_COMPONENTS_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    private boolean attached;
    private final SafeIterableMap<String, SavedStateProvider> components = new SafeIterableMap<>();
    private boolean isAllowingSavingState = true;
    private boolean isRestored;
    private Recreator.SavedStateProvider recreatorProvider;
    private Bundle restoredState;

    /* compiled from: SavedStateRegistry.kt */
    public interface AutoRecreated {
        void onRecreated(SavedStateRegistryOwner savedStateRegistryOwner);
    }

    /* compiled from: SavedStateRegistry.kt */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SavedStateRegistry.kt */
    public interface SavedStateProvider {
        Bundle saveState();
    }

    /* access modifiers changed from: private */
    public static final void performAttach$lambda$4(SavedStateRegistry savedStateRegistry, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C12775o.m28639i(savedStateRegistry, "this$0");
        C12775o.m28639i(lifecycleOwner, "<anonymous parameter 0>");
        C12775o.m28639i(event, NotificationCompat.CATEGORY_EVENT);
        if (event == Lifecycle.Event.ON_START) {
            savedStateRegistry.isAllowingSavingState = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            savedStateRegistry.isAllowingSavingState = false;
        }
    }

    @MainThread
    public final Bundle consumeRestoredStateForKey(String str) {
        Bundle bundle;
        C12775o.m28639i(str, "key");
        if (this.isRestored) {
            Bundle bundle2 = this.restoredState;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            } else {
                bundle = null;
            }
            Bundle bundle3 = this.restoredState;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.restoredState;
            boolean z = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z = true;
            }
            if (!z) {
                this.restoredState = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final SavedStateProvider getSavedStateProvider(String str) {
        C12775o.m28639i(str, "key");
        Iterator<Map.Entry<String, SavedStateProvider>> it = this.components.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            C12775o.m28638h(next, "components");
            SavedStateProvider savedStateProvider = (SavedStateProvider) next.getValue();
            if (C12775o.m28634d((String) next.getKey(), str)) {
                return savedStateProvider;
            }
        }
        return null;
    }

    public final boolean isAllowingSavingState$savedstate_release() {
        return this.isAllowingSavingState;
    }

    @MainThread
    public final boolean isRestored() {
        return this.isRestored;
    }

    @MainThread
    public final void performAttach$savedstate_release(Lifecycle lifecycle) {
        C12775o.m28639i(lifecycle, "lifecycle");
        if (!this.attached) {
            lifecycle.addObserver(new C2622a(this));
            this.attached = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    @MainThread
    public final void performRestore$savedstate_release(Bundle bundle) {
        Bundle bundle2;
        if (!this.attached) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        } else if (!this.isRestored) {
            if (bundle != null) {
                bundle2 = bundle.getBundle(SAVED_COMPONENTS_KEY);
            } else {
                bundle2 = null;
            }
            this.restoredState = bundle2;
            this.isRestored = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
    }

    @MainThread
    public final void performSave(Bundle bundle) {
        C12775o.m28639i(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.restoredState;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions = this.components.iteratorWithAdditions();
        C12775o.m28638h(iteratorWithAdditions, "this.components.iteratorWithAdditions()");
        while (iteratorWithAdditions.hasNext()) {
            Map.Entry entry = (Map.Entry) iteratorWithAdditions.next();
            bundle2.putBundle((String) entry.getKey(), ((SavedStateProvider) entry.getValue()).saveState());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle(SAVED_COMPONENTS_KEY, bundle2);
        }
    }

    @MainThread
    public final void registerSavedStateProvider(String str, SavedStateProvider savedStateProvider) {
        boolean z;
        C12775o.m28639i(str, "key");
        C12775o.m28639i(savedStateProvider, "provider");
        if (this.components.putIfAbsent(str, savedStateProvider) == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    @MainThread
    public final void runOnNextRecreation(Class<? extends AutoRecreated> cls) {
        C12775o.m28639i(cls, "clazz");
        if (this.isAllowingSavingState) {
            Recreator.SavedStateProvider savedStateProvider = this.recreatorProvider;
            if (savedStateProvider == null) {
                savedStateProvider = new Recreator.SavedStateProvider(this);
            }
            this.recreatorProvider = savedStateProvider;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.SavedStateProvider savedStateProvider2 = this.recreatorProvider;
                if (savedStateProvider2 != null) {
                    String name = cls.getName();
                    C12775o.m28638h(name, "clazz.name");
                    savedStateProvider2.add(name);
                }
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }

    public final void setAllowingSavingState$savedstate_release(boolean z) {
        this.isAllowingSavingState = z;
    }

    @MainThread
    public final void unregisterSavedStateProvider(String str) {
        C12775o.m28639i(str, "key");
        this.components.remove(str);
    }
}
