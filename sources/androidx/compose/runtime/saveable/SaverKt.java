package androidx.compose.runtime.saveable;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

/* compiled from: Saver.kt */
public final class SaverKt {
    private static final Saver<Object, Object> AutoSaver = Saver(SaverKt$AutoSaver$1.INSTANCE, SaverKt$AutoSaver$2.INSTANCE);

    public static final <Original, Saveable> Saver<Original, Saveable> Saver(C13088o<? super SaverScope, ? super Original, ? extends Saveable> oVar, Function1<? super Saveable, ? extends Original> function1) {
        C12775o.m28639i(oVar, "save");
        C12775o.m28639i(function1, "restore");
        return new SaverKt$Saver$1(oVar, function1);
    }

    public static final <T> Saver<T, Object> autoSaver() {
        Saver<Object, Object> saver = AutoSaver;
        C12775o.m28637g(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return saver;
    }
}
