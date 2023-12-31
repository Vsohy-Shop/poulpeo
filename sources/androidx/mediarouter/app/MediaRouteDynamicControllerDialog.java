package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.p001v4.media.MediaDescriptionCompat;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.MediaControllerCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.util.ObjectsCompat;
import androidx.mediarouter.C2410R;
import androidx.mediarouter.media.MediaRouteProvider;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class MediaRouteDynamicControllerDialog extends AppCompatDialog {
    private static final int BLUR_RADIUS = 10;
    private static final int COLOR_WHITE_ON_DARK_BACKGROUND = -1;
    private static final int CONNECTION_TIMEOUT_MS = 30000;
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private static final int MIN_UNMUTED_VOLUME = 1;
    private static final int MSG_UPDATE_ROUTES_VIEW = 1;
    private static final int MSG_UPDATE_ROUTE_VOLUME_BY_USER = 2;
    private static final int MUTED_VOLUME = 0;
    private static final String TAG = "MediaRouteCtrlDialog";
    private static final int UPDATE_ROUTES_VIEW_DELAY_MS = 300;
    private static final int UPDATE_VOLUME_DELAY_MS = 500;
    RecyclerAdapter mAdapter;
    int mArtIconBackgroundColor;
    Bitmap mArtIconBitmap;
    boolean mArtIconIsLoaded;
    Bitmap mArtIconLoadedBitmap;
    Uri mArtIconUri;
    ImageView mArtView;
    private boolean mAttachedToWindow;
    private final MediaRouterCallback mCallback;
    private ImageButton mCloseButton;
    Context mContext;
    MediaControllerCallback mControllerCallback;
    private boolean mCreated;
    MediaDescriptionCompat mDescription;
    final boolean mEnableGroupVolumeUX;
    FetchArtTask mFetchArtTask;
    final List<MediaRouter.RouteInfo> mGroupableRoutes;
    final Handler mHandler;
    boolean mIsAnimatingVolumeSliderLayout;
    boolean mIsSelectingRoute;
    private long mLastUpdateTime;
    MediaControllerCompat mMediaController;
    final List<MediaRouter.RouteInfo> mMemberRoutes;
    private ImageView mMetadataBackground;
    private View mMetadataBlackScrim;
    RecyclerView mRecyclerView;
    MediaRouter.RouteInfo mRouteForVolumeUpdatingByUser;
    final MediaRouter mRouter;
    MediaRouter.RouteInfo mSelectedRoute;
    private MediaRouteSelector mSelector;
    private Button mStopCastingButton;
    private TextView mSubtitleView;
    private String mTitlePlaceholder;
    private TextView mTitleView;
    final List<MediaRouter.RouteInfo> mTransferableRoutes;
    final List<MediaRouter.RouteInfo> mUngroupableRoutes;
    Map<String, Integer> mUnmutedVolumeMap;
    private boolean mUpdateMetadataViewsDeferred;
    private boolean mUpdateRoutesViewDeferred;
    VolumeChangeListener mVolumeChangeListener;
    Map<String, MediaRouteVolumeSliderHolder> mVolumeSliderHolderMap;

    private class FetchArtTask extends AsyncTask<Void, Void, Bitmap> {
        private int mBackgroundColor;
        private final Bitmap mIconBitmap;
        private final Uri mIconUri;

        FetchArtTask() {
            Bitmap bitmap;
            MediaDescriptionCompat mediaDescriptionCompat = MediaRouteDynamicControllerDialog.this.mDescription;
            Uri uri = null;
            if (mediaDescriptionCompat == null) {
                bitmap = null;
            } else {
                bitmap = mediaDescriptionCompat.mo93b();
            }
            if (MediaRouteDynamicControllerDialog.isBitmapRecycled(bitmap)) {
                Log.w(MediaRouteDynamicControllerDialog.TAG, "Can't fetch the given art bitmap because it's already recycled.");
                bitmap = null;
            }
            this.mIconBitmap = bitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = MediaRouteDynamicControllerDialog.this.mDescription;
            this.mIconUri = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.mo94c() : uri;
        }

        private InputStream openInputStreamByScheme(Uri uri) {
            InputStream inputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                inputStream = MediaRouteDynamicControllerDialog.this.mContext.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                openConnection.setConnectTimeout(MediaRouteDynamicControllerDialog.CONNECTION_TIMEOUT_MS);
                openConnection.setReadTimeout(MediaRouteDynamicControllerDialog.CONNECTION_TIMEOUT_MS);
                inputStream = openConnection.getInputStream();
            }
            if (inputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStream);
        }

        /* access modifiers changed from: package-private */
        public Bitmap getIconBitmap() {
            return this.mIconBitmap;
        }

        /* access modifiers changed from: package-private */
        public Uri getIconUri() {
            return this.mIconUri;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            MediaRouteDynamicControllerDialog.this.clearLoadedBitmap();
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0048 */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0053 A[Catch:{ IOException -> 0x00a1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00bd A[SYNTHETIC, Splitter:B:54:0x00bd] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00c5 A[SYNTHETIC, Splitter:B:59:0x00c5] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x00e5 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Bitmap doInBackground(java.lang.Void... r9) {
            /*
                r8 = this;
                java.lang.String r9 = "Unable to open: "
                android.graphics.Bitmap r0 = r8.mIconBitmap
                r1 = 0
                r2 = 1
                java.lang.String r3 = "MediaRouteCtrlDialog"
                r4 = 0
                if (r0 == 0) goto L_0x000d
                goto L_0x00ca
            L_0x000d:
                android.net.Uri r0 = r8.mIconUri
                if (r0 == 0) goto L_0x00c9
                java.io.InputStream r0 = r8.openInputStreamByScheme(r0)     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
                if (r0 != 0) goto L_0x0031
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a1 }
                r5.<init>()     // Catch:{ IOException -> 0x00a1 }
                r5.append(r9)     // Catch:{ IOException -> 0x00a1 }
                android.net.Uri r6 = r8.mIconUri     // Catch:{ IOException -> 0x00a1 }
                r5.append(r6)     // Catch:{ IOException -> 0x00a1 }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x00a1 }
                android.util.Log.w(r3, r5)     // Catch:{ IOException -> 0x00a1 }
                if (r0 == 0) goto L_0x0030
                r0.close()     // Catch:{ IOException -> 0x0030 }
            L_0x0030:
                return r4
            L_0x0031:
                android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x00a1 }
                r5.<init>()     // Catch:{ IOException -> 0x00a1 }
                r5.inJustDecodeBounds = r2     // Catch:{ IOException -> 0x00a1 }
                android.graphics.BitmapFactory.decodeStream(r0, r4, r5)     // Catch:{ IOException -> 0x00a1 }
                int r6 = r5.outWidth     // Catch:{ IOException -> 0x00a1 }
                if (r6 == 0) goto L_0x009d
                int r6 = r5.outHeight     // Catch:{ IOException -> 0x00a1 }
                if (r6 != 0) goto L_0x0044
                goto L_0x009d
            L_0x0044:
                r0.reset()     // Catch:{ IOException -> 0x0048 }
                goto L_0x006d
            L_0x0048:
                r0.close()     // Catch:{ IOException -> 0x00a1 }
                android.net.Uri r6 = r8.mIconUri     // Catch:{ IOException -> 0x00a1 }
                java.io.InputStream r0 = r8.openInputStreamByScheme(r6)     // Catch:{ IOException -> 0x00a1 }
                if (r0 != 0) goto L_0x006d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a1 }
                r5.<init>()     // Catch:{ IOException -> 0x00a1 }
                r5.append(r9)     // Catch:{ IOException -> 0x00a1 }
                android.net.Uri r6 = r8.mIconUri     // Catch:{ IOException -> 0x00a1 }
                r5.append(r6)     // Catch:{ IOException -> 0x00a1 }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x00a1 }
                android.util.Log.w(r3, r5)     // Catch:{ IOException -> 0x00a1 }
                if (r0 == 0) goto L_0x006c
                r0.close()     // Catch:{ IOException -> 0x006c }
            L_0x006c:
                return r4
            L_0x006d:
                r5.inJustDecodeBounds = r1     // Catch:{ IOException -> 0x00a1 }
                androidx.mediarouter.app.MediaRouteDynamicControllerDialog r6 = androidx.mediarouter.app.MediaRouteDynamicControllerDialog.this     // Catch:{ IOException -> 0x00a1 }
                android.content.Context r6 = r6.mContext     // Catch:{ IOException -> 0x00a1 }
                android.content.res.Resources r6 = r6.getResources()     // Catch:{ IOException -> 0x00a1 }
                int r7 = androidx.mediarouter.C2410R.dimen.mr_cast_meta_art_size     // Catch:{ IOException -> 0x00a1 }
                int r6 = r6.getDimensionPixelSize(r7)     // Catch:{ IOException -> 0x00a1 }
                int r7 = r5.outHeight     // Catch:{ IOException -> 0x00a1 }
                int r7 = r7 / r6
                int r6 = java.lang.Integer.highestOneBit(r7)     // Catch:{ IOException -> 0x00a1 }
                int r6 = java.lang.Math.max(r2, r6)     // Catch:{ IOException -> 0x00a1 }
                r5.inSampleSize = r6     // Catch:{ IOException -> 0x00a1 }
                boolean r6 = r8.isCancelled()     // Catch:{ IOException -> 0x00a1 }
                if (r6 == 0) goto L_0x0094
                r0.close()     // Catch:{ IOException -> 0x0093 }
            L_0x0093:
                return r4
            L_0x0094:
                android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r0, r4, r5)     // Catch:{ IOException -> 0x00a1 }
                r0.close()     // Catch:{ IOException -> 0x009b }
            L_0x009b:
                r0 = r9
                goto L_0x00ca
            L_0x009d:
                r0.close()     // Catch:{ IOException -> 0x00a0 }
            L_0x00a0:
                return r4
            L_0x00a1:
                r5 = move-exception
                goto L_0x00a7
            L_0x00a3:
                r9 = move-exception
                goto L_0x00c3
            L_0x00a5:
                r5 = move-exception
                r0 = r4
            L_0x00a7:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
                r6.<init>()     // Catch:{ all -> 0x00c1 }
                r6.append(r9)     // Catch:{ all -> 0x00c1 }
                android.net.Uri r9 = r8.mIconUri     // Catch:{ all -> 0x00c1 }
                r6.append(r9)     // Catch:{ all -> 0x00c1 }
                java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x00c1 }
                android.util.Log.w(r3, r9, r5)     // Catch:{ all -> 0x00c1 }
                if (r0 == 0) goto L_0x00c9
                r0.close()     // Catch:{ IOException -> 0x00c9 }
                goto L_0x00c9
            L_0x00c1:
                r9 = move-exception
                r4 = r0
            L_0x00c3:
                if (r4 == 0) goto L_0x00c8
                r4.close()     // Catch:{ IOException -> 0x00c8 }
            L_0x00c8:
                throw r9
            L_0x00c9:
                r0 = r4
            L_0x00ca:
                boolean r9 = androidx.mediarouter.app.MediaRouteDynamicControllerDialog.isBitmapRecycled(r0)
                if (r9 == 0) goto L_0x00e5
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r1 = "Can't use recycled bitmap: "
                r9.append(r1)
                r9.append(r0)
                java.lang.String r9 = r9.toString()
                android.util.Log.w(r3, r9)
                return r4
            L_0x00e5:
                if (r0 == 0) goto L_0x0119
                int r9 = r0.getWidth()
                int r3 = r0.getHeight()
                if (r9 >= r3) goto L_0x0119
                androidx.palette.graphics.Palette$Builder r9 = new androidx.palette.graphics.Palette$Builder
                r9.<init>((android.graphics.Bitmap) r0)
                androidx.palette.graphics.Palette$Builder r9 = r9.maximumColorCount(r2)
                androidx.palette.graphics.Palette r9 = r9.generate()
                java.util.List r2 = r9.getSwatches()
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x0109
                goto L_0x0117
            L_0x0109:
                java.util.List r9 = r9.getSwatches()
                java.lang.Object r9 = r9.get(r1)
                androidx.palette.graphics.Palette$Swatch r9 = (androidx.palette.graphics.Palette.Swatch) r9
                int r1 = r9.getRgb()
            L_0x0117:
                r8.mBackgroundColor = r1
            L_0x0119:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteDynamicControllerDialog.FetchArtTask.doInBackground(java.lang.Void[]):android.graphics.Bitmap");
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Bitmap bitmap) {
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            mediaRouteDynamicControllerDialog.mFetchArtTask = null;
            if (!ObjectsCompat.equals(mediaRouteDynamicControllerDialog.mArtIconBitmap, this.mIconBitmap) || !ObjectsCompat.equals(MediaRouteDynamicControllerDialog.this.mArtIconUri, this.mIconUri)) {
                MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog2 = MediaRouteDynamicControllerDialog.this;
                mediaRouteDynamicControllerDialog2.mArtIconBitmap = this.mIconBitmap;
                mediaRouteDynamicControllerDialog2.mArtIconLoadedBitmap = bitmap;
                mediaRouteDynamicControllerDialog2.mArtIconUri = this.mIconUri;
                mediaRouteDynamicControllerDialog2.mArtIconBackgroundColor = this.mBackgroundColor;
                mediaRouteDynamicControllerDialog2.mArtIconIsLoaded = true;
                mediaRouteDynamicControllerDialog2.updateMetadataViews();
            }
        }
    }

    private final class MediaControllerCallback extends MediaControllerCompat.C0047a {
        MediaControllerCallback() {
        }

        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            MediaDescriptionCompat mediaDescriptionCompat;
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            if (mediaMetadataCompat == null) {
                mediaDescriptionCompat = null;
            } else {
                mediaDescriptionCompat = mediaMetadataCompat.mo117d();
            }
            mediaRouteDynamicControllerDialog.mDescription = mediaDescriptionCompat;
            MediaRouteDynamicControllerDialog.this.reloadIconIfNeeded();
            MediaRouteDynamicControllerDialog.this.updateMetadataViews();
        }

        public void onSessionDestroyed() {
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            MediaControllerCompat mediaControllerCompat = mediaRouteDynamicControllerDialog.mMediaController;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.mo147i(mediaRouteDynamicControllerDialog.mControllerCallback);
                MediaRouteDynamicControllerDialog.this.mMediaController = null;
            }
        }
    }

    private abstract class MediaRouteVolumeSliderHolder extends RecyclerView.ViewHolder {
        final ImageButton mMuteButton;
        MediaRouter.RouteInfo mRoute;
        final MediaRouteVolumeSlider mVolumeSlider;

        MediaRouteVolumeSliderHolder(View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
            super(view);
            this.mMuteButton = imageButton;
            this.mVolumeSlider = mediaRouteVolumeSlider;
            imageButton.setImageDrawable(MediaRouterThemeHelper.getMuteButtonDrawableIcon(MediaRouteDynamicControllerDialog.this.mContext));
            MediaRouterThemeHelper.setVolumeSliderColor(MediaRouteDynamicControllerDialog.this.mContext, mediaRouteVolumeSlider);
        }

        /* access modifiers changed from: package-private */
        @CallSuper
        public void bindRouteVolumeSliderHolder(MediaRouter.RouteInfo routeInfo) {
            boolean z;
            this.mRoute = routeInfo;
            int volume = routeInfo.getVolume();
            if (volume == 0) {
                z = true;
            } else {
                z = false;
            }
            this.mMuteButton.setActivated(z);
            this.mMuteButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    int i;
                    MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
                    if (mediaRouteDynamicControllerDialog.mRouteForVolumeUpdatingByUser != null) {
                        mediaRouteDynamicControllerDialog.mHandler.removeMessages(2);
                    }
                    MediaRouteVolumeSliderHolder mediaRouteVolumeSliderHolder = MediaRouteVolumeSliderHolder.this;
                    MediaRouteDynamicControllerDialog.this.mRouteForVolumeUpdatingByUser = mediaRouteVolumeSliderHolder.mRoute;
                    boolean z = !view.isActivated();
                    if (z) {
                        i = 0;
                    } else {
                        i = MediaRouteVolumeSliderHolder.this.getUnmutedVolume();
                    }
                    MediaRouteVolumeSliderHolder.this.setMute(z);
                    MediaRouteVolumeSliderHolder.this.mVolumeSlider.setProgress(i);
                    MediaRouteVolumeSliderHolder.this.mRoute.requestSetVolume(i);
                    MediaRouteDynamicControllerDialog.this.mHandler.sendEmptyMessageDelayed(2, 500);
                }
            });
            this.mVolumeSlider.setTag(this.mRoute);
            this.mVolumeSlider.setMax(routeInfo.getVolumeMax());
            this.mVolumeSlider.setProgress(volume);
            this.mVolumeSlider.setOnSeekBarChangeListener(MediaRouteDynamicControllerDialog.this.mVolumeChangeListener);
        }

        /* access modifiers changed from: package-private */
        public int getUnmutedVolume() {
            Integer num = MediaRouteDynamicControllerDialog.this.mUnmutedVolumeMap.get(this.mRoute.getId());
            if (num == null) {
                return 1;
            }
            return Math.max(1, num.intValue());
        }

        /* access modifiers changed from: package-private */
        public void setMute(boolean z) {
            if (this.mMuteButton.isActivated() != z) {
                this.mMuteButton.setActivated(z);
                if (z) {
                    MediaRouteDynamicControllerDialog.this.mUnmutedVolumeMap.put(this.mRoute.getId(), Integer.valueOf(this.mVolumeSlider.getProgress()));
                } else {
                    MediaRouteDynamicControllerDialog.this.mUnmutedVolumeMap.remove(this.mRoute.getId());
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void updateVolume() {
            boolean z;
            int volume = this.mRoute.getVolume();
            if (volume == 0) {
                z = true;
            } else {
                z = false;
            }
            setMute(z);
            this.mVolumeSlider.setProgress(volume);
        }
    }

    private final class MediaRouterCallback extends MediaRouter.Callback {
        MediaRouterCallback() {
        }

        public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteDynamicControllerDialog.this.updateRoutesView();
        }

        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            boolean z;
            MediaRouter.RouteInfo.DynamicGroupState dynamicGroupState;
            if (routeInfo == MediaRouteDynamicControllerDialog.this.mSelectedRoute && routeInfo.getDynamicGroupController() != null) {
                Iterator<MediaRouter.RouteInfo> it = routeInfo.getProvider().getRoutes().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MediaRouter.RouteInfo next = it.next();
                    if (!MediaRouteDynamicControllerDialog.this.mSelectedRoute.getMemberRoutes().contains(next) && (dynamicGroupState = MediaRouteDynamicControllerDialog.this.mSelectedRoute.getDynamicGroupState(next)) != null && dynamicGroupState.isGroupable() && !MediaRouteDynamicControllerDialog.this.mGroupableRoutes.contains(next)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                MediaRouteDynamicControllerDialog.this.updateViewsIfNeeded();
                MediaRouteDynamicControllerDialog.this.updateRoutes();
                return;
            }
            MediaRouteDynamicControllerDialog.this.updateRoutesView();
        }

        public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteDynamicControllerDialog.this.updateRoutesView();
        }

        public void onRouteSelected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            mediaRouteDynamicControllerDialog.mSelectedRoute = routeInfo;
            mediaRouteDynamicControllerDialog.mIsSelectingRoute = false;
            mediaRouteDynamicControllerDialog.updateViewsIfNeeded();
            MediaRouteDynamicControllerDialog.this.updateRoutes();
        }

        public void onRouteUnselected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteDynamicControllerDialog.this.updateRoutesView();
        }

        public void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteVolumeSliderHolder mediaRouteVolumeSliderHolder;
            int volume = routeInfo.getVolume();
            if (MediaRouteDynamicControllerDialog.DEBUG) {
                Log.d(MediaRouteDynamicControllerDialog.TAG, "onRouteVolumeChanged(), route.getVolume:" + volume);
            }
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            if (mediaRouteDynamicControllerDialog.mRouteForVolumeUpdatingByUser != routeInfo && (mediaRouteVolumeSliderHolder = mediaRouteDynamicControllerDialog.mVolumeSliderHolderMap.get(routeInfo.getId())) != null) {
                mediaRouteVolumeSliderHolder.updateVolume();
            }
        }
    }

    private final class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private static final int ITEM_TYPE_GROUP = 4;
        private static final int ITEM_TYPE_GROUP_VOLUME = 1;
        private static final int ITEM_TYPE_HEADER = 2;
        private static final int ITEM_TYPE_ROUTE = 3;
        private final Interpolator mAccelerateDecelerateInterpolator;
        private final Drawable mDefaultIcon;
        private Item mGroupVolumeItem;
        private final LayoutInflater mInflater;
        private final ArrayList<Item> mItems = new ArrayList<>();
        private final int mLayoutAnimationDurationMs;
        private final Drawable mSpeakerGroupIcon;
        private final Drawable mSpeakerIcon;
        private final Drawable mTvIcon;

        private class GroupViewHolder extends RecyclerView.ViewHolder {
            final float mDisabledAlpha;
            final ImageView mImageView;
            final View mItemView;
            final ProgressBar mProgressBar;
            MediaRouter.RouteInfo mRoute;
            final TextView mTextView;

            GroupViewHolder(View view) {
                super(view);
                this.mItemView = view;
                this.mImageView = (ImageView) view.findViewById(C2410R.C2413id.mr_cast_group_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(C2410R.C2413id.mr_cast_group_progress_bar);
                this.mProgressBar = progressBar;
                this.mTextView = (TextView) view.findViewById(C2410R.C2413id.mr_cast_group_name);
                this.mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(MediaRouteDynamicControllerDialog.this.mContext);
                MediaRouterThemeHelper.setIndeterminateProgressBarColor(MediaRouteDynamicControllerDialog.this.mContext, progressBar);
            }

            private boolean isEnabled(MediaRouter.RouteInfo routeInfo) {
                List<MediaRouter.RouteInfo> memberRoutes = MediaRouteDynamicControllerDialog.this.mSelectedRoute.getMemberRoutes();
                if (memberRoutes.size() == 1 && memberRoutes.get(0) == routeInfo) {
                    return false;
                }
                return true;
            }

            /* access modifiers changed from: package-private */
            public void bindGroupViewHolder(Item item) {
                float f;
                MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) item.getData();
                this.mRoute = routeInfo;
                this.mImageView.setVisibility(0);
                this.mProgressBar.setVisibility(4);
                boolean isEnabled = isEnabled(routeInfo);
                View view = this.mItemView;
                if (isEnabled) {
                    f = 1.0f;
                } else {
                    f = this.mDisabledAlpha;
                }
                view.setAlpha(f);
                this.mItemView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        GroupViewHolder groupViewHolder = GroupViewHolder.this;
                        MediaRouteDynamicControllerDialog.this.mRouter.transferToRoute(groupViewHolder.mRoute);
                        GroupViewHolder.this.mImageView.setVisibility(4);
                        GroupViewHolder.this.mProgressBar.setVisibility(0);
                    }
                });
                this.mImageView.setImageDrawable(RecyclerAdapter.this.getIconDrawable(routeInfo));
                this.mTextView.setText(routeInfo.getName());
            }
        }

        private class GroupVolumeViewHolder extends MediaRouteVolumeSliderHolder {
            private final int mExpandedHeight;
            private final TextView mTextView;

            GroupVolumeViewHolder(View view) {
                super(view, (ImageButton) view.findViewById(C2410R.C2413id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(C2410R.C2413id.mr_cast_volume_slider));
                this.mTextView = (TextView) view.findViewById(C2410R.C2413id.mr_group_volume_route_name);
                Resources resources = MediaRouteDynamicControllerDialog.this.mContext.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(C2410R.dimen.mr_dynamic_volume_group_list_item_height, typedValue, true);
                this.mExpandedHeight = (int) typedValue.getDimension(displayMetrics);
            }

            /* access modifiers changed from: package-private */
            public void bindGroupVolumeViewHolder(Item item) {
                int i;
                View view = this.itemView;
                if (RecyclerAdapter.this.isGroupVolumeNeeded()) {
                    i = this.mExpandedHeight;
                } else {
                    i = 0;
                }
                MediaRouteDynamicControllerDialog.setLayoutHeight(view, i);
                MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) item.getData();
                super.bindRouteVolumeSliderHolder(routeInfo);
                this.mTextView.setText(routeInfo.getName());
            }

            /* access modifiers changed from: package-private */
            public int getExpandedHeight() {
                return this.mExpandedHeight;
            }
        }

        private class HeaderViewHolder extends RecyclerView.ViewHolder {
            private final TextView mTextView;

            HeaderViewHolder(View view) {
                super(view);
                this.mTextView = (TextView) view.findViewById(C2410R.C2413id.mr_cast_header_name);
            }

            /* access modifiers changed from: package-private */
            public void bindHeaderViewHolder(Item item) {
                this.mTextView.setText(item.getData().toString());
            }
        }

        private class Item {
            private final Object mData;
            private final int mType;

            Item(Object obj, int i) {
                this.mData = obj;
                this.mType = i;
            }

            public Object getData() {
                return this.mData;
            }

            public int getType() {
                return this.mType;
            }
        }

        private class RouteViewHolder extends MediaRouteVolumeSliderHolder {
            final CheckBox mCheckBox;
            final int mCollapsedLayoutHeight;
            final float mDisabledAlpha;
            final int mExpandedLayoutHeight;
            final ImageView mImageView;
            final View mItemView;
            final ProgressBar mProgressBar;
            final TextView mTextView;
            final View.OnClickListener mViewClickListener = new View.OnClickListener() {
                public void onClick(View view) {
                    RouteViewHolder routeViewHolder = RouteViewHolder.this;
                    boolean z = !routeViewHolder.isSelected(routeViewHolder.mRoute);
                    boolean isGroup = RouteViewHolder.this.mRoute.isGroup();
                    if (z) {
                        RouteViewHolder routeViewHolder2 = RouteViewHolder.this;
                        MediaRouteDynamicControllerDialog.this.mRouter.addMemberToDynamicGroup(routeViewHolder2.mRoute);
                    } else {
                        RouteViewHolder routeViewHolder3 = RouteViewHolder.this;
                        MediaRouteDynamicControllerDialog.this.mRouter.removeMemberFromDynamicGroup(routeViewHolder3.mRoute);
                    }
                    RouteViewHolder.this.showSelectingProgress(z, !isGroup);
                    if (isGroup) {
                        List<MediaRouter.RouteInfo> memberRoutes = MediaRouteDynamicControllerDialog.this.mSelectedRoute.getMemberRoutes();
                        for (MediaRouter.RouteInfo next : RouteViewHolder.this.mRoute.getMemberRoutes()) {
                            if (memberRoutes.contains(next) != z) {
                                MediaRouteVolumeSliderHolder mediaRouteVolumeSliderHolder = MediaRouteDynamicControllerDialog.this.mVolumeSliderHolderMap.get(next.getId());
                                if (mediaRouteVolumeSliderHolder instanceof RouteViewHolder) {
                                    ((RouteViewHolder) mediaRouteVolumeSliderHolder).showSelectingProgress(z, true);
                                }
                            }
                        }
                    }
                    RouteViewHolder routeViewHolder4 = RouteViewHolder.this;
                    RecyclerAdapter.this.mayUpdateGroupVolume(routeViewHolder4.mRoute, z);
                }
            };
            final RelativeLayout mVolumeSliderLayout;

            RouteViewHolder(View view) {
                super(view, (ImageButton) view.findViewById(C2410R.C2413id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(C2410R.C2413id.mr_cast_volume_slider));
                this.mItemView = view;
                this.mImageView = (ImageView) view.findViewById(C2410R.C2413id.mr_cast_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(C2410R.C2413id.mr_cast_route_progress_bar);
                this.mProgressBar = progressBar;
                this.mTextView = (TextView) view.findViewById(C2410R.C2413id.mr_cast_route_name);
                this.mVolumeSliderLayout = (RelativeLayout) view.findViewById(C2410R.C2413id.mr_cast_volume_layout);
                CheckBox checkBox = (CheckBox) view.findViewById(C2410R.C2413id.mr_cast_checkbox);
                this.mCheckBox = checkBox;
                checkBox.setButtonDrawable(MediaRouterThemeHelper.getCheckBoxDrawableIcon(MediaRouteDynamicControllerDialog.this.mContext));
                MediaRouterThemeHelper.setIndeterminateProgressBarColor(MediaRouteDynamicControllerDialog.this.mContext, progressBar);
                this.mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(MediaRouteDynamicControllerDialog.this.mContext);
                Resources resources = MediaRouteDynamicControllerDialog.this.mContext.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(C2410R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
                this.mExpandedLayoutHeight = (int) typedValue.getDimension(displayMetrics);
                this.mCollapsedLayoutHeight = 0;
            }

            private boolean isEnabled(MediaRouter.RouteInfo routeInfo) {
                if (MediaRouteDynamicControllerDialog.this.mUngroupableRoutes.contains(routeInfo)) {
                    return false;
                }
                if (isSelected(routeInfo) && MediaRouteDynamicControllerDialog.this.mSelectedRoute.getMemberRoutes().size() < 2) {
                    return false;
                }
                if (!isSelected(routeInfo)) {
                    return true;
                }
                MediaRouter.RouteInfo.DynamicGroupState dynamicGroupState = MediaRouteDynamicControllerDialog.this.mSelectedRoute.getDynamicGroupState(routeInfo);
                if (dynamicGroupState == null || !dynamicGroupState.isUnselectable()) {
                    return false;
                }
                return true;
            }

            /* access modifiers changed from: package-private */
            public void bindRouteViewHolder(Item item) {
                boolean z;
                int i;
                float f;
                MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) item.getData();
                if (routeInfo == MediaRouteDynamicControllerDialog.this.mSelectedRoute && routeInfo.getMemberRoutes().size() > 0) {
                    Iterator<MediaRouter.RouteInfo> it = routeInfo.getMemberRoutes().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        MediaRouter.RouteInfo next = it.next();
                        if (!MediaRouteDynamicControllerDialog.this.mGroupableRoutes.contains(next)) {
                            routeInfo = next;
                            break;
                        }
                    }
                }
                bindRouteVolumeSliderHolder(routeInfo);
                this.mImageView.setImageDrawable(RecyclerAdapter.this.getIconDrawable(routeInfo));
                this.mTextView.setText(routeInfo.getName());
                boolean z2 = false;
                this.mCheckBox.setVisibility(0);
                boolean isSelected = isSelected(routeInfo);
                boolean isEnabled = isEnabled(routeInfo);
                this.mCheckBox.setChecked(isSelected);
                this.mProgressBar.setVisibility(4);
                this.mImageView.setVisibility(0);
                this.mItemView.setEnabled(isEnabled);
                this.mCheckBox.setEnabled(isEnabled);
                ImageButton imageButton = this.mMuteButton;
                if (isEnabled || isSelected) {
                    z = true;
                } else {
                    z = false;
                }
                imageButton.setEnabled(z);
                MediaRouteVolumeSlider mediaRouteVolumeSlider = this.mVolumeSlider;
                if (isEnabled || isSelected) {
                    z2 = true;
                }
                mediaRouteVolumeSlider.setEnabled(z2);
                this.mItemView.setOnClickListener(this.mViewClickListener);
                this.mCheckBox.setOnClickListener(this.mViewClickListener);
                RelativeLayout relativeLayout = this.mVolumeSliderLayout;
                if (!isSelected || this.mRoute.isGroup()) {
                    i = this.mCollapsedLayoutHeight;
                } else {
                    i = this.mExpandedLayoutHeight;
                }
                MediaRouteDynamicControllerDialog.setLayoutHeight(relativeLayout, i);
                View view = this.mItemView;
                float f2 = 1.0f;
                if (isEnabled || isSelected) {
                    f = 1.0f;
                } else {
                    f = this.mDisabledAlpha;
                }
                view.setAlpha(f);
                CheckBox checkBox = this.mCheckBox;
                if (!isEnabled && isSelected) {
                    f2 = this.mDisabledAlpha;
                }
                checkBox.setAlpha(f2);
            }

            /* access modifiers changed from: package-private */
            public boolean isSelected(MediaRouter.RouteInfo routeInfo) {
                if (routeInfo.isSelected()) {
                    return true;
                }
                MediaRouter.RouteInfo.DynamicGroupState dynamicGroupState = MediaRouteDynamicControllerDialog.this.mSelectedRoute.getDynamicGroupState(routeInfo);
                if (dynamicGroupState == null || dynamicGroupState.getSelectionState() != 3) {
                    return false;
                }
                return true;
            }

            /* access modifiers changed from: package-private */
            public void showSelectingProgress(boolean z, boolean z2) {
                int i;
                this.mCheckBox.setEnabled(false);
                this.mItemView.setEnabled(false);
                this.mCheckBox.setChecked(z);
                if (z) {
                    this.mImageView.setVisibility(4);
                    this.mProgressBar.setVisibility(0);
                }
                if (z2) {
                    RecyclerAdapter recyclerAdapter = RecyclerAdapter.this;
                    RelativeLayout relativeLayout = this.mVolumeSliderLayout;
                    if (z) {
                        i = this.mExpandedLayoutHeight;
                    } else {
                        i = this.mCollapsedLayoutHeight;
                    }
                    recyclerAdapter.animateLayoutHeight(relativeLayout, i);
                }
            }
        }

        RecyclerAdapter() {
            this.mInflater = LayoutInflater.from(MediaRouteDynamicControllerDialog.this.mContext);
            this.mDefaultIcon = MediaRouterThemeHelper.getDefaultDrawableIcon(MediaRouteDynamicControllerDialog.this.mContext);
            this.mTvIcon = MediaRouterThemeHelper.getTvDrawableIcon(MediaRouteDynamicControllerDialog.this.mContext);
            this.mSpeakerIcon = MediaRouterThemeHelper.getSpeakerDrawableIcon(MediaRouteDynamicControllerDialog.this.mContext);
            this.mSpeakerGroupIcon = MediaRouterThemeHelper.getSpeakerGroupDrawableIcon(MediaRouteDynamicControllerDialog.this.mContext);
            this.mLayoutAnimationDurationMs = MediaRouteDynamicControllerDialog.this.mContext.getResources().getInteger(C2410R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
            this.mAccelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
            updateItems();
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
        public void animateLayoutHeight(final View view, final int i) {
            final int i2 = view.getLayoutParams().height;
            C24391 r1 = new Animation() {
                /* access modifiers changed from: protected */
                public void applyTransformation(float f, Transformation transformation) {
                    int i = i;
                    int i2 = i2;
                    MediaRouteDynamicControllerDialog.setLayoutHeight(view, i2 + ((int) (((float) (i - i2)) * f)));
                }
            };
            r1.setAnimationListener(new Animation.AnimationListener() {
                public void onAnimationEnd(Animation animation) {
                    MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
                    mediaRouteDynamicControllerDialog.mIsAnimatingVolumeSliderLayout = false;
                    mediaRouteDynamicControllerDialog.updateViewsIfNeeded();
                }

                public void onAnimationStart(Animation animation) {
                    MediaRouteDynamicControllerDialog.this.mIsAnimatingVolumeSliderLayout = true;
                }

                public void onAnimationRepeat(Animation animation) {
                }
            });
            r1.setDuration((long) this.mLayoutAnimationDurationMs);
            r1.setInterpolator(this.mAccelerateDecelerateInterpolator);
            view.startAnimation(r1);
        }

        /* access modifiers changed from: package-private */
        public Drawable getIconDrawable(MediaRouter.RouteInfo routeInfo) {
            Uri iconUri = routeInfo.getIconUri();
            if (iconUri != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(MediaRouteDynamicControllerDialog.this.mContext.getContentResolver().openInputStream(iconUri), (String) null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e) {
                    Log.w(MediaRouteDynamicControllerDialog.TAG, "Failed to load " + iconUri, e);
                }
            }
            return getDefaultIconDrawable(routeInfo);
        }

        public Item getItem(int i) {
            if (i == 0) {
                return this.mGroupVolumeItem;
            }
            return this.mItems.get(i - 1);
        }

        public int getItemCount() {
            return this.mItems.size() + 1;
        }

        public int getItemViewType(int i) {
            return getItem(i).getType();
        }

        /* access modifiers changed from: package-private */
        public boolean isGroupVolumeNeeded() {
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            if (!mediaRouteDynamicControllerDialog.mEnableGroupVolumeUX || mediaRouteDynamicControllerDialog.mSelectedRoute.getMemberRoutes().size() <= 1) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void mayUpdateGroupVolume(MediaRouter.RouteInfo routeInfo, boolean z) {
            int i;
            List<MediaRouter.RouteInfo> memberRoutes = MediaRouteDynamicControllerDialog.this.mSelectedRoute.getMemberRoutes();
            boolean z2 = true;
            int max = Math.max(1, memberRoutes.size());
            int i2 = -1;
            if (routeInfo.isGroup()) {
                for (MediaRouter.RouteInfo contains : routeInfo.getMemberRoutes()) {
                    if (memberRoutes.contains(contains) != z) {
                        if (z) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        max += i;
                    }
                }
            } else {
                if (z) {
                    i2 = 1;
                }
                max += i2;
            }
            boolean isGroupVolumeNeeded = isGroupVolumeNeeded();
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            int i3 = 0;
            if (!mediaRouteDynamicControllerDialog.mEnableGroupVolumeUX || max < 2) {
                z2 = false;
            }
            if (isGroupVolumeNeeded != z2) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = mediaRouteDynamicControllerDialog.mRecyclerView.findViewHolderForAdapterPosition(0);
                if (findViewHolderForAdapterPosition instanceof GroupVolumeViewHolder) {
                    GroupVolumeViewHolder groupVolumeViewHolder = (GroupVolumeViewHolder) findViewHolderForAdapterPosition;
                    View view = groupVolumeViewHolder.itemView;
                    if (z2) {
                        i3 = groupVolumeViewHolder.getExpandedHeight();
                    }
                    animateLayoutHeight(view, i3);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void notifyAdapterDataSetChanged() {
            MediaRouteDynamicControllerDialog.this.mUngroupableRoutes.clear();
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            mediaRouteDynamicControllerDialog.mUngroupableRoutes.addAll(MediaRouteDialogHelper.getItemsRemoved(mediaRouteDynamicControllerDialog.mGroupableRoutes, mediaRouteDynamicControllerDialog.getCurrentGroupableRoutes()));
            notifyDataSetChanged();
        }

        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = getItemViewType(i);
            Item item = getItem(i);
            if (itemViewType == 1) {
                MediaRouteDynamicControllerDialog.this.mVolumeSliderHolderMap.put(((MediaRouter.RouteInfo) item.getData()).getId(), (MediaRouteVolumeSliderHolder) viewHolder);
                ((GroupVolumeViewHolder) viewHolder).bindGroupVolumeViewHolder(item);
            } else if (itemViewType == 2) {
                ((HeaderViewHolder) viewHolder).bindHeaderViewHolder(item);
            } else if (itemViewType == 3) {
                MediaRouteDynamicControllerDialog.this.mVolumeSliderHolderMap.put(((MediaRouter.RouteInfo) item.getData()).getId(), (MediaRouteVolumeSliderHolder) viewHolder);
                ((RouteViewHolder) viewHolder).bindRouteViewHolder(item);
            } else if (itemViewType != 4) {
                Log.w(MediaRouteDynamicControllerDialog.TAG, "Cannot bind item to ViewHolder because of wrong view type");
            } else {
                ((GroupViewHolder) viewHolder).bindGroupViewHolder(item);
            }
        }

        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new GroupVolumeViewHolder(this.mInflater.inflate(C2410R.C2415layout.mr_cast_group_volume_item, viewGroup, false));
            }
            if (i == 2) {
                return new HeaderViewHolder(this.mInflater.inflate(C2410R.C2415layout.mr_cast_header_item, viewGroup, false));
            }
            if (i == 3) {
                return new RouteViewHolder(this.mInflater.inflate(C2410R.C2415layout.mr_cast_route_item, viewGroup, false));
            }
            if (i == 4) {
                return new GroupViewHolder(this.mInflater.inflate(C2410R.C2415layout.mr_cast_group_item, viewGroup, false));
            }
            Log.w(MediaRouteDynamicControllerDialog.TAG, "Cannot create ViewHolder because of wrong view type");
            return null;
        }

        public void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
            super.onViewRecycled(viewHolder);
            MediaRouteDynamicControllerDialog.this.mVolumeSliderHolderMap.values().remove(viewHolder);
        }

        /* access modifiers changed from: package-private */
        public void updateItems() {
            String str;
            String str2;
            this.mItems.clear();
            this.mGroupVolumeItem = new Item(MediaRouteDynamicControllerDialog.this.mSelectedRoute, 1);
            if (!MediaRouteDynamicControllerDialog.this.mMemberRoutes.isEmpty()) {
                for (MediaRouter.RouteInfo item : MediaRouteDynamicControllerDialog.this.mMemberRoutes) {
                    this.mItems.add(new Item(item, 3));
                }
            } else {
                this.mItems.add(new Item(MediaRouteDynamicControllerDialog.this.mSelectedRoute, 3));
            }
            boolean z = false;
            if (!MediaRouteDynamicControllerDialog.this.mGroupableRoutes.isEmpty()) {
                boolean z2 = false;
                for (MediaRouter.RouteInfo next : MediaRouteDynamicControllerDialog.this.mGroupableRoutes) {
                    if (!MediaRouteDynamicControllerDialog.this.mMemberRoutes.contains(next)) {
                        if (!z2) {
                            MediaRouteProvider.DynamicGroupRouteController dynamicGroupController = MediaRouteDynamicControllerDialog.this.mSelectedRoute.getDynamicGroupController();
                            if (dynamicGroupController != null) {
                                str2 = dynamicGroupController.getGroupableSelectionTitle();
                            } else {
                                str2 = null;
                            }
                            if (TextUtils.isEmpty(str2)) {
                                str2 = MediaRouteDynamicControllerDialog.this.mContext.getString(C2410R.string.mr_dialog_groupable_header);
                            }
                            this.mItems.add(new Item(str2, 2));
                            z2 = true;
                        }
                        this.mItems.add(new Item(next, 3));
                    }
                }
            }
            if (!MediaRouteDynamicControllerDialog.this.mTransferableRoutes.isEmpty()) {
                for (MediaRouter.RouteInfo next2 : MediaRouteDynamicControllerDialog.this.mTransferableRoutes) {
                    MediaRouter.RouteInfo routeInfo = MediaRouteDynamicControllerDialog.this.mSelectedRoute;
                    if (routeInfo != next2) {
                        if (!z) {
                            MediaRouteProvider.DynamicGroupRouteController dynamicGroupController2 = routeInfo.getDynamicGroupController();
                            if (dynamicGroupController2 != null) {
                                str = dynamicGroupController2.getTransferableSectionTitle();
                            } else {
                                str = null;
                            }
                            if (TextUtils.isEmpty(str)) {
                                str = MediaRouteDynamicControllerDialog.this.mContext.getString(C2410R.string.mr_dialog_transferable_header);
                            }
                            this.mItems.add(new Item(str, 2));
                            z = true;
                        }
                        this.mItems.add(new Item(next2, 4));
                    }
                }
            }
            notifyAdapterDataSetChanged();
        }
    }

    static final class RouteComparator implements Comparator<MediaRouter.RouteInfo> {
        static final RouteComparator sInstance = new RouteComparator();

        RouteComparator() {
        }

        public int compare(MediaRouter.RouteInfo routeInfo, MediaRouter.RouteInfo routeInfo2) {
            return routeInfo.getName().compareToIgnoreCase(routeInfo2.getName());
        }
    }

    private class VolumeChangeListener implements SeekBar.OnSeekBarChangeListener {
        VolumeChangeListener() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            boolean z2;
            if (z) {
                MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) seekBar.getTag();
                MediaRouteVolumeSliderHolder mediaRouteVolumeSliderHolder = MediaRouteDynamicControllerDialog.this.mVolumeSliderHolderMap.get(routeInfo.getId());
                if (mediaRouteVolumeSliderHolder != null) {
                    if (i == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    mediaRouteVolumeSliderHolder.setMute(z2);
                }
                routeInfo.requestSetVolume(i);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            if (mediaRouteDynamicControllerDialog.mRouteForVolumeUpdatingByUser != null) {
                mediaRouteDynamicControllerDialog.mHandler.removeMessages(2);
            }
            MediaRouteDynamicControllerDialog.this.mRouteForVolumeUpdatingByUser = (MediaRouter.RouteInfo) seekBar.getTag();
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            MediaRouteDynamicControllerDialog.this.mHandler.sendEmptyMessageDelayed(2, 500);
        }
    }

    public MediaRouteDynamicControllerDialog(@NonNull Context context) {
        this(context, 0);
    }

    @RequiresApi(17)
    private static Bitmap blurBitmap(Bitmap bitmap, float f, Context context) {
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius(f);
        create2.setInput(createFromBitmap);
        create2.forEach(createTyped);
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        createTyped.copyTo(copy);
        createFromBitmap.destroy();
        createTyped.destroy();
        create2.destroy();
        create.destroy();
        return copy;
    }

    static boolean isBitmapRecycled(Bitmap bitmap) {
        if (bitmap == null || !bitmap.isRecycled()) {
            return false;
        }
        return true;
    }

    static void setLayoutHeight(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    private void setMediaSession(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.mMediaController;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.mo147i(this.mControllerCallback);
            this.mMediaController = null;
        }
        if (token != null && this.mAttachedToWindow) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.mContext, token);
            this.mMediaController = mediaControllerCompat2;
            mediaControllerCompat2.mo145g(this.mControllerCallback);
            MediaMetadataCompat b = this.mMediaController.mo140b();
            if (b != null) {
                mediaDescriptionCompat = b.mo117d();
            }
            this.mDescription = mediaDescriptionCompat;
            reloadIconIfNeeded();
            updateMetadataViews();
        }
    }

    private boolean shouldDeferUpdateViews() {
        if (this.mRouteForVolumeUpdatingByUser != null || this.mIsSelectingRoute || this.mIsAnimatingVolumeSliderLayout) {
            return true;
        }
        return !this.mCreated;
    }

    /* access modifiers changed from: package-private */
    public void clearLoadedBitmap() {
        this.mArtIconIsLoaded = false;
        this.mArtIconLoadedBitmap = null;
        this.mArtIconBackgroundColor = 0;
    }

    /* access modifiers changed from: package-private */
    public List<MediaRouter.RouteInfo> getCurrentGroupableRoutes() {
        ArrayList arrayList = new ArrayList();
        for (MediaRouter.RouteInfo next : this.mSelectedRoute.getProvider().getRoutes()) {
            MediaRouter.RouteInfo.DynamicGroupState dynamicGroupState = this.mSelectedRoute.getDynamicGroupState(next);
            if (dynamicGroupState != null && dynamicGroupState.isGroupable()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @Nullable
    public MediaSessionCompat.Token getMediaSession() {
        MediaControllerCompat mediaControllerCompat = this.mMediaController;
        if (mediaControllerCompat == null) {
            return null;
        }
        return mediaControllerCompat.mo143e();
    }

    @NonNull
    public MediaRouteSelector getRouteSelector() {
        return this.mSelector;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        this.mRouter.addCallback(this.mSelector, this.mCallback, 1);
        updateRoutes();
        setMediaSession(this.mRouter.getMediaSessionToken());
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2410R.C2415layout.mr_cast_dialog);
        MediaRouterThemeHelper.setDialogBackgroundColor(this.mContext, this);
        ImageButton imageButton = (ImageButton) findViewById(C2410R.C2413id.mr_cast_close_button);
        this.mCloseButton = imageButton;
        imageButton.setColorFilter(-1);
        this.mCloseButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MediaRouteDynamicControllerDialog.this.dismiss();
            }
        });
        Button button = (Button) findViewById(C2410R.C2413id.mr_cast_stop_button);
        this.mStopCastingButton = button;
        button.setTextColor(-1);
        this.mStopCastingButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (MediaRouteDynamicControllerDialog.this.mSelectedRoute.isSelected()) {
                    MediaRouteDynamicControllerDialog.this.mRouter.unselect(2);
                }
                MediaRouteDynamicControllerDialog.this.dismiss();
            }
        });
        this.mAdapter = new RecyclerAdapter();
        RecyclerView recyclerView = (RecyclerView) findViewById(C2410R.C2413id.mr_cast_list);
        this.mRecyclerView = recyclerView;
        recyclerView.setAdapter(this.mAdapter);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mVolumeChangeListener = new VolumeChangeListener();
        this.mVolumeSliderHolderMap = new HashMap();
        this.mUnmutedVolumeMap = new HashMap();
        this.mMetadataBackground = (ImageView) findViewById(C2410R.C2413id.mr_cast_meta_background);
        this.mMetadataBlackScrim = findViewById(C2410R.C2413id.mr_cast_meta_black_scrim);
        this.mArtView = (ImageView) findViewById(C2410R.C2413id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(C2410R.C2413id.mr_cast_meta_title);
        this.mTitleView = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(C2410R.C2413id.mr_cast_meta_subtitle);
        this.mSubtitleView = textView2;
        textView2.setTextColor(-1);
        this.mTitlePlaceholder = this.mContext.getResources().getString(C2410R.string.mr_cast_dialog_title_view_placeholder);
        this.mCreated = true;
        updateLayout();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mAttachedToWindow = false;
        this.mRouter.removeCallback(this.mCallback);
        this.mHandler.removeCallbacksAndMessages((Object) null);
        setMediaSession((MediaSessionCompat.Token) null);
    }

    public boolean onFilterRoute(@NonNull MediaRouter.RouteInfo routeInfo) {
        if (routeInfo.isDefaultOrBluetooth() || !routeInfo.isEnabled() || !routeInfo.matchesSelector(this.mSelector) || this.mSelectedRoute == routeInfo) {
            return false;
        }
        return true;
    }

    public void onFilterRoutes(@NonNull List<MediaRouter.RouteInfo> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (!onFilterRoute(list.get(size))) {
                list.remove(size);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void reloadIconIfNeeded() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.mDescription;
        Uri uri2 = null;
        if (mediaDescriptionCompat == null) {
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.mo93b();
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = this.mDescription;
        if (mediaDescriptionCompat2 != null) {
            uri2 = mediaDescriptionCompat2.mo94c();
        }
        FetchArtTask fetchArtTask = this.mFetchArtTask;
        if (fetchArtTask == null) {
            bitmap2 = this.mArtIconBitmap;
        } else {
            bitmap2 = fetchArtTask.getIconBitmap();
        }
        FetchArtTask fetchArtTask2 = this.mFetchArtTask;
        if (fetchArtTask2 == null) {
            uri = this.mArtIconUri;
        } else {
            uri = fetchArtTask2.getIconUri();
        }
        if (bitmap2 != bitmap || (bitmap2 == null && !ObjectsCompat.equals(uri, uri2))) {
            FetchArtTask fetchArtTask3 = this.mFetchArtTask;
            if (fetchArtTask3 != null) {
                fetchArtTask3.cancel(true);
            }
            FetchArtTask fetchArtTask4 = new FetchArtTask();
            this.mFetchArtTask = fetchArtTask4;
            fetchArtTask4.execute(new Void[0]);
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
                updateRoutes();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void updateLayout() {
        getWindow().setLayout(MediaRouteDialogHelper.getDialogWidthForDynamicGroup(this.mContext), MediaRouteDialogHelper.getDialogHeight(this.mContext));
        this.mArtIconBitmap = null;
        this.mArtIconUri = null;
        reloadIconIfNeeded();
        updateMetadataViews();
        updateRoutesView();
    }

    /* access modifiers changed from: package-private */
    public void updateMetadataViews() {
        CharSequence charSequence;
        if (shouldDeferUpdateViews()) {
            this.mUpdateMetadataViewsDeferred = true;
            return;
        }
        this.mUpdateMetadataViewsDeferred = false;
        if (!this.mSelectedRoute.isSelected() || this.mSelectedRoute.isDefaultOrBluetooth()) {
            dismiss();
        }
        CharSequence charSequence2 = null;
        if (!this.mArtIconIsLoaded || isBitmapRecycled(this.mArtIconLoadedBitmap) || this.mArtIconLoadedBitmap == null) {
            if (isBitmapRecycled(this.mArtIconLoadedBitmap)) {
                Log.w(TAG, "Can't set artwork image with recycled bitmap: " + this.mArtIconLoadedBitmap);
            }
            this.mArtView.setVisibility(8);
            this.mMetadataBlackScrim.setVisibility(8);
            this.mMetadataBackground.setImageBitmap((Bitmap) null);
        } else {
            this.mArtView.setVisibility(0);
            this.mArtView.setImageBitmap(this.mArtIconLoadedBitmap);
            this.mArtView.setBackgroundColor(this.mArtIconBackgroundColor);
            this.mMetadataBlackScrim.setVisibility(0);
            this.mMetadataBackground.setImageBitmap(blurBitmap(this.mArtIconLoadedBitmap, 10.0f, this.mContext));
        }
        clearLoadedBitmap();
        MediaDescriptionCompat mediaDescriptionCompat = this.mDescription;
        if (mediaDescriptionCompat == null) {
            charSequence = null;
        } else {
            charSequence = mediaDescriptionCompat.mo99g();
        }
        boolean z = !TextUtils.isEmpty(charSequence);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.mDescription;
        if (mediaDescriptionCompat2 != null) {
            charSequence2 = mediaDescriptionCompat2.mo98f();
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(charSequence2);
        if (z) {
            this.mTitleView.setText(charSequence);
        } else {
            this.mTitleView.setText(this.mTitlePlaceholder);
        }
        if (isEmpty) {
            this.mSubtitleView.setText(charSequence2);
            this.mSubtitleView.setVisibility(0);
            return;
        }
        this.mSubtitleView.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public void updateRoutes() {
        this.mMemberRoutes.clear();
        this.mGroupableRoutes.clear();
        this.mTransferableRoutes.clear();
        this.mMemberRoutes.addAll(this.mSelectedRoute.getMemberRoutes());
        for (MediaRouter.RouteInfo next : this.mSelectedRoute.getProvider().getRoutes()) {
            MediaRouter.RouteInfo.DynamicGroupState dynamicGroupState = this.mSelectedRoute.getDynamicGroupState(next);
            if (dynamicGroupState != null) {
                if (dynamicGroupState.isGroupable()) {
                    this.mGroupableRoutes.add(next);
                }
                if (dynamicGroupState.isTransferable()) {
                    this.mTransferableRoutes.add(next);
                }
            }
        }
        onFilterRoutes(this.mGroupableRoutes);
        onFilterRoutes(this.mTransferableRoutes);
        List<MediaRouter.RouteInfo> list = this.mMemberRoutes;
        RouteComparator routeComparator = RouteComparator.sInstance;
        Collections.sort(list, routeComparator);
        Collections.sort(this.mGroupableRoutes, routeComparator);
        Collections.sort(this.mTransferableRoutes, routeComparator);
        this.mAdapter.updateItems();
    }

    /* access modifiers changed from: package-private */
    public void updateRoutesView() {
        if (!this.mAttachedToWindow) {
            return;
        }
        if (SystemClock.uptimeMillis() - this.mLastUpdateTime < 300) {
            this.mHandler.removeMessages(1);
            this.mHandler.sendEmptyMessageAtTime(1, this.mLastUpdateTime + 300);
        } else if (shouldDeferUpdateViews()) {
            this.mUpdateRoutesViewDeferred = true;
        } else {
            this.mUpdateRoutesViewDeferred = false;
            if (!this.mSelectedRoute.isSelected() || this.mSelectedRoute.isDefaultOrBluetooth()) {
                dismiss();
            }
            this.mLastUpdateTime = SystemClock.uptimeMillis();
            this.mAdapter.notifyAdapterDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    public void updateViewsIfNeeded() {
        if (this.mUpdateRoutesViewDeferred) {
            updateRoutesView();
        }
        if (this.mUpdateMetadataViewsDeferred) {
            updateMetadataViews();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaRouteDynamicControllerDialog(@androidx.annotation.NonNull android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = androidx.mediarouter.app.MediaRouterThemeHelper.createThemedDialogContext(r2, r3, r0)
            int r3 = androidx.mediarouter.app.MediaRouterThemeHelper.createThemedDialogStyle(r2)
            r1.<init>(r2, r3)
            androidx.mediarouter.media.MediaRouteSelector r2 = androidx.mediarouter.media.MediaRouteSelector.EMPTY
            r1.mSelector = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.mMemberRoutes = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.mGroupableRoutes = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.mTransferableRoutes = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.mUngroupableRoutes = r2
            androidx.mediarouter.app.MediaRouteDynamicControllerDialog$1 r2 = new androidx.mediarouter.app.MediaRouteDynamicControllerDialog$1
            r2.<init>()
            r1.mHandler = r2
            android.content.Context r2 = r1.getContext()
            r1.mContext = r2
            androidx.mediarouter.media.MediaRouter r2 = androidx.mediarouter.media.MediaRouter.getInstance(r2)
            r1.mRouter = r2
            boolean r3 = androidx.mediarouter.media.MediaRouter.isGroupVolumeUxEnabled()
            r1.mEnableGroupVolumeUX = r3
            androidx.mediarouter.app.MediaRouteDynamicControllerDialog$MediaRouterCallback r3 = new androidx.mediarouter.app.MediaRouteDynamicControllerDialog$MediaRouterCallback
            r3.<init>()
            r1.mCallback = r3
            androidx.mediarouter.media.MediaRouter$RouteInfo r3 = r2.getSelectedRoute()
            r1.mSelectedRoute = r3
            androidx.mediarouter.app.MediaRouteDynamicControllerDialog$MediaControllerCallback r3 = new androidx.mediarouter.app.MediaRouteDynamicControllerDialog$MediaControllerCallback
            r3.<init>()
            r1.mControllerCallback = r3
            android.support.v4.media.session.MediaSessionCompat$Token r2 = r2.getMediaSessionToken()
            r1.setMediaSession(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteDynamicControllerDialog.<init>(android.content.Context, int):void");
    }
}
