package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatDialog;
import androidx.mediarouter.C2410R;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class MediaRouteDynamicChooserDialog extends AppCompatDialog {
    private static final int ITEM_TYPE_HEADER = 1;
    private static final int ITEM_TYPE_NONE = 0;
    private static final int ITEM_TYPE_ROUTE = 2;
    private static final int MSG_UPDATE_ROUTES = 1;
    private static final String TAG = "MediaRouteChooserDialog";
    private RecyclerAdapter mAdapter;
    private boolean mAttachedToWindow;
    private final MediaRouterCallback mCallback;
    private ImageButton mCloseButton;
    Context mContext;
    private final Handler mHandler;
    private long mLastUpdateTime;
    private RecyclerView mRecyclerView;
    final MediaRouter mRouter;
    List<MediaRouter.RouteInfo> mRoutes;
    MediaRouter.RouteInfo mSelectingRoute;
    private MediaRouteSelector mSelector;
    private long mUpdateRoutesDelayMs;

    private final class MediaRouterCallback extends MediaRouter.Callback {
        MediaRouterCallback() {
        }

        public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteDynamicChooserDialog.this.refreshRoutes();
        }

        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteDynamicChooserDialog.this.refreshRoutes();
        }

        public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteDynamicChooserDialog.this.refreshRoutes();
        }

        public void onRouteSelected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteDynamicChooserDialog.this.dismiss();
        }
    }

    private final class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private static final String TAG = "RecyclerAdapter";
        private final Drawable mDefaultIcon;
        private final LayoutInflater mInflater;
        private final ArrayList<Item> mItems = new ArrayList<>();
        private final Drawable mSpeakerGroupIcon;
        private final Drawable mSpeakerIcon;
        private final Drawable mTvIcon;

        private class HeaderViewHolder extends RecyclerView.ViewHolder {
            TextView mTextView;

            HeaderViewHolder(View view) {
                super(view);
                this.mTextView = (TextView) view.findViewById(C2410R.C2413id.mr_picker_header_name);
            }

            public void bindHeaderView(Item item) {
                this.mTextView.setText(item.getData().toString());
            }
        }

        private class Item {
            private final Object mData;
            private final int mType;

            Item(Object obj) {
                this.mData = obj;
                if (obj instanceof String) {
                    this.mType = 1;
                } else if (obj instanceof MediaRouter.RouteInfo) {
                    this.mType = 2;
                } else {
                    this.mType = 0;
                    Log.w(RecyclerAdapter.TAG, "Wrong type of data passed to Item constructor");
                }
            }

            public Object getData() {
                return this.mData;
            }

            public int getType() {
                return this.mType;
            }
        }

        private class RouteViewHolder extends RecyclerView.ViewHolder {
            final ImageView mImageView;
            final View mItemView;
            final ProgressBar mProgressBar;
            final TextView mTextView;

            RouteViewHolder(View view) {
                super(view);
                this.mItemView = view;
                this.mImageView = (ImageView) view.findViewById(C2410R.C2413id.mr_picker_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(C2410R.C2413id.mr_picker_route_progress_bar);
                this.mProgressBar = progressBar;
                this.mTextView = (TextView) view.findViewById(C2410R.C2413id.mr_picker_route_name);
                MediaRouterThemeHelper.setIndeterminateProgressBarColor(MediaRouteDynamicChooserDialog.this.mContext, progressBar);
            }

            public void bindRouteView(Item item) {
                final MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) item.getData();
                this.mItemView.setVisibility(0);
                this.mProgressBar.setVisibility(4);
                this.mItemView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        MediaRouteDynamicChooserDialog mediaRouteDynamicChooserDialog = MediaRouteDynamicChooserDialog.this;
                        MediaRouter.RouteInfo routeInfo = routeInfo;
                        mediaRouteDynamicChooserDialog.mSelectingRoute = routeInfo;
                        routeInfo.select();
                        RouteViewHolder.this.mImageView.setVisibility(4);
                        RouteViewHolder.this.mProgressBar.setVisibility(0);
                    }
                });
                this.mTextView.setText(routeInfo.getName());
                this.mImageView.setImageDrawable(RecyclerAdapter.this.getIconDrawable(routeInfo));
            }
        }

        RecyclerAdapter() {
            this.mInflater = LayoutInflater.from(MediaRouteDynamicChooserDialog.this.mContext);
            this.mDefaultIcon = MediaRouterThemeHelper.getDefaultDrawableIcon(MediaRouteDynamicChooserDialog.this.mContext);
            this.mTvIcon = MediaRouterThemeHelper.getTvDrawableIcon(MediaRouteDynamicChooserDialog.this.mContext);
            this.mSpeakerIcon = MediaRouterThemeHelper.getSpeakerDrawableIcon(MediaRouteDynamicChooserDialog.this.mContext);
            this.mSpeakerGroupIcon = MediaRouterThemeHelper.getSpeakerGroupDrawableIcon(MediaRouteDynamicChooserDialog.this.mContext);
            rebuildItems();
        }

        private Drawable getDefaultIconDrawable(MediaRouter.RouteInfo routeInfo) {
            int deviceType = routeInfo.getDeviceType();
            if (deviceType == 1) {
                return this.mTvIcon;
            }
            if (deviceType == 2) {
                return this.mSpeakerIcon;
            }
            if (routeInfo.isGroup()) {
                return this.mSpeakerGroupIcon;
            }
            return this.mDefaultIcon;
        }

        /* access modifiers changed from: package-private */
        public Drawable getIconDrawable(MediaRouter.RouteInfo routeInfo) {
            Uri iconUri = routeInfo.getIconUri();
            if (iconUri != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(MediaRouteDynamicChooserDialog.this.mContext.getContentResolver().openInputStream(iconUri), (String) null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e) {
                    Log.w(TAG, "Failed to load " + iconUri, e);
                }
            }
            return getDefaultIconDrawable(routeInfo);
        }

        public Item getItem(int i) {
            return this.mItems.get(i);
        }

        public int getItemCount() {
            return this.mItems.size();
        }

        public int getItemViewType(int i) {
            return this.mItems.get(i).getType();
        }

        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = getItemViewType(i);
            Item item = getItem(i);
            if (itemViewType == 1) {
                ((HeaderViewHolder) viewHolder).bindHeaderView(item);
            } else if (itemViewType != 2) {
                Log.w(TAG, "Cannot bind item to ViewHolder because of wrong view type");
            } else {
                ((RouteViewHolder) viewHolder).bindRouteView(item);
            }
        }

        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new HeaderViewHolder(this.mInflater.inflate(C2410R.C2415layout.mr_picker_header_item, viewGroup, false));
            }
            if (i == 2) {
                return new RouteViewHolder(this.mInflater.inflate(C2410R.C2415layout.mr_picker_route_item, viewGroup, false));
            }
            Log.w(TAG, "Cannot create ViewHolder because of wrong view type");
            return null;
        }

        /* access modifiers changed from: package-private */
        public void rebuildItems() {
            this.mItems.clear();
            this.mItems.add(new Item(MediaRouteDynamicChooserDialog.this.mContext.getString(C2410R.string.mr_chooser_title)));
            for (MediaRouter.RouteInfo item : MediaRouteDynamicChooserDialog.this.mRoutes) {
                this.mItems.add(new Item(item));
            }
            notifyDataSetChanged();
        }
    }

    static final class RouteComparator implements Comparator<MediaRouter.RouteInfo> {
        public static final RouteComparator sInstance = new RouteComparator();

        RouteComparator() {
        }

        public int compare(MediaRouter.RouteInfo routeInfo, MediaRouter.RouteInfo routeInfo2) {
            return routeInfo.getName().compareToIgnoreCase(routeInfo2.getName());
        }
    }

    public MediaRouteDynamicChooserDialog(@NonNull Context context) {
        this(context, 0);
    }

    @NonNull
    public MediaRouteSelector getRouteSelector() {
        return this.mSelector;
    }

    @CallSuper
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        this.mRouter.addCallback(this.mSelector, this.mCallback, 1);
        refreshRoutes();
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2410R.C2415layout.mr_picker_dialog);
        MediaRouterThemeHelper.setDialogBackgroundColor(this.mContext, this);
        this.mRoutes = new ArrayList();
        ImageButton imageButton = (ImageButton) findViewById(C2410R.C2413id.mr_picker_close_button);
        this.mCloseButton = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MediaRouteDynamicChooserDialog.this.dismiss();
            }
        });
        this.mAdapter = new RecyclerAdapter();
        RecyclerView recyclerView = (RecyclerView) findViewById(C2410R.C2413id.mr_picker_list);
        this.mRecyclerView = recyclerView;
        recyclerView.setAdapter(this.mAdapter);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        updateLayout();
    }

    @CallSuper
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mAttachedToWindow = false;
        this.mRouter.removeCallback(this.mCallback);
        this.mHandler.removeMessages(1);
    }

    public boolean onFilterRoute(@NonNull MediaRouter.RouteInfo routeInfo) {
        if (routeInfo.isDefaultOrBluetooth() || !routeInfo.isEnabled() || !routeInfo.matchesSelector(this.mSelector)) {
            return false;
        }
        return true;
    }

    public void onFilterRoutes(@NonNull List<MediaRouter.RouteInfo> list) {
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size > 0) {
                if (!onFilterRoute(list.get(i))) {
                    list.remove(i);
                }
                size = i;
            } else {
                return;
            }
        }
    }

    public void refreshRoutes() {
        if (this.mSelectingRoute == null && this.mAttachedToWindow) {
            ArrayList arrayList = new ArrayList(this.mRouter.getRoutes());
            onFilterRoutes(arrayList);
            Collections.sort(arrayList, RouteComparator.sInstance);
            if (SystemClock.uptimeMillis() - this.mLastUpdateTime >= this.mUpdateRoutesDelayMs) {
                updateRoutes(arrayList);
                return;
            }
            this.mHandler.removeMessages(1);
            Handler handler = this.mHandler;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.mLastUpdateTime + this.mUpdateRoutesDelayMs);
        }
    }

    public void setRouteSelector(@NonNull MediaRouteSelector mediaRouteSelector) {
        if (mediaRouteSelector == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.mSelector.equals(mediaRouteSelector)) {
            this.mSelector = mediaRouteSelector;
            if (this.mAttachedToWindow) {
                this.mRouter.removeCallback(this.mCallback);
                this.mRouter.addCallback(mediaRouteSelector, this.mCallback, 1);
            }
            refreshRoutes();
        }
    }

    /* access modifiers changed from: package-private */
    public void updateLayout() {
        getWindow().setLayout(MediaRouteDialogHelper.getDialogWidthForDynamicGroup(this.mContext), MediaRouteDialogHelper.getDialogHeight(this.mContext));
    }

    /* access modifiers changed from: package-private */
    public void updateRoutes(List<MediaRouter.RouteInfo> list) {
        this.mLastUpdateTime = SystemClock.uptimeMillis();
        this.mRoutes.clear();
        this.mRoutes.addAll(list);
        this.mAdapter.rebuildItems();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaRouteDynamicChooserDialog(@androidx.annotation.NonNull android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = androidx.mediarouter.app.MediaRouterThemeHelper.createThemedDialogContext(r2, r3, r0)
            int r3 = androidx.mediarouter.app.MediaRouterThemeHelper.createThemedDialogStyle(r2)
            r1.<init>(r2, r3)
            androidx.mediarouter.media.MediaRouteSelector r2 = androidx.mediarouter.media.MediaRouteSelector.EMPTY
            r1.mSelector = r2
            androidx.mediarouter.app.MediaRouteDynamicChooserDialog$1 r2 = new androidx.mediarouter.app.MediaRouteDynamicChooserDialog$1
            r2.<init>()
            r1.mHandler = r2
            android.content.Context r2 = r1.getContext()
            androidx.mediarouter.media.MediaRouter r3 = androidx.mediarouter.media.MediaRouter.getInstance(r2)
            r1.mRouter = r3
            androidx.mediarouter.app.MediaRouteDynamicChooserDialog$MediaRouterCallback r3 = new androidx.mediarouter.app.MediaRouteDynamicChooserDialog$MediaRouterCallback
            r3.<init>()
            r1.mCallback = r3
            r1.mContext = r2
            android.content.res.Resources r2 = r2.getResources()
            int r3 = androidx.mediarouter.C2410R.integer.mr_update_routes_delay_ms
            int r2 = r2.getInteger(r3)
            long r2 = (long) r2
            r1.mUpdateRoutesDelayMs = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteDynamicChooserDialog.<init>(android.content.Context, int):void");
    }
}
