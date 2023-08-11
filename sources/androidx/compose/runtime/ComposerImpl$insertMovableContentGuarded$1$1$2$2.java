package androidx.compose.runtime;

import java.util.List;
import kotlin.jvm.internal.C12760f0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$2$2\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4528:1\n33#2,6:4529\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$2$2\n*L\n3101#1:4529,6\n*E\n"})
/* compiled from: Composer.kt */
final class ComposerImpl$insertMovableContentGuarded$1$1$2$2 extends C12777p implements C13089p<Applier<?>, SlotWriter, RememberManager, C11921v> {
    final /* synthetic */ C12760f0 $effectiveNodeIndex;
    final /* synthetic */ List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> $offsetChanges;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$insertMovableContentGuarded$1$1$2$2(C12760f0 f0Var, List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> list) {
        super(3);
        this.$effectiveNodeIndex = f0Var;
        this.$offsetChanges = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Applier<?>) (Applier) obj, (SlotWriter) obj2, (RememberManager) obj3);
        return C11921v.f18618a;
    }

    public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        C12775o.m28639i(applier, "applier");
        C12775o.m28639i(slotWriter, "slots");
        C12775o.m28639i(rememberManager, "rememberManager");
        int i = this.$effectiveNodeIndex.f20416b;
        if (i > 0) {
            applier = new OffsetApplier<>(applier, i);
        }
        List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> list = this.$offsetChanges;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2).invoke(applier, slotWriter, rememberManager);
        }
    }
}
