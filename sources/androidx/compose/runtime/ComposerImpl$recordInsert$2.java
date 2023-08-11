package androidx.compose.runtime;

import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$recordInsert$2\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4528:1\n162#2,4:4529\n167#2,3:4539\n33#3,6:4533\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$recordInsert$2\n*L\n3573#1:4529,4\n3573#1:4539,3\n3574#1:4533,6\n*E\n"})
/* compiled from: Composer.kt */
final class ComposerImpl$recordInsert$2 extends C12777p implements C13089p<Applier<?>, SlotWriter, RememberManager, C11921v> {
    final /* synthetic */ Anchor $anchor;
    final /* synthetic */ List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> $fixups;
    final /* synthetic */ SlotTable $insertTable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$recordInsert$2(SlotTable slotTable, Anchor anchor, List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> list) {
        super(3);
        this.$insertTable = slotTable;
        this.$anchor = anchor;
        this.$fixups = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Applier<?>) (Applier) obj, (SlotWriter) obj2, (RememberManager) obj3);
        return C11921v.f18618a;
    }

    /* JADX INFO: finally extract failed */
    public final void invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        C12775o.m28639i(applier, "applier");
        C12775o.m28639i(slotWriter, "slots");
        C12775o.m28639i(rememberManager, "rememberManager");
        SlotTable slotTable = this.$insertTable;
        List<C13089p<Applier<?>, SlotWriter, RememberManager, C11921v>> list = this.$fixups;
        SlotWriter openWriter = slotTable.openWriter();
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).invoke(applier, openWriter, rememberManager);
            }
            C11921v vVar = C11921v.f18618a;
            openWriter.close();
            slotWriter.beginInsert();
            SlotTable slotTable2 = this.$insertTable;
            slotWriter.moveFrom(slotTable2, this.$anchor.toIndexFor(slotTable2));
            slotWriter.endInsert();
        } catch (Throwable th) {
            openWriter.close();
            throw th;
        }
    }
}
