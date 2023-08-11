package androidx.compose.runtime.saveable;

import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: RememberSaveable.kt */
final class RememberSaveableKt$rememberSaveable$1$valueProvider$1 extends C12777p implements C13074a<Object> {
    final /* synthetic */ SaveableStateRegistry $registry;
    final /* synthetic */ State<Saver<T, Object>> $saverState;
    final /* synthetic */ State<T> $valueState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RememberSaveableKt$rememberSaveable$1$valueProvider$1(State<? extends Saver<T, Object>> state, State<? extends T> state2, SaveableStateRegistry saveableStateRegistry) {
        super(0);
        this.$saverState = state;
        this.$valueState = state2;
        this.$registry = saveableStateRegistry;
    }

    public final Object invoke() {
        return this.$saverState.getValue().save(new RememberSaveableKt$rememberSaveable$1$valueProvider$1$1$1(this.$registry), this.$valueState.getValue());
    }
}
