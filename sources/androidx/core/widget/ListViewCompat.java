package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class ListViewCompat {

    @RequiresApi(19)
    static class Api19Impl {
        private Api19Impl() {
        }

        @DoNotInline
        static boolean canScrollList(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        @DoNotInline
        static void scrollListBy(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    private ListViewCompat() {
    }

    public static boolean canScrollList(@NonNull ListView listView, int i) {
        return Api19Impl.canScrollList(listView, i);
    }

    public static void scrollListBy(@NonNull ListView listView, int i) {
        Api19Impl.scrollListBy(listView, i);
    }
}
