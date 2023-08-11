package p186p0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.models.cards.Card;
import com.braze.p055ui.contentcards.view.C4322e;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p196q0.C9097e;
import p206r0.C9359b;
import p216s0.C9422a;
import p227t0.C9590b;
import p404of.C13074a;

/* renamed from: p0.c */
/* compiled from: ContentCardAdapter.kt */
public final class C9035c extends RecyclerView.Adapter<C4322e> implements C9590b {

    /* renamed from: a */
    private final Context f13161a;

    /* renamed from: b */
    private final LinearLayoutManager f13162b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<Card> f13163c;

    /* renamed from: d */
    private final C9097e f13164d;

    /* renamed from: e */
    private final Handler f13165e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private Set<String> f13166f = new LinkedHashSet();

    /* renamed from: p0.c$a */
    /* compiled from: ContentCardAdapter.kt */
    private static final class C9036a extends DiffUtil.Callback {

        /* renamed from: a */
        private final List<Card> f13167a;

        /* renamed from: b */
        private final List<Card> f13168b;

        public C9036a(List<? extends Card> list, List<? extends Card> list2) {
            C12775o.m28639i(list, "oldCards");
            C12775o.m28639i(list2, "newCards");
            this.f13167a = list;
            this.f13168b = list2;
        }

        /* renamed from: a */
        private final boolean m18368a(int i, int i2) {
            return C12775o.m28634d(this.f13167a.get(i).getId(), this.f13168b.get(i2).getId());
        }

        public boolean areContentsTheSame(int i, int i2) {
            return m18368a(i, i2);
        }

        public boolean areItemsTheSame(int i, int i2) {
            return m18368a(i, i2);
        }

        public int getNewListSize() {
            return this.f13168b.size();
        }

        public int getOldListSize() {
            return this.f13167a.size();
        }
    }

    /* renamed from: p0.c$b */
    /* compiled from: ContentCardAdapter.kt */
    static final class C9037b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f13169g;

        /* renamed from: h */
        final /* synthetic */ C9035c f13170h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9037b(int i, C9035c cVar) {
            super(0);
            this.f13169g = i;
            this.f13170h = cVar;
        }

