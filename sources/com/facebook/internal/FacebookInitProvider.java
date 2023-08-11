package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.appboy.Constants;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FacebookInitProvider.kt */
public final class FacebookInitProvider extends ContentProvider {

    /* renamed from: b */
    private static final String f4212b;

    /* renamed from: c */
    public static final C4548a f4213c = new C4548a((DefaultConstructorMarker) null);

    /* renamed from: com.facebook.internal.FacebookInitProvider$a */
    /* compiled from: FacebookInitProvider.kt */
    public static final class C4548a {
        private C4548a() {
        }

        public /* synthetic */ C4548a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String simpleName = FacebookInitProvider.class.getSimpleName();
        C12775o.m28638h(simpleName, "FacebookInitProvider::class.java.simpleName");
        f4212b = simpleName;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        C12775o.m28639i(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        return 0;
    }

    public String getType(Uri uri) {
        C12775o.m28639i(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        C12775o.m28639i(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        return null;
    }

    public boolean onCreate() {
        try {
            Context context = getContext();
            if (context != null) {
                FacebookSdk.sdkInitialize(context);
                return false;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (Exception e) {
            Log.i(f4212b, "Failed to auto initialize the Facebook SDK", e);
            return false;
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C12775o.m28639i(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C12775o.m28639i(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        return 0;
    }
}
