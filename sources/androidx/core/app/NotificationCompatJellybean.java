package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@RequiresApi(16)
class NotificationCompatJellybean {
    static final String EXTRA_ALLOW_GENERATED_REPLIES = "android.support.allowGeneratedReplies";
    static final String EXTRA_DATA_ONLY_REMOTE_INPUTS = "android.support.dataRemoteInputs";
    private static final String KEY_ACTION_INTENT = "actionIntent";
    private static final String KEY_ALLOWED_DATA_TYPES = "allowedDataTypes";
    private static final String KEY_ALLOW_FREE_FORM_INPUT = "allowFreeFormInput";
    private static final String KEY_CHOICES = "choices";
    private static final String KEY_DATA_ONLY_REMOTE_INPUTS = "dataOnlyRemoteInputs";
    private static final String KEY_EXTRAS = "extras";
    private static final String KEY_ICON = "icon";
    private static final String KEY_LABEL = "label";
    private static final String KEY_REMOTE_INPUTS = "remoteInputs";
    private static final String KEY_RESULT_KEY = "resultKey";
    private static final String KEY_SEMANTIC_ACTION = "semanticAction";
    private static final String KEY_SHOWS_USER_INTERFACE = "showsUserInterface";
    private static final String KEY_TITLE = "title";
    public static final String TAG = "NotificationCompat";
    private static Field sActionIconField;
    private static Field sActionIntentField;
    private static Field sActionTitleField;
    private static boolean sActionsAccessFailed;
    private static Field sActionsField;
    private static final Object sActionsLock = new Object();
    private static Field sExtrasField;
    private static boolean sExtrasFieldAccessFailed;
    private static final Object sExtrasLock = new Object();

    private NotificationCompatJellybean() {
    }

    public static SparseArray<Bundle> buildActionExtrasMap(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    private static boolean ensureActionReflectionReadyLocked() {
        if (sActionsAccessFailed) {
            return false;
        }
        try {
            if (sActionsField == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                sActionIconField = cls.getDeclaredField(KEY_ICON);
                sActionTitleField = cls.getDeclaredField(KEY_TITLE);
                sActionIntentField = cls.getDeclaredField(KEY_ACTION_INTENT);
                Field declaredField = Notification.class.getDeclaredField("actions");
                sActionsField = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException e) {
            Log.e(TAG, "Unable to access notification actions", e);
            sActionsAccessFailed = true;
        } catch (NoSuchFieldException e2) {
            Log.e(TAG, "Unable to access notification actions", e2);
            sActionsAccessFailed = true;
        }
        return !sActionsAccessFailed;
    }

    private static RemoteInput fromBundle(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_ALLOWED_DATA_TYPES);
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new RemoteInput(bundle.getString(KEY_RESULT_KEY), bundle.getCharSequence(KEY_LABEL), bundle.getCharSequenceArray(KEY_CHOICES), bundle.getBoolean(KEY_ALLOW_FREE_FORM_INPUT), 0, bundle.getBundle("extras"), hashSet);
    }

    private static RemoteInput[] fromBundleArray(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            remoteInputArr[i] = fromBundle(bundleArr[i]);
        }
        return remoteInputArr;
    }

