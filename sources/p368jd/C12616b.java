package p368jd;

import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import kotlin.jvm.internal.C12775o;
import p327dc.C11801a;

/* renamed from: jd.b */
/* compiled from: BaseActionBarActivity.kt */
public abstract class C12616b extends C12618d {
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C12775o.m28639i(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return false;
    }

    public void setContentView(int i) {
        super.setContentView(i);
        setSupportActionBar(mo50354z2());
        setTitle(mo46199y2());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public abstract int mo46199y2();

    /* renamed from: z2 */
    public Toolbar mo50354z2() {
        return (Toolbar) findViewById(C11801a.toolBar);
    }
}
