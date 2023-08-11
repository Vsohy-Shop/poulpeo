package p227t0;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C12775o;

/* renamed from: t0.c */
/* compiled from: SimpleItemTouchHelperCallback.kt */
public class C9591c extends ItemTouchHelper.Callback {

    /* renamed from: a */
    private final C9590b f14281a;

    public C9591c(C9590b bVar) {
        C12775o.m28639i(bVar, "adapter");
        this.f14281a = bVar;
    }

    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int i;
        C12775o.m28639i(recyclerView, "recyclerView");
        C12775o.m28639i(viewHolder, "viewHolder");
        if (this.f14281a.mo43249a(viewHolder.getBindingAdapterPosition())) {
            i = 16;
        } else {
            i = 0;
        }
        return ItemTouchHelper.Callback.makeMovementFlags(0, i);
    }

    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    public boolean isLongPressDragEnabled() {
        return false;
    }

    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        C12775o.m28639i(recyclerView, "recyclerView");
        C12775o.m28639i(viewHolder, "viewHolder");
        C12775o.m28639i(viewHolder2, TypedValues.AttributesType.S_TARGET);
        return false;
    }

    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        C12775o.m28639i(viewHolder, "viewHolder");
        this.f14281a.mo43250b(viewHolder.getBindingAdapterPosition());
    }
}
