package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.friend.profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.github.sho5nn.tasting.mvp.dagger2.R;
import com.github.sho5nn.tasting.mvp.dagger2.layer.application.ApplicationLayer;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.PresentationComponent;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.BaseView;

import javax.inject.Inject;

public interface FriendProfileView extends BaseView {

  void initialize();

  class FriendProfileActivity extends AppCompatActivity implements FriendProfileView {

    @Inject
    FriendProfilePresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setTitle("FriendProfileView");
      setContentView(R.layout.activity_friend_profile);

      PresentationComponent presentationComponent = ((ApplicationLayer) getApplication())
        .getPresentationLayer().getComponent();

      FriendProfileViewComponent.Builder friendProfileViewComponentBuilder = (FriendProfileViewComponent.Builder)
        presentationComponent.viewComponentBuilderMap().get(FriendProfileViewComponent.class);
      friendProfileViewComponentBuilder.build().inject(this);

      presenter.onCreate(this, savedInstanceState);
    }

    @Override
    public String toString() {
      return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) +
        "\n  - " + presenter;
    }

    @Override
    public void initialize() {
      ((TextView) findViewById(R.id.layer_text)).setText(getApplicationContext().toString());
      ((TextView) findViewById(R.id.component_graph_text)).setText(this.toString());
    }
  }
}
