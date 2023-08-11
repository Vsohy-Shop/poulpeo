package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;

public interface MenuProvider {
    void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater);

    boolean onMenuItemSelected(@NonNull MenuItem menuItem);

    void onMenuClosed(@NonNull Menu menu) {
    }

    void onPrepareMenu(@NonNull Menu menu) {
    }
}
