package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentDialog;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0129R;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.KeyEventDispatcher;

public class AppCompatDialog extends ComponentDialog implements AppCompatCallback {
    private AppCompatDelegate mDelegate;
    private final KeyEventDispatcher.Component mKeyDispatcher;

    public AppCompatDialog(@NonNull Context context) {
        this(context, 0);
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0129R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void addContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().addContentView(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        getDelegate().onDestroy();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return KeyEventDispatcher.dispatchKeyEvent(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Nullable
    public <T extends View> T findViewById(@IdRes int i) {
        return getDelegate().findViewById(i);
    }

    @NonNull
    public AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AppCompatDelegate.create((Dialog) this, (AppCompatCallback) this);
        }
        return this.mDelegate;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().getSupportActionBar();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        getDelegate().installViewFactory();
        super.onCreate(bundle);
        getDelegate().onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        getDelegate().onStop();
    }

    @Nullable
    public ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback) {
        return null;
    }

    public void setContentView(@LayoutRes int i) {
        getDelegate().setContentView(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().setTitle(charSequence);
    }

    /* access modifiers changed from: package-private */
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().requestWindowFeature(i);
    }

    public AppCompatDialog(@NonNull Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new C0169f(this);
        AppCompatDelegate delegate = getDelegate();
        delegate.setTheme(getThemeResId(context, i));
        delegate.onCreate((Bundle) null);
    }

    public void setContentView(@NonNull View view) {
        getDelegate().setContentView(view);
    }

    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().setContentView(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().setTitle(getContext().getString(i));
    }

    protected AppCompatDialog(@NonNull Context context, boolean z, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new C0169f(this);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    public void onSupportActionModeFinished(ActionMode actionMode) {
    }

    public void onSupportActionModeStarted(ActionMode actionMode) {
    }
}
