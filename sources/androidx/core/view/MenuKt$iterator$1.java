package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p412pf.C13212a;

/* compiled from: Menu.kt */
public final class MenuKt$iterator$1 implements Iterator<MenuItem>, C13212a {
    final /* synthetic */ Menu $this_iterator;
    private int index;

    MenuKt$iterator$1(Menu menu) {
        this.$this_iterator = menu;
    }

    public boolean hasNext() {
        if (this.index < this.$this_iterator.size()) {
            return true;
        }
        return false;
    }

    public void remove() {
        C11921v vVar;
        Menu menu = this.$this_iterator;
        int i = this.index - 1;
        this.index = i;
        MenuItem item = menu.getItem(i);
        if (item != null) {
            C12775o.m28638h(item, "getItem(index)");
            menu.removeItem(item.getItemId());
            vVar = C11921v.f18618a;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            throw new IndexOutOfBoundsException();
        }
    }

    public MenuItem next() {
        Menu menu = this.$this_iterator;
        int i = this.index;
        this.index = i + 1;
        MenuItem item = menu.getItem(i);
        if (item != null) {
            return item;
        }
        throw new IndexOutOfBoundsException();
    }
}
