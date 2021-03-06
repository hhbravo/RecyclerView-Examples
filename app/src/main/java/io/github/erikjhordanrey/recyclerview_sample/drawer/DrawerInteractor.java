package io.github.erikjhordanrey.recyclerview_sample.drawer;

import android.view.MenuItem;

import androidx.drawerlayout.widget.DrawerLayout;

public interface DrawerInteractor {
    void navigateTo(MenuItem item, DrawerLayout drawerLayout, DrawerListener listener);
}
