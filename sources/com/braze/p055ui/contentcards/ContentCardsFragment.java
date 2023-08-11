package com.braze.p055ui.contentcards;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appboy.models.cards.Card;
import com.appboy.p054ui.C4193R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p031b0.C2807d;
import p031b0.C2811f;
import p031b0.C2815j;
import p126j0.C8266c;
import p186p0.C9035c;
import p186p0.C9044d;
import p196q0.C9089b;
import p196q0.C9092c;
import p196q0.C9096d;
import p196q0.C9097e;
import p227t0.C9589a;
import p227t0.C9591c;
import p270x.C10156b;
import p281y.C10606a;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13933b1;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* renamed from: com.braze.ui.contentcards.ContentCardsFragment */
/* compiled from: ContentCardsFragment.kt */
public class ContentCardsFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {
    private static final long AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS = 2500;
    public static final C4305a Companion = new C4305a((DefaultConstructorMarker) null);
    private static final String KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY = "KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY";
    private static final String LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY = "LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY";
    private static final int MAX_CONTENT_CARDS_TTL_SECONDS = 60;
    private static final long NETWORK_PROBLEM_WARNING_MS = 5000;
    private static final String UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY = "UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY";
    private static final String VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY = "VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY";
    public C9035c cardAdapter;
    private RecyclerView contentCardsRecyclerView;
    private SwipeRefreshLayout contentCardsSwipeLayout;
    private C2811f<C2807d> contentCardsUpdatedSubscriber;
    private C9096d customContentCardUpdateHandler;
    private C9097e customContentCardsViewBindingHandler;
    private final C9096d defaultContentCardUpdateHandler = new C9089b();
    private final C9097e defaultContentCardsViewBindingHandler = new C9092c();
    private C9044d defaultEmptyContentCardsAdapter = new C9044d();
    private C14054y1 networkUnavailableJob;
    private C2811f<C2815j> sdkDataWipeEventSubscriber;

    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$a */
    /* compiled from: ContentCardsFragment.kt */
    public static final class C4305a {
        private C4305a() {
        }

        public /* synthetic */ C4305a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$b */
    /* compiled from: ContentCardsFragment.kt */
    static final class C4306b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C2807d f3575g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4306b(C2807d dVar) {
            super(0);
            this.f3575g = dVar;
        }

        public final String invoke() {
            return C12775o.m28647q("Updating Content Cards views in response to ContentCardsUpdatedEvent: ", this.f3575g);
        }
    }

    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$c */
    /* compiled from: ContentCardsFragment.kt */
    static final class C4307c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4307c f3576g = new C4307c();

        C4307c() {
            super(0);
        }

