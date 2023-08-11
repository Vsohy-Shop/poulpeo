package p227t0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.p054ui.C4193R;
import kotlin.jvm.internal.C12775o;
import p186p0.C9035c;

/* renamed from: t0.a */
/* compiled from: ContentCardsDividerItemDecoration.kt */
public class C9589a extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    private final Context f14278a;

    /* renamed from: b */
    private final int f14279b;

    /* renamed from: c */
    private final int f14280c;

    public C9589a(Context context) {
        C12775o.m28639i(context, "context");
        Context applicationContext = context.getApplicationContext();
        C12775o.m28638h(applicationContext, "context.applicationContext");
        this.f14278a = applicationContext;
        this.f14279b = applicationContext.getResources().getDimensionPixelSize(C4193R.dimen.com_braze_content_cards_divider_height);
        this.f14280c = applicationContext.getResources().getDimensionPixelSize(C4193R.dimen.com_braze_content_cards_max_width);
    }

    /* renamed from: a */
    private final int m19909a(int i) {
        return C13537l.m30877d((i - this.f14280c) / 2, 0);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        boolean z;
        int i;
        C12775o.m28639i(rect, "itemViewOutputRect");
        C12775o.m28639i(view, "view");
        C12775o.m28639i(recyclerView, "parent");
        C12775o.m28639i(state, "state");
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i2 = 0;
        if (recyclerView.getAdapter() instanceof C9035c) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                z = ((C9035c) adapter).mo43254i(childAdapterPosition);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.contentcards.adapters.ContentCardAdapter");
            }
        } else {
            z = false;
        }
        if (childAdapterPosition == 0) {
            i = this.f14279b;
        } else {
            i = 0;
        }
        rect.top = i;
        if (!z) {
            i2 = this.f14279b;
        }
        rect.bottom = i2;
        int a = m19909a(recyclerView.getWidth());
        rect.left = a;
        rect.right = a;
    }
}
