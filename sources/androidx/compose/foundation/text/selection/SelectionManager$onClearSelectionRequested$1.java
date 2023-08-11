package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1", mo50610f = "SelectionManager.kt", mo50611l = {634}, mo50612m = "invokeSuspend")
/* compiled from: SelectionManager.kt */
final class SelectionManager$onClearSelectionRequested$1 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13074a<C11921v> $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SelectionManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectionManager$onClearSelectionRequested$1(SelectionManager selectionManager, C13074a<C11921v> aVar, C12074d<? super SelectionManager$onClearSelectionRequested$1> dVar) {
        super(2, dVar);
        this.this$0 = selectionManager;
        this.$block = aVar;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        SelectionManager$onClearSelectionRequested$1 selectionManager$onClearSelectionRequested$1 = new SelectionManager$onClearSelectionRequested$1(this.this$0, this.$block, dVar);
        selectionManager$onClearSelectionRequested$1.L$0 = obj;
        return selectionManager$onClearSelectionRequested$1;
    }

    public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
        return ((SelectionManager$onClearSelectionRequested$1) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            SelectionManager selectionManager = this.this$0;
            final C13074a<C11921v> aVar = this.$block;
            C06651 r3 = new Function1<Offset, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m33820invokek4lQ0M(((Offset) obj).m35432unboximpl());
                    return C11921v.f18618a;
                }

                /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                public final void m33820invokek4lQ0M(long j) {
                    aVar.invoke();
                }
            };
            this.label = 1;
            if (selectionManager.detectNonConsumingTap((PointerInputScope) this.L$0, r3, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }
}
