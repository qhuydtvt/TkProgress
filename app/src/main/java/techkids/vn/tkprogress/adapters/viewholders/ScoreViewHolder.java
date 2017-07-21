package techkids.vn.tkprogress.adapters.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import techkids.vn.tkprogress.R;
import techkids.vn.tkprogress.networks.models.Score;

/**
 * Created by huynq on 7/22/17.
 */

public class ScoreViewHolder extends RecyclerView.ViewHolder {

    private ImageView ivAvatar;
    private TextView tvScore;
    private TextView tvName;

    public ScoreViewHolder(View itemView) {
        super(itemView);
        ivAvatar = itemView.findViewById(R.id.iv_avatar);
        tvScore = itemView.findViewById(R.id.tv_score);
        tvName = itemView.findViewById(R.id.tv_name);
    }

    public void bind(Score score) {
        Glide.with(this.itemView)
                .load(score.getAvatar())
                .into(ivAvatar);

        tvName.setText(score.getName());

        tvScore.setText(String.format("%s", score.getScore()));
    }
}
