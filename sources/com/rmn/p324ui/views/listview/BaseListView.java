package com.rmn.p324ui.views.listview;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.poulpeo.R;
import com.rmn.p324ui.toolbar.ToolbarBehavior;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p311bd.C10930a;
import p311bd.C10932b;
import p311bd.C10933c;
import p311bd.C10934d;
import p360id.C12136d;
import p440ud.C13573q;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: com.rmn.ui.views.listview.BaseListView */
/* compiled from: BaseListView.kt */
public class BaseListView extends LinearLayout implements C10934d, Handler.Callback, AdapterView.OnItemClickListener, SwipeRefreshLayout.OnRefreshListener, C13867a.C13868a {

    /* renamed from: k */
    public static final C11649a f18108k = new C11649a((DefaultConstructorMarker) null);

    /* renamed from: l */
    public static final int f18109l = 8;

    /* renamed from: m */
    private static final int f18110m = 1000;

    /* renamed from: n */
    private static final long f18111n = 700;

    /* renamed from: b */
    private Handler f18112b;

    /* renamed from: c */
    private ProgressBar f18113c;

    /* renamed from: d */
    private SwipeRefreshLayout f18114d;

    /* renamed from: e */
    private LinearLayout f18115e;

    /* renamed from: f */
    private LinearLayoutManager f18116f;

    /* renamed from: g */
    private RecyclerView f18117g;

    /* renamed from: h */
    protected C10930a f18118h;

    /* renamed from: i */
    private C13867a f18119i;

    /* renamed from: j */
    public Map<Integer, View> f18120j = new LinkedHashMap();

    /* renamed from: com.rmn.ui.views.listview.BaseListView$a */
    /* compiled from: BaseListView.kt */
    public static final class C11649a {
        private C11649a() {
        }

        public /* synthetic */ C11649a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.rmn.ui.views.listview.BaseListView$b */
    /* compiled from: BaseListView.kt */
    public static final class C11650b extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ BaseListView f18121a;

        C11650b(BaseListView baseListView) {
            this.f18121a = baseListView;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m25090b(BaseListView baseListView) {
            C12775o.m28639i(baseListView, "this$0");
            baseListView.getBaseListViewController().mo45949F2();
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C12775o.m28639i(recyclerView, "view");
            BaseListView baseListView = this.f18121a;
            baseListView.post(new C11653b(baseListView));
        }
    }

    /* renamed from: com.rmn.ui.views.listview.BaseListView$c */
    /* compiled from: BaseListView.kt */
    public static final class C11651c extends GridLayoutManager.SpanSizeLookup {

        /* renamed from: a */
        final /* synthetic */ BaseListView f18122a;

        /* renamed from: b */
        final /* synthetic */ NPAGridLayoutManager f18123b;

        C11651c(BaseListView baseListView, NPAGridLayoutManager nPAGridLayoutManager) {
            this.f18122a = baseListView;
            this.f18123b = nPAGridLayoutManager;
        }

