package androidx.compose.runtime;

import java.util.List;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$2$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1#1,4528:1\n3212#2,4:4529\n3222#2,9:4533\n3217#2:4542\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$2$1\n*L\n3086#1:4529,4\n3087#1:4533,9\n3086#1:4542\n*E\n"})
/* compiled from: Composer.kt */
final class ComposerImpl$insertMovableContentGuarded$1$1$2$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> $offsetChanges;
    final /* synthetic */ SlotReader $reader;
    final /* synthetic */ MovableContentStateReference $to;
    final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$insertMovableContentGuarded$1$1$2$1(ComposerImpl composerImpl, List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> list, SlotReader slotReader, MovableContentStateReference movableContentStateReference) {
        super(0);
        this.this$0 = composerImpl;
        this.$offsetChanges = list;
        this.$reader = slotReader;
        this.$to = movableContentStateReference;
    }

    public final void invoke() {
        SlotReader access$getReader$p;
        int[] access$getNodeCountOverrides$p;
        ComposerImpl composerImpl = this.this$0;
        List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> list = this.$offsetChanges;
        SlotReader slotReader = this.$reader;
        MovableContentStateReference movableContentStateReference = this.$to;
        List access$getChanges$p = composerImpl.changes;
        try {
            composerImpl.changes = list;
            access$getReader$p = composerImpl.reader;
            access$getNodeCountOverrides$p = composerImpl.nodeCountOverrides;
            composerImpl.nodeCountOverrides = null;
            composerImpl.reader = slotReader;
            composerImpl.invokeMovableContentLambda(movableContentStateReference.getContent$runtime_release(), movableContentStateReference.getLocals$runtime_release(), movableContentStateReference.getParameter$runtime_release(), true);
            C11921v vVar = C11921v.f18618a;
            composerImpl.reader = access$getReader$p;
            composerImpl.nodeCountOverrides = access$getNodeCountOverrides$p;
            composerImpl.changes = access$getChanges$p;
        } catch (Throwable th) {
            composerImpl.changes = access$getChanges$p;
            throw th;
        }
    }
}
