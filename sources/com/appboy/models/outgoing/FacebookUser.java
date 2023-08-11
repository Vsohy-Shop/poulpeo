package com.appboy.models.outgoing;

import androidx.autofill.HintConstants;
import com.appboy.enums.Gender;
import java.util.Collection;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import p057d0.C7213c;
import p404of.C13074a;

public final class FacebookUser implements C7213c<JSONObject> {
    private static final String BIO_KEY = "bio";
    private static final String BIRTHDAY_KEY = "birthday";
    public static final C4175a Companion = new C4175a((DefaultConstructorMarker) null);
    private static final String EMAIL_KEY = "email";
    private static final String FIRST_NAME_KEY = "first_name";
    private static final String FRIENDS_COUNT_KEY = "num_friends";
    private static final String GENDER_KEY = "gender";
    private static final String ID_KEY = "id";
    private static final String LAST_NAME_KEY = "last_name";
    private static final String LIKES_KEY = "likes";
    private static final String LIKE_INNER_KEY = "name";
    private static final String LOCATION_INNER_KEY = "name";
    private static final String LOCATION_OUTER_OBJECT_KEY = "location";
    private final String bio;
    private final String birthday;
    private final String cityName;
    private final String email;
    private final String facebookId;
    private final String firstName;
    private final Gender gender;
    private final String lastName;
    private final Collection<String> likes;
    private final Integer numberOfFriends;

    /* renamed from: com.appboy.models.outgoing.FacebookUser$a */
    public static final class C4175a {
        public /* synthetic */ C4175a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4175a() {
        }
    }

    /* renamed from: com.appboy.models.outgoing.FacebookUser$b */
    static final class C4176b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C4176b f3295b = new C4176b();

