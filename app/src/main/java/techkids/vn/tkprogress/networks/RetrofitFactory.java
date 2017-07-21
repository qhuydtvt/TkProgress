package techkids.vn.tkprogress.networks;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by huynq on 7/22/17.
 */

public class RetrofitFactory {
    private Retrofit retrofit;

    public static final RetrofitFactory instance = new RetrofitFactory();

    private RetrofitFactory() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://tk-progress.herokuapp.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public <E> E create(Class<E> classz) {
        return retrofit.create(classz);
    }
}
