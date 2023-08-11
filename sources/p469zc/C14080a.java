package p469zc;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.rmn.iosadapters.android.content.ContextContainer;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p368jd.C12616b;
import p404of.C13074a;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: zc.a */
/* compiled from: BaseViewHolder.kt */
public abstract class C14080a extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: b */
    private final C13867a.C13868a f23002b;

    /* renamed from: c */
    private final boolean f23003c = true;

    /* renamed from: d */
    private final boolean f23004d;

    /* renamed from: e */
    private final boolean f23005e = true;

    /* renamed from: f */
    private final Lazy f23006f;

    /* renamed from: zc.a$a */
    /* compiled from: BaseViewHolder.kt */
    static final class C14081a extends C12777p implements C13074a<ContextContainer> {

        /* renamed from: g */
        final /* synthetic */ View f23007g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14081a(View view) {
            super(0);
            this.f23007g = view;
        }

        /* renamed from: b */
        public final ContextContainer invoke() {
            return new ContextContainer(this.f23007g.getContext());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14080a(View view, C13867a.C13868a aVar) {
        super(view);
        C12775o.m28639i(view, "itemView");
        this.f23002b = aVar;
        this.f23006f = C11901h.m25690b(new C14081a(view));
    }

    /* renamed from: J0 */
    public final ContextContainer mo53840J0() {
        return (ContextContainer) this.f23006f.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public final C13867a.C13868a mo53841M0() {
        return this.f23002b;
    }

    /* renamed from: N0 */
    public boolean mo53578N0() {
        return this.f23004d;
    }

    /* renamed from: R0 */
    public boolean mo23238R0() {
        return this.f23005e;
    }

    /* renamed from: b0 */
    public final C12616b mo53842b0() {
        Context context = this.itemView.getContext();
        if (context instanceof C12616b) {
            return (C12616b) context;
        }
        return null;
    }

    /* renamed from: l2 */
    public boolean mo53579l2() {
        return this.f23003c;
    }

    /* renamed from: m2 */
    public abstract void mo23234m2(C13867a aVar, Object obj);

    public void onClick(View view) {
        C12775o.m28639i(view, "v");
        if (this.f23002b == null) {
            return;
        }
        if (mo53578N0()) {
            this.f23002b.mo46348b0();
        } else if (mo23238R0()) {
            C13867a.C13868a aVar = this.f23002b;
            Object tag = this.itemView.getTag();
            C12775o.m28638h(tag, "itemView.tag");
            aVar.mo46342E(tag);
        }
    }

    /* renamed from: t0 */
    public final Context mo53843t0() {
        Context context = this.itemView.getContext();
        C12775o.m28638h(context, "itemView.context");
        return context;
    }
}
