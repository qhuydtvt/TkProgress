package techkids.vn.tkprogress.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import techkids.vn.tkprogress.R;
import techkids.vn.tkprogress.adapters.viewholders.ScoreViewHolder;
import techkids.vn.tkprogress.networks.models.Score;

/**
 * Created by huynq on 7/22/17.
 */

public class ScoreAdapter extends RecyclerView.Adapter<ScoreViewHolder> {

    private List<Score> scoreList;

    public void setScoreList(List<Score> scoreList) {
        this.scoreList = scoreList;
    }

    @Override
    public ScoreViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_score, parent, false);
        return new ScoreViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ScoreViewHolder holder, int position) {
        Score score = scoreList.get(position);
        holder.bind(score);
    }

    @Override
    public int getItemCount() {
        if (scoreList == null) {
            return 0;
        }
        return scoreList.size();
    }
}
