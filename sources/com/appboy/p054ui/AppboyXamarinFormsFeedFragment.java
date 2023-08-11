package com.appboy.p054ui;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.GestureDetectorCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appboy.enums.CardCategory;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.p054ui.adapters.AppboyListAdapter;
import java.util.ArrayList;
import java.util.EnumSet;
import p031b0.C2811f;
import p126j0.C8266c;
import p270x.C10156b;
import p270x.C10346h;

/* renamed from: com.appboy.ui.AppboyXamarinFormsFeedFragment */
public class AppboyXamarinFormsFeedFragment extends ListFragment implements SwipeRefreshLayout.OnRefreshListener {
    private static final long AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS = 2500;
    private static final int MAX_FEED_TTL_SECONDS = 60;
    private static final int NETWORK_PROBLEM_WARNING_MS = 5000;
    private static final String TAG = C8266c.m16405n(AppboyXamarinFormsFeedFragment.class);
    /* access modifiers changed from: private */
    public int currentCardIndexAtBottomOfScreen;
    /* access modifiers changed from: private */
    public AppboyListAdapter mAdapter;
    private C10346h mBraze;
    private EnumSet<CardCategory> mCategories;
    private LinearLayout mEmptyFeedLayout;
    private RelativeLayout mFeedRootLayout;
    /* access modifiers changed from: private */
    public SwipeRefreshLayout mFeedSwipeLayout;
    private C2811f<FeedUpdatedEvent> mFeedUpdatedSubscriber;
    private GestureDetectorCompat mGestureDetector;
    /* access modifiers changed from: private */
    public ProgressBar mLoadingSpinner;
    private final Handler mMainThreadLooper = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public LinearLayout mNetworkErrorLayout;
    private final Runnable mShowNetworkError = new Runnable() {
        public void run() {
            if (AppboyXamarinFormsFeedFragment.this.mLoadingSpinner != null) {
                AppboyXamarinFormsFeedFragment.this.mLoadingSpinner.setVisibility(8);
            }
            if (AppboyXamarinFormsFeedFragment.this.mNetworkErrorLayout != null) {
                AppboyXamarinFormsFeedFragment.this.mNetworkErrorLayout.setVisibility(0);
            }
        }
    };
    private boolean mSkipCardImpressionsReset;
    private View mTransparentFullBoundsContainerView;
    /* access modifiers changed from: private */
    public int previousVisibleHeadCardIndex;

