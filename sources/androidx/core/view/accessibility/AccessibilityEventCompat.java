package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class AccessibilityEventCompat {
    public static final int CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION = 4;
    public static final int CONTENT_CHANGE_TYPE_DRAG_CANCELLED = 512;
    public static final int CONTENT_CHANGE_TYPE_DRAG_DROPPED = 256;
    public static final int CONTENT_CHANGE_TYPE_DRAG_STARTED = 128;
    public static final int CONTENT_CHANGE_TYPE_PANE_APPEARED = 16;
    public static final int CONTENT_CHANGE_TYPE_PANE_DISAPPEARED = 32;
    public static final int CONTENT_CHANGE_TYPE_PANE_TITLE = 8;
    public static final int CONTENT_CHANGE_TYPE_STATE_DESCRIPTION = 64;
    public static final int CONTENT_CHANGE_TYPE_SUBTREE = 1;
    public static final int CONTENT_CHANGE_TYPE_TEXT = 2;
    public static final int CONTENT_CHANGE_TYPE_UNDEFINED = 0;
    public static final int TYPES_ALL_MASK = -1;
    public static final int TYPE_ANNOUNCEMENT = 16384;
    public static final int TYPE_ASSIST_READING_CONTEXT = 16777216;
    public static final int TYPE_GESTURE_DETECTION_END = 524288;
    public static final int TYPE_GESTURE_DETECTION_START = 262144;
    @Deprecated
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_END = 1024;
    @Deprecated
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_START = 512;
    public static final int TYPE_TOUCH_INTERACTION_END = 2097152;
    public static final int TYPE_TOUCH_INTERACTION_START = 1048576;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUSED = 32768;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED = 65536;
    public static final int TYPE_VIEW_CONTEXT_CLICKED = 8388608;
    @Deprecated
    public static final int TYPE_VIEW_HOVER_ENTER = 128;
    @Deprecated
    public static final int TYPE_VIEW_HOVER_EXIT = 256;
    @Deprecated
    public static final int TYPE_VIEW_SCROLLED = 4096;
    @Deprecated
    public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED = 8192;
    public static final int TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY = 131072;
    public static final int TYPE_WINDOWS_CHANGED = 4194304;
    @Deprecated
    public static final int TYPE_WINDOW_CONTENT_CHANGED = 2048;

    @RequiresApi(16)
    static class Api16Impl {
        private Api16Impl() {
        }

        @DoNotInline
        static int getAction(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getAction();
        }

        @DoNotInline
        static int getMovementGranularity(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getMovementGranularity();
        }

        @DoNotInline
        static void setAction(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setAction(i);
        }

        @DoNotInline
        static void setMovementGranularity(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setMovementGranularity(i);
        }
    }

    @RequiresApi(19)
    static class Api19Impl {
        private Api19Impl() {
        }

        @DoNotInline
        static int getContentChangeTypes(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @DoNotInline
        static void setContentChangeTypes(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ContentChangeType {
    }

    private AccessibilityEventCompat() {
    }

    @Deprecated
    public static void appendRecord(AccessibilityEvent accessibilityEvent, AccessibilityRecordCompat accessibilityRecordCompat) {
        accessibilityEvent.appendRecord((AccessibilityRecord) accessibilityRecordCompat.getImpl());
    }

    @Deprecated
    public static AccessibilityRecordCompat asRecord(AccessibilityEvent accessibilityEvent) {
        return new AccessibilityRecordCompat(accessibilityEvent);
    }

    public static int getAction(@NonNull AccessibilityEvent accessibilityEvent) {
        return Api16Impl.getAction(accessibilityEvent);
    }

    public static int getContentChangeTypes(@NonNull AccessibilityEvent accessibilityEvent) {
        return Api19Impl.getContentChangeTypes(accessibilityEvent);
    }

    public static int getMovementGranularity(@NonNull AccessibilityEvent accessibilityEvent) {
        return Api16Impl.getMovementGranularity(accessibilityEvent);
    }

    @Deprecated
    public static AccessibilityRecordCompat getRecord(AccessibilityEvent accessibilityEvent, int i) {
        return new AccessibilityRecordCompat(accessibilityEvent.getRecord(i));
    }

    @Deprecated
    public static int getRecordCount(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static void setAction(@NonNull AccessibilityEvent accessibilityEvent, int i) {
        Api16Impl.setAction(accessibilityEvent, i);
    }

    public static void setContentChangeTypes(@NonNull AccessibilityEvent accessibilityEvent, int i) {
        Api19Impl.setContentChangeTypes(accessibilityEvent, i);
    }

    public static void setMovementGranularity(@NonNull AccessibilityEvent accessibilityEvent, int i) {
        Api16Impl.setMovementGranularity(accessibilityEvent, i);
    }
}
