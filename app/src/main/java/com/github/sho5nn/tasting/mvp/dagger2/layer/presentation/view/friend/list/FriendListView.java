package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.friend.list;

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
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.friend.profile.FriendProfileView;

import javax.inject.Inject;

public interface FriendListView extends BaseView {

  void initialize();

  class FriendListActivity extends AppCompatActivity implements FriendListView {

    @Inject
    FriendListPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setTitle("FriendListView");
      setContentView(R.layout.activity_friend_list);

      PresentationComponent presentationComponent = ((ApplicationLayer) getApplication())
        .getPresentationLayer().getComponent();

      FriendListViewComponent.Builder friendListViewComponentBuilder = (FriendListViewComponent.Builder)
        presentationComponent.viewComponentBuilderMap().get(FriendListViewComponent.class);
      friendListViewComponentBuilder.build().inject(this);

      presenter.onCreate(this, savedInstanceState);
    }

    @Override
    public String toString() {
      return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) +
        "\n  - " + presenter;
    }

    @Override
    public void initialize() {
      findViewById(R.id.show_friend_profile_button).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          startActivity(new Intent(FriendListActivity.this, FriendProfileView.FriendProfileActivity.class));
        }
      });
      ((TextView) findViewById(R.id.layer_text)).setText(getApplicationContext().toString());
      ((TextView) findViewById(R.id.component_graph_text)).setText(this.toString());
    }
  }
}
