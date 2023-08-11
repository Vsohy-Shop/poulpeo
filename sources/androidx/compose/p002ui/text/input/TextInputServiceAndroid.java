package androidx.compose.p002ui.text.input;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.runtime.collection.MutableVector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11904j;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nTextInputServiceAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,507:1\n1182#2:508\n1161#2,2:509\n728#3,2:511\n460#3,11:514\n1#4:513\n*S KotlinDebug\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n*L\n101#1:508\n101#1:509,2\n205#1:511,2\n282#1:514,11\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid */
/* compiled from: TextInputServiceAndroid.android.kt */
public final class TextInputServiceAndroid implements PlatformTextInputService {
    private final Lazy baseInputConnection$delegate;
    private Rect focusedRect;
    private Runnable frameCallback;
    /* access modifiers changed from: private */
    public List<WeakReference<RecordingInputConnection>> ics;
    private ImeOptions imeOptions;
    private final Executor inputCommandProcessorExecutor;
    private final InputMethodManager inputMethodManager;
    /* access modifiers changed from: private */
    public Function1<? super List<? extends EditCommand>, C11921v> onEditCommand;
    /* access modifiers changed from: private */
    public Function1<? super ImeAction, C11921v> onImeActionPerformed;
    private final PlatformTextInput platformTextInput;
    private TextFieldValue state;
    private final MutableVector<TextInputCommand> textInputCommandQueue;
    private final View view;

    /* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand */
    /* compiled from: TextInputServiceAndroid.android.kt */
    private enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$WhenMappings */
    /* compiled from: TextInputServiceAndroid.android.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand[] r0 = androidx.compose.p002ui.text.input.TextInputServiceAndroid.TextInputCommand.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r1 = androidx.compose.p002ui.text.input.TextInputServiceAndroid.TextInputCommand.StartInput     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r1 = androidx.compose.p002ui.text.input.TextInputServiceAndroid.TextInputCommand.StopInput     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r1 = androidx.compose.p002ui.text.input.TextInputServiceAndroid.TextInputCommand.ShowKeyboard     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r1 = androidx.compose.p002ui.text.input.TextInputServiceAndroid.TextInputCommand.HideKeyboard     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.input.TextInputServiceAndroid.WhenMappings.<clinit>():void");
        }
    }

    public TextInputServiceAndroid(View view2, InputMethodManager inputMethodManager2, PlatformTextInput platformTextInput2, Executor executor) {
        C12775o.m28639i(view2, "view");
        C12775o.m28639i(inputMethodManager2, "inputMethodManager");
        C12775o.m28639i(executor, "inputCommandProcessorExecutor");
        this.view = view2;
        this.inputMethodManager = inputMethodManager2;
        this.platformTextInput = platformTextInput2;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = TextInputServiceAndroid$onEditCommand$1.INSTANCE;
        this.onImeActionPerformed = TextInputServiceAndroid$onImeActionPerformed$1.INSTANCE;
        this.state = new TextFieldValue("", TextRange.Companion.m37980getZerod9O1mEE(), (TextRange) null, 4, (DefaultConstructorMarker) null);
        this.imeOptions = ImeOptions.Companion.getDefault();
        this.ics = new ArrayList();
        this.baseInputConnection$delegate = C11901h.m25689a(C11904j.NONE, new TextInputServiceAndroid$baseInputConnection$2(this));
        this.textInputCommandQueue = new MutableVector<>(new TextInputCommand[16], 0);
    }

    /* access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection$delegate.getValue();
    }

    private final void processInputCommands() {
        if (!this.view.isFocused()) {
            this.textInputCommandQueue.clear();
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        MutableVector<TextInputCommand> mutableVector = this.textInputCommandQueue;
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                processInputCommands$applyToState((TextInputCommand) content[i], ref$ObjectRef, ref$ObjectRef2);
                i++;
            } while (i < size);
        }
        if (C12775o.m28634d(ref$ObjectRef.f20403b, Boolean.TRUE)) {
            restartInputImmediately();
        }
        Boolean bool = (Boolean) ref$ObjectRef2.f20403b;
        if (bool != null) {
            setKeyboardVisibleImmediately(bool.booleanValue());
        }
        if (C12775o.m28634d(ref$ObjectRef.f20403b, Boolean.FALSE)) {
            restartInputImmediately();
        }
    }

    private static final void processInputCommands$applyToState(TextInputCommand textInputCommand, Ref$ObjectRef<Boolean> ref$ObjectRef, Ref$ObjectRef<Boolean> ref$ObjectRef2) {
        int i = WhenMappings.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        boolean z = true;
        if (i == 1) {
            T t = Boolean.TRUE;
            ref$ObjectRef.f20403b = t;
            ref$ObjectRef2.f20403b = t;
        } else if (i == 2) {
            T t2 = Boolean.FALSE;
            ref$ObjectRef.f20403b = t2;
            ref$ObjectRef2.f20403b = t2;
        } else if ((i == 3 || i == 4) && !C12775o.m28634d(ref$ObjectRef.f20403b, Boolean.FALSE)) {
            if (textInputCommand != TextInputCommand.ShowKeyboard) {
                z = false;
            }
            ref$ObjectRef2.f20403b = Boolean.valueOf(z);
        }
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }

    private final void sendInputCommand(TextInputCommand textInputCommand) {
        this.textInputCommandQueue.add(textInputCommand);
        if (this.frameCallback == null) {
            C1228b bVar = new C1228b(this);
            this.inputCommandProcessorExecutor.execute(bVar);
            this.frameCallback = bVar;
        }
    }

    /* access modifiers changed from: private */
    public static final void sendInputCommand$lambda$1(TextInputServiceAndroid textInputServiceAndroid) {
        C12775o.m28639i(textInputServiceAndroid, "this$0");
        textInputServiceAndroid.frameCallback = null;
        textInputServiceAndroid.processInputCommands();
    }

