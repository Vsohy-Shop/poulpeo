package androidx.activity.result.contract;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11915r;

/* compiled from: ActivityResultContracts.kt */
public final class ActivityResultContracts {

    /* compiled from: ActivityResultContracts.kt */
    public static class CaptureVideo extends ActivityResultContract<Uri, Boolean> {
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, Uri uri) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(uri, "input");
            return null;
        }

        @CallSuper
        public Intent createIntent(Context context, Uri uri) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(uri, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            C12775o.m28638h(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        public final Boolean parseResult(int i, Intent intent) {
            return Boolean.valueOf(i == -1);
        }
    }

    @RequiresApi(19)
    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$CreateDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    /* compiled from: ActivityResultContracts.kt */
    public static class CreateDocument extends ActivityResultContract<String, Uri> {
        private final String mimeType;

        public CreateDocument(String str) {
            C12775o.m28639i(str, "mimeType");
            this.mimeType = str;
        }

        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String str) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "input");
            return null;
        }

        @CallSuper
        public Intent createIntent(Context context, String str) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "input");
            Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.mimeType).putExtra("android.intent.extra.TITLE", str);
            C12775o.m28638h(putExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return putExtra;
        }

        public final Uri parseResult(int i, Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        public CreateDocument() {
            this("*/*");
        }
    }

    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$GetContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    /* compiled from: ActivityResultContracts.kt */
    public static class GetContent extends ActivityResultContract<String, Uri> {
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String str) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "input");
            return null;
        }

        @CallSuper
        public Intent createIntent(Context context, String str) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
            C12775o.m28638h(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        public final Uri parseResult(int i, Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @RequiresApi(18)
    /* compiled from: ActivityResultContracts.kt */
    public static class GetMultipleContents extends ActivityResultContract<String, List<Uri>> {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

        @RequiresApi(18)
        /* compiled from: ActivityResultContracts.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final List<Uri> getClipDataUris$activity_release(Intent intent) {
                C12775o.m28639i(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return C12726w.m28524k();
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        Uri uri = clipData.getItemAt(i).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }
        }

        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, String str) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "input");
            return null;
        }

        @CallSuper
        public Intent createIntent(Context context, String str) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "input");
            Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            C12775o.m28638h(putExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return putExtra;
        }

        public final List<Uri> parseResult(int i, Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (!(i == -1)) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = Companion.getClipDataUris$activity_release(intent)) == null) ? C12726w.m28524k() : clipDataUris$activity_release;
        }
    }

    @RequiresApi(19)
    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    /* compiled from: ActivityResultContracts.kt */
    public static class OpenDocument extends ActivityResultContract<String[], Uri> {
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String[] strArr) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(strArr, "input");
            return null;
        }

        @CallSuper
        public Intent createIntent(Context context, String[] strArr) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
            C12775o.m28638h(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        public final Uri parseResult(int i, Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @RequiresApi(21)
    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    /* compiled from: ActivityResultContracts.kt */
    public static class OpenDocumentTree extends ActivityResultContract<Uri, Uri> {
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, Uri uri) {
            C12775o.m28639i(context, "context");
            return null;
        }

        @CallSuper
        public Intent createIntent(Context context, Uri uri) {
            C12775o.m28639i(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        public final Uri parseResult(int i, Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @RequiresApi(19)
    /* compiled from: ActivityResultContracts.kt */
    public static class OpenMultipleDocuments extends ActivityResultContract<String[], List<Uri>> {
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, String[] strArr) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(strArr, "input");
            return null;
        }

        @CallSuper
        public Intent createIntent(Context context, String[] strArr) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            C12775o.m28638h(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        public final List<Uri> parseResult(int i, Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (!(i == -1)) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = GetMultipleContents.Companion.getClipDataUris$activity_release(intent)) == null) ? C12726w.m28524k() : clipDataUris$activity_release;
        }
    }

    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickContact\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    /* compiled from: ActivityResultContracts.kt */
    public static final class PickContact extends ActivityResultContract<Void, Uri> {
        public Intent createIntent(Context context, Void voidR) {
            C12775o.m28639i(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            C12775o.m28638h(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        public Uri parseResult(int i, Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @RequiresApi(19)
    /* compiled from: ActivityResultContracts.kt */
    public static class PickMultipleVisualMedia extends ActivityResultContract<PickVisualMediaRequest, List<Uri>> {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final int maxItems;

        /* compiled from: ActivityResultContracts.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int getMaxItems$activity_release() {
                if (PickVisualMedia.Companion.isSystemPickerAvailable$activity_release()) {
                    return MediaStore.getPickImagesMaxLimit();
                }
                return Integer.MAX_VALUE;
            }
        }

        public PickMultipleVisualMedia() {
            this(0, 1, (DefaultConstructorMarker) null);
        }

        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(pickVisualMediaRequest, "input");
            return null;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PickMultipleVisualMedia(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Companion.getMaxItems$activity_release() : i);
        }

        @CallSuper
        public Intent createIntent(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(pickVisualMediaRequest, "input");
            PickVisualMedia.Companion companion = PickVisualMedia.Companion;
            boolean z = true;
            if (companion.isSystemPickerAvailable$activity_release()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(companion.getVisualMimeType$activity_release(pickVisualMediaRequest.getMediaType()));
                if (this.maxItems > MediaStore.getPickImagesMaxLimit()) {
                    z = false;
                }
                if (z) {
                    intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.maxItems);
                    return intent;
                }
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
            } else if (companion.isSystemFallbackPickerAvailable$activity_release(context)) {
                ResolveInfo systemFallbackPicker$activity_release = companion.getSystemFallbackPicker$activity_release(context);
                if (systemFallbackPicker$activity_release != null) {
                    ActivityInfo activityInfo = systemFallbackPicker$activity_release.activityInfo;
                    Intent intent2 = new Intent(PickVisualMedia.ACTION_SYSTEM_FALLBACK_PICK_IMAGES);
                    intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent2.setType(companion.getVisualMimeType$activity_release(pickVisualMediaRequest.getMediaType()));
                    intent2.putExtra(PickVisualMedia.GMS_EXTRA_PICK_IMAGES_MAX, this.maxItems);
                    return intent2;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } else if (companion.isGmsPickerAvailable$activity_release(context)) {
                ResolveInfo gmsPicker$activity_release = companion.getGmsPicker$activity_release(context);
                if (gmsPicker$activity_release != null) {
                    ActivityInfo activityInfo2 = gmsPicker$activity_release.activityInfo;
                    Intent intent3 = new Intent(PickVisualMedia.GMS_ACTION_PICK_IMAGES);
                    intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                    intent3.putExtra(PickVisualMedia.GMS_EXTRA_PICK_IMAGES_MAX, this.maxItems);
                    return intent3;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } else {
                Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent4.setType(companion.getVisualMimeType$activity_release(pickVisualMediaRequest.getMediaType()));
                intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                if (intent4.getType() != null) {
                    return intent4;
                }
                intent4.setType("*/*");
                intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent4;
            }
        }

        public final List<Uri> parseResult(int i, Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (!(i == -1)) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = GetMultipleContents.Companion.getClipDataUris$activity_release(intent)) == null) ? C12726w.m28524k() : clipDataUris$activity_release;
        }

        public PickMultipleVisualMedia(int i) {
            this.maxItems = i;
            if (!(i <= 1 ? false : true)) {
                throw new IllegalArgumentException("Max items must be higher than 1".toString());
            }
        }
    }

    @RequiresApi(19)
    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    /* compiled from: ActivityResultContracts.kt */
    public static class PickVisualMedia extends ActivityResultContract<PickVisualMediaRequest, Uri> {
        public static final String ACTION_SYSTEM_FALLBACK_PICK_IMAGES = "androidx.activity.result.contract.action.PICK_IMAGES";
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static final String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";
        public static final String GMS_ACTION_PICK_IMAGES = "com.google.android.gms.provider.action.PICK_IMAGES";
        public static final String GMS_EXTRA_PICK_IMAGES_MAX = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        /* compiled from: ActivityResultContracts.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ResolveInfo getGmsPicker$activity_release(Context context) {
                C12775o.m28639i(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(PickVisualMedia.GMS_ACTION_PICK_IMAGES), 1114112);
            }

            public final ResolveInfo getSystemFallbackPicker$activity_release(Context context) {
                C12775o.m28639i(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(PickVisualMedia.ACTION_SYSTEM_FALLBACK_PICK_IMAGES), 1114112);
            }

            public final String getVisualMimeType$activity_release(VisualMediaType visualMediaType) {
                C12775o.m28639i(visualMediaType, "input");
                if (visualMediaType instanceof ImageOnly) {
                    return "image/*";
                }
                if (visualMediaType instanceof VideoOnly) {
                    return "video/*";
                }
                if (visualMediaType instanceof SingleMimeType) {
                    return ((SingleMimeType) visualMediaType).getMimeType();
                }
                if (visualMediaType instanceof ImageAndVideo) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }

            public final boolean isGmsPickerAvailable$activity_release(Context context) {
                C12775o.m28639i(context, "context");
                if (getGmsPicker$activity_release(context) != null) {
                    return true;
                }
                return false;
            }

            public final boolean isPhotoPickerAvailable() {
                return isSystemPickerAvailable$activity_release();
            }

            public final boolean isSystemFallbackPickerAvailable$activity_release(Context context) {
                C12775o.m28639i(context, "context");
                if (getSystemFallbackPicker$activity_release(context) != null) {
                    return true;
                }
                return false;
            }

            public final boolean isSystemPickerAvailable$activity_release() {
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    return true;
                }
                if (i < 30 || SdkExtensions.getExtensionVersion(30) < 2) {
                    return false;
                }
                return true;
            }

            public final boolean isPhotoPickerAvailable(Context context) {
                C12775o.m28639i(context, "context");
                return isSystemPickerAvailable$activity_release() || isSystemFallbackPickerAvailable$activity_release(context) || isGmsPickerAvailable$activity_release(context);
            }

            public static /* synthetic */ void getACTION_SYSTEM_FALLBACK_PICK_IMAGES$annotations() {
            }

            public static /* synthetic */ void getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX$annotations() {
            }
        }

        /* compiled from: ActivityResultContracts.kt */
        public static final class ImageAndVideo implements VisualMediaType {
            public static final ImageAndVideo INSTANCE = new ImageAndVideo();

            private ImageAndVideo() {
            }
        }

        /* compiled from: ActivityResultContracts.kt */
        public static final class ImageOnly implements VisualMediaType {
            public static final ImageOnly INSTANCE = new ImageOnly();

            private ImageOnly() {
            }
        }

        /* compiled from: ActivityResultContracts.kt */
        public static final class SingleMimeType implements VisualMediaType {
            private final String mimeType;

            public SingleMimeType(String str) {
                C12775o.m28639i(str, "mimeType");
                this.mimeType = str;
            }

            public final String getMimeType() {
                return this.mimeType;
            }
        }

        /* compiled from: ActivityResultContracts.kt */
        public static final class VideoOnly implements VisualMediaType {
            public static final VideoOnly INSTANCE = new VideoOnly();

            private VideoOnly() {
            }
        }

        /* compiled from: ActivityResultContracts.kt */
        public interface VisualMediaType {
        }

        public static final ResolveInfo getGmsPicker$activity_release(Context context) {
            return Companion.getGmsPicker$activity_release(context);
        }

        public static final ResolveInfo getSystemFallbackPicker$activity_release(Context context) {
            return Companion.getSystemFallbackPicker$activity_release(context);
        }

        public static final boolean isGmsPickerAvailable$activity_release(Context context) {
            return Companion.isGmsPickerAvailable$activity_release(context);
        }

        public static final boolean isPhotoPickerAvailable() {
            return Companion.isPhotoPickerAvailable();
        }

        public static final boolean isSystemFallbackPickerAvailable$activity_release(Context context) {
            return Companion.isSystemFallbackPickerAvailable$activity_release(context);
        }

        public static final boolean isSystemPickerAvailable$activity_release() {
            return Companion.isSystemPickerAvailable$activity_release();
        }

        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(pickVisualMediaRequest, "input");
            return null;
        }

        public static final boolean isPhotoPickerAvailable(Context context) {
            return Companion.isPhotoPickerAvailable(context);
        }

        @CallSuper
        public Intent createIntent(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            Intent intent;
            C12775o.m28639i(context, "context");
            C12775o.m28639i(pickVisualMediaRequest, "input");
            Companion companion = Companion;
            if (companion.isSystemPickerAvailable$activity_release()) {
                Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
                intent2.setType(companion.getVisualMimeType$activity_release(pickVisualMediaRequest.getMediaType()));
                return intent2;
            }
            if (companion.isSystemFallbackPickerAvailable$activity_release(context)) {
                ResolveInfo systemFallbackPicker$activity_release = companion.getSystemFallbackPicker$activity_release(context);
                if (systemFallbackPicker$activity_release != null) {
                    ActivityInfo activityInfo = systemFallbackPicker$activity_release.activityInfo;
                    intent = new Intent(ACTION_SYSTEM_FALLBACK_PICK_IMAGES);
                    intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent.setType(companion.getVisualMimeType$activity_release(pickVisualMediaRequest.getMediaType()));
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else if (companion.isGmsPickerAvailable$activity_release(context)) {
                ResolveInfo gmsPicker$activity_release = companion.getGmsPicker$activity_release(context);
                if (gmsPicker$activity_release != null) {
                    ActivityInfo activityInfo2 = gmsPicker$activity_release.activityInfo;
                    intent = new Intent(GMS_ACTION_PICK_IMAGES);
                    intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                    intent.setType(companion.getVisualMimeType$activity_release(pickVisualMediaRequest.getMediaType()));
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(companion.getVisualMimeType$activity_release(pickVisualMediaRequest.getMediaType()));
                if (intent3.getType() != null) {
                    return intent3;
                }
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent3;
            }
            return intent;
        }

        public final Uri parseResult(int i, Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            if (data == null) {
                data = (Uri) C12686e0.m28223b0(GetMultipleContents.Companion.getClipDataUris$activity_release(intent));
            }
            return data;
        }
    }

    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,959:1\n12541#2,2:960\n8676#2,2:962\n9358#2,4:964\n11365#2:968\n11700#2,3:969\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n*L\n188#1:960,2\n195#1:962,2\n195#1:964,4\n208#1:968\n208#1:969,3\n*E\n"})
    /* compiled from: ActivityResultContracts.kt */
    public static final class RequestMultiplePermissions extends ActivityResultContract<String[], Map<String, Boolean>> {
        public static final String ACTION_REQUEST_PERMISSIONS = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static final String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";
        public static final String EXTRA_PERMISSION_GRANT_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        /* compiled from: ActivityResultContracts.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Intent createIntent$activity_release(String[] strArr) {
                C12775o.m28639i(strArr, "input");
                Intent putExtra = new Intent(RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS).putExtra(RequestMultiplePermissions.EXTRA_PERMISSIONS, strArr);
                C12775o.m28638h(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            }
        }

        public Intent createIntent(Context context, String[] strArr) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(strArr, "input");
            return Companion.createIntent$activity_release(strArr);
        }

        public ActivityResultContract.SynchronousResult<Map<String, Boolean>> getSynchronousResult(Context context, String[] strArr) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(strArr, "input");
            boolean z = true;
            if (strArr.length == 0) {
                return new ActivityResultContract.SynchronousResult<>(C12716r0.m28416g());
            }
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (!(ContextCompat.checkSelfPermission(context, strArr[i]) == 0)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (!z) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(C13537l.m30877d(C12714q0.m28413d(strArr.length), 16));
            for (String a : strArr) {
                C11906l a2 = C11915r.m25707a(a, Boolean.TRUE);
                linkedHashMap.put(a2.mo49111c(), a2.mo49112d());
            }
            return new ActivityResultContract.SynchronousResult<>(linkedHashMap);
        }

        public Map<String, Boolean> parseResult(int i, Intent intent) {
            if (i != -1) {
                return C12716r0.m28416g();
            }
            if (intent == null) {
                return C12716r0.m28416g();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra(EXTRA_PERMISSIONS);
            int[] intArrayExtra = intent.getIntArrayExtra(EXTRA_PERMISSION_GRANT_RESULTS);
            if (intArrayExtra == null || stringArrayExtra == null) {
                return C12716r0.m28416g();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            int length = intArrayExtra.length;
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(Boolean.valueOf(intArrayExtra[i2] == 0));
            }
            return C12716r0.m28425p(C12686e0.m28212I0(C12710p.m28378F(stringArrayExtra), arrayList));
        }
    }

    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,959:1\n12774#2,2:960\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n*L\n228#1:960,2\n*E\n"})
    /* compiled from: ActivityResultContracts.kt */
    public static final class RequestPermission extends ActivityResultContract<String, Boolean> {
        public Intent createIntent(Context context, String str) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "input");
            return RequestMultiplePermissions.Companion.createIntent$activity_release(new String[]{str});
        }

        public ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, String str) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "input");
            if (ContextCompat.checkSelfPermission(context, str) == 0) {
                return new ActivityResultContract.SynchronousResult<>(Boolean.TRUE);
            }
            return null;
        }

        public Boolean parseResult(int i, Intent intent) {
            boolean z;
            if (intent == null || i != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra(RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS);
            boolean z2 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    if (intArrayExtra[i2] == 0) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                if (z) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    public static final class StartActivityForResult extends ActivityResultContract<Intent, ActivityResult> {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static final String EXTRA_ACTIVITY_OPTIONS_BUNDLE = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        /* compiled from: ActivityResultContracts.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Intent createIntent(Context context, Intent intent) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(intent, "input");
            return intent;
        }

        public ActivityResult parseResult(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    public static final class StartIntentSenderForResult extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        public static final String ACTION_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static final String EXTRA_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        public static final String EXTRA_SEND_INTENT_EXCEPTION = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        /* compiled from: ActivityResultContracts.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Intent createIntent(Context context, IntentSenderRequest intentSenderRequest) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(intentSenderRequest, "input");
            Intent putExtra = new Intent(ACTION_INTENT_SENDER_REQUEST).putExtra(EXTRA_INTENT_SENDER_REQUEST, intentSenderRequest);
            C12775o.m28638h(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return putExtra;
        }

        public ActivityResult parseResult(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    public static class TakePicture extends ActivityResultContract<Uri, Boolean> {
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, Uri uri) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(uri, "input");
            return null;
        }

        @CallSuper
        public Intent createIntent(Context context, Uri uri) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(uri, "input");
            Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
            C12775o.m28638h(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        public final Boolean parseResult(int i, Intent intent) {
            return Boolean.valueOf(i == -1);
        }
    }

    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    /* compiled from: ActivityResultContracts.kt */
    public static class TakePicturePreview extends ActivityResultContract<Void, Bitmap> {
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(Context context, Void voidR) {
            C12775o.m28639i(context, "context");
            return null;
        }

        @CallSuper
        public Intent createIntent(Context context, Void voidR) {
            C12775o.m28639i(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        public final Bitmap parseResult(int i, Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakeVideo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    /* compiled from: ActivityResultContracts.kt */
    public static class TakeVideo extends ActivityResultContract<Uri, Bitmap> {
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(Context context, Uri uri) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(uri, "input");
            return null;
        }

        @CallSuper
        public Intent createIntent(Context context, Uri uri) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(uri, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            C12775o.m28638h(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        public final Bitmap parseResult(int i, Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    private ActivityResultContracts() {
    }
}
