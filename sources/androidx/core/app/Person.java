package androidx.core.app;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;

public class Person {
    private static final String ICON_KEY = "icon";
    private static final String IS_BOT_KEY = "isBot";
    private static final String IS_IMPORTANT_KEY = "isImportant";
    private static final String KEY_KEY = "key";
    private static final String NAME_KEY = "name";
    private static final String URI_KEY = "uri";
    @Nullable
    IconCompat mIcon;
    boolean mIsBot;
    boolean mIsImportant;
    @Nullable
    String mKey;
    @Nullable
    CharSequence mName;
    @Nullable
    String mUri;

    @RequiresApi(22)
    static class Api22Impl {
        private Api22Impl() {
        }

        @DoNotInline
        static Person fromPersistableBundle(PersistableBundle persistableBundle) {
            return new Builder().setName(persistableBundle.getString("name")).setUri(persistableBundle.getString("uri")).setKey(persistableBundle.getString(Person.KEY_KEY)).setBot(persistableBundle.getBoolean(Person.IS_BOT_KEY)).setImportant(persistableBundle.getBoolean(Person.IS_IMPORTANT_KEY)).build();
        }

        @DoNotInline
        static PersistableBundle toPersistableBundle(Person person) {
            String str;
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = person.mName;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            persistableBundle.putString("name", str);
            persistableBundle.putString("uri", person.mUri);
            persistableBundle.putString(Person.KEY_KEY, person.mKey);
            persistableBundle.putBoolean(Person.IS_BOT_KEY, person.mIsBot);
            persistableBundle.putBoolean(Person.IS_IMPORTANT_KEY, person.mIsImportant);
            return persistableBundle;
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static Person fromAndroidPerson(android.app.Person person) {
            IconCompat iconCompat;
            Builder name = new Builder().setName(person.getName());
            if (person.getIcon() != null) {
                iconCompat = IconCompat.createFromIcon(person.getIcon());
            } else {
                iconCompat = null;
            }
            return name.setIcon(iconCompat).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }

        @DoNotInline
        static android.app.Person toAndroidPerson(Person person) {
            Icon icon;
            Person.Builder a = new Person.Builder().setName(person.getName());
            if (person.getIcon() != null) {
                icon = person.getIcon().toIcon();
            } else {
                icon = null;
            }
            return a.setIcon(icon).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }
    }

    public static class Builder {
        @Nullable
        IconCompat mIcon;
        boolean mIsBot;
        boolean mIsImportant;
        @Nullable
        String mKey;
        @Nullable
        CharSequence mName;
        @Nullable
        String mUri;

        public Builder() {
        }

        Builder(Person person) {
            this.mName = person.mName;
            this.mIcon = person.mIcon;
            this.mUri = person.mUri;
            this.mKey = person.mKey;
            this.mIsBot = person.mIsBot;
            this.mIsImportant = person.mIsImportant;
        }

        @NonNull
        public Person build() {
            return new Person(this);
        }

        @NonNull
        public Builder setBot(boolean z) {
            this.mIsBot = z;
            return this;
        }

        @NonNull
        public Builder setIcon(@Nullable IconCompat iconCompat) {
            this.mIcon = iconCompat;
            return this;
        }

        @NonNull
        public Builder setImportant(boolean z) {
            this.mIsImportant = z;
            return this;
        }

        @NonNull
        public Builder setKey(@Nullable String str) {
            this.mKey = str;
            return this;
        }

        @NonNull
        public Builder setName(@Nullable CharSequence charSequence) {
            this.mName = charSequence;
            return this;
        }

        @NonNull
        public Builder setUri(@Nullable String str) {
            this.mUri = str;
            return this;
        }
    }

    Person(Builder builder) {
        this.mName = builder.mName;
        this.mIcon = builder.mIcon;
        this.mUri = builder.mUri;
        this.mKey = builder.mKey;
        this.mIsBot = builder.mIsBot;
        this.mIsImportant = builder.mIsImportant;
    }

    @RequiresApi(28)
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Person fromAndroidPerson(@NonNull android.app.Person person) {
        return Api28Impl.fromAndroidPerson(person);
    }

    @NonNull
    public static Person fromBundle(@NonNull Bundle bundle) {
        IconCompat iconCompat;
        Bundle bundle2 = bundle.getBundle(ICON_KEY);
        Builder name = new Builder().setName(bundle.getCharSequence("name"));
        if (bundle2 != null) {
            iconCompat = IconCompat.createFromBundle(bundle2);
        } else {
            iconCompat = null;
        }
        return name.setIcon(iconCompat).setUri(bundle.getString("uri")).setKey(bundle.getString(KEY_KEY)).setBot(bundle.getBoolean(IS_BOT_KEY)).setImportant(bundle.getBoolean(IS_IMPORTANT_KEY)).build();
    }

    @RequiresApi(22)
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Person fromPersistableBundle(@NonNull PersistableBundle persistableBundle) {
        return Api22Impl.fromPersistableBundle(persistableBundle);
    }

    @Nullable
    public IconCompat getIcon() {
        return this.mIcon;
    }

    @Nullable
    public String getKey() {
        return this.mKey;
    }

    @Nullable
    public CharSequence getName() {
        return this.mName;
    }

    @Nullable
    public String getUri() {
        return this.mUri;
    }

    public boolean isBot() {
        return this.mIsBot;
    }

    public boolean isImportant() {
        return this.mIsImportant;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public String resolveToLegacyUri() {
        String str = this.mUri;
        if (str != null) {
            return str;
        }
        if (this.mName == null) {
            return "";
        }
        return "name:" + this.mName;
    }

    @RequiresApi(28)
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.app.Person toAndroidPerson() {
        return Api28Impl.toAndroidPerson(this);
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @NonNull
    public Bundle toBundle() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.mName);
        IconCompat iconCompat = this.mIcon;
        if (iconCompat != null) {
            bundle = iconCompat.toBundle();
        } else {
            bundle = null;
        }
        bundle2.putBundle(ICON_KEY, bundle);
        bundle2.putString("uri", this.mUri);
        bundle2.putString(KEY_KEY, this.mKey);
        bundle2.putBoolean(IS_BOT_KEY, this.mIsBot);
        bundle2.putBoolean(IS_IMPORTANT_KEY, this.mIsImportant);
        return bundle2;
    }

    @RequiresApi(22)
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PersistableBundle toPersistableBundle() {
        return Api22Impl.toPersistableBundle(this);
    }
}