    private final void setKeyboardVisibleImmediately(boolean z) {
        if (z) {
            this.inputMethodManager.showSoftInput();
        } else {
            this.inputMethodManager.hideSoftInput();
        }
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        C12775o.m28639i(editorInfo, "outAttrs");
        TextInputServiceAndroid_androidKt.update(editorInfo, this.imeOptions, this.state);
        TextInputServiceAndroid_androidKt.updateWithEmojiCompat(editorInfo);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new TextInputServiceAndroid$createInputConnection$1(this), this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference(recordingInputConnection));
        return recordingInputConnection;
    }

    public final TextFieldValue getState$ui_release() {
        return this.state;
    }

    public final View getView() {
        return this.view;
    }

    public void hideSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.HideKeyboard);
    }

    public void notifyFocusedRect(androidx.compose.p002ui.geometry.Rect rect) {
        Rect rect2;
        C12775o.m28639i(rect, "rect");
        this.focusedRect = new Rect(C13265c.m30134c(rect.getLeft()), C13265c.m30134c(rect.getTop()), C13265c.m30134c(rect.getRight()), C13265c.m30134c(rect.getBottom()));
        if (this.ics.isEmpty() && (rect2 = this.focusedRect) != null) {
            this.view.requestRectangleOnScreen(new Rect(rect2));
        }
    }

    public void showSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.ShowKeyboard);
    }

    public void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions2, Function1<? super List<? extends EditCommand>, C11921v> function1, Function1<? super ImeAction, C11921v> function12) {
        C12775o.m28639i(textFieldValue, "value");
        C12775o.m28639i(imeOptions2, "imeOptions");
        C12775o.m28639i(function1, "onEditCommand");
        C12775o.m28639i(function12, "onImeActionPerformed");
        PlatformTextInput platformTextInput2 = this.platformTextInput;
        if (platformTextInput2 != null) {
            platformTextInput2.requestInputFocus();
        }
        this.state = textFieldValue;
        this.imeOptions = imeOptions2;
        this.onEditCommand = function1;
        this.onImeActionPerformed = function12;
        sendInputCommand(TextInputCommand.StartInput);
    }

    public void stopInput() {
        PlatformTextInput platformTextInput2 = this.platformTextInput;
        if (platformTextInput2 != null) {
            platformTextInput2.releaseInputFocus();
        }
        this.onEditCommand = TextInputServiceAndroid$stopInput$1.INSTANCE;
        this.onImeActionPerformed = TextInputServiceAndroid$stopInput$2.INSTANCE;
        this.focusedRect = null;
        sendInputCommand(TextInputCommand.StopInput);
    }

    public void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z;
        int i;
        C12775o.m28639i(textFieldValue2, "newValue");
        boolean z2 = true;
        if (!TextRange.m37968equalsimpl0(this.state.m38194getSelectiond9O1mEE(), textFieldValue2.m38194getSelectiond9O1mEE()) || !C12775o.m28634d(this.state.m38193getCompositionMzsxiRA(), textFieldValue2.m38193getCompositionMzsxiRA())) {
            z = true;
        } else {
            z = false;
        }
        this.state = textFieldValue2;
        int size = this.ics.size();
        for (int i2 = 0; i2 < size; i2++) {
            RecordingInputConnection recordingInputConnection = (RecordingInputConnection) this.ics.get(i2).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setMTextFieldValue$ui_release(textFieldValue2);
            }
        }
        if (!C12775o.m28634d(textFieldValue, textFieldValue2)) {
            if (textFieldValue == null || (C12775o.m28634d(textFieldValue.getText(), textFieldValue2.getText()) && (!TextRange.m37968equalsimpl0(textFieldValue.m38194getSelectiond9O1mEE(), textFieldValue2.m38194getSelectiond9O1mEE()) || C12775o.m28634d(textFieldValue.m38193getCompositionMzsxiRA(), textFieldValue2.m38193getCompositionMzsxiRA())))) {
                z2 = false;
            }
            if (z2) {
                restartInputImmediately();
                return;
            }
            int size2 = this.ics.size();
            for (int i3 = 0; i3 < size2; i3++) {
                RecordingInputConnection recordingInputConnection2 = (RecordingInputConnection) this.ics.get(i3).get();
                if (recordingInputConnection2 != null) {
                    recordingInputConnection2.updateInputState(this.state, this.inputMethodManager);
                }
            }
        } else if (z) {
            InputMethodManager inputMethodManager2 = this.inputMethodManager;
            int r0 = TextRange.m37973getMinimpl(textFieldValue2.m38194getSelectiond9O1mEE());
            int r9 = TextRange.m37972getMaximpl(textFieldValue2.m38194getSelectiond9O1mEE());
            TextRange r1 = this.state.m38193getCompositionMzsxiRA();
            int i4 = -1;
            if (r1 != null) {
                i = TextRange.m37973getMinimpl(r1.m37979unboximpl());
            } else {
                i = -1;
            }
            TextRange r3 = this.state.m38193getCompositionMzsxiRA();
            if (r3 != null) {
                i4 = TextRange.m37972getMaximpl(r3.m37979unboximpl());
            }
            inputMethodManager2.updateSelection(r0, r9, i, i4);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextInputServiceAndroid(android.view.View r1, androidx.compose.p002ui.text.input.InputMethodManager r2, androidx.compose.p002ui.text.input.PlatformTextInput r3, java.util.concurrent.Executor r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0005
            r3 = 0
        L_0x0005:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0016
            android.view.Choreographer r4 = android.view.Choreographer.getInstance()
            java.lang.String r5 = "getInstance()"
            kotlin.jvm.internal.C12775o.m28638h(r4, r5)
            java.util.concurrent.Executor r4 = androidx.compose.p002ui.text.input.TextInputServiceAndroid_androidKt.asExecutor(r4)
        L_0x0016:
            r0.<init>((android.view.View) r1, (androidx.compose.p002ui.text.input.InputMethodManager) r2, (androidx.compose.p002ui.text.input.PlatformTextInput) r3, (java.util.concurrent.Executor) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.input.TextInputServiceAndroid.<init>(android.view.View, androidx.compose.ui.text.input.InputMethodManager, androidx.compose.ui.text.input.PlatformTextInput, java.util.concurrent.Executor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextInputServiceAndroid(View view2, PlatformTextInput platformTextInput2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view2, (i & 2) != 0 ? null : platformTextInput2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid(View view2, PlatformTextInput platformTextInput2) {
        this(view2, new InputMethodManagerImpl(view2), platformTextInput2, (Executor) null, 8, (DefaultConstructorMarker) null);
        C12775o.m28639i(view2, "view");
    }
}