        public final String invoke() {
            return "Cannot return card at index: " + this.f13169g + " in cards list of size: " + this.f13170h.f13163c.size();
        }
    }

    /* renamed from: p0.c$c */
    /* compiled from: ContentCardAdapter.kt */
    static final class C9038c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Card f13171g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9038c(Card card) {
            super(0);
            this.f13171g = card;
        }

        public final String invoke() {
            return C12775o.m28647q("Logged impression for card ", this.f13171g.getId());
        }
    }

    /* renamed from: p0.c$d */
    /* compiled from: ContentCardAdapter.kt */
    static final class C9039d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Card f13172g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9039d(Card card) {
            super(0);
            this.f13172g = card;
        }

        public final String invoke() {
            return C12775o.m28647q("Already counted impression for card ", this.f13172g.getId());
        }
    }

    /* renamed from: p0.c$e */
    /* compiled from: ContentCardAdapter.kt */
    static final class C9040e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9040e f13173g = new C9040e();

        C9040e() {
            super(0);
        }

        public final String invoke() {
            return "Card list is empty. Not marking on-screen cards as read.";
        }
    }

    /* renamed from: p0.c$f */
    /* compiled from: ContentCardAdapter.kt */
    static final class C9041f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f13174g;

        /* renamed from: h */
        final /* synthetic */ int f13175h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9041f(int i, int i2) {
            super(0);
            this.f13174g = i;
            this.f13175h = i2;
        }

        public final String invoke() {
            return "Not marking all on-screen cards as read. Either the first or last index is negative. First visible: " + this.f13174g + " . Last visible: " + this.f13175h;
        }
    }

    /* renamed from: p0.c$g */
    /* compiled from: ContentCardAdapter.kt */
    static final class C9042g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f13176g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9042g(int i) {
            super(0);
            this.f13176g = i;
        }

        public final String invoke() {
            return "The card at position " + this.f13176g + " isn't on screen or does not have a valid adapter position. Not logging impression.";
        }
    }

    /* renamed from: p0.c$h */
    /* compiled from: ContentCardAdapter.kt */
    static final class C9043h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f13177g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9043h(int i) {
            super(0);
            this.f13177g = i;
        }

        public final String invoke() {
            return "The card at position " + this.f13177g + " isn't on screen or does not have a valid adapter position. Not marking as read.";
        }
    }

    public C9035c(Context context, LinearLayoutManager linearLayoutManager, List<Card> list, C9097e eVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(linearLayoutManager, "layoutManager");
        C12775o.m28639i(list, "cardData");
        C12775o.m28639i(eVar, "contentCardsViewBindingHandler");
        this.f13161a = context;
        this.f13162b = linearLayoutManager;
        this.f13163c = list;
        this.f13164d = eVar;
        setHasStableIds(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m18352l(int i, int i2, C9035c cVar) {
        C12775o.m28639i(cVar, "this$0");
        cVar.notifyItemRangeChanged(i2, (i - i2) + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m18353q(C9035c cVar, int i) {
        C12775o.m28639i(cVar, "this$0");
        cVar.notifyItemChanged(i);
    }

    /* renamed from: a */
    public boolean mo43249a(int i) {
        if (this.f13163c.isEmpty()) {
            return false;
        }
        return this.f13163c.get(i).isDismissibleByUser();
    }

    /* renamed from: b */
    public void mo43250b(int i) {
        Card remove = this.f13163c.remove(i);
        remove.setDismissed(true);
        notifyItemRemoved(i);
        C9359b b = C9422a.f14005b.mo43843a().mo43841b();
        if (b != null) {
            b.mo43786b(this.f13161a, remove);
        }
    }

    @VisibleForTesting
    /* renamed from: f */
    public final Card mo43251f(int i) {
        if (i >= 0 && i < this.f13163c.size()) {
            return this.f13163c.get(i);
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C9037b(i, this), 7, (Object) null);
        return null;
    }

    /* renamed from: g */
    public final List<String> mo43252g() {
        return C12686e0.m28205B0(this.f13166f);
    }

    public int getItemCount() {
        return this.f13163c.size();
    }

    public long getItemId(int i) {
        String id;
        Card f = mo43251f(i);
        if (f == null || (id = f.getId()) == null) {
            return 0;
        }
        return (long) id.hashCode();
    }

    public int getItemViewType(int i) {
        return this.f13164d.mo43314B(this.f13161a, this.f13163c, i);
    }

    @VisibleForTesting
    /* renamed from: h */
    public final boolean mo43253h(int i) {
        int min = Math.min(this.f13162b.findFirstVisibleItemPosition(), this.f13162b.findFirstCompletelyVisibleItemPosition());
        int max = Math.max(this.f13162b.findLastVisibleItemPosition(), this.f13162b.findLastCompletelyVisibleItemPosition());
        if (min > i || i > max) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo43254i(int i) {
        Card f = mo43251f(i);
        if (f == null || !f.isControl()) {
            return false;
        }
        return true;
    }

    @VisibleForTesting
    /* renamed from: j */
    public final void mo43255j(Card card) {
        if (card != null) {
            if (!this.f13166f.contains(card.getId())) {
                card.logImpression();
                this.f13166f.add(card.getId());
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C9038c(card), 6, (Object) null);
            } else {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C9039d(card), 6, (Object) null);
            }
            if (!card.getViewed()) {
                card.setViewed(true);
            }
        }
    }

    /* renamed from: k */
    public final void mo43256k() {
        if (this.f13163c.isEmpty()) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C9040e.f13173g, 7, (Object) null);
            return;
        }
        int findFirstVisibleItemPosition = this.f13162b.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.f13162b.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition < 0 || findLastVisibleItemPosition < 0) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C9041f(findFirstVisibleItemPosition, findLastVisibleItemPosition), 7, (Object) null);
            return;
        }
        if (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
            int i = findFirstVisibleItemPosition;
            while (true) {
                int i2 = i + 1;
                Card f = mo43251f(i);
                if (f != null) {
                    f.setIndicatorHighlighted(true);
                }
                if (i == findLastVisibleItemPosition) {
                    break;
                }
                i = i2;
            }
        }
        this.f13165e.post(new C9034b(findLastVisibleItemPosition, findFirstVisibleItemPosition, this));
    }

    /* renamed from: m */
    public void onBindViewHolder(C4322e eVar, int i) {
        C12775o.m28639i(eVar, "viewHolder");
        this.f13164d.mo43318t(this.f13161a, this.f13163c, eVar, i);
    }

    /* renamed from: n */
    public C4322e onCreateViewHolder(ViewGroup viewGroup, int i) {
        C12775o.m28639i(viewGroup, "viewGroup");
        return this.f13164d.mo43317j(this.f13161a, this.f13163c, viewGroup, i);
    }

    /* renamed from: o */
    public void onViewAttachedToWindow(C4322e eVar) {
        C12775o.m28639i(eVar, "holder");
        super.onViewAttachedToWindow(eVar);
        if (!this.f13163c.isEmpty()) {
            int bindingAdapterPosition = eVar.getBindingAdapterPosition();
            if (bindingAdapterPosition == -1 || !mo43253h(bindingAdapterPosition)) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C9042g(bindingAdapterPosition), 6, (Object) null);
                return;
            }
            mo43255j(mo43251f(bindingAdapterPosition));
        }
    }

    /* renamed from: p */
    public void onViewDetachedFromWindow(C4322e eVar) {
        C12775o.m28639i(eVar, "holder");
        super.onViewDetachedFromWindow(eVar);
        if (!this.f13163c.isEmpty()) {
            int bindingAdapterPosition = eVar.getBindingAdapterPosition();
            if (bindingAdapterPosition == -1 || !mo43253h(bindingAdapterPosition)) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C9043h(bindingAdapterPosition), 6, (Object) null);
                return;
            }
            Card f = mo43251f(bindingAdapterPosition);
            if (f != null && !f.isIndicatorHighlighted()) {
                f.setIndicatorHighlighted(true);
                this.f13165e.post(new C9033a(this, bindingAdapterPosition));
            }
        }
    }

    /* renamed from: r */
    public final synchronized void mo43261r(List<? extends Card> list) {
        C12775o.m28639i(list, "newCardData");
        DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new C9036a(this.f13163c, list));
        C12775o.m28638h(calculateDiff, "calculateDiff(diffCallback)");
        this.f13163c.clear();
        this.f13163c.addAll(list);
        calculateDiff.dispatchUpdatesTo((RecyclerView.Adapter) this);
    }

    /* renamed from: s */
    public final void mo43262s(List<String> list) {
        C12775o.m28639i(list, "impressedCardIds");
        this.f13166f = C12686e0.m28208E0(list);
    }
}
