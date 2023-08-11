package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import p448vf.C13650g;

/* compiled from: Menu.kt */
public final class MenuKt$children$1 implements C13650g<MenuItem> {
    final /* synthetic */ Menu $this_children;

    MenuKt$children$1(Menu menu) {
        this.$this_children = menu;
    }

    public Iterator<MenuItem> iterator() {
        return MenuKt.iterator(this.$this_children);
    }
}
