package p070e1;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: e1.o */
/* compiled from: StreamLocalUriFetcher */
public class C7442o extends C7437l<InputStream> {

    /* renamed from: e */
    private static final UriMatcher f10289e;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f10289e = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C7442o(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: i */
    private InputStream m14561i(Uri uri, ContentResolver contentResolver) {
        int match = f10289e.match(uri);
        if (match != 1) {
            if (match == 3) {
                return m14562j(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return m14562j(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: j */
    private InputStream m14562j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @NonNull
    /* renamed from: a */
    public Class<InputStream> mo41069a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo41070c(InputStream inputStream) {
        inputStream.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public InputStream mo41071f(Uri uri, ContentResolver contentResolver) {
        InputStream i = m14561i(uri, contentResolver);
        if (i != null) {
            return i;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