        public int getSpanSize(int i) {
            C13867a adapter = this.f18122a.getAdapter();
            C12775o.m28636f(adapter);
            if (adapter.mo53564n() == 0) {
                return 1;
            }
            C13867a adapter2 = this.f18122a.getAdapter();
            C12775o.m28636f(adapter2);
            if (i == adapter2.mo53564n()) {
                C13867a adapter3 = this.f18122a.getAdapter();
                C12775o.m28636f(adapter3);
                if (adapter3.mo53567s()) {
                    return this.f18123b.getSpanCount();
                }
            }
            boolean z = false;
            if (i >= 0) {
                C13867a adapter4 = this.f18122a.getAdapter();
                C12775o.m28636f(adapter4);
                if (i < adapter4.mo53564n()) {
                    z = true;
                }
            }
            if (!z) {
                return 1;
            }
            C13867a adapter5 = this.f18122a.getAdapter();
            C12775o.m28636f(adapter5);
            if (adapter5.getItem(i) instanceof C11655d) {
                return this.f18123b.getSpanCount();
            }
            return 1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseListView(Context context, Integer num) {
        super(context);
        C12775o.m28639i(context, "context");
        m25070v((AttributeSet) null, num);
    }

    /* access modifiers changed from: private */
    /* renamed from: N0 */
    public static final void m25067N0(BaseListView baseListView, int i) {
        C12775o.m28639i(baseListView, "this$0");
        C13867a adapter = baseListView.getAdapter();
        if (adapter != null) {
            adapter.mo53568u(i);
        }
    }

    /* renamed from: t0 */
    static /* synthetic */ void m25069t0(BaseListView baseListView, AttributeSet attributeSet, Integer num, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                num = null;
            }
            baseListView.m25070v(attributeSet, num);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01b4  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m25070v(android.util.AttributeSet r13, java.lang.Integer r14) {
        /*
            r12 = this;
            android.content.Context r0 = r12.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131558554(0x7f0d009a, float:1.8742427E38)
            r0.inflate(r1, r12)
            r0 = 2131362664(0x7f0a0368, float:1.8345115E38)
            android.view.View r0 = r12.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.recyclerview)"
            kotlin.jvm.internal.C12775o.m28638h(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r12.f18117g = r0
            androidx.recyclerview.widget.RecyclerView r0 = r12.getRecyclerView()
            r1 = 20
            r0.setItemViewCacheSize(r1)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1, r12)
            r12.f18112b = r0
            r0 = 2131362656(0x7f0a0360, float:1.8345099E38)
            android.view.View r0 = r12.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.progressbarLoader)"
            kotlin.jvm.internal.C12775o.m28638h(r0, r1)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r12.f18113c = r0
            r0 = 2131362778(0x7f0a03da, float:1.8345346E38)
            android.view.View r0 = r12.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.swipe_refresh_layout)"
            kotlin.jvm.internal.C12775o.m28638h(r0, r1)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r0
            r12.f18114d = r0
            java.lang.String r1 = "swipeRefreshLayout"
            r2 = 0
            if (r0 != 0) goto L_0x005b
            kotlin.jvm.internal.C12775o.m28656z(r1)
            r0 = r2
        L_0x005b:
            r3 = 4
            int[] r4 = new int[r3]
            r4 = {2131100436, 2131100439, 2131100436, 2131100439} // fill-array
            r0.setColorSchemeResources(r4)
            r0 = 2131362464(0x7f0a02a0, float:1.834471E38)
            android.view.View r0 = r12.findViewById(r0)
            java.lang.String r4 = "findViewById(R.id.loading_container)"
            kotlin.jvm.internal.C12775o.m28638h(r0, r4)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r12.f18115e = r0
            androidx.recyclerview.widget.RecyclerView r0 = r12.getRecyclerView()
            com.rmn.ui.views.listview.BaseListView$b r4 = new com.rmn.ui.views.listview.BaseListView$b
            r4.<init>(r12)
            r0.addOnScrollListener(r4)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r12.f18114d
            if (r0 != 0) goto L_0x0088
            kotlin.jvm.internal.C12775o.m28656z(r1)
            r0 = r2
        L_0x0088:
            r0.setOnRefreshListener(r12)
            r0 = 0
            r1 = 1
            if (r13 == 0) goto L_0x0137
            android.content.Context r4 = r12.getContext()
            int[] r5 = p462yb.C13866g.f22563u
            android.content.res.TypedArray r13 = r4.obtainStyledAttributes(r13, r5)
            java.lang.String r4 = "context.obtainStyledAttr…R.styleable.BaseListView)"
            kotlin.jvm.internal.C12775o.m28638h(r13, r4)
            int r3 = r13.getInt(r3, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r3.intValue()
            r5 = 3
            if (r4 != r1) goto L_0x00bb
            int r4 = r13.getInteger(r1, r5)
            int r6 = r13.getInteger(r0, r0)
            if (r6 != r1) goto L_0x00b9
            r6 = r0
            goto L_0x00bd
        L_0x00b9:
            r6 = r1
            goto L_0x00bd
        L_0x00bb:
            r4 = r1
            r6 = r4
        L_0x00bd:
            int r5 = r13.getDimensionPixelOffset(r5, r0)
            android.widget.ProgressBar r7 = r12.f18113c
            java.lang.String r8 = "progress"
            if (r7 != 0) goto L_0x00cb
            kotlin.jvm.internal.C12775o.m28656z(r8)
            r7 = r2
        L_0x00cb:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            java.lang.String r9 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            kotlin.jvm.internal.C12775o.m28637g(r7, r9)
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            r9 = -1
            int r5 = r5 * r9
            r10 = 2
            int r5 = r5 / r10
            r7.setMargins(r0, r5, r0, r0)
            android.widget.ProgressBar r5 = r12.f18113c
            if (r5 != 0) goto L_0x00e5
            kotlin.jvm.internal.C12775o.m28656z(r8)
            r5 = r2
        L_0x00e5:
            r5.requestLayout()
            r5 = 5
            int r5 = r13.getDimensionPixelOffset(r5, r9)
            r7 = 6
            int r7 = r13.getDimensionPixelOffset(r7, r9)
            if (r5 >= 0) goto L_0x00f6
            if (r7 < 0) goto L_0x0123
        L_0x00f6:
            if (r7 < 0) goto L_0x00f9
            goto L_0x0101
        L_0x00f9:
            androidx.recyclerview.widget.RecyclerView r7 = r12.getRecyclerView()
            int r7 = r7.getPaddingTop()
        L_0x0101:
            androidx.recyclerview.widget.RecyclerView r8 = r12.getRecyclerView()
            int r8 = r8.getPaddingStart()
            androidx.recyclerview.widget.RecyclerView r9 = r12.getRecyclerView()
            int r9 = r9.getPaddingEnd()
            if (r5 < 0) goto L_0x0114
            goto L_0x011c
        L_0x0114:
            androidx.recyclerview.widget.RecyclerView r5 = r12.getRecyclerView()
            int r5 = r5.getPaddingBottom()
        L_0x011c:
            androidx.recyclerview.widget.RecyclerView r11 = r12.getRecyclerView()
            r11.setPadding(r8, r7, r9, r5)
        L_0x0123:
            boolean r5 = r13.hasValue(r10)
            if (r5 == 0) goto L_0x0132
            int r5 = r13.getInteger(r10, r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0133
        L_0x0132:
            r5 = r2
        L_0x0133:
            r13.recycle()
            goto L_0x013b
        L_0x0137:
            r4 = r1
            r6 = r4
            r3 = r2
            r5 = r3
        L_0x013b:
            if (r14 == 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r14 = r5
        L_0x013f:
            bd.a r13 = r12.mo46555J0(r14)
            r12.setBaseListViewController(r13)
            if (r3 == 0) goto L_0x018c
            int r13 = r3.intValue()
            if (r13 != 0) goto L_0x014f
            goto L_0x018c
        L_0x014f:
            int r13 = r3.intValue()
            if (r13 != r1) goto L_0x0197
            com.rmn.ui.views.listview.NPAGridLayoutManager r13 = new com.rmn.ui.views.listview.NPAGridLayoutManager
            android.content.Context r14 = r12.getContext()
            java.lang.String r3 = "context"
            kotlin.jvm.internal.C12775o.m28638h(r14, r3)
            r13.<init>((android.content.Context) r14, (int) r4, (int) r6, (boolean) r0)
            com.rmn.ui.views.listview.BaseListView$c r14 = new com.rmn.ui.views.listview.BaseListView$c
            r14.<init>(r12, r13)
            r13.setSpanSizeLookup(r14)
            r12.f18116f = r13
            android.content.res.Resources r13 = r12.getResources()
            r14 = 2131165451(0x7f07010b, float:1.794512E38)
            int r13 = r13.getDimensionPixelOffset(r14)
            androidx.recyclerview.widget.RecyclerView r14 = r12.getRecyclerView()
            com.rmn.ui.views.listview.e r0 = new com.rmn.ui.views.listview.e
            r0.<init>(r4, r13, r6)
            r14.addItemDecoration(r0)
            bd.a r13 = r12.getBaseListViewController()
            r13.mo45961S2(r4)
            goto L_0x0198
        L_0x018c:
            androidx.recyclerview.widget.LinearLayoutManager r13 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r14 = r12.getContext()
            r13.<init>(r14)
            r12.f18116f = r13
        L_0x0197:
            r6 = r1
        L_0x0198:
            androidx.recyclerview.widget.RecyclerView r13 = r12.getRecyclerView()
            androidx.recyclerview.widget.LinearLayoutManager r14 = r12.f18116f
            if (r14 != 0) goto L_0x01a6
            java.lang.String r14 = "mLayoutManager"
            kotlin.jvm.internal.C12775o.m28656z(r14)
            goto L_0x01a7
        L_0x01a6:
            r2 = r14
        L_0x01a7:
            r13.setLayoutManager(r2)
            if (r6 == 0) goto L_0x01b4
            androidx.recyclerview.widget.RecyclerView r13 = r12.getRecyclerView()
            r13.setVerticalScrollBarEnabled(r1)
            goto L_0x01bb
        L_0x01b4:
            androidx.recyclerview.widget.RecyclerView r13 = r12.getRecyclerView()
            r13.setHorizontalScrollBarEnabled(r1)
        L_0x01bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.p324ui.views.listview.BaseListView.m25070v(android.util.AttributeSet, java.lang.Integer):void");
    }

    /* renamed from: E */
    public void mo46342E(Object obj) {
        C12775o.m28639i(obj, "clickedItem");
        getBaseListViewController().mo45947D2(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J0 */
    public C10930a mo46555J0(Integer num) {
        return new C10930a(this, num);
    }

    /* renamed from: M0 */
    public final ToolbarBehavior mo47889M0() {
        return new ToolbarBehavior(getRecyclerView());
    }

    /* renamed from: R0 */
    public final void mo47890R0() {
        getRecyclerView().smoothScrollToPosition(0);
    }

    /* renamed from: V */
    public void mo45979V(int i) {
        LinearLayoutManager linearLayoutManager = this.f18116f;
        LinearLayoutManager linearLayoutManager2 = null;
        if (linearLayoutManager == null) {
            C12775o.m28656z("mLayoutManager");
            linearLayoutManager = null;
        }
        if (linearLayoutManager instanceof GridLayoutManager) {
            LinearLayoutManager linearLayoutManager3 = this.f18116f;
            if (linearLayoutManager3 == null) {
                C12775o.m28656z("mLayoutManager");
            } else {
                linearLayoutManager2 = linearLayoutManager3;
            }
            ((GridLayoutManager) linearLayoutManager2).setSpanCount(i);
        }
    }

    /* renamed from: V1 */
    public void mo45980V1(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elems");
        C13867a adapter = getAdapter();
        if (adapter != null) {
            adapter.mo53560j(collection);
        }
    }

    /* renamed from: X0 */
    public void mo45981X0() {
        getRecyclerView().scrollTo(0, 0);
        getRecyclerView().getRecycledViewPool().clear();
        C13867a adapter = getAdapter();
        if (adapter != null) {
            adapter.mo53562l();
        }
    }

    /* renamed from: a1 */
    public void mo45982a1(C10932b bVar) {
        C12775o.m28639i(bVar, "messageState");
        C13867a adapter = getAdapter();
        if (adapter != null) {
            adapter.mo53571x(bVar);
        }
    }

    /* renamed from: b0 */
    public void mo46348b0() {
        getBaseListViewController().mo45946C2();
    }

    /* renamed from: c2 */
    public void mo45983c2() {
        C13867a adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: d0 */
    public boolean mo45984d0() {
        LinearLayoutManager linearLayoutManager = this.f18116f;
        LinearLayoutManager linearLayoutManager2 = null;
        if (linearLayoutManager == null) {
            C12775o.m28656z("mLayoutManager");
            linearLayoutManager = null;
        }
        int childCount = linearLayoutManager.getChildCount();
        LinearLayoutManager linearLayoutManager3 = this.f18116f;
        if (linearLayoutManager3 == null) {
            C12775o.m28656z("mLayoutManager");
            linearLayoutManager3 = null;
        }
        int itemCount = linearLayoutManager3.getItemCount();
        LinearLayoutManager linearLayoutManager4 = this.f18116f;
        if (linearLayoutManager4 == null) {
            C12775o.m28656z("mLayoutManager");
        } else {
            linearLayoutManager2 = linearLayoutManager4;
        }
        if (childCount + linearLayoutManager2.findFirstVisibleItemPosition() >= itemCount) {
            return true;
        }
        return false;
    }

    /* renamed from: e1 */
    public void mo45985e1(String str) {
        C12775o.m28639i(str, "message");
        Context context = getContext();
        C12775o.m28638h(context, "context");
        C12136d.m26468j(context, str);
    }

    public C13867a getAdapter() {
        return this.f18119i;
    }

    public final C10930a getBaseListViewController() {
        C10930a aVar = this.f18118h;
        if (aVar != null) {
            return aVar;
        }
        C12775o.m28656z("baseListViewController");
        return null;
    }

    public String getDefaultErrorString() {
        String string = getContext().getResources().getString(R.string.listview_error_default);
        C12775o.m28638h(string, "context.resources.getStr…g.listview_error_default)");
        return string;
    }

    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.f18117g;
        if (recyclerView != null) {
            return recyclerView;
        }
        C12775o.m28656z("recyclerView");
        return null;
    }

    public boolean handleMessage(Message message) {
        C12775o.m28639i(message, NotificationCompat.CATEGORY_MESSAGE);
        if (message.what != f18110m) {
            return false;
        }
        ProgressBar progressBar = this.f18113c;
        if (progressBar == null) {
            C12775o.m28656z("progress");
            progressBar = null;
        }
        progressBar.setEnabled(true);
        return false;
    }

    /* renamed from: o0 */
    public void mo45987o0(int i) {
        getRecyclerView().post(new C11652a(this, i));
    }

    /* renamed from: o1 */
    public void mo45988o1() {
        LinearLayout linearLayout = this.f18115e;
        ProgressBar progressBar = null;
        if (linearLayout == null) {
            C12775o.m28656z("loadingContainer");
            linearLayout = null;
        }
        linearLayout.setVisibility(8);
        Handler handler = this.f18112b;
        if (handler == null) {
            C12775o.m28656z("mHandler");
            handler = null;
        }
        handler.removeMessages(f18110m);
        ProgressBar progressBar2 = this.f18113c;
        if (progressBar2 == null) {
            C12775o.m28656z("progress");
        } else {
            progressBar = progressBar2;
        }
        progressBar.setEnabled(false);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C12775o.m28639i(adapterView, "parent");
        C12775o.m28639i(view, "view");
        getBaseListViewController().mo45947D2(Integer.valueOf(i));
    }

    public void onRefresh() {
        getBaseListViewController().mo45948E2();
    }

    /* renamed from: s */
    public void mo45989s(C11654c cVar) {
        C13867a adapter = getAdapter();
        if (adapter != null) {
            adapter.mo53570w(cVar);
        }
    }

    public void setAdapter(C13867a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException();
        } else if (aVar != this.f18119i) {
            this.f18119i = aVar;
            getRecyclerView().setAdapter(aVar);
            mo45989s(getBaseListViewController().f16844d);
            C10932b s2 = getBaseListViewController().mo45971s2();
            C12775o.m28638h(s2, "baseListViewController.currentMessageState");
            mo45982a1(s2);
            C10933c u2 = getBaseListViewController().mo45973u2();
            C12775o.m28638h(u2, "baseListViewController.currentState");
            mo45995t1(u2);
        }
    }

    /* access modifiers changed from: protected */
    public final void setBaseListViewController(C10930a aVar) {
        C12775o.m28639i(aVar, "<set-?>");
        this.f18118h = aVar;
    }

    public void setLazyLoadingRowVisible(boolean z) {
        C13867a adapter = getAdapter();
        if (adapter != null) {
            adapter.mo53563m(z);
        }
    }

    public void setListViewEnabled(boolean z) {
        getRecyclerView().setEnabled(z);
    }

    public final void setOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        C12775o.m28639i(onScrollListener, "listener");
        getRecyclerView().addOnScrollListener(onScrollListener);
    }

    public void setSwipeRefreshLayoutEnabled(boolean z) {
        SwipeRefreshLayout swipeRefreshLayout = this.f18114d;
        if (swipeRefreshLayout == null) {
            C12775o.m28656z("swipeRefreshLayout");
            swipeRefreshLayout = null;
        }
        swipeRefreshLayout.setEnabled(z);
    }

    public void setSwipeRefreshLayoutRefreshing(boolean z) {
        SwipeRefreshLayout swipeRefreshLayout = this.f18114d;
        if (swipeRefreshLayout == null) {
            C12775o.m28656z("swipeRefreshLayout");
            swipeRefreshLayout = null;
        }
        swipeRefreshLayout.setRefreshing(z);
    }

    public void setSwipeRefreshLayoutVisibility(C13573q qVar) {
        C12775o.m28639i(qVar, "visibilityWrapper");
        SwipeRefreshLayout swipeRefreshLayout = this.f18114d;
        if (swipeRefreshLayout == null) {
            C12775o.m28656z("swipeRefreshLayout");
            swipeRefreshLayout = null;
        }
        swipeRefreshLayout.setVisibility(qVar.f21831b);
    }

    /* renamed from: t1 */
    public void mo45995t1(C10933c cVar) {
        C12775o.m28639i(cVar, "state");
        C13867a adapter = getAdapter();
        if (adapter != null) {
            adapter.mo53572y(cVar);
        }
    }

    /* renamed from: y0 */
    public void mo45996y0() {
        LinearLayout linearLayout = this.f18115e;
        Handler handler = null;
        if (linearLayout == null) {
            C12775o.m28656z("loadingContainer");
            linearLayout = null;
        }
        linearLayout.setVisibility(0);
        Handler handler2 = this.f18112b;
        if (handler2 == null) {
            C12775o.m28656z("mHandler");
        } else {
            handler = handler2;
        }
        handler.sendEmptyMessageDelayed(f18110m, f18111n);
    }

    /* renamed from: z1 */
    public void mo45997z1(Object obj, int i) {
        C12775o.m28639i(obj, "elem");
        C13867a adapter = getAdapter();
        if (adapter != null) {
            adapter.mo53561k(obj, i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C12775o.m28639i(context, "context");
        C12775o.m28639i(attributeSet, "attrs");
        m25069t0(this, attributeSet, (Integer) null, 2, (Object) null);
    }
}
