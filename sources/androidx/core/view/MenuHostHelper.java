package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class MenuHostHelper {
    private final CopyOnWriteArrayList<MenuProvider> mMenuProviders = new CopyOnWriteArrayList<>();
    private final Runnable mOnInvalidateMenuCallback;
    private final Map<MenuProvider, LifecycleContainer> mProviderToLifecycleContainers = new HashMap();

    private static class LifecycleContainer {
        final Lifecycle mLifecycle;
        private LifecycleEventObserver mObserver;

        LifecycleContainer(@NonNull Lifecycle lifecycle, @NonNull LifecycleEventObserver lifecycleEventObserver) {
            this.mLifecycle = lifecycle;
            this.mObserver = lifecycleEventObserver;
            lifecycle.addObserver(lifecycleEventObserver);
        }

        /* access modifiers changed from: package-private */
        public void clearObservers() {
            this.mLifecycle.removeObserver(this.mObserver);
            this.mObserver = null;
        }
    }

    public MenuHostHelper(@NonNull Runnable runnable) {
        this.mOnInvalidateMenuCallback = runnable;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addMenuProvider$0(MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            removeMenuProvider(menuProvider);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addMenuProvider$1(Lifecycle.State state, MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.upTo(state)) {
            addMenuProvider(menuProvider);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            removeMenuProvider(menuProvider);
        } else if (event == Lifecycle.Event.downFrom(state)) {
            this.mMenuProviders.remove(menuProvider);
            this.mOnInvalidateMenuCallback.run();
        }
    }

    public void addMenuProvider(@NonNull MenuProvider menuProvider) {
        this.mMenuProviders.add(menuProvider);
        this.mOnInvalidateMenuCallback.run();
    }

    public void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        Iterator<MenuProvider> it = this.mMenuProviders.iterator();
        while (it.hasNext()) {
            it.next().onCreateMenu(menu, menuInflater);
        }
    }

    public void onMenuClosed(@NonNull Menu menu) {
        Iterator<MenuProvider> it = this.mMenuProviders.iterator();
        while (it.hasNext()) {
            it.next().onMenuClosed(menu);
        }
    }

    public boolean onMenuItemSelected(@NonNull MenuItem menuItem) {
        Iterator<MenuProvider> it = this.mMenuProviders.iterator();
        while (it.hasNext()) {
            if (it.next().onMenuItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void onPrepareMenu(@NonNull Menu menu) {
        Iterator<MenuProvider> it = this.mMenuProviders.iterator();
        while (it.hasNext()) {
            it.next().onPrepareMenu(menu);
        }
    }

    public void removeMenuProvider(@NonNull MenuProvider menuProvider) {
        this.mMenuProviders.remove(menuProvider);
        LifecycleContainer remove = this.mProviderToLifecycleContainers.remove(menuProvider);
        if (remove != null) {
            remove.clearObservers();
        }
        this.mOnInvalidateMenuCallback.run();
    }

    public void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner) {
        addMenuProvider(menuProvider);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        LifecycleContainer remove = this.mProviderToLifecycleContainers.remove(menuProvider);
        if (remove != null) {
            remove.clearObservers();
        }
        this.mProviderToLifecycleContainers.put(menuProvider, new LifecycleContainer(lifecycle, new C1887w(this, menuProvider)));
    }

    public void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.State state) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        LifecycleContainer remove = this.mProviderToLifecycleContainers.remove(menuProvider);
        if (remove != null) {
            remove.clearObservers();
        }
        this.mProviderToLifecycleContainers.put(menuProvider, new LifecycleContainer(lifecycle, new C1892x(this, state, menuProvider)));
    }
}