    public static NotificationCompat.Action getAction(Notification notification, int i) {
        Bundle bundle;
        SparseArray sparseParcelableArray;
        synchronized (sActionsLock) {
            try {
                Object[] actionObjectsLocked = getActionObjectsLocked(notification);
                if (actionObjectsLocked != null) {
                    Object obj = actionObjectsLocked[i];
                    Bundle extras = getExtras(notification);
                    if (extras == null || (sparseParcelableArray = extras.getSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS)) == null) {
                        bundle = null;
                    } else {
                        bundle = (Bundle) sparseParcelableArray.get(i);
                    }
                    NotificationCompat.Action readAction = readAction(sActionIconField.getInt(obj), (CharSequence) sActionTitleField.get(obj), (PendingIntent) sActionIntentField.get(obj), bundle);
                    return readAction;
                }
            } catch (IllegalAccessException e) {
                Log.e(TAG, "Unable to access notification actions", e);
                sActionsAccessFailed = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    public static int getActionCount(Notification notification) {
        int i;
        synchronized (sActionsLock) {
            Object[] actionObjectsLocked = getActionObjectsLocked(notification);
            if (actionObjectsLocked != null) {
                i = actionObjectsLocked.length;
            } else {
                i = 0;
            }
        }
        return i;
    }

    static NotificationCompat.Action getActionFromBundle(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        boolean z = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean(EXTRA_ALLOW_GENERATED_REPLIES, false);
        }
        return new NotificationCompat.Action(bundle.getInt(KEY_ICON), bundle.getCharSequence(KEY_TITLE), (PendingIntent) bundle.getParcelable(KEY_ACTION_INTENT), bundle.getBundle("extras"), fromBundleArray(getBundleArrayFromBundle(bundle, KEY_REMOTE_INPUTS)), fromBundleArray(getBundleArrayFromBundle(bundle, KEY_DATA_ONLY_REMOTE_INPUTS)), z, bundle.getInt(KEY_SEMANTIC_ACTION), bundle.getBoolean(KEY_SHOWS_USER_INTERFACE), false, false);
    }

    private static Object[] getActionObjectsLocked(Notification notification) {
        synchronized (sActionsLock) {
            if (!ensureActionReflectionReadyLocked()) {
                return null;
            }
            try {
                Object[] objArr = (Object[]) sActionsField.get(notification);
                return objArr;
            } catch (IllegalAccessException e) {
                Log.e(TAG, "Unable to access notification actions", e);
                sActionsAccessFailed = true;
                return null;
            }
        }
    }

    private static Bundle[] getBundleArrayFromBundle(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    static Bundle getBundleForAction(NotificationCompat.Action action) {
        int i;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat iconCompat = action.getIconCompat();
        if (iconCompat != null) {
            i = iconCompat.getResId();
        } else {
            i = 0;
        }
        bundle2.putInt(KEY_ICON, i);
        bundle2.putCharSequence(KEY_TITLE, action.getTitle());
        bundle2.putParcelable(KEY_ACTION_INTENT, action.getActionIntent());
        if (action.getExtras() != null) {
            bundle = new Bundle(action.getExtras());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean(EXTRA_ALLOW_GENERATED_REPLIES, action.getAllowGeneratedReplies());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray(KEY_REMOTE_INPUTS, toBundleArray(action.getRemoteInputs()));
        bundle2.putBoolean(KEY_SHOWS_USER_INTERFACE, action.getShowsUserInterface());
        bundle2.putInt(KEY_SEMANTIC_ACTION, action.getSemanticAction());
        return bundle2;
    }

    public static Bundle getExtras(Notification notification) {
        synchronized (sExtrasLock) {
            if (sExtrasFieldAccessFailed) {
                return null;
            }
            try {
                if (sExtrasField == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(TAG, "Notification.extras field is not of type Bundle");
                        sExtrasFieldAccessFailed = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    sExtrasField = declaredField;
                }
                Bundle bundle = (Bundle) sExtrasField.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    sExtrasField.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e(TAG, "Unable to access notification extras", e);
                sExtrasFieldAccessFailed = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e(TAG, "Unable to access notification extras", e2);
                sExtrasFieldAccessFailed = true;
                return null;
            }
        }
    }

    public static NotificationCompat.Action readAction(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        boolean z;
        RemoteInput[] remoteInputArr;
        RemoteInput[] remoteInputArr2;
        Bundle bundle2 = bundle;
        if (bundle2 != null) {
            remoteInputArr2 = fromBundleArray(getBundleArrayFromBundle(bundle2, NotificationCompatExtras.EXTRA_REMOTE_INPUTS));
            remoteInputArr = fromBundleArray(getBundleArrayFromBundle(bundle2, EXTRA_DATA_ONLY_REMOTE_INPUTS));
            z = bundle2.getBoolean(EXTRA_ALLOW_GENERATED_REPLIES);
        } else {
            remoteInputArr2 = null;
            remoteInputArr = null;
            z = false;
        }
        return new NotificationCompat.Action(i, charSequence, pendingIntent, bundle, remoteInputArr2, remoteInputArr, z, 0, true, false, false);
    }

    private static Bundle toBundle(RemoteInput remoteInput) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_RESULT_KEY, remoteInput.getResultKey());
        bundle.putCharSequence(KEY_LABEL, remoteInput.getLabel());
        bundle.putCharSequenceArray(KEY_CHOICES, remoteInput.getChoices());
        bundle.putBoolean(KEY_ALLOW_FREE_FORM_INPUT, remoteInput.getAllowFreeFormInput());
        bundle.putBundle("extras", remoteInput.getExtras());
        Set<String> allowedDataTypes = remoteInput.getAllowedDataTypes();
        if (allowedDataTypes != null && !allowedDataTypes.isEmpty()) {
            ArrayList arrayList = new ArrayList(allowedDataTypes.size());
            for (String add : allowedDataTypes) {
                arrayList.add(add);
            }
            bundle.putStringArrayList(KEY_ALLOWED_DATA_TYPES, arrayList);
        }
        return bundle;
    }

    private static Bundle[] toBundleArray(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            bundleArr[i] = toBundle(remoteInputArr[i]);
        }
        return bundleArr;
    }

    public static Bundle writeActionAndGetExtras(Notification.Builder builder, NotificationCompat.Action action) {
        int i;
        IconCompat iconCompat = action.getIconCompat();
        if (iconCompat != null) {
            i = iconCompat.getResId();
        } else {
            i = 0;
        }
        builder.addAction(i, action.getTitle(), action.getActionIntent());
        Bundle bundle = new Bundle(action.getExtras());
        if (action.getRemoteInputs() != null) {
            bundle.putParcelableArray(NotificationCompatExtras.EXTRA_REMOTE_INPUTS, toBundleArray(action.getRemoteInputs()));
        }
        if (action.getDataOnlyRemoteInputs() != null) {
            bundle.putParcelableArray(EXTRA_DATA_ONLY_REMOTE_INPUTS, toBundleArray(action.getDataOnlyRemoteInputs()));
        }
        bundle.putBoolean(EXTRA_ALLOW_GENERATED_REPLIES, action.getAllowGeneratedReplies());
        return bundle;
    }
}
