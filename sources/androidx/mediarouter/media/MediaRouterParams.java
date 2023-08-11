package androidx.mediarouter.media;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MediaRouterParams {
    public static final int DIALOG_TYPE_DEFAULT = 1;
    public static final int DIALOG_TYPE_DYNAMIC_GROUP = 2;
    public static final String ENABLE_GROUP_VOLUME_UX = "androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String EXTRAS_KEY_FIXED_CAST_ICON = "androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON";
    final int mDialogType;
    final Bundle mExtras;
    final boolean mMediaTransferReceiverEnabled;
    final boolean mOutputSwitcherEnabled;
    final boolean mTransferToLocalEnabled;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DialogType {
    }

    MediaRouterParams(@NonNull Builder builder) {
        Bundle bundle;
        this.mDialogType = builder.mDialogType;
        this.mMediaTransferReceiverEnabled = builder.mMediaTransferEnabled;
        this.mOutputSwitcherEnabled = builder.mOutputSwitcherEnabled;
        this.mTransferToLocalEnabled = builder.mTransferToLocalEnabled;
        Bundle bundle2 = builder.mExtras;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.mExtras = bundle;
    }

    public int getDialogType() {
        return this.mDialogType;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Bundle getExtras() {
        return this.mExtras;
    }

    public boolean isMediaTransferReceiverEnabled() {
        return this.mMediaTransferReceiverEnabled;
    }

    public boolean isOutputSwitcherEnabled() {
        return this.mOutputSwitcherEnabled;
    }

    public boolean isTransferToLocalEnabled() {
        return this.mTransferToLocalEnabled;
    }

    public static final class Builder {
        int mDialogType = 1;
        Bundle mExtras;
        boolean mMediaTransferEnabled;
        boolean mOutputSwitcherEnabled;
        boolean mTransferToLocalEnabled;

        public Builder() {
            boolean z = true;
            this.mMediaTransferEnabled = Build.VERSION.SDK_INT < 30 ? false : z;
        }

        @NonNull
        public MediaRouterParams build() {
            return new MediaRouterParams(this);
        }

        @NonNull
        public Builder setDialogType(int i) {
            this.mDialogType = i;
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder setExtras(@Nullable Bundle bundle) {
            Bundle bundle2;
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            this.mExtras = bundle2;
            return this;
        }

        @NonNull
        public Builder setMediaTransferReceiverEnabled(boolean z) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.mMediaTransferEnabled = z;
            }
            return this;
        }

        @NonNull
        public Builder setOutputSwitcherEnabled(boolean z) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.mOutputSwitcherEnabled = z;
            }
            return this;
        }

        @NonNull
        public Builder setTransferToLocalEnabled(boolean z) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.mTransferToLocalEnabled = z;
            }
            return this;
        }

        public Builder(@NonNull MediaRouterParams mediaRouterParams) {
            boolean z = true;
            this.mMediaTransferEnabled = Build.VERSION.SDK_INT < 30 ? false : z;
            if (mediaRouterParams != null) {
                this.mDialogType = mediaRouterParams.mDialogType;
                this.mOutputSwitcherEnabled = mediaRouterParams.mOutputSwitcherEnabled;
                this.mTransferToLocalEnabled = mediaRouterParams.mTransferToLocalEnabled;
                this.mMediaTransferEnabled = mediaRouterParams.mMediaTransferReceiverEnabled;
                this.mExtras = mediaRouterParams.mExtras == null ? null : new Bundle(mediaRouterParams.mExtras);
                return;
            }
            throw new NullPointerException("params should not be null!");
        }
    }
}