        C4176b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating facebook user Json.";
        }
    }

    public FacebookUser(String str, String str2, String str3, String str4, String str5, String str6, Gender gender2, Integer num, Collection<String> collection, String str7) {
        C12775o.m28639i(str, "facebookId");
        this.facebookId = str;
        this.firstName = str2;
        this.lastName = str3;
        this.email = str4;
        this.bio = str5;
        this.cityName = str6;
        this.gender = gender2;
        this.numberOfFriends = num;
        this.likes = collection;
        this.birthday = str7;
    }

    private final JSONArray getLikesArray() {
        JSONArray jSONArray = new JSONArray();
        Collection<String> collection = this.likes;
        if (collection != null) {
            for (String put : collection) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, put);
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ JSONException -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032 A[Catch:{ JSONException -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e A[Catch:{ JSONException -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049 A[Catch:{ JSONException -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0055 A[Catch:{ JSONException -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060 A[Catch:{ JSONException -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c A[Catch:{ JSONException -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0077 A[Catch:{ JSONException -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0083 A[Catch:{ JSONException -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008e A[Catch:{ JSONException -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0098 A[Catch:{ JSONException -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ad A[Catch:{ JSONException -> 0x00d1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject forJsonPut() {
        /*
            r10 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r10.facebookId     // Catch:{ JSONException -> 0x00d1 }
            boolean r1 = p454wf.C13754v.m31532t(r1)     // Catch:{ JSONException -> 0x00d1 }
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0016
            java.lang.String r1 = "id"
            java.lang.String r3 = r10.facebookId     // Catch:{ JSONException -> 0x00d1 }
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x00d1 }
        L_0x0016:
            java.lang.String r1 = r10.firstName     // Catch:{ JSONException -> 0x00d1 }
            r3 = 0
            if (r1 == 0) goto L_0x0024
            boolean r1 = p454wf.C13754v.m31532t(r1)     // Catch:{ JSONException -> 0x00d1 }
            if (r1 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r1 = r3
            goto L_0x0025
        L_0x0024:
            r1 = r2
        L_0x0025:
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = "first_name"
            java.lang.String r4 = r10.firstName     // Catch:{ JSONException -> 0x00d1 }
            r0.put(r1, r4)     // Catch:{ JSONException -> 0x00d1 }
        L_0x002e:
            java.lang.String r1 = r10.lastName     // Catch:{ JSONException -> 0x00d1 }
            if (r1 == 0) goto L_0x003b
            boolean r1 = p454wf.C13754v.m31532t(r1)     // Catch:{ JSONException -> 0x00d1 }
            if (r1 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r1 = r3
            goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            if (r1 != 0) goto L_0x0045
            java.lang.String r1 = "last_name"
            java.lang.String r4 = r10.lastName     // Catch:{ JSONException -> 0x00d1 }
            r0.put(r1, r4)     // Catch:{ JSONException -> 0x00d1 }
        L_0x0045:
            java.lang.String r1 = r10.email     // Catch:{ JSONException -> 0x00d1 }
            if (r1 == 0) goto L_0x0052
            boolean r1 = p454wf.C13754v.m31532t(r1)     // Catch:{ JSONException -> 0x00d1 }
            if (r1 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r1 = r3
            goto L_0x0053
        L_0x0052:
            r1 = r2
        L_0x0053:
            if (r1 != 0) goto L_0x005c
            java.lang.String r1 = "email"
            java.lang.String r4 = r10.email     // Catch:{ JSONException -> 0x00d1 }
            r0.put(r1, r4)     // Catch:{ JSONException -> 0x00d1 }
        L_0x005c:
            java.lang.String r1 = r10.bio     // Catch:{ JSONException -> 0x00d1 }
            if (r1 == 0) goto L_0x0069
            boolean r1 = p454wf.C13754v.m31532t(r1)     // Catch:{ JSONException -> 0x00d1 }
            if (r1 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r1 = r3
            goto L_0x006a
        L_0x0069:
            r1 = r2
        L_0x006a:
            if (r1 != 0) goto L_0x0073
            java.lang.String r1 = "bio"
            java.lang.String r4 = r10.bio     // Catch:{ JSONException -> 0x00d1 }
            r0.put(r1, r4)     // Catch:{ JSONException -> 0x00d1 }
        L_0x0073:
            java.lang.String r1 = r10.birthday     // Catch:{ JSONException -> 0x00d1 }
            if (r1 == 0) goto L_0x0080
            boolean r1 = p454wf.C13754v.m31532t(r1)     // Catch:{ JSONException -> 0x00d1 }
            if (r1 == 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r1 = r3
            goto L_0x0081
        L_0x0080:
            r1 = r2
        L_0x0081:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = "birthday"
            java.lang.String r4 = r10.birthday     // Catch:{ JSONException -> 0x00d1 }
            r0.put(r1, r4)     // Catch:{ JSONException -> 0x00d1 }
        L_0x008a:
            java.lang.String r1 = r10.cityName     // Catch:{ JSONException -> 0x00d1 }
            if (r1 == 0) goto L_0x0096
            boolean r1 = p454wf.C13754v.m31532t(r1)     // Catch:{ JSONException -> 0x00d1 }
            if (r1 == 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r2 = r3
        L_0x0096:
            if (r2 != 0) goto L_0x00a9
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d1 }
            r1.<init>()     // Catch:{ JSONException -> 0x00d1 }
            java.lang.String r2 = "name"
            java.lang.String r3 = r10.cityName     // Catch:{ JSONException -> 0x00d1 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x00d1 }
            java.lang.String r2 = "location"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00d1 }
        L_0x00a9:
            com.appboy.enums.Gender r1 = r10.gender     // Catch:{ JSONException -> 0x00d1 }
            if (r1 == 0) goto L_0x00b6
            java.lang.String r2 = "gender"
            java.lang.String r1 = r1.forJsonPut()     // Catch:{ JSONException -> 0x00d1 }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00d1 }
        L_0x00b6:
            java.lang.String r1 = "num_friends"
            java.lang.Integer r2 = r10.numberOfFriends     // Catch:{ JSONException -> 0x00d1 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00d1 }
            java.util.Collection<java.lang.String> r1 = r10.likes     // Catch:{ JSONException -> 0x00d1 }
            if (r1 == 0) goto L_0x00e0
            boolean r1 = r1.isEmpty()     // Catch:{ JSONException -> 0x00d1 }
            if (r1 != 0) goto L_0x00e0
            java.lang.String r1 = "likes"
            org.json.JSONArray r2 = r10.getLikesArray()     // Catch:{ JSONException -> 0x00d1 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00d1 }
            goto L_0x00e0
        L_0x00d1:
            r1 = move-exception
            r5 = r1
            j0.c r2 = p126j0.C8266c.f11641a
            j0.c$a r4 = p126j0.C8266c.C8267a.f11649e
            com.appboy.models.outgoing.FacebookUser$b r7 = com.appboy.models.outgoing.FacebookUser.C4176b.f3295b
            r6 = 0
            r8 = 4
            r9 = 0
            r3 = r10
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x00e0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.models.outgoing.FacebookUser.forJsonPut():org.json.JSONObject");
    }
}
