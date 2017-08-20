package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.user;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.github.sho5nn.tasting.mvp.dagger2.R;
import com.github.sho5nn.tasting.mvp.dagger2.layer.application.ApplicationLayer;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.PresentationComponent;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.BaseView;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.friend.list.FriendListView;

import javax.inject.Inject;

public interface UserView extends BaseView {

  void initialize();

  class UserActivity extends AppCompatActivity implements UserView {

    @Inject
    UserPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setTitle("UserView");
      setContentView(R.layout.activity_user);

      PresentationComponent presentationComponent = ((ApplicationLayer) getApplication())
        .getPresentationLayer().getComponent();

      UserViewComponent.Builder userViewComponentBuilder = (UserViewComponent.Builder)
        presentationComponent.viewComponentBuilderMap().get(UserViewComponent.class);
      userViewComponentBuilder.build().inject(this);

      presenter.onCreate(this, savedInstanceState);
    }

    @Override
    public String toString() {
      return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) +
        "\n  - " + presenter;
    }

    @Override
    public void initialize() {
      findViewById(R.id.show_friend_list_button).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          startActivity(new Intent(UserActivity.this, FriendListView.FriendListActivity.class));
        }
      });
      ((TextView) findViewById(R.id.layer_text)).setText(getApplicationContext().toString());
      ((TextView) findViewById(R.id.component_graph_text)).setText(this.toString());
    }
  }
}
