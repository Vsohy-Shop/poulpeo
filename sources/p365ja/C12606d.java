package p365ja;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p368jd.C12616b;

@StabilityInferred(parameters = 0)
/* renamed from: ja.d */
/* compiled from: BaseSearchBarActivity.kt */
public abstract class C12606d extends C12616b implements SearchView.OnQueryTextListener {

    /* renamed from: m */
    private final boolean f20236m = true;

    /* renamed from: n */
    public Map<Integer, View> f20237n = new LinkedHashMap();

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m27963F2(C12606d dVar, View view) {
        C12775o.m28639i(dVar, "this$0");
        dVar.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public static final void m27964G2(SearchView searchView, C12606d dVar) {
        C12775o.m28639i(searchView, "$searchView");
        C12775o.m28639i(dVar, "this$0");
        searchView.requestFocus();
        Object systemService = dVar.getSystemService("input_method");
        C12775o.m28637g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(searchView, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m27965H2(SearchView searchView, View view) {
        C12775o.m28639i(searchView, "$searchView");
        searchView.setQuery("", true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D2 */
    public boolean mo46361D2() {
        return this.f20236m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E2 */
    public final void mo50330E2(int i) {
        ActionBar supportActionBar = getSupportActionBar();
        C12775o.m28637g(supportActionBar, "null cannot be cast to non-null type androidx.appcompat.app.ActionBar");
        supportActionBar.setDisplayHomeAsUpEnabled(false);
        View inflate = LayoutInflater.from(this).inflate(R.layout.view_search_toolbar, (ViewGroup) null);
        supportActionBar.setCustomView(inflate, new ActionBar.LayoutParams(-1, -1));
        supportActionBar.setDisplayOptions(16);
        View findViewById = inflate.findViewById(R.id.imageButtonBack);
        C12775o.m28638h(findViewById, "customView.findViewById(R.id.imageButtonBack)");
        View findViewById2 = inflate.findViewById(R.id.searchView);
        C12775o.m28638h(findViewById2, "customView.findViewById(R.id.searchView)");
        SearchView searchView = (SearchView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.imageButtonClose);
        C12775o.m28638h(findViewById3, "customView.findViewById(R.id.imageButtonClose)");
        ImageButton imageButton = (ImageButton) findViewById3;
        ((ImageButton) findViewById).setOnClickListener(new C12603a(this));
        searchView.setOnQueryTextListener(this);
        searchView.setQueryHint(getString(i));
        View findViewById4 = searchView.findViewById(R.id.search_src_text);
        C12775o.m28638h(findViewById4, "searchView.findViewById(R.id.search_src_text)");
        ((AutoCompleteTextView) findViewById4).setTextSize(2, 14.0f);
        if (mo46361D2()) {
            searchView.postDelayed(new C12604b(searchView, this), 50);
        }
        imageButton.setOnClickListener(new C12605c(searchView));
        ViewParent parent = supportActionBar.getCustomView().getParent();
        C12775o.m28637g(parent, "null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        Toolbar toolbar = (Toolbar) parent;
        toolbar.setContentInsetsAbsolute(0, 0);
        toolbar.getContentInsetEnd();
        toolbar.setPadding(0, 0, 0, 0);
    }
}
