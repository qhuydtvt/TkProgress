package techkids.vn.tkprogress.networks.services;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import techkids.vn.tkprogress.networks.models.Score;

/**
 * Created by huynq on 7/22/17.
 */

public interface ScoreService {
    @GET("scores")
    Call<List<Score>> listScores(@Query("className") String className);
}
