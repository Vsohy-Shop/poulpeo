package androidx.media.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat;
import androidx.media.C2391R;

public class NotificationCompat {

    @RequiresApi(15)
    private static class Api15Impl {
        private Api15Impl() {
        }

        @DoNotInline
        static void setContentDescription(RemoteViews remoteViews, int i, CharSequence charSequence) {
            remoteViews.setContentDescription(i, charSequence);
        }
    }

    @RequiresApi(21)
    private static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static Notification.MediaStyle createMediaStyle() {
            return new Notification.MediaStyle();
        }

        @DoNotInline
        static Notification.MediaStyle fillInMediaStyle(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
            if (iArr != null) {
                setShowActionsInCompactView(mediaStyle, iArr);
            }
            if (token != null) {
                setMediaSession(mediaStyle, (MediaSession.Token) token.mo230e());
            }
            return mediaStyle;
        }

        @DoNotInline
        static void setMediaSession(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
            mediaStyle.setMediaSession(token);
        }

        @DoNotInline
        static void setMediaStyle(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
            builder.setStyle(mediaStyle);
        }

        @DoNotInline
        static void setShowActionsInCompactView(Notification.MediaStyle mediaStyle, int... iArr) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
    }

    @RequiresApi(24)
    private static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static Notification.DecoratedMediaCustomViewStyle createDecoratedMediaCustomViewStyle() {
            return new Notification.DecoratedMediaCustomViewStyle();
        }
    }

    public static class DecoratedMediaCustomViewStyle extends MediaStyle {
        private void setBackgroundColor(RemoteViews remoteViews) {
            int i;
            if (this.mBuilder.getColor() != 0) {
                i = this.mBuilder.getColor();
            } else {
                i = this.mBuilder.mContext.getResources().getColor(C2391R.C2392color.notification_material_background_media_default_color);
            }
            remoteViews.setInt(C2391R.C2393id.status_bar_latest_event_content, "setBackgroundColor", i);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Api21Impl.setMediaStyle(notificationBuilderWithBuilderAccessor.getBuilder(), Api21Impl.fillInMediaStyle(Api24Impl.createDecoratedMediaCustomViewStyle(), this.mActionsToShowInCompact, this.mToken));
        }

        /* access modifiers changed from: package-private */
        public int getBigContentViewLayoutResource(int i) {
            if (i <= 3) {
                return C2391R.C2394layout.notification_template_big_media_narrow_custom;
            }
            return C2391R.C2394layout.notification_template_big_media_custom;
        }

        /* access modifiers changed from: package-private */
        public int getContentViewLayoutResource() {
            if (this.mBuilder.getContentView() != null) {
                return C2391R.C2394layout.notification_template_media_custom;
            }
            return super.getContentViewLayoutResource();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }
    }

    private NotificationCompat() {
    }

    public static class MediaStyle extends NotificationCompat.Style {
        private static final int MAX_MEDIA_BUTTONS = 5;
        private static final int MAX_MEDIA_BUTTONS_IN_COMPACT = 3;
        int[] mActionsToShowInCompact = null;
        PendingIntent mCancelButtonIntent;
        boolean mShowCancelButton;
        MediaSessionCompat.Token mToken;

        public MediaStyle() {
        }

        private RemoteViews generateMediaActionButton(NotificationCompat.Action action) {
            boolean z;
            if (action.getActionIntent() == null) {
                z = true;
            } else {
                z = false;
            }
            RemoteViews remoteViews = new RemoteViews(this.mBuilder.mContext.getPackageName(), C2391R.C2394layout.notification_media_action);
            int i = C2391R.C2393id.action0;
            remoteViews.setImageViewResource(i, action.getIcon());
            if (!z) {
                remoteViews.setOnClickPendingIntent(i, action.getActionIntent());
            }
            Api15Impl.setContentDescription(remoteViews, i, action.getTitle());
            return remoteViews;
        }

        public static MediaSessionCompat.Token getMediaSession(Notification notification) {
            Parcelable parcelable;
            Bundle extras = androidx.core.app.NotificationCompat.getExtras(notification);
            if (extras == null || (parcelable = extras.getParcelable(androidx.core.app.NotificationCompat.EXTRA_MEDIA_SESSION)) == null) {
                return null;
            }
            return MediaSessionCompat.Token.m191a(parcelable);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Api21Impl.setMediaStyle(notificationBuilderWithBuilderAccessor.getBuilder(), Api21Impl.fillInMediaStyle(Api21Impl.createMediaStyle(), this.mActionsToShowInCompact, this.mToken));
        }

        /* access modifiers changed from: package-private */
        public RemoteViews generateBigContentView() {
            int min = Math.min(this.mBuilder.mActions.size(), 5);
            RemoteViews applyStandardTemplate = applyStandardTemplate(false, getBigContentViewLayoutResource(min), false);
            applyStandardTemplate.removeAllViews(C2391R.C2393id.media_actions);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    applyStandardTemplate.addView(C2391R.C2393id.media_actions, generateMediaActionButton(this.mBuilder.mActions.get(i)));
                }
            }
            if (this.mShowCancelButton) {
                int i2 = C2391R.C2393id.cancel_action;
                applyStandardTemplate.setViewVisibility(i2, 0);
                applyStandardTemplate.setInt(i2, "setAlpha", this.mBuilder.mContext.getResources().getInteger(C2391R.integer.cancel_button_image_alpha));
                applyStandardTemplate.setOnClickPendingIntent(i2, this.mCancelButtonIntent);
            } else {
                applyStandardTemplate.setViewVisibility(C2391R.C2393id.cancel_action, 8);
            }
            return applyStandardTemplate;
        }

        /* access modifiers changed from: package-private */
        public RemoteViews generateContentView() {
            int i;
            RemoteViews applyStandardTemplate = applyStandardTemplate(false, getContentViewLayoutResource(), true);
            int size = this.mBuilder.mActions.size();
            int[] iArr = this.mActionsToShowInCompact;
            if (iArr == null) {
                i = 0;
            } else {
                i = Math.min(iArr.length, 3);
            }
            applyStandardTemplate.removeAllViews(C2391R.C2393id.media_actions);
            if (i > 0) {
                int i2 = 0;
                while (i2 < i) {
                    if (i2 < size) {
                        applyStandardTemplate.addView(C2391R.C2393id.media_actions, generateMediaActionButton(this.mBuilder.mActions.get(this.mActionsToShowInCompact[i2])));
                        i2++;
                    } else {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(size - 1)}));
                    }
                }
            }
            if (this.mShowCancelButton) {
                applyStandardTemplate.setViewVisibility(C2391R.C2393id.end_padder, 8);
                int i3 = C2391R.C2393id.cancel_action;
                applyStandardTemplate.setViewVisibility(i3, 0);
                applyStandardTemplate.setOnClickPendingIntent(i3, this.mCancelButtonIntent);
                applyStandardTemplate.setInt(i3, "setAlpha", this.mBuilder.mContext.getResources().getInteger(C2391R.integer.cancel_button_image_alpha));
            } else {
                applyStandardTemplate.setViewVisibility(C2391R.C2393id.end_padder, 0);
                applyStandardTemplate.setViewVisibility(C2391R.C2393id.cancel_action, 8);
            }
            return applyStandardTemplate;
        }

        /* access modifiers changed from: package-private */
        public int getBigContentViewLayoutResource(int i) {
            if (i <= 3) {
                return C2391R.C2394layout.notification_template_big_media_narrow;
            }
            return C2391R.C2394layout.notification_template_big_media;
        }

        /* access modifiers changed from: package-private */
        public int getContentViewLayoutResource() {
            return C2391R.C2394layout.notification_template_media;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public MediaStyle setCancelButtonIntent(PendingIntent pendingIntent) {
            this.mCancelButtonIntent = pendingIntent;
            return this;
        }

        public MediaStyle setMediaSession(MediaSessionCompat.Token token) {
            this.mToken = token;
            return this;
        }

        public MediaStyle setShowActionsInCompactView(int... iArr) {
            this.mActionsToShowInCompact = iArr;
            return this;
        }

        public MediaStyle(NotificationCompat.Builder builder) {
            setBuilder(builder);
        }

        public MediaStyle setShowCancelButton(boolean z) {
            return this;
        }
    }
}
