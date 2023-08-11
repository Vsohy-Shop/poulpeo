package androidx.compose.runtime.saveable;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

/* compiled from: Saver.kt */
public final class SaverKt$Saver$1 implements Saver<Original, Saveable> {
    final /* synthetic */ Function1<Saveable, Original> $restore;
    final /* synthetic */ C13088o<SaverScope, Original, Saveable> $save;

    SaverKt$Saver$1(C13088o<? super SaverScope, ? super Original, ? extends Saveable> oVar, Function1<? super Saveable, ? extends Original> function1) {
        this.$save = oVar;
        this.$restore = function1;
    }

    public Original restore(Saveable saveable) {
        C12775o.m28639i(saveable, "value");
        return this.$restore.invoke(saveable);
    }

    public Saveable save(SaverScope saverScope, Original original) {
        C12775o.m28639i(saverScope, "<this>");
        return this.$save.invoke(saverScope, original);
    }
}
