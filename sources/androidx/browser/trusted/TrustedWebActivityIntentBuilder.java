package androidx.browser.trusted;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.customtabs.TrustedWebUtils;
import androidx.browser.trusted.TrustedWebActivityDisplayMode;
import androidx.browser.trusted.sharing.ShareData;
import androidx.browser.trusted.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrustedWebActivityIntentBuilder {
    public static final String EXTRA_ADDITIONAL_TRUSTED_ORIGINS = "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS";
    public static final String EXTRA_DISPLAY_MODE = "androidx.browser.trusted.extra.DISPLAY_MODE";
    public static final String EXTRA_SCREEN_ORIENTATION = "androidx.browser.trusted.extra.SCREEN_ORIENTATION";
    public static final String EXTRA_SHARE_DATA = "androidx.browser.trusted.extra.SHARE_DATA";
    public static final String EXTRA_SHARE_TARGET = "androidx.browser.trusted.extra.SHARE_TARGET";
    public static final String EXTRA_SPLASH_SCREEN_PARAMS = "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS";
    @Nullable
    private List<String> mAdditionalTrustedOrigins;
    @NonNull
    private TrustedWebActivityDisplayMode mDisplayMode = new TrustedWebActivityDisplayMode.DefaultMode();
    @NonNull
    private final CustomTabsIntent.Builder mIntentBuilder = new CustomTabsIntent.Builder();
    private int mScreenOrientation = 0;
    @Nullable
    private ShareData mShareData;
    @Nullable
    private ShareTarget mShareTarget;
    @Nullable
    private Bundle mSplashScreenParams;
    @NonNull
    private final Uri mUri;

    public TrustedWebActivityIntentBuilder(@NonNull Uri uri) {
        this.mUri = uri;
    }

    @NonNull
    public TrustedWebActivityIntent build(@NonNull CustomTabsSession customTabsSession) {
        if (customTabsSession != null) {
            this.mIntentBuilder.setSession(customTabsSession);
            Intent intent = this.mIntentBuilder.build().intent;
            intent.setData(this.mUri);
            intent.putExtra(TrustedWebUtils.EXTRA_LAUNCH_AS_TRUSTED_WEB_ACTIVITY, true);
            if (this.mAdditionalTrustedOrigins != null) {
                intent.putExtra(EXTRA_ADDITIONAL_TRUSTED_ORIGINS, new ArrayList(this.mAdditionalTrustedOrigins));
            }
            Bundle bundle = this.mSplashScreenParams;
            if (bundle != null) {
                intent.putExtra(EXTRA_SPLASH_SCREEN_PARAMS, bundle);
            }
            List<Uri> emptyList = Collections.emptyList();
            ShareTarget shareTarget = this.mShareTarget;
            if (!(shareTarget == null || this.mShareData == null)) {
                intent.putExtra(EXTRA_SHARE_TARGET, shareTarget.toBundle());
                intent.putExtra(EXTRA_SHARE_DATA, this.mShareData.toBundle());
                List<Uri> list = this.mShareData.uris;
                if (list != null) {
                    emptyList = list;
                }
            }
            intent.putExtra(EXTRA_DISPLAY_MODE, this.mDisplayMode.toBundle());
            intent.putExtra(EXTRA_SCREEN_ORIENTATION, this.mScreenOrientation);
            return new TrustedWebActivityIntent(intent, emptyList);
        }
        throw new NullPointerException("CustomTabsSession is required for launching a TWA");
    }

    @NonNull
    public CustomTabsIntent buildCustomTabsIntent() {
        return this.mIntentBuilder.build();
    }

    @NonNull
    public TrustedWebActivityDisplayMode getDisplayMode() {
        return this.mDisplayMode;
    }

    @NonNull
    public Uri getUri() {
        return this.mUri;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setAdditionalTrustedOrigins(@NonNull List<String> list) {
        this.mAdditionalTrustedOrigins = list;
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setColorScheme(int i) {
        this.mIntentBuilder.setColorScheme(i);
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setColorSchemeParams(int i, @NonNull CustomTabColorSchemeParams customTabColorSchemeParams) {
        this.mIntentBuilder.setColorSchemeParams(i, customTabColorSchemeParams);
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setDefaultColorSchemeParams(@NonNull CustomTabColorSchemeParams customTabColorSchemeParams) {
        this.mIntentBuilder.setDefaultColorSchemeParams(customTabColorSchemeParams);
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setDisplayMode(@NonNull TrustedWebActivityDisplayMode trustedWebActivityDisplayMode) {
        this.mDisplayMode = trustedWebActivityDisplayMode;
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setNavigationBarColor(@ColorInt int i) {
        this.mIntentBuilder.setNavigationBarColor(i);
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setNavigationBarDividerColor(@ColorInt int i) {
        this.mIntentBuilder.setNavigationBarDividerColor(i);
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setScreenOrientation(int i) {
        this.mScreenOrientation = i;
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setShareParams(@NonNull ShareTarget shareTarget, @NonNull ShareData shareData) {
        this.mShareTarget = shareTarget;
        this.mShareData = shareData;
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setSplashScreenParams(@NonNull Bundle bundle) {
        this.mSplashScreenParams = bundle;
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setToolbarColor(@ColorInt int i) {
        this.mIntentBuilder.setToolbarColor(i);
        return this;
    }
}
