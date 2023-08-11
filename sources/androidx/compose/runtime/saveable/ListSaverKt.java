package androidx.compose.runtime.saveable;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

/* compiled from: ListSaver.kt */
public final class ListSaverKt {
    public static final <Original, Saveable> Saver<Original, Object> listSaver(C13088o<? super SaverScope, ? super Original, ? extends List<? extends Saveable>> oVar, Function1<? super List<? extends Saveable>, ? extends Original> function1) {
        C12775o.m28639i(oVar, "save");
        C12775o.m28639i(function1, "restore");
        return SaverKt.Saver(new ListSaverKt$listSaver$1(oVar), (Function1) C12772l0.m28614f(function1, 1));
    }
}