    /* renamed from: com.appboy.ui.AppboyXamarinFormsFeedFragment$FeedGestureListener */
    public class FeedGestureListener extends GestureDetector.SimpleOnGestureListener {
        public FeedGestureListener() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            long eventTime = (motionEvent2.getEventTime() - motionEvent.getEventTime()) * 2;
            AppboyXamarinFormsFeedFragment.this.getListView().smoothScrollBy(-((int) ((f2 * ((float) eventTime)) / 1000.0f)), (int) (eventTime * 2));
            return true;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            AppboyXamarinFormsFeedFragment.this.getListView().smoothScrollBy((int) f2, 0);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onActivityCreated$0(View view, MotionEvent motionEvent) {
        return this.mGestureDetector.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$onActivityCreated$1(View view, MotionEvent motionEvent) {
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityCreated$2(FeedUpdatedEvent feedUpdatedEvent, ListView listView) {
        String str = TAG;
        C8266c.m16401j(str, "Updating feed views in response to FeedUpdatedEvent: " + feedUpdatedEvent);
        this.mMainThreadLooper.removeCallbacks(this.mShowNetworkError);
        this.mNetworkErrorLayout.setVisibility(8);
        if (feedUpdatedEvent.getCardCount(this.mCategories) == 0) {
            listView.setVisibility(8);
            this.mAdapter.clear();
        } else {
            this.mEmptyFeedLayout.setVisibility(8);
            this.mLoadingSpinner.setVisibility(8);
            this.mTransparentFullBoundsContainerView.setVisibility(8);
        }
        if (feedUpdatedEvent.isFromOfflineStorage() && (feedUpdatedEvent.lastUpdatedInSecondsFromEpoch() + 60) * 1000 < System.currentTimeMillis()) {
            C8266c.m16406p(str, "Feed received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.");
            this.mBraze.mo44783b();
            if (feedUpdatedEvent.getCardCount(this.mCategories) == 0) {
                C8266c.m16401j(str, "Old feed was empty, putting up a network spinner and registering the network error message on a delay of 5000ms.");
                this.mEmptyFeedLayout.setVisibility(8);
                this.mLoadingSpinner.setVisibility(0);
                this.mTransparentFullBoundsContainerView.setVisibility(0);
                this.mMainThreadLooper.postDelayed(this.mShowNetworkError, 5000);
                return;
            }
        }
        if (feedUpdatedEvent.getCardCount(this.mCategories) == 0) {
            this.mLoadingSpinner.setVisibility(8);
            this.mEmptyFeedLayout.setVisibility(0);
            this.mTransparentFullBoundsContainerView.setVisibility(0);
        } else {
            this.mAdapter.replaceFeed(feedUpdatedEvent.getFeedCards(this.mCategories));
            listView.setVisibility(0);
        }
        this.mFeedSwipeLayout.setRefreshing(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityCreated$3(ListView listView, FeedUpdatedEvent feedUpdatedEvent) {
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new C4211k(this, feedUpdatedEvent, listView));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onRefresh$4() {
        this.mFeedSwipeLayout.setRefreshing(false);
    }

    private void setOnScreenCardsToRead() {
        this.mAdapter.batchSetCardsToRead(this.previousVisibleHeadCardIndex, this.currentCardIndexAtBottomOfScreen);
    }

    public EnumSet<CardCategory> getCategories() {
        return this.mCategories;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.mSkipCardImpressionsReset) {
            this.mSkipCardImpressionsReset = false;
        } else {
            this.mAdapter.resetCardImpressionTracker();
            C8266c.m16401j(TAG, "Resetting card impressions.");
        }
        LayoutInflater from = LayoutInflater.from(getActivity());
        ListView listView = getListView();
        listView.addHeaderView(from.inflate(C4193R.C4197layout.com_appboy_feed_header, (ViewGroup) null));
        listView.addFooterView(from.inflate(C4193R.C4197layout.com_appboy_feed_footer, (ViewGroup) null));
        this.mFeedRootLayout.setOnTouchListener(new C4208h(this));
        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                boolean z;
                SwipeRefreshLayout access$200 = AppboyXamarinFormsFeedFragment.this.mFeedSwipeLayout;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                access$200.setEnabled(z);
                if (i2 != 0) {
                    int i4 = i - 1;
                    if (i4 > AppboyXamarinFormsFeedFragment.this.previousVisibleHeadCardIndex) {
                        AppboyXamarinFormsFeedFragment.this.mAdapter.batchSetCardsToRead(AppboyXamarinFormsFeedFragment.this.previousVisibleHeadCardIndex, i4);
                    }
                    int unused = AppboyXamarinFormsFeedFragment.this.previousVisibleHeadCardIndex = i4;
                    int unused2 = AppboyXamarinFormsFeedFragment.this.currentCardIndexAtBottomOfScreen = i + i2;
                }
            }

            public void onScrollStateChanged(AbsListView absListView, int i) {
            }
        });
        this.mTransparentFullBoundsContainerView.setOnTouchListener(new C4209i());
        this.mBraze.mo44781a(this.mFeedUpdatedSubscriber, FeedUpdatedEvent.class);
        C4210j jVar = new C4210j(this, listView);
        this.mFeedUpdatedSubscriber = jVar;
        this.mBraze.mo44785c(jVar);
        listView.setAdapter(this.mAdapter);
        this.mBraze.mo44787d();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.mBraze = C10156b.m21418Q(context);
        if (this.mAdapter == null) {
            this.mAdapter = new AppboyListAdapter(context, C4193R.C4196id.tag, new ArrayList());
            this.mCategories = CardCategory.getAllCategories();
        }
        setRetainInstance(true);
        this.mGestureDetector = new GestureDetectorCompat(context, new FeedGestureListener());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C4193R.C4197layout.com_appboy_feed, viewGroup, false);
        this.mNetworkErrorLayout = (LinearLayout) inflate.findViewById(C4193R.C4196id.com_appboy_feed_network_error);
        this.mLoadingSpinner = (ProgressBar) inflate.findViewById(C4193R.C4196id.com_appboy_feed_loading_spinner);
        this.mEmptyFeedLayout = (LinearLayout) inflate.findViewById(C4193R.C4196id.com_appboy_feed_empty_feed);
        this.mFeedRootLayout = (RelativeLayout) inflate.findViewById(C4193R.C4196id.com_appboy_feed_root);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C4193R.C4196id.appboy_feed_swipe_container);
        this.mFeedSwipeLayout = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        this.mFeedSwipeLayout.setEnabled(false);
        this.mFeedSwipeLayout.setColorSchemeResources(C4193R.C4194color.com_appboy_newsfeed_swipe_refresh_color_1, C4193R.C4194color.com_appboy_newsfeed_swipe_refresh_color_2, C4193R.C4194color.com_appboy_newsfeed_swipe_refresh_color_3, C4193R.C4194color.com_appboy_newsfeed_swipe_refresh_color_4);
        this.mTransparentFullBoundsContainerView = inflate.findViewById(C4193R.C4196id.com_appboy_feed_transparent_full_bounds_container_view);
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.mBraze.mo44781a(this.mFeedUpdatedSubscriber, FeedUpdatedEvent.class);
        setOnScreenCardsToRead();
    }

    public void onDetach() {
        super.onDetach();
        setListAdapter((ListAdapter) null);
    }

    public void onPause() {
        super.onPause();
        setOnScreenCardsToRead();
    }

    public void onRefresh() {
        this.mBraze.mo44783b();
        this.mMainThreadLooper.postDelayed(new C4207g(this), AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS);
    }

    public void onResume() {
        super.onResume();
        C10156b.m21418Q(getActivity()).mo44777W();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (isVisible()) {
            this.mSkipCardImpressionsReset = true;
        }
    }

    public void setCategories(EnumSet<CardCategory> enumSet) {
        if (enumSet == null) {
            C8266c.m16406p(TAG, "The categories passed into setCategories are null, AppboyFeedFragment is going to display all the cards in cache.");
            this.mCategories = CardCategory.getAllCategories();
        } else if (enumSet.isEmpty()) {
            C8266c.m16416z(TAG, "The categories set had no elements and have been ignored. Please pass a valid EnumSet of CardCategory.");
            return;
        } else if (!enumSet.equals(this.mCategories)) {
            this.mCategories = enumSet;
        } else {
            return;
        }
        C10346h hVar = this.mBraze;
        if (hVar != null) {
            hVar.mo44787d();
        }
    }

    public void setCategory(CardCategory cardCategory) {
        setCategories(EnumSet.of(cardCategory));
    }
}
