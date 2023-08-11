package androidx.compose.foundation.text;

import androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.p002ui.text.input.TextFieldValue;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: UndoManager.kt */
public final class UndoManager {
    private boolean forceNextSnapshot;
    private Long lastSnapshot;
    private final int maxStoredCharacters;
    private Entry redoStack;
    private int storedCharacters;
    private Entry undoStack;

    public UndoManager() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e A[LOOP:0: B:6:0x000e->B:12:0x001e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0023 A[EDGE_INSN: B:15:0x0023->B:13:0x0023 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void removeLastUndo() {
        /*
            r3 = this;
            androidx.compose.foundation.text.UndoManager$Entry r0 = r3.undoStack
            r1 = 0
            if (r0 == 0) goto L_0x000a
            androidx.compose.foundation.text.UndoManager$Entry r2 = r0.getNext()
            goto L_0x000b
        L_0x000a:
            r2 = r1
        L_0x000b:
            if (r2 != 0) goto L_0x000e
            return
        L_0x000e:
            if (r0 == 0) goto L_0x001b
            androidx.compose.foundation.text.UndoManager$Entry r2 = r0.getNext()
            if (r2 == 0) goto L_0x001b
            androidx.compose.foundation.text.UndoManager$Entry r2 = r2.getNext()
            goto L_0x001c
        L_0x001b:
            r2 = r1
        L_0x001c:
            if (r2 == 0) goto L_0x0023
            androidx.compose.foundation.text.UndoManager$Entry r0 = r0.getNext()
            goto L_0x000e
        L_0x0023:
            if (r0 != 0) goto L_0x0026
            goto L_0x0029
        L_0x0026:
            r0.setNext(r1)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.UndoManager.removeLastUndo():void");
    }

    public static /* synthetic */ void snapshotIfNeeded$default(UndoManager undoManager, TextFieldValue textFieldValue, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = UndoManager_jvmKt.timeNowMillis();
        }
        undoManager.snapshotIfNeeded(textFieldValue, j);
    }

    public final void forceNextSnapshot() {
        this.forceNextSnapshot = true;
    }

    public final int getMaxStoredCharacters() {
        return this.maxStoredCharacters;
    }

    public final void makeSnapshot(TextFieldValue textFieldValue) {
        TextFieldValue textFieldValue2;
        String str;
        TextFieldValue value;
        C12775o.m28639i(textFieldValue, "value");
        this.forceNextSnapshot = false;
        Entry entry = this.undoStack;
        if (entry != null) {
            textFieldValue2 = entry.getValue();
        } else {
            textFieldValue2 = null;
        }
        if (!C12775o.m28634d(textFieldValue, textFieldValue2)) {
            String text = textFieldValue.getText();
            Entry entry2 = this.undoStack;
            if (entry2 == null || (value = entry2.getValue()) == null) {
                str = null;
            } else {
                str = value.getText();
            }
            if (C12775o.m28634d(text, str)) {
                Entry entry3 = this.undoStack;
                if (entry3 != null) {
                    entry3.setValue(textFieldValue);
                    return;
                }
                return;
            }
            this.undoStack = new Entry(this.undoStack, textFieldValue);
            this.redoStack = null;
            int length = this.storedCharacters + textFieldValue.getText().length();
            this.storedCharacters = length;
            if (length > this.maxStoredCharacters) {
                removeLastUndo();
            }
        }
    }

    public final TextFieldValue redo() {
        Entry entry = this.redoStack;
        if (entry == null) {
            return null;
        }
        this.redoStack = entry.getNext();
        this.undoStack = new Entry(this.undoStack, entry.getValue());
        this.storedCharacters += entry.getValue().getText().length();
        return entry.getValue();
    }

    public final void snapshotIfNeeded(TextFieldValue textFieldValue, long j) {
        long j2;
        C12775o.m28639i(textFieldValue, "value");
        if (!this.forceNextSnapshot) {
            Long l = this.lastSnapshot;
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = 0;
            }
            if (j <= j2 + ((long) UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS())) {
                return;
            }
        }
        this.lastSnapshot = Long.valueOf(j);
        makeSnapshot(textFieldValue);
    }

    public final TextFieldValue undo() {
        Entry next;
        Entry entry = this.undoStack;
        if (entry == null || (next = entry.getNext()) == null) {
            return null;
        }
        this.undoStack = next;
        this.storedCharacters -= entry.getValue().getText().length();
        this.redoStack = new Entry(this.redoStack, entry.getValue());
        return next.getValue();
    }

    public UndoManager(int i) {
        this.maxStoredCharacters = i;
    }

    /* compiled from: UndoManager.kt */
    private static final class Entry {
        private Entry next;
        private TextFieldValue value;

        public Entry(Entry entry, TextFieldValue textFieldValue) {
            C12775o.m28639i(textFieldValue, "value");
            this.next = entry;
            this.value = textFieldValue;
        }

        public final Entry getNext() {
            return this.next;
        }

        public final TextFieldValue getValue() {
            return this.value;
        }

        public final void setNext(Entry entry) {
            this.next = entry;
        }

        public final void setValue(TextFieldValue textFieldValue) {
            C12775o.m28639i(textFieldValue, "<set-?>");
            this.value = textFieldValue;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Entry(Entry entry, TextFieldValue textFieldValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : entry, textFieldValue);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UndoManager(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength : i);
    }
}
