package p186p0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.p054ui.C4193R;
import kotlin.jvm.internal.C12775o;

/* renamed from: p0.d */
/* compiled from: EmptyContentCardsAdapter.kt */
public class C9044d extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: p0.d$a */
    /* compiled from: EmptyContentCardsAdapter.kt */
    public static final class C9045a extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9045a(View view) {
            super(view);
            C12775o.m28639i(view, "view");
        }
    }

    public int getItemCount() {
        return 1;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C12775o.m28639i(viewHolder, "viewHolder");
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C12775o.m28639i(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4193R.C4197layout.com_braze_content_cards_empty, viewGroup, false);
        C12775o.m28638h(inflate, "view");
        return new C9045a(inflate);
    }
}
