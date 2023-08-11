package com.facebook.applinks;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.C4509a;
import com.facebook.C4550k;
import com.facebook.C4555l;
import com.facebook.C4574o;
import com.facebook.C4576p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p168n2.C8882b;
import p168n2.C8889e;
import p168n2.C8890f;
import p168n2.C8898g;
import p251v2.C9925a;

public class FacebookAppLinkResolver {
    private static final String APP_LINK_ANDROID_TARGET_KEY = "android";
    private static final String APP_LINK_KEY = "app_links";
    private static final String APP_LINK_TARGET_APP_NAME_KEY = "app_name";
    private static final String APP_LINK_TARGET_CLASS_KEY = "class";
    private static final String APP_LINK_TARGET_PACKAGE_KEY = "package";
    private static final String APP_LINK_TARGET_SHOULD_FALLBACK_KEY = "should_fallback";
    private static final String APP_LINK_TARGET_URL_KEY = "url";
    private static final String APP_LINK_WEB_TARGET_KEY = "web";
    private final HashMap<Uri, C8882b> cachedAppLinks = new HashMap<>();

    static /* synthetic */ C8882b.C8883a access$000(JSONObject jSONObject) {
        Class<FacebookAppLinkResolver> cls = FacebookAppLinkResolver.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return getAndroidTargetFromJson(jSONObject);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    static /* synthetic */ Uri access$100(Uri uri, JSONObject jSONObject) {
        Class<FacebookAppLinkResolver> cls = FacebookAppLinkResolver.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return getWebFallbackUriFromJson(uri, jSONObject);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    static /* synthetic */ HashMap access$200(FacebookAppLinkResolver facebookAppLinkResolver) {
        Class<FacebookAppLinkResolver> cls = FacebookAppLinkResolver.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return facebookAppLinkResolver.cachedAppLinks;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    private static C8882b.C8883a getAndroidTargetFromJson(JSONObject jSONObject) {
        Uri uri;
        Class<FacebookAppLinkResolver> cls = FacebookAppLinkResolver.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            String tryGetStringFromJson = tryGetStringFromJson(jSONObject, APP_LINK_TARGET_PACKAGE_KEY, (String) null);
            if (tryGetStringFromJson == null) {
                return null;
            }
            String tryGetStringFromJson2 = tryGetStringFromJson(jSONObject, APP_LINK_TARGET_CLASS_KEY, (String) null);
            String tryGetStringFromJson3 = tryGetStringFromJson(jSONObject, APP_LINK_TARGET_APP_NAME_KEY, (String) null);
            String tryGetStringFromJson4 = tryGetStringFromJson(jSONObject, "url", (String) null);
            if (tryGetStringFromJson4 != null) {
                uri = Uri.parse(tryGetStringFromJson4);
            } else {
                uri = null;
            }
            return new C8882b.C8883a(tryGetStringFromJson, tryGetStringFromJson2, uri, tryGetStringFromJson3);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    private static Uri getWebFallbackUriFromJson(Uri uri, JSONObject jSONObject) {
        Class<FacebookAppLinkResolver> cls = FacebookAppLinkResolver.class;
        Uri uri2 = null;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(APP_LINK_WEB_TARGET_KEY);
            if (!tryGetBooleanFromJson(jSONObject2, APP_LINK_TARGET_SHOULD_FALLBACK_KEY, true)) {
                return null;
            }
            String tryGetStringFromJson = tryGetStringFromJson(jSONObject2, "url", (String) null);
            if (tryGetStringFromJson != null) {
                uri2 = Uri.parse(tryGetStringFromJson);
            }
            if (uri2 != null) {
                return uri2;
            }
            return uri;
        } catch (JSONException unused) {
            return uri;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    private static boolean tryGetBooleanFromJson(JSONObject jSONObject, String str, boolean z) {
        Class<FacebookAppLinkResolver> cls = FacebookAppLinkResolver.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return z;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    private static String tryGetStringFromJson(JSONObject jSONObject, String str, String str2) {
        Class<FacebookAppLinkResolver> cls = FacebookAppLinkResolver.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            return str2;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    public C8890f<C8882b> getAppLinkFromUrlInBackground(final Uri uri) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(uri);
            return getAppLinkFromUrlsInBackground(arrayList).mo43018o(new C8889e<Map<Uri, C8882b>, C8882b>() {
                public C8882b then(C8890f<Map<Uri, C8882b>> fVar) {
                    return (C8882b) fVar.mo43014k().get(uri);
                }
            });
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    public C8890f<Map<Uri, C8882b>> getAppLinkFromUrlsInBackground(List<Uri> list) {
        C8882b bVar;
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            final HashMap hashMap = new HashMap();
            final HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder();
            for (Uri next : list) {
                synchronized (this.cachedAppLinks) {
                    bVar = this.cachedAppLinks.get(next);
                }
                if (bVar != null) {
                    hashMap.put(next, bVar);
                } else {
                    if (!hashSet.isEmpty()) {
                        sb.append(',');
                    }
                    sb.append(next.toString());
                    hashSet.add(next);
                }
            }
            if (hashSet.isEmpty()) {
                return C8890f.m17994i(hashMap);
            }
            final C8898g gVar = new C8898g();
            Bundle bundle = new Bundle();
            bundle.putString("ids", sb.toString());
            bundle.putString("fields", String.format("%s.fields(%s,%s)", new Object[]{APP_LINK_KEY, "android", APP_LINK_WEB_TARGET_KEY}));
            new C4555l(C4509a.m5515d(), "", bundle, (C4576p) null, new C4555l.C4557b() {
                public void onCompleted(C4574o oVar) {
                    if (!C9925a.m20734d(this)) {
                        try {
                            C4550k b = oVar.mo31709b();
                            if (b != null) {
                                gVar.mo43034c(b.mo31600e());
                                return;
                            }
                            JSONObject c = oVar.mo31710c();
                            if (c == null) {
                                gVar.mo43035d(hashMap);
                                return;
                            }
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                Uri uri = (Uri) it.next();
                                if (c.has(uri.toString())) {
                                    try {
                                        JSONObject jSONObject = c.getJSONObject(uri.toString()).getJSONObject(FacebookAppLinkResolver.APP_LINK_KEY);
                                        JSONArray jSONArray = jSONObject.getJSONArray("android");
                                        int length = jSONArray.length();
                                        ArrayList arrayList = new ArrayList(length);
                                        for (int i = 0; i < length; i++) {
                                            C8882b.C8883a access$000 = FacebookAppLinkResolver.access$000(jSONArray.getJSONObject(i));
                                            if (access$000 != null) {
                                                arrayList.add(access$000);
                                            }
                                        }
                                        C8882b bVar = new C8882b(uri, arrayList, FacebookAppLinkResolver.access$100(uri, jSONObject));
                                        hashMap.put(uri, bVar);
                                        synchronized (FacebookAppLinkResolver.access$200(FacebookAppLinkResolver.this)) {
                                            FacebookAppLinkResolver.access$200(FacebookAppLinkResolver.this).put(uri, bVar);
                                        }
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            gVar.mo43035d(hashMap);
                        } catch (Throwable th) {
                            C9925a.m20732b(th, this);
                        }
                    }
                }
            }).mo31621j();
            return gVar.mo43032a();
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }
}
