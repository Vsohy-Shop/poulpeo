package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p001v4.media.MediaDescriptionCompat;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.MediaControllerCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.util.ObjectsCompat;
import androidx.mediarouter.C2410R;
import androidx.mediarouter.app.OverlayListView;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MediaRouteControllerDialog extends AlertDialog {
    static final int BUTTON_DISCONNECT_RES_ID = 16908314;
    private static final int BUTTON_NEUTRAL_RES_ID = 16908315;
    static final int BUTTON_STOP_RES_ID = 16908313;
    static final int CONNECTION_TIMEOUT_MILLIS = ((int) TimeUnit.SECONDS.toMillis(30));
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    static final String TAG = "MediaRouteCtrlDialog";
    static final int VOLUME_UPDATE_DELAY_MILLIS = 500;
    private Interpolator mAccelerateDecelerateInterpolator;
    final AccessibilityManager mAccessibilityManager;
    int mArtIconBackgroundColor;
    Bitmap mArtIconBitmap;
    boolean mArtIconIsLoaded;
    Bitmap mArtIconLoadedBitmap;
    Uri mArtIconUri;
    private ImageView mArtView;
    private boolean mAttachedToWindow;
    private final MediaRouterCallback mCallback;
    private ImageButton mCloseButton;
    Context mContext;
    MediaControllerCallback mControllerCallback;
    private boolean mCreated;
    private FrameLayout mCustomControlLayout;
    private View mCustomControlView;
    FrameLayout mDefaultControlLayout;
    MediaDescriptionCompat mDescription;
    private LinearLayout mDialogAreaLayout;
    private int mDialogContentWidth;
    private Button mDisconnectButton;
    private View mDividerView;
    final boolean mEnableGroupVolumeUX;
    private FrameLayout mExpandableAreaLayout;
    private Interpolator mFastOutSlowInInterpolator;
    FetchArtTask mFetchArtTask;
    private MediaRouteExpandCollapseButton mGroupExpandCollapseButton;
    int mGroupListAnimationDurationMs;
    Runnable mGroupListFadeInAnimation;
    private int mGroupListFadeInDurationMs;
    private int mGroupListFadeOutDurationMs;
    private List<MediaRouter.RouteInfo> mGroupMemberRoutes;
    Set<MediaRouter.RouteInfo> mGroupMemberRoutesAdded;
    Set<MediaRouter.RouteInfo> mGroupMemberRoutesAnimatingWithBitmap;
    private Set<MediaRouter.RouteInfo> mGroupMemberRoutesRemoved;
    boolean mHasPendingUpdate;
    private Interpolator mInterpolator;
    boolean mIsGroupExpanded;
    boolean mIsGroupListAnimating;
    boolean mIsGroupListAnimationPending;
    private Interpolator mLinearOutSlowInInterpolator;
    MediaControllerCompat mMediaController;
    private LinearLayout mMediaMainControlLayout;
    boolean mPendingUpdateAnimationNeeded;
    private ImageButton mPlaybackControlButton;
    private RelativeLayout mPlaybackControlLayout;
    final MediaRouter.RouteInfo mRoute;
    MediaRouter.RouteInfo mRouteInVolumeSliderTouched;
    private TextView mRouteNameTextView;
    final MediaRouter mRouter;
    PlaybackStateCompat mState;
    private Button mStopCastingButton;
    private TextView mSubtitleView;
    private TextView mTitleView;
    VolumeChangeListener mVolumeChangeListener;
    private boolean mVolumeControlEnabled;
    LinearLayout mVolumeControlLayout;
    VolumeGroupAdapter mVolumeGroupAdapter;
    OverlayListView mVolumeGroupList;
    private int mVolumeGroupListItemHeight;
    private int mVolumeGroupListItemIconSize;
    private int mVolumeGroupListMaxHeight;
    private final int mVolumeGroupListPaddingTop;
    SeekBar mVolumeSlider;
    Map<MediaRouter.RouteInfo, SeekBar> mVolumeSliderMap;

    private final class ClickListener implements View.OnClickListener {
        ClickListener() {
        }

        public void onClick(View view) {
            PlaybackStateCompat playbackStateCompat;
            int id = view.getId();
            int i = 1;
            if (id == MediaRouteControllerDialog.BUTTON_STOP_RES_ID || id == MediaRouteControllerDialog.BUTTON_DISCONNECT_RES_ID) {
                if (MediaRouteControllerDialog.this.mRoute.isSelected()) {
                    MediaRouter mediaRouter = MediaRouteControllerDialog.this.mRouter;
                    if (id == MediaRouteControllerDialog.BUTTON_STOP_RES_ID) {
                        i = 2;
                    }
                    mediaRouter.unselect(i);
                }
                MediaRouteControllerDialog.this.dismiss();
            } else if (id == C2410R.C2413id.mr_control_playback_ctrl) {
                MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
                if (mediaRouteControllerDialog.mMediaController != null && (playbackStateCompat = mediaRouteControllerDialog.mState) != null) {
                    int i2 = 0;
                    if (playbackStateCompat.mo376g() != 3) {
                        i = 0;
                    }
                    if (i != 0 && MediaRouteControllerDialog.this.isPauseActionSupported()) {
                        MediaRouteControllerDialog.this.mMediaController.mo144f().mo196a();
                        i2 = C2410R.string.mr_controller_pause;
                    } else if (i != 0 && MediaRouteControllerDialog.this.isStopActionSupported()) {
                        MediaRouteControllerDialog.this.mMediaController.mo144f().mo198c();
                        i2 = C2410R.string.mr_controller_stop;
                    } else if (i == 0 && MediaRouteControllerDialog.this.isPlayActionSupported()) {
                        MediaRouteControllerDialog.this.mMediaController.mo144f().mo197b();
                        i2 = C2410R.string.mr_controller_play;
                    }
                    AccessibilityManager accessibilityManager = MediaRouteControllerDialog.this.mAccessibilityManager;
                    if (accessibilityManager != null && accessibilityManager.isEnabled() && i2 != 0) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                        obtain.setPackageName(MediaRouteControllerDialog.this.mContext.getPackageName());
                        obtain.setClassName(ClickListener.class.getName());
                        obtain.getText().add(MediaRouteControllerDialog.this.mContext.getString(i2));
                        MediaRouteControllerDialog.this.mAccessibilityManager.sendAccessibilityEvent(obtain);
                    }
                }
            } else if (id == C2410R.C2413id.mr_close) {
                MediaRouteControllerDialog.this.dismiss();
            }
        }
    }

    private class FetchArtTask extends AsyncTask<Void, Void, Bitmap> {
        private static final long SHOW_ANIM_TIME_THRESHOLD_MILLIS = 120;
        private int mBackgroundColor;
        private final Bitmap mIconBitmap;
        private final Uri mIconUri;
        private long mStartTimeMillis;

        FetchArtTask() {
            Bitmap bitmap;
            MediaDescriptionCompat mediaDescriptionCompat = MediaRouteControllerDialog.this.mDescription;
            Uri uri = null;
            if (mediaDescriptionCompat == null) {
                bitmap = null;
            } else {
                bitmap = mediaDescriptionCompat.mo93b();
            }
            if (MediaRouteControllerDialog.isBitmapRecycled(bitmap)) {
                Log.w(MediaRouteControllerDialog.TAG, "Can't fetch the given art bitmap because it's already recycled.");
                bitmap = null;
            }
            this.mIconBitmap = bitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = MediaRouteControllerDialog.this.mDescription;
            this.mIconUri = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.mo94c() : uri;
        }

        private InputStream openInputStreamByScheme(Uri uri) {
            InputStream inputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                inputStream = MediaRouteControllerDialog.this.mContext.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                int i = MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS;
                openConnection.setConnectTimeout(i);
                openConnection.setReadTimeout(i);
                inputStream = openConnection.getInputStream();
            }
            if (inputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStream);
        }

        public Bitmap getIconBitmap() {
            return this.mIconBitmap;
        }

        public Uri getIconUri() {
            return this.mIconUri;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            this.mStartTimeMillis = SystemClock.uptimeMillis();
            MediaRouteControllerDialog.this.clearLoadedBitmap();
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0048 */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0053 A[Catch:{ IOException -> 0x009d }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00b9 A[SYNTHETIC, Splitter:B:54:0x00b9] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00c1 A[SYNTHETIC, Splitter:B:59:0x00c1] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x00e1 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Bitmap doInBackground(java.lang.Void... r10) {
            /*
                r9 = this;
                java.lang.String r10 = "Unable to open: "
                android.graphics.Bitmap r0 = r9.mIconBitmap
                r1 = 0
                r2 = 1
                java.lang.String r3 = "MediaRouteCtrlDialog"
                r4 = 0
                if (r0 == 0) goto L_0x000d
                goto L_0x00c6
            L_0x000d:
                android.net.Uri r0 = r9.mIconUri
                if (r0 == 0) goto L_0x00c5
                java.io.InputStream r0 = r9.openInputStreamByScheme(r0)     // Catch:{ IOException -> 0x00a1, all -> 0x009f }
                if (r0 != 0) goto L_0x0031
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009d }
                r5.<init>()     // Catch:{ IOException -> 0x009d }
                r5.append(r10)     // Catch:{ IOException -> 0x009d }
                android.net.Uri r6 = r9.mIconUri     // Catch:{ IOException -> 0x009d }
                r5.append(r6)     // Catch:{ IOException -> 0x009d }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x009d }
                android.util.Log.w(r3, r5)     // Catch:{ IOException -> 0x009d }
                if (r0 == 0) goto L_0x0030
                r0.close()     // Catch:{ IOException -> 0x0030 }
            L_0x0030:
                return r4
            L_0x0031:
                android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x009d }
                r5.<init>()     // Catch:{ IOException -> 0x009d }
                r5.inJustDecodeBounds = r2     // Catch:{ IOException -> 0x009d }
                android.graphics.BitmapFactory.decodeStream(r0, r4, r5)     // Catch:{ IOException -> 0x009d }
                int r6 = r5.outWidth     // Catch:{ IOException -> 0x009d }
                if (r6 == 0) goto L_0x0099
                int r6 = r5.outHeight     // Catch:{ IOException -> 0x009d }
                if (r6 != 0) goto L_0x0044
                goto L_0x0099
            L_0x0044:
                r0.reset()     // Catch:{ IOException -> 0x0048 }
                goto L_0x006d
            L_0x0048:
                r0.close()     // Catch:{ IOException -> 0x009d }
                android.net.Uri r6 = r9.mIconUri     // Catch:{ IOException -> 0x009d }
                java.io.InputStream r0 = r9.openInputStreamByScheme(r6)     // Catch:{ IOException -> 0x009d }
                if (r0 != 0) goto L_0x006d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009d }
                r5.<init>()     // Catch:{ IOException -> 0x009d }
                r5.append(r10)     // Catch:{ IOException -> 0x009d }
                android.net.Uri r6 = r9.mIconUri     // Catch:{ IOException -> 0x009d }
                r5.append(r6)     // Catch:{ IOException -> 0x009d }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x009d }
                android.util.Log.w(r3, r5)     // Catch:{ IOException -> 0x009d }
                if (r0 == 0) goto L_0x006c
                r0.close()     // Catch:{ IOException -> 0x006c }
            L_0x006c:
                return r4
            L_0x006d:
                r5.inJustDecodeBounds = r1     // Catch:{ IOException -> 0x009d }
                androidx.mediarouter.app.MediaRouteControllerDialog r6 = androidx.mediarouter.app.MediaRouteControllerDialog.this     // Catch:{ IOException -> 0x009d }
                int r7 = r5.outWidth     // Catch:{ IOException -> 0x009d }
                int r8 = r5.outHeight     // Catch:{ IOException -> 0x009d }
                int r6 = r6.getDesiredArtHeight(r7, r8)     // Catch:{ IOException -> 0x009d }
                int r7 = r5.outHeight     // Catch:{ IOException -> 0x009d }
                int r7 = r7 / r6
                int r6 = java.lang.Integer.highestOneBit(r7)     // Catch:{ IOException -> 0x009d }
                int r6 = java.lang.Math.max(r2, r6)     // Catch:{ IOException -> 0x009d }
                r5.inSampleSize = r6     // Catch:{ IOException -> 0x009d }
                boolean r6 = r9.isCancelled()     // Catch:{ IOException -> 0x009d }
                if (r6 == 0) goto L_0x0090
                r0.close()     // Catch:{ IOException -> 0x008f }
            L_0x008f:
                return r4
            L_0x0090:
                android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeStream(r0, r4, r5)     // Catch:{ IOException -> 0x009d }
                r0.close()     // Catch:{ IOException -> 0x0097 }
            L_0x0097:
                r0 = r10
                goto L_0x00c6
            L_0x0099:
                r0.close()     // Catch:{ IOException -> 0x009c }
            L_0x009c:
                return r4
            L_0x009d:
                r5 = move-exception
                goto L_0x00a3
            L_0x009f:
                r10 = move-exception
                goto L_0x00bf
            L_0x00a1:
                r5 = move-exception
                r0 = r4
            L_0x00a3:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
                r6.<init>()     // Catch:{ all -> 0x00bd }
                r6.append(r10)     // Catch:{ all -> 0x00bd }
                android.net.Uri r10 = r9.mIconUri     // Catch:{ all -> 0x00bd }
                r6.append(r10)     // Catch:{ all -> 0x00bd }
                java.lang.String r10 = r6.toString()     // Catch:{ all -> 0x00bd }
                android.util.Log.w(r3, r10, r5)     // Catch:{ all -> 0x00bd }
                if (r0 == 0) goto L_0x00c5
                r0.close()     // Catch:{ IOException -> 0x00c5 }
                goto L_0x00c5
            L_0x00bd:
                r10 = move-exception
                r4 = r0
            L_0x00bf:
                if (r4 == 0) goto L_0x00c4
                r4.close()     // Catch:{ IOException -> 0x00c4 }
            L_0x00c4:
                throw r10
            L_0x00c5:
                r0 = r4
            L_0x00c6:
                boolean r10 = androidx.mediarouter.app.MediaRouteControllerDialog.isBitmapRecycled(r0)
                if (r10 == 0) goto L_0x00e1
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r1 = "Can't use recycled bitmap: "
                r10.append(r1)
                r10.append(r0)
                java.lang.String r10 = r10.toString()
                android.util.Log.w(r3, r10)
                return r4
            L_0x00e1:
                if (r0 == 0) goto L_0x0115
                int r10 = r0.getWidth()
                int r3 = r0.getHeight()
                if (r10 >= r3) goto L_0x0115
                androidx.palette.graphics.Palette$Builder r10 = new androidx.palette.graphics.Palette$Builder
                r10.<init>((android.graphics.Bitmap) r0)
                androidx.palette.graphics.Palette$Builder r10 = r10.maximumColorCount(r2)
                androidx.palette.graphics.Palette r10 = r10.generate()
                java.util.List r2 = r10.getSwatches()
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x0105
                goto L_0x0113
            L_0x0105:
                java.util.List r10 = r10.getSwatches()
                java.lang.Object r10 = r10.get(r1)
                androidx.palette.graphics.Palette$Swatch r10 = (androidx.palette.graphics.Palette.Swatch) r10
                int r1 = r10.getRgb()
            L_0x0113:
                r9.mBackgroundColor = r1
            L_0x0115:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteControllerDialog.FetchArtTask.doInBackground(java.lang.Void[]):android.graphics.Bitmap");
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Bitmap bitmap) {
            MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
            mediaRouteControllerDialog.mFetchArtTask = null;
            if (!ObjectsCompat.equals(mediaRouteControllerDialog.mArtIconBitmap, this.mIconBitmap) || !ObjectsCompat.equals(MediaRouteControllerDialog.this.mArtIconUri, this.mIconUri)) {
                MediaRouteControllerDialog mediaRouteControllerDialog2 = MediaRouteControllerDialog.this;
                mediaRouteControllerDialog2.mArtIconBitmap = this.mIconBitmap;
                mediaRouteControllerDialog2.mArtIconLoadedBitmap = bitmap;
                mediaRouteControllerDialog2.mArtIconUri = this.mIconUri;
                mediaRouteControllerDialog2.mArtIconBackgroundColor = this.mBackgroundColor;
                boolean z = true;
                mediaRouteControllerDialog2.mArtIconIsLoaded = true;
                long uptimeMillis = SystemClock.uptimeMillis() - this.mStartTimeMillis;
                MediaRouteControllerDialog mediaRouteControllerDialog3 = MediaRouteControllerDialog.this;
                if (uptimeMillis <= SHOW_ANIM_TIME_THRESHOLD_MILLIS) {
                    z = false;
                }
                mediaRouteControllerDialog3.update(z);
            }
        }
    }

    private final class MediaControllerCallback extends MediaControllerCompat.C0047a {
        MediaControllerCallback() {
        }

        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            MediaDescriptionCompat mediaDescriptionCompat;
            MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
            if (mediaMetadataCompat == null) {
                mediaDescriptionCompat = null;
            } else {
                mediaDescriptionCompat = mediaMetadataCompat.mo117d();
            }
            mediaRouteControllerDialog.mDescription = mediaDescriptionCompat;
            MediaRouteControllerDialog.this.updateArtIconIfNeeded();
            MediaRouteControllerDialog.this.update(false);
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
            mediaRouteControllerDialog.mState = playbackStateCompat;
            mediaRouteControllerDialog.update(false);
        }

        public void onSessionDestroyed() {
            MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
            MediaControllerCompat mediaControllerCompat = mediaRouteControllerDialog.mMediaController;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.mo147i(mediaRouteControllerDialog.mControllerCallback);
                MediaRouteControllerDialog.this.mMediaController = null;
            }
        }
    }

    private final class MediaRouterCallback extends MediaRouter.Callback {
        MediaRouterCallback() {
        }

        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteControllerDialog.this.update(true);
        }

        public void onRouteUnselected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteControllerDialog.this.update(false);
        }

        public void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            SeekBar seekBar = MediaRouteControllerDialog.this.mVolumeSliderMap.get(routeInfo);
            int volume = routeInfo.getVolume();
            if (MediaRouteControllerDialog.DEBUG) {
                Log.d(MediaRouteControllerDialog.TAG, "onRouteVolumeChanged(), route.getVolume:" + volume);
            }
            if (seekBar != null && MediaRouteControllerDialog.this.mRouteInVolumeSliderTouched != routeInfo) {
                seekBar.setProgress(volume);
            }
        }
    }

    private class VolumeChangeListener implements SeekBar.OnSeekBarChangeListener {
        private final Runnable mStopTrackingTouch = new Runnable() {
            public void run() {
                MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
                if (mediaRouteControllerDialog.mRouteInVolumeSliderTouched != null) {
                    mediaRouteControllerDialog.mRouteInVolumeSliderTouched = null;
                    if (mediaRouteControllerDialog.mHasPendingUpdate) {
                        mediaRouteControllerDialog.update(mediaRouteControllerDialog.mPendingUpdateAnimationNeeded);
                    }
                }
            }
        };

        VolumeChangeListener() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) seekBar.getTag();
                if (MediaRouteControllerDialog.DEBUG) {
                    Log.d(MediaRouteControllerDialog.TAG, "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(" + i + ")");
                }
                routeInfo.requestSetVolume(i);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
            if (mediaRouteControllerDialog.mRouteInVolumeSliderTouched != null) {
                mediaRouteControllerDialog.mVolumeSlider.removeCallbacks(this.mStopTrackingTouch);
            }
            MediaRouteControllerDialog.this.mRouteInVolumeSliderTouched = (MediaRouter.RouteInfo) seekBar.getTag();
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            MediaRouteControllerDialog.this.mVolumeSlider.postDelayed(this.mStopTrackingTouch, 500);
        }
    }

    private class VolumeGroupAdapter extends ArrayAdapter<MediaRouter.RouteInfo> {
        final float mDisabledAlpha;

        public VolumeGroupAdapter(Context context, List<MediaRouter.RouteInfo> list) {
            super(context, 0, list);
            this.mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(context);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int i2;
            int i3 = 0;
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C2410R.C2415layout.mr_controller_volume_item, viewGroup, false);
            } else {
                MediaRouteControllerDialog.this.updateVolumeGroupItemHeight(view);
            }
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) getItem(i);
            if (routeInfo != null) {
                boolean isEnabled = routeInfo.isEnabled();
                TextView textView = (TextView) view.findViewById(C2410R.C2413id.mr_name);
                textView.setEnabled(isEnabled);
                textView.setText(routeInfo.getName());
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(C2410R.C2413id.mr_volume_slider);
                MediaRouterThemeHelper.setVolumeSliderColor(viewGroup.getContext(), mediaRouteVolumeSlider, MediaRouteControllerDialog.this.mVolumeGroupList);
                mediaRouteVolumeSlider.setTag(routeInfo);
                MediaRouteControllerDialog.this.mVolumeSliderMap.put(routeInfo, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.setHideThumb(!isEnabled);
                mediaRouteVolumeSlider.setEnabled(isEnabled);
                if (isEnabled) {
                    if (MediaRouteControllerDialog.this.isVolumeControlAvailable(routeInfo)) {
                        mediaRouteVolumeSlider.setMax(routeInfo.getVolumeMax());
                        mediaRouteVolumeSlider.setProgress(routeInfo.getVolume());
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(MediaRouteControllerDialog.this.mVolumeChangeListener);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ImageView imageView = (ImageView) view.findViewById(C2410R.C2413id.mr_volume_item_icon);
                if (isEnabled) {
                    i2 = 255;
                } else {
                    i2 = (int) (this.mDisabledAlpha * 255.0f);
                }
                imageView.setAlpha(i2);
                LinearLayout linearLayout = (LinearLayout) view.findViewById(C2410R.C2413id.volume_item_container);
                if (MediaRouteControllerDialog.this.mGroupMemberRoutesAnimatingWithBitmap.contains(routeInfo)) {
                    i3 = 4;
                }
                linearLayout.setVisibility(i3);
                Set<MediaRouter.RouteInfo> set = MediaRouteControllerDialog.this.mGroupMemberRoutesAdded;
                if (set != null && set.contains(routeInfo)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }

        public boolean isEnabled(int i) {
            return false;
        }
    }

    public MediaRouteControllerDialog(@NonNull Context context) {
        this(context, 0);
    }

    private void animateGroupListItems(final Map<MediaRouter.RouteInfo, Rect> map, final Map<MediaRouter.RouteInfo, BitmapDrawable> map2) {
        this.mVolumeGroupList.setEnabled(false);
        this.mVolumeGroupList.requestLayout();
        this.mIsGroupListAnimating = true;
        this.mVolumeGroupList.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                MediaRouteControllerDialog.this.mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                MediaRouteControllerDialog.this.animateGroupListItemsInternal(map, map2);
            }
        });
    }

    private void animateLayoutHeight(final View view, final int i) {
        final int layoutHeight = getLayoutHeight(view);
        C24277 r1 = new Animation() {
            /* access modifiers changed from: protected */
            public void applyTransformation(float f, Transformation transformation) {
                int i = layoutHeight;
                MediaRouteControllerDialog.setLayoutHeight(view, i - ((int) (((float) (i - i)) * f)));
            }
        };
        r1.setDuration((long) this.mGroupListAnimationDurationMs);
        r1.setInterpolator(this.mInterpolator);
        view.startAnimation(r1);
    }

    private boolean canShowPlaybackControlLayout() {
        if (this.mCustomControlView != null || (this.mDescription == null && this.mState == null)) {
            return false;
        }
        return true;
    }

    private void fadeInAddedRoutes() {
        C242112 r0 = new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                MediaRouteControllerDialog.this.finishAnimation(true);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        };
        int firstVisiblePosition = this.mVolumeGroupList.getFirstVisiblePosition();
        boolean z = false;
        for (int i = 0; i < this.mVolumeGroupList.getChildCount(); i++) {
            View childAt = this.mVolumeGroupList.getChildAt(i);
            if (this.mGroupMemberRoutesAdded.contains((MediaRouter.RouteInfo) this.mVolumeGroupAdapter.getItem(firstVisiblePosition + i))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration((long) this.mGroupListFadeInDurationMs);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z) {
                    alphaAnimation.setAnimationListener(r0);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }

    private static int getLayoutHeight(View view) {
        return view.getLayoutParams().height;
    }

    private int getMainControllerHeight(boolean z) {
        if (!z && this.mVolumeControlLayout.getVisibility() != 0) {
            return 0;
        }
        int paddingTop = 0 + this.mMediaMainControlLayout.getPaddingTop() + this.mMediaMainControlLayout.getPaddingBottom();
        if (z) {
            paddingTop += this.mPlaybackControlLayout.getMeasuredHeight();
        }
        if (this.mVolumeControlLayout.getVisibility() == 0) {
            paddingTop += this.mVolumeControlLayout.getMeasuredHeight();
        }
        if (!z || this.mVolumeControlLayout.getVisibility() != 0) {
            return paddingTop;
        }
        return paddingTop + this.mDividerView.getMeasuredHeight();
    }

    static boolean isBitmapRecycled(Bitmap bitmap) {
        if (bitmap == null || !bitmap.isRecycled()) {
            return false;
        }
        return true;
    }

    private boolean isGroup() {
        if (!this.mRoute.isGroup() || this.mRoute.getMemberRoutes().size() <= 1) {
            return false;
        }
        return true;
    }

    private boolean isIconChanged() {
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
        if (bitmap2 != bitmap) {
            return true;
        }
        if (bitmap2 != null || uriEquals(uri, uri2)) {
            return false;
        }
        return true;
    }

    private void rebuildVolumeGroupList(boolean z) {
        HashMap hashMap;
        HashMap hashMap2;
        List<MediaRouter.RouteInfo> memberRoutes = this.mRoute.getMemberRoutes();
        if (memberRoutes.isEmpty()) {
            this.mGroupMemberRoutes.clear();
            this.mVolumeGroupAdapter.notifyDataSetChanged();
        } else if (MediaRouteDialogHelper.listUnorderedEquals(this.mGroupMemberRoutes, memberRoutes)) {
            this.mVolumeGroupAdapter.notifyDataSetChanged();
        } else {
            if (z) {
                hashMap = MediaRouteDialogHelper.getItemBoundMap(this.mVolumeGroupList, this.mVolumeGroupAdapter);
            } else {
                hashMap = null;
            }
            if (z) {
                hashMap2 = MediaRouteDialogHelper.getItemBitmapMap(this.mContext, this.mVolumeGroupList, this.mVolumeGroupAdapter);
            } else {
                hashMap2 = null;
            }
            this.mGroupMemberRoutesAdded = MediaRouteDialogHelper.getItemsAdded(this.mGroupMemberRoutes, memberRoutes);
            this.mGroupMemberRoutesRemoved = MediaRouteDialogHelper.getItemsRemoved(this.mGroupMemberRoutes, memberRoutes);
            this.mGroupMemberRoutes.addAll(0, this.mGroupMemberRoutesAdded);
            this.mGroupMemberRoutes.removeAll(this.mGroupMemberRoutesRemoved);
            this.mVolumeGroupAdapter.notifyDataSetChanged();
            if (!z || !this.mIsGroupExpanded || this.mGroupMemberRoutesAdded.size() + this.mGroupMemberRoutesRemoved.size() <= 0) {
                this.mGroupMemberRoutesAdded = null;
                this.mGroupMemberRoutesRemoved = null;
                return;
            }
            animateGroupListItems(hashMap, hashMap2);
        }
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
            this.mState = this.mMediaController.mo141c();
            updateArtIconIfNeeded();
            update(false);
        }
    }

    private void updateMediaControlVisibility(boolean z) {
        int i;
        View view = this.mDividerView;
        int i2 = 0;
        if (this.mVolumeControlLayout.getVisibility() != 0 || !z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        LinearLayout linearLayout = this.mMediaMainControlLayout;
        if (this.mVolumeControlLayout.getVisibility() == 8 && !z) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updatePlaybackControlLayout() {
        /*
            r8 = this;
            boolean r0 = r8.canShowPlaybackControlLayout()
            if (r0 == 0) goto L_0x00ea
            android.support.v4.media.MediaDescriptionCompat r0 = r8.mDescription
            r1 = 0
            if (r0 != 0) goto L_0x000d
            r0 = r1
            goto L_0x0011
        L_0x000d:
            java.lang.CharSequence r0 = r0.mo99g()
        L_0x0011:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 1
            r2 = r2 ^ r3
            android.support.v4.media.MediaDescriptionCompat r4 = r8.mDescription
            if (r4 != 0) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            java.lang.CharSequence r1 = r4.mo98f()
        L_0x0020:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            r4 = r4 ^ r3
            androidx.mediarouter.media.MediaRouter$RouteInfo r5 = r8.mRoute
            int r5 = r5.getPresentationDisplayId()
            r6 = -1
            r7 = 0
            if (r5 == r6) goto L_0x0039
            android.widget.TextView r0 = r8.mTitleView
            int r1 = androidx.mediarouter.C2410R.string.mr_controller_casting_screen
            r0.setText(r1)
        L_0x0036:
            r0 = r3
        L_0x0037:
            r1 = r7
            goto L_0x006b
        L_0x0039:
            android.support.v4.media.session.PlaybackStateCompat r5 = r8.mState
            if (r5 == 0) goto L_0x0063
            int r5 = r5.mo376g()
            if (r5 != 0) goto L_0x0044
            goto L_0x0063
        L_0x0044:
            if (r2 != 0) goto L_0x0050
            if (r4 != 0) goto L_0x0050
            android.widget.TextView r0 = r8.mTitleView
            int r1 = androidx.mediarouter.C2410R.string.mr_controller_no_info_available
            r0.setText(r1)
            goto L_0x0036
        L_0x0050:
            if (r2 == 0) goto L_0x0059
            android.widget.TextView r2 = r8.mTitleView
            r2.setText(r0)
            r0 = r3
            goto L_0x005a
        L_0x0059:
            r0 = r7
        L_0x005a:
            if (r4 == 0) goto L_0x0037
            android.widget.TextView r2 = r8.mSubtitleView
            r2.setText(r1)
            r1 = r3
            goto L_0x006b
        L_0x0063:
            android.widget.TextView r0 = r8.mTitleView
            int r1 = androidx.mediarouter.C2410R.string.mr_controller_no_media_selected
            r0.setText(r1)
            goto L_0x0036
        L_0x006b:
            android.widget.TextView r2 = r8.mTitleView
            r4 = 8
            if (r0 == 0) goto L_0x0073
            r0 = r7
            goto L_0x0074
        L_0x0073:
            r0 = r4
        L_0x0074:
            r2.setVisibility(r0)
            android.widget.TextView r0 = r8.mSubtitleView
            if (r1 == 0) goto L_0x007d
            r1 = r7
            goto L_0x007e
        L_0x007d:
            r1 = r4
        L_0x007e:
            r0.setVisibility(r1)
            android.support.v4.media.session.PlaybackStateCompat r0 = r8.mState
            if (r0 == 0) goto L_0x00ea
            int r0 = r0.mo376g()
            r1 = 6
            if (r0 == r1) goto L_0x0098
            android.support.v4.media.session.PlaybackStateCompat r0 = r8.mState
            int r0 = r0.mo376g()
            r1 = 3
            if (r0 != r1) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r0 = r7
            goto L_0x0099
        L_0x0098:
            r0 = r3
        L_0x0099:
            android.widget.ImageButton r1 = r8.mPlaybackControlButton
            android.content.Context r1 = r1.getContext()
            if (r0 == 0) goto L_0x00ac
            boolean r2 = r8.isPauseActionSupported()
            if (r2 == 0) goto L_0x00ac
            int r0 = androidx.mediarouter.C2410R.attr.mediaRoutePauseDrawable
            int r2 = androidx.mediarouter.C2410R.string.mr_controller_pause
            goto L_0x00c9
        L_0x00ac:
            if (r0 == 0) goto L_0x00b9
            boolean r2 = r8.isStopActionSupported()
            if (r2 == 0) goto L_0x00b9
            int r0 = androidx.mediarouter.C2410R.attr.mediaRouteStopDrawable
            int r2 = androidx.mediarouter.C2410R.string.mr_controller_stop
            goto L_0x00c9
        L_0x00b9:
            if (r0 != 0) goto L_0x00c6
            boolean r0 = r8.isPlayActionSupported()
            if (r0 == 0) goto L_0x00c6
            int r0 = androidx.mediarouter.C2410R.attr.mediaRoutePlayDrawable
            int r2 = androidx.mediarouter.C2410R.string.mr_controller_play
            goto L_0x00c9
        L_0x00c6:
            r0 = r7
            r2 = r0
            r3 = r2
        L_0x00c9:
            android.widget.ImageButton r5 = r8.mPlaybackControlButton
            if (r3 == 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            r7 = r4
        L_0x00cf:
            r5.setVisibility(r7)
            if (r3 == 0) goto L_0x00ea
            android.widget.ImageButton r3 = r8.mPlaybackControlButton
            int r0 = androidx.mediarouter.app.MediaRouterThemeHelper.getThemeResource(r1, r0)
            r3.setImageResource(r0)
            android.widget.ImageButton r0 = r8.mPlaybackControlButton
            android.content.res.Resources r1 = r1.getResources()
            java.lang.CharSequence r1 = r1.getText(r2)
            r0.setContentDescription(r1)
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteControllerDialog.updatePlaybackControlLayout():void");
    }

    private void updateVolumeControlLayout() {
        int i = 0;
        if (!this.mEnableGroupVolumeUX && isGroup()) {
            this.mVolumeControlLayout.setVisibility(8);
            this.mIsGroupExpanded = true;
            this.mVolumeGroupList.setVisibility(0);
            loadInterpolator();
            updateLayoutHeight(false);
        } else if ((this.mIsGroupExpanded && !this.mEnableGroupVolumeUX) || !isVolumeControlAvailable(this.mRoute)) {
            this.mVolumeControlLayout.setVisibility(8);
        } else if (this.mVolumeControlLayout.getVisibility() == 8) {
            this.mVolumeControlLayout.setVisibility(0);
            this.mVolumeSlider.setMax(this.mRoute.getVolumeMax());
            this.mVolumeSlider.setProgress(this.mRoute.getVolume());
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.mGroupExpandCollapseButton;
            if (!isGroup()) {
                i = 8;
            }
            mediaRouteExpandCollapseButton.setVisibility(i);
        }
    }

    private static boolean uriEquals(Uri uri, Uri uri2) {
        if (uri != null && uri.equals(uri2)) {
            return true;
        }
        if (uri == null && uri2 == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void animateGroupListItemsInternal(Map<MediaRouter.RouteInfo, Rect> map, Map<MediaRouter.RouteInfo, BitmapDrawable> map2) {
        OverlayListView.OverlayObject overlayObject;
        int i;
        Map<MediaRouter.RouteInfo, Rect> map3 = map;
        Set<MediaRouter.RouteInfo> set = this.mGroupMemberRoutesAdded;
        if (set != null && this.mGroupMemberRoutesRemoved != null) {
            int size = set.size() - this.mGroupMemberRoutesRemoved.size();
            C24299 r3 = new Animation.AnimationListener() {
                public void onAnimationStart(Animation animation) {
                    MediaRouteControllerDialog.this.mVolumeGroupList.startAnimationAll();
                    MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
                    mediaRouteControllerDialog.mVolumeGroupList.postDelayed(mediaRouteControllerDialog.mGroupListFadeInAnimation, (long) mediaRouteControllerDialog.mGroupListAnimationDurationMs);
                }

                public void onAnimationEnd(Animation animation) {
                }

                public void onAnimationRepeat(Animation animation) {
                }
            };
            int firstVisiblePosition = this.mVolumeGroupList.getFirstVisiblePosition();
            boolean z = false;
            for (int i2 = 0; i2 < this.mVolumeGroupList.getChildCount(); i2++) {
                View childAt = this.mVolumeGroupList.getChildAt(i2);
                MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) this.mVolumeGroupAdapter.getItem(firstVisiblePosition + i2);
                Rect rect = map3.get(routeInfo);
                int top = childAt.getTop();
                if (rect != null) {
                    i = rect.top;
                } else {
                    i = (this.mVolumeGroupListItemHeight * size) + top;
                }
                AnimationSet animationSet = new AnimationSet(true);
                Set<MediaRouter.RouteInfo> set2 = this.mGroupMemberRoutesAdded;
                if (set2 != null && set2.contains(routeInfo)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration((long) this.mGroupListFadeInDurationMs);
                    animationSet.addAnimation(alphaAnimation);
                    i = top;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (i - top), 0.0f);
                translateAnimation.setDuration((long) this.mGroupListAnimationDurationMs);
                animationSet.addAnimation(translateAnimation);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                animationSet.setInterpolator(this.mInterpolator);
                if (!z) {
                    animationSet.setAnimationListener(r3);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
                map3.remove(routeInfo);
                map2.remove(routeInfo);
            }
            Map<MediaRouter.RouteInfo, BitmapDrawable> map4 = map2;
            for (Map.Entry next : map2.entrySet()) {
                final MediaRouter.RouteInfo routeInfo2 = (MediaRouter.RouteInfo) next.getKey();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) next.getValue();
                Rect rect2 = map3.get(routeInfo2);
                if (this.mGroupMemberRoutesRemoved.contains(routeInfo2)) {
                    overlayObject = new OverlayListView.OverlayObject(bitmapDrawable, rect2).setAlphaAnimation(1.0f, 0.0f).setDuration((long) this.mGroupListFadeOutDurationMs).setInterpolator(this.mInterpolator);
                } else {
                    overlayObject = new OverlayListView.OverlayObject(bitmapDrawable, rect2).setTranslateYAnimation(this.mVolumeGroupListItemHeight * size).setDuration((long) this.mGroupListAnimationDurationMs).setInterpolator(this.mInterpolator).setAnimationEndListener(new OverlayListView.OverlayObject.OnAnimationEndListener() {
                        public void onAnimationEnd() {
                            MediaRouteControllerDialog.this.mGroupMemberRoutesAnimatingWithBitmap.remove(routeInfo2);
                            MediaRouteControllerDialog.this.mVolumeGroupAdapter.notifyDataSetChanged();
                        }
                    });
                    this.mGroupMemberRoutesAnimatingWithBitmap.add(routeInfo2);
                }
                this.mVolumeGroupList.addOverlayObject(overlayObject);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void clearGroupListAnimation(boolean z) {
        Set<MediaRouter.RouteInfo> set;
        int firstVisiblePosition = this.mVolumeGroupList.getFirstVisiblePosition();
        for (int i = 0; i < this.mVolumeGroupList.getChildCount(); i++) {
            View childAt = this.mVolumeGroupList.getChildAt(i);
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) this.mVolumeGroupAdapter.getItem(firstVisiblePosition + i);
            if (!z || (set = this.mGroupMemberRoutesAdded) == null || !set.contains(routeInfo)) {
                ((LinearLayout) childAt.findViewById(C2410R.C2413id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        this.mVolumeGroupList.stopAnimationAll();
        if (!z) {
            finishAnimation(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void clearLoadedBitmap() {
        this.mArtIconIsLoaded = false;
        this.mArtIconLoadedBitmap = null;
        this.mArtIconBackgroundColor = 0;
    }

    /* access modifiers changed from: package-private */
    public void finishAnimation(boolean z) {
        this.mGroupMemberRoutesAdded = null;
        this.mGroupMemberRoutesRemoved = null;
        this.mIsGroupListAnimating = false;
        if (this.mIsGroupListAnimationPending) {
            this.mIsGroupListAnimationPending = false;
            updateLayoutHeight(z);
        }
        this.mVolumeGroupList.setEnabled(true);
    }

    /* access modifiers changed from: package-private */
    public int getDesiredArtHeight(int i, int i2) {
        if (i >= i2) {
            return (int) (((((float) this.mDialogContentWidth) * ((float) i2)) / ((float) i)) + 0.5f);
        }
        return (int) (((((float) this.mDialogContentWidth) * 9.0f) / 16.0f) + 0.5f);
    }

    @Nullable
    public View getMediaControlView() {
        return this.mCustomControlView;
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
    public MediaRouter.RouteInfo getRoute() {
        return this.mRoute;
    }

    /* access modifiers changed from: package-private */
    public boolean isPauseActionSupported() {
        if ((this.mState.mo370b() & 514) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean isPlayActionSupported() {
        if ((this.mState.mo370b() & 516) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean isStopActionSupported() {
        if ((this.mState.mo370b() & 1) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean isVolumeControlAvailable(MediaRouter.RouteInfo routeInfo) {
        if (!this.mVolumeControlEnabled || routeInfo.getVolumeHandling() != 1) {
            return false;
        }
        return true;
    }

    public boolean isVolumeControlEnabled() {
        return this.mVolumeControlEnabled;
    }

    /* access modifiers changed from: package-private */
    public void loadInterpolator() {
        Interpolator interpolator;
        if (this.mIsGroupExpanded) {
            interpolator = this.mLinearOutSlowInInterpolator;
        } else {
            interpolator = this.mFastOutSlowInInterpolator;
        }
        this.mInterpolator = interpolator;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        this.mRouter.addCallback(MediaRouteSelector.EMPTY, this.mCallback, 2);
        setMediaSession(this.mRouter.getMediaSessionToken());
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(17170445);
        setContentView(C2410R.C2415layout.mr_controller_material_dialog_b);
        findViewById(BUTTON_NEUTRAL_RES_ID).setVisibility(8);
        ClickListener clickListener = new ClickListener();
        FrameLayout frameLayout = (FrameLayout) findViewById(C2410R.C2413id.mr_expandable_area);
        this.mExpandableAreaLayout = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MediaRouteControllerDialog.this.dismiss();
            }
        });
        LinearLayout linearLayout = (LinearLayout) findViewById(C2410R.C2413id.mr_dialog_area);
        this.mDialogAreaLayout = linearLayout;
        linearLayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        int buttonTextColor = MediaRouterThemeHelper.getButtonTextColor(this.mContext);
        Button button = (Button) findViewById(BUTTON_DISCONNECT_RES_ID);
        this.mDisconnectButton = button;
        button.setText(C2410R.string.mr_controller_disconnect);
        this.mDisconnectButton.setTextColor(buttonTextColor);
        this.mDisconnectButton.setOnClickListener(clickListener);
        Button button2 = (Button) findViewById(BUTTON_STOP_RES_ID);
        this.mStopCastingButton = button2;
        button2.setText(C2410R.string.mr_controller_stop_casting);
        this.mStopCastingButton.setTextColor(buttonTextColor);
        this.mStopCastingButton.setOnClickListener(clickListener);
        this.mRouteNameTextView = (TextView) findViewById(C2410R.C2413id.mr_name);
        ImageButton imageButton = (ImageButton) findViewById(C2410R.C2413id.mr_close);
        this.mCloseButton = imageButton;
        imageButton.setOnClickListener(clickListener);
        this.mCustomControlLayout = (FrameLayout) findViewById(C2410R.C2413id.mr_custom_control);
        this.mDefaultControlLayout = (FrameLayout) findViewById(C2410R.C2413id.mr_default_control);
        C24244 r2 = new View.OnClickListener() {
            public void onClick(View view) {
                PendingIntent d;
                MediaControllerCompat mediaControllerCompat = MediaRouteControllerDialog.this.mMediaController;
                if (mediaControllerCompat != null && (d = mediaControllerCompat.mo142d()) != null) {
                    try {
                        d.send();
                        MediaRouteControllerDialog.this.dismiss();
                    } catch (PendingIntent.CanceledException unused) {
                        Log.e(MediaRouteControllerDialog.TAG, d + " was not sent, it had been canceled.");
                    }
                }
            }
        };
        ImageView imageView = (ImageView) findViewById(C2410R.C2413id.mr_art);
        this.mArtView = imageView;
        imageView.setOnClickListener(r2);
        findViewById(C2410R.C2413id.mr_control_title_container).setOnClickListener(r2);
        this.mMediaMainControlLayout = (LinearLayout) findViewById(C2410R.C2413id.mr_media_main_control);
        this.mDividerView = findViewById(C2410R.C2413id.mr_control_divider);
        this.mPlaybackControlLayout = (RelativeLayout) findViewById(C2410R.C2413id.mr_playback_control);
        this.mTitleView = (TextView) findViewById(C2410R.C2413id.mr_control_title);
        this.mSubtitleView = (TextView) findViewById(C2410R.C2413id.mr_control_subtitle);
        ImageButton imageButton2 = (ImageButton) findViewById(C2410R.C2413id.mr_control_playback_ctrl);
        this.mPlaybackControlButton = imageButton2;
        imageButton2.setOnClickListener(clickListener);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(C2410R.C2413id.mr_volume_control);
        this.mVolumeControlLayout = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(C2410R.C2413id.mr_volume_slider);
        this.mVolumeSlider = seekBar;
        seekBar.setTag(this.mRoute);
        VolumeChangeListener volumeChangeListener = new VolumeChangeListener();
        this.mVolumeChangeListener = volumeChangeListener;
        this.mVolumeSlider.setOnSeekBarChangeListener(volumeChangeListener);
        this.mVolumeGroupList = (OverlayListView) findViewById(C2410R.C2413id.mr_volume_group_list);
        this.mGroupMemberRoutes = new ArrayList();
        VolumeGroupAdapter volumeGroupAdapter = new VolumeGroupAdapter(this.mVolumeGroupList.getContext(), this.mGroupMemberRoutes);
        this.mVolumeGroupAdapter = volumeGroupAdapter;
        this.mVolumeGroupList.setAdapter(volumeGroupAdapter);
        this.mGroupMemberRoutesAnimatingWithBitmap = new HashSet();
        MediaRouterThemeHelper.setMediaControlsBackgroundColor(this.mContext, this.mMediaMainControlLayout, this.mVolumeGroupList, isGroup());
        MediaRouterThemeHelper.setVolumeSliderColor(this.mContext, (MediaRouteVolumeSlider) this.mVolumeSlider, this.mMediaMainControlLayout);
        HashMap hashMap = new HashMap();
        this.mVolumeSliderMap = hashMap;
        hashMap.put(this.mRoute, this.mVolumeSlider);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(C2410R.C2413id.mr_group_expand_collapse);
        this.mGroupExpandCollapseButton = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
                boolean z = !mediaRouteControllerDialog.mIsGroupExpanded;
                mediaRouteControllerDialog.mIsGroupExpanded = z;
                if (z) {
                    mediaRouteControllerDialog.mVolumeGroupList.setVisibility(0);
                }
                MediaRouteControllerDialog.this.loadInterpolator();
                MediaRouteControllerDialog.this.updateLayoutHeight(true);
            }
        });
        loadInterpolator();
        this.mGroupListAnimationDurationMs = this.mContext.getResources().getInteger(C2410R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.mGroupListFadeInDurationMs = this.mContext.getResources().getInteger(C2410R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.mGroupListFadeOutDurationMs = this.mContext.getResources().getInteger(C2410R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        View onCreateMediaControlView = onCreateMediaControlView(bundle);
        this.mCustomControlView = onCreateMediaControlView;
        if (onCreateMediaControlView != null) {
            this.mCustomControlLayout.addView(onCreateMediaControlView);
            this.mCustomControlLayout.setVisibility(0);
        }
        this.mCreated = true;
        updateLayout();
    }

    @Nullable
    public View onCreateMediaControlView(@Nullable Bundle bundle) {
        return null;
    }

    public void onDetachedFromWindow() {
        this.mRouter.removeCallback(this.mCallback);
        setMediaSession((MediaSessionCompat.Token) null);
        this.mAttachedToWindow = false;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        int i2;
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.mEnableGroupVolumeUX || !this.mIsGroupExpanded) {
            MediaRouter.RouteInfo routeInfo = this.mRoute;
            if (i == 25) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            routeInfo.requestUpdateVolume(i2);
        }
        return true;
    }

    public boolean onKeyUp(int i, @NonNull KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setVolumeControlEnabled(boolean z) {
        if (this.mVolumeControlEnabled != z) {
            this.mVolumeControlEnabled = z;
            if (this.mCreated) {
                update(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void startGroupListFadeInAnimation() {
        clearGroupListAnimation(true);
        this.mVolumeGroupList.requestLayout();
        this.mVolumeGroupList.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                MediaRouteControllerDialog.this.mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                MediaRouteControllerDialog.this.startGroupListFadeInAnimationInternal();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void startGroupListFadeInAnimationInternal() {
        Set<MediaRouter.RouteInfo> set = this.mGroupMemberRoutesAdded;
        if (set == null || set.size() == 0) {
            finishAnimation(true);
        } else {
            fadeInAddedRoutes();
        }
    }

    /* access modifiers changed from: package-private */
    public void update(boolean z) {
        if (this.mRouteInVolumeSliderTouched != null) {
            this.mHasPendingUpdate = true;
            this.mPendingUpdateAnimationNeeded = z | this.mPendingUpdateAnimationNeeded;
            return;
        }
        int i = 0;
        this.mHasPendingUpdate = false;
        this.mPendingUpdateAnimationNeeded = false;
        if (!this.mRoute.isSelected() || this.mRoute.isDefaultOrBluetooth()) {
            dismiss();
        } else if (this.mCreated) {
            this.mRouteNameTextView.setText(this.mRoute.getName());
            Button button = this.mDisconnectButton;
            if (!this.mRoute.canDisconnect()) {
                i = 8;
            }
            button.setVisibility(i);
            if (this.mCustomControlView == null && this.mArtIconIsLoaded) {
                if (isBitmapRecycled(this.mArtIconLoadedBitmap)) {
                    Log.w(TAG, "Can't set artwork image with recycled bitmap: " + this.mArtIconLoadedBitmap);
                } else {
                    this.mArtView.setImageBitmap(this.mArtIconLoadedBitmap);
                    this.mArtView.setBackgroundColor(this.mArtIconBackgroundColor);
                }
                clearLoadedBitmap();
            }
            updateVolumeControlLayout();
            updatePlaybackControlLayout();
            updateLayoutHeight(z);
        }
    }

    /* access modifiers changed from: package-private */
    public void updateArtIconIfNeeded() {
        if (this.mCustomControlView == null && isIconChanged()) {
            if (!isGroup() || this.mEnableGroupVolumeUX) {
                FetchArtTask fetchArtTask = this.mFetchArtTask;
                if (fetchArtTask != null) {
                    fetchArtTask.cancel(true);
                }
                FetchArtTask fetchArtTask2 = new FetchArtTask();
                this.mFetchArtTask = fetchArtTask2;
                fetchArtTask2.execute(new Void[0]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void updateLayout() {
        int dialogWidth = MediaRouteDialogHelper.getDialogWidth(this.mContext);
        getWindow().setLayout(dialogWidth, -2);
        View decorView = getWindow().getDecorView();
        this.mDialogContentWidth = (dialogWidth - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.mContext.getResources();
        this.mVolumeGroupListItemIconSize = resources.getDimensionPixelSize(C2410R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.mVolumeGroupListItemHeight = resources.getDimensionPixelSize(C2410R.dimen.mr_controller_volume_group_list_item_height);
        this.mVolumeGroupListMaxHeight = resources.getDimensionPixelSize(C2410R.dimen.mr_controller_volume_group_list_max_height);
        this.mArtIconBitmap = null;
        this.mArtIconUri = null;
        updateArtIconIfNeeded();
        update(false);
    }

    /* access modifiers changed from: package-private */
    public void updateLayoutHeight(final boolean z) {
        this.mDefaultControlLayout.requestLayout();
        this.mDefaultControlLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                MediaRouteControllerDialog.this.mDefaultControlLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
                if (mediaRouteControllerDialog.mIsGroupListAnimating) {
                    mediaRouteControllerDialog.mIsGroupListAnimationPending = true;
                } else {
                    mediaRouteControllerDialog.updateLayoutHeightInternal(z);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void updateLayoutHeightInternal(boolean z) {
        int i;
        int i2;
        boolean z2;
        Bitmap bitmap;
        ImageView.ScaleType scaleType;
        int layoutHeight = getLayoutHeight(this.mMediaMainControlLayout);
        setLayoutHeight(this.mMediaMainControlLayout, -1);
        updateMediaControlVisibility(canShowPlaybackControlLayout());
        View decorView = getWindow().getDecorView();
        boolean z3 = false;
        decorView.measure(View.MeasureSpec.makeMeasureSpec(getWindow().getAttributes().width, BasicMeasure.EXACTLY), 0);
        setLayoutHeight(this.mMediaMainControlLayout, layoutHeight);
        if (this.mCustomControlView != null || !(this.mArtView.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) this.mArtView.getDrawable()).getBitmap()) == null) {
            i = 0;
        } else {
            i = getDesiredArtHeight(bitmap.getWidth(), bitmap.getHeight());
            ImageView imageView = this.mArtView;
            if (bitmap.getWidth() >= bitmap.getHeight()) {
                scaleType = ImageView.ScaleType.FIT_XY;
            } else {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            imageView.setScaleType(scaleType);
        }
        int mainControllerHeight = getMainControllerHeight(canShowPlaybackControlLayout());
        int size = this.mGroupMemberRoutes.size();
        if (isGroup()) {
            i2 = this.mVolumeGroupListItemHeight * this.mRoute.getMemberRoutes().size();
        } else {
            i2 = 0;
        }
        if (size > 0) {
            i2 += this.mVolumeGroupListPaddingTop;
        }
        int min = Math.min(i2, this.mVolumeGroupListMaxHeight);
        if (!this.mIsGroupExpanded) {
            min = 0;
        }
        int max = Math.max(i, min) + mainControllerHeight;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (this.mDialogAreaLayout.getMeasuredHeight() - this.mDefaultControlLayout.getMeasuredHeight());
        if (this.mCustomControlView != null || i <= 0 || max > height) {
            if (getLayoutHeight(this.mVolumeGroupList) + this.mMediaMainControlLayout.getMeasuredHeight() >= this.mDefaultControlLayout.getMeasuredHeight()) {
                this.mArtView.setVisibility(8);
            }
            max = min + mainControllerHeight;
            i = 0;
        } else {
            this.mArtView.setVisibility(0);
            setLayoutHeight(this.mArtView, i);
        }
        if (!canShowPlaybackControlLayout() || max > height) {
            this.mPlaybackControlLayout.setVisibility(8);
        } else {
            this.mPlaybackControlLayout.setVisibility(0);
        }
        if (this.mPlaybackControlLayout.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        updateMediaControlVisibility(z2);
        if (this.mPlaybackControlLayout.getVisibility() == 0) {
            z3 = true;
        }
        int mainControllerHeight2 = getMainControllerHeight(z3);
        int max2 = Math.max(i, min) + mainControllerHeight2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        this.mMediaMainControlLayout.clearAnimation();
        this.mVolumeGroupList.clearAnimation();
        this.mDefaultControlLayout.clearAnimation();
        if (z) {
            animateLayoutHeight(this.mMediaMainControlLayout, mainControllerHeight2);
            animateLayoutHeight(this.mVolumeGroupList, min);
            animateLayoutHeight(this.mDefaultControlLayout, height);
        } else {
            setLayoutHeight(this.mMediaMainControlLayout, mainControllerHeight2);
            setLayoutHeight(this.mVolumeGroupList, min);
            setLayoutHeight(this.mDefaultControlLayout, height);
        }
        setLayoutHeight(this.mExpandableAreaLayout, rect.height());
        rebuildVolumeGroupList(z);
    }

    /* access modifiers changed from: package-private */
    public void updateVolumeGroupItemHeight(View view) {
        setLayoutHeight((LinearLayout) view.findViewById(C2410R.C2413id.volume_item_container), this.mVolumeGroupListItemHeight);
        View findViewById = view.findViewById(C2410R.C2413id.mr_volume_item_icon);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        int i = this.mVolumeGroupListItemIconSize;
        layoutParams.width = i;
        layoutParams.height = i;
        findViewById.setLayoutParams(layoutParams);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaRouteControllerDialog(@androidx.annotation.NonNull android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 1
            android.content.Context r2 = androidx.mediarouter.app.MediaRouterThemeHelper.createThemedDialogContext(r2, r3, r0)
            int r3 = androidx.mediarouter.app.MediaRouterThemeHelper.createThemedDialogStyle(r2)
            r1.<init>(r2, r3)
            r1.mVolumeControlEnabled = r0
            androidx.mediarouter.app.MediaRouteControllerDialog$1 r3 = new androidx.mediarouter.app.MediaRouteControllerDialog$1
            r3.<init>()
            r1.mGroupListFadeInAnimation = r3
            android.content.Context r3 = r1.getContext()
            r1.mContext = r3
            androidx.mediarouter.app.MediaRouteControllerDialog$MediaControllerCallback r3 = new androidx.mediarouter.app.MediaRouteControllerDialog$MediaControllerCallback
            r3.<init>()
            r1.mControllerCallback = r3
            android.content.Context r3 = r1.mContext
            androidx.mediarouter.media.MediaRouter r3 = androidx.mediarouter.media.MediaRouter.getInstance(r3)
            r1.mRouter = r3
            boolean r0 = androidx.mediarouter.media.MediaRouter.isGroupVolumeUxEnabled()
            r1.mEnableGroupVolumeUX = r0
            androidx.mediarouter.app.MediaRouteControllerDialog$MediaRouterCallback r0 = new androidx.mediarouter.app.MediaRouteControllerDialog$MediaRouterCallback
            r0.<init>()
            r1.mCallback = r0
            androidx.mediarouter.media.MediaRouter$RouteInfo r0 = r3.getSelectedRoute()
            r1.mRoute = r0
            android.support.v4.media.session.MediaSessionCompat$Token r3 = r3.getMediaSessionToken()
            r1.setMediaSession(r3)
            android.content.Context r3 = r1.mContext
            android.content.res.Resources r3 = r3.getResources()
            int r0 = androidx.mediarouter.C2410R.dimen.mr_controller_volume_group_list_padding_top
            int r3 = r3.getDimensionPixelSize(r0)
            r1.mVolumeGroupListPaddingTop = r3
            android.content.Context r3 = r1.mContext
            java.lang.String r0 = "accessibility"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            r1.mAccessibilityManager = r3
            int r3 = androidx.mediarouter.C2410R.C2414interpolator.mr_linear_out_slow_in
            android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r2, r3)
            r1.mLinearOutSlowInInterpolator = r3
            int r3 = androidx.mediarouter.C2410R.C2414interpolator.mr_fast_out_slow_in
            android.view.animation.Interpolator r2 = android.view.animation.AnimationUtils.loadInterpolator(r2, r3)
            r1.mFastOutSlowInInterpolator = r2
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            r1.mAccelerateDecelerateInterpolator = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteControllerDialog.<init>(android.content.Context, int):void");
    }
}
