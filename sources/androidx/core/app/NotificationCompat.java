package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.C1318R;
import androidx.core.app.Person;
import androidx.core.content.LocusIdCompat;
import androidx.core.content.p003pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_WORKOUT = "workout";
    @ColorInt
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    public static final String EXTRA_COLORIZED = "android.colorized";
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final String EXTRA_MESSAGES = "android.messages";
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";
    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";
    public static final String EXTRA_PICTURE = "android.picture";
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";
    public static final String EXTRA_PROGRESS = "android.progress";
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final String EXTRA_SMALL_ICON = "android.icon";
    public static final String EXTRA_SUB_TEXT = "android.subText";
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final String EXTRA_TEMPLATE = "android.template";
    public static final String EXTRA_TEXT = "android.text";
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    public static final String EXTRA_TITLE = "android.title";
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;
    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    public static class Action {
        static final String EXTRA_SEMANTIC_ACTION = "android.support.action.semanticAction";
        static final String EXTRA_SHOWS_USER_INTERFACE = "android.support.action.showsUserInterface";
        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_CALL = 10;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;
        public PendingIntent actionIntent;
        @Deprecated
        public int icon;
        private boolean mAllowGeneratedReplies;
        private boolean mAuthenticationRequired;
        private final RemoteInput[] mDataOnlyRemoteInputs;
        final Bundle mExtras;
        @Nullable
        private IconCompat mIcon;
        private final boolean mIsContextual;
        private final RemoteInput[] mRemoteInputs;
        private final int mSemanticAction;
        boolean mShowsUserInterface;
        public CharSequence title;

        public static final class Builder {
            private boolean mAllowGeneratedReplies;
            private boolean mAuthenticationRequired;
            private final Bundle mExtras;
            private final IconCompat mIcon;
            private final PendingIntent mIntent;
            private boolean mIsContextual;
            private ArrayList<RemoteInput> mRemoteInputs;
            private int mSemanticAction;
            private boolean mShowsUserInterface;
            private final CharSequence mTitle;

            public Builder(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), (RemoteInput[]) null, true, 0, true, false, false);
            }

            private void checkContextualActionNullFields() {
                if (this.mIsContextual && this.mIntent == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            @RequiresApi(19)
            @NonNull
            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
            public static Builder fromAndroidAction(@NonNull Notification.Action action) {
                Builder builder;
                if (action.getIcon() != null) {
                    builder = new Builder(IconCompat.createFromIcon(action.getIcon()), action.title, action.actionIntent);
                } else {
                    builder = new Builder(action.icon, action.title, action.actionIntent);
                }
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (!(remoteInputs == null || remoteInputs.length == 0)) {
                    for (RemoteInput fromPlatform : remoteInputs) {
                        builder.addRemoteInput(RemoteInput.fromPlatform(fromPlatform));
                    }
                }
                int i = Build.VERSION.SDK_INT;
                builder.mAllowGeneratedReplies = action.getAllowGeneratedReplies();
                if (i >= 28) {
                    builder.setSemanticAction(action.getSemanticAction());
                }
                if (i >= 29) {
                    builder.setContextual(action.isContextual());
                }
                if (i >= 31) {
                    builder.setAuthenticationRequired(action.isAuthenticationRequired());
                }
                return builder;
            }

            @NonNull
            public Builder addExtras(@Nullable Bundle bundle) {
                if (bundle != null) {
                    this.mExtras.putAll(bundle);
                }
                return this;
            }

            @NonNull
            public Builder addRemoteInput(@Nullable RemoteInput remoteInput) {
                if (this.mRemoteInputs == null) {
                    this.mRemoteInputs = new ArrayList<>();
                }
                if (remoteInput != null) {
                    this.mRemoteInputs.add(remoteInput);
                }
                return this;
            }

            /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object[]] */
            /* JADX WARNING: Multi-variable type inference failed */
            @androidx.annotation.NonNull
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public androidx.core.app.NotificationCompat.Action build() {
                /*
                    r17 = this;
                    r0 = r17
                    r17.checkContextualActionNullFields()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.ArrayList<androidx.core.app.RemoteInput> r3 = r0.mRemoteInputs
                    if (r3 == 0) goto L_0x0031
                    java.util.Iterator r3 = r3.iterator()
                L_0x0017:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L_0x0031
                    java.lang.Object r4 = r3.next()
                    androidx.core.app.RemoteInput r4 = (androidx.core.app.RemoteInput) r4
                    boolean r5 = r4.isDataOnly()
                    if (r5 == 0) goto L_0x002d
                    r1.add(r4)
                    goto L_0x0017
                L_0x002d:
                    r2.add(r4)
                    goto L_0x0017
                L_0x0031:
                    boolean r3 = r1.isEmpty()
                    r4 = 0
                    if (r3 == 0) goto L_0x003a
                    r11 = r4
                    goto L_0x0047
                L_0x003a:
                    int r3 = r1.size()
                    androidx.core.app.RemoteInput[] r3 = new androidx.core.app.RemoteInput[r3]
                    java.lang.Object[] r1 = r1.toArray(r3)
                    androidx.core.app.RemoteInput[] r1 = (androidx.core.app.RemoteInput[]) r1
                    r11 = r1
                L_0x0047:
                    boolean r1 = r2.isEmpty()
                    if (r1 == 0) goto L_0x004e
                    goto L_0x005b
                L_0x004e:
                    int r1 = r2.size()
                    androidx.core.app.RemoteInput[] r1 = new androidx.core.app.RemoteInput[r1]
                    java.lang.Object[] r1 = r2.toArray(r1)
                    r4 = r1
                    androidx.core.app.RemoteInput[] r4 = (androidx.core.app.RemoteInput[]) r4
                L_0x005b:
                    r10 = r4
                    androidx.core.app.NotificationCompat$Action r1 = new androidx.core.app.NotificationCompat$Action
                    androidx.core.graphics.drawable.IconCompat r6 = r0.mIcon
                    java.lang.CharSequence r7 = r0.mTitle
                    android.app.PendingIntent r8 = r0.mIntent
                    android.os.Bundle r9 = r0.mExtras
                    boolean r12 = r0.mAllowGeneratedReplies
                    int r13 = r0.mSemanticAction
                    boolean r14 = r0.mShowsUserInterface
                    boolean r15 = r0.mIsContextual
                    boolean r2 = r0.mAuthenticationRequired
                    r5 = r1
                    r16 = r2
                    r5.<init>((androidx.core.graphics.drawable.IconCompat) r6, (java.lang.CharSequence) r7, (android.app.PendingIntent) r8, (android.os.Bundle) r9, (androidx.core.app.RemoteInput[]) r10, (androidx.core.app.RemoteInput[]) r11, (boolean) r12, (int) r13, (boolean) r14, (boolean) r15, (boolean) r16)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.Action.Builder.build():androidx.core.app.NotificationCompat$Action");
            }

            @NonNull
            public Builder extend(@NonNull Extender extender) {
                extender.extend(this);
                return this;
            }

            @NonNull
            public Bundle getExtras() {
                return this.mExtras;
            }

            @NonNull
            public Builder setAllowGeneratedReplies(boolean z) {
                this.mAllowGeneratedReplies = z;
                return this;
            }

            @NonNull
            public Builder setAuthenticationRequired(boolean z) {
                this.mAuthenticationRequired = z;
                return this;
            }

            @NonNull
            public Builder setContextual(boolean z) {
                this.mIsContextual = z;
                return this;
            }

            @NonNull
            public Builder setSemanticAction(int i) {
                this.mSemanticAction = i;
                return this;
            }

            @NonNull
            public Builder setShowsUserInterface(boolean z) {
                this.mShowsUserInterface = z;
                return this;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public Builder(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.createWithResource((Resources) null, "", i) : null, charSequence, pendingIntent, new Bundle(), (RemoteInput[]) null, true, 0, true, false, false);
            }

            public Builder(@NonNull Action action) {
                this(action.getIconCompat(), action.title, action.actionIntent, new Bundle(action.mExtras), action.getRemoteInputs(), action.getAllowGeneratedReplies(), action.getSemanticAction(), action.mShowsUserInterface, action.isContextual(), action.isAuthenticationRequired());
            }

            private Builder(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent, @NonNull Bundle bundle, @Nullable RemoteInput[] remoteInputArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                ArrayList<RemoteInput> arrayList;
                this.mAllowGeneratedReplies = true;
                this.mShowsUserInterface = true;
                this.mIcon = iconCompat;
                this.mTitle = Builder.limitCharSequenceLength(charSequence);
                this.mIntent = pendingIntent;
                this.mExtras = bundle;
                if (remoteInputArr == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(Arrays.asList(remoteInputArr));
                }
                this.mRemoteInputs = arrayList;
                this.mAllowGeneratedReplies = z;
                this.mSemanticAction = i;
                this.mShowsUserInterface = z2;
                this.mIsContextual = z3;
                this.mAuthenticationRequired = z4;
            }
        }

        public interface Extender {
            @NonNull
            Builder extend(@NonNull Builder builder);
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        public static final class WearableExtender implements Extender {
            private static final int DEFAULT_FLAGS = 1;
            private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
            private static final int FLAG_AVAILABLE_OFFLINE = 1;
            private static final int FLAG_HINT_DISPLAY_INLINE = 4;
            private static final int FLAG_HINT_LAUNCHES_ACTIVITY = 2;
            private static final String KEY_CANCEL_LABEL = "cancelLabel";
            private static final String KEY_CONFIRM_LABEL = "confirmLabel";
            private static final String KEY_FLAGS = "flags";
            private static final String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
            private CharSequence mCancelLabel;
            private CharSequence mConfirmLabel;
            private int mFlags = 1;
            private CharSequence mInProgressLabel;

            public WearableExtender() {
            }

            private void setFlag(int i, boolean z) {
                if (z) {
                    this.mFlags = i | this.mFlags;
                    return;
                }
                this.mFlags = (~i) & this.mFlags;
            }

            @NonNull
            public Builder extend(@NonNull Builder builder) {
                Bundle bundle = new Bundle();
                int i = this.mFlags;
                if (i != 1) {
                    bundle.putInt(KEY_FLAGS, i);
                }
                CharSequence charSequence = this.mInProgressLabel;
                if (charSequence != null) {
                    bundle.putCharSequence(KEY_IN_PROGRESS_LABEL, charSequence);
                }
                CharSequence charSequence2 = this.mConfirmLabel;
                if (charSequence2 != null) {
                    bundle.putCharSequence(KEY_CONFIRM_LABEL, charSequence2);
                }
                CharSequence charSequence3 = this.mCancelLabel;
                if (charSequence3 != null) {
                    bundle.putCharSequence(KEY_CANCEL_LABEL, charSequence3);
                }
                builder.getExtras().putBundle(EXTRA_WEARABLE_EXTENSIONS, bundle);
                return builder;
            }

            @Deprecated
            @Nullable
            public CharSequence getCancelLabel() {
                return this.mCancelLabel;
            }

            @Deprecated
            @Nullable
            public CharSequence getConfirmLabel() {
                return this.mConfirmLabel;
            }

            public boolean getHintDisplayActionInline() {
                if ((this.mFlags & 4) != 0) {
                    return true;
                }
                return false;
            }

            public boolean getHintLaunchesActivity() {
                if ((this.mFlags & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Deprecated
            @Nullable
            public CharSequence getInProgressLabel() {
                return this.mInProgressLabel;
            }

            public boolean isAvailableOffline() {
                if ((this.mFlags & 1) != 0) {
                    return true;
                }
                return false;
            }

            @NonNull
            public WearableExtender setAvailableOffline(boolean z) {
                setFlag(1, z);
                return this;
            }

            @NonNull
            @Deprecated
            public WearableExtender setCancelLabel(@Nullable CharSequence charSequence) {
                this.mCancelLabel = charSequence;
                return this;
            }

            @NonNull
            @Deprecated
            public WearableExtender setConfirmLabel(@Nullable CharSequence charSequence) {
                this.mConfirmLabel = charSequence;
                return this;
            }

            @NonNull
            public WearableExtender setHintDisplayActionInline(boolean z) {
                setFlag(4, z);
                return this;
            }

            @NonNull
            public WearableExtender setHintLaunchesActivity(boolean z) {
                setFlag(2, z);
                return this;
            }

            @NonNull
            @Deprecated
            public WearableExtender setInProgressLabel(@Nullable CharSequence charSequence) {
                this.mInProgressLabel = charSequence;
                return this;
            }

            @NonNull
            public WearableExtender clone() {
                WearableExtender wearableExtender = new WearableExtender();
                wearableExtender.mFlags = this.mFlags;
                wearableExtender.mInProgressLabel = this.mInProgressLabel;
                wearableExtender.mConfirmLabel = this.mConfirmLabel;
                wearableExtender.mCancelLabel = this.mCancelLabel;
                return wearableExtender;
            }

            public WearableExtender(@NonNull Action action) {
                Bundle bundle = action.getExtras().getBundle(EXTRA_WEARABLE_EXTENSIONS);
                if (bundle != null) {
                    this.mFlags = bundle.getInt(KEY_FLAGS, 1);
                    this.mInProgressLabel = bundle.getCharSequence(KEY_IN_PROGRESS_LABEL);
                    this.mConfirmLabel = bundle.getCharSequence(KEY_CONFIRM_LABEL);
                    this.mCancelLabel = bundle.getCharSequence(KEY_CANCEL_LABEL);
                }
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Action(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.createWithResource((Resources) null, "", i) : null, charSequence, pendingIntent);
        }

        @Nullable
        public PendingIntent getActionIntent() {
            return this.actionIntent;
        }

        public boolean getAllowGeneratedReplies() {
            return this.mAllowGeneratedReplies;
        }

        @Nullable
        public RemoteInput[] getDataOnlyRemoteInputs() {
            return this.mDataOnlyRemoteInputs;
        }

        @NonNull
        public Bundle getExtras() {
            return this.mExtras;
        }

        @Deprecated
        public int getIcon() {
            return this.icon;
        }

        @Nullable
        public IconCompat getIconCompat() {
            int i;
            if (this.mIcon == null && (i = this.icon) != 0) {
                this.mIcon = IconCompat.createWithResource((Resources) null, "", i);
            }
            return this.mIcon;
        }

        @Nullable
        public RemoteInput[] getRemoteInputs() {
            return this.mRemoteInputs;
        }

        public int getSemanticAction() {
            return this.mSemanticAction;
        }

        public boolean getShowsUserInterface() {
            return this.mShowsUserInterface;
        }

        @Nullable
        public CharSequence getTitle() {
            return this.title;
        }

        public boolean isAuthenticationRequired() {
            return this.mAuthenticationRequired;
        }

        public boolean isContextual() {
            return this.mIsContextual;
        }

        public Action(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (RemoteInput[]) null, (RemoteInput[]) null, true, 0, true, false, false);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        Action(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle, @Nullable RemoteInput[] remoteInputArr, @Nullable RemoteInput[] remoteInputArr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this(i != 0 ? IconCompat.createWithResource((Resources) null, "", i) : null, charSequence, pendingIntent, bundle, remoteInputArr, remoteInputArr2, z, i2, z2, z3, z4);
        }

        Action(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle, @Nullable RemoteInput[] remoteInputArr, @Nullable RemoteInput[] remoteInputArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.mShowsUserInterface = true;
            this.mIcon = iconCompat;
            if (iconCompat != null && iconCompat.getType() == 2) {
                this.icon = iconCompat.getResId();
            }
            this.title = Builder.limitCharSequenceLength(charSequence);
            this.actionIntent = pendingIntent;
            this.mExtras = bundle == null ? new Bundle() : bundle;
            this.mRemoteInputs = remoteInputArr;
            this.mDataOnlyRemoteInputs = remoteInputArr2;
            this.mAllowGeneratedReplies = z;
            this.mSemanticAction = i;
            this.mShowsUserInterface = z2;
            this.mIsContextual = z3;
            this.mAuthenticationRequired = z4;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeIconType {
    }

    public static class BigPictureStyle extends Style {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigPictureStyle";
        private IconCompat mBigLargeIcon;
        private boolean mBigLargeIconSet;
        private CharSequence mPictureContentDescription;
        private IconCompat mPictureIcon;
        private boolean mShowBigPictureWhenCollapsed;

        @RequiresApi(16)
        private static class Api16Impl {
            private Api16Impl() {
            }

            @RequiresApi(16)
            static void setBigLargeIcon(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            @RequiresApi(16)
            static void setSummaryText(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        @RequiresApi(23)
        private static class Api23Impl {
            private Api23Impl() {
            }

            @RequiresApi(23)
            static void setBigLargeIcon(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        @RequiresApi(31)
        private static class Api31Impl {
            private Api31Impl() {
            }

            @RequiresApi(31)
            static void setBigPicture(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                Notification.BigPictureStyle unused = bigPictureStyle.bigPicture(icon);
            }

            @RequiresApi(31)
            static void setContentDescription(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                Notification.BigPictureStyle unused = bigPictureStyle.setContentDescription(charSequence);
            }

            @RequiresApi(31)
            static void showBigPictureWhenCollapsed(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                Notification.BigPictureStyle unused = bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        public BigPictureStyle() {
        }

        @Nullable
        private static IconCompat asIconCompat(@Nullable Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.createFromIcon((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.createWithBitmap((Bitmap) parcelable);
            }
            return null;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static IconCompat getPictureIcon(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable(NotificationCompat.EXTRA_PICTURE);
            if (parcelable != null) {
                return asIconCompat(parcelable);
            }
            return asIconCompat(bundle.getParcelable(NotificationCompat.EXTRA_PICTURE_ICON));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Context context;
            int i = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle);
            IconCompat iconCompat = this.mPictureIcon;
            Context context2 = null;
            if (iconCompat != null) {
                if (i >= 31) {
                    if (notificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder) {
                        context = ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).getContext();
                    } else {
                        context = null;
                    }
                    Api31Impl.setBigPicture(bigContentTitle, this.mPictureIcon.toIcon(context));
                } else if (iconCompat.getType() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.mPictureIcon.getBitmap());
                }
            }
            if (this.mBigLargeIconSet) {
                if (this.mBigLargeIcon == null) {
                    Api16Impl.setBigLargeIcon(bigContentTitle, (Bitmap) null);
                } else {
                    if (notificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder) {
                        context2 = ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).getContext();
                    }
                    Api23Impl.setBigLargeIcon(bigContentTitle, this.mBigLargeIcon.toIcon(context2));
                }
            }
            if (this.mSummaryTextSet) {
                Api16Impl.setSummaryText(bigContentTitle, this.mSummaryText);
            }
            if (i >= 31) {
                Api31Impl.showBigPictureWhenCollapsed(bigContentTitle, this.mShowBigPictureWhenCollapsed);
                Api31Impl.setContentDescription(bigContentTitle, this.mPictureContentDescription);
            }
        }

        @NonNull
        public BigPictureStyle bigLargeIcon(@Nullable Bitmap bitmap) {
            IconCompat iconCompat;
            if (bitmap == null) {
                iconCompat = null;
            } else {
                iconCompat = IconCompat.createWithBitmap(bitmap);
            }
            this.mBigLargeIcon = iconCompat;
            this.mBigLargeIconSet = true;
            return this;
        }

        @NonNull
        public BigPictureStyle bigPicture(@Nullable Bitmap bitmap) {
            this.mPictureIcon = bitmap == null ? null : IconCompat.createWithBitmap(bitmap);
            return this;
        }

        /* access modifiers changed from: protected */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_LARGE_ICON_BIG);
            bundle.remove(NotificationCompat.EXTRA_PICTURE);
            bundle.remove(NotificationCompat.EXTRA_PICTURE_ICON);
            bundle.remove(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        /* access modifiers changed from: protected */
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        /* access modifiers changed from: protected */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            if (bundle.containsKey(NotificationCompat.EXTRA_LARGE_ICON_BIG)) {
                this.mBigLargeIcon = asIconCompat(bundle.getParcelable(NotificationCompat.EXTRA_LARGE_ICON_BIG));
                this.mBigLargeIconSet = true;
            }
            this.mPictureIcon = getPictureIcon(bundle);
            this.mShowBigPictureWhenCollapsed = bundle.getBoolean(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        @NonNull
        public BigPictureStyle setBigContentTitle(@Nullable CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @RequiresApi(31)
        @NonNull
        public BigPictureStyle setContentDescription(@Nullable CharSequence charSequence) {
            this.mPictureContentDescription = charSequence;
            return this;
        }

        @NonNull
        public BigPictureStyle setSummaryText(@Nullable CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        @RequiresApi(31)
        @NonNull
        public BigPictureStyle showBigPictureWhenCollapsed(boolean z) {
            this.mShowBigPictureWhenCollapsed = z;
            return this;
        }

        public BigPictureStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }

        @RequiresApi(31)
        @NonNull
        public BigPictureStyle bigPicture(@Nullable Icon icon) {
            this.mPictureIcon = IconCompat.createFromIcon(icon);
            return this;
        }
    }

    public static class BigTextStyle extends Style {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigTextStyle";
        private CharSequence mBigText;

        public BigTextStyle() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void addCompatExtras(@NonNull Bundle bundle) {
            super.addCompatExtras(bundle);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle).bigText(this.mBigText);
            if (this.mSummaryTextSet) {
                bigText.setSummaryText(this.mSummaryText);
            }
        }

        @NonNull
        public BigTextStyle bigText(@Nullable CharSequence charSequence) {
            this.mBigText = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        /* access modifiers changed from: protected */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_BIG_TEXT);
        }

        /* access modifiers changed from: protected */
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        /* access modifiers changed from: protected */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mBigText = bundle.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
        }

        @NonNull
        public BigTextStyle setBigContentTitle(@Nullable CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public BigTextStyle setSummaryText(@Nullable CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        public BigTextStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }
    }

    public static final class BubbleMetadata {
        private static final int FLAG_AUTO_EXPAND_BUBBLE = 1;
        private static final int FLAG_SUPPRESS_NOTIFICATION = 2;
        private PendingIntent mDeleteIntent;
        private int mDesiredHeight;
        @DimenRes
        private int mDesiredHeightResId;
        private int mFlags;
        private IconCompat mIcon;
        private PendingIntent mPendingIntent;
        private String mShortcutId;

        @RequiresApi(29)
        private static class Api29Impl {
            private Api29Impl() {
            }

            @RequiresApi(29)
            @Nullable
            static BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                Builder suppressNotification = new Builder(bubbleMetadata.getIntent(), IconCompat.createFromIcon(bubbleMetadata.getIcon())).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }

            @RequiresApi(29)
            @Nullable
            static Notification.BubbleMetadata toPlatform(@Nullable BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder a = new Notification.BubbleMetadata.Builder().setIcon(bubbleMetadata.getIcon().toIcon()).setIntent(bubbleMetadata.getIntent()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    Notification.BubbleMetadata.Builder unused = a.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    Notification.BubbleMetadata.Builder unused2 = a.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return a.build();
            }
        }

        @RequiresApi(30)
        private static class Api30Impl {
            private Api30Impl() {
            }

            @RequiresApi(30)
            @Nullable
            static BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata bubbleMetadata) {
                Builder builder;
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    builder = new Builder(bubbleMetadata.getShortcutId());
                } else {
                    builder = new Builder(bubbleMetadata.getIntent(), IconCompat.createFromIcon(bubbleMetadata.getIcon()));
                }
                builder.setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }

            @RequiresApi(30)
            @Nullable
            static Notification.BubbleMetadata toPlatform(@Nullable BubbleMetadata bubbleMetadata) {
                Notification.BubbleMetadata.Builder builder;
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    builder = new Notification.BubbleMetadata.Builder(bubbleMetadata.getShortcutId());
                } else {
                    builder = new Notification.BubbleMetadata.Builder(bubbleMetadata.getIntent(), bubbleMetadata.getIcon().toIcon());
                }
                Notification.BubbleMetadata.Builder unused = builder.setDeleteIntent(bubbleMetadata.getDeleteIntent()).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    Notification.BubbleMetadata.Builder unused2 = builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    Notification.BubbleMetadata.Builder unused3 = builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }
        }

        public static final class Builder {
            private PendingIntent mDeleteIntent;
            private int mDesiredHeight;
            @DimenRes
            private int mDesiredHeightResId;
            private int mFlags;
            private IconCompat mIcon;
            private PendingIntent mPendingIntent;
            private String mShortcutId;

            @Deprecated
            public Builder() {
            }

            @NonNull
            private Builder setFlag(int i, boolean z) {
                if (z) {
                    this.mFlags = i | this.mFlags;
                } else {
                    this.mFlags = (~i) & this.mFlags;
                }
                return this;
            }

            @NonNull
            public BubbleMetadata build() {
                String str = this.mShortcutId;
                if (str == null && this.mPendingIntent == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                } else if (str == null && this.mIcon == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                } else {
                    BubbleMetadata bubbleMetadata = new BubbleMetadata(this.mPendingIntent, this.mDeleteIntent, this.mIcon, this.mDesiredHeight, this.mDesiredHeightResId, this.mFlags, str);
                    bubbleMetadata.setFlags(this.mFlags);
                    return bubbleMetadata;
                }
            }

            @NonNull
            public Builder setAutoExpandBubble(boolean z) {
                setFlag(1, z);
                return this;
            }

            @NonNull
            public Builder setDeleteIntent(@Nullable PendingIntent pendingIntent) {
                this.mDeleteIntent = pendingIntent;
                return this;
            }

            @NonNull
            public Builder setDesiredHeight(@Dimension(unit = 0) int i) {
                this.mDesiredHeight = Math.max(i, 0);
                this.mDesiredHeightResId = 0;
                return this;
            }

            @NonNull
            public Builder setDesiredHeightResId(@DimenRes int i) {
                this.mDesiredHeightResId = i;
                this.mDesiredHeight = 0;
                return this;
            }

            @NonNull
            public Builder setIcon(@NonNull IconCompat iconCompat) {
                if (this.mShortcutId != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                } else if (iconCompat != null) {
                    this.mIcon = iconCompat;
                    return this;
                } else {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
            }

            @NonNull
            public Builder setIntent(@NonNull PendingIntent pendingIntent) {
                if (this.mShortcutId != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                } else if (pendingIntent != null) {
                    this.mPendingIntent = pendingIntent;
                    return this;
                } else {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
            }

            @NonNull
            public Builder setSuppressNotification(boolean z) {
                setFlag(2, z);
                return this;
            }

            @RequiresApi(30)
            public Builder(@NonNull String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.mShortcutId = str;
                    return;
                }
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }

            public Builder(@NonNull PendingIntent pendingIntent, @NonNull IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                } else if (iconCompat != null) {
                    this.mPendingIntent = pendingIntent;
                    this.mIcon = iconCompat;
                } else {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
            }
        }

        @Nullable
        public static BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return Api30Impl.fromPlatform(bubbleMetadata);
            }
            if (i == 29) {
                return Api29Impl.fromPlatform(bubbleMetadata);
            }
            return null;
        }

        @Nullable
        public static Notification.BubbleMetadata toPlatform(@Nullable BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return Api30Impl.toPlatform(bubbleMetadata);
            }
            if (i == 29) {
                return Api29Impl.toPlatform(bubbleMetadata);
            }
            return null;
        }

        public boolean getAutoExpandBubble() {
            if ((this.mFlags & 1) != 0) {
                return true;
            }
            return false;
        }

        @Nullable
        public PendingIntent getDeleteIntent() {
            return this.mDeleteIntent;
        }

        @Dimension(unit = 0)
        public int getDesiredHeight() {
            return this.mDesiredHeight;
        }

        @DimenRes
        public int getDesiredHeightResId() {
            return this.mDesiredHeightResId;
        }

        @Nullable
        public IconCompat getIcon() {
            return this.mIcon;
        }

        @Nullable
        public PendingIntent getIntent() {
            return this.mPendingIntent;
        }

        @Nullable
        public String getShortcutId() {
            return this.mShortcutId;
        }

        public boolean isNotificationSuppressed() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void setFlags(int i) {
            this.mFlags = i;
        }

        private BubbleMetadata(@Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable IconCompat iconCompat, int i, @DimenRes int i2, int i3, @Nullable String str) {
            this.mPendingIntent = pendingIntent;
            this.mIcon = iconCompat;
            this.mDesiredHeight = i;
            this.mDesiredHeightResId = i2;
            this.mDeleteIntent = pendingIntent2;
            this.mFlags = i3;
            this.mShortcutId = str;
        }
    }

    public static class Builder {
        private static final int MAX_CHARSEQUENCE_LENGTH = 5120;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<Action> mActions;
        boolean mAllowSystemGeneratedContextualActions;
        int mBadgeIcon;
        RemoteViews mBigContentView;
        BubbleMetadata mBubbleMetadata;
        String mCategory;
        String mChannelId;
        boolean mChronometerCountDown;
        int mColor;
        boolean mColorized;
        boolean mColorizedSet;
        CharSequence mContentInfo;
        PendingIntent mContentIntent;
        CharSequence mContentText;
        CharSequence mContentTitle;
        RemoteViews mContentView;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Context mContext;
        Bundle mExtras;
        int mFgsDeferBehavior;
        PendingIntent mFullScreenIntent;
        int mGroupAlertBehavior;
        String mGroupKey;
        boolean mGroupSummary;
        RemoteViews mHeadsUpContentView;
        ArrayList<Action> mInvisibleActions;
        Bitmap mLargeIcon;
        boolean mLocalOnly;
        LocusIdCompat mLocusId;
        Notification mNotification;
        int mNumber;
        @Deprecated
        public ArrayList<String> mPeople;
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<Person> mPersonList;
        int mPriority;
        int mProgress;
        boolean mProgressIndeterminate;
        int mProgressMax;
        Notification mPublicVersion;
        CharSequence[] mRemoteInputHistory;
        CharSequence mSettingsText;
        String mShortcutId;
        boolean mShowWhen;
        boolean mSilent;
        Icon mSmallIcon;
        String mSortKey;
        Style mStyle;
        CharSequence mSubText;
        RemoteViews mTickerView;
        long mTimeout;
        boolean mUseChronometer;
        int mVisibility;

        @RequiresApi(19)
        public Builder(@NonNull Context context, @NonNull Notification notification) {
            this(context, NotificationCompat.getChannelId(notification));
            ArrayList parcelableArrayList;
            Bundle bundle = notification.extras;
            Style extractStyleFromNotification = Style.extractStyleFromNotification(notification);
            setContentTitle(NotificationCompat.getContentTitle(notification)).setContentText(NotificationCompat.getContentText(notification)).setContentInfo(NotificationCompat.getContentInfo(notification)).setSubText(NotificationCompat.getSubText(notification)).setSettingsText(NotificationCompat.getSettingsText(notification)).setStyle(extractStyleFromNotification).setContentIntent(notification.contentIntent).setGroup(NotificationCompat.getGroup(notification)).setGroupSummary(NotificationCompat.isGroupSummary(notification)).setLocusId(NotificationCompat.getLocusId(notification)).setWhen(notification.when).setShowWhen(NotificationCompat.getShowWhen(notification)).setUsesChronometer(NotificationCompat.getUsesChronometer(notification)).setAutoCancel(NotificationCompat.getAutoCancel(notification)).setOnlyAlertOnce(NotificationCompat.getOnlyAlertOnce(notification)).setOngoing(NotificationCompat.getOngoing(notification)).setLocalOnly(NotificationCompat.getLocalOnly(notification)).setLargeIcon(notification.largeIcon).setBadgeIconType(NotificationCompat.getBadgeIconType(notification)).setCategory(NotificationCompat.getCategory(notification)).setBubbleMetadata(NotificationCompat.getBubbleMetadata(notification)).setNumber(notification.number).setTicker(notification.tickerText).setContentIntent(notification.contentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(notification.fullScreenIntent, NotificationCompat.getHighPriority(notification)).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setDefaults(notification.defaults).setPriority(notification.priority).setColor(NotificationCompat.getColor(notification)).setVisibility(NotificationCompat.getVisibility(notification)).setPublicVersion(NotificationCompat.getPublicVersion(notification)).setSortKey(NotificationCompat.getSortKey(notification)).setTimeoutAfter(NotificationCompat.getTimeoutAfter(notification)).setShortcutId(NotificationCompat.getShortcutId(notification)).setProgress(bundle.getInt(NotificationCompat.EXTRA_PROGRESS_MAX), bundle.getInt(NotificationCompat.EXTRA_PROGRESS), bundle.getBoolean(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE)).setAllowSystemGeneratedContextualActions(NotificationCompat.getAllowSystemGeneratedContextualActions(notification)).setSmallIcon(notification.icon, notification.iconLevel).addExtras(getExtrasWithoutDuplicateData(notification, extractStyleFromNotification));
            this.mSmallIcon = notification.getSmallIcon();
            Notification.Action[] actionArr = notification.actions;
            if (!(actionArr == null || actionArr.length == 0)) {
                for (Notification.Action fromAndroidAction : actionArr) {
                    addAction(Action.Builder.fromAndroidAction(fromAndroidAction).build());
                }
            }
            List<Action> invisibleActions = NotificationCompat.getInvisibleActions(notification);
            if (!invisibleActions.isEmpty()) {
                for (Action addInvisibleAction : invisibleActions) {
                    addInvisibleAction(addInvisibleAction);
                }
            }
            String[] stringArray = notification.extras.getStringArray(NotificationCompat.EXTRA_PEOPLE);
            if (!(stringArray == null || stringArray.length == 0)) {
                for (String addPerson : stringArray) {
                    addPerson(addPerson);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(NotificationCompat.EXTRA_PEOPLE_LIST)) != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    addPerson(Person.fromAndroidPerson((Person) it.next()));
                }
            }
            int i = Build.VERSION.SDK_INT;
            if (bundle.containsKey(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN)) {
                setChronometerCountDown(bundle.getBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN));
            }
            if (i >= 26 && bundle.containsKey(NotificationCompat.EXTRA_COLORIZED)) {
                setColorized(bundle.getBoolean(NotificationCompat.EXTRA_COLORIZED));
            }
        }

        @RequiresApi(19)
        @Nullable
        private static Bundle getExtrasWithoutDuplicateData(@NonNull Notification notification, @Nullable Style style) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(NotificationCompat.EXTRA_TITLE);
            bundle.remove(NotificationCompat.EXTRA_TEXT);
            bundle.remove(NotificationCompat.EXTRA_INFO_TEXT);
            bundle.remove(NotificationCompat.EXTRA_SUB_TEXT);
            bundle.remove(NotificationCompat.EXTRA_CHANNEL_ID);
            bundle.remove(NotificationCompat.EXTRA_CHANNEL_GROUP_ID);
            bundle.remove(NotificationCompat.EXTRA_SHOW_WHEN);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_MAX);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE);
            bundle.remove(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN);
            bundle.remove(NotificationCompat.EXTRA_COLORIZED);
            bundle.remove(NotificationCompat.EXTRA_PEOPLE_LIST);
            bundle.remove(NotificationCompat.EXTRA_PEOPLE);
            bundle.remove(NotificationCompatExtras.EXTRA_SORT_KEY);
            bundle.remove(NotificationCompatExtras.EXTRA_GROUP_KEY);
            bundle.remove(NotificationCompatExtras.EXTRA_GROUP_SUMMARY);
            bundle.remove(NotificationCompatExtras.EXTRA_LOCAL_ONLY);
            bundle.remove(NotificationCompatExtras.EXTRA_ACTION_EXTRAS);
            Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (style != null) {
                style.clearCompatExtraKeys(bundle);
            }
            return bundle;
        }

        @Nullable
        protected static CharSequence limitCharSequenceLength(@Nullable CharSequence charSequence) {
            if (charSequence != null && charSequence.length() > MAX_CHARSEQUENCE_LENGTH) {
                return charSequence.subSequence(0, MAX_CHARSEQUENCE_LENGTH);
            }
            return charSequence;
        }

        @Nullable
        private Bitmap reduceLargeIconSize(@Nullable Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C1318R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C1318R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        private void setFlag(int i, boolean z) {
            if (z) {
                Notification notification = this.mNotification;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.mNotification;
            notification2.flags = (~i) & notification2.flags;
        }

        private boolean useExistingRemoteView() {
            Style style = this.mStyle;
            if (style == null || !style.displayCustomViewInline()) {
                return true;
            }
            return false;
        }

        @NonNull
        public Builder addAction(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this.mActions.add(new Action(i, charSequence, pendingIntent));
            return this;
        }

        @NonNull
        public Builder addExtras(@Nullable Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.mExtras;
                if (bundle2 == null) {
                    this.mExtras = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        @RequiresApi(21)
        @NonNull
        public Builder addInvisibleAction(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this.mInvisibleActions.add(new Action(i, charSequence, pendingIntent));
            return this;
        }

        @NonNull
        @Deprecated
        public Builder addPerson(@Nullable String str) {
            if (str != null && !str.isEmpty()) {
                this.mPeople.add(str);
            }
            return this;
        }

        @NonNull
        public Notification build() {
            return new NotificationCompatBuilder(this).build();
        }

        @NonNull
        public Builder clearActions() {
            this.mActions.clear();
            return this;
        }

        @NonNull
        public Builder clearInvisibleActions() {
            this.mInvisibleActions.clear();
            Bundle bundle = this.mExtras.getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove("invisible_actions");
                this.mExtras.putBundle("android.car.EXTENSIONS", bundle2);
            }
            return this;
        }

        @NonNull
        public Builder clearPeople() {
            this.mPersonList.clear();
            this.mPeople.clear();
            return this;
        }

        @Nullable
        public RemoteViews createBigContentView() {
            RemoteViews makeBigContentView;
            if (this.mBigContentView != null && useExistingRemoteView()) {
                return this.mBigContentView;
            }
            NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this);
            Style style = this.mStyle;
            if (style != null && (makeBigContentView = style.makeBigContentView(notificationCompatBuilder)) != null) {
                return makeBigContentView;
            }
            return Notification.Builder.recoverBuilder(this.mContext, notificationCompatBuilder.build()).createBigContentView();
        }

        @Nullable
        public RemoteViews createContentView() {
            RemoteViews makeContentView;
            if (this.mContentView != null && useExistingRemoteView()) {
                return this.mContentView;
            }
            NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this);
            Style style = this.mStyle;
            if (style != null && (makeContentView = style.makeContentView(notificationCompatBuilder)) != null) {
                return makeContentView;
            }
            return Notification.Builder.recoverBuilder(this.mContext, notificationCompatBuilder.build()).createContentView();
        }

        @Nullable
        public RemoteViews createHeadsUpContentView() {
            RemoteViews makeHeadsUpContentView;
            if (this.mHeadsUpContentView != null && useExistingRemoteView()) {
                return this.mHeadsUpContentView;
            }
            NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this);
            Style style = this.mStyle;
            if (style != null && (makeHeadsUpContentView = style.makeHeadsUpContentView(notificationCompatBuilder)) != null) {
                return makeHeadsUpContentView;
            }
            return Notification.Builder.recoverBuilder(this.mContext, notificationCompatBuilder.build()).createHeadsUpContentView();
        }

        @NonNull
        public Builder extend(@NonNull Extender extender) {
            extender.extend(this);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getBigContentView() {
            return this.mBigContentView;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public BubbleMetadata getBubbleMetadata() {
            return this.mBubbleMetadata;
        }

        @ColorInt
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getColor() {
            return this.mColor;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getContentView() {
            return this.mContentView;
        }

        @NonNull
        public Bundle getExtras() {
            if (this.mExtras == null) {
                this.mExtras = new Bundle();
            }
            return this.mExtras;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getForegroundServiceBehavior() {
            return this.mFgsDeferBehavior;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getHeadsUpContentView() {
            return this.mHeadsUpContentView;
        }

        @NonNull
        @Deprecated
        public Notification getNotification() {
            return build();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getPriority() {
            return this.mPriority;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public long getWhenIfShowing() {
            if (this.mShowWhen) {
                return this.mNotification.when;
            }
            return 0;
        }

        @NonNull
        public Builder setAllowSystemGeneratedContextualActions(boolean z) {
            this.mAllowSystemGeneratedContextualActions = z;
            return this;
        }

        @NonNull
        public Builder setAutoCancel(boolean z) {
            setFlag(16, z);
            return this;
        }

        @NonNull
        public Builder setBadgeIconType(int i) {
            this.mBadgeIcon = i;
            return this;
        }

        @NonNull
        public Builder setBubbleMetadata(@Nullable BubbleMetadata bubbleMetadata) {
            this.mBubbleMetadata = bubbleMetadata;
            return this;
        }

        @NonNull
        public Builder setCategory(@Nullable String str) {
            this.mCategory = str;
            return this;
        }

        @NonNull
        public Builder setChannelId(@NonNull String str) {
            this.mChannelId = str;
            return this;
        }

        @RequiresApi(24)
        @NonNull
        public Builder setChronometerCountDown(boolean z) {
            this.mChronometerCountDown = z;
            getExtras().putBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN, z);
            return this;
        }

        @NonNull
        public Builder setColor(@ColorInt int i) {
            this.mColor = i;
            return this;
        }

        @NonNull
        public Builder setColorized(boolean z) {
            this.mColorized = z;
            this.mColorizedSet = true;
            return this;
        }

        @NonNull
        public Builder setContent(@Nullable RemoteViews remoteViews) {
            this.mNotification.contentView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setContentInfo(@Nullable CharSequence charSequence) {
            this.mContentInfo = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setContentIntent(@Nullable PendingIntent pendingIntent) {
            this.mContentIntent = pendingIntent;
            return this;
        }

        @NonNull
        public Builder setContentText(@Nullable CharSequence charSequence) {
            this.mContentText = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setContentTitle(@Nullable CharSequence charSequence) {
            this.mContentTitle = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setCustomBigContentView(@Nullable RemoteViews remoteViews) {
            this.mBigContentView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setCustomContentView(@Nullable RemoteViews remoteViews) {
            this.mContentView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setCustomHeadsUpContentView(@Nullable RemoteViews remoteViews) {
            this.mHeadsUpContentView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setDefaults(int i) {
            Notification notification = this.mNotification;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @NonNull
        public Builder setDeleteIntent(@Nullable PendingIntent pendingIntent) {
            this.mNotification.deleteIntent = pendingIntent;
            return this;
        }

        @NonNull
        public Builder setExtras(@Nullable Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        @NonNull
        public Builder setForegroundServiceBehavior(int i) {
            this.mFgsDeferBehavior = i;
            return this;
        }

        @NonNull
        public Builder setFullScreenIntent(@Nullable PendingIntent pendingIntent, boolean z) {
            this.mFullScreenIntent = pendingIntent;
            setFlag(128, z);
            return this;
        }

        @NonNull
        public Builder setGroup(@Nullable String str) {
            this.mGroupKey = str;
            return this;
        }

        @NonNull
        public Builder setGroupAlertBehavior(int i) {
            this.mGroupAlertBehavior = i;
            return this;
        }

        @NonNull
        public Builder setGroupSummary(boolean z) {
            this.mGroupSummary = z;
            return this;
        }

        @NonNull
        public Builder setLargeIcon(@Nullable Bitmap bitmap) {
            this.mLargeIcon = reduceLargeIconSize(bitmap);
            return this;
        }

        @NonNull
        public Builder setLights(@ColorInt int i, int i2, int i3) {
            int i4;
            Notification notification = this.mNotification;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            if (i2 == 0 || i3 == 0) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            notification.flags = i4 | (notification.flags & -2);
            return this;
        }

        @NonNull
        public Builder setLocalOnly(boolean z) {
            this.mLocalOnly = z;
            return this;
        }

        @NonNull
        public Builder setLocusId(@Nullable LocusIdCompat locusIdCompat) {
            this.mLocusId = locusIdCompat;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setNotificationSilent() {
            this.mSilent = true;
            return this;
        }

        @NonNull
        public Builder setNumber(int i) {
            this.mNumber = i;
            return this;
        }

        @NonNull
        public Builder setOngoing(boolean z) {
            setFlag(2, z);
            return this;
        }

        @NonNull
        public Builder setOnlyAlertOnce(boolean z) {
            setFlag(8, z);
            return this;
        }

        @NonNull
        public Builder setPriority(int i) {
            this.mPriority = i;
            return this;
        }

        @NonNull
        public Builder setProgress(int i, int i2, boolean z) {
            this.mProgressMax = i;
            this.mProgress = i2;
            this.mProgressIndeterminate = z;
            return this;
        }

        @NonNull
        public Builder setPublicVersion(@Nullable Notification notification) {
            this.mPublicVersion = notification;
            return this;
        }

        @NonNull
        public Builder setRemoteInputHistory(@Nullable CharSequence[] charSequenceArr) {
            this.mRemoteInputHistory = charSequenceArr;
            return this;
        }

        @NonNull
        public Builder setSettingsText(@Nullable CharSequence charSequence) {
            this.mSettingsText = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setShortcutId(@Nullable String str) {
            this.mShortcutId = str;
            return this;
        }

        @NonNull
        public Builder setShortcutInfo(@Nullable ShortcutInfoCompat shortcutInfoCompat) {
            if (shortcutInfoCompat == null) {
                return this;
            }
            this.mShortcutId = shortcutInfoCompat.getId();
            if (this.mLocusId == null) {
                if (shortcutInfoCompat.getLocusId() != null) {
                    this.mLocusId = shortcutInfoCompat.getLocusId();
                } else if (shortcutInfoCompat.getId() != null) {
                    this.mLocusId = new LocusIdCompat(shortcutInfoCompat.getId());
                }
            }
            if (this.mContentTitle == null) {
                setContentTitle(shortcutInfoCompat.getShortLabel());
            }
            return this;
        }

        @NonNull
        public Builder setShowWhen(boolean z) {
            this.mShowWhen = z;
            return this;
        }

        @NonNull
        public Builder setSilent(boolean z) {
            this.mSilent = z;
            return this;
        }

        @RequiresApi(23)
        @NonNull
        public Builder setSmallIcon(@NonNull IconCompat iconCompat) {
            this.mSmallIcon = iconCompat.toIcon(this.mContext);
            return this;
        }

        @NonNull
        public Builder setSortKey(@Nullable String str) {
            this.mSortKey = str;
            return this;
        }

        @NonNull
        public Builder setSound(@Nullable Uri uri) {
            Notification notification = this.mNotification;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        @NonNull
        public Builder setStyle(@Nullable Style style) {
            if (this.mStyle != style) {
                this.mStyle = style;
                if (style != null) {
                    style.setBuilder(this);
                }
            }
            return this;
        }

        @NonNull
        public Builder setSubText(@Nullable CharSequence charSequence) {
            this.mSubText = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setTicker(@Nullable CharSequence charSequence) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setTimeoutAfter(long j) {
            this.mTimeout = j;
            return this;
        }

        @NonNull
        public Builder setUsesChronometer(boolean z) {
            this.mUseChronometer = z;
            return this;
        }

        @NonNull
        public Builder setVibrate(@Nullable long[] jArr) {
            this.mNotification.vibrate = jArr;
            return this;
        }

        @NonNull
        public Builder setVisibility(int i) {
            this.mVisibility = i;
            return this;
        }

        @NonNull
        public Builder setWhen(long j) {
            this.mNotification.when = j;
            return this;
        }

        @NonNull
        public Builder addAction(@Nullable Action action) {
            if (action != null) {
                this.mActions.add(action);
            }
            return this;
        }

        @RequiresApi(21)
        @NonNull
        public Builder addInvisibleAction(@Nullable Action action) {
            if (action != null) {
                this.mInvisibleActions.add(action);
            }
            return this;
        }

        @NonNull
        public Builder setSmallIcon(int i) {
            this.mNotification.icon = i;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTicker(@Nullable CharSequence charSequence, @Nullable RemoteViews remoteViews) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            this.mTickerView = remoteViews;
            return this;
        }

        @NonNull
        public Builder addPerson(@Nullable Person person) {
            if (person != null) {
                this.mPersonList.add(person);
            }
            return this;
        }

        @NonNull
        public Builder setSmallIcon(int i, int i2) {
            Notification notification = this.mNotification;
            notification.icon = i;
            notification.iconLevel = i2;
            return this;
        }

        @NonNull
        public Builder setSound(@Nullable Uri uri, int i) {
            Notification notification = this.mNotification;
            notification.sound = uri;
            notification.audioStreamType = i;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i).build();
            return this;
        }

        public Builder(@NonNull Context context, @NonNull String str) {
            this.mActions = new ArrayList<>();
            this.mPersonList = new ArrayList<>();
            this.mInvisibleActions = new ArrayList<>();
            this.mShowWhen = true;
            this.mLocalOnly = false;
            this.mColor = 0;
            this.mVisibility = 0;
            this.mBadgeIcon = 0;
            this.mGroupAlertBehavior = 0;
            this.mFgsDeferBehavior = 0;
            Notification notification = new Notification();
            this.mNotification = notification;
            this.mContext = context;
            this.mChannelId = str;
            notification.when = System.currentTimeMillis();
            this.mNotification.audioStreamType = -1;
            this.mPriority = 0;
            this.mPeople = new ArrayList<>();
            this.mAllowSystemGeneratedContextualActions = true;
        }

        @Deprecated
        public Builder(@NonNull Context context) {
            this(context, (String) null);
        }
    }

    public static class DecoratedCustomViewStyle extends Style {
        private static final int MAX_ACTION_BUTTONS = 3;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        private RemoteViews createRemoteViews(RemoteViews remoteViews, boolean z) {
            int min;
            boolean z2 = true;
            int i = 0;
            RemoteViews applyStandardTemplate = applyStandardTemplate(true, C1318R.C1322layout.notification_template_custom_big, false);
            applyStandardTemplate.removeAllViews(C1318R.C1321id.actions);
            List<Action> nonContextualActions = getNonContextualActions(this.mBuilder.mActions);
            if (!z || nonContextualActions == null || (min = Math.min(nonContextualActions.size(), 3)) <= 0) {
                z2 = false;
            } else {
                for (int i2 = 0; i2 < min; i2++) {
                    applyStandardTemplate.addView(C1318R.C1321id.actions, generateActionButton(nonContextualActions.get(i2)));
                }
            }
            if (!z2) {
                i = 8;
            }
            applyStandardTemplate.setViewVisibility(C1318R.C1321id.actions, i);
            applyStandardTemplate.setViewVisibility(C1318R.C1321id.action_divider, i);
            buildIntoRemoteViews(applyStandardTemplate, remoteViews);
            return applyStandardTemplate;
        }

        private RemoteViews generateActionButton(Action action) {
            boolean z;
            int i;
            if (action.actionIntent == null) {
                z = true;
            } else {
                z = false;
            }
            String packageName = this.mBuilder.mContext.getPackageName();
            if (z) {
                i = C1318R.C1322layout.notification_action_tombstone;
            } else {
                i = C1318R.C1322layout.notification_action;
            }
            RemoteViews remoteViews = new RemoteViews(packageName, i);
            IconCompat iconCompat = action.getIconCompat();
            if (iconCompat != null) {
                remoteViews.setImageViewBitmap(C1318R.C1321id.action_image, createColoredBitmap(iconCompat, this.mBuilder.mContext.getResources().getColor(C1318R.C1319color.notification_action_color_filter)));
            }
            remoteViews.setTextViewText(C1318R.C1321id.action_text, action.title);
            if (!z) {
                remoteViews.setOnClickPendingIntent(C1318R.C1321id.action_container, action.actionIntent);
            }
            remoteViews.setContentDescription(C1318R.C1321id.action_container, action.title);
            return remoteViews;
        }

        private static List<Action> getNonContextualActions(List<Action> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Action next : list) {
                if (!next.isContextual()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            notificationBuilderWithBuilderAccessor.getBuilder().setStyle(new Notification.DecoratedCustomViewStyle());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean displayCustomViewInline() {
            return true;
        }

        /* access modifiers changed from: protected */
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }
    }

    public interface Extender {
        @NonNull
        Builder extend(@NonNull Builder builder);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GroupAlertBehavior {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NotificationVisibility {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ServiceNotificationBehavior {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    public static abstract class Style {
        CharSequence mBigContentTitle;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected Builder mBuilder;
        CharSequence mSummaryText;
        boolean mSummaryTextSet = false;

        private int calculateTopPadding() {
            Resources resources = this.mBuilder.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C1318R.dimen.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C1318R.dimen.notification_top_pad_large_text);
            float constrain = (constrain(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - constrain) * ((float) dimensionPixelSize)) + (constrain * ((float) dimensionPixelSize2)));
        }

        private static float constrain(float f, float f2, float f3) {
            if (f < f2) {
                return f2;
            }
            if (f > f3) {
                return f3;
            }
            return f;
        }

        @Nullable
        static Style constructCompatStyleByName(@Nullable String str) {
            if (str == null) {
                return null;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -716705180:
                    if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                        c = 0;
                        break;
                    }
                    break;
                case -171946061:
                    if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                        c = 1;
                        break;
                    }
                    break;
                case 912942987:
                    if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                        c = 2;
                        break;
                    }
                    break;
                case 919595044:
                    if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2090799565:
                    if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return new DecoratedCustomViewStyle();
                case 1:
                    return new BigPictureStyle();
                case 2:
                    return new InboxStyle();
                case 3:
                    return new BigTextStyle();
                case 4:
                    return new MessagingStyle();
                default:
                    return null;
            }
        }

        @Nullable
        private static Style constructCompatStyleByPlatformName(@Nullable String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new BigPictureStyle();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new BigTextStyle();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new InboxStyle();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new MessagingStyle();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new DecoratedCustomViewStyle();
            }
            return null;
        }

        @Nullable
        static Style constructCompatStyleForBundle(@NonNull Bundle bundle) {
            Style constructCompatStyleByName = constructCompatStyleByName(bundle.getString(NotificationCompat.EXTRA_COMPAT_TEMPLATE));
            if (constructCompatStyleByName != null) {
                return constructCompatStyleByName;
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_SELF_DISPLAY_NAME) || bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                return new MessagingStyle();
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_PICTURE) || bundle.containsKey(NotificationCompat.EXTRA_PICTURE_ICON)) {
                return new BigPictureStyle();
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_BIG_TEXT)) {
                return new BigTextStyle();
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
                return new InboxStyle();
            }
            return constructCompatStyleByPlatformName(bundle.getString(NotificationCompat.EXTRA_TEMPLATE));
        }

        @Nullable
        static Style constructStyleForExtras(@NonNull Bundle bundle) {
            Style constructCompatStyleForBundle = constructCompatStyleForBundle(bundle);
            if (constructCompatStyleForBundle == null) {
                return null;
            }
            try {
                constructCompatStyleForBundle.restoreFromCompatExtras(bundle);
                return constructCompatStyleForBundle;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private Bitmap createIconWithBackground(int i, int i2, int i3, int i4) {
            int i5 = C1318R.C1320drawable.notification_icon_background;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap createColoredBitmap = createColoredBitmap(i5, i4, i2);
            Canvas canvas = new Canvas(createColoredBitmap);
            Drawable mutate = this.mBuilder.mContext.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return createColoredBitmap;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static Style extractStyleFromNotification(@NonNull Notification notification) {
            Bundle extras = NotificationCompat.getExtras(notification);
            if (extras == null) {
                return null;
            }
            return constructStyleForExtras(extras);
        }

        private void hideNormalContent(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(C1318R.C1321id.title, 8);
            remoteViews.setViewVisibility(C1318R.C1321id.text2, 8);
            remoteViews.setViewVisibility(C1318R.C1321id.text, 8);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void addCompatExtras(@NonNull Bundle bundle) {
            if (this.mSummaryTextSet) {
                bundle.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, this.mSummaryText);
            }
            CharSequence charSequence = this.mBigContentTitle;
            if (charSequence != null) {
                bundle.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, charSequence);
            }
            String className = getClassName();
            if (className != null) {
                bundle.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, className);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00fc  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0119  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x013d  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x017d  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0182  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0184  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x018d  */
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews applyStandardTemplate(boolean r12, int r13, boolean r14) {
            /*
                r11 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r11.mBuilder
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r0 = r0.getResources()
                android.widget.RemoteViews r7 = new android.widget.RemoteViews
                androidx.core.app.NotificationCompat$Builder r1 = r11.mBuilder
                android.content.Context r1 = r1.mContext
                java.lang.String r1 = r1.getPackageName()
                r7.<init>(r1, r13)
                androidx.core.app.NotificationCompat$Builder r13 = r11.mBuilder
                r13.getPriority()
                androidx.core.app.NotificationCompat$Builder r13 = r11.mBuilder
                android.graphics.Bitmap r1 = r13.mLargeIcon
                r8 = 0
                if (r1 == 0) goto L_0x005e
                int r13 = androidx.core.C1318R.C1321id.icon
                r7.setViewVisibility(r13, r8)
                androidx.core.app.NotificationCompat$Builder r1 = r11.mBuilder
                android.graphics.Bitmap r1 = r1.mLargeIcon
                r7.setImageViewBitmap(r13, r1)
                if (r12 == 0) goto L_0x008f
                androidx.core.app.NotificationCompat$Builder r12 = r11.mBuilder
                android.app.Notification r12 = r12.mNotification
                int r12 = r12.icon
                if (r12 == 0) goto L_0x008f
                int r12 = androidx.core.C1318R.dimen.notification_right_icon_size
                int r12 = r0.getDimensionPixelSize(r12)
                int r13 = androidx.core.C1318R.dimen.notification_small_icon_background_padding
                int r13 = r0.getDimensionPixelSize(r13)
                int r13 = r13 * 2
                int r13 = r12 - r13
                androidx.core.app.NotificationCompat$Builder r1 = r11.mBuilder
                android.app.Notification r2 = r1.mNotification
                int r2 = r2.icon
                int r1 = r1.getColor()
                android.graphics.Bitmap r12 = r11.createIconWithBackground(r2, r12, r13, r1)
                int r13 = androidx.core.C1318R.C1321id.right_icon
                r7.setImageViewBitmap(r13, r12)
                r7.setViewVisibility(r13, r8)
                goto L_0x008f
            L_0x005e:
                if (r12 == 0) goto L_0x008f
                android.app.Notification r12 = r13.mNotification
                int r12 = r12.icon
                if (r12 == 0) goto L_0x008f
                int r12 = androidx.core.C1318R.C1321id.icon
                r7.setViewVisibility(r12, r8)
                int r13 = androidx.core.C1318R.dimen.notification_large_icon_width
                int r13 = r0.getDimensionPixelSize(r13)
                int r1 = androidx.core.C1318R.dimen.notification_big_circle_margin
                int r1 = r0.getDimensionPixelSize(r1)
                int r13 = r13 - r1
                int r1 = androidx.core.C1318R.dimen.notification_small_icon_size_as_large
                int r1 = r0.getDimensionPixelSize(r1)
                androidx.core.app.NotificationCompat$Builder r2 = r11.mBuilder
                android.app.Notification r3 = r2.mNotification
                int r3 = r3.icon
                int r2 = r2.getColor()
                android.graphics.Bitmap r13 = r11.createIconWithBackground(r3, r13, r1, r2)
                r7.setImageViewBitmap(r12, r13)
            L_0x008f:
                androidx.core.app.NotificationCompat$Builder r12 = r11.mBuilder
                java.lang.CharSequence r12 = r12.mContentTitle
                if (r12 == 0) goto L_0x009a
                int r13 = androidx.core.C1318R.C1321id.title
                r7.setTextViewText(r13, r12)
            L_0x009a:
                androidx.core.app.NotificationCompat$Builder r12 = r11.mBuilder
                java.lang.CharSequence r12 = r12.mContentText
                r13 = 1
                if (r12 == 0) goto L_0x00a8
                int r1 = androidx.core.C1318R.C1321id.text
                r7.setTextViewText(r1, r12)
                r12 = r13
                goto L_0x00a9
            L_0x00a8:
                r12 = r8
            L_0x00a9:
                androidx.core.app.NotificationCompat$Builder r1 = r11.mBuilder
                java.lang.CharSequence r2 = r1.mContentInfo
                r9 = 8
                if (r2 == 0) goto L_0x00bc
                int r12 = androidx.core.C1318R.C1321id.info
                r7.setTextViewText(r12, r2)
                r7.setViewVisibility(r12, r8)
            L_0x00b9:
                r12 = r13
                r10 = r12
                goto L_0x00f6
            L_0x00bc:
                int r1 = r1.mNumber
                if (r1 <= 0) goto L_0x00f0
                int r12 = androidx.core.C1318R.integer.status_bar_notification_info_maxnum
                int r12 = r0.getInteger(r12)
                androidx.core.app.NotificationCompat$Builder r1 = r11.mBuilder
                int r1 = r1.mNumber
                if (r1 <= r12) goto L_0x00d8
                int r12 = androidx.core.C1318R.C1321id.info
                int r1 = androidx.core.C1318R.string.status_bar_notification_info_overflow
                java.lang.String r1 = r0.getString(r1)
                r7.setTextViewText(r12, r1)
                goto L_0x00ea
            L_0x00d8:
                java.text.NumberFormat r12 = java.text.NumberFormat.getIntegerInstance()
                int r1 = androidx.core.C1318R.C1321id.info
                androidx.core.app.NotificationCompat$Builder r2 = r11.mBuilder
                int r2 = r2.mNumber
                long r2 = (long) r2
                java.lang.String r12 = r12.format(r2)
                r7.setTextViewText(r1, r12)
            L_0x00ea:
                int r12 = androidx.core.C1318R.C1321id.info
                r7.setViewVisibility(r12, r8)
                goto L_0x00b9
            L_0x00f0:
                int r1 = androidx.core.C1318R.C1321id.info
                r7.setViewVisibility(r1, r9)
                r10 = r8
            L_0x00f6:
                androidx.core.app.NotificationCompat$Builder r1 = r11.mBuilder
                java.lang.CharSequence r1 = r1.mSubText
                if (r1 == 0) goto L_0x0116
                int r2 = androidx.core.C1318R.C1321id.text
                r7.setTextViewText(r2, r1)
                androidx.core.app.NotificationCompat$Builder r1 = r11.mBuilder
                java.lang.CharSequence r1 = r1.mContentText
                if (r1 == 0) goto L_0x0111
                int r2 = androidx.core.C1318R.C1321id.text2
                r7.setTextViewText(r2, r1)
                r7.setViewVisibility(r2, r8)
                r1 = r13
                goto L_0x0117
            L_0x0111:
                int r1 = androidx.core.C1318R.C1321id.text2
                r7.setViewVisibility(r1, r9)
            L_0x0116:
                r1 = r8
            L_0x0117:
                if (r1 == 0) goto L_0x0131
                if (r14 == 0) goto L_0x0127
                int r14 = androidx.core.C1318R.dimen.notification_subtext_size
                int r14 = r0.getDimensionPixelSize(r14)
                float r14 = (float) r14
                int r0 = androidx.core.C1318R.C1321id.text
                r7.setTextViewTextSize(r0, r8, r14)
            L_0x0127:
                int r2 = androidx.core.C1318R.C1321id.line1
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r1 = r7
                r1.setViewPadding(r2, r3, r4, r5, r6)
            L_0x0131:
                androidx.core.app.NotificationCompat$Builder r14 = r11.mBuilder
                long r0 = r14.getWhenIfShowing()
                r2 = 0
                int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r14 == 0) goto L_0x017d
                androidx.core.app.NotificationCompat$Builder r14 = r11.mBuilder
                boolean r14 = r14.mUseChronometer
                if (r14 == 0) goto L_0x016c
                int r14 = androidx.core.C1318R.C1321id.chronometer
                r7.setViewVisibility(r14, r8)
                androidx.core.app.NotificationCompat$Builder r0 = r11.mBuilder
                long r0 = r0.getWhenIfShowing()
                long r2 = android.os.SystemClock.elapsedRealtime()
                long r4 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r4
                long r0 = r0 + r2
                java.lang.String r2 = "setBase"
                r7.setLong(r14, r2, r0)
                java.lang.String r0 = "setStarted"
                r7.setBoolean(r14, r0, r13)
                androidx.core.app.NotificationCompat$Builder r0 = r11.mBuilder
                boolean r0 = r0.mChronometerCountDown
                if (r0 == 0) goto L_0x017e
                r7.setChronometerCountDown(r14, r0)
                goto L_0x017e
            L_0x016c:
                int r14 = androidx.core.C1318R.C1321id.time
                r7.setViewVisibility(r14, r8)
                androidx.core.app.NotificationCompat$Builder r0 = r11.mBuilder
                long r0 = r0.getWhenIfShowing()
                java.lang.String r2 = "setTime"
                r7.setLong(r14, r2, r0)
                goto L_0x017e
            L_0x017d:
                r13 = r10
            L_0x017e:
                int r14 = androidx.core.C1318R.C1321id.right_side
                if (r13 == 0) goto L_0x0184
                r13 = r8
                goto L_0x0185
            L_0x0184:
                r13 = r9
            L_0x0185:
                r7.setViewVisibility(r14, r13)
                int r13 = androidx.core.C1318R.C1321id.line3
                if (r12 == 0) goto L_0x018d
                goto L_0x018e
            L_0x018d:
                r8 = r9
            L_0x018e:
                r7.setViewVisibility(r13, r8)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.Style.applyStandardTemplate(boolean, int, boolean):android.widget.RemoteViews");
        }

        @Nullable
        public Notification build() {
            Builder builder = this.mBuilder;
            if (builder != null) {
                return builder.build();
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) {
            hideNormalContent(remoteViews);
            int i = C1318R.C1321id.notification_main_column;
            remoteViews.removeAllViews(i);
            remoteViews.addView(i, remoteViews2.clone());
            remoteViews.setViewVisibility(i, 0);
            remoteViews.setViewPadding(C1318R.C1321id.notification_main_column_container, 0, calculateTopPadding(), 0, 0);
        }

        /* access modifiers changed from: protected */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            bundle.remove(NotificationCompat.EXTRA_SUMMARY_TEXT);
            bundle.remove(NotificationCompat.EXTRA_TITLE_BIG);
            bundle.remove(NotificationCompat.EXTRA_COMPAT_TEMPLATE);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Bitmap createColoredBitmap(int i, int i2) {
            return createColoredBitmap(i, i2, 0);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean displayCustomViewInline() {
            return false;
        }

        /* access modifiers changed from: protected */
        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        /* access modifiers changed from: protected */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            if (bundle.containsKey(NotificationCompat.EXTRA_SUMMARY_TEXT)) {
                this.mSummaryText = bundle.getCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT);
                this.mSummaryTextSet = true;
            }
            this.mBigContentTitle = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
        }

        public void setBuilder(@Nullable Builder builder) {
            if (this.mBuilder != builder) {
                this.mBuilder = builder;
                if (builder != null) {
                    builder.setStyle(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public Bitmap createColoredBitmap(@NonNull IconCompat iconCompat, int i) {
            return createColoredBitmap(iconCompat, i, 0);
        }

        private Bitmap createColoredBitmap(int i, int i2, int i3) {
            return createColoredBitmap(IconCompat.createWithResource(this.mBuilder.mContext, i), i2, i3);
        }

        private Bitmap createColoredBitmap(@NonNull IconCompat iconCompat, int i, int i2) {
            Drawable loadDrawable = iconCompat.loadDrawable(this.mBuilder.mContext);
            int intrinsicWidth = i2 == 0 ? loadDrawable.getIntrinsicWidth() : i2;
            if (i2 == 0) {
                i2 = loadDrawable.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
            loadDrawable.setBounds(0, 0, intrinsicWidth, i2);
            if (i != 0) {
                loadDrawable.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            loadDrawable.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }
    }

    public static final class WearableExtender implements Extender {
        private static final int DEFAULT_CONTENT_ICON_GRAVITY = 8388613;
        private static final int DEFAULT_FLAGS = 1;
        private static final int DEFAULT_GRAVITY = 80;
        private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
        private static final int FLAG_BIG_PICTURE_AMBIENT = 32;
        private static final int FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE = 1;
        private static final int FLAG_HINT_AVOID_BACKGROUND_CLIPPING = 16;
        private static final int FLAG_HINT_CONTENT_INTENT_LAUNCHES_ACTIVITY = 64;
        private static final int FLAG_HINT_HIDE_ICON = 2;
        private static final int FLAG_HINT_SHOW_BACKGROUND_ONLY = 4;
        private static final int FLAG_START_SCROLL_BOTTOM = 8;
        private static final String KEY_ACTIONS = "actions";
        private static final String KEY_BACKGROUND = "background";
        private static final String KEY_BRIDGE_TAG = "bridgeTag";
        private static final String KEY_CONTENT_ACTION_INDEX = "contentActionIndex";
        private static final String KEY_CONTENT_ICON = "contentIcon";
        private static final String KEY_CONTENT_ICON_GRAVITY = "contentIconGravity";
        private static final String KEY_CUSTOM_CONTENT_HEIGHT = "customContentHeight";
        private static final String KEY_CUSTOM_SIZE_PRESET = "customSizePreset";
        private static final String KEY_DISMISSAL_ID = "dismissalId";
        private static final String KEY_DISPLAY_INTENT = "displayIntent";
        private static final String KEY_FLAGS = "flags";
        private static final String KEY_GRAVITY = "gravity";
        private static final String KEY_HINT_SCREEN_TIMEOUT = "hintScreenTimeout";
        private static final String KEY_PAGES = "pages";
        @Deprecated
        public static final int SCREEN_TIMEOUT_LONG = -1;
        @Deprecated
        public static final int SCREEN_TIMEOUT_SHORT = 0;
        @Deprecated
        public static final int SIZE_DEFAULT = 0;
        @Deprecated
        public static final int SIZE_FULL_SCREEN = 5;
        @Deprecated
        public static final int SIZE_LARGE = 4;
        @Deprecated
        public static final int SIZE_MEDIUM = 3;
        @Deprecated
        public static final int SIZE_SMALL = 2;
        @Deprecated
        public static final int SIZE_XSMALL = 1;
        public static final int UNSET_ACTION_INDEX = -1;
        private ArrayList<Action> mActions = new ArrayList<>();
        private Bitmap mBackground;
        private String mBridgeTag;
        private int mContentActionIndex = -1;
        private int mContentIcon;
        private int mContentIconGravity = 8388613;
        private int mCustomContentHeight;
        private int mCustomSizePreset = 0;
        private String mDismissalId;
        private PendingIntent mDisplayIntent;
        private int mFlags = 1;
        private int mGravity = 80;
        private int mHintScreenTimeout;
        private ArrayList<Notification> mPages = new ArrayList<>();

        public WearableExtender() {
        }

        @RequiresApi(20)
        private static Notification.Action getActionFromActionCompat(Action action) {
            Icon icon;
            Bundle bundle;
            int i = Build.VERSION.SDK_INT;
            IconCompat iconCompat = action.getIconCompat();
            if (iconCompat == null) {
                icon = null;
            } else {
                icon = iconCompat.toIcon();
            }
            Notification.Action.Builder builder = new Notification.Action.Builder(icon, action.getTitle(), action.getActionIntent());
            if (action.getExtras() != null) {
                bundle = new Bundle(action.getExtras());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
            builder.setAllowGeneratedReplies(action.getAllowGeneratedReplies());
            if (i >= 31) {
                Notification.Action.Builder unused = builder.setAuthenticationRequired(action.isAuthenticationRequired());
            }
            builder.addExtras(bundle);
            RemoteInput[] remoteInputs = action.getRemoteInputs();
            if (remoteInputs != null) {
                for (RemoteInput addRemoteInput : RemoteInput.fromCompat(remoteInputs)) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            return builder.build();
        }

        private void setFlag(int i, boolean z) {
            if (z) {
                this.mFlags = i | this.mFlags;
                return;
            }
            this.mFlags = (~i) & this.mFlags;
        }

        @NonNull
        public WearableExtender addAction(@NonNull Action action) {
            this.mActions.add(action);
            return this;
        }

        @NonNull
        public WearableExtender addActions(@NonNull List<Action> list) {
            this.mActions.addAll(list);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender addPage(@NonNull Notification notification) {
            this.mPages.add(notification);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender addPages(@NonNull List<Notification> list) {
            this.mPages.addAll(list);
            return this;
        }

        @NonNull
        public WearableExtender clearActions() {
            this.mActions.clear();
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender clearPages() {
            this.mPages.clear();
            return this;
        }

        @NonNull
        public Builder extend(@NonNull Builder builder) {
            Bundle bundle = new Bundle();
            if (!this.mActions.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.mActions.size());
                Iterator<Action> it = this.mActions.iterator();
                while (it.hasNext()) {
                    arrayList.add(getActionFromActionCompat(it.next()));
                }
                bundle.putParcelableArrayList(KEY_ACTIONS, arrayList);
            }
            int i = this.mFlags;
            if (i != 1) {
                bundle.putInt(KEY_FLAGS, i);
            }
            PendingIntent pendingIntent = this.mDisplayIntent;
            if (pendingIntent != null) {
                bundle.putParcelable(KEY_DISPLAY_INTENT, pendingIntent);
            }
            if (!this.mPages.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.mPages;
                bundle.putParcelableArray(KEY_PAGES, (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.mBackground;
            if (bitmap != null) {
                bundle.putParcelable(KEY_BACKGROUND, bitmap);
            }
            int i2 = this.mContentIcon;
            if (i2 != 0) {
                bundle.putInt(KEY_CONTENT_ICON, i2);
            }
            int i3 = this.mContentIconGravity;
            if (i3 != 8388613) {
                bundle.putInt(KEY_CONTENT_ICON_GRAVITY, i3);
            }
            int i4 = this.mContentActionIndex;
            if (i4 != -1) {
                bundle.putInt(KEY_CONTENT_ACTION_INDEX, i4);
            }
            int i5 = this.mCustomSizePreset;
            if (i5 != 0) {
                bundle.putInt(KEY_CUSTOM_SIZE_PRESET, i5);
            }
            int i6 = this.mCustomContentHeight;
            if (i6 != 0) {
                bundle.putInt(KEY_CUSTOM_CONTENT_HEIGHT, i6);
            }
            int i7 = this.mGravity;
            if (i7 != 80) {
                bundle.putInt(KEY_GRAVITY, i7);
            }
            int i8 = this.mHintScreenTimeout;
            if (i8 != 0) {
                bundle.putInt(KEY_HINT_SCREEN_TIMEOUT, i8);
            }
            String str = this.mDismissalId;
            if (str != null) {
                bundle.putString(KEY_DISMISSAL_ID, str);
            }
            String str2 = this.mBridgeTag;
            if (str2 != null) {
                bundle.putString(KEY_BRIDGE_TAG, str2);
            }
            builder.getExtras().putBundle(EXTRA_WEARABLE_EXTENSIONS, bundle);
            return builder;
        }

        @NonNull
        public List<Action> getActions() {
            return this.mActions;
        }

        @Deprecated
        @Nullable
        public Bitmap getBackground() {
            return this.mBackground;
        }

        @Nullable
        public String getBridgeTag() {
            return this.mBridgeTag;
        }

        public int getContentAction() {
            return this.mContentActionIndex;
        }

        @Deprecated
        public int getContentIcon() {
            return this.mContentIcon;
        }

        @Deprecated
        public int getContentIconGravity() {
            return this.mContentIconGravity;
        }

        public boolean getContentIntentAvailableOffline() {
            if ((this.mFlags & 1) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public int getCustomContentHeight() {
            return this.mCustomContentHeight;
        }

        @Deprecated
        public int getCustomSizePreset() {
            return this.mCustomSizePreset;
        }

        @Nullable
        public String getDismissalId() {
            return this.mDismissalId;
        }

        @Deprecated
        @Nullable
        public PendingIntent getDisplayIntent() {
            return this.mDisplayIntent;
        }

        @Deprecated
        public int getGravity() {
            return this.mGravity;
        }

        @Deprecated
        public boolean getHintAmbientBigPicture() {
            if ((this.mFlags & 32) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public boolean getHintAvoidBackgroundClipping() {
            if ((this.mFlags & 16) != 0) {
                return true;
            }
            return false;
        }

        public boolean getHintContentIntentLaunchesActivity() {
            if ((this.mFlags & 64) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public boolean getHintHideIcon() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public int getHintScreenTimeout() {
            return this.mHintScreenTimeout;
        }

        @Deprecated
        public boolean getHintShowBackgroundOnly() {
            if ((this.mFlags & 4) != 0) {
                return true;
            }
            return false;
        }

        @NonNull
        @Deprecated
        public List<Notification> getPages() {
            return this.mPages;
        }

        public boolean getStartScrollBottom() {
            if ((this.mFlags & 8) != 0) {
                return true;
            }
            return false;
        }

        @NonNull
        @Deprecated
        public WearableExtender setBackground(@Nullable Bitmap bitmap) {
            this.mBackground = bitmap;
            return this;
        }

        @NonNull
        public WearableExtender setBridgeTag(@Nullable String str) {
            this.mBridgeTag = str;
            return this;
        }

        @NonNull
        public WearableExtender setContentAction(int i) {
            this.mContentActionIndex = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setContentIcon(int i) {
            this.mContentIcon = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setContentIconGravity(int i) {
            this.mContentIconGravity = i;
            return this;
        }

        @NonNull
        public WearableExtender setContentIntentAvailableOffline(boolean z) {
            setFlag(1, z);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setCustomContentHeight(int i) {
            this.mCustomContentHeight = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setCustomSizePreset(int i) {
            this.mCustomSizePreset = i;
            return this;
        }

        @NonNull
        public WearableExtender setDismissalId(@Nullable String str) {
            this.mDismissalId = str;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setDisplayIntent(@Nullable PendingIntent pendingIntent) {
            this.mDisplayIntent = pendingIntent;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setGravity(int i) {
            this.mGravity = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintAmbientBigPicture(boolean z) {
            setFlag(32, z);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintAvoidBackgroundClipping(boolean z) {
            setFlag(16, z);
            return this;
        }

        @NonNull
        public WearableExtender setHintContentIntentLaunchesActivity(boolean z) {
            setFlag(64, z);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintHideIcon(boolean z) {
            setFlag(2, z);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintScreenTimeout(int i) {
            this.mHintScreenTimeout = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintShowBackgroundOnly(boolean z) {
            setFlag(4, z);
            return this;
        }

        @NonNull
        public WearableExtender setStartScrollBottom(boolean z) {
            setFlag(8, z);
            return this;
        }

        @NonNull
        public WearableExtender clone() {
            WearableExtender wearableExtender = new WearableExtender();
            wearableExtender.mActions = new ArrayList<>(this.mActions);
            wearableExtender.mFlags = this.mFlags;
            wearableExtender.mDisplayIntent = this.mDisplayIntent;
            wearableExtender.mPages = new ArrayList<>(this.mPages);
            wearableExtender.mBackground = this.mBackground;
            wearableExtender.mContentIcon = this.mContentIcon;
            wearableExtender.mContentIconGravity = this.mContentIconGravity;
            wearableExtender.mContentActionIndex = this.mContentActionIndex;
            wearableExtender.mCustomSizePreset = this.mCustomSizePreset;
            wearableExtender.mCustomContentHeight = this.mCustomContentHeight;
            wearableExtender.mGravity = this.mGravity;
            wearableExtender.mHintScreenTimeout = this.mHintScreenTimeout;
            wearableExtender.mDismissalId = this.mDismissalId;
            wearableExtender.mBridgeTag = this.mBridgeTag;
            return wearableExtender;
        }

        public WearableExtender(@NonNull Notification notification) {
            Bundle extras = NotificationCompat.getExtras(notification);
            Bundle bundle = extras != null ? extras.getBundle(EXTRA_WEARABLE_EXTENSIONS) : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(KEY_ACTIONS);
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    Action[] actionArr = new Action[size];
                    for (int i = 0; i < size; i++) {
                        actionArr[i] = NotificationCompat.getActionCompatFromAction((Notification.Action) parcelableArrayList.get(i));
                    }
                    Collections.addAll(this.mActions, actionArr);
                }
                this.mFlags = bundle.getInt(KEY_FLAGS, 1);
                this.mDisplayIntent = (PendingIntent) bundle.getParcelable(KEY_DISPLAY_INTENT);
                Notification[] notificationArrayFromBundle = NotificationCompat.getNotificationArrayFromBundle(bundle, KEY_PAGES);
                if (notificationArrayFromBundle != null) {
                    Collections.addAll(this.mPages, notificationArrayFromBundle);
                }
                this.mBackground = (Bitmap) bundle.getParcelable(KEY_BACKGROUND);
                this.mContentIcon = bundle.getInt(KEY_CONTENT_ICON);
                this.mContentIconGravity = bundle.getInt(KEY_CONTENT_ICON_GRAVITY, 8388613);
                this.mContentActionIndex = bundle.getInt(KEY_CONTENT_ACTION_INDEX, -1);
                this.mCustomSizePreset = bundle.getInt(KEY_CUSTOM_SIZE_PRESET, 0);
                this.mCustomContentHeight = bundle.getInt(KEY_CUSTOM_CONTENT_HEIGHT);
                this.mGravity = bundle.getInt(KEY_GRAVITY, 80);
                this.mHintScreenTimeout = bundle.getInt(KEY_HINT_SCREEN_TIMEOUT);
                this.mDismissalId = bundle.getString(KEY_DISMISSAL_ID);
                this.mBridgeTag = bundle.getString(KEY_BRIDGE_TAG);
            }
        }
    }

    @Nullable
    public static Action getAction(@NonNull Notification notification, int i) {
        return getActionCompatFromAction(notification.actions[i]);
    }

    @RequiresApi(20)
    @NonNull
    static Action getActionCompatFromAction(@NonNull Notification.Action action) {
        RemoteInput[] remoteInputArr;
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        Notification.Action action2 = action;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        IconCompat iconCompat = null;
        boolean z3 = false;
        if (remoteInputs == null) {
            remoteInputArr = null;
        } else {
            RemoteInput[] remoteInputArr2 = new RemoteInput[remoteInputs.length];
            for (int i4 = 0; i4 < remoteInputs.length; i4++) {
                RemoteInput remoteInput = remoteInputs[i4];
                String resultKey = remoteInput.getResultKey();
                CharSequence label = remoteInput.getLabel();
                CharSequence[] choices = remoteInput.getChoices();
                boolean allowFreeFormInput = remoteInput.getAllowFreeFormInput();
                if (Build.VERSION.SDK_INT >= 29) {
                    i3 = remoteInput.getEditChoicesBeforeSending();
                } else {
                    i3 = 0;
                }
                remoteInputArr2[i4] = new RemoteInput(resultKey, label, choices, allowFreeFormInput, i3, remoteInput.getExtras(), (Set<String>) null);
            }
            remoteInputArr = remoteInputArr2;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (action.getExtras().getBoolean("android.support.allowGeneratedReplies") || action.getAllowGeneratedReplies()) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        if (i5 >= 28) {
            i = action.getSemanticAction();
        } else {
            i = action.getExtras().getInt("android.support.action.semanticAction", 0);
        }
        int i6 = i;
        if (i5 >= 29) {
            z2 = action.isContextual();
        } else {
            z2 = false;
        }
        if (i5 >= 31) {
            z3 = action.isAuthenticationRequired();
        }
        boolean z5 = z3;
        if (action.getIcon() == null && (i2 = action2.icon) != 0) {
            return new Action(i2, action2.title, action2.actionIntent, action.getExtras(), remoteInputArr, (RemoteInput[]) null, z, i6, z4, z2, z5);
        }
        if (action.getIcon() != null) {
            iconCompat = IconCompat.createFromIconOrNullIfZeroResId(action.getIcon());
        }
        return new Action(iconCompat, action2.title, action2.actionIntent, action.getExtras(), remoteInputArr, (RemoteInput[]) null, z, i6, z4, z2, z5);
    }

    public static int getActionCount(@NonNull Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean getAllowSystemGeneratedContextualActions(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return notification.getAllowSystemGeneratedContextualActions();
        }
        return false;
    }

    public static boolean getAutoCancel(@NonNull Notification notification) {
        if ((notification.flags & 16) != 0) {
            return true;
        }
        return false;
    }

    public static int getBadgeIconType(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getBadgeIconType();
        }
        return 0;
    }

    @Nullable
    public static BubbleMetadata getBubbleMetadata(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return BubbleMetadata.fromPlatform(notification.getBubbleMetadata());
        }
        return null;
    }

    @Nullable
    public static String getCategory(@NonNull Notification notification) {
        return notification.category;
    }

    @Nullable
    public static String getChannelId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getChannelId();
        }
        return null;
    }

    public static int getColor(@NonNull Notification notification) {
        return notification.color;
    }

    @RequiresApi(19)
    @Nullable
    public static CharSequence getContentInfo(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    @RequiresApi(19)
    @Nullable
    public static CharSequence getContentText(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    @RequiresApi(19)
    @Nullable
    public static CharSequence getContentTitle(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    @Nullable
    public static Bundle getExtras(@NonNull Notification notification) {
        return notification.extras;
    }

    @Nullable
    public static String getGroup(@NonNull Notification notification) {
        return notification.getGroup();
    }

    public static int getGroupAlertBehavior(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getGroupAlertBehavior();
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static boolean getHighPriority(@NonNull Notification notification) {
        if ((notification.flags & 128) != 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(21)
    @NonNull
    public static List<Action> getInvisibleActions(@NonNull Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (!(bundle2 == null || (bundle = bundle2.getBundle("invisible_actions")) == null)) {
            for (int i = 0; i < bundle.size(); i++) {
                arrayList.add(NotificationCompatJellybean.getActionFromBundle(bundle.getBundle(Integer.toString(i))));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(@NonNull Notification notification) {
        if ((notification.flags & 256) != 0) {
            return true;
        }
        return false;
    }

    @Nullable
    public static LocusIdCompat getLocusId(@NonNull Notification notification) {
        LocusId a;
        if (Build.VERSION.SDK_INT < 29 || (a = notification.getLocusId()) == null) {
            return null;
        }
        return LocusIdCompat.toLocusIdCompat(a);
    }

    @NonNull
    static Notification[] getNotificationArrayFromBundle(@NonNull Bundle bundle, @NonNull String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            notificationArr[i] = (Notification) parcelableArray[i];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static boolean getOngoing(@NonNull Notification notification) {
        if ((notification.flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean getOnlyAlertOnce(@NonNull Notification notification) {
        if ((notification.flags & 8) != 0) {
            return true;
        }
        return false;
    }

    @NonNull
    public static List<Person> getPeople(@NonNull Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(Person.fromAndroidPerson((Person) it.next()));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(EXTRA_PEOPLE);
            if (!(stringArray == null || stringArray.length == 0)) {
                for (String uri : stringArray) {
                    arrayList.add(new Person.Builder().setUri(uri).build());
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static Notification getPublicVersion(@NonNull Notification notification) {
        return notification.publicVersion;
    }

    @Nullable
    public static CharSequence getSettingsText(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getSettingsText();
        }
        return null;
    }

    @Nullable
    public static String getShortcutId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getShortcutId();
        }
        return null;
    }

    @RequiresApi(19)
    public static boolean getShowWhen(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    @Nullable
    public static String getSortKey(@NonNull Notification notification) {
        return notification.getSortKey();
    }

    @RequiresApi(19)
    @Nullable
    public static CharSequence getSubText(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static long getTimeoutAfter(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getTimeoutAfter();
        }
        return 0;
    }

    @RequiresApi(19)
    public static boolean getUsesChronometer(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static int getVisibility(@NonNull Notification notification) {
        return notification.visibility;
    }

    public static boolean isGroupSummary(@NonNull Notification notification) {
        if ((notification.flags & 512) != 0) {
            return true;
        }
        return false;
    }

    public static final class CarExtender implements Extender {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        static final String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
        private static final String EXTRA_COLOR = "app_color";
        private static final String EXTRA_CONVERSATION = "car_conversation";
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        static final String EXTRA_INVISIBLE_ACTIONS = "invisible_actions";
        private static final String EXTRA_LARGE_ICON = "large_icon";
        private static final String KEY_AUTHOR = "author";
        private static final String KEY_MESSAGES = "messages";
        private static final String KEY_ON_READ = "on_read";
        private static final String KEY_ON_REPLY = "on_reply";
        private static final String KEY_PARTICIPANTS = "participants";
        private static final String KEY_REMOTE_INPUT = "remote_input";
        private static final String KEY_TEXT = "text";
        private static final String KEY_TIMESTAMP = "timestamp";
        private int mColor = 0;
        private Bitmap mLargeIcon;
        private UnreadConversation mUnreadConversation;

        @Deprecated
        public static class UnreadConversation {
            private final long mLatestTimestamp;
            private final String[] mMessages;
            private final String[] mParticipants;
            private final PendingIntent mReadPendingIntent;
            private final RemoteInput mRemoteInput;
            private final PendingIntent mReplyPendingIntent;

            public static class Builder {
                private long mLatestTimestamp;
                private final List<String> mMessages = new ArrayList();
                private final String mParticipant;
                private PendingIntent mReadPendingIntent;
                private RemoteInput mRemoteInput;
                private PendingIntent mReplyPendingIntent;

                public Builder(@NonNull String str) {
                    this.mParticipant = str;
                }

                @NonNull
                public Builder addMessage(@Nullable String str) {
                    if (str != null) {
                        this.mMessages.add(str);
                    }
                    return this;
                }

                @NonNull
                public UnreadConversation build() {
                    List<String> list = this.mMessages;
                    return new UnreadConversation((String[]) list.toArray(new String[list.size()]), this.mRemoteInput, this.mReplyPendingIntent, this.mReadPendingIntent, new String[]{this.mParticipant}, this.mLatestTimestamp);
                }

                @NonNull
                public Builder setLatestTimestamp(long j) {
                    this.mLatestTimestamp = j;
                    return this;
                }

                @NonNull
                public Builder setReadPendingIntent(@Nullable PendingIntent pendingIntent) {
                    this.mReadPendingIntent = pendingIntent;
                    return this;
                }

                @NonNull
                public Builder setReplyAction(@Nullable PendingIntent pendingIntent, @Nullable RemoteInput remoteInput) {
                    this.mRemoteInput = remoteInput;
                    this.mReplyPendingIntent = pendingIntent;
                    return this;
                }
            }

            UnreadConversation(@Nullable String[] strArr, @Nullable RemoteInput remoteInput, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable String[] strArr2, long j) {
                this.mMessages = strArr;
                this.mRemoteInput = remoteInput;
                this.mReadPendingIntent = pendingIntent2;
                this.mReplyPendingIntent = pendingIntent;
                this.mParticipants = strArr2;
                this.mLatestTimestamp = j;
            }

            public long getLatestTimestamp() {
                return this.mLatestTimestamp;
            }

            @Nullable
            public String[] getMessages() {
                return this.mMessages;
            }

            @Nullable
            public String getParticipant() {
                String[] strArr = this.mParticipants;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @Nullable
            public String[] getParticipants() {
                return this.mParticipants;
            }

            @Nullable
            public PendingIntent getReadPendingIntent() {
                return this.mReadPendingIntent;
            }

            @Nullable
            public RemoteInput getRemoteInput() {
                return this.mRemoteInput;
            }

            @Nullable
            public PendingIntent getReplyPendingIntent() {
                return this.mReplyPendingIntent;
            }
        }

        public CarExtender() {
        }

        @RequiresApi(21)
        private static Bundle getBundleForUnreadConversation(@NonNull UnreadConversation unreadConversation) {
            String str;
            Bundle bundle = new Bundle();
            if (unreadConversation.getParticipants() == null || unreadConversation.getParticipants().length <= 1) {
                str = null;
            } else {
                str = unreadConversation.getParticipants()[0];
            }
            int length = unreadConversation.getMessages().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i = 0; i < length; i++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(KEY_TEXT, unreadConversation.getMessages()[i]);
                bundle2.putString(KEY_AUTHOR, str);
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray(KEY_MESSAGES, parcelableArr);
            RemoteInput remoteInput = unreadConversation.getRemoteInput();
            if (remoteInput != null) {
                bundle.putParcelable(KEY_REMOTE_INPUT, new RemoteInput.Builder(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras()).build());
            }
            bundle.putParcelable(KEY_ON_REPLY, unreadConversation.getReplyPendingIntent());
            bundle.putParcelable(KEY_ON_READ, unreadConversation.getReadPendingIntent());
            bundle.putStringArray(KEY_PARTICIPANTS, unreadConversation.getParticipants());
            bundle.putLong(KEY_TIMESTAMP, unreadConversation.getLatestTimestamp());
            return bundle;
        }

        @RequiresApi(21)
        private static UnreadConversation getUnreadConversationFromBundle(@Nullable Bundle bundle) {
            String[] strArr;
            boolean z;
            Bundle bundle2 = bundle;
            RemoteInput remoteInput = null;
            if (bundle2 == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle2.getParcelableArray(KEY_MESSAGES);
            int i = 0;
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = true;
                        break;
                    }
                    Parcelable parcelable = parcelableArray[i2];
                    if (!(parcelable instanceof Bundle)) {
                        break;
                    }
                    String string = ((Bundle) parcelable).getString(KEY_TEXT);
                    strArr2[i2] = string;
                    if (string == null) {
                        break;
                    }
                    i2++;
                }
                z = false;
                if (!z) {
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle2.getParcelable(KEY_ON_READ);
            PendingIntent pendingIntent2 = (PendingIntent) bundle2.getParcelable(KEY_ON_REPLY);
            RemoteInput remoteInput2 = (RemoteInput) bundle2.getParcelable(KEY_REMOTE_INPUT);
            String[] stringArray = bundle2.getStringArray(KEY_PARTICIPANTS);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            if (remoteInput2 != null) {
                String resultKey = remoteInput2.getResultKey();
                CharSequence label = remoteInput2.getLabel();
                CharSequence[] choices = remoteInput2.getChoices();
                boolean allowFreeFormInput = remoteInput2.getAllowFreeFormInput();
                if (Build.VERSION.SDK_INT >= 29) {
                    i = remoteInput2.getEditChoicesBeforeSending();
                }
                remoteInput = new RemoteInput(resultKey, label, choices, allowFreeFormInput, i, remoteInput2.getExtras(), (Set<String>) null);
            }
            return new UnreadConversation(strArr, remoteInput, pendingIntent2, pendingIntent, stringArray, bundle2.getLong(KEY_TIMESTAMP));
        }

        @NonNull
        public Builder extend(@NonNull Builder builder) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.mLargeIcon;
            if (bitmap != null) {
                bundle.putParcelable(EXTRA_LARGE_ICON, bitmap);
            }
            int i = this.mColor;
            if (i != 0) {
                bundle.putInt(EXTRA_COLOR, i);
            }
            UnreadConversation unreadConversation = this.mUnreadConversation;
            if (unreadConversation != null) {
                bundle.putBundle(EXTRA_CONVERSATION, getBundleForUnreadConversation(unreadConversation));
            }
            builder.getExtras().putBundle(EXTRA_CAR_EXTENDER, bundle);
            return builder;
        }

        @ColorInt
        public int getColor() {
            return this.mColor;
        }

        @Nullable
        public Bitmap getLargeIcon() {
            return this.mLargeIcon;
        }

        @Deprecated
        @Nullable
        public UnreadConversation getUnreadConversation() {
            return this.mUnreadConversation;
        }

        @NonNull
        public CarExtender setColor(@ColorInt int i) {
            this.mColor = i;
            return this;
        }

        @NonNull
        public CarExtender setLargeIcon(@Nullable Bitmap bitmap) {
            this.mLargeIcon = bitmap;
            return this;
        }

        @NonNull
        @Deprecated
        public CarExtender setUnreadConversation(@Nullable UnreadConversation unreadConversation) {
            this.mUnreadConversation = unreadConversation;
            return this;
        }

        public CarExtender(@NonNull Notification notification) {
            Bundle bundle;
            if (NotificationCompat.getExtras(notification) == null) {
                bundle = null;
            } else {
                bundle = NotificationCompat.getExtras(notification).getBundle(EXTRA_CAR_EXTENDER);
            }
            if (bundle != null) {
                this.mLargeIcon = (Bitmap) bundle.getParcelable(EXTRA_LARGE_ICON);
                this.mColor = bundle.getInt(EXTRA_COLOR, 0);
                this.mUnreadConversation = getUnreadConversationFromBundle(bundle.getBundle(EXTRA_CONVERSATION));
            }
        }
    }

    public static class InboxStyle extends Style {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$InboxStyle";
        private ArrayList<CharSequence> mTexts = new ArrayList<>();

        public InboxStyle() {
        }

        @NonNull
        public InboxStyle addLine(@Nullable CharSequence charSequence) {
            if (charSequence != null) {
                this.mTexts.add(Builder.limitCharSequenceLength(charSequence));
            }
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle);
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            Iterator<CharSequence> it = this.mTexts.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        /* access modifiers changed from: protected */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_TEXT_LINES);
        }

        /* access modifiers changed from: protected */
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        /* access modifiers changed from: protected */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mTexts.clear();
            if (bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
                Collections.addAll(this.mTexts, bundle.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES));
            }
        }

        @NonNull
        public InboxStyle setBigContentTitle(@Nullable CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public InboxStyle setSummaryText(@Nullable CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        public InboxStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }
    }

    public static class MessagingStyle extends Style {
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$MessagingStyle";
        @Nullable
        private CharSequence mConversationTitle;
        private final List<Message> mHistoricMessages = new ArrayList();
        @Nullable
        private Boolean mIsGroupConversation;
        private final List<Message> mMessages = new ArrayList();
        private Person mUser;

        MessagingStyle() {
        }

        @Nullable
        public static MessagingStyle extractMessagingStyleFromNotification(@NonNull Notification notification) {
            Style extractStyleFromNotification = Style.extractStyleFromNotification(notification);
            if (extractStyleFromNotification instanceof MessagingStyle) {
                return (MessagingStyle) extractStyleFromNotification;
            }
            return null;
        }

        @Nullable
        private Message findLatestIncomingMessage() {
            for (int size = this.mMessages.size() - 1; size >= 0; size--) {
                Message message = this.mMessages.get(size);
                if (message.getPerson() != null && !TextUtils.isEmpty(message.getPerson().getName())) {
                    return message;
                }
            }
            if (this.mMessages.isEmpty()) {
                return null;
            }
            List<Message> list = this.mMessages;
            return list.get(list.size() - 1);
        }

        private boolean hasMessagesWithoutSender() {
            for (int size = this.mMessages.size() - 1; size >= 0; size--) {
                Message message = this.mMessages.get(size);
                if (message.getPerson() != null && message.getPerson().getName() == null) {
                    return true;
                }
            }
            return false;
        }

        @NonNull
        private TextAppearanceSpan makeFontColorSpan(int i) {
            return new TextAppearanceSpan((String) null, 0, 0, ColorStateList.valueOf(i), (ColorStateList) null);
        }

        private CharSequence makeMessageLine(@NonNull Message message) {
            CharSequence charSequence;
            BidiFormatter instance = BidiFormatter.getInstance();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence charSequence2 = "";
            if (message.getPerson() == null) {
                charSequence = charSequence2;
            } else {
                charSequence = message.getPerson().getName();
            }
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            int i = ViewCompat.MEASURED_STATE_MASK;
            if (isEmpty) {
                charSequence = this.mUser.getName();
                if (this.mBuilder.getColor() != 0) {
                    i = this.mBuilder.getColor();
                }
            }
            CharSequence unicodeWrap = instance.unicodeWrap(charSequence);
            spannableStringBuilder.append(unicodeWrap);
            spannableStringBuilder.setSpan(makeFontColorSpan(i), spannableStringBuilder.length() - unicodeWrap.length(), spannableStringBuilder.length(), 33);
            if (message.getText() != null) {
                charSequence2 = message.getText();
            }
            spannableStringBuilder.append("  ").append(instance.unicodeWrap(charSequence2));
            return spannableStringBuilder;
        }

        public void addCompatExtras(@NonNull Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putCharSequence(NotificationCompat.EXTRA_SELF_DISPLAY_NAME, this.mUser.getName());
            bundle.putBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER, this.mUser.toBundle());
            bundle.putCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE, this.mConversationTitle);
            if (this.mConversationTitle != null && this.mIsGroupConversation.booleanValue()) {
                bundle.putCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE, this.mConversationTitle);
            }
            if (!this.mMessages.isEmpty()) {
                bundle.putParcelableArray(NotificationCompat.EXTRA_MESSAGES, Message.getBundleArrayForMessages(this.mMessages));
            }
            if (!this.mHistoricMessages.isEmpty()) {
                bundle.putParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES, Message.getBundleArrayForMessages(this.mHistoricMessages));
            }
            Boolean bool = this.mIsGroupConversation;
            if (bool != null) {
                bundle.putBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION, bool.booleanValue());
            }
        }

        @NonNull
        public MessagingStyle addHistoricMessage(@Nullable Message message) {
            if (message != null) {
                this.mHistoricMessages.add(message);
                if (this.mHistoricMessages.size() > 25) {
                    this.mHistoricMessages.remove(0);
                }
            }
            return this;
        }

        @NonNull
        @Deprecated
        public MessagingStyle addMessage(@Nullable CharSequence charSequence, long j, @Nullable CharSequence charSequence2) {
            this.mMessages.add(new Message(charSequence, j, new Person.Builder().setName(charSequence2).build()));
            if (this.mMessages.size() > 25) {
                this.mMessages.remove(0);
            }
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.MessagingStyle messagingStyle;
            setGroupConversation(isGroupConversation());
            if (Build.VERSION.SDK_INT >= 28) {
                messagingStyle = new Notification.MessagingStyle(this.mUser.toAndroidPerson());
            } else {
                messagingStyle = new Notification.MessagingStyle(this.mUser.getName());
            }
            for (Message androidMessage : this.mMessages) {
                messagingStyle.addMessage(androidMessage.toAndroidMessage());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                for (Message androidMessage2 : this.mHistoricMessages) {
                    Notification.MessagingStyle unused = messagingStyle.addHistoricMessage(androidMessage2.toAndroidMessage());
                }
            }
            if (this.mIsGroupConversation.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                messagingStyle.setConversationTitle(this.mConversationTitle);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                Notification.MessagingStyle unused2 = messagingStyle.setGroupConversation(this.mIsGroupConversation.booleanValue());
            }
            messagingStyle.setBuilder(notificationBuilderWithBuilderAccessor.getBuilder());
        }

        /* access modifiers changed from: protected */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_MESSAGING_STYLE_USER);
            bundle.remove(NotificationCompat.EXTRA_SELF_DISPLAY_NAME);
            bundle.remove(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            bundle.remove(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            bundle.remove(NotificationCompat.EXTRA_MESSAGES);
            bundle.remove(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            bundle.remove(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION);
        }

        /* access modifiers changed from: protected */
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Nullable
        public CharSequence getConversationTitle() {
            return this.mConversationTitle;
        }

        @NonNull
        public List<Message> getHistoricMessages() {
            return this.mHistoricMessages;
        }

        @NonNull
        public List<Message> getMessages() {
            return this.mMessages;
        }

        @NonNull
        public Person getUser() {
            return this.mUser;
        }

        @Deprecated
        @Nullable
        public CharSequence getUserDisplayName() {
            return this.mUser.getName();
        }

        public boolean isGroupConversation() {
            Builder builder = this.mBuilder;
            if (builder == null || builder.mContext.getApplicationInfo().targetSdkVersion >= 28 || this.mIsGroupConversation != null) {
                Boolean bool = this.mIsGroupConversation;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } else if (this.mConversationTitle != null) {
                return true;
            } else {
                return false;
            }
        }

        /* access modifiers changed from: protected */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mMessages.clear();
            if (bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                this.mUser = Person.fromBundle(bundle.getBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER));
            } else {
                this.mUser = new Person.Builder().setName(bundle.getString(NotificationCompat.EXTRA_SELF_DISPLAY_NAME)).build();
            }
            CharSequence charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            this.mConversationTitle = charSequence;
            if (charSequence == null) {
                this.mConversationTitle = bundle.getCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(NotificationCompat.EXTRA_MESSAGES);
            if (parcelableArray != null) {
                this.mMessages.addAll(Message.getMessagesFromBundleArray(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            if (parcelableArray2 != null) {
                this.mHistoricMessages.addAll(Message.getMessagesFromBundleArray(parcelableArray2));
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION)) {
                this.mIsGroupConversation = Boolean.valueOf(bundle.getBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION));
            }
        }

        @NonNull
        public MessagingStyle setConversationTitle(@Nullable CharSequence charSequence) {
            this.mConversationTitle = charSequence;
            return this;
        }

        @NonNull
        public MessagingStyle setGroupConversation(boolean z) {
            this.mIsGroupConversation = Boolean.valueOf(z);
            return this;
        }

        @Deprecated
        public MessagingStyle(@NonNull CharSequence charSequence) {
            this.mUser = new Person.Builder().setName(charSequence).build();
        }

        public static final class Message {
            static final String KEY_DATA_MIME_TYPE = "type";
            static final String KEY_DATA_URI = "uri";
            static final String KEY_EXTRAS_BUNDLE = "extras";
            static final String KEY_NOTIFICATION_PERSON = "sender_person";
            static final String KEY_PERSON = "person";
            static final String KEY_SENDER = "sender";
            static final String KEY_TEXT = "text";
            static final String KEY_TIMESTAMP = "time";
            @Nullable
            private String mDataMimeType;
            @Nullable
            private Uri mDataUri;
            private Bundle mExtras;
            @Nullable
            private final Person mPerson;
            private final CharSequence mText;
            private final long mTimestamp;

            public Message(@Nullable CharSequence charSequence, long j, @Nullable Person person) {
                this.mExtras = new Bundle();
                this.mText = charSequence;
                this.mTimestamp = j;
                this.mPerson = person;
            }

            @NonNull
            static Bundle[] getBundleArrayForMessages(@NonNull List<Message> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).toBundle();
                }
                return bundleArr;
            }

            @Nullable
            static Message getMessageFromBundle(@NonNull Bundle bundle) {
                Person person;
                try {
                    if (bundle.containsKey(KEY_TEXT)) {
                        if (bundle.containsKey(KEY_TIMESTAMP)) {
                            if (bundle.containsKey(KEY_PERSON)) {
                                person = Person.fromBundle(bundle.getBundle(KEY_PERSON));
                            } else if (bundle.containsKey(KEY_NOTIFICATION_PERSON) && Build.VERSION.SDK_INT >= 28) {
                                person = Person.fromAndroidPerson((android.app.Person) bundle.getParcelable(KEY_NOTIFICATION_PERSON));
                            } else if (bundle.containsKey(KEY_SENDER)) {
                                person = new Person.Builder().setName(bundle.getCharSequence(KEY_SENDER)).build();
                            } else {
                                person = null;
                            }
                            Message message = new Message(bundle.getCharSequence(KEY_TEXT), bundle.getLong(KEY_TIMESTAMP), person);
                            if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                                message.setData(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                            }
                            if (bundle.containsKey("extras")) {
                                message.getExtras().putAll(bundle.getBundle("extras"));
                            }
                            return message;
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @NonNull
            static List<Message> getMessagesFromBundleArray(@NonNull Parcelable[] parcelableArr) {
                Message messageFromBundle;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Bundle bundle : parcelableArr) {
                    if ((bundle instanceof Bundle) && (messageFromBundle = getMessageFromBundle(bundle)) != null) {
                        arrayList.add(messageFromBundle);
                    }
                }
                return arrayList;
            }

            @NonNull
            private Bundle toBundle() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.mText;
                if (charSequence != null) {
                    bundle.putCharSequence(KEY_TEXT, charSequence);
                }
                bundle.putLong(KEY_TIMESTAMP, this.mTimestamp);
                Person person = this.mPerson;
                if (person != null) {
                    bundle.putCharSequence(KEY_SENDER, person.getName());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(KEY_NOTIFICATION_PERSON, this.mPerson.toAndroidPerson());
                    } else {
                        bundle.putBundle(KEY_PERSON, this.mPerson.toBundle());
                    }
                }
                String str = this.mDataMimeType;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.mDataUri;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.mExtras;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            @Nullable
            public String getDataMimeType() {
                return this.mDataMimeType;
            }

            @Nullable
            public Uri getDataUri() {
                return this.mDataUri;
            }

            @NonNull
            public Bundle getExtras() {
                return this.mExtras;
            }

            @Nullable
            public Person getPerson() {
                return this.mPerson;
            }

            @Deprecated
            @Nullable
            public CharSequence getSender() {
                Person person = this.mPerson;
                if (person == null) {
                    return null;
                }
                return person.getName();
            }

            @Nullable
            public CharSequence getText() {
                return this.mText;
            }

            public long getTimestamp() {
                return this.mTimestamp;
            }

            @NonNull
            public Message setData(@Nullable String str, @Nullable Uri uri) {
                this.mDataMimeType = str;
                this.mDataUri = uri;
                return this;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.app.Person} */
            /* JADX WARNING: type inference failed for: r3v0 */
            /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.CharSequence] */
            /* JADX WARNING: type inference failed for: r3v5 */
            /* JADX WARNING: type inference failed for: r3v6 */
            /* access modifiers changed from: package-private */
            /* JADX WARNING: Multi-variable type inference failed */
            @androidx.annotation.RequiresApi(24)
            @androidx.annotation.NonNull
            @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.app.Notification.MessagingStyle.Message toAndroidMessage() {
                /*
                    r6 = this;
                    androidx.core.app.Person r0 = r6.getPerson()
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 28
                    r3 = 0
                    if (r1 < r2) goto L_0x0020
                    android.app.Notification$MessagingStyle$Message r1 = new android.app.Notification$MessagingStyle$Message
                    java.lang.CharSequence r2 = r6.getText()
                    long r4 = r6.getTimestamp()
                    if (r0 != 0) goto L_0x0018
                    goto L_0x001c
                L_0x0018:
                    android.app.Person r3 = r0.toAndroidPerson()
                L_0x001c:
                    r1.<init>(r2, r4, r3)
                    goto L_0x0034
                L_0x0020:
                    android.app.Notification$MessagingStyle$Message r1 = new android.app.Notification$MessagingStyle$Message
                    java.lang.CharSequence r2 = r6.getText()
                    long r4 = r6.getTimestamp()
                    if (r0 != 0) goto L_0x002d
                    goto L_0x0031
                L_0x002d:
                    java.lang.CharSequence r3 = r0.getName()
                L_0x0031:
                    r1.<init>(r2, r4, r3)
                L_0x0034:
                    java.lang.String r0 = r6.getDataMimeType()
                    if (r0 == 0) goto L_0x0045
                    java.lang.String r0 = r6.getDataMimeType()
                    android.net.Uri r2 = r6.getDataUri()
                    r1.setData(r0, r2)
                L_0x0045:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.MessagingStyle.Message.toAndroidMessage():android.app.Notification$MessagingStyle$Message");
            }

            @Deprecated
            public Message(@Nullable CharSequence charSequence, long j, @Nullable CharSequence charSequence2) {
                this(charSequence, j, new Person.Builder().setName(charSequence2).build());
            }
        }

        @NonNull
        public MessagingStyle addMessage(@Nullable CharSequence charSequence, long j, @Nullable Person person) {
            addMessage(new Message(charSequence, j, person));
            return this;
        }

        @NonNull
        public MessagingStyle addMessage(@Nullable Message message) {
            if (message != null) {
                this.mMessages.add(message);
                if (this.mMessages.size() > 25) {
                    this.mMessages.remove(0);
                }
            }
            return this;
        }

        public MessagingStyle(@NonNull Person person) {
            if (!TextUtils.isEmpty(person.getName())) {
                this.mUser = person;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }
}