        public final String invoke() {
            return "ContentCards received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.";
        }
    }

    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$d */
    /* compiled from: ContentCardsFragment.kt */
    static final class C4308d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4308d f3577g = new C4308d();

        C4308d() {
            super(0);
        }

        public final String invoke() {
            return "Old Content Cards was empty, putting up a network spinner and registering the network error message on a delay of 5000 ms.";
        }
    }

    @C12739f(mo50609c = "com.braze.ui.contentcards.ContentCardsFragment$contentCardsUpdate$5", mo50610f = "ContentCardsFragment.kt", mo50611l = {308}, mo50612m = "invokeSuspend")
    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$e */
    /* compiled from: ContentCardsFragment.kt */
    static final class C4309e extends C12746l implements Function1<C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f3578h;

        /* renamed from: i */
        final /* synthetic */ ContentCardsFragment f3579i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4309e(ContentCardsFragment contentCardsFragment, C12074d<? super C4309e> dVar) {
            super(1, dVar);
            this.f3579i = contentCardsFragment;
        }

        public final C12074d<C11921v> create(C12074d<?> dVar) {
            return new C4309e(this.f3579i, dVar);
        }

        public final Object invoke(C12074d<? super C11921v> dVar) {
            return ((C4309e) create(dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f3578h;
            if (i == 0) {
                C11910n.m25701b(obj);
                ContentCardsFragment contentCardsFragment = this.f3579i;
                this.f3578h = 1;
                if (contentCardsFragment.networkUnavailable(this) == c) {
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

    @C12739f(mo50609c = "com.braze.ui.contentcards.ContentCardsFragment$handleContentCardsUpdatedEvent$1", mo50610f = "ContentCardsFragment.kt", mo50611l = {268}, mo50612m = "invokeSuspend")
    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$f */
    /* compiled from: ContentCardsFragment.kt */
    static final class C4310f extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f3580h;

        /* renamed from: i */
        final /* synthetic */ ContentCardsFragment f3581i;

        /* renamed from: j */
        final /* synthetic */ C2807d f3582j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4310f(ContentCardsFragment contentCardsFragment, C2807d dVar, C12074d<? super C4310f> dVar2) {
            super(2, dVar2);
            this.f3581i = contentCardsFragment;
            this.f3582j = dVar;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C4310f(this.f3581i, this.f3582j, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f3580h;
            if (i == 0) {
                C11910n.m25701b(obj);
                ContentCardsFragment contentCardsFragment = this.f3581i;
                C2807d dVar = this.f3582j;
                this.f3580h = 1;
                if (contentCardsFragment.contentCardsUpdate(dVar, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C4310f) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$g */
    /* compiled from: ContentCardsFragment.kt */
    static final class C4311g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4311g f3583g = new C4311g();

        C4311g() {
            super(0);
        }

        public final String invoke() {
            return "Displaying network unavailable toast.";
        }
    }

    @C12739f(mo50609c = "com.braze.ui.contentcards.ContentCardsFragment$onRefresh$1", mo50610f = "ContentCardsFragment.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$h */
    /* compiled from: ContentCardsFragment.kt */
    static final class C4312h extends C12746l implements Function1<C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f3584h;

        /* renamed from: i */
        final /* synthetic */ ContentCardsFragment f3585i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4312h(ContentCardsFragment contentCardsFragment, C12074d<? super C4312h> dVar) {
            super(1, dVar);
            this.f3585i = contentCardsFragment;
        }

        public final C12074d<C11921v> create(C12074d<?> dVar) {
            return new C4312h(this.f3585i, dVar);
        }

        public final Object invoke(C12074d<? super C11921v> dVar) {
            return ((C4312h) create(dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.f3584h == 0) {
                C11910n.m25701b(obj);
                SwipeRefreshLayout contentCardsSwipeLayout = this.f3585i.getContentCardsSwipeLayout();
                if (contentCardsSwipeLayout != null) {
                    contentCardsSwipeLayout.setRefreshing(false);
                }
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C12739f(mo50609c = "com.braze.ui.contentcards.ContentCardsFragment$onViewStateRestored$1", mo50610f = "ContentCardsFragment.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$i */
    /* compiled from: ContentCardsFragment.kt */
    static final class C4313i extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f3586h;

        /* renamed from: i */
        final /* synthetic */ Bundle f3587i;

        /* renamed from: j */
        final /* synthetic */ ContentCardsFragment f3588j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4313i(Bundle bundle, ContentCardsFragment contentCardsFragment, C12074d<? super C4313i> dVar) {
            super(2, dVar);
            this.f3587i = bundle;
            this.f3588j = contentCardsFragment;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C4313i(this.f3587i, this.f3588j, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Parcelable parcelable;
            ArrayList<String> stringArrayList;
            Object unused = C12150d.m26492c();
            if (this.f3586h == 0) {
                C11910n.m25701b(obj);
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) this.f3587i.getParcelable(ContentCardsFragment.LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY, Parcelable.class);
                } else {
                    parcelable = this.f3587i.getParcelable(ContentCardsFragment.LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY);
                }
                RecyclerView contentCardsRecyclerView = this.f3588j.getContentCardsRecyclerView();
                if (contentCardsRecyclerView != null) {
                    RecyclerView.LayoutManager layoutManager = contentCardsRecyclerView.getLayoutManager();
                    if (!(parcelable == null || layoutManager == null)) {
                        layoutManager.onRestoreInstanceState(parcelable);
                    }
                }
                C9035c cVar = this.f3588j.cardAdapter;
                if (!(cVar == null || (stringArrayList = this.f3587i.getStringArrayList(ContentCardsFragment.KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY)) == null)) {
                    cVar.mo43262s(stringArrayList);
                }
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C4313i) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onResume$lambda-0  reason: not valid java name */
    public static final void m38722onResume$lambda0(ContentCardsFragment contentCardsFragment, C2807d dVar) {
        C12775o.m28639i(contentCardsFragment, "this$0");
        C12775o.m28639i(dVar, NotificationCompat.CATEGORY_EVENT);
        contentCardsFragment.handleContentCardsUpdatedEvent(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: onResume$lambda-2  reason: not valid java name */
    public static final void m38723onResume$lambda2(ContentCardsFragment contentCardsFragment, C2815j jVar) {
        C12775o.m28639i(contentCardsFragment, "this$0");
        C12775o.m28639i(jVar, "it");
        contentCardsFragment.handleContentCardsUpdatedEvent(C2807d.f1110e.mo28289a());
    }

    /* access modifiers changed from: protected */
    public final void attachSwipeHelperCallback() {
        C9035c cVar = this.cardAdapter;
        if (cVar != null) {
            new ItemTouchHelper(new C9591c(cVar)).attachToRecyclerView(getContentCardsRecyclerView());
        }
    }

    /* access modifiers changed from: protected */
    public final Object contentCardsUpdate(C2807d dVar, C12074d<? super C11921v> dVar2) {
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C4306b(dVar), 6, (Object) null);
        List<Card> r = getContentCardUpdateHandler().mo43308r(dVar);
        C9035c cVar2 = this.cardAdapter;
        if (cVar2 != null) {
            cVar2.mo43261r(r);
        }
        C14054y1 networkUnavailableJob2 = getNetworkUnavailableJob();
        if (networkUnavailableJob2 != null) {
            C14054y1.C14055a.m32600a(networkUnavailableJob2, (CancellationException) null, 1, (Object) null);
        }
        setNetworkUnavailableJob((C14054y1) null);
        if (dVar.mo28286c() && dVar.mo28287d(60)) {
            C8266c.m16396e(cVar, this, C8266c.C8267a.I, (Throwable) null, false, C4307c.f3576g, 6, (Object) null);
            C10156b.C10157a aVar = C10156b.f15345m;
            Context requireContext = requireContext();
            C12775o.m28638h(requireContext, "requireContext()");
            aVar.mo44811g(requireContext).mo44791h0(false);
            if (r.isEmpty()) {
                SwipeRefreshLayout contentCardsSwipeLayout2 = getContentCardsSwipeLayout();
                if (contentCardsSwipeLayout2 != null) {
                    contentCardsSwipeLayout2.setRefreshing(true);
                }
                C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C4308d.f3577g, 7, (Object) null);
                C14054y1 networkUnavailableJob3 = getNetworkUnavailableJob();
                if (networkUnavailableJob3 != null) {
                    C14054y1.C14055a.m32600a(networkUnavailableJob3, (CancellationException) null, 1, (Object) null);
                }
                setNetworkUnavailableJob(C10606a.f16162b.mo45556a(C12735b.m28561d(NETWORK_PROBLEM_WARNING_MS), C13933b1.m32212c(), new C4309e(this, (C12074d<? super C4309e>) null)));
                return C11921v.f18618a;
            }
        }
        if (!r.isEmpty()) {
            C9035c cVar3 = this.cardAdapter;
            if (cVar3 != null) {
                swapRecyclerViewAdapter(cVar3);
            }
        } else {
            swapRecyclerViewAdapter(getEmptyCardsAdapter());
        }
        SwipeRefreshLayout contentCardsSwipeLayout3 = getContentCardsSwipeLayout();
        if (contentCardsSwipeLayout3 != null) {
            contentCardsSwipeLayout3.setRefreshing(false);
        }
        return C11921v.f18618a;
    }

    public final C9096d getContentCardUpdateHandler() {
        C9096d dVar = this.customContentCardUpdateHandler;
        if (dVar == null) {
            return this.defaultContentCardUpdateHandler;
        }
        return dVar;
    }

    public final RecyclerView getContentCardsRecyclerView() {
        return this.contentCardsRecyclerView;
    }

    /* access modifiers changed from: protected */
    public final SwipeRefreshLayout getContentCardsSwipeLayout() {
        return this.contentCardsSwipeLayout;
    }

    /* access modifiers changed from: protected */
    public final C2811f<C2807d> getContentCardsUpdatedSubscriber() {
        return this.contentCardsUpdatedSubscriber;
    }

    public final C9097e getContentCardsViewBindingHandler() {
        C9097e eVar = this.customContentCardsViewBindingHandler;
        if (eVar == null) {
            return this.defaultContentCardsViewBindingHandler;
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    public final C9096d getCustomContentCardUpdateHandler() {
        return this.customContentCardUpdateHandler;
    }

    /* access modifiers changed from: protected */
    public final C9097e getCustomContentCardsViewBindingHandler() {
        return this.customContentCardsViewBindingHandler;
    }

    /* access modifiers changed from: protected */
    public final C9096d getDefaultContentCardUpdateHandler() {
        return this.defaultContentCardUpdateHandler;
    }

    /* access modifiers changed from: protected */
    public final C9097e getDefaultContentCardsViewBindingHandler() {
        return this.defaultContentCardsViewBindingHandler;
    }

    /* access modifiers changed from: protected */
    public final C9044d getDefaultEmptyContentCardsAdapter() {
        return this.defaultEmptyContentCardsAdapter;
    }

    /* access modifiers changed from: protected */
    public final RecyclerView.Adapter<?> getEmptyCardsAdapter() {
        return this.defaultEmptyContentCardsAdapter;
    }

    /* access modifiers changed from: protected */
    public final C14054y1 getNetworkUnavailableJob() {
        return this.networkUnavailableJob;
    }

    /* access modifiers changed from: protected */
    public final C2811f<C2815j> getSdkDataWipeEventSubscriber() {
        return this.sdkDataWipeEventSubscriber;
    }

    /* access modifiers changed from: protected */
    public final void handleContentCardsUpdatedEvent(C2807d dVar) {
        C12775o.m28639i(dVar, NotificationCompat.CATEGORY_EVENT);
        C14054y1 unused = C13985j.m32422d(C10606a.f16162b, C13933b1.m32212c(), (C14004n0) null, new C4310f(this, dVar, (C12074d<? super C4310f>) null), 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final void initializeRecyclerView() {
        RecyclerView.ItemAnimator itemAnimator;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        Context requireContext = requireContext();
        C12775o.m28638h(requireContext, "requireContext()");
        C9035c cVar = new C9035c(requireContext, linearLayoutManager, new ArrayList(), getContentCardsViewBindingHandler());
        this.cardAdapter = cVar;
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(cVar);
        }
        RecyclerView recyclerView2 = this.contentCardsRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        attachSwipeHelperCallback();
        RecyclerView recyclerView3 = this.contentCardsRecyclerView;
        if (recyclerView3 == null) {
            itemAnimator = null;
        } else {
            itemAnimator = recyclerView3.getItemAnimator();
        }
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        RecyclerView recyclerView4 = this.contentCardsRecyclerView;
        if (recyclerView4 != null) {
            Context requireContext2 = requireContext();
            C12775o.m28638h(requireContext2, "requireContext()");
            recyclerView4.addItemDecoration(new C9589a(requireContext2));
        }
    }

    /* access modifiers changed from: protected */
    public final Object networkUnavailable(C12074d<? super C11921v> dVar) {
        Context applicationContext;
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, C4311g.f3583g, 6, (Object) null);
        Context context = getContext();
        if (!(context == null || (applicationContext = context.getApplicationContext()) == null)) {
            Toast.makeText(applicationContext, applicationContext.getString(C4193R.string.com_appboy_feed_connection_error_title), 1).show();
        }
        swapRecyclerViewAdapter(getEmptyCardsAdapter());
        SwipeRefreshLayout contentCardsSwipeLayout2 = getContentCardsSwipeLayout();
        if (contentCardsSwipeLayout2 != null) {
            contentCardsSwipeLayout2.setRefreshing(false);
        }
        return C11921v.f18618a;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12775o.m28639i(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C4193R.C4197layout.com_braze_content_cards, viewGroup, false);
        this.contentCardsRecyclerView = (RecyclerView) inflate.findViewById(C4193R.C4196id.com_braze_content_cards_recycler);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C4193R.C4196id.appboy_content_cards_swipe_container);
        this.contentCardsSwipeLayout = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setColorSchemeResources(C4193R.C4194color.com_braze_content_cards_swipe_refresh_color_1, C4193R.C4194color.com_braze_content_cards_swipe_refresh_color_2, C4193R.C4194color.com_braze_content_cards_swipe_refresh_color_3, C4193R.C4194color.com_braze_content_cards_swipe_refresh_color_4);
        }
        return inflate;
    }

    public void onPause() {
        super.onPause();
        C10156b.C10157a aVar = C10156b.f15345m;
        Context requireContext = requireContext();
        C12775o.m28638h(requireContext, "requireContext()");
        aVar.mo44811g(requireContext).mo44781a(this.contentCardsUpdatedSubscriber, C2807d.class);
        Context requireContext2 = requireContext();
        C12775o.m28638h(requireContext2, "requireContext()");
        aVar.mo44811g(requireContext2).mo44781a(this.sdkDataWipeEventSubscriber, C2815j.class);
        C14054y1 y1Var = this.networkUnavailableJob;
        if (y1Var != null) {
            C14054y1.C14055a.m32600a(y1Var, (CancellationException) null, 1, (Object) null);
        }
        this.networkUnavailableJob = null;
        C9035c cVar = this.cardAdapter;
        if (cVar != null) {
            cVar.mo43256k();
        }
    }

    public void onRefresh() {
        C10156b.C10157a aVar = C10156b.f15345m;
        Context requireContext = requireContext();
        C12775o.m28638h(requireContext, "requireContext()");
        aVar.mo44811g(requireContext).mo44791h0(false);
        C10606a.m22557b(C10606a.f16162b, Long.valueOf(AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS), (C12079g) null, new C4312h(this, (C12074d<? super C4312h>) null), 2, (Object) null);
    }

    public void onResume() {
        super.onResume();
        C10156b.C10157a aVar = C10156b.f15345m;
        Context requireContext = requireContext();
        C12775o.m28638h(requireContext, "requireContext()");
        aVar.mo44811g(requireContext).mo44781a(this.contentCardsUpdatedSubscriber, C2807d.class);
        if (this.contentCardsUpdatedSubscriber == null) {
            this.contentCardsUpdatedSubscriber = new C4314a(this);
        }
        C2811f<C2807d> fVar = this.contentCardsUpdatedSubscriber;
        if (fVar != null) {
            Context requireContext2 = requireContext();
            C12775o.m28638h(requireContext2, "requireContext()");
            aVar.mo44811g(requireContext2).mo44806z0(fVar);
        }
        Context requireContext3 = requireContext();
        C12775o.m28638h(requireContext3, "requireContext()");
        aVar.mo44811g(requireContext3).mo44791h0(true);
        Context requireContext4 = requireContext();
        C12775o.m28638h(requireContext4, "requireContext()");
        Class<C2815j> cls = C2815j.class;
        aVar.mo44811g(requireContext4).mo44781a(this.sdkDataWipeEventSubscriber, cls);
        if (this.sdkDataWipeEventSubscriber == null) {
            this.sdkDataWipeEventSubscriber = new C4315b(this);
        }
        C2811f<C2815j> fVar2 = this.sdkDataWipeEventSubscriber;
        if (fVar2 != null) {
            Context requireContext5 = requireContext();
            C12775o.m28638h(requireContext5, "requireContext()");
            aVar.mo44811g(requireContext5).mo44764H(fVar2, cls);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        RecyclerView.LayoutManager layoutManager;
        C12775o.m28639i(bundle, "outState");
        super.onSaveInstanceState(bundle);
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
            bundle.putParcelable(LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY, layoutManager.onSaveInstanceState());
        }
        C9035c cVar = this.cardAdapter;
        if (cVar != null) {
            bundle.putStringArrayList(KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY, new ArrayList(cVar.mo43252g()));
        }
        C9097e eVar = this.customContentCardsViewBindingHandler;
        if (eVar != null) {
            bundle.putParcelable(VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY, eVar);
        }
        C9096d dVar = this.customContentCardUpdateHandler;
        if (dVar != null) {
            bundle.putParcelable(UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY, dVar);
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        C9096d dVar;
        C9097e eVar;
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                dVar = (C9096d) bundle.getParcelable(UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY, C9096d.class);
            } else {
                dVar = (C9096d) bundle.getParcelable(UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY);
            }
            if (dVar != null) {
                setContentCardUpdateHandler(dVar);
            }
            if (i >= 33) {
                eVar = (C9097e) bundle.getParcelable(VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY, C9097e.class);
            } else {
                eVar = (C9097e) bundle.getParcelable(VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY);
            }
            if (eVar != null) {
                setContentCardsViewBindingHandler(eVar);
            }
            C14054y1 unused = C13985j.m32422d(C10606a.f16162b, C13933b1.m32212c(), (C14004n0) null, new C4313i(bundle, this, (C12074d<? super C4313i>) null), 2, (Object) null);
        }
        initializeRecyclerView();
    }

    public final void setContentCardUpdateHandler(C9096d dVar) {
        this.customContentCardUpdateHandler = dVar;
    }

    /* access modifiers changed from: protected */
    public final void setContentCardsRecyclerView(RecyclerView recyclerView) {
        this.contentCardsRecyclerView = recyclerView;
    }

    /* access modifiers changed from: protected */
    public final void setContentCardsSwipeLayout(SwipeRefreshLayout swipeRefreshLayout) {
        this.contentCardsSwipeLayout = swipeRefreshLayout;
    }

    /* access modifiers changed from: protected */
    public final void setContentCardsUpdatedSubscriber(C2811f<C2807d> fVar) {
        this.contentCardsUpdatedSubscriber = fVar;
    }

    public final void setContentCardsViewBindingHandler(C9097e eVar) {
        this.customContentCardsViewBindingHandler = eVar;
    }

    /* access modifiers changed from: protected */
    public final void setCustomContentCardUpdateHandler(C9096d dVar) {
        this.customContentCardUpdateHandler = dVar;
    }

    /* access modifiers changed from: protected */
    public final void setCustomContentCardsViewBindingHandler(C9097e eVar) {
        this.customContentCardsViewBindingHandler = eVar;
    }

    /* access modifiers changed from: protected */
    public final void setDefaultEmptyContentCardsAdapter(C9044d dVar) {
        C12775o.m28639i(dVar, "<set-?>");
        this.defaultEmptyContentCardsAdapter = dVar;
    }

    /* access modifiers changed from: protected */
    public final void setNetworkUnavailableJob(C14054y1 y1Var) {
        this.networkUnavailableJob = y1Var;
    }

    /* access modifiers changed from: protected */
    public final void setSdkDataWipeEventSubscriber(C2811f<C2815j> fVar) {
        this.sdkDataWipeEventSubscriber = fVar;
    }

    /* access modifiers changed from: protected */
    public final void swapRecyclerViewAdapter(RecyclerView.Adapter<?> adapter) {
        C12775o.m28639i(adapter, "newAdapter");
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null && recyclerView.getAdapter() != adapter) {
            recyclerView.setAdapter(adapter);
        }
    }
}
