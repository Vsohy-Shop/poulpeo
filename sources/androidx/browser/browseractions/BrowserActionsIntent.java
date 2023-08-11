package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Deprecated
public class BrowserActionsIntent {
    public static final String ACTION_BROWSER_ACTIONS_OPEN = "androidx.browser.browseractions.browser_action_open";
    public static final String EXTRA_APP_ID = "androidx.browser.browseractions.APP_ID";
    public static final String EXTRA_MENU_ITEMS = "androidx.browser.browseractions.extra.MENU_ITEMS";
    public static final String EXTRA_SELECTED_ACTION_PENDING_INTENT = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";
    public static final String EXTRA_TYPE = "androidx.browser.browseractions.extra.TYPE";
    public static final int ITEM_COPY = 3;
    public static final int ITEM_DOWNLOAD = 2;
    public static final int ITEM_INVALID_ITEM = -1;
    public static final int ITEM_OPEN_IN_INCOGNITO = 1;
    public static final int ITEM_OPEN_IN_NEW_TAB = 0;
    public static final int ITEM_SHARE = 4;
    public static final String KEY_ACTION = "androidx.browser.browseractions.ACTION";
    public static final String KEY_ICON_ID = "androidx.browser.browseractions.ICON_ID";
    private static final String KEY_ICON_URI = "androidx.browser.browseractions.ICON_URI";
    public static final String KEY_TITLE = "androidx.browser.browseractions.TITLE";
    public static final int MAX_CUSTOM_ITEMS = 5;
    private static final String TAG = "BrowserActions";
    private static final String TEST_URL = "https://www.example.com";
    public static final int URL_TYPE_AUDIO = 3;
    public static final int URL_TYPE_FILE = 4;
    public static final int URL_TYPE_IMAGE = 1;
    public static final int URL_TYPE_NONE = 0;
    public static final int URL_TYPE_PLUGIN = 5;
    public static final int URL_TYPE_VIDEO = 2;
    @Nullable
    private static BrowserActionsFallDialogListener sDialogListenter;
    @NonNull
    private final Intent mIntent;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @VisibleForTesting
    interface BrowserActionsFallDialogListener {
        void onDialogShown();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface BrowserActionsItemId {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface BrowserActionsUrlType {
    }

    BrowserActionsIntent(@NonNull Intent intent) {
        this.mIntent = intent;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static List<ResolveInfo> getBrowserActionsIntentHandlers(@NonNull Context context) {
        return context.getPackageManager().queryIntentActivities(new Intent(ACTION_BROWSER_ACTIONS_OPEN, Uri.parse(TEST_URL)), 131072);
    }

    @Deprecated
    @Nullable
    public static String getCreatorPackageName(@NonNull Intent intent) {
        return getUntrustedCreatorPackageName(intent);
    }

    @Nullable
    public static String getUntrustedCreatorPackageName(@NonNull Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(EXTRA_APP_ID);
        if (pendingIntent != null) {
            return pendingIntent.getCreatorPackage();
        }
        return null;
    }

    public static void launchIntent(@NonNull Context context, @NonNull Intent intent) {
        launchIntent(context, intent, getBrowserActionsIntentHandlers(context));
    }

    public static void openBrowserAction(@NonNull Context context, @NonNull Uri uri) {
        launchIntent(context, new Builder(context, uri).build().getIntent());
    }

    private static void openFallbackBrowserActionsMenu(Context context, Intent intent) {
        Uri data = intent.getData();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(EXTRA_MENU_ITEMS);
        openFallbackBrowserActionsMenu(context, data, parcelableArrayListExtra != null ? parseBrowserActionItems(parcelableArrayListExtra) : null);
    }

    @NonNull
    public static List<BrowserActionItem> parseBrowserActionItems(@NonNull ArrayList<Bundle> arrayList) {
        BrowserActionItem browserActionItem;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            Bundle bundle = arrayList.get(i);
            String string = bundle.getString(KEY_TITLE);
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(KEY_ACTION);
            int i2 = bundle.getInt(KEY_ICON_ID);
            Uri uri = (Uri) bundle.getParcelable(KEY_ICON_URI);
            if (TextUtils.isEmpty(string) || pendingIntent == null) {
                throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            }
            if (i2 != 0) {
                browserActionItem = new BrowserActionItem(string, pendingIntent, i2);
            } else {
                browserActionItem = new BrowserActionItem(string, pendingIntent, uri);
            }
            arrayList2.add(browserActionItem);
        }
        return arrayList2;
    }

    @VisibleForTesting
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static void setDialogShownListenter(BrowserActionsFallDialogListener browserActionsFallDialogListener) {
        sDialogListenter = browserActionsFallDialogListener;
    }

    @NonNull
    public Intent getIntent() {
        return this.mIntent;
    }

    @VisibleForTesting
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static void launchIntent(Context context, Intent intent, List<ResolveInfo> list) {
        if (list == null || list.size() == 0) {
            openFallbackBrowserActionsMenu(context, intent);
            return;
        }
        int i = 0;
        if (list.size() == 1) {
            intent.setPackage(list.get(0).activityInfo.packageName);
        } else {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(TEST_URL)), 65536);
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (str.equals(list.get(i).activityInfo.packageName)) {
                        intent.setPackage(str);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        ContextCompat.startActivity(context, intent, (Bundle) null);
    }

    public static void openBrowserAction(@NonNull Context context, @NonNull Uri uri, int i, @NonNull ArrayList<BrowserActionItem> arrayList, @NonNull PendingIntent pendingIntent) {
        launchIntent(context, new Builder(context, uri).setUrlType(i).setCustomItems(arrayList).setOnItemSelectedAction(pendingIntent).build().getIntent());
    }

    private static void openFallbackBrowserActionsMenu(Context context, Uri uri, List<BrowserActionItem> list) {
        new BrowserActionsFallbackMenuUi(context, uri, list).displayMenu();
        BrowserActionsFallDialogListener browserActionsFallDialogListener = sDialogListenter;
        if (browserActionsFallDialogListener != null) {
            browserActionsFallDialogListener.onDialogShown();
        }
    }

    public static final class Builder {
        private Context mContext;
        private List<Uri> mImageUris = new ArrayList();
        private final Intent mIntent = new Intent(BrowserActionsIntent.ACTION_BROWSER_ACTIONS_OPEN);
        private ArrayList<Bundle> mMenuItems = new ArrayList<>();
        @Nullable
        private PendingIntent mOnItemSelectedPendingIntent = null;
        private int mType = 0;
        private Uri mUri;

        public Builder(@NonNull Context context, @NonNull Uri uri) {
            this.mContext = context;
            this.mUri = uri;
        }

        @NonNull
        private Bundle getBundleFromItem(@NonNull BrowserActionItem browserActionItem) {
            Bundle bundle = new Bundle();
            bundle.putString(BrowserActionsIntent.KEY_TITLE, browserActionItem.getTitle());
            bundle.putParcelable(BrowserActionsIntent.KEY_ACTION, browserActionItem.getAction());
            if (browserActionItem.getIconId() != 0) {
                bundle.putInt(BrowserActionsIntent.KEY_ICON_ID, browserActionItem.getIconId());
            }
            if (browserActionItem.getIconUri() != null) {
                bundle.putParcelable(BrowserActionsIntent.KEY_ICON_URI, browserActionItem.getIconUri());
            }
            return bundle;
        }

        @NonNull
        public BrowserActionsIntent build() {
            this.mIntent.setData(this.mUri);
            this.mIntent.putExtra(BrowserActionsIntent.EXTRA_TYPE, this.mType);
            this.mIntent.putParcelableArrayListExtra(BrowserActionsIntent.EXTRA_MENU_ITEMS, this.mMenuItems);
            this.mIntent.putExtra(BrowserActionsIntent.EXTRA_APP_ID, PendingIntent.getActivity(this.mContext, 0, new Intent(), 67108864));
            PendingIntent pendingIntent = this.mOnItemSelectedPendingIntent;
            if (pendingIntent != null) {
                this.mIntent.putExtra(BrowserActionsIntent.EXTRA_SELECTED_ACTION_PENDING_INTENT, pendingIntent);
            }
            BrowserServiceFileProvider.grantReadPermission(this.mIntent, this.mImageUris, this.mContext);
            return new BrowserActionsIntent(this.mIntent);
        }

        @NonNull
        public Builder setCustomItems(@NonNull ArrayList<BrowserActionItem> arrayList) {
            if (arrayList.size() <= 5) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (TextUtils.isEmpty(arrayList.get(i).getTitle()) || arrayList.get(i).getAction() == null) {
                        throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
                    }
                    this.mMenuItems.add(getBundleFromItem(arrayList.get(i)));
                    if (arrayList.get(i).getIconUri() != null) {
                        this.mImageUris.add(arrayList.get(i).getIconUri());
                    }
                }
                return this;
            }
            throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
        }

        @NonNull
        public Builder setOnItemSelectedAction(@NonNull PendingIntent pendingIntent) {
            this.mOnItemSelectedPendingIntent = pendingIntent;
            return this;
        }

        @NonNull
        public Builder setUrlType(int i) {
            this.mType = i;
            return this;
        }

        @NonNull
        public Builder setCustomItems(@NonNull BrowserActionItem... browserActionItemArr) {
            return setCustomItems((ArrayList<BrowserActionItem>) new ArrayList(Arrays.asList(browserActionItemArr)));
        }
    }
}
