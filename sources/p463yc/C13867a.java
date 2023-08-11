package p463yc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.poulpeo.R;
import com.rmn.p324ui.views.listview.C11654c;
import com.rmn.p324ui.views.listview.C11655d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p311bd.C10932b;
import p311bd.C10933c;
import p469zc.C14080a;
import p469zc.C14082b;
import p469zc.C14084d;

@StabilityInferred(parameters = 0)
/* renamed from: yc.a */
/* compiled from: BaseAdapter.kt */
public abstract class C13867a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: i */
    public static final C13869b f22581i = new C13869b((DefaultConstructorMarker) null);

    /* renamed from: j */
    public static final int f22582j = 8;

    /* renamed from: k */
    private static final int f22583k = -1;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final int f22584l = 0;

    /* renamed from: m */
    private static final int f22585m = 1;

    /* renamed from: n */
    private static final int f22586n = 3;

    /* renamed from: o */
    private static final int f22587o = 4;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final String f22588p = "filter_tag";
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final String f22589q = "save_tag";
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final String f22590r = "favorites_tag";

    /* renamed from: a */
    private final C13868a f22591a;

    /* renamed from: b */
    private final int f22592b;

    /* renamed from: c */
    private List<? extends Object> f22593c;

    /* renamed from: d */
    private C10933c f22594d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11654c f22595e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C10932b f22596f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f22597g;

    /* renamed from: h */
    private boolean f22598h;

    /* renamed from: yc.a$a */
    /* compiled from: BaseAdapter.kt */
    public interface C13868a {
        /* renamed from: E */
        void mo46342E(Object obj);

        /* renamed from: b0 */
        void mo46348b0();
    }

    /* renamed from: yc.a$b */
    /* compiled from: BaseAdapter.kt */
    public static final class C13869b {
        private C13869b() {
        }

        public /* synthetic */ C13869b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo53574a() {
            return C13867a.f22590r;
        }

        /* renamed from: b */
        public final String mo53575b() {
            return C13867a.f22588p;
        }

        /* renamed from: c */
        public final String mo53576c() {
            return C13867a.f22589q;
        }

        /* renamed from: d */
        public final int mo53577d() {
            return C13867a.f22584l;
        }
    }

    /* renamed from: yc.a$c */
    /* compiled from: BaseAdapter.kt */
    private final class C13870c extends C14080a {

        /* renamed from: g */
        private final ImageView f22599g;

        /* renamed from: h */
        private final TextView f22600h;

        /* renamed from: i */
        private final boolean f22601i;

        /* renamed from: j */
        private final boolean f22602j = true;

        /* renamed from: k */
        private final boolean f22603k;

        /* renamed from: l */
        final /* synthetic */ C13867a f22604l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13870c(C13867a aVar, View view, C13868a aVar2) {
            super(view, aVar2);
            C12775o.m28639i(view, "itemView");
            C12775o.m28639i(aVar2, "listener");
            this.f22604l = aVar;
            View findViewById = view.findViewById(R.id.listview_message_image);
            C12775o.m28638h(findViewById, "itemView.findViewById(R.id.listview_message_image)");
            this.f22599g = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.listview_message);
            C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.listview_message)");
            this.f22600h = (TextView) findViewById2;
            view.setOnClickListener(this);
        }

        /* renamed from: N0 */
        public boolean mo53578N0() {
            return this.f22602j;
        }

        /* renamed from: R0 */
        public boolean mo23238R0() {
            return this.f22603k;
        }

        /* renamed from: l2 */
        public boolean mo53579l2() {
            return this.f22601i;
        }

        /* renamed from: m2 */
        public void mo23234m2(C13867a aVar, Object obj) {
            String str;
            if (this.f22604l.f22596f != null) {
                if (this.f22604l.f22595e != null) {
                    C11654c g = this.f22604l.f22595e;
                    C12775o.m28636f(g);
                    str = g.mo47899a(this.f22604l.f22596f, mo53843t0().getString(R.string.listview_error_default));
                    C12775o.m28638h(str, "{\n                messag…r_default))\n            }");
                } else {
                    str = mo53843t0().getString(R.string.listview_error_default);
                    C12775o.m28638h(str, "{\n                getCon…or_default)\n            }");
                }
                C10932b h = this.f22604l.f22596f;
                C12775o.m28636f(h);
                int i = h.f16864a.f21820a;
                if (this.f22604l.f22596f == C10932b.f16862d) {
                    C13869b bVar = C13867a.f22581i;
                    if (C12775o.m28634d(bVar.mo53575b(), this.f22604l.f22597g)) {
                        i = R.drawable.picto_filter;
                    }
                    if (C12775o.m28634d(bVar.mo53576c(), this.f22604l.f22597g)) {
                        i = R.drawable.picto_bg_save;
                    }
                    if (C12775o.m28634d(bVar.mo53574a(), this.f22604l.f22597g)) {
                        i = R.drawable.picto_bg_favorite;
                    }
                }
                this.f22599g.setImageResource(i);
                this.f22600h.setText(str);
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13867a(C13868a aVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i2 & 2) != 0 ? -1 : i);
    }

    /* renamed from: q */
    private final boolean m31907q() {
        if (!mo53566r() || this.f22594d != C10933c.NEUTRAL || this.f22596f == C10932b.f16860b) {
            return false;
        }
        return true;
    }

    public final Object getItem(int i) {
        boolean z = false;
        if (i >= 0 && i < mo53564n()) {
            z = true;
        }
        if (z) {
            return this.f22593c.get(i);
        }
        throw new IllegalArgumentException();
    }

    public int getItemCount() {
        if (m31907q()) {
            return 1;
        }
        if (mo53566r()) {
            return 0;
        }
        if (this.f22598h) {
            return mo53564n() + 1;
        }
        return mo53564n();
    }

    public int getItemViewType(int i) {
        if (m31907q()) {
            return f22585m;
        }
        if (i >= mo53564n() && this.f22598h) {
            return f22586n;
        }
        if (this.f22593c.get(i) instanceof C11655d) {
            return f22587o;
        }
        boolean z = false;
        if (i >= 0 && i < getItemCount()) {
            z = true;
        }
        if (z) {
            return f22584l;
        }
        return f22583k;
    }

    /* renamed from: j */
    public final void mo53560j(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elems");
        int n = mo53564n();
        this.f22593c = C12686e0.m28236o0(C12686e0.m28236o0(C12726w.m28524k(), this.f22593c), collection);
        notifyItemRangeInserted(n, collection.size());
    }

    /* renamed from: k */
    public final void mo53561k(Object obj, int i) {
        C12775o.m28639i(obj, "itemToAdd");
        int m = C13537l.m30886m(i, 0, this.f22593c.size() - 1);
        List<? extends Object> D0 = C12686e0.m28207D0(C12686e0.m28236o0(C12726w.m28524k(), this.f22593c));
        D0.add(m, obj);
        this.f22593c = D0;
        notifyItemInserted(m);
        notifyDataSetChanged();
    }

    /* renamed from: l */
    public final void mo53562l() {
        this.f22593c = C12726w.m28524k();
        notifyDataSetChanged();
    }

    /* renamed from: m */
    public final void mo53563m(boolean z) {
        if (this.f22598h != z) {
            this.f22598h = z;
            notifyItemChanged(mo53564n());
        }
    }

    /* renamed from: n */
    public final int mo53564n() {
        return this.f22593c.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C13868a mo53565o() {
        return this.f22591a;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Object obj;
        C12775o.m28639i(viewHolder, "holder");
        if (viewHolder instanceof C14080a) {
            C14080a aVar = (C14080a) viewHolder;
            if (aVar.mo53579l2()) {
                obj = getItem(i);
            } else {
                obj = null;
            }
            mo53573z(aVar, obj);
            if (aVar.mo23238R0() && obj != null) {
                viewHolder.itemView.setTag(obj);
            }
            aVar.mo23234m2(this, obj);
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C12775o.m28639i(viewGroup, "parent");
        int p = mo23225p(i);
        if (p >= 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(p, viewGroup, false);
            C12775o.m28638h(inflate, "v");
            return mo23226t(inflate, i);
        }
        throw new IllegalStateException("A layout must be provided during the viewholder creation");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo23225p(int i) {
        if (i == f22586n) {
            return R.layout.view_loadmore;
        }
        if (i == f22585m) {
            return R.layout.listview_error_message;
        }
        if (i == f22587o) {
            return this.f22592b;
        }
        throw new UnsupportedOperationException("The viewType hasn't been managed in the subclass : " + i);
    }

    /* renamed from: r */
    public final boolean mo53566r() {
        return this.f22593c.isEmpty();
    }

    /* renamed from: s */
    public final boolean mo53567s() {
        return this.f22598h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C14080a mo23226t(View view, int i) {
        C12775o.m28639i(view, "itemView");
        if (i == f22586n) {
            return new C14084d(view, this.f22591a);
        }
        if (i == f22585m) {
            return new C13870c(this, view, this.f22591a);
        }
        if (i == f22587o) {
            return new C14082b(view, this.f22591a);
        }
        throw new UnsupportedOperationException("The viewType hasn't been managed in the subclass : " + i);
    }

    /* renamed from: u */
    public final void mo53568u(int i) {
        boolean z = false;
        if (i >= 0 && i < mo53564n()) {
            z = true;
        }
        if (z) {
            List<? extends Object> D0 = C12686e0.m28207D0(C12686e0.m28236o0(C12726w.m28524k(), this.f22593c));
            D0.remove(i);
            this.f22593c = D0;
            notifyItemRemoved(i);
            notifyItemRangeChanged(i, getItemCount());
        }
    }

    /* renamed from: v */
    public final void mo53569v(String str) {
        boolean z;
        if (str == null || C13754v.m31532t(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f22597g = "default_tag";
        } else {
            this.f22597g = str;
        }
    }

    /* renamed from: w */
    public final void mo53570w(C11654c cVar) {
        if (cVar != null && cVar != this.f22595e) {
            this.f22595e = cVar;
            if (m31907q()) {
                notifyDataSetChanged();
            }
        }
    }

    /* renamed from: x */
    public final void mo53571x(C10932b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException();
        } else if (bVar != this.f22596f) {
            boolean q = m31907q();
            this.f22596f = bVar;
            if (!q && m31907q()) {
                notifyDataSetChanged();
            }
        }
    }

    /* renamed from: y */
    public final void mo53572y(C10933c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException();
        } else if (cVar != this.f22594d) {
            boolean q = m31907q();
            this.f22594d = cVar;
            if (!q && m31907q()) {
                notifyDataSetChanged();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo53573z(C14080a aVar, Object obj) {
        C12775o.m28639i(aVar, "holder");
    }

    public C13867a(C13868a aVar, int i) {
        C12775o.m28639i(aVar, "listener");
        this.f22591a = aVar;
        this.f22592b = i;
        this.f22593c = new ArrayList();
        this.f22597g = "default_tag";
    }
}
