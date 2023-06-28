// Generated by view binder compiler. Do not edit!
package com.example.bodyboost.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bodyboost.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMain1Binding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final BottomAppBar bottomAppBar;

  @NonNull
  public final BottomNavigationView bottomNavigationView;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final FrameLayout fragmentLayout;

  @NonNull
  public final NavigationView navView;

  @NonNull
  public final Toolbar toolbar;

  private ActivityMain1Binding(@NonNull DrawerLayout rootView, @NonNull BottomAppBar bottomAppBar,
      @NonNull BottomNavigationView bottomNavigationView, @NonNull DrawerLayout drawerLayout,
      @NonNull FrameLayout fragmentLayout, @NonNull NavigationView navView,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.bottomAppBar = bottomAppBar;
    this.bottomNavigationView = bottomNavigationView;
    this.drawerLayout = drawerLayout;
    this.fragmentLayout = fragmentLayout;
    this.navView = navView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomAppBar;
      BottomAppBar bottomAppBar = ViewBindings.findChildViewById(rootView, id);
      if (bottomAppBar == null) {
        break missingId;
      }

      id = R.id.bottomNavigationView;
      BottomNavigationView bottomNavigationView = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigationView == null) {
        break missingId;
      }

      DrawerLayout drawerLayout = (DrawerLayout) rootView;

      id = R.id.fragment_layout;
      FrameLayout fragmentLayout = ViewBindings.findChildViewById(rootView, id);
      if (fragmentLayout == null) {
        break missingId;
      }

      id = R.id.nav_view;
      NavigationView navView = ViewBindings.findChildViewById(rootView, id);
      if (navView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityMain1Binding((DrawerLayout) rootView, bottomAppBar, bottomNavigationView,
          drawerLayout, fragmentLayout, navView, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}