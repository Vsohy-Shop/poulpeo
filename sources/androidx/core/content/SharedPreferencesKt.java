package androidx.core.content;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: SharedPreferences.kt */
public final class SharedPreferencesKt {
    public static final void edit(SharedPreferences sharedPreferences, boolean z, Function1<? super SharedPreferences.Editor, C11921v> function1) {
        C12775o.m28639i(sharedPreferences, "<this>");
        C12775o.m28639i(function1, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C12775o.m28638h(edit, "editor");
        function1.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        C12775o.m28639i(sharedPreferences, "<this>");
        C12775o.m28639i(function1, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C12775o.m28638h(edit, "editor");
        function1.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
