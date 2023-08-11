package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;
import p448vf.C13650g;

/* compiled from: Menu.kt */
public final class MenuKt {
    public static final boolean contains(Menu menu, MenuItem menuItem) {
        C12775o.m28639i(menu, "<this>");
        C12775o.m28639i(menuItem, "item");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (C12775o.m28634d(menu.getItem(i), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(Menu menu, Function1<? super MenuItem, C11921v> function1) {
        C12775o.m28639i(menu, "<this>");
        C12775o.m28639i(function1, "action");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            C12775o.m28638h(item, "getItem(index)");
            function1.invoke(item);
        }
    }

    public static final void forEachIndexed(Menu menu, C13088o<? super Integer, ? super MenuItem, C11921v> oVar) {
        C12775o.m28639i(menu, "<this>");
        C12775o.m28639i(oVar, "action");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            Integer valueOf = Integer.valueOf(i);
            MenuItem item = menu.getItem(i);
            C12775o.m28638h(item, "getItem(index)");
            oVar.invoke(valueOf, item);
        }
    }

    public static final MenuItem get(Menu menu, int i) {
        C12775o.m28639i(menu, "<this>");
        MenuItem item = menu.getItem(i);
        C12775o.m28638h(item, "getItem(index)");
        return item;
    }

    public static final C13650g<MenuItem> getChildren(Menu menu) {
        C12775o.m28639i(menu, "<this>");
        return new MenuKt$children$1(menu);
    }

    public static final int getSize(Menu menu) {
        C12775o.m28639i(menu, "<this>");
        return menu.size();
    }

    public static final boolean isEmpty(Menu menu) {
        C12775o.m28639i(menu, "<this>");
        if (menu.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(Menu menu) {
        C12775o.m28639i(menu, "<this>");
        if (menu.size() != 0) {
            return true;
        }
        return false;
    }

    public static final Iterator<MenuItem> iterator(Menu menu) {
        C12775o.m28639i(menu, "<this>");
        return new MenuKt$iterator$1(menu);
    }

    public static final void minusAssign(Menu menu, MenuItem menuItem) {
        C12775o.m28639i(menu, "<this>");
        C12775o.m28639i(menuItem, "item");
        menu.removeItem(menuItem.getItemId());
    }

    public static final void removeItemAt(Menu menu, int i) {
        C11921v vVar;
        C12775o.m28639i(menu, "<this>");
        MenuItem item = menu.getItem(i);
        if (item != null) {
            menu.removeItem(item.getItemId());
            vVar = C11921v.f18618a;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
