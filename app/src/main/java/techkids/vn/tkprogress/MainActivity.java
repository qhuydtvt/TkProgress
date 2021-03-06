package techkids.vn.tkprogress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import techkids.vn.tkprogress.adapters.ScoreAdapter;
import techkids.vn.tkprogress.networks.RetrofitFactory;
import techkids.vn.tkprogress.networks.models.Score;
import techkids.vn.tkprogress.networks.services.ScoreService;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private RecyclerView rvScores;

    private ScoreAdapter scoreAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initUI();
        query();
    }

    private void initUI() {
        rvScores = (RecyclerView) findViewById(R.id.rv_score);
        scoreAdapter = new ScoreAdapter();
        rvScores.setAdapter(scoreAdapter);
        rvScores.setLayoutManager(new LinearLayoutManager(this));
    }

    private void query() {
        RetrofitFactory.instance
                .create(ScoreService.class)
                .listScores("android9")
                .enqueue(new Callback<List<Score>>() {
                    @Override
                    public void onResponse(Call<List<Score>> call, Response<List<Score>> response) {
                        List<Score> scoreList = response.body();
                        Log.d(TAG, String.format("onResponse: %s", scoreList));
                        scoreAdapter.setScoreList(scoreList);
                        scoreAdapter.notifyDataSetChanged();
                    }

                    @Override
                    public void onFailure(Call<List<Score>> call, Throwable t) {
                        Log.d(TAG, "onFailure: ");
                    }
                });
    }
}
