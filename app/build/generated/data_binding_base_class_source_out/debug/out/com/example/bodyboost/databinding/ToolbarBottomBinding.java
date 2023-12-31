// Generated by view binder compiler. Do not edit!
package com.example.bodyboost.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bodyboost.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ToolbarBottomBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton imageButton6;

  @NonNull
  public final ImageButton imageButton7;

  @NonNull
  public final ImageButton imageButton8;

  @NonNull
  public final ImageButton imageButton9;

  private ToolbarBottomBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton imageButton6, @NonNull ImageButton imageButton7,
      @NonNull ImageButton imageButton8, @NonNull ImageButton imageButton9) {
    this.rootView = rootView;
    this.imageButton6 = imageButton6;
    this.imageButton7 = imageButton7;
    this.imageButton8 = imageButton8;
    this.imageButton9 = imageButton9;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ToolbarBottomBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ToolbarBottomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.toolbar_bottom, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ToolbarBottomBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageButton6;
      ImageButton imageButton6 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton6 == null) {
        break missingId;
      }

      id = R.id.imageButton7;
      ImageButton imageButton7 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton7 == null) {
        break missingId;
      }

      id = R.id.imageButton8;
      ImageButton imageButton8 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton8 == null) {
        break missingId;
      }

      id = R.id.imageButton9;
      ImageButton imageButton9 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton9 == null) {
        break missingId;
      }

      return new ToolbarBottomBinding((ConstraintLayout) rootView, imageButton6, imageButton7,
          imageButton8, imageButton9);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
