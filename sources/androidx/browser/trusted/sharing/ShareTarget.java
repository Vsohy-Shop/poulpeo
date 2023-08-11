package androidx.browser.trusted.sharing;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ShareTarget {
    public static final String ENCODING_TYPE_MULTIPART = "multipart/form-data";
    public static final String ENCODING_TYPE_URL_ENCODED = "application/x-www-form-urlencoded";
    public static final String KEY_ACTION = "androidx.browser.trusted.sharing.KEY_ACTION";
    public static final String KEY_ENCTYPE = "androidx.browser.trusted.sharing.KEY_ENCTYPE";
    public static final String KEY_METHOD = "androidx.browser.trusted.sharing.KEY_METHOD";
    public static final String KEY_PARAMS = "androidx.browser.trusted.sharing.KEY_PARAMS";
    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";
    @NonNull
    public final String action;
    @Nullable
    public final String encodingType;
    @Nullable
    public final String method;
    @NonNull
    public final Params params;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface EncodingType {
    }

    public static final class FileFormField {
        public static final String KEY_ACCEPTED_TYPES = "androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES";
        public static final String KEY_NAME = "androidx.browser.trusted.sharing.KEY_FILE_NAME";
        @NonNull
        public final List<String> acceptedTypes;
        @NonNull
        public final String name;

        public FileFormField(@NonNull String str, @NonNull List<String> list) {
            this.name = str;
            this.acceptedTypes = Collections.unmodifiableList(list);
        }

        @Nullable
        static FileFormField fromBundle(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString(KEY_NAME);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_ACCEPTED_TYPES);
            if (string == null || stringArrayList == null) {
                return null;
            }
            return new FileFormField(string, stringArrayList);
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(KEY_NAME, this.name);
            bundle.putStringArrayList(KEY_ACCEPTED_TYPES, new ArrayList(this.acceptedTypes));
            return bundle;
        }
    }

    public static class Params {
        public static final String KEY_FILES = "androidx.browser.trusted.sharing.KEY_FILES";
        public static final String KEY_TEXT = "androidx.browser.trusted.sharing.KEY_TEXT";
        public static final String KEY_TITLE = "androidx.browser.trusted.sharing.KEY_TITLE";
        @Nullable
        public final List<FileFormField> files;
        @Nullable
        public final String text;
        @Nullable
        public final String title;

        public Params(@Nullable String str, @Nullable String str2, @Nullable List<FileFormField> list) {
            this.title = str;
            this.text = str2;
            this.files = list;
        }

        @Nullable
        static Params fromBundle(@Nullable Bundle bundle) {
            ArrayList arrayList = null;
            if (bundle == null) {
                return null;
            }
            ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(KEY_FILES);
            if (parcelableArrayList != null) {
                arrayList = new ArrayList();
                for (Bundle fromBundle : parcelableArrayList) {
                    arrayList.add(FileFormField.fromBundle(fromBundle));
                }
            }
            return new Params(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), arrayList);
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.title);
            bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.text);
            if (this.files != null) {
                ArrayList arrayList = new ArrayList();
                for (FileFormField bundle2 : this.files) {
                    arrayList.add(bundle2.toBundle());
                }
                bundle.putParcelableArrayList(KEY_FILES, arrayList);
            }
            return bundle;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface RequestMethod {
    }

    public ShareTarget(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull Params params2) {
        this.action = str;
        this.method = str2;
        this.encodingType = str3;
        this.params = params2;
    }

    @Nullable
    public static ShareTarget fromBundle(@NonNull Bundle bundle) {
        String string = bundle.getString(KEY_ACTION);
        String string2 = bundle.getString(KEY_METHOD);
        String string3 = bundle.getString(KEY_ENCTYPE);
        Params fromBundle = Params.fromBundle(bundle.getBundle(KEY_PARAMS));
        if (string == null || fromBundle == null) {
            return null;
        }
        return new ShareTarget(string, string2, string3, fromBundle);
    }

    @NonNull
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_ACTION, this.action);
        bundle.putString(KEY_METHOD, this.method);
        bundle.putString(KEY_ENCTYPE, this.encodingType);
        bundle.putBundle(KEY_PARAMS, this.params.toBundle());
        return bundle;
    }
}
