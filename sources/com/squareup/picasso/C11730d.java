package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.squareup.picasso.C11751p;
import com.squareup.picasso.C11768u;
import java.io.InputStream;
import okio.C13145j0;

/* renamed from: com.squareup.picasso.d */
/* compiled from: ContactsPhotoRequestHandler */
class C11730d extends C11768u {

    /* renamed from: b */
    private static final UriMatcher f18230b;

    /* renamed from: a */
    private final Context f18231a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f18230b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    C11730d(Context context) {
        this.f18231a = context;
    }

    /* renamed from: j */
    private InputStream m25166j(C11764s sVar) {
        ContentResolver contentResolver = this.f18231a.getContentResolver();
        Uri uri = sVar.f18339d;
        int match = f18230b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* renamed from: c */
    public boolean mo48661c(C11764s sVar) {
        Uri uri = sVar.f18339d;
        if (!"content".equals(uri.getScheme()) || !ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) || f18230b.match(sVar.f18339d) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C11768u.C11769a mo48662f(C11764s sVar, int i) {
        InputStream j = m25166j(sVar);
        if (j == null) {
            return null;
        }
        return new C11768u.C11769a(C13145j0.m29747l(j), C11751p.C11757e.DISK);
    }
}
